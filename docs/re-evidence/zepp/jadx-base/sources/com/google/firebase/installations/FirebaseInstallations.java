package com.google.firebase.installations;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.internal.FidListener;
import com.google.firebase.installations.internal.FidListenerHandle;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String n = "generatefid.lock";
    private static final String o = "CHIME_ANDROID_SDK";
    private static final int p = 0;
    private static final int q = 1;
    private static final long r = 30;
    private static final String t = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String u = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String v = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String w = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private final FirebaseApp a;
    private final FirebaseInstallationServiceClient b;
    private final PersistedInstallation c;
    private final Utils d;
    private final IidStore e;
    private final RandomFidGenerator f;
    private final Object g;
    private final ExecutorService h;
    private final ExecutorService i;

    @GuardedBy("this")
    private String j;

    @GuardedBy("FirebaseInstallations.this")
    private Set<FidListener> k;

    @GuardedBy("lock")
    private final List<f> l;
    private static final Object m = new Object();
    private static final ThreadFactory s = new a();

    public class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    public class b implements FidListenerHandle {
        public final /* synthetic */ FidListener a;

        public b(FidListener fidListener) {
            this.a = fidListener;
        }

        @Override // com.google.firebase.installations.internal.FidListenerHandle
        public void unregister() {
            synchronized (FirebaseInstallations.this) {
                FirebaseInstallations.this.k.remove(this.a);
            }
        }
    }

    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[TokenResult.ResponseCode.values().length];
            b = iArr;
            try {
                iArr[TokenResult.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[TokenResult.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[TokenResult.ResponseCode.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[InstallationResponse.ResponseCode.values().length];
            a = iArr2;
            try {
                iArr2[InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public FirebaseInstallations(FirebaseApp firebaseApp, @NonNull Provider<UserAgentPublisher> provider, @NonNull Provider<HeartBeatInfo> provider2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), s), firebaseApp, new FirebaseInstallationServiceClient(firebaseApp.getApplicationContext(), provider, provider2), new PersistedInstallation(firebaseApp), Utils.getInstance(), new IidStore(firebaseApp), new RandomFidGenerator());
    }

    private void A(Exception exc) {
        synchronized (this.g) {
            Iterator<f> it2 = this.l.iterator();
            while (it2.hasNext()) {
                if (it2.next().a(exc)) {
                    it2.remove();
                }
            }
        }
    }

    private void B(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (this.g) {
            Iterator<f> it2 = this.l.iterator();
            while (it2.hasNext()) {
                if (it2.next().b(persistedInstallationEntry)) {
                    it2.remove();
                }
            }
        }
    }

    private synchronized void C(String str) {
        this.j = str;
    }

    private synchronized void D(PersistedInstallationEntry persistedInstallationEntry, PersistedInstallationEntry persistedInstallationEntry2) {
        if (this.k.size() != 0 && !persistedInstallationEntry.getFirebaseInstallationId().equals(persistedInstallationEntry2.getFirebaseInstallationId())) {
            Iterator<FidListener> it2 = this.k.iterator();
            while (it2.hasNext()) {
                it2.next().onFidChanged(persistedInstallationEntry2.getFirebaseInstallationId());
            }
        }
    }

    private Task<InstallationTokenResult> f() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new d(this.d, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<String> g() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h(new e(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @NonNull
    public static FirebaseInstallations getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    private void h(f fVar) {
        synchronized (this.g) {
            this.l.add(fVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Void i() throws FirebaseInstallationsException {
        C(null);
        PersistedInstallationEntry persistedInstallationEntryP = p();
        if (persistedInstallationEntryP.isRegistered()) {
            this.b.deleteFirebaseInstallation(m(), persistedInstallationEntryP.getFirebaseInstallationId(), s(), persistedInstallationEntryP.getRefreshToken());
        }
        t(persistedInstallationEntryP.withNoGeneratedFid());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void u(boolean z) {
        PersistedInstallationEntry persistedInstallationEntryZ;
        PersistedInstallationEntry persistedInstallationEntryP = p();
        try {
            if (persistedInstallationEntryP.isErrored() || persistedInstallationEntryP.isUnregistered()) {
                persistedInstallationEntryZ = z(persistedInstallationEntryP);
            } else {
                if (!z && !this.d.isAuthTokenExpired(persistedInstallationEntryP)) {
                    return;
                }
                persistedInstallationEntryZ = l(persistedInstallationEntryP);
            }
            t(persistedInstallationEntryZ);
            D(persistedInstallationEntryP, persistedInstallationEntryZ);
            if (persistedInstallationEntryZ.isRegistered()) {
                C(persistedInstallationEntryZ.getFirebaseInstallationId());
            }
            if (persistedInstallationEntryZ.isErrored()) {
                A(new FirebaseInstallationsException(FirebaseInstallationsException.Status.BAD_CONFIG));
            } else if (persistedInstallationEntryZ.isNotGenerated()) {
                A(new IOException(w));
            } else {
                B(persistedInstallationEntryZ);
            }
        } catch (FirebaseInstallationsException e) {
            A(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void w(final boolean z) {
        PersistedInstallationEntry persistedInstallationEntryR = r();
        if (z) {
            persistedInstallationEntryR = persistedInstallationEntryR.withClearedAuthToken();
        }
        B(persistedInstallationEntryR);
        this.i.execute(new Runnable() { // from class: p72
            @Override // java.lang.Runnable
            public final void run() {
                this.a.u(z);
            }
        });
    }

    private PersistedInstallationEntry l(@NonNull PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        TokenResult tokenResultGenerateAuthToken = this.b.generateAuthToken(m(), persistedInstallationEntry.getFirebaseInstallationId(), s(), persistedInstallationEntry.getRefreshToken());
        int i = c.b[tokenResultGenerateAuthToken.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withAuthToken(tokenResultGenerateAuthToken.getToken(), tokenResultGenerateAuthToken.getTokenExpirationTimestamp(), this.d.currentTimeInSecs());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        if (i != 3) {
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
        }
        C(null);
        return persistedInstallationEntry.withNoGeneratedFid();
    }

    private synchronized String o() {
        return this.j;
    }

    private PersistedInstallationEntry p() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (m) {
            com.google.firebase.installations.c cVarA = com.google.firebase.installations.c.a(this.a.getApplicationContext(), n);
            try {
                persistedInstallationEntryValue = this.c.readPersistedInstallationEntryValue();
                if (cVarA != null) {
                    cVarA.b();
                }
            } catch (Throwable th) {
                if (cVarA != null) {
                    cVarA.b();
                }
                throw th;
            }
        }
        return persistedInstallationEntryValue;
    }

    private PersistedInstallationEntry r() {
        PersistedInstallationEntry persistedInstallationEntryValue;
        synchronized (m) {
            com.google.firebase.installations.c cVarA = com.google.firebase.installations.c.a(this.a.getApplicationContext(), n);
            try {
                persistedInstallationEntryValue = this.c.readPersistedInstallationEntryValue();
                if (persistedInstallationEntryValue.isNotGenerated()) {
                    persistedInstallationEntryValue = this.c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntryValue.withUnregisteredFid(y(persistedInstallationEntryValue)));
                }
                if (cVarA != null) {
                    cVarA.b();
                }
            } catch (Throwable th) {
                if (cVarA != null) {
                    cVarA.b();
                }
                throw th;
            }
        }
        return persistedInstallationEntryValue;
    }

    private void t(PersistedInstallationEntry persistedInstallationEntry) {
        synchronized (m) {
            com.google.firebase.installations.c cVarA = com.google.firebase.installations.c.a(this.a.getApplicationContext(), n);
            try {
                this.c.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry);
                if (cVarA != null) {
                    cVarA.b();
                }
            } catch (Throwable th) {
                if (cVarA != null) {
                    cVarA.b();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        w(false);
    }

    private void x() {
        Preconditions.checkNotEmpty(n(), u);
        Preconditions.checkNotEmpty(s(), v);
        Preconditions.checkNotEmpty(m(), t);
        Preconditions.checkArgument(Utils.b(n()), u);
        Preconditions.checkArgument(Utils.a(m()), t);
    }

    private String y(PersistedInstallationEntry persistedInstallationEntry) {
        if ((!this.a.getName().equals(o) && !this.a.isDefaultApp()) || !persistedInstallationEntry.shouldAttemptMigration()) {
            return this.f.createRandomFid();
        }
        String iid = this.e.readIid();
        return TextUtils.isEmpty(iid) ? this.f.createRandomFid() : iid;
    }

    private PersistedInstallationEntry z(PersistedInstallationEntry persistedInstallationEntry) throws FirebaseInstallationsException {
        InstallationResponse installationResponseCreateFirebaseInstallation = this.b.createFirebaseInstallation(m(), persistedInstallationEntry.getFirebaseInstallationId(), s(), n(), (persistedInstallationEntry.getFirebaseInstallationId() == null || persistedInstallationEntry.getFirebaseInstallationId().length() != 11) ? null : this.e.readToken());
        int i = c.a[installationResponseCreateFirebaseInstallation.getResponseCode().ordinal()];
        if (i == 1) {
            return persistedInstallationEntry.withRegisteredFid(installationResponseCreateFirebaseInstallation.getFid(), installationResponseCreateFirebaseInstallation.getRefreshToken(), this.d.currentTimeInSecs(), installationResponseCreateFirebaseInstallation.getAuthToken().getToken(), installationResponseCreateFirebaseInstallation.getAuthToken().getTokenExpirationTimestamp());
        }
        if (i == 2) {
            return persistedInstallationEntry.withFisError("BAD CONFIG");
        }
        throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.Status.UNAVAILABLE);
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<Void> delete() {
        return Tasks.call(this.h, new Callable() { // from class: r72
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.i();
            }
        });
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<String> getId() {
        x();
        String strO = o();
        if (strO != null) {
            return Tasks.forResult(strO);
        }
        Task<String> taskG = g();
        this.h.execute(new Runnable() { // from class: o72
            @Override // java.lang.Runnable
            public final void run() {
                this.a.v();
            }
        });
        return taskG;
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public Task<InstallationTokenResult> getToken(final boolean z) {
        x();
        Task<InstallationTokenResult> taskF = f();
        this.h.execute(new Runnable() { // from class: q72
            @Override // java.lang.Runnable
            public final void run() {
                this.a.w(z);
            }
        });
        return taskF;
    }

    @Nullable
    public String m() {
        return this.a.getOptions().getApiKey();
    }

    @VisibleForTesting
    public String n() {
        return this.a.getOptions().getApplicationId();
    }

    @VisibleForTesting
    public String q() {
        return this.a.getName();
    }

    @Override // com.google.firebase.installations.FirebaseInstallationsApi
    @NonNull
    public synchronized FidListenerHandle registerFidListener(@NonNull FidListener fidListener) {
        this.k.add(fidListener);
        return new b(fidListener);
    }

    @Nullable
    public String s() {
        return this.a.getOptions().getProjectId();
    }

    @NonNull
    public static FirebaseInstallations getInstance(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkArgument(firebaseApp != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations) firebaseApp.get(FirebaseInstallationsApi.class);
    }

    public FirebaseInstallations(ExecutorService executorService, FirebaseApp firebaseApp, FirebaseInstallationServiceClient firebaseInstallationServiceClient, PersistedInstallation persistedInstallation, Utils utils, IidStore iidStore, RandomFidGenerator randomFidGenerator) {
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = firebaseApp;
        this.b = firebaseInstallationServiceClient;
        this.c = persistedInstallation;
        this.d = utils;
        this.e = iidStore;
        this.f = randomFidGenerator;
        this.h = executorService;
        this.i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), s);
    }
}
