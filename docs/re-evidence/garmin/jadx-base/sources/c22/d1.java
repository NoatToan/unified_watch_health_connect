package c22;

import android.os.Build;
import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import com.google.firebase.perf.FirebasePerformance;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Locale;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public class d1 {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f23018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f23019b;

        public a(String str, b bVar) {
            this.f23018a = str;
            this.f23019b = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            String str = this.f23018a;
            if (((o) KoinJavaComponent.get(o.class)).a()) {
                try {
                    StringBuilder sb3 = new StringBuilder();
                    gg1.v0.T.getClass();
                    gg1.v0 v0VarB = gg1.v0.a.b();
                    v0VarB.getClass();
                    sb3.append("https://" + v0VarB.f77337c);
                    sb3.append("/mobile-config/api/events/");
                    sb3.append(str);
                    URL url = new URL(sb3.toString());
                    b bVar = this.f23019b;
                    if (str != null && str.equals("android_pairingFailed") && TextUtils.isEmpty(bVar.f23028i)) {
                        bVar.f23028i = "Unknown Error";
                    }
                    d1.a(url, bVar, str);
                } catch (MalformedURLException e4) {
                    com.garmin.android.apps.connectmobile.i2.g(e4, "GarminAnalyticsUtil");
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f23021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f23023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f23024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f23025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f23026g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f23027h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f23028i;

        public b(String str, String str2, long j8, String str3) {
            this.f23020a = str;
            this.f23021b = str2;
            this.f23027h = j8;
            this.f23028i = str3;
            ((o) KoinJavaComponent.get(o.class)).getClass();
            this.f23022c = "5.30.1";
            this.f23023d = "Android";
            this.f23024e = Build.VERSION.RELEASE;
            this.f23025f = Build.MANUFACTURER + StringUtils.SPACE + Build.MODEL + StringUtils.SPACE + Build.PRODUCT;
            this.f23026g = ((bv.d) KoinJavaComponent.get(bv.d.class)).getUserProfilePk();
        }

        public final String a(String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("deviceMacAddress", this.f23020a);
                jSONObject.put("deviceName", this.f23021b);
                jSONObject.put("gcmAppVersion", this.f23022c);
                jSONObject.put("os", this.f23023d);
                jSONObject.put("osVersion", this.f23024e);
                jSONObject.put("phoneModel", this.f23025f);
                jSONObject.put("userPk", this.f23026g);
                if (str != null && str.equals("android_pairingSuccess")) {
                    jSONObject.put("garminDeviceUnitId", this.f23027h);
                }
                jSONObject.put("errorMessage", this.f23028i);
                return jSONObject.toString();
            } catch (JSONException e4) {
                com.garmin.android.apps.connectmobile.i2.i("GarminAnalyticsUtil", "toJSON: " + e4.getMessage());
                return "";
            }
        }
    }

    public static void a(URL url, b bVar, String str) throws Throwable {
        try {
            String strA = bVar.a(str);
            com.garmin.android.apps.connectmobile.i2.d("GarminAnalyticsUtil", str + ": " + strA);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, "" + strA.length());
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.POST);
            b(httpURLConnection);
            DataOutputStream dataOutputStream = null;
            try {
                DataOutputStream dataOutputStream2 = new DataOutputStream(httpURLConnection.getOutputStream());
                try {
                    dataOutputStream2.writeBytes(strA);
                    dataOutputStream2.flush();
                    dataOutputStream2.close();
                    try {
                        InputStream inputStream = httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                com.garmin.android.apps.connectmobile.i2.o("Cannot close stream", th3);
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    dataOutputStream = dataOutputStream2;
                    if (dataOutputStream != null) {
                        dataOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (IOException e4) {
            com.garmin.android.apps.connectmobile.i2.b(e4);
        } catch (NullPointerException e14) {
            com.garmin.android.apps.connectmobile.i2.b(e14);
        } catch (MalformedInputException e15) {
            com.garmin.android.apps.connectmobile.i2.b(e15);
        }
    }

    public static void b(HttpURLConnection httpURLConnection) {
        ((o) KoinJavaComponent.get(o.class)).getClass();
        httpURLConnection.addRequestProperty("X-app-ver", Integer.toString(11657));
        httpURLConnection.addRequestProperty("X-lang", Locale.getDefault().getLanguage());
    }

    public static void c(String str, b bVar, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        new Thread(new a(str, bVar)).start();
    }
}
