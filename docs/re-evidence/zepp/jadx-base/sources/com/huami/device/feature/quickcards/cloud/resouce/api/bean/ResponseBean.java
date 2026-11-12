package com.huami.device.feature.quickcards.cloud.resouce.api.bean;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001c\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "B", "", "", "loadItems", "<init>", "()V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public abstract class ResponseBean<B> {
    @NotNull
    public abstract Iterable<B> loadItems();
}
