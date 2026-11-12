package defpackage;

import com.huawei.health.suggestion.cloud.DietCloudApi;

/* JADX INFO: loaded from: classes9.dex */
public class hdi {
    private static final Object d = new Object();
    private static volatile DietCloudApi e;

    public static DietCloudApi e() {
        if (e == null) {
            synchronized (d) {
                if (e == null) {
                    e = new hdm();
                }
            }
        }
        return e;
    }
}
