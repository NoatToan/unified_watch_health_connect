package zr;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import e23.p;
import h4.r;
import h5.e0;
import i3.i7;
import i3.mh;
import o4.q1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.x1;
import s5.i0;
import s5.r0;
import s5.x0;
import w5.c0;
import w5.f0;
import w5.q;
import xn.t;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f206721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f206722b;

    public /* synthetic */ g(Object obj, int i14) {
        this.f206721a = i14;
        this.f206722b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0220  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f206721a;
        Object obj3 = this.f206722b;
        switch (i14) {
            case 0:
                nr.e.d dVar = (nr.e.d) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    r.a aVar = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    r rVarY = c2.l.y(aVar, eVar.f97920e);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(cVar, h4.d.a.f81536n, mVar, 6);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    b0 b0Var = b0.f22601a;
                    String str = dVar.f127015a;
                    if (str == null) {
                        str = "";
                    }
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97931h;
                    mh.c(str, c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7), zl.a.a(mVar), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, mVar, 0, 0, 131064);
                    l72.x0 x0Var2 = l72.x0.f111346a;
                    r rVarC2 = c2.l.C(aVar, 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                    z3.e eVarC = z3.f.c(1789875162, new t(dVar, 25), mVar);
                    int i15 = (l72.x0.f111348c << 6) | 48;
                    x0Var2.e(rVarC2, eVarC, mVar, i15, 0);
                    r22.p pVar = dVar.f127018d;
                    if (pVar == null) {
                        mVar.C(-2107766856);
                        mVar.f();
                    } else {
                        mVar.C(-2107766855);
                        x0Var2.e(null, z3.f.c(-527411852, new gs.i(pVar, 2), mVar), mVar, i15, 1);
                        mVar.f();
                    }
                    mVar.C(209112923);
                    s5.c.b bVar2 = new s5.c.b(0, 1, null);
                    r0 r0Var = new r0(new i0(ds.e0.e(mVar), 0L, (f0) null, (w5.b0) null, (c0) null, (q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null), null, null, null, 14, null);
                    boolean zR = mVar.r(dVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        objQ = new t30.h(dVar, 3);
                        mVar.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new t30.h(dVar, 3);
                            mVar.K(objQ);
                        }
                    }
                    s5.m.a aVar3 = new s5.m.a("", r0Var, (s5.n) objQ);
                    mVar.C(209122949);
                    int iG = bVar2.g(aVar3);
                    try {
                        bVar2.b(gl1.y.Q(mVar, R.string.view_event_details));
                        Unit unit = Unit.INSTANCE;
                        bVar2.f(iG);
                        mVar.f();
                        s5.c cVarK = bVar2.k();
                        mVar.f();
                        mh.d(cVarK, c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, j92.f.f97933j, mVar, 0, 0, 262140);
                        mVar.y();
                    } catch (Throwable th3) {
                        bVar2.f(iG);
                        throw th3;
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                p<Integer, Integer, Unit> pVar2 = ((nr.e.g) obj3).f127029f;
                if (pVar2 != null) {
                    pVar2.invoke(num, num2);
                }
                return Unit.INSTANCE;
            default:
                nr.f fVar = (nr.f) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    u4.d dVar2 = fVar.f127037c;
                    if (dVar2 == null) {
                        mVar2.C(-397846676);
                        mVar2.f();
                    } else {
                        mVar2.C(-397846675);
                        long jB = ds.e0.b(d92.b.f58623a, mVar2);
                        r.a aVar4 = r.S;
                        d92.b.f58625c.getClass();
                        i7.b(dVar2, null, x2.q(aVar4, j92.b.f97901d.f97905d), jB, mVar2, 48, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
