package com.xiaomi.fitness.motion.recognition.pressure;

import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010 \u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018R\u0011\u0010\"\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b#\u0010\u0018R\u0011\u0010$\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0011\u0010&\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b'\u0010\u0018R\u0011\u0010(\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b)\u0010\u0018R\u001b\u0010*\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegmentWrap;", "", "pressureSegment", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "<init>", "(Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;)V", DailyRecordKey.sportType, "", "getSportType", "()Ljava/lang/String;", "setSportType", "(Ljava/lang/String;)V", "startTime", "", "getStartTime", "()J", "setStartTime", "(J)V", "endTime", "getEndTime", "setEndTime", "startAltitude", "", "getStartAltitude", "()F", "setStartAltitude", "(F)V", "endAltitude", "getEndAltitude", "setEndAltitude", "altitudeDiff", "getAltitudeDiff", "totalUpAltitude", "getTotalUpAltitude", "totalDownAltitude", "getTotalDownAltitude", "pressureStart", "getPressureStart", "pressureEnd", "getPressureEnd", "pressureDiff", "getPressureDiff", "pressures", "", "Lcom/xiaomi/fitness/motion/recognition/pressure/AirPressure;", "getPressures", "()Ljava/util/List;", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PressureSegmentWrap {
    private float endAltitude;
    private long endTime;

    @NotNull
    private final PressureSegment pressureSegment;

    @Nullable
    private String sportType;
    private float startAltitude;
    private long startTime;

    public PressureSegmentWrap(@NotNull PressureSegment pressureSegment) {
        Intrinsics.checkNotNullParameter(pressureSegment, "pressureSegment");
        this.pressureSegment = pressureSegment;
    }

    public final float getAltitudeDiff() {
        return this.pressureSegment.getAltitudeDiff();
    }

    public final float getEndAltitude() {
        return this.endAltitude;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final float getPressureDiff() {
        return this.pressureSegment.getPressureDiff();
    }

    public final float getPressureEnd() {
        return this.pressureSegment.getPressureEnd();
    }

    public final float getPressureStart() {
        return this.pressureSegment.getPressureStart();
    }

    @Nullable
    public final List<AirPressure> getPressures() {
        return this.pressureSegment.getPressures();
    }

    @Nullable
    public final String getSportType() {
        return this.sportType;
    }

    public final float getStartAltitude() {
        return this.startAltitude;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final float getTotalDownAltitude() {
        return this.pressureSegment.getTotalDownAltitude();
    }

    public final float getTotalUpAltitude() {
        return this.pressureSegment.getTotalUpAltitude();
    }

    public final void setEndAltitude(float f) {
        this.endAltitude = f;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final void setSportType(@Nullable String str) {
        this.sportType = str;
    }

    public final void setStartAltitude(float f) {
        this.startAltitude = f;
    }

    public final void setStartTime(long j) {
        this.startTime = j;
    }
}
