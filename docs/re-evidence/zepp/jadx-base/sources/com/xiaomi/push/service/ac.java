package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.dq;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class ac {
    private static a a;
    private static b b;

    public interface a {
        Map<String, String> a(Context context, dq dqVar);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        void m3815a(Context context, dq dqVar);

        boolean a(Context context, dq dqVar, boolean z);
    }

    public interface b {
        void a(dq dqVar);

        void a(String str);

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        boolean m3816a(dq dqVar);
    }

    public static Map<String, String> a(Context context, dq dqVar) {
        a aVar = a;
        if (aVar != null && dqVar != null) {
            return aVar.a(context, dqVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("pepa listener or container is null");
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m3813a(Context context, dq dqVar) {
        a aVar = a;
        if (aVar == null || dqVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("handle msg wrong");
        } else {
            aVar.m3815a(context, dqVar);
        }
    }

    public static void a(dq dqVar) {
        b bVar = b;
        if (bVar == null || dqVar == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("pepa clearMessage is null");
        } else {
            bVar.a(dqVar);
        }
    }

    public static void a(String str) {
        b bVar = b;
        if (bVar == null || str == null) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("pepa clearMessage is null");
        } else {
            bVar.a(str);
        }
    }

    public static boolean a(Context context, dq dqVar, boolean z) {
        a aVar = a;
        if (aVar != null && dqVar != null) {
            return aVar.a(context, dqVar, z);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("pepa judement listener or container is null");
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m3814a(dq dqVar) {
        b bVar = b;
        if (bVar != null && dqVar != null) {
            return bVar.m3816a(dqVar);
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a("pepa handleReceiveMessage is null");
        return false;
    }
}
