package com.xiaomi.fitness.motionrecognize;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.unit.LengthUnit;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import com.xiaomi.fitness.migration.exercise.entity.IntensityDuration;
import com.xiaomi.fitness.motion.recognition.SceneType;
import com.xiaomi.fitness.steps.StepItem;
import defpackage.fg8;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0014\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ8\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007J0\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\b\b\u0001\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0017\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J(\u0010\u0018\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00152\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0019\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0015H\u0002J0\u0010\u001b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J0\u0010\u001c\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u001d\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J \u0010\u001e\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002J(\u0010\u001f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010 \u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010!\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0007H\u0002J(\u0010#\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010$\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0002J(\u0010#\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020\u0007H\u0002J\u0018\u0010'\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/xiaomi/fitness/motionrecognize/MiuiMotionCalculator;", "", "<init>", "()V", "TAG", "", "getDistance", "", DailyRecordKey.sportType, "", "stepCount", "duration", "", "heightInCm", "isMale", "", "getCalories", "weight", "getIntensityDuration", "Lcom/xiaomi/fitness/migration/exercise/entity/IntensityDuration;", "stepItemList", "", "Lcom/xiaomi/fitness/steps/StepItem;", "calculateWalkIntensityDuration", "calculateRunIntensityDuration", "calculateStairClimbIntensityDuration", "calculateRidingIntensityDuration", "calculateWalkConsume", "calculateRunConsume", "calculateStairClimbConsume", "calculateRidingConsume", "calculateWalkOrRunDistance", "calculateRidingDistance", "getPedalSpeed", "durationMinutes", "getStepSpeed", "getRidingSpeed", "minutes", "getStepFrequency", "getStrideLength", "getWalkStride", "stepCadence", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MiuiMotionCalculator {

    @NotNull
    public static final MiuiMotionCalculator INSTANCE = new MiuiMotionCalculator();

    @NotNull
    private static final String TAG = "MiuiMotionCalculator";

    private MiuiMotionCalculator() {
    }

    private final float calculateRidingConsume(int stepCount, long duration, float weight) {
        FitnessLogUtils.i(TAG, "calculateRidingConsume: stepCount = " + stepCount + ", duration = " + duration + ", weight = " + weight);
        float millis = ((float) duration) / ((float) TimeUnit.MINUTES.toMillis(1L));
        return (((((((float) Math.pow(getPedalSpeed(stepCount, millis), 2.0d)) / 67.0f) + 2) * 3.5f) * weight) / 200) * millis;
    }

    private final float calculateRidingDistance(int stepCount, long duration) {
        float f = duration;
        return (((getPedalSpeed(stepCount, f / TimeUnit.MINUTES.toMillis(1L)) * 1000) / 3600) * f) / TimeUnit.SECONDS.toMillis(1L);
    }

    private final IntensityDuration calculateRidingIntensityDuration(List<StepItem> stepItemList) {
        IntensityDuration intensityDuration = new IntensityDuration();
        if (ArrayUtils.isEmpty(stepItemList)) {
            return intensityDuration;
        }
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (StepItem stepItem : stepItemList) {
            Intrinsics.checkNotNull(stepItem);
            long endTime = stepItem.getEndTime() - stepItem.getBeginTime();
            int iPow = (int) ((Math.pow(getRidingSpeed(stepItem.getSteps(), endTime), 2.0d) / ((double) 67)) + ((double) 2));
            if (iPow < 3) {
                j += endTime;
            } else if (iPow < 6) {
                j2 += endTime;
            } else {
                j3 += endTime;
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        intensityDuration.e((int) timeUnit.toSeconds(j));
        intensityDuration.f((int) timeUnit.toSeconds(j2));
        intensityDuration.d((int) timeUnit.toSeconds(j3));
        return intensityDuration;
    }

    private final float calculateRunConsume(int stepCount, long duration, float heightInCm, boolean isMale, float weight) {
        if (heightInCm <= 0.0f) {
            return 0.0f;
        }
        return ((((getStepSpeed(stepCount, duration, heightInCm, isMale) * 0.2f) + 3.5f) * weight) / 200) * (duration / TimeUnit.MINUTES.toMillis(1L));
    }

    private final IntensityDuration calculateRunIntensityDuration(List<StepItem> stepItemList, float heightInCm, boolean isMale) {
        IntensityDuration intensityDuration = new IntensityDuration();
        if (!ArrayUtils.isEmpty(stepItemList) && heightInCm > 0.0f) {
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            for (StepItem stepItem : stepItemList) {
                Intrinsics.checkNotNull(stepItem);
                long endTime = stepItem.getEndTime() - stepItem.getBeginTime();
                int stepSpeed = (int) (((getStepSpeed(stepItem.getSteps(), endTime / TimeUnit.MINUTES.toMillis(1L), heightInCm, isMale) * 0.2f) + 3.5f) / 3.5f);
                if (stepSpeed < 3) {
                    j += endTime;
                } else if (stepSpeed < 6) {
                    j2 += endTime;
                } else {
                    j3 += endTime;
                }
            }
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            intensityDuration.e((int) timeUnit.toSeconds(j));
            intensityDuration.f((int) timeUnit.toSeconds(j2));
            intensityDuration.d((int) timeUnit.toSeconds(j3));
        }
        return intensityDuration;
    }

    private final float calculateStairClimbConsume(int stepCount, long duration, float weight) {
        float millis = duration / TimeUnit.MINUTES.toMillis(1L);
        float fB = fg8.b(stepCount, millis);
        return (((((0.2f * fB) + 3.5f) + (fB * 0.40698f)) * weight) / 200) * millis;
    }

    private final IntensityDuration calculateStairClimbIntensityDuration(List<StepItem> stepItemList) {
        IntensityDuration intensityDuration = new IntensityDuration();
        if (ArrayUtils.isEmpty(stepItemList)) {
            return intensityDuration;
        }
        Iterator<StepItem> it = stepItemList.iterator();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (it.hasNext()) {
            StepItem next = it.next();
            Intrinsics.checkNotNull(next);
            long endTime = next.getEndTime() - next.getBeginTime();
            float fB = fg8.b(next.getSteps(), endTime / TimeUnit.MINUTES.toMillis(1L));
            IntensityDuration intensityDuration2 = intensityDuration;
            Iterator<StepItem> it2 = it;
            int i = (int) ((((double) ((0.2f * fB) + 3.5f)) + (((double) fB) * 0.4069800090789795d)) / ((double) 3.5f));
            if (i < 3) {
                j += endTime;
            } else if (i < 6) {
                j2 += endTime;
            } else {
                j3 += endTime;
            }
            it = it2;
            intensityDuration = intensityDuration2;
        }
        IntensityDuration intensityDuration3 = intensityDuration;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        intensityDuration3.e((int) timeUnit.toSeconds(j));
        intensityDuration3.f((int) timeUnit.toSeconds(j2));
        intensityDuration3.d((int) timeUnit.toSeconds(j3));
        return intensityDuration3;
    }

    private final float calculateWalkConsume(int stepCount, long duration, float heightInCm, boolean isMale, float weight) {
        if (heightInCm <= 0.0f) {
            return 0.0f;
        }
        return ((((getStepSpeed(stepCount, duration, heightInCm, isMale) * 0.1f) + 3.5f) * weight) / 200) * (duration / TimeUnit.MINUTES.toMillis(1L));
    }

    private final IntensityDuration calculateWalkIntensityDuration(List<StepItem> stepItemList) {
        IntensityDuration intensityDuration = new IntensityDuration();
        if (ArrayUtils.isEmpty(stepItemList)) {
            return intensityDuration;
        }
        long j = 0;
        long j2 = 0;
        for (StepItem stepItem : stepItemList) {
            Intrinsics.checkNotNull(stepItem);
            long endTime = stepItem.getEndTime() - stepItem.getBeginTime();
            if (fg8.b(stepItem.getSteps(), endTime / TimeUnit.MINUTES.toMillis(1L)) < 100.0f) {
                j += endTime;
            } else {
                j2 += endTime;
            }
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        intensityDuration.e((int) timeUnit.toSeconds(j));
        intensityDuration.f((int) timeUnit.toSeconds(j2));
        return intensityDuration;
    }

    private final float calculateWalkOrRunDistance(int stepCount, long duration, float heightInCm, boolean isMale) {
        return (getStepSpeed(stepCount, duration, heightInCm, isMale) * duration) / TimeUnit.MINUTES.toMillis(1L);
    }

    private final float getPedalSpeed(int stepCount, float durationMinutes) {
        return (((getStepFrequency(stepCount, durationMinutes) * 1.625f) * 60) * 2.074f) / 1000;
    }

    private final float getRidingSpeed(int stepCount, long duration) {
        return MathKt__MathJVMKt.roundToInt(((((getStepFrequency(stepCount, duration / TimeUnit.MINUTES.toMillis(1L)) * 1.625f) * 60) * 2.074f) / 1000) * 10) / 10.0f;
    }

    private final float getStepFrequency(int stepCount, float minutes) {
        if (minutes <= 0.0f) {
            return 0.0f;
        }
        return stepCount / minutes;
    }

    private final float getStepSpeed(int stepCount, long duration, float heightInCm, boolean isMale) {
        float stepFrequency = getStepFrequency(stepCount, duration / TimeUnit.MINUTES.toMillis(1L));
        return stepFrequency * getWalkStride(stepFrequency, heightInCm, isMale);
    }

    private final float getStrideLength(float heightInCm, boolean isMale) {
        if (heightInCm > 0.0f) {
            return heightInCm * 0.42f;
        }
        return isMale ? 70.1f : 65.4f;
    }

    private final float getWalkStride(float stepCadence, float heightInCm, boolean isMale) {
        float meter = LengthUnit.CENTIMETER.toMeter(heightInCm);
        if (meter == 0.0f) {
            return 0.0f;
        }
        return (isMale ? 0.3139f : 0.2975f) * meter * ((float) Math.pow(stepCadence / TimeUnit.MINUTES.toSeconds(1L), 0.5d));
    }

    public final float getCalories(@SceneType int sportType, int stepCount, long duration, float heightInCm, boolean isMale, float weight) {
        if (sportType == 1) {
            return calculateRidingConsume(stepCount, duration, weight);
        }
        if (sportType == 2) {
            return calculateRunConsume(stepCount, duration, heightInCm, isMale, weight);
        }
        if (sportType == 3) {
            return calculateStairClimbConsume(stepCount, duration, weight);
        }
        if (sportType != 4) {
            return 0.0f;
        }
        return calculateWalkConsume(stepCount, duration, heightInCm, isMale, weight);
    }

    public final float getDistance(@SceneType int sportType, int stepCount, long duration, float heightInCm, boolean isMale) {
        if (sportType == 1) {
            return calculateRidingDistance(stepCount, duration);
        }
        if (sportType == 2 || sportType == 4) {
            return calculateWalkOrRunDistance(stepCount, duration, heightInCm, isMale);
        }
        return 0.0f;
    }

    @NotNull
    public final IntensityDuration getIntensityDuration(@NotNull List<StepItem> stepItemList, @SceneType int sportType, float heightInCm, boolean isMale) {
        Intrinsics.checkNotNullParameter(stepItemList, "stepItemList");
        if (sportType == 1) {
            return calculateRidingIntensityDuration(stepItemList);
        }
        if (sportType == 2) {
            return calculateRunIntensityDuration(stepItemList, heightInCm, isMale);
        }
        if (sportType != 3) {
            return sportType != 4 ? new IntensityDuration() : calculateWalkIntensityDuration(stepItemList);
        }
        return calculateStairClimbIntensityDuration(stepItemList);
    }

    private final float getStepSpeed(int stepCount, float minutes, float heightInCm, boolean isMale) {
        float stepFrequency = getStepFrequency(stepCount, minutes);
        return MathKt__MathJVMKt.roundToInt((stepFrequency * getWalkStride(stepFrequency, heightInCm, isMale)) * 10) / 10.0f;
    }
}
