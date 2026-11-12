package com.huami.ecg.util;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016J\u001e\u0010\u0018\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u001e\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u0017\u0010!\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010#R\u0016\u0010'\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010#R\u0016\u0010(\u001a\u00020\u00168\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010+¨\u0006/"}, d2 = {"Lcom/huami/ecg/util/EcgMathTools;", "", "", "input", "", "a$ecg_core_release", "(B)I", "a", "v$ecg_core_release", "(I)I", "v", "", "flag$ecg_core_release", "(I)Z", "flag", "totalSize", "", "getStabilityRange", "getECGFilterRange", "coeffB", "coeffA", "isValidCoeff", "", "original", "adc2mv", "", "Coeff_B", "Coeff_A", "", "adc2fmv", "index", "frequencyToTime$ecg_core_release", "(I)F", "frequencyToTime", "SENSOR_FREQUENCY", LogUtil.I, "SNAP_SHOT_SMOOTH", "SNAP_SHOT_UI", "SNAP_SHOT_START", "SENSOR_ADC_2_MV_COEFFICIENT", "SENSOR_NORMALILZIE_COEEFFICENT", "F", "", "Ljava/lang/String;", "TAG", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgMathTools {
    public static final EcgMathTools INSTANCE = new EcgMathTools();
    public static final int SENSOR_ADC_2_MV_COEFFICIENT = 4086;
    public static final int SENSOR_FREQUENCY = 250;
    public static final float SENSOR_NORMALILZIE_COEEFFICENT = 1.8f;
    public static final int SNAP_SHOT_SMOOTH = 2500;
    public static final int SNAP_SHOT_START = 3000;
    public static final int SNAP_SHOT_UI = 1500;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = "EcgMathTools";

    private EcgMathTools() {
    }

    public final int a$ecg_core_release(byte input) {
        return 0;
    }

    public final float adc2fmv(float original, long Coeff_B, long Coeff_A) {
        return (original - Coeff_B) / Coeff_A;
    }

    public final double adc2mv(float original, long Coeff_B, long Coeff_A) {
        return (original - Coeff_B) / Coeff_A;
    }

    public final float adc2mv(float original) {
        return (original - 8231.0f) / 1775.55f;
    }

    public final boolean flag$ecg_core_release(int input) {
        return (input & 32768) > 0;
    }

    public final float frequencyToTime$ecg_core_release(int index) {
        return index / 250;
    }

    @NotNull
    public final int[] getECGFilterRange(int totalSize) {
        return totalSize > 1500 ? new int[]{0, 1500} : new int[]{0, totalSize};
    }

    @NotNull
    public final int[] getStabilityRange(int totalSize) {
        if (totalSize >= 7000) {
            return new int[]{3000, 5500};
        }
        if (totalSize >= 2500) {
            return new int[]{0, totalSize - 1};
        }
        int i = totalSize / 4;
        int i2 = i + 2500;
        int[] iArr = new int[2];
        iArr[0] = i;
        if (i2 >= totalSize) {
            i2 = totalSize - 1;
        }
        iArr[1] = i2;
        return iArr;
    }

    public final boolean isValidCoeff(int coeffB, int coeffA) {
        return 7901 <= coeffB && 9099 >= coeffB && 900 < coeffA && coeffA < 1300;
    }

    public final int v$ecg_core_release(int input) {
        return input & 32767;
    }
}
