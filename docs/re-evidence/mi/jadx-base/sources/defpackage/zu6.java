package defpackage;

import miuix.appcompat.app.d;

/* JADX INFO: loaded from: classes3.dex */
public class zu6 implements qrc {
    @Override // defpackage.qrc
    public boolean a(d.a aVar) {
        if (aVar.f26316a <= 0) {
            return false;
        }
        float fMax = Math.max(aVar.c, 1);
        float fMax2 = (Math.max(aVar.f26317b, aVar.f26316a) * 1.0f) / fMax;
        float f = (aVar.d * 1.0f) / fMax;
        boolean z = aVar.e;
        boolean z2 = z && aVar.f == 2;
        boolean z3 = !aVar.j && (z || aVar.h <= 480) && aVar.g >= 3;
        boolean z4 = aVar.i;
        return fMax2 >= (z4 ? 0.3f : 0.4f) || f >= (z4 ? 0.35f : 0.45f) || z3 || z2;
    }
}
