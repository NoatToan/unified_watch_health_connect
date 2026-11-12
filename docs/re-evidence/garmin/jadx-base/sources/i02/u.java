package i02;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p0;
import s1.e2;
import s1.j1;
import s1.u2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li02/u;", "Li02/b;", "", "stiffness", "<init>", "(F)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f86925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s1.b<n4.c, s1.o> f86926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f86927c;

    public u(float f14) {
        this.f86925a = f14;
        n4.c.f123541b.getClass();
        this.f86926b = new s1.b<>(n4.c.a(0L), e2.f155573f, null, null, 12, null);
        this.f86927c = p0.n(null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (s1.b.c(r10.f86926b, r11, r3, null, r5, 12) == r0) goto L22;
     */
    @Override // i02.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(f fVar, long j8, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f86924d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f86924d = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        t tVar2 = tVar;
        Object obj = tVar2.f86922b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar2.f86924d;
        c2 c2Var = this.f86927c;
        if (i15 == 0) {
            o13.r.b(obj);
            c2Var.setValue(fVar);
            n4.c cVarA = n4.c.a(j8);
            tVar2.f86921a = j8;
            tVar2.f86924d = 1;
            if (this.f86926b.g(cVarA, tVar2) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = tVar2.f86921a;
            o13.r.b(obj);
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        c2Var.setValue(null);
        return Unit.INSTANCE;
        n4.c.f123541b.getClass();
        n4.c cVarA2 = n4.c.a(0L);
        j1 j1VarC = s1.l.c(1, 0.0f, this.f86925a, n4.c.a(u2.b()));
        tVar2.f86921a = j8;
        tVar2.f86924d = 2;
    }

    @Override // i02.b
    public final long b() {
        return this.f86926b.e().f123544a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // i02.b
    public final f getPosition() {
        return (f) this.f86927c.getF182175a();
    }

    public u() {
        this(0.0f, 1, null);
    }

    public /* synthetic */ u(float f14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? 400.0f : f14);
    }
}
