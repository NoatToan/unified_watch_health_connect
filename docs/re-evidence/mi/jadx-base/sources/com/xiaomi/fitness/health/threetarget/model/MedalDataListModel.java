package com.xiaomi.fitness.health.threetarget.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J5\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/health/threetarget/model/MedalDataListModel;", "", "sourceName", "", "sourceIconUrl", "currentCount", "", "bestCount", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getSourceName", "()Ljava/lang/String;", "setSourceName", "(Ljava/lang/String;)V", "getSourceIconUrl", "setSourceIconUrl", "getCurrentCount", "()I", "setCurrentCount", "(I)V", "getBestCount", "setBestCount", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MedalDataListModel {
    private int bestCount;
    private int currentCount;

    @Nullable
    private String sourceIconUrl;

    @Nullable
    private String sourceName;

    public MedalDataListModel() {
        this(null, null, 0, 0, 15, null);
    }

    public static /* synthetic */ MedalDataListModel copy$default(MedalDataListModel medalDataListModel, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = medalDataListModel.sourceName;
        }
        if ((i3 & 2) != 0) {
            str2 = medalDataListModel.sourceIconUrl;
        }
        if ((i3 & 4) != 0) {
            i = medalDataListModel.currentCount;
        }
        if ((i3 & 8) != 0) {
            i2 = medalDataListModel.bestCount;
        }
        return medalDataListModel.copy(str, str2, i, i2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCurrentCount() {
        return this.currentCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getBestCount() {
        return this.bestCount;
    }

    @NotNull
    public final MedalDataListModel copy(@Nullable String sourceName, @Nullable String sourceIconUrl, int currentCount, int bestCount) {
        return new MedalDataListModel(sourceName, sourceIconUrl, currentCount, bestCount);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalDataListModel)) {
            return false;
        }
        MedalDataListModel medalDataListModel = (MedalDataListModel) other;
        return Intrinsics.areEqual(this.sourceName, medalDataListModel.sourceName) && Intrinsics.areEqual(this.sourceIconUrl, medalDataListModel.sourceIconUrl) && this.currentCount == medalDataListModel.currentCount && this.bestCount == medalDataListModel.bestCount;
    }

    public final int getBestCount() {
        return this.bestCount;
    }

    public final int getCurrentCount() {
        return this.currentCount;
    }

    @Nullable
    public final String getSourceIconUrl() {
        return this.sourceIconUrl;
    }

    @Nullable
    public final String getSourceName() {
        return this.sourceName;
    }

    public int hashCode() {
        String str = this.sourceName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sourceIconUrl;
        return ((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.currentCount)) * 31) + Integer.hashCode(this.bestCount);
    }

    public final void setBestCount(int i) {
        this.bestCount = i;
    }

    public final void setCurrentCount(int i) {
        this.currentCount = i;
    }

    public final void setSourceIconUrl(@Nullable String str) {
        this.sourceIconUrl = str;
    }

    public final void setSourceName(@Nullable String str) {
        this.sourceName = str;
    }

    @NotNull
    public String toString() {
        return "MedalDataListModel(sourceName=" + this.sourceName + ", sourceIconUrl=" + this.sourceIconUrl + ", currentCount=" + this.currentCount + ", bestCount=" + this.bestCount + ")";
    }

    public MedalDataListModel(@Nullable String str, @Nullable String str2, int i, int i2) {
        this.sourceName = str;
        this.sourceIconUrl = str2;
        this.currentCount = i;
        this.bestCount = i2;
    }

    public /* synthetic */ MedalDataListModel(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}
