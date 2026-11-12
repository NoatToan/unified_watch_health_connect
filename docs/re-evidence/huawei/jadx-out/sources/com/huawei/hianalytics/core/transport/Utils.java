package com.huawei.hianalytics.core.transport;

import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.core.transport.net.Response;
import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public class Utils {
    public static final String TAG = "Utils";

    public static Response handlerException(Exception exc) {
        if (exc instanceof SecurityException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE003);
            return new Response(-101, "");
        }
        if (exc instanceof SSLPeerUnverifiedException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE002);
            return new Response(-105, "");
        }
        if (exc instanceof SSLHandshakeException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE002);
            return new Response(-105, "");
        }
        if (exc instanceof ConnectException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE005);
            return new Response(-103, "");
        }
        if (exc instanceof UnknownHostException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE006);
            return new Response(-104, "");
        }
        if (exc instanceof IOException) {
            HiLog.e(TAG, HiLog.ErrorCode.NE004);
        } else {
            HiLog.e(TAG, "other Exception:" + exc.getMessage());
        }
        return new Response(-102, "");
    }

    public static long parseStringToLong(String str) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }
}
