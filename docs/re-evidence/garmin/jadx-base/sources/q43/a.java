package q43;

import p43.l1;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static l1 a(boolean z14, s sVar, e eVar, f fVar, int i14) {
        if ((i14 & 4) != 0) {
            sVar = s.f142813a;
        }
        s sVar2 = sVar;
        if ((i14 & 8) != 0) {
            eVar = e.a.f142787a;
        }
        e eVar2 = eVar;
        if ((i14 & 16) != 0) {
            fVar = f.a.f142788a;
        }
        f fVar2 = fVar;
        sVar2.getClass();
        eVar2.getClass();
        fVar2.getClass();
        return new l1(z14, true, false, true, sVar2, eVar2, fVar2);
    }
}
