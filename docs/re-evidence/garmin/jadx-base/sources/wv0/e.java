package wv0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.room.a0;
import c2.b0;
import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import c2.z;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.R;
import f5.z0;
import h2.j0;
import h5.e0;
import i3.mh;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l72.c1;
import l72.i3;
import l72.y2;
import lc.m0;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m1;
import p3.n1;
import p3.o1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import p3.y3;
import s5.x0;
import u1.a2;
import u1.d2;
import v62.d9;
import v62.e9;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f187387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f187388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f187389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f187390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f187391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f187392f;

    public /* synthetic */ e(gv0.d dVar, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14) {
        this.f187387a = 12;
        this.f187388b = dVar;
        this.f187391e = aVar;
        this.f187392f = aVar2;
        this.f187389c = aVar3;
        this.f187390d = aVar4;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x011b  */
    private final Object a(Object obj, Object obj2) {
        String strH;
        yg2.h hVar = (yg2.h) this.f187388b;
        p1 p1Var = (p1) this.f187389c;
        x3 x3Var = (x3) this.f187390d;
        x3 x3Var2 = (x3) this.f187391e;
        m1 m1Var = (m1) this.f187392f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i14 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarS = c2.l.s(c2.l.p(aVar));
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            z zVarA = c2.y.a(c2.j.f22694d, aVar2, mVar, 48);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarS, mVar);
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
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            b0 b0Var = b0.f22601a;
            lg2.m mVar2 = lg2.m.f112346a;
            if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                mVar.C(362005721);
                mVar.f();
                strH = "";
            } else {
                strH = sn.a.h(mVar, -958153434, R.string.lbl_save, mVar);
            }
            h4.r rVarX = x2.x(x2.f(aVar, 1.0f), null, 1);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarX, eVar.f97918c);
            boolean z14 = !((Boolean) x3Var.getF182175a()).booleanValue();
            z3.e eVarC = z3.f.c(1169487730, new dv0.l(x3Var, 8), mVar);
            boolean zR = mVar.r(hVar) | mVar.B(p1Var);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new yg2.w(hVar, p1Var, i14);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new yg2.w(hVar, p1Var, i14);
                    mVar.K(objQ);
                }
            }
            mVar2.c(rVarY, eVarC, strH, z14, (e23.a) objQ, mVar, 196656);
            if (((Boolean) x3Var2.getF182175a()).booleanValue()) {
                mVar.C(363088925);
                mVar.f();
            } else {
                mVar.C(362709733);
                y2 y2Var = y2.f111386a;
                long jC = a0.c(mVar);
                float floatValue = m1Var.getFloatValue();
                float f14 = eVar.f97917b;
                h4.r rVarX2 = x2.x(x2.f(aVar, 1.0f), null, 3);
                q4.k.f142561f.getClass();
                y2Var.a(floatValue, f14, 0, 48, 20, jC, 0L, rVarX2, mVar);
                mVar = mVar;
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:140:0x064f  */
    /* JADX WARN: Code duplicated, block: B:142:0x0658  */
    /* JADX WARN: Code duplicated, block: B:143:0x065c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0679  */
    /* JADX WARN: Code duplicated, block: B:151:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:152:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:155:0x071d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0727  */
    /* JADX WARN: Code duplicated, block: B:159:0x074b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0761  */
    /* JADX WARN: Code duplicated, block: B:164:0x0785  */
    /* JADX WARN: Code duplicated, block: B:166:0x079b  */
    /* JADX WARN: Code duplicated, block: B:167:0x079d  */
    /* JADX WARN: Code duplicated, block: B:170:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:173:0x07c0  */
    /* JADX WARN: Code duplicated, block: B:178:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:179:0x07db  */
    /* JADX WARN: Code duplicated, block: B:182:0x07fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:183:0x07ff  */
    /* JADX WARN: Code duplicated, block: B:185:0x0804  */
    /* JADX WARN: Code duplicated, block: B:191:0x0836  */
    /* JADX WARN: Code duplicated, block: B:195:0x08c7  */
    /* JADX WARN: Code duplicated, block: B:197:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:199:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:202:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:205:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:209:0x090f  */
    /* JADX WARN: Code duplicated, block: B:211:0x0921  */
    /* JADX WARN: Code duplicated, block: B:213:0x092d  */
    /* JADX WARN: Code duplicated, block: B:215:0x0935  */
    /* JADX WARN: Code duplicated, block: B:219:0x093d  */
    /* JADX WARN: Code duplicated, block: B:221:0x0941  */
    /* JADX WARN: Code duplicated, block: B:222:0x0946  */
    /* JADX WARN: Code duplicated, block: B:225:0x094b  */
    /* JADX WARN: Code duplicated, block: B:226:0x094e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0975  */
    /* JADX WARN: Code duplicated, block: B:230:0x0984  */
    /* JADX WARN: Code duplicated, block: B:232:0x098e  */
    /* JADX WARN: Code duplicated, block: B:247:0x09cd  */
    /* JADX WARN: Code duplicated, block: B:251:0x09ec  */
    /* JADX WARN: Code duplicated, block: B:252:0x09f7  */
    /* JADX WARN: Code duplicated, block: B:254:0x0a03  */
    /* JADX WARN: Code duplicated, block: B:256:0x0a0f  */
    /* JADX WARN: Code duplicated, block: B:289:0x0bbb  */
    /* JADX WARN: Code duplicated, block: B:28:0x011c  */
    /* JADX WARN: Code duplicated, block: B:292:0x0bcc  */
    /* JADX WARN: Code duplicated, block: B:294:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:296:0x0bec  */
    /* JADX WARN: Code duplicated, block: B:297:0x0bef  */
    /* JADX WARN: Code duplicated, block: B:300:0x0bfb  */
    /* JADX WARN: Code duplicated, block: B:303:0x0c0d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0c27 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:307:0x0c29  */
    /* JADX WARN: Code duplicated, block: B:310:0x0c48 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:311:0x0c4a  */
    /* JADX WARN: Code duplicated, block: B:316:0x0c98  */
    /* JADX WARN: Code duplicated, block: B:319:0x0cb1  */
    /* JADX WARN: Code duplicated, block: B:321:0x0cb9  */
    /* JADX WARN: Code duplicated, block: B:323:0x0cd1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:324:0x0cd3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:328:0x0cdc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:330:0x0ce1  */
    /* JADX WARN: Code duplicated, block: B:333:0x0ced  */
    /* JADX WARN: Code duplicated, block: B:336:0x0d01  */
    /* JADX WARN: Code duplicated, block: B:339:0x0d13  */
    /* JADX WARN: Code duplicated, block: B:340:0x0d1d  */
    /* JADX WARN: Code duplicated, block: B:343:0x0d28  */
    /* JADX WARN: Code duplicated, block: B:350:0x0d7a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0d92  */
    /* JADX WARN: Code duplicated, block: B:356:0x0da2  */
    /* JADX WARN: Code duplicated, block: B:368:0x0c8d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x0d68 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0d30 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        o1 o1Var;
        p1 p1Var;
        pi0.e eVar;
        e23.p pVar;
        Object gVar;
        p3.m mVar;
        Object hVar;
        p1 p1Var2;
        pi0.e eVar2;
        n1 n1Var;
        pi0.e eVar3;
        h5.g.a.f fVar;
        b0 b0Var;
        n1 n1Var2;
        j92.b bVar;
        j92.e eVar4;
        z0 z0VarD;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        Object objQ;
        n1 n1Var3;
        p1 p1Var3;
        String str;
        Iterator<E> it;
        Object next;
        double time;
        Object next2;
        double time2;
        dn.a aVar;
        q91.d dVar;
        pi0.e eVar5;
        aa1.d dVarD;
        String str2;
        o13.u uVar;
        u4.d dVar2;
        String str3;
        String str4;
        z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        e0.a aVar2;
        q91.d dVar3;
        x3 x3Var;
        u4.d dVar4;
        u4.d dVar5;
        boolean zG;
        q91.d dVar6;
        int i14;
        int i15;
        boolean z14;
        Object objQ2;
        p3.m.a.C2565a c2565a;
        int i16;
        Object objQ3;
        int i17;
        Object objQ4;
        byte b14;
        Object objQ5;
        int i18;
        int i19;
        boolean z15;
        Object objQ6;
        p3.m.a.C2565a c2565a2;
        int i24;
        Object objQ7;
        e23.p pVar2;
        boolean zB;
        Object objQ8;
        o1 o1Var2;
        p1 p1Var4;
        boolean zB2;
        Object objQ9;
        boolean z16;
        String str5;
        String str6;
        long j8;
        String str7;
        String str8;
        Object kVar;
        p3.m mVar2;
        int i25 = this.f187387a;
        int i26 = 14;
        p3.m.a aVar3 = p3.m.f135153a;
        Object obj3 = this.f187390d;
        Object obj4 = this.f187389c;
        Object obj5 = this.f187392f;
        Object obj6 = this.f187391e;
        Object obj7 = this.f187388b;
        switch (i25) {
            case 0:
                ((Integer) obj2).getClass();
                f.a((h4.r) obj7, (String) obj4, (String) obj3, (e23.a) obj6, (e23.a) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                wv1.b.a((Activity) obj7, (qv1.b) obj4, (uv1.c) obj3, (vv1.c) obj6, (m0) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 2:
                e23.p pVar3 = (e23.p) obj7;
                aa1.a aVar4 = (aa1.a) obj4;
                ba1.d dVar7 = (ba1.d) obj3;
                p1 p1Var5 = (p1) obj6;
                e23.p pVar4 = (e23.p) obj5;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    y3 y3Var = AndroidCompositionLocals_androidKt.f6042b;
                    Context context = (Context) mVar3.A(y3Var);
                    b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                    pi0.e eVar6 = new pi0.e((Context) mVar3.A(y3Var));
                    d2 d2VarA = a2.a(mVar3);
                    Object objQ10 = mVar3.q();
                    aVar3.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ10 == c2565a3) {
                        objQ10 = new p3.a2(3);
                        mVar3.K(objQ10);
                    }
                    n1 n1Var4 = (n1) objQ10;
                    Object objQ11 = mVar3.q();
                    if (objQ11 == c2565a3) {
                        objQ11 = p0.n(Boolean.TRUE);
                        mVar3.K(objQ11);
                    }
                    p1 p1Var6 = (p1) objQ11;
                    Object objQ12 = mVar3.q();
                    if (objQ12 == c2565a3) {
                        objQ12 = p0.n(Boolean.FALSE);
                        mVar3.K(objQ12);
                    }
                    p1 p1Var7 = (p1) objQ12;
                    Object objQ13 = mVar3.q();
                    if (objQ13 == c2565a3) {
                        objQ13 = p0.n(null);
                        mVar3.K(objQ13);
                    }
                    p1 p1Var8 = (p1) objQ13;
                    Object objQ14 = mVar3.q();
                    if (objQ14 == c2565a3) {
                        objQ14 = p0.n(j53.l.b());
                        mVar3.K(objQ14);
                    }
                    p1 p1Var9 = (p1) objQ14;
                    Object[] objArr = new Object[0];
                    Object objQ15 = mVar3.q();
                    if (objQ15 == c2565a3) {
                        objQ15 = new x1.b(i26);
                        mVar3.K(objQ15);
                    }
                    p1 p1Var10 = (p1) d4.a.e(objArr, (e23.a) objQ15, mVar3, 48);
                    Object[] objArr2 = new Object[0];
                    Object objQ16 = mVar3.q();
                    if (objQ16 == c2565a3) {
                        objQ16 = new x1.b(17);
                        mVar3.K(objQ16);
                    }
                    o1 o1Var3 = (o1) d4.a.e(objArr2, (e23.a) objQ16, mVar3, 48);
                    if (((Boolean) p1Var10.getF182175a()).booleanValue()) {
                        mVar3.C(1726295471);
                        boolean zB3 = mVar3.B(p1Var10) | mVar3.B(pVar3) | mVar3.B(o1Var3) | mVar3.r(aVar4);
                        Object objQ17 = mVar3.q();
                        if (zB3 || objQ17 == c2565a3) {
                            pVar = pVar3;
                            o1Var = o1Var3;
                            p1Var = p1Var10;
                            eVar = eVar6;
                            kVar = new ug2.k(p1Var, pVar, o1Var, aVar4, 18);
                            mVar3.K(kVar);
                        } else {
                            o1Var = o1Var3;
                            p1Var = p1Var10;
                            eVar = eVar6;
                            kVar = objQ17;
                            pVar = pVar3;
                        }
                        e23.a aVar5 = (e23.a) kVar;
                        boolean zB4 = mVar3.B(p1Var);
                        Object objQ18 = mVar3.q();
                        if (zB4 || objQ18 == c2565a3) {
                            objQ18 = new x91.d(p1Var, 0);
                            mVar3.K(objQ18);
                        }
                        og2.k.e(aVar5, (e23.a) objQ18, mVar3, 0);
                        mVar3.f();
                    } else {
                        o1Var = o1Var3;
                        context = context;
                        p1Var = p1Var10;
                        eVar = eVar6;
                        d2VarA = d2VarA;
                        oVarD = oVarD;
                        pVar = pVar3;
                        mVar3.C(1726679871);
                        mVar3.f();
                    }
                    Integer numValueOf = Integer.valueOf(n1Var4.getIntValue());
                    i53.c<aa1.d> cVar = aVar4.f2228k;
                    i53.c<aa1.d> cVar2 = aVar4.f2228k;
                    String str9 = aVar4.f2225h;
                    q91.d dVar8 = aVar4.f2220c;
                    boolean z17 = aVar4.f2218a;
                    i53.c<dn.a> cVar3 = aVar4.f2229l;
                    String str10 = aVar4.f2223f;
                    Context context2 = context;
                    Object[] objArr3 = {numValueOf, cVar, cVar3, Boolean.valueOf(z17)};
                    boolean zR = mVar3.r(aVar4);
                    Object objQ19 = mVar3.q();
                    if (zR || objQ19 == c2565a3) {
                        mVar = mVar3;
                        gVar = new x91.g(aVar4, n1Var4, p1Var5, p1Var9, null);
                        mVar.K(gVar);
                    } else {
                        gVar = objQ19;
                        mVar = mVar3;
                    }
                    l0.h(objArr3, (e23.p) gVar, mVar);
                    Integer numValueOf2 = Integer.valueOf(n1Var4.getIntValue());
                    boolean zR2 = mVar.r(oVarD) | mVar.r(eVar) | mVar.r(aVar4) | mVar.r(dVar7);
                    pi0.e eVar7 = eVar;
                    Object objQ20 = mVar.q();
                    if (zR2 || objQ20 == c2565a3) {
                        p1Var2 = p1Var8;
                        hVar = new x91.h(oVarD, eVar7, aVar4, n1Var4, p1Var2, p1Var6, dVar7, null);
                        eVar2 = eVar7;
                        aVar4 = aVar4;
                        n1Var = n1Var4;
                        mVar.K(hVar);
                    } else {
                        hVar = objQ20;
                        n1Var = n1Var4;
                        eVar2 = eVar7;
                        p1Var2 = p1Var8;
                    }
                    l0.e((e23.p) hVar, numValueOf2, mVar);
                    h4.r.a aVar6 = h4.r.S;
                    h4.r rVarD = x2.d(aVar6, 1.0f);
                    p1 p1Var11 = p1Var;
                    e23.p pVar5 = pVar;
                    long jE = vb.h.e(d92.b.f58623a, mVar);
                    o4.m1.a aVar7 = o4.m1.f128891a;
                    h4.r rVarE = u1.n.e(rVarD, jE, aVar7);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    o1 o1Var4 = o1Var;
                    z zVarA2 = c2.y.a(kVar2, h4.d.a.f81536n, mVar, 0);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar);
                    h5.g.V.getClass();
                    d2 d2Var = d2VarA;
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar8);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar8 = h5.g.a.f81810g;
                    b4.c(eVar8, zVarA2, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX3, mVar);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar.getT()) {
                        eVar3 = eVar2;
                    } else {
                        eVar3 = eVar2;
                        if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC3, mVar);
                        b0Var = b0.f22601a;
                        n1Var2 = n1Var;
                        h4.r rVarE2 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar).c().c(), aVar7);
                        bVar = d92.b.f58625c;
                        bVar.getClass();
                        eVar4 = j92.b.f97899b;
                        h4.r rVarA = c2.l.A(rVarE2, 0.0f, eVar4.f97920e, 1);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
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
                        b4.c(eVar8, z0VarD, mVar);
                        b4.c(c1623g, i2VarX, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar, iHashCode, bVar2);
                        }
                        b4.c(fVar, rVarC, mVar);
                        c2.u uVar2 = c2.u.f22885a;
                        h4.r rVarF = x2.f(aVar6, 1.0f);
                        i53.f fVarA = i53.a.a(new t82.a(gl1.y.Q(mVar, R.string.lbl_three_months), gl1.y.Q(mVar, R.string.lbl_3_months)), new t82.a(gl1.y.P(R.string.lbl_months_short, new Object[]{6}, mVar), gl1.y.P(R.string.lbl_months, new Object[]{6}, mVar)), new t82.a(gl1.y.Q(mVar, R.string.lbl_one_year_abbr), gl1.y.Q(mVar, R.string.lbl_one_year)), new t82.a(gl1.y.Q(mVar, R.string.common_all), gl1.y.Q(mVar, R.string.common_all)));
                        int intValue = n1Var2.getIntValue();
                        objQ = mVar.q();
                        if (objQ == c2565a3) {
                            n1Var3 = n1Var2;
                            p1Var3 = p1Var7;
                            objQ = new qk0.l(n1Var3, p1Var6, p1Var3);
                            mVar.K(objQ);
                        } else {
                            n1Var3 = n1Var2;
                            p1Var3 = p1Var7;
                        }
                        t82.c.a(fVarA, rVarF, intValue, 0.0f, (e23.l) objQ, mVar, 196656, 24);
                        mVar.y();
                        str = (String) p1Var2.getF182175a();
                        if (str == null) {
                            mVar.C(1694895748);
                            mVar.f();
                        } else {
                            mVar.C(1694895749);
                            h4.r rVarE3 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar).c().c(), aVar7);
                            if (x91.i.b(p1Var6)) {
                                str = "";
                            }
                            x91.i.c(0, rVarE3, str, mVar);
                            Unit unit = Unit.INSTANCE;
                            mVar.f();
                        }
                        if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                            mVar.C(1695298036);
                            bVar.getClass();
                            u91.b.b(c2.l.y(aVar6, eVar4.f97923h), aVar4, mVar, 0);
                            c2.l.f(b0Var.a(aVar6, 1.0f, true), mVar);
                            mVar.f();
                        } else {
                            mVar.C(1695810869);
                            it = ((i53.f) p1Var9.getF182175a()).iterator();
                            if (it.hasNext()) {
                                next = it.next();
                                if (it.hasNext()) {
                                    time = ((dn.a) next).getTime();
                                    do {
                                        next2 = it.next();
                                        time2 = ((dn.a) next2).getTime();
                                        if (Double.compare(time, time2) > 0) {
                                            next = next2;
                                            time = time2;
                                        }
                                    } while (it.hasNext());
                                }
                            } else {
                                next = null;
                            }
                            aVar = (dn.a) next;
                            if (aVar == null) {
                                mVar.C(1695712691);
                                mVar.f();
                                dVar = dVar8;
                                eVar5 = eVar3;
                                dVarD = null;
                            } else {
                                mVar.C(747437070);
                                dVar = dVar8;
                                eVar5 = eVar3;
                                dVarD = x91.i.d(aVar, (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), dVar, eVar5);
                                mVar.f();
                            }
                            if (x91.i.b(p1Var6)) {
                                str2 = str10;
                            } else {
                                if (dVarD != null) {
                                    str8 = dVarD.f2253e;
                                } else {
                                    str8 = null;
                                }
                                str2 = str10;
                                if (p005kotlin.jvm.internal.s.g(str8, str2) || str2 == null) {
                                    mVar.C(747456781);
                                    s62.a.f157643a.getClass();
                                    t62.b.f162798a.getClass();
                                    uVar = new o13.u(e72.a.a(d9.f175854a), gl1.y.Q(mVar, R.string.personal_records_current_best_effort_accessibility), null);
                                    mVar.f();
                                }
                                dVar2 = (u4.d) uVar.f128605a;
                                str3 = (String) uVar.f128606b;
                                str4 = (String) uVar.f128607c;
                                mVar.N(747470262, Integer.valueOf(n1Var3.getIntValue()));
                                h4.r.a aVar9 = h4.r.S;
                                h4.r rVarE4 = u1.n.e(a2.b(x2.d(aVar9, 1.0f), d2Var, true), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                                c2.j.f22691a.getClass();
                                c2.j.k kVar3 = c2.j.f22694d;
                                h4.d.f81522a.getClass();
                                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, mVar, 0);
                                x1 x1Var2 = p3.n.f135158a;
                                iHashCode2 = Long.hashCode(mVar.getU());
                                i2VarX2 = mVar.x();
                                rVarC2 = h4.k.c(rVarE4, mVar);
                                h5.g.V.getClass();
                                aVar2 = h5.g.a.f81805b;
                                if (mVar.F() != null) {
                                    p0.l();
                                    throw null;
                                }
                                mVar.z();
                                if (mVar.getT()) {
                                    mVar.M(aVar2);
                                } else {
                                    mVar.c();
                                }
                                dVar3 = dVar;
                                h5.g.a.e eVar9 = h5.g.a.f81810g;
                                b4.c(eVar9, zVarA, mVar);
                                h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                                b4.c(c1623g2, i2VarX2, mVar);
                                h5.g.a.b bVar3 = h5.g.a.f81813j;
                                if (mVar.getT()) {
                                    x3Var = p1Var6;
                                    dVar4 = dVar2;
                                } else {
                                    x3Var = p1Var6;
                                    dVar4 = dVar2;
                                    if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                                    }
                                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                                    b4.c(fVar2, rVarC2, mVar);
                                    b0 b0Var2 = b0.f22601a;
                                    if (z17) {
                                        mVar.C(1781209640);
                                        mVar.f();
                                    } else {
                                        mVar.C(1774114577);
                                        if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            mVar.C(1774920732);
                                            if (str2 != null || str2.length() <= 0 || str9 == null || str9.length() <= 0) {
                                                dVar5 = dVar4;
                                                mVar.C(1775821096);
                                                mVar.f();
                                            } else {
                                                mVar.C(1775061906);
                                                u4.d dVar9 = dVar4;
                                                u91.d.a(dVar9, str3, str2 == null ? "" : str2, aVar4.f2224g, str9 == null ? "" : str9, gl1.y.Q(mVar, R.string.personal_records_all_time_record), mVar, 196608, 0);
                                                dVar5 = dVar9;
                                                mVar.f();
                                            }
                                            mVar.f();
                                        } else {
                                            mVar.C(1774007100);
                                            if (cVar3.isEmpty()) {
                                                mVar.C(1774815208);
                                                mVar.f();
                                            } else {
                                                mVar.C(1774083887);
                                                if (dVarD != null || (str7 = dVarD.f2253e) == null) {
                                                    str5 = "";
                                                } else {
                                                    str5 = str7;
                                                }
                                                if (dVarD != null) {
                                                    str6 = dVarD.f2254f;
                                                } else {
                                                    str6 = null;
                                                }
                                                if (dVarD != null) {
                                                    j8 = dVarD.f2252d;
                                                } else {
                                                    j8 = 0;
                                                }
                                                LocalDateTime localDateTime = new LocalDateTime(j8, DateTimeZone.UTC);
                                                qi0.a aVar10 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                                aVar10.getClass();
                                                u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime), aVar10), str4, mVar, 196608, 0);
                                                mVar.f();
                                            }
                                            mVar.f();
                                            dVar5 = dVar4;
                                        }
                                        s62.a.f157643a.getClass();
                                        zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                        if (dVar3 == null) {
                                            mVar.C(1776184725);
                                            mVar.f();
                                        } else {
                                            mVar.C(1776184726);
                                            if ((!cVar3.isEmpty() || ((Boolean) x3Var.getF182175a()).booleanValue()) && (cVar2.isEmpty() || !((Boolean) x3Var.getF182175a()).booleanValue())) {
                                                mVar.C(1902042134);
                                                mVar.f();
                                            } else {
                                                mVar.C(1900394980);
                                                h4.r rVarF2 = x2.f(aVar9, 1.0f);
                                                j92.b bVar4 = d92.b.f58625c;
                                                bVar4.getClass();
                                                j92.e eVar10 = j92.b.f97899b;
                                                h4.r rVarA2 = c2.l.A(rVarF2, 0.0f, eVar10.f97920e, 1);
                                                s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 0);
                                                int iHashCode4 = Long.hashCode(mVar.getU());
                                                i2 i2VarX4 = mVar.x();
                                                h4.r rVarC4 = h4.k.c(rVarA2, mVar);
                                                if (mVar.F() == null) {
                                                    p0.l();
                                                    throw null;
                                                }
                                                mVar.z();
                                                if (mVar.getT()) {
                                                    mVar.M(aVar2);
                                                } else {
                                                    mVar.c();
                                                }
                                                b4.c(eVar9, s2VarA, mVar);
                                                b4.c(c1623g2, i2VarX4, mVar);
                                                if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                                                    v.h.z(iHashCode4, mVar, iHashCode4, bVar3);
                                                }
                                                b4.c(fVar2, rVarC4, mVar);
                                                u2 u2Var = u2.f22900a;
                                                bVar4.getClass();
                                                h4.r rVarA3 = c2.l.A(aVar9, eVar10.f97920e, 0.0f, 2);
                                                String strQ = gl1.y.Q(mVar, R.string.personal_records_best_efforts_title);
                                                Locale locale = Locale.ROOT;
                                                String upperCase = strQ.toUpperCase(locale);
                                                upperCase.getClass();
                                                j92.f fVar3 = d92.b.f58624b;
                                                fVar3.getClass();
                                                x0 x0VarF = d92.c.f(j92.f.f97935l, mVar);
                                                d6.h.f57752b.getClass();
                                                mh.c(upperCase, rVarA3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarF, mVar, 0, 0, 130044);
                                                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                    mVar.C(732398668);
                                                    bVar4.getClass();
                                                    h4.r rVarA4 = c2.l.A(aVar9, eVar10.f97920e, 0.0f, 2);
                                                    Object objQ21 = mVar.q();
                                                    if (objQ21 == p3.m.a.f135155b) {
                                                        z16 = true;
                                                        objQ21 = new x91.d(p1Var3, 1);
                                                        mVar.K(objQ21);
                                                    } else {
                                                        z16 = true;
                                                    }
                                                    h4.r rVarA5 = u2Var.a(u1.w.d(rVarA4, false, null, null, (e23.a) objQ21, 15), 1.0f, z16);
                                                    String upperCase2 = gl1.y.Q(mVar, ((Boolean) p1Var3.getF182175a()).booleanValue() ? R.string.lbl_done : R.string.lbl_edit).toUpperCase(locale);
                                                    upperCase2.getClass();
                                                    fVar3.getClass();
                                                    mh.c(upperCase2, rVarA5, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0.a(j92.f.f97934k, ds.e0.e(mVar), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), mVar, 0, 0, 130044);
                                                    mVar.f();
                                                } else {
                                                    mVar.C(733127447);
                                                    mVar.f();
                                                }
                                                mVar.y();
                                                mVar.f();
                                            }
                                            if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                                mVar.C(1902143256);
                                                i18 = 0;
                                                for (aa1.d dVar10 : cVar2) {
                                                    i19 = i18 + 1;
                                                    if (i18 >= 0) {
                                                        p13.x.q();
                                                        throw null;
                                                    }
                                                    aa1.d dVar11 = dVar10;
                                                    h4.r.a aVar11 = h4.r.S;
                                                    h4.r rVarF3 = x2.f(aVar11, 1.0f);
                                                    boolean zBooleanValue = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                                    if (i18 == 0) {
                                                        z15 = true;
                                                    } else {
                                                        z15 = false;
                                                    }
                                                    objQ6 = mVar.q();
                                                    c2565a2 = p3.m.a.f135155b;
                                                    i24 = 12;
                                                    if (objQ6 == c2565a2) {
                                                        objQ6 = new x1.b(i24);
                                                        mVar.K(objQ6);
                                                    }
                                                    e23.a aVar12 = (e23.a) objQ6;
                                                    objQ7 = mVar.q();
                                                    if (objQ7 == c2565a2) {
                                                        objQ7 = new x1.b(13);
                                                        mVar.K(objQ7);
                                                    }
                                                    e23.a aVar13 = (e23.a) objQ7;
                                                    pVar2 = pVar5;
                                                    zB = mVar.B(pVar2);
                                                    objQ8 = mVar.q();
                                                    if (zB || objQ8 == c2565a2) {
                                                        objQ8 = new uj1.y(pVar2, i24);
                                                        mVar.K(objQ8);
                                                    }
                                                    e23.p pVar6 = (e23.p) objQ8;
                                                    o1Var2 = o1Var4;
                                                    p1Var4 = p1Var11;
                                                    zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                                    objQ9 = mVar.q();
                                                    if (zB2 || objQ9 == c2565a2) {
                                                        objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                        mVar.K(objQ9);
                                                    }
                                                    q91.d dVar12 = dVar3;
                                                    u91.h.b(rVarF3, dVar11, dVar12, false, zBooleanValue, false, z15, false, pVar4, aVar12, aVar13, pVar6, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c2.l.f(x2.h(aVar11, j92.b.f97899b.f97920e), mVar);
                                                    dVar3 = dVar12;
                                                    i18 = i19;
                                                    p1Var11 = p1Var4;
                                                    pVar5 = pVar2;
                                                    o1Var4 = o1Var2;
                                                }
                                                mVar.f();
                                            } else {
                                                dVar6 = dVar3;
                                                mVar.C(1903616035);
                                                i14 = 0;
                                                for (Object obj8 : (i53.f) p1Var9.getF182175a()) {
                                                    i15 = i14 + 1;
                                                    if (i14 >= 0) {
                                                        p13.x.q();
                                                        throw null;
                                                    }
                                                    Context context3 = context2;
                                                    aa1.d dVarD2 = x91.i.d((dn.a) obj8, context3, dVar6, eVar5);
                                                    boolean zG2 = p005kotlin.jvm.internal.s.g(str2, dVarD2.f2253e);
                                                    h4.r.a aVar14 = h4.r.S;
                                                    h4.r rVarF4 = x2.f(aVar14, 1.0f);
                                                    boolean z18 = (zG == 0 && i14 == 0) || zG2;
                                                    if (zG && i14 == 0) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    objQ2 = mVar.q();
                                                    c2565a = p3.m.a.f135155b;
                                                    i16 = 15;
                                                    if (objQ2 == c2565a) {
                                                        objQ2 = new x1.b(i16);
                                                        mVar.K(objQ2);
                                                    }
                                                    e23.a aVar15 = (e23.a) objQ2;
                                                    objQ3 = mVar.q();
                                                    i17 = 16;
                                                    if (objQ3 == c2565a) {
                                                        objQ3 = new x1.b(i17);
                                                        mVar.K(objQ3);
                                                    }
                                                    e23.a aVar16 = (e23.a) objQ3;
                                                    objQ4 = mVar.q();
                                                    if (objQ4 == c2565a) {
                                                        b14 = 0;
                                                        objQ4 = new wt0.i((byte) 0, 15);
                                                        mVar.K(objQ4);
                                                    } else {
                                                        b14 = 0;
                                                    }
                                                    e23.p pVar7 = (e23.p) objQ4;
                                                    objQ5 = mVar.q();
                                                    if (objQ5 == c2565a) {
                                                        objQ5 = new wt0.i(b14, 16);
                                                        mVar.K(objQ5);
                                                    }
                                                    q91.d dVar13 = dVar6;
                                                    u91.h.b(rVarF4, dVarD2, dVar13, false, false, false, z18, z14, pVar4, aVar15, aVar16, pVar7, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                                    d92.b.f58623a.getClass();
                                                    d92.b.f58625c.getClass();
                                                    c2.l.f(x2.h(aVar14, j92.b.f97899b.f97920e), mVar);
                                                    i14 = i15;
                                                    context2 = context3;
                                                    dVar6 = dVar13;
                                                }
                                                mVar.f();
                                            }
                                            Unit unit2 = Unit.INSTANCE;
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    mVar.y();
                                    mVar.Q();
                                    mVar.f();
                                }
                                v.h.z(iHashCode2, mVar, iHashCode2, bVar3);
                                h5.g.a.f fVar4 = h5.g.a.f81807d;
                                b4.c(fVar4, rVarC2, mVar);
                                b0 b0Var3 = b0.f22601a;
                                if (z17) {
                                    mVar.C(1774114577);
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1774007100);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1774083887);
                                            if (dVarD != null) {
                                                str5 = "";
                                            } else {
                                                str5 = "";
                                            }
                                            if (dVarD != null) {
                                                str6 = dVarD.f2254f;
                                            } else {
                                                str6 = null;
                                            }
                                            if (dVarD != null) {
                                                j8 = dVarD.f2252d;
                                            } else {
                                                j8 = 0;
                                            }
                                            LocalDateTime localDateTime2 = new LocalDateTime(j8, DateTimeZone.UTC);
                                            qi0.a aVar17 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                            aVar17.getClass();
                                            u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime2), aVar17), str4, mVar, 196608, 0);
                                            mVar.f();
                                        } else {
                                            mVar.C(1774815208);
                                            mVar.f();
                                        }
                                        mVar.f();
                                        dVar5 = dVar4;
                                    } else {
                                        mVar.C(1774920732);
                                        if (str2 != null) {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        } else {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    s62.a.f157643a.getClass();
                                    zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                    if (dVar3 == null) {
                                        mVar.C(1776184725);
                                        mVar.f();
                                    } else {
                                        mVar.C(1776184726);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        } else {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        }
                                        if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            mVar.C(1902143256);
                                            i18 = 0;
                                            while (r0.hasNext()) {
                                                i19 = i18 + 1;
                                                if (i18 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                aa1.d dVar14 = dVar10;
                                                h4.r.a aVar18 = h4.r.S;
                                                h4.r rVarF5 = x2.f(aVar18, 1.0f);
                                                boolean zBooleanValue2 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                                if (i18 == 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                objQ6 = mVar.q();
                                                c2565a2 = p3.m.a.f135155b;
                                                i24 = 12;
                                                if (objQ6 == c2565a2) {
                                                    objQ6 = new x1.b(i24);
                                                    mVar.K(objQ6);
                                                }
                                                e23.a aVar19 = (e23.a) objQ6;
                                                objQ7 = mVar.q();
                                                if (objQ7 == c2565a2) {
                                                    objQ7 = new x1.b(13);
                                                    mVar.K(objQ7);
                                                }
                                                e23.a aVar110 = (e23.a) objQ7;
                                                pVar2 = pVar5;
                                                zB = mVar.B(pVar2);
                                                objQ8 = mVar.q();
                                                if (zB) {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                } else {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                }
                                                e23.p pVar8 = (e23.p) objQ8;
                                                o1Var2 = o1Var4;
                                                p1Var4 = p1Var11;
                                                zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                                objQ9 = mVar.q();
                                                if (zB2) {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                } else {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                }
                                                q91.d dVar15 = dVar3;
                                                u91.h.b(rVarF5, dVar14, dVar15, false, zBooleanValue2, false, z15, false, pVar4, aVar19, aVar110, pVar8, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar18, j92.b.f97899b.f97920e), mVar);
                                                dVar3 = dVar15;
                                                i18 = i19;
                                                p1Var11 = p1Var4;
                                                pVar5 = pVar2;
                                                o1Var4 = o1Var2;
                                            }
                                            mVar.f();
                                        } else {
                                            dVar6 = dVar3;
                                            mVar.C(1903616035);
                                            i14 = 0;
                                            while (r0.hasNext()) {
                                                i15 = i14 + 1;
                                                if (i14 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                Context context4 = context2;
                                                aa1.d dVarD3 = x91.i.d((dn.a) obj8, context4, dVar6, eVar5);
                                                boolean zG3 = p005kotlin.jvm.internal.s.g(str2, dVarD3.f2253e);
                                                h4.r.a aVar111 = h4.r.S;
                                                h4.r rVarF6 = x2.f(aVar111, 1.0f);
                                                if (zG == 0) {
                                                }
                                                if (zG) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                                objQ2 = mVar.q();
                                                c2565a = p3.m.a.f135155b;
                                                i16 = 15;
                                                if (objQ2 == c2565a) {
                                                    objQ2 = new x1.b(i16);
                                                    mVar.K(objQ2);
                                                }
                                                e23.a aVar112 = (e23.a) objQ2;
                                                objQ3 = mVar.q();
                                                i17 = 16;
                                                if (objQ3 == c2565a) {
                                                    objQ3 = new x1.b(i17);
                                                    mVar.K(objQ3);
                                                }
                                                e23.a aVar113 = (e23.a) objQ3;
                                                objQ4 = mVar.q();
                                                if (objQ4 == c2565a) {
                                                    b14 = 0;
                                                    objQ4 = new wt0.i((byte) 0, 15);
                                                    mVar.K(objQ4);
                                                } else {
                                                    b14 = 0;
                                                }
                                                e23.p pVar9 = (e23.p) objQ4;
                                                objQ5 = mVar.q();
                                                if (objQ5 == c2565a) {
                                                    objQ5 = new wt0.i(b14, 16);
                                                    mVar.K(objQ5);
                                                }
                                                q91.d dVar16 = dVar6;
                                                u91.h.b(rVarF6, dVarD3, dVar16, false, false, false, z18, z14, pVar4, aVar112, aVar113, pVar9, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar111, j92.b.f97899b.f97920e), mVar);
                                                i14 = i15;
                                                context2 = context4;
                                                dVar6 = dVar16;
                                            }
                                            mVar.f();
                                        }
                                        Unit unit3 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                } else {
                                    mVar.C(1781209640);
                                    mVar.f();
                                }
                                mVar.y();
                                mVar.Q();
                                mVar.f();
                            }
                            mVar.C(747450403);
                            s62.a.f157643a.getClass();
                            uVar = new o13.u(e9.a(t62.b.f162798a), gl1.y.Q(mVar, R.string.lbl_current_personal_record), gl1.y.Q(mVar, R.string.personal_records_all_time_record));
                            mVar.f();
                            dVar2 = (u4.d) uVar.f128605a;
                            str3 = (String) uVar.f128606b;
                            str4 = (String) uVar.f128607c;
                            mVar.N(747470262, Integer.valueOf(n1Var3.getIntValue()));
                            h4.r.a aVar20 = h4.r.S;
                            h4.r rVarE5 = u1.n.e(a2.b(x2.d(aVar20, 1.0f), d2Var, true), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar4 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, mVar, 0);
                            x1 x1Var3 = p3.n.f135158a;
                            iHashCode2 = Long.hashCode(mVar.getU());
                            i2VarX2 = mVar.x();
                            rVarC2 = h4.k.c(rVarE5, mVar);
                            h5.g.V.getClass();
                            aVar2 = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar2);
                            } else {
                                mVar.c();
                            }
                            dVar3 = dVar;
                            h5.g.a.e eVar11 = h5.g.a.f81810g;
                            b4.c(eVar11, zVarA, mVar);
                            h5.g.a.C1623g c1623g3 = h5.g.a.f81809f;
                            b4.c(c1623g3, i2VarX2, mVar);
                            h5.g.a.b bVar5 = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                x3Var = p1Var6;
                                dVar4 = dVar2;
                                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                                }
                                h5.g.a.f fVar5 = h5.g.a.f81807d;
                                b4.c(fVar5, rVarC2, mVar);
                                b0 b0Var4 = b0.f22601a;
                                if (z17) {
                                    mVar.C(1774114577);
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1774007100);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1774083887);
                                            if (dVarD != null) {
                                                str5 = "";
                                            } else {
                                                str5 = "";
                                            }
                                            if (dVarD != null) {
                                                str6 = dVarD.f2254f;
                                            } else {
                                                str6 = null;
                                            }
                                            if (dVarD != null) {
                                                j8 = dVarD.f2252d;
                                            } else {
                                                j8 = 0;
                                            }
                                            LocalDateTime localDateTime3 = new LocalDateTime(j8, DateTimeZone.UTC);
                                            qi0.a aVar114 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                            aVar114.getClass();
                                            u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime3), aVar114), str4, mVar, 196608, 0);
                                            mVar.f();
                                        } else {
                                            mVar.C(1774815208);
                                            mVar.f();
                                        }
                                        mVar.f();
                                        dVar5 = dVar4;
                                    } else {
                                        mVar.C(1774920732);
                                        if (str2 != null) {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        } else {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    s62.a.f157643a.getClass();
                                    zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                    if (dVar3 == null) {
                                        mVar.C(1776184725);
                                        mVar.f();
                                    } else {
                                        mVar.C(1776184726);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        } else {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        }
                                        if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            mVar.C(1902143256);
                                            i18 = 0;
                                            while (r0.hasNext()) {
                                                i19 = i18 + 1;
                                                if (i18 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                aa1.d dVar17 = dVar10;
                                                h4.r.a aVar115 = h4.r.S;
                                                h4.r rVarF7 = x2.f(aVar115, 1.0f);
                                                boolean zBooleanValue3 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                                if (i18 == 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                objQ6 = mVar.q();
                                                c2565a2 = p3.m.a.f135155b;
                                                i24 = 12;
                                                if (objQ6 == c2565a2) {
                                                    objQ6 = new x1.b(i24);
                                                    mVar.K(objQ6);
                                                }
                                                e23.a aVar116 = (e23.a) objQ6;
                                                objQ7 = mVar.q();
                                                if (objQ7 == c2565a2) {
                                                    objQ7 = new x1.b(13);
                                                    mVar.K(objQ7);
                                                }
                                                e23.a aVar117 = (e23.a) objQ7;
                                                pVar2 = pVar5;
                                                zB = mVar.B(pVar2);
                                                objQ8 = mVar.q();
                                                if (zB) {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                } else {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                }
                                                e23.p pVar10 = (e23.p) objQ8;
                                                o1Var2 = o1Var4;
                                                p1Var4 = p1Var11;
                                                zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                                objQ9 = mVar.q();
                                                if (zB2) {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                } else {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                }
                                                q91.d dVar18 = dVar3;
                                                u91.h.b(rVarF7, dVar17, dVar18, false, zBooleanValue3, false, z15, false, pVar4, aVar116, aVar117, pVar10, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar115, j92.b.f97899b.f97920e), mVar);
                                                dVar3 = dVar18;
                                                i18 = i19;
                                                p1Var11 = p1Var4;
                                                pVar5 = pVar2;
                                                o1Var4 = o1Var2;
                                            }
                                            mVar.f();
                                        } else {
                                            dVar6 = dVar3;
                                            mVar.C(1903616035);
                                            i14 = 0;
                                            while (r0.hasNext()) {
                                                i15 = i14 + 1;
                                                if (i14 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                Context context5 = context2;
                                                aa1.d dVarD4 = x91.i.d((dn.a) obj8, context5, dVar6, eVar5);
                                                boolean zG4 = p005kotlin.jvm.internal.s.g(str2, dVarD4.f2253e);
                                                h4.r.a aVar118 = h4.r.S;
                                                h4.r rVarF8 = x2.f(aVar118, 1.0f);
                                                if (zG == 0) {
                                                }
                                                if (zG) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                                objQ2 = mVar.q();
                                                c2565a = p3.m.a.f135155b;
                                                i16 = 15;
                                                if (objQ2 == c2565a) {
                                                    objQ2 = new x1.b(i16);
                                                    mVar.K(objQ2);
                                                }
                                                e23.a aVar119 = (e23.a) objQ2;
                                                objQ3 = mVar.q();
                                                i17 = 16;
                                                if (objQ3 == c2565a) {
                                                    objQ3 = new x1.b(i17);
                                                    mVar.K(objQ3);
                                                }
                                                e23.a aVar1110 = (e23.a) objQ3;
                                                objQ4 = mVar.q();
                                                if (objQ4 == c2565a) {
                                                    b14 = 0;
                                                    objQ4 = new wt0.i((byte) 0, 15);
                                                    mVar.K(objQ4);
                                                } else {
                                                    b14 = 0;
                                                }
                                                e23.p pVar11 = (e23.p) objQ4;
                                                objQ5 = mVar.q();
                                                if (objQ5 == c2565a) {
                                                    objQ5 = new wt0.i(b14, 16);
                                                    mVar.K(objQ5);
                                                }
                                                q91.d dVar19 = dVar6;
                                                u91.h.b(rVarF8, dVarD4, dVar19, false, false, false, z18, z14, pVar4, aVar119, aVar1110, pVar11, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar118, j92.b.f97899b.f97920e), mVar);
                                                i14 = i15;
                                                context2 = context5;
                                                dVar6 = dVar19;
                                            }
                                            mVar.f();
                                        }
                                        Unit unit4 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                } else {
                                    mVar.C(1781209640);
                                    mVar.f();
                                }
                                mVar.y();
                                mVar.Q();
                                mVar.f();
                            } else {
                                x3Var = p1Var6;
                                dVar4 = dVar2;
                            }
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar5);
                            h5.g.a.f fVar6 = h5.g.a.f81807d;
                            b4.c(fVar6, rVarC2, mVar);
                            b0 b0Var5 = b0.f22601a;
                            if (z17) {
                                mVar.C(1774114577);
                                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                    mVar.C(1774007100);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1774083887);
                                        if (dVarD != null) {
                                            str5 = "";
                                        } else {
                                            str5 = "";
                                        }
                                        if (dVarD != null) {
                                            str6 = dVarD.f2254f;
                                        } else {
                                            str6 = null;
                                        }
                                        if (dVarD != null) {
                                            j8 = dVarD.f2252d;
                                        } else {
                                            j8 = 0;
                                        }
                                        LocalDateTime localDateTime4 = new LocalDateTime(j8, DateTimeZone.UTC);
                                        qi0.a aVar1111 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                        aVar1111.getClass();
                                        u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime4), aVar1111), str4, mVar, 196608, 0);
                                        mVar.f();
                                    } else {
                                        mVar.C(1774815208);
                                        mVar.f();
                                    }
                                    mVar.f();
                                    dVar5 = dVar4;
                                } else {
                                    mVar.C(1774920732);
                                    if (str2 != null) {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    } else {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    }
                                    mVar.f();
                                }
                                s62.a.f157643a.getClass();
                                zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                if (dVar3 == null) {
                                    mVar.C(1776184725);
                                    mVar.f();
                                } else {
                                    mVar.C(1776184726);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    } else {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    }
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1902143256);
                                        i18 = 0;
                                        while (r0.hasNext()) {
                                            i19 = i18 + 1;
                                            if (i18 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            aa1.d dVar110 = dVar10;
                                            h4.r.a aVar1112 = h4.r.S;
                                            h4.r rVarF9 = x2.f(aVar1112, 1.0f);
                                            boolean zBooleanValue4 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                            if (i18 == 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            objQ6 = mVar.q();
                                            c2565a2 = p3.m.a.f135155b;
                                            i24 = 12;
                                            if (objQ6 == c2565a2) {
                                                objQ6 = new x1.b(i24);
                                                mVar.K(objQ6);
                                            }
                                            e23.a aVar1113 = (e23.a) objQ6;
                                            objQ7 = mVar.q();
                                            if (objQ7 == c2565a2) {
                                                objQ7 = new x1.b(13);
                                                mVar.K(objQ7);
                                            }
                                            e23.a aVar1114 = (e23.a) objQ7;
                                            pVar2 = pVar5;
                                            zB = mVar.B(pVar2);
                                            objQ8 = mVar.q();
                                            if (zB) {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            } else {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            }
                                            e23.p pVar12 = (e23.p) objQ8;
                                            o1Var2 = o1Var4;
                                            p1Var4 = p1Var11;
                                            zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                            objQ9 = mVar.q();
                                            if (zB2) {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            } else {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            }
                                            q91.d dVar111 = dVar3;
                                            u91.h.b(rVarF9, dVar110, dVar111, false, zBooleanValue4, false, z15, false, pVar4, aVar1113, aVar1114, pVar12, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar1112, j92.b.f97899b.f97920e), mVar);
                                            dVar3 = dVar111;
                                            i18 = i19;
                                            p1Var11 = p1Var4;
                                            pVar5 = pVar2;
                                            o1Var4 = o1Var2;
                                        }
                                        mVar.f();
                                    } else {
                                        dVar6 = dVar3;
                                        mVar.C(1903616035);
                                        i14 = 0;
                                        while (r0.hasNext()) {
                                            i15 = i14 + 1;
                                            if (i14 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            Context context6 = context2;
                                            aa1.d dVarD5 = x91.i.d((dn.a) obj8, context6, dVar6, eVar5);
                                            boolean zG5 = p005kotlin.jvm.internal.s.g(str2, dVarD5.f2253e);
                                            h4.r.a aVar1115 = h4.r.S;
                                            h4.r rVarF10 = x2.f(aVar1115, 1.0f);
                                            if (zG == 0) {
                                            }
                                            if (zG) {
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                            }
                                            objQ2 = mVar.q();
                                            c2565a = p3.m.a.f135155b;
                                            i16 = 15;
                                            if (objQ2 == c2565a) {
                                                objQ2 = new x1.b(i16);
                                                mVar.K(objQ2);
                                            }
                                            e23.a aVar1116 = (e23.a) objQ2;
                                            objQ3 = mVar.q();
                                            i17 = 16;
                                            if (objQ3 == c2565a) {
                                                objQ3 = new x1.b(i17);
                                                mVar.K(objQ3);
                                            }
                                            e23.a aVar1117 = (e23.a) objQ3;
                                            objQ4 = mVar.q();
                                            if (objQ4 == c2565a) {
                                                b14 = 0;
                                                objQ4 = new wt0.i((byte) 0, 15);
                                                mVar.K(objQ4);
                                            } else {
                                                b14 = 0;
                                            }
                                            e23.p pVar13 = (e23.p) objQ4;
                                            objQ5 = mVar.q();
                                            if (objQ5 == c2565a) {
                                                objQ5 = new wt0.i(b14, 16);
                                                mVar.K(objQ5);
                                            }
                                            q91.d dVar112 = dVar6;
                                            u91.h.b(rVarF10, dVarD5, dVar112, false, false, false, z18, z14, pVar4, aVar1116, aVar1117, pVar13, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar1115, j92.b.f97899b.f97920e), mVar);
                                            i14 = i15;
                                            context2 = context6;
                                            dVar6 = dVar112;
                                        }
                                        mVar.f();
                                    }
                                    Unit unit5 = Unit.INSTANCE;
                                    mVar.f();
                                }
                                mVar.f();
                            } else {
                                mVar.C(1781209640);
                                mVar.f();
                            }
                            mVar.y();
                            mVar.Q();
                            mVar.f();
                        }
                        mVar.y();
                        x1 x1Var4 = p3.n.f135158a;
                    }
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar2);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC3, mVar);
                    b0Var = b0.f22601a;
                    n1Var2 = n1Var;
                    h4.r rVarE6 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar).c().c(), aVar7);
                    bVar = d92.b.f58625c;
                    bVar.getClass();
                    eVar4 = j92.b.f97899b;
                    h4.r rVarA6 = c2.l.A(rVarE6, 0.0f, eVar4.f97920e, 1);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode = Long.hashCode(mVar.getU());
                    i2VarX = mVar.x();
                    rVarC = h4.k.c(rVarA6, mVar);
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
                    b4.c(eVar8, z0VarD, mVar);
                    b4.c(c1623g, i2VarX, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    } else {
                        v.h.z(iHashCode, mVar, iHashCode, bVar2);
                    }
                    b4.c(fVar, rVarC, mVar);
                    c2.u uVar3 = c2.u.f22885a;
                    h4.r rVarF11 = x2.f(aVar6, 1.0f);
                    i53.f fVarA2 = i53.a.a(new t82.a(gl1.y.Q(mVar, R.string.lbl_three_months), gl1.y.Q(mVar, R.string.lbl_3_months)), new t82.a(gl1.y.P(R.string.lbl_months_short, new Object[]{6}, mVar), gl1.y.P(R.string.lbl_months, new Object[]{6}, mVar)), new t82.a(gl1.y.Q(mVar, R.string.lbl_one_year_abbr), gl1.y.Q(mVar, R.string.lbl_one_year)), new t82.a(gl1.y.Q(mVar, R.string.common_all), gl1.y.Q(mVar, R.string.common_all)));
                    int intValue2 = n1Var2.getIntValue();
                    objQ = mVar.q();
                    if (objQ == c2565a3) {
                        n1Var3 = n1Var2;
                        p1Var3 = p1Var7;
                        objQ = new qk0.l(n1Var3, p1Var6, p1Var3);
                        mVar.K(objQ);
                    } else {
                        n1Var3 = n1Var2;
                        p1Var3 = p1Var7;
                    }
                    t82.c.a(fVarA2, rVarF11, intValue2, 0.0f, (e23.l) objQ, mVar, 196656, 24);
                    mVar.y();
                    str = (String) p1Var2.getF182175a();
                    if (str == null) {
                        mVar.C(1694895748);
                        mVar.f();
                    } else {
                        mVar.C(1694895749);
                        h4.r rVarE7 = u1.n.e(x2.f(aVar6, 1.0f), d92.b.a(mVar).c().c(), aVar7);
                        if (x91.i.b(p1Var6)) {
                            str = "";
                        }
                        x91.i.c(0, rVarE7, str, mVar);
                        Unit unit6 = Unit.INSTANCE;
                        mVar.f();
                    }
                    if (((Boolean) p1Var5.getF182175a()).booleanValue()) {
                        mVar.C(1695298036);
                        bVar.getClass();
                        u91.b.b(c2.l.y(aVar6, eVar4.f97923h), aVar4, mVar, 0);
                        c2.l.f(b0Var.a(aVar6, 1.0f, true), mVar);
                        mVar.f();
                    } else {
                        mVar.C(1695810869);
                        it = ((i53.f) p1Var9.getF182175a()).iterator();
                        if (it.hasNext()) {
                            next = null;
                        } else {
                            next = it.next();
                            if (it.hasNext()) {
                                time = ((dn.a) next).getTime();
                                do {
                                    next2 = it.next();
                                    time2 = ((dn.a) next2).getTime();
                                    if (Double.compare(time, time2) > 0) {
                                        next = next2;
                                        time = time2;
                                    }
                                } while (it.hasNext());
                            }
                        }
                        aVar = (dn.a) next;
                        if (aVar == null) {
                            mVar.C(1695712691);
                            mVar.f();
                            dVar = dVar8;
                            eVar5 = eVar3;
                            dVarD = null;
                        } else {
                            mVar.C(747437070);
                            dVar = dVar8;
                            eVar5 = eVar3;
                            dVarD = x91.i.d(aVar, (Context) mVar.A(AndroidCompositionLocals_androidKt.f6042b), dVar, eVar5);
                            mVar.f();
                        }
                        if (x91.i.b(p1Var6)) {
                            if (dVarD != null) {
                                str8 = dVarD.f2253e;
                            } else {
                                str8 = null;
                            }
                            str2 = str10;
                            if (p005kotlin.jvm.internal.s.g(str8, str2)) {
                            }
                            mVar.C(747456781);
                            s62.a.f157643a.getClass();
                            t62.b.f162798a.getClass();
                            uVar = new o13.u(e72.a.a(d9.f175854a), gl1.y.Q(mVar, R.string.personal_records_current_best_effort_accessibility), null);
                            mVar.f();
                            dVar2 = (u4.d) uVar.f128605a;
                            str3 = (String) uVar.f128606b;
                            str4 = (String) uVar.f128607c;
                            mVar.N(747470262, Integer.valueOf(n1Var3.getIntValue()));
                            h4.r.a aVar21 = h4.r.S;
                            h4.r rVarE8 = u1.n.e(a2.b(x2.d(aVar21, 1.0f), d2Var, true), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar5 = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            zVarA = c2.y.a(kVar5, h4.d.a.f81536n, mVar, 0);
                            x1 x1Var5 = p3.n.f135158a;
                            iHashCode2 = Long.hashCode(mVar.getU());
                            i2VarX2 = mVar.x();
                            rVarC2 = h4.k.c(rVarE8, mVar);
                            h5.g.V.getClass();
                            aVar2 = h5.g.a.f81805b;
                            if (mVar.F() != null) {
                                p0.l();
                                throw null;
                            }
                            mVar.z();
                            if (mVar.getT()) {
                                mVar.M(aVar2);
                            } else {
                                mVar.c();
                            }
                            dVar3 = dVar;
                            h5.g.a.e eVar12 = h5.g.a.f81810g;
                            b4.c(eVar12, zVarA, mVar);
                            h5.g.a.C1623g c1623g4 = h5.g.a.f81809f;
                            b4.c(c1623g4, i2VarX2, mVar);
                            h5.g.a.b bVar6 = h5.g.a.f81813j;
                            if (mVar.getT()) {
                                x3Var = p1Var6;
                                dVar4 = dVar2;
                                if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                                }
                                h5.g.a.f fVar7 = h5.g.a.f81807d;
                                b4.c(fVar7, rVarC2, mVar);
                                b0 b0Var6 = b0.f22601a;
                                if (z17) {
                                    mVar.C(1774114577);
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1774007100);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1774083887);
                                            if (dVarD != null) {
                                                str5 = "";
                                            } else {
                                                str5 = "";
                                            }
                                            if (dVarD != null) {
                                                str6 = dVarD.f2254f;
                                            } else {
                                                str6 = null;
                                            }
                                            if (dVarD != null) {
                                                j8 = dVarD.f2252d;
                                            } else {
                                                j8 = 0;
                                            }
                                            LocalDateTime localDateTime5 = new LocalDateTime(j8, DateTimeZone.UTC);
                                            qi0.a aVar1118 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                            aVar1118.getClass();
                                            u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime5), aVar1118), str4, mVar, 196608, 0);
                                            mVar.f();
                                        } else {
                                            mVar.C(1774815208);
                                            mVar.f();
                                        }
                                        mVar.f();
                                        dVar5 = dVar4;
                                    } else {
                                        mVar.C(1774920732);
                                        if (str2 != null) {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        } else {
                                            dVar5 = dVar4;
                                            mVar.C(1775821096);
                                            mVar.f();
                                        }
                                        mVar.f();
                                    }
                                    s62.a.f157643a.getClass();
                                    zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                    if (dVar3 == null) {
                                        mVar.C(1776184725);
                                        mVar.f();
                                    } else {
                                        mVar.C(1776184726);
                                        if (cVar3.isEmpty()) {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        } else {
                                            mVar.C(1902042134);
                                            mVar.f();
                                        }
                                        if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                            mVar.C(1902143256);
                                            i18 = 0;
                                            while (r0.hasNext()) {
                                                i19 = i18 + 1;
                                                if (i18 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                aa1.d dVar113 = dVar10;
                                                h4.r.a aVar1119 = h4.r.S;
                                                h4.r rVarF12 = x2.f(aVar1119, 1.0f);
                                                boolean zBooleanValue5 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                                if (i18 == 0) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                objQ6 = mVar.q();
                                                c2565a2 = p3.m.a.f135155b;
                                                i24 = 12;
                                                if (objQ6 == c2565a2) {
                                                    objQ6 = new x1.b(i24);
                                                    mVar.K(objQ6);
                                                }
                                                e23.a aVar11110 = (e23.a) objQ6;
                                                objQ7 = mVar.q();
                                                if (objQ7 == c2565a2) {
                                                    objQ7 = new x1.b(13);
                                                    mVar.K(objQ7);
                                                }
                                                e23.a aVar11111 = (e23.a) objQ7;
                                                pVar2 = pVar5;
                                                zB = mVar.B(pVar2);
                                                objQ8 = mVar.q();
                                                if (zB) {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                } else {
                                                    objQ8 = new uj1.y(pVar2, i24);
                                                    mVar.K(objQ8);
                                                }
                                                e23.p pVar14 = (e23.p) objQ8;
                                                o1Var2 = o1Var4;
                                                p1Var4 = p1Var11;
                                                zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                                objQ9 = mVar.q();
                                                if (zB2) {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                } else {
                                                    objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                    mVar.K(objQ9);
                                                }
                                                q91.d dVar114 = dVar3;
                                                u91.h.b(rVarF12, dVar113, dVar114, false, zBooleanValue5, false, z15, false, pVar4, aVar11110, aVar11111, pVar14, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar1119, j92.b.f97899b.f97920e), mVar);
                                                dVar3 = dVar114;
                                                i18 = i19;
                                                p1Var11 = p1Var4;
                                                pVar5 = pVar2;
                                                o1Var4 = o1Var2;
                                            }
                                            mVar.f();
                                        } else {
                                            dVar6 = dVar3;
                                            mVar.C(1903616035);
                                            i14 = 0;
                                            while (r0.hasNext()) {
                                                i15 = i14 + 1;
                                                if (i14 >= 0) {
                                                    p13.x.q();
                                                    throw null;
                                                }
                                                Context context7 = context2;
                                                aa1.d dVarD6 = x91.i.d((dn.a) obj8, context7, dVar6, eVar5);
                                                boolean zG6 = p005kotlin.jvm.internal.s.g(str2, dVarD6.f2253e);
                                                h4.r.a aVar11112 = h4.r.S;
                                                h4.r rVarF13 = x2.f(aVar11112, 1.0f);
                                                if (zG == 0) {
                                                }
                                                if (zG) {
                                                    z14 = false;
                                                } else {
                                                    z14 = false;
                                                }
                                                objQ2 = mVar.q();
                                                c2565a = p3.m.a.f135155b;
                                                i16 = 15;
                                                if (objQ2 == c2565a) {
                                                    objQ2 = new x1.b(i16);
                                                    mVar.K(objQ2);
                                                }
                                                e23.a aVar11113 = (e23.a) objQ2;
                                                objQ3 = mVar.q();
                                                i17 = 16;
                                                if (objQ3 == c2565a) {
                                                    objQ3 = new x1.b(i17);
                                                    mVar.K(objQ3);
                                                }
                                                e23.a aVar11114 = (e23.a) objQ3;
                                                objQ4 = mVar.q();
                                                if (objQ4 == c2565a) {
                                                    b14 = 0;
                                                    objQ4 = new wt0.i((byte) 0, 15);
                                                    mVar.K(objQ4);
                                                } else {
                                                    b14 = 0;
                                                }
                                                e23.p pVar15 = (e23.p) objQ4;
                                                objQ5 = mVar.q();
                                                if (objQ5 == c2565a) {
                                                    objQ5 = new wt0.i(b14, 16);
                                                    mVar.K(objQ5);
                                                }
                                                q91.d dVar115 = dVar6;
                                                u91.h.b(rVarF13, dVarD6, dVar115, false, false, false, z18, z14, pVar4, aVar11113, aVar11114, pVar15, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                                d92.b.f58623a.getClass();
                                                d92.b.f58625c.getClass();
                                                c2.l.f(x2.h(aVar11112, j92.b.f97899b.f97920e), mVar);
                                                i14 = i15;
                                                context2 = context7;
                                                dVar6 = dVar115;
                                            }
                                            mVar.f();
                                        }
                                        Unit unit7 = Unit.INSTANCE;
                                        mVar.f();
                                    }
                                    mVar.f();
                                } else {
                                    mVar.C(1781209640);
                                    mVar.f();
                                }
                                mVar.y();
                                mVar.Q();
                                mVar.f();
                            } else {
                                x3Var = p1Var6;
                                dVar4 = dVar2;
                            }
                            v.h.z(iHashCode2, mVar, iHashCode2, bVar6);
                            h5.g.a.f fVar8 = h5.g.a.f81807d;
                            b4.c(fVar8, rVarC2, mVar);
                            b0 b0Var7 = b0.f22601a;
                            if (z17) {
                                mVar.C(1774114577);
                                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                    mVar.C(1774007100);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1774083887);
                                        if (dVarD != null) {
                                            str5 = "";
                                        } else {
                                            str5 = "";
                                        }
                                        if (dVarD != null) {
                                            str6 = dVarD.f2254f;
                                        } else {
                                            str6 = null;
                                        }
                                        if (dVarD != null) {
                                            j8 = dVarD.f2252d;
                                        } else {
                                            j8 = 0;
                                        }
                                        LocalDateTime localDateTime6 = new LocalDateTime(j8, DateTimeZone.UTC);
                                        qi0.a aVar11115 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                        aVar11115.getClass();
                                        u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime6), aVar11115), str4, mVar, 196608, 0);
                                        mVar.f();
                                    } else {
                                        mVar.C(1774815208);
                                        mVar.f();
                                    }
                                    mVar.f();
                                    dVar5 = dVar4;
                                } else {
                                    mVar.C(1774920732);
                                    if (str2 != null) {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    } else {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    }
                                    mVar.f();
                                }
                                s62.a.f157643a.getClass();
                                zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                if (dVar3 == null) {
                                    mVar.C(1776184725);
                                    mVar.f();
                                } else {
                                    mVar.C(1776184726);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    } else {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    }
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1902143256);
                                        i18 = 0;
                                        while (r0.hasNext()) {
                                            i19 = i18 + 1;
                                            if (i18 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            aa1.d dVar116 = dVar10;
                                            h4.r.a aVar11116 = h4.r.S;
                                            h4.r rVarF14 = x2.f(aVar11116, 1.0f);
                                            boolean zBooleanValue6 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                            if (i18 == 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            objQ6 = mVar.q();
                                            c2565a2 = p3.m.a.f135155b;
                                            i24 = 12;
                                            if (objQ6 == c2565a2) {
                                                objQ6 = new x1.b(i24);
                                                mVar.K(objQ6);
                                            }
                                            e23.a aVar11117 = (e23.a) objQ6;
                                            objQ7 = mVar.q();
                                            if (objQ7 == c2565a2) {
                                                objQ7 = new x1.b(13);
                                                mVar.K(objQ7);
                                            }
                                            e23.a aVar11118 = (e23.a) objQ7;
                                            pVar2 = pVar5;
                                            zB = mVar.B(pVar2);
                                            objQ8 = mVar.q();
                                            if (zB) {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            } else {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            }
                                            e23.p pVar16 = (e23.p) objQ8;
                                            o1Var2 = o1Var4;
                                            p1Var4 = p1Var11;
                                            zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                            objQ9 = mVar.q();
                                            if (zB2) {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            } else {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            }
                                            q91.d dVar117 = dVar3;
                                            u91.h.b(rVarF14, dVar116, dVar117, false, zBooleanValue6, false, z15, false, pVar4, aVar11117, aVar11118, pVar16, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar11116, j92.b.f97899b.f97920e), mVar);
                                            dVar3 = dVar117;
                                            i18 = i19;
                                            p1Var11 = p1Var4;
                                            pVar5 = pVar2;
                                            o1Var4 = o1Var2;
                                        }
                                        mVar.f();
                                    } else {
                                        dVar6 = dVar3;
                                        mVar.C(1903616035);
                                        i14 = 0;
                                        while (r0.hasNext()) {
                                            i15 = i14 + 1;
                                            if (i14 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            Context context8 = context2;
                                            aa1.d dVarD7 = x91.i.d((dn.a) obj8, context8, dVar6, eVar5);
                                            boolean zG7 = p005kotlin.jvm.internal.s.g(str2, dVarD7.f2253e);
                                            h4.r.a aVar11119 = h4.r.S;
                                            h4.r rVarF15 = x2.f(aVar11119, 1.0f);
                                            if (zG == 0) {
                                            }
                                            if (zG) {
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                            }
                                            objQ2 = mVar.q();
                                            c2565a = p3.m.a.f135155b;
                                            i16 = 15;
                                            if (objQ2 == c2565a) {
                                                objQ2 = new x1.b(i16);
                                                mVar.K(objQ2);
                                            }
                                            e23.a aVar111110 = (e23.a) objQ2;
                                            objQ3 = mVar.q();
                                            i17 = 16;
                                            if (objQ3 == c2565a) {
                                                objQ3 = new x1.b(i17);
                                                mVar.K(objQ3);
                                            }
                                            e23.a aVar111111 = (e23.a) objQ3;
                                            objQ4 = mVar.q();
                                            if (objQ4 == c2565a) {
                                                b14 = 0;
                                                objQ4 = new wt0.i((byte) 0, 15);
                                                mVar.K(objQ4);
                                            } else {
                                                b14 = 0;
                                            }
                                            e23.p pVar17 = (e23.p) objQ4;
                                            objQ5 = mVar.q();
                                            if (objQ5 == c2565a) {
                                                objQ5 = new wt0.i(b14, 16);
                                                mVar.K(objQ5);
                                            }
                                            q91.d dVar118 = dVar6;
                                            u91.h.b(rVarF15, dVarD7, dVar118, false, false, false, z18, z14, pVar4, aVar111110, aVar111111, pVar17, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar11119, j92.b.f97899b.f97920e), mVar);
                                            i14 = i15;
                                            context2 = context8;
                                            dVar6 = dVar118;
                                        }
                                        mVar.f();
                                    }
                                    Unit unit8 = Unit.INSTANCE;
                                    mVar.f();
                                }
                                mVar.f();
                            } else {
                                mVar.C(1781209640);
                                mVar.f();
                            }
                            mVar.y();
                            mVar.Q();
                            mVar.f();
                        } else {
                            str2 = str10;
                        }
                        mVar.C(747450403);
                        s62.a.f157643a.getClass();
                        uVar = new o13.u(e9.a(t62.b.f162798a), gl1.y.Q(mVar, R.string.lbl_current_personal_record), gl1.y.Q(mVar, R.string.personal_records_all_time_record));
                        mVar.f();
                        dVar2 = (u4.d) uVar.f128605a;
                        str3 = (String) uVar.f128606b;
                        str4 = (String) uVar.f128607c;
                        mVar.N(747470262, Integer.valueOf(n1Var3.getIntValue()));
                        h4.r.a aVar22 = h4.r.S;
                        h4.r rVarE9 = u1.n.e(a2.b(x2.d(aVar22, 1.0f), d2Var, true), tn.k.a(d92.b.f58623a, mVar), o4.m1.f128891a);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar6 = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        zVarA = c2.y.a(kVar6, h4.d.a.f81536n, mVar, 0);
                        x1 x1Var6 = p3.n.f135158a;
                        iHashCode2 = Long.hashCode(mVar.getU());
                        i2VarX2 = mVar.x();
                        rVarC2 = h4.k.c(rVarE9, mVar);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (mVar.F() != null) {
                            p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        dVar3 = dVar;
                        h5.g.a.e eVar13 = h5.g.a.f81810g;
                        b4.c(eVar13, zVarA, mVar);
                        h5.g.a.C1623g c1623g5 = h5.g.a.f81809f;
                        b4.c(c1623g5, i2VarX2, mVar);
                        h5.g.a.b bVar7 = h5.g.a.f81813j;
                        if (mVar.getT()) {
                            x3Var = p1Var6;
                            dVar4 = dVar2;
                            if (!p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                            }
                            h5.g.a.f fVar9 = h5.g.a.f81807d;
                            b4.c(fVar9, rVarC2, mVar);
                            b0 b0Var8 = b0.f22601a;
                            if (z17) {
                                mVar.C(1774114577);
                                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                    mVar.C(1774007100);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1774083887);
                                        if (dVarD != null) {
                                            str5 = "";
                                        } else {
                                            str5 = "";
                                        }
                                        if (dVarD != null) {
                                            str6 = dVarD.f2254f;
                                        } else {
                                            str6 = null;
                                        }
                                        if (dVarD != null) {
                                            j8 = dVarD.f2252d;
                                        } else {
                                            j8 = 0;
                                        }
                                        LocalDateTime localDateTime7 = new LocalDateTime(j8, DateTimeZone.UTC);
                                        qi0.a aVar111112 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                        aVar111112.getClass();
                                        u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime7), aVar111112), str4, mVar, 196608, 0);
                                        mVar.f();
                                    } else {
                                        mVar.C(1774815208);
                                        mVar.f();
                                    }
                                    mVar.f();
                                    dVar5 = dVar4;
                                } else {
                                    mVar.C(1774920732);
                                    if (str2 != null) {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    } else {
                                        dVar5 = dVar4;
                                        mVar.C(1775821096);
                                        mVar.f();
                                    }
                                    mVar.f();
                                }
                                s62.a.f157643a.getClass();
                                zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                                if (dVar3 == null) {
                                    mVar.C(1776184725);
                                    mVar.f();
                                } else {
                                    mVar.C(1776184726);
                                    if (cVar3.isEmpty()) {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    } else {
                                        mVar.C(1902042134);
                                        mVar.f();
                                    }
                                    if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                        mVar.C(1902143256);
                                        i18 = 0;
                                        while (r0.hasNext()) {
                                            i19 = i18 + 1;
                                            if (i18 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            aa1.d dVar119 = dVar10;
                                            h4.r.a aVar111113 = h4.r.S;
                                            h4.r rVarF16 = x2.f(aVar111113, 1.0f);
                                            boolean zBooleanValue7 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                            if (i18 == 0) {
                                                z15 = true;
                                            } else {
                                                z15 = false;
                                            }
                                            objQ6 = mVar.q();
                                            c2565a2 = p3.m.a.f135155b;
                                            i24 = 12;
                                            if (objQ6 == c2565a2) {
                                                objQ6 = new x1.b(i24);
                                                mVar.K(objQ6);
                                            }
                                            e23.a aVar111114 = (e23.a) objQ6;
                                            objQ7 = mVar.q();
                                            if (objQ7 == c2565a2) {
                                                objQ7 = new x1.b(13);
                                                mVar.K(objQ7);
                                            }
                                            e23.a aVar111115 = (e23.a) objQ7;
                                            pVar2 = pVar5;
                                            zB = mVar.B(pVar2);
                                            objQ8 = mVar.q();
                                            if (zB) {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            } else {
                                                objQ8 = new uj1.y(pVar2, i24);
                                                mVar.K(objQ8);
                                            }
                                            e23.p pVar18 = (e23.p) objQ8;
                                            o1Var2 = o1Var4;
                                            p1Var4 = p1Var11;
                                            zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                            objQ9 = mVar.q();
                                            if (zB2) {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            } else {
                                                objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                                mVar.K(objQ9);
                                            }
                                            q91.d dVar1110 = dVar3;
                                            u91.h.b(rVarF16, dVar119, dVar1110, false, zBooleanValue7, false, z15, false, pVar4, aVar111114, aVar111115, pVar18, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar111113, j92.b.f97899b.f97920e), mVar);
                                            dVar3 = dVar1110;
                                            i18 = i19;
                                            p1Var11 = p1Var4;
                                            pVar5 = pVar2;
                                            o1Var4 = o1Var2;
                                        }
                                        mVar.f();
                                    } else {
                                        dVar6 = dVar3;
                                        mVar.C(1903616035);
                                        i14 = 0;
                                        while (r0.hasNext()) {
                                            i15 = i14 + 1;
                                            if (i14 >= 0) {
                                                p13.x.q();
                                                throw null;
                                            }
                                            Context context9 = context2;
                                            aa1.d dVarD8 = x91.i.d((dn.a) obj8, context9, dVar6, eVar5);
                                            boolean zG8 = p005kotlin.jvm.internal.s.g(str2, dVarD8.f2253e);
                                            h4.r.a aVar111116 = h4.r.S;
                                            h4.r rVarF17 = x2.f(aVar111116, 1.0f);
                                            if (zG == 0) {
                                            }
                                            if (zG) {
                                                z14 = false;
                                            } else {
                                                z14 = false;
                                            }
                                            objQ2 = mVar.q();
                                            c2565a = p3.m.a.f135155b;
                                            i16 = 15;
                                            if (objQ2 == c2565a) {
                                                objQ2 = new x1.b(i16);
                                                mVar.K(objQ2);
                                            }
                                            e23.a aVar111117 = (e23.a) objQ2;
                                            objQ3 = mVar.q();
                                            i17 = 16;
                                            if (objQ3 == c2565a) {
                                                objQ3 = new x1.b(i17);
                                                mVar.K(objQ3);
                                            }
                                            e23.a aVar111118 = (e23.a) objQ3;
                                            objQ4 = mVar.q();
                                            if (objQ4 == c2565a) {
                                                b14 = 0;
                                                objQ4 = new wt0.i((byte) 0, 15);
                                                mVar.K(objQ4);
                                            } else {
                                                b14 = 0;
                                            }
                                            e23.p pVar19 = (e23.p) objQ4;
                                            objQ5 = mVar.q();
                                            if (objQ5 == c2565a) {
                                                objQ5 = new wt0.i(b14, 16);
                                                mVar.K(objQ5);
                                            }
                                            q91.d dVar1111 = dVar6;
                                            u91.h.b(rVarF17, dVarD8, dVar1111, false, false, false, z18, z14, pVar4, aVar111117, aVar111118, pVar19, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            c2.l.f(x2.h(aVar111116, j92.b.f97899b.f97920e), mVar);
                                            i14 = i15;
                                            context2 = context9;
                                            dVar6 = dVar1111;
                                        }
                                        mVar.f();
                                    }
                                    Unit unit9 = Unit.INSTANCE;
                                    mVar.f();
                                }
                                mVar.f();
                            } else {
                                mVar.C(1781209640);
                                mVar.f();
                            }
                            mVar.y();
                            mVar.Q();
                            mVar.f();
                        } else {
                            x3Var = p1Var6;
                            dVar4 = dVar2;
                        }
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar7);
                        h5.g.a.f fVar10 = h5.g.a.f81807d;
                        b4.c(fVar10, rVarC2, mVar);
                        b0 b0Var9 = b0.f22601a;
                        if (z17) {
                            mVar.C(1774114577);
                            if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                mVar.C(1774007100);
                                if (cVar3.isEmpty()) {
                                    mVar.C(1774083887);
                                    if (dVarD != null) {
                                        str5 = "";
                                    } else {
                                        str5 = "";
                                    }
                                    if (dVarD != null) {
                                        str6 = dVarD.f2254f;
                                    } else {
                                        str6 = null;
                                    }
                                    if (dVarD != null) {
                                        j8 = dVarD.f2252d;
                                    } else {
                                        j8 = 0;
                                    }
                                    LocalDateTime localDateTime8 = new LocalDateTime(j8, DateTimeZone.UTC);
                                    qi0.a aVar111119 = qi0.a.YEAR_ABBREV_MONTH_DAY;
                                    aVar111119.getClass();
                                    u91.d.a(dVar4, str3, str5, str6, eVar5.a(g22.k.r(localDateTime8), aVar111119), str4, mVar, 196608, 0);
                                    mVar.f();
                                } else {
                                    mVar.C(1774815208);
                                    mVar.f();
                                }
                                mVar.f();
                                dVar5 = dVar4;
                            } else {
                                mVar.C(1774920732);
                                if (str2 != null) {
                                    dVar5 = dVar4;
                                    mVar.C(1775821096);
                                    mVar.f();
                                } else {
                                    dVar5 = dVar4;
                                    mVar.C(1775821096);
                                    mVar.f();
                                }
                                mVar.f();
                            }
                            s62.a.f157643a.getClass();
                            zG = p005kotlin.jvm.internal.s.g(dVar5, e9.a(t62.b.f162798a));
                            if (dVar3 == null) {
                                mVar.C(1776184725);
                                mVar.f();
                            } else {
                                mVar.C(1776184726);
                                if (cVar3.isEmpty()) {
                                    mVar.C(1902042134);
                                    mVar.f();
                                } else {
                                    mVar.C(1902042134);
                                    mVar.f();
                                }
                                if (((Boolean) x3Var.getF182175a()).booleanValue()) {
                                    mVar.C(1902143256);
                                    i18 = 0;
                                    while (r0.hasNext()) {
                                        i19 = i18 + 1;
                                        if (i18 >= 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        aa1.d dVar1112 = dVar10;
                                        h4.r.a aVar1111110 = h4.r.S;
                                        h4.r rVarF18 = x2.f(aVar1111110, 1.0f);
                                        boolean zBooleanValue8 = ((Boolean) p1Var3.getF182175a()).booleanValue();
                                        if (i18 == 0) {
                                            z15 = true;
                                        } else {
                                            z15 = false;
                                        }
                                        objQ6 = mVar.q();
                                        c2565a2 = p3.m.a.f135155b;
                                        i24 = 12;
                                        if (objQ6 == c2565a2) {
                                            objQ6 = new x1.b(i24);
                                            mVar.K(objQ6);
                                        }
                                        e23.a aVar1111111 = (e23.a) objQ6;
                                        objQ7 = mVar.q();
                                        if (objQ7 == c2565a2) {
                                            objQ7 = new x1.b(13);
                                            mVar.K(objQ7);
                                        }
                                        e23.a aVar1111112 = (e23.a) objQ7;
                                        pVar2 = pVar5;
                                        zB = mVar.B(pVar2);
                                        objQ8 = mVar.q();
                                        if (zB) {
                                            objQ8 = new uj1.y(pVar2, i24);
                                            mVar.K(objQ8);
                                        } else {
                                            objQ8 = new uj1.y(pVar2, i24);
                                            mVar.K(objQ8);
                                        }
                                        e23.p pVar110 = (e23.p) objQ8;
                                        o1Var2 = o1Var4;
                                        p1Var4 = p1Var11;
                                        zB2 = mVar.B(o1Var2) | mVar.B(p1Var4);
                                        objQ9 = mVar.q();
                                        if (zB2) {
                                            objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                            mVar.K(objQ9);
                                        } else {
                                            objQ9 = new x91.e(o1Var2, p1Var4, 0);
                                            mVar.K(objQ9);
                                        }
                                        q91.d dVar1113 = dVar3;
                                        u91.h.b(rVarF18, dVar1112, dVar1113, false, zBooleanValue8, false, z15, false, pVar4, aVar1111111, aVar1111112, pVar110, (e23.p) objQ9, mVar, 805309446, 6, SyslogConstants.LOG_LOCAL4);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.h(aVar1111110, j92.b.f97899b.f97920e), mVar);
                                        dVar3 = dVar1113;
                                        i18 = i19;
                                        p1Var11 = p1Var4;
                                        pVar5 = pVar2;
                                        o1Var4 = o1Var2;
                                    }
                                    mVar.f();
                                } else {
                                    dVar6 = dVar3;
                                    mVar.C(1903616035);
                                    i14 = 0;
                                    while (r0.hasNext()) {
                                        i15 = i14 + 1;
                                        if (i14 >= 0) {
                                            p13.x.q();
                                            throw null;
                                        }
                                        Context context10 = context2;
                                        aa1.d dVarD9 = x91.i.d((dn.a) obj8, context10, dVar6, eVar5);
                                        boolean zG9 = p005kotlin.jvm.internal.s.g(str2, dVarD9.f2253e);
                                        h4.r.a aVar1111113 = h4.r.S;
                                        h4.r rVarF19 = x2.f(aVar1111113, 1.0f);
                                        if (zG == 0) {
                                        }
                                        if (zG) {
                                            z14 = false;
                                        } else {
                                            z14 = false;
                                        }
                                        objQ2 = mVar.q();
                                        c2565a = p3.m.a.f135155b;
                                        i16 = 15;
                                        if (objQ2 == c2565a) {
                                            objQ2 = new x1.b(i16);
                                            mVar.K(objQ2);
                                        }
                                        e23.a aVar1111114 = (e23.a) objQ2;
                                        objQ3 = mVar.q();
                                        i17 = 16;
                                        if (objQ3 == c2565a) {
                                            objQ3 = new x1.b(i17);
                                            mVar.K(objQ3);
                                        }
                                        e23.a aVar1111115 = (e23.a) objQ3;
                                        objQ4 = mVar.q();
                                        if (objQ4 == c2565a) {
                                            b14 = 0;
                                            objQ4 = new wt0.i((byte) 0, 15);
                                            mVar.K(objQ4);
                                        } else {
                                            b14 = 0;
                                        }
                                        e23.p pVar111 = (e23.p) objQ4;
                                        objQ5 = mVar.q();
                                        if (objQ5 == c2565a) {
                                            objQ5 = new wt0.i(b14, 16);
                                            mVar.K(objQ5);
                                        }
                                        q91.d dVar1114 = dVar6;
                                        u91.h.b(rVarF19, dVarD9, dVar1114, false, false, false, z18, z14, pVar4, aVar1111114, aVar1111115, pVar111, (e23.p) objQ5, mVar, 805530630, 438, 0);
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        c2.l.f(x2.h(aVar1111113, j92.b.f97899b.f97920e), mVar);
                                        i14 = i15;
                                        context2 = context10;
                                        dVar6 = dVar1114;
                                    }
                                    mVar.f();
                                }
                                Unit unit10 = Unit.INSTANCE;
                                mVar.f();
                            }
                            mVar.f();
                        } else {
                            mVar.C(1781209640);
                            mVar.f();
                        }
                        mVar.y();
                        mVar.Q();
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var7 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                aa1.h hVar2 = (aa1.h) obj7;
                e23.a<Unit> aVar23 = (e23.a) obj6;
                e23.a<Unit> aVar24 = (e23.a) obj5;
                j0 j0Var = (j0) obj4;
                e23.l lVar = (e23.l) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar4.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    h4.r.a aVar25 = h4.r.S;
                    h4.r rVarE10 = u1.n.e(x2.d(aVar25, 1.0f), tn.k.a(d92.b.f58623a, mVar4), o4.m1.f128891a);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar7 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA3 = c2.y.a(kVar7, h4.d.a.f81536n, mVar4, 0);
                    int iHashCode5 = Long.hashCode(mVar4.getU());
                    i2 i2VarX5 = mVar4.x();
                    h4.r rVarC5 = h4.k.c(rVarE10, mVar4);
                    h5.g.V.getClass();
                    e0.a aVar26 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar26);
                    } else {
                        mVar4.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar4);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar4);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar4, iHashCode5, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar4);
                    b0 b0Var10 = b0.f22601a;
                    if (hVar2.f2294f.isEmpty()) {
                        mVar2 = mVar4;
                        mVar2.C(659768021);
                        mVar2.f();
                    } else {
                        mVar4.C(658308262);
                        h4.r rVarF20 = x2.f(aVar25, 1.0f);
                        d92.b.f58625c.getClass();
                        h4.r rVarY = c2.l.y(rVarF20, j92.b.f97899b.f97920e);
                        String strQ2 = gl1.y.Q(mVar4, R.string.select_personal_records_types_to_show);
                        d92.b.f58624b.getClass();
                        mh.c(strQ2, rVarY, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97931h, mVar4), mVar4, 0, 0, 131068);
                        mVar2 = mVar4;
                        x91.r.c(j0Var, hVar2, mVar2, 0);
                        h2.u.a(j0Var, x2.d(aVar25, 1.0f), null, null, 0, 0.0f, null, null, false, null, null, null, null, z3.f.c(-624537999, new o72.m1(22, hVar2, lVar), mVar2), mVar2, 100663344, 24576, 16124);
                        mVar2.f();
                    }
                    mVar2.y();
                    if (hVar2.f2291c) {
                        mVar2.C(-548724429);
                        c1.f110940a.a(false, gl1.y.Q(mVar2, R.string.lbl_error_occurred), gl1.y.Q(mVar2, R.string.msg_lifestyle_logging_setup_not_completed), null, null, gl1.y.Q(mVar2, R.string.golf_btn_try_again), false, false, aVar23, gl1.y.Q(mVar2, R.string.lbl_cancel), aVar24, mVar2, 6, 0, 216);
                        mVar2.f();
                    } else {
                        mVar2.C(-548241697);
                        mVar2.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                x91.s.b((aa1.i) obj7, (e23.l) obj4, (e23.l) obj3, (e23.p) obj6, (e23.q) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                xx1.h.a((Integer) obj7, (e23.l) obj4, (e23.a) obj6, (e23.a) obj5, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                xy.k.a((List) obj7, (DateTime) obj4, (DateTime) obj3, (sy.a) obj6, (pi0.e) obj5, (p3.m) obj, p0.t(32769));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                y01.n.a((v21.e) obj7, (b63.v) obj3, (String) obj4, (Boolean) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                String str11 = (String) obj4;
                String str12 = (String) obj3;
                e23.a aVar27 = (e23.a) obj6;
                p1 p1Var12 = (p1) obj7;
                y22.w wVar = (y22.w) obj5;
                p3.m mVar5 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar5.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    String strQ3 = gl1.y.Q(mVar5, R.string.title_photos);
                    str11.getClass();
                    str12.getClass();
                    String strP = gl1.y.P(R.string.value_slash_value, new Object[]{str11, str12}, mVar5);
                    i53.f fVarA3 = i53.a.a(new i3("Delete", gl1.y.Q(mVar5, R.string.lbl_delete), false, (u4.d) null, (String) null, 20, (p005kotlin.jvm.internal.j) null));
                    boolean zB5 = mVar5.B(p1Var12) | mVar5.r(wVar);
                    Object objQ22 = mVar5.q();
                    if (zB5) {
                        objQ22 = new x9.b(14, wVar, p1Var12);
                        mVar5.K(objQ22);
                    } else {
                        aVar3.getClass();
                        if (objQ22 == p3.m.a.f135155b) {
                            objQ22 = new x9.b(14, wVar, p1Var12);
                            mVar5.K(objQ22);
                        }
                    }
                    z02.f.d(strQ3, strP, null, aVar27, null, fVarA3, (e23.l) objQ22, mVar5, 2097152, 52);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                yg2.m.a((i53.c) obj7, (i53.c) obj4, (i53.c) obj3, (lc.y) obj6, (e23.l) obj5, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 10:
                return a(obj, obj2);
            case 11:
                Double d14 = (Double) obj7;
                Double d15 = (Double) obj3;
                e23.l lVar2 = (e23.l) obj6;
                e23.l lVar3 = (e23.l) obj5;
                String str13 = (String) obj4;
                p3.m mVar6 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    c02.h.a(x2.d(h4.r.S, 1.0f), d14, d15, lVar2, lVar3, str13, mVar6, 6);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                zu0.a.a((gv0.d) obj7, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(aa1.h hVar, e23.a aVar, e23.a aVar2, h2.b bVar, e23.l lVar) {
        this.f187387a = 3;
        this.f187388b = hVar;
        this.f187391e = aVar;
        this.f187392f = aVar2;
        this.f187389c = bVar;
        this.f187390d = lVar;
    }

    public /* synthetic */ e(int i14, Object obj, Object obj2, Object obj3, Object obj4, p1 p1Var) {
        this.f187387a = i14;
        this.f187388b = obj;
        this.f187389c = obj2;
        this.f187390d = obj3;
        this.f187391e = p1Var;
        this.f187392f = obj4;
    }

    public /* synthetic */ e(Double d14, Double d15, e23.l lVar, e23.l lVar2, String str) {
        this.f187387a = 11;
        this.f187388b = d14;
        this.f187390d = d15;
        this.f187391e = lVar;
        this.f187392f = lVar2;
        this.f187389c = str;
    }

    public /* synthetic */ e(Integer num, e23.l lVar, e23.a aVar, e23.a aVar2, e23.a aVar3, int i14) {
        this.f187387a = 5;
        this.f187388b = num;
        this.f187389c = lVar;
        this.f187391e = aVar;
        this.f187392f = aVar2;
        this.f187390d = aVar3;
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f187387a = i15;
        this.f187388b = obj;
        this.f187389c = obj2;
        this.f187390d = obj3;
        this.f187391e = obj4;
        this.f187392f = obj5;
    }

    public /* synthetic */ e(String str, String str2, e23.a aVar, p1 p1Var, y22.w wVar) {
        this.f187387a = 8;
        this.f187389c = str;
        this.f187390d = str2;
        this.f187391e = aVar;
        this.f187388b = p1Var;
        this.f187392f = wVar;
    }

    public /* synthetic */ e(v21.e eVar, b63.v vVar, String str, Boolean bool, e23.l lVar, int i14) {
        this.f187387a = 7;
        this.f187388b = eVar;
        this.f187390d = vVar;
        this.f187389c = str;
        this.f187391e = bool;
        this.f187392f = lVar;
    }
}
