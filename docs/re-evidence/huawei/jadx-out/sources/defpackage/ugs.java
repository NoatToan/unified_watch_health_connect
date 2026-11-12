package defpackage;

import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.CloudApi;

/* JADX INFO: loaded from: classes19.dex */
public class ugs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static CloudApi f50063a;

    private ugs() {
    }

    public static CloudApi e() {
        CloudApi cloudApi;
        synchronized (ugs.class) {
            if (f50063a == null) {
                f50063a = new ugl();
            }
            cloudApi = f50063a;
        }
        return cloudApi;
    }
}
