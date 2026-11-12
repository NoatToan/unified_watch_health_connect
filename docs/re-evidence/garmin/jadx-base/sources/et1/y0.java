package et1;

import c2.s2;
import c2.u2;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.e5;
import i3.i7;
import i3.mh;
import java.util.Iterator;
import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
public final class y0 {
    /* JADX WARN: Code duplicated, block: B:102:0x0222  */
    /* JADX WARN: Code duplicated, block: B:106:0x0234  */
    /* JADX WARN: Code duplicated, block: B:109:0x0294  */
    /* JADX WARN: Code duplicated, block: B:112:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:114:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:116:0x02de  */
    /* JADX WARN: Code duplicated, block: B:117:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:120:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:124:0x0301  */
    /* JADX WARN: Code duplicated, block: B:127:0x035d  */
    /* JADX WARN: Code duplicated, block: B:128:0x035f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0366  */
    /* JADX WARN: Code duplicated, block: B:132:0x0368  */
    /* JADX WARN: Code duplicated, block: B:135:0x0370  */
    /* JADX WARN: Code duplicated, block: B:138:0x0378  */
    /* JADX WARN: Code duplicated, block: B:139:0x037b  */
    /* JADX WARN: Code duplicated, block: B:142:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:145:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:152:0x03db  */
    /* JADX WARN: Code duplicated, block: B:154:0x0479  */
    /* JADX WARN: Code duplicated, block: B:156:0x047d  */
    /* JADX WARN: Code duplicated, block: B:158:0x0481  */
    /* JADX WARN: Code duplicated, block: B:161:0x049a  */
    /* JADX WARN: Code duplicated, block: B:164:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:167:0x0501  */
    /* JADX WARN: Code duplicated, block: B:168:0x0503  */
    /* JADX WARN: Code duplicated, block: B:171:0x050a  */
    /* JADX WARN: Code duplicated, block: B:174:0x0512  */
    /* JADX WARN: Code duplicated, block: B:175:0x0517  */
    /* JADX WARN: Code duplicated, block: B:178:0x0536  */
    /* JADX WARN: Code duplicated, block: B:180:0x053c  */
    /* JADX WARN: Code duplicated, block: B:185:0x0580  */
    /* JADX WARN: Code duplicated, block: B:187:0x0586  */
    /* JADX WARN: Code duplicated, block: B:192:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:193:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:196:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:197:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:200:0x05df  */
    /* JADX WARN: Code duplicated, block: B:201:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05e8  */
    /* JADX WARN: Code duplicated, block: B:205:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:208:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:211:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:212:0x0601  */
    /* JADX WARN: Code duplicated, block: B:215:0x0621  */
    /* JADX WARN: Code duplicated, block: B:217:0x0627  */
    /* JADX WARN: Code duplicated, block: B:230:0x06da  */
    /* JADX WARN: Code duplicated, block: B:235:0x0725  */
    /* JADX WARN: Code duplicated, block: B:237:0x072b  */
    /* JADX WARN: Code duplicated, block: B:239:0x072f  */
    /* JADX WARN: Code duplicated, block: B:240:0x0731  */
    /* JADX WARN: Code duplicated, block: B:243:0x0735  */
    /* JADX WARN: Code duplicated, block: B:244:0x0737  */
    /* JADX WARN: Code duplicated, block: B:247:0x073b  */
    /* JADX WARN: Code duplicated, block: B:248:0x073d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0745  */
    /* JADX WARN: Code duplicated, block: B:254:0x074d  */
    /* JADX WARN: Code duplicated, block: B:255:0x0750  */
    /* JADX WARN: Code duplicated, block: B:258:0x0766  */
    /* JADX WARN: Code duplicated, block: B:259:0x0768  */
    /* JADX WARN: Code duplicated, block: B:262:0x076f  */
    /* JADX WARN: Code duplicated, block: B:264:0x0776  */
    /* JADX WARN: Code duplicated, block: B:266:0x078d  */
    /* JADX WARN: Code duplicated, block: B:268:0x0791  */
    /* JADX WARN: Code duplicated, block: B:271:0x079b  */
    /* JADX WARN: Code duplicated, block: B:274:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0197  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:99:0x0211  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v37, types: [l72.f0] */
    /* JADX WARN: Type inference failed for: r1v65 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r23v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r35v0, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r35v1, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r6v1, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r6v5, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r6v6, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
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
    public static final void a(final zc.d dVar, final int i14, final pt1.o oVar, final e23.l lVar, final pt1.s sVar, final e23.a aVar, final pt1.p pVar, e23.l lVar2, final e23.a aVar2, final e23.a aVar3, final e23.l lVar3, final e23.l lVar4, final e23.q qVar, final e23.p pVar2, final e23.l lVar5, final e23.l lVar6, final e23.l lVar7, final e23.l lVar8, final e23.l lVar9, final e23.l lVar10, final e23.a aVar4, p3.m mVar, final int i15) {
        boolean z14;
        e23.l lVar11;
        ?? r14;
        p3.p2 p2VarI0;
        j92.b bVar;
        j92.e eVar;
        h4.r.a aVar5;
        o4.m1.a aVar6;
        h4.g.a aVar7;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar8;
        h5.g.a.e eVar2;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar2;
        h5.g.a.C1623g c1623g2;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        h5.g.a.b bVar3;
        j92.e eVar3;
        h4.r.a aVar9;
        ?? r15;
        ?? r16;
        p3.m.a aVar10;
        pt1.p pVar3;
        j92.e eVar4;
        float f14;
        o4.m1.a aVar11;
        int i16;
        int i17;
        i53.c<us1.i> cVar;
        int i18;
        int i19;
        Object objQ;
        Object obj;
        ?? r17;
        i53.c<o20.a> cVar2;
        i53.c<o20.a> cVar3;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i34;
        Object objQ2;
        pt1.p pVar4;
        i53.c<pt1.x> cVar4;
        int i35;
        int i36;
        int i37;
        ?? r18;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objQ3;
        boolean z24;
        Object objQ4;
        Object obj2;
        Object obj3;
        c2.z zVarA2;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        j92.e eVar5;
        ?? r19;
        ?? r24;
        int i38;
        Object objQ5;
        Object obj4;
        s2 s2VarA;
        int iHashCode3;
        p3.i2 i2VarA2;
        h4.r rVarC3;
        oVar.getClass();
        lVar.getClass();
        aVar.getClass();
        pVar.getClass();
        lVar2.getClass();
        aVar2.getClass();
        aVar3.getClass();
        lVar3.getClass();
        lVar4.getClass();
        qVar.getClass();
        pVar2.getClass();
        lVar5.getClass();
        lVar6.getClass();
        lVar7.getClass();
        lVar8.getClass();
        lVar9.getClass();
        lVar10.getClass();
        aVar4.getClass();
        p3.o0 o0VarE = mVar.E(425568576);
        p3.c<?> cVar5 = o0VarE.f135177b;
        int i39 = i15 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.B(oVar) ? 256 : 128) | (o0VarE.r(lVar) ? 2048 : 1024) | (o0VarE.B(sVar) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536) | (o0VarE.B(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar2) ? 8388608 : 4194304) | (o0VarE.r(aVar2) ? 67108864 : 33554432) | (o0VarE.r(aVar3) ? 536870912 : 268435456);
        int i44 = (o0VarE.r(lVar3) ? 4 : 2) | (o0VarE.r(lVar4) ? 32 : 16) | (o0VarE.r(qVar) ? 256 : 128) | (o0VarE.r(pVar2) ? 2048 : 1024) | (o0VarE.r(lVar5) ? 16384 : 8192) | (o0VarE.r(lVar6) ? 131072 : 65536) | (o0VarE.r(lVar7) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar8) ? 8388608 : 4194304) | (o0VarE.r(lVar9) ? 67108864 : 33554432) | (o0VarE.r(lVar10) ? 536870912 : 268435456);
        char c14 = o0VarE.r(aVar4) ? (char) 4 : (char) 2;
        if ((i39 & 306783379) == 306783378 && (i44 & 306783379) == 306783378) {
            if ((c14 & 3) == 2) {
                z14 = false;
            }
            if (o0VarE.n(i39 & 1, z14)) {
                p3.x1 x1Var = p3.n.f135158a;
                c2.j jVar = c2.j.f22691a;
                d92.b.f58623a.getClass();
                bVar = d92.b.f58625c;
                bVar.getClass();
                eVar = j92.b.f97899b;
                float f15 = eVar.f97918c;
                jVar.getClass();
                c2.j.i iVarI = c2.j.i(f15);
                aVar5 = h4.r.S;
                long jB = d92.b.a(o0VarE).c().b();
                aVar6 = o4.m1.f128891a;
                h4.r rVarE = u1.n.e(aVar5, jB, aVar6);
                h4.d.f81522a.getClass();
                aVar7 = h4.d.a.f81536n;
                zVarA = c2.y.a(iVarI, aVar7, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVarE, o0VarE);
                h5.g.V.getClass();
                aVar8 = h5.g.a.f81805b;
                if (cVar5 != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar8);
                } else {
                    o0VarE.c();
                }
                eVar2 = h5.g.a.f81810g;
                b4.c(eVar2, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar2 = h5.g.a.f81813j;
                if (o0VarE.T) {
                    c1623g2 = c1623g;
                } else {
                    c1623g2 = c1623g;
                    if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0Var = c2.b0.f22601a;
                    if (dVar != null || oVar.f140913k <= 0) {
                        bVar3 = bVar2;
                        eVar3 = eVar;
                        aVar9 = aVar5;
                        r15 = 0;
                        o0VarE.C(1314174028);
                        o0VarE.g0(false);
                        r16 = o0VarE;
                    } else {
                        o0VarE.C(1313760798);
                        bVar.getClass();
                        int i45 = i39 << 3;
                        bVar3 = bVar2;
                        aVar9 = aVar5;
                        eVar3 = eVar;
                        r15 = 0;
                        ct1.l.a(c2.l.C(aVar5, 0.0f, eVar.f97918c, 0.0f, 0.0f, 13), dVar, i14, oVar.f140913k, 0.0f, lVar, lVar4, o0VarE, 64 | (i45 & 112) | (i45 & 896) | ((i39 << 6) & 458752) | ((i44 << 15) & 3670016));
                        p3.o0 o0Var = o0VarE;
                        o0Var.g0(false);
                        r16 = o0Var;
                    }
                    aVar10 = p3.m.f135153a;
                    if (sVar != null) {
                        r16.C(1314269291);
                        h4.r rVarF = x2.f(aVar9, 1.0f);
                        zVarA2 = c2.y.a(c2.j.f22694d, r30, r16, r15);
                        iHashCode2 = Long.hashCode(r16.U);
                        i2VarA1 = r16.a0();
                        rVarC2 = h4.k.c(rVarF, r16);
                        if (cVar5 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        r16.z();
                        if (r16.T) {
                            r16.M(aVar8);
                        } else {
                            r16.c();
                        }
                        b4.c(r31, zVarA2, r16);
                        b4.c(c1623g2, i2VarA1, r16);
                        if (r16.T || !p005kotlin.jvm.internal.s.g(r16.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                        }
                        b4.c(fVar, rVarC2, r16);
                        pVar3 = pVar;
                        i17 = 1879048192;
                        dt1.g.a(pVar.f140951w, i53.a.a(sVar.f140964a), sVar.f140965b, sVar.f140966c, aVar, r16, (i39 >> 3) & 57344);
                        h4.r rVarE2 = u1.n.e(x2.f(aVar9, 1.0f), d92.b.a(r16).c().e(), aVar6);
                        bVar.getClass();
                        eVar5 = eVar3;
                        h4.r rVarB = b0Var.b(c2.l.y(rVarE2, eVar5.f97920e), aVar7);
                        if ((i39 & 3670016) == 1048576) {
                            r19 = 1;
                        } else {
                            r19 = r15;
                        }
                        if ((i39 & 1879048192) == 536870912) {
                            r24 = 1;
                        } else {
                            r24 = r15;
                        }
                        i38 = r19 | r24;
                        objQ5 = r16.q();
                        if (i38 == 0) {
                            aVar10.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                dl0.g gVar = new dl0.g(17, pVar3, aVar3);
                                r16.K(gVar);
                                obj4 = gVar;
                            } else {
                                obj4 = objQ5;
                            }
                        } else {
                            dl0.g gVar2 = new dl0.g(17, pVar3, aVar3);
                            r16.K(gVar2);
                            obj4 = gVar2;
                        }
                        h4.r rVarD = u1.w.d(rVarB, false, null, null, (e23.a) obj4, 15);
                        s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, r16, r15);
                        iHashCode3 = Long.hashCode(r16.getU());
                        i2VarA2 = r16.a0();
                        rVarC3 = h4.k.c(rVarD, r16);
                        if (cVar5 != null) {
                            p3.p0.l();
                            throw null;
                        }
                        r16.z();
                        if (r16.T) {
                            r16.M(aVar8);
                        } else {
                            r16.c();
                        }
                        b4.c(eVar2, s2VarA, r16);
                        b4.c(c1623g2, i2VarA2, r16);
                        if (r16.T || !p005kotlin.jvm.internal.s.g(r16.q(), Integer.valueOf(iHashCode3))) {
                            v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                        }
                        b4.c(fVar, rVarC3, r16);
                        u2 u2Var = u2.f22900a;
                        g6.f.a aVar12 = g6.f.f75994b;
                        h4.r rVarQ = x2.q(aVar9, 36);
                        bVar.getClass();
                        h4.r rVarY = c2.l.y(rVarQ, eVar5.f97918c);
                        h4.g.b bVar4 = h4.d.a.f81534l;
                        b0Var = b0Var;
                        aVar11 = aVar6;
                        eVar4 = eVar5;
                        f14 = 1.0f;
                        i7.a(n5.c.a(R.drawable.pin, r16, 0), null, u2Var.c(rVarY, bVar4), hb.a.s(r16), r16, 48, 0);
                        String strQ = gl1.y.Q(r16, R.string.lbl_driving_directions);
                        bVar.getClass();
                        h4.r rVarC4 = u2Var.c(c2.l.y(aVar9, eVar4.f97918c), bVar4);
                        d92.b.f58624b.getClass();
                        mh.c(strQ, rVarC4, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97936m, com.nimbusds.jose.shaded.gson.internal.a.d(r16), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), r16, 0, 0, 131068);
                        i16 = 1;
                        e5.u(r16, true, true, false);
                    } else {
                        pVar3 = pVar;
                        eVar4 = eVar3;
                        f14 = 1.0f;
                        aVar11 = aVar6;
                        i16 = 1;
                        i17 = 1879048192;
                        r16.C(1316115372);
                        r16.g0(r15);
                    }
                    cVar = pVar3.f140932d;
                    if (cVar == null && ((cVar.isEmpty() ? 1 : 0) ^ i16) == i16) {
                        r16.C(1316189028);
                        i53.c<us1.i> cVar6 = pVar3.f140932d;
                        h4.r rVarE3 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r16).c().e(), aVar11);
                        bVar.getClass();
                        gt1.p.a(0, c2.l.y(rVarE3, eVar4.f97920e), cVar6, r16);
                        r16.g0(false);
                    } else {
                        r16.C(1316504236);
                        r16.g0(false);
                    }
                    String str = pVar3.f140938j;
                    String str2 = pVar3.f140939k;
                    h4.r rVarE4 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r16).c().e(), aVar11);
                    bVar.getClass();
                    h4.r rVarY2 = c2.l.y(rVarE4, eVar4.f97920e);
                    i18 = i39 & 29360128;
                    if (i18 == 8388608) {
                        i19 = i16;
                    } else {
                        i19 = 0;
                    }
                    objQ = r16.q();
                    if (i19 == 0) {
                        aVar10.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            e40.g gVar3 = new e40.g(lVar2, 15);
                            r16.K(gVar3);
                            obj = gVar3;
                        } else {
                            obj = objQ;
                        }
                    } else {
                        e40.g gVar4 = new e40.g(lVar2, 15);
                        r16.K(gVar4);
                        obj = gVar4;
                    }
                    ?? r35 = r16;
                    gt1.e.a(str, str2, rVarY2, (e23.a) obj, r35, 0);
                    r17 = r35;
                    cVar2 = pVar3.f140934f;
                    if (cVar2 != null || cVar2.isEmpty()) {
                        r17.C(1317498220);
                        r17.g0(false);
                    } else {
                        r17.C(1317109666);
                        h4.r rVarE5 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r17).c().b(), aVar11);
                        bVar.getClass();
                        it1.b.a(pVar3.f140934f, c2.l.A(rVarE5, 0.0f, eVar4.f97920e, i16), aVar2, r17, (i39 >> 18) & 896);
                        r17.g0(false);
                    }
                    cVar3 = pVar3.f140936h;
                    if (cVar3 != null || cVar3.isEmpty()) {
                        r17.C(1317910892);
                        r17.g0(false);
                    } else {
                        r17.C(1317586725);
                        h4.r rVarE6 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r17).c().b(), aVar11);
                        bVar.getClass();
                        it1.a.b(pVar3, c2.l.A(rVarE6, 0.0f, eVar4.f97920e, i16), r17, (i39 >> 18) & 14);
                        r17.g0(false);
                    }
                    h4.r rVarF2 = x2.f(aVar9, f14);
                    i24 = i39 & 3670016;
                    if (i24 == 1048576) {
                        i25 = i16;
                    } else {
                        i25 = 0;
                    }
                    i26 = i44 & i17;
                    if (i26 == 536870912) {
                        i27 = i16;
                    } else {
                        i27 = 0;
                    }
                    int i46 = i25 | i27;
                    i28 = i44 & 14;
                    if (i28 == 4) {
                        i29 = 1;
                    } else {
                        i29 = 0;
                    }
                    int i47 = i46 | i29;
                    if (i18 == 8388608) {
                        i30 = 1;
                    } else {
                        i30 = 0;
                    }
                    i34 = i47 | i30;
                    objQ2 = r17.q();
                    if (i34 == 0) {
                        aVar10.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            pVar4 = pVar;
                            x xVar = new x(pVar4, lVar10, lVar3, lVar2, 3);
                            r17.K(xVar);
                            objQ2 = xVar;
                        } else {
                            pVar4 = pVar3;
                        }
                    } else {
                        pVar4 = pVar;
                        x xVar2 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                        r17.K(xVar2);
                        objQ2 = xVar2;
                    }
                    jt1.l.a(rVarF2, (e23.l) objQ2, r17, 6);
                    cVar4 = oVar.f140919q;
                    if (cVar4 != null || cVar4.isEmpty()) {
                        i35 = 8388608;
                        i36 = i24;
                        i37 = 4;
                        r17.C(1319515948);
                        r17.g0(false);
                        r18 = r17;
                    } else {
                        r17.C(1318432901);
                        r17.C(-511659144);
                        Iterator<pt1.x> it = oVar.f140919q.iterator();
                        ?? r25 = r17;
                        while (it.hasNext()) {
                            int i48 = i44 << 3;
                            ?? r26 = r25;
                            jt1.k.e(it.next(), pVar4.f140931c.f140953a, true, qVar, pVar2, lVar5, lVar6, lVar7, lVar8, null, lVar9, lVar2, r26, (i48 & 7168) | 384 | (i48 & 57344) | (i48 & 458752) | (i48 & 3670016) | (i48 & 29360128) | (i48 & 234881024), ((i44 >> 24) & 14) | ((i39 >> 18) & 112), 512);
                            i24 = i24;
                            f14 = f14;
                            r25 = r26;
                        }
                        ?? r110 = r25;
                        int i49 = i24;
                        float f16 = f14;
                        r110.g0(false);
                        ?? r27 = l72.f0.f110999a;
                        String strQ2 = gl1.y.Q(r110, R.string.lbl_see_all_reviews);
                        h4.r rVarF3 = x2.f(h4.r.S, f16);
                        h4.d.f81522a.getClass();
                        h4.r rVarB2 = b0Var.b(rVarF3, h4.d.a.f81537o);
                        boolean z25 = (c14 & 14) == 4;
                        Object objQ6 = r110.q();
                        if (z25) {
                            obj3 = objQ6;
                            e52.c cVar7 = new e52.c(aVar4, 21);
                            r110.K(cVar7);
                            obj3 = cVar7;
                        } else {
                            aVar10.getClass();
                            if (objQ6 == p3.m.a.f135155b) {
                                obj3 = objQ6;
                                e52.c cVar8 = new e52.c(aVar4, 21);
                                r110.K(cVar8);
                                obj3 = cVar8;
                            }
                        }
                        obj3 = objQ6;
                        e23.a aVar13 = (e23.a) obj3;
                        f14 = f16;
                        ?? r28 = r110;
                        i35 = 8388608;
                        i36 = i49;
                        i37 = 4;
                        r27.k(strQ2, rVarB2, false, aVar13, r28, 0, 4);
                        r28.g0(false);
                        r18 = r28;
                    }
                    h4.r rVarF4 = x2.f(h4.r.S, f14);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(rVarF4, j92.b.f97899b.f97920e, 0.0f, 2);
                    if (i36 == 1048576) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i26 == 536870912) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean z26 = z16 | z15;
                    if (i28 == i37) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    boolean z27 = z26 | z17;
                    if (i18 == i35) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = z27 | z18;
                    objQ3 = r18.q();
                    if (z19) {
                        lVar11 = lVar2;
                        x xVar3 = new x(pVar, lVar10, lVar3, lVar11, 4);
                        r18.K(xVar3);
                        objQ3 = xVar3;
                    } else {
                        aVar10.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            lVar11 = lVar2;
                            x xVar4 = new x(pVar, lVar10, lVar3, lVar11, 4);
                            r18.K(xVar4);
                            objQ3 = xVar4;
                        } else {
                            lVar11 = lVar2;
                        }
                    }
                    e23.l lVar12 = (e23.l) objQ3;
                    if (i18 == i35) {
                        z24 = true;
                    } else {
                        z24 = false;
                    }
                    objQ4 = r18.q();
                    if (z24) {
                        obj2 = objQ4;
                        e40.g gVar5 = new e40.g(lVar11, 16);
                        r18.K(gVar5);
                        obj2 = gVar5;
                    } else {
                        aVar10.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            obj2 = objQ4;
                            e40.g gVar6 = new e40.g(lVar11, 16);
                            r18.K(gVar6);
                            obj2 = gVar6;
                        }
                    }
                    obj2 = objQ4;
                    jt1.n.a(rVarA, lVar12, (e23.a) obj2, r18, 0);
                    r18.g0(true);
                    p3.x1 x1Var2 = p3.n.f135158a;
                    r14 = r18;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                if (dVar != null) {
                    bVar3 = bVar2;
                    eVar3 = eVar;
                    aVar9 = aVar5;
                    r15 = 0;
                    o0VarE.C(1314174028);
                    o0VarE.g0(false);
                    r16 = o0VarE;
                } else {
                    bVar3 = bVar2;
                    eVar3 = eVar;
                    aVar9 = aVar5;
                    r15 = 0;
                    o0VarE.C(1314174028);
                    o0VarE.g0(false);
                    r16 = o0VarE;
                }
                aVar10 = p3.m.f135153a;
                if (sVar != null) {
                    r16.C(1314269291);
                    h4.r rVarF5 = x2.f(aVar9, 1.0f);
                    zVarA2 = c2.y.a(c2.j.f22694d, r30, r16, r15);
                    iHashCode2 = Long.hashCode(r16.U);
                    i2VarA1 = r16.a0();
                    rVarC2 = h4.k.c(rVarF5, r16);
                    if (cVar5 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    r16.z();
                    if (r16.T) {
                        r16.M(aVar8);
                    } else {
                        r16.c();
                    }
                    b4.c(r31, zVarA2, r16);
                    b4.c(c1623g2, i2VarA1, r16);
                    if (r16.T) {
                        v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                    } else {
                        v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, r16);
                    pVar3 = pVar;
                    i17 = 1879048192;
                    dt1.g.a(pVar.f140951w, i53.a.a(sVar.f140964a), sVar.f140965b, sVar.f140966c, aVar, r16, (i39 >> 3) & 57344);
                    h4.r rVarE7 = u1.n.e(x2.f(aVar9, 1.0f), d92.b.a(r16).c().e(), aVar6);
                    bVar.getClass();
                    eVar5 = eVar3;
                    h4.r rVarB3 = b0Var.b(c2.l.y(rVarE7, eVar5.f97920e), aVar7);
                    if ((i39 & 3670016) == 1048576) {
                        r19 = 1;
                    } else {
                        r19 = r15;
                    }
                    if ((i39 & 1879048192) == 536870912) {
                        r24 = 1;
                    } else {
                        r24 = r15;
                    }
                    i38 = r19 | r24;
                    objQ5 = r16.q();
                    if (i38 == 0) {
                        aVar10.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            dl0.g gVar7 = new dl0.g(17, pVar3, aVar3);
                            r16.K(gVar7);
                            obj4 = gVar7;
                        } else {
                            obj4 = objQ5;
                        }
                    } else {
                        dl0.g gVar8 = new dl0.g(17, pVar3, aVar3);
                        r16.K(gVar8);
                        obj4 = gVar8;
                    }
                    h4.r rVarD2 = u1.w.d(rVarB3, false, null, null, (e23.a) obj4, 15);
                    s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, r16, r15);
                    iHashCode3 = Long.hashCode(r16.getU());
                    i2VarA2 = r16.a0();
                    rVarC3 = h4.k.c(rVarD2, r16);
                    if (cVar5 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    r16.z();
                    if (r16.T) {
                        r16.M(aVar8);
                    } else {
                        r16.c();
                    }
                    b4.c(eVar2, s2VarA, r16);
                    b4.c(c1623g2, i2VarA2, r16);
                    if (r16.T) {
                        v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                    } else {
                        v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, r16);
                    u2 u2Var2 = u2.f22900a;
                    g6.f.a aVar14 = g6.f.f75994b;
                    h4.r rVarQ2 = x2.q(aVar9, 36);
                    bVar.getClass();
                    h4.r rVarY3 = c2.l.y(rVarQ2, eVar5.f97918c);
                    h4.g.b bVar5 = h4.d.a.f81534l;
                    b0Var = b0Var;
                    aVar11 = aVar6;
                    eVar4 = eVar5;
                    f14 = 1.0f;
                    i7.a(n5.c.a(R.drawable.pin, r16, 0), null, u2Var2.c(rVarY3, bVar5), hb.a.s(r16), r16, 48, 0);
                    String strQ3 = gl1.y.Q(r16, R.string.lbl_driving_directions);
                    bVar.getClass();
                    h4.r rVarC5 = u2Var2.c(c2.l.y(aVar9, eVar4.f97918c), bVar5);
                    d92.b.f58624b.getClass();
                    mh.c(strQ3, rVarC5, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97936m, com.nimbusds.jose.shaded.gson.internal.a.d(r16), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), r16, 0, 0, 131068);
                    i16 = 1;
                    e5.u(r16, true, true, false);
                } else {
                    pVar3 = pVar;
                    eVar4 = eVar3;
                    f14 = 1.0f;
                    aVar11 = aVar6;
                    i16 = 1;
                    i17 = 1879048192;
                    r16.C(1316115372);
                    r16.g0(r15);
                }
                cVar = pVar3.f140932d;
                if (cVar == null) {
                    r16.C(1316504236);
                    r16.g0(false);
                } else {
                    r16.C(1316504236);
                    r16.g0(false);
                }
                String str3 = pVar3.f140938j;
                String str4 = pVar3.f140939k;
                h4.r rVarE8 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r16).c().e(), aVar11);
                bVar.getClass();
                h4.r rVarY4 = c2.l.y(rVarE8, eVar4.f97920e);
                i18 = i39 & 29360128;
                if (i18 == 8388608) {
                    i19 = i16;
                } else {
                    i19 = 0;
                }
                objQ = r16.q();
                if (i19 == 0) {
                    aVar10.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e40.g gVar9 = new e40.g(lVar2, 15);
                        r16.K(gVar9);
                        obj = gVar9;
                    } else {
                        obj = objQ;
                    }
                } else {
                    e40.g gVar10 = new e40.g(lVar2, 15);
                    r16.K(gVar10);
                    obj = gVar10;
                }
                ?? r36 = r16;
                gt1.e.a(str3, str4, rVarY4, (e23.a) obj, r36, 0);
                r17 = r36;
                cVar2 = pVar3.f140934f;
                if (cVar2 != null) {
                    r17.C(1317498220);
                    r17.g0(false);
                } else {
                    r17.C(1317498220);
                    r17.g0(false);
                }
                cVar3 = pVar3.f140936h;
                if (cVar3 != null) {
                    r17.C(1317910892);
                    r17.g0(false);
                } else {
                    r17.C(1317910892);
                    r17.g0(false);
                }
                h4.r rVarF6 = x2.f(aVar9, f14);
                i24 = i39 & 3670016;
                if (i24 == 1048576) {
                    i25 = i16;
                } else {
                    i25 = 0;
                }
                i26 = i44 & i17;
                if (i26 == 536870912) {
                    i27 = i16;
                } else {
                    i27 = 0;
                }
                int i410 = i25 | i27;
                i28 = i44 & 14;
                if (i28 == 4) {
                    i29 = 1;
                } else {
                    i29 = 0;
                }
                int i411 = i410 | i29;
                if (i18 == 8388608) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                i34 = i411 | i30;
                objQ2 = r17.q();
                if (i34 == 0) {
                    aVar10.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        pVar4 = pVar;
                        x xVar5 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                        r17.K(xVar5);
                        objQ2 = xVar5;
                    } else {
                        pVar4 = pVar3;
                    }
                } else {
                    pVar4 = pVar;
                    x xVar6 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                    r17.K(xVar6);
                    objQ2 = xVar6;
                }
                jt1.l.a(rVarF6, (e23.l) objQ2, r17, 6);
                cVar4 = oVar.f140919q;
                if (cVar4 != null) {
                    i35 = 8388608;
                    i36 = i24;
                    i37 = 4;
                    r17.C(1319515948);
                    r17.g0(false);
                    r18 = r17;
                } else {
                    i35 = 8388608;
                    i36 = i24;
                    i37 = 4;
                    r17.C(1319515948);
                    r17.g0(false);
                    r18 = r17;
                }
                h4.r rVarF7 = x2.f(h4.r.S, f14);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA2 = c2.l.A(rVarF7, j92.b.f97899b.f97920e, 0.0f, 2);
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i26 == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z28 = z16 | z15;
                if (i28 == i37) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z29 = z28 | z17;
                if (i18 == i35) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z29 | z18;
                objQ3 = r18.q();
                if (z19) {
                    aVar10.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        lVar11 = lVar2;
                        x xVar7 = new x(pVar, lVar10, lVar3, lVar11, 4);
                        r18.K(xVar7);
                        objQ3 = xVar7;
                    } else {
                        lVar11 = lVar2;
                    }
                } else {
                    lVar11 = lVar2;
                    x xVar8 = new x(pVar, lVar10, lVar3, lVar11, 4);
                    r18.K(xVar8);
                    objQ3 = xVar8;
                }
                e23.l lVar13 = (e23.l) objQ3;
                if (i18 == i35) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ4 = r18.q();
                if (z24) {
                    aVar10.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj2 = objQ4;
                        e40.g gVar11 = new e40.g(lVar11, 16);
                        r18.K(gVar11);
                        obj2 = gVar11;
                    }
                } else {
                    obj2 = objQ4;
                    e40.g gVar12 = new e40.g(lVar11, 16);
                    r18.K(gVar12);
                    obj2 = gVar12;
                }
                obj2 = objQ4;
                jt1.n.a(rVarA2, lVar13, (e23.a) obj2, r18, 0);
                r18.g0(true);
                p3.x1 x1Var3 = p3.n.f135158a;
                r14 = r18;
            } else {
                lVar11 = lVar2;
                o0VarE.e();
                r14 = o0VarE;
            }
            p2VarI0 = r14.i0();
            if (p2VarI0 != null) {
                final e23.l lVar14 = lVar11;
                p2VarI0.f135219d = new e23.p(i14, oVar, lVar, sVar, aVar, pVar, lVar14, aVar2, aVar3, lVar3, lVar4, qVar, pVar2, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, aVar4, i15) { // from class: et1.x0

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ int f65938b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ pt1.o f65939c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65940d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ pt1.s f65941e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ e23.a f65942f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ pt1.p f65943g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65944h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    public final /* synthetic */ e23.a f65945i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    public final /* synthetic */ e23.a f65946j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65947k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65948l;

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    public final /* synthetic */ e23.q f65949m;

