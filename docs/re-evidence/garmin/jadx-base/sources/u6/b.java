package u6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<t6.e> f168780a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f168781b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t6.f f168782c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t6.e.b f168783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public t6.e.b f168784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f168785c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f168786d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f168787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f168788f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f168789g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f168790h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f168791i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f168792j;
    }

    /* JADX INFO: renamed from: u6.b$b, reason: collision with other inner class name */
    public interface InterfaceC3163b {
        void a(t6.e eVar, a aVar);

        void b();
    }

    public b(t6.f fVar) {
        this.f168782c = fVar;
    }

    public final boolean a(int i14, t6.e eVar, InterfaceC3163b interfaceC3163b) {
        t6.e.b[] bVarArr = eVar.W;
        int[] iArr = eVar.f162644v;
        t6.e.b bVar = bVarArr[0];
        a aVar = this.f168781b;
        aVar.f168783a = bVar;
        aVar.f168784b = bVarArr[1];
        aVar.f168785c = eVar.s();
        aVar.f168786d = eVar.m();
        aVar.f168791i = false;
        aVar.f168792j = i14;
        t6.e.b bVar2 = aVar.f168783a;
        t6.e.b bVar3 = t6.e.b.MATCH_CONSTRAINT;
        boolean z14 = bVar2 == bVar3;
        boolean z15 = aVar.f168784b == bVar3;
        boolean z16 = z14 && eVar.f162603a0 > 0.0f;
        boolean z17 = z15 && eVar.f162603a0 > 0.0f;
        if (z16 && iArr[0] == 4) {
            aVar.f168783a = t6.e.b.FIXED;
        }
        if (z17 && iArr[1] == 4) {
            aVar.f168784b = t6.e.b.FIXED;
        }
        interfaceC3163b.a(eVar, aVar);
        eVar.T(aVar.f168787e);
        eVar.O(aVar.f168788f);
        eVar.G = aVar.f168790h;
        eVar.K(aVar.f168789g);
        aVar.f168792j = 0;
        return aVar.f168791i;
    }

    public final void b(t6.f fVar, int i14, int i15, int i16) {
        if (fVar.C0 != null) {
            System.nanoTime();
        }
        int i17 = fVar.f162613f0;
        int i18 = fVar.f162615g0;
        fVar.f162613f0 = 0;
        fVar.f162615g0 = 0;
        fVar.T(i15);
        fVar.O(i16);
        if (i17 < 0) {
            fVar.f162613f0 = 0;
        } else {
            fVar.f162613f0 = i17;
        }
        if (i18 < 0) {
            fVar.f162615g0 = 0;
        } else {
            fVar.f162615g0 = i18;
        }
        t6.f fVar2 = this.f168782c;
        fVar2.f162658z0 = i14;
        fVar2.X();
        if (fVar.C0 != null) {
            System.nanoTime();
            fVar.C0.getClass();
        }
    }

    public final void c(t6.f fVar) {
        ArrayList<t6.e> arrayList = this.f168780a;
        arrayList.clear();
        int size = fVar.f162695w0.size();
        for (int i14 = 0; i14 < size; i14++) {
            t6.e eVar = fVar.f162695w0.get(i14);
            t6.e.b[] bVarArr = eVar.W;
            t6.e.b bVar = bVarArr[0];
            t6.e.b bVar2 = t6.e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 || bVarArr[1] == bVar2) {
                arrayList.add(eVar);
            }
        }
        fVar.f162657y0.f168796b = true;
    }
}
