package com.xiaomi.hm.health.device.health.rrpeak;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class RRPackageDataAnalysisUtils {
    private static final int a = 12;
    private static final int b = 10;
    private static final int c = 3;
    private static final int d = 4;
    private static final int e = 5;
    private static final int f = 21930;
    private static final int g = 6;
    private static final int h = 4;

    private static RRSingleData a(byte[] bArr, int i) {
        RRSingleData rRSingleData = new RRSingleData();
        rRSingleData.setTimestamp(Long.valueOf(d(bArr, i, 32)));
        List<Integer> listE = e(bArr, i + 4, 16, 2);
        Integer num = listE.get(0);
        rRSingleData.setIntervalCnt(num);
        rRSingleData.setPosPksCnt(listE.get(1));
        rRSingleData.setSignalQuality(e(bArr, i + 8, 8, 1).get(0));
        rRSingleData.setAfResult(Integer.valueOf(bArr[i + 9]));
        List<Integer> listE2 = e(bArr, i + 10, 8, 2);
        rRSingleData.setVersion(listE2.get(0));
        rRSingleData.setReserve(listE2.get(1));
        rRSingleData.setIntervalData(c(bArr, i + 12, 16, num.intValue()));
        return rRSingleData;
    }

    public static List<RRSingleData> analysisForRRPkgData(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length) {
            try {
                List<Integer> listH = h(bArr, i, 4);
                int iIntValue = listH.get(3).intValue();
                i += 12;
                f(bArr, i, iIntValue, listH.get(4).intValue());
                arrayList.add(a(bArr, i));
                i += iIntValue;
            } catch (IllegalArgumentException unused) {
                i++;
            }
        }
        return arrayList;
    }

    public static List<RRSingleDataNew> analysisForRRPkgDataNew(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < bArr.length) {
            try {
                List<Integer> listH = h(bArr, i, 4);
                int iIntValue = listH.get(3).intValue();
                i += 12;
                f(bArr, i, iIntValue, listH.get(4).intValue());
                arrayList.add(b(bArr, i));
                i += iIntValue;
            } catch (IllegalArgumentException unused) {
                i++;
            }
        }
        return arrayList;
    }

    private static RRSingleDataNew b(byte[] bArr, int i) {
        RRSingleDataNew rRSingleDataNew = new RRSingleDataNew();
        rRSingleDataNew.setTimestamp(Long.valueOf(d(bArr, i, 32)));
        rRSingleDataNew.setFirstPeakLoc(c(bArr, i + 4, 16, 1).get(0));
        int iIntValue = e(bArr, i + 6, 16, 1).get(0).intValue();
        rRSingleDataNew.setIntervalCnt(Integer.valueOf(iIntValue));
        rRSingleDataNew.setPosPksCnt(e(bArr, i + 8, 16, 1).get(0));
        rRSingleDataNew.setSignalQuality(e(bArr, i + 10, 8, 1).get(0));
        rRSingleDataNew.setAfResult(Integer.valueOf(bArr[i + 11]));
        rRSingleDataNew.setVersion(e(bArr, i + 12, 8, 1).get(0));
        rRSingleDataNew.setReserve(e(bArr, i + 13, 8, 1).get(0));
        int i2 = i + 14;
        rRSingleDataNew.setIntervalData(c(bArr, i2, 16, iIntValue));
        rRSingleDataNew.setAmplitudeData(c(bArr, i2 + (iIntValue * 2), 16, iIntValue + 1));
        return rRSingleDataNew;
    }

    private static List<Integer> c(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 / 8;
        if ((i3 * i4) + i > bArr.length || i2 % 8 != 0) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4 - 1) {
                i7 |= (bArr[((i5 * i4) + i) + i6] & 255) << (i6 * 8);
                i6++;
            }
            arrayList.add(Integer.valueOf((bArr[((i5 * i4) + i) + i6] << (i6 * 8)) | i7));
        }
        return arrayList;
    }

    private static long d(byte[] bArr, int i, int i2) {
        int i3 = i2 / 8;
        if (i + i3 > bArr.length || i2 % 8 != 0 || i2 > 64) {
            throw new IllegalArgumentException();
        }
        long j = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            j |= (long) ((bArr[i + i4] & 255) << (i4 * 8));
        }
        return j;
    }

    private static List<Integer> e(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 / 8;
        if ((i3 * i4) + i > bArr.length || i2 % 8 != 0) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                i6 |= (bArr[((i5 * i4) + i) + i7] & 255) << (i7 * 8);
            }
            arrayList.add(Integer.valueOf(i6));
        }
        return arrayList;
    }

    private static void f(byte[] bArr, int i, int i2, int i3) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        if (i3 != g(bArr2)) {
            throw new IllegalArgumentException();
        }
    }

    private static int g(byte[] bArr) {
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (length > 1) {
            int i3 = i2 + 1;
            i += (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
            length -= 2;
            i2 = i3 + 1;
        }
        if (length == 1) {
            i += bArr[bArr.length - 1];
        }
        while (true) {
            int i4 = i >> 16;
            if (i4 == 0) {
                return (~i) & 65535;
            }
            i = i4 + (65535 & i);
        }
    }

    private static List<Integer> h(byte[] bArr, int i, int i2) {
        List<Integer> listE = e(bArr, i, 16, 6);
        j(listE, i2);
        i(bArr, i, listE);
        return listE;
    }

    private static void i(byte[] bArr, int i, List<Integer> list) {
        byte[] bArr2 = new byte[10];
        System.arraycopy(bArr, i, bArr2, 0, 10);
        if (list.get(5).intValue() != g(bArr2)) {
            throw new IllegalArgumentException();
        }
    }

    private static void j(List<Integer> list, int i) {
        if (list.get(0).intValue() != f || list.get(1).intValue() != i) {
            throw new IllegalArgumentException("error RR header flag");
        }
    }
}