                    /* JADX INFO: renamed from: n, reason: collision with root package name */
                    public final /* synthetic */ e23.p f65950n;

                    /* JADX INFO: renamed from: o, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65951o;

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65952p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65953q;

                    /* JADX INFO: renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65954r;

                    /* JADX INFO: renamed from: t, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65955t;

                    /* JADX INFO: renamed from: v, reason: collision with root package name */
                    public final /* synthetic */ e23.l f65956v;

                    /* JADX INFO: renamed from: w, reason: collision with root package name */
                    public final /* synthetic */ e23.a f65957w;

                    @Override // e23.p
                    public final Object invoke(Object obj5, Object obj6) {
                        ((Integer) obj6).getClass();
                        int iT = p3.p0.t(9);
                        y0.a(this.f65937a, this.f65938b, this.f65939c, this.f65940d, this.f65941e, this.f65942f, this.f65943g, this.f65944h, this.f65945i, this.f65946j, this.f65947k, this.f65948l, this.f65949m, this.f65950n, this.f65951o, this.f65952p, this.f65953q, this.f65954r, this.f65955t, this.f65956v, this.f65957w, (p3.m) obj5, iT);
                        return Unit.INSTANCE;
                    }
                };
            }
        }
        z14 = true;
        if (o0VarE.n(i39 & 1, z14)) {
            p3.x1 x1Var4 = p3.n.f135158a;
            c2.j jVar2 = c2.j.f22691a;
            d92.b.f58623a.getClass();
            bVar = d92.b.f58625c;
            bVar.getClass();
            eVar = j92.b.f97899b;
            float f17 = eVar.f97918c;
            jVar2.getClass();
            c2.j.i iVarI2 = c2.j.i(f17);
            aVar5 = h4.r.S;
            long jB2 = d92.b.a(o0VarE).c().b();
            aVar6 = o4.m1.f128891a;
            h4.r rVarE9 = u1.n.e(aVar5, jB2, aVar6);
            h4.d.f81522a.getClass();
            aVar7 = h4.d.a.f81536n;
            zVarA = c2.y.a(iVarI2, aVar7, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVarE9, o0VarE);
            h5.g.V.getClass();
            aVar8 = h5.g.a.f81805b;
            if (cVar5 != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar8);
            } else {
                o0VarE.c();
            }
            eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar2 = h5.g.a.f81813j;
            if (o0VarE.T) {
                c1623g2 = c1623g;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = c2.b0.f22601a;
                if (dVar != null) {
                    bVar3 = bVar2;
                    eVar3 = eVar;
                    aVar9 = aVar5;
                    r15 = 0;
                    o0VarE.C(1314174028);
                    o0VarE.g0(false);
                    r16 = o0VarE;
                } else {
                    bVar3 = bVar2;
                    eVar3 = eVar;
                    aVar9 = aVar5;
                    r15 = 0;
                    o0VarE.C(1314174028);
                    o0VarE.g0(false);
                    r16 = o0VarE;
                }
                aVar10 = p3.m.f135153a;
                if (sVar != null) {
                    r16.C(1314269291);
                    h4.r rVarF8 = x2.f(aVar9, 1.0f);
                    zVarA2 = c2.y.a(c2.j.f22694d, r30, r16, r15);
                    iHashCode2 = Long.hashCode(r16.U);
                    i2VarA1 = r16.a0();
                    rVarC2 = h4.k.c(rVarF8, r16);
                    if (cVar5 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    r16.z();
                    if (r16.T) {
                        r16.M(aVar8);
                    } else {
                        r16.c();
                    }
                    b4.c(r31, zVarA2, r16);
                    b4.c(c1623g2, i2VarA1, r16);
                    if (r16.T) {
                        v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                    } else {
                        v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                    }
                    b4.c(fVar, rVarC2, r16);
                    pVar3 = pVar;
                    i17 = 1879048192;
                    dt1.g.a(pVar.f140951w, i53.a.a(sVar.f140964a), sVar.f140965b, sVar.f140966c, aVar, r16, (i39 >> 3) & 57344);
                    h4.r rVarE10 = u1.n.e(x2.f(aVar9, 1.0f), d92.b.a(r16).c().e(), aVar6);
                    bVar.getClass();
                    eVar5 = eVar3;
                    h4.r rVarB4 = b0Var.b(c2.l.y(rVarE10, eVar5.f97920e), aVar7);
                    if ((i39 & 3670016) == 1048576) {
                        r19 = 1;
                    } else {
                        r19 = r15;
                    }
                    if ((i39 & 1879048192) == 536870912) {
                        r24 = 1;
                    } else {
                        r24 = r15;
                    }
                    i38 = r19 | r24;
                    objQ5 = r16.q();
                    if (i38 == 0) {
                        aVar10.getClass();
                        if (objQ5 == p3.m.a.f135155b) {
                            dl0.g gVar13 = new dl0.g(17, pVar3, aVar3);
                            r16.K(gVar13);
                            obj4 = gVar13;
                        } else {
                            obj4 = objQ5;
                        }
                    } else {
                        dl0.g gVar14 = new dl0.g(17, pVar3, aVar3);
                        r16.K(gVar14);
                        obj4 = gVar14;
                    }
                    h4.r rVarD3 = u1.w.d(rVarB4, false, null, null, (e23.a) obj4, 15);
                    s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, r16, r15);
                    iHashCode3 = Long.hashCode(r16.getU());
                    i2VarA2 = r16.a0();
                    rVarC3 = h4.k.c(rVarD3, r16);
                    if (cVar5 != null) {
                        p3.p0.l();
                        throw null;
                    }
                    r16.z();
                    if (r16.T) {
                        r16.M(aVar8);
                    } else {
                        r16.c();
                    }
                    b4.c(eVar2, s2VarA, r16);
                    b4.c(c1623g2, i2VarA2, r16);
                    if (r16.T) {
                        v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                    } else {
                        v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, r16);
                    u2 u2Var3 = u2.f22900a;
                    g6.f.a aVar15 = g6.f.f75994b;
                    h4.r rVarQ3 = x2.q(aVar9, 36);
                    bVar.getClass();
                    h4.r rVarY5 = c2.l.y(rVarQ3, eVar5.f97918c);
                    h4.g.b bVar6 = h4.d.a.f81534l;
                    b0Var = b0Var;
                    aVar11 = aVar6;
                    eVar4 = eVar5;
                    f14 = 1.0f;
                    i7.a(n5.c.a(R.drawable.pin, r16, 0), null, u2Var3.c(rVarY5, bVar6), hb.a.s(r16), r16, 48, 0);
                    String strQ4 = gl1.y.Q(r16, R.string.lbl_driving_directions);
                    bVar.getClass();
                    h4.r rVarC6 = u2Var3.c(c2.l.y(aVar9, eVar4.f97918c), bVar6);
                    d92.b.f58624b.getClass();
                    mh.c(strQ4, rVarC6, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97936m, com.nimbusds.jose.shaded.gson.internal.a.d(r16), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), r16, 0, 0, 131068);
                    i16 = 1;
                    e5.u(r16, true, true, false);
                } else {
                    pVar3 = pVar;
                    eVar4 = eVar3;
                    f14 = 1.0f;
                    aVar11 = aVar6;
                    i16 = 1;
                    i17 = 1879048192;
                    r16.C(1316115372);
                    r16.g0(r15);
                }
                cVar = pVar3.f140932d;
                if (cVar == null) {
                    r16.C(1316504236);
                    r16.g0(false);
                } else {
                    r16.C(1316504236);
                    r16.g0(false);
                }
                String str5 = pVar3.f140938j;
                String str6 = pVar3.f140939k;
                h4.r rVarE11 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r16).c().e(), aVar11);
                bVar.getClass();
                h4.r rVarY6 = c2.l.y(rVarE11, eVar4.f97920e);
                i18 = i39 & 29360128;
                if (i18 == 8388608) {
                    i19 = i16;
                } else {
                    i19 = 0;
                }
                objQ = r16.q();
                if (i19 == 0) {
                    aVar10.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        e40.g gVar15 = new e40.g(lVar2, 15);
                        r16.K(gVar15);
                        obj = gVar15;
                    } else {
                        obj = objQ;
                    }
                } else {
                    e40.g gVar16 = new e40.g(lVar2, 15);
                    r16.K(gVar16);
                    obj = gVar16;
                }
                ?? r37 = r16;
                gt1.e.a(str5, str6, rVarY6, (e23.a) obj, r37, 0);
                r17 = r37;
                cVar2 = pVar3.f140934f;
                if (cVar2 != null) {
                    r17.C(1317498220);
                    r17.g0(false);
                } else {
                    r17.C(1317498220);
                    r17.g0(false);
                }
                cVar3 = pVar3.f140936h;
                if (cVar3 != null) {
                    r17.C(1317910892);
                    r17.g0(false);
                } else {
                    r17.C(1317910892);
                    r17.g0(false);
                }
                h4.r rVarF9 = x2.f(aVar9, f14);
                i24 = i39 & 3670016;
                if (i24 == 1048576) {
                    i25 = i16;
                } else {
                    i25 = 0;
                }
                i26 = i44 & i17;
                if (i26 == 536870912) {
                    i27 = i16;
                } else {
                    i27 = 0;
                }
                int i412 = i25 | i27;
                i28 = i44 & 14;
                if (i28 == 4) {
                    i29 = 1;
                } else {
                    i29 = 0;
                }
                int i413 = i412 | i29;
                if (i18 == 8388608) {
                    i30 = 1;
                } else {
                    i30 = 0;
                }
                i34 = i413 | i30;
                objQ2 = r17.q();
                if (i34 == 0) {
                    aVar10.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        pVar4 = pVar;
                        x xVar9 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                        r17.K(xVar9);
                        objQ2 = xVar9;
                    } else {
                        pVar4 = pVar3;
                    }
                } else {
                    pVar4 = pVar;
                    x xVar10 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                    r17.K(xVar10);
                    objQ2 = xVar10;
                }
                jt1.l.a(rVarF9, (e23.l) objQ2, r17, 6);
                cVar4 = oVar.f140919q;
                if (cVar4 != null) {
                    i35 = 8388608;
                    i36 = i24;
                    i37 = 4;
                    r17.C(1319515948);
                    r17.g0(false);
                    r18 = r17;
                } else {
                    i35 = 8388608;
                    i36 = i24;
                    i37 = 4;
                    r17.C(1319515948);
                    r17.g0(false);
                    r18 = r17;
                }
                h4.r rVarF10 = x2.f(h4.r.S, f14);
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                h4.r rVarA3 = c2.l.A(rVarF10, j92.b.f97899b.f97920e, 0.0f, 2);
                if (i36 == 1048576) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i26 == 536870912) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean z210 = z16 | z15;
                if (i28 == i37) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z211 = z210 | z17;
                if (i18 == i35) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = z211 | z18;
                objQ3 = r18.q();
                if (z19) {
                    aVar10.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        lVar11 = lVar2;
                        x xVar11 = new x(pVar, lVar10, lVar3, lVar11, 4);
                        r18.K(xVar11);
                        objQ3 = xVar11;
                    } else {
                        lVar11 = lVar2;
                    }
                } else {
                    lVar11 = lVar2;
                    x xVar12 = new x(pVar, lVar10, lVar3, lVar11, 4);
                    r18.K(xVar12);
                    objQ3 = xVar12;
                }
                e23.l lVar15 = (e23.l) objQ3;
                if (i18 == i35) {
                    z24 = true;
                } else {
                    z24 = false;
                }
                objQ4 = r18.q();
                if (z24) {
                    aVar10.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        obj2 = objQ4;
                        e40.g gVar17 = new e40.g(lVar11, 16);
                        r18.K(gVar17);
                        obj2 = gVar17;
                    }
                } else {
                    obj2 = objQ4;
                    e40.g gVar18 = new e40.g(lVar11, 16);
                    r18.K(gVar18);
                    obj2 = gVar18;
                }
                obj2 = objQ4;
                jt1.n.a(rVarA3, lVar15, (e23.a) obj2, r18, 0);
                r18.g0(true);
                p3.x1 x1Var5 = p3.n.f135158a;
                r14 = r18;
            } else {
                c1623g2 = c1623g;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0Var = c2.b0.f22601a;
            if (dVar != null) {
                bVar3 = bVar2;
                eVar3 = eVar;
                aVar9 = aVar5;
                r15 = 0;
                o0VarE.C(1314174028);
                o0VarE.g0(false);
                r16 = o0VarE;
            } else {
                bVar3 = bVar2;
                eVar3 = eVar;
                aVar9 = aVar5;
                r15 = 0;
                o0VarE.C(1314174028);
                o0VarE.g0(false);
                r16 = o0VarE;
            }
            aVar10 = p3.m.f135153a;
            if (sVar != null) {
                r16.C(1314269291);
                h4.r rVarF11 = x2.f(aVar9, 1.0f);
                zVarA2 = c2.y.a(c2.j.f22694d, r30, r16, r15);
                iHashCode2 = Long.hashCode(r16.U);
                i2VarA1 = r16.a0();
                rVarC2 = h4.k.c(rVarF11, r16);
                if (cVar5 != null) {
                    p3.p0.l();
                    throw null;
                }
                r16.z();
                if (r16.T) {
                    r16.M(aVar8);
                } else {
                    r16.c();
                }
                b4.c(r31, zVarA2, r16);
                b4.c(c1623g2, i2VarA1, r16);
                if (r16.T) {
                    v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                } else {
                    v.h.A(iHashCode2, r16, iHashCode2, bVar3);
                }
                b4.c(fVar, rVarC2, r16);
                pVar3 = pVar;
                i17 = 1879048192;
                dt1.g.a(pVar.f140951w, i53.a.a(sVar.f140964a), sVar.f140965b, sVar.f140966c, aVar, r16, (i39 >> 3) & 57344);
                h4.r rVarE12 = u1.n.e(x2.f(aVar9, 1.0f), d92.b.a(r16).c().e(), aVar6);
                bVar.getClass();
                eVar5 = eVar3;
                h4.r rVarB5 = b0Var.b(c2.l.y(rVarE12, eVar5.f97920e), aVar7);
                if ((i39 & 3670016) == 1048576) {
                    r19 = 1;
                } else {
                    r19 = r15;
                }
                if ((i39 & 1879048192) == 536870912) {
                    r24 = 1;
                } else {
                    r24 = r15;
                }
                i38 = r19 | r24;
                objQ5 = r16.q();
                if (i38 == 0) {
                    aVar10.getClass();
                    if (objQ5 == p3.m.a.f135155b) {
                        dl0.g gVar19 = new dl0.g(17, pVar3, aVar3);
                        r16.K(gVar19);
                        obj4 = gVar19;
                    } else {
                        obj4 = objQ5;
                    }
                } else {
                    dl0.g gVar110 = new dl0.g(17, pVar3, aVar3);
                    r16.K(gVar110);
                    obj4 = gVar110;
                }
                h4.r rVarD4 = u1.w.d(rVarB5, false, null, null, (e23.a) obj4, 15);
                s2VarA = c2.q2.a(c2.j.f22692b, h4.d.a.f81533k, r16, r15);
                iHashCode3 = Long.hashCode(r16.getU());
                i2VarA2 = r16.a0();
                rVarC3 = h4.k.c(rVarD4, r16);
                if (cVar5 != null) {
                    p3.p0.l();
                    throw null;
                }
                r16.z();
                if (r16.T) {
                    r16.M(aVar8);
                } else {
                    r16.c();
                }
                b4.c(eVar2, s2VarA, r16);
                b4.c(c1623g2, i2VarA2, r16);
                if (r16.T) {
                    v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                } else {
                    v.h.A(iHashCode3, r16, iHashCode3, bVar3);
                }
                b4.c(fVar, rVarC3, r16);
                u2 u2Var4 = u2.f22900a;
                g6.f.a aVar16 = g6.f.f75994b;
                h4.r rVarQ4 = x2.q(aVar9, 36);
                bVar.getClass();
                h4.r rVarY7 = c2.l.y(rVarQ4, eVar5.f97918c);
                h4.g.b bVar7 = h4.d.a.f81534l;
                b0Var = b0Var;
                aVar11 = aVar6;
                eVar4 = eVar5;
                f14 = 1.0f;
                i7.a(n5.c.a(R.drawable.pin, r16, 0), null, u2Var4.c(rVarY7, bVar7), hb.a.s(r16), r16, 48, 0);
                String strQ5 = gl1.y.Q(r16, R.string.lbl_driving_directions);
                bVar.getClass();
                h4.r rVarC7 = u2Var4.c(c2.l.y(aVar9, eVar4.f97918c), bVar7);
                d92.b.f58624b.getClass();
                mh.c(strQ5, rVarC7, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97936m, com.nimbusds.jose.shaded.gson.internal.a.d(r16), 0L, null, null, 0L, null, null, 0, 0L, null, null, 16777214), r16, 0, 0, 131068);
                i16 = 1;
                e5.u(r16, true, true, false);
            } else {
                pVar3 = pVar;
                eVar4 = eVar3;
                f14 = 1.0f;
                aVar11 = aVar6;
                i16 = 1;
                i17 = 1879048192;
                r16.C(1316115372);
                r16.g0(r15);
            }
            cVar = pVar3.f140932d;
            if (cVar == null) {
                r16.C(1316504236);
                r16.g0(false);
            } else {
                r16.C(1316504236);
                r16.g0(false);
            }
            String str7 = pVar3.f140938j;
            String str8 = pVar3.f140939k;
            h4.r rVarE13 = u1.n.e(x2.f(aVar9, f14), d92.b.a(r16).c().e(), aVar11);
            bVar.getClass();
            h4.r rVarY8 = c2.l.y(rVarE13, eVar4.f97920e);
            i18 = i39 & 29360128;
            if (i18 == 8388608) {
                i19 = i16;
            } else {
                i19 = 0;
            }
            objQ = r16.q();
            if (i19 == 0) {
                aVar10.getClass();
                if (objQ == p3.m.a.f135155b) {
                    e40.g gVar111 = new e40.g(lVar2, 15);
                    r16.K(gVar111);
                    obj = gVar111;
                } else {
                    obj = objQ;
                }
            } else {
                e40.g gVar112 = new e40.g(lVar2, 15);
                r16.K(gVar112);
                obj = gVar112;
            }
            ?? r38 = r16;
            gt1.e.a(str7, str8, rVarY8, (e23.a) obj, r38, 0);
            r17 = r38;
            cVar2 = pVar3.f140934f;
            if (cVar2 != null) {
                r17.C(1317498220);
                r17.g0(false);
            } else {
                r17.C(1317498220);
                r17.g0(false);
            }
            cVar3 = pVar3.f140936h;
            if (cVar3 != null) {
                r17.C(1317910892);
                r17.g0(false);
            } else {
                r17.C(1317910892);
                r17.g0(false);
            }
            h4.r rVarF12 = x2.f(aVar9, f14);
            i24 = i39 & 3670016;
            if (i24 == 1048576) {
                i25 = i16;
            } else {
                i25 = 0;
            }
            i26 = i44 & i17;
            if (i26 == 536870912) {
                i27 = i16;
            } else {
                i27 = 0;
            }
            int i414 = i25 | i27;
            i28 = i44 & 14;
            if (i28 == 4) {
                i29 = 1;
            } else {
                i29 = 0;
            }
            int i415 = i414 | i29;
            if (i18 == 8388608) {
                i30 = 1;
            } else {
                i30 = 0;
            }
            i34 = i415 | i30;
            objQ2 = r17.q();
            if (i34 == 0) {
                aVar10.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    pVar4 = pVar;
                    x xVar13 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                    r17.K(xVar13);
                    objQ2 = xVar13;
                } else {
                    pVar4 = pVar3;
                }
            } else {
                pVar4 = pVar;
                x xVar14 = new x(pVar4, lVar10, lVar3, lVar2, 3);
                r17.K(xVar14);
                objQ2 = xVar14;
            }
            jt1.l.a(rVarF12, (e23.l) objQ2, r17, 6);
            cVar4 = oVar.f140919q;
            if (cVar4 != null) {
                i35 = 8388608;
                i36 = i24;
                i37 = 4;
                r17.C(1319515948);
                r17.g0(false);
                r18 = r17;
            } else {
                i35 = 8388608;
                i36 = i24;
                i37 = 4;
                r17.C(1319515948);
                r17.g0(false);
                r18 = r17;
            }
            h4.r rVarF13 = x2.f(h4.r.S, f14);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarA4 = c2.l.A(rVarF13, j92.b.f97899b.f97920e, 0.0f, 2);
            if (i36 == 1048576) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i26 == 536870912) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z212 = z16 | z15;
            if (i28 == i37) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z213 = z212 | z17;
            if (i18 == i35) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = z213 | z18;
            objQ3 = r18.q();
            if (z19) {
                aVar10.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    lVar11 = lVar2;
                    x xVar15 = new x(pVar, lVar10, lVar3, lVar11, 4);
                    r18.K(xVar15);
                    objQ3 = xVar15;
                } else {
                    lVar11 = lVar2;
                }
            } else {
                lVar11 = lVar2;
                x xVar16 = new x(pVar, lVar10, lVar3, lVar11, 4);
                r18.K(xVar16);
                objQ3 = xVar16;
            }
            e23.l lVar16 = (e23.l) objQ3;
            if (i18 == i35) {
                z24 = true;
            } else {
                z24 = false;
            }
            objQ4 = r18.q();
            if (z24) {
                aVar10.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    obj2 = objQ4;
                    e40.g gVar113 = new e40.g(lVar11, 16);
                    r18.K(gVar113);
                    obj2 = gVar113;
                }
            } else {
                obj2 = objQ4;
                e40.g gVar114 = new e40.g(lVar11, 16);
                r18.K(gVar114);
                obj2 = gVar114;
            }
            obj2 = objQ4;
            jt1.n.a(rVarA4, lVar16, (e23.a) obj2, r18, 0);
            r18.g0(true);
            p3.x1 x1Var6 = p3.n.f135158a;
            r14 = r18;
        } else {
            lVar11 = lVar2;
            o0VarE.e();
            r14 = o0VarE;
        }
        p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            final e23.l lVar17 = lVar11;
            p2VarI0.f135219d = new e23.p(i14, oVar, lVar, sVar, aVar, pVar, lVar17, aVar2, aVar3, lVar3, lVar4, qVar, pVar2, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, aVar4, i15) { // from class: et1.x0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f65938b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ pt1.o f65939c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ e23.l f65940d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ pt1.s f65941e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ e23.a f65942f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ pt1.p f65943g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.l f65944h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.a f65945i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.a f65946j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.l f65947k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                public final /* synthetic */ e23.l f65948l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ e23.q f65949m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ e23.p f65950n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ e23.l f65951o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public final /* synthetic */ e23.l f65952p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public final /* synthetic */ e23.l f65953q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public final /* synthetic */ e23.l f65954r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ e23.l f65955t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                public final /* synthetic */ e23.l f65956v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public final /* synthetic */ e23.a f65957w;

                @Override // e23.p
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int iT = p3.p0.t(9);
                    y0.a(this.f65937a, this.f65938b, this.f65939c, this.f65940d, this.f65941e, this.f65942f, this.f65943g, this.f65944h, this.f65945i, this.f65946j, this.f65947k, this.f65948l, this.f65949m, this.f65950n, this.f65951o, this.f65952p, this.f65953q, this.f65954r, this.f65955t, this.f65956v, this.f65957w, (p3.m) obj5, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
