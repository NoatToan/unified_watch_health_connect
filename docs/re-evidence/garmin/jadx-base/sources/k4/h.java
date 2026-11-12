package k4;

import f5.d0;
import h5.w;

/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final boolean a(e eVar, long j8) {
        if (!eVar.getNode().getIsAttached()) {
            return false;
        }
        w wVar = h5.k.g(eVar).P.f81682c;
        if (!wVar.isAttached()) {
            return false;
        }
        long jE = d0.e(wVar);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        long j14 = eVar.f102812f;
        float f14 = ((int) (j14 >> 32)) + fIntBitsToFloat;
        float f15 = ((int) (j14 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32));
        if (fIntBitsToFloat > fIntBitsToFloat3 || fIntBitsToFloat3 > f14) {
            return false;
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        return fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f15;
    }
}
