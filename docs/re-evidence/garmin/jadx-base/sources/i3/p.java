package i3;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li3/p;", "Li3/ri;", RemoteConfigConstants.ResponseFieldKey.STATE, "Lh5/v1;", "", "userOverride", "<init>", "(Li3/ri;Lh5/v1;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p implements ri {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ri f89247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h5.v1<Boolean> f89248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f89249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f89250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f89251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.b<Float, s1.n> f89252f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u1.l1 f89253g;

    public p(ri riVar, h5.v1<Boolean> v1Var) {
        this.f89247a = riVar;
        this.f89248b = v1Var;
        this.f89249c = p3.p0.n(g6.f.a(0));
        this.f89250d = ((riVar.b() % 12) * 0.5235988f) - 1.5707964f;
        this.f89251e = (riVar.a() * 0.10471976f) - 1.5707964f;
        this.f89252f = s1.d.a(this.f89250d, 0.01f);
        this.f89253g = new u1.l1();
    }

    public static float j(float f14) {
        double d14 = ((double) f14) % 6.283185307179586d;
        if (d14 < 0.0d) {
            d14 += 6.283185307179586d;
        }
        return (float) d14;
    }

    @Override // i3.ri
    public final int a() {
        return this.f89247a.a();
    }

    @Override // i3.ri
    public final int b() {
        return this.f89247a.b();
    }

    @Override // i3.ri
    public final int c() {
        return this.f89247a.c();
    }

    @Override // i3.ri
    public final void d(int i14) {
        this.f89247a.d(i14);
    }

    @Override // i3.ri
    public final void e(int i14) {
        this.f89250d = ((i14 % 12) * 0.5235988f) - 1.5707964f;
        ri riVar = this.f89247a;
        riVar.e(i14);
        int iC = riVar.c();
        qi.f89469b.getClass();
        if (iC == 0) {
            this.f89252f = s1.d.a(this.f89250d, 0.01f);
        }
    }

    @Override // i3.ri
    public final void f(int i14) {
        this.f89251e = (i14 * 0.10471976f) - 1.5707964f;
        ri riVar = this.f89247a;
        riVar.f(i14);
        int iC = riVar.c();
        qi.f89469b.getClass();
        if (iC == qi.f89470c) {
            this.f89252f = s1.d.a(this.f89251e, 0.01f);
        }
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68793s() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            riVar.f(riVar.a());
            Unit unit = Unit.INSTANCE;
        } finally {
            f4.f.a.e(fVarA, fVarB, f68793s);
        }
    }

    @Override // i3.ri
    public final boolean g() {
        return this.f89247a.g();
    }

    public final float h(float f14) {
        float fFloatValue = this.f89252f.e().floatValue() - f14;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return this.f89252f.e().floatValue() - fFloatValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float i() {
        return ((g6.f) this.f89249c.getF182175a()).f75997a;
    }

    public /* synthetic */ p(ri riVar, h5.v1 v1Var, int i14, p005kotlin.jvm.internal.j jVar) {
        this(riVar, (i14 & 2) != 0 ? new h5.v1() : v1Var);
    }
}
