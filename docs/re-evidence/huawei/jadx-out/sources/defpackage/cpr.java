package defpackage;

import com.huawei.hms.network.embedded.y;
import health.compact.a.LogUtil;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes4.dex */
public class cpr {
    public static long a(String str) throws Throwable {
        int i = 0;
        while (i <= 3) {
            long jA = a(str, i);
            if (jA != -1) {
                if (i > 0) {
                    LogUtil.b("NetworkTimeUtils", "Successfully fetched timestamp on attempt ", Integer.valueOf(i + 1));
                }
                return jA;
            }
            i++;
            LogUtil.e("NetworkTimeUtils", "Attempt ", Integer.valueOf(i), " failed.");
            if (i <= 3) {
                LogUtil.b("NetworkTimeUtils", "Retrying in ", 2000L, " ms...");
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e) {
                    LogUtil.e("NetworkTimeUtils", "Retry delay interrupted.", e);
                    Thread.currentThread().interrupt();
                    return -1L;
                }
            }
        }
        LogUtil.d("NetworkTimeUtils", "Failed to get server timestamp after ", 4, " attempts for ", str);
        return -1L;
    }

    private static long a(String str, int i) throws Throwable {
        int i2 = i + 1;
        LogUtil.b("NetworkTimeUtils", "Performing attempt ", Integer.valueOf(i2), " for URL: ", str);
        long jC = c(str, "HEAD", i);
        if (jC != -1) {
            return jC;
        }
        LogUtil.e("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), "] HEAD request did not yield valid timestamp. Trying GET.");
        return c(str, "GET", i);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    private static long c(String str, String str2, int i) throws Throwable {
        HttpURLConnection httpURLConnectionB;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                httpURLConnectionB = b(str, str2);
                try {
                    int responseCode = httpURLConnectionB.getResponseCode();
                    int i2 = i + 1;
                    LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), "] ", str2, " Response Code: ", Integer.valueOf(responseCode));
                    if (responseCode >= 200 && responseCode < 300) {
                        long jA = a(httpURLConnectionB.getHeaderField("Date"), i, str2);
                        if (httpURLConnectionB != null) {
                            httpURLConnectionB.disconnect();
                            LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), "] ", str2, " connection disconnected.");
                        }
                        return jA;
                    }
                    LogUtil.e("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), "] ", str2, " request failed with non-2xx response code: " + responseCode);
                    if (httpURLConnectionB == null) {
                        return -1L;
                    }
                    httpURLConnectionB.disconnect();
                    LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), "] ", str2, " connection disconnected.");
                    return -1L;
                } catch (IOException e) {
                    e = e;
                    httpURLConnection = httpURLConnectionB;
                    int i3 = i + 1;
                    LogUtil.d("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i3), "] IOException during ", str2, " request", e);
                    if (httpURLConnection == null) {
                        return -1L;
                    }
                    httpURLConnection.disconnect();
                    LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i3), "] ", str2, " connection disconnected.");
                    return -1L;
                } catch (Exception e2) {
                    e = e2;
                    httpURLConnection = httpURLConnectionB;
                    int i4 = i + 1;
                    LogUtil.d("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i4), "] Unexpected error during ", str2, " request", e);
                    if (httpURLConnection == null) {
                        return -1L;
                    }
                    httpURLConnection.disconnect();
                    LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i4), "] ", str2, " connection disconnected.");
                    return -1L;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionB;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                        LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i + 1), "] ", str2, " connection disconnected.");
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnectionB = null;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Exception e4) {
            e = e4;
        } catch (Throwable th3) {
            th = th3;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i + 1), "] ", str2, " connection disconnected.");
            }
            throw th;
        }
    }

    private static HttpURLConnection b(String str, String str2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod(str2);
        httpURLConnection.setConnectTimeout(y.f15619c);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setInstanceFollowRedirects(true);
        return httpURLConnection;
    }

    private static long a(String str, int i, String str2) {
        if (str == null || str.isEmpty()) {
            LogUtil.e("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i + 1), " via ", str2, "] Server did not provide a Date header or it was empty.");
            return -1L;
        }
        int i2 = i + 1;
        LogUtil.b("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), " via ", str2, "] Raw Date Header: '", str, "'");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            return simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            LogUtil.d("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), " via ", str2, "] Error parsing Date header: '", str, "'", e);
            return -1L;
        } catch (Exception e2) {
            LogUtil.d("NetworkTimeUtils", "[Attempt ", Integer.valueOf(i2), " via ", str2, "] Unexpected error parsing Date header: '", str, "'", e2);
            return -1L;
        }
    }
}
