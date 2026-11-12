package defpackage;

import com.huawei.health.suggestion.data.DietDataApi;

/* JADX INFO: loaded from: classes9.dex */
public class hdn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f36466b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile DietDataApi f36467c;

    public static DietDataApi c() {
        if (f36467c == null) {
            synchronized (f36466b) {
                if (f36467c == null) {
                    f36467c = new hdp();
                }
            }
        }
        return f36467c;
    }
}
