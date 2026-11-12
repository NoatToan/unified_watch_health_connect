package com.ximalaya.ting.android.opensdk.httputil.logging;

/* JADX INFO: loaded from: classes22.dex */
class I {
    public I() {
        throw new UnsupportedOperationException();
    }

    public static void log(int i, String str, String str2) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(str);
        if (i != 4) {
            logger.log(java.util.logging.Level.WARNING, str2);
        } else {
            logger.log(java.util.logging.Level.INFO, str2);
        }
    }
}
