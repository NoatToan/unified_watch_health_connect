package com.ximalaya.ting.android.player;

/* JADX INFO: loaded from: classes22.dex */
public interface IDomainServerIpCallback {
    String getNewDownloadUrlIfExpire(String str);

    String[][] getStaticDomainServerIp(String str);

    void setBadIp(String str, String str2, String str3);
}
