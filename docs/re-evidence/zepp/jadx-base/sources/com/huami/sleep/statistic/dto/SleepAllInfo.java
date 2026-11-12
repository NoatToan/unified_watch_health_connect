package com.huami.sleep.statistic.dto;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sleep.sleepintrodetail.dto.SleepDetail;
import defpackage.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0006HÆ\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006'"}, d2 = {"Lcom/huami/sleep/statistic/dto/SleepAllInfo;", "", "", "component1", "", "component2", "Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "component3", "component4", "timeStamp", "date", "mainSleepDetail", "napSleepDetail", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getTimeStamp", "()J", "b", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "c", "Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "getMainSleepDetail", "()Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;", "setMainSleepDetail", "(Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;)V", GoogleApiAvailabilityLight.a, "getNapSleepDetail", "setNapSleepDetail", "<init>", "(JLjava/lang/String;Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;Lcom/huami/sleep/sleepintrodetail/dto/SleepDetail;)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class SleepAllInfo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long timeStamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final String date;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private SleepDetail mainSleepDetail;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private SleepDetail napSleepDetail;

    public SleepAllInfo(long j, @NotNull String str, @NotNull SleepDetail sleepDetail, @NotNull SleepDetail sleepDetail2) {
        this.timeStamp = j;
        this.date = str;
        this.mainSleepDetail = sleepDetail;
        this.napSleepDetail = sleepDetail2;
    }

    public static /* synthetic */ SleepAllInfo copy$default(SleepAllInfo sleepAllInfo, long j, String str, SleepDetail sleepDetail, SleepDetail sleepDetail2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = sleepAllInfo.timeStamp;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = sleepAllInfo.date;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            sleepDetail = sleepAllInfo.mainSleepDetail;
        }
        SleepDetail sleepDetail3 = sleepDetail;
        if ((i & 8) != 0) {
            sleepDetail2 = sleepAllInfo.napSleepDetail;
        }
        return sleepAllInfo.copy(j2, str2, sleepDetail3, sleepDetail2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimeStamp() {
        return this.timeStamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SleepDetail getMainSleepDetail() {
        return this.mainSleepDetail;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SleepDetail getNapSleepDetail() {
        return this.napSleepDetail;
    }

    @NotNull
    public final SleepAllInfo copy(long timeStamp, @NotNull String date, @NotNull SleepDetail mainSleepDetail, @NotNull SleepDetail napSleepDetail) {
        return new SleepAllInfo(timeStamp, date, mainSleepDetail, napSleepDetail);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepAllInfo)) {
            return false;
        }
        SleepAllInfo sleepAllInfo = (SleepAllInfo) other;
        return this.timeStamp == sleepAllInfo.timeStamp && Intrinsics.areEqual(this.date, sleepAllInfo.date) && Intrinsics.areEqual(this.mainSleepDetail, sleepAllInfo.mainSleepDetail) && Intrinsics.areEqual(this.napSleepDetail, sleepAllInfo.napSleepDetail);
    }

    @NotNull
    public final String getDate() {
        return this.date;
    }

    @NotNull
    public final SleepDetail getMainSleepDetail() {
        return this.mainSleepDetail;
    }

    @NotNull
    public final SleepDetail getNapSleepDetail() {
        return this.napSleepDetail;
    }

    public final long getTimeStamp() {
        return this.timeStamp;
    }

    public int hashCode() {
        return (((((b.a(this.timeStamp) * 31) + this.date.hashCode()) * 31) + this.mainSleepDetail.hashCode()) * 31) + this.napSleepDetail.hashCode();
    }

    public final void setMainSleepDetail(@NotNull SleepDetail sleepDetail) {
        this.mainSleepDetail = sleepDetail;
    }

    public final void setNapSleepDetail(@NotNull SleepDetail sleepDetail) {
        this.napSleepDetail = sleepDetail;
    }

    @NotNull
    public String toString() {
        return "SleepAllInfo(timeStamp=" + this.timeStamp + ", date=" + this.date + ", mainSleepDetail=" + this.mainSleepDetail + ", napSleepDetail=" + this.napSleepDetail + ")";
    }

    public /* synthetic */ SleepAllInfo(long j, String str, SleepDetail sleepDetail, SleepDetail sleepDetail2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? new SleepDetail(0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 16383, null) : sleepDetail, (i & 8) != 0 ? new SleepDetail(0, 0, 0, 0, 0, 0, 0, 0, 0L, 0L, 0, 0, 0, 0, 16383, null) : sleepDetail2);
    }
}
