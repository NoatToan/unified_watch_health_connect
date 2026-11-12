package com.xiaomi.hm.health.traininglib.util;

import com.xiaomi.hm.health.baseutil.DecimalUtil;
import com.xiaomi.hm.health.traininglib.model.TrainerInfo;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes22.dex */
public class TrainerUtil {
    private static final float[] a = {17.4f, 18.1f, 18.9f, 19.6f, 20.3f, 21.0f, 21.9f, 22.6f, 23.1f, 23.5f, 23.8f, 24.0f};
    private static final float[] b = {19.2f, 20.3f, 21.4f, 22.5f, 23.6f, 24.7f, 25.7f, 26.4f, 26.9f, 27.4f, 27.8f, 28.0f};
    private static final float[] c = {17.2f, 18.1f, 19.0f, 20.0f, 21.1f, 21.9f, 22.6f, 23.0f, 23.4f, 23.7f, 23.8f, 24.0f};
    private static final float[] d = {18.9f, 19.9f, 21.0f, 22.1f, 23.3f, 24.5f, 25.6f, 26.3f, 26.9f, 27.4f, 27.7f, 28.0f};
    private static final float e = 18.5f;
    private static final float f = 24.0f;
    private static final float g = 28.0f;

    private static float a(int i, float f2) {
        float f3 = i / 100.0f;
        return b((i <= 0 || f2 <= 0.0f) ? -1.0f : f2 / (f3 * f3));
    }

    private static float b(float f2) {
        return new BigDecimal(DecimalUtil.floatToStr(Float.valueOf(f2))).setScale(1, 1).floatValue();
    }

    private static String c(float f2, int i, int i2) {
        if (i < 0 || i >= 7) {
            if (i < 7 || i >= 18) {
                if (i >= 18) {
                    if (f2 > 0.0f) {
                        if (f2 < 18.5f) {
                            return TrainingConstant.BodyFigure.BODY_THIN;
                        }
                        if (f2 >= 24.0f) {
                            if (f2 < 28.0f) {
                                return TrainingConstant.BodyFigure.BODY_FAT;
                            }
                            return TrainingConstant.BodyFigure.BODY_TOO_FAT;
                        }
                    }
                }
                return "NORMAL";
            }
            if (i2 == TrainingConstant.GENDER_MALE) {
                float[] fArr = a;
                int i3 = i - 7;
                if (f2 >= fArr[i3]) {
                    if (f2 >= fArr[i3] && f2 < b[i3]) {
                        return TrainingConstant.BodyFigure.BODY_FAT;
                    }
                    return TrainingConstant.BodyFigure.BODY_TOO_FAT;
                }
                return "NORMAL";
            }
            if (i2 == TrainingConstant.GENDER_FEMALE) {
                float[] fArr2 = c;
                int i4 = i - 7;
                if (f2 >= fArr2[i4]) {
                    if (f2 >= fArr2[i4] && f2 < d[i4]) {
                        return TrainingConstant.BodyFigure.BODY_FAT;
                    }
                    return TrainingConstant.BodyFigure.BODY_TOO_FAT;
                }
                return "NORMAL";
            }
        }
        return "";
    }

    public static String getTrainerBodyState(TrainerInfo trainerInfo) {
        return c(a(trainerInfo.height, trainerInfo.weight), trainerInfo.age, trainerInfo.gender);
    }
}
