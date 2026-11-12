package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes22.dex */
public class ee {
    public static short a(Context context, dq dqVar) {
        return a(context, dqVar.b);
    }

    public static short a(Context context, String str) {
        return (short) (com.xiaomi.channel.commonutils.android.a.a(context, str, false).a() + 0 + (n.b(context) ? 4 : 0) + (n.a(context) ? 8 : 0) + (com.xiaomi.push.service.aq.a(context) ? 16 : 0));
    }

    public static <T extends ef<T, ?>> void a(T t, byte[] bArr) {
        if (bArr == null) {
            throw new ej("the message byte is empty.");
        }
        new ei(new ev.a(true, true, bArr.length)).a(t, bArr);
    }

    public static <T extends ef<T, ?>> byte[] a(T t) {
        if (t == null) {
            return null;
        }
        try {
            return new ek(new el.a()).a(t);
        } catch (ej e) {
            com.xiaomi.channel.commonutils.logger.b.a("convertThriftObjectToBytes catch TException.", e);
            return null;
        }
    }
}
