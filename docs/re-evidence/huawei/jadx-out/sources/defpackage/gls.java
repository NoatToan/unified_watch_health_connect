package defpackage;

import com.huawei.health.plan.model.data.DataApi;

/* JADX INFO: loaded from: classes8.dex */
public class gls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DataApi f35641a;

    private gls() {
    }

    public static DataApi b() {
        if (f35641a == null) {
            synchronized (gls.class) {
                if (f35641a == null) {
                    f35641a = new glb();
                }
            }
        }
        return f35641a;
    }
}
