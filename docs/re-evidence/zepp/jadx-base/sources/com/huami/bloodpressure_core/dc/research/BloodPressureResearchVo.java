package com.huami.bloodpressure_core.dc.research;

import androidx.annotation.Keep;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b1\u00102J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003Jp\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b\"\u0010\u0004R\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b#\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b*\u0010)R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010+\u001a\u0004\b,\u0010-R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "", "", "component1", "()Ljava/lang/Long;", "component2", "component3", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureStatistics;", "component4", "", "component5", "component6", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;", "component7", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;", "component8", "dateBegin", "dateEnd", "joinTime", StatEvent.BF_OPERATION_STATICS_TYPE, "title", "description", "config", "attachData", "copy", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/huami/bloodpressure_core/dc/research/BloodPressureStatistics;Ljava/lang/String;Ljava/lang/String;Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;)Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchVo;", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/Long;", "getDateBegin", "getDateEnd", "getJoinTime", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureStatistics;", "getStatistics", "()Lcom/huami/bloodpressure_core/dc/research/BloodPressureStatistics;", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;", "getConfig", "()Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;", "Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;", "getAttachData", "()Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lcom/huami/bloodpressure_core/dc/research/BloodPressureStatistics;Ljava/lang/String;Ljava/lang/String;Lcom/huami/bloodpressure_core/dc/research/BloodPressureResearchConfig;Lcom/huami/bloodpressure_core/dc/research/BloodPressureAttachData;)V", "bloodpressure-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BloodPressureResearchVo {

    @Nullable
    private final BloodPressureAttachData attachData;

    @Nullable
    private final BloodPressureResearchConfig config;

    @Nullable
    private final Long dateBegin;

    @Nullable
    private final Long dateEnd;

    @Nullable
    private final String description;

    @Nullable
    private final Long joinTime;

    @Nullable
    private final BloodPressureStatistics statistics;

    @Nullable
    private final String title;

    public BloodPressureResearchVo(@Nullable Long l, @Nullable Long l2, @Nullable Long l3, @Nullable BloodPressureStatistics bloodPressureStatistics, @Nullable String str, @Nullable String str2, @Nullable BloodPressureResearchConfig bloodPressureResearchConfig, @Nullable BloodPressureAttachData bloodPressureAttachData) {
        this.dateBegin = l;
        this.dateEnd = l2;
        this.joinTime = l3;
        this.statistics = bloodPressureStatistics;
        this.title = str;
        this.description = str2;
        this.config = bloodPressureResearchConfig;
        this.attachData = bloodPressureAttachData;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getDateBegin() {
        return this.dateBegin;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Long getDateEnd() {
        return this.dateEnd;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Long getJoinTime() {
        return this.joinTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BloodPressureStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final BloodPressureResearchConfig getConfig() {
        return this.config;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final BloodPressureAttachData getAttachData() {
        return this.attachData;
    }

    @NotNull
    public final BloodPressureResearchVo copy(@Nullable Long dateBegin, @Nullable Long dateEnd, @Nullable Long joinTime, @Nullable BloodPressureStatistics statistics, @Nullable String title, @Nullable String description, @Nullable BloodPressureResearchConfig config, @Nullable BloodPressureAttachData attachData) {
        return new BloodPressureResearchVo(dateBegin, dateEnd, joinTime, statistics, title, description, config, attachData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodPressureResearchVo)) {
            return false;
        }
        BloodPressureResearchVo bloodPressureResearchVo = (BloodPressureResearchVo) other;
        return Intrinsics.areEqual(this.dateBegin, bloodPressureResearchVo.dateBegin) && Intrinsics.areEqual(this.dateEnd, bloodPressureResearchVo.dateEnd) && Intrinsics.areEqual(this.joinTime, bloodPressureResearchVo.joinTime) && Intrinsics.areEqual(this.statistics, bloodPressureResearchVo.statistics) && Intrinsics.areEqual(this.title, bloodPressureResearchVo.title) && Intrinsics.areEqual(this.description, bloodPressureResearchVo.description) && Intrinsics.areEqual(this.config, bloodPressureResearchVo.config) && Intrinsics.areEqual(this.attachData, bloodPressureResearchVo.attachData);
    }

    @Nullable
    public final BloodPressureAttachData getAttachData() {
        return this.attachData;
    }

    @Nullable
    public final BloodPressureResearchConfig getConfig() {
        return this.config;
    }

    @Nullable
    public final Long getDateBegin() {
        return this.dateBegin;
    }

    @Nullable
    public final Long getDateEnd() {
        return this.dateEnd;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Long getJoinTime() {
        return this.joinTime;
    }

    @Nullable
    public final BloodPressureStatistics getStatistics() {
        return this.statistics;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Long l = this.dateBegin;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.dateEnd;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.joinTime;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        BloodPressureStatistics bloodPressureStatistics = this.statistics;
        int iHashCode4 = (iHashCode3 + (bloodPressureStatistics == null ? 0 : bloodPressureStatistics.hashCode())) * 31;
        String str = this.title;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BloodPressureResearchConfig bloodPressureResearchConfig = this.config;
        int iHashCode7 = (iHashCode6 + (bloodPressureResearchConfig == null ? 0 : bloodPressureResearchConfig.hashCode())) * 31;
        BloodPressureAttachData bloodPressureAttachData = this.attachData;
        return iHashCode7 + (bloodPressureAttachData != null ? bloodPressureAttachData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BloodPressureResearchVo(dateBegin=" + this.dateBegin + ", dateEnd=" + this.dateEnd + ", joinTime=" + this.joinTime + ", statistics=" + this.statistics + ", title=" + this.title + ", description=" + this.description + ", config=" + this.config + ", attachData=" + this.attachData + ")";
    }
}
