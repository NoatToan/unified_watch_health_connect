package t6;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.text.StringSubstitutor;
import u6.n;
import u6.o;
import u6.p;

/* JADX INFO: loaded from: classes.dex */
public class f extends m {
    public u6.b.InterfaceC3163b A0;
    public boolean B0;
    public m6.e C0;
    public final m6.d D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public c[] I0;
    public c[] J0;
    public int K0;
    public boolean L0;
    public boolean M0;
    public WeakReference<d> N0;
    public WeakReference<d> O0;
    public WeakReference<d> P0;
    public WeakReference<d> Q0;
    public final HashSet<e> R0;
    public final u6.b.a S0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final u6.b f162656x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final u6.e f162657y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f162658z0;

    public f(String str, int i14, int i15) {
        super(i14, i15);
        this.f162656x0 = new u6.b(this);
        this.f162657y0 = new u6.e(this);
        this.A0 = null;
        this.B0 = false;
        this.D0 = new m6.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = TsExtractor.TS_STREAM_TYPE_AIT;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new u6.b.a();
        this.f162627m0 = str;
    }

    public static void c0(e eVar, u6.b.InterfaceC3163b interfaceC3163b, u6.b.a aVar) {
        int i14;
        int i15;
        if (interfaceC3163b == null) {
            return;
        }
        int i16 = eVar.f162623k0;
        int[] iArr = eVar.f162644v;
        if (i16 == 8 || (eVar instanceof h) || (eVar instanceof a)) {
            aVar.f168787e = 0;
            aVar.f168788f = 0;
            return;
        }
        e.b[] bVarArr = eVar.W;
        aVar.f168783a = bVarArr[0];
        aVar.f168784b = bVarArr[1];
        aVar.f168785c = eVar.s();
        aVar.f168786d = eVar.m();
        aVar.f168791i = false;
        aVar.f168792j = 0;
        e.b bVar = aVar.f168783a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z14 = bVar == bVar2;
        boolean z15 = aVar.f168784b == bVar2;
        boolean z16 = z14 && eVar.f162603a0 > 0.0f;
        boolean z17 = z15 && eVar.f162603a0 > 0.0f;
        if (z14 && eVar.v(0) && eVar.f162640t == 0 && !z16) {
            aVar.f168783a = e.b.WRAP_CONTENT;
            if (z15 && eVar.f162642u == 0) {
                aVar.f168783a = e.b.FIXED;
            }
            z14 = false;
        }
        if (z15 && eVar.v(1) && eVar.f162642u == 0 && !z17) {
            aVar.f168784b = e.b.WRAP_CONTENT;
            if (z14 && eVar.f162640t == 0) {
                aVar.f168784b = e.b.FIXED;
            }
            z15 = false;
        }
        if (eVar.C()) {
            aVar.f168783a = e.b.FIXED;
            z14 = false;
        }
        if (eVar.D()) {
            aVar.f168784b = e.b.FIXED;
            z15 = false;
        }
        if (z16) {
            if (iArr[0] == 4) {
                aVar.f168783a = e.b.FIXED;
            } else if (!z15) {
                e.b bVar3 = aVar.f168784b;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i15 = aVar.f168786d;
                } else {
                    aVar.f168783a = e.b.WRAP_CONTENT;
                    interfaceC3163b.a(eVar, aVar);
                    i15 = aVar.f168788f;
                }
                aVar.f168783a = bVar4;
                aVar.f168785c = (int) (eVar.f162603a0 * i15);
            }
        }
        if (z17) {
            if (iArr[1] == 4) {
                aVar.f168784b = e.b.FIXED;
            } else if (!z14) {
                e.b bVar5 = aVar.f168783a;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i14 = aVar.f168785c;
                } else {
                    aVar.f168784b = e.b.WRAP_CONTENT;
                    interfaceC3163b.a(eVar, aVar);
                    i14 = aVar.f168787e;
                }
                aVar.f168784b = bVar6;
                int i17 = eVar.f162605b0;
                float f14 = eVar.f162603a0;
                if (i17 == -1) {
                    aVar.f168786d = (int) (i14 / f14);
                } else {
                    aVar.f168786d = (int) (f14 * i14);
                }
            }
        }
        interfaceC3163b.a(eVar, aVar);
        eVar.T(aVar.f168787e);
        eVar.O(aVar.f168788f);
        eVar.G = aVar.f168790h;
        eVar.K(aVar.f168789g);
        aVar.f168792j = 0;
    }

    @Override // t6.m, t6.e
    public final void E() {
        this.D0.t();
        this.E0 = 0;
        this.F0 = 0;
        super.E();
    }

    @Override // t6.e
    public final void U(boolean z14, boolean z15) {
        super.U(z14, z15);
        int size = this.f162695w0.size();
        for (int i14 = 0; i14 < size; i14++) {
            this.f162695w0.get(i14).U(z14, z15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:358:0x0622  */
    /* JADX WARN: Code duplicated, block: B:372:0x0659  */
    /* JADX WARN: Code duplicated, block: B:396:0x06a2  */
    /* JADX WARN: Code duplicated, block: B:401:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:408:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:411:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:413:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:417:0x06ea  */
    /* JADX WARN: Code duplicated, block: B:420:0x06fc A[Catch: Exception -> 0x070a, LOOP:12: B:419:0x06fa->B:420:0x06fc, LOOP_END, TryCatch #2 {Exception -> 0x070a, blocks: (B:418:0x06ee, B:420:0x06fc, B:423:0x0710), top: B:536:0x06ee }] */
    /* JADX WARN: Code duplicated, block: B:436:0x0741  */
    /* JADX WARN: Code duplicated, block: B:439:0x0747 A[Catch: Exception -> 0x0738, TryCatch #3 {Exception -> 0x0738, blocks: (B:430:0x0731, B:437:0x0743, B:439:0x0747, B:441:0x074d, B:442:0x0766, B:444:0x076a, B:446:0x0770, B:450:0x0785, B:453:0x0790, B:455:0x0794, B:457:0x079a), top: B:538:0x0731 }] */
    /* JADX WARN: Code duplicated, block: B:444:0x076a A[Catch: Exception -> 0x0738, TryCatch #3 {Exception -> 0x0738, blocks: (B:430:0x0731, B:437:0x0743, B:439:0x0747, B:441:0x074d, B:442:0x0766, B:444:0x076a, B:446:0x0770, B:450:0x0785, B:453:0x0790, B:455:0x0794, B:457:0x079a), top: B:538:0x0731 }] */
    /* JADX WARN: Code duplicated, block: B:453:0x0790 A[Catch: Exception -> 0x0738, PHI: r22
      0x0790: PHI (r22v7 t6.d) = (r22v2 t6.d), (r22v2 t6.d), (r22v9 t6.d) binds: [B:443:0x0768, B:445:0x076e, B:450:0x0785] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x0738, blocks: (B:430:0x0731, B:437:0x0743, B:439:0x0747, B:441:0x074d, B:442:0x0766, B:444:0x076a, B:446:0x0770, B:450:0x0785, B:453:0x0790, B:455:0x0794, B:457:0x079a), top: B:538:0x0731 }] */
    /* JADX WARN: Code duplicated, block: B:455:0x0794 A[Catch: Exception -> 0x0738, TryCatch #3 {Exception -> 0x0738, blocks: (B:430:0x0731, B:437:0x0743, B:439:0x0747, B:441:0x074d, B:442:0x0766, B:444:0x076a, B:446:0x0770, B:450:0x0785, B:453:0x0790, B:455:0x0794, B:457:0x079a), top: B:538:0x0731 }] */
    /* JADX WARN: Code duplicated, block: B:465:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:471:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:473:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:475:0x080b  */
    /* JADX WARN: Code duplicated, block: B:477:0x080f  */
    /* JADX WARN: Code duplicated, block: B:480:0x081b  */
    /* JADX WARN: Code duplicated, block: B:482:0x0824 A[LOOP:15: B:481:0x0822->B:482:0x0824, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:486:0x0837 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:502:0x08a8 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:505:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:508:0x08da  */
    /* JADX WARN: Code duplicated, block: B:509:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:511:0x08eb  */
    /* JADX WARN: Code duplicated, block: B:513:0x08f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:516:0x08fd  */
    /* JADX WARN: Code duplicated, block: B:519:0x0911 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:523:0x0929 A[PHI: r14 r23
      0x0929: PHI (r14v9 ??) = (r14v8 ??), (r14v13 ??), (r14v13 ??), (r14v13 ??) binds: [B:510:0x08e9, B:518:0x090f, B:519:0x0911, B:521:0x0917] A[DONT_GENERATE, DONT_INLINE]
      0x0929: PHI (r23v5 boolean) = (r23v4 boolean), (r23v6 boolean), (r23v6 boolean), (r23v6 boolean) binds: [B:510:0x08e9, B:518:0x090f, B:519:0x0911, B:521:0x0917] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:525:0x092f  */
    /* JADX WARN: Code duplicated, block: B:529:0x093f  */
    /* JADX WARN: Code duplicated, block: B:590:0x06de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:0x0930 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v80 */
    /* JADX WARN: Type inference failed for: r14v81 */
    /* JADX WARN: Type inference failed for: r14v82 */
    /* JADX WARN: Type inference failed for: r14v88 */
    /* JADX WARN: Type inference failed for: r14v89 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r14v90 */
    /* JADX WARN: Type inference failed for: r14v91 */
    /* JADX WARN: Type inference failed for: r14v92 */
    /* JADX WARN: Type inference failed for: r14v93 */
    /* JADX WARN: Type inference failed for: r29v0, types: [t6.e, t6.f, t6.m] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // t6.m
    public final void X() {
        d dVar;
        int i14;
        boolean z14;
        boolean z15;
        char c14;
        e.b bVar;
        e.b bVar2;
        boolean z16;
        int i15;
        boolean zD0;
        boolean z17;
        int i16;
        ?? r14;
        boolean z18;
        int i17;
        d dVar2;
        ?? r15;
        boolean[] zArr;
        boolean[] zArr2;
        int i18;
        boolean z19;
        int i19;
        int iMax;
        boolean z24;
        int iMax2;
        ?? r16;
        ?? r17;
        int i24;
        ?? r18;
        e.b bVar3;
        e.b bVar4;
        boolean zD1;
        int size;
        int i25;
        boolean z25;
        e eVar;
        ?? r19;
        int i26;
        WeakReference<d> weakReference;
        WeakReference<d> weakReference2;
        WeakReference<d> weakReference3;
        WeakReference<d> weakReference4;
        e eVar2;
        e.b bVar5;
        o oVar;
        o oVar2;
        int iB;
        int iB2;
        int i27;
        ArrayList<e> arrayList;
        o oVar3;
        o oVar4;
        ArrayList arrayList2;
        int i28;
        int i29;
        this.f162607c0 = 0;
        this.f162609d0 = 0;
        this.L0 = false;
        this.M0 = false;
        int size2 = this.f162695w0.size();
        int iMax3 = Math.max(0, s());
        int iMax4 = Math.max(0, m());
        e.b[] bVarArr = this.W;
        e.b bVar6 = bVarArr[1];
        e.b bVar7 = bVarArr[0];
        int i30 = this.f162658z0;
        d dVar3 = this.M;
        d dVar4 = this.L;
        if (i30 == 0 && j.b(this.K0, 1)) {
            u6.b.InterfaceC3163b interfaceC3163b = this.A0;
            u6.b.a aVar = u6.h.f168825a;
            e.b[] bVarArr2 = this.W;
            e.b bVar8 = bVarArr2[0];
            e.b bVar9 = bVarArr2[1];
            G();
            ArrayList<e> arrayList3 = this.f162695w0;
            int size3 = arrayList3.size();
            for (int i34 = 0; i34 < size3; i34++) {
                arrayList3.get(i34).G();
            }
            boolean z26 = this.B0;
            if (bVar8 == e.b.FIXED) {
                M(0, s());
            } else {
                dVar4.l(0);
                this.f162607c0 = 0;
            }
            boolean z27 = false;
            int i35 = 0;
            boolean z28 = false;
            while (i35 < size3) {
                e eVar3 = arrayList3.get(i35);
                boolean z29 = z27;
                if (eVar3 instanceof h) {
                    h hVar = (h) eVar3;
                    i29 = i35;
                    if (hVar.A0 == 1) {
                        int i36 = hVar.f162686x0;
                        if (i36 != -1) {
                            hVar.W(i36);
                        } else if (hVar.f162687y0 != -1 && C()) {
                            hVar.W(s() - hVar.f162687y0);
                        } else if (C()) {
                            hVar.W((int) ((hVar.f162685w0 * s()) + 0.5f));
                        }
                        z29 = true;
                    }
                } else {
                    i29 = i35;
                    if ((eVar3 instanceof a) && ((a) eVar3).b0() == 0) {
                        z27 = z29;
                        z28 = true;
                    }
                    i35 = i29 + 1;
                }
                z27 = z29;
                i35 = i29 + 1;
            }
            if (z27) {
                for (int i37 = 0; i37 < size3; i37 = i28 + 1) {
                    e eVar4 = arrayList3.get(i37);
                    if (eVar4 instanceof h) {
                        h hVar2 = (h) eVar4;
                        i28 = i37;
                        if (hVar2.A0 == 1) {
                            u6.h.b(0, hVar2, interfaceC3163b, z26);
                        }
                    } else {
                        i28 = i37;
                    }
                }
            }
            u6.h.b(0, this, interfaceC3163b, z26);
            if (z28) {
                for (int i38 = 0; i38 < size3; i38++) {
                    e eVar5 = arrayList3.get(i38);
                    if (eVar5 instanceof a) {
                        a aVar2 = (a) eVar5;
                        if (aVar2.b0() == 0 && aVar2.a0()) {
                            u6.h.b(1, aVar2, interfaceC3163b, z26);
                        }
                    }
                }
            }
            if (bVar9 == e.b.FIXED) {
                N(0, m());
            } else {
                dVar3.l(0);
                this.f162609d0 = 0;
            }
            int i39 = 0;
            boolean z34 = false;
            boolean z35 = false;
            while (i39 < size3) {
                e eVar6 = arrayList3.get(i39);
                int i44 = i39;
                if (eVar6 instanceof h) {
                    h hVar3 = (h) eVar6;
                    if (hVar3.A0 == 0) {
                        int i45 = hVar3.f162686x0;
                        if (i45 != -1) {
                            hVar3.W(i45);
                        } else if (hVar3.f162687y0 != -1 && D()) {
                            hVar3.W(m() - hVar3.f162687y0);
                        } else if (D()) {
                            hVar3.W((int) ((hVar3.f162685w0 * m()) + 0.5f));
                        }
                        z34 = true;
                    }
                } else if ((eVar6 instanceof a) && ((a) eVar6).b0() == 1) {
                    z35 = true;
                }
                i39 = i44 + 1;
            }
            if (z34) {
                for (int i46 = 0; i46 < size3; i46++) {
                    e eVar7 = arrayList3.get(i46);
                    if (eVar7 instanceof h) {
                        h hVar4 = (h) eVar7;
                        if (hVar4.A0 == 0) {
                            u6.h.g(1, hVar4, interfaceC3163b);
                        }
                    }
                }
            }
            u6.h.g(0, this, interfaceC3163b);
            if (z35) {
                for (int i47 = 0; i47 < size3; i47++) {
                    e eVar8 = arrayList3.get(i47);
                    if (eVar8 instanceof a) {
                        a aVar3 = (a) eVar8;
                        if (aVar3.b0() == 1 && aVar3.a0()) {
                            u6.h.g(1, aVar3, interfaceC3163b);
                        }
                    }
                }
            }
            for (int i48 = 0; i48 < size3; i48++) {
                e eVar9 = arrayList3.get(i48);
                if (eVar9.B() && u6.h.a(eVar9)) {
                    c0(eVar9, interfaceC3163b, u6.h.f168825a);
                    if (!(eVar9 instanceof h)) {
                        u6.h.b(0, eVar9, interfaceC3163b, z26);
                        u6.h.g(0, eVar9, interfaceC3163b);
                    } else if (((h) eVar9).A0 == 0) {
                        u6.h.g(0, eVar9, interfaceC3163b);
                    } else {
                        u6.h.b(0, eVar9, interfaceC3163b, z26);
                    }
                }
            }
            for (int i49 = 0; i49 < size2; i49++) {
                e eVar10 = this.f162695w0.get(i49);
                if (eVar10.B() && !(eVar10 instanceof h) && !(eVar10 instanceof a) && !(eVar10 instanceof l) && !eVar10.I) {
                    e.b bVarL = eVar10.l(0);
                    e.b bVarL2 = eVar10.l(1);
                    e.b bVar10 = e.b.MATCH_CONSTRAINT;
                    if (bVarL != bVar10 || eVar10.f162640t == 1 || bVarL2 != bVar10 || eVar10.f162642u == 1) {
                        c0(eVar10, this.A0, new u6.b.a());
                    }
                }
            }
        }
        m6.d dVar5 = this.D0;
        if (size2 > 2 && ((bVar7 == (bVar5 = e.b.WRAP_CONTENT) || bVar6 == bVar5) && j.b(this.K0, 1024))) {
            u6.b.InterfaceC3163b interfaceC3163b2 = this.A0;
            ArrayList<e> arrayList4 = this.f162695w0;
            int size4 = arrayList4.size();
            int i54 = 0;
            while (true) {
                if (i54 >= size4) {
                    dVar = dVar4;
                    int i55 = 0;
                    ArrayList arrayList5 = null;
                    ArrayList arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    ArrayList arrayList9 = null;
                    ArrayList arrayList10 = null;
                    while (i55 < size4) {
                        int i56 = i55;
                        e eVar11 = arrayList4.get(i55);
                        ArrayList arrayList11 = arrayList5;
                        e.b[] bVarArr3 = this.W;
                        e.b bVar11 = bVarArr3[0];
                        ArrayList arrayList12 = arrayList6;
                        e.b bVar12 = bVarArr3[1];
                        ArrayList arrayList13 = arrayList7;
                        e.b[] bVarArr4 = eVar11.W;
                        ArrayList arrayList14 = arrayList8;
                        if (!u6.i.b(bVar11, bVar12, bVarArr4[0], bVarArr4[1])) {
                            c0(eVar11, interfaceC3163b2, this.S0);
                        }
                        boolean z36 = eVar11 instanceof h;
                        if (z36) {
                            h hVar5 = (h) eVar11;
                            if (hVar5.A0 == 0) {
                                ArrayList arrayList15 = arrayList12 == null ? new ArrayList() : arrayList12;
                                arrayList15.add(hVar5);
                                arrayList12 = arrayList15;
                            }
                            if (hVar5.A0 == 1) {
                                ArrayList arrayList16 = arrayList10 == null ? new ArrayList() : arrayList10;
                                arrayList16.add(hVar5);
                                arrayList10 = arrayList16;
                            }
                        }
                        ArrayList arrayList17 = arrayList12;
                        if (!(eVar11 instanceof i)) {
                            arrayList5 = arrayList11;
                            arrayList7 = arrayList13;
                        } else if (eVar11 instanceof a) {
                            a aVar4 = (a) eVar11;
                            if (aVar4.b0() == 0) {
                                arrayList2 = arrayList11 == null ? new ArrayList() : arrayList11;
                                arrayList2.add(aVar4);
                            } else {
                                arrayList2 = arrayList11;
                            }
                            if (aVar4.b0() == 1) {
                                ArrayList arrayList18 = arrayList13 == null ? new ArrayList() : arrayList13;
                                arrayList18.add(aVar4);
                                arrayList7 = arrayList18;
                            } else {
                                arrayList7 = arrayList13;
                            }
                            arrayList5 = arrayList2;
                        } else {
                            i iVar = (i) eVar11;
                            ArrayList arrayList19 = arrayList11 == null ? new ArrayList() : arrayList11;
                            arrayList19.add(iVar);
                            arrayList7 = arrayList13 == null ? new ArrayList() : arrayList13;
                            arrayList7.add(iVar);
                            arrayList5 = arrayList19;
                        }
                        if (eVar11.L.f162588f != null || eVar11.N.f162588f != null || z36 || (eVar11 instanceof a)) {
                            arrayList8 = arrayList14;
                        } else {
                            arrayList8 = arrayList14 == null ? new ArrayList() : arrayList14;
                            arrayList8.add(eVar11);
                        }
                        if (eVar11.M.f162588f == null && eVar11.O.f162588f == null && eVar11.P.f162588f == null && z36 == 0 && !(eVar11 instanceof a)) {
                            if (arrayList9 == null) {
                                arrayList9 = new ArrayList();
                            }
                            ArrayList arrayList20 = arrayList9;
                            arrayList20.add(eVar11);
                            arrayList9 = arrayList20;
                        }
                        i55 = i56 + 1;
                        arrayList6 = arrayList17;
                    }
                    ArrayList<i> arrayList21 = arrayList5;
                    ArrayList arrayList22 = arrayList6;
                    ArrayList<i> arrayList23 = arrayList7;
                    ArrayList arrayList24 = arrayList8;
                    ArrayList<o> arrayList25 = new ArrayList<>();
                    if (arrayList10 != null) {
                        Iterator it = arrayList10.iterator();
                        while (it.hasNext()) {
                            u6.i.a((h) it.next(), 0, arrayList25, null);
                        }
                    }
                    o oVar5 = null;
                    int i57 = 0;
                    if (arrayList21 != null) {
                        for (i iVar2 : arrayList21) {
                            o oVarA = u6.i.a(iVar2, i57, arrayList25, oVar5);
                            iVar2.X(i57, arrayList25, oVarA);
                            oVarA.a(arrayList25);
                            oVar5 = null;
                            i57 = 0;
                        }
                    }
                    HashSet<d> hashSet = k(d.a.LEFT).f162583a;
                    if (hashSet != null) {
                        Iterator<d> it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            u6.i.a(it3.next().f162586d, 0, arrayList25, null);
                        }
                    }
                    HashSet<d> hashSet2 = k(d.a.RIGHT).f162583a;
                    if (hashSet2 != null) {
                        Iterator<d> it4 = hashSet2.iterator();
                        while (it4.hasNext()) {
                            u6.i.a(it4.next().f162586d, 0, arrayList25, null);
                        }
                    }
                    HashSet<d> hashSet3 = k(d.a.CENTER).f162583a;
                    if (hashSet3 != null) {
                        Iterator<d> it5 = hashSet3.iterator();
                        while (it5.hasNext()) {
                            u6.i.a(it5.next().f162586d, 0, arrayList25, null);
                        }
                    }
                    o oVar6 = null;
                    if (arrayList24 != null) {
                        Iterator it6 = arrayList24.iterator();
                        while (it6.hasNext()) {
                            u6.i.a((e) it6.next(), 0, arrayList25, null);
                        }
                    }
                    if (arrayList22 != null) {
                        Iterator it7 = arrayList22.iterator();
                        while (it7.hasNext()) {
                            u6.i.a((h) it7.next(), 1, arrayList25, null);
                        }
                    }
                    int i58 = 1;
                    if (arrayList23 != null) {
                        for (i iVar3 : arrayList23) {
                            o oVarA2 = u6.i.a(iVar3, i58, arrayList25, oVar6);
                            iVar3.X(i58, arrayList25, oVarA2);
                            oVarA2.a(arrayList25);
                            oVar6 = null;
                            i58 = 1;
                        }
                    }
                    HashSet<d> hashSet4 = k(d.a.TOP).f162583a;
                    if (hashSet4 != null) {
                        Iterator<d> it8 = hashSet4.iterator();
                        while (it8.hasNext()) {
                            u6.i.a(it8.next().f162586d, 1, arrayList25, null);
                        }
                    }
                    HashSet<d> hashSet5 = k(d.a.BASELINE).f162583a;
                    if (hashSet5 != null) {
                        Iterator<d> it9 = hashSet5.iterator();
                        while (it9.hasNext()) {
                            u6.i.a(it9.next().f162586d, 1, arrayList25, null);
                        }
                    }
                    HashSet<d> hashSet6 = k(d.a.BOTTOM).f162583a;
                    if (hashSet6 != null) {
                        Iterator<d> it10 = hashSet6.iterator();
                        while (it10.hasNext()) {
                            u6.i.a(it10.next().f162586d, 1, arrayList25, null);
                        }
                    }
                    HashSet<d> hashSet7 = k(d.a.CENTER).f162583a;
                    if (hashSet7 != null) {
                        Iterator<d> it11 = hashSet7.iterator();
                        while (it11.hasNext()) {
                            u6.i.a(it11.next().f162586d, 1, arrayList25, null);
                        }
                    }
                    if (arrayList9 != null) {
                        Iterator it12 = arrayList9.iterator();
                        while (it12.hasNext()) {
                            u6.i.a((e) it12.next(), 1, arrayList25, null);
                        }
                    }
                    int i59 = 0;
                    while (i59 < size4) {
                        e eVar12 = arrayList4.get(i59);
                        e.b[] bVarArr5 = eVar12.W;
                        e.b bVar13 = bVarArr5[0];
                        e.b bVar14 = e.b.MATCH_CONSTRAINT;
                        if (bVar13 == bVar14 && bVarArr5[1] == bVar14) {
                            int i64 = eVar12.f162643u0;
                            int size5 = arrayList25.size();
                            int i65 = 0;
                            while (true) {
                                if (i65 >= size5) {
                                    i27 = i59;
                                    arrayList = arrayList4;
                                    oVar3 = null;
                                    break;
                                }
                                i27 = i59;
                                oVar3 = arrayList25.get(i65);
                                arrayList = arrayList4;
                                if (i64 == oVar3.f168835b) {
                                    break;
                                }
                                i65++;
                                arrayList4 = arrayList;
                                i59 = i27;
                            }
                            int i66 = eVar12.f162645v0;
                            int size6 = arrayList25.size();
                            int i67 = 0;
                            while (true) {
                                if (i67 >= size6) {
                                    oVar4 = null;
                                    break;
                                }
                                oVar4 = arrayList25.get(i67);
                                if (i66 == oVar4.f168835b) {
                                    break;
                                } else {
                                    i67++;
                                }
                            }
                            if (oVar3 != null && oVar4 != null) {
                                oVar3.c(0, oVar4);
                                oVar4.f168836c = 2;
                                arrayList25.remove(oVar3);
                            }
                        } else {
                            i27 = i59;
                            arrayList = arrayList4;
                        }
                        i59 = i27 + 1;
                        arrayList4 = arrayList;
                    }
                    if (arrayList25.size() > 1) {
                        if (this.W[0] == e.b.WRAP_CONTENT) {
                            oVar = null;
                            int i68 = 0;
                            for (o oVar7 : arrayList25) {
                                if (oVar7.f168836c != 1 && (iB2 = oVar7.b(dVar5, 0)) > i68) {
                                    oVar = oVar7;
                                    i68 = iB2;
                                }
                            }
                            if (oVar != null) {
                                P(e.b.FIXED);
                                T(i68);
                            } else {
                                oVar = null;
                            }
                        } else {
                            oVar = null;
                        }
                        if (this.W[1] == e.b.WRAP_CONTENT) {
                            oVar2 = null;
                            int i69 = 0;
                            for (o oVar8 : arrayList25) {
                                if (oVar8.f168836c != 0 && (iB = oVar8.b(dVar5, 1)) > i69) {
                                    oVar2 = oVar8;
                                    i69 = iB;
                                }
                            }
                            if (oVar2 != null) {
                                R(e.b.FIXED);
                                O(i69);
                            } else {
                                oVar2 = null;
                            }
                        } else {
                            oVar2 = null;
                        }
                        if (oVar != null || oVar2 != null) {
                            e.b bVar15 = e.b.WRAP_CONTENT;
                            if (bVar7 == bVar15) {
                                if (iMax3 >= s() || iMax3 <= 0) {
                                    iMax3 = s();
                                } else {
                                    T(iMax3);
                                    this.L0 = true;
                                }
                            }
                            if (bVar6 == bVar15) {
                                if (iMax4 >= m() || iMax4 <= 0) {
                                    iMax4 = m();
                                } else {
                                    O(iMax4);
                                    this.M0 = true;
                                }
                            }
                            i14 = iMax3;
                            z14 = true;
                            break;
                        }
                    }
                } else {
                    e eVar13 = arrayList4.get(i54);
                    e.b[] bVarArr6 = this.W;
                    e.b bVar16 = bVarArr6[0];
                    e.b bVar17 = bVarArr6[1];
                    int i74 = i54;
                    e.b[] bVarArr7 = eVar13.W;
                    dVar = dVar4;
                    if (u6.i.b(bVar16, bVar17, bVarArr7[0], bVarArr7[1]) && !(eVar13 instanceof g)) {
                        i54 = i74 + 1;
                        dVar4 = dVar;
                    }
                }
            }
            if (!d0(64) || d0(128)) {
                z15 = true;
            } else {
                z15 = false;
            }
            dVar5.getClass();
            dVar5.f116828h = false;
            if (this.K0 == 0 && z15) {
                c14 = 1;
                dVar5.f116828h = true;
            } else {
                c14 = 1;
            }
            ArrayList<e> arrayList26 = this.f162695w0;
            e.b[] bVarArr8 = this.W;
            bVar = bVarArr8[0];
            bVar2 = e.b.WRAP_CONTENT;
            if (bVar != bVar2 || bVarArr8[c14] == bVar2) {
                z16 = true;
            } else {
                z16 = false;
            }
            this.G0 = 0;
            this.H0 = 0;
            for (i15 = 0; i15 < size2; i15++) {
                eVar2 = this.f162695w0.get(i15);
                if (eVar2 instanceof m) {
                    ((m) eVar2).X();
                }
            }
            zD0 = d0(64);
            z17 = z14;
            i16 = 0;
            r14 = 1;
            while (r14 != 0) {
                i17 = i16 + 1;
                try {
                    dVar5.t();
                    this.G0 = 0;
                    this.H0 = 0;
                    i(dVar5);
                    for (i26 = 0; i26 < size2; i26++) {
                        this.f162695w0.get(i26).i(dVar5);
                    }
                    Z(dVar5);
                    try {
                        weakReference = this.N0;
                        if (weakReference != null || weakReference.get() == null) {
                            dVar2 = dVar3;
                        } else {
                            dVar2 = dVar3;
                            try {
                                dVar5.f(dVar5.k(this.N0.get()), dVar5.k(dVar3), 0, 5);
                                this.N0 = null;
                            } catch (Exception e4) {
                                e = e4;
                                r19 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r19;
                                zArr = j.f162692a;
                                if (r15 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(dVar5, zD1);
                                    size = this.f162695w0.size();
                                    i25 = 0;
                                    z25 = false;
                                    while (i25 < size) {
                                        boolean[] zArr3 = zArr;
                                        eVar = this.f162695w0.get(i25);
                                        eVar.V(dVar5, zD1);
                                        int i75 = i25;
                                        boolean z37 = zD1;
                                        if (eVar.f162618i == -1) {
                                            z25 = true;
                                        } else {
                                            z25 = true;
                                        }
                                        i25 = i75 + 1;
                                        zArr = zArr3;
                                        zD1 = z37;
                                        z25 = z25;
                                    }
                                    zArr2 = zArr;
                                    z19 = z25;
                                } else {
                                    zArr2 = zArr;
                                    V(dVar5, zD0);
                                    for (i18 = 0; i18 < size2; i18++) {
                                        this.f162695w0.get(i18).V(dVar5, zD0);
                                    }
                                    z19 = false;
                                }
                                if (z16) {
                                    i19 = size2;
                                } else {
                                    i19 = size2;
                                }
                                iMax = Math.max(this.f162613f0, s());
                                z24 = z19;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.W[0] = e.b.FIXED;
                                    z24 = true;
                                    z17 = true;
                                }
                                iMax2 = Math.max(this.f162615g0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r16 = 1;
                                    this.W[1] = e.b.FIXED;
                                    r17 = 1;
                                    z17 = true;
                                } else {
                                    r16 = 1;
                                }
                                if (z17) {
                                    r17 = z24;
                                    z17 = z17;
                                    i24 = 8;
                                    r18 = r17;
                                } else {
                                    r17 = z24;
                                    bVar3 = this.W[0];
                                    bVar4 = e.b.WRAP_CONTENT;
                                    if (bVar3 == bVar4) {
                                        r17 = r17;
                                        if (s() > i14) {
                                            this.L0 = r16;
                                            this.W[0] = e.b.FIXED;
                                            T(i14);
                                            ?? r110 = r16;
                                            z17 = r110 == true ? 1 : 0;
                                            r17 = r110;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.W[r16] == bVar4) {
                                        r17 = z24;
                                        z17 = z17;
                                        i24 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z24;
                                        z17 = z17;
                                        i24 = 8;
                                        r18 = r17;
                                    }
                                }
                                if (i17 > i24) {
                                    r18 = 0;
                                }
                                i16 = i17;
                                dVar3 = dVar2;
                                size2 = i19;
                                r14 = r18;
                            }
                        }
                        weakReference2 = this.P0;
                        if (weakReference2 != null && weakReference2.get() != null) {
                            dVar5.f(dVar5.k(this.O), dVar5.k(this.P0.get()), 0, 5);
                            this.P0 = null;
                        }
                        weakReference3 = this.O0;
                        if (weakReference3 != null || weakReference3.get() == null) {
                            weakReference4 = this.Q0;
                            if (weakReference4 == null && weakReference4.get() != null) {
                                try {
                                    dVar5.f(dVar5.k(this.N), dVar5.k(this.Q0.get()), 0, 5);
                                    try {
                                        this.Q0 = null;
                                    } catch (Exception e14) {
                                        e = e14;
                                        r19 = 1;
                                        e.printStackTrace();
                                        System.out.println("EXCEPTION : " + e);
                                        r15 = r19;
                                    }
                                } catch (Exception e15) {
                                    e = e15;
                                    r19 = 1;
                                    e.printStackTrace();
                                    System.out.println("EXCEPTION : " + e);
                                    r15 = r19;
                                    zArr = j.f162692a;
                                    if (r15 != 0) {
                                        zArr[2] = false;
                                        zD1 = d0(64);
                                        V(dVar5, zD1);
                                        size = this.f162695w0.size();
                                        i25 = 0;
                                        z25 = false;
                                        while (i25 < size) {
                                            boolean[] zArr4 = zArr;
                                            eVar = this.f162695w0.get(i25);
                                            eVar.V(dVar5, zD1);
                                            int i76 = i25;
                                            boolean z38 = zD1;
                                            if (eVar.f162618i == -1) {
                                                z25 = true;
                                            } else {
                                                z25 = true;
                                            }
                                            i25 = i76 + 1;
                                            zArr = zArr4;
                                            zD1 = z38;
                                            z25 = z25;
                                        }
                                        zArr2 = zArr;
                                        z19 = z25;
                                    } else {
                                        zArr2 = zArr;
                                        V(dVar5, zD0);
                                        while (i18 < size2) {
                                            this.f162695w0.get(i18).V(dVar5, zD0);
                                        }
                                        z19 = false;
                                    }
                                    if (z16) {
                                        i19 = size2;
                                    } else {
                                        i19 = size2;
                                    }
                                    iMax = Math.max(this.f162613f0, s());
                                    z24 = z19;
                                    if (iMax > s()) {
                                        T(iMax);
                                        this.W[0] = e.b.FIXED;
                                        z24 = true;
                                        z17 = true;
                                    }
                                    iMax2 = Math.max(this.f162615g0, m());
                                    if (iMax2 > m()) {
                                        O(iMax2);
                                        r16 = 1;
                                        this.W[1] = e.b.FIXED;
                                        r17 = 1;
                                        z17 = true;
                                    } else {
                                        r16 = 1;
                                    }
                                    if (z17) {
                                        r17 = z24;
                                        bVar3 = this.W[0];
                                        bVar4 = e.b.WRAP_CONTENT;
                                        if (bVar3 == bVar4) {
                                            r17 = r17;
                                            if (s() > i14) {
                                                this.L0 = r16;
                                                this.W[0] = e.b.FIXED;
                                                T(i14);
                                                ?? r111 = r16;
                                                z17 = r111 == true ? 1 : 0;
                                                r17 = r111;
                                            }
                                        }
                                        r17 = r17;
                                        r17 = r17;
                                        if (this.W[r16] == bVar4) {
                                            r17 = z24;
                                            z17 = z17;
                                            i24 = 8;
                                            r18 = r17;
                                        } else {
                                            r17 = z24;
                                            z17 = z17;
                                            i24 = 8;
                                            r18 = r17;
                                        }
                                    } else {
                                        r17 = z24;
                                        z17 = z17;
                                        i24 = 8;
                                        r18 = r17;
                                    }
                                    if (i17 > i24) {
                                        r18 = 0;
                                    }
                                    i16 = i17;
                                    dVar3 = dVar2;
                                    size2 = i19;
                                    r14 = r18;
                                }
                            }
                            dVar5.p();
                            r15 = 1;
                        } else {
                            d dVar6 = dVar;
                            try {
                                dVar = dVar6;
                                dVar5.f(dVar5.k(this.O0.get()), dVar5.k(dVar6), 0, 5);
                                this.O0 = null;
                                weakReference4 = this.Q0;
                                if (weakReference4 == null) {
                                }
                                dVar5.p();
                                r15 = 1;
                            } catch (Exception e16) {
                                e = e16;
                                dVar = dVar6;
                                r19 = 1;
                                e.printStackTrace();
                                System.out.println("EXCEPTION : " + e);
                                r15 = r19;
                                zArr = j.f162692a;
                                if (r15 != 0) {
                                    zArr[2] = false;
                                    zD1 = d0(64);
                                    V(dVar5, zD1);
                                    size = this.f162695w0.size();
                                    i25 = 0;
                                    z25 = false;
                                    while (i25 < size) {
                                        boolean[] zArr5 = zArr;
                                        eVar = this.f162695w0.get(i25);
                                        eVar.V(dVar5, zD1);
                                        int i77 = i25;
                                        boolean z39 = zD1;
                                        if (eVar.f162618i == -1) {
                                            z25 = true;
                                        } else {
                                            z25 = true;
                                        }
                                        i25 = i77 + 1;
                                        zArr = zArr5;
                                        zD1 = z39;
                                        z25 = z25;
                                    }
                                    zArr2 = zArr;
                                    z19 = z25;
                                } else {
                                    zArr2 = zArr;
                                    V(dVar5, zD0);
                                    while (i18 < size2) {
                                        this.f162695w0.get(i18).V(dVar5, zD0);
                                    }
                                    z19 = false;
                                }
                                if (z16) {
                                    i19 = size2;
                                } else {
                                    i19 = size2;
                                }
                                iMax = Math.max(this.f162613f0, s());
                                z24 = z19;
                                if (iMax > s()) {
                                    T(iMax);
                                    this.W[0] = e.b.FIXED;
                                    z24 = true;
                                    z17 = true;
                                }
                                iMax2 = Math.max(this.f162615g0, m());
                                if (iMax2 > m()) {
                                    O(iMax2);
                                    r16 = 1;
                                    this.W[1] = e.b.FIXED;
                                    r17 = 1;
                                    z17 = true;
                                } else {
                                    r16 = 1;
                                }
                                if (z17) {
                                    r17 = z24;
                                    bVar3 = this.W[0];
                                    bVar4 = e.b.WRAP_CONTENT;
                                    if (bVar3 == bVar4) {
                                        r17 = r17;
                                        if (s() > i14) {
                                            this.L0 = r16;
                                            this.W[0] = e.b.FIXED;
                                            T(i14);
                                            ?? r112 = r16;
                                            z17 = r112 == true ? 1 : 0;
                                            r17 = r112;
                                        }
                                    }
                                    r17 = r17;
                                    r17 = r17;
                                    if (this.W[r16] == bVar4) {
                                        r17 = z24;
                                        z17 = z17;
                                        i24 = 8;
                                        r18 = r17;
                                    } else {
                                        r17 = z24;
                                        z17 = z17;
                                        i24 = 8;
                                        r18 = r17;
                                    }
                                } else {
                                    r17 = z24;
                                    z17 = z17;
                                    i24 = 8;
                                    r18 = r17;
                                }
                                if (i17 > i24) {
                                    r18 = 0;
                                }
                                i16 = i17;
                                dVar3 = dVar2;
                                size2 = i19;
                                r14 = r18;
                            }
                        }
                    } catch (Exception e17) {
                        e = e17;
                        dVar2 = dVar3;
                    }
                } catch (Exception e18) {
                    e = e18;
                    dVar2 = dVar3;
                    r19 = r14;
                }
                zArr = j.f162692a;
                if (r15 != 0) {
                    zArr[2] = false;
                    zD1 = d0(64);
                    V(dVar5, zD1);
                    size = this.f162695w0.size();
                    i25 = 0;
                    z25 = false;
                    while (i25 < size) {
                        boolean[] zArr6 = zArr;
                        eVar = this.f162695w0.get(i25);
                        eVar.V(dVar5, zD1);
                        int i78 = i25;
                        boolean z310 = zD1;
                        if (eVar.f162618i == -1 || eVar.f162620j != -1) {
                            z25 = true;
                        }
                        i25 = i78 + 1;
                        zArr = zArr6;
                        zD1 = z310;
                        z25 = z25;
                    }
                    zArr2 = zArr;
                    z19 = z25;
                } else {
                    zArr2 = zArr;
                    V(dVar5, zD0);
                    while (i18 < size2) {
                        this.f162695w0.get(i18).V(dVar5, zD0);
                    }
                    z19 = false;
                }
                if (z16 || i17 >= 8 || !zArr2[2]) {
                    i19 = size2;
                } else {
                    int i79 = 0;
                    int iMax5 = 0;
                    int iMax6 = 0;
                    while (i79 < size2) {
                        e eVar14 = this.f162695w0.get(i79);
                        iMax6 = Math.max(iMax6, eVar14.s() + eVar14.f162607c0);
                        iMax5 = Math.max(iMax5, eVar14.m() + eVar14.f162609d0);
                        i79++;
                        size2 = size2;
                    }
                    i19 = size2;
                    int iMax7 = Math.max(this.f162613f0, iMax6);
                    int iMax8 = Math.max(this.f162615g0, iMax5);
                    e.b bVar18 = e.b.WRAP_CONTENT;
                    z19 = z19;
                    if (bVar7 == bVar18 && s() < iMax7) {
                        z19 = z19;
                        T(iMax7);
                        this.W[0] = bVar18;
                        z19 = true;
                        z17 = true;
                    }
                    if (bVar6 == bVar18 && m() < iMax8) {
                        O(iMax8);
                        this.W[1] = bVar18;
                        z19 = true;
                        z17 = true;
                    }
                }
                iMax = Math.max(this.f162613f0, s());
                z24 = z19;
                if (iMax > s()) {
                    T(iMax);
                    this.W[0] = e.b.FIXED;
                    z24 = true;
                    z17 = true;
                }
                iMax2 = Math.max(this.f162615g0, m());
                if (iMax2 > m()) {
                    O(iMax2);
                    r16 = 1;
                    this.W[1] = e.b.FIXED;
                    r17 = 1;
                    z17 = true;
                } else {
                    r16 = 1;
                }
                if (z17) {
                    r17 = z24;
                    bVar3 = this.W[0];
                    bVar4 = e.b.WRAP_CONTENT;
                    if (bVar3 == bVar4 && i14 > 0) {
                        r17 = r17;
                        if (s() > i14) {
                            this.L0 = r16;
                            this.W[0] = e.b.FIXED;
                            T(i14);
                            ?? r113 = r16;
                            z17 = r113 == true ? 1 : 0;
                            r17 = r113;
                        }
                    }
                    r17 = r17;
                    r17 = r17;
                    if (this.W[r16] == bVar4 || iMax4 <= 0 || m() <= iMax4) {
                        r17 = z24;
                        z17 = z17;
                        i24 = 8;
                        r18 = r17;
                    } else {
                        this.M0 = r16;
                        this.W[r16] = e.b.FIXED;
                        O(iMax4);
                        i24 = 8;
                        z17 = true;
                        r18 = 1;
                    }
                } else {
                    r17 = z24;
                    z17 = z17;
                    i24 = 8;
                    r18 = r17;
                }
                if (i17 > i24) {
                    r18 = 0;
                }
                i16 = i17;
                dVar3 = dVar2;
                size2 = i19;
                r14 = r18;
            }
            z18 = z17 ? 1 : 0;
            this.f162695w0 = arrayList26;
            if (z18) {
                e.b[] bVarArr9 = this.W;
                bVarArr9[0] = bVar7;
                bVarArr9[1] = bVar6;
            }
            H(dVar5.f116833m);
        }
        dVar = dVar4;
        i14 = iMax3;
        z14 = false;
        if (d0(64)) {
            z15 = true;
        } else {
            z15 = true;
        }
        dVar5.getClass();
        dVar5.f116828h = false;
        if (this.K0 == 0) {
            c14 = 1;
        } else {
            c14 = 1;
        }
        ArrayList<e> arrayList27 = this.f162695w0;
        e.b[] bVarArr10 = this.W;
        bVar = bVarArr10[0];
        bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2) {
            z16 = true;
        } else {
            z16 = true;
        }
        this.G0 = 0;
        this.H0 = 0;
        while (i15 < size2) {
            eVar2 = this.f162695w0.get(i15);
            if (eVar2 instanceof m) {
                ((m) eVar2).X();
            }
        }
        zD0 = d0(64);
        z17 = z14;
        i16 = 0;
        r14 = 1;
        while (r14 != 0) {
            i17 = i16 + 1;
            dVar5.t();
            this.G0 = 0;
            this.H0 = 0;
            i(dVar5);
            while (i26 < size2) {
                this.f162695w0.get(i26).i(dVar5);
            }
            Z(dVar5);
            weakReference = this.N0;
            if (weakReference != null) {
                dVar2 = dVar3;
                weakReference2 = this.P0;
                if (weakReference2 != null) {
                    dVar5.f(dVar5.k(this.O), dVar5.k(this.P0.get()), 0, 5);
                    this.P0 = null;
                }
                weakReference3 = this.O0;
                if (weakReference3 != null) {
                    weakReference4 = this.Q0;
                    if (weakReference4 == null) {
                    }
                    dVar5.p();
                    r15 = 1;
                } else {
                    weakReference4 = this.Q0;
                    if (weakReference4 == null) {
                    }
                    dVar5.p();
                    r15 = 1;
                }
            } else {
                dVar2 = dVar3;
                weakReference2 = this.P0;
                if (weakReference2 != null) {
                    dVar5.f(dVar5.k(this.O), dVar5.k(this.P0.get()), 0, 5);
                    this.P0 = null;
                }
                weakReference3 = this.O0;
                if (weakReference3 != null) {
                    weakReference4 = this.Q0;
                    if (weakReference4 == null) {
                    }
                    dVar5.p();
                    r15 = 1;
                } else {
                    weakReference4 = this.Q0;
                    if (weakReference4 == null) {
                    }
                    dVar5.p();
                    r15 = 1;
                }
            }
            zArr = j.f162692a;
            if (r15 != 0) {
                zArr[2] = false;
                zD1 = d0(64);
                V(dVar5, zD1);
                size = this.f162695w0.size();
                i25 = 0;
                z25 = false;
                while (i25 < size) {
                    boolean[] zArr7 = zArr;
                    eVar = this.f162695w0.get(i25);
                    eVar.V(dVar5, zD1);
                    int i710 = i25;
                    boolean z311 = zD1;
                    if (eVar.f162618i == -1) {
                        z25 = true;
                    } else {
                        z25 = true;
                    }
                    i25 = i710 + 1;
                    zArr = zArr7;
                    zD1 = z311;
                    z25 = z25;
                }
                zArr2 = zArr;
                z19 = z25;
            } else {
                zArr2 = zArr;
                V(dVar5, zD0);
                while (i18 < size2) {
                    this.f162695w0.get(i18).V(dVar5, zD0);
                }
                z19 = false;
            }
            if (z16) {
                i19 = size2;
            } else {
                i19 = size2;
            }
            iMax = Math.max(this.f162613f0, s());
            z24 = z19;
            if (iMax > s()) {
                T(iMax);
                this.W[0] = e.b.FIXED;
                z24 = true;
                z17 = true;
            }
            iMax2 = Math.max(this.f162615g0, m());
            if (iMax2 > m()) {
                O(iMax2);
                r16 = 1;
                this.W[1] = e.b.FIXED;
                r17 = 1;
                z17 = true;
            } else {
                r16 = 1;
            }
            if (z17) {
                r17 = z24;
                bVar3 = this.W[0];
                bVar4 = e.b.WRAP_CONTENT;
                if (bVar3 == bVar4) {
                    r17 = r17;
                    if (s() > i14) {
                        this.L0 = r16;
                        this.W[0] = e.b.FIXED;
                        T(i14);
                        ?? r114 = r16;
                        z17 = r114 == true ? 1 : 0;
                        r17 = r114;
                    }
                }
                r17 = r17;
                r17 = r17;
                if (this.W[r16] == bVar4) {
                    r17 = z24;
                    z17 = z17;
                    i24 = 8;
                    r18 = r17;
                } else {
                    r17 = z24;
                    z17 = z17;
                    i24 = 8;
                    r18 = r17;
                }
            } else {
                r17 = z24;
                z17 = z17;
                i24 = 8;
                r18 = r17;
            }
            if (i17 > i24) {
                r18 = 0;
            }
            i16 = i17;
            dVar3 = dVar2;
            size2 = i19;
            r14 = r18;
        }
        z18 = z17 ? 1 : 0;
        this.f162695w0 = arrayList27;
        if (z18) {
            e.b[] bVarArr11 = this.W;
            bVarArr11[0] = bVar7;
            bVarArr11[1] = bVar6;
        }
        H(dVar5.f116833m);
    }

    public final void Y(e eVar, int i14) {
        if (i14 == 0) {
            int i15 = this.G0 + 1;
            c[] cVarArr = this.J0;
            if (i15 >= cVarArr.length) {
                this.J0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
            }
            this.J0[this.G0] = new c(eVar, 0, this.B0);
            this.G0++;
            return;
        }
        if (i14 == 1) {
            int i16 = this.H0 + 1;
            c[] cVarArr2 = this.I0;
            if (i16 >= cVarArr2.length) {
                this.I0 = (c[]) Arrays.copyOf(cVarArr2, cVarArr2.length * 2);
            }
            this.I0[this.H0] = new c(eVar, 1, this.B0);
            this.H0++;
        }
    }

    public final void Z(m6.d dVar) {
        f fVar;
        m6.d dVar2;
        boolean zD0 = d0(64);
        c(dVar, zD0);
        int size = this.f162695w0.size();
        boolean z14 = false;
        for (int i14 = 0; i14 < size; i14++) {
            e eVar = this.f162695w0.get(i14);
            boolean[] zArr = eVar.V;
            zArr[0] = false;
            zArr[1] = false;
            if (eVar instanceof a) {
                z14 = true;
            }
        }
        if (z14) {
            for (int i15 = 0; i15 < size; i15++) {
                e eVar2 = this.f162695w0.get(i15);
                if (eVar2 instanceof a) {
                    a aVar = (a) eVar2;
                    for (int i16 = 0; i16 < aVar.f162691x0; i16++) {
                        e eVar3 = aVar.f162690w0[i16];
                        if (aVar.f162565z0 || eVar3.d()) {
                            int i17 = aVar.f162564y0;
                            if (i17 == 0 || i17 == 1) {
                                eVar3.V[0] = true;
                            } else if (i17 == 2 || i17 == 3) {
                                eVar3.V[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<e> hashSet = this.R0;
        hashSet.clear();
        for (int i18 = 0; i18 < size; i18++) {
            e eVar4 = this.f162695w0.get(i18);
            eVar4.getClass();
            boolean z15 = eVar4 instanceof l;
            if (z15 || (eVar4 instanceof h)) {
                if (z15) {
                    hashSet.add(eVar4);
                } else {
                    eVar4.c(dVar, zD0);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<e> it = hashSet.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                for (int i19 = 0; i19 < lVar.f162691x0; i19++) {
                    if (hashSet.contains(lVar.f162690w0[i19])) {
                        lVar.c(dVar, zD0);
                        hashSet.remove(lVar);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<e> it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    it3.next().c(dVar, zD0);
                }
                hashSet.clear();
            }
        }
        if (m6.d.f116819q) {
            HashSet<e> hashSet2 = new HashSet<>();
            for (int i24 = 0; i24 < size; i24++) {
                e eVar5 = this.f162695w0.get(i24);
                eVar5.getClass();
                if (!(eVar5 instanceof l) && !(eVar5 instanceof h)) {
                    hashSet2.add(eVar5);
                }
            }
            fVar = this;
            dVar2 = dVar;
            fVar.b(this, dVar2, hashSet2, this.W[0] == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar6 : hashSet2) {
                j.a(this, dVar2, eVar6);
                eVar6.c(dVar2, zD0);
            }
        } else {
            fVar = this;
            dVar2 = dVar;
            for (int i25 = 0; i25 < size; i25++) {
                e eVar7 = fVar.f162695w0.get(i25);
                if (eVar7 instanceof f) {
                    e.b[] bVarArr = eVar7.W;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar7.P(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.R(e.b.FIXED);
                    }
                    eVar7.c(dVar2, zD0);
                    if (bVar == bVar3) {
                        eVar7.P(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar7.R(bVar2);
                    }
                } else {
                    j.a(this, dVar2, eVar7);
                    if (!(eVar7 instanceof l) && !(eVar7 instanceof h)) {
                        eVar7.c(dVar2, zD0);
                    }
                }
            }
        }
        if (fVar.G0 > 0) {
            b.a(this, dVar2, null, 0);
        }
        if (fVar.H0 > 0) {
            b.a(this, dVar2, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a7  */
    public final boolean a0(int i14, boolean z14) {
        boolean z15;
        e.b bVar;
        u6.e eVar = this.f162657y0;
        ArrayList<p> arrayList = eVar.f168799e;
        f fVar = eVar.f168795a;
        boolean z16 = false;
        e.b bVarL = fVar.l(0);
        e.b bVarL2 = fVar.l(1);
        int iT = fVar.t();
        int iU = fVar.u();
        if (z14 && (bVarL == (bVar = e.b.WRAP_CONTENT) || bVarL2 == bVar)) {
            for (p pVar : arrayList) {
                if (pVar.f168844f == i14 && !pVar.k()) {
                    z14 = false;
                    break;
                }
            }
            if (i14 == 0) {
                if (z14 && bVarL == e.b.WRAP_CONTENT) {
                    fVar.P(e.b.FIXED);
                    fVar.T(eVar.d(fVar, 0));
                    fVar.f162608d.f168843e.d(fVar.s());
                }
            } else if (z14 && bVarL2 == e.b.WRAP_CONTENT) {
                fVar.R(e.b.FIXED);
                fVar.O(eVar.d(fVar, 1));
                fVar.f162610e.f168843e.d(fVar.m());
            }
        }
        e.b[] bVarArr = fVar.W;
        if (i14 == 0) {
            e.b bVar2 = bVarArr[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int iS = fVar.s() + iT;
                fVar.f162608d.f168847i.d(iS);
                fVar.f162608d.f168843e.d(iS - iT);
                z15 = true;
            } else {
                z15 = false;
            }
        } else {
            e.b bVar3 = bVarArr[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int iM = fVar.m() + iU;
                fVar.f162610e.f168847i.d(iM);
                fVar.f162610e.f168843e.d(iM - iU);
                z15 = true;
            } else {
                z15 = false;
            }
        }
        eVar.g();
        for (p pVar2 : arrayList) {
            if (pVar2.f168844f == i14 && (pVar2.f168840b != fVar || pVar2.f168845g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : arrayList) {
            if (pVar3.f168844f == i14 && (z15 || pVar3.f168840b != fVar)) {
                if (!pVar3.f168846h.f168812j || !pVar3.f168847i.f168812j || (!(pVar3 instanceof u6.c) && !pVar3.f168843e.f168812j)) {
                    fVar.P(bVarL);
                    fVar.R(bVarL2);
                    return z16;
                }
            }
        }
        z16 = true;
        fVar.P(bVarL);
        fVar.R(bVarL2);
        return z16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b0(int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        int i25;
        int i26;
        int i27;
        int i28;
        u6.b.InterfaceC3163b interfaceC3163b;
        int i29;
        int i30;
        boolean zA0;
        int i34;
        ArrayList<e> arrayList;
        boolean z14;
        u6.b.InterfaceC3163b interfaceC3163b2;
        boolean z15;
        u6.b.InterfaceC3163b interfaceC3163b3;
        boolean z16;
        int i35;
        u6.l lVar;
        n nVar;
        boolean z17;
        int i36;
        int i37;
        int i38;
        boolean z18;
        m6.e eVar;
        this.E0 = i19;
        this.F0 = i24;
        u6.b bVar = this.f162656x0;
        f fVar = bVar.f168782c;
        ArrayList<e> arrayList2 = bVar.f168780a;
        u6.b.InterfaceC3163b interfaceC3163b4 = this.A0;
        int size = this.f162695w0.size();
        int iS = s();
        int iM = m();
        boolean zB = j.b(i14, 128);
        int i39 = (zB || j.b(i14, 64)) ? 1 : 0;
        if (i39 != 0) {
            int i44 = 0;
            while (true) {
                if (i44 < size) {
                    e eVar2 = this.f162695w0.get(i44);
                    i25 = 0;
                    e.b[] bVarArr = eVar2.W;
                    i26 = 1;
                    e.b bVar2 = bVarArr[0];
                    int i45 = i39;
                    e.b bVar3 = e.b.MATCH_CONSTRAINT;
                    boolean z19 = (bVar2 == bVar3) && (bVarArr[1] == bVar3) && eVar2.f162603a0 > 0.0f;
                    if ((eVar2.z() && z19) || ((eVar2.A() && z19) || (eVar2 instanceof l) || eVar2.z() || eVar2.A())) {
                        i27 = 0;
                    } else {
                        i44++;
                        i39 = i45;
                    }
                } else {
                    i25 = 0;
                    i26 = 1;
                    i27 = i39;
                }
            }
        } else {
            i25 = 0;
            i26 = 1;
            i27 = i39;
        }
        if (i27 != 0 && (eVar = m6.d.f116820r) != null) {
            eVar.f116837a++;
        }
        int i46 = i27 & (((i15 == 1073741824 && i17 == 1073741824) || zB) ? i26 : i25);
        if (i46 != 0) {
            int iMin = Math.min(this.E[i25], i16);
            int iMin2 = Math.min(this.E[i26], i18);
            u6.e eVar3 = this.f162657y0;
            if (i15 != 1073741824 || s() == iMin) {
                z17 = i26;
            } else {
                T(iMin);
                boolean z24 = i26;
                eVar3.f168796b = z24;
                z17 = z24;
            }
            int i47 = 1073741824;
            if (i17 == 1073741824) {
                if (m() != iMin2) {
                    O(iMin2);
                    eVar3.f168796b = z17;
                }
                i47 = 1073741824;
            }
            if (i15 == i47 && i17 == i47) {
                ArrayList<p> arrayList3 = eVar3.f168799e;
                f fVar2 = eVar3.f168795a;
                if (eVar3.f168796b || eVar3.f168797c) {
                    for (e eVar4 : fVar2.f162695w0) {
                        int i48 = i46;
                        eVar4.j();
                        eVar4.f162602a = i25;
                        eVar4.f162608d.n();
                        eVar4.f162610e.m();
                        size = size;
                        i46 = i48;
                        i25 = 0;
                    }
                    i28 = i46;
                    i29 = size;
                    fVar2.j();
                    i38 = 0;
                    fVar2.f162602a = false;
                    fVar2.f162608d.n();
                    fVar2.f162610e.m();
                    eVar3.f168797c = false;
                } else {
                    i28 = i46;
                    i29 = size;
                    i38 = i25;
                }
                eVar3.b(eVar3.f168798d);
                fVar2.f162607c0 = i38;
                fVar2.f162609d0 = i38;
                e.b bVarL = fVar2.l(i38);
                e.b bVarL2 = fVar2.l(1);
                if (eVar3.f168796b) {
                    eVar3.c();
                }
                int iT = fVar2.t();
                int iU = fVar2.u();
                interfaceC3163b = interfaceC3163b4;
                fVar2.f162608d.f168846h.d(iT);
                fVar2.f162610e.f168846h.d(iU);
                eVar3.g();
                e.b bVar4 = e.b.WRAP_CONTENT;
                if (bVarL == bVar4 || bVarL2 == bVar4) {
                    if (zB) {
                        Iterator<p> it = arrayList3.iterator();
                        while (it.hasNext()) {
                            if (!it.next().k()) {
                                zB = false;
                                break;
                            }
                        }
                    }
                    if (zB && bVarL == e.b.WRAP_CONTENT) {
                        fVar2.P(e.b.FIXED);
                        fVar2.T(eVar3.d(fVar2, 0));
                        fVar2.f162608d.f168843e.d(fVar2.s());
                    }
                    if (zB && bVarL2 == e.b.WRAP_CONTENT) {
                        fVar2.R(e.b.FIXED);
                        fVar2.O(eVar3.d(fVar2, 1));
                        fVar2.f162610e.f168843e.d(fVar2.m());
                    }
                } else {
                    iT = iT;
                }
                e.b bVar5 = fVar2.W[0];
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6 || bVar5 == e.b.MATCH_PARENT) {
                    int iS2 = fVar2.s() + iT;
                    fVar2.f162608d.f168847i.d(iS2);
                    fVar2.f162608d.f168843e.d(iS2 - iT);
                    eVar3.g();
                    e.b bVar7 = fVar2.W[1];
                    if (bVar7 == bVar6 || bVar7 == e.b.MATCH_PARENT) {
                        int iM2 = fVar2.m() + iU;
                        fVar2.f162610e.f168847i.d(iM2);
                        fVar2.f162610e.f168843e.d(iM2 - iU);
                    }
                    eVar3.g();
                    z18 = true;
                } else {
                    z18 = false;
                }
                for (p pVar : arrayList3) {
                    if (pVar.f168840b != fVar2 || pVar.f168845g) {
                        pVar.e();
                    }
                }
                Iterator<p> it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        zA0 = true;
                        break;
                    }
                    p next = it3.next();
                    if (z18 || next.f168840b != fVar2) {
                        if (!next.f168846h.f168812j || ((!next.f168847i.f168812j && !(next instanceof u6.j)) || (!next.f168843e.f168812j && !(next instanceof u6.c) && !(next instanceof u6.j)))) {
                            zA0 = false;
                            break;
                        }
                    }
                }
                fVar2.P(bVarL);
                fVar2.R(bVarL2);
                i30 = 2;
                i37 = 1073741824;
            } else {
                i28 = i46;
                interfaceC3163b = interfaceC3163b4;
                i29 = size;
                f fVar3 = eVar3.f168795a;
                if (eVar3.f168796b) {
                    for (e eVar5 : fVar3.f162695w0) {
                        eVar5.j();
                        eVar5.f162602a = false;
                        u6.l lVar2 = eVar5.f162608d;
                        lVar2.f168843e.f168812j = false;
                        lVar2.f168845g = false;
                        lVar2.n();
                        n nVar2 = eVar5.f162610e;
                        nVar2.f168843e.f168812j = false;
                        nVar2.f168845g = false;
                        nVar2.m();
                    }
                    i36 = 0;
                    fVar3.j();
                    fVar3.f162602a = false;
                    u6.l lVar3 = fVar3.f162608d;
                    lVar3.f168843e.f168812j = false;
                    lVar3.f168845g = false;
                    lVar3.n();
                    n nVar3 = fVar3.f162610e;
                    nVar3.f168843e.f168812j = false;
                    nVar3.f168845g = false;
                    nVar3.m();
                    eVar3.c();
                } else {
                    i36 = 0;
                }
                eVar3.b(eVar3.f168798d);
                fVar3.f162607c0 = i36;
                fVar3.f162609d0 = i36;
                fVar3.f162608d.f168846h.d(i36);
                fVar3.f162610e.f168846h.d(i36);
                i37 = 1073741824;
                if (i15 == 1073741824) {
                    zA0 = a0(i36, zB);
                    i30 = 1;
                } else {
                    i30 = 0;
                    zA0 = true;
                }
                if (i17 == 1073741824) {
                    zA0 &= a0(1, zB);
                    i30++;
                }
            }
            if (zA0) {
                U(i15 == i37, i17 == i37);
            }
        } else {
            i28 = i46;
            interfaceC3163b = interfaceC3163b4;
            i29 = size;
            i30 = 0;
            zA0 = false;
        }
        if (!zA0 || i30 != 2) {
            int i49 = this.K0;
            if (i29 > 0) {
                int size2 = this.f162695w0.size();
                boolean zD0 = d0(64);
                u6.b.InterfaceC3163b interfaceC3163b5 = this.A0;
                int i54 = 0;
                while (i54 < size2) {
                    e eVar6 = this.f162695w0.get(i54);
                    if ((eVar6 instanceof h) || (eVar6 instanceof a) || eVar6.I || (zD0 && (lVar = eVar6.f162608d) != null && (nVar = eVar6.f162610e) != null && lVar.f168843e.f168812j && nVar.f168843e.f168812j)) {
                        i35 = size2;
                    } else {
                        e.b bVarL3 = eVar6.l(0);
                        e.b bVarL4 = eVar6.l(1);
                        e.b bVar8 = e.b.MATCH_CONSTRAINT;
                        i35 = size2;
                        boolean z25 = bVarL3 == bVar8 && eVar6.f162640t != 1 && bVarL4 == bVar8 && eVar6.f162642u != 1;
                        if (!z25 && d0(1) && !(eVar6 instanceof l)) {
                            if (bVarL3 == bVar8 && eVar6.f162640t == 0 && bVarL4 != bVar8 && !eVar6.z()) {
                                z25 = true;
                            }
                            if (bVarL4 == bVar8 && eVar6.f162642u == 0 && bVarL3 != bVar8 && !eVar6.z()) {
                                z25 = true;
                            }
                            if ((bVarL3 == bVar8 || bVarL4 == bVar8) && eVar6.f162603a0 > 0.0f) {
                                z25 = true;
                            }
                        }
                        if (!z25) {
                            bVar.a(0, eVar6, interfaceC3163b5);
                        }
                    }
                    i54++;
                    size2 = i35;
                }
                interfaceC3163b5.b();
            }
            if (this.C0 != null) {
                System.nanoTime();
            }
            bVar.c(this);
            int size3 = arrayList2.size();
            if (i29 > 0) {
                bVar.b(this, 0, iS, iM);
            }
            if (size3 > 0) {
                e.b[] bVarArr2 = this.W;
                e.b bVar9 = bVarArr2[0];
                e.b bVar10 = e.b.WRAP_CONTENT;
                boolean z26 = bVar9 == bVar10;
                boolean z27 = bVarArr2[1] == bVar10;
                int iMax = Math.max(s(), fVar.f162613f0);
                int iMax2 = Math.max(m(), fVar.f162615g0);
                int i55 = 0;
                boolean z28 = false;
                while (i55 < size3) {
                    e eVar7 = arrayList2.get(i55);
                    if (eVar7 instanceof l) {
                        int iS3 = eVar7.s();
                        int iM3 = eVar7.m();
                        z15 = z27;
                        interfaceC3163b3 = interfaceC3163b;
                        boolean zA = z28 | bVar.a(1, eVar7, interfaceC3163b3);
                        int iS4 = eVar7.s();
                        int iM4 = eVar7.m();
                        if (iS4 != iS3) {
                            eVar7.T(iS4);
                            if (z26 && eVar7.t() + eVar7.Y > iMax) {
                                iMax = Math.max(iMax, eVar7.k(d.a.RIGHT).e() + eVar7.t() + eVar7.Y);
                            }
                            z16 = true;
                        } else {
                            z16 = zA;
                        }
                        if (iM4 != iM3) {
                            eVar7.O(iM4);
                            if (z15 && eVar7.u() + eVar7.Z > iMax2) {
                                iMax2 = Math.max(iMax2, eVar7.k(d.a.BOTTOM).e() + eVar7.u() + eVar7.Z);
                            }
                            z16 = true;
                        }
                        z28 = ((l) eVar7).E0 | z16;
                    } else {
                        z15 = z27;
                        interfaceC3163b3 = interfaceC3163b;
                    }
                    i55++;
                    interfaceC3163b = interfaceC3163b3;
                    z27 = z15;
                }
                boolean z29 = z27;
                int i56 = 0;
                while (true) {
                    u6.b.InterfaceC3163b interfaceC3163b6 = interfaceC3163b;
                    if (i56 >= 2) {
                        break;
                    }
                    boolean z34 = z28;
                    int i57 = 0;
                    while (i57 < size3) {
                        e eVar8 = arrayList2.get(i57);
                        if ((!(eVar8 instanceof i) || (eVar8 instanceof l)) && !(eVar8 instanceof h)) {
                            i34 = size3;
                            if (eVar8.f162623k0 != 8 && ((i28 == 0 || !eVar8.f162608d.f168843e.f168812j || !eVar8.f162610e.f168843e.f168812j) && !(eVar8 instanceof l))) {
                                int iS5 = eVar8.s();
                                int iM5 = eVar8.m();
                                arrayList = arrayList2;
                                int i58 = eVar8.f162611e0;
                                z14 = z26;
                                boolean zA2 = bVar.a(i56 == 1 ? 2 : 1, eVar8, interfaceC3163b6) | z34;
                                int iS6 = eVar8.s();
                                interfaceC3163b2 = interfaceC3163b6;
                                int iM6 = eVar8.m();
                                if (iS6 != iS5) {
                                    eVar8.T(iS6);
                                    if (z14 && eVar8.t() + eVar8.Y > iMax) {
                                        iMax = Math.max(iMax, eVar8.k(d.a.RIGHT).e() + eVar8.t() + eVar8.Y);
                                    }
                                    zA2 = true;
                                }
                                if (iM6 != iM5) {
                                    eVar8.O(iM6);
                                    if (z29 && eVar8.u() + eVar8.Z > iMax2) {
                                        iMax2 = Math.max(iMax2, eVar8.k(d.a.BOTTOM).e() + eVar8.u() + eVar8.Z);
                                    }
                                    zA2 = true;
                                }
                                z34 = (!eVar8.G || i58 == eVar8.f162611e0) ? zA2 : true;
                            }
                            i57++;
                            size3 = i34;
                            z26 = z14;
                            arrayList2 = arrayList;
                            interfaceC3163b6 = interfaceC3163b2;
                        } else {
                            i34 = size3;
                        }
                        interfaceC3163b2 = interfaceC3163b6;
                        arrayList = arrayList2;
                        z14 = z26;
                        i57++;
                        size3 = i34;
                        z26 = z14;
                        arrayList2 = arrayList;
                        interfaceC3163b6 = interfaceC3163b2;
                    }
                    int i59 = size3;
                    interfaceC3163b = interfaceC3163b6;
                    ArrayList<e> arrayList4 = arrayList2;
                    boolean z35 = z26;
                    if (!z34) {
                        break;
                    }
                    i56++;
                    bVar.b(this, i56, iS, iM);
                    size3 = i59;
                    z26 = z35;
                    arrayList2 = arrayList4;
                    z28 = false;
                }
            }
            this.K0 = i49;
            m6.d.f116819q = d0(512);
        }
        if (this.C0 != null) {
            System.nanoTime();
        }
    }

    public final boolean d0(int i14) {
        return (this.K0 & i14) == i14;
    }

    @Override // t6.e
    public final void p(StringBuilder sb3) {
        sb3.append(this.f162624l + ":{\n");
        StringBuilder sb4 = new StringBuilder("  actualWidth:");
        sb4.append(this.Y);
        sb3.append(sb4.toString());
        sb3.append("\n");
        sb3.append("  actualHeight:" + this.Z);
        sb3.append("\n");
        Iterator<e> it = this.f162695w0.iterator();
        while (it.hasNext()) {
            it.next().p(sb3);
            sb3.append(",\n");
        }
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }

    public f(int i14, int i15, int i16, int i17) {
        super(i14, i15, i16, i17);
        this.f162656x0 = new u6.b(this);
        this.f162657y0 = new u6.e(this);
        this.A0 = null;
        this.B0 = false;
        this.D0 = new m6.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = TsExtractor.TS_STREAM_TYPE_AIT;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new u6.b.a();
    }

    public f(int i14, int i15) {
        super(i14, i15);
        this.f162656x0 = new u6.b(this);
        this.f162657y0 = new u6.e(this);
        this.A0 = null;
        this.B0 = false;
        this.D0 = new m6.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = TsExtractor.TS_STREAM_TYPE_AIT;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new u6.b.a();
    }

    public f() {
        this.f162656x0 = new u6.b(this);
        this.f162657y0 = new u6.e(this);
        this.A0 = null;
        this.B0 = false;
        this.D0 = new m6.d();
        this.G0 = 0;
        this.H0 = 0;
        this.I0 = new c[4];
        this.J0 = new c[4];
        this.K0 = TsExtractor.TS_STREAM_TYPE_AIT;
        this.L0 = false;
        this.M0 = false;
        this.N0 = null;
        this.O0 = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = new HashSet<>();
        this.S0 = new u6.b.a();
    }
}
