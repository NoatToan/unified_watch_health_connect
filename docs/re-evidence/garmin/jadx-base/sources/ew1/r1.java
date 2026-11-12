package ew1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.history.presentation.ActivitiesListActivity;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.userprofile.UserProfileActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateActivity;
import i3.mh;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p3.b4;
import p3.x3;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66717c;

    public /* synthetic */ r1(UserProfileActivity userProfileActivity, p3.p1 p1Var) {
        this.f66715a = 25;
        this.f66717c = userProfileActivity;
        this.f66716b = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2) {
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo;
        com.garmin.android.apps.connectmobile.userprofile.model.c userInfo2;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        UserProfileActivity userProfileActivity = (UserProfileActivity) this.f66717c;
        x3 x3Var = (x3) this.f66716b;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        UserProfileActivity.a aVar = UserProfileActivity.f46494x;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r rVarF = c2.x2.f(h4.r.S, 1.0f);
            h4.d.f81522a.getClass();
            h4.r rVarY = c2.x2.y(rVarF, h4.d.a.f81529g, 2);
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            p3.i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            com.garmin.android.apps.connectmobile.userprofile.model.h profileImageType = null;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            boolean zBooleanValue = ((Boolean) userProfileActivity.f46508r.getF182175a()).booleanValue();
            boolean zR = mVar.r(userProfileActivity);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new fe2.z(userProfileActivity, 8);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fe2.z(userProfileActivity, 8);
                    mVar.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            boolean zHa = userProfileActivity.ha();
            ga1.a aVar5 = (ga1.a) KoinJavaComponent.get$default(ga1.a.class, null, null, 6, null);
            com.garmin.android.apps.connectmobile.userprofile.model.q qVar = userProfileActivity.f46496f;
            boolean zIsNotEmpty = StringUtils.isNotEmpty((qVar == null || (userInfo2 = qVar.getUserInfo()) == null || (profileImageUrls = userInfo2.getProfileImageUrls()) == null) ? null : profileImageUrls.f46878g);
            com.garmin.android.apps.connectmobile.userprofile.model.q qVar2 = userProfileActivity.f46496f;
            if (qVar2 != null && (userInfo = qVar2.getUserInfo()) != null) {
                profileImageType = userInfo.getProfileImageType();
            }
            boolean z14 = profileImageType == com.garmin.android.apps.connectmobile.userprofile.model.h.UPLOADED_PHOTO;
            s3.f23252a.getClass();
            boolean z15 = userProfileActivity.ia() && !userProfileActivity.ha() && zIsNotEmpty && z14 && aVar5.b(ea1.b.USER_PROFILE, s3.a("ROLE_MBTESTER") ? ea1.d.MB_TESTER : ea1.d.NORMAL_USER);
            boolean zR2 = mVar.r(userProfileActivity);
            Object objQ2 = mVar.q();
            if (zR2) {
                objQ2 = new g12.j(userProfileActivity);
                mVar.K(objQ2);
            } else {
                aVar3.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new g12.j(userProfileActivity);
                    mVar.K(objQ2);
                }
            }
            e23.a aVar6 = (e23.a) ((k23.g) objQ2);
            com.garmin.android.apps.connectmobile.userprofile.i.d dVar = (com.garmin.android.apps.connectmobile.userprofile.i.d) x3Var.getF182175a();
            s12.d.a(zBooleanValue, aVar4, new s12.n(zHa, z15, aVar6, dVar != null ? dVar.f46789b : new li0.d0(null, null, null, null, false, null, null, null, null, 511, null), userProfileActivity.ga().F), mVar, (li0.d0.f112647j | li0.f.f112658h) << 6);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    private final Object b(Object obj, Object obj2) {
        g2.h0 h0Var = (g2.h0) this.f66716b;
        g2.h0.a aVar = (g2.h0.a) this.f66717c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            g2.i0 i0VarInvoke = h0Var.f75125b.invoke();
            int iA = aVar.f75129c;
            Object obj3 = aVar.f75127a;
            if ((iA >= i0VarInvoke.getItemCount() || !i0VarInvoke.getKey(iA).equals(obj3)) && (iA = i0VarInvoke.a(obj3)) != -1) {
                aVar.f75129c = iA;
            }
            if (iA != -1) {
                mVar.C(-1664741271);
                g2.p.b(i0VarInvoke, h0Var.f75124a, iA, aVar.f75127a, mVar, 0);
            } else {
                mVar.C(-1668376610);
            }
            mVar.f();
            boolean zR = mVar.r(aVar);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new g12.f(aVar, i14);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new g12.f(aVar, i14);
                    mVar.K(objQ);
                }
            }
            p3.l0.a(obj3, (e23.l) objQ, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        z3.e eVar = (z3.e) this.f66716b;
        g2.n1 n1Var = (g2.n1) this.f66717c;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            eVar.invoke(n1Var, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0317  */
    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:248:0x069f  */
    /* JADX WARN: Code duplicated, block: B:24:0x009f  */
    /* JADX WARN: Code duplicated, block: B:273:0x078f  */
    /* JADX WARN: Code duplicated, block: B:278:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:283:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:298:0x0832  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:303:0x085b  */
    /* JADX WARN: Code duplicated, block: B:310:0x088d  */
    /* JADX WARN: Code duplicated, block: B:339:0x0987  */
    /* JADX WARN: Code duplicated, block: B:344:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:388:0x0b2f  */
    /* JADX WARN: Code duplicated, block: B:393:0x0b4a  */
    /* JADX WARN: Code duplicated, block: B:414:0x0bd7  */
    /* JADX WARN: Code duplicated, block: B:419:0x0bfb  */
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
        String string;
        String string2;
        p3.m mVar;
        g21.u uVar;
        g21.f0 f0Var;
        int i14 = this.f66715a;
        int i15 = 6;
        p3.m.a aVar = p3.m.f135153a;
        final int i16 = 2;
        final int i17 = 3;
        boolean z14 = false;
        z = false;
        boolean z15 = false;
        final int i18 = 1;
        Object obj3 = this.f66717c;
        Object obj4 = this.f66716b;
        switch (i14) {
            case 0:
                x3 x3Var = (x3) obj4;
                s1 s1Var = (s1) obj3;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s1.a aVar2 = s1.f66734c;
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    g3 g3Var = (g3) x3Var.getF182175a();
                    jv1.z zVar = g3Var != null ? (jv1.z) g3Var.f35301b : null;
                    if (zVar == null) {
                        mVar2.C(1423193125);
                        mVar2.f();
                    } else {
                        mVar2.C(1423193126);
                        int iC5 = s1Var.u6().C5("FBTReviewScheduleFragment");
                        int iY5 = s1Var.u6().Y5();
                        boolean zR5 = s1Var.u6().R5();
                        boolean zR = mVar2.r(s1Var);
                        Object objQ = mVar2.q();
                        if (zR) {
                            objQ = new e40.d(s1Var, 16);
                            mVar2.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new e40.d(s1Var, 16);
                                mVar2.K(objQ);
                            }
                        }
                        e23.a aVar3 = (e23.a) objQ;
                        boolean zR2 = mVar2.r(s1Var) | mVar2.r(zVar);
                        Object objQ2 = mVar2.q();
                        if (zR2) {
                            objQ2 = new dl0.g(29, s1Var, zVar);
                            mVar2.K(objQ2);
                        } else {
                            aVar.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new dl0.g(29, s1Var, zVar);
                                mVar2.K(objQ2);
                            }
                        }
                        cw1.r0.b(null, zVar, zR5, iC5, iY5, aVar3, (e23.a) objQ2, mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.p1 p1Var = (p3.p1) obj4;
                d2 d2Var = (d2) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                d2.a aVar4 = d2.f66384d;
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        mVar3.C(-1338828585);
                        boolean zB = mVar3.B(p1Var) | mVar3.r(d2Var);
                        Object objQ3 = mVar3.q();
                        if (zB) {
                            objQ3 = new c2(z14 ? 1 : 0, d2Var, p1Var);
                            mVar3.K(objQ3);
                        } else {
                            aVar.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new c2(z14 ? 1 : 0, d2Var, p1Var);
                                mVar3.K(objQ3);
                            }
                        }
                        e23.a aVar5 = (e23.a) objQ3;
                        boolean zB2 = mVar3.B(p1Var);
                        Object objQ4 = mVar3.q();
                        if (zB2) {
                            objQ4 = new et1.a2(p1Var, 3);
                            mVar3.K(objQ4);
                        } else {
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new et1.a2(p1Var, 3);
                                mVar3.K(objQ4);
                            }
                        }
                        jg.b.d(aVar5, (e23.a) objQ4, mVar3, 0);
                        mVar3.f();
                    } else {
                        mVar3.C(-1338408628);
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 2:
                e23.l lVar = (e23.l) obj4;
                p005kotlin.jvm.internal.r0 r0Var = (p005kotlin.jvm.internal.r0) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                x2.a aVar6 = x2.f66834d;
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.x1 x1Var3 = p3.n.f135158a;
                    l72.f0.f110999a.d(384, 9, new c2(i15, lVar, r0Var), c2.x2.f(h4.r.S, 1.0f), gl1.y.Q(mVar4, R.string.lbl_next), mVar4, null, false);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 3:
                DialogInterface dialogInterface = (DialogInterface) obj;
                ((Integer) obj2).getClass();
                dialogInterface.getClass();
                ew2.g.f66907a.getClass();
                ((bx2.e) ((zw2.f) obj3)).n(new ew2.f((Fragment) obj4));
                dialogInterface.cancel();
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ey.u.a((xx.d) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 5:
                f2.b bVar = (f2.b) obj4;
                c2.j.e eVar = (c2.j.e) obj3;
                g6.c cVar = (g6.c) obj;
                g6.a aVar7 = (g6.a) obj2;
                if (g6.a.j(aVar7.f75988a) == Integer.MAX_VALUE) {
                    b2.e.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iJ = g6.a.j(aVar7.f75988a);
                int[] iArrA1 = p13.h0.a1(bVar.a(cVar, iJ, cVar.f0(eVar.getF22711d())));
                int[] iArr = new int[iArrA1.length];
                eVar.b(cVar, iJ, iArrA1, g6.o.Ltr, iArr);
                return new f2.l0(iArrA1, iArr);
            case 6:
                ((Integer) obj2).getClass();
                lg.d.b((i21.c) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                f21.c.a((g21.a) obj4, (v21.e) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                f21.w.b((List) obj4, (v21.e) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((com.garmin.android.apps.connectmobile.workouts.presentation.edit.p) obj4).q3((String) obj, !((com.garmin.android.apps.connectmobile.workouts.presentation.edit.q) obj3).f49259o, (com.garmin.android.apps.connectmobile.workouts.data.model.a) obj2);
                return Unit.INSTANCE;
            case 10:
                Context context = (Context) obj4;
                WorkoutPreCreateActivity workoutPreCreateActivity = (WorkoutPreCreateActivity) obj3;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                WorkoutPreCreateActivity.a aVar8 = WorkoutPreCreateActivity.f48888d;
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.x1 x1Var4 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC = c2.l.C(aVar9, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97918c, 7);
                    boolean zR3 = mVar5.r(context);
                    Object objQ5 = mVar5.q();
                    if (zR3) {
                        objQ5 = new cy1.a(context, 7);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new cy1.a(context, 7);
                            mVar5.K(objQ5);
                        }
                    }
                    e23.a aVar10 = (e23.a) objQ5;
                    boolean zR4 = mVar5.r(workoutPreCreateActivity);
                    Object objQ6 = mVar5.q();
                    if (zR4) {
                        objQ6 = new e40.d(workoutPreCreateActivity, 25);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new e40.d(workoutPreCreateActivity, 25);
                            mVar5.K(objQ6);
                        }
                    }
                    w52.z1.a(rVarC, aVar10, (e23.a) objQ6, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 11:
                Context context2 = (Context) obj4;
                com.garmin.android.apps.connectmobile.devices.targetedselection.l.a aVar11 = (com.garmin.android.apps.connectmobile.devices.targetedselection.l.a) obj3;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    p3.x1 x1Var5 = p3.n.f135158a;
                    wf.f.a aVar12 = new wf.f.a(context2);
                    String str = aVar11.f34615d;
                    if (str == null) {
                        str = aVar11.f34616e;
                    }
                    aVar12.f184930c = str;
                    wf.g.a(aVar12);
                    wf.f fVarA = aVar12.a();
                    t4.d dVarA = n5.c.a(2131231969, mVar6, 0);
                    t4.d dVarA2 = n5.c.a(2131231969, mVar6, 0);
                    String strQ = gl1.y.Q(mVar6, R.string.default_image_view_content_description);
                    h4.r.a aVar13 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    jf.r.b(fVarA, strQ, c2.x2.u(c2.x2.h(aVar13, cVar2.f97906e), cVar2.f97906e), dVarA, dVarA2, null, null, null, null, null, null, null, mVar6, 0, 0, 32736);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 12:
                h82.r rVar = (h82.r) obj4;
                final fe1.g gVar = (fe1.g) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                fe1.g.a aVar14 = fe1.g.f70543g;
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.x1 x1Var6 = p3.n.f135158a;
                    boolean zR6 = mVar7.r(gVar);
                    Object objQ7 = mVar7.q();
                    if (zR6) {
                        final int i19 = z14 ? 1 : 0;
                        objQ7 = new e23.a() { // from class: fe1.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i19;
                                g gVar2 = gVar;
                                switch (i24) {
                                    case 0:
                                        g.a aVar15 = g.f70543g;
                                        gVar2.e("RECEIVING_DATA_ACTION");
                                        break;
                                    case 1:
                                        g.a aVar16 = g.f70543g;
                                        gVar2.e("INTERPRET_DATA_ACTION");
                                        break;
                                    default:
                                        g.a aVar17 = g.f70543g;
                                        gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar7.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            final int i110 = z14 ? 1 : 0;
                            objQ7 = new e23.a() { // from class: fe1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i110;
                                    g gVar2 = gVar;
                                    switch (i24) {
                                        case 0:
                                            g.a aVar15 = g.f70543g;
                                            gVar2.e("RECEIVING_DATA_ACTION");
                                            break;
                                        case 1:
                                            g.a aVar16 = g.f70543g;
                                            gVar2.e("INTERPRET_DATA_ACTION");
                                            break;
                                        default:
                                            g.a aVar17 = g.f70543g;
                                            gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ7);
                        }
                    }
                    rVar.B(R.string.lbl_receiving_respiration_data, null, false, (e23.a) objQ7, mVar7, 0, 6);
                    boolean zR7 = mVar7.r(gVar);
                    Object objQ8 = mVar7.q();
                    if (zR7) {
                        objQ8 = new e23.a() { // from class: fe1.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i24 = i18;
                                g gVar2 = gVar;
                                switch (i24) {
                                    case 0:
                                        g.a aVar15 = g.f70543g;
                                        gVar2.e("RECEIVING_DATA_ACTION");
                                        break;
                                    case 1:
                                        g.a aVar16 = g.f70543g;
                                        gVar2.e("INTERPRET_DATA_ACTION");
                                        break;
                                    default:
                                        g.a aVar17 = g.f70543g;
                                        gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar7.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: fe1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i18;
                                    g gVar2 = gVar;
                                    switch (i24) {
                                        case 0:
                                            g.a aVar15 = g.f70543g;
                                            gVar2.e("RECEIVING_DATA_ACTION");
                                            break;
                                        case 1:
                                            g.a aVar16 = g.f70543g;
                                            gVar2.e("INTERPRET_DATA_ACTION");
                                            break;
                                        default:
                                            g.a aVar17 = g.f70543g;
                                            gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ8);
                        }
                    }
                    rVar.B(R.string.lbl_interpreting_your_data, null, false, (e23.a) objQ8, mVar7, 0, 6);
                    if (gVar.f70544f) {
                        mVar7.C(-810274185);
                        boolean zR8 = mVar7.r(gVar);
                        Object objQ9 = mVar7.q();
                        if (zR8) {
                            objQ9 = new e23.a() { // from class: fe1.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i24 = i16;
                                    g gVar2 = gVar;
                                    switch (i24) {
                                        case 0:
                                            g.a aVar15 = g.f70543g;
                                            gVar2.e("RECEIVING_DATA_ACTION");
                                            break;
                                        case 1:
                                            g.a aVar16 = g.f70543g;
                                            gVar2.e("INTERPRET_DATA_ACTION");
                                            break;
                                        default:
                                            g.a aVar17 = g.f70543g;
                                            gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar7.K(objQ9);
                        } else {
                            aVar.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new e23.a() { // from class: fe1.d
                                    @Override // e23.a
                                    public final Object invoke() {
                                        int i24 = i16;
                                        g gVar2 = gVar;
                                        switch (i24) {
                                            case 0:
                                                g.a aVar15 = g.f70543g;
                                                gVar2.e("RECEIVING_DATA_ACTION");
                                                break;
                                            case 1:
                                                g.a aVar16 = g.f70543g;
                                                gVar2.e("INTERPRET_DATA_ACTION");
                                                break;
                                            default:
                                                g.a aVar17 = g.f70543g;
                                                gVar2.e("UNDERSTANDING_DAILY_CHARTS");
                                                break;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                };
                                mVar7.K(objQ9);
                            }
                        }
                        rVar.B(R.string.lbl_understanding_daily_charts, null, false, (e23.a) objQ9, mVar7, 0, 6);
                        mVar7.f();
                    } else {
                        mVar7.C(-810131957);
                        mVar7.f();
                    }
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 13:
                h82.r rVar2 = (h82.r) obj4;
                final fe1.k kVar = (fe1.k) obj3;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i24 = fe1.k.f70552f;
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    p3.x1 x1Var7 = p3.n.f135158a;
                    boolean zR9 = mVar8.r(kVar);
                    Object objQ10 = mVar8.q();
                    if (zR9) {
                        final int i25 = z14 ? 1 : 0;
                        objQ10 = new e23.a() { // from class: fe1.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i26 = i25;
                                k kVar2 = kVar;
                                switch (i26) {
                                    case 0:
                                        int i27 = k.f70552f;
                                        kVar2.e("TRACKING_DATA_ACTION");
                                        break;
                                    case 1:
                                        int i28 = k.f70552f;
                                        kVar2.e("RUN_RATE_ACTION");
                                        break;
                                    default:
                                        int i29 = k.f70552f;
                                        kVar2.e("RIDE_RATE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            final int i26 = z14 ? 1 : 0;
                            objQ10 = new e23.a() { // from class: fe1.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i26;
                                    k kVar2 = kVar;
                                    switch (i27) {
                                        case 0:
                                            int i28 = k.f70552f;
                                            kVar2.e("TRACKING_DATA_ACTION");
                                            break;
                                        case 1:
                                            int i29 = k.f70552f;
                                            kVar2.e("RUN_RATE_ACTION");
                                            break;
                                        default:
                                            int i210 = k.f70552f;
                                            kVar2.e("RIDE_RATE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ10);
                        }
                    }
                    rVar2.B(R.string.activities_respiration_tracking_title, null, false, (e23.a) objQ10, mVar8, 0, 6);
                    boolean zR10 = mVar8.r(kVar);
                    Object objQ11 = mVar8.q();
                    if (zR10) {
                        objQ11 = new e23.a() { // from class: fe1.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i18;
                                k kVar2 = kVar;
                                switch (i27) {
                                    case 0:
                                        int i28 = k.f70552f;
                                        kVar2.e("TRACKING_DATA_ACTION");
                                        break;
                                    case 1:
                                        int i29 = k.f70552f;
                                        kVar2.e("RUN_RATE_ACTION");
                                        break;
                                    default:
                                        int i210 = k.f70552f;
                                        kVar2.e("RIDE_RATE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new e23.a() { // from class: fe1.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i18;
                                    k kVar2 = kVar;
                                    switch (i27) {
                                        case 0:
                                            int i28 = k.f70552f;
                                            kVar2.e("TRACKING_DATA_ACTION");
                                            break;
                                        case 1:
                                            int i29 = k.f70552f;
                                            kVar2.e("RUN_RATE_ACTION");
                                            break;
                                        default:
                                            int i210 = k.f70552f;
                                            kVar2.e("RIDE_RATE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ11);
                        }
                    }
                    rVar2.B(R.string.activities_breathing_during_runs_title, null, false, (e23.a) objQ11, mVar8, 0, 6);
                    boolean zR11 = mVar8.r(kVar);
                    Object objQ12 = mVar8.q();
                    if (zR11) {
                        objQ12 = new e23.a() { // from class: fe1.i
                            @Override // e23.a
                            public final Object invoke() {
                                int i27 = i16;
                                k kVar2 = kVar;
                                switch (i27) {
                                    case 0:
                                        int i28 = k.f70552f;
                                        kVar2.e("TRACKING_DATA_ACTION");
                                        break;
                                    case 1:
                                        int i29 = k.f70552f;
                                        kVar2.e("RUN_RATE_ACTION");
                                        break;
                                    default:
                                        int i210 = k.f70552f;
                                        kVar2.e("RIDE_RATE_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar8.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new e23.a() { // from class: fe1.i
                                @Override // e23.a
                                public final Object invoke() {
                                    int i27 = i16;
                                    k kVar2 = kVar;
                                    switch (i27) {
                                        case 0:
                                            int i28 = k.f70552f;
                                            kVar2.e("TRACKING_DATA_ACTION");
                                            break;
                                        case 1:
                                            int i29 = k.f70552f;
                                            kVar2.e("RUN_RATE_ACTION");
                                            break;
                                        default:
                                            int i210 = k.f70552f;
                                            kVar2.e("RIDE_RATE_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar8.K(objQ12);
                        }
                    }
                    rVar2.B(R.string.activities_breathing_during_rides_title, null, false, (e23.a) objQ12, mVar8, 0, 6);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 14:
                g3 g3Var2 = (g3) obj4;
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.e eVar2 = (com.garmin.android.apps.connectmobile.gcplus.presentation.home.e) obj3;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    p3.x1 x1Var8 = p3.n.f135158a;
                    T t7 = g3Var2.f35301b;
                    fw.p pVar = g3Var2.f35300a;
                    boolean zG = p005kotlin.jvm.internal.s.g(t7, Boolean.TRUE);
                    l72.p2 p2Var = l72.p2.f111205a;
                    String strQ2 = gl1.y.Q(mVar9, R.string.global_badges);
                    h4.r.a aVar15 = h4.r.S;
                    fw.p pVar2 = fw.p.LOADING;
                    boolean z16 = pVar != pVar2;
                    p5.l.f136032b.getClass();
                    p5.l lVarA = p5.l.a(p5.l.f136034d);
                    boolean zR12 = mVar9.r(eVar2);
                    Object objQ13 = mVar9.q();
                    if (zR12) {
                        objQ13 = new fk0.b(eVar2, i18);
                        mVar9.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new fk0.b(eVar2, i18);
                            mVar9.K(objQ13);
                        }
                    }
                    h4.r rVarB = j2.g.b(aVar15, zG, z16, lVarA, (e23.l) objQ13, 8);
                    Object objQ14 = mVar9.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ14 == c2565a) {
                        objQ14 = new fh0.b(8);
                        mVar9.K(objQ14);
                    }
                    p2Var.g(strQ2, p5.v.c((e23.l) objQ14, rVarB, false), null, null, z3.f.c(2128298380, new an1.i(zG, 22), mVar9), pVar != pVar2, false, null, mVar9, 24576, 460);
                    String strQ3 = gl1.y.Q(mVar9, R.string.view_and_earn_global_badges);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97933j, mVar9);
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    h4.r rVarZ = c2.l.z(aVar15, eVar3.f97920e, eVar3.f97917b);
                    Object objQ15 = mVar9.q();
                    if (objQ15 == c2565a) {
                        objQ15 = new fh0.b(3);
                        mVar9.K(objQ15);
                    }
                    mh.c(strQ3, p5.v.c((e23.l) objQ15, rVarZ, false), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, mVar9, 0, 0, 131068);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 15:
                ActivitiesListActivity activitiesListActivity = (ActivitiesListActivity) obj4;
                c.q qVar = (c.q) obj3;
                ((Integer) obj).getClass();
                wo0.a aVar16 = (wo0.a) obj2;
                ActivitiesListActivity.a aVar17 = ActivitiesListActivity.f29099d;
                aVar16.getClass();
                am.g gVar2 = activitiesListActivity.f29100a;
                if (gVar2 == null) {
                    p005kotlin.jvm.internal.s.m("activityListMode");
                    throw null;
                }
                am.g gVar3 = am.g.f3944h;
                Object[] objArr = gVar2 == gVar3;
                new aq.b();
                am.g gVar4 = activitiesListActivity.f29100a;
                if (gVar4 == null) {
                    p005kotlin.jvm.internal.s.m("activityListMode");
                    throw null;
                }
                boolean zContains = p13.u.m0(new am.g[]{am.g.f3942f, am.g.f3943g}).contains(gVar4);
                Object[] objArr2 = gVar4 == gVar3;
                aq.b bVar2 = new aq.b();
                bVar2.f11823b = aVar16.f186415a;
                bVar2.f11827f = aVar16.f186420f.f4358a;
                am.h hVar = objArr2 != false ? am.h.VIEW_ONLY : am.h.VIEW_EDIT;
                if (hVar != null) {
                    bVar2.f11824c = hVar;
                }
                if (objArr2 == false && zContains) {
                    z15 = true;
                }
                bVar2.f11825d = z15;
                Intent intentA = bVar2.a(activitiesListActivity);
                if (objArr == true) {
                    activitiesListActivity.startActivity(intentA);
                } else {
                    qVar.a(intentA, null);
                }
                return Unit.INSTANCE;
            case 16:
                jo.e eVar4 = (jo.e) obj4;
                e23.a<Unit> aVar18 = (e23.a) obj3;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    p3.x1 x1Var9 = p3.n.f135158a;
                    l72.f0.a.f111000a.f(gl1.y.Q(mVar10, eVar4.f99753c.intValue()), null, false, aVar18, mVar10, 0, 6);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 17:
                e23.l lVar2 = (e23.l) obj4;
                e23.l lVar3 = (e23.l) obj3;
                String str2 = (String) obj;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                str2.getClass();
                if (zBooleanValue) {
                    lVar2.invoke(str2);
                } else {
                    lVar3.invoke(str2);
                }
                return Unit.INSTANCE;
            case 18:
                jo.f fVar = (jo.f) obj4;
                Context context3 = (Context) obj3;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    p3.x1 x1Var10 = p3.n.f135158a;
                    eo.g gVar5 = fVar.f99758b;
                    context3.getClass();
                    eo.f fVar2 = fVar.f99757a;
                    int i27 = jo.f.b.f99760b[fVar2.ordinal()];
                    if (i27 == 1) {
                        int i28 = jo.f.b.f99759a[gVar5.ordinal()];
                        if (i28 == 1) {
                            string = context3.getString(R.string.a_to_z);
                            string.getClass();
                        } else {
                            if (i28 != 2) {
                                lc.u0.r();
                                return null;
                            }
                            string = context3.getString(R.string.z_to_a);
                            string.getClass();
                        }
                    } else if (i27 != 2) {
                        Integer num = fVar2.f64776b;
                        if (num == null || (string2 = context3.getString(num.intValue())) == null) {
                            string2 = "";
                        }
                        int i29 = jo.f.b.f99759a[gVar5.ordinal()];
                        if (i29 == 1) {
                            string = context3.getString(R.string.lbl_sort_by_option_ascending, string2);
                            string.getClass();
                        } else {
                            if (i29 != 2) {
                                lc.u0.r();
                                return null;
                            }
                            string = context3.getString(R.string.lbl_sort_by_option_descending, string2);
                            string.getClass();
                        }
                    } else {
                        int i30 = jo.f.b.f99759a[gVar5.ordinal()];
                        if (i30 == 1) {
                            string = context3.getString(R.string.review_sort_order_oldest_first);
                            string.getClass();
                        } else {
                            if (i30 != 2) {
                                lc.u0.r();
                                return null;
                            }
                            string = context3.getString(R.string.review_sort_order_newest_first);
                            string.getClass();
                        }
                    }
                    mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar11, 0, 0, 262142);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                fv1.g.a aVar19 = fv1.g.f73711d;
                ((fv1.g) obj4).u6((gv1.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 20:
                String str3 = (String) obj4;
                bx0.d.b bVar3 = (bx0.d.b) obj3;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar12.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    p3.x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    h4.r rVarD = c2.x2.d(aVar20, 1.0f);
                    boolean zB3 = mVar12.B(str3);
                    Object objQ16 = mVar12.q();
                    if (zB3) {
                        objQ16 = new fp0.c(str3, i15);
                        mVar12.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            objQ16 = new fp0.c(str3, i15);
                            mVar12.K(objQ16);
                        }
                    }
                    h4.r rVarC2 = p5.v.c((e23.l) objQ16, rVarD, false);
                    c2.j.f22691a.getClass();
                    c2.j.b bVar4 = c2.j.f22695e;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(bVar4, h4.d.a.f81536n, mVar12, 6);
                    int iHashCode = Long.hashCode(mVar12.getU());
                    p3.i2 i2VarX = mVar12.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar12);
                    h5.g.V.getClass();
                    h5.e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar12.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar12.z();
                    if (mVar12.getT()) {
                        mVar12.M(aVar21);
                    } else {
                        mVar12.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar12);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar12);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar12.getT() || !p005kotlin.jvm.internal.s.g(mVar12.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar12, iHashCode, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar12);
                    c2.b0 b0Var = c2.b0.f22601a;
                    Integer num2 = bVar3.f21666f;
                    if (num2 == null) {
                        mVar12.C(-1896079315);
                        mVar12.f();
                    } else {
                        mVar12.C(-1896079314);
                        String strP = gl1.y.P(R.string.mct_num_days_label, new Object[]{String.valueOf(num2.intValue())}, mVar12);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strP, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar12), mVar12, 0, 0, 131070);
                        mVar12.f();
                    }
                    Integer num3 = bVar3.f21667g;
                    if (num3 == null) {
                        mVar12.C(-1895769036);
                        mVar12.f();
                        mVar = mVar12;
                    } else {
                        mVar12.C(-1895769035);
                        String strQ4 = gl1.y.Q(mVar12, num3.intValue());
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC4 = c2.l.C(aVar20, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97920e, 7);
                        d92.b.f58624b.getClass();
                        mVar = mVar12;
                        mh.c(strQ4, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar12), mVar, 0, 0, 131068);
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar22 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj4).w6((fz1.k) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar23 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                ((com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj4).v6((gz1.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                g02.v0.b((wf.f.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 24:
                q01.f fVar3 = (q01.f) obj4;
                v21.e eVar5 = (v21.e) obj3;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    p3.x1 x1Var12 = p3.n.f135158a;
                    boolean z17 = fVar3 instanceof q01.f.C2664f;
                    if (z17 || (fVar3 instanceof q01.f.d)) {
                        mVar13.C(58835628);
                        h4.r.a aVar24 = h4.r.S;
                        h4.r rVarD2 = c2.x2.d(aVar24, 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.a aVar25 = h4.d.a.f81537o;
                        c2.j.f22691a.getClass();
                        c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar25, mVar13, 48);
                        int iHashCode2 = Long.hashCode(mVar13.getU());
                        p3.i2 i2VarX2 = mVar13.x();
                        h4.r rVarC5 = h4.k.c(rVarD2, mVar13);
                        h5.g.V.getClass();
                        h5.e0.a aVar26 = h5.g.a.f81805b;
                        if (mVar13.F() == null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar13.z();
                        if (mVar13.getT()) {
                            mVar13.M(aVar26);
                        } else {
                            mVar13.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, mVar13);
                        b4.c(h5.g.a.f81809f, i2VarX2, mVar13);
                        h5.g.a.b bVar6 = h5.g.a.f81813j;
                        if (mVar13.getT() || !p005kotlin.jvm.internal.s.g(mVar13.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar13, iHashCode2, bVar6);
                        }
                        b4.c(h5.g.a.f81807d, rVarC5, mVar13);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        q01.f.C2664f c2664f = z17 ? (q01.f.C2664f) fVar3 : null;
                        if (c2664f == null || (uVar = c2664f.f142014b) == null) {
                            q01.f.d dVar = fVar3 instanceof q01.f.d ? (q01.f.d) fVar3 : null;
                            if (dVar != null) {
                                g21.u uVar2 = dVar.f142009b;
                                uVar = uVar2;
                            } else {
                                uVar = null;
                            }
                        } else {
                            uVar = uVar2;
                        }
                        q01.f.C2664f c2664f2 = z17 ? (q01.f.C2664f) fVar3 : null;
                        if (c2664f2 == null || (f0Var = c2664f2.f142015c) == null) {
                            q01.f.d dVar2 = fVar3 instanceof q01.f.d ? (q01.f.d) fVar3 : null;
                            if (dVar2 != null) {
                                g21.f0 f0Var2 = dVar2.f142010c;
                                f0Var = f0Var2;
                            } else {
                                f0Var = new g21.f0(null, null, null, null, 15, null);
                            }
                        } else {
                            f0Var = f0Var2;
                        }
                        if (uVar != null) {
                            mVar13.C(-1704551583);
                            h4.r rVarD3 = c2.x2.d(aVar24, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            g11.p.a(rVarD3, c2.j.i(j92.b.f97899b.f97918c), eVar5, uVar, f0Var, false, true, mVar13, 1769478, 0);
                            mVar13.f();
                        } else {
                            mVar13.C(-1704013950);
                            g11.c.b(c2.x2.d(aVar24, 1.0f), null, eVar5, f0Var, true, mVar13, 221190, 2);
                            mVar13.f();
                        }
                        mVar13.y();
                        mVar13.f();
                    } else {
                        mVar13.C(60253103);
                        mVar13.f();
                    }
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 25:
                return a(obj, obj2);
            case 26:
                return b(obj, obj2);
            case 27:
                return ((g2.q0) obj3).a(new g2.s0((g2.h0) obj4, (f5.k2) obj), ((g6.a) obj2).f75988a);
            case 28:
                return c(obj, obj2);
            default:
                h82.r rVar3 = (h82.r) obj4;
                final g51.f fVar4 = (g51.f) obj3;
                p3.m mVar14 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                int i34 = g51.f.f75946f;
                if (mVar14.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    p3.x1 x1Var13 = p3.n.f135158a;
                    boolean zR13 = mVar14.r(fVar4);
                    Object objQ17 = mVar14.q();
                    if (zR13) {
                        final int i35 = z14 ? 1 : 0;
                        objQ17 = new e23.a() { // from class: g51.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i36 = i35;
                                f fVar5 = fVar4;
                                switch (i36) {
                                    case 0:
                                        int i37 = f.f75946f;
                                        fVar5.e("ABOUT_PACEPRO_ACTION");
                                        break;
                                    case 1:
                                        int i38 = f.f75946f;
                                        fVar5.e("PACING_STRATEGY_ACTION");
                                        break;
                                    case 2:
                                        int i39 = f.f75946f;
                                        fVar5.e("UPHILL_EFFORT_ACTION");
                                        break;
                                    case 3:
                                        int i44 = f.f75946f;
                                        fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                        break;
                                    default:
                                        int i45 = f.f75946f;
                                        fVar5.e("PACE_INTENSITY_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            final int i36 = z14 ? 1 : 0;
                            objQ17 = new e23.a() { // from class: g51.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i37 = i36;
                                    f fVar5 = fVar4;
                                    switch (i37) {
                                        case 0:
                                            int i38 = f.f75946f;
                                            fVar5.e("ABOUT_PACEPRO_ACTION");
                                            break;
                                        case 1:
                                            int i39 = f.f75946f;
                                            fVar5.e("PACING_STRATEGY_ACTION");
                                            break;
                                        case 2:
                                            int i310 = f.f75946f;
                                            fVar5.e("UPHILL_EFFORT_ACTION");
                                            break;
                                        case 3:
                                            int i44 = f.f75946f;
                                            fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                            break;
                                        default:
                                            int i45 = f.f75946f;
                                            fVar5.e("PACE_INTENSITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ17);
                        }
                    }
                    rVar3.B(R.string.pacepro_lbl_about, null, false, (e23.a) objQ17, mVar14, 0, 6);
                    boolean zR14 = mVar14.r(fVar4);
                    Object objQ18 = mVar14.q();
                    if (zR14) {
                        objQ18 = new e23.a() { // from class: g51.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i37 = i18;
                                f fVar5 = fVar4;
                                switch (i37) {
                                    case 0:
                                        int i38 = f.f75946f;
                                        fVar5.e("ABOUT_PACEPRO_ACTION");
                                        break;
                                    case 1:
                                        int i39 = f.f75946f;
                                        fVar5.e("PACING_STRATEGY_ACTION");
                                        break;
                                    case 2:
                                        int i310 = f.f75946f;
                                        fVar5.e("UPHILL_EFFORT_ACTION");
                                        break;
                                    case 3:
                                        int i44 = f.f75946f;
                                        fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                        break;
                                    default:
                                        int i45 = f.f75946f;
                                        fVar5.e("PACE_INTENSITY_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ18);
                    } else {
                        aVar.getClass();
                        if (objQ18 == p3.m.a.f135155b) {
                            objQ18 = new e23.a() { // from class: g51.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i37 = i18;
                                    f fVar5 = fVar4;
                                    switch (i37) {
                                        case 0:
                                            int i38 = f.f75946f;
                                            fVar5.e("ABOUT_PACEPRO_ACTION");
                                            break;
                                        case 1:
                                            int i39 = f.f75946f;
                                            fVar5.e("PACING_STRATEGY_ACTION");
                                            break;
                                        case 2:
                                            int i310 = f.f75946f;
                                            fVar5.e("UPHILL_EFFORT_ACTION");
                                            break;
                                        case 3:
                                            int i44 = f.f75946f;
                                            fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                            break;
                                        default:
                                            int i45 = f.f75946f;
                                            fVar5.e("PACE_INTENSITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ18);
                        }
                    }
                    rVar3.B(R.string.pacepro_lbl_pacing_strategy, null, false, (e23.a) objQ18, mVar14, 0, 6);
                    boolean zR15 = mVar14.r(fVar4);
                    Object objQ19 = mVar14.q();
                    if (zR15) {
                        objQ19 = new e23.a() { // from class: g51.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i37 = i16;
                                f fVar5 = fVar4;
                                switch (i37) {
                                    case 0:
                                        int i38 = f.f75946f;
                                        fVar5.e("ABOUT_PACEPRO_ACTION");
                                        break;
                                    case 1:
                                        int i39 = f.f75946f;
                                        fVar5.e("PACING_STRATEGY_ACTION");
                                        break;
                                    case 2:
                                        int i310 = f.f75946f;
                                        fVar5.e("UPHILL_EFFORT_ACTION");
                                        break;
                                    case 3:
                                        int i44 = f.f75946f;
                                        fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                        break;
                                    default:
                                        int i45 = f.f75946f;
                                        fVar5.e("PACE_INTENSITY_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ19);
                    } else {
                        aVar.getClass();
                        if (objQ19 == p3.m.a.f135155b) {
                            objQ19 = new e23.a() { // from class: g51.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i37 = i16;
                                    f fVar5 = fVar4;
                                    switch (i37) {
                                        case 0:
                                            int i38 = f.f75946f;
                                            fVar5.e("ABOUT_PACEPRO_ACTION");
                                            break;
                                        case 1:
                                            int i39 = f.f75946f;
                                            fVar5.e("PACING_STRATEGY_ACTION");
                                            break;
                                        case 2:
                                            int i310 = f.f75946f;
                                            fVar5.e("UPHILL_EFFORT_ACTION");
                                            break;
                                        case 3:
                                            int i44 = f.f75946f;
                                            fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                            break;
                                        default:
                                            int i45 = f.f75946f;
                                            fVar5.e("PACE_INTENSITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ19);
                        }
                    }
                    rVar3.B(R.string.pacepro_lbl_uphill_effort, null, false, (e23.a) objQ19, mVar14, 0, 6);
                    boolean zR16 = mVar14.r(fVar4);
                    Object objQ20 = mVar14.q();
                    if (zR16) {
                        objQ20 = new e23.a() { // from class: g51.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i37 = i17;
                                f fVar5 = fVar4;
                                switch (i37) {
                                    case 0:
                                        int i38 = f.f75946f;
                                        fVar5.e("ABOUT_PACEPRO_ACTION");
                                        break;
                                    case 1:
                                        int i39 = f.f75946f;
                                        fVar5.e("PACING_STRATEGY_ACTION");
                                        break;
                                    case 2:
                                        int i310 = f.f75946f;
                                        fVar5.e("UPHILL_EFFORT_ACTION");
                                        break;
                                    case 3:
                                        int i44 = f.f75946f;
                                        fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                        break;
                                    default:
                                        int i45 = f.f75946f;
                                        fVar5.e("PACE_INTENSITY_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ20);
                    } else {
                        aVar.getClass();
                        if (objQ20 == p3.m.a.f135155b) {
                            objQ20 = new e23.a() { // from class: g51.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i37 = i17;
                                    f fVar5 = fVar4;
                                    switch (i37) {
                                        case 0:
                                            int i38 = f.f75946f;
                                            fVar5.e("ABOUT_PACEPRO_ACTION");
                                            break;
                                        case 1:
                                            int i39 = f.f75946f;
                                            fVar5.e("PACING_STRATEGY_ACTION");
                                            break;
                                        case 2:
                                            int i310 = f.f75946f;
                                            fVar5.e("UPHILL_EFFORT_ACTION");
                                            break;
                                        case 3:
                                            int i44 = f.f75946f;
                                            fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                            break;
                                        default:
                                            int i45 = f.f75946f;
                                            fVar5.e("PACE_INTENSITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ20);
                        }
                    }
                    rVar3.B(R.string.pacepro_elevation_based_splits, null, false, (e23.a) objQ20, mVar14, 0, 6);
                    boolean zR17 = mVar14.r(fVar4);
                    Object objQ21 = mVar14.q();
                    if (zR17) {
                        final int i37 = 4;
                        objQ21 = new e23.a() { // from class: g51.e
                            @Override // e23.a
                            public final Object invoke() {
                                int i38 = i37;
                                f fVar5 = fVar4;
                                switch (i38) {
                                    case 0:
                                        int i39 = f.f75946f;
                                        fVar5.e("ABOUT_PACEPRO_ACTION");
                                        break;
                                    case 1:
                                        int i310 = f.f75946f;
                                        fVar5.e("PACING_STRATEGY_ACTION");
                                        break;
                                    case 2:
                                        int i311 = f.f75946f;
                                        fVar5.e("UPHILL_EFFORT_ACTION");
                                        break;
                                    case 3:
                                        int i44 = f.f75946f;
                                        fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                        break;
                                    default:
                                        int i45 = f.f75946f;
                                        fVar5.e("PACE_INTENSITY_ACTION");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar14.K(objQ21);
                    } else {
                        aVar.getClass();
                        if (objQ21 == p3.m.a.f135155b) {
                            final int i38 = 4;
                            objQ21 = new e23.a() { // from class: g51.e
                                @Override // e23.a
                                public final Object invoke() {
                                    int i39 = i38;
                                    f fVar5 = fVar4;
                                    switch (i39) {
                                        case 0:
                                            int i310 = f.f75946f;
                                            fVar5.e("ABOUT_PACEPRO_ACTION");
                                            break;
                                        case 1:
                                            int i311 = f.f75946f;
                                            fVar5.e("PACING_STRATEGY_ACTION");
                                            break;
                                        case 2:
                                            int i312 = f.f75946f;
                                            fVar5.e("UPHILL_EFFORT_ACTION");
                                            break;
                                        case 3:
                                            int i44 = f.f75946f;
                                            fVar5.e("ELEVATION_SENSITIVITY_ACTION");
                                            break;
                                        default:
                                            int i45 = f.f75946f;
                                            fVar5.e("PACE_INTENSITY_ACTION");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar14.K(objQ21);
                        }
                    }
                    rVar3.B(R.string.pacepro_lbl_pace_intensity, null, false, (e23.a) objQ21, mVar14, 0, 6);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ r1(int i14, Object obj, Object obj2) {
        this.f66715a = i14;
        this.f66716b = obj;
        this.f66717c = obj2;
    }

    public /* synthetic */ r1(Object obj, Object obj2, int i14, int i15) {
        this.f66715a = i15;
        this.f66716b = obj;
        this.f66717c = obj2;
    }
}
