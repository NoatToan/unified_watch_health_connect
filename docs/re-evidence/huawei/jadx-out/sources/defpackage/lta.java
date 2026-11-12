package defpackage;

import com.huawei.hms.network.embedded.j2;
import com.huawei.hms.network.embedded.w9;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.IoUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

/* JADX INFO: loaded from: classes10.dex */
public class lta {
    public static String b(String str, String str2) {
        if (str2 == null) {
            LogUtil.j("HwCommonHttpUtil", "doHttpPost null data");
            return null;
        }
        return a(str, str2, false);
    }

    private static String a(String str, String str2, boolean z) {
        InputStream inputStreamD = null;
        try {
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                LogUtil.a("HwCommonHttpUtil", "postRequest url.openConnection!");
                LogUtil.a("HwCommonHttpUtil", "postRequest openConnection already!");
                try {
                    httpURLConnection.setRequestMethod("POST");
                    LogUtil.a("HwCommonHttpUtil", "postRequest setRequestMethod(HTTP_POST)!");
                    byte[] bArrB = b(str2, z, httpURLConnection);
                    try {
                        if (bArrB == null) {
                            LogUtil.j("HwCommonHttpUtil", "postRequest null data");
                            return null;
                        }
                        inputStreamD = d(bArrB, httpURLConnection);
                        LogUtil.a("HwCommonHttpUtil", "postRequest getHttpResponsesStream!");
                        return c(inputStreamD);
                    } catch (Exception unused) {
                        LogUtil.e("HwCommonHttpUtil", "postRequest getHttpResponsesStream Exception");
                        return "";
                    } finally {
                        LogUtil.a("HwCommonHttpUtil", "postRequest getHttpResponsesStream close response");
                        IoUtils.c(inputStreamD);
                    }
                } catch (ProtocolException e) {
                    LogUtil.e("HwCommonHttpUtil", "postRequest setRequestMethod failed ", e.getMessage());
                    return null;
                }
            } catch (IOException e2) {
                LogUtil.e("HwCommonHttpUtil", "postRequest openConnection failed", e2.getMessage());
                return null;
            }
        } catch (MalformedURLException e3) {
            LogUtil.e("HwCommonHttpUtil", "postRequest MalformedURLException", e3.getMessage());
            return null;
        }
    }

    public static String d(InputStream inputStream) {
        if (inputStream == null) {
            LogUtil.j("HwCommonHttpUtil", "getResponseLine response is null");
            return "";
        }
        return c(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    private static String c(InputStream inputStream) throws Throwable {
        Reader reader;
        BufferedReader bufferedReader;
        Reader inputStreamReader;
        ?? r11;
        char c2;
        Reader reader2 = null;
        try {
            try {
                inputStreamReader = new InputStreamReader((InputStream) inputStream, "UTF-8");
                try {
                    bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        StringBuffer stringBuffer = new StringBuffer();
                        while (true) {
                            int i = bufferedReader.read();
                            if (i == -1 || (c2 = (char) i) == '\n') {
                                break;
                                break;
                            }
                            if (stringBuffer.length() >= 104857600) {
                                throw new IllegalStateException("input too long");
                            }
                            stringBuffer.append(c2);
                        }
                        String string = stringBuffer.toString();
                        IoUtils.c(inputStreamReader);
                        IoUtils.c(bufferedReader);
                        IoUtils.c(inputStream);
                        return string;
                    } catch (UnsupportedEncodingException e) {
                        e = e;
                        reader2 = inputStreamReader;
                        LogUtil.e("HwCommonHttpUtil", "doPostRequest UnsupportedEncodingException!", e.getMessage());
                        IoUtils.c(reader2);
                        IoUtils.c(bufferedReader);
                        IoUtils.c(inputStream);
                        inputStream = "";
                        return "";
                    } catch (IOException e2) {
                        e = e2;
                        reader2 = inputStreamReader;
                        LogUtil.e("HwCommonHttpUtil", "doPostRequest IOException!", e.getMessage());
                        IoUtils.c(reader2);
                        IoUtils.c(bufferedReader);
                        IoUtils.c(inputStream);
                        inputStream = "";
                        return "";
                    } catch (Throwable th) {
                        th = th;
                        reader2 = bufferedReader;
                        reader = reader2;
                        reader2 = inputStreamReader;
                        r11 = inputStream;
                        IoUtils.c(reader2);
                        IoUtils.c(reader);
                        IoUtils.c(r11);
                        throw th;
                    }
                } catch (UnsupportedEncodingException e3) {
                    bufferedReader = null;
                    reader2 = inputStreamReader;
                    e = e3;
                } catch (IOException e4) {
                    bufferedReader = null;
                    reader2 = inputStreamReader;
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                    reader = reader2;
                    reader2 = inputStreamReader;
                    r11 = inputStream;
                    IoUtils.c(reader2);
                    IoUtils.c(reader);
                    IoUtils.c(r11);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = reader2;
            }
        } catch (UnsupportedEncodingException e5) {
            e = e5;
            bufferedReader = null;
        } catch (IOException e6) {
            e = e6;
            bufferedReader = null;
        } catch (Throwable th4) {
            th = th4;
            reader = null;
            r11 = inputStream;
            IoUtils.c(reader2);
            IoUtils.c(reader);
            IoUtils.c(r11);
            throw th;
        }
    }

    private static byte[] b(String str, boolean z, HttpURLConnection httpURLConnection) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                LogUtil.e("HwCommonHttpUtil", "getData UnsupportedEncodingException");
                bytes = null;
            }
        } else {
            bytes = null;
        }
        a(httpURLConnection, bytes);
        LogUtil.a("HwCommonHttpUtil", "getData setUrlConnectionCommon end");
        if (!z) {
            httpURLConnection.setRequestProperty(j2.v, "identity");
        }
        LogUtil.a("HwCommonHttpUtil", "getData setRequestProperty jsonObject already!");
        return bytes;
    }

    public static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        if (httpURLConnection == null || bArr == null) {
            LogUtil.j("HwCommonHttpUtil", "setUrlConnectionCommon param is null");
            return;
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bArr.length));
        httpURLConnection.setRequestProperty("Connection", w9.j);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x005d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x005d */
    private static InputStream d(byte[] bArr, HttpURLConnection httpURLConnection) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3 = null;
        try {
            try {
                httpURLConnection.connect();
                LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream connect");
                outputStream = httpURLConnection.getOutputStream();
                try {
                    LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream getOutput");
                    outputStream.write(bArr);
                    LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream write");
                    LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream finally closeOutputStream!");
                    e(outputStream);
                    return c(httpURLConnection);
                } catch (IOException e) {
                    e = e;
                    LogUtil.e("HwCommonHttpUtil", "getHttpResponsesStream IOException", e.getMessage());
                    LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream finally closeOutputStream!");
                    e(outputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStream3 = outputStream2;
                LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream finally closeOutputStream!");
                e(outputStream3);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            LogUtil.a("HwCommonHttpUtil", "getHttpResponsesStream finally closeOutputStream!");
            e(outputStream3);
            throw th;
        }
    }

    public static InputStream c(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return null;
        }
        try {
            return httpURLConnection.getInputStream();
        } catch (UnsupportedEncodingException unused) {
            LogUtil.e("HwCommonHttpUtil", "getInputStream UnsupportedEncodingException");
            return null;
        } catch (IOException e) {
            LogUtil.e("HwCommonHttpUtil", "getInputStream IOException", e.getMessage());
            return null;
        }
    }

    public static void e(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.flush();
                outputStream.close();
            } catch (IOException unused) {
                LogUtil.e("HwCommonHttpUtil", "closeOutputStream IOException");
            }
        }
    }

    public static URL a(String str) {
        try {
            URL url = new URL(str);
            LogUtil.a("HwCommonHttpUtil", "getUrl url: ", str);
            return url;
        } catch (MalformedURLException e) {
            LogUtil.e("HwCommonHttpUtil", "getUrl MalformedURLException ", e.getMessage());
            return null;
        }
    }

    public static int b(String str, OutputStream outputStream) {
        URL urlA = a(str);
        int iB = -1;
        if (urlA == null) {
            return -1;
        }
        try {
            byte[] bytes = null;
            HttpURLConnection httpURLConnection = urlA.openConnection() instanceof HttpURLConnection ? (HttpURLConnection) urlA.openConnection() : null;
            LogUtil.a("HwCommonHttpUtil", "doReportStatus (HttpURLConnection)url.openConnection!");
            LogUtil.a("HwCommonHttpUtil", "doReportStatus openConnection already!");
            if (httpURLConnection != null) {
                try {
                    httpURLConnection.setRequestMethod("POST");
                } catch (ProtocolException e) {
                    LogUtil.e("HwCommonHttpUtil", "doReportStatus setRequestMethod failed", e.getMessage());
                    return -1;
                }
            }
            LogUtil.a("HwCommonHttpUtil", "doReportStatus setRequestMethod(HTTP_POST)!");
            if (outputStream != null) {
                try {
                    bytes = outputStream.toString().getBytes("UTF-8");
                } catch (UnsupportedEncodingException e2) {
                    LogUtil.e("HwCommonHttpUtil", "doReportStatus UnsupportedEncodingException", e2.getMessage());
                }
            }
            if (bytes == null) {
                LogUtil.j("HwCommonHttpUtil", "doReportStatus null data!");
                return -1;
            }
            a(httpURLConnection, bytes);
            LogUtil.a("HwCommonHttpUtil", "doReportStatus setUrlConnectionCommon end");
            try {
                iB = b(bytes, httpURLConnection);
                LogUtil.a("HwCommonHttpUtil", "doReportStatus getHttpResponsesStream!");
            } catch (Exception unused) {
                LogUtil.e("HwCommonHttpUtil", "doReportStatus getHttpResponsesStream Exception");
            }
            LogUtil.a("HwCommonHttpUtil", "doReportStatus StatusCode is ", Integer.valueOf(iB));
            return iB;
        } catch (IOException e3) {
            LogUtil.e("HwCommonHttpUtil", "doReportStatus openConnection failed", e3.getMessage());
            return -1;
        }
    }

    private static int b(byte[] bArr, HttpURLConnection httpURLConnection) {
        int responseCode = -1;
        if (httpURLConnection == null) {
            LogUtil.e("HwCommonHttpUtil", "getHttpReportCode httpConnection is null");
            return -1;
        }
        OutputStream outputStream = null;
        try {
            httpURLConnection.connect();
            LogUtil.a("HwCommonHttpUtil", "getHttpReportCode connect");
            outputStream = httpURLConnection.getOutputStream();
            LogUtil.a("HwCommonHttpUtil", "getHttpReportCode getOutput");
            outputStream.write(bArr);
            LogUtil.a("HwCommonHttpUtil", "getHttpReportCode write");
            httpURLConnection.getInputStream();
            responseCode = httpURLConnection.getResponseCode();
            LogUtil.a("HwCommonHttpUtil", "getHttpReportCode statusCode: ", Integer.valueOf(responseCode));
            return responseCode;
        } catch (IOException e) {
            LogUtil.e("HwCommonHttpUtil", "getHttpReportCode IOException", e.getMessage());
            return responseCode;
        } finally {
            LogUtil.a("HwCommonHttpUtil", "getHttpReportCode finally closeOutputStream!");
            e(outputStream);
        }
    }
}
