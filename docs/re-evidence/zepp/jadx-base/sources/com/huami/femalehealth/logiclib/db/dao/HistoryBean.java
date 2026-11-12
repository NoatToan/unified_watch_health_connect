package com.huami.femalehealth.logiclib.db.dao;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/femalehealth/logiclib/db/dao/HistoryBean;", "", "", "component1", "component2", "", "component3", "component4", "year", "month", "day", "time", "copy", "toString", "hashCode", "other", "", "equals", "a", LogUtil.I, "getYear", "()I", "b", "getMonth", "c", "Ljava/lang/String;", "getDay", "()Ljava/lang/String;", GoogleApiAvailabilityLight.a, "getTime", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class HistoryBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int year;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int month;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @NotNull
    private final String day;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    private final String time;

    public HistoryBean(int i, int i2, @NotNull String str, @NotNull String str2) {
        this.year = i;
        this.month = i2;
        this.day = str;
        this.time = str2;
    }

    public static /* synthetic */ HistoryBean copy$default(HistoryBean historyBean, int i, int i2, String str, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = historyBean.year;
        }
        if ((i3 & 2) != 0) {
            i2 = historyBean.month;
        }
        if ((i3 & 4) != 0) {
            str = historyBean.day;
        }
        if ((i3 & 8) != 0) {
            str2 = historyBean.time;
        }
        return historyBean.copy(i, i2, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDay() {
        return this.day;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTime() {
        return this.time;
    }

    @NotNull
    public final HistoryBean copy(int year, int month, @NotNull String day, @NotNull String time) {
        return new HistoryBean(year, month, day, time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryBean)) {
            return false;
        }
        HistoryBean historyBean = (HistoryBean) other;
        return this.year == historyBean.year && this.month == historyBean.month && Intrinsics.areEqual(this.day, historyBean.day) && Intrinsics.areEqual(this.time, historyBean.time);
    }

    @NotNull
    public final String getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    @NotNull
    public final String getTime() {
        return this.time;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((((this.year * 31) + this.month) * 31) + this.day.hashCode()) * 31) + this.time.hashCode();
    }

    @NotNull
    public String toString() {
        return "HistoryBean(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ", time=" + this.time + ')';
    }
}
