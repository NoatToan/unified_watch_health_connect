package com.xiaomi.mitv.airkan.sdk.impl;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xiaomi.mitv.airkan.sdk.util.Logger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;

/* JADX INFO: loaded from: classes22.dex */
final class h {
    private static final int a = 10000;
    private static final int b = 10000;
    private static final String c = "UTF-8";

    private static String a(InputStream inputStream, String str) throws IOException, IllegalCharsetNameException {
        byte[] byteArray;
        if (inputStream == null) {
            byteArray = null;
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int i = inputStream.read(bArr);
                if (i == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
            byteArrayOutputStream.close();
            inputStream.close();
            byteArray = byteArrayOutputStream.toByteArray();
        }
        if (byteArray == null) {
            return "";
        }
        return (str == null || !Charset.isSupported(str)) ? new String(byteArray, "UTF-8") : new String(byteArray, str);
    }

    public static String b(String str) throws g {
        String str2;
        if (str == null || str.isEmpty()) {
            throw new g(13, "Empty url");
        }
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(10000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(false);
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        InputStream inputStream = null;
                        try {
                            str2 = null;
                            inputStream = httpURLConnection.getInputStream();
                        } catch (IOException e) {
                            e.printStackTrace();
                            str2 = "Get input stream failed!";
                        }
                        String str3 = "";
                        if (inputStream != null) {
                            try {
                                byte[] bArrF = f(inputStream, 1024);
                                if (bArrF != null) {
                                    str3 = !Charset.isSupported("UTF-8") ? new String(bArrF, "UTF-8") : new String(bArrF, "UTF-8");
                                }
                            } catch (IOException e2) {
                                e2.printStackTrace();
                                str2 = "Read input stream failed!";
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        httpURLConnection.disconnect();
                        if (responseCode == 200) {
                            return str3;
                        }
                        Logger.i(String.format("code : %s,Message : %s,body: %s,url(%s)", Integer.valueOf(responseCode), str2, str3, str), new Object[0]);
                        throw new g(14, String.format("code : %s,url(%s)", Integer.valueOf(responseCode), str3, str));
                    } catch (SocketTimeoutException e4) {
                        e4.printStackTrace();
                        throw new g(12, "Get http response code failed");
                    } catch (IOException e5) {
                        e5.printStackTrace();
                        throw new g(13, "Get http response code failed");
                    }
                } catch (ProtocolException e6) {
                    throw new g(13, String.format("invalid http method:%s", e6.getMessage()));
                }
            } catch (IOException e7) {
                e7.printStackTrace();
                throw new g(13, "open http connection failed");
            }
        } catch (MalformedURLException unused) {
            throw new g(12, String.format("URL(%s) init failed", str));
        }
    }

    private static HttpURLConnection c(URL url) throws IOException {
        return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
    }

    private static void d(String str, HttpURLConnection httpURLConnection) throws ProtocolException {
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(false);
    }

    private static byte[] e(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    private static byte[] f(InputStream inputStream, int i) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                byteArrayOutputStream.close();
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i2);
        }
    }

    private static String g(String str) {
        try {
            return b(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
