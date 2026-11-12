package com.xiaomi.push.service;

import com.xiaomi.push.dt;

/* JADX INFO: loaded from: classes22.dex */
public class i {
    private static b a;
    private static a b;

    public interface a {
        boolean a(dt dtVar);
    }

    public interface b {
    }

    public static void a(b bVar) {
        a = bVar;
    }

    public static boolean a(dt dtVar) {
        String str;
        if (b == null || dtVar == null) {
            str = "rc params is null, not cpra";
        } else {
            if (com.xiaomi.channel.commonutils.android.f.m3427a(com.xiaomi.channel.commonutils.android.k.m3431a())) {
                return b.a(dtVar);
            }
            str = "rc app not permission to cpra";
        }
        com.xiaomi.channel.commonutils.logger.b.m3434a(str);
        return false;
    }
}
