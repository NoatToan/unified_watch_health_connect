package com.huawei.openalliance.ad;

import android.content.Context;

/* JADX INFO: loaded from: classes12.dex */
public class hb {
    public static st a(Context context, ha haVar) {
        hw.b("LinkedEventStrategyFactory", "createBaseEventStrategy");
        int iK = haVar != null ? haVar.k() : -1;
        if (iK != 1) {
            if (iK == 3) {
                return new sz(context, iK);
            }
            if (iK != 18) {
                return new sv(context);
            }
        }
        return new tc(context, iK);
    }
}
