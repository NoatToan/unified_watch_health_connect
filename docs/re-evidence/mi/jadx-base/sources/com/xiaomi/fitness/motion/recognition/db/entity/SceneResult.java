package com.xiaomi.fitness.motion.recognition.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fitness.motion.recognition.SceneType;
import com.xiaomi.fitness.motion.recognition.pressure.PressureSegment;
import com.xiaomi.fitness.statistics.StatConstants;
import defpackage.deo;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index(name = "scene_result_index", unique = true, value = {StatConstants.PARAM_START, "act_type"})}, tableName = "scene_result")
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b>\u0010\u001cJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R(\u0010\u0016\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u0010\"\u0004\b\u001f\u0010\u0012R\"\u0010 \u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u000e\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\"\u0010#\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\u001aR\"\u0010&\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010'\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R*\u00106\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0011\u0010=\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b<\u0010\u0010¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "id", "J", "getId", "()J", "setId", "(J)V", StatConstants.PARAM_START, "getStart", "setStart", "actType", "I", "getActType", "setActType", "(I)V", "getActType$annotations", "()V", "continued", "getContinued", "setContinued", StatConstants.PARAM_END, "getEnd", "setEnd", "stepCount", "getStepCount", "setStepCount", FitnessDBConstants.COL_IS_SLEEP_COMPLETE, "Z", "()Z", "setComplete", "(Z)V", "isPossible", "setPossible", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "pressureSegment", "Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "getPressureSegment", "()Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;", "setPressureSegment", "(Lcom/xiaomi/fitness/motion/recognition/pressure/PressureSegment;)V", "", "Ldeo;", "stepEntities", "Ljava/util/List;", "getStepEntities", "()Ljava/util/List;", "setStepEntities", "(Ljava/util/List;)V", "getDuration", "duration", "<init>", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SceneResult {

    @SerializedName("actType")
    @ColumnInfo(name = "act_type")
    private int actType;

    @SerializedName("continued")
    @ColumnInfo(name = "continue")
    private long continued;

    @SerializedName(StatConstants.PARAM_END)
    @ColumnInfo(name = StatConstants.PARAM_END)
    private long end;

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("complete")
    @ColumnInfo(name = "complete")
    private boolean isComplete;

    @SerializedName("possible")
    @ColumnInfo(name = "possible")
    private boolean isPossible;

    @SerializedName("pressure_segment")
    @ColumnInfo(name = "pressure_segment")
    @Nullable
    private PressureSegment pressureSegment;

    @SerializedName(StatConstants.PARAM_START)
    @ColumnInfo(name = StatConstants.PARAM_START)
    private long start;

    @SerializedName("step_count")
    @ColumnInfo(name = "step_count")
    private int stepCount;

    @Nullable
    private List<? extends deo> stepEntities;

    @SceneType
    public static /* synthetic */ void getActType$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(SceneResult.class, other.getClass())) {
            return false;
        }
        SceneResult sceneResult = (SceneResult) other;
        return this.id == sceneResult.id && this.start == sceneResult.start && this.actType == sceneResult.actType && this.continued == sceneResult.continued && this.end == sceneResult.end && this.stepCount == sceneResult.stepCount && this.isComplete == sceneResult.isComplete;
    }

    public final int getActType() {
        return this.actType;
    }

    public final long getContinued() {
        return this.continued;
    }

    public final long getDuration() {
        return this.end - this.start;
    }

    public final long getEnd() {
        return this.end;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final PressureSegment getPressureSegment() {
        return this.pressureSegment;
    }

    public final long getStart() {
        return this.start;
    }

    public final int getStepCount() {
        return this.stepCount;
    }

    @Nullable
    public final List<deo> getStepEntities() {
        return this.stepEntities;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), Long.valueOf(this.start), Integer.valueOf(this.actType), Long.valueOf(this.continued), Long.valueOf(this.end), Integer.valueOf(this.stepCount), Boolean.valueOf(this.isComplete));
    }

    /* JADX INFO: renamed from: isComplete, reason: from getter */
    public final boolean getIsComplete() {
        return this.isComplete;
    }

    /* JADX INFO: renamed from: isPossible, reason: from getter */
    public final boolean getIsPossible() {
        return this.isPossible;
    }

    public final void setActType(int i) {
        this.actType = i;
    }

    public final void setComplete(boolean z) {
        this.isComplete = z;
    }

    public final void setContinued(long j) {
        this.continued = j;
    }

    public final void setEnd(long j) {
        this.end = j;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setPossible(boolean z) {
        this.isPossible = z;
    }

    public final void setPressureSegment(@Nullable PressureSegment pressureSegment) {
        this.pressureSegment = pressureSegment;
    }

    public final void setStart(long j) {
        this.start = j;
    }

    public final void setStepCount(int i) {
        this.stepCount = i;
    }

    public final void setStepEntities(@Nullable List<? extends deo> list) {
        this.stepEntities = list;
    }

    @NotNull
    public String toString() {
        return "SceneResult(id=" + this.id + ", start=" + this.start + ", actType=" + this.actType + ", continued=" + this.continued + ", end=" + this.end + ", stepCount=" + this.stepCount + ", isComplete=" + this.isComplete + ", isPossible=" + this.isPossible + ", pressureSegment=" + this.pressureSegment + ", stepEntities=" + this.stepEntities + ")";
    }
}
