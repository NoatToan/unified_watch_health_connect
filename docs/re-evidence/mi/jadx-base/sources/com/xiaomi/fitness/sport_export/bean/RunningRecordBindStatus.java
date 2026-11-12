package com.xiaomi.fitness.sport_export.bean;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/sport_export/bean/RunningRecordBindStatus;", "", "bindStatus", "", "routeId", "traceFileUrl", "", "score", "routeIcon", "routeName", "length", "", "<init>", "(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;F)V", "getBindStatus", "()I", "getRouteId", "getTraceFileUrl", "()Ljava/lang/String;", "getScore", "getRouteIcon", "getRouteName", "getLength", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "sport-export_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class RunningRecordBindStatus {
    private final int bindStatus;
    private final float length;

    @NotNull
    private final String routeIcon;
    private final int routeId;

    @NotNull
    private final String routeName;
    private final int score;

    @Nullable
    private final String traceFileUrl;

    public RunningRecordBindStatus(int i, int i2, @Nullable String str, int i3, @NotNull String routeIcon, @NotNull String routeName, float f) {
        Intrinsics.checkNotNullParameter(routeIcon, "routeIcon");
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        this.bindStatus = i;
        this.routeId = i2;
        this.traceFileUrl = str;
        this.score = i3;
        this.routeIcon = routeIcon;
        this.routeName = routeName;
        this.length = f;
    }

    public static /* synthetic */ RunningRecordBindStatus copy$default(RunningRecordBindStatus runningRecordBindStatus, int i, int i2, String str, int i3, String str2, String str3, float f, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = runningRecordBindStatus.bindStatus;
        }
        if ((i4 & 2) != 0) {
            i2 = runningRecordBindStatus.routeId;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            str = runningRecordBindStatus.traceFileUrl;
        }
        String str4 = str;
        if ((i4 & 8) != 0) {
            i3 = runningRecordBindStatus.score;
        }
        int i6 = i3;
        if ((i4 & 16) != 0) {
            str2 = runningRecordBindStatus.routeIcon;
        }
        String str5 = str2;
        if ((i4 & 32) != 0) {
            str3 = runningRecordBindStatus.routeName;
        }
        String str6 = str3;
        if ((i4 & 64) != 0) {
            f = runningRecordBindStatus.length;
        }
        return runningRecordBindStatus.copy(i, i5, str4, i6, str5, str6, f);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBindStatus() {
        return this.bindStatus;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getRouteId() {
        return this.routeId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTraceFileUrl() {
        return this.traceFileUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRouteIcon() {
        return this.routeIcon;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getRouteName() {
        return this.routeName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final float getLength() {
        return this.length;
    }

    @NotNull
    public final RunningRecordBindStatus copy(int bindStatus, int routeId, @Nullable String traceFileUrl, int score, @NotNull String routeIcon, @NotNull String routeName, float length) {
        Intrinsics.checkNotNullParameter(routeIcon, "routeIcon");
        Intrinsics.checkNotNullParameter(routeName, "routeName");
        return new RunningRecordBindStatus(bindStatus, routeId, traceFileUrl, score, routeIcon, routeName, length);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunningRecordBindStatus)) {
            return false;
        }
        RunningRecordBindStatus runningRecordBindStatus = (RunningRecordBindStatus) other;
        return this.bindStatus == runningRecordBindStatus.bindStatus && this.routeId == runningRecordBindStatus.routeId && Intrinsics.areEqual(this.traceFileUrl, runningRecordBindStatus.traceFileUrl) && this.score == runningRecordBindStatus.score && Intrinsics.areEqual(this.routeIcon, runningRecordBindStatus.routeIcon) && Intrinsics.areEqual(this.routeName, runningRecordBindStatus.routeName) && Float.compare(this.length, runningRecordBindStatus.length) == 0;
    }

    public final int getBindStatus() {
        return this.bindStatus;
    }

    public final float getLength() {
        return this.length;
    }

    @NotNull
    public final String getRouteIcon() {
        return this.routeIcon;
    }

    public final int getRouteId() {
        return this.routeId;
    }

    @NotNull
    public final String getRouteName() {
        return this.routeName;
    }

    public final int getScore() {
        return this.score;
    }

    @Nullable
    public final String getTraceFileUrl() {
        return this.traceFileUrl;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.bindStatus) * 31) + Integer.hashCode(this.routeId)) * 31;
        String str = this.traceFileUrl;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.score)) * 31) + this.routeIcon.hashCode()) * 31) + this.routeName.hashCode()) * 31) + Float.hashCode(this.length);
    }

    @NotNull
    public String toString() {
        return "RunningRecordBindStatus(bindStatus=" + this.bindStatus + ", routeId=" + this.routeId + ", traceFileUrl=" + this.traceFileUrl + ", score=" + this.score + ", routeIcon=" + this.routeIcon + ", routeName=" + this.routeName + ", length=" + this.length + ")";
    }

    public /* synthetic */ RunningRecordBindStatus(int i, int i2, String str, int i3, String str2, String str3, float f, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? null : str, (i4 & 8) != 0 ? 0 : i3, str2, str3, f);
    }
}
