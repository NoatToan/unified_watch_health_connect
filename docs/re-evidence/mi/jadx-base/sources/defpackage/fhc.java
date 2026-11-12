package defpackage;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public class fhc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f17785b = "6095";
    public String c;
    public String d;
    public ctc e;

    public fhc(String str, String str2, String str3, ctc ctcVar) {
        this.f17784a = str;
        this.c = str2;
        this.d = str3;
        this.e = ctcVar;
    }

    public final void a(boolean z, int i, String str) {
        ctc ctcVar = this.e;
        if (ctcVar != null) {
            if (z) {
                ctcVar.onSuccess(str);
            } else {
                ctcVar.onFail(i, str);
            }
        }
    }

    public final String b() {
        if (TextUtils.isEmpty(this.f17784a)) {
            throw new RuntimeException("ip is null");
        }
        if (TextUtils.isEmpty(this.c)) {
            throw new RuntimeException("path is null");
        }
        if (TextUtils.isEmpty(this.d)) {
            throw new RuntimeException("query is null");
        }
        return "http://" + this.f17784a + ":" + this.f17785b + "/" + this.c + "?" + this.d;
    }

    @Override // java.lang.Runnable
    public void run() {
        InputStream inputStream = null;
        try {
            try {
                try {
                    String strB = b();
                    URL url = new URL(strB);
                    ycm.b("RequestUrl: " + strB);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setReadTimeout(10000);
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.connect();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 200) {
                        inputStream = httpURLConnection.getInputStream();
                        StringBuilder sb = new StringBuilder();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                } else {
                                    sb.append(line.trim());
                                }
                            } catch (IOException e) {
                                a(false, 90002, "Error: read line Exception, " + e.getMessage());
                            }
                        }
                        a(true, 200, sb.toString());
                    } else {
                        a(false, responseCode, "Error: http response code Error!");
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            } catch (Exception e3) {
                a(false, 90001, "Error: Build Request Error, " + e3.getMessage());
                if (0 != 0) {
                    inputStream.close();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }
}
