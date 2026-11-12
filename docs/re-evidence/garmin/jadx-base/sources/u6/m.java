package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f168828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<p> f168829b = new ArrayList<>();

    public m(p pVar, int i14) {
        this.f168828a = null;
        this.f168828a = pVar;
    }

    public static long a(f fVar, long j8) {
        p pVar = fVar.f168806d;
        ArrayList arrayList = fVar.f168813k;
        if (pVar instanceof k) {
            return j8;
        }
        int size = arrayList.size();
        long jMin = j8;
        for (int i14 = 0; i14 < size; i14++) {
            d dVar = (d) arrayList.get(i14);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f168806d != pVar) {
                    jMin = Math.min(jMin, a(fVar2, ((long) fVar2.f168808f) + j8));
                }
            }
        }
        f fVar3 = pVar.f168847i;
        f fVar4 = pVar.f168846h;
        if (fVar != fVar3) {
            return jMin;
        }
        long j14 = j8 - pVar.j();
        return Math.min(Math.min(jMin, a(fVar4, j14)), j14 - ((long) fVar4.f168808f));
    }

    public static long b(f fVar, long j8) {
        p pVar = fVar.f168806d;
        ArrayList arrayList = fVar.f168813k;
        if (pVar instanceof k) {
            return j8;
        }
        int size = arrayList.size();
        long jMax = j8;
        for (int i14 = 0; i14 < size; i14++) {
            d dVar = (d) arrayList.get(i14);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f168806d != pVar) {
                    jMax = Math.max(jMax, b(fVar2, ((long) fVar2.f168808f) + j8));
                }
            }
        }
        f fVar3 = pVar.f168846h;
        f fVar4 = pVar.f168847i;
        if (fVar != fVar3) {
            return jMax;
        }
        long j14 = pVar.j() + j8;
        return Math.max(Math.max(jMax, b(fVar4, j14)), j14 - ((long) fVar4.f168808f));
    }
}
