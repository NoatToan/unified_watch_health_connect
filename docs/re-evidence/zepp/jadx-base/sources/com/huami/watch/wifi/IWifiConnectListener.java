package com.huami.watch.wifi;

import android.net.Network;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\t"}, d2 = {"Lcom/huami/watch/wifi/IWifiConnectListener;", "", "", "ssid", "Landroid/net/Network;", "network", "", "onConnectedTo", "onDisconnected", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IWifiConnectListener {
    void onConnectedTo(@Nullable String ssid, @Nullable Network network);

    void onDisconnected(@Nullable String ssid, @Nullable Network network);
}
