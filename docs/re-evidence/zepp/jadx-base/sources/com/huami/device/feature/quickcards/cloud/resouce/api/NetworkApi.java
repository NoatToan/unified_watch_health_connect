package com.huami.device.feature.quickcards.cloud.resouce.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J;\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/huami/device/feature/quickcards/cloud/resouce/api/NetworkApi;", "", "", "type", "", "", "ids", "lang", "source", "request", "(ILjava/lang/Iterable;Ljava/lang/String;Ljava/lang/Integer;)Ljava/lang/String;", "quick-card-api_release"}, k = 1, mv = {1, 5, 1})
public interface NetworkApi {
    @Nullable
    String request(int type, @NotNull Iterable<String> ids, @Nullable String lang, @Nullable Integer source) throws Exception;
}
