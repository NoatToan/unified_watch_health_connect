package com.google.firebase.installations.remote;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsException;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.platforminfo.UserAgentPublisher;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallationServiceClient {
    private static final String A = "X-Android-Cert";
    private static final String B = "x-goog-fis-android-iid-migration-auth";
    private static final String C = "x-goog-api-key";
    private static final int D = 10000;
    private static final int F = 1;
    private static final String H = "a:";
    private static final String I = "Firebase-Installations";

    @VisibleForTesting
    public static final String J = "Invalid Expiration Timestamp.";
    private static final int f = 32768;
    private static final int g = 32769;
    private static final int h = 32770;
    private static final int i = 32771;
    private static final String j = "firebaseinstallations.googleapis.com";
    private static final String k = "projects/%s/installations";
    private static final String l = "projects/%s/installations/%s/authTokens:generate";
    private static final String m = "projects/%s/installations/%s";
    private static final String n = "v1";
    private static final String o = "FIS_v2";
    private static final String p = "Content-Type";
    private static final String q = "Accept";
    private static final String r = "application/json";
    private static final String s = "Content-Encoding";
    private static final String t = "gzip";
    private static final String u = "Cache-Control";
    private static final String v = "no-cache";
    private static final String w = "fire-installations-id";
    private static final String x = "x-firebase-client-log-type";
    private static final String y = "x-firebase-client";
    private static final String z = "X-Android-Package";
    private boolean a;
    private final Context b;
    private final Provider<UserAgentPublisher> c;
    private final Provider<HeartBeatInfo> d;
    private final c e = new c();
    private static final Pattern E = Pattern.compile("[0-9]+s");
    private static final Charset G = Charset.forName("UTF-8");

    public FirebaseInstallationServiceClient(@NonNull Context context, @NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2) {
        this.b = context;
        this.c = provider;
        this.d = provider2;
    }

    private static String a(@Nullable String str, @NonNull String str2, @NonNull String str3) {
        String str4;
        Object[] objArr = new Object[3];
        objArr[0] = str2;
        objArr[1] = str3;
        if (TextUtils.isEmpty(str)) {
            str4 = "";
        } else {
            str4 = ", " + str;
        }
        objArr[2] = str4;
        return String.format("Firebase options used while communicating with Firebase server APIs: %s, %s%s", objArr);
    }

    private static JSONObject b(@Nullable String str, @NonNull String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", o);
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "a:17.0.0");
            return jSONObject;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private static JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "a:17.0.0");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            return jSONObject2;
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }

    private String d() {
        try {
            Context context = this.b;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.b.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("ContentValues", "No such package: " + this.b.getPackageName(), e);
            return null;
        }
    }

    private URL e(String str) throws FirebaseInstallationsException {
        try {
            return new URL(String.format("https://%s/%s/%s", j, "v1", str));
        } catch (MalformedURLException e) {
            throw new FirebaseInstallationsException(e.getMessage(), FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    private static byte[] f(JSONObject jSONObject) throws IOException {
        return jSONObject.toString().getBytes("UTF-8");
    }

    private static boolean g(int i2) {
        return i2 >= 200 && i2 < 300;
    }

    private static void h() {
        Log.e(I, "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
    }

    private static void i(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2, @NonNull String str3) {
        String strM = m(httpURLConnection);
        if (TextUtils.isEmpty(strM)) {
            return;
        }
        Log.w(I, strM);
        Log.w(I, a(str, str2, str3));
    }

    private HttpURLConnection j(URL url, String str) throws FirebaseInstallationsException {
        HeartBeatInfo.HeartBeat heartBeatCode;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.addRequestProperty("Content-Type", "application/json");
            httpURLConnection.addRequestProperty("Accept", "application/json");
            httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpURLConnection.addRequestProperty("Cache-Control", "no-cache");
            httpURLConnection.addRequestProperty(z, this.b.getPackageName());
            if (this.d.get() != null && this.c.get() != null && (heartBeatCode = this.d.get().getHeartBeatCode(w)) != HeartBeatInfo.HeartBeat.NONE) {
                httpURLConnection.addRequestProperty(y, this.c.get().getUserAgent());
                httpURLConnection.addRequestProperty(x, Integer.toString(heartBeatCode.getCode()));
            }
            httpURLConnection.addRequestProperty(A, d());
            httpURLConnection.addRequestProperty(C, str);
            return httpURLConnection;
        } catch (IOException unused) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
    }

    @VisibleForTesting
    public static long k(String str) {
        Preconditions.checkArgument(E.matcher(str).matches(), J);
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    private InstallationResponse l(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, G));
        TokenResult.Builder builder = TokenResult.builder();
        InstallationResponse.Builder builder2 = InstallationResponse.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("name")) {
                builder2.setUri(jsonReader.nextString());
            } else if (strNextName.equals("fid")) {
                builder2.setFid(jsonReader.nextString());
            } else if (strNextName.equals("refreshToken")) {
                builder2.setRefreshToken(jsonReader.nextString());
            } else if (strNextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if (strNextName2.equals("token")) {
                        builder.setToken(jsonReader.nextString());
                    } else if (strNextName2.equals("expiresIn")) {
                        builder.setTokenExpirationTimestamp(k(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                builder2.setAuthToken(builder.build());
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder2.setResponseCode(InstallationResponse.ResponseCode.OK).build();
    }

    @Nullable
    private static String m(HttpURLConnection httpURLConnection) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        if (errorStream == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, G));
        try {
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append('\n');
                    return null;
                }
                String str = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return str;
            } catch (IOException unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader.close();
            return null;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (IOException unused4) {
            }
            throw th;
        }
    }

    private TokenResult n(HttpURLConnection httpURLConnection) throws IOException, AssertionError {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, G));
        TokenResult.Builder builder = TokenResult.builder();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (strNextName.equals("token")) {
                builder.setToken(jsonReader.nextString());
            } else if (strNextName.equals("expiresIn")) {
                builder.setTokenExpirationTimestamp(k(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return builder.setResponseCode(TokenResult.ResponseCode.OK).build();
    }

    private void o(HttpURLConnection httpURLConnection, @Nullable String str, @NonNull String str2) throws IOException {
        q(httpURLConnection, f(b(str, str2)));
    }

    private void p(HttpURLConnection httpURLConnection) throws IOException {
        q(httpURLConnection, f(c()));
    }

    private static void q(URLConnection uRLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = uRLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @NonNull
    public InstallationResponse createFirebaseInstallation(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull String str4, @Nullable String str5) throws FirebaseInstallationsException {
        InstallationResponse installationResponseL;
        if (!this.e.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlE = e(String.format(k, str3));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(g);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod("POST");
                    httpURLConnectionJ.setDoOutput(true);
                    if (str5 != null) {
                        httpURLConnectionJ.addRequestProperty(B, str5);
                    }
                    o(httpURLConnectionJ, str2, str4);
                    int responseCode = httpURLConnectionJ.getResponseCode();
                    this.e.f(responseCode);
                    if (g(responseCode)) {
                        installationResponseL = l(httpURLConnectionJ);
                    } else {
                        i(httpURLConnectionJ, str4, str, str3);
                        if (responseCode == 429) {
                            throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                        }
                        if (responseCode < 500 || responseCode >= 600) {
                            h();
                            installationResponseL = InstallationResponse.builder().setResponseCode(InstallationResponse.ResponseCode.BAD_CONFIG).build();
                        } else {
                            httpURLConnectionJ.disconnect();
                            TrafficStats.clearThreadStatsTag();
                        }
                    }
                    httpURLConnectionJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return installationResponseL;
                } catch (IOException | AssertionError unused) {
                }
            } catch (Throwable th) {
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public void deleteFirebaseInstallation(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        int i2 = 0;
        URL urlE = e(String.format(m, str3, str2));
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(h);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                httpURLConnectionJ.setRequestMethod(FirebasePerformance.HttpMethod.DELETE);
                httpURLConnectionJ.addRequestProperty("Authorization", "FIS_v2 " + str4);
                int responseCode = httpURLConnectionJ.getResponseCode();
                if (responseCode != 200 && responseCode != 401 && responseCode != 404) {
                    i(httpURLConnectionJ, null, str, str3);
                    if (responseCode != 429 && (responseCode < 500 || responseCode >= 600)) {
                        h();
                        throw new FirebaseInstallationsException("Bad config while trying to delete FID", FirebaseInstallationsException.Status.BAD_CONFIG);
                    }
                    i2++;
                    httpURLConnectionJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
                return;
            } catch (IOException unused) {
            } catch (Throwable th) {
                httpURLConnectionJ.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @NonNull
    public TokenResult generateAuthToken(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull String str4) throws FirebaseInstallationsException {
        TokenResult tokenResultN;
        if (!this.e.b()) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        URL urlE = e(String.format(l, str3, str2));
        for (int i2 = 0; i2 <= 1; i2++) {
            TrafficStats.setThreadStatsTag(i);
            HttpURLConnection httpURLConnectionJ = j(urlE, str);
            try {
                try {
                    httpURLConnectionJ.setRequestMethod("POST");
                    httpURLConnectionJ.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionJ.setDoOutput(true);
                    p(httpURLConnectionJ);
                    int responseCode = httpURLConnectionJ.getResponseCode();
                    this.e.f(responseCode);
                    if (g(responseCode)) {
                        tokenResultN = n(httpURLConnectionJ);
                    } else {
                        i(httpURLConnectionJ, null, str, str3);
                        if (responseCode == 401 || responseCode == 404) {
                            tokenResultN = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.AUTH_ERROR).build();
                        } else {
                            if (responseCode == 429) {
                                throw new FirebaseInstallationsException("Firebase servers have received too many requests from this client in a short period of time. Please try again later.", FirebaseInstallationsException.Status.TOO_MANY_REQUESTS);
                            }
                            if (responseCode < 500 || responseCode >= 600) {
                                h();
                                tokenResultN = TokenResult.builder().setResponseCode(TokenResult.ResponseCode.BAD_CONFIG).build();
                            } else {
                                httpURLConnectionJ.disconnect();
                                TrafficStats.clearThreadStatsTag();
                            }
                        }
                    }
                    httpURLConnectionJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    return tokenResultN;
                } catch (Throwable th) {
                    httpURLConnectionJ.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }
}
