package com.huami.watch.companion.cloud;

import android.text.TextUtils;
import com.huami.watch.util.Box;

/* JADX INFO: loaded from: classes16.dex */
public class HostManager {
    public static String getAccountIdServer() {
        String accountIdServer = Box.getAccountIdServer();
        return TextUtils.isEmpty(accountIdServer) ? "https://account.huami.com/" : accountIdServer;
    }

    public static String getAccountUserServer() {
        String accountUserServer = Box.getAccountUserServer();
        return TextUtils.isEmpty(accountUserServer) ? "https://api-user.huami.com/" : accountUserServer;
    }

    public static String getAmazfitHost() {
        String amazfitHost = Box.getAmazfitHost();
        return TextUtils.isEmpty(amazfitHost) ? Cloud.n : amazfitHost;
    }

    public static String getMiHost() {
        String miHost = Box.getMiHost();
        return TextUtils.isEmpty(miHost) ? Cloud.l : miHost;
    }

    public static String getWatchHost() {
        String watchHost = Box.getWatchHost();
        return TextUtils.isEmpty(watchHost) ? Cloud.j : watchHost;
    }
}
