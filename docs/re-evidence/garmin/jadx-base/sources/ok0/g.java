package ok0;

import androidx.lifecycle.v1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p13.h0;
import r53.o2;
import r53.p2;
import r53.q2;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0007\bB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lok0/g;", "Lub1/a;", "Lok0/m;", "Lkk0/b;", "gearRepository", "<init>", "(Lkk0/b;)V", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g extends ub1.a implements m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f132470g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f132471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<c80.b> f132472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f132473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f132474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f132475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p2 f132476f;

    static {
        new b(null);
    }

    public g(kk0.b bVar) {
        bVar.getClass();
        this.f132471a = bVar;
        this.f132472b = new AtomicReference<>(null);
        p2 p2VarA = q2.a(null);
        this.f132473c = p2VarA;
        this.f132474d = p2VarA;
        p2 p2VarA2 = q2.a(new a(false, 1, null));
        this.f132475e = p2VarA2;
        this.f132476f = p2VarA2;
    }

    @Override // ok0.m
    public final void E3() {
        o2<c80.c> o2Var;
        c80.c value;
        c80.b bVarY4 = y4();
        if (bVarY4 == null || (o2Var = bVarY4.f25295a) == null || (value = o2Var.getValue()) == null) {
            return;
        }
        long j8 = value.f25308a;
        if (value.f25309b) {
            c80.b bVarY5 = y4();
            if (bVarY5 == null) {
                return;
            }
            ge1.b.T(v1.a(this), null, null, new h(bVarY5, this, j8, null), 3);
            return;
        }
        String str = value.f25312e;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        c80.b bVarY6 = y4();
        if (bVarY6 == null) {
            return;
        }
        ge1.b.T(v1.a(this), null, null, new i(bVarY6, this, j8, str2, null), 3);
    }

    @Override // ok0.m
    public final void I2(boolean z14) {
        z1<Boolean> z1Var;
        c80.b bVarY4 = y4();
        if (bVarY4 == null || (z1Var = bVarY4.f25299e) == null) {
            return;
        }
        z1Var.setValue(Boolean.valueOf(z14));
    }

    @Override // ok0.m
    /* JADX INFO: renamed from: a0, reason: from getter */
    public final p2 getF132474d() {
        return this.f132474d;
    }

    @Override // ok0.m
    public final o2<a> getUiState() {
        return this.f132476f;
    }

    @Override // ok0.m
    public final void j1(String str) {
        p2 p2Var;
        Object value;
        i53.c cVar;
        z1<i53.c<c80.a>> z1Var;
        i53.c<c80.a> value2;
        i53.c<c80.a> cVar2;
        c80.a next;
        i53.c<c80.a> cVarE;
        Object next2;
        i53.c cVarE2;
        str.getClass();
        do {
            p2Var = this.f132473c;
            value = p2Var.getValue();
            cVar = (i53.c) value;
            if (cVar != null) {
                Iterator<E> it = cVar.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!p005kotlin.jvm.internal.s.g(((uk0.e) next2).getF171812a(), str));
                uk0.e eVar = (uk0.e) next2;
                if (eVar != null && (cVarE2 = i53.a.e(h0.y0(cVar, eVar))) != null) {
                    cVar = cVarE2;
                }
            }
        } while (!p2Var.b(value, cVar));
        c80.b bVarY4 = y4();
        if (bVarY4 == null || (z1Var = bVarY4.f25296b) == null) {
            return;
        }
        do {
            value2 = z1Var.getValue();
            cVar2 = value2;
            Iterator<c80.a> it3 = cVar2.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!p005kotlin.jvm.internal.s.g(next.f25286a, str));
            c80.a aVar = next;
            if (aVar != null && (cVarE = i53.a.e(h0.y0(cVar2, aVar))) != null) {
                cVar2 = cVarE;
            }
        } while (!z1Var.b(value2, cVar2));
    }

    @Override // ok0.m
    public final void k3() {
        List<c80.t> value;
        c80.b bVarY4 = y4();
        if (bVarY4 == null) {
            return;
        }
        z1<List<c80.t>> z1Var = bVarY4.f25297c;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, h0.D0(value, c80.t.b.f25587a)));
    }

    @Override // ok0.m
    public final Long q4() {
        o2<c80.c> o2Var;
        c80.c value;
        c80.b bVarY4 = y4();
        if (bVarY4 == null || (o2Var = bVarY4.f25295a) == null || (value = o2Var.getValue()) == null) {
            return null;
        }
        return Long.valueOf(value.f25308a);
    }

    @Override // ok0.m
    public final void t2() {
        List<c80.t> value;
        c80.b bVarY4 = y4();
        if (bVarY4 == null) {
            return;
        }
        z1<List<c80.t>> z1Var = bVarY4.f25297c;
        do {
            value = z1Var.getValue();
        } while (!z1Var.b(value, h0.D0(value, c80.t.c.f25588a)));
    }

    @Override // ub1.a
    public final void x4(c80.b bVar) {
        AtomicReference<c80.b> atomicReference;
        bVar.getClass();
        do {
            atomicReference = this.f132472b;
            if (atomicReference.compareAndSet(null, bVar)) {
                c80.b bVarY4 = y4();
                if (bVarY4 == null) {
                    return;
                }
                ge1.b.T(v1.a(this), null, null, new j(bVarY4, this, null), 3);
                ge1.b.T(v1.a(this), null, null, new k(bVarY4, this, null), 3);
                return;
            }
        } while (atomicReference.get() == null);
    }

    public final c80.b y4() {
        return this.f132472b.get();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lok0/g$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lok0/g$a;", "", "", "isOwnActivity", "<init>", "(Z)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f132477a;

        public /* synthetic */ a(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
            this((i14 & 1) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f132477a == ((a) obj).f132477a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f132477a);
        }

        public final String toString() {
            return com.airbnb.lottie.animation.keyframe.a.g("ActivityGearUiState(isOwnActivity=", ")", this.f132477a);
        }

        public a(boolean z14) {
            this.f132477a = z14;
        }

        public a() {
            this(false, 1, null);
        }
    }
}
