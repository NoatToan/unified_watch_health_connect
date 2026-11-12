package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/SummaryResultList;", "", "resultList", "", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/GetUploadUrl;", "compliance", "", "<init>", "(Ljava/util/List;I)V", "getResultList", "()Ljava/util/List;", "getCompliance", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SummaryResultList {
    private final int compliance;

    @SerializedName("abstract_ret_list")
    @NotNull
    private final List<GetUploadUrl> resultList;

    public SummaryResultList(@NotNull List<GetUploadUrl> resultList, int i) {
        Intrinsics.checkNotNullParameter(resultList, "resultList");
        this.resultList = resultList;
        this.compliance = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SummaryResultList copy$default(SummaryResultList summaryResultList, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = summaryResultList.resultList;
        }
        if ((i2 & 2) != 0) {
            i = summaryResultList.compliance;
        }
        return summaryResultList.copy(list, i);
    }

    @NotNull
    public final List<GetUploadUrl> component1() {
        return this.resultList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCompliance() {
        return this.compliance;
    }

    @NotNull
    public final SummaryResultList copy(@NotNull List<GetUploadUrl> resultList, int compliance) {
        Intrinsics.checkNotNullParameter(resultList, "resultList");
        return new SummaryResultList(resultList, compliance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SummaryResultList)) {
            return false;
        }
        SummaryResultList summaryResultList = (SummaryResultList) other;
        return Intrinsics.areEqual(this.resultList, summaryResultList.resultList) && this.compliance == summaryResultList.compliance;
    }

    public final int getCompliance() {
        return this.compliance;
    }

    @NotNull
    public final List<GetUploadUrl> getResultList() {
        return this.resultList;
    }

    public int hashCode() {
        return (this.resultList.hashCode() * 31) + Integer.hashCode(this.compliance);
    }

    @NotNull
    public String toString() {
        return "SummaryResultList(resultList=" + this.resultList + ", compliance=" + this.compliance + ")";
    }
}
