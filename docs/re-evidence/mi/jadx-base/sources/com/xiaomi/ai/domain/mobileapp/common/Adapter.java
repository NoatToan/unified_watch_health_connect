package com.xiaomi.ai.domain.mobileapp.common;

/* JADX INFO: loaded from: classes7.dex */
public class Adapter {
    public static void ActionDeviceAdapt(MobileAppIntention mobileAppIntention, Device device) {
        if (MobileAppIntention.PATTERN.SEARCH_PATTERN.equals(mobileAppIntention.getPattern()) && ActionType.OPEN.getAction().equals(mobileAppIntention.getAction()) && Device.isTV(device) && mobileAppIntention.getScore() > 0.1d) {
            mobileAppIntention.setAction(ActionType.SEARCH);
            mobileAppIntention.setScore(mobileAppIntention.getScore() > 0.95d ? mobileAppIntention.getScore() : 0.95d);
        }
    }
}
