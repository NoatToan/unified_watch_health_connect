package com.huami.userproperty.service.entity.remote;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u0013\u0010\r\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0010\u001a\u00020\f8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "", "", "Lcom/huami/userproperty/service/entity/remote/BatchPushItem;", "a", "Ljava/util/List;", "getSuccessKeys", "()Ljava/util/List;", "successKeys", "b", "getFailedKeys", "failedKeys", "", "isSuccess", "()Z", "isSkip", "isMissed", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "service_release"}, k = 1, mv = {1, 5, 1})
public class BatchPushResult {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<BatchPushItem> successKeys;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<BatchPushItem> failedKeys;

    public BatchPushResult(@NotNull List<BatchPushItem> list, @NotNull List<BatchPushItem> list2) {
        this.successKeys = list;
        this.failedKeys = list2;
    }

    @NotNull
    public final List<BatchPushItem> getFailedKeys() {
        return this.failedKeys;
    }

    @NotNull
    public final List<BatchPushItem> getSuccessKeys() {
        return this.successKeys;
    }

    public final boolean isMissed() {
        return this instanceof ApiMissedResult;
    }

    public final boolean isSkip() {
        return this instanceof SkipEmptyPushResult;
    }

    public final boolean isSuccess() {
        return this.failedKeys.isEmpty();
    }
}
