package com.xmlywind.sdk.base.common;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.xmlywind.logger.SigmobLog;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class m extends AsyncTask<String, Void, HashMap<String, String>> {
    private final a a;

    public interface a {
        void a(String str, String str2);

        void a(String str, Throwable th);
    }

    public static String a(String str) {
        if (str.toLowerCase().contains(".apk")) {
            String strB = b(str);
            if (!TextUtils.isEmpty(strB)) {
                return strB;
            }
            String strC = c(str);
            if (!TextUtils.isEmpty(strC)) {
                return strC;
            }
        }
        return null;
    }

    private static String a(String str, HttpURLConnection httpURLConnection) throws URISyntaxException, IOException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 200 || responseCode >= 400) {
            return null;
        }
        try {
            return URLUtil.guessFileName(str, httpURLConnection.getHeaderField("Content-Disposition"), null);
        } catch (IllegalArgumentException unused) {
            SigmobLog.e("Invalid URL redirection. baseUrl=" + str);
            throw new URISyntaxException(str, "Unable to parse invalid URL");
        } catch (NullPointerException e) {
            SigmobLog.e("Invalid URL redirection. baseUrl=" + str);
            throw e;
        }
    }

    public static String b(String str) {
        try {
            Matcher matcher = Pattern.compile("(fsname=)(.*?apk)", 2).matcher(str);
            if (matcher.find()) {
                return matcher.group(2);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String c(String str) {
        try {
            Matcher matcher = Pattern.compile("[\\w\\.]+\\.apk", 2).matcher(str);
            if (matcher.find()) {
                return matcher.group(0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private String d(String str) {
        String str2 = null;
        while (str != null) {
            try {
                str2 = str;
                str = e(str);
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
                return str;
            }
        }
        return str2;
    }

    private static String e(String str) {
        Throwable th;
        HttpURLConnection httpURLConnection;
        String str2 = null;
        try {
            httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
            try {
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.addRequestProperty(com.xmlywind.sdk.common.e.i.USER_AGENT.a(), com.xmlywind.sdk.common.e.f.c());
                int responseCode = httpURLConnection.getResponseCode();
                String headerField = httpURLConnection.getHeaderField("Location");
                if (responseCode >= 300 && responseCode < 400) {
                    str2 = headerField;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    SigmobLog.e("resolveRedirectLocation fail", th);
                    return str2;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection = null;
        }
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    private String f(String str) {
        HttpURLConnection httpURLConnection;
        String strC;
        HttpURLConnection httpURLConnection2 = null;
        try {
            if (TextUtils.isEmpty(null)) {
                httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.addRequestProperty(com.xmlywind.sdk.common.e.i.USER_AGENT.a(), com.xmlywind.sdk.common.e.f.c());
                    String strA = a(str, httpURLConnection);
                    if (strA != null) {
                        if (strA.contains("fsname=")) {
                            strC = b(str);
                        } else if (strA.contains(".apk")) {
                            strC = c(strA);
                        } else {
                            httpURLConnection2 = httpURLConnection;
                            strC = strA;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        strC = null;
                    } else {
                        String[] strArrSplit = Uri.parse(str).getPath().split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
                        if (strArrSplit.length > 1) {
                            strA = strArrSplit[strArrSplit.length - 1];
                        }
                        if (TextUtils.isEmpty(strA) || !strA.toLowerCase().endsWith(".apk")) {
                            strC = com.xmlywind.sdk.common.utils.k.a(str) + ".apk";
                        } else {
                            strC = null;
                        }
                    }
                    httpURLConnection2 = httpURLConnection;
                } catch (Throwable th) {
                    th = th;
                    try {
                        SigmobLog.e("getDownloadUrlFilename", th);
                    } finally {
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    }
                }
            } else {
                strC = a(str);
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            return strC;
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection = null;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public HashMap<String, String> doInBackground(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        String strD = strArr[0];
        try {
            try {
                strD = d(strD);
            } catch (Throwable th) {
                SigmobLog.e(th.getMessage());
            }
            map.put("url", strD);
            map.put("fileName", f(strD));
            return map;
        } catch (Throwable th2) {
            SigmobLog.e(th2.getMessage());
            return map;
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(HashMap<String, String> map) {
        String str;
        String str2 = null;
        if (map != null) {
            str2 = map.get("fileName");
            str = map.get("url");
        } else {
            str = null;
        }
        this.a.a(str2, str);
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        this.a.a("Task for resolving url was cancelled", (Throwable) null);
    }
}
