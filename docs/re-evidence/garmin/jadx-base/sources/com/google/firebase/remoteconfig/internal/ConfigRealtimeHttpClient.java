package com.google.firebase.remoteconfig.internal;

import a73.f;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.exoplayer2.analytics.q;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.common.net.HttpHeaders;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.remoteconfig.BuildConfig;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.BooleanUtils;
import org.json.JSONObject;
import v.e0;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigRealtimeHttpClient {
    private static final String API_KEY_HEADER = "X-Goog-Api-Key";
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};
    private static final Pattern GMP_APP_ID_PATTERN = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    private static final String INSTALLATIONS_AUTH_TOKEN_HEADER = "X-Goog-Firebase-Installations-Auth";
    private static final String X_ACCEPT_RESPONSE_STREAMING = "X-Accept-Response-Streaming";
    private static final String X_ANDROID_CERT_HEADER = "X-Android-Cert";
    private static final String X_ANDROID_PACKAGE_HEADER = "X-Android-Package";
    private static final String X_GOOGLE_GFE_CAN_RETRY = "X-Google-GFE-Can-Retry";
    ConfigCacheClient activatedCache;
    private ConfigAutoFetch configAutoFetch;
    private final ConfigFetchHandler configFetchHandler;
    private final Context context;
    private final FirebaseApp firebaseApp;
    private final FirebaseInstallationsApi firebaseInstallations;
    private int httpRetriesRemaining;
    private HttpURLConnection httpURLConnection;
    private final Set<ConfigUpdateListener> listeners;
    private final String namespace;
    private final ScheduledExecutorService scheduledExecutorService;
    private final ConfigSharedPrefsClient sharedPrefsClient;
    private final int ORIGINAL_RETRIES = 8;
    private boolean isHttpConnectionRunning = false;
    private final Random random = new Random();
    private final Clock clock = DefaultClock.getInstance();
    private boolean isRealtimeDisabled = false;
    private boolean isInBackground = false;
    private final Object backgroundLock = new Object();

    public ConfigRealtimeHttpClient(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, String str, Set<ConfigUpdateListener> set, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        this.listeners = set;
        this.scheduledExecutorService = scheduledExecutorService;
        this.httpRetriesRemaining = Math.max(8 - configSharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams(), 1);
        this.firebaseApp = firebaseApp;
        this.configFetchHandler = configFetchHandler;
        this.firebaseInstallations = firebaseInstallationsApi;
        this.activatedCache = configCacheClient;
        this.context = context;
        this.namespace = str;
        this.sharedPrefsClient = configSharedPrefsClient;
    }

    private synchronized boolean canMakeHttpStreamConnection() {
        return (this.listeners.isEmpty() || this.isHttpConnectionRunning || this.isRealtimeDisabled || this.isInBackground) ? false : true;
    }

    private synchronized boolean checkAndSetHttpConnectionFlagIfNotRunning() {
        boolean zCanMakeHttpStreamConnection;
        zCanMakeHttpStreamConnection = canMakeHttpStreamConnection();
        if (zCanMakeHttpStreamConnection) {
            setIsHttpConnectionRunning(true);
        }
        return zCanMakeHttpStreamConnection;
    }

    private void closeHttpConnectionInputStream(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    private JSONObject createRequestBody(String str) {
        HashMap map = new HashMap();
        map.put("project", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()));
        map.put("namespace", this.namespace);
        map.put("lastKnownVersionNumber", Long.toString(this.configFetchHandler.getTemplateVersionNumber()));
        map.put(RemoteConfigConstants.RequestFieldKey.APP_ID, this.firebaseApp.getOptions().getApplicationId());
        map.put(RemoteConfigConstants.RequestFieldKey.SDK_VERSION, BuildConfig.VERSION_NAME);
        map.put(RemoteConfigConstants.RequestFieldKey.INSTANCE_ID, str);
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void enableBackoff() {
        this.isRealtimeDisabled = true;
    }

    private static String extractProjectNumberFromAppId(String str) {
        Matcher matcher = GMP_APP_ID_PATTERN.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    private String getFingerprintHashForPackage() {
        try {
            Context context = this.context;
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes != null) {
                return Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
            this.context.getPackageName();
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            this.context.getPackageName();
            return null;
        }
    }

    private long getRandomizedBackoffDurationInMillis(int i14) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        int length = iArr.length;
        if (i14 >= length) {
            i14 = length;
        }
        long millis = TimeUnit.MINUTES.toMillis(iArr[i14 - 1]);
        return (millis / 2) + ((long) this.random.nextInt((int) millis));
    }

    private String getRealtimeURL(String str) {
        return e0.g("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", extractProjectNumberFromAppId(this.firebaseApp.getOptions().getApplicationId()), "/namespaces/", str, ":streamFetchInvalidations");
    }

    private URL getUrl() {
        try {
            return new URL(getRealtimeURL(this.namespace));
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    private boolean isStatusCodeRetryable(int i14) {
        return i14 == 408 || i14 == 429 || i14 == 502 || i14 == 503 || i14 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b8 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #2 {all -> 0x0041, blocks: (B:9:0x002d, B:42:0x00b4, B:44:0x00b8), top: B:83:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v33, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Integer, java.lang.Object] */
    public /* synthetic */ Task lambda$beginRealtimeHttpStream$1(Task task, Task task2) throws Throwable {
        InputStream errorStream;
        Integer num;
        Throwable th3;
        ?? ValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z14 = true;
        try {
            try {
                if (!task.isSuccessful()) {
                    throw new IOException(task.getException());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) task.getResult();
                this.httpURLConnection = httpURLConnection;
                task = httpURLConnection.getInputStream();
                try {
                    errorStream = this.httpURLConnection.getErrorStream();
                    try {
                        int responseCode = this.httpURLConnection.getResponseCode();
                        ValueOf = Integer.valueOf(responseCode);
                        if (responseCode == 200) {
                            try {
                                resetRetryCount();
                                this.sharedPrefsClient.resetRealtimeBackoff();
                                ConfigAutoFetch configAutoFetchStartAutoFetch = startAutoFetch(this.httpURLConnection);
                                this.configAutoFetch = configAutoFetchStartAutoFetch;
                                configAutoFetchStartAutoFetch.listenForNotifications();
                            } catch (IOException unused) {
                                if (this.isInBackground) {
                                    resetRetryCount();
                                }
                                closeRealtimeHttpConnection(task, errorStream);
                                setIsHttpConnectionRunning(false);
                                if (this.isInBackground || (ValueOf != 0 && !isStatusCodeRetryable(ValueOf.intValue()))) {
                                    z14 = false;
                                }
                                if (z14) {
                                    updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                                }
                                if (!z14 || ValueOf.intValue() == 200) {
                                    retryHttpConnectionWhenBackoffEnds();
                                } else {
                                    String forbiddenErrorResponseMessage = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                    if (ValueOf.intValue() == 403) {
                                        forbiddenErrorResponseMessage = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                                    }
                                    firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(ValueOf.intValue(), forbiddenErrorResponseMessage, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                                }
                                this.httpURLConnection = null;
                                this.configAutoFetch = null;
                                return Tasks.forResult(null);
                            }
                        }
                        closeRealtimeHttpConnection(task, errorStream);
                        setIsHttpConnectionRunning(false);
                        z14 = !this.isInBackground && isStatusCodeRetryable(responseCode);
                        if (z14) {
                            updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                        }
                        if (z14 || responseCode == 200) {
                            retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                            if (responseCode == 403) {
                                forbiddenErrorResponseMessage2 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                            firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, forbiddenErrorResponseMessage2, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR);
                            propagateErrors(firebaseRemoteConfigServerException);
                        }
                    } catch (IOException unused2) {
                        ValueOf = 0;
                    } catch (Throwable th4) {
                        num = null;
                        th3 = th4;
                        closeRealtimeHttpConnection(task, errorStream);
                        setIsHttpConnectionRunning(false);
                        if (this.isInBackground || (num != null && !isStatusCodeRetryable(num.intValue()))) {
                            z14 = false;
                        }
                        if (z14) {
                            updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                        }
                        if (z14 || num.intValue() == 200) {
                            retryHttpConnectionWhenBackoffEnds();
                        } else {
                            String forbiddenErrorResponseMessage3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", num);
                            if (num.intValue() == 403) {
                                forbiddenErrorResponseMessage3 = parseForbiddenErrorResponseMessage(this.httpURLConnection.getErrorStream());
                            }
                            propagateErrors(new FirebaseRemoteConfigServerException(num.intValue(), forbiddenErrorResponseMessage3, FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                        }
                        throw th3;
                    }
                } catch (IOException unused3) {
                    errorStream = null;
                    task = task;
                    ValueOf = errorStream;
                    if (this.isInBackground) {
                        resetRetryCount();
                    }
                    closeRealtimeHttpConnection(task, errorStream);
                    setIsHttpConnectionRunning(false);
                    if (this.isInBackground) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        updateBackoffMetadataWithLastFailedStreamConnectionTime(new Date(this.clock.currentTimeMillis()));
                    }
                    if (z14) {
                    }
                    retryHttpConnectionWhenBackoffEnds();
                    this.httpURLConnection = null;
                    this.configAutoFetch = null;
                    return Tasks.forResult(null);
                } catch (Throwable th5) {
                    num = null;
                    th3 = th5;
                    errorStream = null;
                }
                this.httpURLConnection = null;
                this.configAutoFetch = null;
                return Tasks.forResult(null);
            } catch (Throwable th6) {
                th3 = th6;
            }
        } catch (IOException unused4) {
            task = 0;
            errorStream = null;
        } catch (Throwable th7) {
            errorStream = null;
            num = null;
            th3 = th7;
            task = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$createRealtimeConnection$0(Task task, Task task2, Task task3) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task.getException()));
        }
        if (!task2.isSuccessful()) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task2.getException()));
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) getUrl().openConnection();
            setRequestParams(httpURLConnection, (String) task2.getResult(), ((InstallationTokenResult) task.getResult()).getToken());
            return Tasks.forResult(httpURLConnection);
        } catch (IOException e4) {
            return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e4));
        }
    }

    private synchronized void makeRealtimeHttpConnection(long j8) {
        try {
            if (canMakeHttpStreamConnection()) {
                int i14 = this.httpRetriesRemaining;
                if (i14 > 0) {
                    this.httpRetriesRemaining = i14 - 1;
                    this.scheduledExecutorService.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ConfigRealtimeHttpClient.this.beginRealtimeHttpStream();
                        }
                    }, j8, TimeUnit.MILLISECONDS);
                } else if (!this.isInBackground) {
                    propagateErrors(new FirebaseRemoteConfigClientException("Unable to connect to the server. Check your connection and try again.", FirebaseRemoteConfigException.Code.CONFIG_UPDATE_STREAM_ERROR));
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private String parseForbiddenErrorResponseMessage(InputStream inputStream) {
        StringBuilder sb3 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb3.append(line);
            }
        } catch (IOException unused) {
            if (sb3.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb3.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void propagateErrors(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator<ConfigUpdateListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onError(firebaseRemoteConfigException);
        }
    }

    private synchronized void resetRetryCount() {
        this.httpRetriesRemaining = 8;
    }

    private void setCommonRequestHeaders(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setRequestProperty(INSTALLATIONS_AUTH_TOKEN_HEADER, str);
        httpURLConnection.setRequestProperty(API_KEY_HEADER, this.firebaseApp.getOptions().getApiKey());
        httpURLConnection.setRequestProperty(X_ANDROID_PACKAGE_HEADER, this.context.getPackageName());
        httpURLConnection.setRequestProperty(X_ANDROID_CERT_HEADER, getFingerprintHashForPackage());
        httpURLConnection.setRequestProperty(X_GOOGLE_GFE_CAN_RETRY, BooleanUtils.YES);
        httpURLConnection.setRequestProperty(X_ACCEPT_RESPONSE_STREAMING, BooleanUtils.TRUE);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
    }

    private synchronized void setIsHttpConnectionRunning(boolean z14) {
        this.isHttpConnectionRunning = z14;
    }

    private void updateBackoffMetadataWithLastFailedStreamConnectionTime(Date date) {
        int numFailedStreams = this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams() + 1;
        this.sharedPrefsClient.setRealtimeBackoffMetadata(numFailedStreams, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedStreams)));
    }

    @SuppressLint({"VisibleForTests", "DefaultLocale"})
    public void beginRealtimeHttpStream() {
        if (checkAndSetHttpConnectionFlagIfNotRunning()) {
            if (new Date(this.clock.currentTimeMillis()).before(this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime())) {
                retryHttpConnectionWhenBackoffEnds();
            } else {
                Task<HttpURLConnection> taskCreateRealtimeConnection = createRealtimeConnection();
                Tasks.whenAllComplete((Task<?>[]) new Task[]{taskCreateRealtimeConnection}).continueWith(this.scheduledExecutorService, new q(9, this, taskCreateRealtimeConnection));
            }
        }
    }

    public void closeRealtimeHttpConnection(InputStream inputStream, InputStream inputStream2) {
        HttpURLConnection httpURLConnection = this.httpURLConnection;
        if (httpURLConnection != null && !this.isInBackground) {
            httpURLConnection.disconnect();
        }
        closeHttpConnectionInputStream(inputStream);
        closeHttpConnectionInputStream(inputStream2);
    }

    @SuppressLint({"VisibleForTests"})
    public Task<HttpURLConnection> createRealtimeConnection() {
        Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
        Task<String> id3 = this.firebaseInstallations.getId();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{token, id3}).continueWithTask(this.scheduledExecutorService, new f(this, 11, token, id3));
    }

    @SuppressLint({"VisibleForTests"})
    public Date getBackoffEndTime() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime();
    }

    @SuppressLint({"VisibleForTests"})
    public int getNumberOfFailedStreams() {
        return this.sharedPrefsClient.getRealtimeBackoffMetadata().getNumFailedStreams();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized void retryHttpConnectionWhenBackoffEnds() {
        makeRealtimeHttpConnection(Math.max(0L, this.sharedPrefsClient.getRealtimeBackoffMetadata().getBackoffEndTime().getTime() - new Date(this.clock.currentTimeMillis()).getTime()));
    }

    public void setIsInBackground(boolean z14) {
        HttpURLConnection httpURLConnection;
        synchronized (this.backgroundLock) {
            try {
                this.isInBackground = z14;
                ConfigAutoFetch configAutoFetch = this.configAutoFetch;
                if (configAutoFetch != null) {
                    configAutoFetch.setIsInBackground(z14);
                }
                if (z14 && (httpURLConnection = this.httpURLConnection) != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    public void setRequestParams(HttpURLConnection httpURLConnection, String str, String str2) throws IOException {
        httpURLConnection.setRequestMethod(FirebasePerformance.HttpMethod.POST);
        setCommonRequestHeaders(httpURLConnection, str2);
        byte[] bytes = createRequestBody(str).toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    @SuppressLint({"VisibleForTests"})
    public synchronized ConfigAutoFetch startAutoFetch(HttpURLConnection httpURLConnection) {
        return new ConfigAutoFetch(httpURLConnection, this.configFetchHandler, this.activatedCache, this.listeners, new ConfigUpdateListener() { // from class: com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient.2
            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onError(FirebaseRemoteConfigException firebaseRemoteConfigException) {
                ConfigRealtimeHttpClient.this.enableBackoff();
                ConfigRealtimeHttpClient.this.propagateErrors(firebaseRemoteConfigException);
            }

            @Override // com.google.firebase.remoteconfig.ConfigUpdateListener
            public void onUpdate(ConfigUpdate configUpdate) {
            }
        }, this.scheduledExecutorService, this.sharedPrefsClient);
    }

    public void startHttpConnection() {
        makeRealtimeHttpConnection(0L);
    }
}
