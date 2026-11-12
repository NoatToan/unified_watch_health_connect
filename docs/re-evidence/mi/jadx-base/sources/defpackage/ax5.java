package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ax5 implements h2n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ax5 f3533a;

    public static h2n b() {
        if (f3533a == null) {
            synchronized (ax5.class) {
                try {
                    if (f3533a == null) {
                        f3533a = new ax5();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f3533a;
    }

    @Override // defpackage.h2n
    public List<mjh<xb8, String>> a(List<mjh<xb8, String>> list) {
        return list;
    }
}
