package cr;

import android.content.Context;
import c2.x2;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.C;
import i3.h1;
import i3.mh;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55299a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f55300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f55302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f55303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f55304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f55305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f55306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f55307i;

    public /* synthetic */ w(String str, String str2, String str3, String str4, String str5, long j8, long j14, boolean z14, int i14) {
        this.f55300b = str;
        this.f55301c = str2;
        this.f55305g = str3;
        this.f55306h = str4;
        this.f55307i = str5;
        this.f55303e = j8;
        this.f55304f = j14;
        this.f55302d = z14;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14;
        int i15;
        int i16 = this.f55299a;
        String str = this.f55301c;
        String str2 = this.f55300b;
        Object obj3 = this.f55305g;
        Object obj4 = this.f55307i;
        Object obj5 = this.f55306h;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                x.c(this.f55300b, this.f55301c, (String) obj3, (String) obj5, (String) obj4, this.f55303e, this.f55304f, this.f55302d, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                bx0.d.e eVar = (bx0.d.e) obj3;
                Context context = (Context) obj5;
                tb1.b bVar = (tb1.b) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    boolean zB = mVar.B(str2);
                    Object objQ = mVar.q();
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (zB) {
                        objQ = new fp0.c(str2, 9);
                        mVar.K(objQ);
                    } else {
                        aVar2.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new fp0.c(str2, 9);
                            mVar.K(objQ);
                        }
                    }
                    h4.r rVarC = p5.v.c((e23.l) objQ, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC2 = h4.k.c(rVarC, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
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
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    mVar.C(1200161414);
                    boolean z14 = this.f55302d;
                    long j8 = this.f55303e;
                    long j14 = z14 ? j8 : this.f55304f;
                    h4.r rVarH = x2.h(aVar, yz1.y.k(mVar));
                    i53.f fVarA = i53.a.a(new z72.l(0.33f, j14, null), new z72.l(0.33f, j14, null), new z72.l(0.33f, j14, null));
                    Float f14 = eVar.f21677c;
                    z72.k.d(f14 != null ? f14.floatValue() : 0.0f, yz1.y.g(mVar), 3.0f, 14155776, 0, j8, z3.f.c(1526659548, new as.s(str, 16), mVar), rVarH, fVarA, mVar, !z14);
                    mVar.f();
                    if (z14) {
                        mVar.C(-1447146994);
                        h4.r rVarF = x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC3 = c2.l.C(rVarF, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13);
                        boolean zR = mVar.r(context) | mVar.r(bVar);
                        Object objQ2 = mVar.q();
                        if (zR) {
                            objQ2 = new fx0.i(context, bVar, 2);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new fx0.i(context, bVar, 2);
                                mVar.K(objQ2);
                            }
                        }
                        fx0.b.f73785a.getClass();
                        h1.c((e23.a) objQ2, rVarC3, false, null, null, null, null, null, fx0.b.f73786b, mVar, C.ENCODING_PCM_32BIT, 508);
                        mVar.f();
                    } else {
                        mVar.C(-1447896946);
                        Integer num = eVar.f21679e;
                        if (num == null) {
                            mVar.C(-1447896947);
                            mVar.f();
                        } else {
                            mVar.C(-1447896946);
                            String strQ = gl1.y.Q(mVar, num.intValue());
                            h4.r rVarF2 = x2.f(aVar, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC4 = c2.l.C(rVarF2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                            d92.b.f58624b.getClass();
                            mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131068);
                            mh.c(gl1.y.Q(mVar, R.string.pregnancy_baby_size), x2.f(aVar, 1.0f), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 48, 0, 131068);
                            mVar.f();
                            Unit unit = Unit.INSTANCE;
                        }
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                sc1.a aVar4 = (sc1.a) obj5;
                Double d14 = (Double) obj4;
                String str3 = (String) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    sc1.a aVar5 = sc1.a.Time;
                    String strG = tn.k.g(str2, aVar4 == aVar5 ? "" : str);
                    boolean z15 = this.f55302d;
                    if (z15) {
                        i14 = 1833872294;
                        i15 = R.string.lbl_personal_records_current_record;
                    } else {
                        i14 = 1833984731;
                        i15 = R.string.label_previous;
                    }
                    vc1.i.b(strG, sn.a.h(mVar2, i14, i15, mVar2), this.f55303e, z15, mVar2, 0);
                    if (d14 != null) {
                        mVar2.C(1834230034);
                        l3.a aVar6 = l3.f23124b;
                        long jDoubleValue = (long) d14.doubleValue();
                        aVar6.getClass();
                        String strE1 = l3.a.e1(jDoubleValue);
                        if (strE1 != null) {
                            str3 = strE1;
                        }
                        if (aVar4 == aVar5) {
                            str = "";
                        }
                        vc1.i.b(tn.k.g(str3, str), gl1.y.Q(mVar2, R.string.lbl_goal), this.f55304f, true, mVar2, 3072);
                        mVar2.f();
                    } else {
                        mVar2.C(1834691314);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ w(String str, String str2, boolean z14, bx0.d.e eVar, Context context, tb1.b bVar, long j8, long j14) {
        this.f55300b = str;
        this.f55301c = str2;
        this.f55302d = z14;
        this.f55305g = eVar;
        this.f55306h = context;
        this.f55307i = bVar;
        this.f55303e = j8;
        this.f55304f = j14;
    }

    public /* synthetic */ w(String str, sc1.a aVar, String str2, boolean z14, long j8, Double d14, String str3, long j14) {
        this.f55300b = str;
        this.f55306h = aVar;
        this.f55301c = str2;
        this.f55302d = z14;
        this.f55303e = j8;
        this.f55307i = d14;
        this.f55305g = str3;
        this.f55304f = j14;
    }
}
