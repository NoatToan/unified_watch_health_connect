package dy1;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import d53.w;
import p13.x;
import ps.z1;
import qs.y;

/* JADX INFO: loaded from: classes10.dex */
public final class s {
    public static final com.garmin.android.apps.connectmobile.workouts.data.model.b a(b bVar, mx1.a aVar, boolean z14) {
        bVar.getClass();
        aVar.getClass();
        String str = aVar.f121356f;
        String str2 = aVar.f121355e;
        z1 z1Var = new z1((Double) null, (Integer) null, (bVar.f61531d ? y.UNIT_WEIGHT_KILOGRAM : y.UNIT_WEIGHT_POUND).f147239a, 3, (p005kotlin.jvm.internal.j) null);
        long j8 = bVar.f61528a;
        Long lValueOf = j8 > 0 ? Long.valueOf(j8) : null;
        String str3 = z14 ? str2 : str;
        String str4 = aVar.f121354d;
        Double d14 = bVar.f61529b;
        int i14 = bVar.f61532e;
        Double d15 = bVar.f61533f;
        String str5 = aVar.f121354d;
        if (z14) {
            str = str2;
        }
        return new com.garmin.android.apps.connectmobile.workouts.data.model.b(lValueOf, str3, str4, d14, Integer.valueOf(i14), d15, z1Var, null, x.m(new com.garmin.android.apps.connectmobile.workouts.data.model.l(str5, str)), null, 640, null);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public static final kx1.a b(com.garmin.android.apps.connectmobile.repcounting.model.d dVar) {
        dVar.getClass();
        String str = dVar.f41106e;
        String str2 = dVar.f41102a;
        String str3 = dVar.f41107f;
        if (str3 == null) {
            str3 = dVar.f41106e;
        } else {
            if (str3.length() == 0) {
                str3 = dVar.f41106e;
            }
            if (str3 == null) {
                str3 = dVar.f41106e;
            }
        }
        return new kx1.a(str, str2, str3);
    }

    public static final b c(com.garmin.android.apps.connectmobile.workouts.data.model.b bVar, l22.b bVar2, boolean z14) {
        Integer reps;
        Long l14;
        bVar2.getClass();
        return new b((bVar == null || (l14 = bVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? -1L : l14.longValue(), bVar != null ? bVar.k() : null, bVar2.getString(z14 ? R.string.lbl_kg : R.string.lbl_lbs), z14, (bVar == null || (reps = bVar.getReps()) == null) ? 1 : reps.intValue(), bVar != null ? bVar.m() : null, false, 64, null);
    }

    public static final b d(ix1.c cVar, ox1.c cVar2, boolean z14) {
        Double dValueOf;
        cVar2.getClass();
        Long lF = cVar.getBenchmarkId();
        long jLongValue = lF != null ? lF.longValue() : -1L;
        Integer numJ = cVar.getMaxWeightInGrams();
        Double dValueOf2 = null;
        if (numJ != null) {
            int iIntValue = numJ.intValue();
            l3.f23124b.getClass();
            dValueOf = Double.valueOf(l3.a.Q1(iIntValue, z14));
        } else {
            dValueOf = null;
        }
        String string = cVar2.f134334a.getString(z14 ? R.string.lbl_kg : R.string.lbl_lbs);
        Integer numK = cVar.getReps();
        int iIntValue2 = numK != null ? numK.intValue() : 1;
        Integer numI = cVar.getBenchmarkValueInGrams();
        if (numI != null) {
            double dIntValue = numI.intValue();
            l3.f23124b.getClass();
            dValueOf2 = Double.valueOf(l3.a.Q1((long) dIntValue, z14));
        }
        return new b(jLongValue, dValueOf, string, z14, iIntValue2, dValueOf2, false, 64, null);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0028  */
    public static final d e(ix1.c cVar, ox1.c cVar2, boolean z14, Double d14, Double d15) {
        boolean z15;
        cVar2.getClass();
        ix1.d dVarH = cVar.h();
        String strName = dVarH != null ? dVarH.name() : null;
        mx1.a.f121347g.getClass();
        mx1.a aVarB = mx1.a.C2299a.b(strName);
        if (aVarB == null) {
            return null;
        }
        if (strName != null) {
            z15 = w.z(strName, "barbell", true);
        }
        return new d(aVarB, z15, z15 ? d(cVar, cVar2, z14) : null, z15 ? null : d(cVar, cVar2, z14), cVar.getActivityId(), d14, d15);
    }
}
