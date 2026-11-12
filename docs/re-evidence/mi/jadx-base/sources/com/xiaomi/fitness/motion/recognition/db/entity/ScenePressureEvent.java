package com.xiaomi.fitness.motion.recognition.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Entity(indices = {@Index(name = "scene_pressure_event_index", unique = true, value = {"time", "pressure"})}, tableName = "scene_pressure_event")
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/fitness/motion/recognition/db/entity/ScenePressureEvent;", "", "<init>", "()V", "id", "", "getId", "()J", "setId", "(J)V", "time", "getTime", "setTime", "pressure", "", "getPressure", "()F", "setPressure", "(F)V", "motion-recognition_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScenePressureEvent {

    @PrimaryKey(autoGenerate = true)
    private long id;

    @ColumnInfo(name = "pressure")
    private float pressure;

    @ColumnInfo(name = "time")
    private long time;

    public final long getId() {
        return this.id;
    }

    public final float getPressure() {
        return this.pressure;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setId(long j) {
        this.id = j;
    }

    public final void setPressure(float f) {
        this.pressure = f;
    }

    public final void setTime(long j) {
        this.time = j;
    }
}
