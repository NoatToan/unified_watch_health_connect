package com.sensetime.senseid.sdk.liveness.silent.common.network;

import androidx.annotation.WorkerThread;
import com.sensetime.senseid.sdk.liveness.silent.common.type.AbstractContentType;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractLivenessUtils extends AbstractHttpUtils {
    @WorkerThread
    public void checkAntihackSync(HttpListener httpListener, String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType) {
        sendRequestSync(httpListener, str, str2, str3, str4, str5, abstractContentType, "mobile", "liveness", "antihack_detection");
    }

    @WorkerThread
    public void checkLivenessIdAsync(String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType) {
        sendRequestAsync(str, str2, str3, str4, str5, abstractContentType, "mobile", "resource", "liveness_data", "file");
    }

    @WorkerThread
    public void checkLivenessIdSync(HttpListener httpListener, String str, String str2, String str3, String str4, String str5, AbstractContentType abstractContentType) {
        sendRequestSync(httpListener, str, str2, str3, str4, str5, abstractContentType, "mobile", "resource", "liveness_data", "file");
    }
}
