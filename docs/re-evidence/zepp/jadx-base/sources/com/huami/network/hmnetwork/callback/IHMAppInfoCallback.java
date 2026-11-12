package com.huami.network.hmnetwork.callback;

import com.huami.network.hmnetwork.exception.GettingTokenErrorException;
import com.huami.network.hmnetwork.exception.GettingTokenInUIThreadException;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface IHMAppInfoCallback {
    String getUserId();

    boolean isAdultForAds();

    boolean isHuamiSDKLogin();

    boolean isNetworkConnected();

    boolean isUserValid();

    void processHeader(Map<String, String> map) throws GettingTokenErrorException, GettingTokenInUIThreadException;
}
