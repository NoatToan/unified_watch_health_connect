package com.huami.watch.companion.components.bluetoothproxyserver.utils;

import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.HttpMessage;
import com.huami.watch.companion.components.bluetoothproxyserver.httpMessage.exception.ConnectServerError;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes16.dex */
public class SocketUtil {
    private static final String a = "SocketUtil";

    public static void closeSocket(Socket... socketArr) {
        if (socketArr == null || socketArr.length <= 0) {
            return;
        }
        for (Socket socket : socketArr) {
            if (socket != null && !socket.isClosed()) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static Socket connectServer(String str, int i, int i2) throws ConnectServerError {
        ProxyLog.D(a, "host = " + str + "  port = " + i + " connectTimeout =" + i2);
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress(InetAddress.getByName(str), i), i2);
        } catch (ConnectException e) {
            ProxyLog.E(a, "Connect Server ConnectionException" + e.toString());
        } catch (SocketTimeoutException e2) {
            ProxyLog.E(a, "Connect Server Is Timeout." + e2.toString());
        } catch (UnknownHostException e3) {
            ProxyLog.E(a, "Connect Server UnknownHostException" + e3.toString());
        } catch (IOException e4) {
            ProxyLog.E(a, "Connect Server IOException" + e4.toString());
        }
        return socket;
    }

    public static boolean writeSocket(OutputStream outputStream, byte[] bArr) {
        if (outputStream == null) {
            ProxyLog.W(a, "输出流为空!");
            return false;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            return true;
        } catch (IOException e) {
            ProxyLog.E(a, "writeSocket IOException:" + e);
            return false;
        }
    }

    public static boolean writeSocket(OutputStream outputStream, HttpMessage httpMessage, boolean z) {
        if (z) {
            httpMessage.encryptHttpMessage();
        }
        try {
            return writeSocket(outputStream, httpMessage.toString().getBytes("ISO-8859-1"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean writeSocket(OutputStream outputStream, byte[] bArr, boolean z) {
        return writeSocket(outputStream, bArr);
    }
}
