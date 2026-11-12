package com.ximalaya.ting.android.opensdk.model.xdcs;

import com.ximalaya.ting.android.player.Logger;
import com.ximalaya.ting.android.player.xdcs.IStatToServer;

/* JADX INFO: loaded from: classes22.dex */
public class StatToServerForOpen implements IStatToServer {
    @Override // com.ximalaya.ting.android.player.xdcs.IStatToServer
    public void addEndHttpDnsRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
    }

    @Override // com.ximalaya.ting.android.player.xdcs.IStatToServer
    public void addHttpDnsEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Logger.logToSd("PlayError = addHttpDnsEvent requestUrl " + str + "   " + str7);
    }

    @Override // com.ximalaya.ting.android.player.xdcs.IStatToServer
    public void endAllHttpDnsRequest() {
    }

    @Override // com.ximalaya.ting.android.player.xdcs.IStatToServer
    public void statNormalRequest(String str, String str2, String str3, String str4) {
        Logger.logToSd("PlayError = NormalRequest requestUrl " + str + "   " + str4);
    }
}
