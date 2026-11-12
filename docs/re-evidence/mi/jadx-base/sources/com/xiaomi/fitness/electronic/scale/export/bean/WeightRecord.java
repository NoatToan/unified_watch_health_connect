package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/WeightRecord;", "Ljava/io/Serializable;", "id", "", "createTime", "", "weight", "", "<init>", "(ILjava/lang/String;F)V", "getId", "()I", "setId", "(I)V", "getCreateTime", "()Ljava/lang/String;", "setCreateTime", "(Ljava/lang/String;)V", "getWeight", "()F", "setWeight", "(F)V", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WeightRecord implements Serializable {

    @NotNull
    private String createTime;
    private int id;
    private float weight;

    public WeightRecord(int i, @NotNull String createTime, float f) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        this.id = i;
        this.createTime = createTime;
        this.weight = f;
    }

    public static /* synthetic */ WeightRecord copy$default(WeightRecord weightRecord, int i, String str, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = weightRecord.id;
        }
        if ((i2 & 2) != 0) {
            str = weightRecord.createTime;
        }
        if ((i2 & 4) != 0) {
            f = weightRecord.weight;
        }
        return weightRecord.copy(i, str, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public final WeightRecord copy(int id, @NotNull String createTime, float weight) {
        Intrinsics.checkNotNullParameter(createTime, "createTime");
        return new WeightRecord(id, createTime, weight);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightRecord)) {
            return false;
        }
        WeightRecord weightRecord = (WeightRecord) other;
        return this.id == weightRecord.id && Intrinsics.areEqual(this.createTime, weightRecord.createTime) && Float.compare(this.weight, weightRecord.weight) == 0;
    }

    @NotNull
    public final String getCreateTime() {
        return this.createTime;
    }

    public final int getId() {
        return this.id;
    }

    public final float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.createTime.hashCode()) * 31) + Float.hashCode(this.weight);
    }

    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.createTime = str;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public String toString() {
        return "WeightRecord(id=" + this.id + ", createTime=" + this.createTime + ", weight=" + this.weight + ")";
    }

    public /* synthetic */ WeightRecord(int i, String str, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, f);
    }
}
