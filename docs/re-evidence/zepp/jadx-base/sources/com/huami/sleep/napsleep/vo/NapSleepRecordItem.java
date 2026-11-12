package com.huami.sleep.napsleep.vo;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/sleep/napsleep/vo/NapSleepRecordItem;", "", "", "component1", "component2", "", "component3", "startDateStr", "endDateStr", "duration", "copy", "toString", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getStartDateStr", "()Ljava/lang/String;", "b", "getEndDateStr", "c", LogUtil.I, "getDuration", "()I", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class NapSleepRecordItem {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String startDateStr;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String endDateStr;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int duration;

    public NapSleepRecordItem(@NotNull String str, @NotNull String str2, int i) {
        this.startDateStr = str;
        this.endDateStr = str2;
        this.duration = i;
    }

    public static /* synthetic */ NapSleepRecordItem copy$default(NapSleepRecordItem napSleepRecordItem, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = napSleepRecordItem.startDateStr;
        }
        if ((i2 & 2) != 0) {
            str2 = napSleepRecordItem.endDateStr;
        }
        if ((i2 & 4) != 0) {
            i = napSleepRecordItem.duration;
        }
        return napSleepRecordItem.copy(str, str2, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStartDateStr() {
        return this.startDateStr;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEndDateStr() {
        return this.endDateStr;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final NapSleepRecordItem copy(@NotNull String startDateStr, @NotNull String endDateStr, int duration) {
        return new NapSleepRecordItem(startDateStr, endDateStr, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NapSleepRecordItem)) {
            return false;
        }
        NapSleepRecordItem napSleepRecordItem = (NapSleepRecordItem) other;
        return Intrinsics.areEqual(this.startDateStr, napSleepRecordItem.startDateStr) && Intrinsics.areEqual(this.endDateStr, napSleepRecordItem.endDateStr) && this.duration == napSleepRecordItem.duration;
    }

    public final int getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEndDateStr() {
        return this.endDateStr;
    }

    @NotNull
    public final String getStartDateStr() {
        return this.startDateStr;
    }

    public int hashCode() {
        return (((this.startDateStr.hashCode() * 31) + this.endDateStr.hashCode()) * 31) + this.duration;
    }

    @NotNull
    public String toString() {
        return "NapSleepRecordItem(startDateStr=" + this.startDateStr + ", endDateStr=" + this.endDateStr + ", duration=" + this.duration + ")";
    }

    public /* synthetic */ NapSleepRecordItem(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, i);
    }
}
