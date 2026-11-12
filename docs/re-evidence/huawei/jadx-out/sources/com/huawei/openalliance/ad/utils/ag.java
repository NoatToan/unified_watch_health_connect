package com.huawei.openalliance.ad.utils;

import java.io.IOException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;

/* JADX INFO: loaded from: classes12.dex */
public class ag {
    public static int a(int i) {
        return i == 404 ? 8 : 0;
    }

    private static boolean a(Throwable th) {
        if (th == null) {
            return false;
        }
        return (th instanceof PortUnreachableException) || (th instanceof ConnectException) || (th instanceof HttpRetryException) || (th instanceof SocketTimeoutException) || (th instanceof UnknownHostException) || (th instanceof NoRouteToHostException) || (th instanceof UnknownServiceException) || (th instanceof ProtocolException) || (th instanceof SSLKeyException) || (th instanceof SSLPeerUnverifiedException) || (th instanceof SSLProtocolException) || (th instanceof SSLHandshakeException) || (th instanceof SSLException);
    }

    public static boolean a(IOException iOException) {
        Throwable cause;
        if (iOException == null) {
            return false;
        }
        int i = 0;
        while (cause != null && i < 10) {
            if (a(cause)) {
                cause = iOException;
                return true;
            }
            cause = iOException;
            i++;
            cause = cause.getCause();
        }
        cause = iOException;
        return false;
    }
}
