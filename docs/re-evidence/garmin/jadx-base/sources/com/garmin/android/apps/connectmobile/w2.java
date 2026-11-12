package com.garmin.android.apps.connectmobile;

/* JADX INFO: loaded from: classes7.dex */
public final class w2 {
    public static final boolean a(v2.a aVar) {
        Integer num = aVar.f47384b;
        return num != null && num.intValue() == 403;
    }

    public static final void b(v2.a aVar, a2 a2Var, String str, String str2) {
        aVar.getClass();
        Exception exc = aVar.f47383a;
        a2Var.getClass();
        Integer num = aVar.f47384b;
        if (str != null) {
            i2.f36769a.getClass();
            i2.a.f(a2Var, str, str2 + " responseCode=[" + num + "] exception=[" + exc + "]");
            return;
        }
        i2.f36769a.getClass();
        i2.a.e(a2Var, str2 + " responseCode=[" + num + "] exception=[" + exc + "]");
    }
}
