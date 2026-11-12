package fe2;

import org.slf4j.Logger;
import p005kotlin.Metadata;
import wd2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lfe2/x1;", "Lo53/b0;", "", "deviceUnitId", "Lae2/e0;", "publisher", "Lxd2/a1;", "repository", "<init>", "(JLae2/e0;Lxd2/a1;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 implements o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f71001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ae2.e0 f71002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xd2.a1 f71003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.m1 f71004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Logger f71005e;

    static {
        new a(null);
    }

    public x1(long j8, ae2.e0 e0Var, xd2.a1 a1Var) {
        e0Var.getClass();
        a1Var.getClass();
        this.f71001a = j8;
        this.f71002b = e0Var;
        this.f71003c = a1Var;
        this.f71004d = g8.i.c();
        this.f71005e = i2.a("SessionExpander");
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f71004d);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfe2/x1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "EXPAND_SESSION_THRESHOLD_HOURS", "I", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
