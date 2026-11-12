package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponse;", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/bean/ResponseBean;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/QuickCardResponseItem;", "", "loadItems", "a", "Ljava/lang/Iterable;", "items", "<init>", "(Ljava/lang/Iterable;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class QuickCardResponse extends ResponseBean<QuickCardResponseItem> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Iterable<QuickCardResponseItem> items;

    public QuickCardResponse(@NotNull Iterable<QuickCardResponseItem> iterable) {
        this.items = iterable;
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.api.bean.ResponseBean
    @NotNull
    public Iterable<QuickCardResponseItem> loadItems() {
        return this.items;
    }
}
