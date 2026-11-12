package com.ximalaya.ting.android.opensdk.httputil.logging;

import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes22.dex */
public interface Logger {
    public static final Logger DEFAULT = new Logger() { // from class: com.ximalaya.ting.android.opensdk.httputil.logging.Logger.1
        @Override // com.ximalaya.ting.android.opensdk.httputil.logging.Logger
        public void log(int i, String str, String str2) {
            Platform.get().log(i, str2, null);
        }
    };

    void log(int i, String str, String str2);
}
