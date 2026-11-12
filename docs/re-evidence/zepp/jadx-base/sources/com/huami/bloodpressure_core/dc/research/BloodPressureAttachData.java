package com.huami.bloodpressure_core.dc.research;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;", "", "", "component1", "()Ljava/lang/Boolean;", "uploadSwitch", "copy", "(Ljava/lang/Boolean;)Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getUploadSwitch", "<init>", "(Ljava/lang/Boolean;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureAttachData {

    @Nullable
    private final Boolean uploadSwitch;

    public BloodPressureAttachData(@Nullable Boolean bool) {
        this.uploadSwitch = bool;
    }

    public static /* synthetic */ BloodPressureAttachData copy$default(BloodPressureAttachData bloodPressureAttachData, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = bloodPressureAttachData.uploadSwitch;
        }
        return bloodPressureAttachData.copy(bool);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getUploadSwitch() {
        return this.uploadSwitch;
    }

    @NotNull
    public final BloodPressureAttachData copy(@Nullable Boolean uploadSwitch) {
        return new BloodPressureAttachData(uploadSwitch);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BloodPressureAttachData) && Intrinsics.areEqual(this.uploadSwitch, ((BloodPressureAttachData) other).uploadSwitch);
    }

    @Nullable
    public final Boolean getUploadSwitch() {
        return this.uploadSwitch;
    }

    public int hashCode() {
        Boolean bool = this.uploadSwitch;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @NotNull
    public String toString() {
        return "BloodPressureAttachData(uploadSwitch=" + this.uploadSwitch + ")";
    }
}
