package com.picooc.health.formula;

import androidx.core.view.MotionEventCompat;
import com.google.common.base.Ascii;
import defpackage.yst;
import huawei.android.hwcolorpicker.HwColorPicker;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes20.dex */
public class Formula {
    protected static native float[] calculateBasicDataByImpedanceOldVersion2(int i, float f, int i2, float f2, int i3);

    static {
        System.loadLibrary("dataFormula");
    }

    public static byte[] c(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 48) {
            return new byte[]{-15, 3, 48};
        }
        if (b2 == 53) {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            return new byte[]{-15, 8, 53, (byte) ((4278190080L & jCurrentTimeMillis) >> 24), (byte) ((16711680 & jCurrentTimeMillis) >> 16), (byte) ((65280 & jCurrentTimeMillis) >> 8), (byte) (jCurrentTimeMillis & 255), 0};
        }
        if (b2 == 54) {
            return new byte[]{-15, 3, 54};
        }
        if (b2 == 55) {
            return new byte[]{-15, 3, 55};
        }
        if (b2 == 57) {
            return new byte[]{-15, 3, 57};
        }
        return new byte[0];
    }

    public static yst e(byte[] bArr, float f, int i, int i2) {
        yst ystVar = new yst();
        byte b2 = bArr[0];
        if (b2 != 48 && b2 != 53) {
            if (b2 == 54) {
                long j = ((bArr[2] << Ascii.CAN) & (-16777216)) + ((bArr[3] << 16) & HwColorPicker.MASK_RESULT_STATE) + ((bArr[4] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[5] & 255);
                float fRound = Math.round(((((bArr[6] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[7] & 255)) / 20.0f) * 10.0f) / 10.0f;
                float[] fArrCalculateBasicDataByImpedanceOldVersion2 = calculateBasicDataByImpedanceOldVersion2(i, f, i2, fRound, (((bArr[8] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[9] & 255)) / 10);
                ystVar.b(2);
                ystVar.a(fRound);
                ystVar.c(fArrCalculateBasicDataByImpedanceOldVersion2[1]);
                ystVar.b(fArrCalculateBasicDataByImpedanceOldVersion2[2]);
                ystVar.d(j * 1000);
                return ystVar;
            }
            if (b2 == 55) {
                ystVar.b(3);
                return ystVar;
            }
            if (b2 == 57) {
                long j2 = ((bArr[2] << Ascii.CAN) & (-16777216)) + ((bArr[3] << 16) & HwColorPicker.MASK_RESULT_STATE) + ((bArr[4] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[5] & 255);
                float fRound2 = Math.round(((((bArr[6] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[7] & 255)) / 20.0f) * 10.0f) / 10.0f;
                if (fRound2 > 0.0f) {
                    float[] fArrCalculateBasicDataByImpedanceOldVersion3 = calculateBasicDataByImpedanceOldVersion2(i, f, i2, fRound2, e((((bArr[8] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr[9] & 255)) / 100.0f) * 10);
                    ystVar.b(1);
                    ystVar.a(fRound2);
                    ystVar.c(fArrCalculateBasicDataByImpedanceOldVersion3[1]);
                    ystVar.b(fArrCalculateBasicDataByImpedanceOldVersion3[2]);
                    ystVar.d(j2 * 1000);
                }
            }
        }
        return ystVar;
    }

    private static int e(float f) {
        return new BigDecimal(f).setScale(0, 4).intValue();
    }
}
