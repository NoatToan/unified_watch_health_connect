package t6;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f162692a = new boolean[3];

    public static void a(f fVar, m6.d dVar, e eVar) {
        eVar.f162634q = -1;
        d dVar2 = eVar.P;
        d dVar3 = eVar.O;
        d dVar4 = eVar.M;
        d dVar5 = eVar.N;
        d dVar6 = eVar.L;
        eVar.f162636r = -1;
        e.b bVar = fVar.W[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.W[0] == e.b.MATCH_PARENT) {
            int i14 = dVar6.f162589g;
            int iS = fVar.s() - dVar5.f162589g;
            dVar6.f162591i = dVar.k(dVar6);
            dVar5.f162591i = dVar.k(dVar5);
            dVar.d(dVar6.f162591i, i14);
            dVar.d(dVar5.f162591i, iS);
            eVar.f162634q = 2;
            eVar.f162607c0 = i14;
            int i15 = iS - i14;
            eVar.Y = i15;
            int i16 = eVar.f162613f0;
            if (i15 < i16) {
                eVar.Y = i16;
            }
        }
        if (fVar.W[1] == bVar2 || eVar.W[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i17 = dVar4.f162589g;
        int iM = fVar.m() - dVar3.f162589g;
        dVar4.f162591i = dVar.k(dVar4);
        dVar3.f162591i = dVar.k(dVar3);
        dVar.d(dVar4.f162591i, i17);
        dVar.d(dVar3.f162591i, iM);
        if (eVar.f162611e0 > 0 || eVar.f162623k0 == 8) {
            m6.h hVarK = dVar.k(dVar2);
            dVar2.f162591i = hVarK;
            dVar.d(hVarK, eVar.f162611e0 + i17);
        }
        eVar.f162636r = 2;
        eVar.f162609d0 = i17;
        int i18 = iM - i17;
        eVar.Z = i18;
        int i19 = eVar.f162615g0;
        if (i18 < i19) {
            eVar.Z = i19;
        }
    }

    public static final boolean b(int i14, int i15) {
        return (i14 & i15) == i15;
    }
}
