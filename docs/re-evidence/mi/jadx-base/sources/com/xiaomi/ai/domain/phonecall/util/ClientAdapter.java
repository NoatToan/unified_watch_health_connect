package com.xiaomi.ai.domain.phonecall.util;

import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.DeviceApp;
import com.xiaomi.ai.domain.phonecall.common.DeviceConfig;
import com.xiaomi.ai.domain.phonecall.common.Function;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ClientAdapter {
    private static final List<String> relativeActionTypeList = Arrays.asList(ActionType.EMPTY_STORE.toString(), ActionType.BROWSE_STORE.toString(), ActionType.NOT_STORE.toString(), ActionType.STOP_STORE.toString(), ActionType.QUERY_STORE.toString(), ActionType.PLAY_STORE.toString());
    private static final List<String> viewHistoryActionTypeList = Arrays.asList(ActionType.VIEW_ALL_CALLS.toString(), ActionType.VIEW_MISSED_CALLS.toString(), ActionType.VIEW_OUTGOING_CALLS.toString());
    private static final List<String> playRecentActionTypeList = Arrays.asList(ActionType.PLAY_RECENT_MISSED_CALLS.toString(), ActionType.PLAY_RECENT_ANSWERED_CALLS.toString(), ActionType.PLAY_RECENT_INCOMING_CALLS.toString(), ActionType.PLAY_RECENT_OUTGOING_CALLS.toString());

    public static void adaptParser(DeviceApp deviceApp, PhoneCallIntention phoneCallIntention) {
        if (phoneCallIntention == null) {
            return;
        }
        if (deviceApp == null) {
            deviceApp = DeviceApp.Default();
        }
        if (phoneCallIntention.getAction().equals(ActionType.PICK_UP.toString()) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.ANSWER_CALL)) {
            phoneCallIntention.setScore(0.0d);
        }
        if (phoneCallIntention.getAction().equals(ActionType.HANG_UP.toString()) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.HANG_UP_THE_CALL)) {
            phoneCallIntention.setScore(0.0d);
        }
        if (viewHistoryActionTypeList.contains(phoneCallIntention.getAction()) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.VIEW_ALL_CALLS) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.GET_MISSED_CALLS) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.GET_OUTGOING_CALLS)) {
            phoneCallIntention.setScore(0.0d);
        }
        if (playRecentActionTypeList.contains(phoneCallIntention.getAction()) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.PLAY_RECENT_ANSWERED_CALLS) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.PLAY_RECENT_INCOMING_CALLS) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.PLAY_RECENT_MISSED_CALLS) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.PLAY_RECENT_OUTGOING_CALLS)) {
            phoneCallIntention.setScore(0.0d);
        }
        if (relativeActionTypeList.contains(phoneCallIntention.getAction()) && !DeviceConfig.supportFunction(deviceApp.getAppId(), Function.ADD_CONTACT)) {
            phoneCallIntention.setScore(0.0d);
        }
        if (!phoneCallIntention.getAction().equals(ActionType.SHOW_CONTACT_NUMBER.toString()) || DeviceConfig.supportFunction(deviceApp.getAppId(), Function.SEARCH_CONTACT_NUMBER)) {
            return;
        }
        phoneCallIntention.setAction(ActionType.QUERY);
    }
}
