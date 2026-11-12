package defpackage;

import com.huawei.health.plan.model.cloud.CloudApi;

/* JADX INFO: loaded from: classes29.dex */
public class ghw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f35144b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile CloudApi f35145c;

    public static CloudApi b() {
        if (f35145c == null) {
            synchronized (f35144b) {
                if (f35145c == null) {
                    f35145c = new ghv();
                }
            }
        }
        return f35145c;
    }
}
