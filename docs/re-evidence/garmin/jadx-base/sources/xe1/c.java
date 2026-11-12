package xe1;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import c2.b0;
import c2.l;
import c2.u;
import c2.x2;
import c2.z;
import c22.t;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.q;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.mh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.t1;
import m92.c0;
import m92.h0;
import n92.n;
import n92.o;
import n92.p;
import o4.d0;
import o4.u1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.j0;
import p13.k0;
import p13.t0;
import p13.x;
import p13.y;
import p3.b4;
import p3.i2;
import p3.m;
import p3.m1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.q0;
import s5.s0;
import s5.v0;
import s5.x0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {
    /* JADX WARN: Code duplicated, block: B:111:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:138:0x021f  */
    /* JADX WARN: Code duplicated, block: B:140:0x022b  */
    /* JADX WARN: Code duplicated, block: B:141:0x0238  */
    /* JADX WARN: Code duplicated, block: B:143:0x024c  */
    /* JADX WARN: Code duplicated, block: B:144:0x025c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0289  */
    /* JADX WARN: Code duplicated, block: B:149:0x028b  */
    /* JADX WARN: Code duplicated, block: B:153:0x029b A[LOOP:3: B:151:0x0295->B:153:0x029b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:157:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:159:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:162:0x0302 A[LOOP:6: B:160:0x02fc->B:162:0x0302, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x0327  */
    /* JADX WARN: Code duplicated, block: B:168:0x033d A[LOOP:7: B:166:0x0337->B:168:0x033d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x036c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0374  */
    /* JADX WARN: Code duplicated, block: B:176:0x0384  */
    /* JADX WARN: Code duplicated, block: B:178:0x0388  */
    /* JADX WARN: Code duplicated, block: B:179:0x038b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0393  */
    /* JADX WARN: Code duplicated, block: B:185:0x039b  */
    /* JADX WARN: Code duplicated, block: B:189:0x03ab A[LOOP:8: B:170:0x0366->B:189:0x03ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x03df A[LOOP:4: B:195:0x03d9->B:197:0x03df, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:201:0x0416 A[LOOP:5: B:199:0x0410->B:201:0x0416, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x042f  */
    /* JADX WARN: Code duplicated, block: B:204:0x0432 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:205:0x0434  */
    /* JADX WARN: Code duplicated, block: B:206:0x0437  */
    /* JADX WARN: Code duplicated, block: B:208:0x043b  */
    /* JADX WARN: Code duplicated, block: B:210:0x0458  */
    /* JADX WARN: Code duplicated, block: B:213:0x0483  */
    /* JADX WARN: Code duplicated, block: B:216:0x0492  */
    /* JADX WARN: Code duplicated, block: B:219:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:223:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:225:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:228:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:231:0x050a  */
    /* JADX WARN: Code duplicated, block: B:233:0x0513  */
    /* JADX WARN: Code duplicated, block: B:234:0x0517  */
    /* JADX WARN: Code duplicated, block: B:237:0x052c  */
    /* JADX WARN: Code duplicated, block: B:240:0x053d  */
    /* JADX WARN: Code duplicated, block: B:244:0x056e  */
    /* JADX WARN: Code duplicated, block: B:246:0x0575  */
    /* JADX WARN: Code duplicated, block: B:247:0x0579  */
    /* JADX WARN: Code duplicated, block: B:250:0x0586  */
    /* JADX WARN: Code duplicated, block: B:252:0x0594  */
    /* JADX WARN: Code duplicated, block: B:255:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:257:0x05be  */
    /* JADX WARN: Code duplicated, block: B:258:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:261:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:263:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:266:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:268:0x067d  */
    /* JADX WARN: Code duplicated, block: B:271:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:272:0x06c0  */
    /* JADX WARN: Code duplicated, block: B:275:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:277:0x06db  */
    /* JADX WARN: Code duplicated, block: B:279:0x06e8  */
    /* JADX WARN: Code duplicated, block: B:282:0x06f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:283:0x06f6  */
    /* JADX WARN: Code duplicated, block: B:284:0x0706  */
    /* JADX WARN: Code duplicated, block: B:286:0x0712  */
    /* JADX WARN: Code duplicated, block: B:288:0x0723  */
    /* JADX WARN: Code duplicated, block: B:291:0x073d  */
    /* JADX WARN: Code duplicated, block: B:299:0x0750 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:303:0x078b  */
    /* JADX WARN: Code duplicated, block: B:304:0x078d  */
    /* JADX WARN: Code duplicated, block: B:307:0x0796  */
    /* JADX WARN: Code duplicated, block: B:308:0x0798  */
    /* JADX WARN: Code duplicated, block: B:311:0x079f  */
    /* JADX WARN: Code duplicated, block: B:312:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:315:0x07b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:316:0x07b2  */
    /* JADX WARN: Code duplicated, block: B:321:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:323:0x07f7  */
    /* JADX WARN: Code duplicated, block: B:324:0x0802  */
    /* JADX WARN: Code duplicated, block: B:326:0x0810  */
    /* JADX WARN: Code duplicated, block: B:327:0x081b  */
    /* JADX WARN: Code duplicated, block: B:330:0x083e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0851  */
    /* JADX WARN: Code duplicated, block: B:334:0x0855  */
    /* JADX WARN: Code duplicated, block: B:336:0x0859  */
    /* JADX WARN: Code duplicated, block: B:338:0x085d  */
    /* JADX WARN: Code duplicated, block: B:340:0x0861  */
    /* JADX WARN: Code duplicated, block: B:349:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x03b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:362:0x03b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x03b6 A[EDGE_INSN: B:363:0x03b6->B:193:0x03b6 BREAK  A[LOOP:8: B:170:0x0366->B:189:0x03ab], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [p3.m] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r2v2, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v20, types: [p3.m, p3.o0] */
    /* JADX WARN: Type inference failed for: r2v22, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v23, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v25, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v26, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [p3.o0] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v59 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void a(r rVar, String str, o82.g gVar, final boolean z14, final ArrayList arrayList, final Float f14, String str2, o oVar, final p pVar, final n nVar, q qVar, m mVar, int i14, int i15) {
        o82.g gVar2;
        ?? r14;
        o82.g gVar3;
        final float fG;
        s0 s0Var;
        s0 s0Var2;
        boolean z15;
        s0 s0Var3;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        Iterator it3;
        ArrayList arrayList4;
        Iterator it4;
        int iA;
        int i16;
        LinkedHashMap linkedHashMap;
        Iterator it5;
        Iterator it6;
        float fFloatValue;
        Iterator it7;
        float fFloatValue2;
        float f15;
        LinkedHashMap linkedHashMap2;
        Iterator it8;
        int i17;
        ArrayList arrayList5;
        Map mapK;
        Object next;
        int i18;
        float fFloatValue3;
        float f16;
        ArrayList arrayList6;
        ArrayList arrayList7;
        x0 x0VarF;
        boolean z16;
        q0 q0VarA;
        int i19;
        Object objQ;
        m.a.C2565a c2565a;
        p1 p1Var;
        Object objQ2;
        p1 p1Var2;
        Object objQ3;
        m1 m1Var;
        float f17;
        List listA;
        c2.j.k kVar;
        final List list;
        h4.g.a aVar;
        z zVarA;
        o82.g gVar4;
        int iHashCode;
        i2 i2VarA0;
        r rVarC;
        e0.a aVar2;
        h5.g.a.e eVar;
        h5.g.a.C1623g c1623g;
        h5.g.a.b bVar;
        m.a.C2565a c2565a2;
        h5.g.a.f fVar;
        b0 b0Var;
        r.a aVar3;
        float f18;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarA1;
        r rVarC2;
        z zVarA2;
        int iHashCode3;
        i2 i2VarA2;
        r rVarC3;
        b0 b0Var2;
        r.a aVar4;
        ?? r15;
        ArrayList arrayList8;
        q0 q0Var;
        ArrayList arrayList9;
        int i24;
        ?? r16;
        Object objQ4;
        m.a.C2565a c2565a3;
        p1 p1Var3;
        float fX;
        float fX2;
        float fX3;
        final float f19;
        final ArrayList arrayList10;
        final ArrayList arrayList11;
        final ArrayList arrayList12;
        ?? r17;
        ?? r18;
        ?? r19;
        final q0 q0Var2;
        int i25;
        Object objQ5;
        final p1 p1Var4;
        final m1 m1Var2;
        ?? r24;
        ?? r25;
        Map map;
        n4.c cVar;
        ?? r26;
        ?? r27;
        af1.e eVar2;
        boolean z17;
        d0 d0VarA;
        long jA;
        h0.e.a aVar5;
        float f22;
        h0.e.a aVar6;
        o0 o0VarE = mVar.E(2091597525);
        p3.c<?> cVar2 = o0VarE.f135177b;
        int i26 = (i14 & 6) == 0 ? (o0VarE.B(rVar) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i26 |= o0VarE.B(str) ? 32 : 16;
        }
        int i27 = i15 & 4;
        if (i27 != 0) {
            i26 |= 384;
        } else if ((i14 & 384) == 0) {
            i26 |= o0VarE.k(gVar == null ? -1 : gVar.ordinal()) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i26 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i26 |= o0VarE.i(0.0f) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i26 |= o0VarE.r(arrayList) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i26 |= o0VarE.B(f14) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i26 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        if ((i14 & 100663296) == 0) {
            i26 |= (i14 & 134217728) == 0 ? o0VarE.B(oVar) : o0VarE.r(oVar) ? 67108864 : 33554432;
        }
        if ((i14 & C.ENCODING_PCM_32BIT) == 0) {
            i26 |= (i14 & 1073741824) == 0 ? o0VarE.B(pVar) : o0VarE.r(pVar) ? 536870912 : 268435456;
        }
        int i28 = '0' | (o0VarE.B(nVar) ? (char) 4 : (char) 2);
        int i29 = i26;
        if (o0VarE.n(i29 & 1, ((i26 & 306783379) == 306783378 && (i28 & 19) == 18) ? false : true)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i27 != 0) {
                    gVar3 = null;
                }
                o0VarE.h0();
                x1 x1Var = p3.n.f135158a;
                g6.f.a aVar7 = g6.f.f75994b;
                fG = w02.b0.g(0.0f / 4, o0VarE);
                if (nVar != null) {
                    s0Var2 = nVar.f125091a;
                } else {
                    if (pVar != null) {
                        s0Var2 = pVar.f125097a;
                    } else {
                        s0Var = null;
                    }
                    if (s0Var == null) {
                        o0VarE.C(-19451350);
                        z15 = true;
                        s0Var3 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                        o0VarE.g0(false);
                    } else {
                        z15 = true;
                        o0VarE.C(-19453272);
                        o0VarE.g0(false);
                        s0Var3 = s0Var;
                    }
                    arrayList2 = new ArrayList(y.r(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        aVar6 = ((ve1.a) it.next()).f177668a;
                        if (aVar6 == null) {
                            aVar6 = new h0.e.a(0.0f, 0.0f);
                        }
                        arrayList2.add(aVar6);
                    }
                    arrayList3 = new ArrayList(y.r(arrayList, 10));
                    it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        aVar5 = ((ve1.a) it3.next()).f177668a;
                        if (aVar5 != null) {
                            f22 = aVar5.f117347b;
                        } else {
                            f22 = 0.0f;
                        }
                        arrayList3.add(Float.valueOf(f22));
                    }
                    o0VarE.C(-19440435);
                    arrayList4 = new ArrayList(y.r(arrayList, 10));
                    it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        eVar2 = ((ve1.a) it4.next()).f177669b;
                        if (eVar2 == null) {
                            o0VarE.C(-1322199822);
                            z17 = false;
                            o0VarE.g0(false);
                            d0VarA = null;
                        } else {
                            o0VarE.C(-1982314257);
                            long jA2 = af1.f.a(eVar2, o0VarE);
                            z17 = false;
                            o0VarE.g0(false);
                            d0VarA = d0.a(jA2);
                        }
                        if (d0VarA == null) {
                            o0VarE.C(-1982312625);
                            jA = af1.f.a(af1.e.f3079l, o0VarE);
                            o0VarE.g0(z17);
                        } else {
                            o0VarE.C(-1982314795);
                            o0VarE.g0(z17);
                            jA = d0VarA.f128833a;
                        }
                        arrayList4.add(d0.a(jA));
                    }
                    o0VarE.g0(false);
                    iA = t0.a(y.r(arrayList2, 10));
                    if (iA < 16) {
                        i16 = 16;
                    } else {
                        i16 = iA;
                    }
                    linkedHashMap = new LinkedHashMap(i16);
                    it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        h0.e.a aVar8 = (h0.e.a) it5.next();
                        Iterator it9 = it5;
                        o13.p pVar2 = new o13.p(Float.valueOf(aVar8.f117346a), Float.valueOf(aVar8.f117347b));
                        linkedHashMap.put(pVar2.f128594a, pVar2.f128595b);
                        it5 = it9;
                    }
                    o0VarE.C(1072240812);
                    x1 x1Var2 = p3.n.f135158a;
                    if (linkedHashMap.isEmpty()) {
                        k0 k0Var = k0.f134949a;
                        k0Var.getClass();
                        mapK = i53.a.g(k0Var);
                        o0VarE.f();
                        arrayList5 = arrayList2;
                    } else {
                        it6 = linkedHashMap.entrySet().iterator();
                        if (it6.hasNext()) {
                            t.g();
                            return;
                        }
                        fFloatValue = ((Number) ((Map.Entry) it6.next()).getValue()).floatValue();
                        while (it6.hasNext()) {
                            fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it6.next()).getValue()).floatValue());
                        }
                        it7 = linkedHashMap.entrySet().iterator();
                        if (it7.hasNext()) {
                            t.g();
                            return;
                        }
                        fFloatValue2 = ((Number) ((Map.Entry) it7.next()).getValue()).floatValue();
                        while (it7.hasNext()) {
                            fFloatValue2 = Math.max(fFloatValue2, ((Number) ((Map.Entry) it7.next()).getValue()).floatValue());
                            it7 = it7;
                        }
                        f15 = fFloatValue2 - fFloatValue;
                        linkedHashMap2 = new LinkedHashMap();
                        it8 = arrayList3.iterator();
                        i17 = 0;
                        while (true) {
                            if (it8.hasNext()) {
                                arrayList5 = arrayList2;
                                break;
                            }
                            next = it8.next();
                            i18 = i17 + 1;
                            if (i17 >= 0) {
                                x.q();
                                throw null;
                            }
                            fFloatValue3 = ((Number) next).floatValue();
                            arrayList5 = arrayList2;
                            if (i17 == arrayList3.size() - 1) {
                                fFloatValue3 = fFloatValue2;
                            }
                            if (i17 == 0) {
                                f16 = 0.0f;
                            } else {
                                f16 = (fFloatValue3 - fFloatValue) / f15;
                            }
                            if (f16 >= 1.0f) {
                                f16 = 1.0f;
                            }
                            if (i17 < arrayList4.size()) {
                                linkedHashMap2.put(Float.valueOf(f16), arrayList4.get(i17));
                            }
                            if (f16 == 1.0f) {
                                break;
                            }
                            i17 = i18;
                            arrayList2 = arrayList5;
                        }
                        mapK = i53.a.k(new TreeMap(linkedHashMap2));
                        x1 x1Var3 = p3.n.f135158a;
                        o0VarE.f();
                    }
                    Set<Map.Entry> setEntrySet = mapK.entrySet();
                    arrayList6 = new ArrayList(y.r(setEntrySet, 10));
                    for (Map.Entry entry : setEntrySet) {
                        arrayList6.add(new o13.p(entry.getKey(), entry.getValue()));
                    }
                    Iterable<Map.Entry> iterableEntrySet = b(linkedHashMap, arrayList4, gVar3, o0VarE, 0).entrySet();
                    arrayList7 = new ArrayList(y.r(iterableEntrySet, 10));
                    for (Map.Entry entry2 : iterableEntrySet) {
                        arrayList7.add(new o13.p(entry2.getKey(), entry2.getValue()));
                    }
                    if (nVar != null) {
                        x0VarF = nVar.f125092b;
                    } else if (pVar != null) {
                        x0VarF = pVar.f125098b;
                    } else {
                        x0VarF = null;
                    }
                    if (x0VarF == null) {
                        o0VarE.C(-19419899);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                        z16 = false;
                    } else {
                        z16 = false;
                        o0VarE.C(-19421852);
                    }
                    o0VarE.g0(z16);
                    q0VarA = s0.a(s0Var3, str2, x0VarF, 0L, 1020);
                    i19 = (int) (q0VarA.f157282c & 4294967295L);
                    objQ = o0VarE.q();
                    m.f135153a.getClass();
                    c2565a = m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p0.n(null);
                        o0VarE.K(objQ);
                    }
                    p1Var = (p1) objQ;
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(null);
                        o0VarE.K(objQ2);
                    }
                    p1Var2 = (p1) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        objQ3 = n23.j.o(fG, o0VarE);
                    }
                    m1Var = (m1) objQ3;
                    if (nVar != null) {
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        f17 = j92.b.f97899b.f97918c + (i19 * 2);
                    } else {
                        f17 = 0.0f;
                    }
                    if (oVar != null || (listA = oVar.a()) == null) {
                        listA = j0.f134944a;
                    }
                    c2.j.f22691a.getClass();
                    kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    list = listA;
                    aVar = h4.d.a.f81536n;
                    zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
                    x1 x1Var4 = p3.n.f135158a;
                    gVar4 = gVar3;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = k.c(rVar, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    eVar = h5.g.a.f81810g;
                    b4.c(eVar, zVarA, o0VarE);
                    c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T) {
                        c2565a2 = c2565a;
                    } else {
                        c2565a2 = c2565a;
                        if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        }
                        fVar = h5.g.a.f81807d;
                        b4.c(fVar, rVarC, o0VarE);
                        b0Var = b0.f22601a;
                        aVar3 = r.S;
                        boolean z18 = z15;
                        f18 = f17;
                        r rVarA = b0Var.a(aVar3, 1.0f, z18);
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        iHashCode2 = Long.hashCode(o0VarE.U);
                        i2VarA1 = o0VarE.a0();
                        rVarC2 = k.c(rVarA, o0VarE);
                        if (cVar2 != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, z0VarD, o0VarE);
                        b4.c(c1623g, i2VarA1, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                        }
                        b4.c(fVar, rVarC2, o0VarE);
                        u uVar = u.f22885a;
                        r rVarD = x2.d(aVar3, 1.0f);
                        zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                        iHashCode3 = Long.hashCode(o0VarE.U);
                        i2VarA2 = o0VarE.a0();
                        rVarC3 = k.c(rVarD, o0VarE);
                        if (cVar2 != null) {
                            p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(eVar, zVarA2, o0VarE);
                        b4.c(c1623g, i2VarA2, o0VarE);
                        if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                        }
                        b4.c(fVar, rVarC3, o0VarE);
                        if (str != null) {
                            o0VarE.C(180871555);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97931h, o0VarE);
                            j92.b bVar2 = d92.b.f58625c;
                            bVar2.getClass();
                            j92.e eVar3 = j92.b.f97899b;
                            float f24 = eVar3.f97920e;
                            bVar2.getClass();
                            b0Var2 = b0Var;
                            i24 = i19;
                            aVar4 = aVar3;
                            arrayList9 = arrayList6;
                            arrayList8 = arrayList7;
                            q0Var = q0VarA;
                            r15 = 0;
                            mh.c(str, l.C(aVar3, 0.0f, f24, 0.0f, eVar3.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, o0VarE, (i29 >> 3) & 14, 0, 131068);
                            o0 o0Var = o0VarE;
                            o0Var.g0(false);
                            r16 = o0Var;
                        } else {
                            b0Var2 = b0Var;
                            aVar4 = aVar3;
                            r15 = 0;
                            o0 o0Var2 = o0VarE;
                            arrayList8 = arrayList7;
                            q0Var = q0VarA;
                            arrayList9 = arrayList6;
                            i24 = i19;
                            o0Var2.C(181127739);
                            o0Var2.g0(false);
                            r16 = o0Var2;
                        }
                        r rVarA2 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                        Unit unit = Unit.INSTANCE;
                        objQ4 = r16.q();
                        c2565a3 = c2565a2;
                        if (objQ4 == c2565a3) {
                            p1Var3 = p1Var;
                            objQ4 = new b(p1Var3);
                            r16.K(objQ4);
                        } else {
                            p1Var3 = r33;
                        }
                        r rVarB = b5.s0.b(rVarA2, unit, (PointerInputEventHandler) objQ4);
                        if (pVar != null) {
                            r16.C(837159311);
                            fX = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(837159817);
                            r16.g0(r15);
                            fX = (float) r15;
                        }
                        float f25 = fX;
                        if (pVar != null) {
                            r16.C(182223279);
                            r16.g0(r15);
                        } else {
                            if (nVar != null) {
                                r16.C(182332430);
                                fX2 = w02.b0.x(r16, i24 / 2);
                                r16.g0(r15);
                            } else {
                                r16.C(182445487);
                                r16.g0(r15);
                            }
                            float f26 = fX2;
                            if (nVar != null) {
                                r16.C(837174767);
                                fX3 = w02.b0.x(r16, i24 / 2);
                                r16.g0(r15);
                            } else {
                                r16.C(837175273);
                                r16.g0(r15);
                                fX3 = (float) r15;
                            }
                            r rVarC4 = l.C(rVarB, f26, f25, fX3, 0.0f, 8);
                            f19 = f18;
                            boolean z19 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                            arrayList10 = arrayList9;
                            arrayList11 = arrayList8;
                            arrayList12 = arrayList5;
                            int i30 = (((z19 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                            if ((i29 & 7168) == 2048) {
                                r17 = 1;
                            } else {
                                r17 = r15;
                            }
                            int i34 = r17 | i30;
                            if ((3670016 & i29) == 1048576) {
                                r18 = 1;
                            } else {
                                r18 = r15;
                            }
                            ?? r28 = i34 | r18;
                            if ((i28 & 14) != 4) {
                                r19 = r15;
                            } else {
                                r19 = 1;
                            }
                            int i35 = (r28 == true ? 1 : 0) | r19;
                            q0Var2 = q0Var;
                            i25 = i35 | (r16.r(q0Var2) ? 1 : 0);
                            objQ5 = r16.q();
                            if (i25 == 0 || objQ5 == c2565a3) {
                                ?? r29 = r16;
                                p1Var4 = p1Var2;
                                m1Var2 = m1Var;
                                e23.l lVar = new e23.l() { // from class: xe1.a
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // e23.l
                                    public final Object invoke(Object obj) throws Throwable {
                                        q4.f fVar2;
                                        float f27;
                                        float f28;
                                        float f29;
                                        m92.m dVar;
                                        m92.m dVar2;
                                        Float fValueOf;
                                        ArrayList arrayList13 = arrayList;
                                        q0 q0Var3 = q0Var2;
                                        long j8 = q0Var3.f157282c;
                                        ArrayList arrayList14 = arrayList10;
                                        ArrayList arrayList15 = arrayList11;
                                        ArrayList arrayList16 = arrayList12;
                                        boolean z24 = z14;
                                        Float f34 = f14;
                                        p1 p1Var5 = p1Var4;
                                        q4.f fVar3 = (q4.f) obj;
                                        fVar3.getClass();
                                        p pVar3 = pVar;
                                        List<o13.p<Float, String>> list2 = list;
                                        float f35 = f19;
                                        float f36 = fG;
                                        m1 m1Var3 = m1Var2;
                                        if (pVar3 != null) {
                                            float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                            d92.b.f58623a.getClass();
                                            d92.b.f58625c.getClass();
                                            m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                        }
                                        float floatValue = m1Var3.getFloatValue();
                                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                        float f38 = 2;
                                        try {
                                            g6.f.a aVar9 = g6.f.f75994b;
                                            Float fValueOf2 = null;
                                            if (arrayList13.isEmpty()) {
                                                d0.f128823b.getClass();
                                                dVar = new m92.m.d(d0.f128831j, null);
                                            } else {
                                                u1.f129010b.getClass();
                                                dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                            }
                                            if (arrayList13.isEmpty()) {
                                                d0.f128823b.getClass();
                                                dVar2 = new m92.m.d(d0.f128831j, null);
                                            } else {
                                                u1.f129010b.getClass();
                                                dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                            }
                                            float f39 = 4;
                                            List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                            if (arrayList13.isEmpty()) {
                                                fValueOf = Float.valueOf(160.0f);
                                            } else {
                                                o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                                fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                            }
                                            if (arrayList13.isEmpty()) {
                                                fValueOf2 = Float.valueOf(200.0f);
                                            } else {
                                                o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                                if (pVar5 != null) {
                                                    fValueOf2 = (Float) pVar5.f128594a;
                                                }
                                            }
                                            fVar2 = fVar3;
                                            f28 = f35;
                                            f27 = f36;
                                            List list3 = listB1;
                                            f29 = -0.0f;
                                            try {
                                                p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                                float f44 = -f27;
                                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f28);
                                                n nVar2 = nVar;
                                                if (nVar2 != null) {
                                                    float floatValue2 = m1Var3.getFloatValue();
                                                    fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f27, 0.0f);
                                                    try {
                                                        nVar2.a(fVar2, f28 * 1.1f);
                                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    } catch (Throwable th3) {
                                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                        throw th3;
                                                    }
                                                }
                                                if (arrayList13.isEmpty()) {
                                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                    n4.c.a aVar10 = n4.c.f123541b;
                                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                                }
                                                return Unit.INSTANCE;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                fVar2.getF142543b().f142550a.e(-floatValue, f29, -f27, -f28);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            fVar2 = fVar3;
                                            f27 = f36;
                                            f28 = f35;
                                            f29 = -0.0f;
                                        }
                                    }
                                };
                                f19 = f19;
                                r29.K(lVar);
                                objQ5 = lVar;
                                r24 = r29;
                            } else {
                                r24 = r16;
                                p1Var4 = p1Var2;
                                m1Var2 = m1Var;
                            }
                            u1.n.b(rVarC4, (e23.l) objQ5, r24, 0);
                            r24.g0(true);
                            if (qVar != null) {
                                r24.C(386817103);
                                map = (Map) p1Var4.getF182175a();
                                if (map == null) {
                                    r24.C(-893571694);
                                    r24.g0(false);
                                    r27 = r24;
                                } else {
                                    r24.C(-893571693);
                                    cVar = (n4.c) p1Var3.getF182175a();
                                    if (cVar == null) {
                                        r24.C(367821440);
                                        r24.g0(false);
                                        r26 = r24;
                                    } else {
                                        r24.C(367821441);
                                        ?? r110 = r24;
                                        m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r110, 24576, 32);
                                        ?? r34 = r110;
                                        r34.g0(false);
                                        r26 = r34;
                                    }
                                    r26.g0(false);
                                    r27 = r26;
                                }
                                r27.g0(false);
                                r25 = r27;
                            } else {
                                ?? r35 = r24;
                                r35.C(-893344463);
                                r35.g0(false);
                                r25 = r35;
                            }
                            r25.g0(true);
                            r25.g0(true);
                            gVar2 = gVar4;
                            r14 = r25;
                        }
                        fX2 = (float) r15;
                        float f27 = fX2;
                        if (nVar != null) {
                            r16.C(837174767);
                            fX3 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(837175273);
                            r16.g0(r15);
                            fX3 = (float) r15;
                        }
                        r rVarC5 = l.C(rVarB, f27, f25, fX3, 0.0f, 8);
                        f19 = f18;
                        boolean z110 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                        arrayList10 = arrayList9;
                        arrayList11 = arrayList8;
                        arrayList12 = arrayList5;
                        int i36 = (((z110 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                        if ((i29 & 7168) == 2048) {
                            r17 = 1;
                        } else {
                            r17 = r15;
                        }
                        int i37 = r17 | i36;
                        if ((3670016 & i29) == 1048576) {
                            r18 = 1;
                        } else {
                            r18 = r15;
                        }
                        ?? r210 = i37 | r18;
                        if ((i28 & 14) != 4) {
                            r19 = r15;
                        } else {
                            r19 = 1;
                        }
                        int i38 = (r210 == true ? 1 : 0) | r19;
                        q0Var2 = q0Var;
                        i25 = i38 | (r16.r(q0Var2) ? 1 : 0);
                        objQ5 = r16.q();
                        if (i25 == 0) {
                            ?? r211 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar2 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f28;
                                    float f29;
                                    float f210;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar3 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar3 != null) {
                                        float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar9 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                            if (pVar5 != null) {
                                                fValueOf2 = (Float) pVar5.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f29 = f35;
                                        f28 = f36;
                                        List list3 = listB1;
                                        f210 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f28;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f29);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f28, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f29 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar10 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f210, -f28, -f29);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f28 = f36;
                                        f29 = f35;
                                        f210 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r211.K(lVar2);
                            objQ5 = lVar2;
                            r24 = r211;
                        } else {
                            ?? r212 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar3 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f28;
                                    float f29;
                                    float f210;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar3 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar3 != null) {
                                        float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar9 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                            if (pVar5 != null) {
                                                fValueOf2 = (Float) pVar5.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f29 = f35;
                                        f28 = f36;
                                        List list3 = listB1;
                                        f210 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f28;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f29);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f28, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f29 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar10 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f210, -f28, -f29);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f28 = f36;
                                        f29 = f35;
                                        f210 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r212.K(lVar3);
                            objQ5 = lVar3;
                            r24 = r212;
                        }
                        u1.n.b(rVarC5, (e23.l) objQ5, r24, 0);
                        r24.g0(true);
                        if (qVar != null) {
                            r24.C(386817103);
                            map = (Map) p1Var4.getF182175a();
                            if (map == null) {
                                r24.C(-893571694);
                                r24.g0(false);
                                r27 = r24;
                            } else {
                                r24.C(-893571693);
                                cVar = (n4.c) p1Var3.getF182175a();
                                if (cVar == null) {
                                    r24.C(367821440);
                                    r24.g0(false);
                                    r26 = r24;
                                } else {
                                    r24.C(367821441);
                                    ?? r111 = r24;
                                    m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r111, 24576, 32);
                                    ?? r36 = r111;
                                    r36.g0(false);
                                    r26 = r36;
                                }
                                r26.g0(false);
                                r27 = r26;
                            }
                            r27.g0(false);
                            r25 = r27;
                        } else {
                            ?? r37 = r24;
                            r37.C(-893344463);
                            r37.g0(false);
                            r25 = r37;
                        }
                        r25.g0(true);
                        r25.g0(true);
                        gVar2 = gVar4;
                        r14 = r25;
                    }
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0Var = b0.f22601a;
                    aVar3 = r.S;
                    boolean z111 = z15;
                    f18 = f17;
                    r rVarA3 = b0Var.a(aVar3, 1.0f, z111);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarA3, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar2 = u.f22885a;
                    r rVarD2 = x2.d(aVar3, 1.0f);
                    zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = k.c(rVarD2, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    if (str != null) {
                        o0VarE.C(180871555);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(j92.f.f97931h, o0VarE);
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar4 = j92.b.f97899b;
                        float f28 = eVar4.f97920e;
                        bVar3.getClass();
                        b0Var2 = b0Var;
                        i24 = i19;
                        aVar4 = aVar3;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        r15 = 0;
                        mh.c(str, l.C(aVar3, 0.0f, f28, 0.0f, eVar4.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, o0VarE, (i29 >> 3) & 14, 0, 131068);
                        o0 o0Var3 = o0VarE;
                        o0Var3.g0(false);
                        r16 = o0Var3;
                    } else {
                        b0Var2 = b0Var;
                        aVar4 = aVar3;
                        r15 = 0;
                        o0 o0Var4 = o0VarE;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        arrayList9 = arrayList6;
                        i24 = i19;
                        o0Var4.C(181127739);
                        o0Var4.g0(false);
                        r16 = o0Var4;
                    }
                    r rVarA4 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                    Unit unit2 = Unit.INSTANCE;
                    objQ4 = r16.q();
                    c2565a3 = c2565a2;
                    if (objQ4 == c2565a3) {
                        p1Var3 = p1Var;
                        objQ4 = new b(p1Var3);
                        r16.K(objQ4);
                    } else {
                        p1Var3 = r33;
                    }
                    r rVarB2 = b5.s0.b(rVarA4, unit2, (PointerInputEventHandler) objQ4);
                    if (pVar != null) {
                        r16.C(837159311);
                        fX = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837159817);
                        r16.g0(r15);
                        fX = (float) r15;
                    }
                    float f29 = fX;
                    if (pVar != null) {
                        r16.C(182223279);
                        r16.g0(r15);
                    } else {
                        if (nVar != null) {
                            r16.C(182332430);
                            fX2 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(182445487);
                            r16.g0(r15);
                        }
                        float f210 = fX2;
                        if (nVar != null) {
                            r16.C(837174767);
                            fX3 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(837175273);
                            r16.g0(r15);
                            fX3 = (float) r15;
                        }
                        r rVarC6 = l.C(rVarB2, f210, f29, fX3, 0.0f, 8);
                        f19 = f18;
                        boolean z112 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                        arrayList10 = arrayList9;
                        arrayList11 = arrayList8;
                        arrayList12 = arrayList5;
                        int i39 = (((z112 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                        if ((i29 & 7168) == 2048) {
                            r17 = 1;
                        } else {
                            r17 = r15;
                        }
                        int i310 = r17 | i39;
                        if ((3670016 & i29) == 1048576) {
                            r18 = 1;
                        } else {
                            r18 = r15;
                        }
                        ?? r213 = i310 | r18;
                        if ((i28 & 14) != 4) {
                            r19 = r15;
                        } else {
                            r19 = 1;
                        }
                        int i311 = (r213 == true ? 1 : 0) | r19;
                        q0Var2 = q0Var;
                        i25 = i311 | (r16.r(q0Var2) ? 1 : 0);
                        objQ5 = r16.q();
                        if (i25 == 0) {
                            ?? r214 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar4 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f211;
                                    float f212;
                                    float f213;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar3 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar3 != null) {
                                        float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar9 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                            if (pVar5 != null) {
                                                fValueOf2 = (Float) pVar5.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f212 = f35;
                                        f211 = f36;
                                        List list3 = listB1;
                                        f213 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f211;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f212);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f211, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f212 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar10 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f213, -f211, -f212);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f211 = f36;
                                        f212 = f35;
                                        f213 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r214.K(lVar4);
                            objQ5 = lVar4;
                            r24 = r214;
                        } else {
                            ?? r215 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar5 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f211;
                                    float f212;
                                    float f213;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar3 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar3 != null) {
                                        float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar9 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                            if (pVar5 != null) {
                                                fValueOf2 = (Float) pVar5.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f212 = f35;
                                        f211 = f36;
                                        List list3 = listB1;
                                        f213 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f211;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f212);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f211, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f212 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar10 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f213, -f211, -f212);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f211 = f36;
                                        f212 = f35;
                                        f213 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r215.K(lVar5);
                            objQ5 = lVar5;
                            r24 = r215;
                        }
                        u1.n.b(rVarC6, (e23.l) objQ5, r24, 0);
                        r24.g0(true);
                        if (qVar != null) {
                            r24.C(386817103);
                            map = (Map) p1Var4.getF182175a();
                            if (map == null) {
                                r24.C(-893571694);
                                r24.g0(false);
                                r27 = r24;
                            } else {
                                r24.C(-893571693);
                                cVar = (n4.c) p1Var3.getF182175a();
                                if (cVar == null) {
                                    r24.C(367821440);
                                    r24.g0(false);
                                    r26 = r24;
                                } else {
                                    r24.C(367821441);
                                    ?? r112 = r24;
                                    m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r112, 24576, 32);
                                    ?? r38 = r112;
                                    r38.g0(false);
                                    r26 = r38;
                                }
                                r26.g0(false);
                                r27 = r26;
                            }
                            r27.g0(false);
                            r25 = r27;
                        } else {
                            ?? r39 = r24;
                            r39.C(-893344463);
                            r39.g0(false);
                            r25 = r39;
                        }
                        r25.g0(true);
                        r25.g0(true);
                        gVar2 = gVar4;
                        r14 = r25;
                    }
                    fX2 = (float) r15;
                    float f211 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC7 = l.C(rVarB2, f211, f29, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z113 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i312 = (((z113 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i313 = r17 | i312;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r216 = i313 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i314 = (r216 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i314 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r217 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar6 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f212;
                                float f213;
                                float f214;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar3 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar3 != null) {
                                    float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar9 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                        if (pVar5 != null) {
                                            fValueOf2 = (Float) pVar5.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f213 = f35;
                                    f212 = f36;
                                    List list3 = listB1;
                                    f214 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f212;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f213);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f212, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f213 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar10 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f214, -f212, -f213);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f212 = f36;
                                    f213 = f35;
                                    f214 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r217.K(lVar6);
                        objQ5 = lVar6;
                        r24 = r217;
                    } else {
                        ?? r218 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar7 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f212;
                                float f213;
                                float f214;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar3 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar3 != null) {
                                    float f37 = pVar3.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar9 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar4 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar4 != null ? (Float) pVar4.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.n0(list2);
                                        if (pVar5 != null) {
                                            fValueOf2 = (Float) pVar5.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f213 = f35;
                                    f212 = f36;
                                    List list3 = listB1;
                                    f214 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f212;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f213);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f212, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f213 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar10 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f214, -f212, -f213);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f212 = f36;
                                    f213 = f35;
                                    f214 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r218.K(lVar7);
                        objQ5 = lVar7;
                        r24 = r218;
                    }
                    u1.n.b(rVarC7, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r113 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r113, 24576, 32);
                                ?? r310 = r113;
                                r310.g0(false);
                                r26 = r310;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r311 = r24;
                        r311.C(-893344463);
                        r311.g0(false);
                        r25 = r311;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                }
                s0Var = s0Var2;
                if (s0Var == null) {
                    o0VarE.C(-19451350);
                    z15 = true;
                    s0Var3 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                    o0VarE.g0(false);
                } else {
                    z15 = true;
                    o0VarE.C(-19453272);
                    o0VarE.g0(false);
                    s0Var3 = s0Var;
                }
                arrayList2 = new ArrayList(y.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar6 = ((ve1.a) it.next()).f177668a;
                    if (aVar6 == null) {
                        aVar6 = new h0.e.a(0.0f, 0.0f);
                    }
                    arrayList2.add(aVar6);
                }
                arrayList3 = new ArrayList(y.r(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    aVar5 = ((ve1.a) it3.next()).f177668a;
                    if (aVar5 != null) {
                        f22 = aVar5.f117347b;
                    } else {
                        f22 = 0.0f;
                    }
                    arrayList3.add(Float.valueOf(f22));
                }
                o0VarE.C(-19440435);
                arrayList4 = new ArrayList(y.r(arrayList, 10));
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    eVar2 = ((ve1.a) it4.next()).f177669b;
                    if (eVar2 == null) {
                        o0VarE.C(-1322199822);
                        z17 = false;
                        o0VarE.g0(false);
                        d0VarA = null;
                    } else {
                        o0VarE.C(-1982314257);
                        long jA3 = af1.f.a(eVar2, o0VarE);
                        z17 = false;
                        o0VarE.g0(false);
                        d0VarA = d0.a(jA3);
                    }
                    if (d0VarA == null) {
                        o0VarE.C(-1982312625);
                        jA = af1.f.a(af1.e.f3079l, o0VarE);
                        o0VarE.g0(z17);
                    } else {
                        o0VarE.C(-1982314795);
                        o0VarE.g0(z17);
                        jA = d0VarA.f128833a;
                    }
                    arrayList4.add(d0.a(jA));
                }
                o0VarE.g0(false);
                iA = t0.a(y.r(arrayList2, 10));
                if (iA < 16) {
                    i16 = 16;
                } else {
                    i16 = iA;
                }
                linkedHashMap = new LinkedHashMap(i16);
                it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    h0.e.a aVar9 = (h0.e.a) it5.next();
                    Iterator it10 = it5;
                    o13.p pVar3 = new o13.p(Float.valueOf(aVar9.f117346a), Float.valueOf(aVar9.f117347b));
                    linkedHashMap.put(pVar3.f128594a, pVar3.f128595b);
                    it5 = it10;
                }
                o0VarE.C(1072240812);
                x1 x1Var5 = p3.n.f135158a;
                if (linkedHashMap.isEmpty()) {
                    k0 k0Var2 = k0.f134949a;
                    k0Var2.getClass();
                    mapK = i53.a.g(k0Var2);
                    o0VarE.f();
                    arrayList5 = arrayList2;
                } else {
                    it6 = linkedHashMap.entrySet().iterator();
                    if (it6.hasNext()) {
                        t.g();
                        return;
                    }
                    fFloatValue = ((Number) ((Map.Entry) it6.next()).getValue()).floatValue();
                    while (it6.hasNext()) {
                        fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it6.next()).getValue()).floatValue());
                    }
                    it7 = linkedHashMap.entrySet().iterator();
                    if (it7.hasNext()) {
                        t.g();
                        return;
                    }
                    fFloatValue2 = ((Number) ((Map.Entry) it7.next()).getValue()).floatValue();
                    while (it7.hasNext()) {
                        fFloatValue2 = Math.max(fFloatValue2, ((Number) ((Map.Entry) it7.next()).getValue()).floatValue());
                        it7 = it7;
                    }
                    f15 = fFloatValue2 - fFloatValue;
                    linkedHashMap2 = new LinkedHashMap();
                    it8 = arrayList3.iterator();
                    i17 = 0;
                    while (true) {
                        if (it8.hasNext()) {
                            arrayList5 = arrayList2;
                            break;
                        }
                        next = it8.next();
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            x.q();
                            throw null;
                        }
                        fFloatValue3 = ((Number) next).floatValue();
                        arrayList5 = arrayList2;
                        if (i17 == arrayList3.size() - 1) {
                            fFloatValue3 = fFloatValue2;
                        }
                        if (i17 == 0) {
                            f16 = 0.0f;
                        } else {
                            f16 = (fFloatValue3 - fFloatValue) / f15;
                        }
                        if (f16 >= 1.0f) {
                            f16 = 1.0f;
                        }
                        if (i17 < arrayList4.size()) {
                            linkedHashMap2.put(Float.valueOf(f16), arrayList4.get(i17));
                        }
                        if (f16 == 1.0f) {
                            break;
                            break;
                        } else {
                            i17 = i18;
                            arrayList2 = arrayList5;
                        }
                    }
                    mapK = i53.a.k(new TreeMap(linkedHashMap2));
                    x1 x1Var6 = p3.n.f135158a;
                    o0VarE.f();
                }
                Set<Map.Entry> setEntrySet2 = mapK.entrySet();
                arrayList6 = new ArrayList(y.r(setEntrySet2, 10));
                while (r3.hasNext()) {
                    arrayList6.add(new o13.p(entry.getKey(), entry.getValue()));
                }
                Iterable<Map.Entry> iterableEntrySet2 = b(linkedHashMap, arrayList4, gVar3, o0VarE, 0).entrySet();
                arrayList7 = new ArrayList(y.r(iterableEntrySet2, 10));
                while (r2.hasNext()) {
                    arrayList7.add(new o13.p(entry2.getKey(), entry2.getValue()));
                }
                if (nVar != null) {
                    x0VarF = nVar.f125092b;
                } else if (pVar != null) {
                    x0VarF = pVar.f125098b;
                } else {
                    x0VarF = null;
                }
                if (x0VarF == null) {
                    o0VarE.C(-19419899);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                    z16 = false;
                } else {
                    z16 = false;
                    o0VarE.C(-19421852);
                }
                o0VarE.g0(z16);
                q0VarA = s0.a(s0Var3, str2, x0VarF, 0L, 1020);
                i19 = (int) (q0VarA.f157282c & 4294967295L);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(null);
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = n23.j.o(fG, o0VarE);
                }
                m1Var = (m1) objQ3;
                if (nVar != null) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97918c + (i19 * 2);
                } else {
                    f17 = 0.0f;
                }
                if (oVar != null) {
                    listA = j0.f134944a;
                } else {
                    listA = j0.f134944a;
                }
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                list = listA;
                aVar = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
                x1 x1Var7 = p3.n.f135158a;
                gVar4 = gVar3;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    c2565a2 = c2565a;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0Var = b0.f22601a;
                    aVar3 = r.S;
                    boolean z114 = z15;
                    f18 = f17;
                    r rVarA5 = b0Var.a(aVar3, 1.0f, z114);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarA5, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar3 = u.f22885a;
                    r rVarD3 = x2.d(aVar3, 1.0f);
                    zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = k.c(rVarD3, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    if (str != null) {
                        o0VarE.C(180871555);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB3 = d92.c.b(j92.f.f97931h, o0VarE);
                        j92.b bVar4 = d92.b.f58625c;
                        bVar4.getClass();
                        j92.e eVar5 = j92.b.f97899b;
                        float f212 = eVar5.f97920e;
                        bVar4.getClass();
                        b0Var2 = b0Var;
                        i24 = i19;
                        aVar4 = aVar3;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        r15 = 0;
                        mh.c(str, l.C(aVar3, 0.0f, f212, 0.0f, eVar5.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB3, o0VarE, (i29 >> 3) & 14, 0, 131068);
                        o0 o0Var5 = o0VarE;
                        o0Var5.g0(false);
                        r16 = o0Var5;
                    } else {
                        b0Var2 = b0Var;
                        aVar4 = aVar3;
                        r15 = 0;
                        o0 o0Var6 = o0VarE;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        arrayList9 = arrayList6;
                        i24 = i19;
                        o0Var6.C(181127739);
                        o0Var6.g0(false);
                        r16 = o0Var6;
                    }
                    r rVarA6 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                    Unit unit3 = Unit.INSTANCE;
                    objQ4 = r16.q();
                    c2565a3 = c2565a2;
                    if (objQ4 == c2565a3) {
                        p1Var3 = p1Var;
                        objQ4 = new b(p1Var3);
                        r16.K(objQ4);
                    } else {
                        p1Var3 = r33;
                    }
                    r rVarB3 = b5.s0.b(rVarA6, unit3, (PointerInputEventHandler) objQ4);
                    if (pVar != null) {
                        r16.C(837159311);
                        fX = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837159817);
                        r16.g0(r15);
                        fX = (float) r15;
                    }
                    float f213 = fX;
                    if (pVar != null) {
                        r16.C(182223279);
                        r16.g0(r15);
                    } else {
                        if (nVar != null) {
                            r16.C(182332430);
                            fX2 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(182445487);
                            r16.g0(r15);
                        }
                        float f214 = fX2;
                        if (nVar != null) {
                            r16.C(837174767);
                            fX3 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(837175273);
                            r16.g0(r15);
                            fX3 = (float) r15;
                        }
                        r rVarC8 = l.C(rVarB3, f214, f213, fX3, 0.0f, 8);
                        f19 = f18;
                        boolean z115 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                        arrayList10 = arrayList9;
                        arrayList11 = arrayList8;
                        arrayList12 = arrayList5;
                        int i315 = (((z115 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                        if ((i29 & 7168) == 2048) {
                            r17 = 1;
                        } else {
                            r17 = r15;
                        }
                        int i316 = r17 | i315;
                        if ((3670016 & i29) == 1048576) {
                            r18 = 1;
                        } else {
                            r18 = r15;
                        }
                        ?? r219 = i316 | r18;
                        if ((i28 & 14) != 4) {
                            r19 = r15;
                        } else {
                            r19 = 1;
                        }
                        int i317 = (r219 == true ? 1 : 0) | r19;
                        q0Var2 = q0Var;
                        i25 = i317 | (r16.r(q0Var2) ? 1 : 0);
                        objQ5 = r16.q();
                        if (i25 == 0) {
                            ?? r2110 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar8 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f215;
                                    float f216;
                                    float f217;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar4 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar4 != null) {
                                        float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar10 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                            if (pVar6 != null) {
                                                fValueOf2 = (Float) pVar6.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f216 = f35;
                                        f215 = f36;
                                        List list3 = listB1;
                                        f217 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f215;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f216);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f215, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f216 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar11 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f217, -f215, -f216);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f215 = f36;
                                        f216 = f35;
                                        f217 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r2110.K(lVar8);
                            objQ5 = lVar8;
                            r24 = r2110;
                        } else {
                            ?? r2111 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar9 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f215;
                                    float f216;
                                    float f217;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar4 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar4 != null) {
                                        float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar10 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                            if (pVar6 != null) {
                                                fValueOf2 = (Float) pVar6.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f216 = f35;
                                        f215 = f36;
                                        List list3 = listB1;
                                        f217 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f215;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f216);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f215, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f216 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar11 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f217, -f215, -f216);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f215 = f36;
                                        f216 = f35;
                                        f217 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r2111.K(lVar9);
                            objQ5 = lVar9;
                            r24 = r2111;
                        }
                        u1.n.b(rVarC8, (e23.l) objQ5, r24, 0);
                        r24.g0(true);
                        if (qVar != null) {
                            r24.C(386817103);
                            map = (Map) p1Var4.getF182175a();
                            if (map == null) {
                                r24.C(-893571694);
                                r24.g0(false);
                                r27 = r24;
                            } else {
                                r24.C(-893571693);
                                cVar = (n4.c) p1Var3.getF182175a();
                                if (cVar == null) {
                                    r24.C(367821440);
                                    r24.g0(false);
                                    r26 = r24;
                                } else {
                                    r24.C(367821441);
                                    ?? r114 = r24;
                                    m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r114, 24576, 32);
                                    ?? r312 = r114;
                                    r312.g0(false);
                                    r26 = r312;
                                }
                                r26.g0(false);
                                r27 = r26;
                            }
                            r27.g0(false);
                            r25 = r27;
                        } else {
                            ?? r313 = r24;
                            r313.C(-893344463);
                            r313.g0(false);
                            r25 = r313;
                        }
                        r25.g0(true);
                        r25.g0(true);
                        gVar2 = gVar4;
                        r14 = r25;
                    }
                    fX2 = (float) r15;
                    float f215 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC9 = l.C(rVarB3, f215, f213, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z116 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i318 = (((z116 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i319 = r17 | i318;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r2112 = i319 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i3110 = (r2112 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i3110 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r2113 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar10 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f216;
                                float f217;
                                float f218;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar4 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar4 != null) {
                                    float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar10 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                        if (pVar6 != null) {
                                            fValueOf2 = (Float) pVar6.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f217 = f35;
                                    f216 = f36;
                                    List list3 = listB1;
                                    f218 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f216;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f217);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f216, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f217 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar11 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f218, -f216, -f217);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f216 = f36;
                                    f217 = f35;
                                    f218 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r2113.K(lVar10);
                        objQ5 = lVar10;
                        r24 = r2113;
                    } else {
                        ?? r2114 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar11 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f216;
                                float f217;
                                float f218;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar4 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar4 != null) {
                                    float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar10 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                        if (pVar6 != null) {
                                            fValueOf2 = (Float) pVar6.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f217 = f35;
                                    f216 = f36;
                                    List list3 = listB1;
                                    f218 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f216;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f217);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f216, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f217 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar11 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f218, -f216, -f217);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f216 = f36;
                                    f217 = f35;
                                    f218 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r2114.K(lVar11);
                        objQ5 = lVar11;
                        r24 = r2114;
                    }
                    u1.n.b(rVarC9, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r115 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r115, 24576, 32);
                                ?? r314 = r115;
                                r314.g0(false);
                                r26 = r314;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r315 = r24;
                        r315.C(-893344463);
                        r315.g0(false);
                        r25 = r315;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                } else {
                    c2565a2 = c2565a;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = b0.f22601a;
                aVar3 = r.S;
                boolean z117 = z15;
                f18 = f17;
                r rVarA7 = b0Var.a(aVar3, 1.0f, z117);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarA7, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar4 = u.f22885a;
                r rVarD4 = x2.d(aVar3, 1.0f);
                zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(rVarD4, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                if (str != null) {
                    o0VarE.C(180871555);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB4 = d92.c.b(j92.f.f97931h, o0VarE);
                    j92.b bVar5 = d92.b.f58625c;
                    bVar5.getClass();
                    j92.e eVar6 = j92.b.f97899b;
                    float f216 = eVar6.f97920e;
                    bVar5.getClass();
                    b0Var2 = b0Var;
                    i24 = i19;
                    aVar4 = aVar3;
                    arrayList9 = arrayList6;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    r15 = 0;
                    mh.c(str, l.C(aVar3, 0.0f, f216, 0.0f, eVar6.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB4, o0VarE, (i29 >> 3) & 14, 0, 131068);
                    o0 o0Var7 = o0VarE;
                    o0Var7.g0(false);
                    r16 = o0Var7;
                } else {
                    b0Var2 = b0Var;
                    aVar4 = aVar3;
                    r15 = 0;
                    o0 o0Var8 = o0VarE;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    arrayList9 = arrayList6;
                    i24 = i19;
                    o0Var8.C(181127739);
                    o0Var8.g0(false);
                    r16 = o0Var8;
                }
                r rVarA8 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                Unit unit4 = Unit.INSTANCE;
                objQ4 = r16.q();
                c2565a3 = c2565a2;
                if (objQ4 == c2565a3) {
                    p1Var3 = p1Var;
                    objQ4 = new b(p1Var3);
                    r16.K(objQ4);
                } else {
                    p1Var3 = r33;
                }
                r rVarB4 = b5.s0.b(rVarA8, unit4, (PointerInputEventHandler) objQ4);
                if (pVar != null) {
                    r16.C(837159311);
                    fX = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837159817);
                    r16.g0(r15);
                    fX = (float) r15;
                }
                float f217 = fX;
                if (pVar != null) {
                    r16.C(182223279);
                    r16.g0(r15);
                } else {
                    if (nVar != null) {
                        r16.C(182332430);
                        fX2 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(182445487);
                        r16.g0(r15);
                    }
                    float f218 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC10 = l.C(rVarB4, f218, f217, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z118 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i3111 = (((z118 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i3112 = r17 | i3111;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r2115 = i3112 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i3113 = (r2115 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i3113 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r2116 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar12 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f219;
                                float f2110;
                                float f2111;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar4 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar4 != null) {
                                    float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar10 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                        if (pVar6 != null) {
                                            fValueOf2 = (Float) pVar6.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2110 = f35;
                                    f219 = f36;
                                    List list3 = listB1;
                                    f2111 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f219;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2110);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f219, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2110 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar11 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2111, -f219, -f2110);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f219 = f36;
                                    f2110 = f35;
                                    f2111 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r2116.K(lVar12);
                        objQ5 = lVar12;
                        r24 = r2116;
                    } else {
                        ?? r2117 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar13 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f219;
                                float f2110;
                                float f2111;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar4 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar4 != null) {
                                    float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar10 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                        if (pVar6 != null) {
                                            fValueOf2 = (Float) pVar6.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2110 = f35;
                                    f219 = f36;
                                    List list3 = listB1;
                                    f2111 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f219;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2110);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f219, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2110 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar11 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2111, -f219, -f2110);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f219 = f36;
                                    f2110 = f35;
                                    f2111 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r2117.K(lVar13);
                        objQ5 = lVar13;
                        r24 = r2117;
                    }
                    u1.n.b(rVarC10, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r116 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r116, 24576, 32);
                                ?? r316 = r116;
                                r316.g0(false);
                                r26 = r316;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r317 = r24;
                        r317.C(-893344463);
                        r317.g0(false);
                        r25 = r317;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                }
                fX2 = (float) r15;
                float f219 = fX2;
                if (nVar != null) {
                    r16.C(837174767);
                    fX3 = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837175273);
                    r16.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC11 = l.C(rVarB4, f219, f217, fX3, 0.0f, 8);
                f19 = f18;
                boolean z119 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                arrayList10 = arrayList9;
                arrayList11 = arrayList8;
                arrayList12 = arrayList5;
                int i3114 = (((z119 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                if ((i29 & 7168) == 2048) {
                    r17 = 1;
                } else {
                    r17 = r15;
                }
                int i3115 = r17 | i3114;
                if ((3670016 & i29) == 1048576) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                ?? r2118 = i3115 | r18;
                if ((i28 & 14) != 4) {
                    r19 = r15;
                } else {
                    r19 = 1;
                }
                int i3116 = (r2118 == true ? 1 : 0) | r19;
                q0Var2 = q0Var;
                i25 = i3116 | (r16.r(q0Var2) ? 1 : 0);
                objQ5 = r16.q();
                if (i25 == 0) {
                    ?? r2119 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar14 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f2110;
                            float f2111;
                            float f2112;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar4 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar4 != null) {
                                float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar10 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                    if (pVar6 != null) {
                                        fValueOf2 = (Float) pVar6.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f2111 = f35;
                                f2110 = f36;
                                List list3 = listB1;
                                f2112 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f2110;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2111);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2110, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f2111 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar11 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f2112, -f2110, -f2111);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f2110 = f36;
                                f2111 = f35;
                                f2112 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r2119.K(lVar14);
                    objQ5 = lVar14;
                    r24 = r2119;
                } else {
                    ?? r21110 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar15 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f2110;
                            float f2111;
                            float f2112;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar4 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar4 != null) {
                                float f37 = pVar4.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar10 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar5 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar5 != null ? (Float) pVar5.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar6 = (o13.p) p13.h0.n0(list2);
                                    if (pVar6 != null) {
                                        fValueOf2 = (Float) pVar6.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f2111 = f35;
                                f2110 = f36;
                                List list3 = listB1;
                                f2112 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f2110;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2111);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2110, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f2111 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar11 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f2112, -f2110, -f2111);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f2110 = f36;
                                f2111 = f35;
                                f2112 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r21110.K(lVar15);
                    objQ5 = lVar15;
                    r24 = r21110;
                }
                u1.n.b(rVarC11, (e23.l) objQ5, r24, 0);
                r24.g0(true);
                if (qVar != null) {
                    r24.C(386817103);
                    map = (Map) p1Var4.getF182175a();
                    if (map == null) {
                        r24.C(-893571694);
                        r24.g0(false);
                        r27 = r24;
                    } else {
                        r24.C(-893571693);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r24.C(367821440);
                            r24.g0(false);
                            r26 = r24;
                        } else {
                            r24.C(367821441);
                            ?? r117 = r24;
                            m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r117, 24576, 32);
                            ?? r318 = r117;
                            r318.g0(false);
                            r26 = r318;
                        }
                        r26.g0(false);
                        r27 = r26;
                    }
                    r27.g0(false);
                    r25 = r27;
                } else {
                    ?? r319 = r24;
                    r319.C(-893344463);
                    r319.g0(false);
                    r25 = r319;
                }
                r25.g0(true);
                r25.g0(true);
                gVar2 = gVar4;
                r14 = r25;
            } else {
                o0VarE.e();
            }
            gVar3 = gVar;
            o0VarE.h0();
            x1 x1Var8 = p3.n.f135158a;
            g6.f.a aVar10 = g6.f.f75994b;
            fG = w02.b0.g(0.0f / 4, o0VarE);
            if (nVar != null) {
                s0Var2 = nVar.f125091a;
            } else {
                if (pVar != null) {
                    s0Var2 = pVar.f125097a;
                } else {
                    s0Var = null;
                }
                if (s0Var == null) {
                    o0VarE.C(-19451350);
                    z15 = true;
                    s0Var3 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                    o0VarE.g0(false);
                } else {
                    z15 = true;
                    o0VarE.C(-19453272);
                    o0VarE.g0(false);
                    s0Var3 = s0Var;
                }
                arrayList2 = new ArrayList(y.r(arrayList, 10));
                it = arrayList.iterator();
                while (it.hasNext()) {
                    aVar6 = ((ve1.a) it.next()).f177668a;
                    if (aVar6 == null) {
                        aVar6 = new h0.e.a(0.0f, 0.0f);
                    }
                    arrayList2.add(aVar6);
                }
                arrayList3 = new ArrayList(y.r(arrayList, 10));
                it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    aVar5 = ((ve1.a) it3.next()).f177668a;
                    if (aVar5 != null) {
                        f22 = aVar5.f117347b;
                    } else {
                        f22 = 0.0f;
                    }
                    arrayList3.add(Float.valueOf(f22));
                }
                o0VarE.C(-19440435);
                arrayList4 = new ArrayList(y.r(arrayList, 10));
                it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    eVar2 = ((ve1.a) it4.next()).f177669b;
                    if (eVar2 == null) {
                        o0VarE.C(-1322199822);
                        z17 = false;
                        o0VarE.g0(false);
                        d0VarA = null;
                    } else {
                        o0VarE.C(-1982314257);
                        long jA4 = af1.f.a(eVar2, o0VarE);
                        z17 = false;
                        o0VarE.g0(false);
                        d0VarA = d0.a(jA4);
                    }
                    if (d0VarA == null) {
                        o0VarE.C(-1982312625);
                        jA = af1.f.a(af1.e.f3079l, o0VarE);
                        o0VarE.g0(z17);
                    } else {
                        o0VarE.C(-1982314795);
                        o0VarE.g0(z17);
                        jA = d0VarA.f128833a;
                    }
                    arrayList4.add(d0.a(jA));
                }
                o0VarE.g0(false);
                iA = t0.a(y.r(arrayList2, 10));
                if (iA < 16) {
                    i16 = 16;
                } else {
                    i16 = iA;
                }
                linkedHashMap = new LinkedHashMap(i16);
                it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    h0.e.a aVar11 = (h0.e.a) it5.next();
                    Iterator it11 = it5;
                    o13.p pVar4 = new o13.p(Float.valueOf(aVar11.f117346a), Float.valueOf(aVar11.f117347b));
                    linkedHashMap.put(pVar4.f128594a, pVar4.f128595b);
                    it5 = it11;
                }
                o0VarE.C(1072240812);
                x1 x1Var9 = p3.n.f135158a;
                if (linkedHashMap.isEmpty()) {
                    k0 k0Var3 = k0.f134949a;
                    k0Var3.getClass();
                    mapK = i53.a.g(k0Var3);
                    o0VarE.f();
                    arrayList5 = arrayList2;
                } else {
                    it6 = linkedHashMap.entrySet().iterator();
                    if (it6.hasNext()) {
                        t.g();
                        return;
                    }
                    fFloatValue = ((Number) ((Map.Entry) it6.next()).getValue()).floatValue();
                    while (it6.hasNext()) {
                        fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it6.next()).getValue()).floatValue());
                    }
                    it7 = linkedHashMap.entrySet().iterator();
                    if (it7.hasNext()) {
                        t.g();
                        return;
                    }
                    fFloatValue2 = ((Number) ((Map.Entry) it7.next()).getValue()).floatValue();
                    while (it7.hasNext()) {
                        fFloatValue2 = Math.max(fFloatValue2, ((Number) ((Map.Entry) it7.next()).getValue()).floatValue());
                        it7 = it7;
                    }
                    f15 = fFloatValue2 - fFloatValue;
                    linkedHashMap2 = new LinkedHashMap();
                    it8 = arrayList3.iterator();
                    i17 = 0;
                    while (true) {
                        if (it8.hasNext()) {
                            arrayList5 = arrayList2;
                            break;
                        }
                        next = it8.next();
                        i18 = i17 + 1;
                        if (i17 >= 0) {
                            x.q();
                            throw null;
                        }
                        fFloatValue3 = ((Number) next).floatValue();
                        arrayList5 = arrayList2;
                        if (i17 == arrayList3.size() - 1) {
                            fFloatValue3 = fFloatValue2;
                        }
                        if (i17 == 0) {
                            f16 = 0.0f;
                        } else {
                            f16 = (fFloatValue3 - fFloatValue) / f15;
                        }
                        if (f16 >= 1.0f) {
                            f16 = 1.0f;
                        }
                        if (i17 < arrayList4.size()) {
                            linkedHashMap2.put(Float.valueOf(f16), arrayList4.get(i17));
                        }
                        if (f16 == 1.0f) {
                            break;
                            break;
                        } else {
                            i17 = i18;
                            arrayList2 = arrayList5;
                        }
                    }
                    mapK = i53.a.k(new TreeMap(linkedHashMap2));
                    x1 x1Var10 = p3.n.f135158a;
                    o0VarE.f();
                }
                Set<Map.Entry> setEntrySet3 = mapK.entrySet();
                arrayList6 = new ArrayList(y.r(setEntrySet3, 10));
                while (r3.hasNext()) {
                    arrayList6.add(new o13.p(entry.getKey(), entry.getValue()));
                }
                Iterable<Map.Entry> iterableEntrySet3 = b(linkedHashMap, arrayList4, gVar3, o0VarE, 0).entrySet();
                arrayList7 = new ArrayList(y.r(iterableEntrySet3, 10));
                while (r2.hasNext()) {
                    arrayList7.add(new o13.p(entry2.getKey(), entry2.getValue()));
                }
                if (nVar != null) {
                    x0VarF = nVar.f125092b;
                } else if (pVar != null) {
                    x0VarF = pVar.f125098b;
                } else {
                    x0VarF = null;
                }
                if (x0VarF == null) {
                    o0VarE.C(-19419899);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                    z16 = false;
                } else {
                    z16 = false;
                    o0VarE.C(-19421852);
                }
                o0VarE.g0(z16);
                q0VarA = s0.a(s0Var3, str2, x0VarF, 0L, 1020);
                i19 = (int) (q0VarA.f157282c & 4294967295L);
                objQ = o0VarE.q();
                m.f135153a.getClass();
                c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p0.n(null);
                    o0VarE.K(objQ);
                }
                p1Var = (p1) objQ;
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(null);
                    o0VarE.K(objQ2);
                }
                p1Var2 = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    objQ3 = n23.j.o(fG, o0VarE);
                }
                m1Var = (m1) objQ3;
                if (nVar != null) {
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    f17 = j92.b.f97899b.f97918c + (i19 * 2);
                } else {
                    f17 = 0.0f;
                }
                if (oVar != null) {
                    listA = j0.f134944a;
                } else {
                    listA = j0.f134944a;
                }
                c2.j.f22691a.getClass();
                kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                list = listA;
                aVar = h4.d.a.f81536n;
                zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
                x1 x1Var11 = p3.n.f135158a;
                gVar4 = gVar3;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = k.c(rVar, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                eVar = h5.g.a.f81810g;
                b4.c(eVar, zVarA, o0VarE);
                c1623g = h5.g.a.f81809f;
                b4.c(c1623g, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    c2565a2 = c2565a;
                    if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    }
                    fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, o0VarE);
                    b0Var = b0.f22601a;
                    aVar3 = r.S;
                    boolean z1110 = z15;
                    f18 = f17;
                    r rVarA9 = b0Var.a(aVar3, 1.0f, z1110);
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    iHashCode2 = Long.hashCode(o0VarE.U);
                    i2VarA1 = o0VarE.a0();
                    rVarC2 = k.c(rVarA9, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, z0VarD, o0VarE);
                    b4.c(c1623g, i2VarA1, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    } else {
                        v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, o0VarE);
                    u uVar5 = u.f22885a;
                    r rVarD5 = x2.d(aVar3, 1.0f);
                    zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                    iHashCode3 = Long.hashCode(o0VarE.U);
                    i2VarA2 = o0VarE.a0();
                    rVarC3 = k.c(rVarD5, o0VarE);
                    if (cVar2 != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(eVar, zVarA2, o0VarE);
                    b4.c(c1623g, i2VarA2, o0VarE);
                    if (o0VarE.T) {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    } else {
                        v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, o0VarE);
                    if (str != null) {
                        o0VarE.C(180871555);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB5 = d92.c.b(j92.f.f97931h, o0VarE);
                        j92.b bVar6 = d92.b.f58625c;
                        bVar6.getClass();
                        j92.e eVar7 = j92.b.f97899b;
                        float f2110 = eVar7.f97920e;
                        bVar6.getClass();
                        b0Var2 = b0Var;
                        i24 = i19;
                        aVar4 = aVar3;
                        arrayList9 = arrayList6;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        r15 = 0;
                        mh.c(str, l.C(aVar3, 0.0f, f2110, 0.0f, eVar7.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB5, o0VarE, (i29 >> 3) & 14, 0, 131068);
                        o0 o0Var9 = o0VarE;
                        o0Var9.g0(false);
                        r16 = o0Var9;
                    } else {
                        b0Var2 = b0Var;
                        aVar4 = aVar3;
                        r15 = 0;
                        o0 o0Var10 = o0VarE;
                        arrayList8 = arrayList7;
                        q0Var = q0VarA;
                        arrayList9 = arrayList6;
                        i24 = i19;
                        o0Var10.C(181127739);
                        o0Var10.g0(false);
                        r16 = o0Var10;
                    }
                    r rVarA10 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                    Unit unit5 = Unit.INSTANCE;
                    objQ4 = r16.q();
                    c2565a3 = c2565a2;
                    if (objQ4 == c2565a3) {
                        p1Var3 = p1Var;
                        objQ4 = new b(p1Var3);
                        r16.K(objQ4);
                    } else {
                        p1Var3 = r33;
                    }
                    r rVarB5 = b5.s0.b(rVarA10, unit5, (PointerInputEventHandler) objQ4);
                    if (pVar != null) {
                        r16.C(837159311);
                        fX = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837159817);
                        r16.g0(r15);
                        fX = (float) r15;
                    }
                    float f2111 = fX;
                    if (pVar != null) {
                        r16.C(182223279);
                        r16.g0(r15);
                    } else {
                        if (nVar != null) {
                            r16.C(182332430);
                            fX2 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(182445487);
                            r16.g0(r15);
                        }
                        float f2112 = fX2;
                        if (nVar != null) {
                            r16.C(837174767);
                            fX3 = w02.b0.x(r16, i24 / 2);
                            r16.g0(r15);
                        } else {
                            r16.C(837175273);
                            r16.g0(r15);
                            fX3 = (float) r15;
                        }
                        r rVarC12 = l.C(rVarB5, f2112, f2111, fX3, 0.0f, 8);
                        f19 = f18;
                        boolean z1111 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                        arrayList10 = arrayList9;
                        arrayList11 = arrayList8;
                        arrayList12 = arrayList5;
                        int i3117 = (((z1111 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                        if ((i29 & 7168) == 2048) {
                            r17 = 1;
                        } else {
                            r17 = r15;
                        }
                        int i3118 = r17 | i3117;
                        if ((3670016 & i29) == 1048576) {
                            r18 = 1;
                        } else {
                            r18 = r15;
                        }
                        ?? r21111 = i3118 | r18;
                        if ((i28 & 14) != 4) {
                            r19 = r15;
                        } else {
                            r19 = 1;
                        }
                        int i3119 = (r21111 == true ? 1 : 0) | r19;
                        q0Var2 = q0Var;
                        i25 = i3119 | (r16.r(q0Var2) ? 1 : 0);
                        objQ5 = r16.q();
                        if (i25 == 0) {
                            ?? r21112 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar16 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f2113;
                                    float f2114;
                                    float f2115;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar5 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar5 != null) {
                                        float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar12 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                            if (pVar7 != null) {
                                                fValueOf2 = (Float) pVar7.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f2114 = f35;
                                        f2113 = f36;
                                        List list3 = listB1;
                                        f2115 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f2113;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2114);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2113, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f2114 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar13 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f2115, -f2113, -f2114);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f2113 = f36;
                                        f2114 = f35;
                                        f2115 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r21112.K(lVar16);
                            objQ5 = lVar16;
                            r24 = r21112;
                        } else {
                            ?? r21113 = r16;
                            p1Var4 = p1Var2;
                            m1Var2 = m1Var;
                            e23.l lVar17 = new e23.l() { // from class: xe1.a
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // e23.l
                                public final Object invoke(Object obj) throws Throwable {
                                    q4.f fVar2;
                                    float f2113;
                                    float f2114;
                                    float f2115;
                                    m92.m dVar;
                                    m92.m dVar2;
                                    Float fValueOf;
                                    ArrayList arrayList13 = arrayList;
                                    q0 q0Var3 = q0Var2;
                                    long j8 = q0Var3.f157282c;
                                    ArrayList arrayList14 = arrayList10;
                                    ArrayList arrayList15 = arrayList11;
                                    ArrayList arrayList16 = arrayList12;
                                    boolean z24 = z14;
                                    Float f34 = f14;
                                    p1 p1Var5 = p1Var4;
                                    q4.f fVar3 = (q4.f) obj;
                                    fVar3.getClass();
                                    p pVar5 = pVar;
                                    List<o13.p<Float, String>> list2 = list;
                                    float f35 = f19;
                                    float f36 = fG;
                                    m1 m1Var3 = m1Var2;
                                    if (pVar5 != null) {
                                        float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                        d92.b.f58623a.getClass();
                                        d92.b.f58625c.getClass();
                                        m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                    }
                                    float floatValue = m1Var3.getFloatValue();
                                    fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                    float f38 = 2;
                                    try {
                                        g6.f.a aVar12 = g6.f.f75994b;
                                        Float fValueOf2 = null;
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                        }
                                        if (arrayList13.isEmpty()) {
                                            d0.f128823b.getClass();
                                            dVar2 = new m92.m.d(d0.f128831j, null);
                                        } else {
                                            u1.f129010b.getClass();
                                            dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                        }
                                        float f39 = 4;
                                        List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                        if (arrayList13.isEmpty()) {
                                            fValueOf = Float.valueOf(160.0f);
                                        } else {
                                            o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                            fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                        }
                                        if (arrayList13.isEmpty()) {
                                            fValueOf2 = Float.valueOf(200.0f);
                                        } else {
                                            o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                            if (pVar7 != null) {
                                                fValueOf2 = (Float) pVar7.f128594a;
                                            }
                                        }
                                        fVar2 = fVar3;
                                        f2114 = f35;
                                        f2113 = f36;
                                        List list3 = listB1;
                                        f2115 = -0.0f;
                                        try {
                                            p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                            float f44 = -f2113;
                                            fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2114);
                                            n nVar2 = nVar;
                                            if (nVar2 != null) {
                                                float floatValue2 = m1Var3.getFloatValue();
                                                fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2113, 0.0f);
                                                try {
                                                    nVar2.a(fVar2, f2114 * 1.1f);
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                } catch (Throwable th3) {
                                                    fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                    throw th3;
                                                }
                                            }
                                            if (arrayList13.isEmpty()) {
                                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                                n4.c.a aVar13 = n4.c.f123541b;
                                                v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                            }
                                            return Unit.INSTANCE;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            fVar2.getF142543b().f142550a.e(-floatValue, f2115, -f2113, -f2114);
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fVar2 = fVar3;
                                        f2113 = f36;
                                        f2114 = f35;
                                        f2115 = -0.0f;
                                    }
                                }
                            };
                            f19 = f19;
                            r21113.K(lVar17);
                            objQ5 = lVar17;
                            r24 = r21113;
                        }
                        u1.n.b(rVarC12, (e23.l) objQ5, r24, 0);
                        r24.g0(true);
                        if (qVar != null) {
                            r24.C(386817103);
                            map = (Map) p1Var4.getF182175a();
                            if (map == null) {
                                r24.C(-893571694);
                                r24.g0(false);
                                r27 = r24;
                            } else {
                                r24.C(-893571693);
                                cVar = (n4.c) p1Var3.getF182175a();
                                if (cVar == null) {
                                    r24.C(367821440);
                                    r24.g0(false);
                                    r26 = r24;
                                } else {
                                    r24.C(367821441);
                                    ?? r118 = r24;
                                    m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r118, 24576, 32);
                                    ?? r3110 = r118;
                                    r3110.g0(false);
                                    r26 = r3110;
                                }
                                r26.g0(false);
                                r27 = r26;
                            }
                            r27.g0(false);
                            r25 = r27;
                        } else {
                            ?? r3111 = r24;
                            r3111.C(-893344463);
                            r3111.g0(false);
                            r25 = r3111;
                        }
                        r25.g0(true);
                        r25.g0(true);
                        gVar2 = gVar4;
                        r14 = r25;
                    }
                    fX2 = (float) r15;
                    float f2113 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC13 = l.C(rVarB5, f2113, f2111, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z1112 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i31110 = (((z1112 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i31111 = r17 | i31110;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r21114 = i31111 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i31112 = (r21114 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i31112 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r21115 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar18 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f2114;
                                float f2115;
                                float f2116;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar5 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar5 != null) {
                                    float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar12 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                        if (pVar7 != null) {
                                            fValueOf2 = (Float) pVar7.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2115 = f35;
                                    f2114 = f36;
                                    List list3 = listB1;
                                    f2116 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f2114;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2115);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2114, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2115 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar13 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2116, -f2114, -f2115);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f2114 = f36;
                                    f2115 = f35;
                                    f2116 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r21115.K(lVar18);
                        objQ5 = lVar18;
                        r24 = r21115;
                    } else {
                        ?? r21116 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar19 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f2114;
                                float f2115;
                                float f2116;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar5 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar5 != null) {
                                    float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar12 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                        if (pVar7 != null) {
                                            fValueOf2 = (Float) pVar7.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2115 = f35;
                                    f2114 = f36;
                                    List list3 = listB1;
                                    f2116 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f2114;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2115);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2114, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2115 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar13 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2116, -f2114, -f2115);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f2114 = f36;
                                    f2115 = f35;
                                    f2116 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r21116.K(lVar19);
                        objQ5 = lVar19;
                        r24 = r21116;
                    }
                    u1.n.b(rVarC13, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r119 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r119, 24576, 32);
                                ?? r3112 = r119;
                                r3112.g0(false);
                                r26 = r3112;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r3113 = r24;
                        r3113.C(-893344463);
                        r3113.g0(false);
                        r25 = r3113;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                } else {
                    c2565a2 = c2565a;
                }
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = b0.f22601a;
                aVar3 = r.S;
                boolean z1113 = z15;
                f18 = f17;
                r rVarA11 = b0Var.a(aVar3, 1.0f, z1113);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarA11, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar6 = u.f22885a;
                r rVarD6 = x2.d(aVar3, 1.0f);
                zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(rVarD6, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                if (str != null) {
                    o0VarE.C(180871555);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB6 = d92.c.b(j92.f.f97931h, o0VarE);
                    j92.b bVar7 = d92.b.f58625c;
                    bVar7.getClass();
                    j92.e eVar8 = j92.b.f97899b;
                    float f2114 = eVar8.f97920e;
                    bVar7.getClass();
                    b0Var2 = b0Var;
                    i24 = i19;
                    aVar4 = aVar3;
                    arrayList9 = arrayList6;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    r15 = 0;
                    mh.c(str, l.C(aVar3, 0.0f, f2114, 0.0f, eVar8.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB6, o0VarE, (i29 >> 3) & 14, 0, 131068);
                    o0 o0Var11 = o0VarE;
                    o0Var11.g0(false);
                    r16 = o0Var11;
                } else {
                    b0Var2 = b0Var;
                    aVar4 = aVar3;
                    r15 = 0;
                    o0 o0Var12 = o0VarE;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    arrayList9 = arrayList6;
                    i24 = i19;
                    o0Var12.C(181127739);
                    o0Var12.g0(false);
                    r16 = o0Var12;
                }
                r rVarA12 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                Unit unit6 = Unit.INSTANCE;
                objQ4 = r16.q();
                c2565a3 = c2565a2;
                if (objQ4 == c2565a3) {
                    p1Var3 = p1Var;
                    objQ4 = new b(p1Var3);
                    r16.K(objQ4);
                } else {
                    p1Var3 = r33;
                }
                r rVarB6 = b5.s0.b(rVarA12, unit6, (PointerInputEventHandler) objQ4);
                if (pVar != null) {
                    r16.C(837159311);
                    fX = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837159817);
                    r16.g0(r15);
                    fX = (float) r15;
                }
                float f2115 = fX;
                if (pVar != null) {
                    r16.C(182223279);
                    r16.g0(r15);
                } else {
                    if (nVar != null) {
                        r16.C(182332430);
                        fX2 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(182445487);
                        r16.g0(r15);
                    }
                    float f2116 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC14 = l.C(rVarB6, f2116, f2115, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z1114 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i31113 = (((z1114 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i31114 = r17 | i31113;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r21117 = i31114 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i31115 = (r21117 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i31115 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r21118 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar110 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f2117;
                                float f2118;
                                float f2119;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar5 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar5 != null) {
                                    float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar12 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                        if (pVar7 != null) {
                                            fValueOf2 = (Float) pVar7.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2118 = f35;
                                    f2117 = f36;
                                    List list3 = listB1;
                                    f2119 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f2117;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2118);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2117, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2118 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar13 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2119, -f2117, -f2118);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f2117 = f36;
                                    f2118 = f35;
                                    f2119 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r21118.K(lVar110);
                        objQ5 = lVar110;
                        r24 = r21118;
                    } else {
                        ?? r21119 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar111 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f2117;
                                float f2118;
                                float f2119;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar5 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar5 != null) {
                                    float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar12 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                        if (pVar7 != null) {
                                            fValueOf2 = (Float) pVar7.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f2118 = f35;
                                    f2117 = f36;
                                    List list3 = listB1;
                                    f2119 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f2117;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2118);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2117, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f2118 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar13 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f2119, -f2117, -f2118);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f2117 = f36;
                                    f2118 = f35;
                                    f2119 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r21119.K(lVar111);
                        objQ5 = lVar111;
                        r24 = r21119;
                    }
                    u1.n.b(rVarC14, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r1110 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1110, 24576, 32);
                                ?? r3114 = r1110;
                                r3114.g0(false);
                                r26 = r3114;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r3115 = r24;
                        r3115.C(-893344463);
                        r3115.g0(false);
                        r25 = r3115;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                }
                fX2 = (float) r15;
                float f2117 = fX2;
                if (nVar != null) {
                    r16.C(837174767);
                    fX3 = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837175273);
                    r16.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC15 = l.C(rVarB6, f2117, f2115, fX3, 0.0f, 8);
                f19 = f18;
                boolean z1115 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                arrayList10 = arrayList9;
                arrayList11 = arrayList8;
                arrayList12 = arrayList5;
                int i31116 = (((z1115 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                if ((i29 & 7168) == 2048) {
                    r17 = 1;
                } else {
                    r17 = r15;
                }
                int i31117 = r17 | i31116;
                if ((3670016 & i29) == 1048576) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                ?? r211110 = i31117 | r18;
                if ((i28 & 14) != 4) {
                    r19 = r15;
                } else {
                    r19 = 1;
                }
                int i31118 = (r211110 == true ? 1 : 0) | r19;
                q0Var2 = q0Var;
                i25 = i31118 | (r16.r(q0Var2) ? 1 : 0);
                objQ5 = r16.q();
                if (i25 == 0) {
                    ?? r211111 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar112 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f2118;
                            float f2119;
                            float f21110;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar5 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar5 != null) {
                                float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar12 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                    if (pVar7 != null) {
                                        fValueOf2 = (Float) pVar7.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f2119 = f35;
                                f2118 = f36;
                                List list3 = listB1;
                                f21110 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f2118;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2119);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2118, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f2119 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar13 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21110, -f2118, -f2119);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f2118 = f36;
                                f2119 = f35;
                                f21110 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r211111.K(lVar112);
                    objQ5 = lVar112;
                    r24 = r211111;
                } else {
                    ?? r211112 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar113 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f2118;
                            float f2119;
                            float f21110;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar5 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar5 != null) {
                                float f37 = pVar5.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar12 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar6 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar6 != null ? (Float) pVar6.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.n0(list2);
                                    if (pVar7 != null) {
                                        fValueOf2 = (Float) pVar7.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f2119 = f35;
                                f2118 = f36;
                                List list3 = listB1;
                                f21110 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f2118;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f2119);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f2118, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f2119 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar13 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21110, -f2118, -f2119);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f2118 = f36;
                                f2119 = f35;
                                f21110 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r211112.K(lVar113);
                    objQ5 = lVar113;
                    r24 = r211112;
                }
                u1.n.b(rVarC15, (e23.l) objQ5, r24, 0);
                r24.g0(true);
                if (qVar != null) {
                    r24.C(386817103);
                    map = (Map) p1Var4.getF182175a();
                    if (map == null) {
                        r24.C(-893571694);
                        r24.g0(false);
                        r27 = r24;
                    } else {
                        r24.C(-893571693);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r24.C(367821440);
                            r24.g0(false);
                            r26 = r24;
                        } else {
                            r24.C(367821441);
                            ?? r1111 = r24;
                            m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1111, 24576, 32);
                            ?? r3116 = r1111;
                            r3116.g0(false);
                            r26 = r3116;
                        }
                        r26.g0(false);
                        r27 = r26;
                    }
                    r27.g0(false);
                    r25 = r27;
                } else {
                    ?? r3117 = r24;
                    r3117.C(-893344463);
                    r3117.g0(false);
                    r25 = r3117;
                }
                r25.g0(true);
                r25.g0(true);
                gVar2 = gVar4;
                r14 = r25;
            }
            s0Var = s0Var2;
            if (s0Var == null) {
                o0VarE.C(-19451350);
                z15 = true;
                s0Var3 = new s0((w5.q.b) o0VarE.A(t1.f91493k), new g6.d(((g6.c) o0VarE.A(t1.f91490h)).getF75991a(), 1.0f), (g6.o) o0VarE.A(t1.f91496n), 0, 8, null);
                o0VarE.g0(false);
            } else {
                z15 = true;
                o0VarE.C(-19453272);
                o0VarE.g0(false);
                s0Var3 = s0Var;
            }
            arrayList2 = new ArrayList(y.r(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                aVar6 = ((ve1.a) it.next()).f177668a;
                if (aVar6 == null) {
                    aVar6 = new h0.e.a(0.0f, 0.0f);
                }
                arrayList2.add(aVar6);
            }
            arrayList3 = new ArrayList(y.r(arrayList, 10));
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                aVar5 = ((ve1.a) it3.next()).f177668a;
                if (aVar5 != null) {
                    f22 = aVar5.f117347b;
                } else {
                    f22 = 0.0f;
                }
                arrayList3.add(Float.valueOf(f22));
            }
            o0VarE.C(-19440435);
            arrayList4 = new ArrayList(y.r(arrayList, 10));
            it4 = arrayList.iterator();
            while (it4.hasNext()) {
                eVar2 = ((ve1.a) it4.next()).f177669b;
                if (eVar2 == null) {
                    o0VarE.C(-1322199822);
                    z17 = false;
                    o0VarE.g0(false);
                    d0VarA = null;
                } else {
                    o0VarE.C(-1982314257);
                    long jA5 = af1.f.a(eVar2, o0VarE);
                    z17 = false;
                    o0VarE.g0(false);
                    d0VarA = d0.a(jA5);
                }
                if (d0VarA == null) {
                    o0VarE.C(-1982312625);
                    jA = af1.f.a(af1.e.f3079l, o0VarE);
                    o0VarE.g0(z17);
                } else {
                    o0VarE.C(-1982314795);
                    o0VarE.g0(z17);
                    jA = d0VarA.f128833a;
                }
                arrayList4.add(d0.a(jA));
            }
            o0VarE.g0(false);
            iA = t0.a(y.r(arrayList2, 10));
            if (iA < 16) {
                i16 = 16;
            } else {
                i16 = iA;
            }
            linkedHashMap = new LinkedHashMap(i16);
            it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                h0.e.a aVar12 = (h0.e.a) it5.next();
                Iterator it12 = it5;
                o13.p pVar5 = new o13.p(Float.valueOf(aVar12.f117346a), Float.valueOf(aVar12.f117347b));
                linkedHashMap.put(pVar5.f128594a, pVar5.f128595b);
                it5 = it12;
            }
            o0VarE.C(1072240812);
            x1 x1Var12 = p3.n.f135158a;
            if (linkedHashMap.isEmpty()) {
                k0 k0Var4 = k0.f134949a;
                k0Var4.getClass();
                mapK = i53.a.g(k0Var4);
                o0VarE.f();
                arrayList5 = arrayList2;
            } else {
                it6 = linkedHashMap.entrySet().iterator();
                if (it6.hasNext()) {
                    t.g();
                    return;
                }
                fFloatValue = ((Number) ((Map.Entry) it6.next()).getValue()).floatValue();
                while (it6.hasNext()) {
                    fFloatValue = Math.min(fFloatValue, ((Number) ((Map.Entry) it6.next()).getValue()).floatValue());
                }
                it7 = linkedHashMap.entrySet().iterator();
                if (it7.hasNext()) {
                    t.g();
                    return;
                }
                fFloatValue2 = ((Number) ((Map.Entry) it7.next()).getValue()).floatValue();
                while (it7.hasNext()) {
                    fFloatValue2 = Math.max(fFloatValue2, ((Number) ((Map.Entry) it7.next()).getValue()).floatValue());
                    it7 = it7;
                }
                f15 = fFloatValue2 - fFloatValue;
                linkedHashMap2 = new LinkedHashMap();
                it8 = arrayList3.iterator();
                i17 = 0;
                while (true) {
                    if (it8.hasNext()) {
                        arrayList5 = arrayList2;
                        break;
                    }
                    next = it8.next();
                    i18 = i17 + 1;
                    if (i17 >= 0) {
                        x.q();
                        throw null;
                    }
                    fFloatValue3 = ((Number) next).floatValue();
                    arrayList5 = arrayList2;
                    if (i17 == arrayList3.size() - 1) {
                        fFloatValue3 = fFloatValue2;
                    }
                    if (i17 == 0) {
                        f16 = 0.0f;
                    } else {
                        f16 = (fFloatValue3 - fFloatValue) / f15;
                    }
                    if (f16 >= 1.0f) {
                        f16 = 1.0f;
                    }
                    if (i17 < arrayList4.size()) {
                        linkedHashMap2.put(Float.valueOf(f16), arrayList4.get(i17));
                    }
                    if (f16 == 1.0f) {
                        break;
                        break;
                    } else {
                        i17 = i18;
                        arrayList2 = arrayList5;
                    }
                }
                mapK = i53.a.k(new TreeMap(linkedHashMap2));
                x1 x1Var13 = p3.n.f135158a;
                o0VarE.f();
            }
            Set<Map.Entry> setEntrySet4 = mapK.entrySet();
            arrayList6 = new ArrayList(y.r(setEntrySet4, 10));
            while (r3.hasNext()) {
                arrayList6.add(new o13.p(entry.getKey(), entry.getValue()));
            }
            Iterable<Map.Entry> iterableEntrySet4 = b(linkedHashMap, arrayList4, gVar3, o0VarE, 0).entrySet();
            arrayList7 = new ArrayList(y.r(iterableEntrySet4, 10));
            while (r2.hasNext()) {
                arrayList7.add(new o13.p(entry2.getKey(), entry2.getValue()));
            }
            if (nVar != null) {
                x0VarF = nVar.f125092b;
            } else if (pVar != null) {
                x0VarF = pVar.f125098b;
            } else {
                x0VarF = null;
            }
            if (x0VarF == null) {
                o0VarE.C(-19419899);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                z16 = false;
            } else {
                z16 = false;
                o0VarE.C(-19421852);
            }
            o0VarE.g0(z16);
            q0VarA = s0.a(s0Var3, str2, x0VarF, 0L, 1020);
            i19 = (int) (q0VarA.f157282c & 4294967295L);
            objQ = o0VarE.q();
            m.f135153a.getClass();
            c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(null);
                o0VarE.K(objQ);
            }
            p1Var = (p1) objQ;
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(null);
                o0VarE.K(objQ2);
            }
            p1Var2 = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = n23.j.o(fG, o0VarE);
            }
            m1Var = (m1) objQ3;
            if (nVar != null) {
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                f17 = j92.b.f97899b.f97918c + (i19 * 2);
            } else {
                f17 = 0.0f;
            }
            if (oVar != null) {
                listA = j0.f134944a;
            } else {
                listA = j0.f134944a;
            }
            c2.j.f22691a.getClass();
            kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            list = listA;
            aVar = h4.d.a.f81536n;
            zVarA = c2.y.a(kVar, aVar, o0VarE, 0);
            x1 x1Var14 = p3.n.f135158a;
            gVar4 = gVar3;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = k.c(rVar, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                c2565a2 = c2565a;
                if (!s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC, o0VarE);
                b0Var = b0.f22601a;
                aVar3 = r.S;
                boolean z1116 = z15;
                f18 = f17;
                r rVarA13 = b0Var.a(aVar3, 1.0f, z1116);
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = k.c(rVarA13, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                } else {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                u uVar7 = u.f22885a;
                r rVarD7 = x2.d(aVar3, 1.0f);
                zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
                iHashCode3 = Long.hashCode(o0VarE.U);
                i2VarA2 = o0VarE.a0();
                rVarC3 = k.c(rVarD7, o0VarE);
                if (cVar2 != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar, zVarA2, o0VarE);
                b4.c(c1623g, i2VarA2, o0VarE);
                if (o0VarE.T) {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                } else {
                    v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, o0VarE);
                if (str != null) {
                    o0VarE.C(180871555);
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB7 = d92.c.b(j92.f.f97931h, o0VarE);
                    j92.b bVar8 = d92.b.f58625c;
                    bVar8.getClass();
                    j92.e eVar9 = j92.b.f97899b;
                    float f2118 = eVar9.f97920e;
                    bVar8.getClass();
                    b0Var2 = b0Var;
                    i24 = i19;
                    aVar4 = aVar3;
                    arrayList9 = arrayList6;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    r15 = 0;
                    mh.c(str, l.C(aVar3, 0.0f, f2118, 0.0f, eVar9.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB7, o0VarE, (i29 >> 3) & 14, 0, 131068);
                    o0 o0Var13 = o0VarE;
                    o0Var13.g0(false);
                    r16 = o0Var13;
                } else {
                    b0Var2 = b0Var;
                    aVar4 = aVar3;
                    r15 = 0;
                    o0 o0Var14 = o0VarE;
                    arrayList8 = arrayList7;
                    q0Var = q0VarA;
                    arrayList9 = arrayList6;
                    i24 = i19;
                    o0Var14.C(181127739);
                    o0Var14.g0(false);
                    r16 = o0Var14;
                }
                r rVarA14 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
                Unit unit7 = Unit.INSTANCE;
                objQ4 = r16.q();
                c2565a3 = c2565a2;
                if (objQ4 == c2565a3) {
                    p1Var3 = p1Var;
                    objQ4 = new b(p1Var3);
                    r16.K(objQ4);
                } else {
                    p1Var3 = r33;
                }
                r rVarB7 = b5.s0.b(rVarA14, unit7, (PointerInputEventHandler) objQ4);
                if (pVar != null) {
                    r16.C(837159311);
                    fX = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837159817);
                    r16.g0(r15);
                    fX = (float) r15;
                }
                float f2119 = fX;
                if (pVar != null) {
                    r16.C(182223279);
                    r16.g0(r15);
                } else {
                    if (nVar != null) {
                        r16.C(182332430);
                        fX2 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(182445487);
                        r16.g0(r15);
                    }
                    float f21110 = fX2;
                    if (nVar != null) {
                        r16.C(837174767);
                        fX3 = w02.b0.x(r16, i24 / 2);
                        r16.g0(r15);
                    } else {
                        r16.C(837175273);
                        r16.g0(r15);
                        fX3 = (float) r15;
                    }
                    r rVarC16 = l.C(rVarB7, f21110, f2119, fX3, 0.0f, 8);
                    f19 = f18;
                    boolean z1117 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                    arrayList10 = arrayList9;
                    arrayList11 = arrayList8;
                    arrayList12 = arrayList5;
                    int i31119 = (((z1117 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                    if ((i29 & 7168) == 2048) {
                        r17 = 1;
                    } else {
                        r17 = r15;
                    }
                    int i311110 = r17 | i31119;
                    if ((3670016 & i29) == 1048576) {
                        r18 = 1;
                    } else {
                        r18 = r15;
                    }
                    ?? r211113 = i311110 | r18;
                    if ((i28 & 14) != 4) {
                        r19 = r15;
                    } else {
                        r19 = 1;
                    }
                    int i311111 = (r211113 == true ? 1 : 0) | r19;
                    q0Var2 = q0Var;
                    i25 = i311111 | (r16.r(q0Var2) ? 1 : 0);
                    objQ5 = r16.q();
                    if (i25 == 0) {
                        ?? r211114 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar114 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f21111;
                                float f21112;
                                float f21113;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar6 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar6 != null) {
                                    float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar13 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                        if (pVar8 != null) {
                                            fValueOf2 = (Float) pVar8.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f21112 = f35;
                                    f21111 = f36;
                                    List list3 = listB1;
                                    f21113 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f21111;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21112);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21111, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f21112 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar14 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f21113, -f21111, -f21112);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f21111 = f36;
                                    f21112 = f35;
                                    f21113 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r211114.K(lVar114);
                        objQ5 = lVar114;
                        r24 = r211114;
                    } else {
                        ?? r211115 = r16;
                        p1Var4 = p1Var2;
                        m1Var2 = m1Var;
                        e23.l lVar115 = new e23.l() { // from class: xe1.a
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // e23.l
                            public final Object invoke(Object obj) throws Throwable {
                                q4.f fVar2;
                                float f21111;
                                float f21112;
                                float f21113;
                                m92.m dVar;
                                m92.m dVar2;
                                Float fValueOf;
                                ArrayList arrayList13 = arrayList;
                                q0 q0Var3 = q0Var2;
                                long j8 = q0Var3.f157282c;
                                ArrayList arrayList14 = arrayList10;
                                ArrayList arrayList15 = arrayList11;
                                ArrayList arrayList16 = arrayList12;
                                boolean z24 = z14;
                                Float f34 = f14;
                                p1 p1Var5 = p1Var4;
                                q4.f fVar3 = (q4.f) obj;
                                fVar3.getClass();
                                p pVar6 = pVar;
                                List<o13.p<Float, String>> list2 = list;
                                float f35 = f19;
                                float f36 = fG;
                                m1 m1Var3 = m1Var2;
                                if (pVar6 != null) {
                                    float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                    d92.b.f58623a.getClass();
                                    d92.b.f58625c.getClass();
                                    m1Var3.i(f37 + j92.b.f97899b.f97923h);
                                }
                                float floatValue = m1Var3.getFloatValue();
                                fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                                float f38 = 2;
                                try {
                                    g6.f.a aVar13 = g6.f.f75994b;
                                    Float fValueOf2 = null;
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                    }
                                    if (arrayList13.isEmpty()) {
                                        d0.f128823b.getClass();
                                        dVar2 = new m92.m.d(d0.f128831j, null);
                                    } else {
                                        u1.f129010b.getClass();
                                        dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                    }
                                    float f39 = 4;
                                    List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                    if (arrayList13.isEmpty()) {
                                        fValueOf = Float.valueOf(160.0f);
                                    } else {
                                        o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                        fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                    }
                                    if (arrayList13.isEmpty()) {
                                        fValueOf2 = Float.valueOf(200.0f);
                                    } else {
                                        o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                        if (pVar8 != null) {
                                            fValueOf2 = (Float) pVar8.f128594a;
                                        }
                                    }
                                    fVar2 = fVar3;
                                    f21112 = f35;
                                    f21111 = f36;
                                    List list3 = listB1;
                                    f21113 = -0.0f;
                                    try {
                                        p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                        float f44 = -f21111;
                                        fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21112);
                                        n nVar2 = nVar;
                                        if (nVar2 != null) {
                                            float floatValue2 = m1Var3.getFloatValue();
                                            fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21111, 0.0f);
                                            try {
                                                nVar2.a(fVar2, f21112 * 1.1f);
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            } catch (Throwable th3) {
                                                fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                                throw th3;
                                            }
                                        }
                                        if (arrayList13.isEmpty()) {
                                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                            n4.c.a aVar14 = n4.c.f123541b;
                                            v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                        }
                                        return Unit.INSTANCE;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        fVar2.getF142543b().f142550a.e(-floatValue, f21113, -f21111, -f21112);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fVar2 = fVar3;
                                    f21111 = f36;
                                    f21112 = f35;
                                    f21113 = -0.0f;
                                }
                            }
                        };
                        f19 = f19;
                        r211115.K(lVar115);
                        objQ5 = lVar115;
                        r24 = r211115;
                    }
                    u1.n.b(rVarC16, (e23.l) objQ5, r24, 0);
                    r24.g0(true);
                    if (qVar != null) {
                        r24.C(386817103);
                        map = (Map) p1Var4.getF182175a();
                        if (map == null) {
                            r24.C(-893571694);
                            r24.g0(false);
                            r27 = r24;
                        } else {
                            r24.C(-893571693);
                            cVar = (n4.c) p1Var3.getF182175a();
                            if (cVar == null) {
                                r24.C(367821440);
                                r24.g0(false);
                                r26 = r24;
                            } else {
                                r24.C(367821441);
                                ?? r1112 = r24;
                                m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1112, 24576, 32);
                                ?? r3118 = r1112;
                                r3118.g0(false);
                                r26 = r3118;
                            }
                            r26.g0(false);
                            r27 = r26;
                        }
                        r27.g0(false);
                        r25 = r27;
                    } else {
                        ?? r3119 = r24;
                        r3119.C(-893344463);
                        r3119.g0(false);
                        r25 = r3119;
                    }
                    r25.g0(true);
                    r25.g0(true);
                    gVar2 = gVar4;
                    r14 = r25;
                }
                fX2 = (float) r15;
                float f21111 = fX2;
                if (nVar != null) {
                    r16.C(837174767);
                    fX3 = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837175273);
                    r16.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC17 = l.C(rVarB7, f21111, f2119, fX3, 0.0f, 8);
                f19 = f18;
                boolean z1118 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                arrayList10 = arrayList9;
                arrayList11 = arrayList8;
                arrayList12 = arrayList5;
                int i311112 = (((z1118 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                if ((i29 & 7168) == 2048) {
                    r17 = 1;
                } else {
                    r17 = r15;
                }
                int i311113 = r17 | i311112;
                if ((3670016 & i29) == 1048576) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                ?? r211116 = i311113 | r18;
                if ((i28 & 14) != 4) {
                    r19 = r15;
                } else {
                    r19 = 1;
                }
                int i311114 = (r211116 == true ? 1 : 0) | r19;
                q0Var2 = q0Var;
                i25 = i311114 | (r16.r(q0Var2) ? 1 : 0);
                objQ5 = r16.q();
                if (i25 == 0) {
                    ?? r211117 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar116 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f21112;
                            float f21113;
                            float f21114;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar6 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar6 != null) {
                                float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar13 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                    if (pVar8 != null) {
                                        fValueOf2 = (Float) pVar8.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f21113 = f35;
                                f21112 = f36;
                                List list3 = listB1;
                                f21114 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f21112;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21113);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21112, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f21113 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar14 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21114, -f21112, -f21113);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f21112 = f36;
                                f21113 = f35;
                                f21114 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r211117.K(lVar116);
                    objQ5 = lVar116;
                    r24 = r211117;
                } else {
                    ?? r211118 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar117 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f21112;
                            float f21113;
                            float f21114;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar6 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar6 != null) {
                                float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar13 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                    if (pVar8 != null) {
                                        fValueOf2 = (Float) pVar8.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f21113 = f35;
                                f21112 = f36;
                                List list3 = listB1;
                                f21114 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f21112;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21113);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21112, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f21113 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar14 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21114, -f21112, -f21113);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f21112 = f36;
                                f21113 = f35;
                                f21114 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r211118.K(lVar117);
                    objQ5 = lVar117;
                    r24 = r211118;
                }
                u1.n.b(rVarC17, (e23.l) objQ5, r24, 0);
                r24.g0(true);
                if (qVar != null) {
                    r24.C(386817103);
                    map = (Map) p1Var4.getF182175a();
                    if (map == null) {
                        r24.C(-893571694);
                        r24.g0(false);
                        r27 = r24;
                    } else {
                        r24.C(-893571693);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r24.C(367821440);
                            r24.g0(false);
                            r26 = r24;
                        } else {
                            r24.C(367821441);
                            ?? r1113 = r24;
                            m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1113, 24576, 32);
                            ?? r31110 = r1113;
                            r31110.g0(false);
                            r26 = r31110;
                        }
                        r26.g0(false);
                        r27 = r26;
                    }
                    r27.g0(false);
                    r25 = r27;
                } else {
                    ?? r31111 = r24;
                    r31111.C(-893344463);
                    r31111.g0(false);
                    r25 = r31111;
                }
                r25.g0(true);
                r25.g0(true);
                gVar2 = gVar4;
                r14 = r25;
            } else {
                c2565a2 = c2565a;
            }
            v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            b0Var = b0.f22601a;
            aVar3 = r.S;
            boolean z1119 = z15;
            f18 = f17;
            r rVarA15 = b0Var.a(aVar3, 1.0f, z1119);
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = k.c(rVarA15, o0VarE);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            u uVar8 = u.f22885a;
            r rVarD8 = x2.d(aVar3, 1.0f);
            zVarA2 = c2.y.a(kVar, aVar, o0VarE, 0);
            iHashCode3 = Long.hashCode(o0VarE.U);
            i2VarA2 = o0VarE.a0();
            rVarC3 = k.c(rVarD8, o0VarE);
            if (cVar2 != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, zVarA2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            } else {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, o0VarE);
            if (str != null) {
                o0VarE.C(180871555);
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                x0 x0VarB8 = d92.c.b(j92.f.f97931h, o0VarE);
                j92.b bVar9 = d92.b.f58625c;
                bVar9.getClass();
                j92.e eVar10 = j92.b.f97899b;
                float f21112 = eVar10.f97920e;
                bVar9.getClass();
                b0Var2 = b0Var;
                i24 = i19;
                aVar4 = aVar3;
                arrayList9 = arrayList6;
                arrayList8 = arrayList7;
                q0Var = q0VarA;
                r15 = 0;
                mh.c(str, l.C(aVar3, 0.0f, f21112, 0.0f, eVar10.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB8, o0VarE, (i29 >> 3) & 14, 0, 131068);
                o0 o0Var15 = o0VarE;
                o0Var15.g0(false);
                r16 = o0Var15;
            } else {
                b0Var2 = b0Var;
                aVar4 = aVar3;
                r15 = 0;
                o0 o0Var16 = o0VarE;
                arrayList8 = arrayList7;
                q0Var = q0VarA;
                arrayList9 = arrayList6;
                i24 = i19;
                o0Var16.C(181127739);
                o0Var16.g0(false);
                r16 = o0Var16;
            }
            r rVarA16 = b0Var2.a(x2.f(aVar4, 1.0f), 1.0f, true);
            Unit unit8 = Unit.INSTANCE;
            objQ4 = r16.q();
            c2565a3 = c2565a2;
            if (objQ4 == c2565a3) {
                p1Var3 = p1Var;
                objQ4 = new b(p1Var3);
                r16.K(objQ4);
            } else {
                p1Var3 = r33;
            }
            r rVarB8 = b5.s0.b(rVarA16, unit8, (PointerInputEventHandler) objQ4);
            if (pVar != null) {
                r16.C(837159311);
                fX = w02.b0.x(r16, i24 / 2);
                r16.g0(r15);
            } else {
                r16.C(837159817);
                r16.g0(r15);
                fX = (float) r15;
            }
            float f21113 = fX;
            if (pVar != null) {
                r16.C(182223279);
                r16.g0(r15);
            } else {
                if (nVar != null) {
                    r16.C(182332430);
                    fX2 = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(182445487);
                    r16.g0(r15);
                }
                float f21114 = fX2;
                if (nVar != null) {
                    r16.C(837174767);
                    fX3 = w02.b0.x(r16, i24 / 2);
                    r16.g0(r15);
                } else {
                    r16.C(837175273);
                    r16.g0(r15);
                    fX3 = (float) r15;
                }
                r rVarC18 = l.C(rVarB8, f21114, f21113, fX3, 0.0f, 8);
                f19 = f18;
                boolean z11110 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
                arrayList10 = arrayList9;
                arrayList11 = arrayList8;
                arrayList12 = arrayList5;
                int i311115 = (((z11110 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
                if ((i29 & 7168) == 2048) {
                    r17 = 1;
                } else {
                    r17 = r15;
                }
                int i311116 = r17 | i311115;
                if ((3670016 & i29) == 1048576) {
                    r18 = 1;
                } else {
                    r18 = r15;
                }
                ?? r211119 = i311116 | r18;
                if ((i28 & 14) != 4) {
                    r19 = r15;
                } else {
                    r19 = 1;
                }
                int i311117 = (r211119 == true ? 1 : 0) | r19;
                q0Var2 = q0Var;
                i25 = i311117 | (r16.r(q0Var2) ? 1 : 0);
                objQ5 = r16.q();
                if (i25 == 0) {
                    ?? r2111110 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar118 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f21115;
                            float f21116;
                            float f21117;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar6 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar6 != null) {
                                float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar13 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                    if (pVar8 != null) {
                                        fValueOf2 = (Float) pVar8.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f21116 = f35;
                                f21115 = f36;
                                List list3 = listB1;
                                f21117 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f21115;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21116);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21115, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f21116 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar14 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21117, -f21115, -f21116);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f21115 = f36;
                                f21116 = f35;
                                f21117 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r2111110.K(lVar118);
                    objQ5 = lVar118;
                    r24 = r2111110;
                } else {
                    ?? r2111111 = r16;
                    p1Var4 = p1Var2;
                    m1Var2 = m1Var;
                    e23.l lVar119 = new e23.l() { // from class: xe1.a
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // e23.l
                        public final Object invoke(Object obj) throws Throwable {
                            q4.f fVar2;
                            float f21115;
                            float f21116;
                            float f21117;
                            m92.m dVar;
                            m92.m dVar2;
                            Float fValueOf;
                            ArrayList arrayList13 = arrayList;
                            q0 q0Var3 = q0Var2;
                            long j8 = q0Var3.f157282c;
                            ArrayList arrayList14 = arrayList10;
                            ArrayList arrayList15 = arrayList11;
                            ArrayList arrayList16 = arrayList12;
                            boolean z24 = z14;
                            Float f34 = f14;
                            p1 p1Var5 = p1Var4;
                            q4.f fVar3 = (q4.f) obj;
                            fVar3.getClass();
                            p pVar6 = pVar;
                            List<o13.p<Float, String>> list2 = list;
                            float f35 = f19;
                            float f36 = fG;
                            m1 m1Var3 = m1Var2;
                            if (pVar6 != null) {
                                float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                                d92.b.f58623a.getClass();
                                d92.b.f58625c.getClass();
                                m1Var3.i(f37 + j92.b.f97899b.f97923h);
                            }
                            float floatValue = m1Var3.getFloatValue();
                            fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                            float f38 = 2;
                            try {
                                g6.f.a aVar13 = g6.f.f75994b;
                                Float fValueOf2 = null;
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                                }
                                if (arrayList13.isEmpty()) {
                                    d0.f128823b.getClass();
                                    dVar2 = new m92.m.d(d0.f128831j, null);
                                } else {
                                    u1.f129010b.getClass();
                                    dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                                }
                                float f39 = 4;
                                List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                                if (arrayList13.isEmpty()) {
                                    fValueOf = Float.valueOf(160.0f);
                                } else {
                                    o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                    fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                                }
                                if (arrayList13.isEmpty()) {
                                    fValueOf2 = Float.valueOf(200.0f);
                                } else {
                                    o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                    if (pVar8 != null) {
                                        fValueOf2 = (Float) pVar8.f128594a;
                                    }
                                }
                                fVar2 = fVar3;
                                f21116 = f35;
                                f21115 = f36;
                                List list3 = listB1;
                                f21117 = -0.0f;
                                try {
                                    p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                    float f44 = -f21115;
                                    fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21116);
                                    n nVar2 = nVar;
                                    if (nVar2 != null) {
                                        float floatValue2 = m1Var3.getFloatValue();
                                        fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21115, 0.0f);
                                        try {
                                            nVar2.a(fVar2, f21116 * 1.1f);
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        } catch (Throwable th3) {
                                            fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                            throw th3;
                                        }
                                    }
                                    if (arrayList13.isEmpty()) {
                                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                        n4.c.a aVar14 = n4.c.f123541b;
                                        v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                    }
                                    return Unit.INSTANCE;
                                } catch (Throwable th4) {
                                    th = th4;
                                    fVar2.getF142543b().f142550a.e(-floatValue, f21117, -f21115, -f21116);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                fVar2 = fVar3;
                                f21115 = f36;
                                f21116 = f35;
                                f21117 = -0.0f;
                            }
                        }
                    };
                    f19 = f19;
                    r2111111.K(lVar119);
                    objQ5 = lVar119;
                    r24 = r2111111;
                }
                u1.n.b(rVarC18, (e23.l) objQ5, r24, 0);
                r24.g0(true);
                if (qVar != null) {
                    r24.C(386817103);
                    map = (Map) p1Var4.getF182175a();
                    if (map == null) {
                        r24.C(-893571694);
                        r24.g0(false);
                        r27 = r24;
                    } else {
                        r24.C(-893571693);
                        cVar = (n4.c) p1Var3.getF182175a();
                        if (cVar == null) {
                            r24.C(367821440);
                            r24.g0(false);
                            r26 = r24;
                        } else {
                            r24.C(367821441);
                            ?? r1114 = r24;
                            m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1114, 24576, 32);
                            ?? r31112 = r1114;
                            r31112.g0(false);
                            r26 = r31112;
                        }
                        r26.g0(false);
                        r27 = r26;
                    }
                    r27.g0(false);
                    r25 = r27;
                } else {
                    ?? r31113 = r24;
                    r31113.C(-893344463);
                    r31113.g0(false);
                    r25 = r31113;
                }
                r25.g0(true);
                r25.g0(true);
                gVar2 = gVar4;
                r14 = r25;
            }
            fX2 = (float) r15;
            float f21115 = fX2;
            if (nVar != null) {
                r16.C(837174767);
                fX3 = w02.b0.x(r16, i24 / 2);
                r16.g0(r15);
            } else {
                r16.C(837175273);
                r16.g0(r15);
                fX3 = (float) r15;
            }
            r rVarC19 = l.C(rVarB8, f21115, f21113, fX3, 0.0f, 8);
            f19 = f18;
            boolean z11111 = ((((((i29 & 1879048192) != 536870912 || ((i29 & 1073741824) != 0 && r16.r(pVar))) ? 1 : r15) | (r16.r(list) ? 1 : 0)) | (r16.i(f19) ? 1 : 0)) == true ? 1 : 0) | (r16.i(fG) ? 1 : 0) | (r16.r(arrayList) ? 1 : 0);
            arrayList10 = arrayList9;
            arrayList11 = arrayList8;
            arrayList12 = arrayList5;
            int i311118 = (((z11111 ? 1 : 0) | (r16.r(arrayList10) ? 1 : 0)) | (r16.r(arrayList11) ? 1 : 0) ? 1 : 0) | (r16.r(arrayList12) ? 1 : 0);
            if ((i29 & 7168) == 2048) {
                r17 = 1;
            } else {
                r17 = r15;
            }
            int i311119 = r17 | i311118;
            if ((3670016 & i29) == 1048576) {
                r18 = 1;
            } else {
                r18 = r15;
            }
            ?? r2111112 = i311119 | r18;
            if ((i28 & 14) != 4) {
                r19 = r15;
            } else {
                r19 = 1;
            }
            int i3111110 = (r2111112 == true ? 1 : 0) | r19;
            q0Var2 = q0Var;
            i25 = i3111110 | (r16.r(q0Var2) ? 1 : 0);
            objQ5 = r16.q();
            if (i25 == 0) {
                ?? r2111113 = r16;
                p1Var4 = p1Var2;
                m1Var2 = m1Var;
                e23.l lVar1110 = new e23.l() { // from class: xe1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) throws Throwable {
                        q4.f fVar2;
                        float f21116;
                        float f21117;
                        float f21118;
                        m92.m dVar;
                        m92.m dVar2;
                        Float fValueOf;
                        ArrayList arrayList13 = arrayList;
                        q0 q0Var3 = q0Var2;
                        long j8 = q0Var3.f157282c;
                        ArrayList arrayList14 = arrayList10;
                        ArrayList arrayList15 = arrayList11;
                        ArrayList arrayList16 = arrayList12;
                        boolean z24 = z14;
                        Float f34 = f14;
                        p1 p1Var5 = p1Var4;
                        q4.f fVar3 = (q4.f) obj;
                        fVar3.getClass();
                        p pVar6 = pVar;
                        List<o13.p<Float, String>> list2 = list;
                        float f35 = f19;
                        float f36 = fG;
                        m1 m1Var3 = m1Var2;
                        if (pVar6 != null) {
                            float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            m1Var3.i(f37 + j92.b.f97899b.f97923h);
                        }
                        float floatValue = m1Var3.getFloatValue();
                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                        float f38 = 2;
                        try {
                            g6.f.a aVar13 = g6.f.f75994b;
                            Float fValueOf2 = null;
                            if (arrayList13.isEmpty()) {
                                d0.f128823b.getClass();
                                dVar = new m92.m.d(d0.f128831j, null);
                            } else {
                                u1.f129010b.getClass();
                                dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                            }
                            if (arrayList13.isEmpty()) {
                                d0.f128823b.getClass();
                                dVar2 = new m92.m.d(d0.f128831j, null);
                            } else {
                                u1.f129010b.getClass();
                                dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                            }
                            float f39 = 4;
                            List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                            if (arrayList13.isEmpty()) {
                                fValueOf = Float.valueOf(160.0f);
                            } else {
                                o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                            }
                            if (arrayList13.isEmpty()) {
                                fValueOf2 = Float.valueOf(200.0f);
                            } else {
                                o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                if (pVar8 != null) {
                                    fValueOf2 = (Float) pVar8.f128594a;
                                }
                            }
                            fVar2 = fVar3;
                            f21117 = f35;
                            f21116 = f36;
                            List list3 = listB1;
                            f21118 = -0.0f;
                            try {
                                p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                float f44 = -f21116;
                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21117);
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue2 = m1Var3.getFloatValue();
                                    fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21116, 0.0f);
                                    try {
                                        nVar2.a(fVar2, f21117 * 1.1f);
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        throw th3;
                                    }
                                }
                                if (arrayList13.isEmpty()) {
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                    n4.c.a aVar14 = n4.c.f123541b;
                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                fVar2.getF142543b().f142550a.e(-floatValue, f21118, -f21116, -f21117);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar2 = fVar3;
                            f21116 = f36;
                            f21117 = f35;
                            f21118 = -0.0f;
                        }
                    }
                };
                f19 = f19;
                r2111113.K(lVar1110);
                objQ5 = lVar1110;
                r24 = r2111113;
            } else {
                ?? r2111114 = r16;
                p1Var4 = p1Var2;
                m1Var2 = m1Var;
                e23.l lVar1111 = new e23.l() { // from class: xe1.a
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // e23.l
                    public final Object invoke(Object obj) throws Throwable {
                        q4.f fVar2;
                        float f21116;
                        float f21117;
                        float f21118;
                        m92.m dVar;
                        m92.m dVar2;
                        Float fValueOf;
                        ArrayList arrayList13 = arrayList;
                        q0 q0Var3 = q0Var2;
                        long j8 = q0Var3.f157282c;
                        ArrayList arrayList14 = arrayList10;
                        ArrayList arrayList15 = arrayList11;
                        ArrayList arrayList16 = arrayList12;
                        boolean z24 = z14;
                        Float f34 = f14;
                        p1 p1Var5 = p1Var4;
                        q4.f fVar3 = (q4.f) obj;
                        fVar3.getClass();
                        p pVar6 = pVar;
                        List<o13.p<Float, String>> list2 = list;
                        float f35 = f19;
                        float f36 = fG;
                        m1 m1Var3 = m1Var2;
                        if (pVar6 != null) {
                            float f37 = pVar6.a(fVar3, list2, j0.f134944a, f35).f125077a + f36;
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            m1Var3.i(f37 + j92.b.f97899b.f97923h);
                        }
                        float floatValue = m1Var3.getFloatValue();
                        fVar3.getF142543b().f142550a.e(floatValue, 0.0f, f36, f35);
                        float f38 = 2;
                        try {
                            g6.f.a aVar13 = g6.f.f75994b;
                            Float fValueOf2 = null;
                            if (arrayList13.isEmpty()) {
                                d0.f128823b.getClass();
                                dVar = new m92.m.d(d0.f128831j, null);
                            } else {
                                u1.f129010b.getClass();
                                dVar = new m92.m.b(arrayList14, u1.f129011c, null);
                            }
                            if (arrayList13.isEmpty()) {
                                d0.f128823b.getClass();
                                dVar2 = new m92.m.d(d0.f128831j, null);
                            } else {
                                u1.f129010b.getClass();
                                dVar2 = new m92.m.b(arrayList15, u1.f129011c, null);
                            }
                            float f39 = 4;
                            List listB1 = !arrayList13.isEmpty() ? p13.h0.b1(arrayList16) : j0.f134944a;
                            if (arrayList13.isEmpty()) {
                                fValueOf = Float.valueOf(160.0f);
                            } else {
                                o13.p pVar7 = (o13.p) p13.h0.d0(list2);
                                fValueOf = pVar7 != null ? (Float) pVar7.f128594a : null;
                            }
                            if (arrayList13.isEmpty()) {
                                fValueOf2 = Float.valueOf(200.0f);
                            } else {
                                o13.p pVar8 = (o13.p) p13.h0.n0(list2);
                                if (pVar8 != null) {
                                    fValueOf2 = (Float) pVar8.f128594a;
                                }
                            }
                            fVar2 = fVar3;
                            f21117 = f35;
                            f21116 = f36;
                            List list3 = listB1;
                            f21118 = -0.0f;
                            try {
                                p1Var5.setValue(c0.e(fVar2, f38, dVar, z24, f39, dVar2, null, list3, f34, null, null, fValueOf, fValueOf2, null, false, null, 21280));
                                float f44 = -f21116;
                                fVar2.getF142543b().f142550a.e(-floatValue, -0.0f, f44, -f21117);
                                n nVar2 = nVar;
                                if (nVar2 != null) {
                                    float floatValue2 = m1Var3.getFloatValue();
                                    fVar2.getF142543b().f142550a.e(floatValue2, 0.0f, f21116, 0.0f);
                                    try {
                                        nVar2.a(fVar2, f21117 * 1.1f);
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                    } catch (Throwable th3) {
                                        fVar2.getF142543b().f142550a.e(-floatValue2, -0.0f, f44, -0.0f);
                                        throw th3;
                                    }
                                }
                                if (arrayList13.isEmpty()) {
                                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) >> 32)) - (((int) (j8 >> 32)) / 2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (n4.h.b(fVar2.b()) & 4294967295L)) - (((int) (j8 & 4294967295L)) / 2))) & 4294967295L);
                                    n4.c.a aVar14 = n4.c.f123541b;
                                    v0.b(fVar2, q0Var3, 0L, jFloatToRawIntBits, 250);
                                }
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                fVar2.getF142543b().f142550a.e(-floatValue, f21118, -f21116, -f21117);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fVar2 = fVar3;
                            f21116 = f36;
                            f21117 = f35;
                            f21118 = -0.0f;
                        }
                    }
                };
                f19 = f19;
                r2111114.K(lVar1111);
                objQ5 = lVar1111;
                r24 = r2111114;
            }
            u1.n.b(rVarC19, (e23.l) objQ5, r24, 0);
            r24.g0(true);
            if (qVar != null) {
                r24.C(386817103);
                map = (Map) p1Var4.getF182175a();
                if (map == null) {
                    r24.C(-893571694);
                    r24.g0(false);
                    r27 = r24;
                } else {
                    r24.C(-893571693);
                    cVar = (n4.c) p1Var3.getF182175a();
                    if (cVar == null) {
                        r24.C(367821440);
                        r24.g0(false);
                        r26 = r24;
                    } else {
                        r24.C(367821441);
                        ?? r1115 = r24;
                        m92.y.c(map, cVar.f123544a, m1Var2.getFloatValue(), f19, qVar, null, r1115, 24576, 32);
                        ?? r31114 = r1115;
                        r31114.g0(false);
                        r26 = r31114;
                    }
                    r26.g0(false);
                    r27 = r26;
                }
                r27.g0(false);
                r25 = r27;
            } else {
                ?? r31115 = r24;
                r31115.C(-893344463);
                r31115.g0(false);
                r25 = r31115;
            }
            r25.g0(true);
            r25.g0(true);
            gVar2 = gVar4;
            r14 = r25;
        } else {
            o0 o0Var17 = o0VarE;
            o0Var17.e();
            gVar2 = gVar;
            r14 = o0Var17;
        }
        p2 p2VarI0 = r14.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.i(rVar, str, gVar2, z14, arrayList, f14, str2, oVar, pVar, nVar, qVar, i14, i15, 5);
        }
    }

    public static final i53.d b(LinkedHashMap linkedHashMap, ArrayList arrayList, o82.g gVar, m mVar, int i14) {
        i53.d dVarK;
        mVar.C(1710215352);
        if ((i14 & 4) != 0) {
            gVar = null;
        }
        x1 x1Var = p3.n.f135158a;
        if (linkedHashMap.isEmpty()) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            dVarK = i53.a.g(k0Var);
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            float size = 1.0f / arrayList.size();
            int i15 = 0;
            for (Object obj : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    x.q();
                    throw null;
                }
                long j8 = ((d0) obj).f128833a;
                linkedHashMap2.put(Float.valueOf((i15 - (gVar == o82.g.f130856i ? linkedHashMap.size() > 40 ? 3.0f : -3.7f : 0.5f)) * size), d0.a(j8));
                i15 = i16;
            }
            if (linkedHashMap2.isEmpty()) {
                Float fValueOf = Float.valueOf(1.0f);
                d0.f128823b.getClass();
                linkedHashMap2.put(fValueOf, d0.a(d0.f128831j));
            }
            dVarK = i53.a.k(linkedHashMap2);
            x1 x1Var2 = p3.n.f135158a;
        }
        mVar.f();
        return dVarK;
    }
}
