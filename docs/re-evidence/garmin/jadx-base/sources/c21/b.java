package c21;

import b63.v;
import c22.j0;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import gl1.y;
import i3.bi;
import i3.qi;
import i3.ri;
import i3.si;
import java.time.LocalTime;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f22971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f22972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f22973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f22974e;

    public /* synthetic */ b(v vVar, String str, l lVar, p1 p1Var, int i14) {
        this.f22970a = i14;
        this.f22971b = vVar;
        this.f22972c = str;
        this.f22973d = lVar;
        this.f22974e = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076  */
    /* JADX WARN: Code duplicated, block: B:18:0x0097  */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:38:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i14 = this.f22970a;
        m.a aVar = m.f135153a;
        final p1 p1Var = this.f22974e;
        final l lVar = this.f22973d;
        final v vVar = this.f22971b;
        boolean z14 = false;
        boolean z15 = false;
        final int i15 = 1;
        switch (i14) {
            case 0:
                LocalTime localTime = vVar.f16219a;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    int hour = localTime.getHour();
                    int minute = localTime.getMinute();
                    j0.f23099a.getClass();
                    final si siVarZ = bi.z(hour, minute, j0.D(), mVar, 0, 0);
                    String strQ = y.Q(mVar, R.string.lbl_ok);
                    boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String strQ2 = y.Q(mVar, R.string.lbl_cancel);
                    boolean zR = mVar.r(siVarZ) | mVar.r(vVar);
                    Object objQ = mVar.q();
                    if (zR) {
                        obj3 = objQ;
                        final boolean z16 = z14 ? 1 : 0;
                        e23.a aVar2 = new e23.a() { // from class: c21.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (z16) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        ri riVar = siVarZ;
                                        riVar.d(0);
                                        LocalTime localTime2 = vVar.f16219a;
                                        riVar.e(localTime2.getHour());
                                        riVar.f(localTime2.getMinute());
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        ri riVar2 = siVarZ;
                                        riVar2.d(0);
                                        v vVar2 = vVar;
                                        riVar2.e(vVar2.f16219a.getHour());
                                        riVar2.f(vVar2.f16219a.getMinute());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(aVar2);
                        obj3 = aVar2;
                    } else {
                        aVar.getClass();
                        if (objQ == m.a.f135155b) {
                            obj3 = objQ;
                            final int z17 = z14 ? 1 : 0;
                            e23.a aVar3 = new e23.a() { // from class: c21.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (z17) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            ri riVar = siVarZ;
                                            riVar.d(0);
                                            LocalTime localTime2 = vVar.f16219a;
                                            riVar.e(localTime2.getHour());
                                            riVar.f(localTime2.getMinute());
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            ri riVar2 = siVarZ;
                                            riVar2.d(0);
                                            v vVar2 = vVar;
                                            riVar2.e(vVar2.f16219a.getHour());
                                            riVar2.f(vVar2.f16219a.getMinute());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(aVar3);
                            obj3 = aVar3;
                        }
                    }
                    obj3 = objQ;
                    e23.a aVar4 = (e23.a) obj3;
                    boolean zR2 = mVar.r(siVarZ) | mVar.B(lVar);
                    Object objQ2 = mVar.q();
                    if (zR2) {
                        obj4 = objQ2;
                        final boolean z18 = z15 ? 1 : 0;
                        p pVar = new p() { // from class: c21.d
                            @Override // e23.p
                            public final Object invoke(Object obj7, Object obj8) {
                                int i16 = z18;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                int iIntValue3 = ((Integer) obj8).intValue();
                                switch (i16) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        siVarZ.d(0);
                                        lVar.invoke(new v(iIntValue2, iIntValue3, 0, 0, 12, null));
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        siVarZ.d(0);
                                        lVar.invoke(new v(iIntValue2, iIntValue3, 0, 0, 12, null));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar.K(pVar);
                        obj4 = pVar;
                    } else {
                        aVar.getClass();
                        if (objQ2 == m.a.f135155b) {
                            obj4 = objQ2;
                            final int z19 = z15 ? 1 : 0;
                            p pVar2 = new p() { // from class: c21.d
                                @Override // e23.p
                                public final Object invoke(Object obj7, Object obj8) {
                                    int i16 = z19;
                                    int iIntValue2 = ((Integer) obj7).intValue();
                                    int iIntValue3 = ((Integer) obj8).intValue();
                                    switch (i16) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            siVarZ.d(0);
                                            lVar.invoke(new v(iIntValue2, iIntValue3, 0, 0, 12, null));
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            siVarZ.d(0);
                                            lVar.invoke(new v(iIntValue2, iIntValue3, 0, 0, 12, null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar.K(pVar2);
                            obj4 = pVar2;
                        }
                    }
                    obj4 = objQ2;
                    g82.e.a(this.f22972c, siVarZ, zBooleanValue, strQ2, aVar4, strQ, (p) obj4, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    int hour2 = vVar.f16219a.getHour();
                    int minute2 = vVar.f16219a.getMinute();
                    j0.f23099a.getClass();
                    final si siVarZ2 = bi.z(hour2, minute2, j0.D(), mVar2, 0, 0);
                    String strQ3 = y.Q(mVar2, R.string.lbl_ok);
                    boolean zBooleanValue2 = ((Boolean) p1Var.getF182175a()).booleanValue();
                    String strQ4 = y.Q(mVar2, R.string.lbl_cancel);
                    boolean zR3 = mVar2.r(siVarZ2) | mVar2.r(vVar);
                    Object objQ3 = mVar2.q();
                    if (zR3) {
                        obj5 = objQ3;
                        e23.a aVar5 = new e23.a() { // from class: c21.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i15) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        ri riVar = siVarZ2;
                                        riVar.d(0);
                                        LocalTime localTime2 = vVar.f16219a;
                                        riVar.e(localTime2.getHour());
                                        riVar.f(localTime2.getMinute());
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        ri riVar2 = siVarZ2;
                                        riVar2.d(0);
                                        v vVar2 = vVar;
                                        riVar2.e(vVar2.f16219a.getHour());
                                        riVar2.f(vVar2.f16219a.getMinute());
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(aVar5);
                        obj5 = aVar5;
                    } else {
                        aVar.getClass();
                        if (objQ3 == m.a.f135155b) {
                            obj5 = objQ3;
                            e23.a aVar6 = new e23.a() { // from class: c21.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i15) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            ri riVar = siVarZ2;
                                            riVar.d(0);
                                            LocalTime localTime2 = vVar.f16219a;
                                            riVar.e(localTime2.getHour());
                                            riVar.f(localTime2.getMinute());
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            ri riVar2 = siVarZ2;
                                            riVar2.d(0);
                                            v vVar2 = vVar;
                                            riVar2.e(vVar2.f16219a.getHour());
                                            riVar2.f(vVar2.f16219a.getMinute());
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(aVar6);
                            obj5 = aVar6;
                        }
                    }
                    obj5 = objQ3;
                    e23.a aVar7 = (e23.a) obj5;
                    boolean zR4 = mVar2.r(siVarZ2) | mVar2.B(lVar);
                    Object objQ4 = mVar2.q();
                    if (zR4) {
                        obj6 = objQ4;
                        p pVar3 = new p() { // from class: c21.d
                            @Override // e23.p
                            public final Object invoke(Object obj7, Object obj8) {
                                int i16 = i15;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                int iIntValue4 = ((Integer) obj8).intValue();
                                switch (i16) {
                                    case 0:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        siVarZ2.d(0);
                                        lVar.invoke(new v(iIntValue3, iIntValue4, 0, 0, 12, null));
                                        break;
                                    default:
                                        p1Var.setValue(Boolean.FALSE);
                                        qi.f89469b.getClass();
                                        siVarZ2.d(0);
                                        lVar.invoke(new v(iIntValue3, iIntValue4, 0, 0, 12, null));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar2.K(pVar3);
                        obj6 = pVar3;
                    } else {
                        aVar.getClass();
                        if (objQ4 == m.a.f135155b) {
                            obj6 = objQ4;
                            p pVar4 = new p() { // from class: c21.d
                                @Override // e23.p
                                public final Object invoke(Object obj7, Object obj8) {
                                    int i16 = i15;
                                    int iIntValue3 = ((Integer) obj7).intValue();
                                    int iIntValue4 = ((Integer) obj8).intValue();
                                    switch (i16) {
                                        case 0:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            siVarZ2.d(0);
                                            lVar.invoke(new v(iIntValue3, iIntValue4, 0, 0, 12, null));
                                            break;
                                        default:
                                            p1Var.setValue(Boolean.FALSE);
                                            qi.f89469b.getClass();
                                            siVarZ2.d(0);
                                            lVar.invoke(new v(iIntValue3, iIntValue4, 0, 0, 12, null));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar2.K(pVar4);
                            obj6 = pVar4;
                        }
                    }
                    obj6 = objQ4;
                    g82.e.a(this.f22972c, siVarZ2, zBooleanValue2, strQ4, aVar7, strQ3, (p) obj6, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
