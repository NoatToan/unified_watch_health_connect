package com.xiaomi.mipush.sdk;

import com.xiaomi.push.db;
import java.util.HashMap;

/* JADX INFO: loaded from: classes22.dex */
public class j {
    private static HashMap<c, a> a = new HashMap<>();

    public static class a {
        public String a;
        public String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    static {
        b(c.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        b(c.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        b(c.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        b(c.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static am a(c cVar) {
        int i = b0.a[cVar.ordinal()];
        if (i == 1) {
            return am.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return am.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return am.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return am.UPLOAD_FTOS_TOKEN;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static a m3481a(c cVar) {
        return a.get(cVar);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static db m3482a(c cVar) {
        return null;
    }

    private static void b(c cVar, a aVar) {
        if (aVar != null) {
            a.put(cVar, aVar);
        }
    }
}
