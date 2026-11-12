package com.tencent.open.a;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.y;
import com.tencent.open.log.SLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes20.dex */
class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f31003a = y.f15619c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f31004b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31005c;

    public b(String str) {
        this.f31005c = str;
    }

    @Override // com.tencent.open.a.a
    public void a(long j, long j2) {
        if (j <= 0 || j2 <= 0) {
            return;
        }
        this.f31003a = (int) j;
        this.f31004b = (int) j2;
    }

    @Override // com.tencent.open.a.a
    public g a(String str, String str2) throws IOException {
        SLog.i("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return a(str, str2.length());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map) throws IOException {
        SLog.i("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append('&');
            }
            sb.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb.append('=');
            sb.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        String string = sb.toString();
        return a(str, string.length(), string);
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() <= 0) {
            return a(str, map);
        }
        Iterator<Map.Entry<String, byte[]>> it = map2.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry<String, byte[]> next = it.next();
        return a(str, map, next.getKey(), next.getValue());
    }

    private void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f31005c);
        httpURLConnection.setConnectTimeout(this.f31003a);
        httpURLConnection.setReadTimeout(this.f31004b);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
    }

    private g a(String str, int i) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        c cVar;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, i2);
                            }
                            cVar = new c(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                            a(byteArrayOutputStream2);
                            a(inputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            a(byteArrayOutputStream);
                            a(inputStream);
                            b(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "请求失败 code:" + httpURLConnection.getResponseCode();
                    }
                    c cVar2 = new c(httpURLConnection, "", httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), responseMessage);
                    a((Closeable) null);
                    a((Closeable) null);
                    cVar = cVar2;
                }
                b(httpURLConnection);
                return cVar;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    private g a(String str, int i, String str2) throws Throwable {
        Throwable th;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        c cVar;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() == 200) {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr, 0, i2);
                            }
                            cVar = new c(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, i, httpURLConnection.getResponseCode(), "");
                            a(byteArrayOutputStream2);
                            a(inputStream);
                        } catch (Throwable th2) {
                            th = th2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                            a(byteArrayOutputStream);
                            a(inputStream);
                            b(httpURLConnection);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    c cVar2 = new c(httpURLConnection, "", 0, i, httpURLConnection.getResponseCode(), responseMessage);
                    a((Closeable) null);
                    a((Closeable) null);
                    cVar = cVar2;
                }
                b(httpURLConnection);
                return cVar;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    public g a(String str, Map<String, String> map, String str2, byte[] bArr) throws Throwable {
        HttpURLConnection httpURLConnection;
        DataOutputStream dataOutputStream;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        int i;
        String string;
        DataOutputStream dataOutputStream2;
        Map<String, String> map2 = map;
        String str3 = "UTF-8";
        SLog.i("DefaultHttpServiceImpl", "文件上传");
        String string2 = UUID.randomUUID().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string2);
                a(httpURLConnection);
                httpURLConnection.connect();
                dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                if (map2 != null) {
                    try {
                        if (map.size() > 0) {
                            Iterator<String> it = map.keySet().iterator();
                            while (it.hasNext()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                String strEncode = URLEncoder.encode(it.next(), str3);
                                String strEncode2 = URLEncoder.encode(map2.get(strEncode), str3);
                                stringBuffer.append("--").append(string2).append("\r\n");
                                stringBuffer.append("Content-Disposition: form-data; name=\"").append(strEncode).append("\"").append("\r\n").append("\r\n");
                                stringBuffer.append(strEncode2).append("\r\n");
                                String string3 = stringBuffer.toString();
                                SLog.i("DefaultHttpServiceImpl", strEncode + "=" + string3 + "##");
                                dataOutputStream.write(string3.getBytes());
                                map2 = map;
                                str3 = str3;
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        dataOutputStream = dataOutputStream;
                        inputStream = null;
                        byteArrayOutputStream = null;
                        a(dataOutputStream);
                        a(inputStream);
                        a(byteArrayOutputStream);
                        b(httpURLConnection);
                        throw th;
                    }
                }
                if (bArr == null || bArr.length <= 0) {
                    i = 0;
                } else {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("--");
                    stringBuffer2.append(string2);
                    stringBuffer2.append("\r\n");
                    stringBuffer2.append("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n");
                    StringBuilder sb = new StringBuilder();
                    sb.append("Content-Type: application/octet-stream; charset=UTF-8");
                    sb.append("\r\n");
                    stringBuffer2.append(sb.toString());
                    stringBuffer2.append("\r\n");
                    dataOutputStream.write(stringBuffer2.toString().getBytes());
                    dataOutputStream.write(bArr, 0, bArr.length);
                    dataOutputStream.write("\r\n".getBytes());
                    byte[] bytes = ("--" + string2 + "--\r\n").getBytes();
                    dataOutputStream.write(bytes);
                    int length = bytes.length;
                    dataOutputStream.flush();
                    i = length;
                }
                int responseCode = httpURLConnection.getResponseCode();
                SLog.i("DefaultHttpServiceImpl", responseCode + "");
                if (responseCode == 200) {
                    InputStream inputStream2 = httpURLConnection.getInputStream();
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byte[] bArr2 = new byte[1024];
                            while (true) {
                                int i2 = inputStream2.read(bArr2);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream2.write(bArr2, 0, i2);
                                a(dataOutputStream);
                                a(inputStream);
                                a(byteArrayOutputStream);
                                b(httpURLConnection);
                                throw th;
                            }
                            string = byteArrayOutputStream2.toString();
                            inputStream = inputStream2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream2;
                            byteArrayOutputStream = byteArrayOutputStream2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = inputStream2;
                        byteArrayOutputStream = null;
                    }
                } else {
                    string = httpURLConnection.getResponseCode() + "";
                    inputStream = null;
                    byteArrayOutputStream = null;
                }
                try {
                    dataOutputStream2 = dataOutputStream;
                    try {
                        c cVar = new c(httpURLConnection, string, httpURLConnection.getContentLength(), i, httpURLConnection.getResponseCode(), "");
                        a(dataOutputStream2);
                        a(inputStream);
                        a(byteArrayOutputStream);
                        b(httpURLConnection);
                        return cVar;
                    } catch (Throwable th4) {
                        th = th4;
                        dataOutputStream = dataOutputStream2;
                        a(dataOutputStream);
                        a(inputStream);
                        a(byteArrayOutputStream);
                        b(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream2 = dataOutputStream;
                }
            } catch (Throwable th6) {
                th = th6;
                dataOutputStream = null;
                inputStream = null;
                byteArrayOutputStream = null;
                a(dataOutputStream);
                a(inputStream);
                a(byteArrayOutputStream);
                b(httpURLConnection);
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            httpURLConnection = null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }
}
