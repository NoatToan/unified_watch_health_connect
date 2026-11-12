package ih2;

import ch.qos.logback.classic.Logger;
import o13.m;
import o13.t;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lih2/b;", "", "<init>", "()V", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f93516a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t f93517b = m.b(a.f93518a);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lch/qos/logback/classic/Logger;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f93518a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            int i14 = gt2.c.f79010a;
            return gt2.b.f79005a.i("GNCS#");
        }
    }

    private b() {
    }

    public static final void a(Exception exc, String str) {
        f93516a.getClass();
        ((org.slf4j.Logger) f93517b.getValue()).error(str, (Throwable) exc);
    }

    public static final void b(String str) {
        f93516a.getClass();
        ((org.slf4j.Logger) f93517b.getValue()).debug(str);
    }

    public static final void c(String str, Throwable th3) {
        f93516a.getClass();
        ((org.slf4j.Logger) f93517b.getValue()).error(str, th3);
    }

    public static final void d(String str) {
        f93516a.getClass();
        ((org.slf4j.Logger) f93517b.getValue()).warn(str);
    }
}
