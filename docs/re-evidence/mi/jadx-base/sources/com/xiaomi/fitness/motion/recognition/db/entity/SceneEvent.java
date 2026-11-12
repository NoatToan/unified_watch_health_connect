package com.xiaomi.fitness.motion.recognition.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.fitness.motion.recognition.SceneType;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index(name = "scene_event_index", unique = true, value = {"scene_time", "scene_type"})}, tableName = "scene_event")
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020\u000eH\u0016J\b\u0010!\u001a\u00020\"H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR$\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/entity/SceneEvent;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", "sceneTime", "getSceneTime", "setSceneTime", "sceneType", "", "getSceneType$annotations", "getSceneType", "()I", "setSceneType", "(I)V", "sceneAccuracy", "", "getSceneAccuracy", "()F", "setSceneAccuracy", "(F)V", "scenePressure", "getScenePressure", "setScenePressure", "equals", "", "other", "hashCode", "toString", "", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneEvent {

    @SerializedName("id")
    @PrimaryKey(autoGenerate = true)
    private long id;

    @SerializedName("scene_accuracy")
    @ColumnInfo(name = "scene_accuracy")
    private float sceneAccuracy;

    @SerializedName("scene_pressure")
    @ColumnInfo(name = "scene_pressure")
    private float scenePressure;

    @SerializedName("scene_time")
    @ColumnInfo(name = "scene_time")
    private long sceneTime;

    @SerializedName("scene_type")
    @ColumnInfo(name = "scene_type")
    private int sceneType;

    @SceneType
    public static /* synthetic */ void getSceneType$annotations() {
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(SceneEvent.class, other.getClass())) {
            return false;
        }
        SceneEvent sceneEvent = (SceneEvent) other;
        return this.id == sceneEvent.id && this.sceneType == sceneEvent.sceneType && this.sceneTime == sceneEvent.sceneTime && Float.compare(sceneEvent.sceneAccuracy, this.sceneAccuracy) == 0 && Float.compare(sceneEvent.scenePressure, this.scenePressure) == 0;
    }

    public final long getId() {
        return this.id;
    }

    public final float getSceneAccuracy() {
        return this.sceneAccuracy;
    }

    public final float getScenePressure() {
        return this.scenePressure;
    }

    public final long getSceneTime() {
        return this.sceneTime;
    }

    public final int getSceneType() {
        return this.sceneType;
    }

    public int hashCode() {
        return Objects.hash(Long.valueOf(this.id), Integer.valueOf(this.sceneType), Long.valueOf(this.sceneTime), Float.valueOf(this.sceneAccuracy), Float.valueOf(this.scenePressure));
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setSceneAccuracy(float f) {
        this.sceneAccuracy = f;
    }

    public final void setScenePressure(float f) {
        this.scenePressure = f;
    }

    public final void setSceneTime(long j) {
        this.sceneTime = j;
    }

    public final void setSceneType(int i) {
        this.sceneType = i;
    }

    @NotNull
    public String toString() {
        return "SceneEvent(id=" + this.id + ", sceneTime=" + this.sceneTime + ", sceneType=" + this.sceneType + ", sceneAccuracy=" + this.sceneAccuracy + ", scenePressure=" + this.scenePressure + ")";
    }
}
