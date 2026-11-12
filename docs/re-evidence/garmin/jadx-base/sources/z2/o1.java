package z2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.q3;
import kotlin.s3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz2/o1;", "", "Lz2/r1;", "selectionRegistrar", "<init>", "(Lz2/r1;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f201710a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public w4.a f201714e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e23.l<? super s5.c, Unit> f201715f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q3 f201716g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n4.c f201721l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f5.c0 f201722m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p3.c2 f201723n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p3.c2 f201724o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p3.c2 f201725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p3.c2 f201726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p3.c2 f201727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p3.c2 f201728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p3.c2 f201729t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y0 f201730u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f201731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public o53.b0 f201732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q f201733x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f201734y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f201711b = p3.p0.n(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f201712c = p3.p0.n(Boolean.TRUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e23.l<? super b0, Unit> f201713d = new h0(this, 7);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r2.q f201717h = new r2.q();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m4.b0 f201718i = new m4.b0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p3.c2 f201719j = p3.p0.n(Boolean.FALSE);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.d0 f201720k = p3.p0.f(new i0(this, 3));

    public o1(r1 r1Var) {
        this.f201710a = r1Var;
        Unit unit = Unit.INSTANCE;
        p3.t1 t1Var = p3.t1.f135313a;
        t1Var.getClass();
        this.f201723n = new p3.c2(unit, t1Var);
        n4.c.f123541b.getClass();
        this.f201724o = p3.p0.n(n4.c.a(0L));
        this.f201725p = p3.p0.n(n4.c.a(0L));
        this.f201726q = p3.p0.n(null);
        this.f201727r = p3.p0.n(null);
        this.f201728s = p3.p0.n(null);
        this.f201729t = p3.p0.n(null);
        r1Var.f201770e = new h0(this, 8);
        r1Var.f201771f = new a6.c(this, 21);
        r1Var.f201772g = new e1(this);
        r1Var.f201773h = new i0(this, 4);
        r1Var.f201774i = new h0(this, 1);
        r1Var.f201775j = new h0(this, 2);
    }

    public final long a(f5.c0 c0Var, long j8) {
        f5.c0 c0Var2 = this.f201722m;
        if (c0Var2 != null && c0Var2.isAttached()) {
            return l().b0(c0Var, j8);
        }
        n4.c.f123541b.getClass();
        return n4.c.f123543d;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0011  */
    public final void b() {
        s5.c cVarK;
        e23.l<? super s5.c, Unit> lVar;
        int iNextIndex;
        if (g() != null) {
            r1 r1Var = this.f201710a;
            if (r1Var.h().f134844e == 0) {
                cVarK = null;
            } else {
                s5.c.b bVar = new s5.c.b(0, 1, null);
                ArrayList arrayListK = r1Var.k(l());
                ListIterator listIterator = arrayListK.listIterator(arrayListK.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    b0 b0VarB = r1Var.h().b(((y) listIterator.previous()).getF201695a());
                    if (b0VarB != null && b0VarB.f201523a.f201527b != b0VarB.f201524b.f201527b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListK.size();
                    int i14 = 0;
                    while (i14 < size) {
                        y yVar = (y) arrayListK.get(i14);
                        b0 b0VarB2 = r1Var.h().b(yVar.getF201695a());
                        if (b0VarB2 != null) {
                            s5.c text = yVar.getText();
                            long jL = og.a.l(b0VarB2.f201523a.f201527b, b0VarB2.f201524b.f201527b);
                            boolean z14 = i14 >= iNextIndex;
                            bVar.d(text, s5.w0.h(jL), s5.w0.g(jL));
                            if (!z14) {
                                bVar.f157141a.append('\n');
                            }
                        }
                        i14++;
                    }
                }
                cVarK = bVar.k();
            }
        } else {
            cVarK = null;
        }
        if (cVarK != null) {
            s5.c cVar = cVarK.f157138b.length() > 0 ? cVarK : null;
            if (cVar == null || (lVar = this.f201715f) == null) {
                return;
            }
            lVar.invoke(cVar);
        }
    }

    public final y c(b0.a aVar) {
        return this.f201710a.f201768c.b(aVar.f201528c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n4.d d() {
        f5.c0 c0Var;
        List list;
        n4.d dVar;
        float f14;
        float f15;
        f5.c0 c0VarE;
        int[] iArr;
        this.f201723n.getF182175a();
        Unit unit = Unit.INSTANCE;
        if (g() != null && (c0Var = this.f201722m) != null && c0Var.isAttached()) {
            f5.c0 c0VarL = l();
            r1 r1Var = this.f201710a;
            ArrayList arrayListK = r1Var.k(c0VarL);
            ArrayList arrayList = new ArrayList(arrayListK.size());
            int size = arrayListK.size();
            for (int i14 = 0; i14 < size; i14++) {
                y yVar = (y) arrayListK.get(i14);
                b0 b0VarB = r1Var.h().b(yVar.getF201695a());
                o13.p pVar = b0VarB != null ? new o13.p(yVar, b0VarB) : null;
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            n4.d dVar2 = p1.f201741a;
            int size2 = arrayList.size();
            int i15 = 1;
            List listK = arrayList;
            listK = arrayList;
            if (size2 != 0 && size2 != 1) {
                listK = p13.x.k(p13.h0.b0(arrayList), p13.h0.m0(arrayList));
            }
            if (!listK.isEmpty()) {
                n4.d dVar3 = p1.f201741a;
                if (listK.isEmpty()) {
                    dVar = null;
                } else {
                    float f16 = dVar3.f123547a;
                    float f17 = dVar3.f123550d;
                    float f18 = dVar3.f123549c;
                    float f19 = dVar3.f123548b;
                    int size3 = listK.size();
                    float fMax = f17;
                    float fMax2 = f18;
                    float fMin = f19;
                    int i16 = 0;
                    while (i16 < size3) {
                        o13.p pVar2 = (o13.p) list.get(i16);
                        y yVar2 = (y) pVar2.f128594a;
                        b0 b0Var = (b0) pVar2.f128595b;
                        int i17 = i15;
                        int i18 = b0Var.f201523a.f201527b;
                        int i19 = b0Var.f201524b.f201527b;
                        if (i18 == i19 || (c0VarE = yVar2.e()) == null) {
                            list = listK;
                            list = listK;
                            f14 = f17;
                            f15 = f18;
                        } else {
                            int iMin = Math.min(i18, i19);
                            int iMax = Math.max(i18, i19) - 1;
                            if (iMin == iMax) {
                                list = listK;
                                iArr = new int[i17];
                                iArr[0] = iMin;
                            } else {
                                list = listK;
                                int[] iArr2 = new int[2];
                                iArr2[0] = iMin;
                                iArr2[i17] = iMax;
                                iArr = iArr2;
                            }
                            float fMin2 = dVar3.f123547a;
                            int[] iArr3 = iArr;
                            f14 = f17;
                            f15 = f18;
                            float fMin3 = f19;
                            int i24 = 0;
                            float fMax3 = f14;
                            float fMax4 = f15;
                            for (int length = iArr.length; i24 < length; length = length) {
                                int i25 = i24;
                                n4.d dVarA = yVar2.a(iArr3[i25]);
                                fMin2 = Math.min(fMin2, dVarA.f123547a);
                                fMin3 = Math.min(fMin3, dVarA.f123548b);
                                fMax4 = Math.max(fMax4, dVarA.f123549c);
                                fMax3 = Math.max(fMax3, dVarA.f123550d);
                                i24 = i25 + 1;
                            }
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin3)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMin2)) << 32);
                            n4.c.a aVar = n4.c.f123541b;
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMax4)) << 32) | (((long) Float.floatToRawIntBits(fMax3)) & 4294967295L);
                            long jB0 = c0Var.b0(c0VarE, jFloatToRawIntBits);
                            long jB1 = c0Var.b0(c0VarE, jFloatToRawIntBits2);
                            float fMin4 = Math.min(f16, Float.intBitsToFloat((int) (jB0 >> 32)));
                            fMin = Math.min(fMin, Float.intBitsToFloat((int) (jB0 & 4294967295L)));
                            fMax2 = Math.max(fMax2, Float.intBitsToFloat((int) (jB1 >> 32)));
                            fMax = Math.max(fMax, Float.intBitsToFloat((int) (jB1 & 4294967295L)));
                            f16 = fMin4;
                        }
                        i16++;
                        i15 = i17;
                        list = list;
                        dVar3 = dVar3;
                        f17 = f14;
                        f18 = f15;
                    }
                    list = listK;
                    dVar = null;
                    dVar3 = new n4.d(f16, fMin, fMax2, fMax);
                }
                if (p005kotlin.jvm.internal.s.g(dVar3, p1.f201741a)) {
                    return dVar;
                }
                n4.d dVarK = p1.c(c0Var).k(dVar3);
                if (dVarK.f123549c - dVarK.f123547a < 0.0f || dVarK.f123550d - dVarK.f123548b < 0.0f) {
                    return dVar;
                }
                n4.d dVarO = dVarK.o(f5.d0.e(c0Var));
                return n4.d.b(dVarO, 0.0f, 0.0f, (x0.f201842b * 4) + dVarO.f123550d, 7);
            }
        }
        return null;
    }

    public final o13.p<s5.c, s5.w0> e() {
        int iNextIndex;
        int iH;
        int length;
        o13.p<s5.c, s5.w0> pVar = null;
        if (g() != null) {
            r1 r1Var = this.f201710a;
            if (!r1Var.f201767b.isEmpty()) {
                int i14 = 0;
                int i15 = 1;
                s5.c.b bVar = new s5.c.b(0, 1, null);
                ArrayList arrayListK = r1Var.k(l());
                ListIterator listIterator = arrayListK.listIterator(arrayListK.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    b0 b0VarB = r1Var.h().b(((y) listIterator.previous()).getF201695a());
                    if (b0VarB != null && b0VarB.f201523a.f201527b != b0VarB.f201524b.f201527b) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                if (iNextIndex != -1) {
                    int size = arrayListK.size();
                    int i16 = 0;
                    iH = -1;
                    length = -1;
                    while (i16 < size) {
                        y yVar = (y) arrayListK.get(i16);
                        o13.p<s5.c, s5.w0> pVar2 = pVar;
                        r1 r1Var2 = r1Var;
                        b0 b0VarB2 = r1Var.h().b(yVar.getF201695a());
                        if (b0VarB2 != null) {
                            s5.c text = yVar.getText();
                            long jL = og.a.l(b0VarB2.f201523a.f201527b, b0VarB2.f201524b.f201527b);
                            int i17 = i16 >= iNextIndex ? i15 : i14;
                            if (iH == -1) {
                                iH = s5.w0.h(jL);
                                bVar.d(text, i14, s5.w0.h(jL));
                            }
                            bVar.d(text, s5.w0.h(jL), s5.w0.g(jL));
                            StringBuilder sb3 = bVar.f157141a;
                            if (i17 == 0) {
                                sb3.append('\n');
                            } else {
                                length = sb3.length();
                                bVar.d(text, s5.w0.g(jL), text.f157138b.length());
                            }
                        }
                        i16++;
                        pVar = pVar2;
                        r1Var = r1Var2;
                        i14 = 0;
                        i15 = 1;
                    }
                } else {
                    iH = -1;
                    length = -1;
                }
                o13.p<s5.c, s5.w0> pVar3 = pVar;
                return (iH == -1 || length == -1) ? pVar3 : new o13.p<>(bVar.k(), s5.w0.a(og.a.l(iH, length)));
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p006l2.l1 f() {
        return (p006l2.l1) this.f201728s.getF182175a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b0 g() {
        return (b0) this.f201711b.getF182175a();
    }

    public final boolean h() {
        b0 b0VarB;
        f5.c0 c0VarL = l();
        r1 r1Var = this.f201710a;
        ArrayList arrayListK = r1Var.k(c0VarL);
        if (arrayListK.isEmpty()) {
            return true;
        }
        int size = arrayListK.size();
        for (int i14 = 0; i14 < size; i14++) {
            y yVar = (y) arrayListK.get(i14);
            s5.c text = yVar.getText();
            if (text.f157138b.length() != 0 && ((b0VarB = r1Var.h().b(yVar.getF201695a())) == null || Math.abs(b0VarB.f201523a.f201527b - b0VarB.f201524b.f201527b) != text.f157138b.length())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean i() {
        return ((Boolean) this.f201712c.getF182175a()).booleanValue();
    }

    public final boolean j() {
        b0 b0VarG = g();
        if (b0VarG != null) {
            b0.a aVar = b0VarG.f201524b;
            b0.a aVar2 = b0VarG.f201523a;
            if (!p005kotlin.jvm.internal.s.g(aVar2, aVar)) {
                if (aVar2.f201528c == aVar.f201528c) {
                    return true;
                }
                f5.c0 c0VarL = l();
                r1 r1Var = this.f201710a;
                ArrayList arrayListK = r1Var.k(c0VarL);
                int size = arrayListK.size();
                for (int i14 = 0; i14 < size; i14++) {
                    b0 b0VarB = r1Var.h().b(((y) arrayListK.get(i14)).getF201695a());
                    if (b0VarB != null && b0VarB.f201523a.f201527b != b0VarB.f201524b.f201527b) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void k() {
        w4.a aVar;
        p1.m0 m0Var = p1.w.f134861a;
        m0Var.getClass();
        this.f201710a.f201776k.setValue(m0Var);
        this.f201734y = false;
        r();
        if (g() != null) {
            this.f201713d.invoke(null);
            if (!i() || (aVar = this.f201714e) == null) {
                return;
            }
            w4.b.f181904b.getClass();
            aVar.a(w4.b.a.b());
        }
    }

    public final f5.c0 l() {
        f5.c0 c0Var = this.f201722m;
        if (c0Var != null) {
            if (!c0Var.isAttached()) {
                b2.e.a("unattached coordinates");
            }
            return c0Var;
        }
        b2.e.b("null coordinates");
        o2.c.f();
        return null;
    }

    public final void m() {
        f5.c0 c0VarL = l();
        r1 r1Var = this.f201710a;
        ArrayList arrayListK = r1Var.k(c0VarL);
        if (arrayListK.isEmpty()) {
            return;
        }
        p1.m0 m0VarA = p1.w.a();
        int size = arrayListK.size();
        b0 b0Var = null;
        b0 b0Var2 = null;
        for (int i14 = 0; i14 < size; i14++) {
            y yVar = (y) arrayListK.get(i14);
            b0 b0VarM = yVar.m();
            if (b0VarM != null) {
                if (b0Var == null) {
                    b0Var = b0VarM;
                }
                long f201695a = yVar.getF201695a();
                int iD = m0VarA.d(f201695a);
                Object[] objArr = m0VarA.f134842c;
                Object obj = objArr[iD];
                m0VarA.f134841b[iD] = f201695a;
                objArr[iD] = b0VarM;
                b0Var2 = b0VarM;
            }
        }
        if (m0VarA.f134844e == 0) {
            return;
        }
        if (b0Var != b0Var2) {
            b0Var.getClass();
            b0.a aVar = b0Var.f201523a;
            b0Var2.getClass();
            b0Var = new b0(aVar, b0Var2.f201524b, false);
        }
        r1Var.f201776k.setValue(m0VarA);
        this.f201713d.invoke(b0Var);
        this.f201730u = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(boolean z14) {
        p3.c2 c2Var = this.f201712c;
        if (((Boolean) c2Var.getF182175a()).booleanValue() != z14) {
            c2Var.setValue(Boolean.valueOf(z14));
            r();
        }
    }

    public final void o(b0 b0Var) {
        this.f201711b.setValue(b0Var);
        if (b0Var != null) {
            p();
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0084  */
    /* JADX WARN: Code duplicated, block: B:44:0x0090  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a8  */
    public final void p() {
        long j8;
        n4.c cVarA;
        long jF;
        n4.c cVarA2;
        b0.a aVar;
        b0.a aVar2;
        b0 b0VarG = g();
        f5.c0 c0Var = this.f201722m;
        n4.c cVar = null;
        y yVarC = (b0VarG == null || (aVar2 = b0VarG.f201523a) == null) ? null : c(aVar2);
        y yVarC2 = (b0VarG == null || (aVar = b0VarG.f201524b) == null) ? null : c(aVar);
        f5.c0 c0VarE = yVarC != null ? yVarC.e() : null;
        f5.c0 c0VarE2 = yVarC2 != null ? yVarC2.e() : null;
        p3.c2 c2Var = this.f201727r;
        p3.c2 c2Var2 = this.f201726q;
        if (b0VarG == null || c0Var == null || !c0Var.isAttached() || (c0VarE == null && c0VarE2 == null)) {
            c2Var2.setValue(null);
            c2Var.setValue(null);
            return;
        }
        n4.d dVarC = p1.c(c0Var);
        if (c0VarE != null) {
            j8 = 9205357640488583168L;
            long jF2 = yVarC.f(b0VarG, true);
            if ((jF2 & 9223372034707292159L) != 9205357640488583168L) {
                cVarA = n4.c.a(c0Var.b0(c0VarE, jF2));
                long j14 = cVarA.f123544a;
                if (f() != p006l2.l1.SelectionStart && !p1.a(j14, dVarC)) {
                }
            }
            c2Var2.setValue(cVarA);
            if (c0VarE2 != null) {
                jF = yVarC2.f(b0VarG, false);
                if ((jF & 9223372034707292159L) != j8) {
                    cVarA2 = n4.c.a(c0Var.b0(c0VarE2, jF));
                    long j15 = cVarA2.f123544a;
                    if (f() != p006l2.l1.SelectionEnd || p1.a(j15, dVarC)) {
                        cVar = cVarA2;
                    }
                }
            }
            c2Var.setValue(cVar);
        }
        j8 = 9205357640488583168L;
        cVarA = null;
        c2Var2.setValue(cVarA);
        if (c0VarE2 != null) {
            jF = yVarC2.f(b0VarG, false);
            if ((jF & 9223372034707292159L) != j8) {
                cVarA2 = n4.c.a(c0Var.b0(c0VarE2, jF));
                long j16 = cVarA2.f123544a;
                if (f() != p006l2.l1.SelectionEnd) {
                    cVar = cVarA2;
                } else {
                    cVar = cVarA2;
                }
            }
        }
        c2Var.setValue(cVar);
    }

    public final boolean q(long j8, long j14, boolean z14, d0 d0Var) {
        this.f201728s.setValue(z14 ? p006l2.l1.SelectionStart : p006l2.l1.SelectionEnd);
        this.f201729t.setValue(n4.c.a(j8));
        f5.c0 c0VarL = l();
        r1 r1Var = this.f201710a;
        ArrayList arrayListK = r1Var.k(c0VarL);
        int i14 = p1.t.f134835a;
        y0 v1Var = null;
        p1.k0 k0Var = new p1.k0(0, 1, null);
        int size = arrayListK.size();
        for (int i15 = 0; i15 < size; i15++) {
            k0Var.e(i15, ((y) arrayListK.get(i15)).getF201695a());
        }
        z0 z0Var = new z0(j8, j14, c0VarL, z14, (j14 & 9223372034707292159L) == 9205357640488583168L ? null : g(), new h1(k0Var), null);
        int size2 = arrayListK.size();
        for (int i16 = 0; i16 < size2; i16++) {
            ((y) arrayListK.get(i16)).l(z0Var);
        }
        int i17 = z0Var.f201864k + 1;
        ArrayList arrayList = z0Var.f201861h;
        int size3 = arrayList.size();
        if (size3 != 0) {
            if (size3 != 1) {
                int i18 = z0Var.f201862i;
                if (i18 == -1) {
                    i18 = i17;
                }
                int i19 = z0Var.f201863j;
                if (i19 == -1) {
                    i19 = i17;
                }
                v1Var = new m(z0Var.f201860g, arrayList, i18, i19, z0Var.f201857d, z0Var.f201858e);
            } else {
                z zVar = (z) p13.h0.I0(arrayList);
                int i24 = z0Var.f201862i;
                int i25 = i24 == -1 ? i17 : i24;
                int i26 = z0Var.f201863j;
                v1Var = new v1(z0Var.f201857d, i25, i26 == -1 ? i17 : i26, z0Var.f201858e, zVar);
            }
        }
        if (v1Var == null || !v1Var.k(this.f201730u)) {
            return false;
        }
        b0 b0VarA = d0Var.a(v1Var);
        if (!p005kotlin.jvm.internal.s.g(b0VarA, g())) {
            if (i()) {
                ArrayList arrayList2 = r1Var.f201767b;
                int size4 = arrayList2.size();
                for (int i27 = 0; i27 < size4; i27++) {
                    if (((y) arrayList2.get(i27)).getText().f157138b.length() > 0) {
                        w4.a aVar = this.f201714e;
                        if (aVar == null) {
                            break;
                        }
                        w4.b.f181904b.getClass();
                        aVar.a(w4.b.a.b());
                        break;
                    }
                }
            }
            r1Var.f201776k.setValue(v1Var.l(b0VarA));
            this.f201713d.invoke(b0VarA);
            this.f201731v = false;
        }
        this.f201730u = v1Var;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r() {
        if (((Boolean) this.f201719j.getF182175a()).booleanValue()) {
            if (u1.g0.f167495b) {
                boolean z14 = this.f201734y;
                r2.q qVar = this.f201717h;
                if (!z14 || !i()) {
                    qVar.a();
                    return;
                } else {
                    if (((n4.d) this.f201720k.getF182175a()) == null) {
                        return;
                    }
                    qVar.b();
                    return;
                }
            }
            q3 q3Var = this.f201716g;
            if (q3Var == null) {
                return;
            }
            if (!this.f201734y || !i()) {
                if (q3Var.getF91379d() == s3.Shown) {
                    q3Var.hide();
                }
            } else {
                n4.d dVarD = d();
                if (dVarD == null) {
                    return;
                }
                q3Var.a(dVarD, (this.f201715f == null || !j()) ? null : new m1(this), null, null, h() ? null : new n1(this), null);
            }
        }
    }
}
