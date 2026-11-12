package com.huami.bloodpressure_core.dc.research;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0018"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;", "", "", "", "component1", "", "component2", "()Ljava/lang/Boolean;", "initiator", "onlineFlag", "copy", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;", "toString", "", "hashCode", "other", "equals", "Ljava/util/List;", "getInitiator", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getOnlineFlag", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureResearchConfig {

    @Nullable
    private final List<String> initiator;

    @Nullable
    private final Boolean onlineFlag;

    public BloodPressureResearchConfig(@Nullable List<String> list, @Nullable Boolean bool) {
        this.initiator = list;
        this.onlineFlag = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BloodPressureResearchConfig copy$default(BloodPressureResearchConfig bloodPressureResearchConfig, List list, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bloodPressureResearchConfig.initiator;
        }
        if ((i & 2) != 0) {
            bool = bloodPressureResearchConfig.onlineFlag;
        }
        return bloodPressureResearchConfig.copy(list, bool);
    }

    @Nullable
    public final List<String> component1() {
        return this.initiator;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getOnlineFlag() {
        return this.onlineFlag;
    }

    @NotNull
    public final BloodPressureResearchConfig copy(@Nullable List<String> initiator, @Nullable Boolean onlineFlag) {
        return new BloodPressureResearchConfig(initiator, onlineFlag);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureResearchConfig)) {
            return false;
        }
        BloodPressureResearchConfig bloodPressureResearchConfig = (BloodPressureResearchConfig) other;
        return Intrinsics.areEqual(this.initiator, bloodPressureResearchConfig.initiator) && Intrinsics.areEqual(this.onlineFlag, bloodPressureResearchConfig.onlineFlag);
    }

    @Nullable
    public final List<String> getInitiator() {
        return this.initiator;
    }

    @Nullable
    public final Boolean getOnlineFlag() {
        return this.onlineFlag;
    }

    public int hashCode() {
        List<String> list = this.initiator;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.onlineFlag;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BloodPressureResearchConfig(initiator=" + this.initiator + ", onlineFlag=" + this.onlineFlag + ")";
    }
}
