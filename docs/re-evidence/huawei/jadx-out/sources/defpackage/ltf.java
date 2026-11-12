package defpackage;

import android.content.Context;
import com.huawei.hms.network.embedded.j2;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.secure.android.common.SecureSSLSocketFactory;
import health.compact.a.IoUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes10.dex */
public class ltf {
    public static String a(String str, String str2, boolean z) {
        if (str2 == null) {
            LogUtil.j("HwCommonHttpsUtil", "doHttpsPost param is null");
            return null;
        }
        return e(str, str2, false, z);
    }

    private static String e(String str, String str2, boolean z, boolean z2) {
        try {
            try {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                LogUtil.a("HwCommonHttpsUtil", "postRequest url.openConnection!");
                LogUtil.a("HwCommonHttpsUtil", "postRequest openConnection already!");
                if (z2 && d(httpsURLConnection)) {
                    LogUtil.j("HwCommonHttpsUtil", "postRequest setSslSocketFactory fails");
                    return null;
                }
                try {
                    httpsURLConnection.setRequestMethod("POST");
                    LogUtil.a("HwCommonHttpsUtil", "postRequest setRequestMethod(HTTP_POST)!");
                    byte[] bArrE = e(str2, z, httpsURLConnection, SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER, z2);
                    if (bArrE == null) {
                        LogUtil.j("HwCommonHttpsUtil", "postRequest null data");
                        return null;
                    }
                    return d(bArrE, httpsURLConnection);
                } catch (ProtocolException e) {
                    LogUtil.e("HwCommonHttpsUtil", "postRequest setRequestMethod failed ", e.getMessage());
                    return null;
                }
            } catch (IOException e2) {
                LogUtil.e("HwCommonHttpsUtil", "postRequest openConnection failed ", e2.getMessage());
                return null;
            }
        } catch (MalformedURLException e3) {
            LogUtil.e("HwCommonHttpsUtil", "postRequest MalformedURLException ", e3.getMessage());
            return null;
        }
    }

    private static String d(byte[] bArr, HttpsURLConnection httpsURLConnection) {
        InputStream inputStreamB = null;
        try {
            inputStreamB = b(bArr, httpsURLConnection);
            LogUtil.a("HwCommonHttpsUtil", "getResponseLine getHttpsResponsesStream!");
            return lta.d(inputStreamB);
        } catch (Exception unused) {
            LogUtil.e("HwCommonHttpsUtil", "getResponseLine getHttpsResponsesStream Exception");
            return "";
        } finally {
            LogUtil.a("HwCommonHttpsUtil", "getResponseLine close response");
            IoUtils.c(inputStreamB);
        }
    }

