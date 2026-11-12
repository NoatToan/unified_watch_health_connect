package com.garmin.android.gncs.telephony;

import com.garmin.android.gncs.GNCSNotificationInfo;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class PhoneCallListener$onIncomingCallStarted$1$1 extends w implements l<GNCSNotificationInfo, CharSequence> {
    public static final PhoneCallListener$onIncomingCallStarted$1$1 INSTANCE = new PhoneCallListener$onIncomingCallStarted$1$1();

    public PhoneCallListener$onIncomingCallStarted$1$1() {
        super(1);
    }

    @Override // e23.l
    public final CharSequence invoke(GNCSNotificationInfo gNCSNotificationInfo) {
        gNCSNotificationInfo.getClass();
        String str = gNCSNotificationInfo.packageName;
        str.getClass();
        return str;
    }
}
