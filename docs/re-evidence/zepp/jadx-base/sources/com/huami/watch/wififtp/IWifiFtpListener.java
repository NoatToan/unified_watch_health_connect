package com.huami.watch.wififtp;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J$\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\n\u001a\u00020\u0004H&J\b\u0010\u000b\u001a\u00020\u0004H&¨\u0006\f"}, d2 = {"Lcom/huami/watch/wififtp/IWifiFtpListener;", "", "", "state", "", "onWifiApStateChanged", "", "ipAddress", "userName", "onFtpServerStateChanged", "onDeviceConnected", "onDeviceDisconnected", "wififtp_release"}, k = 1, mv = {1, 4, 1})
public interface IWifiFtpListener {
    void onDeviceConnected();

    void onDeviceDisconnected();

    void onFtpServerStateChanged(int state, @Nullable String ipAddress, @Nullable String userName);

    void onWifiApStateChanged(int state);
}
