package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.DefaultLoadControl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Set;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes20.dex */
public class ytu {
    public static String d(String str, String str2) {
        try {
            Uri uri = Uri.parse(str);
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            String[] strArr = (String[]) queryParameterNames.toArray(new String[queryParameterNames.size()]);
            Arrays.sort(strArr);
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            for (String str3 : strArr) {
                if (z) {
                    sb.append("&");
                } else {
                    z = true;
                }
                sb.append(str3);
                sb.append("=");
                sb.append(uri.getQueryParameter(str3));
            }
            return d(sb.toString().getBytes(), str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String d(byte[] bArr, String str) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str.getBytes(), "HmacSHA256"));
            return e(mac.doFinal(bArr));
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String b(String str) throws Throwable {
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        IOException e;
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_MS);
            httpURLConnection.setReadTimeout(1500);
            httpURLConnection.setUseCaches(true);
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (200 == httpURLConnection.getResponseCode()) {
                inputStream = httpURLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i = inputStream.read(bArr, 0, 1024);
                                if (i <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                            }
                            if (byteArrayOutputStream.size() > 0) {
                                String str2 = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
                                ytt.d(inputStream);
                                ytt.d(byteArrayOutputStream);
                                return str2;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            ytr.b(" get " + e.toString());
                        }
                    } catch (Throwable th2) {
                        inputStream2 = inputStream;
                        th = th2;
                        ytt.d(inputStream2);
                        ytt.d(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    byteArrayOutputStream = null;
                } catch (Throwable th3) {
                    inputStream2 = inputStream;
                    th = th3;
                    byteArrayOutputStream = null;
                    ytt.d(inputStream2);
                    ytt.d(byteArrayOutputStream);
                    throw th;
                }
            } else {
                ytr.d(" get response error: " + httpURLConnection.getResponseCode());
                inputStream = null;
                byteArrayOutputStream = null;
            }
        } catch (IOException e4) {
            e = e4;
            inputStream = null;
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
        ytt.d(inputStream);
        ytt.d(byteArrayOutputStream);
        return null;
    }

    public static String e(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b2)));
        }
        return sb.toString();
    }
}
