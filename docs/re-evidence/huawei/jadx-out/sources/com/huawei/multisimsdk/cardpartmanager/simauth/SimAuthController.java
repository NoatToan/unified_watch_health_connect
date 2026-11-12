package com.huawei.multisimsdk.cardpartmanager.simauth;

import android.content.Context;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* JADX INFO: loaded from: classes12.dex */
public class SimAuthController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SubscriptionManager f18034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TelephonyManager f18035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f18036c;

    public String e(String str) {
        return str;
    }

    public SimAuthController(Context context) {
        this.f18036c = context;
        this.f18035b = (TelephonyManager) context.getSystemService("phone");
        this.f18034a = SubscriptionManager.from(this.f18036c);
    }

    public String c() {
        String strSubstring;
        String strSubstring2;
        String subscriberId = this.f18035b.getSubscriberId();
        if (subscriberId != null) {
            strSubstring = subscriberId.substring(0, 3);
            strSubstring2 = subscriberId.substring(3, 5);
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        return "0" + subscriberId + "@nai.epc.mnc0" + strSubstring2 + ".mcc" + strSubstring + ".3gppnetwork.org";
    }
}
