package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\t\b\u0016¢\u0006\u0004\b\n\u0010\fJ\b\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020!H\u0016J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J;\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/TemperatureTrendItem;", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "time", "", "baseTemp", "", "baseLine", "diffTemp", "status", "", "<init>", "(JFFFI)V", "()V", "getTime", "()J", "setTime", "(J)V", "getBaseTemp", "()F", "setBaseTemp", "(F)V", "getBaseLine", "setBaseLine", "getDiffTemp", "setDiffTemp", "getStatus", "()I", "setStatus", "(I)V", "getTimestamp", "setTimestamp", "", "toString", "", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TemperatureTrendItem extends DailyRecordItem {

    @SerializedName("base_line")
    private float baseLine;

    @SerializedName("base_temp")
    private float baseTemp;

    @SerializedName("diff_temp")
    private float diffTemp;

    @SerializedName("status")
    private int status;

    @SerializedName("time")
    private long time;

    public TemperatureTrendItem(long j, float f, float f2, float f3, int i) {
        super(null);
        this.time = j;
        this.baseTemp = f;
        this.baseLine = f2;
        this.diffTemp = f3;
        this.status = i;
    }

    public static /* synthetic */ TemperatureTrendItem copy$default(TemperatureTrendItem temperatureTrendItem, long j, float f, float f2, float f3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = temperatureTrendItem.time;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            f = temperatureTrendItem.baseTemp;
        }
        float f4 = f;
        if ((i2 & 4) != 0) {
            f2 = temperatureTrendItem.baseLine;
        }
        float f5 = f2;
        if ((i2 & 8) != 0) {
            f3 = temperatureTrendItem.diffTemp;
        }
        float f6 = f3;
        if ((i2 & 16) != 0) {
            i = temperatureTrendItem.status;
        }
        return temperatureTrendItem.copy(j2, f4, f5, f6, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getBaseTemp() {
        return this.baseTemp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getBaseLine() {
        return this.baseLine;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final float getDiffTemp() {
        return this.diffTemp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    @NotNull
    public final TemperatureTrendItem copy(long time, float baseTemp, float baseLine, float diffTemp, int status) {
        return new TemperatureTrendItem(time, baseTemp, baseLine, diffTemp, status);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TemperatureTrendItem)) {
            return false;
        }
        TemperatureTrendItem temperatureTrendItem = (TemperatureTrendItem) other;
        return this.time == temperatureTrendItem.time && Float.compare(this.baseTemp, temperatureTrendItem.baseTemp) == 0 && Float.compare(this.baseLine, temperatureTrendItem.baseLine) == 0 && Float.compare(this.diffTemp, temperatureTrendItem.diffTemp) == 0 && this.status == temperatureTrendItem.status;
    }

    public final float getBaseLine() {
        return this.baseLine;
    }

    public final float getBaseTemp() {
        return this.baseTemp;
    }

    public final float getDiffTemp() {
        return this.diffTemp;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public long getTimestamp() {
        return this.time;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.time) * 31) + Float.hashCode(this.baseTemp)) * 31) + Float.hashCode(this.baseLine)) * 31) + Float.hashCode(this.diffTemp)) * 31) + Integer.hashCode(this.status);
    }

    public final void setBaseLine(float f) {
        this.baseLine = f;
    }

    public final void setBaseTemp(float f) {
        this.baseTemp = f;
    }

    public final void setDiffTemp(float f) {
        this.diffTemp = f;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.xiaomi.fit.fitness.export.data.ITimeData
    public void setTimestamp(long time) {
        this.time = time;
    }

    @NotNull
    public String toString() {
        return "TemperatureTrendItem(time=" + this.time + ", baseTemp=" + this.baseTemp + ", baseLine=" + this.baseLine + ", diffTemp=" + this.diffTemp + ", status=" + this.status + ")";
    }

    public TemperatureTrendItem() {
        this(0L, 0.0f, 0.0f, 0.0f, 0);
    }
}
