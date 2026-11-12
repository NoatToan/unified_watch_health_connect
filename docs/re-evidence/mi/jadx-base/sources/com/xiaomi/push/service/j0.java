package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.ix;
import com.xiaomi.push.jc;
import com.xiaomi.push.jr;
import defpackage.ecs;
import defpackage.hxs;
import defpackage.x9s;

/* JADX INFO: loaded from: classes11.dex */
public class j0 {
    public static jc a(ix ixVar) {
        byte[] bArrM753a = ixVar.m753a();
        jc jcVar = new jc();
        try {
            com.xiaomi.push.i.d(jcVar, bArrM753a);
            return jcVar;
        } catch (jr unused) {
            return null;
        }
    }

    public static void b(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] bArrD = d(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrD != null) {
                l.q(context, a.d(bArrD), bArrD);
            } else {
                x9s.o("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th) {
            x9s.q("notify fcm notification error ", th);
        }
    }

    public static void c(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }

    public static byte[] d(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            x9s.o("secret is empty, return null");
            return null;
        }
        try {
            return hxs.b(ecs.b(str), bArr);
        } catch (Exception e) {
            x9s.q("dencryption error. ", e);
            return null;
        }
    }
}
