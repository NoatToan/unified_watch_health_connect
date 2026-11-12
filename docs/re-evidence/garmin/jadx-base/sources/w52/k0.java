package w52;

import android.graphics.drawable.Drawable;
import c2.t2;
import c2.x2;
import i3.mc;
import i3.mh;
import java.util.List;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f182581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f182582e;

    public /* synthetic */ k0(c2.t tVar, nr.z zVar, Integer num, int i14) {
        this.f182578a = 22;
        this.f182580c = tVar;
        this.f182582e = zVar;
        this.f182581d = num;
        this.f182579b = i14;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x014b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182578a;
        int i15 = this.f182579b;
        Object obj3 = this.f182582e;
        Object obj4 = this.f182581d;
        Object obj5 = this.f182580c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                l0.e((com.garmin.android.apps.connectmobile.workouts.presentation.edit.k) obj5, (Integer) obj4, (m52.b) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).intValue();
                s0.a((com.garmin.android.apps.connectmobile.workouts.data.model.a) obj5, (String) obj4, (e23.q) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                b1.a((v0) obj5, (List) obj4, (List) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                q1.k((com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj5, (String) obj4, (e23.q) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                wb1.k.a((h4.r) obj5, (c80.y0) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(65), this.f182579b);
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                wn0.g.c((in0.e) obj5, (un0.a) obj4, (nk0.l) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                wq0.b0.a((t2) obj5, (wq0.a0.b) obj4, (wq0.l) obj3, this.f182579b, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                wu0.b.a(this.f182579b, (hl.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                x1.l.b((h4.r) obj5, (x1.e) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1), this.f182579b);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                x1.l.a((x1.e) obj5, (h4.r) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                int i16 = xa1.b0.f189732f;
                ((xa1.b0) obj5).i((Drawable) obj4, (String) obj3, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                y41.e.a((o51.b) obj5, (h4.r) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1), this.f182579b);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ya0.f.a((n80.a) obj5, (ya0.g) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((ye1.a) obj5).a((h4.r) obj4, (r70.q) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 14:
                String str = (String) obj5;
                Double d14 = (Double) obj3;
                Integer num = (Integer) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    boolean zB = mVar.B(str);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new y01.k(str, 4);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new y01.k(str, 4);
                            mVar.K(objQ);
                        }
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81537o;
                    c2.z zVarA = c2.y.a(gVar, aVar2, mVar, 54);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    Float fValueOf = d14 != null ? Float.valueOf((float) d14.doubleValue()) : null;
                    g6.f.a aVar4 = g6.f.f75994b;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    af1.n.a(this.f182579b, fValueOf, 105, 6, d92.c.b(j92.f.f97930g, mVar), mVar, 3456);
                    if (num == null) {
                        mVar.C(1581325237);
                        mVar.f();
                    } else {
                        mVar.C(1581325238);
                        mh.c(gl1.y.Q(mVar, num.intValue()), b0Var.b(aVar, aVar2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                        mVar = mVar;
                        mVar.f();
                    }
                    c2.l.f(x2.h(aVar, 10), mVar);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ye1.c.a((h4.r) obj5, (ue1.e) obj4, (we1.d) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                yr.c0.a((String) obj5, (h4.r) obj4, this.f182579b, (h4.d.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                yr.c0.c((mc) obj5, (nr.y) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                yr.t0.c((wg0.m) obj5, (xg0.a) obj4, (wg0.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                yu1.g.a((fy1.f) obj5, (String) obj4, (String) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                z2.c.a((z2.p) obj5, (h4.d) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                ((z3.e) obj5).e(obj4, obj3, (p3.m) obj, p3.p0.t(i15) | 1);
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).intValue();
                zr.h.f((c2.t) obj5, (nr.z) obj3, (Integer) obj4, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                zz1.c.b((h4.r) obj5, (zz1.d) obj4, (zz1.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ k0(int i14, hl.a aVar, e23.a aVar2, e23.a aVar3, int i15) {
        this.f182578a = 7;
        this.f182579b = i14;
        this.f182580c = aVar;
        this.f182581d = aVar2;
        this.f182582e = aVar3;
    }

    public /* synthetic */ k0(int i14, int i15, Object obj, Object obj2, o13.h hVar, int i16) {
        this.f182578a = i16;
        this.f182580c = obj;
        this.f182581d = obj2;
        this.f182582e = hVar;
        this.f182579b = i15;
    }

    public /* synthetic */ k0(t2 t2Var, wq0.a0.b bVar, wq0.l lVar, int i14, int i15) {
        this.f182578a = 6;
        this.f182580c = t2Var;
        this.f182581d = bVar;
        this.f182582e = lVar;
        this.f182579b = i14;
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f182578a = i15;
        this.f182580c = obj;
        this.f182581d = obj2;
        this.f182582e = obj3;
        this.f182579b = i14;
    }

    public /* synthetic */ k0(String str, int i14, Double d14, Integer num) {
        this.f182578a = 14;
        this.f182580c = str;
        this.f182579b = i14;
        this.f182582e = d14;
        this.f182581d = num;
    }

    public /* synthetic */ k0(String str, h4.r rVar, int i14, h4.d.b bVar, int i15) {
        this.f182578a = 16;
        this.f182580c = str;
        this.f182581d = rVar;
        this.f182579b = i14;
        this.f182582e = bVar;
    }
}
