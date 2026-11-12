package mw1;

import android.content.Context;
import android.graphics.Bitmap;
import b21.v4;
import c2.a0;
import c2.j;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import com.airbnb.lottie.LottieDrawable;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.courses.model.h;
import com.garmin.android.apps.connectmobile.group.details.about.member.GroupDetailMemberListFragment;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i;
import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.garmin.proto.generated.GDIInReachMessaging;
import cw1.e1;
import e23.l;
import e23.p;
import e23.q;
import gg1.o0;
import gl1.y;
import h4.k;
import h4.r;
import h5.e0;
import h5.g;
import i3.h1;
import i3.m8;
import i3.mh;
import i3.v5;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import l72.i3;
import lc.v;
import n02.f;
import nc.s;
import nw0.d0;
import o53.b0;
import ok2.f0;
import ok2.g0;
import org.joda.time.DateTime;
import ov1.o;
import ov1.w;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.p1;
import p3.x1;
import p40.x;
import s1.a1;
import s5.x0;
import u1.y0;
import x5.l0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121295d;

    public /* synthetic */ b(f fVar, r rVar, l lVar, int i14) {
        this.f121292a = 3;
        this.f121294c = fVar;
        this.f121293b = rVar;
        this.f121295d = lVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0435  */
    /* JADX WARN: Code duplicated, block: B:104:0x043e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0442  */
    /* JADX WARN: Code duplicated, block: B:110:0x045f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0484  */
    /* JADX WARN: Code duplicated, block: B:115:0x048d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0491  */
    /* JADX WARN: Code duplicated, block: B:121:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:124:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:125:0x04df  */
    /* JADX WARN: Code duplicated, block: B:128:0x04fe  */
    /* JADX WARN: Code duplicated, block: B:129:0x0509  */
    /* JADX WARN: Code duplicated, block: B:132:0x053c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0556  */
    /* JADX WARN: Code duplicated, block: B:135:0x0563  */
    /* JADX WARN: Code duplicated, block: B:137:0x058d  */
    /* JADX WARN: Code duplicated, block: B:139:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:141:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:143:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:145:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:147:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:151:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:169:0x061e  */
    /* JADX WARN: Code duplicated, block: B:174:0x065e  */
    /* JADX WARN: Code duplicated, block: B:190:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:195:0x070d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0793  */
    /* JADX WARN: Code duplicated, block: B:235:0x084d  */
    /* JADX WARN: Code duplicated, block: B:264:0x0948  */
    /* JADX WARN: Code duplicated, block: B:29:0x0129  */
    /* JADX WARN: Code duplicated, block: B:31:0x0132  */
    /* JADX WARN: Code duplicated, block: B:32:0x0136  */
    /* JADX WARN: Code duplicated, block: B:37:0x0153  */
    /* JADX WARN: Code duplicated, block: B:40:0x017d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0186  */
    /* JADX WARN: Code duplicated, block: B:43:0x018a  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:51:0x021a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0223  */
    /* JADX WARN: Code duplicated, block: B:54:0x0227  */
    /* JADX WARN: Code duplicated, block: B:59:0x0244  */
    /* JADX WARN: Code duplicated, block: B:62:0x0253  */
    /* JADX WARN: Code duplicated, block: B:63:0x0256  */
    /* JADX WARN: Code duplicated, block: B:65:0x0259  */
    /* JADX WARN: Code duplicated, block: B:67:0x026e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0314  */
    /* JADX WARN: Code duplicated, block: B:76:0x034e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0357  */
    /* JADX WARN: Code duplicated, block: B:79:0x035b  */
    /* JADX WARN: Code duplicated, block: B:82:0x036a  */
    /* JADX WARN: Code duplicated, block: B:84:0x0378  */
    /* JADX WARN: Code duplicated, block: B:87:0x0384  */
    /* JADX WARN: Code duplicated, block: B:88:0x03a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:92:0x03db  */
    /* JADX WARN: Code duplicated, block: B:96:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:98:0x0405  */
    /* JADX WARN: Code duplicated, block: B:99:0x0409  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        g0 g0VarC;
        p1 p1Var;
        m.a aVar;
        g.a.f fVar;
        h4.g.b bVar;
        j.C0343j c0343j;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        r rVarC;
        z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        r rVarC2;
        String str;
        String str2;
        com.garmin.android.apps.connectmobile.courses.model.f fVar2;
        s2 s2VarA2;
        int iHashCode3;
        i2 i2VarX3;
        r rVarC3;
        h hVar;
        u4.d dVarB;
        x0 x0Var;
        r.a aVar2;
        s2 s2VarA3;
        int iHashCode4;
        i2 i2VarX4;
        r rVarC4;
        float f14;
        s2 s2VarA4;
        int iHashCode5;
        i2 i2VarX5;
        r rVarC5;
        z zVarA2;
        int iHashCode6;
        i2 i2VarX6;
        r rVarC6;
        int i14;
        Object objQ;
        m.a.C2565a c2565a;
        int i15;
        p1 p1Var2;
        Object objQ2;
        p1 p1Var3;
        int i16 = this.f121292a;
        int i17 = 21;
        int i18 = 9;
        m.a aVar3 = m.f135153a;
        Object obj3 = this.f121295d;
        Object obj4 = this.f121294c;
        Object obj5 = this.f121293b;
        switch (i16) {
            case 0:
                ((Integer) obj2).getClass();
                c.b((r) obj5, (lw1.g) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                c.a((r) obj5, (u4.d) obj4, (String) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                mx.g.d((a0) obj5, (String) obj4, (gx.b) obj3, (m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                n02.e.a((f) obj4, (r) obj5, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                n21.e.a((l0) obj4, (l) obj3, (r) obj5, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                n40.a.a((com.garmin.android.apps.connectmobile.courses.model.b) obj5, (com.garmin.android.apps.connectmobile.courses.model.b) obj4, (p) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                n62.b.a((String) obj5, (zc.d) obj4, (l) obj3, (m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                gl1.d.c((v) obj5, (d4.c) obj4, (z3.e) obj3, (m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 8:
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ge1.b.T((b0) obj5, null, null, new s.a(fFloatValue, (a1) obj4, (v) obj3, null), 3);
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                nc1.c.a((dc1.f) obj5, (DateTime) obj4, (DateTime) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                nf1.h.b((Context) obj5, (if1.c) obj4, (of1.a) obj3, (m) obj, p0.t(65));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                ng0.b bVar2 = ng0.b.f125905a;
                ((ng0.b) obj5).a((mg0.a) obj4, (q) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                d0.a((e23.a) obj5, (gk1.b) obj4, (gk1.b) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.J((i) obj5, (z3.e) obj4, (z3.e) obj3, (m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 14:
                h82.r rVar = (h82.r) obj5;
                o81.a aVar4 = (o81.a) obj4;
                Context context = (Context) obj3;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i19 = o81.a.f130834f;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    rVar.t(R.string.lbl_hill_score_factors, mVar, 0);
                    rVar.o(R.string.msg_hill_score_following_factors_v2, 0, 2, null, mVar);
                    rVar.g(z3.f.c(-1855382295, new c70.b(rVar, aVar4, context, 3), mVar), mVar, 6);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ok0.e.a((ok0.m) obj5, (o0) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                f0 f0Var = (f0) obj5;
                r0 r0Var = (r0) obj4;
                l lVar = (l) obj3;
                al2.b bVar3 = (al2.b) obj;
                CoreTransferException coreTransferException = (CoreTransferException) obj2;
                bVar3.getClass();
                al2.b bVar4 = al2.b.STARTED;
                ok2.g gVar = f0Var.f132675a;
                if (bVar3 == bVar4) {
                    g0VarC = gVar.c();
                    if (g0VarC == null) {
                        g0VarC = g0.AUTOMATIC_ALLOWED;
                    }
                } else {
                    g0VarC = gVar.c();
                    if (g0VarC == null) {
                        g0VarC = (g0) r0Var.f105810a;
                    }
                }
                g0 g0Var = g0VarC;
                Object obj6 = r0Var.f105810a;
                if (obj6 == g0Var) {
                    gVar.f132688g.info("requestUserSync(" + obj6 + ") - " + bVar3 + " - " + coreTransferException);
                } else {
                    gVar.f132688g.info("requestUserSync(" + obj6 + ") - " + g0Var + " - " + bVar3 + " - " + coreTransferException);
                }
                al2.f.a aVar5 = al2.f.f3791c;
                v4 v4Var = new v4(lVar, f0Var, g0Var, bVar3, coreTransferException, 24);
                aVar5.getClass();
                al2.f.a.a(v4Var);
                return Unit.INSTANCE;
            case 17:
                zc.d dVar = (zc.d) obj5;
                GroupDetailMemberListFragment groupDetailMemberListFragment = (GroupDetailMemberListFragment) obj4;
                p1 p1Var4 = (p1) obj3;
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    boolean zBooleanValue = ((Boolean) p1Var4.getF182175a()).booleanValue();
                    boolean zR = mVar2.r(dVar) | mVar2.r(groupDetailMemberListFragment);
                    Object objQ3 = mVar2.q();
                    if (zR) {
                        objQ3 = new nw0.p(dVar, i18, groupDetailMemberListFragment, p1Var4);
                        mVar2.K(objQ3);
                    } else {
                        aVar3.getClass();
                        if (objQ3 == m.a.f135155b) {
                            objQ3 = new nw0.p(dVar, i18, groupDetailMemberListFragment, p1Var4);
                            mVar2.K(objQ3);
                        }
                    }
                    m3.l.b(zBooleanValue, (e23.a) objQ3, null, null, null, null, z3.f.c(-884235184, new o72.b(3, dVar, groupDetailMemberListFragment), mVar2), mVar2, 1572864, 60);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 18:
                Context context2 = (Context) obj5;
                ot.l lVar2 = (ot.l) obj4;
                LottieDrawable lottieDrawable = (LottieDrawable) obj3;
                String str3 = (String) obj;
                String str4 = (String) obj2;
                int i24 = ot.l.f133614q;
                str3.getClass();
                str4.getClass();
                try {
                    bu.f.f21180a.getClass();
                    Bitmap bitmapD = bu.f.d(context2, lVar2, str4);
                    if (lottieDrawable != null) {
                        lottieDrawable.updateBitmap(str3, bitmapD);
                    }
                    break;
                } catch (Exception e4) {
                    String simpleName = lVar2.getClass().getSimpleName();
                    String message = e4.getMessage();
                    StringBuilder sbI = p6.b.i("Error occurred when setting bitmap with file name ", str4, " for chapter ", simpleName, ". Message = ");
                    sbI.append(message);
                    String string = sbI.toString();
                    com.garmin.android.apps.connectmobile.i2.a aVar6 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar6.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "AnnualReportChapter", string);
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                ov1.c.a aVar7 = ov1.c.f134143b;
                ((ov1.c) obj5).u6((ArrayList) obj4, (e23.a) obj3, (m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ov1.f.a aVar8 = ov1.f.f134159c;
                ((ov1.f) obj5).u6((ArrayList) obj4, (e23.a) obj3, (m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 21:
                ov1.l lVar3 = (ov1.l) obj5;
                vt1.h hVar2 = (vt1.h) obj4;
                String str5 = (String) obj3;
                m mVar3 = (m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ov1.l.a aVar9 = ov1.l.f134184c;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = n.f135158a;
                    vt1.h.a aVar10 = vt1.h.f180113e;
                    boolean zO5 = lVar3.u6().o5();
                    aVar10.getClass();
                    List listB = vt1.h.a.b(zO5);
                    if (!listB.contains(hVar2)) {
                        hVar2 = vt1.h.NONE;
                    }
                    vt1.h hVar3 = hVar2;
                    r rVarD = x2.d(r.S, 1.0f);
                    boolean zR2 = mVar3.r(lVar3);
                    Object objQ4 = mVar3.q();
                    if (zR2) {
                        objQ4 = new nw0.f(lVar3, i17);
                        mVar3.K(objQ4);
                    } else {
                        aVar3.getClass();
                        if (objQ4 == m.a.f135155b) {
                            objQ4 = new nw0.f(lVar3, i17);
                            mVar3.K(objQ4);
                        }
                    }
                    e1.a(rVarD, str5, listB, hVar3, (l) objQ4, false, 0, 0, mVar3, 6, 224);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                w.a aVar11 = w.f134236b;
                ((w) obj5).u6((ArrayList) obj4, (e23.a) obj3, (m) obj, p0.t(433));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                ox.a.a((bx.a) obj5, (DateTime) obj4, (ix.j) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 24:
                e23.a aVar12 = (e23.a) obj5;
                q21.a aVar13 = (q21.a) obj4;
                e23.a aVar14 = (e23.a) obj3;
                m mVar4 = (m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = n.f135158a;
                    String strQ = y.Q(mVar4, R.string.meal_calorie_goals);
                    b3.b.a aVar15 = b3.b.a.f15503a;
                    u4.d dVarA = d3.h.a();
                    i53.f fVarA = i53.a.a(new i3("DONE", y.Q(mVar4, R.string.lbl_done), aVar13.f142209h, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB = mVar4.B(aVar14);
                    Object objQ5 = mVar4.q();
                    if (zB) {
                        objQ5 = new m8(aVar14, i17);
                        mVar4.K(objQ5);
                    } else {
                        aVar3.getClass();
                        if (objQ5 == m.a.f135155b) {
                            objQ5 = new m8(aVar14, i17);
                            mVar4.K(objQ5);
                        }
                    }
                    z02.f.d(strQ, null, dVarA, aVar12, fVarA, null, (l) objQ5, mVar4, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 25:
                q21.d dVar2 = (q21.d) obj5;
                e23.a aVar16 = (e23.a) obj4;
                p pVar = (p) obj3;
                m mVar5 = (m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = n.f135158a;
                    b11.g.a aVar17 = b11.g.f14285c;
                    String str6 = dVar2.f142225b;
                    aVar17.getClass();
                    String strA = b11.g.a.a(str6, mVar5);
                    b3.b.a aVar18 = b3.b.a.f15503a;
                    u4.d dVarA2 = d3.h.a();
                    boolean zB2 = mVar5.B(aVar16);
                    Object objQ6 = mVar5.q();
                    if (zB2) {
                        objQ6 = new o(aVar16, 9);
                        mVar5.K(objQ6);
                    } else {
                        aVar3.getClass();
                        if (objQ6 == m.a.f135155b) {
                            objQ6 = new o(aVar16, 9);
                            mVar5.K(objQ6);
                        }
                    }
                    e23.a aVar19 = (e23.a) objQ6;
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", y.Q(mVar5, R.string.lbl_done), dVar2.f142232i, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB3 = mVar5.B(pVar) | mVar5.r(dVar2);
                    Object objQ7 = mVar5.q();
                    if (zB3) {
                        objQ7 = new o50.a(17, pVar, dVar2);
                        mVar5.K(objQ7);
                    } else {
                        aVar3.getClass();
                        if (objQ7 == m.a.f135155b) {
                            objQ7 = new o50.a(17, pVar, dVar2);
                            mVar5.K(objQ7);
                        }
                    }
                    z02.f.d(strA, null, dVarA2, aVar19, fVarA2, null, (l) objQ7, mVar5, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 26:
                e23.a aVar20 = (e23.a) obj5;
                q21.p pVar2 = (q21.p) obj4;
                e23.a aVar21 = (e23.a) obj3;
                m mVar6 = (m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = n.f135158a;
                    String strQ2 = y.Q(mVar6, R.string.meal_windows);
                    boolean zB4 = mVar6.B(aVar20);
                    Object objQ8 = mVar6.q();
                    if (zB4) {
                        objQ8 = new o(aVar20, 10);
                        mVar6.K(objQ8);
                    } else {
                        aVar3.getClass();
                        if (objQ8 == m.a.f135155b) {
                            objQ8 = new o(aVar20, 10);
                            mVar6.K(objQ8);
                        }
                    }
                    e23.a aVar22 = (e23.a) objQ8;
                    i53.f fVarA3 = i53.a.a(new i3("SAVE", y.Q(mVar6, R.string.lbl_save), pVar2.f142273e, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB5 = mVar6.B(aVar21);
                    Object objQ9 = mVar6.q();
                    if (zB5) {
                        objQ9 = new m8(aVar21, 22);
                        mVar6.K(objQ9);
                    } else {
                        aVar3.getClass();
                        if (objQ9 == m.a.f135155b) {
                            objQ9 = new m8(aVar21, 22);
                            mVar6.K(objQ9);
                        }
                    }
                    z02.f.d(strQ2, null, null, aVar22, fVarA3, null, (l) objQ9, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 86);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 27:
                q40.a aVar23 = (q40.a) obj5;
                p1 p1Var5 = (p1) obj4;
                p1 p1Var6 = (p1) obj3;
                m mVar7 = (m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = n.f135158a;
                    r.a aVar24 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f15 = eVar.f97921f;
                    float f16 = eVar.f97918c;
                    r rVarB = c2.l.B(aVar24, f15, eVar.f97920e, f15, f16);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar25 = h4.d.a.f81536n;
                    z zVarA3 = c2.y.a(kVar, aVar25, mVar7, 0);
                    int iHashCode7 = Long.hashCode(mVar7.getU());
                    i2 i2VarX7 = mVar7.x();
                    r rVarC7 = k.c(rVarB, mVar7);
                    g.V.getClass();
                    e0.a aVar26 = g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar26);
                    } else {
                        mVar7.c();
                    }
                    g.a.e eVar2 = g.a.f81810g;
                    b4.c(eVar2, zVarA3, mVar7);
                    g.a.C1623g c1623g = g.a.f81809f;
                    b4.c(c1623g, i2VarX7, mVar7);
                    g.a.b bVar5 = g.a.f81813j;
                    if (mVar7.getT()) {
                        p1Var = p1Var6;
                        aVar = aVar3;
                    } else {
                        aVar = aVar3;
                        p1Var = p1Var6;
                        if (!p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode7))) {
                        }
                        fVar = g.a.f81807d;
                        b4.c(fVar, rVarC7, mVar7);
                        c2.b0 b0Var = c2.b0.f22601a;
                        bVar = h4.d.a.f81534l;
                        c0343j = j.f22692b;
                        s2VarA = q2.a(c0343j, bVar, mVar7, 48);
                        iHashCode = Long.hashCode(mVar7.getU());
                        i2VarX = mVar7.x();
                        rVarC = k.c(aVar24, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, s2VarA, mVar7);
                        b4.c(c1623g, i2VarX, mVar7);
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar7, iHashCode, bVar5);
                        }
                        b4.c(fVar, rVarC, mVar7);
                        r rVarA = u2.f22900a.a(aVar24, 1.0f, true);
                        zVarA = c2.y.a(kVar, aVar25, mVar7, 0);
                        iHashCode2 = Long.hashCode(mVar7.getU());
                        i2VarX2 = mVar7.x();
                        rVarC2 = k.c(rVarA, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, zVarA, mVar7);
                        b4.c(c1623g, i2VarX2, mVar7);
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar7, iHashCode2, bVar5);
                        }
                        b4.c(fVar, rVarC2, mVar7);
                        String str7 = aVar23.f142568b;
                        str = aVar23.f142573g;
                        str2 = aVar23.f142572f;
                        fVar2 = aVar23.f142569c;
                        d92.b.f58624b.getClass();
                        mh.c(str7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97930g, mVar7)), mVar7, 0, 0, 131070);
                        r rVarA2 = c2.l.A(aVar24, 0.0f, eVar.f97917b, 1);
                        s2VarA2 = q2.a(c0343j, bVar, mVar7, 48);
                        iHashCode3 = Long.hashCode(mVar7.getU());
                        i2VarX3 = mVar7.x();
                        rVarC3 = k.c(rVarA2, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, s2VarA2, mVar7);
                        b4.c(c1623g, i2VarX3, mVar7);
                        if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                            v.h.z(iHashCode3, mVar7, iHashCode3, bVar5);
                        }
                        b4.c(fVar, rVarC3, mVar7);
                        Set<com.garmin.android.apps.connectmobile.courses.model.f> set = u40.f.f168568a;
                        fVar2.getClass();
                        hVar = fVar2.f32928g;
                        if (hVar != null) {
                            dVarB = hVar.f32966b;
                        } else {
                            dVarB = null;
                        }
                        if (dVarB == null) {
                            mVar7.C(1989643751);
                            u4.d.b bVar6 = u4.d.f168373k;
                            dVarB = n5.e.b(fVar2.f32924c, mVar7, 6);
                        } else {
                            mVar7.C(1989643007);
                        }
                        mVar7.f();
                        u4.d dVar3 = dVarB;
                        g6.f.a aVar27 = g6.f.f75994b;
                        y0.b(dVar3, "", x2.q(aVar24, 18), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar7).f().d()), mVar7, 432, 56);
                        float f17 = eVar.f97918c;
                        float f18 = eVar.f97917b;
                        r rVarC8 = c2.l.C(aVar24, f17, f18, 0.0f, f18, 4);
                        String strB = x.b(fVar2, mVar7);
                        x0Var = j92.f.f97933j;
                        mh.c(strB, rVarC8, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar7), mVar7, 0, 0, 131068);
                        mVar7.y();
                        mVar7.y();
                        mh.c(aVar23.f142570d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131070);
                        mVar7.y();
                        if (!g22.n.d(str2) || g22.n.d(str)) {
                            mVar7.C(719733360);
                            r rVarC9 = c2.l.C(aVar24, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                            aVar2 = aVar24;
                            s2VarA3 = q2.a(j.i(f16), bVar, mVar7, 48);
                            iHashCode4 = Long.hashCode(mVar7.getU());
                            i2VarX4 = mVar7.x();
                            rVarC4 = k.c(rVarC9, mVar7);
                            if (mVar7.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar7.z();
                            if (mVar7.getT()) {
                                mVar7.M(aVar26);
                            } else {
                                mVar7.c();
                            }
                            b4.c(eVar2, s2VarA3, mVar7);
                            b4.c(c1623g, i2VarX4, mVar7);
                            if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode4))) {
                                v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                            }
                            b4.c(fVar, rVarC4, mVar7);
                            if (g22.n.d(str2)) {
                                mVar7.C(1730108987);
                                es1.c.a(null, y.P(R.string.rest_badge_format, new Object[]{str2}, mVar7), 0L, 0L, mVar7, 0, 13);
                                mVar7.f();
                            } else {
                                mVar7.C(1730238722);
                                mVar7.f();
                            }
                            if (g22.n.d(str)) {
                                mVar7.C(1730312471);
                                es1.c.a(null, y.P(R.string.cutoff_badge_format, new Object[]{str}, mVar7), 0L, 0L, mVar7, 0, 13);
                                mVar7.f();
                            } else {
                                mVar7.C(1730446050);
                                mVar7.f();
                            }
                            mVar7.y();
                            mVar7.f();
                        } else {
                            mVar7.C(720456993);
                            mVar7.f();
                            aVar2 = aVar24;
                        }
                        if (g22.n.d(aVar23.f142571e)) {
                            mVar7.C(720564873);
                            if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                                f14 = 0;
                            } else {
                                f14 = f16;
                            }
                            r rVarC10 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7);
                            s2VarA4 = q2.a(c0343j, h4.d.a.f81533k, mVar7, 0);
                            iHashCode5 = Long.hashCode(mVar7.getU());
                            i2VarX5 = mVar7.x();
                            rVarC5 = k.c(rVarC10, mVar7);
                            if (mVar7.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar7.z();
                            if (mVar7.getT()) {
                                mVar7.M(aVar26);
                            } else {
                                mVar7.c();
                            }
                            b4.c(eVar2, s2VarA4, mVar7);
                            b4.c(c1623g, i2VarX5, mVar7);
                            if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode5))) {
                                v.h.z(iHashCode5, mVar7, iHashCode5, bVar5);
                            }
                            b4.c(fVar, rVarC5, mVar7);
                            zVarA2 = c2.y.a(kVar, aVar25, mVar7, 0);
                            iHashCode6 = Long.hashCode(mVar7.getU());
                            i2VarX6 = mVar7.x();
                            rVarC6 = k.c(aVar2, mVar7);
                            if (mVar7.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar7.z();
                            if (mVar7.getT()) {
                                mVar7.M(aVar26);
                            } else {
                                mVar7.c();
                            }
                            b4.c(eVar2, zVarA2, mVar7);
                            b4.c(c1623g, i2VarX6, mVar7);
                            if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode6))) {
                                v.h.z(iHashCode6, mVar7, iHashCode6, bVar5);
                            }
                            b4.c(fVar, rVarC6, mVar7);
                            v5.a(0.0f, 6, 6, 0L, c2.l.A(aVar2, 0.0f, 12, 1), mVar7);
                            String str8 = aVar23.f142571e;
                            x0 x0VarF = d92.c.f(x0Var, mVar7);
                            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                                i14 = Integer.MAX_VALUE;
                            } else {
                                i14 = 2;
                            }
                            d6.p.f57793b.getClass();
                            int i25 = d6.p.f57795d;
                            r rVarA3 = r1.g0.a(aVar2, null, 3);
                            objQ = mVar7.q();
                            aVar.getClass();
                            c2565a = m.a.f135155b;
                            i15 = 11;
                            if (objQ == c2565a) {
                                p1Var2 = p1Var5;
                                objQ = new o72.i3(p1Var2, i15);
                                mVar7.K(objQ);
                            } else {
                                p1Var2 = p1Var5;
                            }
                            mh.c(str8, rVarA3, 0L, null, 0L, null, 0L, null, 0L, i25, false, i14, 0, (l) objQ, x0VarF, mVar7, 0, 1573248, 45052);
                            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                                mVar7.C(-29990506);
                                l2 l2VarC = c2.l.c(f16, 0.0f, 2);
                                r rVarB2 = x2.b(aVar2, 0.0f, 1, 1);
                                objQ2 = mVar7.q();
                                if (objQ2 == c2565a) {
                                    p1Var3 = p1Var;
                                    objQ2 = new om0.h(p1Var3, 13);
                                    mVar7.K(objQ2);
                                } else {
                                    p1Var3 = p1Var;
                                }
                                h1.c((e23.a) objQ2, rVarB2, false, null, null, null, l2VarC, null, z3.f.c(1246983685, new eb0.a(p1Var3, i15), mVar7), mVar7, 805306422, 380);
                                mVar7.f();
                            } else {
                                mVar7.C(-29346667);
                                mVar7.f();
                            }
                            mVar7.y();
                            mVar7.y();
                            mVar7.f();
                        } else {
                            mVar7.C(722310049);
                            mVar7.f();
                        }
                        mVar7.y();
                    }
                    v.h.z(iHashCode7, mVar7, iHashCode7, bVar5);
                    fVar = g.a.f81807d;
                    b4.c(fVar, rVarC7, mVar7);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    bVar = h4.d.a.f81534l;
                    c0343j = j.f22692b;
                    s2VarA = q2.a(c0343j, bVar, mVar7, 48);
                    iHashCode = Long.hashCode(mVar7.getU());
                    i2VarX = mVar7.x();
                    rVarC = k.c(aVar24, mVar7);
                    if (mVar7.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar26);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar2, s2VarA, mVar7);
                    b4.c(c1623g, i2VarX, mVar7);
                    if (mVar7.getT()) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar5);
                    } else {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar5);
                    }
                    b4.c(fVar, rVarC, mVar7);
                    r rVarA4 = u2.f22900a.a(aVar24, 1.0f, true);
                    zVarA = c2.y.a(kVar, aVar25, mVar7, 0);
                    iHashCode2 = Long.hashCode(mVar7.getU());
                    i2VarX2 = mVar7.x();
                    rVarC2 = k.c(rVarA4, mVar7);
                    if (mVar7.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar26);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar2, zVarA, mVar7);
                    b4.c(c1623g, i2VarX2, mVar7);
                    if (mVar7.getT()) {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar5);
                    } else {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar5);
                    }
                    b4.c(fVar, rVarC2, mVar7);
                    String str9 = aVar23.f142568b;
                    str = aVar23.f142573g;
                    str2 = aVar23.f142572f;
                    fVar2 = aVar23.f142569c;
                    d92.b.f58624b.getClass();
                    mh.c(str9, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(d92.c.b(j92.f.f97930g, mVar7)), mVar7, 0, 0, 131070);
                    r rVarA5 = c2.l.A(aVar24, 0.0f, eVar.f97917b, 1);
                    s2VarA2 = q2.a(c0343j, bVar, mVar7, 48);
                    iHashCode3 = Long.hashCode(mVar7.getU());
                    i2VarX3 = mVar7.x();
                    rVarC3 = k.c(rVarA5, mVar7);
                    if (mVar7.F() != null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar26);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar2, s2VarA2, mVar7);
                    b4.c(c1623g, i2VarX3, mVar7);
                    if (mVar7.getT()) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar5);
                    } else {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar5);
                    }
                    b4.c(fVar, rVarC3, mVar7);
                    Set<com.garmin.android.apps.connectmobile.courses.model.f> set2 = u40.f.f168568a;
                    fVar2.getClass();
                    hVar = fVar2.f32928g;
                    if (hVar != null) {
                        dVarB = hVar.f32966b;
                    } else {
                        dVarB = null;
                    }
                    if (dVarB == null) {
                        mVar7.C(1989643751);
                        u4.d.b bVar7 = u4.d.f168373k;
                        dVarB = n5.e.b(fVar2.f32924c, mVar7, 6);
                    } else {
                        mVar7.C(1989643007);
                    }
                    mVar7.f();
                    u4.d dVar4 = dVarB;
                    g6.f.a aVar28 = g6.f.f75994b;
                    y0.b(dVar4, "", x2.q(aVar24, 18), o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar7).f().d()), mVar7, 432, 56);
                    float f19 = eVar.f97918c;
                    float f110 = eVar.f97917b;
                    r rVarC11 = c2.l.C(aVar24, f19, f110, 0.0f, f110, 4);
                    String strB2 = x.b(fVar2, mVar7);
                    x0Var = j92.f.f97933j;
                    mh.c(strB2, rVarC11, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(x0Var, mVar7), mVar7, 0, 0, 131068);
                    mVar7.y();
                    mVar7.y();
                    mh.c(aVar23.f142570d, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar7), mVar7, 0, 0, 131070);
                    mVar7.y();
                    if (g22.n.d(str2)) {
                        mVar7.C(719733360);
                        r rVarC12 = c2.l.C(aVar24, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                        aVar2 = aVar24;
                        s2VarA3 = q2.a(j.i(f16), bVar, mVar7, 48);
                        iHashCode4 = Long.hashCode(mVar7.getU());
                        i2VarX4 = mVar7.x();
                        rVarC4 = k.c(rVarC12, mVar7);
                        if (mVar7.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, s2VarA3, mVar7);
                        b4.c(c1623g, i2VarX4, mVar7);
                        if (mVar7.getT()) {
                            v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                        } else {
                            v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                        }
                        b4.c(fVar, rVarC4, mVar7);
                        if (g22.n.d(str2)) {
                            mVar7.C(1730108987);
                            es1.c.a(null, y.P(R.string.rest_badge_format, new Object[]{str2}, mVar7), 0L, 0L, mVar7, 0, 13);
                            mVar7.f();
                        } else {
                            mVar7.C(1730238722);
                            mVar7.f();
                        }
                        if (g22.n.d(str)) {
                            mVar7.C(1730312471);
                            es1.c.a(null, y.P(R.string.cutoff_badge_format, new Object[]{str}, mVar7), 0L, 0L, mVar7, 0, 13);
                            mVar7.f();
                        } else {
                            mVar7.C(1730446050);
                            mVar7.f();
                        }
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(719733360);
                        r rVarC13 = c2.l.C(aVar24, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13);
                        aVar2 = aVar24;
                        s2VarA3 = q2.a(j.i(f16), bVar, mVar7, 48);
                        iHashCode4 = Long.hashCode(mVar7.getU());
                        i2VarX4 = mVar7.x();
                        rVarC4 = k.c(rVarC13, mVar7);
                        if (mVar7.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, s2VarA3, mVar7);
                        b4.c(c1623g, i2VarX4, mVar7);
                        if (mVar7.getT()) {
                            v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                        } else {
                            v.h.z(iHashCode4, mVar7, iHashCode4, bVar5);
                        }
                        b4.c(fVar, rVarC4, mVar7);
                        if (g22.n.d(str2)) {
                            mVar7.C(1730108987);
                            es1.c.a(null, y.P(R.string.rest_badge_format, new Object[]{str2}, mVar7), 0L, 0L, mVar7, 0, 13);
                            mVar7.f();
                        } else {
                            mVar7.C(1730238722);
                            mVar7.f();
                        }
                        if (g22.n.d(str)) {
                            mVar7.C(1730312471);
                            es1.c.a(null, y.P(R.string.cutoff_badge_format, new Object[]{str}, mVar7), 0L, 0L, mVar7, 0, 13);
                            mVar7.f();
                        } else {
                            mVar7.C(1730446050);
                            mVar7.f();
                        }
                        mVar7.y();
                        mVar7.f();
                    }
                    if (g22.n.d(aVar23.f142571e)) {
                        mVar7.C(720564873);
                        if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                            f14 = 0;
                        } else {
                            f14 = f16;
                        }
                        r rVarC14 = c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, f14, 7);
                        s2VarA4 = q2.a(c0343j, h4.d.a.f81533k, mVar7, 0);
                        iHashCode5 = Long.hashCode(mVar7.getU());
                        i2VarX5 = mVar7.x();
                        rVarC5 = k.c(rVarC14, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, s2VarA4, mVar7);
                        b4.c(c1623g, i2VarX5, mVar7);
                        if (mVar7.getT()) {
                            v.h.z(iHashCode5, mVar7, iHashCode5, bVar5);
                        } else {
                            v.h.z(iHashCode5, mVar7, iHashCode5, bVar5);
                        }
                        b4.c(fVar, rVarC5, mVar7);
                        zVarA2 = c2.y.a(kVar, aVar25, mVar7, 0);
                        iHashCode6 = Long.hashCode(mVar7.getU());
                        i2VarX6 = mVar7.x();
                        rVarC6 = k.c(aVar2, mVar7);
                        if (mVar7.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar7.z();
                        if (mVar7.getT()) {
                            mVar7.M(aVar26);
                        } else {
                            mVar7.c();
                        }
                        b4.c(eVar2, zVarA2, mVar7);
                        b4.c(c1623g, i2VarX6, mVar7);
                        if (mVar7.getT()) {
                            v.h.z(iHashCode6, mVar7, iHashCode6, bVar5);
                        } else {
                            v.h.z(iHashCode6, mVar7, iHashCode6, bVar5);
                        }
                        b4.c(fVar, rVarC6, mVar7);
                        v5.a(0.0f, 6, 6, 0L, c2.l.A(aVar2, 0.0f, 12, 1), mVar7);
                        String str10 = aVar23.f142571e;
                        x0 x0VarF2 = d92.c.f(x0Var, mVar7);
                        if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                            i14 = 2;
                        } else {
                            i14 = Integer.MAX_VALUE;
                        }
                        d6.p.f57793b.getClass();
                        int i26 = d6.p.f57795d;
                        r rVarA6 = r1.g0.a(aVar2, null, 3);
                        objQ = mVar7.q();
                        aVar.getClass();
                        c2565a = m.a.f135155b;
                        i15 = 11;
                        if (objQ == c2565a) {
                            p1Var2 = p1Var5;
                            objQ = new o72.i3(p1Var2, i15);
                            mVar7.K(objQ);
                        } else {
                            p1Var2 = p1Var5;
                        }
                        mh.c(str10, rVarA6, 0L, null, 0L, null, 0L, null, 0L, i26, false, i14, 0, (l) objQ, x0VarF2, mVar7, 0, 1573248, 45052);
                        if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                            mVar7.C(-29990506);
                            l2 l2VarC2 = c2.l.c(f16, 0.0f, 2);
                            r rVarB3 = x2.b(aVar2, 0.0f, 1, 1);
                            objQ2 = mVar7.q();
                            if (objQ2 == c2565a) {
                                p1Var3 = p1Var;
                                objQ2 = new om0.h(p1Var3, 13);
                                mVar7.K(objQ2);
                            } else {
                                p1Var3 = p1Var;
                            }
                            h1.c((e23.a) objQ2, rVarB3, false, null, null, null, l2VarC2, null, z3.f.c(1246983685, new eb0.a(p1Var3, i15), mVar7), mVar7, 805306422, 380);
                            mVar7.f();
                        } else {
                            mVar7.C(-29346667);
                            mVar7.f();
                        }
                        mVar7.y();
                        mVar7.y();
                        mVar7.f();
                    } else {
                        mVar7.C(722310049);
                        mVar7.f();
                    }
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                DeviceBackupActivity.a aVar29 = DeviceBackupActivity.f42558c;
                ((DeviceBackupActivity) obj5).da((sg1.b) obj4, (e23.a) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                pp.d.a((r) obj5, (mp.a) obj4, (l) obj3, (m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f121292a = i15;
        this.f121293b = obj;
        this.f121294c = obj2;
        this.f121295d = obj3;
    }

    public /* synthetic */ b(Object obj, int i14, Object obj2, Object obj3) {
        this.f121292a = i14;
        this.f121293b = obj;
        this.f121294c = obj2;
        this.f121295d = obj3;
    }

    public /* synthetic */ b(l0 l0Var, l lVar, r rVar, int i14) {
        this.f121292a = 4;
        this.f121294c = l0Var;
        this.f121295d = lVar;
        this.f121293b = rVar;
    }
}