    private static byte[] e(String str, boolean z, HttpsURLConnection httpsURLConnection, HostnameVerifier hostnameVerifier, boolean z2) {
        byte[] bytes;
        if (str != null) {
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("HwCommonHttpsUtil", "getData UnsupportedEncodingException ", e.getMessage());
                bytes = null;
            }
        } else {
            bytes = null;
        }
        if (z2) {
            httpsURLConnection.setHostnameVerifier(hostnameVerifier);
        }
        lta.a(httpsURLConnection, bytes);
        LogUtil.a("HwCommonHttpsUtil", "getData set end");
        if (!z) {
            httpsURLConnection.setRequestProperty(j2.v, "identity");
        }
        LogUtil.a("HwCommonHttpsUtil", "getData setRequestProperty jsonObject already!");
        return bytes;
    }

    private static boolean d(HttpsURLConnection httpsURLConnection) {
        try {
            httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(BaseApplication.getContext()));
            LogUtil.a("HwCommonHttpsUtil", "setSslSocketFactory end!");
            return false;
        } catch (IOException | IllegalAccessException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            LogUtil.e("HwCommonHttpsUtil", "setSslSocketFactory ", e.getClass().getName(), e.getMessage());
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x005d: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:17:0x005d */
    private static InputStream b(byte[] bArr, HttpsURLConnection httpsURLConnection) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2;
        OutputStream outputStream3 = null;
        try {
            try {
                httpsURLConnection.connect();
                LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream connect");
                outputStream = httpsURLConnection.getOutputStream();
                try {
                    LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream getOutput");
                    outputStream.write(bArr);
                    LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream write");
                    LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream finally closeOutputStream!");
                    lta.e(outputStream);
                    return lta.c(httpsURLConnection);
                } catch (IOException e) {
                    e = e;
                    LogUtil.e("HwCommonHttpsUtil", "getHttpsResponsesStream IOException ", e.getMessage());
                    LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream finally closeOutputStream!");
                    lta.e(outputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                outputStream3 = outputStream2;
                LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream finally closeOutputStream!");
                lta.e(outputStream3);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            outputStream = null;
        } catch (Throwable th2) {
            th = th2;
            LogUtil.a("HwCommonHttpsUtil", "getHttpsResponsesStream finally closeOutputStream!");
            lta.e(outputStream3);
            throw th;
        }
    }

    public static int e(String str, OutputStream outputStream) {
        Context context = BaseApplication.getContext();
        URL urlA = lta.a(str);
        if (urlA == null) {
            LogUtil.j("HwCommonHttpsUtil", "doReportStatus null url");
            return -1;
        }
        try {
            URLConnection uRLConnectionOpenConnection = urlA.openConnection();
            if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
                return -1;
            }
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
            LogUtil.a("HwCommonHttpsUtil", "doReportStatus url.openConnection!");
            LogUtil.a("HwCommonHttpsUtil", "doReportStatus openConnection already!");
            try {
                httpsURLConnection.setSSLSocketFactory(SecureSSLSocketFactory.getInstance(context));
                try {
                    httpsURLConnection.setRequestMethod("POST");
                    LogUtil.a("HwCommonHttpsUtil", "doReportStatus setRequestMethod(HTTP_POST)!");
                    return a(outputStream, httpsURLConnection);
                } catch (ProtocolException e) {
                    LogUtil.e("HwCommonHttpsUtil", "doReportStatus setRequestMethod failed ", e.getMessage());
                    return -1;
                }
            } catch (IOException | IllegalAccessException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e2) {
                LogUtil.e("HwCommonHttpsUtil", "doReportStatus ", e2.getClass().getName(), e2.getMessage());
                return -1;
            }
        } catch (IOException e3) {
            LogUtil.e("HwCommonHttpsUtil", "doReportStatus openConnection failed ", e3.getMessage());
            return -1;
        }
    }

    private static int a(OutputStream outputStream, HttpsURLConnection httpsURLConnection) {
        byte[] bytes;
        if (outputStream != null) {
            try {
                bytes = outputStream.toString().getBytes("UTF-8");
            } catch (UnsupportedEncodingException e) {
                LogUtil.e("HwCommonHttpsUtil", "sendData UnsupportedEncodingException ", e.getMessage());
                bytes = null;
            }
        } else {
            bytes = null;
        }
        int iC = -1;
        if (bytes == null) {
            LogUtil.j("HwCommonHttpsUtil", "sendData Get null post data!");
            return -1;
        }
        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
        lta.a(httpsURLConnection, bytes);
        LogUtil.a("HwCommonHttpsUtil", "sendData set end");
        try {
            iC = c(bytes, httpsURLConnection);
            LogUtil.a("HwCommonHttpsUtil", "sendData getHttpsReportCode");
        } catch (Exception unused) {
            LogUtil.e("HwCommonHttpsUtil", "sendData getHttpsReportCode Exception");
        }
        LogUtil.a("HwCommonHttpsUtil", "sendData StatusCode is ", Integer.valueOf(iC));
        return iC;
    }

    private static int c(byte[] bArr, HttpsURLConnection httpsURLConnection) {
        OutputStream outputStream = null;
        int responseCode = -1;
        try {
            httpsURLConnection.connect();
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode connect");
            outputStream = httpsURLConnection.getOutputStream();
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode getOutput");
            outputStream.write(bArr);
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode write");
            httpsURLConnection.getInputStream();
            responseCode = httpsURLConnection.getResponseCode();
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode StatusCode: ", Integer.valueOf(responseCode));
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode finally closeOutputStream!");
        } catch (IOException e) {
            LogUtil.e("HwCommonHttpsUtil", e.getMessage(), e.getMessage());
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode finally closeOutputStream!");
        } finally {
            LogUtil.a("HwCommonHttpsUtil", "getHttpsReportCode finally closeOutputStream!");
            lta.e(outputStream);
        }
        return responseCode;
    }
}
