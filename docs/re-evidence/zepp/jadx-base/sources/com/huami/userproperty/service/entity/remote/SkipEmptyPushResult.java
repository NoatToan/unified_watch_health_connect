package com.huami.userproperty.service.entity.remote;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/userproperty/service/entity/remote/SkipEmptyPushResult;", "Lcom/huami/userproperty/service/entity/remote/BatchPushResult;", "<init>", "()V", "service_release"}, k = 1, mv = {1, 5, 1})
public final class SkipEmptyPushResult extends BatchPushResult {

    @NotNull
    public static final SkipEmptyPushResult INSTANCE = new SkipEmptyPushResult();

    private SkipEmptyPushResult() {
        super(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }
}
