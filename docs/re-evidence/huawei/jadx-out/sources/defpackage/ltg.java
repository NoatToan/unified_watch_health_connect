package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.huawei.hwcommonmodel.utils.httputils.pluginoperation.HttpResCallback;
import com.huawei.hwlogsmodel.LogUtil;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes10.dex */
public class ltg {
    public static int c(String str, HashMap<String, String> map, HashMap<String, String> map2, HttpResCallback httpResCallback) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (e(str)) {
            return lth.c(str, map, map2, httpResCallback);
        }
        return lte.a(str, map, map2, httpResCallback);
    }

    public static String a(String str, HashMap<String, String> map, HashMap<String, String> map2) {
        if (!TextUtils.isEmpty(str)) {
            if (e(str)) {
                return lth.a(str, map, map2);
            }
            return lte.d(str, map, map2);
        }
        return "";
    }

    public static Bitmap a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (e(str)) {
            return lth.e(str);
        }
        return b(str);
    }

    private static Bitmap b(String str) throws Throwable {
        URL url;
        Bitmap bitmapDecodeByteArray;
        ByteArrayOutputStream byteArrayOutputStream;
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (e(str)) {
            return null;
        }
        try {
            url = new URL(str);
        } catch (MalformedURLException e) {
            LogUtil.e("HwCommonModelHttpUtils", "optionBitmapHttps MalformedURLException exception = ", e.getMessage());
            url = null;
        }
        if (url != null) {
            try {
                LogUtil.d("HwCommonModelHttpUtils", "imgUrl contains https. fileUrl is not null");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                lte.b(httpsURLConnection);
                httpsURLConnection.setDoInput(true);
                httpsURLConnection.connect();
                inputStream = httpsURLConnection.getInputStream();
                try {
                    LogUtil.d("HwCommonModelHttpUtils", "conn.getInputStream()=", inputStream);
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[512];
                            int i = 0;
                            do {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i2);
                                i += i2;
                            } while (i <= 10485760);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArrayOutputStream.toByteArray(), 0, i);
                            inputStream2 = inputStream;
                        } catch (IOException unused) {
                            LogUtil.e("HwCommonModelHttpUtils", "optionBitmapHttps IOException,download failed");
                            e(inputStream);
                            b(byteArrayOutputStream);
                            return null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream2 = inputStream;
                        e(inputStream2);
                        b(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                    byteArrayOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = null;
                    inputStream2 = inputStream;
                    e(inputStream2);
                    b(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                inputStream = null;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                e(inputStream2);
                b(byteArrayOutputStream);
                throw th;
            }
        } else {
            bitmapDecodeByteArray = null;
            byteArrayOutputStream = null;
        }
        e(inputStream2);
        b(byteArrayOutputStream);
        return bitmapDecodeByteArray;
    }

    private static boolean e(String str) {
        if (!str.contains(File.pathSeparator)) {
            return false;
        }
        int iIndexOf = str.indexOf(File.pathSeparator);
        if (iIndexOf < 0) {
            LogUtil.j("HwCommonModelHttpUtils", "isHttpProtocol index is ", Integer.valueOf(iIndexOf));
            return false;
        }
        try {
            String strSubstring = str.substring(0, iIndexOf);
            LogUtil.a("HwCommonModelHttpUtils", "protocol:", strSubstring);
            return "http".equalsIgnoreCase(strSubstring);
        } catch (StringIndexOutOfBoundsException e) {
            LogUtil.e("HwCommonModelHttpUtils", "isHttpProtocol StringIndexOutOfBoundsException = ", e.getMessage());
            return false;
        }
    }

    public static String a(HashMap<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(16);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry instanceof Map.Entry) {
                Map.Entry<String, String> entry2 = entry;
                String key = entry2.getKey();
                String value = entry2.getValue();
                sb.append("&");
                sb.append((Object) key);
                sb.append("=");
                sb.append((Object) value);
            }
        }
        String strTrim = sb.toString().trim();
        if (strTrim.length() < 1) {
            return "";
        }
        return strTrim.substring(1);
    }

    public static void d(HttpURLConnection httpURLConnection, HashMap<String, String> map) {
        boolean z = map == null || map.isEmpty();
        if (httpURLConnection == null || z) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry instanceof Map.Entry) {
                Map.Entry<String, String> entry2 = entry;
                String key = entry2.getKey();
                String value = entry2.getValue();
                if (key != null && value != null) {
                    httpURLConnection.setRequestProperty(String.valueOf(key), String.valueOf(value));
                    LogUtil.d("HwCommonModelHttpUtils", "setHeader key value");
                }
            }
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        if (inputStream == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        int i = 0;
        do {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, i2);
            i += i2;
        } while (i <= 10485760);
        byteArrayOutputStream.flush();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        b(byteArrayOutputStream);
        return byteArray;
    }

    public static void b(OutputStream outputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } catch (IOException unused2) {
                LogUtil.e("HwCommonModelHttpUtils", "closeOutputStream IOException,closing failure");
                try {
                    return;
                } catch (IOException unused3) {
                    return;
                }
            } finally {
                try {
                    outputStream.close();
                } catch (IOException unused4) {
                    LogUtil.e("HwCommonModelHttpUtils", "closeOutputStream IOException,closing failure");
                }
            }
        }
        LogUtil.e("HwCommonModelHttpUtils", "closeOutputStream outputStream is null");
    }

    public static void e(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
                try {
                    return;
                } catch (IOException unused) {
                    return;
                }
            } catch (IOException unused2) {
                LogUtil.e("HwCommonModelHttpUtils", "closeInputStream IOException,closing failure");
                try {
                    return;
                } catch (IOException unused3) {
                    return;
                }
            } finally {
                try {
                    inputStream.close();
                } catch (IOException unused4) {
                    LogUtil.e("HwCommonModelHttpUtils", "closeInputStream IOException,closing failure");
                }
            }
        }
        LogUtil.e("HwCommonModelHttpUtils", "closeInputStream inputStream is null");
    }

    public static Bitmap d(InputStream inputStream) {
        try {
            byte[] bArrC = c(inputStream);
            if (bArrC == null || bArrC.length <= 0) {
                LogUtil.j("HwCommonModelHttpUtils", "index is out of Bounds in bytes.");
                return null;
            }
            return BitmapFactory.decodeByteArray(bArrC, 0, bArrC.length, null);
        } catch (IOException unused) {
            LogUtil.e("HwCommonModelHttpUtils", "readInputStream IOException,conversion failed");
            return null;
        } catch (IllegalArgumentException e) {
            LogUtil.e("HwCommonModelHttpUtils", "readInputStream IllegalArgumentException", e.getMessage());
            return null;
        }
    }
}
