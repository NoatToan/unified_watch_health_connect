package com.xiaomi.fitness.detail.video.share.model;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/model/MomentsModel;", "", "typeId", "", "value", "", "<init>", "(IF)V", "getTypeId", "()I", "getValue", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MomentsModel {
    private final int typeId;
    private final float value;

    public MomentsModel(int i, float f) {
        this.typeId = i;
        this.value = f;
    }

    public static /* synthetic */ MomentsModel copy$default(MomentsModel momentsModel, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = momentsModel.typeId;
        }
        if ((i2 & 2) != 0) {
            f = momentsModel.value;
        }
        return momentsModel.copy(i, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @NotNull
    public final MomentsModel copy(int typeId, float value) {
        return new MomentsModel(typeId, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MomentsModel)) {
            return false;
        }
        MomentsModel momentsModel = (MomentsModel) other;
        return this.typeId == momentsModel.typeId && Float.compare(this.value, momentsModel.value) == 0;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.typeId) * 31) + Float.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "MomentsModel(typeId=" + this.typeId + ", value=" + this.value + ")";
    }
}
