package ho0;

import android.content.Context;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import e23.q;
import gl1.y;
import h4.r;
import h5.e0;
import i3.mh;
import i3.p7;
import l72.c1;
import nw0.x;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.n;
import p3.p0;
import p3.v;
import p3.x1;
import p3.y3;
import s5.x0;
import sz1.p;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class f implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f84710b;

    public /* synthetic */ f(Context context, int i14) {
        this.f84709a = i14;
        this.f84710b = context;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0305  */
    /* JADX WARN: Code duplicated, block: B:127:0x038a  */
    /* JADX WARN: Code duplicated, block: B:135:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:161:0x042d  */
    /* JADX WARN: Code duplicated, block: B:169:0x0449  */
    /* JADX WARN: Code duplicated, block: B:195:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:203:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:229:0x056d  */
    /* JADX WARN: Code duplicated, block: B:237:0x0589  */
    /* JADX WARN: Code duplicated, block: B:263:0x060e  */
    /* JADX WARN: Code duplicated, block: B:271:0x062a  */
    /* JADX WARN: Code duplicated, block: B:297:0x06af  */
    /* JADX WARN: Code duplicated, block: B:305:0x06cb  */
    /* JADX WARN: Code duplicated, block: B:331:0x0750  */
    /* JADX WARN: Code duplicated, block: B:339:0x076d  */
    /* JADX WARN: Code duplicated, block: B:365:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:373:0x080c  */
    /* JADX WARN: Code duplicated, block: B:399:0x0890  */
    /* JADX WARN: Code duplicated, block: B:407:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:41:0x014e  */
    /* JADX WARN: Code duplicated, block: B:428:0x097a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0157  */
    /* JADX WARN: Code duplicated, block: B:44:0x015b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
    /* JADX WARN: Code duplicated, block: B:52:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:54:0x01de  */
    /* JADX WARN: Code duplicated, block: B:56:0x023a  */
    /* JADX WARN: Code duplicated, block: B:93:0x02e9  */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        boolean z14;
        Throwable th3;
        h5.g.a.f fVar;
        u2 u2Var;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        String strQ;
        boolean zB;
        Object objQ;
        int i14 = this.f84709a;
        p3.m.a aVar = p3.m.f135153a;
        Context context = this.f84710b;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj;
                p3.m mVar = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                int i15 = h.f84713l;
                rVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar.B(rVar) ? 4 : 2;
                }
                if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = n.f135158a;
                    rVar.D(R.string.lbl_heart_rate_on_your_device, mVar, (iIntValue << 3) & 112);
                    int i16 = (iIntValue << 6) & 896;
                    rVar.o(R.string.msg_device_heart_rate_monitor, i16, 2, null, mVar);
                    rVar.o(R.string.msg_heart_rate_tracking_info, i16, 2, null, mVar);
                    rVar.o(R.string.msg_accurate_readings_info, i16, 2, null, mVar);
                    mVar.C(-345077072);
                    String str = y.Q(mVar, R.string.gcm_sleep_tracking_device_help) + " <link>" + y.Q(mVar, R.string.android_notification_update_failure_thirdline_learn_more) + "</link>";
                    mVar.f();
                    boolean zR = mVar.r(context);
                    Object objQ2 = mVar.q();
                    if (zR) {
                        objQ2 = new a(context, 1);
                        mVar.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new a(context, 1);
                            mVar.K(objQ2);
                        }
                    }
                    rVar.w(str, null, (e23.a) objQ2, mVar, (iIntValue << 9) & 7168, 2);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.a aVar2 = (e23.a) obj;
                p3.m mVar2 = (p3.m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                aVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= mVar2.r(aVar2) ? 4 : 2;
                }
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x1 x1Var2 = n.f135158a;
                    c1 c1Var = c1.f110940a;
                    int i17 = iIntValue2 & 14;
                    boolean zR2 = (i17 == 4) | mVar2.r(context);
                    Object objQ3 = mVar2.q();
                    if (zR2) {
                        objQ3 = new gp.h(aVar2, context, 2);
                        mVar2.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new gp.h(aVar2, context, 2);
                            mVar2.K(objQ3);
                        }
                    }
                    e23.a<Unit> aVar3 = (e23.a) objQ3;
                    z14 = i17 == 4;
                    Object objQ4 = mVar2.q();
                    if (z14) {
                        objQ4 = new x(aVar2, 10);
                        mVar2.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new x(aVar2, 10);
                            mVar2.K(objQ4);
                        }
                    }
                    c1Var.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar3, "Cancel", (e23.a) objQ4, mVar2, 805503414, 0, 216);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.a aVar4 = (e23.a) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                aVar4.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar3.r(aVar4) ? 4 : 2;
                }
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = n.f135158a;
                    c1 c1Var2 = c1.f110940a;
                    int i18 = iIntValue3 & 14;
                    boolean zR3 = mVar3.r(context) | (i18 == 4);
                    Object objQ5 = mVar3.q();
                    if (zR3) {
                        objQ5 = new gp.h(aVar4, context, 4);
                        mVar3.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new gp.h(aVar4, context, 4);
                            mVar3.K(objQ5);
                        }
                    }
                    e23.a<Unit> aVar5 = (e23.a) objQ5;
                    z14 = i18 == 4;
                    Object objQ6 = mVar3.q();
                    if (z14) {
                        objQ6 = new x(aVar4, 14);
                        mVar3.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new x(aVar4, 14);
                            mVar3.K(objQ6);
                        }
                    }
                    c1Var2.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar5, "Cancel", (e23.a) objQ6, mVar3, 805503414, 0, 216);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.a aVar6 = (e23.a) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                aVar6.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= mVar4.r(aVar6) ? 4 : 2;
                }
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    x1 x1Var4 = n.f135158a;
                    c1 c1Var3 = c1.f110940a;
                    int i19 = iIntValue4 & 14;
                    boolean zR4 = mVar4.r(context) | (i19 == 4);
                    Object objQ7 = mVar4.q();
                    if (zR4) {
                        objQ7 = new gp.h(aVar6, context, 5);
                        mVar4.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new gp.h(aVar6, context, 5);
                            mVar4.K(objQ7);
                        }
                    }
                    e23.a<Unit> aVar7 = (e23.a) objQ7;
                    z14 = i19 == 4;
                    Object objQ8 = mVar4.q();
                    if (z14) {
                        objQ8 = new x(aVar6, 15);
                        mVar4.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new x(aVar6, 15);
                            mVar4.K(objQ8);
                        }
                    }
                    c1Var3.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar7, "Cancel", (e23.a) objQ8, mVar4, 805503414, 0, 216);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar8 = (e23.a) obj;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                aVar8.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= mVar5.r(aVar8) ? 4 : 2;
                }
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    x1 x1Var5 = n.f135158a;
                    c1 c1Var4 = c1.f110940a;
                    int i24 = iIntValue5 & 14;
                    boolean zR5 = mVar5.r(context) | (i24 == 4);
                    Object objQ9 = mVar5.q();
                    if (zR5) {
                        objQ9 = new gp.h(aVar8, context, 3);
                        mVar5.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new gp.h(aVar8, context, 3);
                            mVar5.K(objQ9);
                        }
                    }
                    e23.a<Unit> aVar9 = (e23.a) objQ9;
                    z14 = i24 == 4;
                    Object objQ10 = mVar5.q();
                    if (z14) {
                        objQ10 = new x(aVar8, 13);
                        mVar5.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new x(aVar8, 13);
                            mVar5.K(objQ10);
                        }
                    }
                    c1Var4.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar9, "Cancel", (e23.a) objQ10, mVar5, 805503414, 0, 216);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                e23.a aVar10 = (e23.a) obj;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                aVar10.getClass();
                if ((iIntValue6 & 6) == 0) {
                    iIntValue6 |= mVar6.r(aVar10) ? 4 : 2;
                }
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 19) != 18)) {
                    x1 x1Var6 = n.f135158a;
                    c1 c1Var5 = c1.f110940a;
                    int i25 = iIntValue6 & 14;
                    boolean zR6 = (i25 == 4) | mVar6.r(context);
                    Object objQ11 = mVar6.q();
                    if (zR6) {
                        objQ11 = new gp.h(aVar10, context, 10);
                        mVar6.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new gp.h(aVar10, context, 10);
                            mVar6.K(objQ11);
                        }
                    }
                    e23.a<Unit> aVar11 = (e23.a) objQ11;
                    z14 = i25 == 4;
                    Object objQ12 = mVar6.q();
                    if (z14) {
                        objQ12 = new x(aVar10, 21);
                        mVar6.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new x(aVar10, 21);
                            mVar6.K(objQ12);
                        }
                    }
                    c1Var5.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar11, "Cancel", (e23.a) objQ12, mVar6, 805503414, 0, 216);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 6:
                e23.a aVar12 = (e23.a) obj;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                aVar12.getClass();
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= mVar7.r(aVar12) ? 4 : 2;
                }
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    x1 x1Var7 = n.f135158a;
                    c1 c1Var6 = c1.f110940a;
                    int i26 = iIntValue7 & 14;
                    boolean zR7 = (i26 == 4) | mVar7.r(context);
                    Object objQ13 = mVar7.q();
                    if (zR7) {
                        objQ13 = new gp.h(aVar12, context, 8);
                        mVar7.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new gp.h(aVar12, context, 8);
                            mVar7.K(objQ13);
                        }
                    }
                    e23.a<Unit> aVar13 = (e23.a) objQ13;
                    z14 = i26 == 4;
                    Object objQ14 = mVar7.q();
                    if (z14) {
                        objQ14 = new x(aVar12, 19);
                        mVar7.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new x(aVar12, 19);
                            mVar7.K(objQ14);
                        }
                    }
                    c1Var6.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar13, "Cancel", (e23.a) objQ14, mVar7, 805503414, 0, 216);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 7:
                e23.a aVar14 = (e23.a) obj;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                aVar14.getClass();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= mVar8.r(aVar14) ? 4 : 2;
                }
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x1 x1Var8 = n.f135158a;
                    c1 c1Var7 = c1.f110940a;
                    int i27 = iIntValue8 & 14;
                    boolean zR8 = (i27 == 4) | mVar8.r(context);
                    Object objQ15 = mVar8.q();
                    if (zR8) {
                        objQ15 = new gp.h(aVar14, context, 7);
                        mVar8.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new gp.h(aVar14, context, 7);
                            mVar8.K(objQ15);
                        }
                    }
                    e23.a<Unit> aVar15 = (e23.a) objQ15;
                    z14 = i27 == 4;
                    Object objQ16 = mVar8.q();
                    if (z14) {
                        objQ16 = new x(aVar14, 18);
                        mVar8.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new x(aVar14, 18);
                            mVar8.K(objQ16);
                        }
                    }
                    c1Var7.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar15, "Cancel", (e23.a) objQ16, mVar8, 805503414, 0, 216);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 8:
                e23.a aVar16 = (e23.a) obj;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                aVar16.getClass();
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= mVar9.r(aVar16) ? 4 : 2;
                }
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 19) != 18)) {
                    x1 x1Var9 = n.f135158a;
                    c1 c1Var8 = c1.f110940a;
                    int i28 = iIntValue9 & 14;
                    boolean zR9 = mVar9.r(context) | (i28 == 4);
                    Object objQ17 = mVar9.q();
                    if (zR9) {
                        objQ17 = new gp.h(aVar16, context, 6);
                        mVar9.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new gp.h(aVar16, context, 6);
                            mVar9.K(objQ17);
                        }
                    }
                    e23.a<Unit> aVar17 = (e23.a) objQ17;
                    z14 = i28 == 4;
                    Object objQ18 = mVar9.q();
                    if (z14) {
                        objQ18 = new x(aVar16, 17);
                        mVar9.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            objQ18 = new x(aVar16, 17);
                            mVar9.K(objQ18);
                        }
                    }
                    c1Var8.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar17, "Cancel", (e23.a) objQ18, mVar9, 805503414, 0, 216);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 9:
                e23.a aVar18 = (e23.a) obj;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                aVar18.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar10.r(aVar18) ? 4 : 2;
                }
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var10 = n.f135158a;
                    c1 c1Var9 = c1.f110940a;
                    int i29 = iIntValue10 & 14;
                    boolean zR10 = mVar10.r(context) | (i29 == 4);
                    Object objQ19 = mVar10.q();
                    if (zR10) {
                        objQ19 = new gp.h(aVar18, context, 11);
                        mVar10.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new gp.h(aVar18, context, 11);
                            mVar10.K(objQ19);
                        }
                    }
                    e23.a<Unit> aVar19 = (e23.a) objQ19;
                    z14 = i29 == 4;
                    Object objQ20 = mVar10.q();
                    if (z14) {
                        objQ20 = new x(aVar18, 22);
                        mVar10.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new x(aVar18, 22);
                            mVar10.K(objQ20);
                        }
                    }
                    c1Var9.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar19, "Cancel", (e23.a) objQ20, mVar10, 805503414, 0, 216);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 10:
                e23.a aVar20 = (e23.a) obj;
                p3.m mVar11 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                aVar20.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar11.r(aVar20) ? 4 : 2;
                }
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var11 = n.f135158a;
                    c1 c1Var10 = c1.f110940a;
                    int i30 = iIntValue11 & 14;
                    boolean zR11 = mVar11.r(context) | (i30 == 4);
                    Object objQ21 = mVar11.q();
                    if (zR11) {
                        objQ21 = new gp.h(aVar20, context, 9);
                        mVar11.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            objQ21 = new gp.h(aVar20, context, 9);
                            mVar11.K(objQ21);
                        }
                    }
                    e23.a<Unit> aVar21 = (e23.a) objQ21;
                    z14 = i30 == 4;
                    Object objQ22 = mVar11.q();
                    if (z14) {
                        objQ22 = new x(aVar20, 20);
                        mVar11.K(objQ22);
                    } else {
                        aVar.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            objQ22 = new x(aVar20, 20);
                            mVar11.K(objQ22);
                        }
                    }
                    c1Var10.a(false, "Delete Item?", "Are you sure you want to delete this item?", null, null, "Delete", false, false, aVar21, "Cancel", (e23.a) objQ22, mVar11, 805503414, 0, 216);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 11:
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                    x1 x1Var12 = n.f135158a;
                    y3 y3Var = p7.f89282d;
                    g6.f.f75994b.getClass();
                    v.a(y3Var.c(g6.f.a(g6.f.f75996d)), z3.f.c(-682342848, new br2.a(context, 15), mVar12), mVar12, 56);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 12:
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue13 = ((Integer) obj3).intValue();
                ((t2) obj).getClass();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                    x1 x1Var13 = n.f135158a;
                    r.a aVar22 = r.S;
                    r rVarF = x2.f(aVar22, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.g gVar = c2.j.f22698h;
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(gVar, h4.d.a.f81534l, mVar13, 54);
                    int iHashCode2 = Long.hashCode(mVar13.getU());
                    i2 i2VarX2 = mVar13.x();
                    r rVarC2 = h4.k.c(rVarF, mVar13);
                    h5.g.V.getClass();
                    e0.a aVar23 = h5.g.a.f81805b;
                    if (mVar13.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar13.z();
                    if (mVar13.getT()) {
                        mVar13.M(aVar23);
                    } else {
                        mVar13.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, s2VarA, mVar13);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar13);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar13.getT()) {
                        th3 = null;
                    } else {
                        th3 = null;
                        if (!s.g(mVar13.q(), Integer.valueOf(iHashCode2))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC2, mVar13);
                        u2Var = u2.f22900a;
                        r rVarA = u2Var.a(aVar22, 0.5f, true);
                        zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar13, 0);
                        iHashCode = Long.hashCode(mVar13.getU());
                        i2VarX = mVar13.x();
                        rVarC = h4.k.c(rVarA, mVar13);
                        if (mVar13.F() != null) {
                            p0.l();
                            throw th3;
                        }
                        mVar13.z();
                        if (mVar13.getT()) {
                            mVar13.M(aVar23);
                        } else {
                            mVar13.c();
                        }
                        b4.c(eVar, zVarA, mVar13);
                        b4.c(c1623g, i2VarX, mVar13);
                        if (mVar13.getT() || !s.g(mVar13.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar13, iHashCode, bVar);
                        }
                        b4.c(fVar, rVarC, mVar13);
                        b0 b0Var = b0.f22601a;
                        String strQ2 = y.Q(mVar13, R.string.lbl_pace);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0Var = j92.f.f97932i;
                        mh.c(strQ2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), mVar13), mVar13, 0, 0, 131070);
                        strQ = y.Q(mVar13, R.string.lbl_minute_100_meters);
                        zB = mVar13.B(strQ) | mVar13.r(context);
                        objQ = mVar13.q();
                        if (zB) {
                            objQ = new a42.b(strQ, context, 15);
                            mVar13.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new a42.b(strQ, context, 15);
                                mVar13.K(objQ);
                            }
                        }
                        mh.c(strQ, p5.v.b(aVar22, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(x0Var), mVar13), mVar13, 0, 0, 131068);
                        mVar13.y();
                        mh.c(y.Q(mVar13, R.string.txt_date), u2Var.a(aVar22, 0.5f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var), mVar13), mVar13, 0, 0, 131068);
                        mVar13.y();
                    }
                    v.h.z(iHashCode2, mVar13, iHashCode2, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar13);
                    u2Var = u2.f22900a;
                    r rVarA2 = u2Var.a(aVar22, 0.5f, true);
                    zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, mVar13, 0);
                    iHashCode = Long.hashCode(mVar13.getU());
                    i2VarX = mVar13.x();
                    rVarC = h4.k.c(rVarA2, mVar13);
                    if (mVar13.F() != null) {
                        p0.l();
                        throw th3;
                    }
                    mVar13.z();
                    if (mVar13.getT()) {
                        mVar13.M(aVar23);
                    } else {
                        mVar13.c();
                    }
                    b4.c(eVar, zVarA, mVar13);
                    b4.c(c1623g, i2VarX, mVar13);
                    if (mVar13.getT()) {
                        v.h.z(iHashCode, mVar13, iHashCode, bVar);
                    } else {
                        v.h.z(iHashCode, mVar13, iHashCode, bVar);
                    }
                    b4.c(fVar, rVarC, mVar13);
                    b0 b0Var2 = b0.f22601a;
                    String strQ3 = y.Q(mVar13, R.string.lbl_pace);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97932i;
                    mh.c(strQ3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var2), mVar13), mVar13, 0, 0, 131070);
                    strQ = y.Q(mVar13, R.string.lbl_minute_100_meters);
                    zB = mVar13.B(strQ) | mVar13.r(context);
                    objQ = mVar13.q();
                    if (zB) {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a42.b(strQ, context, 15);
                            mVar13.K(objQ);
                        }
                    } else {
                        objQ = new a42.b(strQ, context, 15);
                        mVar13.K(objQ);
                    }
                    mh.c(strQ, p5.v.b(aVar22, (e23.l) objQ), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(d92.c.e(x0Var2), mVar13), mVar13, 0, 0, 131068);
                    mVar13.y();
                    mh.c(y.Q(mVar13, R.string.txt_date), u2Var.a(aVar22, 0.5f, true), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(x0Var2), mVar13), mVar13, 0, 0, 131068);
                    mVar13.y();
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            default:
                h82.r rVar2 = (h82.r) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue14 = ((Integer) obj3).intValue();
                int i34 = p.f161567f;
                rVar2.getClass();
                if ((iIntValue14 & 6) == 0) {
                    iIntValue14 |= mVar14.B(rVar2) ? 4 : 2;
                }
                if (mVar14.n(iIntValue14 & 1, (iIntValue14 & 19) != 18)) {
                    x1 x1Var14 = n.f135158a;
                    int i35 = (iIntValue14 << 3) & 112;
                    rVar2.D(R.string.training_readiness, mVar14, i35);
                    int i36 = i35 | 6;
                    rVar2.j(z3.f.c(-1409478639, new sm1.j(rVar2, 8), mVar14), mVar14, i36);
                    rVar2.j(z3.f.c(2144357832, new c70.b(rVar2, context, 7), mVar14), mVar14, i36);
                    rVar2.j(z3.f.c(-597522103, new sm1.j(rVar2, 9), mVar14), mVar14, i36);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }
}
