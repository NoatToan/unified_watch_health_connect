package com.xiaomi.wearable.gpsalgorithm.utils;

import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/wearable/gpsalgorithm/utils/ActivityIntensity;", "", "<init>", "()V", "activityIntensityHr", "", "activityIntensityHrBase", "activityStepRate", "activityStepRateBase", "buildActivityIntensity", "", "maxHrm", "", "hrRate", "stepRate", "getSportStrength", "Companion", "fitness-sport-algorithm_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActivityIntensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityIntensity.kt\ncom/xiaomi/wearable/gpsalgorithm/utils/ActivityIntensity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class ActivityIntensity {
    public static final int HIGH_STRENGTH = 3;
    public static final int LOW_STRENGTH = 2;

    @NotNull
    public static final String TAG = "ActivityIntensityUtils";
    private float activityIntensityHr;
    private float activityIntensityHrBase;
    private float activityStepRate;
    private float activityStepRateBase;

    public static /* synthetic */ void buildActivityIntensity$default(ActivityIntensity activityIntensity, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        activityIntensity.buildActivityIntensity(i, i2, i3);
    }

    public final void buildActivityIntensity(int maxHrm, int hrRate, int stepRate) {
        FitnessLogUtils.d(TAG, "buildActivityIntensity, maxHrm: " + maxHrm + ", hrRate:" + hrRate + ", stepRate: " + stepRate);
        this.activityIntensityHrBase = this.activityIntensityHrBase + 1.0f;
        if (maxHrm * 0.64f < hrRate) {
            this.activityIntensityHr += 1.0f;
        }
        if (stepRate > 100) {
            this.activityStepRate += 1.0f;
        }
        this.activityStepRateBase += 1.0f;
    }

    public final int getSportStrength() {
        float f = this.activityIntensityHrBase;
        if (f > 30.0f && this.activityIntensityHr / f > 0.5f) {
            FitnessLogUtils.i(TAG, "SportStrength == 3, activityIntensityHr : " + this.activityIntensityHr + ",activityIntensityHrBase : " + this.activityIntensityHrBase);
            return 3;
        }
        float f2 = this.activityStepRateBase;
        if (f2 <= 30.0f || this.activityStepRate / f2 <= 0.5f) {
            FitnessLogUtils.i(TAG, "SportStrength == 2");
            float f3 = 0;
            this.activityIntensityHrBase = f3;
            this.activityStepRate = f3;
            this.activityIntensityHr = f3;
            this.activityStepRateBase = f3;
            return 2;
        }
        FitnessLogUtils.i(TAG, "SportStrength == 3, activityStepRate : " + this.activityStepRate + ", activityStepRateBase : " + this.activityStepRateBase);
        return 3;
    }
}
