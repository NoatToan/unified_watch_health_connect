package com.huami.sleep.daysleep.tonality.bean;

import defpackage.b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/huami/sleep/daysleep/tonality/bean/QueryTonalityBean;", "", "", "component1", "component2", "component3", "baseSleepTime", "hideSleepStartTime", "hideSleepEndTime", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "J", "getBaseSleepTime", "()J", "b", "getHideSleepStartTime", "c", "getHideSleepEndTime", "<init>", "(JJJ)V", "sleep_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class QueryTonalityBean {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final long baseSleepTime;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final long hideSleepStartTime;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final long hideSleepEndTime;

    public QueryTonalityBean(long j, long j2, long j3) {
        this.baseSleepTime = j;
        this.hideSleepStartTime = j2;
        this.hideSleepEndTime = j3;
    }

    public static /* synthetic */ QueryTonalityBean copy$default(QueryTonalityBean queryTonalityBean, long j, long j2, long j3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = queryTonalityBean.baseSleepTime;
        }
        long j4 = j;
        if ((i & 2) != 0) {
            j2 = queryTonalityBean.hideSleepStartTime;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            j3 = queryTonalityBean.hideSleepEndTime;
        }
        return queryTonalityBean.copy(j4, j5, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getBaseSleepTime() {
        return this.baseSleepTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getHideSleepStartTime() {
        return this.hideSleepStartTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getHideSleepEndTime() {
        return this.hideSleepEndTime;
    }

    @NotNull
    public final QueryTonalityBean copy(long baseSleepTime, long hideSleepStartTime, long hideSleepEndTime) {
        return new QueryTonalityBean(baseSleepTime, hideSleepStartTime, hideSleepEndTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueryTonalityBean)) {
            return false;
        }
        QueryTonalityBean queryTonalityBean = (QueryTonalityBean) other;
        return this.baseSleepTime == queryTonalityBean.baseSleepTime && this.hideSleepStartTime == queryTonalityBean.hideSleepStartTime && this.hideSleepEndTime == queryTonalityBean.hideSleepEndTime;
    }

    public final long getBaseSleepTime() {
        return this.baseSleepTime;
    }

    public final long getHideSleepEndTime() {
        return this.hideSleepEndTime;
    }

    public final long getHideSleepStartTime() {
        return this.hideSleepStartTime;
    }

    public int hashCode() {
        return (((b.a(this.baseSleepTime) * 31) + b.a(this.hideSleepStartTime)) * 31) + b.a(this.hideSleepEndTime);
    }

    @NotNull
    public String toString() {
        return "QueryTonalityBean(baseSleepTime=" + this.baseSleepTime + ", hideSleepStartTime=" + this.hideSleepStartTime + ", hideSleepEndTime=" + this.hideSleepEndTime + ")";
    }
}
