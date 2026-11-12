package com.xiaomi.fitness.health.export;

import com.xiaomi.fitness.chart.entrys.CurseEntry;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/fitness/health/export/MenstrualWidgetEntryList;", "", "desc", "", "startTimeSecond", "", "endTimeSecond", "entryList", "", "Lcom/xiaomi/fitness/chart/entrys/CurseEntry;", "<init>", "(Ljava/lang/String;JJLjava/util/List;)V", "getDesc", "()Ljava/lang/String;", "getStartTimeSecond", "()J", "getEndTimeSecond", "getEntryList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "health-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MenstrualWidgetEntryList {

    @Nullable
    private final String desc;
    private final long endTimeSecond;

    @NotNull
    private final List<CurseEntry> entryList;
    private final long startTimeSecond;

    /* JADX WARN: Multi-variable type inference failed */
    public MenstrualWidgetEntryList(@Nullable String str, long j, long j2, @NotNull List<? extends CurseEntry> entryList) {
        Intrinsics.checkNotNullParameter(entryList, "entryList");
        this.desc = str;
        this.startTimeSecond = j;
        this.endTimeSecond = j2;
        this.entryList = entryList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenstrualWidgetEntryList copy$default(MenstrualWidgetEntryList menstrualWidgetEntryList, String str, long j, long j2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = menstrualWidgetEntryList.desc;
        }
        if ((i & 2) != 0) {
            j = menstrualWidgetEntryList.startTimeSecond;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = menstrualWidgetEntryList.endTimeSecond;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            list = menstrualWidgetEntryList.entryList;
        }
        return menstrualWidgetEntryList.copy(str, j3, j4, list);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getStartTimeSecond() {
        return this.startTimeSecond;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getEndTimeSecond() {
        return this.endTimeSecond;
    }

    @NotNull
    public final List<CurseEntry> component4() {
        return this.entryList;
    }

    @NotNull
    public final MenstrualWidgetEntryList copy(@Nullable String desc, long startTimeSecond, long endTimeSecond, @NotNull List<? extends CurseEntry> entryList) {
        Intrinsics.checkNotNullParameter(entryList, "entryList");
        return new MenstrualWidgetEntryList(desc, startTimeSecond, endTimeSecond, entryList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenstrualWidgetEntryList)) {
            return false;
        }
        MenstrualWidgetEntryList menstrualWidgetEntryList = (MenstrualWidgetEntryList) other;
        return Intrinsics.areEqual(this.desc, menstrualWidgetEntryList.desc) && this.startTimeSecond == menstrualWidgetEntryList.startTimeSecond && this.endTimeSecond == menstrualWidgetEntryList.endTimeSecond && Intrinsics.areEqual(this.entryList, menstrualWidgetEntryList.entryList);
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    public final long getEndTimeSecond() {
        return this.endTimeSecond;
    }

    @NotNull
    public final List<CurseEntry> getEntryList() {
        return this.entryList;
    }

    public final long getStartTimeSecond() {
        return this.startTimeSecond;
    }

    public int hashCode() {
        String str = this.desc;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.startTimeSecond)) * 31) + Long.hashCode(this.endTimeSecond)) * 31) + this.entryList.hashCode();
    }

    @NotNull
    public String toString() {
        return "MenstrualWidgetEntryList(desc=" + this.desc + ", startTimeSecond=" + this.startTimeSecond + ", endTimeSecond=" + this.endTimeSecond + ", entryList=" + this.entryList + ")";
    }
}
