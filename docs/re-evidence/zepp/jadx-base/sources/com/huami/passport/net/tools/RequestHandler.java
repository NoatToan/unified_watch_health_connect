package com.huami.passport.net.tools;

import com.android.volley.NetworkResponse;
import com.android.volley.Request;

/* JADX INFO: loaded from: classes12.dex */
public class RequestHandler {
    private static volatile OnReceiveNetworkResponse sHandler;

    public interface OnReceiveNetworkResponse {
        void onReceive(Request<?> request, NetworkResponse networkResponse);
    }

    public static void handle(Request<?> request, NetworkResponse networkResponse) {
        if (sHandler != null && networkResponse != null) {
            sHandler.onReceive(request, networkResponse);
        }
        PassportNetworkLogger.dumpLog(request, networkResponse);
    }

    public static synchronized void setHandler(OnReceiveNetworkResponse onReceiveNetworkResponse) {
        sHandler = onReceiveNetworkResponse;
    }
}
