package defpackage;

import android.os.Bundle;
import com.huawei.hwlogsmodel.LogUtil;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class gzu {
    private static int e(int i) {
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public static Bundle d(List<gzv> list) {
        if (list == null) {
            return new Bundle();
        }
        Iterator<gzv> it = list.iterator();
        int iB = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int iD = 0;
        int i4 = 0;
        int iL = 0;
        int i5 = 0;
        int iK = 0;
        int i6 = 0;
        int iA = 0;
        int i7 = 0;
        int iJ = 0;
        int i8 = 0;
        float f = 0.0f;
        int i9 = 0;
        float fO = 0.0f;
        int i10 = 0;
        float fN = 0.0f;
        int i11 = 0;
        float fT = 0.0f;
        int i12 = 0;
        float fM = 0.0f;
        int i13 = 0;
        while (it.hasNext()) {
            gzv next = it.next();
            if (next != null) {
                int iE = e(next.e());
                int iE2 = e(next.i());
                i2 += iE2;
                int iE3 = e(next.c());
                i3 += iE3;
                if (next.l() > 0) {
                    iL += next.l();
                    i4++;
                }
                if (next.k() > 0) {
                    iK += next.k();
                    i5++;
                }
                int i14 = iE + iE2 + iE3;
                if (next.a() > 0) {
                    iA += next.a();
                    i6++;
                }
                if (next.d() > 0) {
                    iD += next.d() * i14;
                }
                if (next.j() > 0) {
                    iJ += next.j() * i14;
                    i7++;
                }
                if (next.b() > 0) {
                    iB += next.b() * i14;
                    i8++;
                }
                if (next.f() > 0.0f) {
                    f += next.f() * i14;
                    i9++;
                }
                if (next.o() > 0.0f) {
                    fO += next.o() * i14;
                    i10++;
                }
                if (next.n() > 0.0f) {
                    fN += next.n();
                    i11++;
                }
                if (next.t() > 0.0f) {
                    fT += next.t();
                    i12++;
                }
                if (next.m() > 0) {
                    fM += next.m();
                    i13++;
                }
                i += iE;
                it = it;
            }
        }
        int i15 = i11;
        int i16 = i12;
        int i17 = i13;
        int i18 = i2;
        int i19 = i + i2 + i3;
        int iRound = i19 > 0 ? Math.round((iD * 1.0f) / i19) : 0;
        int iRound2 = i4 > 0 ? Math.round(iL / i4) : 0;
        float fFloatValue = i5 > 0 ? new BigDecimal((iK * 0.01f) / i5).setScale(1, 1).floatValue() : 0.0f;
        int iRound3 = -1;
        int iRound4 = i6 > 0 ? Math.round((iA * 1.0f) / i6) : -1;
        int iRound5 = (i8 <= 0 || i19 <= 0) ? -101 : Math.round((iB * 1.0f) / i19);
        if (i7 > 0 && i19 > 0) {
            iRound3 = Math.round((iJ * 1.0f) / i19);
        }
        float fFloatValue2 = -1.0f;
        float fFloatValue3 = (i9 <= 0 || i19 <= 0) ? -1.0f : new BigDecimal(f / i19).setScale(1, 1).floatValue();
        float fFloatValue4 = (i10 <= 0 || i19 <= 0) ? -1.0f : new BigDecimal((fO * 1.0f) / i19).setScale(1, 1).floatValue();
        float fFloatValue5 = i15 > 0 ? new BigDecimal(fN / i15).setScale(1, 1).floatValue() : -1.0f;
        float fFloatValue6 = i16 > 0 ? new BigDecimal(fT / i16).setScale(1, 1).floatValue() : -1.0f;
        if (i17 > 0 && i16 > 0) {
            float f2 = fM / i17;
            if (f2 > 0.0f) {
                fFloatValue2 = new BigDecimal((fFloatValue6 / f2) * 100.0f).setScale(1, 1).floatValue();
            }
        }
        Bundle bundle = new Bundle();
        int i20 = iRound2;
        bundle.putInt("averageHangTime", i20);
        bundle.putFloat("groundHangTimeRate", fFloatValue);
        bundle.putInt("avgGroundContactTime", iRound4);
        bundle.putInt("avgGroundImpactAcceleration", iRound);
        bundle.putInt("avgSwingAngle", iRound3);
        bundle.putInt("avgEversionExcursion", iRound5);
        bundle.putInt("foreFootStrikePatternPercentage", i);
        bundle.putInt("wholeFootStrikePatternPercentage", i18);
        int i21 = i3;
        bundle.putInt("hindFootStrikePatternPercentage", i21);
        bundle.putFloat("averageverticalimpactrate", fFloatValue3);
        bundle.putFloat("averageimpactpeak", fFloatValue4);
        bundle.putFloat("averagegctimebalance", fFloatValue5);
        bundle.putFloat("averageverticaloscillation", fFloatValue6);
        if (fFloatValue2 > 0.0f) {
            LogUtil.a("Track_RunPostureUtil", "calAvgRunningPosture in averageVerticalRatio > 0   = ", Float.valueOf(fFloatValue2));
            bundle.putFloat("averageverticalration", fFloatValue2);
        }
        LogUtil.a("Track_RunPostureUtil", "calAvgRunningPosture averageVerticalImpactRate = ", Float.valueOf(fFloatValue3), " averageImpactPeak = ", Float.valueOf(fFloatValue4), " averageGcTimeBalance = ", Float.valueOf(fFloatValue5), " averageVerticalOscillation = ", Float.valueOf(fFloatValue6), " averageVerticalRatio = ", Float.valueOf(fFloatValue2), " averageHangTime = ", Integer.valueOf(i20), " averageHangTimeRate = ", Float.valueOf(fFloatValue), " avgGroundContactTime = ", Integer.valueOf(iRound4), " avgSwingAngle = ", Integer.valueOf(iRound3), " avgEversionExcursion = ", Integer.valueOf(iRound5), " totalForeFootStrikePattern = ", Integer.valueOf(i), "totalWholeFootStrikePattern = ", Integer.valueOf(i18), " totalHindFootStrikePattern = ", Integer.valueOf(i21));
        return bundle;
    }
}
