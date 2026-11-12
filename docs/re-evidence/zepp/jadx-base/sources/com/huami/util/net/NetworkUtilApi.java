package com.huami.util.net;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\b\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/huami/util/net/NetworkUtilApi;", "", "", "isNetworkConnect", "isWifiConnected", "Lcom/huami/util/net/ConnectType;", "getNetworkType", "Lcom/huami/util/net/WanType;", "getWanType", "hmutil_release"}, k = 1, mv = {1, 5, 1})
public interface NetworkUtilApi {
    @NotNull
    ConnectType getNetworkType();

    @NotNull
    WanType getWanType();

    boolean isNetworkConnect();

    boolean isWifiConnected();
}
