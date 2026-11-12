package com.ta.utdid2.device;

import android.content.Context;
import com.ta.utdid2.a.a.g;

/* JADX INFO: loaded from: classes6.dex */
public class UTDevice {
    private static String d(Context context) {
        a aVarB = b.b(context);
        return (aVarB == null || g.m204a(aVarB.f())) ? "ffffffffffffffffffffffff" : aVarB.f();
    }

    private static String e(Context context) {
        String strH = c.a(context).h();
        return (strH == null || g.m204a(strH)) ? "ffffffffffffffffffffffff" : strH;
    }

    @Deprecated
    public static String getUtdid(Context context) {
        return d(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        return e(context);
    }
}
