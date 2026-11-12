package com.huami.bigdata.statistics.core.entity;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\r\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/huami/bigdata/statistics/core/entity/AbstractSingleData;", "", "", "a", "J", "getInnerTimestamp", "()J", "innerTimestamp", "", "b", "Ljava/lang/String;", "getInnerTimezoneId", "()Ljava/lang/String;", "innerTimezoneId", "<init>", "(JLjava/lang/String;)V", "core_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbstractSingleData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final long innerTimestamp;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String innerTimezoneId;

    public AbstractSingleData(long j, @NotNull String str) {
        this.innerTimestamp = j;
        this.innerTimezoneId = str;
    }

    public final long getInnerTimestamp() {
        return this.innerTimestamp;
    }

    @NotNull
    public final String getInnerTimezoneId() {
        return this.innerTimezoneId;
    }
}
