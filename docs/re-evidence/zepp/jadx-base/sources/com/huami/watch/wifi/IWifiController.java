package com.huami.watch.wifi;

import android.content.Context;
import android.net.ConnectivityManager;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.bind.analytic.ConstantKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0005H&J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Lcom/huami/watch/wifi/IWifiController;", "", "", "ssid", "password", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectTo", "networkCallback", "", ConstantKt.CONNECT_FAIL_REASON_DISCONNECT, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "enable", "enableWifi", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IWifiController {
    @Nullable
    ConnectivityManager.NetworkCallback connectTo(@NotNull String ssid, @NotNull String password);

    boolean disconnect(@NotNull ConnectivityManager.NetworkCallback networkCallback);

    boolean enableWifi(@NotNull Context context, boolean enable);
}
