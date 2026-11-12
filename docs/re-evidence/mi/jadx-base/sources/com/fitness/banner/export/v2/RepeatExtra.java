package com.fitness.banner.export.v2;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/fitness/banner/export/v2/RepeatExtra;", "", "cycleStartStr", "", "cycleEndStr", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCycleStartStr", "()Ljava/lang/String;", "getCycleEndStr", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "banner-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RepeatExtra {

    @SerializedName("cycle_end")
    @Nullable
    private final String cycleEndStr;

    @SerializedName("cycle_start")
    @Nullable
    private final String cycleStartStr;

    /* JADX WARN: Multi-variable type inference failed */
    public RepeatExtra() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ RepeatExtra copy$default(RepeatExtra repeatExtra, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = repeatExtra.cycleStartStr;
        }
        if ((i & 2) != 0) {
            str2 = repeatExtra.cycleEndStr;
        }
        return repeatExtra.copy(str, str2);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCycleStartStr() {
        return this.cycleStartStr;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCycleEndStr() {
        return this.cycleEndStr;
    }

    @NotNull
    public final RepeatExtra copy(@Nullable String cycleStartStr, @Nullable String cycleEndStr) {
        return new RepeatExtra(cycleStartStr, cycleEndStr);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepeatExtra)) {
            return false;
        }
        RepeatExtra repeatExtra = (RepeatExtra) other;
        return Intrinsics.areEqual(this.cycleStartStr, repeatExtra.cycleStartStr) && Intrinsics.areEqual(this.cycleEndStr, repeatExtra.cycleEndStr);
    }

    @Nullable
    public final String getCycleEndStr() {
        return this.cycleEndStr;
    }

    @Nullable
    public final String getCycleStartStr() {
        return this.cycleStartStr;
    }

    public int hashCode() {
        String str = this.cycleStartStr;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cycleEndStr;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RepeatExtra(cycleStartStr=" + this.cycleStartStr + ", cycleEndStr=" + this.cycleEndStr + ")";
    }

    public RepeatExtra(@Nullable String str, @Nullable String str2) {
        this.cycleStartStr = str;
        this.cycleEndStr = str2;
    }

    public /* synthetic */ RepeatExtra(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
