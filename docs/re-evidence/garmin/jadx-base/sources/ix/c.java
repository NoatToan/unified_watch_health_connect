package ix;

import com.garmin.android.apps.connectmobile.R;
import e23.p;
import h82.r;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f95583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f95584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f95585c;

    public /* synthetic */ c(f fVar, r rVar) {
        this.f95583a = 3;
        this.f95585c = fVar;
        this.f95584b = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x013a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016b  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f95583a;
        final f fVar = this.f95585c;
        final int i15 = 2;
        final int i16 = 1;
        final int i17 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i18 = f.f95592j;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    r rVar = this.f95584b;
                    rVar.D(R.string.gcm_body_battery_lbl_body_battery, mVar, 0);
                    rVar.l(R.string.gcm_help_body_battery_description, 0, 2, null, mVar);
                    if (fVar.q()) {
                        mVar.C(533050283);
                        rVar.l(R.string.msg_body_battery_help_version_3, 0, 2, null, mVar);
                        mVar.f();
                    } else {
                        mVar.C(533133890);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i19 = f.f95592j;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar = p3.m.f135153a;
                    if (zR) {
                        objQ = new e23.a() { // from class: ix.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i17;
                                f fVar2 = fVar;
                                switch (i24) {
                                    case 0:
                                        int i25 = f.f95592j;
                                        fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                        break;
                                    case 1:
                                        int i26 = f.f95592j;
                                        fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                        break;
                                    case 2:
                                        int i27 = f.f95592j;
                                        fVar2.e("READINGS_ACTION");
                                        break;
                                    case 3:
                                        int i28 = f.f95592j;
                                        fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                        break;
                                    default:
                                        int i29 = f.f95592j;
                                        fVar2.e("MERGED_BODY_BATTERY_DATA");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e23.a() { // from class: ix.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i17;
                                    f fVar2 = fVar;
                                    switch (i24) {
                                        case 0:
                                            int i25 = f.f95592j;
                                            fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                            break;
                                        case 1:
                                            int i26 = f.f95592j;
                                            fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                            break;
                                        case 2:
                                            int i27 = f.f95592j;
                                            fVar2.e("READINGS_ACTION");
                                            break;
                                        case 3:
                                            int i28 = f.f95592j;
                                            fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                            break;
                                        default:
                                            int i29 = f.f95592j;
                                            fVar2.e("MERGED_BODY_BATTERY_DATA");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ);
                        }
                    }
                    r rVar2 = this.f95584b;
                    rVar2.B(R.string.gcm_help_body_battery_section1, null, false, (e23.a) objQ, mVar2, 0, 6);
                    boolean zR2 = mVar2.r(fVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new e23.a() { // from class: ix.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i16;
                                f fVar2 = fVar;
                                switch (i24) {
                                    case 0:
                                        int i25 = f.f95592j;
                                        fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                        break;
                                    case 1:
                                        int i26 = f.f95592j;
                                        fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                        break;
                                    case 2:
                                        int i27 = f.f95592j;
                                        fVar2.e("READINGS_ACTION");
                                        break;
                                    case 3:
                                        int i28 = f.f95592j;
                                        fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                        break;
                                    default:
                                        int i29 = f.f95592j;
                                        fVar2.e("MERGED_BODY_BATTERY_DATA");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new e23.a() { // from class: ix.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    f fVar2 = fVar;
                                    switch (i24) {
                                        case 0:
                                            int i25 = f.f95592j;
                                            fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                            break;
                                        case 1:
                                            int i26 = f.f95592j;
                                            fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                            break;
                                        case 2:
                                            int i27 = f.f95592j;
                                            fVar2.e("READINGS_ACTION");
                                            break;
                                        case 3:
                                            int i28 = f.f95592j;
                                            fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                            break;
                                        default:
                                            int i29 = f.f95592j;
                                            fVar2.e("MERGED_BODY_BATTERY_DATA");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ2);
                        }
                    }
                    rVar2.B(R.string.gcm_help_body_battery_section2, null, false, (e23.a) objQ2, mVar2, 0, 6);
                    boolean zR3 = mVar2.r(fVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        objQ3 = new e23.a() { // from class: ix.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i15;
                                f fVar2 = fVar;
                                switch (i24) {
                                    case 0:
                                        int i25 = f.f95592j;
                                        fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                        break;
                                    case 1:
                                        int i26 = f.f95592j;
                                        fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                        break;
                                    case 2:
                                        int i27 = f.f95592j;
                                        fVar2.e("READINGS_ACTION");
                                        break;
                                    case 3:
                                        int i28 = f.f95592j;
                                        fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                        break;
                                    default:
                                        int i29 = f.f95592j;
                                        fVar2.e("MERGED_BODY_BATTERY_DATA");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: ix.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i15;
                                    f fVar2 = fVar;
                                    switch (i24) {
                                        case 0:
                                            int i25 = f.f95592j;
                                            fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                            break;
                                        case 1:
                                            int i26 = f.f95592j;
                                            fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                            break;
                                        case 2:
                                            int i27 = f.f95592j;
                                            fVar2.e("READINGS_ACTION");
                                            break;
                                        case 3:
                                            int i28 = f.f95592j;
                                            fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                            break;
                                        default:
                                            int i29 = f.f95592j;
                                            fVar2.e("MERGED_BODY_BATTERY_DATA");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ3);
                        }
                    }
                    rVar2.B(R.string.lbl_how_to_use_reading, null, false, (e23.a) objQ3, mVar2, 0, 6);
                    boolean zR4 = mVar2.r(fVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        final int i24 = 3;
                        objQ4 = new e23.a() { // from class: ix.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i25 = i24;
                                f fVar2 = fVar;
                                switch (i25) {
                                    case 0:
                                        int i26 = f.f95592j;
                                        fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                        break;
                                    case 1:
                                        int i27 = f.f95592j;
                                        fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                        break;
                                    case 2:
                                        int i28 = f.f95592j;
                                        fVar2.e("READINGS_ACTION");
                                        break;
                                    case 3:
                                        int i29 = f.f95592j;
                                        fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                        break;
                                    default:
                                        int i210 = f.f95592j;
                                        fVar2.e("MERGED_BODY_BATTERY_DATA");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            final int i25 = 3;
                            objQ4 = new e23.a() { // from class: ix.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i26 = i25;
                                    f fVar2 = fVar;
                                    switch (i26) {
                                        case 0:
                                            int i27 = f.f95592j;
                                            fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                            break;
                                        case 1:
                                            int i28 = f.f95592j;
                                            fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                            break;
                                        case 2:
                                            int i29 = f.f95592j;
                                            fVar2.e("READINGS_ACTION");
                                            break;
                                        case 3:
                                            int i210 = f.f95592j;
                                            fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                            break;
                                        default:
                                            int i211 = f.f95592j;
                                            fVar2.e("MERGED_BODY_BATTERY_DATA");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ4);
                        }
                    }
                    rVar2.B(R.string.gcm_body_battery_lbl_estimated_body_battery, null, false, (e23.a) objQ4, mVar2, 0, 6);
                    if (fVar.f95596i) {
                        mVar2.C(1020457353);
                        boolean zR5 = mVar2.r(fVar);
                        Object objQ5 = mVar2.q();
                        if (zR5) {
                            final int i26 = 4;
                            objQ5 = new e23.a() { // from class: ix.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i26;
                                    f fVar2 = fVar;
                                    switch (i27) {
                                        case 0:
                                            int i28 = f.f95592j;
                                            fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                            break;
                                        case 1:
                                            int i29 = f.f95592j;
                                            fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                            break;
                                        case 2:
                                            int i210 = f.f95592j;
                                            fVar2.e("READINGS_ACTION");
                                            break;
                                        case 3:
                                            int i211 = f.f95592j;
                                            fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                            break;
                                        default:
                                            int i212 = f.f95592j;
                                            fVar2.e("MERGED_BODY_BATTERY_DATA");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(objQ5);
                        } else {
                            aVar.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                final int i27 = 4;
                                objQ5 = new e23.a() { // from class: ix.d
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i28 = i27;
                                        f fVar2 = fVar;
                                        switch (i28) {
                                            case 0:
                                                int i29 = f.f95592j;
                                                fVar2.e("WHAT_IS_BODY_BATTERY_ACTION");
                                                break;
                                            case 1:
                                                int i210 = f.f95592j;
                                                fVar2.e("HOW_WE_CALCULATE_IT_ACTION");
                                                break;
                                            case 2:
                                                int i211 = f.f95592j;
                                                fVar2.e("READINGS_ACTION");
                                                break;
                                            case 3:
                                                int i212 = f.f95592j;
                                                fVar2.e("ESTIMATED_BODY_BATTERY_ACTION");
                                                break;
                                            default:
                                                int i213 = f.f95592j;
                                                fVar2.e("MERGED_BODY_BATTERY_DATA");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar2.K(objQ5);
                            }
                        }
                        rVar2.B(R.string.lbl_merged_body_battery_data, null, false, (e23.a) objQ5, mVar2, 0, 6);
                        mVar2.f();
                    } else {
                        mVar2.C(1020595737);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i28 = f.f95592j;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    r rVar3 = this.f95584b;
                    rVar3.t(R.string.concept_activities, mVar3, 0);
                    rVar3.o(fVar.q() ? R.string.gcm_body_battery_help_your_chart_label : R.string.gcm_body_battery_help_your_chart_label_2, 0, 2, null, mVar3);
                } else {
                    mVar3.e();
                }
                break;
            default:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i29 = f.f95592j;
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    int i30 = fVar.q() ? R.string.title_stress_and_rest : R.string.title_stress;
                    r rVar4 = this.f95584b;
                    rVar4.t(i30, mVar4, 0);
                    rVar4.o(fVar.q() ? R.string.msg_body_battery_version_3_help_chart_overlay_label : R.string.gcm_body_battery_help_chart_overlay_label, 0, 2, null, mVar4);
                } else {
                    mVar4.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(r rVar, f fVar, int i14) {
        this.f95583a = i14;
        this.f95584b = rVar;
        this.f95585c = fVar;
    }
}
