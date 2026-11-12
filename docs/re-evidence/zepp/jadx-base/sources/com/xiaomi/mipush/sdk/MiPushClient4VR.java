package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.di;
import com.xiaomi.push.dt;
import com.xiaomi.push.service.aw;

/* JADX INFO: loaded from: classes22.dex */
public class MiPushClient4VR {
    public static void uploadData(Context context, String str) {
        dt dtVar = new dt();
        dtVar.c(df.VRUpload.f77a);
        dtVar.b(a.m3457a(context).m3458a());
        dtVar.d(context.getPackageName());
        dtVar.a("data", str);
        dtVar.a(aw.a());
        ag.a(context).a(dtVar, cz.Notification, (di) null);
    }
}
