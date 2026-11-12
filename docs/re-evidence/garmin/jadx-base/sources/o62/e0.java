package o62;

import android.content.Context;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.k1;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i f129659b;

    public /* synthetic */ e0(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar, int i14) {
        this.f129658a = i14;
        this.f129659b = iVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        p62.f fVarY4;
        com.garmin.android.apps.connectmobile.workouts.data.model.v vVarK;
        boolean z14;
        boolean z15;
        com.garmin.android.apps.connectmobile.workouts.data.model.b bVarT;
        boolean z16;
        switch (this.f129658a) {
            case 0:
                Double d14 = (Double) obj;
                d14.getClass();
                this.f129659b.f49699d.L4(new v0(d14, false, false, null, null, null, null, false, null, 510, null));
                break;
            case 1:
                m52.d dVar = (m52.d) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar = this.f129659b.f49699d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                m52.k kVar = jVar.f49701a;
                if (kVar == m52.k.f116758r) {
                    m52.d dVar2 = j0VarB.f48217c;
                    m52.d dVar3 = m52.d.REST;
                    if (dVar2 == dVar3) {
                        j0VarB.f48227l = m52.a.f116650f;
                    }
                    if (dVar == dVar3) {
                        j0VarB.Z = m52.e.NONE;
                    }
                }
                j0VarB.f48217c = dVar;
                jVar.H4(j0VarB);
                jVar.f49703c.j(j0VarB);
                y0<Integer> y0Var = jVar.f49705e;
                x52.e.f189070c.getClass();
                y0Var.j(Integer.valueOf(x52.e.a.a(dVar).a(kVar)));
                break;
            case 2:
                x52.f fVar = (x52.f) obj;
                fVar.getClass();
                this.f129659b.f49699d.M4(fVar);
                break;
            case 3:
                x52.f fVar2 = (x52.f) obj;
                fVar2.getClass();
                this.f129659b.f49699d.M4(fVar2);
                break;
            case 4:
                x52.f fVar3 = (x52.f) obj;
                fVar3.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar2 = this.f129659b.f49699d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB2 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar2.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, fVar3.f189099d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -268435457, 16383);
                p62.a0 a0VarE4 = jVar2.E4(fVar3);
                if (a0VarE4 != null) {
                    a0VarE4.d(jVar2.f49701a, j0VarB2, new Object[0]);
                }
                jVar2.f49703c.j(j0VarB2);
                if (fVar3 == x52.f.f189084m) {
                    jVar2.C4().f49631g = true;
                }
                break;
            case 5:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var);
                break;
            case 6:
                String str = (String) obj;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar3 = this.f129659b.f49699d;
                if (str == null) {
                    str = "";
                }
                jVar3.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar3.G4(), 0, null, false, false, str, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1025, 16383));
                break;
            case 7:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var2 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var2.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var2);
                break;
            case 8:
                double dDoubleValue = ((Double) obj).doubleValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar4 = this.f129659b.f49699d;
                jVar4.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar4.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, dDoubleValue, null, null, -1, 16255));
                break;
            case 9:
                Double d15 = (Double) obj;
                d15.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar5 = this.f129659b.f49699d;
                v0 v0Var = new v0(d15, false, false, null, null, null, null, false, null, 510, null);
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB3 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar5.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                Double d16 = v0Var.f129789a;
                j0VarB3.J0 = d16 != null ? d16.doubleValue() : 0.0d;
                jVar5.f49703c.j(j0VarB3);
                break;
            case 10:
                m52.a aVar = (m52.a) obj;
                aVar.getClass();
                this.f129659b.f49699d.J4(new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.i(aVar));
                break;
            case 11:
                m52.a aVar2 = (m52.a) obj;
                aVar2.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar6 = this.f129659b.f49699d;
                m52.k kVar2 = jVar6.f49701a;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB4 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar6.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                if (aVar2 != j0VarB4.f48227l) {
                    j0VarB4.f48227l = aVar2;
                    if (kVar2 == m52.k.f116755o && aVar2 != m52.a.f116649e) {
                        x52.f.f189078g.getClass();
                        if (x52.f.a.b(j0VarB4, kVar2) == x52.f.f189090t) {
                            j0VarB4.f48232q = m52.g.NONE;
                        }
                    }
                    m52.k kVar3 = m52.k.f116758r;
                    if (kVar2 == kVar3 && j0VarB4.f48217c == m52.d.REST) {
                        jVar6.C4().f49630f = aVar2 == m52.a.f116656l;
                    }
                    if (kVar2 == kVar3 && aVar2 == m52.a.f116650f) {
                        boolean zD = zf.b.D(jVar6.C4().f49626b);
                        double d17 = j0VarB4.f48229n;
                        if (zD) {
                            if (d17 == 0.0d) {
                                d17 = 200.0d;
                            }
                            j0VarB4.f48229n = d17;
                        } else if (Double.isNaN(d17) || j0VarB4.f48229n <= 0.0d) {
                            j0VarB4.f48229n = 200.0d;
                        }
                    }
                    if (kVar2 == kVar3) {
                        fVarY4 = jVar6.z4(aVar2);
                    } else {
                        fVarY4 = k52.g.f(kVar2) ? com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j.y4(aVar2) : com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j.x4(aVar2);
                    }
                    if (fVarY4 != null) {
                        fVarY4.d(kVar2, j0VarB4, aVar2);
                    }
                    jVar6.f49703c.j(j0VarB4);
                }
                break;
            case 12:
                x52.f fVar4 = (x52.f) obj;
                fVar4.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar7 = this.f129659b.f49699d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB5 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar7.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, fVar4.f189099d, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -268435457, 16383);
                if (fVar4 == x52.f.f189090t) {
                    if (j0VarB5.f48239z == -1) {
                        List<com.garmin.android.apps.connectmobile.workouts.data.model.v> list = jVar7.A4().f49620a;
                        j0VarB5.f48239z = (list == null || (vVarK = gl1.y.k((int) j0VarB5.f48229n, list)) == null) ? 0 : vVarK.getDuration();
                    }
                    if (j0VarB5.A == -1) {
                        j0VarB5.A = 90;
                    }
                    if (j0VarB5.B == -1) {
                        j0VarB5.B = 10;
                    }
                }
                p62.a0 a0VarD4 = jVar7.D4(fVar4);
                if (a0VarD4 != null) {
                    a0VarD4.d(jVar7.f49701a, j0VarB5, new Object[0]);
                }
                jVar7.f49703c.j(j0VarB5);
                break;
            case 13:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var3 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var3.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var3);
                break;
            case 14:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var4 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var4.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var4);
                break;
            case 15:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var5 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var5.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var5);
                break;
            case 16:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var6 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var6.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var6);
                break;
            case 17:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar8 = this.f129659b.f49699d;
                jVar8.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar8.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, (m52.f) obj, null, null, 0.0d, null, null, -1, 16381));
                break;
            case 18:
                x52.f fVar5 = (x52.f) obj;
                fVar5.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar9 = this.f129659b.f49699d;
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0VarB6 = com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar9.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, null, 0.0d, null, null, -1, 16383);
                int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j.c.f49715b[fVar5.ordinal()];
                if (i14 == 3) {
                    j0VarB6.f48232q = m52.g.HEART_RATE;
                    j0VarB6.C = 1;
                    j0VarB6.J0 = Double.NaN;
                } else if (i14 == 16) {
                    j0VarB6.f48232q = m52.g.NONE;
                    j0VarB6.C = 0;
                    j0VarB6.J0 = -1.0d;
                } else if (i14 == 17) {
                    j0VarB6.f48232q = m52.g.NONE;
                    j0VarB6.C = 0;
                    j0VarB6.J0 = Double.NaN;
                }
                p62.a0 a0VarF4 = jVar9.F4(fVar5);
                if (a0VarF4 != null) {
                    a0VarF4.d(jVar9.f49701a, j0VarB6, new Object[0]);
                }
                jVar9.f49703c.j(j0VarB6);
                break;
            case 19:
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var7 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) obj;
                j0Var7.getClass();
                this.f129659b.f49699d.f49703c.j(j0Var7);
                break;
            case 20:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar10 = this.f129659b.f49699d;
                jVar10.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar10.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, null, (qs.f) obj, 0.0d, null, null, -1, 16367));
                break;
            case 21:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar11 = this.f129659b.f49699d;
                jVar11.f49703c.j(com.garmin.android.apps.connectmobile.workouts.data.model.j0.b(jVar11.G4(), 0, null, false, false, null, 0.0d, null, 0.0d, 0.0d, null, 0, 0, 0, 0, null, 0.0d, 0.0d, null, null, (m52.e) obj, null, 0.0d, null, null, -1, 16375));
                break;
            default:
                Context context = (Context) obj;
                context.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar12 = this.f129659b.f49699d;
                T tD = jVar12.f49704d.d();
                tD.getClass();
                com.garmin.android.apps.connectmobile.workouts.data.model.j0 j0Var8 = (com.garmin.android.apps.connectmobile.workouts.data.model.j0) tD;
                com.garmin.android.apps.connectmobile.repcounting.model.d dVarD = jVar12.B4().f49623b.D(j0Var8.H0, j0Var8.g());
                if (dVarD != null) {
                    com.garmin.android.apps.connectmobile.repcounting.model.d dVarD2 = jVar12.B4().f49623b.D(j0Var8.H0, dVarD.f41104c);
                    boolean z17 = dVarD.f41105d;
                    boolean z18 = z17 || (dVarD2 != null && dVarD2.f41105d);
                    bVarT = gl1.d.t(jVar12.B4().f49624c, dVarD);
                    z14 = z18;
                    z15 = z17;
                } else {
                    z14 = false;
                    z15 = false;
                    bVarT = null;
                }
                Double dValueOf = Double.valueOf(j0Var8.J0);
                String benchmarkKey = bVarT != null ? bVarT.getBenchmarkKey() : null;
                String strC = new k52.a(new l22.a(context)).c(bVarT);
                Double dValueOf2 = Double.valueOf(j0Var8.M0);
                Double dM = bVarT != null ? bVarT.m() : null;
                if (jVar12.f49701a == m52.k.f116759t) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (k1.f37122a.C()) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                } else {
                    z16 = false;
                }
                jVar12.J4(new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.f(new v0(dValueOf, z14, z15, benchmarkKey, strC, dValueOf2, dM, z16, j0Var8.f48224j)));
                break;
        }
        return Unit.INSTANCE;
    }
}
