package com.xiaomi.fitness.active.pk.export.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/active/pk/export/entity/EntranceModel;", "", "pkRecordInfo", "Lcom/xiaomi/fitness/active/pk/export/entity/EntrancePkRecordInfo;", "pkCount", "", "<init>", "(Lcom/xiaomi/fitness/active/pk/export/entity/EntrancePkRecordInfo;I)V", "getPkRecordInfo", "()Lcom/xiaomi/fitness/active/pk/export/entity/EntrancePkRecordInfo;", "getPkCount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "active-pk-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EntranceModel {
    private final int pkCount;

    @Nullable
    private final EntrancePkRecordInfo pkRecordInfo;

    public EntranceModel(@Nullable EntrancePkRecordInfo entrancePkRecordInfo, int i) {
        this.pkRecordInfo = entrancePkRecordInfo;
        this.pkCount = i;
    }

    public static /* synthetic */ EntranceModel copy$default(EntranceModel entranceModel, EntrancePkRecordInfo entrancePkRecordInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            entrancePkRecordInfo = entranceModel.pkRecordInfo;
        }
        if ((i2 & 2) != 0) {
            i = entranceModel.pkCount;
        }
        return entranceModel.copy(entrancePkRecordInfo, i);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EntrancePkRecordInfo getPkRecordInfo() {
        return this.pkRecordInfo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPkCount() {
        return this.pkCount;
    }

    @NotNull
    public final EntranceModel copy(@Nullable EntrancePkRecordInfo pkRecordInfo, int pkCount) {
        return new EntranceModel(pkRecordInfo, pkCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntranceModel)) {
            return false;
        }
        EntranceModel entranceModel = (EntranceModel) other;
        return Intrinsics.areEqual(this.pkRecordInfo, entranceModel.pkRecordInfo) && this.pkCount == entranceModel.pkCount;
    }

    public final int getPkCount() {
        return this.pkCount;
    }

    @Nullable
    public final EntrancePkRecordInfo getPkRecordInfo() {
        return this.pkRecordInfo;
    }

    public int hashCode() {
        EntrancePkRecordInfo entrancePkRecordInfo = this.pkRecordInfo;
        return ((entrancePkRecordInfo == null ? 0 : entrancePkRecordInfo.hashCode()) * 31) + Integer.hashCode(this.pkCount);
    }

    @NotNull
    public String toString() {
        return "EntranceModel(pkRecordInfo=" + this.pkRecordInfo + ", pkCount=" + this.pkCount + ")";
    }
}
