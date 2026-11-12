package com.huami.watch.companion.util;

/* JADX INFO: loaded from: classes16.dex */
public class AppAnalyticsEvents {
    public static String getEventIdByTypeId(int i) {
        if (i == 2) {
            return AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_SCHEDULE;
        }
        switch (i) {
            case 301:
                return AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_MOVIE;
            case 302:
                return AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_CAR;
            case 303:
                return AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_TRAIN;
            case 304:
                return AnalyticsEvents.EVENT_CLICK_SMART_ITEMADD_FLIGHT;
            default:
                return null;
        }
    }
}
