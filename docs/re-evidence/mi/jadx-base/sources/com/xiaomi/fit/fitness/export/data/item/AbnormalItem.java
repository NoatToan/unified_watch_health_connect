package com.xiaomi.fit.fitness.export.data.item;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/item/AbnormalItem;", "Ljava/io/Serializable;", "time", "", "value", "", "<init>", "(JI)V", "getTime", "()J", "setTime", "(J)V", "getValue", "()I", "setValue", "(I)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AbnormalItem implements Serializable {

    @SerializedName("time")
    private long time;

    @SerializedName("value")
    private int value;

    public AbnormalItem(long j, int i) {
        this.time = j;
        this.value = i;
    }

    public static /* synthetic */ AbnormalItem copy$default(AbnormalItem abnormalItem, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = abnormalItem.time;
        }
        if ((i2 & 2) != 0) {
            i = abnormalItem.value;
        }
        return abnormalItem.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final AbnormalItem copy(long time, int value) {
        return new AbnormalItem(time, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbnormalItem)) {
            return false;
        }
        AbnormalItem abnormalItem = (AbnormalItem) other;
        return this.time == abnormalItem.time && this.value == abnormalItem.value;
    }

    public final long getTime() {
        return this.time;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.time) * 31) + Integer.hashCode(this.value);
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setValue(int i) {
        this.value = i;
    }

    @NotNull
    public String toString() {
        return "AbnormalItem(time=" + this.time + ", value=" + this.value + ")";
    }
}
