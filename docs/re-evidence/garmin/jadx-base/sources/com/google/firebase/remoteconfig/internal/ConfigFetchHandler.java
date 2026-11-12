package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.android.exoplayer2.analytics.q;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.common.i;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import fb1.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class ConfigFetchHandler {
    static final String FIRST_OPEN_TIME_KEY = "_fot";
    static final int HTTP_TOO_MANY_REQUESTS = 429;
    private static final String X_FIREBASE_RC_FETCH_TYPE = "X-Firebase-RC-Fetch-Type";
    private final Provider<AnalyticsConnector> analyticsConnector;
    private final Clock clock;
    private final Map<String, String> customHttpHeaders;
    private final Executor executor;
    private final ConfigCacheClient fetchedConfigsCache;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final ConfigFetchHttpClient frcBackendApiClient;
    private final ConfigSharedPrefsClient frcSharedPrefs;
    private final Random randomGenerator;
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = 43200;
    static final int[] BACKOFF_TIME_DURATIONS_IN_MINUTES = {2, 4, 8, 16, 32, 64, 128, 256};

    public static class FetchResponse {
        private final Date fetchTime;
        private final ConfigContainer fetchedConfigs;
        private final String lastFetchETag;
        private final int status;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i14, ConfigContainer configContainer, String str) {
            this.fetchTime = date;
            this.status = i14;
            this.fetchedConfigs = configContainer;
            this.lastFetchETag = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date, ConfigContainer configContainer) {
            return new FetchResponse(date, 1, configContainer, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date getFetchTime() {
            return this.fetchTime;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.fetchedConfigs;
        }

        public String getLastFetchETag() {
            return this.lastFetchETag;
        }

        public int getStatus() {
            return this.status;
        }
    }

    public enum FetchType {
        BASE("BASE"),
        REALTIME("REALTIME");

        private final String value;

        FetchType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, Map<String, String> map) {
        this.firebaseInstallations = firebaseInstallationsApi;
        this.analyticsConnector = provider;
        this.executor = executor;
        this.clock = clock;
        this.randomGenerator = random;
        this.fetchedConfigsCache = configCacheClient;
        this.frcBackendApiClient = configFetchHttpClient;
        this.frcSharedPrefs = configSharedPrefsClient;
        this.customHttpHeaders = map;
    }

    private boolean areCachedFetchConfigsValid(long j8, Date date) {
        Date lastSuccessfulFetchTime = this.frcSharedPrefs.getLastSuccessfulFetchTime();
        if (lastSuccessfulFetchTime.equals(ConfigSharedPrefsClient.LAST_FETCH_TIME_NO_FETCH_YET)) {
            return false;
        }
        return date.before(new Date(TimeUnit.SECONDS.toMillis(j8) + lastSuccessfulFetchTime.getTime()));
    }

    private FirebaseRemoteConfigServerException createExceptionWithGenericMessage(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == HTTP_TOO_MANY_REQUESTS) {
                throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
            }
            if (httpStatusCode != 500) {
                switch (httpStatusCode) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: ".concat(str), firebaseRemoteConfigServerException);
    }

    private String createThrottledMessage(long j8) {
        return c.n("Fetch is throttled. Please wait before calling fetch again: ", DateUtils.formatElapsedTime(j8 / 1000));
    }

    private FetchResponse fetchFromBackend(String str, String str2, Date date, Map<String, String> map) throws FirebaseRemoteConfigFetchThrottledException, FirebaseRemoteConfigServerException {
        Date date2;
        try {
            date2 = date;
            try {
                FetchResponse fetchResponseFetch = this.frcBackendApiClient.fetch(this.frcBackendApiClient.createHttpURLConnection(), str, str2, getUserProperties(), this.frcSharedPrefs.getLastFetchETag(), map, getFirstOpenTime(), date2, this.frcSharedPrefs.getCustomSignals());
                if (fetchResponseFetch.getFetchedConfigs() != null) {
                    this.frcSharedPrefs.setLastTemplateVersion(fetchResponseFetch.getFetchedConfigs().getTemplateVersionNumber());
                }
                if (fetchResponseFetch.getLastFetchETag() != null) {
                    this.frcSharedPrefs.setLastFetchETag(fetchResponseFetch.getLastFetchETag());
                }
                this.frcSharedPrefs.resetBackoff();
                return fetchResponseFetch;
            } catch (FirebaseRemoteConfigServerException e4) {
                e = e4;
                FirebaseRemoteConfigServerException firebaseRemoteConfigServerException = e;
                ConfigSharedPrefsClient.BackoffMetadata backoffMetadataUpdateAndReturnBackoffMetadata = updateAndReturnBackoffMetadata(firebaseRemoteConfigServerException.getHttpStatusCode(), date2);
                if (shouldThrottle(backoffMetadataUpdateAndReturnBackoffMetadata, firebaseRemoteConfigServerException.getHttpStatusCode())) {
                    throw new FirebaseRemoteConfigFetchThrottledException(backoffMetadataUpdateAndReturnBackoffMetadata.getBackoffEndTime().getTime());
                }
                throw createExceptionWithGenericMessage(firebaseRemoteConfigServerException);
            }
        } catch (FirebaseRemoteConfigServerException e14) {
            e = e14;
            date2 = date;
        }
    }

    private Task<FetchResponse> fetchFromBackendAndCacheResponse(String str, String str2, Date date, Map<String, String> map) {
        try {
            FetchResponse fetchResponseFetchFromBackend = fetchFromBackend(str, str2, date, map);
            return fetchResponseFetchFromBackend.getStatus() != 0 ? Tasks.forResult(fetchResponseFetchFromBackend) : this.fetchedConfigsCache.put(fetchResponseFetchFromBackend.getFetchedConfigs()).onSuccessTask(this.executor, new i(fetchResponseFetchFromBackend, 3));
        } catch (FirebaseRemoteConfigException e4) {
            return Tasks.forException(e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fetchIfCacheExpiredAndNotThrottled, reason: merged with bridge method [inline-methods] */
    public Task<FetchResponse> lambda$fetch$0(Task<ConfigContainer> task, long j8, Map<String, String> map) {
        ConfigFetchHandler configFetchHandler;
        Task taskContinueWithTask;
        Date date = new Date(this.clock.currentTimeMillis());
        if (task.isSuccessful() && areCachedFetchConfigsValid(j8, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date backoffEndTimeInMillis = getBackoffEndTimeInMillis(date);
        if (backoffEndTimeInMillis != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(createThrottledMessage(backoffEndTimeInMillis.getTime() - date.getTime()), backoffEndTimeInMillis.getTime()));
            configFetchHandler = this;
        } else {
            Task<String> id3 = this.firebaseInstallations.getId();
            Task<InstallationTokenResult> token = this.firebaseInstallations.getToken(false);
            configFetchHandler = this;
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id3, token}).continueWithTask(this.executor, new b(configFetchHandler, id3, token, date, map));
        }
        return taskContinueWithTask.continueWithTask(configFetchHandler.executor, new q(7, this, date));
    }

    private Date getBackoffEndTimeInMillis(Date date) {
        Date backoffEndTime = this.frcSharedPrefs.getBackoffMetadata().getBackoffEndTime();
        if (date.before(backoffEndTime)) {
            return backoffEndTime;
        }
        return null;
    }

    private Long getFirstOpenTime() {
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector == null) {
            return null;
        }
        return (Long) analyticsConnector.getUserProperties(true).get(FIRST_OPEN_TIME_KEY);
    }

    private long getRandomizedBackoffDurationInMillis(int i14) {
        int[] iArr = BACKOFF_TIME_DURATIONS_IN_MINUTES;
        long millis = TimeUnit.MINUTES.toMillis(iArr[Math.min(i14, iArr.length) - 1]);
        return (millis / 2) + ((long) this.randomGenerator.nextInt((int) millis));
    }

    private Map<String, String> getUserProperties() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = this.analyticsConnector.get();
        if (analyticsConnector != null) {
            for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
                map.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }

    private boolean isThrottleableServerError(int i14) {
        return i14 == HTTP_TOO_MANY_REQUESTS || i14 == 502 || i14 == 503 || i14 == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task lambda$fetchFromBackendAndCacheResponse$4(FetchResponse fetchResponse, ConfigContainer configContainer) {
        return Tasks.forResult(fetchResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$2(Task task, Task task2, Date date, Map map, Task task3) {
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : fetchFromBackendAndCacheResponse((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date, map);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchIfCacheExpiredAndNotThrottled$3(Date date, Task task) {
        updateLastFetchStatusAndTime(task, date);
        return task;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task lambda$fetchNowWithTypeAndAttemptNumber$1(Map map, Task task) {
        return lambda$fetch$0(task, 0L, map);
    }

    private boolean shouldThrottle(ConfigSharedPrefsClient.BackoffMetadata backoffMetadata, int i14) {
        return backoffMetadata.getNumFailedFetches() > 1 || i14 == HTTP_TOO_MANY_REQUESTS;
    }

    private ConfigSharedPrefsClient.BackoffMetadata updateAndReturnBackoffMetadata(int i14, Date date) {
        if (isThrottleableServerError(i14)) {
            updateBackoffMetadataWithLastFailedFetchTime(date);
        }
        return this.frcSharedPrefs.getBackoffMetadata();
    }

    private void updateBackoffMetadataWithLastFailedFetchTime(Date date) {
        int numFailedFetches = this.frcSharedPrefs.getBackoffMetadata().getNumFailedFetches() + 1;
        this.frcSharedPrefs.setBackoffMetadata(numFailedFetches, new Date(date.getTime() + getRandomizedBackoffDurationInMillis(numFailedFetches)));
    }

    private void updateLastFetchStatusAndTime(Task<FetchResponse> task, Date date) {
        if (task.isSuccessful()) {
            this.frcSharedPrefs.updateLastFetchAsSuccessfulAt(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        boolean z14 = exception instanceof FirebaseRemoteConfigFetchThrottledException;
        ConfigSharedPrefsClient configSharedPrefsClient = this.frcSharedPrefs;
        if (z14) {
            configSharedPrefsClient.updateLastFetchAsThrottled();
        } else {
            configSharedPrefsClient.updateLastFetchAsFailed();
        }
    }

    public Task<FetchResponse> fetch(long j8) {
        HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, FetchType.BASE.getValue() + "/1");
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(this, j8, map, 2));
    }

    public Task<FetchResponse> fetchNowWithTypeAndAttemptNumber(FetchType fetchType, int i14) {
        HashMap map = new HashMap(this.customHttpHeaders);
        map.put(X_FIREBASE_RC_FETCH_TYPE, fetchType.getValue() + "/" + i14);
        return this.fetchedConfigsCache.get().continueWithTask(this.executor, new q(8, this, map));
    }

    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.analyticsConnector;
    }

    public long getTemplateVersionNumber() {
        return this.frcSharedPrefs.getLastTemplateVersion();
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.frcSharedPrefs.getMinimumFetchIntervalInSeconds());
    }
}
