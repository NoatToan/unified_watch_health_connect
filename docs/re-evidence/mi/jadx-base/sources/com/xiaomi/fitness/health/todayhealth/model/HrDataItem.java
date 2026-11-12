package com.xiaomi.fitness.health.todayhealth.model;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/model/HrDataItem;", "Ljava/io/Serializable;", "dataValue", "", "dataTime", "", "<init>", "(FI)V", "getDataValue", "()F", "getDataTime", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class HrDataItem implements Serializable {
    private final int dataTime;
    private final float dataValue;

    public HrDataItem(float f, int i) {
        this.dataValue = f;
        this.dataTime = i;
    }

    public static /* synthetic */ HrDataItem copy$default(HrDataItem hrDataItem, float f, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = hrDataItem.dataValue;
        }
        if ((i2 & 2) != 0) {
            i = hrDataItem.dataTime;
        }
        return hrDataItem.copy(f, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getDataValue() {
        return this.dataValue;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDataTime() {
        return this.dataTime;
    }

    @NotNull
    public final HrDataItem copy(float dataValue, int dataTime) {
        return new HrDataItem(dataValue, dataTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HrDataItem)) {
            return false;
        }
        HrDataItem hrDataItem = (HrDataItem) other;
        return Float.compare(this.dataValue, hrDataItem.dataValue) == 0 && this.dataTime == hrDataItem.dataTime;
    }

    public final int getDataTime() {
        return this.dataTime;
    }

    public final float getDataValue() {
        return this.dataValue;
    }

    public int hashCode() {
        return (Float.hashCode(this.dataValue) * 31) + Integer.hashCode(this.dataTime);
    }

    @NotNull
    public String toString() {
        return "HrDataItem(dataValue=" + this.dataValue + ", dataTime=" + this.dataTime + ")";
    }
}
