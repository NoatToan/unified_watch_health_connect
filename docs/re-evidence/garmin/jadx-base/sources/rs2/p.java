package rs2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lrs2/p;", "", "Lcz2/a;", "clock", "<init>", "(Lcz2/a;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cz2.a f154444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f154445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f154446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f154447d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e23.a<Unit> f154448e;

    static {
        new a(null);
    }

    public p(cz2.a aVar) {
        aVar.getClass();
        this.f154444a = aVar;
        x53.c cVar = s0.f129406a;
        this.f154445b = zl.a.e("GfdiWatchdog", x53.b.f189152a.plus(ge1.b.h()));
        this.f154446c = new AtomicInteger(0);
        this.f154447d = new AtomicLong(aVar.millis());
    }

    public final void a() {
        e23.a<Unit> aVar;
        if (this.f154446c.incrementAndGet() <= 15 || this.f154447d.get() + 240000 >= this.f154444a.millis() || (aVar = this.f154448e) == null) {
            return;
        }
        ge1.b.T(this.f154445b, null, null, new q(aVar, null), 3);
    }

    public final void b() {
        this.f154446c.set(0);
        this.f154447d.set(this.f154444a.millis());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrs2/p$a;", "", "<init>", "()V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public p() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public p(cz2.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            cz2.a.f56879a.getClass();
            aVar = cz2.a.C1219a.f56881b;
        }
        this(aVar);
    }
}
