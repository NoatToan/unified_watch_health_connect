package defpackage;

import com.google.zxing.NotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class c06 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp2 f4773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final whr f4774b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final atk f4775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final atk f4776b;
        public final int c;

        public atk a() {
            return this.f4775a;
        }

        public atk b() {
            return this.f4776b;
        }

        public int c() {
            return this.c;
        }

        public String toString() {
            return this.f4775a + "/" + this.f4776b + '/' + this.c;
        }

        public b(atk atkVar, atk atkVar2, int i) {
            this.f4775a = atkVar;
            this.f4776b = atkVar2;
            this.c = i;
        }
    }

    public static final class c implements Serializable, Comparator<b> {
        public c() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar.c() - bVar2.c();
        }
    }

    public c06(cp2 cp2Var) throws NotFoundException {
        this.f4773a = cp2Var;
        this.f4774b = new whr(cp2Var);
    }

    public static int d(atk atkVar, atk atkVar2) {
        return q8f.c(atk.b(atkVar, atkVar2));
    }

    public static void e(Map<atk, Integer> map, atk atkVar) {
        Integer num = map.get(atkVar);
        map.put(atkVar, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    public static cp2 g(cp2 cp2Var, atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4, int i, int i2) throws NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return t3b.b().c(cp2Var, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, atkVar.c(), atkVar.d(), atkVar4.c(), atkVar4.d(), atkVar3.c(), atkVar3.d(), atkVar2.c(), atkVar2.d());
    }

    public final atk a(atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4, int i) {
        float f = i;
        float fD = d(atkVar, atkVar2) / f;
        float fD2 = d(atkVar3, atkVar4);
        atk atkVar5 = new atk(atkVar4.c() + (((atkVar4.c() - atkVar3.c()) / fD2) * fD), atkVar4.d() + (fD * ((atkVar4.d() - atkVar3.d()) / fD2)));
        float fD3 = d(atkVar, atkVar3) / f;
        float fD4 = d(atkVar2, atkVar4);
        atk atkVar6 = new atk(atkVar4.c() + (((atkVar4.c() - atkVar2.c()) / fD4) * fD3), atkVar4.d() + (fD3 * ((atkVar4.d() - atkVar2.d()) / fD4)));
        if (f(atkVar5)) {
            return (f(atkVar6) && Math.abs(h(atkVar3, atkVar5).c() - h(atkVar2, atkVar5).c()) > Math.abs(h(atkVar3, atkVar6).c() - h(atkVar2, atkVar6).c())) ? atkVar6 : atkVar5;
        }
        if (f(atkVar6)) {
            return atkVar6;
        }
        return null;
    }

    public final atk b(atk atkVar, atk atkVar2, atk atkVar3, atk atkVar4, int i, int i2) {
        float fD = d(atkVar, atkVar2) / i;
        float fD2 = d(atkVar3, atkVar4);
        atk atkVar5 = new atk(atkVar4.c() + (((atkVar4.c() - atkVar3.c()) / fD2) * fD), atkVar4.d() + (fD * ((atkVar4.d() - atkVar3.d()) / fD2)));
        float fD3 = d(atkVar, atkVar3) / i2;
        float fD4 = d(atkVar2, atkVar4);
        atk atkVar6 = new atk(atkVar4.c() + (((atkVar4.c() - atkVar2.c()) / fD4) * fD3), atkVar4.d() + (fD3 * ((atkVar4.d() - atkVar2.d()) / fD4)));
        if (f(atkVar5)) {
            return (f(atkVar6) && Math.abs(i - h(atkVar3, atkVar5).c()) + Math.abs(i2 - h(atkVar2, atkVar5).c()) > Math.abs(i - h(atkVar3, atkVar6).c()) + Math.abs(i2 - h(atkVar2, atkVar6).c())) ? atkVar6 : atkVar5;
        }
        if (f(atkVar6)) {
            return atkVar6;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f06 c() throws NotFoundException {
        atk atkVar;
        atk atkVar2;
        cp2 cp2VarG;
        atk[] atkVarArrC = this.f4774b.c();
        atk atkVar3 = atkVarArrC[0];
        atk atkVar4 = atkVarArrC[1];
        atk atkVar5 = atkVarArrC[2];
        atk atkVar6 = atkVarArrC[3];
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(h(atkVar3, atkVar4));
        arrayList.add(h(atkVar3, atkVar5));
        arrayList.add(h(atkVar4, atkVar6));
        arrayList.add(h(atkVar5, atkVar6));
        atk atkVar7 = null;
        Collections.sort(arrayList, new c());
        b bVar = (b) arrayList.get(0);
        b bVar2 = (b) arrayList.get(1);
        HashMap map = new HashMap();
        e(map, bVar.a());
        e(map, bVar.b());
        e(map, bVar2.a());
        e(map, bVar2.b());
        atk atkVar8 = null;
        atk atkVar9 = null;
        for (Map.Entry entry : map.entrySet()) {
            atk atkVar10 = (atk) entry.getKey();
            if (((Integer) entry.getValue()).intValue() == 2) {
                atkVar8 = atkVar10;
            } else if (atkVar7 == null) {
                atkVar7 = atkVar10;
            } else {
                atkVar9 = atkVar10;
            }
        }
        if (atkVar7 == null || atkVar8 == null || atkVar9 == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        atk[] atkVarArr = {atkVar7, atkVar8, atkVar9};
        atk.e(atkVarArr);
        atk atkVar11 = atkVarArr[0];
        atk atkVar12 = atkVarArr[1];
        atk atkVar13 = atkVarArr[2];
        if (!map.containsKey(atkVar3)) {
            atkVar = atkVar3;
        } else if (map.containsKey(atkVar4)) {
            atkVar = !map.containsKey(atkVar5) ? atkVar5 : atkVar6;
        } else {
            atkVar = atkVar4;
        }
        int iC = h(atkVar13, atkVar).c();
        int iC2 = h(atkVar11, atkVar).c();
        if ((iC & 1) == 1) {
            iC++;
        }
        int i = iC + 2;
        if ((iC2 & 1) == 1) {
            iC2++;
        }
        int i2 = iC2 + 2;
        if (i * 4 >= i2 * 7 || i2 * 4 >= i * 7) {
            atk atkVarB = b(atkVar12, atkVar11, atkVar13, atkVar, i, i2);
            if (atkVarB != null) {
                atkVar = atkVarB;
            }
            int iC3 = h(atkVar13, atkVar).c();
            int iC4 = h(atkVar11, atkVar).c();
            if ((iC3 & 1) == 1) {
                iC3++;
            }
            int i3 = iC3;
            if ((iC4 & 1) == 1) {
                iC4++;
            }
            atkVar2 = atkVar13;
            cp2VarG = g(this.f4773a, atkVar13, atkVar12, atkVar11, atkVar, i3, iC4);
        } else {
            atk atkVarA = a(atkVar12, atkVar11, atkVar13, atkVar, Math.min(i2, i));
            if (atkVarA != null) {
                atkVar = atkVarA;
            }
            int iMax = Math.max(h(atkVar13, atkVar).c(), h(atkVar11, atkVar).c());
            int i4 = iMax + 1;
            int i5 = (i4 & 1) == 1 ? iMax + 2 : i4;
            cp2VarG = g(this.f4773a, atkVar13, atkVar12, atkVar11, atkVar, i5, i5);
            atkVar2 = atkVar13;
        }
        return new f06(cp2VarG, new atk[]{atkVar2, atkVar12, atkVar11, atkVar});
    }

    public final boolean f(atk atkVar) {
        return atkVar.c() >= 0.0f && atkVar.c() < ((float) this.f4773a.k()) && atkVar.d() > 0.0f && atkVar.d() < ((float) this.f4773a.h());
    }

    public final b h(atk atkVar, atk atkVar2) {
        int iC = (int) atkVar.c();
        int iD = (int) atkVar.d();
        int iC2 = (int) atkVar2.c();
        int iD2 = (int) atkVar2.d();
        int i = 0;
        boolean z = Math.abs(iD2 - iD) > Math.abs(iC2 - iC);
        if (z) {
            iD = iC;
            iC = iD;
            iD2 = iC2;
            iC2 = iD2;
        }
        int iAbs = Math.abs(iC2 - iC);
        int iAbs2 = Math.abs(iD2 - iD);
        int i2 = (-iAbs) / 2;
        int i3 = iD < iD2 ? 1 : -1;
        int i4 = iC >= iC2 ? -1 : 1;
        boolean zE = this.f4773a.e(z ? iD : iC, z ? iC : iD);
        while (iC != iC2) {
            boolean zE2 = this.f4773a.e(z ? iD : iC, z ? iC : iD);
            if (zE2 != zE) {
                i++;
                zE = zE2;
            }
            i2 += iAbs2;
            if (i2 > 0) {
                if (iD == iD2) {
                    break;
                }
                iD += i3;
                i2 -= iAbs;
            }
            iC += i4;
        }
        return new b(atkVar, atkVar2, i);
    }
}
