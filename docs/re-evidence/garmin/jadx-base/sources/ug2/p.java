package ug2;

import android.app.Activity;
import android.content.Context;
import c2.q2;
import c2.s2;
import c2.t2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.timinggates.TimingGatesActivity;
import f5.z0;
import i3.i7;
import i3.mh;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import l72.c1;
import l72.g3;
import l72.h3;
import l72.i3;
import o4.m1;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;
import p006l2.l1;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;
import ps.z1;
import v2.g2;
import v2.h2;
import v62.b3;
import vd0.b1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f170905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f170906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f170907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f170908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f170909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f170910f;

    public /* synthetic */ p(t2 t2Var, e23.a aVar, e23.a aVar2, boolean z14, e23.a aVar3, int i14) {
        this.f170905a = 14;
        this.f170907c = t2Var;
        this.f170908d = aVar;
        this.f170909e = aVar2;
        this.f170906b = z14;
        this.f170910f = aVar3;
    }

    private final Object a(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        int iT = p3.p0.t(7);
        yr.t0.d((t2) this.f170907c, (e23.a) this.f170908d, (e23.a) this.f170909e, this.f170906b, (e23.a) this.f170910f, (p3.m) obj, iT);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object b(Object obj, Object obj2) {
        bb1.g gVar = (bb1.g) this.f170907c;
        e23.p pVar = (e23.p) this.f170908d;
        Long l14 = (Long) this.f170909e;
        e23.a aVar = (e23.a) this.f170910f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            if (gVar != null) {
                mVar.C(1969484072);
                bb1.f.b(gVar, null, null, pVar, mVar, 432);
                mVar.f();
            } else {
                mVar.C(1969807030);
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.p0.n(Boolean.FALSE);
                    mVar.K(objQ);
                }
                p1 p1Var = (p1) objQ;
                String strValueOf = String.valueOf(l14.longValue());
                boolean z14 = this.f170906b;
                boolean zH = mVar.h(z14) | mVar.B(aVar);
                Object objQ2 = mVar.q();
                if (zH || objQ2 == c2565a) {
                    objQ2 = new lm0.m(2, aVar, p1Var, z14);
                    mVar.K(objQ2);
                }
                bb1.f.a(0, 2, (e23.l) objQ2, strValueOf, mVar, false);
                p3.m mVar2 = mVar;
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    mVar2.C(1970345593);
                    c1 c1Var = c1.f110940a;
                    String strQ = gl1.y.Q(mVar2, R.string.power_guide_create_lbl);
                    String strQ2 = gl1.y.Q(mVar2, R.string.power_guide_assign_shared_event_message);
                    String strQ3 = gl1.y.Q(mVar2, R.string.lbl_common_continue);
                    boolean zB = mVar2.B(aVar);
                    Object objQ3 = mVar2.q();
                    if (zB || objQ3 == c2565a) {
                        objQ3 = new w52.p1(aVar, p1Var, 8);
                        mVar2.K(objQ3);
                    }
                    e23.a<Unit> aVar2 = (e23.a) objQ3;
                    String strQ4 = gl1.y.Q(mVar2, R.string.lbl_cancel);
                    Object objQ4 = mVar2.q();
                    if (objQ4 == c2565a) {
                        objQ4 = new yg2.l0(p1Var, 15);
                        mVar2.K(objQ4);
                    }
                    c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar2, strQ4, (e23.a) objQ4, mVar2, 0, 6, 217);
                    mVar2 = mVar2;
                    mVar2.f();
                } else {
                    mVar2.C(1971096134);
                    mVar2.f();
                }
                mVar2.f();
            }
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object c(Object obj, Object obj2) {
        String str = (String) this.f170907c;
        e23.l lVar = (e23.l) this.f170908d;
        p1 p1Var = (p1) this.f170910f;
        p1 p1Var2 = (p1) this.f170909e;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            b82.t0 t0Var = b82.t0.f16792a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_distance);
            x5.v.f188954b.getClass();
            int i14 = x5.v.f188957e;
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new yq.d(26);
                mVar.K(objQ);
            }
            e23.l<? super x5.l0, x5.l0> lVar2 = (e23.l) objQ;
            boolean zB = mVar.B(lVar);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new wr1.d(lVar, 25);
                mVar.K(objQ2);
            }
            e23.l<? super String, Unit> lVar3 = (e23.l) objQ2;
            Object objQ3 = mVar.q();
            if (objQ3 == c2565a) {
                objQ3 = new sk0.l(p1Var, p1Var2, 8);
                mVar.K(objQ3);
            }
            t0Var.j(null, strQ, str, null, this.f170906b, lVar2, lVar3, (e23.l) objQ3, i14, 0, null, mVar, 113445888, 0, 1537);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2) {
        v61.a aVar = (v61.a) this.f170907c;
        String str = (String) this.f170908d;
        String str2 = (String) this.f170909e;
        String str3 = (String) this.f170910f;
        p3.m mVar = (p3.m) obj;
        int iIntValue = ((Integer) obj2).intValue();
        if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarF = x2.f(aVar2, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar = j92.b.f97899b;
            h4.r rVarY = c2.l.y(rVarF, eVar.f97920e);
            c2.j.f22691a.getClass();
            c2.j.C0343j c0343j = c2.j.f22692b;
            h4.d.f81522a.getClass();
            s2 s2VarA = q2.a(c0343j, h4.d.a.f81533k, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarY, mVar);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, s2VarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            h4.r rVarC2 = u2.f22900a.c(aVar2, h4.d.a.f81534l);
            u4.d dVarS = aVar.f175803c.s(this.f170906b);
            f02.h.f67736a.getClass();
            g02.i.a(rVarC2, dVarS, f02.h.a(mVar), n5.a.a(mVar, aVar.f175803c.f4366i), eVar.f97923h, 0.0f, null, mVar, 0, 224);
            float f14 = eVar.f97920e;
            h4.r rVarC3 = c2.l.C(aVar2, f14, 0.0f, f14, 0.0f, 10);
            c2.z zVarA = c2.y.a(c2.j.i(eVar.f97917b), h4.d.a.f81536n, mVar, 0);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC4 = h4.k.c(rVarC3, mVar);
            if (mVar.F() == null) {
                p3.p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar2, zVarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC4, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            String strH = aVar.f175802b;
            if (strH == null) {
                strH = sn.a.h(mVar, -2035285587, R.string.txt_untitle, mVar);
            } else {
                mVar.C(-2035286362);
                mVar.f();
            }
            mh.c(strH, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, w3.x.g(mVar), mVar, 0, 0, 131070);
            mh.c(gl1.y.P(R.string.string_at_string_pattern, new Object[]{str, str2}, mVar), c2.l.C(aVar2, 0.0f, eVar.f97917b, 0.0f, 0.0f, 13), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, w3.x.i(mVar), mVar, 0, 0, 131068);
            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, w3.x.i(mVar), mVar, 0, 0, 131070);
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x041d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0529  */
    /* JADX WARN: Code duplicated, block: B:147:0x0532  */
    /* JADX WARN: Code duplicated, block: B:148:0x0536  */
    /* JADX WARN: Code duplicated, block: B:153:0x0553  */
    /* JADX WARN: Code duplicated, block: B:156:0x0576  */
    /* JADX WARN: Code duplicated, block: B:158:0x057f  */
    /* JADX WARN: Code duplicated, block: B:159:0x0583  */
    /* JADX WARN: Code duplicated, block: B:164:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:167:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:168:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:170:0x0633  */
    /* JADX WARN: Code duplicated, block: B:172:0x063c  */
    /* JADX WARN: Code duplicated, block: B:173:0x0640  */
    /* JADX WARN: Code duplicated, block: B:178:0x065d  */
    /* JADX WARN: Code duplicated, block: B:182:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:184:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:185:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:190:0x06ef  */
    /* JADX WARN: Code duplicated, block: B:193:0x0712  */
    /* JADX WARN: Code duplicated, block: B:195:0x071b  */
    /* JADX WARN: Code duplicated, block: B:196:0x071f  */
    /* JADX WARN: Code duplicated, block: B:201:0x073c  */
    /* JADX WARN: Code duplicated, block: B:204:0x077d  */
    /* JADX WARN: Code duplicated, block: B:205:0x077f  */
    /* JADX WARN: Code duplicated, block: B:208:0x078c  */
    /* JADX WARN: Code duplicated, block: B:210:0x078f  */
    /* JADX WARN: Code duplicated, block: B:211:0x079a  */
    /* JADX WARN: Code duplicated, block: B:213:0x07a5  */
    /* JADX WARN: Code duplicated, block: B:216:0x07b0  */
    /* JADX WARN: Code duplicated, block: B:217:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:221:0x07d6 A[LOOP:0: B:219:0x07d0->B:221:0x07d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:229:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:231:0x07fe  */
    /* JADX WARN: Code duplicated, block: B:233:0x0838  */
    /* JADX WARN: Code duplicated, block: B:235:0x0841  */
    /* JADX WARN: Code duplicated, block: B:236:0x0845  */
    /* JADX WARN: Code duplicated, block: B:239:0x085a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0868  */
    /* JADX WARN: Code duplicated, block: B:243:0x08c9  */
    /* JADX WARN: Code duplicated, block: B:248:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:250:0x0916  */
    /* JADX WARN: Code duplicated, block: B:252:0x091f  */
    /* JADX WARN: Code duplicated, block: B:253:0x0923  */
    /* JADX WARN: Code duplicated, block: B:256:0x0938  */
    /* JADX WARN: Code duplicated, block: B:258:0x0946  */
    /* JADX WARN: Code duplicated, block: B:261:0x0986  */
    /* JADX WARN: Code duplicated, block: B:263:0x098f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0993  */
    /* JADX WARN: Code duplicated, block: B:267:0x09a2  */
    /* JADX WARN: Code duplicated, block: B:269:0x09b0  */
    /* JADX WARN: Code duplicated, block: B:272:0x09bc  */
    /* JADX WARN: Code duplicated, block: B:273:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:276:0x0a4d  */
    /* JADX WARN: Code duplicated, block: B:278:0x0a56  */
    /* JADX WARN: Code duplicated, block: B:279:0x0a5a  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:282:0x0a69  */
    /* JADX WARN: Code duplicated, block: B:284:0x0a77  */
    /* JADX WARN: Code duplicated, block: B:287:0x0a81  */
    /* JADX WARN: Code duplicated, block: B:289:0x0a88  */
    /* JADX WARN: Code duplicated, block: B:292:0x0aa0  */
    /* JADX WARN: Code duplicated, block: B:293:0x0aaa  */
    /* JADX WARN: Code duplicated, block: B:295:0x0b05  */
    /* JADX WARN: Code duplicated, block: B:297:0x0b0b  */
    /* JADX WARN: Code duplicated, block: B:299:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:301:0x0b13  */
    /* JADX WARN: Code duplicated, block: B:303:0x0b4d  */
    /* JADX WARN: Code duplicated, block: B:305:0x0b56  */
    /* JADX WARN: Code duplicated, block: B:306:0x0b5a  */
    /* JADX WARN: Code duplicated, block: B:309:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:311:0x0b7d  */
    /* JADX WARN: Code duplicated, block: B:315:0x0bfe  */
    /* JADX WARN: Code duplicated, block: B:317:0x0c07  */
    /* JADX WARN: Code duplicated, block: B:318:0x0c0b  */
    /* JADX WARN: Code duplicated, block: B:321:0x0c20  */
    /* JADX WARN: Code duplicated, block: B:323:0x0c2e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0c5b  */
    /* JADX WARN: Code duplicated, block: B:328:0x0c62  */
    /* JADX WARN: Code duplicated, block: B:330:0x0c86  */
    /* JADX WARN: Code duplicated, block: B:332:0x0c8c  */
    /* JADX WARN: Code duplicated, block: B:334:0x0c92  */
    /* JADX WARN: Code duplicated, block: B:336:0x0c96  */
    /* JADX WARN: Code duplicated, block: B:338:0x0c9a  */
    /* JADX WARN: Code duplicated, block: B:340:0x0c9e  */
    /* JADX WARN: Code duplicated, block: B:342:0x0ca2  */
    /* JADX WARN: Code duplicated, block: B:369:0x0d88  */
    /* JADX WARN: Code duplicated, block: B:45:0x015a  */
    /* JADX WARN: Code duplicated, block: B:84:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:89:0x0301  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p1 p1Var;
        h5.g.a.f fVar;
        c2.j.C0343j c0343j;
        h4.g.b bVar;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        c2.z zVarA;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        h4.r.a aVar;
        h5.e0.a aVar2;
        gl.e eVar;
        c2.j.k kVar;
        z0 z0VarD;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        p3.m mVar;
        h4.r.a aVar3;
        c2.z zVarA2;
        int iHashCode4;
        i2 i2VarX4;
        h4.r rVarC4;
        s2 s2VarA2;
        int iHashCode5;
        i2 i2VarX5;
        h4.r rVarC5;
        p3.m mVar2;
        je0.g gVar;
        int i14;
        int i15;
        int i16;
        String strH;
        pe0.d dVar;
        String str;
        ArrayList arrayList;
        Iterator<pe0.d> it;
        String str2;
        s2 s2VarA3;
        int iHashCode6;
        i2 i2VarX6;
        h4.r rVarC6;
        h5.e0.a aVar4;
        h5.g.a.b bVar2;
        h4.r.a aVar5;
        s2 s2VarA4;
        int iHashCode7;
        i2 i2VarX7;
        h4.r rVarC7;
        h5.e0.a aVar6;
        h5.g.a.b bVar3;
        s2 s2VarA5;
        int iHashCode8;
        i2 i2VarX8;
        h4.r rVarC8;
        h5.e0.a aVar7;
        h5.g.a.b bVar4;
        boolean zB;
        Object objQ;
        h4.r.a aVar8;
        s2 s2VarA6;
        int iHashCode9;
        i2 i2VarX9;
        h4.r rVarC9;
        h5.e0.a aVar9;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar5;
        h5.g.a.f fVar2;
        j92.b bVar6;
        j92.e eVar3;
        c2.j.k kVar2;
        h4.g.a aVar10;
        c2.z zVarA3;
        int iHashCode10;
        i2 i2VarX10;
        h4.r rVarC10;
        String str3;
        c2.z zVarA4;
        int iHashCode11;
        i2 i2VarX11;
        h4.r rVarC11;
        qs.y yVar;
        String strB;
        i53.f fVar3;
        i53.f fVar4;
        int iG;
        int iG2;
        int i17 = this.f170905a;
        boolean z14 = this.f170906b;
        p3.m.a aVar11 = p3.m.f135153a;
        Object obj3 = this.f170910f;
        Object obj4 = this.f170909e;
        Object obj5 = this.f170908d;
        Object obj6 = this.f170907c;
        switch (i17) {
            case 0:
                qg2.c cVar = (qg2.c) obj6;
                Activity activity = (Activity) obj5;
                lc.m0 m0Var = (lc.m0) obj4;
                p1 p1Var2 = (p1) obj3;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar3.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    String strQ = gl1.y.Q(mVar3, cVar.e().f3219b);
                    rg2.b bVar7 = rg2.b.f152669a;
                    ag2.c.a aVarE = cVar.e();
                    zf2.d dVar2 = (zf2.d) p1Var2.getF182175a();
                    bVar7.getClass();
                    String strA = rg2.b.a(aVarE, z14, dVar2, mVar3);
                    int i18 = b3.a.f15501a;
                    u4.d dVarA = c3.a.a();
                    if (strA != null) {
                        mVar3.C(84746177);
                        strQ = gl1.y.P(R.string.value_unit, new Object[]{strQ, strA}, mVar3);
                        mVar3.f();
                    } else {
                        mVar3.C(84753699);
                        mVar3.f();
                    }
                    String str4 = strQ;
                    boolean zR = mVar3.r(activity) | mVar3.r(m0Var);
                    Object objQ2 = mVar3.q();
                    if (zR) {
                        objQ2 = new ot1.x(activity, m0Var, 3);
                        mVar3.K(objQ2);
                    } else {
                        aVar11.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new ot1.x(activity, m0Var, 3);
                            mVar3.K(objQ2);
                        }
                    }
                    h3.e(dVarA, str4, null, null, (e23.a) objQ2, null, null, mVar3, 0, 108);
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                up1.b.a((u82.d) obj6, this.f170906b, (e23.l) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                v40.e.b(this.f170906b, (e23.l) obj6, (k30.k) obj5, (i53.c) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(49));
                return Unit.INSTANCE;
            case 3:
                pe0.f fVar5 = (pe0.f) obj6;
                l22.a aVar12 = (l22.a) obj5;
                e23.a aVar13 = (e23.a) obj4;
                p1 p1Var3 = (p1) obj3;
                p3.m mVar4 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                float f14 = b1.f177173a;
                if (mVar4.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar14 = h4.r.S;
                    h4.r rVarF = x2.f(aVar14, 1.0f);
                    d92.b.f58623a.getClass();
                    j92.b bVar8 = d92.b.f58625c;
                    bVar8.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarF, eVar4.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar15 = h4.d.a.f81536n;
                    c2.z zVarA5 = c2.y.a(kVar3, aVar15, mVar4, 0);
                    int iHashCode12 = Long.hashCode(mVar4.getU());
                    i2 i2VarX12 = mVar4.x();
                    h4.r rVarC12 = h4.k.c(rVarY, mVar4);
                    h5.g.V.getClass();
                    h5.e0.a aVar16 = h5.g.a.f81805b;
                    if (mVar4.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar16);
                    } else {
                        mVar4.c();
                    }
                    h5.g.a.e eVar5 = h5.g.a.f81810g;
                    b4.c(eVar5, zVarA5, mVar4);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX12, mVar4);
                    h5.g.a.b bVar9 = h5.g.a.f81813j;
                    if (mVar4.getT()) {
                        p1Var = p1Var3;
                    } else {
                        p1Var = p1Var3;
                        if (!p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode12))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC12, mVar4);
                        c2.b0 b0Var = c2.b0.f22601a;
                        c0343j = c2.j.f22692b;
                        bVar = h4.d.a.f81533k;
                        s2VarA = q2.a(c0343j, bVar, mVar4, 0);
                        iHashCode = Long.hashCode(mVar4.getU());
                        i2VarX = mVar4.x();
                        rVarC = h4.k.c(aVar14, mVar4);
                        if (mVar4.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar16);
                        } else {
                            mVar4.c();
                        }
                        b4.c(eVar5, s2VarA, mVar4);
                        b4.c(c1623g2, i2VarX, mVar4);
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode))) {
                            v.h.z(iHashCode, mVar4, iHashCode, bVar9);
                        }
                        b4.c(fVar, rVarC, mVar4);
                        u2 u2Var = u2.f22900a;
                        zVarA = c2.y.a(kVar3, aVar15, mVar4, 0);
                        iHashCode2 = Long.hashCode(mVar4.getU());
                        i2VarX2 = mVar4.x();
                        rVarC2 = h4.k.c(aVar14, mVar4);
                        if (mVar4.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar16);
                        } else {
                            mVar4.c();
                        }
                        b4.c(eVar5, zVarA, mVar4);
                        b4.c(c1623g2, i2VarX2, mVar4);
                        if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode2))) {
                            v.h.z(iHashCode2, mVar4, iHashCode2, bVar9);
                        }
                        b4.c(fVar, rVarC2, mVar4);
                        if (g22.n.d(fVar5.f137431l)) {
                            mVar4.C(-1088936187);
                            String str5 = fVar5.f137431l;
                            String strQ2 = gl1.y.Q(mVar4, R.string.lbl_profile_picture);
                            h4.r rVarB = l4.k.b(x2.q(aVar14, f14), k2.i.f102406a);
                            f5.k.f68985a.getClass();
                            aVar2 = aVar16;
                            aVar = aVar14;
                            jf.r.a(str5, strQ2, rVarB, null, null, f5.k.a.f68987b, null, mVar4, 1572864, 1976);
                            mVar = mVar4;
                            mVar.f();
                            kVar = kVar3;
                        } else {
                            aVar = aVar14;
                            aVar2 = aVar16;
                            mVar4.C(-1088286272);
                            h4.r rVarB2 = l4.k.b(x2.q(aVar, f14), k2.i.f102406a);
                            gl.c.f77766a.getClass();
                            eVar = gl.c.f77767b;
                            kVar = kVar3;
                            h4.r rVarE = u1.n.e(rVarB2, eVar.f77781g, m1.f128891a);
                            z0VarD = c2.q.d(h4.d.a.f81528f, false);
                            iHashCode3 = Long.hashCode(mVar4.getU());
                            i2VarX3 = mVar4.x();
                            rVarC3 = h4.k.c(rVarE, mVar4);
                            if (mVar4.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar4.z();
                            if (mVar4.getT()) {
                                mVar4.M(aVar2);
                            } else {
                                mVar4.c();
                            }
                            b4.c(eVar5, z0VarD, mVar4);
                            b4.c(c1623g2, i2VarX3, mVar4);
                            if (mVar4.getT() || !p005kotlin.jvm.internal.s.g(mVar4.q(), Integer.valueOf(iHashCode3))) {
                                v.h.z(iHashCode3, mVar4, iHashCode3, bVar9);
                            }
                            b4.c(fVar, rVarC3, mVar4);
                            c2.u uVar = c2.u.f22885a;
                            t4.d dVarA2 = n5.c.a(R.drawable.ic_dog_profile_placeholder, mVar4, 0);
                            String strQ3 = gl1.y.Q(mVar4, R.string.lbl_profile_picture);
                            long j8 = eVar.f77787j;
                            g6.f.a aVar17 = g6.f.f75994b;
                            i7.a(dVarA2, strQ3, x2.q(aVar, 80), j8, mVar4, 384, 0);
                            mVar = mVar4;
                            mVar.y();
                            mVar.f();
                        }
                        mVar.y();
                        bVar8.getClass();
                        aVar3 = aVar;
                        h4.r rVarC13 = c2.l.C(aVar3, eVar4.f97919d, 0.0f, 0.0f, 0.0f, 14);
                        zVarA2 = c2.y.a(kVar, aVar15, mVar, 0);
                        iHashCode4 = Long.hashCode(mVar.getU());
                        i2VarX4 = mVar.x();
                        rVarC4 = h4.k.c(rVarC13, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar5, zVarA2, mVar);
                        b4.c(c1623g2, i2VarX4, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                            v.h.z(iHashCode4, mVar, iHashCode4, bVar9);
                        }
                        b4.c(fVar, rVarC4, mVar);
                        s2VarA2 = q2.a(c0343j, bVar, mVar, 0);
                        iHashCode5 = Long.hashCode(mVar.getU());
                        i2VarX5 = mVar.x();
                        rVarC5 = h4.k.c(aVar3, mVar);
                        if (mVar.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar.z();
                        if (mVar.getT()) {
                            mVar.M(aVar2);
                        } else {
                            mVar.c();
                        }
                        b4.c(eVar5, s2VarA2, mVar);
                        b4.c(c1623g2, i2VarX5, mVar);
                        if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode5))) {
                            v.h.z(iHashCode5, mVar, iHashCode5, bVar9);
                        }
                        b4.c(fVar, rVarC5, mVar);
                        p3.m mVar5 = mVar;
                        String str6 = fVar5.f137421b;
                        d92.b.f58624b.getClass();
                        mh.c(str6, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar5, 0, 0, 131070);
                        mVar2 = mVar5;
                        mVar2.y();
                        gVar = fVar5.f137424e;
                        if (gVar == null) {
                            i14 = -1;
                        } else {
                            i14 = b1.a.f177174a[gVar.ordinal()];
                        }
                        if (i14 != 1) {
                            if (i14 != 2) {
                                mVar2.C(1044566501);
                                mVar2.f();
                                strH = "";
                            } else {
                                i15 = 1557713347;
                                i16 = R.string.lbl_gender_female;
                            }
                            dVar = fVar5.f137422c;
                            if (dVar != null) {
                                str = dVar.f137417b;
                            } else {
                                str = null;
                            }
                            String strL = oi0.c.l(str, mVar2);
                            mVar2.C(1557726102);
                            i53.c<pe0.d> cVar2 = fVar5.f137423d;
                            arrayList = new ArrayList(p13.y.r(cVar2, 10));
                            it = cVar2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(oi0.c.l(it.next().f137417b, mVar2));
                            }
                            mVar2.f();
                            String strH2 = w5.r.h(strL, arrayList, mVar2);
                            str2 = strH2 != null ? strH2 : "";
                            if (strH.length() > 0 && str2.length() <= 0) {
                                mVar2.C(1045456265);
                                mVar2.f();
                            } else {
                                mVar2.C(1045056489);
                                h4.r.a aVar18 = h4.r.S;
                                c2.j.f22691a.getClass();
                                c2.j.C0343j c0343j2 = c2.j.f22692b;
                                h4.d.f81522a.getClass();
                                s2VarA3 = q2.a(c0343j2, h4.d.a.f81533k, mVar2, 0);
                                x1 x1Var3 = p3.n.f135158a;
                                iHashCode6 = Long.hashCode(mVar2.getU());
                                i2VarX6 = mVar2.x();
                                rVarC6 = h4.k.c(aVar18, mVar2);
                                h5.g.V.getClass();
                                aVar4 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar4);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, s2VarA3, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX6, mVar2);
                                bVar2 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode6))) {
                                    v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                                }
                                b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                                u2 u2Var2 = u2.f22900a;
                                String string = d53.w.i0(strH + StringUtils.SPACE + str2).toString();
                                d92.b.f58623a.getClass();
                                d92.b.f58624b.getClass();
                                mh.c(string, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar2, 0, 0, 131070);
                                mVar2 = mVar2;
                                mVar2.y();
                                mVar2.f();
                            }
                            if (fVar5.f137427h != je0.j.RETIRED) {
                                mVar2.C(1045583241);
                                aVar8 = h4.r.S;
                                c2.j.f22691a.getClass();
                                c2.j.C0343j c0343j3 = c2.j.f22692b;
                                h4.d.f81522a.getClass();
                                s2VarA6 = q2.a(c0343j3, h4.d.a.f81533k, mVar2, 0);
                                x1 x1Var4 = p3.n.f135158a;
                                iHashCode9 = Long.hashCode(mVar2.getU());
                                i2VarX9 = mVar2.x();
                                rVarC9 = h4.k.c(aVar8, mVar2);
                                h5.g.V.getClass();
                                aVar9 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                eVar2 = h5.g.a.f81810g;
                                b4.c(eVar2, s2VarA6, mVar2);
                                c1623g = h5.g.a.f81809f;
                                b4.c(c1623g, i2VarX9, mVar2);
                                bVar5 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode9))) {
                                    v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                                }
                                fVar2 = h5.g.a.f81807d;
                                b4.c(fVar2, rVarC9, mVar2);
                                u2 u2Var3 = u2.f22900a;
                                d92.b.f58623a.getClass();
                                bVar6 = d92.b.f58625c;
                                bVar6.getClass();
                                eVar3 = j92.b.f97899b;
                                h4.r rVarC14 = c2.l.C(aVar8, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13);
                                kVar2 = c2.j.f22694d;
                                aVar10 = h4.d.a.f81536n;
                                zVarA3 = c2.y.a(kVar2, aVar10, mVar2, 0);
                                iHashCode10 = Long.hashCode(mVar2.getU());
                                i2VarX10 = mVar2.x();
                                rVarC10 = h4.k.c(rVarC14, mVar2);
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar2, zVarA3, mVar2);
                                b4.c(c1623g, i2VarX10, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode10))) {
                                    v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                                }
                                b4.c(fVar2, rVarC10, mVar2);
                                c2.b0 b0Var2 = c2.b0.f22601a;
                                str3 = fVar5.f137426g;
                                if (str3 == null) {
                                    mVar2.C(-2095477274);
                                    mVar2.f();
                                } else {
                                    mVar2.C(-2095477273);
                                    j92.f fVar6 = d92.b.f58624b;
                                    fVar6.getClass();
                                    p3.m mVar6 = mVar2;
                                    mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar6, 0, 0, 131070);
                                    String strQ4 = gl1.y.Q(mVar6, R.string.lbl_age);
                                    fVar6.getClass();
                                    mh.c(strQ4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar6, 0, 0, 131070);
                                    mVar2 = mVar6;
                                    Unit unit = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                mVar2.y();
                                bVar6.getClass();
                                float f15 = eVar3.f97919d;
                                bVar6.getClass();
                                h4.r rVarC15 = c2.l.C(aVar8, eVar3.f97922g, f15, 0.0f, 0.0f, 12);
                                zVarA4 = c2.y.a(kVar2, aVar10, mVar2, 0);
                                iHashCode11 = Long.hashCode(mVar2.getU());
                                i2VarX11 = mVar2.x();
                                rVarC11 = h4.k.c(rVarC15, mVar2);
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar9);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(eVar2, zVarA4, mVar2);
                                b4.c(c1623g, i2VarX11, mVar2);
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode11))) {
                                    v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                                }
                                b4.c(fVar2, rVarC11, mVar2);
                                if (z14) {
                                    yVar = qs.y.UNIT_WEIGHT_KILOGRAM;
                                } else {
                                    yVar = qs.y.UNIT_WEIGHT_POUND;
                                }
                                strB = ss.k.b(ls.e.PACK_WEIGHT, aVar12, new ps.h0(fVar5.f137425f, new z1(null, null, yVar.f147239a)), 1);
                                if (strB == null) {
                                    mVar2.C(886753490);
                                    mVar2.f();
                                } else {
                                    mVar2.C(886753491);
                                    j92.f fVar7 = d92.b.f58624b;
                                    fVar7.getClass();
                                    p3.m mVar7 = mVar2;
                                    mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar7, 0, 0, 131070);
                                    String strQ5 = gl1.y.Q(mVar7, R.string.lbl_weight);
                                    fVar7.getClass();
                                    mh.c(strQ5, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar7, 0, 0, 131070);
                                    mVar2 = mVar7;
                                    Unit unit2 = Unit.INSTANCE;
                                    mVar2.f();
                                }
                                mVar2.y();
                                mVar2.y();
                                mVar2.f();
                            } else {
                                mVar2.C(1047136124);
                                aVar5 = h4.r.S;
                                c2.j.f22691a.getClass();
                                c2.j.C0343j c0343j4 = c2.j.f22692b;
                                h4.d.f81522a.getClass();
                                s2VarA4 = q2.a(c0343j4, h4.d.a.f81533k, mVar2, 0);
                                x1 x1Var5 = p3.n.f135158a;
                                iHashCode7 = Long.hashCode(mVar2.getU());
                                i2VarX7 = mVar2.x();
                                rVarC7 = h4.k.c(aVar5, mVar2);
                                h5.g.V.getClass();
                                aVar6 = h5.g.a.f81805b;
                                if (mVar2.F() != null) {
                                    p3.p0.l();
                                    throw null;
                                }
                                mVar2.z();
                                if (mVar2.getT()) {
                                    mVar2.M(aVar6);
                                } else {
                                    mVar2.c();
                                }
                                b4.c(h5.g.a.f81810g, s2VarA4, mVar2);
                                b4.c(h5.g.a.f81809f, i2VarX7, mVar2);
                                bVar3 = h5.g.a.f81813j;
                                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode7))) {
                                    v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                                }
                                b4.c(h5.g.a.f81807d, rVarC7, mVar2);
                                u2 u2Var4 = u2.f22900a;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                g3.a(0, 0, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(mVar2, R.string.lbl_gear_retired), mVar2);
                                mVar2.y();
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            h4.r.a aVar19 = h4.r.S;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC16 = c2.l.C(aVar19, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j5 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA5 = q2.a(c0343j5, h4.d.a.f81533k, mVar2, 0);
                            iHashCode8 = Long.hashCode(mVar2.getU());
                            i2VarX8 = mVar2.x();
                            rVarC8 = h4.k.c(rVarC16, mVar2);
                            h5.g.V.getClass();
                            aVar7 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar7);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA5, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX8, mVar2);
                            bVar4 = h5.g.a.f81813j;
                            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode8))) {
                                v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                            }
                            b4.c(h5.g.a.f81807d, rVarC8, mVar2);
                            l72.f0.a aVar20 = l72.f0.a.f111000a;
                            String strQ6 = gl1.y.Q(mVar2, R.string.lbl_edit_profile);
                            s62.a.f157643a.getClass();
                            u4.d dVarA3 = b3.a(t62.b.f162798a);
                            zB = mVar2.B(fVar5) | mVar2.B(aVar13);
                            objQ = mVar2.q();
                            if (zB) {
                                objQ = new b0(fVar5, 6, aVar13, p1Var);
                                mVar2.K(objQ);
                            } else {
                                aVar11.getClass();
                                if (objQ == p3.m.a.f135155b) {
                                    objQ = new b0(fVar5, 6, aVar13, p1Var);
                                    mVar2.K(objQ);
                                }
                            }
                            p3.m mVar8 = mVar2;
                            aVar20.h(0, 12, (e23.a) objQ, null, strQ6, mVar8, dVarA3, false);
                            mVar8.y();
                            mVar8.y();
                        } else {
                            i15 = 1557709985;
                            i16 = R.string.lbl_gender_male;
                        }
                        strH = sn.a.h(mVar2, i15, i16, mVar2);
                        dVar = fVar5.f137422c;
                        if (dVar != null) {
                            str = dVar.f137417b;
                        } else {
                            str = null;
                        }
                        String strL2 = oi0.c.l(str, mVar2);
                        mVar2.C(1557726102);
                        i53.c<pe0.d> cVar3 = fVar5.f137423d;
                        arrayList = new ArrayList(p13.y.r(cVar3, 10));
                        it = cVar3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(oi0.c.l(it.next().f137417b, mVar2));
                        }
                        mVar2.f();
                        String strH3 = w5.r.h(strL2, arrayList, mVar2);
                        if (strH3 != null) {
                        }
                        if (strH.length() > 0) {
                            mVar2.C(1045056489);
                            h4.r.a aVar110 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j6 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA3 = q2.a(c0343j6, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var6 = p3.n.f135158a;
                            iHashCode6 = Long.hashCode(mVar2.getU());
                            i2VarX6 = mVar2.x();
                            rVarC6 = h4.k.c(aVar110, mVar2);
                            h5.g.V.getClass();
                            aVar4 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar4);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA3, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX6, mVar2);
                            bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                            } else {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                            u2 u2Var5 = u2.f22900a;
                            String string2 = d53.w.i0(strH + StringUtils.SPACE + str2).toString();
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(string2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar2, 0, 0, 131070);
                            mVar2 = mVar2;
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2.C(1045456265);
                            mVar2.f();
                        }
                        if (fVar5.f137427h != je0.j.RETIRED) {
                            mVar2.C(1045583241);
                            aVar8 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j7 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA6 = q2.a(c0343j7, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var7 = p3.n.f135158a;
                            iHashCode9 = Long.hashCode(mVar2.getU());
                            i2VarX9 = mVar2.x();
                            rVarC9 = h4.k.c(aVar8, mVar2);
                            h5.g.V.getClass();
                            aVar9 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            eVar2 = h5.g.a.f81810g;
                            b4.c(eVar2, s2VarA6, mVar2);
                            c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX9, mVar2);
                            bVar5 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                            } else {
                                v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                            }
                            fVar2 = h5.g.a.f81807d;
                            b4.c(fVar2, rVarC9, mVar2);
                            u2 u2Var6 = u2.f22900a;
                            d92.b.f58623a.getClass();
                            bVar6 = d92.b.f58625c;
                            bVar6.getClass();
                            eVar3 = j92.b.f97899b;
                            h4.r rVarC17 = c2.l.C(aVar8, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13);
                            kVar2 = c2.j.f22694d;
                            aVar10 = h4.d.a.f81536n;
                            zVarA3 = c2.y.a(kVar2, aVar10, mVar2, 0);
                            iHashCode10 = Long.hashCode(mVar2.getU());
                            i2VarX10 = mVar2.x();
                            rVarC10 = h4.k.c(rVarC17, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA3, mVar2);
                            b4.c(c1623g, i2VarX10, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                            } else {
                                v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                            }
                            b4.c(fVar2, rVarC10, mVar2);
                            c2.b0 b0Var3 = c2.b0.f22601a;
                            str3 = fVar5.f137426g;
                            if (str3 == null) {
                                mVar2.C(-2095477274);
                                mVar2.f();
                            } else {
                                mVar2.C(-2095477273);
                                j92.f fVar8 = d92.b.f58624b;
                                fVar8.getClass();
                                p3.m mVar9 = mVar2;
                                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar9, 0, 0, 131070);
                                String strQ7 = gl1.y.Q(mVar9, R.string.lbl_age);
                                fVar8.getClass();
                                mh.c(strQ7, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar9, 0, 0, 131070);
                                mVar2 = mVar9;
                                Unit unit3 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            bVar6.getClass();
                            float f16 = eVar3.f97919d;
                            bVar6.getClass();
                            h4.r rVarC18 = c2.l.C(aVar8, eVar3.f97922g, f16, 0.0f, 0.0f, 12);
                            zVarA4 = c2.y.a(kVar2, aVar10, mVar2, 0);
                            iHashCode11 = Long.hashCode(mVar2.getU());
                            i2VarX11 = mVar2.x();
                            rVarC11 = h4.k.c(rVarC18, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA4, mVar2);
                            b4.c(c1623g, i2VarX11, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                            } else {
                                v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                            }
                            b4.c(fVar2, rVarC11, mVar2);
                            if (z14) {
                                yVar = qs.y.UNIT_WEIGHT_KILOGRAM;
                            } else {
                                yVar = qs.y.UNIT_WEIGHT_POUND;
                            }
                            strB = ss.k.b(ls.e.PACK_WEIGHT, aVar12, new ps.h0(fVar5.f137425f, new z1(null, null, yVar.f147239a)), 1);
                            if (strB == null) {
                                mVar2.C(886753490);
                                mVar2.f();
                            } else {
                                mVar2.C(886753491);
                                j92.f fVar9 = d92.b.f58624b;
                                fVar9.getClass();
                                p3.m mVar10 = mVar2;
                                mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar10, 0, 0, 131070);
                                String strQ8 = gl1.y.Q(mVar10, R.string.lbl_weight);
                                fVar9.getClass();
                                mh.c(strQ8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar10, 0, 0, 131070);
                                mVar2 = mVar10;
                                Unit unit4 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2.C(1047136124);
                            aVar5 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j8 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA4 = q2.a(c0343j8, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var8 = p3.n.f135158a;
                            iHashCode7 = Long.hashCode(mVar2.getU());
                            i2VarX7 = mVar2.x();
                            rVarC7 = h4.k.c(aVar5, mVar2);
                            h5.g.V.getClass();
                            aVar6 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA4, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX7, mVar2);
                            bVar3 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                            } else {
                                v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC7, mVar2);
                            u2 u2Var7 = u2.f22900a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            g3.a(0, 0, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(mVar2, R.string.lbl_gear_retired), mVar2);
                            mVar2.y();
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        h4.r.a aVar111 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC19 = c2.l.C(aVar111, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j9 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2VarA5 = q2.a(c0343j9, h4.d.a.f81533k, mVar2, 0);
                        iHashCode8 = Long.hashCode(mVar2.getU());
                        i2VarX8 = mVar2.x();
                        rVarC8 = h4.k.c(rVarC19, mVar2);
                        h5.g.V.getClass();
                        aVar7 = h5.g.a.f81805b;
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA5, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX8, mVar2);
                        bVar4 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                        } else {
                            v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC8, mVar2);
                        l72.f0.a aVar21 = l72.f0.a.f111000a;
                        String strQ9 = gl1.y.Q(mVar2, R.string.lbl_edit_profile);
                        s62.a.f157643a.getClass();
                        u4.d dVarA4 = b3.a(t62.b.f162798a);
                        zB = mVar2.B(fVar5) | mVar2.B(aVar13);
                        objQ = mVar2.q();
                        if (zB) {
                            aVar11.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new b0(fVar5, 6, aVar13, p1Var);
                                mVar2.K(objQ);
                            }
                        } else {
                            objQ = new b0(fVar5, 6, aVar13, p1Var);
                            mVar2.K(objQ);
                        }
                        p3.m mVar11 = mVar2;
                        aVar21.h(0, 12, (e23.a) objQ, null, strQ9, mVar11, dVarA4, false);
                        mVar11.y();
                        mVar11.y();
                    }
                    v.h.z(iHashCode12, mVar4, iHashCode12, bVar9);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC12, mVar4);
                    c2.b0 b0Var4 = c2.b0.f22601a;
                    c0343j = c2.j.f22692b;
                    bVar = h4.d.a.f81533k;
                    s2VarA = q2.a(c0343j, bVar, mVar4, 0);
                    iHashCode = Long.hashCode(mVar4.getU());
                    i2VarX = mVar4.x();
                    rVarC = h4.k.c(aVar14, mVar4);
                    if (mVar4.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar16);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar5, s2VarA, mVar4);
                    b4.c(c1623g2, i2VarX, mVar4);
                    if (mVar4.getT()) {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar9);
                    } else {
                        v.h.z(iHashCode, mVar4, iHashCode, bVar9);
                    }
                    b4.c(fVar, rVarC, mVar4);
                    u2 u2Var8 = u2.f22900a;
                    zVarA = c2.y.a(kVar3, aVar15, mVar4, 0);
                    iHashCode2 = Long.hashCode(mVar4.getU());
                    i2VarX2 = mVar4.x();
                    rVarC2 = h4.k.c(aVar14, mVar4);
                    if (mVar4.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar4.z();
                    if (mVar4.getT()) {
                        mVar4.M(aVar16);
                    } else {
                        mVar4.c();
                    }
                    b4.c(eVar5, zVarA, mVar4);
                    b4.c(c1623g2, i2VarX2, mVar4);
                    if (mVar4.getT()) {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar9);
                    } else {
                        v.h.z(iHashCode2, mVar4, iHashCode2, bVar9);
                    }
                    b4.c(fVar, rVarC2, mVar4);
                    if (g22.n.d(fVar5.f137431l)) {
                        mVar4.C(-1088936187);
                        String str7 = fVar5.f137431l;
                        String strQ10 = gl1.y.Q(mVar4, R.string.lbl_profile_picture);
                        h4.r rVarB3 = l4.k.b(x2.q(aVar14, f14), k2.i.f102406a);
                        f5.k.f68985a.getClass();
                        aVar2 = aVar16;
                        aVar = aVar14;
                        jf.r.a(str7, strQ10, rVarB3, null, null, f5.k.a.f68987b, null, mVar4, 1572864, 1976);
                        mVar = mVar4;
                        mVar.f();
                        kVar = kVar3;
                    } else {
                        aVar = aVar14;
                        aVar2 = aVar16;
                        mVar4.C(-1088286272);
                        h4.r rVarB4 = l4.k.b(x2.q(aVar, f14), k2.i.f102406a);
                        gl.c.f77766a.getClass();
                        eVar = gl.c.f77767b;
                        kVar = kVar3;
                        h4.r rVarE2 = u1.n.e(rVarB4, eVar.f77781g, m1.f128891a);
                        z0VarD = c2.q.d(h4.d.a.f81528f, false);
                        iHashCode3 = Long.hashCode(mVar4.getU());
                        i2VarX3 = mVar4.x();
                        rVarC3 = h4.k.c(rVarE2, mVar4);
                        if (mVar4.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar4.z();
                        if (mVar4.getT()) {
                            mVar4.M(aVar2);
                        } else {
                            mVar4.c();
                        }
                        b4.c(eVar5, z0VarD, mVar4);
                        b4.c(c1623g2, i2VarX3, mVar4);
                        if (mVar4.getT()) {
                            v.h.z(iHashCode3, mVar4, iHashCode3, bVar9);
                        } else {
                            v.h.z(iHashCode3, mVar4, iHashCode3, bVar9);
                        }
                        b4.c(fVar, rVarC3, mVar4);
                        c2.u uVar2 = c2.u.f22885a;
                        t4.d dVarA5 = n5.c.a(R.drawable.ic_dog_profile_placeholder, mVar4, 0);
                        String strQ11 = gl1.y.Q(mVar4, R.string.lbl_profile_picture);
                        long j14 = eVar.f77787j;
                        g6.f.a aVar112 = g6.f.f75994b;
                        i7.a(dVarA5, strQ11, x2.q(aVar, 80), j14, mVar4, 384, 0);
                        mVar = mVar4;
                        mVar.y();
                        mVar.f();
                    }
                    mVar.y();
                    bVar8.getClass();
                    aVar3 = aVar;
                    h4.r rVarC110 = c2.l.C(aVar3, eVar4.f97919d, 0.0f, 0.0f, 0.0f, 14);
                    zVarA2 = c2.y.a(kVar, aVar15, mVar, 0);
                    iHashCode4 = Long.hashCode(mVar.getU());
                    i2VarX4 = mVar.x();
                    rVarC4 = h4.k.c(rVarC110, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar5, zVarA2, mVar);
                    b4.c(c1623g2, i2VarX4, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode4, mVar, iHashCode4, bVar9);
                    } else {
                        v.h.z(iHashCode4, mVar, iHashCode4, bVar9);
                    }
                    b4.c(fVar, rVarC4, mVar);
                    s2VarA2 = q2.a(c0343j, bVar, mVar, 0);
                    iHashCode5 = Long.hashCode(mVar.getU());
                    i2VarX5 = mVar.x();
                    rVarC5 = h4.k.c(aVar3, mVar);
                    if (mVar.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar2);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar5, s2VarA2, mVar);
                    b4.c(c1623g2, i2VarX5, mVar);
                    if (mVar.getT()) {
                        v.h.z(iHashCode5, mVar, iHashCode5, bVar9);
                    } else {
                        v.h.z(iHashCode5, mVar, iHashCode5, bVar9);
                    }
                    b4.c(fVar, rVarC5, mVar);
                    p3.m mVar12 = mVar;
                    String str8 = fVar5.f137421b;
                    d92.b.f58624b.getClass();
                    mh.c(str8, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97930g), mVar12, 0, 0, 131070);
                    mVar2 = mVar12;
                    mVar2.y();
                    gVar = fVar5.f137424e;
                    if (gVar == null) {
                        i14 = -1;
                    } else {
                        i14 = b1.a.f177174a[gVar.ordinal()];
                    }
                    if (i14 != 1) {
                        if (i14 != 2) {
                            mVar2.C(1044566501);
                            mVar2.f();
                            strH = "";
                        } else {
                            i15 = 1557713347;
                            i16 = R.string.lbl_gender_female;
                        }
                        dVar = fVar5.f137422c;
                        if (dVar != null) {
                            str = dVar.f137417b;
                        } else {
                            str = null;
                        }
                        String strL3 = oi0.c.l(str, mVar2);
                        mVar2.C(1557726102);
                        i53.c<pe0.d> cVar4 = fVar5.f137423d;
                        arrayList = new ArrayList(p13.y.r(cVar4, 10));
                        it = cVar4.iterator();
                        while (it.hasNext()) {
                            arrayList.add(oi0.c.l(it.next().f137417b, mVar2));
                        }
                        mVar2.f();
                        String strH4 = w5.r.h(strL3, arrayList, mVar2);
                        if (strH4 != null) {
                        }
                        if (strH.length() > 0) {
                            mVar2.C(1045056489);
                            h4.r.a aVar113 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j10 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA3 = q2.a(c0343j10, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var9 = p3.n.f135158a;
                            iHashCode6 = Long.hashCode(mVar2.getU());
                            i2VarX6 = mVar2.x();
                            rVarC6 = h4.k.c(aVar113, mVar2);
                            h5.g.V.getClass();
                            aVar4 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar4);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA3, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX6, mVar2);
                            bVar2 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                            } else {
                                v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                            }
                            b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                            u2 u2Var9 = u2.f22900a;
                            String string3 = d53.w.i0(strH + StringUtils.SPACE + str2).toString();
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            mh.c(string3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar2, 0, 0, 131070);
                            mVar2 = mVar2;
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2.C(1045456265);
                            mVar2.f();
                        }
                        if (fVar5.f137427h != je0.j.RETIRED) {
                            mVar2.C(1045583241);
                            aVar8 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j11 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA6 = q2.a(c0343j11, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var10 = p3.n.f135158a;
                            iHashCode9 = Long.hashCode(mVar2.getU());
                            i2VarX9 = mVar2.x();
                            rVarC9 = h4.k.c(aVar8, mVar2);
                            h5.g.V.getClass();
                            aVar9 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            eVar2 = h5.g.a.f81810g;
                            b4.c(eVar2, s2VarA6, mVar2);
                            c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX9, mVar2);
                            bVar5 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                            } else {
                                v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                            }
                            fVar2 = h5.g.a.f81807d;
                            b4.c(fVar2, rVarC9, mVar2);
                            u2 u2Var10 = u2.f22900a;
                            d92.b.f58623a.getClass();
                            bVar6 = d92.b.f58625c;
                            bVar6.getClass();
                            eVar3 = j92.b.f97899b;
                            h4.r rVarC111 = c2.l.C(aVar8, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13);
                            kVar2 = c2.j.f22694d;
                            aVar10 = h4.d.a.f81536n;
                            zVarA3 = c2.y.a(kVar2, aVar10, mVar2, 0);
                            iHashCode10 = Long.hashCode(mVar2.getU());
                            i2VarX10 = mVar2.x();
                            rVarC10 = h4.k.c(rVarC111, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA3, mVar2);
                            b4.c(c1623g, i2VarX10, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                            } else {
                                v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                            }
                            b4.c(fVar2, rVarC10, mVar2);
                            c2.b0 b0Var5 = c2.b0.f22601a;
                            str3 = fVar5.f137426g;
                            if (str3 == null) {
                                mVar2.C(-2095477274);
                                mVar2.f();
                            } else {
                                mVar2.C(-2095477273);
                                j92.f fVar10 = d92.b.f58624b;
                                fVar10.getClass();
                                p3.m mVar13 = mVar2;
                                mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar13, 0, 0, 131070);
                                String strQ12 = gl1.y.Q(mVar13, R.string.lbl_age);
                                fVar10.getClass();
                                mh.c(strQ12, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar13, 0, 0, 131070);
                                mVar2 = mVar13;
                                Unit unit5 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            bVar6.getClass();
                            float f17 = eVar3.f97919d;
                            bVar6.getClass();
                            h4.r rVarC112 = c2.l.C(aVar8, eVar3.f97922g, f17, 0.0f, 0.0f, 12);
                            zVarA4 = c2.y.a(kVar2, aVar10, mVar2, 0);
                            iHashCode11 = Long.hashCode(mVar2.getU());
                            i2VarX11 = mVar2.x();
                            rVarC11 = h4.k.c(rVarC112, mVar2);
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar9);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA4, mVar2);
                            b4.c(c1623g, i2VarX11, mVar2);
                            if (mVar2.getT()) {
                                v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                            } else {
                                v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                            }
                            b4.c(fVar2, rVarC11, mVar2);
                            if (z14) {
                                yVar = qs.y.UNIT_WEIGHT_KILOGRAM;
                            } else {
                                yVar = qs.y.UNIT_WEIGHT_POUND;
                            }
                            strB = ss.k.b(ls.e.PACK_WEIGHT, aVar12, new ps.h0(fVar5.f137425f, new z1(null, null, yVar.f147239a)), 1);
                            if (strB == null) {
                                mVar2.C(886753490);
                                mVar2.f();
                            } else {
                                mVar2.C(886753491);
                                j92.f fVar11 = d92.b.f58624b;
                                fVar11.getClass();
                                p3.m mVar14 = mVar2;
                                mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar14, 0, 0, 131070);
                                String strQ13 = gl1.y.Q(mVar14, R.string.lbl_weight);
                                fVar11.getClass();
                                mh.c(strQ13, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar14, 0, 0, 131070);
                                mVar2 = mVar14;
                                Unit unit6 = Unit.INSTANCE;
                                mVar2.f();
                            }
                            mVar2.y();
                            mVar2.y();
                            mVar2.f();
                        } else {
                            mVar2.C(1047136124);
                            aVar5 = h4.r.S;
                            c2.j.f22691a.getClass();
                            c2.j.C0343j c0343j12 = c2.j.f22692b;
                            h4.d.f81522a.getClass();
                            s2VarA4 = q2.a(c0343j12, h4.d.a.f81533k, mVar2, 0);
                            x1 x1Var11 = p3.n.f135158a;
                            iHashCode7 = Long.hashCode(mVar2.getU());
                            i2VarX7 = mVar2.x();
                            rVarC7 = h4.k.c(aVar5, mVar2);
                            h5.g.V.getClass();
                            aVar6 = h5.g.a.f81805b;
                            if (mVar2.F() != null) {
                                p3.p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            b4.c(h5.g.a.f81810g, s2VarA4, mVar2);
                            b4.c(h5.g.a.f81809f, i2VarX7, mVar2);
                            bVar3 = h5.g.a.f81813j;
                            if (mVar2.getT()) {
                                v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                            } else {
                                v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                            }
                            b4.c(h5.g.a.f81807d, rVarC7, mVar2);
                            u2 u2Var11 = u2.f22900a;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            g3.a(0, 0, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(mVar2, R.string.lbl_gear_retired), mVar2);
                            mVar2.y();
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        h4.r.a aVar114 = h4.r.S;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarC113 = c2.l.C(aVar114, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j13 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2VarA5 = q2.a(c0343j13, h4.d.a.f81533k, mVar2, 0);
                        iHashCode8 = Long.hashCode(mVar2.getU());
                        i2VarX8 = mVar2.x();
                        rVarC8 = h4.k.c(rVarC113, mVar2);
                        h5.g.V.getClass();
                        aVar7 = h5.g.a.f81805b;
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar7);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA5, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX8, mVar2);
                        bVar4 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                        } else {
                            v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC8, mVar2);
                        l72.f0.a aVar22 = l72.f0.a.f111000a;
                        String strQ14 = gl1.y.Q(mVar2, R.string.lbl_edit_profile);
                        s62.a.f157643a.getClass();
                        u4.d dVarA6 = b3.a(t62.b.f162798a);
                        zB = mVar2.B(fVar5) | mVar2.B(aVar13);
                        objQ = mVar2.q();
                        if (zB) {
                            aVar11.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new b0(fVar5, 6, aVar13, p1Var);
                                mVar2.K(objQ);
                            }
                        } else {
                            objQ = new b0(fVar5, 6, aVar13, p1Var);
                            mVar2.K(objQ);
                        }
                        p3.m mVar15 = mVar2;
                        aVar22.h(0, 12, (e23.a) objQ, null, strQ14, mVar15, dVarA6, false);
                        mVar15.y();
                        mVar15.y();
                    } else {
                        i15 = 1557709985;
                        i16 = R.string.lbl_gender_male;
                    }
                    strH = sn.a.h(mVar2, i15, i16, mVar2);
                    dVar = fVar5.f137422c;
                    if (dVar != null) {
                        str = dVar.f137417b;
                    } else {
                        str = null;
                    }
                    String strL4 = oi0.c.l(str, mVar2);
                    mVar2.C(1557726102);
                    i53.c<pe0.d> cVar5 = fVar5.f137423d;
                    arrayList = new ArrayList(p13.y.r(cVar5, 10));
                    it = cVar5.iterator();
                    while (it.hasNext()) {
                        arrayList.add(oi0.c.l(it.next().f137417b, mVar2));
                    }
                    mVar2.f();
                    String strH5 = w5.r.h(strL4, arrayList, mVar2);
                    if (strH5 != null) {
                    }
                    if (strH.length() > 0) {
                        mVar2.C(1045056489);
                        h4.r.a aVar115 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j14 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2VarA3 = q2.a(c0343j14, h4.d.a.f81533k, mVar2, 0);
                        x1 x1Var12 = p3.n.f135158a;
                        iHashCode6 = Long.hashCode(mVar2.getU());
                        i2VarX6 = mVar2.x();
                        rVarC6 = h4.k.c(aVar115, mVar2);
                        h5.g.V.getClass();
                        aVar4 = h5.g.a.f81805b;
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar4);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA3, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX6, mVar2);
                        bVar2 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                        } else {
                            v.h.z(iHashCode6, mVar2, iHashCode6, bVar2);
                        }
                        b4.c(h5.g.a.f81807d, rVarC6, mVar2);
                        u2 u2Var12 = u2.f22900a;
                        String string4 = d53.w.i0(strH + StringUtils.SPACE + str2).toString();
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(string4, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar2, 0, 0, 131070);
                        mVar2 = mVar2;
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(1045456265);
                        mVar2.f();
                    }
                    if (fVar5.f137427h != je0.j.RETIRED) {
                        mVar2.C(1045583241);
                        aVar8 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j15 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2VarA6 = q2.a(c0343j15, h4.d.a.f81533k, mVar2, 0);
                        x1 x1Var13 = p3.n.f135158a;
                        iHashCode9 = Long.hashCode(mVar2.getU());
                        i2VarX9 = mVar2.x();
                        rVarC9 = h4.k.c(aVar8, mVar2);
                        h5.g.V.getClass();
                        aVar9 = h5.g.a.f81805b;
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        eVar2 = h5.g.a.f81810g;
                        b4.c(eVar2, s2VarA6, mVar2);
                        c1623g = h5.g.a.f81809f;
                        b4.c(c1623g, i2VarX9, mVar2);
                        bVar5 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                        } else {
                            v.h.z(iHashCode9, mVar2, iHashCode9, bVar5);
                        }
                        fVar2 = h5.g.a.f81807d;
                        b4.c(fVar2, rVarC9, mVar2);
                        u2 u2Var13 = u2.f22900a;
                        d92.b.f58623a.getClass();
                        bVar6 = d92.b.f58625c;
                        bVar6.getClass();
                        eVar3 = j92.b.f97899b;
                        h4.r rVarC114 = c2.l.C(aVar8, 0.0f, eVar3.f97919d, 0.0f, 0.0f, 13);
                        kVar2 = c2.j.f22694d;
                        aVar10 = h4.d.a.f81536n;
                        zVarA3 = c2.y.a(kVar2, aVar10, mVar2, 0);
                        iHashCode10 = Long.hashCode(mVar2.getU());
                        i2VarX10 = mVar2.x();
                        rVarC10 = h4.k.c(rVarC114, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA3, mVar2);
                        b4.c(c1623g, i2VarX10, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                        } else {
                            v.h.z(iHashCode10, mVar2, iHashCode10, bVar5);
                        }
                        b4.c(fVar2, rVarC10, mVar2);
                        c2.b0 b0Var6 = c2.b0.f22601a;
                        str3 = fVar5.f137426g;
                        if (str3 == null) {
                            mVar2.C(-2095477274);
                            mVar2.f();
                        } else {
                            mVar2.C(-2095477273);
                            j92.f fVar12 = d92.b.f58624b;
                            fVar12.getClass();
                            p3.m mVar16 = mVar2;
                            mh.c(str3, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar16, 0, 0, 131070);
                            String strQ15 = gl1.y.Q(mVar16, R.string.lbl_age);
                            fVar12.getClass();
                            mh.c(strQ15, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar16, 0, 0, 131070);
                            mVar2 = mVar16;
                            Unit unit7 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        mVar2.y();
                        bVar6.getClass();
                        float f18 = eVar3.f97919d;
                        bVar6.getClass();
                        h4.r rVarC115 = c2.l.C(aVar8, eVar3.f97922g, f18, 0.0f, 0.0f, 12);
                        zVarA4 = c2.y.a(kVar2, aVar10, mVar2, 0);
                        iHashCode11 = Long.hashCode(mVar2.getU());
                        i2VarX11 = mVar2.x();
                        rVarC11 = h4.k.c(rVarC115, mVar2);
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar9);
                        } else {
                            mVar2.c();
                        }
                        b4.c(eVar2, zVarA4, mVar2);
                        b4.c(c1623g, i2VarX11, mVar2);
                        if (mVar2.getT()) {
                            v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                        } else {
                            v.h.z(iHashCode11, mVar2, iHashCode11, bVar5);
                        }
                        b4.c(fVar2, rVarC11, mVar2);
                        if (z14) {
                            yVar = qs.y.UNIT_WEIGHT_KILOGRAM;
                        } else {
                            yVar = qs.y.UNIT_WEIGHT_POUND;
                        }
                        strB = ss.k.b(ls.e.PACK_WEIGHT, aVar12, new ps.h0(fVar5.f137425f, new z1(null, null, yVar.f147239a)), 1);
                        if (strB == null) {
                            mVar2.C(886753490);
                            mVar2.f();
                        } else {
                            mVar2.C(886753491);
                            j92.f fVar13 = d92.b.f58624b;
                            fVar13.getClass();
                            p3.m mVar17 = mVar2;
                            mh.c(strB, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.e(j92.f.f97932i), mVar17, 0, 0, 131070);
                            String strQ16 = gl1.y.Q(mVar17, R.string.lbl_weight);
                            fVar13.getClass();
                            mh.c(strQ16, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar17, 0, 0, 131070);
                            mVar2 = mVar17;
                            Unit unit8 = Unit.INSTANCE;
                            mVar2.f();
                        }
                        mVar2.y();
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2.C(1047136124);
                        aVar5 = h4.r.S;
                        c2.j.f22691a.getClass();
                        c2.j.C0343j c0343j16 = c2.j.f22692b;
                        h4.d.f81522a.getClass();
                        s2VarA4 = q2.a(c0343j16, h4.d.a.f81533k, mVar2, 0);
                        x1 x1Var14 = p3.n.f135158a;
                        iHashCode7 = Long.hashCode(mVar2.getU());
                        i2VarX7 = mVar2.x();
                        rVarC7 = h4.k.c(aVar5, mVar2);
                        h5.g.V.getClass();
                        aVar6 = h5.g.a.f81805b;
                        if (mVar2.F() != null) {
                            p3.p0.l();
                            throw null;
                        }
                        mVar2.z();
                        if (mVar2.getT()) {
                            mVar2.M(aVar6);
                        } else {
                            mVar2.c();
                        }
                        b4.c(h5.g.a.f81810g, s2VarA4, mVar2);
                        b4.c(h5.g.a.f81809f, i2VarX7, mVar2);
                        bVar3 = h5.g.a.f81813j;
                        if (mVar2.getT()) {
                            v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                        } else {
                            v.h.z(iHashCode7, mVar2, iHashCode7, bVar3);
                        }
                        b4.c(h5.g.a.f81807d, rVarC7, mVar2);
                        u2 u2Var14 = u2.f22900a;
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        g3.a(0, 0, c2.l.C(aVar5, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13), gl1.y.Q(mVar2, R.string.lbl_gear_retired), mVar2);
                        mVar2.y();
                        mVar2.f();
                    }
                    mVar2.y();
                    mVar2.y();
                    h4.r.a aVar116 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC116 = c2.l.C(aVar116, 0.0f, j92.b.f97899b.f97918c, 0.0f, 0.0f, 13);
                    c2.j.f22691a.getClass();
                    c2.j.C0343j c0343j17 = c2.j.f22692b;
                    h4.d.f81522a.getClass();
                    s2VarA5 = q2.a(c0343j17, h4.d.a.f81533k, mVar2, 0);
                    iHashCode8 = Long.hashCode(mVar2.getU());
                    i2VarX8 = mVar2.x();
                    rVarC8 = h4.k.c(rVarC116, mVar2);
                    h5.g.V.getClass();
                    aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() != null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA5, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX8, mVar2);
                    bVar4 = h5.g.a.f81813j;
                    if (mVar2.getT()) {
                        v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                    } else {
                        v.h.z(iHashCode8, mVar2, iHashCode8, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC8, mVar2);
                    l72.f0.a aVar23 = l72.f0.a.f111000a;
                    String strQ17 = gl1.y.Q(mVar2, R.string.lbl_edit_profile);
                    s62.a.f157643a.getClass();
                    u4.d dVarA7 = b3.a(t62.b.f162798a);
                    zB = mVar2.B(fVar5) | mVar2.B(aVar13);
                    objQ = mVar2.q();
                    if (zB) {
                        aVar11.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b0(fVar5, 6, aVar13, p1Var);
                            mVar2.K(objQ);
                        }
                    } else {
                        objQ = new b0(fVar5, 6, aVar13, p1Var);
                        mVar2.K(objQ);
                    }
                    p3.m mVar18 = mVar2;
                    aVar23.h(0, 12, (e23.a) objQ, null, strQ17, mVar18, dVarA7, false);
                    mVar18.y();
                    mVar18.y();
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.a aVar24 = (e23.a) obj6;
                e23.l lVar = (e23.l) obj5;
                p1 p1Var4 = (p1) obj3;
                e23.a aVar25 = (e23.a) obj4;
                p3.m mVar19 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar19.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    if (((qr1.c) p1Var4.getF182175a()).f146898c) {
                        mVar19.C(-1078048593);
                        String strQ18 = gl1.y.Q(mVar19, R.string.title_stress);
                        if (z14) {
                            mVar19.C(-1077854874);
                            i53.f fVarA = i53.a.a(new i3("HELP", gl1.y.Q(mVar19, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new i3("REMINDER", gl1.y.Q(mVar19, R.string.device_settings_relax_reminders), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar19.f();
                            fVar3 = fVarA;
                        } else {
                            mVar19.C(-1077497258);
                            mVar19.f();
                            fVar3 = null;
                        }
                        if (z14) {
                            mVar19.C(-1077271827);
                            mVar19.f();
                            fVar4 = null;
                        } else {
                            mVar19.C(103793301);
                            i53.f fVarA2 = i53.a.a(new i3("HELP", gl1.y.Q(mVar19, R.string.lbl_help), false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
                            mVar19.f();
                            fVar4 = fVarA2;
                        }
                        boolean zB2 = mVar19.B(aVar24);
                        Object objQ3 = mVar19.q();
                        if (zB2) {
                            objQ3 = new ux1.g(aVar24, 20);
                            mVar19.K(objQ3);
                        } else {
                            aVar11.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new ux1.g(aVar24, 20);
                                mVar19.K(objQ3);
                            }
                        }
                        e23.a aVar26 = (e23.a) objQ3;
                        boolean zB3 = mVar19.B(lVar) | mVar19.B(p1Var4) | mVar19.B(aVar25);
                        Object objQ4 = mVar19.q();
                        if (zB3) {
                            objQ4 = new dj0.k(lVar, aVar25, p1Var4);
                            mVar19.K(objQ4);
                        } else {
                            aVar11.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new dj0.k(lVar, aVar25, p1Var4);
                                mVar19.K(objQ4);
                            }
                        }
                        z02.f.d(strQ18, null, null, aVar26, fVar4, fVar3, (e23.l) objQ4, mVar19, 2359296, 22);
                        mVar19.f();
                    } else {
                        mVar19.C(-1076801742);
                        mVar19.f();
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 5:
                vy0.a0 a0Var = (vy0.a0) obj6;
                ty0.b bVar10 = (ty0.b) obj5;
                e23.a aVar27 = (e23.a) obj4;
                p1 p1Var5 = (p1) obj3;
                p3.m mVar20 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar20.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    boolean z15 = ((vy0.x) p1Var5.getF182175a()).f180776a.f180719a;
                    String str9 = ((vy0.x) p1Var5.getF182175a()).f180776a.f180720b;
                    boolean zR2 = mVar20.r(a0Var);
                    Object objQ5 = mVar20.q();
                    if (zR2) {
                        objQ5 = new vy0.k.b(a0Var);
                        mVar20.K(objQ5);
                    } else {
                        aVar11.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            objQ5 = new vy0.k.b(a0Var);
                            mVar20.K(objQ5);
                        }
                    }
                    k23.g gVar2 = (k23.g) objQ5;
                    boolean zR3 = mVar20.r(a0Var);
                    Object objQ6 = mVar20.q();
                    if (zR3) {
                        objQ6 = new vy0.k.c(a0Var);
                        mVar20.K(objQ6);
                    } else {
                        aVar11.getClass();
                        if (objQ6 == p3.m.a.f135155b) {
                            objQ6 = new vy0.k.c(a0Var);
                            mVar20.K(objQ6);
                        }
                    }
                    vy0.v.a(str9, this.f170906b, z15, bVar10, (e23.l) ((k23.g) objQ6), (e23.l) gVar2, aVar27, mVar20, 0);
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 6:
                p005kotlin.jvm.internal.q0 q0Var = (p005kotlin.jvm.internal.q0) obj6;
                w2.n nVar = (w2.n) obj5;
                l1 l1Var = (l1) obj4;
                p005kotlin.jvm.internal.q0 q0Var2 = (p005kotlin.jvm.internal.q0) obj3;
                q0Var.f105808a = n4.c.j(q0Var.f105808a, ((n4.c) obj2).f123544a);
                g2 g2Var = nVar.f181366b;
                h2 h2Var = nVar.f181365a;
                s5.q0 q0VarC = g2Var.c();
                if (q0VarC == null) {
                    return Unit.INSTANCE;
                }
                s5.o oVar = q0VarC.f157281b;
                nVar.G(l1Var, n4.c.j(q0Var2.f105808a, q0Var.f105808a));
                boolean z16 = this.f170906b;
                if (z16) {
                    iG = oVar.g(nVar.s());
                } else {
                    long j15 = h2Var.d().f167840d;
                    s5.w0.a aVar28 = s5.w0.f157315b;
                    iG = (int) (j15 >> 32);
                }
                int i19 = iG;
                if (z16) {
                    long j16 = h2Var.d().f167840d;
                    s5.w0.a aVar29 = s5.w0.f157315b;
                    iG2 = (int) (j16 & 4294967295L);
                } else {
                    iG2 = oVar.g(nVar.s());
                }
                int i24 = iG2;
                long j17 = h2Var.d().f167840d;
                u2.e eVarD = h2Var.d();
                z2.d0.f201550a.getClass();
                long jH = nVar.H(eVarD, i19, i24, z16, z2.d0.a.f201556f, false, false);
                if (s5.w0.e(j17) || !s5.w0.e(jH)) {
                    h2Var.j(jH);
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                wi2.b.c(this.f170906b, (wi2.e) obj6, (h4.r) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                wx1.v.a((String) obj6, this.f170906b, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                x91.c.b((aa1.c) obj6, this.f170906b, (e23.l) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 10:
                wg0.a aVar30 = (wg0.a) obj6;
                xg0.m mVar21 = (xg0.m) obj5;
                wg0.l lVar2 = (wg0.l) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                p3.m mVar22 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                int i25 = xg0.m.I0;
                if (mVar22.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    Object objF = aVar30.f();
                    if (objF == null) {
                        objF = Integer.valueOf(mVar21.getLayoutPosition());
                    }
                    mVar22.N(1205436011, objF);
                    int i26 = lVar2.f185106e;
                    boolean zR4 = mVar22.r(arrayList2);
                    Object objQ7 = mVar22.q();
                    if (zR4) {
                        objQ7 = new d62.n(7, arrayList2);
                        mVar22.K(objQ7);
                    } else {
                        aVar11.getClass();
                        if (objQ7 == p3.m.a.f135155b) {
                            objQ7 = new d62.n(7, arrayList2);
                            mVar22.K(objQ7);
                        }
                    }
                    z02.b.a(false, null, null, null, false, z3.f.c(-1290230166, new p(mVar21, h2.o0.b(i26, (e23.a) objQ7, mVar22, 0, 2), aVar30, this.f170906b, lVar2, 11), mVar22), mVar22, 196608, 31);
                    mVar22.Q();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            case 11:
                xg0.m mVar23 = (xg0.m) obj6;
                h2.j0 j0Var = (h2.j0) obj5;
                wg0.a aVar31 = (wg0.a) obj4;
                wg0.l lVar3 = (wg0.l) obj3;
                p3.m mVar24 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                int i27 = xg0.m.I0;
                if (mVar24.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    Context context = mVar23.itemView.getContext();
                    context.getClass();
                    xg0.i0 i0Var = new xg0.i0(context);
                    xg0.n nVar2 = mVar23.f190790b;
                    boolean zR5 = mVar24.r(lVar3);
                    Object objQ8 = mVar24.q();
                    if (zR5) {
                        objQ8 = new xa2.g(lVar3, 4);
                        mVar24.K(objQ8);
                    } else {
                        aVar11.getClass();
                        if (objQ8 == p3.m.a.f135155b) {
                            objQ8 = new xa2.g(lVar3, 4);
                            mVar24.K(objQ8);
                        }
                    }
                    xg0.f0.a(null, j0Var, nVar2, aVar31, this.f170906b, i0Var, null, (e23.l) objQ8, mVar24, 1572864, 1);
                } else {
                    mVar24.e();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                xo0.b.c((wo0.a) obj6, this.f170906b, (String) obj5, (String) obj4, (String) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                TimingGatesActivity.a aVar32 = TimingGatesActivity.f29952c;
                ((TimingGatesActivity) obj6).ga((ArrayList) obj5, this.f170906b, (HashMap) obj4, (zq.b) obj3, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 14:
                return a(obj, obj2);
            case 15:
                return b(obj, obj2);
            case 16:
                return c(obj, obj2);
            case 17:
                return d(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                za0.u.a((za0.i) obj6, this.f170906b, (e23.l) obj5, (a4.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(int i14, int i15, e23.l lVar, Object obj, Object obj2, Object obj3, boolean z14) {
        this.f170905a = i15;
        this.f170906b = z14;
        this.f170907c = obj;
        this.f170908d = obj2;
        this.f170909e = obj3;
        this.f170910f = lVar;
    }

    public /* synthetic */ p(TimingGatesActivity timingGatesActivity, ArrayList arrayList, boolean z14, HashMap map, zq.b bVar, int i14) {
        this.f170905a = 13;
        this.f170907c = timingGatesActivity;
        this.f170908d = arrayList;
        this.f170906b = z14;
        this.f170909e = map;
        this.f170910f = bVar;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Serializable serializable, boolean z14, int i14) {
        this.f170905a = i14;
        this.f170907c = obj;
        this.f170908d = obj2;
        this.f170909e = obj3;
        this.f170910f = serializable;
        this.f170906b = z14;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, Object obj4, boolean z14, int i14, int i15) {
        this.f170905a = i15;
        this.f170907c = obj;
        this.f170906b = z14;
        this.f170908d = obj2;
        this.f170909e = obj3;
        this.f170910f = obj4;
    }

    public /* synthetic */ p(Object obj, Object obj2, Object obj3, boolean z14, Object obj4, int i14) {
        this.f170905a = i14;
        this.f170907c = obj;
        this.f170908d = obj2;
        this.f170909e = obj3;
        this.f170906b = z14;
        this.f170910f = obj4;
    }

    public /* synthetic */ p(Object obj, boolean z14, Object obj2, Object obj3, Object obj4, int i14) {
        this.f170905a = i14;
        this.f170907c = obj;
        this.f170906b = z14;
        this.f170908d = obj2;
        this.f170909e = obj3;
        this.f170910f = obj4;
    }

    public /* synthetic */ p(String str, boolean z14, e23.l lVar, p1 p1Var, p1 p1Var2) {
        this.f170905a = 16;
        this.f170907c = str;
        this.f170906b = z14;
        this.f170908d = lVar;
        this.f170910f = p1Var;
        this.f170909e = p1Var2;
    }

    public /* synthetic */ p(boolean z14, e23.a aVar, e23.l lVar, p1 p1Var, e23.a aVar2) {
        this.f170905a = 4;
        this.f170906b = z14;
        this.f170907c = aVar;
        this.f170908d = lVar;
        this.f170910f = p1Var;
        this.f170909e = aVar2;
    }
}
