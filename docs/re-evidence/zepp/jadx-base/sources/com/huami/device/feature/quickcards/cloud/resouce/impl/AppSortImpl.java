package com.huami.device.feature.quickcards.cloud.resouce.impl;

import com.huami.device.feature.quickcards.cloud.resouce.api.NetworkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/impl/AppSortImpl;", "Lcom/huami/device/feature/quickcards/cloud/resouce/impl/NormalResourceImpl;", "", "loadType", "Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "networkApi", "<init>", "(Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;)V", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public final class AppSortImpl extends NormalResourceImpl {
    public AppSortImpl(@NotNull NetworkApi networkApi) {
        super(networkApi);
    }

    @Override // com.huami.device.feature.quickcards.cloud.resouce.impl.NormalResourceImpl
    public int loadType() {
        return 1;
    }
}
