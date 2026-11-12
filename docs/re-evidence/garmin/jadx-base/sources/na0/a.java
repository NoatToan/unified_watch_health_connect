package na0;

import a11.d0;
import am.x0;
import am.z0;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.v1;
import c2.b0;
import c2.c3;
import c2.k3;
import c2.l1;
import c2.n3;
import c2.p3;
import c2.q3;
import c2.x2;
import c2.z;
import c80.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.nutrition.NutritionHydrationActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.training.fbtap.progressreports.FBTProgressReportActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import e2.i0;
import e2.k0;
import gl1.y;
import h5.e0;
import i3.mh;
import java.text.Collator;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import l72.c1;
import l72.f0;
import l72.j0;
import l72.p2;
import lc.h0;
import lc.m0;
import lc.u0;
import lc.v;
import o4.m1;
import o53.s0;
import o72.i3;
import ok0.t;
import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.t0;
import p13.w;
import p13.x;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import u1.a2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f125107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f125108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f125109e;

    public /* synthetic */ a(q21.d dVar, v21.e eVar, e23.l lVar, e23.l lVar2) {
        this.f125105a = 17;
        this.f125107c = dVar;
        this.f125108d = eVar;
        this.f125106b = lVar;
        this.f125109e = lVar2;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        p21.g.d((List) this.f125107c, (v21.e) this.f125108d, (e23.l) this.f125106b, (h4.r) this.f125109e, (p3.m) obj, p0.t(3073));
        return Unit.INSTANCE;
    }

    private final Object b(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        p21.h.a((q21.l) this.f125107c, (v21.e) this.f125106b, (e23.a) this.f125108d, (e23.a) this.f125109e, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        DeviceBackupActivity deviceBackupActivity = (DeviceBackupActivity) this.f125107c;
        e23.a aVar = (e23.a) this.f125108d;
        e23.l lVar = (e23.l) this.f125106b;
        pg1.d dVar = (pg1.d) this.f125109e;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
        deviceBackupActivity.ca(aVar, lVar, dVar, mVar, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        DeviceBackupActivity deviceBackupActivity = (DeviceBackupActivity) this.f125107c;
        sg1.b bVar = (sg1.b) this.f125106b;
        pg1.d dVar = (pg1.d) this.f125108d;
        e23.a aVar = (e23.a) this.f125109e;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
        deviceBackupActivity.fa(p0.t(1), aVar, mVar, dVar, bVar);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0050  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object e(Object obj, Object obj2) {
        final UpdateBirthdateActivity updateBirthdateActivity = (UpdateBirthdateActivity) this.f125107c;
        final p1 p1Var = (p1) this.f125106b;
        p1 p1Var2 = (p1) this.f125108d;
        final p1 p1Var3 = (p1) this.f125109e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = UpdateBirthdateActivity.f44011d;
        final int i15 = 1;
        final int i16 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = updateBirthdateActivity.f44013b;
            p3.m.a aVar = p3.m.f135153a;
            if (z14) {
                mVar.C(4501149);
                boolean zR = mVar.r(updateBirthdateActivity);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new e23.a() { // from class: pk1.m
                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            p1 p1Var4 = p1Var;
                            UpdateBirthdateActivity updateBirthdateActivity2 = updateBirthdateActivity;
                            switch (i17) {
                                case 0:
                                    int i18 = UpdateBirthdateActivity.f44011d;
                                    p1Var4.setValue(Boolean.TRUE);
                                    f fVar = (f) updateBirthdateActivity2.f44014c.getValue();
                                    c22.d.f23016a.getClass();
                                    String strA = c22.d.a.a();
                                    fVar.getClass();
                                    w9.a aVarA = v1.a(fVar);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new e(fVar, strA, null), 2);
                                    break;
                                default:
                                    int i19 = UpdateBirthdateActivity.f44011d;
                                    p1Var4.setValue(Boolean.FALSE);
                                    updateBirthdateActivity2.finish();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new e23.a() { // from class: pk1.m
                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i16;
                                p1 p1Var4 = p1Var;
                                UpdateBirthdateActivity updateBirthdateActivity2 = updateBirthdateActivity;
                                switch (i17) {
                                    case 0:
                                        int i18 = UpdateBirthdateActivity.f44011d;
                                        p1Var4.setValue(Boolean.TRUE);
                                        f fVar = (f) updateBirthdateActivity2.f44014c.getValue();
                                        c22.d.f23016a.getClass();
                                        String strA = c22.d.a.a();
                                        fVar.getClass();
                                        w9.a aVarA = v1.a(fVar);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new e(fVar, strA, null), 2);
                                        break;
                                    default:
                                        int i19 = UpdateBirthdateActivity.f44011d;
                                        p1Var4.setValue(Boolean.FALSE);
                                        updateBirthdateActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ);
                    }
                }
                com.garmin.android.apps.connectmobile.settings.usersettings.a.a((e23.a) objQ, mVar, 0);
                mVar.f();
            } else {
                mVar.C(4748653);
                LocalDate localDate = (LocalDate) p1Var2.getF182175a();
                Object objQ2 = mVar.q();
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new i3(p1Var2, 27);
                    mVar.K(objQ2);
                }
                com.garmin.android.apps.connectmobile.settings.usersettings.a.b(localDate, (e23.l) objQ2, mVar, 48);
                mVar.f();
            }
            if (((Boolean) p1Var3.getF182175a()).booleanValue()) {
                mVar.C(4996157);
                c1 c1Var = c1.f110940a;
                String strQ = y.Q(mVar, R.string.lbl_birthdate_saved);
                String strQ2 = y.Q(mVar, R.string.msg_birthdate_saved);
                String string = updateBirthdateActivity.getString(R.string.lbl_ok);
                string.getClass();
                boolean zR2 = mVar.r(updateBirthdateActivity);
                Object objQ3 = mVar.q();
                if (zR2) {
                    objQ3 = new e23.a() { // from class: pk1.m
                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i15;
                            p1 p1Var4 = p1Var3;
                            UpdateBirthdateActivity updateBirthdateActivity2 = updateBirthdateActivity;
                            switch (i17) {
                                case 0:
                                    int i18 = UpdateBirthdateActivity.f44011d;
                                    p1Var4.setValue(Boolean.TRUE);
                                    f fVar = (f) updateBirthdateActivity2.f44014c.getValue();
                                    c22.d.f23016a.getClass();
                                    String strA = c22.d.a.a();
                                    fVar.getClass();
                                    w9.a aVarA = v1.a(fVar);
                                    x53.c cVar = s0.f129406a;
                                    ge1.b.T(aVarA, x53.b.f189152a, null, new e(fVar, strA, null), 2);
                                    break;
                                default:
                                    int i19 = UpdateBirthdateActivity.f44011d;
                                    p1Var4.setValue(Boolean.FALSE);
                                    updateBirthdateActivity2.finish();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new e23.a() { // from class: pk1.m
                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, o13.l] */
                            @Override // e23.a
                            public final Object invoke() {
                                int i17 = i15;
                                p1 p1Var4 = p1Var3;
                                UpdateBirthdateActivity updateBirthdateActivity2 = updateBirthdateActivity;
                                switch (i17) {
                                    case 0:
                                        int i18 = UpdateBirthdateActivity.f44011d;
                                        p1Var4.setValue(Boolean.TRUE);
                                        f fVar = (f) updateBirthdateActivity2.f44014c.getValue();
                                        c22.d.f23016a.getClass();
                                        String strA = c22.d.a.a();
                                        fVar.getClass();
                                        w9.a aVarA = v1.a(fVar);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new e(fVar, strA, null), 2);
                                        break;
                                    default:
                                        int i19 = UpdateBirthdateActivity.f44011d;
                                        p1Var4.setValue(Boolean.FALSE);
                                        updateBirthdateActivity2.finish();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(objQ3);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, string, false, false, (e23.a) objQ3, null, null, mVar, 6, 0, 1752);
                mVar.f();
            } else {
                mVar.C(5539122);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00b1  */
    private final Object f(Object obj, Object obj2) {
        i53.d dVar = (i53.d) this.f125107c;
        i53.c cVar = (i53.c) this.f125106b;
        e23.p pVar = (e23.p) this.f125108d;
        o82.g gVar = (o82.g) this.f125109e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            mVar.C(-536725562);
            ArrayList arrayList = new ArrayList(dVar.size());
            Iterator it = dVar.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                arrayList.add(new j0(gl1.d.T(((mp.j) entry.getKey()).f120006a, mVar, 0), null, null, false, ((Boolean) entry.getValue()).booleanValue(), 14, null));
            }
            mVar.f();
            i53.f fVarJ = i53.a.j(i53.a.j(arrayList));
            f82.e eVar = new f82.e();
            i0 i0VarA = k0.a(0, 0, 3, mVar);
            boolean zB = mVar.B(cVar) | mVar.B(pVar) | mVar.k(gVar.ordinal());
            Object objQ = mVar.q();
            if (zB) {
                objQ = new pp.g(cVar, i14, pVar, gVar);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new pp.g(cVar, i14, pVar, gVar);
                    mVar.K(objQ);
                }
            }
            e82.a.b(fVarJ, eVar, i0VarA, null, null, (e23.p) objQ, mVar, 0, 24);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object g(Object obj, Object obj2) {
        p1 p1Var = (p1) this.f125107c;
        e23.a aVar = (e23.a) this.f125106b;
        zc.d dVar = (zc.d) this.f125108d;
        q12.e eVar = (q12.e) this.f125109e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            z02.d.a(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-754043968, new p40.r(aVar, 8), mVar), null, null, null, z3.f.c(-463300156, new oo0.f(22, dVar, eVar), mVar), mVar, 196656, 28);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:28:0x0138  */
    private final Object h(Object obj, Object obj2) {
        p1 p1Var = (p1) this.f125107c;
        q42.i iVar = (q42.i) this.f125106b;
        Context context = (Context) this.f125108d;
        x3 x3Var = (x3) this.f125109e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 0;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(aVar, tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarD = x2.d(c2.l.C(rVarE, 0.0f, eVar.f97922g, 0.0f, 0.0f, 13), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarD, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            p2 p2Var = p2.f111205a;
            String strQ = y.Q(mVar, R.string.lbl_weight);
            z3.e eVarC = z3.f.c(-1775784951, new q42.c(context, x3Var, i14), mVar);
            boolean zB = mVar.B(p1Var);
            Object objQ = mVar.q();
            p3.m.a aVar4 = p3.m.f135153a;
            if (zB) {
                objQ = new p40.k0(p1Var, 22);
                mVar.K(objQ);
            } else {
                aVar4.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new p40.k0(p1Var, 22);
                    mVar.K(objQ);
                }
            }
            p2Var.g(strQ, null, null, null, eVarC, false, false, (e23.a) objQ, mVar, 24576, 238);
            f0 f0Var = f0.f110999a;
            String strQ2 = y.Q(mVar, R.string.weight_remove_goal);
            h4.r rVarC2 = c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
            boolean zR = mVar.r(iVar);
            Object objQ2 = mVar.q();
            if (zR) {
                objQ2 = new q42.d(iVar, 0);
                mVar.K(objQ2);
            } else {
                aVar4.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new q42.d(iVar, 0);
                    mVar.K(objQ2);
                }
            }
            f0Var.i(strQ2, rVarC2, false, (e23.a) objQ2, mVar, 0, 4);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object i(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        qk0.r.c((i53.e) this.f125107c, (qk0.c) this.f125108d, (e23.l) this.f125106b, (qk0.i) this.f125109e, (p3.m) obj, p0.t(1));
        return Unit.INSTANCE;
    }

    private final Object j(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        qn1.c.c((mm1.f) this.f125107c, (DateTime) this.f125108d, (DateTime) this.f125109e, (e23.l) this.f125106b, (p3.m) obj, p0.t(9));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0095  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2) {
        int i14;
        h0 h0Var;
        uv1.b bVar = ((vv1.c) this.f125107c).f180514g;
        FBTProgressReportActivity fBTProgressReportActivity = (FBTProgressReportActivity) this.f125106b;
        m0 m0Var = (m0) this.f125108d;
        x3 x3Var = (x3) this.f125109e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        FBTProgressReportActivity.a aVar = FBTProgressReportActivity.f45512b;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (!((Boolean) x3Var.getF182175a()).booleanValue() || bVar == null) {
                mVar.C(-709560895);
                mVar.f();
            } else {
                mVar.C(-709903011);
                m0Var.getClass();
                bVar.getClass();
                v vVar = (v) y.l(m0Var, mVar).getF182175a();
                if (p005kotlin.jvm.internal.s.g((vVar == null || (h0Var = vVar.f111882b) == null) ? null : h0Var.f111773b.f144347f, wv1.c.a.f187458b.f187457a)) {
                    i14 = R.string.lbl_repeat_plan;
                } else {
                    i14 = FBTProgressReportActivity.b.f45514a[bVar.ordinal()] == 1 ? R.string.final_report : R.string.progress_report;
                }
                String strQ = y.Q(mVar, i14);
                boolean zR = mVar.r(fBTProgressReportActivity);
                Object objQ = mVar.q();
                if (zR) {
                    objQ = new q42.d(fBTProgressReportActivity, 23);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q42.d(fBTProgressReportActivity, 23);
                        mVar.K(objQ);
                    }
                }
                z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar, null);
                mVar.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0362  */
    /* JADX WARN: Code duplicated, block: B:104:0x0385  */
    /* JADX WARN: Code duplicated, block: B:105:0x038f  */
    /* JADX WARN: Code duplicated, block: B:108:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:109:0x0425  */
    /* JADX WARN: Code duplicated, block: B:113:0x0440  */
    /* JADX WARN: Code duplicated, block: B:115:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:121:0x0523  */
    /* JADX WARN: Code duplicated, block: B:123:0x052a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0549  */
    /* JADX WARN: Code duplicated, block: B:143:0x059b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0625  */
    /* JADX WARN: Code duplicated, block: B:175:0x06fa  */
    /* JADX WARN: Code duplicated, block: B:191:0x0755  */
    /* JADX WARN: Code duplicated, block: B:272:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:276:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:284:0x08f2  */
    /* JADX WARN: Code duplicated, block: B:287:0x0917 A[LOOP:2: B:285:0x0911->B:287:0x0917, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:293:0x094a  */
    /* JADX WARN: Code duplicated, block: B:298:0x0971  */
    /* JADX WARN: Code duplicated, block: B:302:0x097b  */
    /* JADX WARN: Code duplicated, block: B:305:0x0985  */
    /* JADX WARN: Code duplicated, block: B:313:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:362:0x0b72  */
    /* JADX WARN: Code duplicated, block: B:367:0x0b90  */
    /* JADX WARN: Code duplicated, block: B:372:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:377:0x0bd5  */
    /* JADX WARN: Code duplicated, block: B:409:0x0c8b  */
    /* JADX WARN: Code duplicated, block: B:414:0x0ca8  */
    /* JADX WARN: Code duplicated, block: B:433:0x04d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x0979 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x098f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:? A[LOOP:1: B:303:0x097f->B:436:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x08d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x08bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0338  */
    /* JADX WARN: Code duplicated, block: B:95:0x0341  */
    /* JADX WARN: Code duplicated, block: B:96:0x0345  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Double dValueOf;
        String str;
        List listC;
        ArrayList arrayList;
        Collator collator;
        LinkedHashMap linkedHashMap;
        Iterator<T> it;
        Object obj3;
        Iterator it3;
        boolean z14;
        i53.f fVar;
        i53.f fVarA;
        p3.m.a aVar;
        h5.g.a.f fVar2;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        j92.e eVar;
        Integer num;
        Double dValueOf2;
        boolean zB;
        Object objQ;
        boolean zB2;
        Object objQ2;
        String strE;
        String strE2;
        int i14 = this.f125105a;
        int i15 = 5;
        p3.m.a aVar2 = p3.m.f135153a;
        Object obj4 = this.f125109e;
        Object obj5 = this.f125108d;
        Object obj6 = this.f125106b;
        Object obj7 = this.f125107c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                h.c((String) obj7, (e23.l) obj6, (m4.b0) obj5, (h4.r) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                nc1.d.a((i53.c) obj7, (DateTime) obj5, (DateTime) obj4, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                nc1.e.a((dc1.f) obj7, (DateTime) obj5, (DateTime) obj4, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                nf1.g.a((h4.r) obj4, (n82.n) obj7, (o82.a) obj6, (o82.g) obj5, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                no0.a.a((Integer) obj6, (Integer) obj5, (String) obj7, (String) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                np.g.a((np.c) obj7, (sp.a) obj6, (op.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 6:
                String str2 = (String) obj7;
                e23.a aVar3 = (e23.a) obj6;
                i53.f fVar3 = (i53.f) obj5;
                Context context = (Context) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = str2;
                    boolean zB3 = mVar.B(aVar3);
                    Object objQ3 = mVar.q();
                    if (zB3) {
                        objQ3 = new ll0.a(aVar3, 27);
                        mVar.K(objQ3);
                    } else {
                        aVar2.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new ll0.a(aVar3, 27);
                            mVar.K(objQ3);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ3;
                    boolean zR = mVar.r(context);
                    Object objQ4 = mVar.q();
                    if (zR) {
                        objQ4 = new a51.m(context, 25);
                        mVar.K(objQ4);
                    } else {
                        aVar2.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new a51.m(context, 25);
                            mVar.K(objQ4);
                        }
                    }
                    z02.f.d(str3, null, null, aVar4, fVar3, null, (e23.l) objQ4, mVar, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 7:
                i53.f fVar4 = (i53.f) obj7;
                op.a aVar5 = (op.a) obj6;
                n82.f fVar5 = (n82.f) obj5;
                np.c cVar = (np.c) obj4;
                o82.g gVar = (o82.g) obj;
                b63.o oVar = (b63.o) obj2;
                gVar.getClass();
                oVar.getClass();
                o82.g gVar2 = o82.g.f130857j;
                if (gVar == gVar2 && !fVar4.contains(gVar2)) {
                    aVar5.d(b63.b.b(oVar.c()), oVar.f16206a.getYear());
                } else if (gVar == o82.g.f130854g) {
                    fVar5.e(o82.g.f130851d, oVar);
                } else {
                    o82.g gVarA = fVar5.f124961b.a();
                    fVar5.e(gVar, oVar);
                    if (gVarA == gVar) {
                        cVar.f126784b.setValue(new np.i(gVar, oVar));
                    }
                }
                return Unit.INSTANCE;
            case 8:
                nw0.j0 j0Var = (nw0.j0) obj7;
                nw0.r rVar = (nw0.r) obj6;
                e23.a aVar6 = (e23.a) obj5;
                p1 p1Var = (p1) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String strQ = y.Q(mVar2, p005kotlin.jvm.internal.s.g(j0Var, nw0.j0.a.f128055a) ? R.string.lbl_edit_behaviors : R.string.lbl_behaviors);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String str4 = j0Var instanceof nw0.j0.b ? ((nw0.j0.b) j0Var).f128056a : null;
                    boolean zR2 = mVar2.r(rVar);
                    Object objQ5 = mVar2.q();
                    if (zR2) {
                        objQ5 = new nw0.m(rVar, 4);
                        mVar2.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new nw0.m(rVar, 4);
                            mVar2.K(objQ5);
                        }
                    }
                    e23.l lVar = (e23.l) objQ5;
                    boolean zR3 = mVar2.r(rVar);
                    Object objQ6 = mVar2.q();
                    if (zR3) {
                        objQ6 = new nw0.k(rVar, i15);
                        mVar2.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new nw0.k(rVar, i15);
                            mVar2.K(objQ6);
                        }
                    }
                    e23.a aVar7 = (e23.a) objQ6;
                    boolean zR4 = mVar2.r(rVar);
                    Object objQ7 = mVar2.q();
                    if (zR4) {
                        objQ7 = new nw0.k(rVar, 6);
                        mVar2.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new nw0.k(rVar, 6);
                            mVar2.K(objQ7);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ7;
                    boolean zB4 = mVar2.B(j0Var) | mVar2.r(rVar) | mVar2.B(aVar6);
                    Object objQ8 = mVar2.q();
                    if (zB4) {
                        objQ8 = new nw0.p(j0Var, 0, rVar, aVar6);
                        mVar2.K(objQ8);
                    } else {
                        aVar2.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new nw0.p(j0Var, 0, rVar, aVar6);
                            mVar2.K(objQ8);
                        }
                    }
                    nw0.q.h(strQ, zBooleanValue, str4, lVar, aVar7, aVar8, (e23.a) objQ8, mVar2, 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 9:
                w01.c cVar2 = (w01.c) obj7;
                NutritionHydrationActivity nutritionHydrationActivity = (NutritionHydrationActivity) obj6;
                a01.a aVar9 = (a01.a) obj;
                Double d14 = (Double) obj2;
                d14.getClass();
                NutritionHydrationActivity.a aVar10 = NutritionHydrationActivity.f33067b;
                aVar9.getClass();
                ((p1) obj5).setValue(Boolean.FALSE);
                ((p1) obj4).setValue(aVar9);
                w01.b bVar = cVar2.f181028a;
                if (bVar != null) {
                    dValueOf = Double.valueOf(bVar.getEffortMaxDurationInHours());
                } else {
                    Float f14 = cVar2.f181033f;
                    dValueOf = f14 != null ? Double.valueOf(f14.floatValue()) : null;
                }
                int i16 = NutritionHydrationActivity.c.f33073b[aVar9.ordinal()];
                if (i16 == 1) {
                    o50.h.x4(nutritionHydrationActivity.ga(), cVar2.f181031d, cVar2.f181035h, dValueOf);
                } else if (i16 == 2) {
                    Long l14 = cVar2.f181032e;
                    if (l14 != null) {
                        o50.h hVarGa = nutritionHydrationActivity.ga();
                        long jLongValue = l14.longValue();
                        hVarGa.getClass();
                        ge1.b.T(v1.a(hVarGa), null, null, new o50.e(hVarGa, jLongValue, null), 3);
                    }
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    o50.h.x4(nutritionHydrationActivity.ga(), cVar2.f181031d, d14, dValueOf);
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.O((m52.k) obj7, (m52.d) obj5, (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.b) obj4, (e23.l) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                oa0.i.a((oa0.e.a) obj7, (oa0.e.a) obj5, (j90.o) obj4, (e23.l) obj6, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 12:
                x0 x0Var = (x0) obj7;
                t.c cVar3 = (t.c) obj6;
                i53.d<u, i53.c<uk0.a>> dVar = cVar3.f132564f;
                p1 p1Var2 = (p1) obj5;
                Context context2 = (Context) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    boolean zK = mVar3.k(x0Var.ordinal());
                    Object objQ9 = mVar3.q();
                    if (zK) {
                        w13.c cVar4 = u.f25612w;
                        x0 x0VarD = z0.d(x0Var, x0Var);
                        str = x0Var.f4358a;
                        if (z0.p(str)) {
                            listC = w.c(u.f25608q);
                        } else {
                            listC = w.c(u.f25608q);
                        }
                        arrayList = new ArrayList();
                        for (Object obj8 : cVar4) {
                            if (!listC.contains((u) obj8)) {
                                arrayList.add(obj8);
                            }
                        }
                        objQ9 = p13.h0.C0(listC, arrayList);
                        mVar3.K(objQ9);
                    } else {
                        aVar2.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            w13.c cVar5 = u.f25612w;
                            x0 x0VarD2 = z0.d(x0Var, x0Var);
                            str = x0Var.f4358a;
                            if (z0.p(str) || z0.s(str) || z0.y(str) || z0.E(str) || z0.S(str) || z0.Q(str) || z0.J(str) || z0.L(str) || z0.b(x0.J2, str) || z0.c0(str)) {
                                listC = w.c(u.f25608q);
                            } else if (z0.U(str)) {
                                listC = w.c(u.f25605n);
                            } else if (z0.X(str) || z0.d0(str)) {
                                listC = w.c(u.f25606o);
                            } else if (z0.b0(str) || z0.b(x0.G2, str)) {
                                listC = x.k(u.f25607p, u.f25608q);
                            } else if (z0.b(x0.I2, str)) {
                                listC = x.k(u.f25601j, u.f25608q);
                            } else if (z0.b(x0.W1, str) || z0.v(str) || z0.b(x0.f4267a2, str)) {
                                listC = x.k(u.f25601j, u.f25600i);
                            } else if (z0.b(x0.X1, str) || z0.b(x0.f4270b2, str)) {
                                listC = x.k(u.f25602k, u.f25600i);
                            } else if (x0VarD2 == x0.f4308n) {
                                listC = w.c(u.f25597f);
                            } else if (x0VarD2 == x0.f4312o) {
                                listC = x.k(u.f25598g, u.f25599h);
                            } else if (x0VarD2 == x0.f4316p) {
                                listC = w.c(u.f25597f);
                            } else if (x0VarD2 == x0.f4324r) {
                                listC = p13.j0.f134944a;
                            } else if (x0VarD2 == x0.f4331t) {
                                listC = x.k(u.f25597f, u.f25600i);
                            } else if (x0VarD2 == x0.f4320q) {
                                listC = x.k(u.f25600i, u.f25597f);
                            } else if (x0VarD2 == x0.f4277d3) {
                                listC = w.c(u.f25597f);
                            } else if (x0VarD2 == x0.f4323q3) {
                                listC = w.c(u.f25603l);
                            } else {
                                listC = x0VarD2 == x0.f4268a3 ? w.c(u.f25609r) : p13.j0.f134944a;
                            }
                            arrayList = new ArrayList();
                            while (r3.hasNext()) {
                                if (!listC.contains((u) obj8)) {
                                    arrayList.add(obj8);
                                }
                            }
                            objQ9 = p13.h0.C0(listC, arrayList);
                            mVar3.K(objQ9);
                        }
                    }
                    List list = (List) objQ9;
                    i53.c<t.b> cVar6 = cVar3.f132565g;
                    boolean zB5 = mVar3.B(dVar);
                    Object objQ10 = mVar3.q();
                    if (zB5) {
                        obj3 = objQ10;
                        collator = Collator.getInstance();
                        collator.setStrength(1);
                        linkedHashMap = new LinkedHashMap(t0.a(dVar.size()));
                        it = dVar.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            linkedHashMap.put(entry.getKey(), p13.h0.N0((Iterable) entry.getValue(), new ok0.s.e(collator, context2)));
                        }
                        mVar3.K(linkedHashMap);
                        obj3 = linkedHashMap;
                    } else {
                        aVar2.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            obj3 = objQ10;
                            collator = Collator.getInstance();
                            collator.setStrength(1);
                            linkedHashMap = new LinkedHashMap(t0.a(dVar.size()));
                            it = dVar.entrySet().iterator();
                            while (it.hasNext()) {
                                Map.Entry entry2 = (Map.Entry) it.next();
                                linkedHashMap.put(entry2.getKey(), p13.h0.N0((Iterable) entry2.getValue(), new ok0.s.e(collator, context2)));
                            }
                            mVar3.K(linkedHashMap);
                            obj3 = linkedHashMap;
                        }
                    }
                    obj3 = objQ10;
                    Map map = (Map) obj3;
                    boolean zB6 = mVar3.B(cVar6);
                    Object objQ11 = mVar3.q();
                    if (zB6) {
                        Collator collator2 = Collator.getInstance();
                        collator2.setStrength(1);
                        objQ11 = p13.h0.N0(cVar6, new ok0.s.f(collator2));
                        mVar3.K(objQ11);
                    } else {
                        aVar2.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            Collator collator3 = Collator.getInstance();
                            collator3.setStrength(1);
                            objQ11 = p13.h0.N0(cVar6, new ok0.s.f(collator3));
                            mVar3.K(objQ11);
                        }
                    }
                    List list2 = (List) objQ11;
                    boolean zB7 = mVar3.B(list2);
                    Object objQ12 = mVar3.q();
                    if (zB7) {
                        if (list2 == null) {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z14 = false;
                                } else if (((t.b) it3.next()).f132558d) {
                                    z14 = true;
                                }
                            }
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z14 = false;
                                } else if (((t.b) it3.next()).f132558d) {
                                    z14 = true;
                                }
                            }
                        }
                        objQ12 = Boolean.valueOf(z14);
                        mVar3.K(objQ12);
                    } else {
                        aVar2.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            if (list2 == null && list2.isEmpty()) {
                                z14 = false;
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        z14 = false;
                                    } else if (((t.b) it3.next()).f132558d) {
                                        z14 = true;
                                    }
                                }
                            }
                            objQ12 = Boolean.valueOf(z14);
                            mVar3.K(objQ12);
                        }
                    }
                    boolean zBooleanValue2 = ((Boolean) objQ12).booleanValue();
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    int i17 = k3.f22728a;
                    c3 c3VarB = q3.b(mVar3);
                    p3.f22815b.getClass();
                    c2.x1 x1VarD = n3.d(c3VarB, p3.f22826m | p3.f22823j);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    l1 l1VarC = n3.c(new c2.a(x1VarD, n3.b(0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7)), mVar3);
                    boolean zR5 = mVar3.r(list2) | mVar3.B(p1Var2) | mVar3.h(zBooleanValue2) | mVar3.r(list) | mVar3.r(map);
                    Object objQ13 = mVar3.q();
                    if (zR5) {
                        objQ13 = new cq.m(list2, zBooleanValue2, list, map, p1Var2, 4);
                        mVar3.K(objQ13);
                    } else {
                        aVar2.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new cq.m(list2, zBooleanValue2, list, map, p1Var2, 4);
                            mVar3.K(objQ13);
                        }
                    }
                    e2.c.b(rVarD, null, l1VarC, null, null, null, false, null, (e23.l) objQ13, mVar3, 6, 506);
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 13:
                e23.a aVar11 = (e23.a) obj7;
                ok0.n nVar = (ok0.n) obj6;
                p1 p1Var3 = (p1) obj5;
                p1 p1Var4 = (p1) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    String strQ2 = y.Q(mVar4, R.string.edit_gear_title);
                    if (((t.c) p1Var4.getF182175a()).f132564f.isEmpty()) {
                        mVar4.C(-2031382454);
                        mVar4.f();
                        fVar = null;
                    } else {
                        mVar4.C(-2031328328);
                        i53.f fVarA2 = i53.a.a(new l72.i3("SAVE", y.Q(mVar4, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar4.f();
                        fVar = fVarA2;
                    }
                    boolean zR6 = mVar4.r(nVar) | mVar4.B(p1Var3);
                    Object objQ14 = mVar4.q();
                    if (zR6) {
                        objQ14 = new o50.a(i15, nVar, p1Var3);
                        mVar4.K(objQ14);
                    } else {
                        aVar2.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new o50.a(i15, nVar, p1Var3);
                            mVar4.K(objQ14);
                        }
                    }
                    z02.f.e(strQ2, null, aVar11, fVar, (e23.l) objQ14, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                oo0.b.a((gs1.d.b) obj7, (DateTime) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(9));
                return Unit.INSTANCE;
            case 15:
                e23.a aVar12 = (e23.a) obj7;
                p1 p1Var5 = (p1) obj6;
                Activity activity = (Activity) obj5;
                p1 p1Var6 = (p1) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ3 = y.Q(mVar5, R.string.title_intensity_minutes);
                    boolean zB8 = mVar5.B(aVar12);
                    Object objQ15 = mVar5.q();
                    if (zB8) {
                        objQ15 = new nw0.x(aVar12, 27);
                        mVar5.K(objQ15);
                    } else {
                        aVar2.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new nw0.x(aVar12, 27);
                            mVar5.K(objQ15);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ15;
                    if (((or0.q) p1Var5.getF182175a()).f133398b) {
                        mVar5.C(-208630868);
                        fVarA = i53.a.a(new l72.i3("EDIT_GOAL", y.Q(mVar5, R.string.steps_step_goal_title), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new l72.i3("HELP", y.Q(mVar5, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar5.f();
                    } else {
                        mVar5.C(-208247646);
                        fVarA = i53.a.a(new l72.i3("HELP", y.Q(mVar5, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                        mVar5.f();
                    }
                    i53.f fVar6 = fVarA;
                    boolean zB9 = mVar5.B(p1Var5) | mVar5.r(activity);
                    Object objQ16 = mVar5.q();
                    if (zB9) {
                        objQ16 = new ls0.h(activity, 24, p1Var5, p1Var6);
                        mVar5.K(objQ16);
                    } else {
                        aVar2.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new ls0.h(activity, 24, p1Var5, p1Var6);
                            mVar5.K(objQ16);
                        }
                    }
                    z02.f.d(strQ3, null, null, aVar13, null, fVar6, (e23.l) objQ16, mVar5, 2097152, 54);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 16:
                q21.a aVar14 = (q21.a) obj7;
                e23.a aVar15 = (e23.a) obj6;
                v21.e eVar2 = (v21.e) obj5;
                e23.p pVar = (e23.p) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r.a aVar16 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.c(aVar16, 1.0f), tn.k.a(d92.b.f58623a, mVar6), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar17 = h4.d.a.f81536n;
                    z zVarA2 = c2.y.a(kVar, aVar17, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    h4.r rVarC2 = h4.k.c(rVarE, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar18);
                    } else {
                        mVar6.c();
                    }
                    h5.g.a.e eVar3 = h5.g.a.f81810g;
                    b4.c(eVar3, zVarA2, mVar6);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT()) {
                        aVar = aVar2;
                    } else {
                        aVar = aVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC2, mVar6);
                        h4.r rVarB = a2.b(b0.f22601a.a(aVar16, 1.0f, true), a2.a(mVar6), true);
                        zVarA = c2.y.a(kVar, aVar17, mVar6, 0);
                        iHashCode = Long.hashCode(mVar6.getU());
                        i2VarX = mVar6.x();
                        rVarC = h4.k.c(rVarB, mVar6);
                        if (mVar6.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar6.z();
                        if (mVar6.getT()) {
                            mVar6.M(aVar18);
                        } else {
                            mVar6.c();
                        }
                        b4.c(eVar3, zVarA, mVar6);
                        b4.c(c1623g, i2VarX, mVar6);
                        if (mVar6.getT() || !p005kotlin.jvm.internal.s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                        }
                        b4.c(fVar2, rVarC, mVar6);
                        int i18 = 3;
                        p2 p2Var = p2.f111205a;
                        d92.b.f58625c.getClass();
                        eVar = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(aVar16, 0.0f, eVar.f97920e, 1);
                        String strQ4 = y.Q(mVar6, R.string.lbl_daily_calories_goal);
                        num = aVar14.f142202a;
                        if (num != null) {
                            dValueOf2 = Double.valueOf(num.intValue());
                        } else {
                            dValueOf2 = null;
                        }
                        p2Var.h(strQ4, eVar2.p(dValueOf2, Integer.valueOf(aVar14.f142208g), y.Q(mVar6, R.string.lbl_calories)), null, rVarA, null, false, false, null, z3.f.c(1551466227, new ov1.q(aVar14, i18), mVar6), null, null, mVar6, 100663296, 0, 1780);
                        if (aVar14.f142209h) {
                            mVar6.C(-905609406);
                            mVar6.f();
                        } else {
                            mVar6.C(-905986676);
                            h4.r rVarC3 = c2.l.C(c2.l.A(aVar16, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                            String strQ5 = y.Q(mVar6, R.string.msg_calories_percentage_error);
                            d92.b.f58624b.getClass();
                            mh.c(strQ5, rVarC3, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar6), mVar6, 0, 0, 131068);
                            mVar6.f();
                        }
                        mVar6.C(-1414683777);
                        for (o21.d dVar2 : aVar14.f142203b) {
                            h4.r.a aVar19 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC4 = c2.l.C(aVar19, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                            b11.g.a aVar20 = b11.g.f14285c;
                            String str5 = dVar2.f128659b;
                            int i19 = dVar2.f128660c;
                            aVar20.getClass();
                            String strA = b11.g.a.a(str5, mVar6);
                            strA.getClass();
                            String strA2 = eVar2.f175325b.a(R.string.string_space_bullet_string_pattern, strA, eVar2.g(Double.valueOf(i19)));
                            String strY = v21.e.y(eVar2, dVar2.f128661d, dVar2.f128662e, dVar2.f128663f, dVar2.f128664g, 48);
                            String strY2 = v21.e.y(eVar2, dVar2.f128661d, dVar2.f128662e, dVar2.f128663f, dVar2.f128664g, 16);
                            float f15 = i19;
                            zB2 = mVar6.B(pVar) | mVar6.B(dVar2);
                            objQ2 = mVar6.q();
                            if (zB2) {
                                objQ2 = new o50.a(16, pVar, dVar2);
                                mVar6.K(objQ2);
                            } else {
                                aVar.getClass();
                                if (objQ2 == p3.m.a.f135155b) {
                                    objQ2 = new o50.a(16, pVar, dVar2);
                                    mVar6.K(objQ2);
                                }
                            }
                            p21.d.b(rVarC4, strA2, strY, f15, (e23.l) objQ2, strY2, mVar6, 0);
                        }
                        mVar6.f();
                        mVar6.y();
                        f0 f0Var = f0.f110999a;
                        String strQ6 = y.Q(mVar6, R.string.lbl_reset);
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF, j92.b.f97899b.f97920e);
                        boolean z15 = aVar14.f142207f;
                        zB = mVar6.B(aVar15);
                        objQ = mVar6.q();
                        if (zB) {
                            objQ = new ov1.o(aVar15, 8);
                            mVar6.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new ov1.o(aVar15, 8);
                                mVar6.K(objQ);
                            }
                        }
                        f0Var.i(strQ6, rVarY, z15, (e23.a) objQ, mVar6, 0, 0);
                        mVar6.y();
                        x1 x1Var8 = p3.n.f135158a;
                    }
                    v.h.z(iHashCode2, mVar6, iHashCode2, bVar2);
                    fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC2, mVar6);
                    h4.r rVarB2 = a2.b(b0.f22601a.a(aVar16, 1.0f, true), a2.a(mVar6), true);
                    zVarA = c2.y.a(kVar, aVar17, mVar6, 0);
                    iHashCode = Long.hashCode(mVar6.getU());
                    i2VarX = mVar6.x();
                    rVarC = h4.k.c(rVarB2, mVar6);
                    if (mVar6.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar18);
                    } else {
                        mVar6.c();
                    }
                    b4.c(eVar3, zVarA, mVar6);
                    b4.c(c1623g, i2VarX, mVar6);
                    if (mVar6.getT()) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                    }
                    b4.c(fVar2, rVarC, mVar6);
                    int i110 = 3;
                    p2 p2Var2 = p2.f111205a;
                    d92.b.f58625c.getClass();
                    eVar = j92.b.f97899b;
                    h4.r rVarA2 = c2.l.A(aVar16, 0.0f, eVar.f97920e, 1);
                    String strQ7 = y.Q(mVar6, R.string.lbl_daily_calories_goal);
                    num = aVar14.f142202a;
                    if (num != null) {
                        dValueOf2 = Double.valueOf(num.intValue());
                    } else {
                        dValueOf2 = null;
                    }
                    p2Var2.h(strQ7, eVar2.p(dValueOf2, Integer.valueOf(aVar14.f142208g), y.Q(mVar6, R.string.lbl_calories)), null, rVarA2, null, false, false, null, z3.f.c(1551466227, new ov1.q(aVar14, i110), mVar6), null, null, mVar6, 100663296, 0, 1780);
                    if (aVar14.f142209h) {
                        mVar6.C(-905986676);
                        h4.r rVarC5 = c2.l.C(c2.l.A(aVar16, eVar.f97920e, 0.0f, 2), 0.0f, 0.0f, 0.0f, eVar.f97920e, 7);
                        String strQ8 = y.Q(mVar6, R.string.msg_calories_percentage_error);
                        d92.b.f58624b.getClass();
                        mh.c(strQ8, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar6), mVar6, 0, 0, 131068);
                        mVar6.f();
                    } else {
                        mVar6.C(-905609406);
                        mVar6.f();
                    }
                    mVar6.C(-1414683777);
                    while (r1.hasNext()) {
                        h4.r.a aVar110 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC6 = c2.l.C(aVar110, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                        b11.g.a aVar21 = b11.g.f14285c;
                        String str6 = dVar2.f128659b;
                        int i111 = dVar2.f128660c;
                        aVar21.getClass();
                        String strA3 = b11.g.a.a(str6, mVar6);
                        strA3.getClass();
                        String strA4 = eVar2.f175325b.a(R.string.string_space_bullet_string_pattern, strA3, eVar2.g(Double.valueOf(i111)));
                        String strY3 = v21.e.y(eVar2, dVar2.f128661d, dVar2.f128662e, dVar2.f128663f, dVar2.f128664g, 48);
                        String strY4 = v21.e.y(eVar2, dVar2.f128661d, dVar2.f128662e, dVar2.f128663f, dVar2.f128664g, 16);
                        float f16 = i111;
                        zB2 = mVar6.B(pVar) | mVar6.B(dVar2);
                        objQ2 = mVar6.q();
                        if (zB2) {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new o50.a(16, pVar, dVar2);
                                mVar6.K(objQ2);
                            }
                        } else {
                            objQ2 = new o50.a(16, pVar, dVar2);
                            mVar6.K(objQ2);
                        }
                        p21.d.b(rVarC6, strA4, strY3, f16, (e23.l) objQ2, strY4, mVar6, 0);
                    }
                    mVar6.f();
                    mVar6.y();
                    f0 f0Var2 = f0.f110999a;
                    String strQ9 = y.Q(mVar6, R.string.lbl_reset);
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY2 = c2.l.y(rVarF2, j92.b.f97899b.f97920e);
                    boolean z16 = aVar14.f142207f;
                    zB = mVar6.B(aVar15);
                    objQ = mVar6.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new ov1.o(aVar15, 8);
                            mVar6.K(objQ);
                        }
                    } else {
                        objQ = new ov1.o(aVar15, 8);
                        mVar6.K(objQ);
                    }
                    f0Var2.i(strQ9, rVarY2, z16, (e23.a) objQ, mVar6, 0, 0);
                    mVar6.y();
                    x1 x1Var9 = p3.n.f135158a;
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 17:
                q21.d dVar3 = (q21.d) obj7;
                v21.e eVar4 = (v21.e) obj5;
                e23.l lVar2 = (e23.l) obj6;
                e23.l lVar3 = (e23.l) obj4;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar22 = h4.r.S;
                    h4.r rVarD2 = x2.d(aVar22, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar2, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    h4.r rVarC7 = h4.k.c(rVarD2, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar23 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar23);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC7, mVar7);
                    b0 b0Var = b0.f22601a;
                    boolean z17 = dVar3.f142224a;
                    Integer num2 = dVar3.f142230g;
                    String strQ10 = y.Q(mVar7, R.string.lbl_start_time);
                    b63.v vVar = dVar3.f142226c;
                    if (vVar != null) {
                        pi0.e eVar5 = eVar4.f175326c;
                        qi0.f fVar7 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                        eVar5.getClass();
                        fVar7.getClass();
                        LocalTime localTime = vVar.f16219a;
                        strE = eVar5.e(new org.joda.time.LocalTime(localTime.getHour(), localTime.getMinute(), localTime.getSecond()), fVar7);
                    } else {
                        strE = eVar4.f175327d;
                    }
                    d0.a(z17, strQ10, strE, false, null, dVar3.f142226c, y.Q(mVar7, R.string.lbl_start_time), null, null, null, null, lVar2, null, null, mVar7, 0, 0, 14232);
                    boolean z18 = dVar3.f142224a;
                    String strQ11 = y.Q(mVar7, R.string.pregnancy_end_time);
                    b63.v vVar2 = dVar3.f142227d;
                    if (vVar2 != null) {
                        pi0.e eVar6 = eVar4.f175326c;
                        qi0.f fVar8 = qi0.f.RELATIVE_24H_AM_PM_TIME;
                        eVar6.getClass();
                        fVar8.getClass();
                        LocalTime localTime2 = vVar2.f16219a;
                        strE2 = eVar6.e(new org.joda.time.LocalTime(localTime2.getHour(), localTime2.getMinute(), localTime2.getSecond()), fVar8);
                    } else {
                        strE2 = eVar4.f175327d;
                    }
                    d0.a(z18, strQ11, strE2, false, null, dVar3.f142227d, y.Q(mVar7, R.string.pregnancy_end_time), dVar3.f142228e, dVar3.f142229f, null, null, lVar3, null, null, mVar7, 0, 0, 13848);
                    if (num2 != null) {
                        mVar7.C(1461029681);
                        h4.r rVarF3 = x2.f(aVar22, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar7 = j92.b.f97899b;
                        h4.r rVarZ = c2.l.z(rVarF3, eVar7.f97920e, eVar7.f97917b);
                        int iIntValue8 = num2.intValue();
                        Object[] array = dVar3.f142231h.toArray(new Object[0]);
                        String strP = y.P(iIntValue8, Arrays.copyOf(array, array.length), mVar7);
                        d6.h.f57752b.getClass();
                        int i24 = d6.h.f57757g;
                        d92.b.f58624b.getClass();
                        mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, d6.h.a(i24), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar7), mVar7, 0, 0, 130044);
                        mVar7.f();
                    } else {
                        mVar7.C(1461470253);
                        mVar7.f();
                    }
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 18:
                return a(obj, obj2);
            case 19:
                return b(obj, obj2);
            case 20:
                return c(obj, obj2);
            case 21:
                return d(obj, obj2);
            case 22:
                return e(obj, obj2);
            case 23:
                return f(obj, obj2);
            case 24:
                return g(obj, obj2);
            case 25:
                return h(obj, obj2);
            case 26:
                return i(obj, obj2);
            case 27:
                return j(obj, obj2);
            case 28:
                return k(obj, obj2);
            default:
                jx.a aVar24 = (jx.a) obj7;
                gt.a aVar25 = (gt.a) obj6;
                ix.j jVar = (ix.j) obj5;
                Interval interval = (Interval) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    px.a.a(null, aVar24, aVar25, jVar, false, interval, mVar8, 25088, 1);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, e23.l lVar, Object obj3, int i14, int i15) {
        this.f125105a = i15;
        this.f125107c = obj;
        this.f125108d = obj2;
        this.f125106b = lVar;
        this.f125109e = obj3;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, e23.l lVar, int i14, int i15) {
        this.f125105a = i15;
        this.f125107c = obj;
        this.f125108d = obj2;
        this.f125109e = obj3;
        this.f125106b = lVar;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f125105a = i14;
        this.f125107c = obj;
        this.f125106b = obj2;
        this.f125108d = obj3;
        this.f125109e = obj4;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f125105a = i15;
        this.f125107c = obj;
        this.f125106b = obj2;
        this.f125108d = obj3;
        this.f125109e = obj4;
    }

    public /* synthetic */ a(String str, int i14, String str2, Integer num, Integer num2) {
        this.f125105a = 4;
        this.f125106b = num;
        this.f125108d = num2;
        this.f125107c = str;
        this.f125109e = str2;
    }

    public /* synthetic */ a(h4.r rVar, n82.n nVar, o82.a aVar, o82.g gVar, int i14) {
        this.f125105a = 3;
        this.f125109e = rVar;
        this.f125107c = nVar;
        this.f125106b = aVar;
        this.f125108d = gVar;
    }
}
