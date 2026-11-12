package at1;

import a03.h0;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.proto.generated.GDIInReachMessaging;
import e23.p;
import gw0.t;
import h4.r;
import h5.e0;
import i3.m8;
import i3.mh;
import i3.ve;
import l72.f0;
import l72.i3;
import lc.u0;
import o4.m1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.a2;
import u1.w;
import v62.e5;
import v62.fa;
import v62.s6;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f12772b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f12773c;

    public /* synthetic */ f(e23.a aVar, e23.a aVar2, int i14) {
        this.f12771a = i14;
        this.f12772b = aVar;
        this.f12773c = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:196:0x0792  */
    /* JADX WARN: Code duplicated, block: B:201:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:230:0x0965  */
    /* JADX WARN: Code duplicated, block: B:235:0x099f  */
    /* JADX WARN: Code duplicated, block: B:60:0x0230  */
    /* JADX WARN: Code duplicated, block: B:65:0x0276  */
    /* JADX WARN: Code duplicated, block: B:88:0x031f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0359  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12771a;
        p3.m.a aVar = p3.m.f135153a;
        e23.a aVar2 = this.f12772b;
        e23.a aVar3 = this.f12773c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                dh.b.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                lg.d.g(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    k2.h hVarA = k2.i.a(j92.b.f97900c.f97911c);
                    long jA = d92.b.a(mVar).c().a();
                    i3.a.f87402a.getClass();
                    ve.a(null, hVarA, jA, 0L, i3.a.f87403b, 0.0f, null, z3.f.c(1797269894, new f(aVar2, aVar3, 4), mVar), mVar, 12582912, 105);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                i.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r.a aVar4 = r.S;
                    r rVarF = x2.f(aVar4, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = eVar.f97920e;
                    float f15 = eVar.f97921f;
                    r rVarZ = c2.l.z(rVarF, f15, f14);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar5 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    z zVarA = y.a(c2.j.f22694d, aVar5, mVar2, 48);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    r rVarC = h4.k.c(rVarZ, mVar2);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar6);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    b0 b0Var = b0.f22601a;
                    s62.a.f157643a.getClass();
                    g02.i.a(null, fa.a(t62.b.f162798a), u0.f(mVar2), d92.b.a(mVar2).e().g(), j92.b.f97901d.f97906e, 0.0f, null, mVar2, 0, 225);
                    c2.l.f(x2.h(aVar4, eVar.f97920e), mVar2);
                    String strQ = gl1.y.Q(mVar2, R.string.photo_upload_issue);
                    d92.b.f58624b.getClass();
                    mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), mVar2), mVar2, 0, 0, 131070);
                    c2.l.f(x2.h(aVar4, eVar.f97918c), mVar2);
                    mh.c(gl1.y.Q(mVar2, R.string.some_photos_didnt_upload), null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar2), mVar2, 0, 0, 131070);
                    c2.l.f(x2.h(aVar4, f15), mVar2);
                    f0.a aVar7 = f0.a.f111000a;
                    String strQ2 = gl1.y.Q(mVar2, R.string.review_edit_menu_item);
                    boolean zB = mVar2.B(aVar2);
                    Object objQ = mVar2.q();
                    if (zB) {
                        objQ = new as.n(aVar2, 9);
                        mVar2.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new as.n(aVar2, 9);
                            mVar2.K(objQ);
                        }
                    }
                    aVar7.f(strQ2, null, false, (e23.a) objQ, mVar2, 0, 6);
                    c2.l.f(x2.h(aVar4, f15), mVar2);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_close);
                    boolean zB2 = mVar2.B(aVar3);
                    Object objQ2 = mVar2.q();
                    if (zB2) {
                        objQ2 = new as.n(aVar3, 10);
                        mVar2.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new as.n(aVar3, 10);
                            mVar2.K(objQ2);
                        }
                    }
                    aVar7.j(strQ3, null, false, (e23.a) objQ2, mVar2, 0, 6);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                c42.h.c(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                c42.h.d(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ4 = gl1.y.Q(mVar3, R.string.lbl_cycling_ability);
                    boolean zB3 = mVar3.B(aVar2);
                    Object objQ3 = mVar3.q();
                    if (zB3) {
                        objQ3 = new as.n(aVar2, 26);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new as.n(aVar2, 26);
                            mVar3.K(objQ3);
                        }
                    }
                    e23.a aVar8 = (e23.a) objQ3;
                    i53.f fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar3, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar3.B(aVar3);
                    Object objQ4 = mVar3.q();
                    if (zB4) {
                        objQ4 = new h0(aVar3, 13);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new h0(aVar3, 13);
                            mVar3.K(objQ4);
                        }
                    }
                    z02.f.d(strQ4, null, null, aVar8, fVarA, null, (e23.l) objQ4, mVar3, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                jg.b.d(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                lg.d.h(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ds.j.d(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                dv0.r.a(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 12:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    String strQ5 = gl1.y.Q(mVar4, R.string.lbl_activity_recording);
                    i53.f fVarA2 = i53.a.a(new i3("MENU_ITEM_NEXT", gl1.y.Q(mVar4, R.string.lbl_next), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB5 = mVar4.B(aVar3);
                    Object objQ5 = mVar4.q();
                    if (zB5) {
                        objQ5 = new h0(aVar3, 20);
                        mVar4.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new h0(aVar3, 20);
                            mVar4.K(objQ5);
                        }
                    }
                    z02.f.d(strQ5, null, null, this.f12772b, fVarA2, null, (e23.l) objQ5, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                o53.f0.h(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                gw0.j.f(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                gw0.j.k(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                gw0.j.l(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                t.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    ve.a(null, null, d92.b.a(mVar5).c().g(), 0L, 0.0f, 0.0f, null, z3.f.c(1884766300, new f(aVar2, aVar3, 19), mVar5), mVar5, 12582912, 123);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 19:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    r.a aVar9 = r.S;
                    r rVarF2 = x2.f(aVar9, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar6, 0);
                    int iHashCode2 = Long.hashCode(mVar6.getU());
                    i2 i2VarX2 = mVar6.x();
                    r rVarC2 = h4.k.c(rVarF2, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar10);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar6, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar6);
                    b0 b0Var2 = b0.f22601a;
                    String strQ6 = gl1.y.Q(mVar6, R.string.workout_lbl_duplicate);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    x0 x0VarB = d92.c.b(x0Var, mVar6);
                    r rVarD = w.d(x2.f(aVar9, 1.0f), false, null, null, this.f12772b, 15);
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    mh.c(strQ6, c2.l.y(rVarD, eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar6, 0, 0, 131068);
                    mh.c(gl1.y.Q(mVar6, R.string.lbl_delete), c2.l.y(w.d(x2.f(aVar9, 1.0f), false, null, null, this.f12773c, 15), eVar2.f97920e), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(x0Var, mVar6), mVar6, 0, 0, 131068);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                gl1.y.e(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    r rVarB = a2.b(x2.d(r.S, 1.0f), a2.a(mVar7), true);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    r rVarY = c2.l.y(rVarB, eVar3.f97921f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar11 = h4.d.a.f81537o;
                    c2.j jVar = c2.j.f22691a;
                    float f16 = eVar3.f97922g;
                    jVar.getClass();
                    z zVarA3 = y.a(c2.j.i(f16), aVar11, mVar7, 48);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    r rVarC3 = h4.k.c(rVarY, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar12);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar7);
                    b0 b0Var3 = b0.f22601a;
                    String strQ7 = gl1.y.Q(mVar7, R.string.pacepro_lbl_choose_course_distance);
                    d92.b.f58624b.getClass();
                    x0 x0VarF = d92.c.f(j92.f.f97931h, mVar7);
                    d6.h.f57752b.getClass();
                    mh.c(strQ7, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar7, 0, 0, 130046);
                    i51.h.b(0, aVar2, gl1.y.Q(mVar7, R.string.pacepro_lbl_select_course), mVar7, y62.a.a(e5.f175862a));
                    i51.h.a(0, aVar3, gl1.y.Q(mVar7, R.string.pacepro_lbl_select_race_distance), mVar7);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ8 = gl1.y.Q(mVar8, R.string.device_settings_pulse_ox);
                    boolean zB6 = mVar8.B(aVar2);
                    Object objQ6 = mVar8.q();
                    if (zB6) {
                        objQ6 = new gt1.s(aVar2, 29);
                        mVar8.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new gt1.s(aVar2, 29);
                            mVar8.K(objQ6);
                        }
                    }
                    e23.a aVar13 = (e23.a) objQ6;
                    i53.f fVarA3 = i53.a.a(new i3("MENU_ITEM_HELP_PULSE_OX", gl1.y.Q(mVar8, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                    boolean zB7 = mVar8.B(aVar3);
                    Object objQ7 = mVar8.q();
                    if (zB7) {
                        objQ7 = new m8(aVar3, 4);
                        mVar8.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new m8(aVar3, 4);
                            mVar8.K(objQ7);
                        }
                    }
                    z02.f.d(strQ8, null, null, aVar13, fVarA3, null, (e23.l) objQ7, mVar8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                jl1.f.b(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                jv0.g.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                kh0.i.a(aVar2, aVar3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ky0.r.b(aVar2, aVar3, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 27:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ9 = gl1.y.Q(mVar9, R.string.golf_downloaded_courses_component_title);
                    boolean zB8 = mVar9.B(aVar2);
                    Object objQ8 = mVar9.q();
                    if (zB8) {
                        objQ8 = new ll0.a(aVar2, 0);
                        mVar9.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new ll0.a(aVar2, 0);
                            mVar9.K(objQ8);
                        }
                    }
                    e23.a aVar14 = (e23.a) objQ8;
                    String strQ10 = gl1.y.Q(mVar9, R.string.lbl_plus);
                    s62.a.f157643a.getClass();
                    i53.f fVarA4 = i53.a.a(new i3("MENU_ITEM_PLUS", strQ10, false, s6.a(t62.b.f162798a), (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zB9 = mVar9.B(aVar3);
                    Object objQ9 = mVar9.q();
                    if (zB9) {
                        objQ9 = new m8(aVar3, 16);
                        mVar9.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new m8(aVar3, 16);
                            mVar9.K(objQ9);
                        }
                    }
                    z02.f.d(strQ9, null, null, aVar14, fVarA4, null, (e23.l) objQ9, mVar9, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    f0 f0Var = f0.f110999a;
                    String strQ11 = gl1.y.Q(mVar10, R.string.train_for_event);
                    r.a aVar15 = r.S;
                    r rVarF3 = x2.f(aVar15, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f0Var.i(strQ11, c2.l.C(rVarF3, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7), false, this.f12772b, mVar10, 0, 4);
                    f0Var.d(384, 9, this.f12773c, x2.f(aVar15, 1.0f), gl1.y.Q(mVar10, R.string.lbl_common_continue), mVar10, null, false);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    r.a aVar16 = r.S;
                    r rVarE = u1.n.e(x2.d(aVar16, 1.0f), vb.h.e(d92.b.f58623a, mVar11), m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar17 = h4.d.a.f81536n;
                    z zVarA4 = y.a(kVar2, aVar17, mVar11, 0);
                    int iHashCode4 = Long.hashCode(mVar11.getU());
                    i2 i2VarX4 = mVar11.x();
                    r rVarC4 = h4.k.c(rVarE, mVar11);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar18);
                    } else {
                        mVar11.c();
                    }
                    h5.g.a.e eVar4 = h5.g.a.f81810g;
                    b4.c(eVar4, zVarA4, mVar11);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX4, mVar11);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar11, iHashCode4, bVar4);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC4, mVar11);
                    r rVarA = b0.f22601a.a(a2.b(aVar16, a2.a(mVar11), true), 1.0f, true);
                    z zVarA5 = y.a(kVar2, aVar17, mVar11, 0);
                    int iHashCode5 = Long.hashCode(mVar11.getU());
                    i2 i2VarX5 = mVar11.x();
                    r rVarC5 = h4.k.c(rVarA, mVar11);
                    if (mVar11.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar11.z();
                    if (mVar11.getT()) {
                        mVar11.M(aVar18);
                    } else {
                        mVar11.c();
                    }
                    b4.c(eVar4, zVarA5, mVar11);
                    b4.c(c1623g, i2VarX5, mVar11);
                    if (mVar11.getT() || !s.g(mVar11.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar11, iHashCode5, bVar4);
                    }
                    b4.c(fVar, rVarC5, mVar11);
                    d92.b.f58625c.getClass();
                    r rVarY2 = c2.l.y(aVar16, j92.b.f97899b.f97920e);
                    String strQ12 = gl1.y.Q(mVar11, R.string.msg_atp_terms_and_conditions);
                    d92.b.f58624b.getClass();
                    mh.c(strQ12, rVarY2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar11), mVar11, 0, 0, 131068);
                    mVar11.y();
                    b82.c.b(null, null, z3.f.c(-2083698550, new ll1.g(aVar2, 4), mVar11), z3.f.c(311352267, new ll1.g(aVar3, 5), mVar11), b82.c.d(mVar11), mVar11, 3456, 3);
                    mVar11.y();
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(e23.a aVar, e23.a aVar2, int i14, int i15) {
        this.f12771a = i15;
        this.f12772b = aVar;
        this.f12773c = aVar2;
    }
}
