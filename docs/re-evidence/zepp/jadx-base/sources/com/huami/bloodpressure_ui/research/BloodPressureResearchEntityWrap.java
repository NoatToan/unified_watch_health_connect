package com.huami.bloodpressure_ui.research;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u001f\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodpressure_ui/research/BloodPressureResearchEntityWrap;", "", "", "component1", "Lcom/huami/bloodpressure_ui/research/BloodPressureResearchEntity;", "component2", "show", "bloodPressureResearchEntity", "copy", "", "toString", "", "hashCode", "other", "equals", "Z", "getShow", "()Z", "Lcom/huami/bloodpressure_ui/research/BloodPressureResearchEntity;", "getBloodPressureResearchEntity", "()Lcom/huami/bloodpressure_ui/research/BloodPressureResearchEntity;", "<init>", "(ZLcom/huami/bloodpressure_ui/research/BloodPressureResearchEntity;)V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureResearchEntityWrap {

    @Nullable
    private final BloodPressureResearchEntity bloodPressureResearchEntity;
    private final boolean show;

    public BloodPressureResearchEntityWrap(boolean z, @Nullable BloodPressureResearchEntity bloodPressureResearchEntity) {
        this.show = z;
        this.bloodPressureResearchEntity = bloodPressureResearchEntity;
    }

    public static /* synthetic */ BloodPressureResearchEntityWrap copy$default(BloodPressureResearchEntityWrap bloodPressureResearchEntityWrap, boolean z, BloodPressureResearchEntity bloodPressureResearchEntity, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bloodPressureResearchEntityWrap.show;
        }
        if ((i & 2) != 0) {
            bloodPressureResearchEntity = bloodPressureResearchEntityWrap.bloodPressureResearchEntity;
        }
        return bloodPressureResearchEntityWrap.copy(z, bloodPressureResearchEntity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BloodPressureResearchEntity getBloodPressureResearchEntity() {
        return this.bloodPressureResearchEntity;
    }

    @NotNull
    public final BloodPressureResearchEntityWrap copy(boolean show, @Nullable BloodPressureResearchEntity bloodPressureResearchEntity) {
        return new BloodPressureResearchEntityWrap(show, bloodPressureResearchEntity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureResearchEntityWrap)) {
            return false;
        }
        BloodPressureResearchEntityWrap bloodPressureResearchEntityWrap = (BloodPressureResearchEntityWrap) other;
        return this.show == bloodPressureResearchEntityWrap.show && Intrinsics.areEqual(this.bloodPressureResearchEntity, bloodPressureResearchEntityWrap.bloodPressureResearchEntity);
    }

    @Nullable
    public final BloodPressureResearchEntity getBloodPressureResearchEntity() {
        return this.bloodPressureResearchEntity;
    }

    public final boolean getShow() {
        return this.show;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.show;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        BloodPressureResearchEntity bloodPressureResearchEntity = this.bloodPressureResearchEntity;
        return i + (bloodPressureResearchEntity == null ? 0 : bloodPressureResearchEntity.hashCode());
    }

    @NotNull
    public String toString() {
        return "BloodPressureResearchEntityWrap(show=" + this.show + ", bloodPressureResearchEntity=" + this.bloodPressureResearchEntity + ")";
    }
}
