package com.xiaomi.fitness.detail.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/fitness/detail/model/SportsReportOperationalCourseInfo;", "", "id", "", "name", "", "<init>", "(JLjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SportsReportOperationalCourseInfo {

    @SerializedName("id")
    private final long id;

    @SerializedName("name")
    @NotNull
    private final String name;

    public SportsReportOperationalCourseInfo(long j, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.name = name;
    }

    public static /* synthetic */ SportsReportOperationalCourseInfo copy$default(SportsReportOperationalCourseInfo sportsReportOperationalCourseInfo, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sportsReportOperationalCourseInfo.id;
        }
        if ((i & 2) != 0) {
            str = sportsReportOperationalCourseInfo.name;
        }
        return sportsReportOperationalCourseInfo.copy(j, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final SportsReportOperationalCourseInfo copy(long id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SportsReportOperationalCourseInfo(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportsReportOperationalCourseInfo)) {
            return false;
        }
        SportsReportOperationalCourseInfo sportsReportOperationalCourseInfo = (SportsReportOperationalCourseInfo) other;
        return this.id == sportsReportOperationalCourseInfo.id && Intrinsics.areEqual(this.name, sportsReportOperationalCourseInfo.name);
    }

    public final long getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "SportsReportOperationalCourseInfo(id=" + this.id + ", name=" + this.name + ")";
    }
}
