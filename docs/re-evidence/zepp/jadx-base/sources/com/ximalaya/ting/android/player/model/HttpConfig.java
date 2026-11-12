package com.ximalaya.ting.android.player.model;

import com.ximalaya.ting.android.player.IGetHttpUrlConnectByUrl;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class HttpConfig {
    public static final String METHOD_GET = "GET";
    public static final String METHOD_HEAD = "HEAD";
    public static final String METHOD_POST = "POST";
    public String authorization;
    public int httpsProxyPort;
    public IGetHttpUrlConnectByUrl mGetHttpUrlConnectByUrl;
    public Map<String, String> property;
    public String proxyHost;
    public int proxyPort;
    public boolean useProxy = false;
    public boolean useCache = true;
    public int connectionTimeOut = 30000;
    public int readTimeOut = 30000;
    public int writeTimeOut = 30000;
    public String method = "GET";
    public int proxyType = -1;
}
