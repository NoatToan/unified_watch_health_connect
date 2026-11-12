package wg0;

import c22.k2;
import java.util.ArrayList;
import o13.p;
import p005kotlin.jvm.internal.s;
import p13.u;
import p13.w;
import ps.b1;
import ps.c1;
import ps.t1;

/* JADX INFO: loaded from: classes8.dex */
public final class e {
    public static final p<com.garmin.android.library.mapsdkadapter.f, com.garmin.android.library.mapsdkadapter.f> a(ps.m mVar) {
        mVar.getClass();
        String encodedLevels = mVar.getEncodedLevels();
        String encodedSamples = mVar.getEncodedSamples();
        com.garmin.android.library.mapsdkadapter.f fVar = null;
        com.garmin.android.library.mapsdkadapter.f[] fVarArrA = (encodedLevels == null || encodedSamples == null) ? null : k2.a(k2.b(encodedLevels).length, encodedSamples);
        com.garmin.android.library.mapsdkadapter.f fVar2 = fVarArrA != null ? (com.garmin.android.library.mapsdkadapter.f) u.H(fVarArrA) : null;
        if (fVarArrA != null && fVarArrA.length != 0) {
            fVar = fVarArrA[fVarArrA.length - 1];
        }
        return new p<>(fVar2, fVar);
    }

    public static final boolean b(ps.m mVar) {
        String string;
        mVar.getClass();
        String encodedLevels = mVar.getEncodedLevels();
        String string2 = null;
        if (encodedLevels != null) {
            int length = encodedLevels.length() - 1;
            int i14 = 0;
            boolean z14 = false;
            while (i14 <= length) {
                boolean z15 = s.h(encodedLevels.charAt(!z14 ? i14 : length), 32) <= 0;
                if (z14) {
                    if (!z15) {
                        break;
                    }
                    length--;
                } else if (z15) {
                    i14++;
                } else {
                    z14 = true;
                }
            }
            string = encodedLevels.subSequence(i14, length + 1).toString();
        } else {
            string = null;
        }
        if (g22.n.d(string)) {
            String encodedSamples = mVar.getEncodedSamples();
            if (encodedSamples != null) {
                int length2 = encodedSamples.length() - 1;
                int i15 = 0;
                boolean z16 = false;
                while (i15 <= length2) {
                    boolean z17 = s.h(encodedSamples.charAt(!z16 ? i15 : length2), 32) <= 0;
                    if (z16) {
                        if (!z17) {
                            break;
                        }
                        length2--;
                    } else if (z17) {
                        i15++;
                    } else {
                        z16 = true;
                    }
                }
                string2 = encodedSamples.subSequence(i15, length2 + 1).toString();
            }
            if (g22.n.d(string2)) {
                return true;
            }
        }
        return false;
    }

    public static final c1 c(ps.m mVar) {
        mVar.getClass();
        if (b(mVar)) {
            String encodedLevels = mVar.getEncodedLevels();
            String encodedSamples = mVar.getEncodedSamples();
            com.garmin.android.library.mapsdkadapter.f[] fVarArrA = (encodedLevels == null || encodedSamples == null) ? null : k2.a(k2.b(encodedLevels).length, encodedSamples);
            if (fVarArrA != null && fVarArrA.length != 0) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (com.garmin.android.library.mapsdkadapter.f fVar : u.C(fVarArrA)) {
                    arrayList.add(Double.valueOf(fVar.f50283a.latitude));
                    arrayList2.add(Double.valueOf(fVar.f50283a.longitude));
                }
                b1.r rVar = new b1.r(5.0f);
                int length = fVarArrA.length;
                double[] dArr = new double[length];
                for (int i14 = 0; i14 < length; i14++) {
                    dArr[i14] = 0.0d;
                }
                return new c1(arrayList, arrayList2, w.c(new t1(rVar, u.e0(dArr), null, 4, null)), null, 8, null);
            }
        }
        return null;
    }
}
