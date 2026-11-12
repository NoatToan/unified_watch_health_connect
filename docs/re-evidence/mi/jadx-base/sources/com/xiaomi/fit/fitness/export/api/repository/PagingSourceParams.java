package com.xiaomi.fit.fitness.export.api.repository;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fit/fitness/export/api/repository/PagingSourceParams;", "", "<init>", "()V", "queryStartTime", "", "getQueryStartTime", "()Ljava/lang/Long;", "setQueryStartTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "queryEndTime", "getQueryEndTime", "setQueryEndTime", "canLoadNextMore", "", "getCanLoadNextMore", "()Ljava/lang/Boolean;", "setCanLoadNextMore", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "canLoadPrevMore", "getCanLoadPrevMore", "setCanLoadPrevMore", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PagingSourceParams {

    @Nullable
    private Boolean canLoadNextMore;

    @Nullable
    private Boolean canLoadPrevMore;

    @Nullable
    private Long queryEndTime;

    @Nullable
    private Long queryStartTime;

    @Nullable
    public final Boolean getCanLoadNextMore() {
        return this.canLoadNextMore;
    }

    @Nullable
    public final Boolean getCanLoadPrevMore() {
        return this.canLoadPrevMore;
    }

    @Nullable
    public final Long getQueryEndTime() {
        return this.queryEndTime;
    }

    @Nullable
    public final Long getQueryStartTime() {
        return this.queryStartTime;
    }

    public final void setCanLoadNextMore(@Nullable Boolean bool) {
        this.canLoadNextMore = bool;
    }

    public final void setCanLoadPrevMore(@Nullable Boolean bool) {
        this.canLoadPrevMore = bool;
    }

    public final void setQueryEndTime(@Nullable Long l) {
        this.queryEndTime = l;
    }

    public final void setQueryStartTime(@Nullable Long l) {
        this.queryStartTime = l;
    }
}
