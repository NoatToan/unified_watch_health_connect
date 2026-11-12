package com.huami.module.homepage.cards.business.femalehealth;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.fhservice.ZeppCalendarStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b%\u0010&J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000f\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "", "", "component1", "()Ljava/lang/Integer;", "", "component2", "", "Lcom/huami/fhservice/ZeppCalendarStatus;", "component3", "", "component4", "state", "content", "calendarState", "hasData", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Z)Lcom/huami/module/homepage/cards/business/femalehealth/FemaleHealthEntry;", "toString", "hashCode", "other", "equals", "a", "Ljava/lang/Integer;", "getState", "b", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "c", "Ljava/util/List;", "getCalendarState", "()Ljava/util/List;", GoogleApiAvailabilityLight.a, "Z", "getHasData", "()Z", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Z)V", "homePage_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FemaleHealthEntry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @Nullable
    private final Integer state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final List<ZeppCalendarStatus> calendarState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final boolean hasData;

    public FemaleHealthEntry(@Nullable Integer num, @NotNull String str, @NotNull List<ZeppCalendarStatus> list, boolean z) {
        this.state = num;
        this.content = str;
        this.calendarState = list;
        this.hasData = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FemaleHealthEntry copy$default(FemaleHealthEntry femaleHealthEntry, Integer num, String str, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            num = femaleHealthEntry.state;
        }
        if ((i & 2) != 0) {
            str = femaleHealthEntry.content;
        }
        if ((i & 4) != 0) {
            list = femaleHealthEntry.calendarState;
        }
        if ((i & 8) != 0) {
            z = femaleHealthEntry.hasData;
        }
        return femaleHealthEntry.copy(num, str, list, z);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getState() {
        return this.state;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final List<ZeppCalendarStatus> component3() {
        return this.calendarState;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getHasData() {
        return this.hasData;
    }

    @NotNull
    public final FemaleHealthEntry copy(@Nullable Integer state, @NotNull String content, @NotNull List<ZeppCalendarStatus> calendarState, boolean hasData) {
        return new FemaleHealthEntry(state, content, calendarState, hasData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FemaleHealthEntry)) {
            return false;
        }
        FemaleHealthEntry femaleHealthEntry = (FemaleHealthEntry) other;
        return Intrinsics.areEqual(this.state, femaleHealthEntry.state) && Intrinsics.areEqual(this.content, femaleHealthEntry.content) && Intrinsics.areEqual(this.calendarState, femaleHealthEntry.calendarState) && this.hasData == femaleHealthEntry.hasData;
    }

    @NotNull
    public final List<ZeppCalendarStatus> getCalendarState() {
        return this.calendarState;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        Integer num = this.state;
        int iHashCode = (((((num == null ? 0 : num.hashCode()) * 31) + this.content.hashCode()) * 31) + this.calendarState.hashCode()) * 31;
        boolean z = this.hasData;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "FemaleHealthEntry(state=" + this.state + ", content=" + this.content + ", calendarState=" + this.calendarState + ", hasData=" + this.hasData + ")";
    }
}
