package com.alipay.sdk.m.l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import defpackage.mu;
import defpackage.mx;
import defpackage.on;
import defpackage.ox;
import java.util.Collections;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f2113a;

    public interface a {
        void a(boolean z, JSONObject jSONObject, String str);
    }

    public static boolean e(on onVar, Context context) {
        return ox.d(onVar, context, Collections.singletonList(new mx.d("com.taobao.taobao", 0, "")), false);
    }

    public static boolean a(on onVar, Activity activity, int i, String str, String str2, a aVar) {
        try {
            mu.b(onVar, "biz", "TbStart");
            activity.startActivityForResult(new Intent(str2, Uri.parse(str)), i);
            f2113a = aVar;
            return true;
        } catch (Throwable th) {
            aVar.a(false, null, "UNKNOWN_ERROR");
            mu.c(onVar, "biz", "TbActFail", th);
            return false;
        }
    }

    public static boolean c(on onVar, int i, int i2, Intent intent) {
        if (i != 1010 || intent == null) {
            return false;
        }
        a aVar = f2113a;
        if (aVar == null) {
            return true;
        }
        f2113a = null;
        if (i2 == -1) {
            mu.d(onVar, "biz", "TbOk", intent.toUri(1));
            aVar.a(true, ox.b(intent), "OK");
        } else if (i2 != 0) {
            mu.e(onVar, "biz", "TbUnknown", "" + i2);
        } else {
            mu.d(onVar, "biz", "TbCancel", intent.toUri(1));
            aVar.a(false, null, "CANCELED");
        }
        return true;
    }
}
