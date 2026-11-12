package oo0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import c.w;
import c2.b0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceCardView;
import com.garmin.android.apps.connectmobile.device.companion.presentation.CompanionDeviceLinkActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity.a;
import com.garmin.android.apps.connectmobile.settings.usersettings.UpdateBirthdateActivity.b;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.p;
import gl1.y;
import gs1.t;
import h5.e0;
import h82.r;
import i3.eh;
import i3.i7;
import i3.sg;
import i3.wg;
import j20.x;
import kotlin.m3;
import kotlin.t1;
import l72.f0;
import l72.p2;
import m4.q;
import o4.d0;
import o4.m1;
import o72.i3;
import or0.j;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import ov1.u;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p006l2.a2;
import p006l2.z1;
import p3.b4;
import p3.c2;
import p3.c3;
import p3.h1;
import p3.i;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.q1;
import p3.x1;
import p3.x3;
import p3.z2;
import p40.o;
import q21.l;
import r1.c0;
import r1.u0;
import r1.v1;
import r1.w1;
import s5.x0;
import tn.k;
import v62.j9;
import v62.l2;
import x5.v;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133124c;

    public /* synthetic */ f(p1 p1Var, q40.b bVar) {
        this.f133122a = 11;
        this.f133124c = p1Var;
        this.f133123b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0060  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    private final Object a(Object obj, Object obj2) {
        r rVar = (r) this.f133123b;
        final q42.p pVar = (q42.p) this.f133124c;
        m mVar = (m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = q42.p.f142668f;
        final int i15 = 0;
        final int i16 = 1;
        final int i17 = 2;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = n.f135158a;
            boolean zR = mVar.r(pVar);
            Object objQ = mVar.q();
            m.a aVar = m.f135153a;
            if (zR) {
                objQ = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i18 = i15;
                        p pVar2 = pVar;
                        switch (i18) {
                            case 0:
                                int i19 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i24 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i25 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i26 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i27 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i28 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i15;
                            p pVar2 = pVar;
                            switch (i18) {
                                case 0:
                                    int i19 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i24 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i25 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i26 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i27 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i28 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ);
                }
            }
            rVar.B(R.string.lbl_body_weight, null, false, (e23.a) objQ, mVar, 0, 6);
            boolean zR2 = mVar.r(pVar);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i18 = i16;
                        p pVar2 = pVar;
                        switch (i18) {
                            case 0:
                                int i19 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i24 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i25 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i26 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i27 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i28 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == m.a.f135155b) {
                    objQ2 = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i16;
                            p pVar2 = pVar;
                            switch (i18) {
                                case 0:
                                    int i19 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i24 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i25 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i26 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i27 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i28 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ2);
                }
            }
            rVar.B(R.string.lbl_weight_characteristic_bmi, null, false, (e23.a) objQ2, mVar, 0, 6);
            boolean zR3 = mVar.r(pVar);
            Object objQ3 = mVar.q();
            if (zR3) {
                objQ3 = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i18 = i17;
                        p pVar2 = pVar;
                        switch (i18) {
                            case 0:
                                int i19 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i24 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i25 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i26 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i27 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i28 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == m.a.f135155b) {
                    objQ3 = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i17;
                            p pVar2 = pVar;
                            switch (i18) {
                                case 0:
                                    int i19 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i24 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i25 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i26 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i27 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i28 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ3);
                }
            }
            rVar.B(R.string.title_percent_body_fat, null, false, (e23.a) objQ3, mVar, 0, 6);
            boolean zR4 = mVar.r(pVar);
            Object objQ4 = mVar.q();
            if (zR4) {
                final int i18 = 3;
                objQ4 = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i19 = i18;
                        p pVar2 = pVar;
                        switch (i19) {
                            case 0:
                                int i110 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i24 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i25 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i26 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i27 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i28 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ4);
            } else {
                aVar.getClass();
                if (objQ4 == m.a.f135155b) {
                    final int i19 = 3;
                    objQ4 = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i19;
                            p pVar2 = pVar;
                            switch (i110) {
                                case 0:
                                    int i111 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i24 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i25 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i26 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i27 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i28 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ4);
                }
            }
            rVar.B(R.string.title_percent_body_water, null, false, (e23.a) objQ4, mVar, 0, 6);
            boolean zR5 = mVar.r(pVar);
            Object objQ5 = mVar.q();
            if (zR5) {
                final int i24 = 4;
                objQ5 = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i24;
                        p pVar2 = pVar;
                        switch (i110) {
                            case 0:
                                int i111 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i25 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i26 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i27 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i28 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i29 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ5);
            } else {
                aVar.getClass();
                if (objQ5 == m.a.f135155b) {
                    final int i25 = 4;
                    objQ5 = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i25;
                            p pVar2 = pVar;
                            switch (i110) {
                                case 0:
                                    int i111 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i26 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i27 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i28 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i29 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i210 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ5);
                }
            }
            rVar.B(R.string.lbl_skeletal_muscle_mass, null, false, (e23.a) objQ5, mVar, 0, 6);
            boolean zR6 = mVar.r(pVar);
            Object objQ6 = mVar.q();
            if (zR6) {
                final int i26 = 5;
                objQ6 = new e23.a() { // from class: q42.o
                    @Override // e23.a
                    public final Object invoke() {
                        int i110 = i26;
                        p pVar2 = pVar;
                        switch (i110) {
                            case 0:
                                int i111 = p.f142668f;
                                pVar2.e("WEIGHT_ACTION");
                                break;
                            case 1:
                                int i27 = p.f142668f;
                                pVar2.e("BMI_ACTION");
                                break;
                            case 2:
                                int i28 = p.f142668f;
                                pVar2.e("PERCENT_BODY_FAT_ACTION");
                                break;
                            case 3:
                                int i29 = p.f142668f;
                                pVar2.e("PERCENT_BODY_WATER_ACTION");
                                break;
                            case 4:
                                int i210 = p.f142668f;
                                pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                break;
                            default:
                                int i211 = p.f142668f;
                                pVar2.e("BONE_MASS_ACTION");
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                mVar.K(objQ6);
            } else {
                aVar.getClass();
                if (objQ6 == m.a.f135155b) {
                    final int i27 = 5;
                    objQ6 = new e23.a() { // from class: q42.o
                        @Override // e23.a
                        public final Object invoke() {
                            int i110 = i27;
                            p pVar2 = pVar;
                            switch (i110) {
                                case 0:
                                    int i111 = p.f142668f;
                                    pVar2.e("WEIGHT_ACTION");
                                    break;
                                case 1:
                                    int i28 = p.f142668f;
                                    pVar2.e("BMI_ACTION");
                                    break;
                                case 2:
                                    int i29 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_FAT_ACTION");
                                    break;
                                case 3:
                                    int i210 = p.f142668f;
                                    pVar2.e("PERCENT_BODY_WATER_ACTION");
                                    break;
                                case 4:
                                    int i211 = p.f142668f;
                                    pVar2.e("SKELETAL_MUSCLE_MASS_ACTION");
                                    break;
                                default:
                                    int i212 = p.f142668f;
                                    pVar2.e("BONE_MASS_ACTION");
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    mVar.K(objQ6);
                }
            }
            rVar.B(R.string.lbl_weight_characteristic_bone_mass, null, false, (e23.a) objQ6, mVar, 0, 6);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:149:0x043c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0475  */
    /* JADX WARN: Code duplicated, block: B:160:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:16:0x009a  */
    /* JADX WARN: Code duplicated, block: B:175:0x04fa  */
    /* JADX WARN: Code duplicated, block: B:180:0x0526  */
    /* JADX WARN: Code duplicated, block: B:185:0x0552  */
    /* JADX WARN: Code duplicated, block: B:201:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:206:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:220:0x0627  */
    /* JADX WARN: Code duplicated, block: B:246:0x0748  */
    /* JADX WARN: Code duplicated, block: B:328:0x0a1b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0103  */
    /* JADX WARN: Code duplicated, block: B:349:0x0aba  */
    /* JADX WARN: Code duplicated, block: B:354:0x0ae9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gs1.d allDayHeartRateDTO;
        gs1.d.c payload;
        gs1.d allDayHeartRateDTO2;
        gs1.d.c payload2;
        Object obj3;
        Object obj4;
        int i14 = this.f133122a;
        Integer maxHeartRate = null;
        m.a aVar = m.f135153a;
        final int i15 = 2;
        Object obj5 = this.f133124c;
        Object obj6 = this.f133123b;
        final int i16 = 1;
        switch (i14) {
            case 0:
                t tVar = (t) obj6;
                p1 p1Var = (p1) obj5;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (((qo0.d) p1Var.getF182175a()).f145950d) {
                        mVar.C(-462206209);
                        Integer restingHeartRate = (tVar == null || (allDayHeartRateDTO2 = tVar.getAllDayHeartRateDTO()) == null || (payload2 = allDayHeartRateDTO2.getPayload()) == null) ? null : payload2.getRestingHeartRate();
                        if (tVar != null && (allDayHeartRateDTO = tVar.getAllDayHeartRateDTO()) != null && (payload = allDayHeartRateDTO.getPayload()) != null) {
                            maxHeartRate = payload.getMaxHeartRate();
                        }
                        no0.a.a(restingHeartRate, maxHeartRate, y.Q(mVar, R.string.lbl_resting_heart_rate), y.Q(mVar, R.string.lbl_heart_rate_high_short), mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(-461826614);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj6;
                final j jVar = (j) obj5;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                j.a aVar2 = j.f133348g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar2.r(jVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        final int i17 = false ? 1 : 0;
                        objQ = new e23.a() { // from class: or0.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i18 = i17;
                                j jVar2 = jVar;
                                switch (i18) {
                                    case 0:
                                        j.a aVar3 = j.f133348g;
                                        jVar2.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        j.a aVar4 = j.f133348g;
                                        jVar2.e("CALCULATING_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            final int i18 = false ? 1 : 0;
                            objQ = new e23.a() { // from class: or0.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i18;
                                    j jVar2 = jVar;
                                    switch (i19) {
                                        case 0:
                                            j.a aVar3 = j.f133348g;
                                            jVar2.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            j.a aVar4 = j.f133348g;
                                            jVar2.e("CALCULATING_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    rVar.B(R.string.intensity_minutes_tracking, null, false, (e23.a) objQ, mVar2, 0, 6);
                    boolean zR2 = mVar2.r(jVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: or0.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i19 = i16;
                                j jVar2 = jVar;
                                switch (i19) {
                                    case 0:
                                        j.a aVar3 = j.f133348g;
                                        jVar2.e("TRACKING_ACTION");
                                        break;
                                    default:
                                        j.a aVar4 = j.f133348g;
                                        jVar2.e("CALCULATING_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: or0.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i19 = i16;
                                    j jVar2 = jVar;
                                    switch (i19) {
                                        case 0:
                                            j.a aVar3 = j.f133348g;
                                            jVar2.e("TRACKING_ACTION");
                                            break;
                                        default:
                                            j.a aVar4 = j.f133348g;
                                            jVar2.e("CALCULATING_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    rVar.B(R.string.intensity_minutes_config_calc_label, null, false, (e23.a) objQ2, mVar2, 0, 6);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                ov1.j.a aVar3 = ov1.j.f134173d;
                ((ov1.j) obj6).v6((mv1.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                ov1.j.a aVar4 = ov1.j.f134173d;
                ((ov1.j) obj6).u6((pv1.b) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ov1.p.a aVar5 = ov1.p.f134204c;
                ((ov1.p) obj6).u6((e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ov1.y yVar = (ov1.y) obj6;
                n1 n1Var = (n1) obj5;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov1.y.a aVar6 = ov1.y.f134244b;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    f0 f0Var = f0.f110999a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    String strQ = y.Q(mVar3, R.string.lbl_next);
                    boolean z14 = n1Var.getIntValue() != -1;
                    boolean zR3 = mVar3.r(yVar);
                    Object objQ3 = mVar3.q();
                    if (zR3) {
                        objQ3 = new oe.j(23, yVar, n1Var);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new oe.j(23, yVar, n1Var);
                            mVar3.K(objQ3);
                        }
                    }
                    f0Var.d(384, 1, (e23.a) objQ3, rVarF, strQ, mVar3, null, z14);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 6:
                v21.e eVar = (v21.e) obj6;
                l lVar = (l) obj5;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarE = u1.n.e(x2.d(aVar7, 1.0f), k.a(d92.b.f58623a, mVar4), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode = Long.hashCode(mVar4.getU());
                    i2 i2VarX = mVar4.x();
                    h4.r rVarC = h4.k.c(rVarE, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar8);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar4);
                    b0 b0Var = b0.f22601a;
                    p2 p2Var = p2.f111205a;
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar7, 0.0f, j92.b.f97899b.f97920e, 1);
                    String strQ2 = y.Q(mVar4, R.string.lbl_daily_calories_goal);
                    Integer num = lVar.f142255a;
                    p2Var.h(strQ2, v21.e.d(eVar, num != null ? Double.valueOf(num.intValue()) : null, y.Q(mVar4, R.string.lbl_calories), 4), null, rVarA, null, false, false, null, null, null, null, mVar4, 0, 0, 2036);
                    mVar4.C(527779678);
                    for (o21.d dVar : lVar.f142256b) {
                        p2 p2Var2 = p2.f111205a;
                        b11.g.a aVar9 = b11.g.f14285c;
                        String str = dVar.f128659b;
                        aVar9.getClass();
                        String strA = b11.g.a.a(str, mVar4);
                        Integer num2 = dVar.f128661d;
                        p2Var2.h(strA, eVar.p(num2 != null ? Double.valueOf(num2.intValue()) : null, Integer.valueOf(dVar.f128660c), y.Q(mVar4, R.string.lbl_calories)), null, null, null, false, false, null, null, null, null, mVar4, 0, 0, 2044);
                    }
                    mVar4.f();
                    mVar4.y();
                    x1 x1Var5 = n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 7:
                h1 h1Var = (h1) obj6;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    h1Var.f135105a.invoke((P) obj5, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 8:
                z3.l lVar2 = (z3.l) obj6;
                s3.l lVar3 = (s3.l) obj5;
                int iIntValue6 = ((Integer) obj).intValue();
                if (obj2 instanceof i) {
                    lVar2.f202111f.b((i) obj2);
                } else if (!(obj2 instanceof c3)) {
                    if (obj2 instanceof z2) {
                        p0.r(lVar3, iIntValue6, obj2);
                        lVar2.e((z2) obj2);
                    } else if (obj2 instanceof p3.p2) {
                        p0.r(lVar3, iIntValue6, obj2);
                        ((p3.p2) obj2).d();
                    }
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                p40.n.a((q40.a) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                q qVar = (q) obj6;
                p1 p1Var2 = (p1) obj5;
                m mVar6 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    m3 m3Var = (m3) mVar6.A(t1.f91499q);
                    String str2 = (String) p1Var2.getF182175a();
                    if (str2 == null) {
                        str2 = "";
                    }
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarF2 = x2.f(u1.n.e(c2.l.C(aVar10, 0.0f, j92.b.f97899b.f97921f, 0.0f, 0.0f, 13), x.b(mVar6), m1.f128891a), 1.0f);
                    v.f188954b.getClass();
                    int i19 = v.f188955c;
                    x5.p.f188918b.getClass();
                    a2 a2Var = new a2(0, (Boolean) null, i19, x5.p.f188926j, (x5.f0) null, (Boolean) null, (z5.c) null, 115, (p005kotlin.jvm.internal.j) null);
                    boolean zR4 = mVar6.r(qVar) | mVar6.B(m3Var);
                    Object objQ4 = mVar6.q();
                    if (zR4) {
                        obj3 = objQ4;
                        o62.f fVar = new o62.f(qVar, m3Var, 1);
                        mVar6.K(fVar);
                        obj3 = fVar;
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            obj3 = objQ4;
                            o62.f fVar2 = new o62.f(qVar, m3Var, 1);
                            mVar6.K(fVar2);
                            obj3 = fVar2;
                        }
                    }
                    obj3 = objQ4;
                    z1 z1Var = new z1((e23.l) obj3, null, null, null, null, null, 62, null);
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97931h, mVar6);
                    wg wgVar = wg.f90137a;
                    d0.f128823b.getClass();
                    long j8 = d0.f128831j;
                    long jA = d92.b.a(mVar6).k().a();
                    wgVar.getClass();
                    sg sgVarC = wg.c(0L, 0L, j8, j8, jA, 0L, 0L, j8, j8, 0L, 0L, 0L, 0L, mVar6, 2147385039);
                    Object objQ5 = mVar6.q();
                    aVar.getClass();
                    Object obj7 = objQ5;
                    if (objQ5 == m.a.f135155b) {
                        i3 i3Var = new i3(p1Var2, 17);
                        mVar6.K(i3Var);
                        obj7 = i3Var;
                    }
                    p40.b.f135634a.getClass();
                    eh.a(str2, (e23.l) obj7, rVarF2, false, x0VarB, p40.b.f135635b, null, null, null, a2Var, z1Var, false, 0, 10, null, null, sgVarC, mVar6, 12582960, 818085888, 3440472);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 11:
                p1 p1Var3 = (p1) obj5;
                q40.b bVar2 = (q40.b) obj6;
                m mVar7 = (m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                    v1 v1VarB = u0.l().b(u0.d(null, 3));
                    w1.f149304a.getClass();
                    c0.e(zBooleanValue, null, v1VarB, w1.f149305b, null, z3.f.c(393812718, new o(bVar2, i15), mVar7), mVar7, 196992, 18);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 12:
                n80.a aVar11 = (n80.a) obj6;
                CompanionDeviceCardView companionDeviceCardView = (CompanionDeviceCardView) obj5;
                m mVar8 = (m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                int i24 = CompanionDeviceCardView.f33740c;
                if (mVar8.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = n.f135158a;
                    boolean zR5 = mVar8.r(companionDeviceCardView) | mVar8.r(aVar11);
                    Object objQ6 = mVar8.q();
                    if (zR5) {
                        objQ6 = new o50.a(24, companionDeviceCardView, aVar11);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new o50.a(24, companionDeviceCardView, aVar11);
                            mVar8.K(objQ6);
                        }
                    }
                    h4.r rVarX = x2.x(x2.d(h4.r.S, 1.0f), null, 3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    p80.a.a(aVar11, (e23.l) objQ6, c2.l.y(rVarX, j92.b.f97899b.f97920e), null, mVar8, 0, 8);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 13:
                n80.a aVar12 = (n80.a) obj6;
                CompanionDeviceLinkActivity companionDeviceLinkActivity = (CompanionDeviceLinkActivity) obj5;
                m mVar9 = (m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                CompanionDeviceLinkActivity.a aVar13 = CompanionDeviceLinkActivity.f33743a;
                if (mVar9.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = n.f135158a;
                    boolean zR6 = mVar9.r(companionDeviceLinkActivity);
                    Object objQ7 = mVar9.q();
                    if (zR6) {
                        objQ7 = new q1(companionDeviceLinkActivity, 10);
                        mVar9.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new q1(companionDeviceLinkActivity, 10);
                            mVar9.K(objQ7);
                        }
                    }
                    e23.l lVar4 = (e23.l) objQ7;
                    boolean zR7 = mVar9.r(companionDeviceLinkActivity);
                    Object objQ8 = mVar9.q();
                    if (zR7) {
                        objQ8 = new u(companionDeviceLinkActivity, 12);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new u(companionDeviceLinkActivity, 12);
                            mVar9.K(objQ8);
                        }
                    }
                    p80.c.a(aVar12, lVar4, (e23.a) objQ8, false, mVar9, 0, 8);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.a aVar14 = com.garmin.android.apps.connectmobile.ecg.presentation.stats.b.f34893h;
                ((com.garmin.android.apps.connectmobile.ecg.presentation.stats.b) obj6).n((Uri) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                r rVar2 = (r) obj6;
                final pf1.g gVar = (pf1.g) obj5;
                m mVar10 = (m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                int i25 = pf1.g.f137573f;
                if (mVar10.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = n.f135158a;
                    boolean zR8 = mVar10.r(gVar);
                    Object objQ9 = mVar10.q();
                    if (zR8) {
                        objQ9 = new e23.a() { // from class: pf1.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i15;
                                g gVar2 = gVar;
                                switch (i26) {
                                    case 0:
                                        int i27 = g.f137573f;
                                        gVar2.e("WEEKLY_TOLERANCE");
                                        break;
                                    case 1:
                                        int i28 = g.f137573f;
                                        gVar2.e("IMPACT_LOAD");
                                        break;
                                    default:
                                        int i29 = g.f137573f;
                                        gVar2.e("RUNNING_TOLERANCE");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new e23.a() { // from class: pf1.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i15;
                                    g gVar2 = gVar;
                                    switch (i26) {
                                        case 0:
                                            int i27 = g.f137573f;
                                            gVar2.e("WEEKLY_TOLERANCE");
                                            break;
                                        case 1:
                                            int i28 = g.f137573f;
                                            gVar2.e("IMPACT_LOAD");
                                            break;
                                        default:
                                            int i29 = g.f137573f;
                                            gVar2.e("RUNNING_TOLERANCE");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ9);
                        }
                    }
                    rVar2.B(R.string.running_tolerance_help_about_title, null, false, (e23.a) objQ9, mVar10, 0, 6);
                    boolean zR9 = mVar10.r(gVar);
                    Object objQ10 = mVar10.q();
                    if (zR9) {
                        final int i26 = false ? 1 : 0;
                        objQ10 = new e23.a() { // from class: pf1.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i26;
                                g gVar2 = gVar;
                                switch (i27) {
                                    case 0:
                                        int i28 = g.f137573f;
                                        gVar2.e("WEEKLY_TOLERANCE");
                                        break;
                                    case 1:
                                        int i29 = g.f137573f;
                                        gVar2.e("IMPACT_LOAD");
                                        break;
                                    default:
                                        int i210 = g.f137573f;
                                        gVar2.e("RUNNING_TOLERANCE");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == m.a.f135155b) {
                            final int i27 = false ? 1 : 0;
                            objQ10 = new e23.a() { // from class: pf1.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i27;
                                    g gVar2 = gVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = g.f137573f;
                                            gVar2.e("WEEKLY_TOLERANCE");
                                            break;
                                        case 1:
                                            int i210 = g.f137573f;
                                            gVar2.e("IMPACT_LOAD");
                                            break;
                                        default:
                                            int i211 = g.f137573f;
                                            gVar2.e("RUNNING_TOLERANCE");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ10);
                        }
                    }
                    rVar2.B(R.string.weekly_tolerance, null, false, (e23.a) objQ10, mVar10, 0, 6);
                    boolean zR10 = mVar10.r(gVar);
                    Object objQ11 = mVar10.q();
                    if (zR10) {
                        objQ11 = new e23.a() { // from class: pf1.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i28 = i16;
                                g gVar2 = gVar;
                                switch (i28) {
                                    case 0:
                                        int i29 = g.f137573f;
                                        gVar2.e("WEEKLY_TOLERANCE");
                                        break;
                                    case 1:
                                        int i210 = g.f137573f;
                                        gVar2.e("IMPACT_LOAD");
                                        break;
                                    default:
                                        int i211 = g.f137573f;
                                        gVar2.e("RUNNING_TOLERANCE");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar10.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == m.a.f135155b) {
                            objQ11 = new e23.a() { // from class: pf1.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i28 = i16;
                                    g gVar2 = gVar;
                                    switch (i28) {
                                        case 0:
                                            int i29 = g.f137573f;
                                            gVar2.e("WEEKLY_TOLERANCE");
                                            break;
                                        case 1:
                                            int i210 = g.f137573f;
                                            gVar2.e("IMPACT_LOAD");
                                            break;
                                        default:
                                            int i211 = g.f137573f;
                                            gVar2.e("RUNNING_TOLERANCE");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar10.K(objQ11);
                        }
                    }
                    rVar2.B(R.string.running_tolerance_help_impact_load_title, null, false, (e23.a) objQ11, mVar10, 0, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 16:
                final pk1.k kVar2 = (pk1.k) obj6;
                r rVar3 = (r) obj5;
                m mVar11 = (m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                pk1.k.a aVar15 = pk1.k.f138297g;
                if (mVar11.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = n.f135158a;
                    if (kVar2.f138298f) {
                        mVar11.C(947921003);
                        boolean zR11 = mVar11.r(kVar2);
                        Object objQ12 = mVar11.q();
                        if (zR11) {
                            final int i28 = false ? 1 : 0;
                            objQ12 = new e23.a() { // from class: pk1.h
                                @Override // e23.a
                                public final Object invoke() {
                                    int i29 = i28;
                                    k kVar3 = kVar2;
                                    switch (i29) {
                                        case 0:
                                            k.a aVar16 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        case 1:
                                            k.a aVar17 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        default:
                                            k.a aVar18 = k.f138297g;
                                            kVar3.e("ACTIVITY_CLASS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ12);
                        } else {
                            aVar.getClass();
                            if (objQ12 == m.a.f135155b) {
                                final int i29 = false ? 1 : 0;
                                objQ12 = new e23.a() { // from class: pk1.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i29;
                                        k kVar3 = kVar2;
                                        switch (i210) {
                                            case 0:
                                                k.a aVar16 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            case 1:
                                                k.a aVar17 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            default:
                                                k.a aVar18 = k.f138297g;
                                                kVar3.e("ACTIVITY_CLASS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar11.K(objQ12);
                            }
                        }
                        rVar3.B(R.string.personal_info_title_help, null, false, (e23.a) objQ12, mVar11, 0, 6);
                        mVar11.f();
                    } else {
                        mVar11.C(948065122);
                        boolean zR12 = mVar11.r(kVar2);
                        Object objQ13 = mVar11.q();
                        if (zR12) {
                            objQ13 = new e23.a() { // from class: pk1.h
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i16;
                                    k kVar3 = kVar2;
                                    switch (i210) {
                                        case 0:
                                            k.a aVar16 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        case 1:
                                            k.a aVar17 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        default:
                                            k.a aVar18 = k.f138297g;
                                            kVar3.e("ACTIVITY_CLASS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ13);
                        } else {
                            aVar.getClass();
                            if (objQ13 == m.a.f135155b) {
                                objQ13 = new e23.a() { // from class: pk1.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i16;
                                        k kVar3 = kVar2;
                                        switch (i210) {
                                            case 0:
                                                k.a aVar16 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            case 1:
                                                k.a aVar17 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            default:
                                                k.a aVar18 = k.f138297g;
                                                kVar3.e("ACTIVITY_CLASS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar11.K(objQ13);
                            }
                        }
                        rVar3.B(R.string.personal_info_title_help, null, false, (e23.a) objQ13, mVar11, 0, 6);
                        boolean zR13 = mVar11.r(kVar2);
                        Object objQ14 = mVar11.q();
                        if (zR13) {
                            objQ14 = new e23.a() { // from class: pk1.h
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i15;
                                    k kVar3 = kVar2;
                                    switch (i210) {
                                        case 0:
                                            k.a aVar16 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        case 1:
                                            k.a aVar17 = k.f138297g;
                                            kVar3.e("PERSONAL_INFORMATION");
                                            break;
                                        default:
                                            k.a aVar18 = k.f138297g;
                                            kVar3.e("ACTIVITY_CLASS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar11.K(objQ14);
                        } else {
                            aVar.getClass();
                            if (objQ14 == m.a.f135155b) {
                                objQ14 = new e23.a() { // from class: pk1.h
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i210 = i15;
                                        k kVar3 = kVar2;
                                        switch (i210) {
                                            case 0:
                                                k.a aVar16 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            case 1:
                                                k.a aVar17 = k.f138297g;
                                                kVar3.e("PERSONAL_INFORMATION");
                                                break;
                                            default:
                                                k.a aVar18 = k.f138297g;
                                                kVar3.e("ACTIVITY_CLASS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar11.K(objQ14);
                            }
                        }
                        rVar3.B(R.string.lbl_activity_class, null, false, (e23.a) objQ14, mVar11, 0, 6);
                        mVar11.f();
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 17:
                UpdateBirthdateActivity updateBirthdateActivity = (UpdateBirthdateActivity) obj6;
                JSONObject jSONObject = (JSONObject) obj5;
                m mVar12 = (m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i30 = UpdateBirthdateActivity.f44011d;
                if (mVar12.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = n.f135158a;
                    Object objQ15 = mVar12.q();
                    aVar.getClass();
                    m.a.C2565a c2565a = m.a.f135155b;
                    if (objQ15 == c2565a) {
                        obj4 = objQ15;
                        f12.l.f68084a.getClass();
                        c2 c2VarN = p0.n(f12.l.a.a().l1());
                        mVar12.K(c2VarN);
                        obj4 = c2VarN;
                    }
                    obj4 = objQ15;
                    p1 p1Var4 = (p1) obj4;
                    Object objQ16 = mVar12.q();
                    Object obj8 = objQ16;
                    if (objQ16 == c2565a) {
                        c2 c2VarN2 = p0.n(Boolean.FALSE);
                        mVar12.K(c2VarN2);
                        obj8 = c2VarN2;
                    }
                    p1 p1Var5 = (p1) obj8;
                    Object objQ17 = mVar12.q();
                    Object obj9 = objQ17;
                    if (objQ17 == c2565a) {
                        c2 c2VarN3 = p0.n(Boolean.FALSE);
                        mVar12.K(c2VarN3);
                        obj9 = c2VarN3;
                    }
                    p1 p1Var6 = (p1) obj9;
                    Unit unit = Unit.INSTANCE;
                    boolean zR14 = mVar12.r(updateBirthdateActivity);
                    Object objQ18 = mVar12.q();
                    Object obj10 = objQ18;
                    if (zR14 || objQ18 == c2565a) {
                        UpdateBirthdateActivity.a aVar16 = updateBirthdateActivity.new a(p1Var6, null);
                        mVar12.K(aVar16);
                        obj10 = aVar16;
                    }
                    l0.e((p) obj10, unit, mVar12);
                    Object objQ19 = mVar12.q();
                    Object obj11 = objQ19;
                    if (objQ19 == c2565a) {
                        UpdateBirthdateActivity.b bVar3 = updateBirthdateActivity.new b(p1Var5);
                        mVar12.K(bVar3);
                        obj11 = bVar3;
                    }
                    UpdateBirthdateActivity.b bVar4 = (UpdateBirthdateActivity.b) obj11;
                    boolean zR15 = mVar12.r(updateBirthdateActivity) | mVar12.r(jSONObject);
                    Object objQ20 = mVar12.q();
                    Object obj12 = objQ20;
                    if (zR15 || objQ20 == c2565a) {
                        nw0.p pVar = new nw0.p(updateBirthdateActivity, 27, jSONObject, bVar4);
                        mVar12.K(pVar);
                        obj12 = pVar;
                    }
                    e23.a aVar17 = (e23.a) obj12;
                    boolean zB = mVar12.B(aVar17);
                    Object objQ21 = mVar12.q();
                    Object obj13 = objQ21;
                    if (zB || objQ21 == c2565a) {
                        pf0.j jVar2 = new pf0.j(aVar17, 5);
                        mVar12.K(jVar2);
                        obj13 = jVar2;
                    }
                    w.a(0, 1, (e23.a) obj13, mVar12, false);
                    z02.b.a(false, null, null, null, false, z3.f.c(1472357593, new ob0.e(p1Var6, aVar17, updateBirthdateActivity, p1Var4, p1Var5), mVar12), mVar12, 196608, 31);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.settings.usersettings.a.b((LocalDate) obj6, (e23.l) obj5, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 19:
                co0.c cVar = (co0.c) obj6;
                Context context = (Context) obj5;
                m mVar13 = (m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = n.f135158a;
                    Integer numValueOf = cVar != null ? Integer.valueOf(cVar.d()) : null;
                    maxHeartRate = cVar != null ? Integer.valueOf(cVar.b()) : null;
                    String string = context.getString(R.string.activities_average_resting_lbl);
                    no0.a.a(numValueOf, maxHeartRate, string, p6.b.d(context, R.string.lbl_avg_high, string), mVar13, 0);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 20:
                mp.b bVar5 = (mp.b) obj6;
                m mVar14 = (m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar14.n(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = n.f135158a;
                    if (bVar5.equals(obj5)) {
                        mVar14.C(1909544941);
                        h4.r.a aVar18 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        i7.a(n5.c.a(R.drawable.check, mVar14, 0), null, x2.q(aVar18, j92.b.f97901d.f97904c), lc.u0.f(mVar14), mVar14, 48, 0);
                        mVar14.f();
                    } else {
                        mVar14.C(1909878253);
                        mVar14.f();
                    }
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                q12.d.a((q12.e) obj6, (e23.a) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 22:
                zc.d dVar2 = (zc.d) obj6;
                q12.e eVar2 = (q12.e) obj5;
                m mVar15 = (m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar15.n(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = n.f135158a;
                    q12.e.b bVar6 = eVar2.f142090d;
                    s62.a.f157643a.getClass();
                    li0.p0.d(dVar2, bVar6, j9.a(t62.b.f162798a), R.string.no_blocked_users_title, Integer.valueOf(R.string.msg_no_blocked_users_description), mVar15, 8 | (li0.f.f112658h << 3));
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 23:
                s2.e eVar3 = (s2.e) obj6;
                o2.h hVar = (o2.h) obj5;
                m mVar16 = (m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar16.n(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = n.f135158a;
                    boolean zB2 = mVar16.B(eVar3);
                    Object objQ22 = mVar16.q();
                    if (zB2) {
                        objQ22 = p0.f(new q2.j.b(eVar3));
                        mVar16.K(objQ22);
                    } else {
                        aVar.getClass();
                        if (objQ22 == m.a.f135155b) {
                            objQ22 = p0.f(new q2.j.b(eVar3));
                            mVar16.K(objQ22);
                        }
                    }
                    q2.j.a(hVar, (o2.d) ((x3) objQ22).getF182175a(), mVar16, 0);
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                q2.j.a((o2.h) obj6, (o2.d) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                q2.u uVar = q2.u.f142195a;
                ((q2.u) obj6).a((Drawable) obj5, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 26:
                e23.a aVar19 = (e23.a) obj6;
                q42.i iVar = (q42.i) obj5;
                m mVar17 = (m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar17.n(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = n.f135158a;
                    String strQ3 = y.Q(mVar17, R.string.title_edit_weight_goal);
                    b3.b.a aVar20 = b3.b.a.f15503a;
                    u4.d dVarA = d3.h.a();
                    boolean zB3 = mVar17.B(aVar19);
                    Object objQ23 = mVar17.q();
                    if (zB3) {
                        objQ23 = new pf0.j(aVar19, 18);
                        mVar17.K(objQ23);
                    } else {
                        aVar.getClass();
                        if (objQ23 == m.a.f135155b) {
                            objQ23 = new pf0.j(aVar19, 18);
                            mVar17.K(objQ23);
                        }
                    }
                    e23.a aVar21 = (e23.a) objQ23;
                    i53.f fVarA = i53.a.a(new l72.i3("MENU_ITEM_SAVE_ID", y.Q(mVar17, R.string.lbl_save), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zR16 = mVar17.r(iVar);
                    Object objQ24 = mVar17.q();
                    if (zR16) {
                        objQ24 = new q42.b(iVar, false ? 1 : 0);
                        mVar17.K(objQ24);
                    } else {
                        aVar.getClass();
                        if (objQ24 == m.a.f135155b) {
                            objQ24 = new q42.b(iVar, false ? 1 : 0);
                            mVar17.K(objQ24);
                        }
                    }
                    z02.f.d(strQ3, null, dVarA, aVar21, fVarA, null, (e23.l) objQ24, mVar17, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 27:
                return a(obj, obj2);
            case 28:
                e23.l lVar5 = (e23.l) obj6;
                q51.e eVar4 = (q51.e) obj5;
                m mVar18 = (m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar18.n(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = n.f135158a;
                    s62.a.f157643a.getClass();
                    t62.b.f162798a.getClass();
                    u4.d dVarA2 = x62.n.a(l2.f175943a);
                    String strQ4 = y.Q(mVar18, R.string.lbl_send_to_device);
                    d92.b.f58623a.getClass();
                    long jA2 = d92.b.a(mVar18).k().a();
                    h4.r.a aVar22 = h4.r.S;
                    d92.b.f58625c.getClass();
                    h4.r rVarQ = x2.q(aVar22, j92.b.f97901d.f97905d);
                    boolean zB4 = mVar18.B(lVar5) | mVar18.B(eVar4);
                    Object objQ25 = mVar18.q();
                    if (zB4) {
                        objQ25 = new q51.c(lVar5, eVar4, 0);
                        mVar18.K(objQ25);
                    } else {
                        aVar.getClass();
                        if (objQ25 == m.a.f135155b) {
                            objQ25 = new q51.c(lVar5, eVar4, 0);
                            mVar18.K(objQ25);
                        }
                    }
                    i7.b(dVarA2, strQ4, u1.w.d(rVarQ, false, null, null, (e23.a) objQ25, 15), jA2, mVar18, 0, 0);
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                q72.h.f((q72.b) obj6, (r72.i) obj5, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i14, int i15) {
        this.f133122a = i15;
        this.f133123b = obj;
        this.f133124c = obj2;
    }

    public /* synthetic */ f(int i14, Object obj, Object obj2) {
        this.f133122a = i14;
        this.f133123b = obj;
        this.f133124c = obj2;
    }
}
