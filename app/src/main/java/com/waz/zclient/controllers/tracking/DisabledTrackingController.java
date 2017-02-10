/**
 * Wire
 * Copyright (C) 2016 Wire Swiss GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.waz.zclient.controllers.tracking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.waz.zclient.BuildConfig;
import com.waz.zclient.core.controllers.tracking.attributes.RangedAttribute;
import com.waz.zclient.core.controllers.tracking.events.AVSMetricEvent;
import com.waz.zclient.core.controllers.tracking.events.Event;
import com.waz.zclient.controllers.tracking.screens.ApplicationScreen;
import com.waz.zclient.controllers.tracking.screens.RegistrationScreen;
import timber.log.Timber;

public class DisabledTrackingController implements ITrackingController {
    private static final String QA_LOG_TAG = "TrackingController";

    @Override
    public void appLaunched(Intent intent) {

    }

    @Override
    public void appResumed() {

    }

    @Override
    public void appPaused() {

    }

    @Override
    public void tearDown() {

    }

    @Override
    public void tagEvent(Event event) {
        if (BuildConfig.DISABLE_TRACKING_WITH_LOGGING) {
            // Log tracking for candidate builds
            Timber.tag(QA_LOG_TAG).e("Tag event=[name='%s',\nattributes='%s',\nrangedAttributes='%s']",
                                     event.getName(),
                                     event.getAttributes().toString(),
                                     event.getRangedAttributes().toString());
        }
    }

    @Override
    public void tagAVSMetricEvent(AVSMetricEvent event) {

    }

    @Override
    public void loadFromSavedInstance(Bundle savedInstanceState) {

    }

    @Override
    public void saveToSavedInstance(Bundle outState) {

    }

    @Override
    public void updateSessionAggregates(RangedAttribute attribute, String... params) {

    }

    @Override
    public void markAsFirstSession() {

    }

    @Override
    public void searchedForPeople() {

    }

    @Override
    public void onRegistrationScreen(RegistrationScreen screen) {

    }

    @Override
    public void onApplicationScreen(ApplicationScreen screen) {

    }

    @Override
    public ApplicationScreen getApplicationScreen() {
        return ApplicationScreen.DISABLED_TRACKING;
    }

    @Override
    public void setActivity(Activity activity) {

    }
}
