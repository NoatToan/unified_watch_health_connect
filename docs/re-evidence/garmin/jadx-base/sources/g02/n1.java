package g02;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import i3.e5;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f74490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f74491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f74492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f74493e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f74494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f74495g;

    public /* synthetic */ n1(int i14, e23.a aVar, e23.a aVar2, String str, boolean z14, boolean z15) {
        this.f74489a = 2;
        this.f74494f = str;
        this.f74490b = z14;
        this.f74491c = z15;
        this.f74495g = aVar;
        this.f74493e = aVar2;
        this.f74492d = i14;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        String strH;
        p3.m mVar;
        int i14 = this.f74489a;
        Object obj3 = this.f74493e;
        Object obj4 = this.f74495g;
        Object obj5 = this.f74494f;
        int i15 = this.f74492d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                o1.b((h4.r) obj3, (String) obj5, this.f74490b, this.f74491c, (e23.a) obj4, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                kh0.g.j((dh0.a) obj3, this.f74490b, this.f74491c, (List) obj5, (ih0.s) obj4, (p3.m) obj, p3.p0.t(1 | i15));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                ll1.h.b(p3.p0.t(1 | i15), (e23.a) obj4, (e23.a) obj3, (String) obj5, (p3.m) obj, this.f74490b, this.f74491c);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                pp.a.b((yp.e) obj3, (mp.k) obj5, this.f74490b, this.f74491c, (e23.p) obj4, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                sa0.l.a((sa0.n) obj3, this.f74490b, this.f74491c, (e23.a) obj4, (e23.a) obj5, (p3.m) obj, p3.p0.t(i15 | 1));
                return Unit.INSTANCE;
            default:
                String str = (String) obj5;
                e23.a<Unit> aVar = (e23.a) obj4;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.v) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.v.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.v.f46300e;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(aVar3, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String strQ = gl1.y.Q(mVar2, i15);
                    boolean z14 = this.f74490b;
                    if (z14) {
                        strH = sn.a.h(mVar2, -1800980181, R.string.lbl_selected, mVar2);
                    } else {
                        mVar2.C(4230808);
                        mVar2.f();
                        strH = "";
                    }
                    String strG = str == null ? e5.g(strQ, ". ", strH) : j20.x.d(strQ, ". ", str, ". ", strH);
                    boolean z15 = this.f74491c;
                    p3.m.a aVar5 = p3.m.f135153a;
                    if (str == null) {
                        mVar2.C(4444152);
                        p2 p2Var = p2.f111205a;
                        boolean zB = mVar2.B(strG);
                        Object objQ = mVar2.q();
                        if (zB) {
                            objQ = new s70.r0(strG, 25);
                            mVar2.K(objQ);
                        } else {
                            aVar5.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new s70.r0(strG, 25);
                                mVar2.K(objQ);
                            }
                        }
                        mVar = mVar2;
                        p2Var.g(strQ, p5.v.b(aVar3, (e23.l) objQ), null, null, z3.f.c(-1139109152, new ty1.k1(vVar, z14, 0, (byte) 0), mVar2), false, z14 && z15, aVar, mVar, 24576, TsExtractor.TS_STREAM_TYPE_AC4);
                        mVar2.f();
                    } else {
                        mVar2.C(4915972);
                        p2 p2Var2 = p2.f111205a;
                        boolean zB2 = mVar2.B(strG);
                        Object objQ2 = mVar2.q();
                        if (zB2) {
                            objQ2 = new s70.r0(strG, 26);
                            mVar2.K(objQ2);
                        } else {
                            aVar5.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new s70.r0(strG, 26);
                                mVar2.K(objQ2);
                            }
                        }
                        mVar = mVar2;
                        p2Var2.h(strQ, str, null, p5.v.b(aVar3, (e23.l) objQ2), null, false, z14 && z15, null, z3.f.c(1504575765, new ty1.k1(vVar, z14, 1, (byte) 0), mVar2), null, aVar, mVar, 100663296, 0, 692);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n1(int i14, boolean z14, String str, boolean z15, e23.a aVar, com.garmin.android.apps.connectmobile.traininginitiative.ui.v vVar) {
        this.f74489a = 5;
        this.f74492d = i14;
        this.f74490b = z14;
        this.f74494f = str;
        this.f74491c = z15;
        this.f74495g = aVar;
        this.f74493e = vVar;
    }

    public /* synthetic */ n1(dh0.a aVar, boolean z14, boolean z15, List list, ih0.s sVar, int i14) {
        this.f74489a = 1;
        this.f74493e = aVar;
        this.f74490b = z14;
        this.f74491c = z15;
        this.f74494f = list;
        this.f74495g = sVar;
        this.f74492d = i14;
    }

    public /* synthetic */ n1(Object obj, Object obj2, boolean z14, boolean z15, o13.h hVar, int i14, int i15) {
        this.f74489a = i15;
        this.f74493e = obj;
        this.f74494f = obj2;
        this.f74490b = z14;
        this.f74491c = z15;
        this.f74495g = hVar;
        this.f74492d = i14;
    }

    public /* synthetic */ n1(sa0.n nVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, int i14) {
        this.f74489a = 4;
        this.f74493e = nVar;
        this.f74490b = z14;
        this.f74491c = z15;
        this.f74495g = aVar;
        this.f74494f = aVar2;
        this.f74492d = i14;
    }
}
