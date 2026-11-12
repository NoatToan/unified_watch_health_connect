package xr;

import android.content.Context;
import android.widget.Toast;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activity.details.presentation.overview.SelectTrailBottomSheet;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.usersettings.stride.StrideLengthSettingsActivity;
import g02.s0;
import h5.e0;
import i3.mh;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l72.f0;
import nr.u0;
import o4.m1;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.v;
import s5.x0;
import u1.u;
import u1.w;
import u1.y0;
import v62.e1;
import xd2.m0;
import ya0.d0;
import yr.t0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f192003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f192004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f192005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f192006e;

    public /* synthetic */ n(Context context, e23.a aVar, e23.l lVar, p1 p1Var) {
        this.f192002a = 16;
        this.f192003b = context;
        this.f192005d = aVar;
        this.f192006e = lVar;
        this.f192004c = p1Var;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x052b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0555  */
    /* JADX WARN: Code duplicated, block: B:133:0x0583  */
    /* JADX WARN: Code duplicated, block: B:181:0x0768  */
    /* JADX WARN: Code duplicated, block: B:213:0x092f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0938  */
    /* JADX WARN: Code duplicated, block: B:216:0x093c  */
    /* JADX WARN: Code duplicated, block: B:221:0x0959  */
    /* JADX WARN: Code duplicated, block: B:224:0x0965  */
    /* JADX WARN: Code duplicated, block: B:229:0x09d8  */
    /* JADX WARN: Code duplicated, block: B:231:0x09e0  */
    /* JADX WARN: Code duplicated, block: B:232:0x09ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:233:0x09ef  */
    /* JADX WARN: Code duplicated, block: B:234:0x0a16  */
    /* JADX WARN: Code duplicated, block: B:236:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:237:0x0a2f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:246:0x0ae0  */
    /* JADX WARN: Code duplicated, block: B:247:0x0b1a  */
    /* JADX WARN: Code duplicated, block: B:261:0x0b30 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:85:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:90:0x03f0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
        long jF;
        Object obj3;
        h5.g.a.f fVar;
        j92.c cVar;
        String str;
        Long l14;
        f12.l lVar;
        Iterator it;
        p3.m mVar;
        z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        String str2;
        Object obj4;
        h4.r.a aVar;
        j92.c cVar2;
        String strQ;
        p3.m mVar2;
        boolean zR;
        Object objQ;
        p3.m mVar3;
        final int i14;
        int i15 = this.f192002a;
        p3.m.a aVar2 = p3.m.f135153a;
        ?? r14 = 1;
        char c14 = 1;
        Object obj5 = this.f192006e;
        Object obj6 = this.f192005d;
        Object obj7 = this.f192004c;
        Object obj8 = this.f192003b;
        switch (i15) {
            case 0:
                p3.m.a aVar3 = aVar2;
                SelectTrailBottomSheet selectTrailBottomSheet = (SelectTrailBottomSheet) obj8;
                DecimalFormat decimalFormat = selectTrailBottomSheet.f30108h;
                p1 p1Var = (p1) obj7;
                x3 x3Var = (x3) obj6;
                f12.l lVar2 = (f12.l) obj5;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar4.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    h4.r rVarX = x2.x(x2.f(u1.n.e(aVar4, vb.h.e(d92.b.f58623a, mVar4), m1.f128891a), 1.0f), null, 3);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode2 = Long.hashCode(mVar4.getU());
                    i2 i2VarX2 = mVar4.x();
                    h4.r rVarC2 = h4.k.c(rVarX, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar5 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar5);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar4);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar4.getT() || !s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar4);
                    b0 b0Var = b0.f22601a;
                    f0.a aVar6 = f0.a.f111000a;
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarC3 = c2.l.C(c2.l.A(aVar4, 0.0f, eVar.f97920e, 1), eVar.f97920e, 0.0f, 0.0f, 0.0f, 14);
                    String strQ2 = gl1.y.Q(mVar4, R.string.lbl_save);
                    boolean z14 = ((ms1.d) p1Var.getF182175a()) != null;
                    boolean zR2 = mVar4.r(selectTrailBottomSheet);
                    Object objQ2 = mVar4.q();
                    if (zR2) {
                        objQ2 = new x72.k(b0Var, 4, p1Var, selectTrailBottomSheet);
                        mVar4.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new x72.k(b0Var, 4, p1Var, selectTrailBottomSheet);
                            mVar4.K(objQ2);
                        }
                    }
                    aVar6.f(strQ2, rVarC3, z14, (e23.a) objQ2, mVar4, 0, 0);
                    mVar4.C(-1647962067);
                    Iterator it3 = ((u0) x3Var.getF182175a()).f127376a.iterator();
                    while (it3.hasNext()) {
                        ms1.d dVar = (ms1.d) it3.next();
                        boolean zG = s.g((ms1.d) p1Var.getF182175a(), dVar);
                        h4.r.a aVar7 = h4.r.S;
                        if (zG) {
                            mVar4.C(241107449);
                            d92.b.f58623a.getClass();
                            jF = d92.b.a(mVar4).c().e();
                        } else {
                            mVar4.C(241108633);
                            d92.b.f58623a.getClass();
                            jF = d92.b.a(mVar4).c().f();
                        }
                        mVar4.f();
                        h4.r rVarE = u1.n.e(aVar7, jF, m1.f128891a);
                        Object objQ3 = mVar4.q();
                        aVar3.getClass();
                        Object obj9 = p3.m.a.f135155b;
                        if (objQ3 == obj9) {
                            objQ3 = new m0(9);
                            mVar4.K(objQ3);
                        }
                        h4.r rVarC4 = v.c((e23.l) objQ3, rVarE, r14);
                        boolean zR3 = mVar4.r(dVar);
                        Object objQ4 = mVar4.q();
                        if (zR3 || objQ4 == obj9) {
                            objQ4 = new a(r14, dVar, p1Var);
                            mVar4.K(objQ4);
                        }
                        h4.r rVarD = w.d(rVarC4, false, null, null, (e23.a) objQ4, 15);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        h4.r rVarF = x2.f(c2.l.y(rVarD, eVar2.f97920e), 1.0f);
                        h4.d.f81522a.getClass();
                        h4.g.b bVar2 = h4.d.a.f81534l;
                        c2.j jVar = c2.j.f22691a;
                        float f14 = eVar2.f97919d;
                        jVar.getClass();
                        s2 s2VarA = q2.a(c2.j.i(f14), bVar2, mVar4, 48);
                        x1 x1Var2 = p3.n.f135158a;
                        int iHashCode3 = Long.hashCode(mVar4.getU());
                        i2 i2VarX3 = mVar4.x();
                        h4.r rVarC5 = h4.k.c(rVarF, mVar4);
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
                        p3.m.a aVar9 = aVar3;
                        h5.g.a.e eVar3 = h5.g.a.f81810g;
                        b4.c(eVar3, s2VarA, mVar4);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX3, mVar4);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        DecimalFormat decimalFormat2 = decimalFormat;
                        if (mVar4.getT()) {
                            obj3 = obj9;
                        } else {
                            obj3 = obj9;
                            if (!s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                            }
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC5, mVar4);
                            u2 u2Var = u2.f22900a;
                            cVar = j92.b.f97901d;
                            h4.r rVarM = x2.m(aVar7, cVar.f97906e);
                            String str3 = dVar.f120486d;
                            str = dVar.f120485c;
                            l14 = dVar.f120493k;
                            lVar = lVar2;
                            it = it3;
                            mVar = mVar4;
                            jf.r.b(str3, null, rVarM, new t4.c(sn.a.b(mVar4), null), n5.c.a(R.drawable.no_trail_photo_placeholder, mVar4, 0), null, null, null, null, null, null, null, mVar, 48, 0, 32736);
                            h4.r rVarA = u2Var.a(aVar7, 1.0f, true);
                            zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 48);
                            iHashCode = Long.hashCode(mVar.getU());
                            i2VarX = mVar.x();
                            rVarC = h4.k.c(rVarA, mVar);
                            if (mVar.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar8);
                            } else {
                                mVar.c();
                            }
                            b4.c(eVar3, zVarA, mVar);
                            b4.c(c1623g, i2VarX, mVar);
                            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar, iHashCode, bVar3);
                            }
                            b4.c(fVar, rVarC, mVar);
                            b0 b0Var2 = b0.f22601a;
                            str2 = dVar.f120484b;
                            if (str2 == null) {
                                str2 = "";
                            }
                            d92.b.f58624b.getClass();
                            mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                            if (str != null || l14 == null) {
                                obj4 = obj3;
                                aVar = aVar7;
                                cVar2 = cVar;
                                if (str != null) {
                                    mVar.C(-173844237);
                                    mVar.f();
                                    strQ = str;
                                    decimalFormat = decimalFormat2;
                                } else if (l14 != null) {
                                    mVar.C(-173683409);
                                    mVar.f();
                                    l3.a aVar10 = l3.f23124b;
                                    Context context = selectTrailBottomSheet.getContext();
                                    double dLongValue = l14.longValue() / 100.0d;
                                    boolean zY = lVar.y();
                                    aVar10.getClass();
                                    decimalFormat = decimalFormat2;
                                    strQ = l3.a.Q(context, dLongValue, decimalFormat, true, zY);
                                } else {
                                    decimalFormat = decimalFormat2;
                                    mVar.C(-173236885);
                                    mVar.f();
                                    strQ = null;
                                }
                            } else {
                                mVar.C(-174602249);
                                l3.a aVar11 = l3.f23124b;
                                Context context2 = selectTrailBottomSheet.getContext();
                                double dLongValue2 = l14.longValue() / 100.0d;
                                boolean zY2 = lVar.y();
                                aVar11.getClass();
                                aVar = aVar7;
                                decimalFormat = decimalFormat2;
                                cVar2 = cVar;
                                obj4 = obj3;
                                strQ = gl1.y.P(R.string.string_space_bullet_string_pattern, new Object[]{str, l3.a.Q(context2, dLongValue2, decimalFormat, true, zY2)}, mVar);
                                mVar.f();
                            }
                            if (strQ == null) {
                                mVar.C(-173109383);
                                mVar.f();
                                mVar2 = mVar;
                            } else {
                                mVar.C(-173109382);
                                mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                                mVar2 = mVar;
                                Unit unit = Unit.INSTANCE;
                                mVar2.f();
                            }
                            zR = mVar2.r(selectTrailBottomSheet) | mVar2.r(dVar);
                            objQ = mVar2.q();
                            if (zR || objQ == obj4) {
                                objQ = new a(2, selectTrailBottomSheet, dVar);
                                mVar2.K(objQ);
                            }
                            p3.m mVar5 = mVar2;
                            mh.c(gl1.y.Q(mVar2, R.string.view_trail_details), w.d(aVar, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, ds.e0.e(mVar2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar5, 0, 0, 131068);
                            mVar3 = mVar5;
                            mVar3.y();
                            if (zG) {
                                mVar3.C(1561241471);
                                h4.r rVarM2 = x2.m(aVar, cVar2.f97904c);
                                s62.a.f157643a.getClass();
                                y0.b(e1.a(t62.b.f162798a), null, rVarM2, o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().a()), mVar3, 48, 56);
                                mVar3 = mVar3;
                                mVar3.f();
                            } else {
                                mVar3.C(1561653709);
                                mVar3.f();
                            }
                            mVar3.y();
                            mVar4 = mVar3;
                            aVar3 = aVar9;
                            lVar2 = lVar;
                            it3 = it;
                            r14 = 1;
                        }
                        v.h.z(iHashCode3, mVar4, iHashCode3, bVar3);
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC5, mVar4);
                        u2 u2Var2 = u2.f22900a;
                        cVar = j92.b.f97901d;
                        h4.r rVarM3 = x2.m(aVar7, cVar.f97906e);
                        String str4 = dVar.f120486d;
                        str = dVar.f120485c;
                        l14 = dVar.f120493k;
                        lVar = lVar2;
                        it = it3;
                        mVar = mVar4;
                        jf.r.b(str4, null, rVarM3, new t4.c(sn.a.b(mVar4), null), n5.c.a(R.drawable.no_trail_photo_placeholder, mVar4, 0), null, null, null, null, null, null, null, mVar, 48, 0, 32736);
                        h4.r rVarA2 = u2Var2.a(aVar7, 1.0f, true);
                        zVarA = y.a(c2.j.f22694d, h4.d.a.f81536n, mVar, 48);
                        iHashCode = Long.hashCode(mVar.getU());
                        i2VarX = mVar.x();
                        rVarC = h4.k.c(rVarA2, mVar);
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar8);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar3, zVarA, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT()) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar3);
                        } else {
                            v.h.z(iHashCode, mVar, iHashCode, bVar3);
                        }
                        b4.c(fVar, rVarC, mVar);
                        b0 b0Var3 = b0.f22601a;
                        str2 = dVar.f120484b;
                        if (str2 == null) {
                            str2 = "";
                        }
                        d92.b.f58624b.getClass();
                        mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar), mVar, 0, 0, 131070);
                        if (str != null) {
                            obj4 = obj3;
                            aVar = aVar7;
                            cVar2 = cVar;
                            if (str != null) {
                                mVar.C(-173844237);
                                mVar.f();
                                strQ = str;
                                decimalFormat = decimalFormat2;
                            } else if (l14 != null) {
                                mVar.C(-173683409);
                                mVar.f();
                                l3.a aVar12 = l3.f23124b;
                                Context context3 = selectTrailBottomSheet.getContext();
                                double dLongValue3 = l14.longValue() / 100.0d;
                                boolean zY3 = lVar.y();
                                aVar12.getClass();
                                decimalFormat = decimalFormat2;
                                strQ = l3.a.Q(context3, dLongValue3, decimalFormat, true, zY3);
                            } else {
                                decimalFormat = decimalFormat2;
                                mVar.C(-173236885);
                                mVar.f();
                                strQ = null;
                            }
                        } else {
                            obj4 = obj3;
                            aVar = aVar7;
                            cVar2 = cVar;
                            if (str != null) {
                                mVar.C(-173844237);
                                mVar.f();
                                strQ = str;
                                decimalFormat = decimalFormat2;
                            } else if (l14 != null) {
                                mVar.C(-173683409);
                                mVar.f();
                                l3.a aVar13 = l3.f23124b;
                                Context context4 = selectTrailBottomSheet.getContext();
                                double dLongValue4 = l14.longValue() / 100.0d;
                                boolean zY4 = lVar.y();
                                aVar13.getClass();
                                decimalFormat = decimalFormat2;
                                strQ = l3.a.Q(context4, dLongValue4, decimalFormat, true, zY4);
                            } else {
                                decimalFormat = decimalFormat2;
                                mVar.C(-173236885);
                                mVar.f();
                                strQ = null;
                            }
                        }
                        if (strQ == null) {
                            mVar.C(-173109383);
                            mVar.f();
                            mVar2 = mVar;
                        } else {
                            mVar.C(-173109382);
                            mh.c(strQ, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                            mVar2 = mVar;
                            Unit unit2 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        zR = mVar2.r(selectTrailBottomSheet) | mVar2.r(dVar);
                        objQ = mVar2.q();
                        if (zR) {
                            objQ = new a(2, selectTrailBottomSheet, dVar);
                            mVar2.K(objQ);
                        } else {
                            objQ = new a(2, selectTrailBottomSheet, dVar);
                            mVar2.K(objQ);
                        }
                        p3.m mVar6 = mVar2;
                        mh.c(gl1.y.Q(mVar2, R.string.view_trail_details), w.d(aVar, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0.a(j92.f.f97933j, ds.e0.e(mVar2), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar6, 0, 0, 131068);
                        mVar3 = mVar6;
                        mVar3.y();
                        if (zG) {
                            mVar3.C(1561241471);
                            h4.r rVarM4 = x2.m(aVar, cVar2.f97904c);
                            s62.a.f157643a.getClass();
                            y0.b(e1.a(t62.b.f162798a), null, rVarM4, o4.e0.a.a(o4.e0.f128843b, d92.b.a(mVar3).f().a()), mVar3, 48, 56);
                            mVar3 = mVar3;
                            mVar3.f();
                        } else {
                            mVar3.C(1561653709);
                            mVar3.f();
                        }
                        mVar3.y();
                        mVar4 = mVar3;
                        aVar3 = aVar9;
                        lVar2 = lVar;
                        it3 = it;
                        r14 = 1;
                    }
                    p3.m mVar7 = mVar4;
                    mVar7.f();
                    mVar7.y();
                    x1 x1Var3 = p3.n.f135158a;
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                xy.h.a((List) obj8, (DateTime) obj7, (DateTime) obj6, (sy.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                p1 p1Var2 = (p1) obj7;
                n80.a aVar14 = (n80.a) obj8;
                ya0.g gVar = (ya0.g) obj6;
                Context context5 = (Context) obj5;
                p3.m mVar8 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar8.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    s0.a(x2.d(h4.r.S, 1.0f), s.g((Boolean) p1Var2.getF182175a(), Boolean.FALSE), z3.f.c(-1448526559, new xk1.e(aVar14, 10, gVar, context5), mVar8), mVar8, 390, 0);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                d0.a((ya0.c) obj8, (l90.b) obj7, (e23.a) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ya0.e0.a((q90.c) obj8, (o1) obj7, (e23.q) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                yg2.f0.e((yg2.h) obj8, (m4.b0) obj7, (u) obj6, (k2.h) obj5, (p3.m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 6:
                StrideLengthSettingsActivity strideLengthSettingsActivity = (StrideLengthSettingsActivity) obj8;
                final yk1.i iVar = (yk1.i) obj7;
                final String str5 = (String) obj5;
                x3 x3Var2 = (x3) obj6;
                p3.m mVar9 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                StrideLengthSettingsActivity.a aVar15 = StrideLengthSettingsActivity.f44198b;
                if (mVar9.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    int i16 = ((al1.a) x3Var2.getF182175a()).f3753b;
                    boolean zR4 = mVar9.r(iVar) | mVar9.B(str5);
                    Object objQ5 = mVar9.q();
                    if (zR4) {
                        i14 = 0;
                        objQ5 = new e23.l() { // from class: yk1.g
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                int i17 = i14;
                                String str6 = str5;
                                i iVar2 = iVar;
                                switch (i17) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar16 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode4 = str6.hashCode();
                                        if (iHashCode4 != -2026200673) {
                                            if (iHashCode4 != -988312717) {
                                                if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.N(iIntValue4);
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.R(iIntValue4);
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.G(iIntValue4);
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    case 1:
                                        double dDoubleValue = ((Double) obj10).doubleValue();
                                        StrideLengthSettingsActivity.a aVar17 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode5 = str6.hashCode();
                                        if (iHashCode5 != -2026200673) {
                                            if (iHashCode5 != -988312717) {
                                                if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.M(dDoubleValue);
                                                    int i18 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                    if (i18 > 0) {
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i18)));
                                                    }
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.Q(dDoubleValue);
                                                int i19 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                if (i19 > 0) {
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i19)));
                                                }
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.F(dDoubleValue);
                                            int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                            if (i24 > 0) {
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                            }
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    default:
                                        int iIntValue5 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode6 = str6.hashCode();
                                        if (iHashCode6 != -2026200673) {
                                            if (iHashCode6 != -988312717) {
                                                if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.O(iIntValue5);
                                                    GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.S(iIntValue5);
                                                GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.H(iIntValue5);
                                            GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                        }
                                        iVar2.z4(str6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ5);
                    } else {
                        aVar2.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            i14 = 0;
                            objQ5 = new e23.l() { // from class: yk1.g
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    int i17 = i14;
                                    String str6 = str5;
                                    i iVar2 = iVar;
                                    switch (i17) {
                                        case 0:
                                            int iIntValue4 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar16 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode4 = str6.hashCode();
                                            if (iHashCode4 != -2026200673) {
                                                if (iHashCode4 != -988312717) {
                                                    if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.N(iIntValue4);
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.R(iIntValue4);
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.G(iIntValue4);
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        case 1:
                                            double dDoubleValue = ((Double) obj10).doubleValue();
                                            StrideLengthSettingsActivity.a aVar17 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode5 = str6.hashCode();
                                            if (iHashCode5 != -2026200673) {
                                                if (iHashCode5 != -988312717) {
                                                    if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.M(dDoubleValue);
                                                        int i18 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                        if (i18 > 0) {
                                                            GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i18)));
                                                        }
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.Q(dDoubleValue);
                                                    int i19 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                    if (i19 > 0) {
                                                        GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i19)));
                                                    }
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.F(dDoubleValue);
                                                int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                                if (i24 > 0) {
                                                    GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                                }
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        default:
                                            int iIntValue5 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode6 = str6.hashCode();
                                            if (iHashCode6 != -2026200673) {
                                                if (iHashCode6 != -988312717) {
                                                    if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.O(iIntValue5);
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.S(iIntValue5);
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.H(iIntValue5);
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                            }
                                            iVar2.z4(str6);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ5);
                        } else {
                            i14 = 0;
                        }
                    }
                    w52.u0.e(strideLengthSettingsActivity, i16, (e23.l) objQ5, mVar9, i14);
                    al1.a aVar16 = (al1.a) x3Var2.getF182175a();
                    boolean zR5 = mVar9.r(iVar) | mVar9.B(str5);
                    Object objQ6 = mVar9.q();
                    if (zR5) {
                        final char c15 = c14 == true ? 1 : 0;
                        objQ6 = new e23.l() { // from class: yk1.g
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                int i17 = c15;
                                String str6 = str5;
                                i iVar2 = iVar;
                                switch (i17) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar17 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode4 = str6.hashCode();
                                        if (iHashCode4 != -2026200673) {
                                            if (iHashCode4 != -988312717) {
                                                if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.N(iIntValue4);
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.R(iIntValue4);
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.G(iIntValue4);
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    case 1:
                                        double dDoubleValue = ((Double) obj10).doubleValue();
                                        StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode5 = str6.hashCode();
                                        if (iHashCode5 != -2026200673) {
                                            if (iHashCode5 != -988312717) {
                                                if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.M(dDoubleValue);
                                                    int i18 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                    if (i18 > 0) {
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i18)));
                                                    }
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.Q(dDoubleValue);
                                                int i19 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                if (i19 > 0) {
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i19)));
                                                }
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.F(dDoubleValue);
                                            int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                            if (i24 > 0) {
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                            }
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    default:
                                        int iIntValue5 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar19 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode6 = str6.hashCode();
                                        if (iHashCode6 != -2026200673) {
                                            if (iHashCode6 != -988312717) {
                                                if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.O(iIntValue5);
                                                    GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.S(iIntValue5);
                                                GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.H(iIntValue5);
                                            GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                        }
                                        iVar2.z4(str6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ6);
                    } else {
                        aVar2.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            final int c16 = c14 == true ? 1 : 0;
                            objQ6 = new e23.l() { // from class: yk1.g
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    int i17 = c16;
                                    String str6 = str5;
                                    i iVar2 = iVar;
                                    switch (i17) {
                                        case 0:
                                            int iIntValue4 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar17 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode4 = str6.hashCode();
                                            if (iHashCode4 != -2026200673) {
                                                if (iHashCode4 != -988312717) {
                                                    if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.N(iIntValue4);
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.R(iIntValue4);
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.G(iIntValue4);
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        case 1:
                                            double dDoubleValue = ((Double) obj10).doubleValue();
                                            StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode5 = str6.hashCode();
                                            if (iHashCode5 != -2026200673) {
                                                if (iHashCode5 != -988312717) {
                                                    if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.M(dDoubleValue);
                                                        int i18 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                        if (i18 > 0) {
                                                            GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i18)));
                                                        }
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.Q(dDoubleValue);
                                                    int i19 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                    if (i19 > 0) {
                                                        GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i19)));
                                                    }
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.F(dDoubleValue);
                                                int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                                if (i24 > 0) {
                                                    GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                                }
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        default:
                                            int iIntValue5 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar19 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode6 = str6.hashCode();
                                            if (iHashCode6 != -2026200673) {
                                                if (iHashCode6 != -988312717) {
                                                    if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.O(iIntValue5);
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.S(iIntValue5);
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.H(iIntValue5);
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                            }
                                            iVar2.z4(str6);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ6);
                        }
                    }
                    zk1.c.a(strideLengthSettingsActivity, aVar16, (e23.l) objQ6, mVar9, 0);
                    al1.a aVar17 = (al1.a) x3Var2.getF182175a();
                    boolean zC4 = iVar.C4();
                    boolean zR6 = mVar9.r(iVar) | mVar9.B(str5);
                    Object objQ7 = mVar9.q();
                    if (zR6) {
                        final int i17 = 2;
                        objQ7 = new e23.l() { // from class: yk1.g
                            @Override // e23.l
                            public final Object invoke(Object obj10) {
                                int i18 = i17;
                                String str6 = str5;
                                i iVar2 = iVar;
                                switch (i18) {
                                    case 0:
                                        int iIntValue4 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode4 = str6.hashCode();
                                        if (iHashCode4 != -2026200673) {
                                            if (iHashCode4 != -988312717) {
                                                if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.N(iIntValue4);
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.R(iIntValue4);
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.G(iIntValue4);
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    case 1:
                                        double dDoubleValue = ((Double) obj10).doubleValue();
                                        StrideLengthSettingsActivity.a aVar19 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode5 = str6.hashCode();
                                        if (iHashCode5 != -2026200673) {
                                            if (iHashCode5 != -988312717) {
                                                if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.M(dDoubleValue);
                                                    int i19 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                    if (i19 > 0) {
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i19)));
                                                    }
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.Q(dDoubleValue);
                                                int i110 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                if (i110 > 0) {
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i110)));
                                                }
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.F(dDoubleValue);
                                            int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                            if (i24 > 0) {
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                            }
                                        }
                                        iVar2.z4(str6);
                                        break;
                                    default:
                                        int iIntValue5 = ((Integer) obj10).intValue();
                                        StrideLengthSettingsActivity.a aVar110 = StrideLengthSettingsActivity.f44198b;
                                        iVar2.getClass();
                                        int iHashCode6 = str6.hashCode();
                                        if (iHashCode6 != -2026200673) {
                                            if (iHashCode6 != -988312717) {
                                                if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                    GCMSettingManager.O(iIntValue5);
                                                    GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                GCMSettingManager.S(iIntValue5);
                                                GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                            }
                                        } else if (str6.equals("RUNNING")) {
                                            GCMSettingManager.H(iIntValue5);
                                            GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                        }
                                        iVar2.z4(str6);
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        mVar9.K(objQ7);
                    } else {
                        aVar2.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            final int i18 = 2;
                            objQ7 = new e23.l() { // from class: yk1.g
                                @Override // e23.l
                                public final Object invoke(Object obj10) {
                                    int i19 = i18;
                                    String str6 = str5;
                                    i iVar2 = iVar;
                                    switch (i19) {
                                        case 0:
                                            int iIntValue4 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode4 = str6.hashCode();
                                            if (iHashCode4 != -2026200673) {
                                                if (iHashCode4 != -988312717) {
                                                    if (iHashCode4 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.N(iIntValue4);
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.R(iIntValue4);
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.G(iIntValue4);
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        case 1:
                                            double dDoubleValue = ((Double) obj10).doubleValue();
                                            StrideLengthSettingsActivity.a aVar19 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode5 = str6.hashCode();
                                            if (iHashCode5 != -2026200673) {
                                                if (iHashCode5 != -988312717) {
                                                    if (iHashCode5 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.M(dDoubleValue);
                                                        int i110 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_walking_total_steps), 0);
                                                        if (i110 > 0) {
                                                            GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) i110)));
                                                        }
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.Q(dDoubleValue);
                                                    int i111 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_wheelchair_total_pushes), 0);
                                                    if (i111 > 0) {
                                                        GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) i111)));
                                                    }
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.F(dDoubleValue);
                                                int i24 = GCMSettingManager.f41536b.getInt(GCMSettingManager.f41535a.getString(R.string.key_running_total_steps), 0);
                                                if (i24 > 0) {
                                                    GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) i24)));
                                                }
                                            }
                                            iVar2.z4(str6);
                                            break;
                                        default:
                                            int iIntValue5 = ((Integer) obj10).intValue();
                                            StrideLengthSettingsActivity.a aVar110 = StrideLengthSettingsActivity.f44198b;
                                            iVar2.getClass();
                                            int iHashCode6 = str6.hashCode();
                                            if (iHashCode6 != -2026200673) {
                                                if (iHashCode6 != -988312717) {
                                                    if (iHashCode6 == 1836798297 && str6.equals("WALKING")) {
                                                        GCMSettingManager.O(iIntValue5);
                                                        GCMSettingManager.L((float) (GCMSettingManager.v() / ((double) iIntValue5)));
                                                    }
                                                } else if (str6.equals("WHEELCHAIR_PUSHING")) {
                                                    GCMSettingManager.S(iIntValue5);
                                                    GCMSettingManager.P((float) (GCMSettingManager.w() / ((double) iIntValue5)));
                                                }
                                            } else if (str6.equals("RUNNING")) {
                                                GCMSettingManager.H(iIntValue5);
                                                GCMSettingManager.E((float) (GCMSettingManager.o() / ((double) iIntValue5)));
                                            }
                                            iVar2.z4(str6);
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            mVar9.K(objQ7);
                        }
                    }
                    zk1.e.a(strideLengthSettingsActivity, aVar17, zC4, (e23.l) objQ7, mVar9, 0);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                StrideLengthSettingsActivity.a aVar18 = StrideLengthSettingsActivity.f44198b;
                ((StrideLengthSettingsActivity) obj8).fa((String) obj7, (e23.a) obj6, (z3.e) obj5, (p3.m) obj, p0.t(385));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                StrideLengthSettingsActivity.a aVar19 = StrideLengthSettingsActivity.f44198b;
                ((StrideLengthSettingsActivity) obj8).ea((String) obj7, (yk1.i) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ((yp0.o) obj8).f((i53.d) obj7, (b63.o) obj6, (b63.o) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                yq0.a.c((h4.r) obj8, (yq0.e) obj7, (List) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                yq0.l.b((yq0.f) obj8, (List) obj7, (e23.l) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                yq0.l.a((t2) obj8, (yq0.b) obj7, (e23.l) obj6, (e23.l) obj5, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 13:
                p1 p1Var3 = (p1) obj7;
                yq0.b bVar4 = (yq0.b) obj8;
                yq0.f fVar2 = (yq0.f) obj5;
                x3 x3Var3 = (x3) obj6;
                p3.m mVar10 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar10.n(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    if (((yq0.c) p1Var3.getF182175a()).f198738a) {
                        return Unit.INSTANCE;
                    }
                    if (((yq0.c) p1Var3.getF182175a()).f198740c) {
                        mVar10.C(-851880622);
                        String strQ3 = gl1.y.Q(mVar10, R.string.insights_home_error_msg);
                        h4.r rVarD2 = x2.d(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(j92.f.f97932i, mVar10);
                        d6.h.f57752b.getClass();
                        mh.c(strQ3, rVarD2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarB, mVar10, 48, 0, 130044);
                        mVar10.f();
                    } else {
                        mVar10.C(-851584789);
                        h4.r.a aVar20 = h4.r.S;
                        h4.r rVarE2 = u1.n.e(x2.d(aVar20, 1.0f), p6.b.a(d92.b.f58623a, mVar10), m1.f128891a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar2 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA3 = y.a(kVar2, h4.d.a.f81536n, mVar10, 0);
                        int iHashCode4 = Long.hashCode(mVar10.getU());
                        i2 i2VarX4 = mVar10.x();
                        h4.r rVarC6 = h4.k.c(rVarE2, mVar10);
                        h5.g.V.getClass();
                        e0.a aVar21 = h5.g.a.f81805b;
                        if (mVar10.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar10.z();
                        if (mVar10.getT()) {
                            mVar10.M(aVar21);
                        } else {
                            mVar10.c();
                        }
                        h5.g.a.e eVar4 = h5.g.a.f81810g;
                        b4.c(eVar4, zVarA3, mVar10);
                        h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                        b4.c(c1623g2, i2VarX4, mVar10);
                        h5.g.a.b bVar5 = h5.g.a.f81813j;
                        if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar10, iHashCode4, bVar5);
                        }
                        h5.g.a.f fVar3 = h5.g.a.f81807d;
                        b4.c(fVar3, rVarC6, mVar10);
                        b0 b0Var4 = b0.f22601a;
                        h4.r rVarF2 = x2.f(aVar20, 1.0f);
                        d92.b.f58625c.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        h4.r rVarC7 = c2.l.C(c2.l.A(rVarF2, eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97920e, 0.0f, 0.0f, 13);
                        String strQ4 = gl1.y.Q(mVar10, R.string.insights_compare_demographic_message);
                        d92.b.f58624b.getClass();
                        mh.c(strQ4, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97932i, mVar10), mVar10, 0, 0, 131068);
                        h4.r rVarC8 = c2.l.C(c2.l.A(x2.f(aVar20, 1.0f), eVar5.f97920e, 0.0f, 2), 0.0f, eVar5.f97918c, 0.0f, eVar5.f97920e, 5);
                        s2 s2VarA2 = q2.a(c2.j.f22696f, h4.d.a.f81534l, mVar10, 54);
                        int iHashCode5 = Long.hashCode(mVar10.getU());
                        i2 i2VarX5 = mVar10.x();
                        h4.r rVarC9 = h4.k.c(rVarC8, mVar10);
                        if (mVar10.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar10.z();
                        if (mVar10.getT()) {
                            mVar10.M(aVar21);
                        } else {
                            mVar10.c();
                        }
                        b4.c(eVar4, s2VarA2, mVar10);
                        b4.c(c1623g2, i2VarX5, mVar10);
                        if (mVar10.getT() || !s.g(mVar10.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar10, iHashCode5, bVar5);
                        }
                        b4.c(fVar3, rVarC9, mVar10);
                        u2 u2Var3 = u2.f22900a;
                        boolean zR7 = mVar10.r(fVar2);
                        Object objQ8 = mVar10.q();
                        if (zR7) {
                            objQ8 = new yq0.j(fVar2);
                            mVar10.K(objQ8);
                        } else {
                            aVar2.getClass();
                            if (objQ8 == p3.m.a.f135155b) {
                                objQ8 = new yq0.j(fVar2);
                                mVar10.K(objQ8);
                            }
                        }
                        e23.l lVar3 = (e23.l) ((k23.g) objQ8);
                        boolean zR8 = mVar10.r(fVar2);
                        Object objQ9 = mVar10.q();
                        if (zR8) {
                            objQ9 = new yq0.k(fVar2);
                            mVar10.K(objQ9);
                        } else {
                            aVar2.getClass();
                            if (objQ9 == p3.m.a.f135155b) {
                                objQ9 = new yq0.k(fVar2);
                                mVar10.K(objQ9);
                            }
                        }
                        yq0.l.a(u2Var3, bVar4, lVar3, (e23.l) ((k23.g) objQ9), mVar10, 6);
                        mVar10.y();
                        Map map = (Map) x3Var3.getF182175a();
                        boolean zR9 = mVar10.r(fVar2);
                        Object objQ10 = mVar10.q();
                        if (zR9) {
                            objQ10 = new xa2.g(fVar2, 26);
                            mVar10.K(objQ10);
                        } else {
                            aVar2.getClass();
                            if (objQ10 == p3.m.a.f135155b) {
                                objQ10 = new xa2.g(fVar2, 26);
                                mVar10.K(objQ10);
                            }
                        }
                        yq0.l.c(map, bVar4, (e23.l) objQ10, mVar10, 0);
                        mVar10.y();
                        mVar10.f();
                    }
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                yq0.m.a((h4.r) obj8, (tq0.e) obj7, (List) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                t0.b((t2) obj8, (ArrayList) obj7, (String) obj6, (e23.a) obj5, (p3.m) obj, p0.t(7));
                return Unit.INSTANCE;
            case 16:
                Context context6 = (Context) obj8;
                e23.a aVar22 = (e23.a) obj6;
                e23.l lVar4 = (e23.l) obj5;
                p1 p1Var4 = (p1) obj7;
                p3.m mVar11 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar11.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    if (((yv.a) p1Var4.getF182175a()).f199801a) {
                        mVar11.C(-206534086);
                        mVar11.f();
                    } else if (((yv.a) p1Var4.getF182175a()).f199802b) {
                        mVar11.C(-206454168);
                        mVar11.f();
                        Toast.makeText(context6, R.string.txt_something_went_wrong_try_again, 0).show();
                    } else if (((yv.a) p1Var4.getF182175a()).f199803c) {
                        mVar11.C(-206280661);
                        aVar22.invoke();
                        if (((yv.a) p1Var4.getF182175a()).f199811k) {
                            mVar11.C(-206206137);
                        } else {
                            mVar11.C(-206135984);
                            yv.h.b(((yv.a) p1Var4.getF182175a()).f199807g, mVar11, 0);
                        }
                        mVar11.f();
                        mVar11.f();
                    } else {
                        mVar11.C(-206014650);
                        mVar11.f();
                        lVar4.invoke((yv.a) p1Var4.getF182175a());
                    }
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                yv.h.a((yv.d) obj8, (e23.a) obj7, (e23.l) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                z21.f.h((a01.a) obj8, (Double) obj7, (Double) obj6, (e23.a) obj5, (p3.m) obj, p0.t(3073));
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                z82.a.a((h4.r) obj8, (e23.p) obj7, (z3.e) obj6, (e23.p) obj5, (p3.m) obj, p0.t(3505));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                zr.h.j((h4.r) obj8, (nr.z) obj7, (Integer) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zs1.j.a((h4.r) obj8, (i53.c) obj7, (e23.l) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ n(SelectTrailBottomSheet selectTrailBottomSheet, p1 p1Var, p1 p1Var2, f12.l lVar) {
        this.f192002a = 0;
        this.f192003b = selectTrailBottomSheet;
        this.f192004c = p1Var;
        this.f192005d = p1Var2;
        this.f192006e = lVar;
    }

    public /* synthetic */ n(StrideLengthSettingsActivity strideLengthSettingsActivity, yk1.i iVar, String str, p1 p1Var) {
        this.f192002a = 6;
        this.f192003b = strideLengthSettingsActivity;
        this.f192004c = iVar;
        this.f192006e = str;
        this.f192005d = p1Var;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, int i14, int i15) {
        this.f192002a = i15;
        this.f192003b = obj;
        this.f192004c = obj2;
        this.f192005d = obj3;
        this.f192006e = obj4;
    }

    public /* synthetic */ n(p1 p1Var, n80.a aVar, ya0.g gVar, Context context) {
        this.f192002a = 2;
        this.f192004c = p1Var;
        this.f192003b = aVar;
        this.f192005d = gVar;
        this.f192006e = context;
    }

    public /* synthetic */ n(p1 p1Var, yq0.b bVar, yq0.f fVar, p1 p1Var2) {
        this.f192002a = 13;
        this.f192004c = p1Var;
        this.f192003b = bVar;
        this.f192006e = fVar;
        this.f192005d = p1Var2;
    }
}
