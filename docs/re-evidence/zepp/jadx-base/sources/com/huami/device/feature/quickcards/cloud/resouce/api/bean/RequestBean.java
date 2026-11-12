package com.huami.device.feature.quickcards.cloud.resouce.api.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/RequestBean;", "", "", "", "requestIds", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public abstract class RequestBean {
    @NotNull
    public abstract Iterable<String> requestIds();
}
