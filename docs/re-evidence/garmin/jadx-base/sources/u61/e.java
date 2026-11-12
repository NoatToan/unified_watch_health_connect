package u61;

import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h4.k;
import h4.r;
import h5.e0;
import im.d0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import qs.v;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f168875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f168876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d0 f168877d;

    public /* synthetic */ e(int i14, String str, d0 d0Var, int i15) {
        this.f168874a = i15;
        this.f168875b = i14;
        this.f168876c = str;
        this.f168877d = d0Var;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        qs.a aVar;
        int i14 = this.f168874a;
        d0 d0Var = this.f168877d;
        String str = this.f168876c;
        int i15 = this.f168875b;
        int i16 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(542958608, new e(i15, str, d0Var, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = k.c(rVarF, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    qs.b bVar = null;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar2);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    if (i15 == v.TRAINING_EFFECT_MODE_AEROBIC.f147189a) {
                        mVar2.C(870619061);
                        qs.a.C2767a c2767a = qs.a.f146981d;
                        double d14 = d0Var.f94139a;
                        c2767a.getClass();
                        if (str != null && str.length() != 0) {
                            qs.a[] aVarArrValues = qs.a.values();
                            int length = aVarArrValues.length;
                            int i17 = 0;
                            while (true) {
                                if (i17 < length) {
                                    aVar = aVarArrValues[i17];
                                    if (!str.equalsIgnoreCase(aVar.f146989a)) {
                                        i17++;
                                    }
                                }
                            }
                        } else if (d14 == 5.0d) {
                            aVar = qs.a.LEVEL_4;
                        } else if (4.0d <= d14 && d14 <= 5.0d) {
                            aVar = qs.a.LEVEL_3;
                        } else if (3.0d <= d14 && d14 <= 4.0d) {
                            aVar = qs.a.LEVEL_2;
                        } else if (2.0d <= d14 && d14 <= 3.0d) {
                            aVar = qs.a.LEVEL_1;
                        } else if (1.0d > d14 || d14 > 2.0d) {
                            aVar = d14 < 1.0d ? qs.a.LEVEL_18 : null;
                        } else {
                            aVar = qs.a.LEVEL_0;
                        }
                        if (aVar == null) {
                            mVar2.C(1219387116);
                            mVar2.f();
                        } else {
                            mVar2.C(1219387117);
                            h.a(R.string.activity_aerobic_label, aVar.f146990b, aVar.f146991c, d0Var.f94139a, mVar2, 0);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(1219769192);
                        mVar2.f();
                    }
                    if (i15 == v.TRAINING_EFFECT_MODE_ANAEROBIC.f147189a) {
                        mVar2.C(870637885);
                        qs.b.a aVar3 = qs.b.f146997d;
                        double d15 = d0Var.f94139a;
                        aVar3.getClass();
                        if (str != null && str.length() != 0) {
                            for (qs.b bVar3 : qs.b.values()) {
                                if (str.equalsIgnoreCase(bVar3.f147005a)) {
                                    bVar = bVar3;
                                }
                            }
                        } else if (d15 == 5.0d) {
                            bVar = qs.b.LEVEL_4;
                        } else if (4.0d <= d15 && d15 <= 5.0d) {
                            bVar = qs.b.LEVEL_3;
                        } else if (3.0d <= d15 && d15 <= 4.0d) {
                            bVar = qs.b.LEVEL_2;
                        } else if (2.0d <= d15 && d15 <= 3.0d) {
                            bVar = qs.b.LEVEL_1;
                        } else if (1.0d <= d15 && d15 <= 2.0d) {
                            bVar = qs.b.LEVEL_15;
                        } else if (d15 < 1.0d) {
                            bVar = qs.b.LEVEL_0;
                        }
                        if (bVar == null) {
                            mVar2.C(1219970660);
                            mVar2.f();
                        } else {
                            mVar2.C(1219970661);
                            h.a(R.string.activity_anaerobic_label, bVar.f147006b, bVar.f147007c, d0Var.f94139a, mVar2, 0);
                            mVar2.f();
                        }
                        mVar2.f();
                    } else {
                        mVar2.C(1220360424);
                        mVar2.f();
                    }
                    mVar2.y();
                    x1 x1Var3 = n.f135158a;
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
