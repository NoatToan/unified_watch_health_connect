package com.huami.watch.companion.xiaomiai;

/* JADX INFO: loaded from: classes16.dex */
public class LinearInterpolation {
    public short[] interpolate(int i, int i2, short[] sArr) {
        if (i == i2) {
            return sArr;
        }
        int iRound = Math.round((sArr.length / i) * i2);
        float length = iRound / sArr.length;
        short[] sArr2 = new short[iRound];
        for (int i3 = 0; i3 < iRound; i3++) {
            float f = i3 / length;
            int i4 = (int) f;
            int length2 = i4 + 1;
            if (length2 >= sArr.length) {
                length2 = sArr.length - 1;
            }
            sArr2[i3] = (short) (((sArr[length2] - sArr[i4]) * (f - i4)) + sArr[i4]);
        }
        return sArr2;
    }
}
