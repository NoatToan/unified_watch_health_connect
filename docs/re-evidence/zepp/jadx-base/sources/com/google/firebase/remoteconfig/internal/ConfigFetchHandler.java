package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHandler {
    public static final long DEFAULT_MINIMUM_FETCH_INTERVAL_IN_SECONDS = TimeUnit.HOURS.toSeconds(12);

    @VisibleForTesting
    public static final int[] j = {2, 4, 8, 16, 32, 64, 128, 256};

    @VisibleForTesting
    public static final int k = 429;
    private final FirebaseInstallationsApi a;
    private final Provider<AnalyticsConnector> b;
    private final Executor c;
    private final Clock d;
    private final Random e;
    private final ConfigCacheClient f;
    private final ConfigFetchHttpClient g;
    private final ConfigMetadataClient h;
    private final Map<String, String> i;

    public static class FetchResponse {
        private final Date a;
        private final int b;
        private final ConfigContainer c;

        @Nullable
        private final String d;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
            public static final int BACKEND_HAS_NO_UPDATES = 1;
            public static final int BACKEND_UPDATES_FETCHED = 0;
            public static final int LOCAL_STORAGE_USED = 2;
        }

        private FetchResponse(Date date, int i, ConfigContainer configContainer, @Nullable String str) {
            this.a = date;
            this.b = i;
            this.c = configContainer;
            this.d = str;
        }

        public static FetchResponse forBackendHasNoUpdates(Date date) {
            return new FetchResponse(date, 1, null, null);
        }

        public static FetchResponse forBackendUpdatesFetched(ConfigContainer configContainer, String str) {
            return new FetchResponse(configContainer.getFetchTime(), 0, configContainer, str);
        }

        public static FetchResponse forLocalStorageUsed(Date date) {
            return new FetchResponse(date, 2, null, null);
        }

        public Date a() {
            return this.a;
        }

        @Nullable
        public String b() {
            return this.d;
        }

        public int c() {
            return this.b;
        }

        public ConfigContainer getFetchedConfigs() {
            return this.c;
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider<AnalyticsConnector> provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigMetadataClient configMetadataClient, Map<String, String> map) {
        this.a = firebaseInstallationsApi;
        this.b = provider;
        this.c = executor;
        this.d = clock;
        this.e = random;
        this.f = configCacheClient;
        this.g = configFetchHttpClient;
        this.h = configMetadataClient;
        this.i = map;
    }

    private boolean e(long j2, Date date) {
        Date dateD = this.h.d();
        if (dateD.equals(ConfigMetadataClient.d)) {
            return false;
        }
        return date.before(new Date(dateD.getTime() + TimeUnit.SECONDS.toMillis(j2)));
    }

    private FirebaseRemoteConfigServerException f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int httpStatusCode = firebaseRemoteConfigServerException.getHttpStatusCode();
        if (httpStatusCode == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (httpStatusCode == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else {
            if (httpStatusCode == 429) {
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
        return new FirebaseRemoteConfigServerException(firebaseRemoteConfigServerException.getHttpStatusCode(), "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    private String g(long j2) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j2)));
    }

    @WorkerThread
    private FetchResponse h(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            FetchResponse fetchResponseFetch = this.g.fetch(this.g.c(), str, str2, m(), this.h.b(), this.i, date);
            if (fetchResponseFetch.b() != null) {
                this.h.g(fetchResponseFetch.b());
            }
            this.h.e();
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e) {
            ConfigMetadataClient.a aVarT = t(e.getHttpStatusCode(), date);
            if (s(aVarT, e.getHttpStatusCode())) {
                throw new FirebaseRemoteConfigFetchThrottledException(aVarT.a().getTime());
            }
            throw f(e);
        }
    }

    private Task<FetchResponse> i(String str, String str2, Date date) {
        try {
            final FetchResponse fetchResponseH = h(str, str2, date);
            return fetchResponseH.c() != 0 ? Tasks.forResult(fetchResponseH) : this.f.put(fetchResponseH.getFetchedConfigs()).onSuccessTask(this.c, new SuccessContinuation() { // from class: ny0
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return ConfigFetchHandler.p(fetchResponseH, (ConfigContainer) obj);
                }
            });
        } catch (FirebaseRemoteConfigException e) {
            return Tasks.forException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Task<FetchResponse> o(Task<ConfigContainer> task, long j2) {
        Task taskContinueWithTask;
        final Date date = new Date(this.d.currentTimeMillis());
        if (task.isSuccessful() && e(j2, date)) {
            return Tasks.forResult(FetchResponse.forLocalStorageUsed(date));
        }
        Date dateK = k(date);
        if (dateK != null) {
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(g(dateK.getTime() - date.getTime()), dateK.getTime()));
        } else {
            final Task<String> id = this.a.getId();
            final Task<InstallationTokenResult> token = this.a.getToken(false);
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(this.c, new Continuation() { // from class: ly0
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    return this.a.q(id, token, date, task2);
                }
            });
        }
        return taskContinueWithTask.continueWithTask(this.c, new Continuation() { // from class: my0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task2) {
                return this.a.r(date, task2);
            }
        });
    }

    @Nullable
    private Date k(Date date) {
        Date dateA = this.h.a().a();
        if (date.before(dateA)) {
            return dateA;
        }
        return null;
    }

    private long l(int i) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = j;
        long millis = timeUnit.toMillis(iArr[Math.min(i, iArr.length) - 1]);
        return (millis / 2) + ((long) this.e.nextInt((int) millis));
    }

    @WorkerThread
    private Map<String, String> m() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = this.b.get();
        if (analyticsConnector == null) {
            return map;
        }
        for (Map.Entry<String, Object> entry : analyticsConnector.getUserProperties(false).entrySet()) {
            map.put(entry.getKey(), entry.getValue().toString());
        }
        return map;
    }

    private boolean n(int i) {
        return i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task p(FetchResponse fetchResponse, ConfigContainer configContainer) throws Exception {
        return Tasks.forResult(fetchResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task q(Task task, Task task2, Date date, Task task3) throws Exception {
        if (task.isSuccessful()) {
            return !task2.isSuccessful() ? Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task2.getException())) : i((String) task.getResult(), ((InstallationTokenResult) task2.getResult()).getToken(), date);
        }
        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task.getException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task r(Date date, Task task) throws Exception {
        v(task, date);
        return task;
    }

    private boolean s(ConfigMetadataClient.a aVar, int i) {
        return aVar.b() > 1 || i == 429;
    }

    private ConfigMetadataClient.a t(int i, Date date) {
        if (n(i)) {
            u(date);
        }
        return this.h.a();
    }

    private void u(Date date) {
        int iB = this.h.a().b() + 1;
        this.h.f(iB, new Date(date.getTime() + l(iB)));
    }

    private void v(Task<FetchResponse> task, Date date) {
        if (task.isSuccessful()) {
            this.h.i(date);
            return;
        }
        Exception exception = task.getException();
        if (exception == null) {
            return;
        }
        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.h.j();
        } else {
            this.h.h();
        }
    }

    public Task<FetchResponse> fetch() {
        return fetch(this.h.getMinimumFetchIntervalInSeconds());
    }

    @VisibleForTesting
    public Provider<AnalyticsConnector> getAnalyticsConnector() {
        return this.b;
    }

    public Task<FetchResponse> fetch(final long j2) {
        return this.f.get().continueWithTask(this.c, new Continuation() { // from class: ky0
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return this.a.o(j2, task);
            }
        });
    }
}
