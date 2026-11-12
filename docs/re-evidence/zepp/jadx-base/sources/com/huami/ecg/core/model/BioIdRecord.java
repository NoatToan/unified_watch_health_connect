package com.huami.ecg.core.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.gson.annotations.SerializedName;
import com.huami.ecg.core.db.entity.EcgData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\b\u001a\u00020\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\t\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/ecg/core/model/BioIdRecord;", "", "", "toString", "", "component1", "", "component2", EcgData.GROUP_ID, BioIdRecord.d, "copy", "hashCode", "other", "", "equals", "a", "J", "getGroupId", "()J", "b", LogUtil.I, "()I", "<init>", "(JI)V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class BioIdRecord {
    public static final int BIOID_MATCHED = 0;
    public static final int BIOID_SELECTED = 1;
    private static final String c = "transactionId";
    private static final String d = "isBioId";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(c)
    private final long groupId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(d)
    private final int isBioId;

    public BioIdRecord() {
        this(0L, 0, 3, null);
    }

    public BioIdRecord(long j, int i) {
        this.groupId = j;
        this.isBioId = i;
    }

    public static /* synthetic */ BioIdRecord copy$default(BioIdRecord bioIdRecord, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = bioIdRecord.groupId;
        }
        if ((i2 & 2) != 0) {
            i = bioIdRecord.isBioId;
        }
        return bioIdRecord.copy(j, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getIsBioId() {
        return this.isBioId;
    }

    @NotNull
    public final BioIdRecord copy(long groupId, int isBioId) {
        return new BioIdRecord(groupId, isBioId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioIdRecord)) {
            return false;
        }
        BioIdRecord bioIdRecord = (BioIdRecord) other;
        return this.groupId == bioIdRecord.groupId && this.isBioId == bioIdRecord.isBioId;
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public int hashCode() {
        long j = this.groupId;
        return (((int) (j ^ (j >>> 32))) * 31) + this.isBioId;
    }

    public final int isBioId() {
        return this.isBioId;
    }

    @NotNull
    public String toString() {
        return "EcgBioId mBioIdGroupId:" + this.groupId + ", isBioId:" + this.isBioId;
    }

    public /* synthetic */ BioIdRecord(long j, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? 0 : i);
    }
}
