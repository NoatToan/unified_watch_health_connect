package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.mipush.sdk.aq;
import com.xiaomi.mipush.sdk.b;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.onetrack.OneTrack;
import defpackage.a5t;
import defpackage.bas;
import defpackage.d6s;
import defpackage.gm8;
import defpackage.l4s;
import defpackage.o3s;
import defpackage.obs;
import defpackage.x9s;
import defpackage.xdb;
import defpackage.xys;
import defpackage.y83;
import defpackage.zxl;

/* JADX INFO: loaded from: classes11.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f14254a = false;
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f14255b = true;

    public NetworkStatusReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f14255b) {
            return;
        }
        obs.r();
        a5t.e().post(new o3s(this, context));
    }

    public static boolean a() {
        return f14254a;
    }

    public NetworkStatusReceiver(Object obj) {
        f14254a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        if (!d6s.c(context).J() && bas.c(context).s() && !bas.c(context).y()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                zxl.h(context).i(intent);
            } catch (Exception e) {
                x9s.s(e);
            }
        }
        xys.h(context);
        if (obs.v(context) && d6s.c(context).P()) {
            d6s.c(context).R();
        }
        if (obs.v(context)) {
            if ("syncing".equals(l4s.b(context).c(aq.DISABLE_PUSH))) {
                b.r(context);
            }
            if ("syncing".equals(l4s.b(context).c(aq.ENABLE_PUSH))) {
                b.s(context);
            }
            l4s l4sVarB = l4s.b(context);
            aq aqVar = aq.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(l4sVarB.c(aqVar))) {
                d6s.c(context).E(null, aqVar, d.ASSEMBLE_PUSH_HUAWEI, OneTrack.Param.NET);
            }
            if ("syncing".equals(l4s.b(context).c(aq.UPLOAD_FCM_TOKEN))) {
                d6s.c(context).E(null, aqVar, d.ASSEMBLE_PUSH_HUAWEI, OneTrack.Param.NET);
            }
            l4s l4sVarB2 = l4s.b(context);
            aq aqVar2 = aq.UPLOAD_COS_TOKEN;
            if ("syncing".equals(l4sVarB2.c(aqVar2))) {
                d6s.c(context).E(null, aqVar2, d.ASSEMBLE_PUSH_COS, OneTrack.Param.NET);
            }
            l4s l4sVarB3 = l4s.b(context);
            aq aqVar3 = aq.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(l4sVarB3.c(aqVar3))) {
                d6s.c(context).E(null, aqVar3, d.ASSEMBLE_PUSH_FTOS, OneTrack.Param.NET);
            }
            if (xdb.a() && xdb.d(context)) {
                xdb.c(context);
                xdb.b(context);
            }
            y83.a(context);
            gm8.b(context);
        }
    }
}
