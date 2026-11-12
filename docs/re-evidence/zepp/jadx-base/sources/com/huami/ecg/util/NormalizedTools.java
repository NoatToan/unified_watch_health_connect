package com.huami.ecg.util;

import android.util.Pair;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J4\u0010\r\u001a\u00020\t2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bJ4\u0010\u000f\u001a\u00020\u000e2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\t2\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J=\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J4\u0010\u0015\u001a\u00020\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\u000b¨\u0006\u0018"}, d2 = {"Lcom/huami/ecg/util/NormalizedTools;", "", "", "deviceSource", "Landroid/util/Pair;", "coeff", "", "", "ecgRawData", "", "getNormalizedData", "", "splitHalf", "normalizedUvData", "", "normalizedUvFData", "data", "doNormalize", "normalizedIfNeeded$ecg_core_release", "(Ljava/util/List;Landroid/util/Pair;Z)[D", "normalizedIfNeeded", "normalizedFloatIfNeeded", "<init>", "()V", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class NormalizedTools {
    public static final NormalizedTools INSTANCE = new NormalizedTools();

    private NormalizedTools() {
    }

    @NotNull
    public final double[] getNormalizedData(int deviceSource, @Nullable Pair<Integer, Integer> coeff, @Nullable List<Float> ecgRawData) {
        return DeviceUtils.INSTANCE.isECGMiliFamily(deviceSource) ? normalizedUvData(coeff, ecgRawData, false) : normalizedUvData(ecgRawData);
    }

    @NotNull
    public final float[] normalizedFloatIfNeeded(@Nullable List<Float> data, @Nullable Pair<Integer, Integer> coeff, boolean doNormalize) {
        float[] fArr;
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int i = 0;
        if (!doNormalize || coeff == null) {
            int size = data.size();
            fArr = new float[data.size()];
            while (i < size) {
                fArr[i] = data.get(i).floatValue();
                i++;
            }
        } else {
            double[] dArrNormalizedUvData = normalizedUvData(coeff, data, false);
            int length = dArrNormalizedUvData.length;
            fArr = new float[length];
            while (i < length) {
                fArr[i] = (float) dArrNormalizedUvData[i];
                i++;
            }
        }
        return fArr;
    }

    @NotNull
    public final double[] normalizedIfNeeded$ecg_core_release(@Nullable List<Float> data, @Nullable Pair<Integer, Integer> coeff, boolean doNormalize) {
        if (data == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (doNormalize && coeff != null) {
            return normalizedUvData(coeff, data, false);
        }
        int size = data.size();
        double[] dArr = new double[data.size()];
        for (int i = 0; i < size; i++) {
            dArr[i] = data.get(i).floatValue();
        }
        return dArr;
    }

    @NotNull
    public final double[] normalizedUvData(@Nullable Pair<Integer, Integer> coeff, @Nullable List<Float> ecgRawData, boolean splitHalf) {
        int i = 0;
        if (!((ecgRawData == null || coeff == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Integer num = (Integer) coeff.first;
        Integer num2 = (Integer) coeff.second;
        boolean zIsValidCoeff = EcgMathTools.INSTANCE.isValidCoeff(num2.intValue(), num.intValue());
        int size = ecgRawData.size();
        boolean z = splitHalf && size > 12500;
        int i2 = z ? size / 4 : 0;
        if (z) {
            size = (size * 3) / 4;
        }
        int i3 = size - i2;
        double[] dArr = new double[i3];
        if (zIsValidCoeff) {
            while (i < i3) {
                dArr[i] = EcgMathTools.INSTANCE.adc2mv(ecgRawData.get(i2).floatValue(), num2.intValue(), num.intValue()) * ((double) 1000);
                i++;
                i2++;
            }
        } else {
            while (i < i3) {
                dArr[i] = EcgMathTools.INSTANCE.adc2mv(ecgRawData.get(i2).floatValue()) * 1000;
                i++;
                i2++;
            }
        }
        return dArr;
    }

    @NotNull
    public final float[] normalizedUvFData(@Nullable Pair<Integer, Integer> coeff, @Nullable List<Float> ecgRawData, boolean splitHalf) {
        int i = 0;
        if (!((ecgRawData == null || coeff == null) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Integer num = (Integer) coeff.first;
        Integer num2 = (Integer) coeff.second;
        boolean zIsValidCoeff = EcgMathTools.INSTANCE.isValidCoeff(num2.intValue(), num.intValue());
        int size = ecgRawData.size();
        boolean z = splitHalf && size > 12500;
        int i2 = z ? size / 4 : 0;
        if (z) {
            size = (size * 3) / 4;
        }
        int i3 = size - i2;
        float[] fArr = new float[i3];
        if (zIsValidCoeff) {
            while (i < i3) {
                fArr[i] = EcgMathTools.INSTANCE.adc2fmv(ecgRawData.get(i2).floatValue(), num2.intValue(), num.intValue()) * 1000;
                i++;
                i2++;
            }
        } else {
            while (i < i3) {
                fArr[i] = EcgMathTools.INSTANCE.adc2mv(ecgRawData.get(i2).floatValue()) * 1000;
                i++;
                i2++;
            }
        }
        return fArr;
    }

    @NotNull
    public final double[] normalizedUvData(@Nullable List<Float> ecgRawData) {
        if (ecgRawData != null) {
            int size = ecgRawData.size();
            double[] dArr = new double[size];
            for (int i = 0; i < size; i++) {
                dArr[i] = ecgRawData.get(i).floatValue();
            }
            return dArr;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
