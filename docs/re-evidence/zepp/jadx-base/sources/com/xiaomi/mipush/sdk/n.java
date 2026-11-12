package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.cz;
import com.xiaomi.push.df;
import com.xiaomi.push.dq;
import com.xiaomi.push.dt;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class n {
    private static volatile n b;
    private final Context a;

    private n(Context context) {
        this.a = context.getApplicationContext();
    }

    private static n a(Context context) {
        if (b == null) {
            synchronized (n.class) {
                if (b == null) {
                    b = new n(context);
                }
            }
        }
        return b;
    }

    public static void a(Context context, dq dqVar) {
        a(context).b(dqVar, 0, true);
    }

    public static void a(Context context, dq dqVar, boolean z) {
        a(context).b(dqVar, 1, z);
    }

    public static void b(Context context, dq dqVar, boolean z) {
        a(context).b(dqVar, 2, z);
    }

    private void b(dq dqVar, int i, boolean z) {
        if (com.xiaomi.channel.commonutils.android.f.m3427a(this.a) || !com.xiaomi.channel.commonutils.android.f.m3426a() || dqVar == null || dqVar.a != cz.SendMessage || dqVar.m3701a() == null || !z) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("click to start activity result:" + String.valueOf(i));
        dt dtVar = new dt(dqVar.m3701a().m3670a(), false);
        dtVar.c(df.SDK_START_ACTIVITY.f77a);
        dtVar.b(dqVar.m3702a());
        dtVar.d(dqVar.b);
        HashMap map = new HashMap();
        dtVar.f129a = map;
        map.put("result", String.valueOf(i));
        ag.a(this.a).a(dtVar, cz.Notification, false, false, null, true, dqVar.b, dqVar.f122a, true, false);
    }

    public static void c(Context context, dq dqVar, boolean z) {
        a(context).b(dqVar, 3, z);
    }

    public static void d(Context context, dq dqVar, boolean z) {
        a(context).b(dqVar, 4, z);
    }

    public static void e(Context context, dq dqVar, boolean z) {
        n nVarA;
        int i;
        a aVarM3457a = a.m3457a(context);
        if (TextUtils.isEmpty(aVarM3457a.c()) || TextUtils.isEmpty(aVarM3457a.d())) {
            nVarA = a(context);
            i = 6;
        } else {
            boolean zM3468f = aVarM3457a.m3468f();
            nVarA = a(context);
            i = zM3468f ? 7 : 5;
        }
        nVarA.b(dqVar, i, z);
    }
}
