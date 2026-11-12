package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalMedalInfo;", "", "id", "", "name", "", "icon", "gotTime", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;J)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIcon", "getGotTime", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalMedalInfo {

    @SerializedName("gotTime")
    private final long gotTime;

    @SerializedName("icon")
    @NotNull
    private final String icon;

    @SerializedName("id")
    private final int id;

    @SerializedName("name")
    @NotNull
    private final String name;

    public SportsReportOperationalMedalInfo(int i, @NotNull String name, @NotNull String icon, long j) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.id = i;
        this.name = name;
        this.icon = icon;
        this.gotTime = j;
    }

    public static /* synthetic */ SportsReportOperationalMedalInfo copy$default(SportsReportOperationalMedalInfo sportsReportOperationalMedalInfo, int i, String str, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sportsReportOperationalMedalInfo.id;
        }
        if ((i2 & 2) != 0) {
            str = sportsReportOperationalMedalInfo.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = sportsReportOperationalMedalInfo.icon;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            j = sportsReportOperationalMedalInfo.gotTime;
        }
        return sportsReportOperationalMedalInfo.copy(i, str3, str4, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getGotTime() {
        return this.gotTime;
    }

    @NotNull
    public final SportsReportOperationalMedalInfo copy(int id, @NotNull String name, @NotNull String icon, long gotTime) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new SportsReportOperationalMedalInfo(id, name, icon, gotTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalMedalInfo)) {
            return false;
        }
        SportsReportOperationalMedalInfo sportsReportOperationalMedalInfo = (SportsReportOperationalMedalInfo) other;
        return this.id == sportsReportOperationalMedalInfo.id && Intrinsics.areEqual(this.name, sportsReportOperationalMedalInfo.name) && Intrinsics.areEqual(this.icon, sportsReportOperationalMedalInfo.icon) && this.gotTime == sportsReportOperationalMedalInfo.gotTime;
    }

    public final long getGotTime() {
        return this.gotTime;
    }

    @NotNull
    public final String getIcon() {
        return this.icon;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icon.hashCode()) * 31) + Long.hashCode(this.gotTime);
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalMedalInfo(id=" + this.id + ", name=" + this.name + ", icon=" + this.icon + ", gotTime=" + this.gotTime + ")";
    }
}
