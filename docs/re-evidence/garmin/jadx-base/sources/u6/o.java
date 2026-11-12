package u6;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f168833f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f168835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f168836c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<t6.e> f168834a = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<a> f168837d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f168838e = -1;

    public static class a {
        public a(t6.e eVar, m6.d dVar, int i14) {
            new WeakReference(eVar);
            t6.d dVar2 = eVar.L;
            dVar.getClass();
            m6.d.n(dVar2);
            m6.d.n(eVar.M);
            m6.d.n(eVar.N);
            m6.d.n(eVar.O);
            m6.d.n(eVar.P);
        }
    }

    public o(int i14) {
        int i15 = f168833f;
        f168833f = i15 + 1;
        this.f168835b = i15;
        this.f168836c = i14;
    }

    public final void a(ArrayList<o> arrayList) {
        int size = this.f168834a.size();
        if (this.f168838e != -1 && size > 0) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                o oVar = arrayList.get(i14);
                if (this.f168838e == oVar.f168835b) {
                    c(this.f168836c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(m6.d dVar, int i14) {
        int iN;
        int iN2;
        ArrayList<t6.e> arrayList = this.f168834a;
        if (arrayList.size() == 0) {
            return 0;
        }
        t6.f fVar = (t6.f) arrayList.get(0).X;
        dVar.t();
        fVar.c(dVar, false);
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            arrayList.get(i15).c(dVar, false);
        }
        if (i14 == 0 && fVar.G0 > 0) {
            t6.b.a(fVar, dVar, arrayList, 0);
        }
        if (i14 == 1 && fVar.H0 > 0) {
            t6.b.a(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception e4) {
            System.err.println(e4.toString() + "\n" + Arrays.toString(e4.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f168837d = new ArrayList<>();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            this.f168837d.add(new a(arrayList.get(i16), dVar, i14));
        }
        if (i14 == 0) {
            iN = m6.d.n(fVar.L);
            iN2 = m6.d.n(fVar.N);
            dVar.t();
        } else {
            iN = m6.d.n(fVar.M);
            iN2 = m6.d.n(fVar.O);
            dVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i14, o oVar) {
        int i15 = oVar.f168835b;
        for (t6.e eVar : this.f168834a) {
            ArrayList<t6.e> arrayList = oVar.f168834a;
            if (!arrayList.contains(eVar)) {
                arrayList.add(eVar);
            }
            if (i14 == 0) {
                eVar.f162643u0 = i15;
            } else {
                eVar.f162645v0 = i15;
            }
        }
        this.f168838e = i15;
    }

    public final String toString() {
        String str;
        StringBuilder sb3 = new StringBuilder();
        int i14 = this.f168836c;
        if (i14 == 0) {
            str = "Horizontal";
        } else if (i14 == 1) {
            str = "Vertical";
        } else {
            str = i14 == 2 ? "Both" : "Unknown";
        }
        sb3.append(str);
        sb3.append(" [");
        String strQ = am.j.q(sb3, this.f168835b, "] <");
        for (t6.e eVar : this.f168834a) {
            StringBuilder sbI = sn.a.i(strQ, StringUtils.SPACE);
            sbI.append(eVar.f162627m0);
            strQ = sbI.toString();
        }
        return strQ.concat(" >");
    }
}
