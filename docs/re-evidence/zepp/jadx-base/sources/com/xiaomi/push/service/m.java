package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.aa;
import com.xiaomi.push.dq;
import com.xiaomi.push.dv;
import com.xiaomi.push.ee;
import com.xiaomi.push.ej;

/* JADX INFO: loaded from: classes22.dex */
public class m {
    public static dv a(dq dqVar) {
        byte[] bArrM3707a = dqVar.m3707a();
        dv dvVar = new dv();
        try {
            ee.a(dvVar, bArrM3707a);
            return dvVar;
        } catch (ej unused) {
            return null;
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }

    public static byte[] a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.channel.commonutils.android.b.b(aa.m3487a(str), bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("encryption error. ", e);
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
            byte[] bArrB = b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrB != null) {
                ag.a(context, v.a(bArrB), bArrB);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m3434a("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a("notify fcm notification error ", th);
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.channel.commonutils.android.b.a(aa.m3487a(str), bArr);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.a("dencryption error. ", e);
            return null;
        }
    }
}
