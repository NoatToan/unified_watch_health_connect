package d81;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import b82.d1;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.solarintensity.presentation.activity.SolarIntensityActivity;
import et1.w0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import l3.k2;
import l3.x0;
import m92.m0;
import m92.n0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f58373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f58374c;

    public /* synthetic */ z(long j8, e23.p pVar, int i14) {
        this.f58372a = 4;
        this.f58373b = j8;
        this.f58374c = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:141:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0479  */
    /* JADX WARN: Code duplicated, block: B:159:0x0485  */
    /* JADX WARN: Code duplicated, block: B:161:0x0494  */
    /* JADX WARN: Code duplicated, block: B:164:0x0502  */
    /* JADX WARN: Code duplicated, block: B:166:0x050b  */
    /* JADX WARN: Code duplicated, block: B:167:0x050f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0530  */
    /* JADX WARN: Code duplicated, block: B:188:0x058d  */
    /* JADX WARN: Code duplicated, block: B:190:0x05ac  */
    /* JADX WARN: Code duplicated, block: B:192:0x05c4  */
    /* JADX WARN: Code duplicated, block: B:196:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:199:0x0600  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ab  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12, types: [i53.c] */
    /* JADX WARN: Type inference failed for: r13v10, types: [java.lang.Float] */
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
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        float f14;
        p3.m mVar;
        ArrayList arrayList;
        i53.c cVarD;
        Float fValueOf;
        Throwable th3;
        ArrayList arrayList2;
        Object objValueOf;
        Object obj3;
        Object obj4;
        h5.g.a.f fVar;
        Object objD;
        Object objB;
        ArrayList<m92.h0.e.a> arrayList3;
        c2.z zVarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        long j8;
        i53.c cVarB;
        i53.c cVarB2;
        Object obj5;
        int i14 = this.f58372a;
        int i15 = 10;
        int i16 = 0;
        long j14 = this.f58373b;
        Object obj6 = this.f58374c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                a0.a((g81.i0) obj6, j14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ek0.b.a((dk0.g) obj6, j14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                jf.d dVar = (jf.d) obj6;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    w0.a(null, dVar, this.f58373b, false, mVar2, 0, 9);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 3:
                fc1.g gVar = (fc1.g) obj6;
                i53.d<Float, Float> dVar2 = gVar.f70411d;
                i53.d<Float, Float> dVar3 = gVar.f70412e;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                Float fValueOf2 = Float.valueOf(240.0f);
                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = x2.d(aVar, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.b bVar = c2.j.f22695e;
                    h4.d.f81522a.getClass();
                    c2.z zVarA2 = c2.y.a(bVar, h4.d.a.f81536n, mVar3, 6);
                    int iHashCode2 = Long.hashCode(mVar3.getU());
                    i2 i2VarX2 = mVar3.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar3);
                    h5.g.V.getClass();
                    h5.e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar3.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar3.z();
                    if (mVar3.getT()) {
                        mVar3.M(aVar2);
                    } else {
                        mVar3.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar3);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar3);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar3, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar3);
                    c2.b0 b0Var = c2.b0.f22601a;
                    if (dVar2 == null || dVar2.isEmpty() || dVar3 == null || dVar3.isEmpty()) {
                        f14 = 1.0f;
                        mVar3.C(759070739);
                        String strQ = gl1.y.Q(mVar3, R.string.common_no_data);
                        h4.r rVarF = x2.f(aVar, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarF, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar3), mVar3, 48, 0, 131068);
                        mVar = mVar3;
                        mVar.f();
                    } else {
                        mVar3.C(756108255);
                        if (dVar2 != null) {
                            arrayList = new ArrayList(dVar2.size());
                            for (Map.Entry<Float, Float> entry : dVar2.entrySet()) {
                                arrayList.add(new m92.h0.e.a(entry.getKey().floatValue(), entry.getValue().floatValue()));
                            }
                        } else {
                            arrayList = null;
                        }
                        if (arrayList == null) {
                            mVar3.C(756195333);
                            mVar3.f();
                            cVarD = null;
                        } else {
                            mVar3.C(-1915269252);
                            cVarD = kc1.b.d(arrayList, mVar3);
                            mVar3.f();
                        }
                        if (cVarD != null) {
                            Iterator it = cVarD.iterator();
                            if (!it.hasNext()) {
                                c22.t.g();
                                return null;
                            }
                            float fMin = ((m92.h0.e.c) it.next()).f117350a.f117347b;
                            while (it.hasNext()) {
                                fMin = Math.min(fMin, ((m92.h0.e.c) it.next()).f117350a.f117347b);
                            }
                            fValueOf = Float.valueOf(fMin);
                        } else {
                            fValueOf = null;
                        }
                        if (dVar3 != null) {
                            arrayList2 = new ArrayList(dVar3.size());
                            for (Map.Entry<Float, Float> entry2 : dVar3.entrySet()) {
                                arrayList2.add(new m92.h0.e.a(entry2.getKey().floatValue(), entry2.getValue().floatValue()));
                            }
                            th3 = null;
                        } else {
                            th3 = null;
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            Iterator it3 = arrayList2.iterator();
                            if (!it3.hasNext()) {
                                c22.t.g();
                                return th3;
                            }
                            Object next = it3.next();
                            if (it3.hasNext()) {
                                float f15 = ((m92.h0.e.a) next).f117347b;
                                do {
                                    Object next2 = it3.next();
                                    float f16 = ((m92.h0.e.a) next2).f117347b;
                                    if (Float.compare(f15, f16) < 0) {
                                        f15 = f16;
                                        next = next2;
                                    }
                                } while (it3.hasNext());
                            }
                            m92.h0.e.a aVar3 = (m92.h0.e.a) next;
                            if (aVar3 != null) {
                                objValueOf = Float.valueOf(aVar3.f117347b);
                            } else {
                                objValueOf = th3;
                            }
                        } else {
                            objValueOf = th3;
                        }
                        h4.r.a aVar4 = h4.r.S;
                        h4.r rVarA = b0Var.a(aVar4, 0.5f, true);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC3 = c2.l.C(rVarA, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        h4.g.a aVar5 = h4.d.a.f81536n;
                        c2.z zVarA3 = c2.y.a(kVar, aVar5, mVar3, 0);
                        x1 x1Var3 = p3.n.f135158a;
                        int iHashCode3 = Long.hashCode(mVar3.getU());
                        i2 i2VarX3 = mVar3.x();
                        h4.r rVarC4 = h4.k.c(rVarC3, mVar3);
                        h5.g.V.getClass();
                        h5.e0.a aVar6 = h5.g.a.f81805b;
                        if (mVar3.F() == null) {
                            p0.l();
                            throw th3;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar6);
                        } else {
                            mVar3.c();
                        }
                        h5.g.a.e eVar = h5.g.a.f81810g;
                        b4.c(eVar, zVarA3, mVar3);
                        h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX3, mVar3);
                        h5.g.a.b bVar3 = h5.g.a.f81813j;
                        if (mVar3.getT()) {
                            obj3 = objValueOf;
                        } else {
                            obj5 = objValueOf;
                            if (!p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode3))) {
                            }
                            obj4 = obj5;
                            obj3 = obj5;
                            fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC4, mVar3);
                            c2.b0 b0Var2 = c2.b0.f22601a;
                            h4.r rVarD2 = x2.d(aVar4, 1.0f);
                            if (arrayList == null) {
                                mVar3.C(222195412);
                                mVar3.f();
                                objB = th3;
                            } else {
                                mVar3.C(-962663731);
                                objD = kc1.b.d(arrayList, mVar3);
                                mVar3.f();
                            }
                            if (objB == null) {
                                objB = objD;
                                objB = j53.l.b();
                            }
                            objB = objD;
                            arrayList3 = arrayList2;
                            m92.u.a(rVarD2, objB, Float.valueOf(24.0f), true, fValueOf, Float.valueOf(101.0f), 0.0f, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 27654, 7810);
                            mVar3.y();
                            h4.r rVarA2 = b0Var.a(aVar4, 0.5f, true);
                            zVarA = c2.y.a(kVar, aVar5, mVar3, 0);
                            iHashCode = Long.hashCode(mVar3.getU());
                            i2VarX = mVar3.x();
                            rVarC = h4.k.c(rVarA2, mVar3);
                            if (mVar3.F() != null) {
                                p0.l();
                                throw th3;
                            }
                            mVar3.z();
                            if (mVar3.getT()) {
                                mVar3.M(aVar6);
                            } else {
                                mVar3.c();
                            }
                            b4.c(eVar, zVarA, mVar3);
                            b4.c(c1623g, i2VarX, mVar3);
                            if (mVar3.getT() || !p005kotlin.jvm.internal.s.g(mVar3.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                            }
                            b4.c(fVar, rVarC, mVar3);
                            j8 = this.f58373b;
                            if (dVar3 == null && dVar3.size() == 1) {
                                mVar3.C(-885262550);
                                f14 = 1.0f;
                                h4.r rVarD3 = x2.d(aVar4, 1.0f);
                                if (arrayList3 != null) {
                                    ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
                                    for (m92.h0.e.a aVar7 : arrayList3) {
                                        aVar7.getClass();
                                        long j15 = j8;
                                        arrayList4.add(new m92.h0.e.c(aVar7, j15, null, 4, null));
                                        j8 = j15;
                                    }
                                    cVarB2 = i53.a.e(arrayList4);
                                    if (cVarB2 == null) {
                                        cVarB2 = j53.l.b();
                                    }
                                } else {
                                    cVarB2 = j53.l.b();
                                }
                                m92.u.a(rVarD3, cVarB2, fValueOf2, false, null, null, 0.0f, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 3078, 7922);
                                mVar = mVar3;
                                mVar.f();
                            } else {
                                f14 = 1.0f;
                                mVar3.C(-884574939);
                                h4.r rVarD4 = x2.d(aVar4, 1.0f);
                                if (arrayList3 != null || (cVarB = i53.a.e(arrayList3)) == null) {
                                    cVarB = j53.l.b();
                                }
                                n0.a(rVarD4, new m0(cVarB, (o4.d0) null, j8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), fValueOf2, Float.valueOf(0.0f), obj4, m92.e0.CUBIC_BEZIER, true, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 113443206);
                                mVar = mVar3;
                                mVar.f();
                            }
                            mVar.y();
                            mVar.f();
                        }
                        obj4 = obj5;
                        obj3 = obj5;
                        v.h.z(iHashCode3, mVar3, iHashCode3, bVar3);
                        obj4 = obj3;
                        obj4 = obj5;
                        obj3 = obj5;
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC4, mVar3);
                        c2.b0 b0Var3 = c2.b0.f22601a;
                        h4.r rVarD5 = x2.d(aVar4, 1.0f);
                        if (arrayList == null) {
                            mVar3.C(222195412);
                            mVar3.f();
                            objB = th3;
                        } else {
                            mVar3.C(-962663731);
                            objD = kc1.b.d(arrayList, mVar3);
                            mVar3.f();
                        }
                        if (objB == null) {
                            objB = objD;
                            objB = j53.l.b();
                        }
                        objB = objD;
                        arrayList3 = arrayList2;
                        m92.u.a(rVarD5, objB, Float.valueOf(24.0f), true, fValueOf, Float.valueOf(101.0f), 0.0f, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 27654, 7810);
                        mVar3.y();
                        h4.r rVarA3 = b0Var.a(aVar4, 0.5f, true);
                        zVarA = c2.y.a(kVar, aVar5, mVar3, 0);
                        iHashCode = Long.hashCode(mVar3.getU());
                        i2VarX = mVar3.x();
                        rVarC = h4.k.c(rVarA3, mVar3);
                        if (mVar3.F() != null) {
                            p0.l();
                            throw th3;
                        }
                        mVar3.z();
                        if (mVar3.getT()) {
                            mVar3.M(aVar6);
                        } else {
                            mVar3.c();
                        }
                        b4.c(eVar, zVarA, mVar3);
                        b4.c(c1623g, i2VarX, mVar3);
                        if (mVar3.getT()) {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                        } else {
                            v.h.z(iHashCode, mVar3, iHashCode, bVar3);
                        }
                        b4.c(fVar, rVarC, mVar3);
                        j8 = this.f58373b;
                        if (dVar3 == null) {
                            f14 = 1.0f;
                            mVar3.C(-884574939);
                            h4.r rVarD6 = x2.d(aVar4, 1.0f);
                            if (arrayList3 != null) {
                                cVarB = j53.l.b();
                            } else {
                                cVarB = j53.l.b();
                            }
                            n0.a(rVarD6, new m0(cVarB, (o4.d0) null, j8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), fValueOf2, Float.valueOf(0.0f), obj4, m92.e0.CUBIC_BEZIER, true, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 113443206);
                            mVar = mVar3;
                            mVar.f();
                        } else {
                            f14 = 1.0f;
                            mVar3.C(-884574939);
                            h4.r rVarD7 = x2.d(aVar4, 1.0f);
                            if (arrayList3 != null) {
                                cVarB = j53.l.b();
                            } else {
                                cVarB = j53.l.b();
                            }
                            n0.a(rVarD7, new m0(cVarB, (o4.d0) null, j8, (g6.f) null, 10, (p005kotlin.jvm.internal.j) null), fValueOf2, Float.valueOf(0.0f), obj4, m92.e0.CUBIC_BEZIER, true, gl1.y.Q(mVar3, R.string.common_no_data), mVar3, 113443206);
                            mVar = mVar3;
                            mVar.f();
                        }
                        mVar.y();
                        mVar.f();
                    }
                    String strQ2 = gl1.y.Q(mVar, R.string.mct_lbl_today);
                    h4.r rVarF2 = x2.f(h4.r.S, f14);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar2 = j92.b.f97899b;
                    h4.r rVarC5 = c2.l.C(rVarF2, 0.0f, eVar2.f97917b, 0.0f, eVar2.f97920e, 5);
                    d92.b.f58624b.getClass();
                    p3.m mVar4 = mVar;
                    mh.c(strQ2, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar4, 0, 0, 131068);
                    mVar4.y();
                    x1 x1Var4 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                k2.c(j14, (e23.p) obj6, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                m3.l.a((x0) obj6, j14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                mg2.e.a((e23.a) obj6, j14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) obj6;
                sd2.f fVar3 = (sd2.f) obj;
                sd2.f fVar4 = (sd2.f) obj2;
                fVar3.getClass();
                fVar4.getClass();
                boolean zB = fVar2.P0.b(fVar3.getUnitID());
                boolean zB2 = fVar2.P0.b(fVar4.getUnitID());
                if (zB && !zB2) {
                    i16 = -1;
                } else if (!zB && zB2) {
                    i16 = 1;
                } else if (zB) {
                    if (fVar3.getUnitID() == j14) {
                        i16 = -1;
                    } else if (fVar4.getUnitID() == j14) {
                        i16 = 1;
                    }
                } else if (fVar3.getUnitID() == j14) {
                    i16 = -1;
                } else if (fVar4.getUnitID() == j14) {
                    i16 = 1;
                } else {
                    i16 = p005kotlin.jvm.internal.s.i(fVar4.K2(), fVar3.K2());
                }
                return Integer.valueOf(i16);
            case 8:
                k31.c cVar = (k31.c) obj6;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar5.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d1 d1Var = d1.f16531a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.c cVar2 = j92.b.f97901d;
                    d1Var.b(cVar2.f97906e, cVar.f102648d, cVar2.f97905d, d92.b.a(mVar5).f().f63508c, this.f58373b, mVar5, 0);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                SolarIntensityActivity solarIntensityActivity = (SolarIntensityActivity) obj6;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                SolarIntensityActivity.a aVar8 = SolarIntensityActivity.f44787a;
                if (mVar6.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    boolean zL = mVar6.l(j14);
                    Object objQ = mVar6.q();
                    if (zL) {
                        objQ = new a90.b(j14, i15);
                        mVar6.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new a90.b(j14, i15);
                            mVar6.K(objQ);
                        }
                    }
                    e23.a aVar9 = (e23.a) objQ;
                    mVar6.L(-1614864554);
                    v9.a.f176280a.getClass();
                    ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(mVar6);
                    if (viewModelStoreOwnerA == null) {
                        vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        return null;
                    }
                    u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(yp1.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(mVar6, 0), aVar9);
                    mVar6.R();
                    z02.b.a(false, null, null, null, false, z3.f.c(-906955625, new rp1.a(solarIntensityActivity, (yp1.a) u1VarResolveViewModel), mVar6), mVar6, 196608, 31);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                wg2.e.a((z3.e) obj6, j14, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            default:
                i41.c cVar3 = (i41.c) obj6;
                p3.m mVar7 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (mVar7.n(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    m92.y.b(o4.d0.a(j14), String.valueOf(cVar3.getHrvValue()), gl1.y.Q(mVar7, R.string.lbl_ms), null, gl1.y.Q(mVar7, R.string.hrv), null, mVar7, 0, 40);
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ z(long j8, Object obj, int i14) {
        this.f58372a = i14;
        this.f58373b = j8;
        this.f58374c = obj;
    }

    public /* synthetic */ z(Object obj, int i14, int i15, long j8) {
        this.f58372a = i15;
        this.f58374c = obj;
        this.f58373b = j8;
    }

    public /* synthetic */ z(Object obj, long j8, int i14) {
        this.f58372a = i14;
        this.f58374c = obj;
        this.f58373b = j8;
    }
}
