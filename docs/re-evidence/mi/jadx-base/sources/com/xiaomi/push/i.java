package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import android.text.TextUtils;
import defpackage.f5s;
import defpackage.p8s;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class i {
    public static int a(Context context, String str, String str2) {
        p8s p8sVarE;
        NotificationChannel notificationChannelB;
        if (context == null || TextUtils.isEmpty(str) || (p8sVarE = p8s.e(context, str)) == null || (notificationChannelB = p8sVarE.b(p8sVarE.i(str2))) == null) {
            return 0;
        }
        return notificationChannelB.getImportance() != 0 ? 32 : 64;
    }

    public static short b(Context context, ix ixVar) {
        io ioVarM747a = ixVar.m747a();
        return c(context, ixVar.f252b, (ioVarM747a == null || ioVarM747a.m714a() == null) ? null : ioVarM747a.m714a().get("channel_id"));
    }

    public static short c(Context context, String str, String str2) {
        return (short) (g.f(context, str, false).a() + (f5s.b(context) ? 4 : 0) + (f5s.a(context) ? 8 : 0) + (p8s.t(context) ? 16 : 0) + a(context, str, str2));
    }

    public static <T extends jm<T, ?>> void d(T t, byte[] bArr) {
        if (bArr == null) {
            throw new jr("the message byte is empty.");
        }
        new j(new kd.a(true, true, bArr.length)).a(t, bArr);
    }

    public static <T extends jm<T, ?>> byte[] e(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new k(new jt.a()).a(t);
        } catch (jr e) {
            x9s.q("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
