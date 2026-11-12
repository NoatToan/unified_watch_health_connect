package com.xiaomi.smarthome.framework.plugin.rn.core.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes2.dex */
public interface IRnConnectionProvider {
    HttpURLConnection createConnection(String str, boolean z) throws IOException;

    OkHttpClient getClient(boolean z);
}
