package defpackage;

import com.xiaomi.mipush.sdk.aq;
import com.xiaomi.mipush.sdk.d;
import com.xiaomi.push.ig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class z2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<d, a> f40823a = new HashMap<>();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40825b;

        public a(String str, String str2) {
            this.f40824a = str;
            this.f40825b = str2;
        }
    }

    static {
        d(d.ASSEMBLE_PUSH_HUAWEI, new a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        d(d.ASSEMBLE_PUSH_FCM, new a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        d(d.ASSEMBLE_PUSH_COS, new a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        d(d.ASSEMBLE_PUSH_FTOS, new a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    public static aq a(d dVar) {
        int i = z4t.f40880a[dVar.ordinal()];
        if (i == 1) {
            return aq.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return aq.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return aq.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return aq.UPLOAD_FTOS_TOKEN;
    }

    public static ig b(d dVar) {
        return ig.AggregatePushSwitch;
    }

    public static a c(d dVar) {
        return f40823a.get(dVar);
    }

    public static void d(d dVar, a aVar) {
        if (aVar != null) {
            f40823a.put(dVar, aVar);
        }
    }
}
