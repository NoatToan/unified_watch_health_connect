package com.huami.assistant.util;

import com.huami.watch.companion.util.AnalyticsEvents;

/* JADX INFO: loaded from: classes5.dex */
public class AssistantAnalyticsEvents {
    public static String getFixEventIdById(int typeId) {
        if (typeId == 2) {
            return AnalyticsEvents.EVENT_CLICK_SMART_FIXED_SCHEDULE;
        }
        switch (typeId) {
            case 301:
                return AnalyticsEvents.EVENT_CLICK_SMART_FIXED_MOVIE;
            case 302:
                return AnalyticsEvents.EVENT_CLICK_SMART_FIXED_CAR;
            case 303:
                return AnalyticsEvents.EVENT_CLICK_SMART_FIXED_TRAIN;
            case 304:
                return AnalyticsEvents.EVENT_CLICK_SMART_FIXED_FLIGHT;
            default:
                return null;
        }
    }

    public static String getSwitchEventIdById(int typeId) {
        if (typeId == 2) {
            return AnalyticsEvents.EVENT_STATUS_SMART_SCHEDULE_SWITCH;
        }
        switch (typeId) {
            case 301:
                return AnalyticsEvents.EVENT_STATUS_SMART_MOVIE_SWITCH;
            case 302:
                return AnalyticsEvents.EVENT_STATUS_SMART_CAR_SWITCH;
            case 303:
                return AnalyticsEvents.EVENT_STATUS_SMART_TRAIN_SWITCH;
            case 304:
                return AnalyticsEvents.EVENT_STATUS_SMART_FLIGHT_SWITCH;
            default:
                return null;
        }
    }
}
