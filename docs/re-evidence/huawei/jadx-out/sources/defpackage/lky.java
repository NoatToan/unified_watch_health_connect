package defpackage;

import com.huawei.hihealth.motion.HealthOpenSDK;

/* JADX INFO: loaded from: classes10.dex */
public class lky {
    private static HealthOpenSDK e;

    public static HealthOpenSDK b() {
        if (e == null) {
            e = new HealthOpenSDK();
        }
        return e;
    }
}
