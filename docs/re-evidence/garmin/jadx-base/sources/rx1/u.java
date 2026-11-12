package rx1;

import android.content.Context;
import androidx.lifecycle.n0;
import b21.v4;
import c2.a0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c22.x0;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectDetailActivity;
import com.garmin.android.apps.connectmobile.userprofile.model.q;
import com.garmin.android.apps.ui.catalog.library.help.HelpActivity;
import com.garmin.proto.generated.GDIInReachMessaging;
import com.google.android.exoplayer2.C;
import gl1.y;
import h5.e0;
import i3.h1;
import i3.h7;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.m3;
import l72.h3;
import l72.i3;
import li0.d0;
import li0.r;
import li0.z;
import org.joda.time.LocalDate;
import p005kotlin.Unit;
import p13.j0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import r53.d2;
import s70.f0;
import sg0.o0;
import sg0.q0;
import t21.m0;
import ta0.r0;
import v62.fa;
import v62.l9;
import x5.l0;
import yg2.h0;
import z10.d1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f155026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f155027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f155028c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f155029d;

    public /* synthetic */ u(e23.a aVar, e23.l lVar, p1 p1Var) {
        this.f155026a = 18;
        this.f155027b = aVar;
        this.f155029d = lVar;
        this.f155028c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0372  */
    /* JADX WARN: Code duplicated, block: B:124:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:133:0x041e  */
    /* JADX WARN: Code duplicated, block: B:147:0x047e  */
    /* JADX WARN: Code duplicated, block: B:152:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:188:0x0667  */
    /* JADX WARN: Code duplicated, block: B:193:0x068b  */
    /* JADX WARN: Code duplicated, block: B:209:0x070d  */
    /* JADX WARN: Code duplicated, block: B:237:0x082f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0856  */
    /* JADX WARN: Code duplicated, block: B:280:0x09d1  */
    /* JADX WARN: Code duplicated, block: B:31:0x0123  */
    /* JADX WARN: Code duplicated, block: B:36:0x0151  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x0234  */
    /* JADX WARN: Code duplicated, block: B:86:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02ef  */
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
        String fullName;
        int i14 = this.f155026a;
        int i15 = 4;
        int i16 = 7;
        p3.m.a aVar = p3.m.f135153a;
        boolean z14 = false;
        final int i17 = 1;
        Object obj3 = this.f155028c;
        Object obj4 = this.f155029d;
        Object obj5 = this.f155027b;
        switch (i14) {
            case 0:
                Integer num = (Integer) obj5;
                l0 l0Var = (l0) obj3;
                e23.l lVar = (e23.l) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarA = c2.l.A(aVar2, eVar.f97920e, 0.0f, 2);
                    c2.j jVar = c2.j.f22691a;
                    float f14 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81534l, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarA, mVar);
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
                    b4.c(h5.g.a.f81810g, s2VarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    u2 u2Var = u2.f22900a;
                    if (num != null) {
                        mVar.C(1281067106);
                        String str = l0Var.f188878a.f157138b.length() + "/" + num;
                        d92.b.f58624b.getClass();
                        mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                        mVar.f();
                    } else {
                        mVar.C(1281293902);
                        mVar.f();
                    }
                    h4.r rVarQ = x2.q(aVar2, j92.b.f97901d.f97904c);
                    boolean zB = mVar.B(lVar);
                    Object objQ = mVar.q();
                    if (zB) {
                        objQ = new me2.d(lVar, 18);
                        mVar.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new me2.d(lVar, 18);
                            mVar.K(objQ);
                        }
                    }
                    d.f154950a.getClass();
                    h7.a((e23.a) objQ, rVarQ, false, null, null, d.f154951b, mVar, 1572864, 60);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                d0 d0Var = (d0) obj5;
                li0.f fVar = (li0.f) obj3;
                h4.r rVar = (h4.r) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z.f(d0Var, fVar, false, rVar, mVar2, d0.f112647j | (li0.f.f112658h << 3), 0);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                final com.garmin.android.apps.connectmobile.userprofile.model.q qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) obj5;
                final com.garmin.android.apps.connectmobile.userprofile.i iVar = (com.garmin.android.apps.connectmobile.userprofile.i) obj3;
                final Context context = (Context) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    l72.s sVar = l72.s.f111232a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA = l9.a(t62.b.f162798a);
                    l72.s.a aVar4 = l72.s.a.KNOCKOUT;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC2 = c2.l.C(aVar5, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97919d, 7);
                    String strQ = y.Q(mVar3, R.string.follower_setup_follower_approval_title);
                    hi0.a userFollowProfile = qVar.getUserFollowProfile();
                    if (userFollowProfile == null || (fullName = userFollowProfile.getFullName()) == null) {
                        fullName = "";
                    }
                    String strP = y.P(R.string.follow_request_message, new Object[]{fullName}, mVar3);
                    String strQ2 = y.Q(mVar3, R.string.lbl_accept);
                    boolean zR = mVar3.r(iVar) | mVar3.r(context) | mVar3.r(qVar);
                    Object objQ2 = mVar3.q();
                    if (zR) {
                        final int i18 = z14 ? 1 : 0;
                        objQ2 = new e23.a() { // from class: s12.l
                            @Override // e23.a
                            public final Object invoke() {
                                d0 d0Var2;
                                d0 d0Var3;
                                int i19 = i18;
                                q qVar2 = qVar;
                                com.garmin.android.apps.connectmobile.userprofile.i iVar2 = iVar;
                                switch (i19) {
                                    case 0:
                                        Long lJ = qVar2.j();
                                        iVar2.getClass();
                                        Context context2 = context;
                                        context2.getClass();
                                        com.garmin.android.apps.connectmobile.userprofile.i.e eVar2 = iVar2.F;
                                        com.garmin.android.apps.connectmobile.userprofile.i.d dVarD = iVar2.f46766r.d();
                                        if (dVarD != null) {
                                            d0Var2 = d0.b(dVarD.f46789b, null, null, null, null, null, lJ, null, 383);
                                        } else {
                                            d0Var2 = new d0(null, null, null, null, false, null, null, lJ, null, 383, null);
                                            lJ = lJ;
                                        }
                                        d0 d0Var4 = d0Var2;
                                        eVar2.getClass();
                                        li0.f.b bVar2 = new li0.f.b();
                                        bVar2.f112666a = new g12.k(iVar2, 3);
                                        bVar2.f112667b = new g12.l(iVar2, bVar2, lJ, 2);
                                        Unit unit = Unit.INSTANCE;
                                        ge1.b.T(eVar2.f112660a, null, null, new li0.j(bVar2, eVar2, d0Var4, context2, null), 3);
                                        break;
                                    default:
                                        Long lJ2 = qVar2.j();
                                        iVar2.getClass();
                                        Context context3 = context;
                                        context3.getClass();
                                        com.garmin.android.apps.connectmobile.userprofile.i.e eVar3 = iVar2.F;
                                        com.garmin.android.apps.connectmobile.userprofile.i.d dVarD2 = iVar2.f46766r.d();
                                        if (dVarD2 != null) {
                                            d0Var3 = d0.b(dVarD2.f46789b, null, null, null, null, null, lJ2, null, 383);
                                        } else {
                                            d0Var3 = new d0(null, null, null, null, false, null, null, lJ2, null, 383, null);
                                            lJ2 = lJ2;
                                        }
                                        d0 d0Var5 = d0Var3;
                                        eVar3.getClass();
                                        li0.f.b bVar3 = new li0.f.b();
                                        bVar3.f112666a = new g12.k(iVar2, 0);
                                        bVar3.f112667b = new g12.l(iVar2, bVar3, lJ2, 0);
                                        bVar3.f112668c = new g12.k(iVar2, 1);
                                        Unit unit2 = Unit.INSTANCE;
                                        d1.b(context3, new r(new v4(bVar3, eVar3, (Object) null, d0Var5, context3, 17)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            final int i19 = z14 ? 1 : 0;
                            objQ2 = new e23.a() { // from class: s12.l
                                @Override // e23.a
                                public final Object invoke() {
                                    d0 d0Var2;
                                    d0 d0Var3;
                                    int i110 = i19;
                                    q qVar2 = qVar;
                                    com.garmin.android.apps.connectmobile.userprofile.i iVar2 = iVar;
                                    switch (i110) {
                                        case 0:
                                            Long lJ = qVar2.j();
                                            iVar2.getClass();
                                            Context context2 = context;
                                            context2.getClass();
                                            com.garmin.android.apps.connectmobile.userprofile.i.e eVar2 = iVar2.F;
                                            com.garmin.android.apps.connectmobile.userprofile.i.d dVarD = iVar2.f46766r.d();
                                            if (dVarD != null) {
                                                d0Var2 = d0.b(dVarD.f46789b, null, null, null, null, null, lJ, null, 383);
                                            } else {
                                                d0Var2 = new d0(null, null, null, null, false, null, null, lJ, null, 383, null);
                                                lJ = lJ;
                                            }
                                            d0 d0Var4 = d0Var2;
                                            eVar2.getClass();
                                            li0.f.b bVar2 = new li0.f.b();
                                            bVar2.f112666a = new g12.k(iVar2, 3);
                                            bVar2.f112667b = new g12.l(iVar2, bVar2, lJ, 2);
                                            Unit unit = Unit.INSTANCE;
                                            ge1.b.T(eVar2.f112660a, null, null, new li0.j(bVar2, eVar2, d0Var4, context2, null), 3);
                                            break;
                                        default:
                                            Long lJ2 = qVar2.j();
                                            iVar2.getClass();
                                            Context context3 = context;
                                            context3.getClass();
                                            com.garmin.android.apps.connectmobile.userprofile.i.e eVar3 = iVar2.F;
                                            com.garmin.android.apps.connectmobile.userprofile.i.d dVarD2 = iVar2.f46766r.d();
                                            if (dVarD2 != null) {
                                                d0Var3 = d0.b(dVarD2.f46789b, null, null, null, null, null, lJ2, null, 383);
                                            } else {
                                                d0Var3 = new d0(null, null, null, null, false, null, null, lJ2, null, 383, null);
                                                lJ2 = lJ2;
                                            }
                                            d0 d0Var5 = d0Var3;
                                            eVar3.getClass();
                                            li0.f.b bVar3 = new li0.f.b();
                                            bVar3.f112666a = new g12.k(iVar2, 0);
                                            bVar3.f112667b = new g12.l(iVar2, bVar3, lJ2, 0);
                                            bVar3.f112668c = new g12.k(iVar2, 1);
                                            Unit unit2 = Unit.INSTANCE;
                                            d1.b(context3, new r(new v4(bVar3, eVar3, (Object) null, d0Var5, context3, 17)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ2);
                        }
                    }
                    e23.a aVar6 = (e23.a) objQ2;
                    boolean zR2 = mVar3.r(iVar) | mVar3.r(context) | mVar3.r(qVar);
                    Object objQ3 = mVar3.q();
                    if (zR2) {
                        objQ3 = new e23.a() { // from class: s12.l
                            @Override // e23.a
                            public final Object invoke() {
                                d0 d0Var2;
                                d0 d0Var3;
                                int i110 = i17;
                                q qVar2 = qVar;
                                com.garmin.android.apps.connectmobile.userprofile.i iVar2 = iVar;
                                switch (i110) {
                                    case 0:
                                        Long lJ = qVar2.j();
                                        iVar2.getClass();
                                        Context context2 = context;
                                        context2.getClass();
                                        com.garmin.android.apps.connectmobile.userprofile.i.e eVar2 = iVar2.F;
                                        com.garmin.android.apps.connectmobile.userprofile.i.d dVarD = iVar2.f46766r.d();
                                        if (dVarD != null) {
                                            d0Var2 = d0.b(dVarD.f46789b, null, null, null, null, null, lJ, null, 383);
                                        } else {
                                            d0Var2 = new d0(null, null, null, null, false, null, null, lJ, null, 383, null);
                                            lJ = lJ;
                                        }
                                        d0 d0Var4 = d0Var2;
                                        eVar2.getClass();
                                        li0.f.b bVar2 = new li0.f.b();
                                        bVar2.f112666a = new g12.k(iVar2, 3);
                                        bVar2.f112667b = new g12.l(iVar2, bVar2, lJ, 2);
                                        Unit unit = Unit.INSTANCE;
                                        ge1.b.T(eVar2.f112660a, null, null, new li0.j(bVar2, eVar2, d0Var4, context2, null), 3);
                                        break;
                                    default:
                                        Long lJ2 = qVar2.j();
                                        iVar2.getClass();
                                        Context context3 = context;
                                        context3.getClass();
                                        com.garmin.android.apps.connectmobile.userprofile.i.e eVar3 = iVar2.F;
                                        com.garmin.android.apps.connectmobile.userprofile.i.d dVarD2 = iVar2.f46766r.d();
                                        if (dVarD2 != null) {
                                            d0Var3 = d0.b(dVarD2.f46789b, null, null, null, null, null, lJ2, null, 383);
                                        } else {
                                            d0Var3 = new d0(null, null, null, null, false, null, null, lJ2, null, 383, null);
                                            lJ2 = lJ2;
                                        }
                                        d0 d0Var5 = d0Var3;
                                        eVar3.getClass();
                                        li0.f.b bVar3 = new li0.f.b();
                                        bVar3.f112666a = new g12.k(iVar2, 0);
                                        bVar3.f112667b = new g12.l(iVar2, bVar3, lJ2, 0);
                                        bVar3.f112668c = new g12.k(iVar2, 1);
                                        Unit unit2 = Unit.INSTANCE;
                                        d1.b(context3, new r(new v4(bVar3, eVar3, (Object) null, d0Var5, context3, 17)));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new e23.a() { // from class: s12.l
                                @Override // e23.a
                                public final Object invoke() {
                                    d0 d0Var2;
                                    d0 d0Var3;
                                    int i110 = i17;
                                    q qVar2 = qVar;
                                    com.garmin.android.apps.connectmobile.userprofile.i iVar2 = iVar;
                                    switch (i110) {
                                        case 0:
                                            Long lJ = qVar2.j();
                                            iVar2.getClass();
                                            Context context2 = context;
                                            context2.getClass();
                                            com.garmin.android.apps.connectmobile.userprofile.i.e eVar2 = iVar2.F;
                                            com.garmin.android.apps.connectmobile.userprofile.i.d dVarD = iVar2.f46766r.d();
                                            if (dVarD != null) {
                                                d0Var2 = d0.b(dVarD.f46789b, null, null, null, null, null, lJ, null, 383);
                                            } else {
                                                d0Var2 = new d0(null, null, null, null, false, null, null, lJ, null, 383, null);
                                                lJ = lJ;
                                            }
                                            d0 d0Var4 = d0Var2;
                                            eVar2.getClass();
                                            li0.f.b bVar2 = new li0.f.b();
                                            bVar2.f112666a = new g12.k(iVar2, 3);
                                            bVar2.f112667b = new g12.l(iVar2, bVar2, lJ, 2);
                                            Unit unit = Unit.INSTANCE;
                                            ge1.b.T(eVar2.f112660a, null, null, new li0.j(bVar2, eVar2, d0Var4, context2, null), 3);
                                            break;
                                        default:
                                            Long lJ2 = qVar2.j();
                                            iVar2.getClass();
                                            Context context3 = context;
                                            context3.getClass();
                                            com.garmin.android.apps.connectmobile.userprofile.i.e eVar3 = iVar2.F;
                                            com.garmin.android.apps.connectmobile.userprofile.i.d dVarD2 = iVar2.f46766r.d();
                                            if (dVarD2 != null) {
                                                d0Var3 = d0.b(dVarD2.f46789b, null, null, null, null, null, lJ2, null, 383);
                                            } else {
                                                d0Var3 = new d0(null, null, null, null, false, null, null, lJ2, null, 383, null);
                                                lJ2 = lJ2;
                                            }
                                            d0 d0Var5 = d0Var3;
                                            eVar3.getClass();
                                            li0.f.b bVar3 = new li0.f.b();
                                            bVar3.f112666a = new g12.k(iVar2, 0);
                                            bVar3.f112667b = new g12.l(iVar2, bVar3, lJ2, 0);
                                            bVar3.f112668c = new g12.k(iVar2, 1);
                                            Unit unit2 = Unit.INSTANCE;
                                            d1.b(context3, new r(new v4(bVar3, eVar3, (Object) null, d0Var5, context3, 17)));
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar3.K(objQ3);
                        }
                    }
                    sVar.c(rVarC2, dVarA, aVar4, null, strQ, strP, strQ2, false, aVar6, (e23.a) objQ3, mVar3, 384, 0, 392);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                s40.j.a((String) obj5, (com.garmin.android.apps.connectmobile.courses.model.h) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                s50.c.a((t50.e) obj5, (d2) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                s50.d.a((t50.d) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                f0.a((h4.r) obj5, (z90.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                b92.a aVar7 = (b92.a) obj5;
                HelpActivity helpActivity = (HelpActivity) obj3;
                p1 p1Var = (p1) obj4;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                HelpActivity.a aVar8 = HelpActivity.f49800a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    int i24 = b3.a.f15501a;
                    u4.d dVarA2 = c3.a.a();
                    String str2 = (String) p1Var.getF182175a();
                    boolean zR3 = mVar4.r(helpActivity);
                    Object objQ4 = mVar4.q();
                    if (zR3) {
                        objQ4 = new ro0.g(helpActivity, 16);
                        mVar4.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ro0.g(helpActivity, 16);
                            mVar4.K(objQ4);
                        }
                    }
                    int i25 = b92.a.f16960b;
                    h3.e(dVarA2, str2, null, aVar7, (e23.a) objQ4, null, null, mVar4, 0, 100);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                s9.e.b((Long) obj5, (n0) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                sg0.f0 f0Var = (sg0.f0) obj5;
                o0 o0Var = (o0) obj3;
                ue0.l lVar2 = (ue0.l) obj4;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    l72.s sVar2 = l72.s.f111232a;
                    s62.a.f157643a.getClass();
                    u4.d dVarA3 = fa.a(t62.b.f162798a);
                    l72.s.a aVar9 = l72.s.a.KNOCKOUT;
                    h4.r.a aVar10 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    float f15 = eVar2.f97920e;
                    h4.r rVarC3 = c2.l.C(aVar10, f15, 0.0f, f15, eVar2.f97921f, 2);
                    String strQ3 = y.Q(mVar5, R.string.incomplete_device_list_description);
                    String strQ4 = y.Q(mVar5, R.string.msg_review_permissions);
                    String strQ5 = y.Q(mVar5, R.string.lbl_review_permissions);
                    boolean zR4 = mVar5.r(f0Var);
                    Object objQ5 = mVar5.q();
                    if (zR4) {
                        objQ5 = new ro0.g(f0Var, 24);
                        mVar5.K(objQ5);
                    } else {
                        aVar.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new ro0.g(f0Var, 24);
                            mVar5.K(objQ5);
                        }
                    }
                    e23.a aVar11 = (e23.a) objQ5;
                    boolean zB2 = mVar5.B(o0Var) | mVar5.r(lVar2);
                    Object objQ6 = mVar5.q();
                    if (zB2) {
                        objQ6 = new sg0.k(o0Var, lVar2, 1);
                        mVar5.K(objQ6);
                    } else {
                        aVar.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new sg0.k(o0Var, lVar2, 1);
                            mVar5.K(objQ6);
                        }
                    }
                    sVar2.c(rVarC3, dVarA3, aVar9, null, strQ3, strQ4, strQ5, false, aVar11, (e23.a) objQ6, mVar5, 384, 0, 392);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                sg0.r.c((a0) obj5, (sg0.p0) obj3, (sg0.p0) obj4, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                sg0.r.e((a0) obj5, (String) obj3, (Context) obj4, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                sg2.k.a((Map) obj5, (h0) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                si1.q.a((si1.e) obj5, (h4.r) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 14:
                sk0.i iVar2 = (sk0.i) obj5;
                Context context2 = (Context) obj3;
                sk0.l0 l0Var2 = (sk0.l0) obj;
                List list = (List) obj2;
                l0Var2.getClass();
                list.getClass();
                jk0.j jVarD = l0Var2.d();
                i53.c<uk0.a> cVar = ((sk0.l0) obj4).f159722c;
                ArrayList arrayList = new ArrayList(p13.y.r(cVar, 10));
                Iterator<uk0.a> it = cVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f171795a);
                }
                i53.c<uk0.a> cVar2 = l0Var2.f159722c;
                ArrayList arrayList2 = new ArrayList(p13.y.r(cVar2, 10));
                Iterator<uk0.a> it3 = cVar2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().f171795a);
                }
                iVar2.z4(context2, jVarD, arrayList, arrayList2, l0Var2.f159725f, j0.f134944a, l0Var2.f159727h, list);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                int i26 = com.garmin.android.apps.connectmobile.sleep.presentation.a.f44253g;
                ((com.garmin.android.apps.connectmobile.sleep.presentation.a) obj5).g((String) obj3, (String) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                sq1.c.b((Integer) obj5, (Integer) obj3, (pq1.d) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 17:
                e23.a aVar12 = (e23.a) obj5;
                u21.c cVar3 = (u21.c) obj3;
                e23.a aVar13 = (e23.a) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    String strQ6 = y.Q(mVar6, R.string.txt_activity_level_title);
                    b3.b.a aVar14 = b3.b.a.f15503a;
                    u4.d dVarA4 = d3.h.a();
                    boolean zB3 = mVar6.B(aVar12);
                    Object objQ7 = mVar6.q();
                    if (zB3) {
                        objQ7 = new q0(aVar12, 26);
                        mVar6.K(objQ7);
                    } else {
                        aVar.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new q0(aVar12, 26);
                            mVar6.K(objQ7);
                        }
                    }
                    e23.a aVar15 = (e23.a) objQ7;
                    i53.f fVarA = i53.a.a(new i3("SAVE", y.Q(mVar6, R.string.lbl_save), cVar3.f167910d, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB4 = mVar6.B(aVar13);
                    Object objQ8 = mVar6.q();
                    if (zB4) {
                        objQ8 = new m(aVar13, i16);
                        mVar6.K(objQ8);
                    } else {
                        aVar.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new m(aVar13, i16);
                            mVar6.K(objQ8);
                        }
                    }
                    z02.f.d(strQ6, null, dVarA4, aVar15, fVarA, null, (e23.l) objQ8, mVar6, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 18:
                e23.a aVar16 = (e23.a) obj5;
                e23.l lVar3 = (e23.l) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    String strQ7 = y.Q(mVar7, R.string.calories_goal);
                    b3.b.a aVar17 = b3.b.a.f15503a;
                    u4.d dVarA5 = d3.h.a();
                    boolean zB5 = mVar7.B(aVar16);
                    Object objQ9 = mVar7.q();
                    if (zB5) {
                        objQ9 = new t21.a(aVar16, 2);
                        mVar7.K(objQ9);
                    } else {
                        aVar.getClass();
                        if (objQ9 == p3.m.a.f135155b) {
                            objQ9 = new t21.a(aVar16, 2);
                            mVar7.K(objQ9);
                        }
                    }
                    e23.a aVar18 = (e23.a) objQ9;
                    i53.f fVarA2 = i53.a.a(new i3("SAVE", y.Q(mVar7, R.string.lbl_save), ((l0) p1Var2.getF182175a()).f188878a.f157138b.length() > 0, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB6 = mVar7.B(lVar3);
                    Object objQ10 = mVar7.q();
                    if (zB6) {
                        objQ10 = new oy0.c(lVar3, p1Var2, i15);
                        mVar7.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new oy0.c(lVar3, p1Var2, i15);
                            mVar7.K(objQ10);
                        }
                    }
                    z02.f.d(strQ7, null, dVarA5, aVar18, fVarA2, null, (e23.l) objQ10, mVar7, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 19:
                e23.a aVar19 = (e23.a) obj5;
                u21.l0 l0Var3 = (u21.l0) obj3;
                e23.a aVar20 = (e23.a) obj4;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    String strQ8 = y.Q(mVar8, R.string.macronutrients);
                    b3.b.a aVar21 = b3.b.a.f15503a;
                    u4.d dVarA6 = d3.h.a();
                    i53.f fVarA3 = i53.a.a(new i3("SAVE", y.Q(mVar8, R.string.lbl_save), l0Var3.f168037j, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
                    boolean zB7 = mVar8.B(aVar20);
                    Object objQ11 = mVar8.q();
                    if (zB7) {
                        objQ11 = new m(aVar20, 8);
                        mVar8.K(objQ11);
                    } else {
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new m(aVar20, 8);
                            mVar8.K(objQ11);
                        }
                    }
                    z02.f.d(strQ8, null, dVarA6, aVar19, fVarA3, null, (e23.l) objQ11, mVar8, GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE, 82);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 20:
                s21.c cVar4 = (s21.c) obj5;
                a0 a0Var = (a0) obj3;
                e23.l lVar4 = (e23.l) obj4;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    s21.c cVar5 = s21.c.CLASSIC;
                    String strT = gl1.d.T(cVar5.a(), mVar9, 0);
                    x0.f23314a.getClass();
                    String strW = gl1.d.W(x0.f23563oe);
                    boolean z15 = cVar4 == cVar5;
                    h4.r.a aVar22 = h4.r.S;
                    h4.r rVarA2 = a0Var.a(aVar22, 1.0f, true);
                    boolean zB8 = mVar9.B(lVar4);
                    Object objQ12 = mVar9.q();
                    if (zB8) {
                        objQ12 = new sq1.e(lVar4, 4);
                        mVar9.K(objQ12);
                    } else {
                        aVar.getClass();
                        if (objQ12 == p3.m.a.f135155b) {
                            objQ12 = new sq1.e(lVar4, 4);
                            mVar9.K(objQ12);
                        }
                    }
                    m0.a(strT, strW, z15, R.raw.classic_daily_view_animation, (e23.a) objQ12, 0, rVarA2, true, mVar9, 12779520, 0);
                    s21.c cVar6 = s21.c.TIMELINE;
                    String strT2 = gl1.d.T(cVar6.a(), mVar9, 0);
                    String strW2 = gl1.d.W(x0.Qe);
                    h4.r rVarA3 = a0Var.a(aVar22, 1.0f, true);
                    boolean z16 = cVar4 == cVar6;
                    boolean zB9 = mVar9.B(lVar4);
                    Object objQ13 = mVar9.q();
                    if (zB9) {
                        objQ13 = new sq1.e(lVar4, 5);
                        mVar9.K(objQ13);
                    } else {
                        aVar.getClass();
                        if (objQ13 == p3.m.a.f135155b) {
                            objQ13 = new sq1.e(lVar4, 5);
                            mVar9.K(objQ13);
                        }
                    }
                    m0.a(strT2, strW2, z16, R.raw.timeline_daily_view_animation, (e23.a) objQ13, 1, rVarA3, false, mVar9, 196608, 128);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 21:
                m4.q qVar2 = (m4.q) obj5;
                m3 m3Var = (m3) obj3;
                e23.a aVar23 = (e23.a) obj4;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    l72.f0 f0Var2 = l72.f0.f110999a;
                    x0.f23314a.getClass();
                    String strW3 = gl1.d.W(x0.Ud);
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    boolean zR5 = mVar10.r(qVar2) | mVar10.B(m3Var) | mVar10.B(aVar23);
                    Object objQ14 = mVar10.q();
                    if (zR5) {
                        objQ14 = new t21.n0(qVar2, m3Var, aVar23, 2);
                        mVar10.K(objQ14);
                    } else {
                        aVar.getClass();
                        if (objQ14 == p3.m.a.f135155b) {
                            objQ14 = new t21.n0(qVar2, m3Var, aVar23, 2);
                            mVar10.K(objQ14);
                        }
                    }
                    f0Var2.d(384, 9, (e23.a) objQ14, rVarF, strW3, mVar10, null, false);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                t42.b.a((LocalDate) obj5, (e23.a) obj3, (e23.l) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 23:
                ArrayList arrayList3 = (ArrayList) obj5;
                TrainingEffectDetailActivity trainingEffectDetailActivity = (TrainingEffectDetailActivity) obj3;
                c.q qVar3 = (c.q) obj4;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                TrainingEffectDetailActivity.a aVar24 = TrainingEffectDetailActivity.f40000v;
                if (mVar11.n(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    i53.f fVarJ = i53.a.j(arrayList3);
                    boolean zB10 = ((f12.l) trainingEffectDetailActivity.f40020t.getValue()).B3();
                    boolean zR6 = mVar11.r(qVar3) | mVar11.r(trainingEffectDetailActivity);
                    Object objQ15 = mVar11.q();
                    if (zR6) {
                        objQ15 = new sy.i(i16, qVar3, trainingEffectDetailActivity);
                        mVar11.K(objQ15);
                    } else {
                        aVar.getClass();
                        if (objQ15 == p3.m.a.f135155b) {
                            objQ15 = new sy.i(i16, qVar3, trainingEffectDetailActivity);
                            mVar11.K(objQ15);
                        }
                    }
                    z61.a.a(fVarJ, zB10, (e23.l) objQ15, mVar11, 0);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 24:
                h82.r rVar2 = (h82.r) obj5;
                String str3 = (String) obj3;
                final t72.f fVar2 = (t72.f) obj4;
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                int i27 = t72.f.f163126f;
                if (mVar12.n(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    boolean zG = p005kotlin.jvm.internal.s.g(str3, "ACTION_1");
                    boolean zR7 = mVar12.r(fVar2);
                    Object objQ16 = mVar12.q();
                    if (zR7) {
                        final int i28 = z14 ? 1 : 0;
                        objQ16 = new e23.a() { // from class: t72.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i29 = i28;
                                f fVar3 = fVar2;
                                switch (i29) {
                                    case 0:
                                        int i30 = f.f163126f;
                                        fVar3.e("ACTION_1");
                                        break;
                                    default:
                                        int i34 = f.f163126f;
                                        fVar3.e("ACTION_2");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ16);
                    } else {
                        aVar.getClass();
                        if (objQ16 == p3.m.a.f135155b) {
                            final int i29 = z14 ? 1 : 0;
                            objQ16 = new e23.a() { // from class: t72.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i29;
                                    f fVar3 = fVar2;
                                    switch (i210) {
                                        case 0:
                                            int i30 = f.f163126f;
                                            fVar3.e("ACTION_1");
                                            break;
                                        default:
                                            int i34 = f.f163126f;
                                            fVar3.e("ACTION_2");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ16);
                        }
                    }
                    rVar2.B(R.string.main_help_action_1, null, zG, (e23.a) objQ16, mVar12, 0, 2);
                    boolean zG2 = p005kotlin.jvm.internal.s.g(str3, "ACTION_2");
                    boolean zR8 = mVar12.r(fVar2);
                    Object objQ17 = mVar12.q();
                    if (zR8) {
                        objQ17 = new e23.a() { // from class: t72.d
                            @Override // e23.a
                            public final Object invoke() {
                                int i210 = i17;
                                f fVar3 = fVar2;
                                switch (i210) {
                                    case 0:
                                        int i30 = f.f163126f;
                                        fVar3.e("ACTION_1");
                                        break;
                                    default:
                                        int i34 = f.f163126f;
                                        fVar3.e("ACTION_2");
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar12.K(objQ17);
                    } else {
                        aVar.getClass();
                        if (objQ17 == p3.m.a.f135155b) {
                            objQ17 = new e23.a() { // from class: t72.d
                                @Override // e23.a
                                public final Object invoke() {
                                    int i210 = i17;
                                    f fVar3 = fVar2;
                                    switch (i210) {
                                        case 0:
                                            int i30 = f.f163126f;
                                            fVar3.e("ACTION_1");
                                            break;
                                        default:
                                            int i34 = f.f163126f;
                                            fVar3.e("ACTION_2");
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar12.K(objQ17);
                        }
                    }
                    rVar2.B(R.string.main_help_action_2, null, zG2, (e23.a) objQ17, mVar12, 0, 2);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 25:
                e23.a aVar25 = (e23.a) obj5;
                t2 t2Var = (t2) obj3;
                e23.a aVar26 = (e23.a) obj4;
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    t91.a.f163199a.getClass();
                    h7.a(aVar25, null, false, null, null, t91.a.f163200b, mVar13, 1572864, 62);
                    c2.l.f(t2Var.a(h4.r.S, 1.0f, true), mVar13);
                    h1.c(aVar26, null, false, null, null, null, null, null, t91.a.f163201c, mVar13, C.ENCODING_PCM_32BIT, 510);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                ta0.h0.c((String) obj5, (t4.d) obj3, (h4.r) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                ta0.l0.a((d90.c) obj5, (o90.a) obj3, (h4.r) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 28:
                ((Integer) obj2).getClass();
                ta0.p0.b((o1) obj5, (e23.a) obj3, (e23.a) obj4, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                r0.a((l90.f) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ u(Object obj, int i14, Object obj2, Object obj3) {
        this.f155026a = i14;
        this.f155027b = obj;
        this.f155028c = obj2;
        this.f155029d = obj3;
    }

    public /* synthetic */ u(Object obj, e23.l lVar, o13.h hVar, int i14, int i15) {
        this.f155026a = i15;
        this.f155027b = obj;
        this.f155029d = lVar;
        this.f155028c = hVar;
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f155026a = i15;
        this.f155027b = obj;
        this.f155028c = obj2;
        this.f155029d = obj3;
    }
}
