package defpackage;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes12.dex */
public class ocn {
    private static ocn e;

    public static ocn e() {
        if (e == null) {
            e = new ocn();
        }
        return e;
    }

    public String b(String str, String str2, String str3, String str4, String str5) throws NoSuchAlgorithmException, KeyManagementException {
        try {
            try {
                URL url = new URL(str);
                if (ocq.f44154c.booleanValue()) {
                    ocq.b("HttpConnectionUtils", "doPostRequest->url=%s, urlParameters=%s", url, str2);
                }
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setConnectTimeout(30000);
                httpsURLConnection.setReadTimeout(30000);
                httpsURLConnection.setRequestMethod("POST");
                httpsURLConnection.setRequestProperty("Connection", "Keep-Alive");
                httpsURLConnection.setRequestProperty("Content-Length", String.valueOf(str2.getBytes("utf-8").length));
                httpsURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                httpsURLConnection.setRequestProperty("ES-Version", "1.0.7");
                httpsURLConnection.setRequestProperty("User-Agent", "3gpp-gba");
                httpsURLConnection.setRequestProperty("X-3GPP-Intended-IDENTITY", str5);
                if (!TextUtils.isEmpty(str4)) {
                    httpsURLConnection.setRequestProperty("Authorization", str4);
                }
                if (str3 != null) {
                    ocq.e("HttpConnectionUtils", "cookie is not null");
                    httpsURLConnection.setRequestProperty("Cookie", str3);
                }
                if (ocj.e() != null) {
                    String str6 = ocj.e().get("appid");
                    String str7 = ocj.e().get("appkey");
                    httpsURLConnection.setRequestProperty("ES-APP-ID", str6);
                    httpsURLConnection.setRequestProperty("ES-APP-Key", str7);
                }
                httpsURLConnection.setRequestProperty("ES-APP-ID", "00104605");
                httpsURLConnection.setRequestProperty("ES-APP-Key", "0C22D5E56878F9D3");
                httpsURLConnection.connect();
                OutputStream outputStream = httpsURLConnection.getOutputStream();
                outputStream.write(str2.getBytes("utf-8"));
                outputStream.flush();
                int responseCode = httpsURLConnection.getResponseCode();
                if (200 != responseCode) {
                    ocq.e("HttpConnectionUtils", "doPostRequest->error responseCode= " + responseCode);
                    c(outputStream);
                    return String.valueOf(responseCode);
                }
                String strE = e(httpsURLConnection);
                if (ocq.f44154c.booleanValue()) {
                    ocq.e("HttpConnectionUtils", "response: " + strE);
                }
                oco.e(httpsURLConnection, str2);
                httpsURLConnection.disconnect();
                ocq.e("HttpConnectionUtils", "doPostRequest->success.");
                c(outputStream);
                return strE;
            } catch (IOException unused) {
                ocq.c("HttpConnectionUtils", "doPostRequest->IOException");
                c(null);
                return String.valueOf(98);
            } catch (RuntimeException unused2) {
                ocq.c("HttpConnectionUtils", "doPostRequest->RuntimeException");
                c(null);
                return String.valueOf(99);
            }
        } catch (Throwable th) {
            c(null);
            throw th;
        }
    }

    private static String e(HttpURLConnection httpURLConnection) throws Throwable {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            inputStream = httpURLConnection.getInputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        String string = byteArrayOutputStream.toString("utf-8");
                        c(inputStream);
                        c(byteArrayOutputStream);
                        return string;
                    }
                }
            } catch (Throwable th) {
                th = th;
                c(inputStream);
                c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    private static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                ocq.h("HttpConnectionUtils", "closeStream->close error");
            }
        }
    }
}
