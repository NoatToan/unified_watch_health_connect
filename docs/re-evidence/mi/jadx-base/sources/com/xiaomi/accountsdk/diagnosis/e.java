package com.xiaomi.accountsdk.diagnosis;

import android.text.TextUtils;
import com.xiaomi.accountsdk.account.XMPassport;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static com.xiaomi.accountsdk.diagnosis.a.a a() throws Throwable {
        String strB = b();
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        try {
            return com.xiaomi.accountsdk.diagnosis.a.a.a(new JSONObject(strB.replaceFirst(XMPassport.PASSPORT_SAFE_PREFIX, "")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private static String b() throws Throwable {
        HttpURLConnection httpURLConnection;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL("https://account.xiaomi.com/pass/preference").openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200 && responseCode != 202) {
                    httpURLConnection.disconnect();
                    return null;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        String string = sb.toString();
                        httpURLConnection.disconnect();
                        return string;
                    }
                    sb.append(line + "\n");
                }
            } catch (Throwable th2) {
                th = th2;
                if (httpURLConnection == null) {
                    throw th;
                }
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th3) {
            httpURLConnection = null;
            th = th3;
        }
    }
}
