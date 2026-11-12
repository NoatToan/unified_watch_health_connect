package ht2;

import org.slf4j.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht2/a;", "", "<init>", "()V", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f85620a = new a();

    private a() {
    }

    public static Logger a() {
        int i14 = gt2.c.f79010a;
        return gt2.b.f79005a.h("IAU#Helper");
    }

    public final void b(String str) {
        synchronized (this) {
            f85620a.getClass();
            a().debug(str);
        }
    }

    public final void c(String str, Throwable th3) {
        synchronized (this) {
            try {
                if (th3 != null) {
                    f85620a.getClass();
                    a().error(str, th3);
                } else {
                    f85620a.getClass();
                    a().error(str);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void d(String str) {
        synchronized (this) {
            f85620a.getClass();
            a().warn(str);
        }
    }
}
