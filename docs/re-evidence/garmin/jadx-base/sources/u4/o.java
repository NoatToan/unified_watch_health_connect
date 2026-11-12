package u4;

import o4.e0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.w;
import p3.c2;
import p3.p0;
import p3.t1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu4/o;", "Lt4/d;", "Lu4/c;", "root", "<init>", "(Lu4/c;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o extends t4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f168520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f168521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f168522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f168523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f168524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0 f168525f;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w implements e23.a<Unit> {
        public a() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            Unit unit = Unit.INSTANCE;
            o.this.f168523d.setValue(unit);
            return unit;
        }
    }

    public o(c cVar) {
        n4.g.f123559b.getClass();
        this.f168520a = p0.n(n4.g.a(0L));
        this.f168521b = p0.n(Boolean.FALSE);
        k kVar = new k(cVar);
        kVar.f168497f = new a();
        this.f168522c = kVar;
        Unit unit = Unit.INSTANCE;
        t1 t1Var = t1.f135313a;
        t1Var.getClass();
        this.f168523d = new c2(unit, t1Var);
        this.f168524e = 1.0f;
    }

    @Override // t4.d
    public final boolean applyAlpha(float f14) {
        this.f168524e = f14;
        return true;
    }

    @Override // t4.d
    public final boolean applyColorFilter(e0 e0Var) {
        this.f168525f = e0Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t4.d
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getF162260d() {
        return ((n4.g) this.f168520a.getF182175a()).f123561a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t4.d
    public final void onDraw(q4.f fVar) {
        e0 e0Var = this.f168525f;
        k kVar = this.f168522c;
        if (e0Var == null) {
            e0Var = (e0) kVar.f168498g.getF182175a();
        }
        if (((Boolean) this.f168521b.getF182175a()).booleanValue() && fVar.getLayoutDirection() == g6.o.Rtl) {
            long jI1 = fVar.i1();
            q4.a.b f142543b = fVar.getF142543b();
            long jB = f142543b.b();
            f142543b.a().l();
            try {
                f142543b.f142550a.g(-1.0f, 1.0f, jI1);
                kVar.e(fVar, this.f168524e, e0Var);
                tn.k.p(f142543b, jB);
            } catch (Throwable th3) {
                tn.k.p(f142543b, jB);
                throw th3;
            }
        } else {
            kVar.e(fVar, this.f168524e, e0Var);
        }
        this.f168523d.getF182175a();
        Unit unit = Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ o(c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new c() : cVar);
    }
}
