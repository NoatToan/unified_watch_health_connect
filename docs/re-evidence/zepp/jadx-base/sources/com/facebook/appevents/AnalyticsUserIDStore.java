package com.facebook.appevents;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.appevents.internal.AppEventUtility;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010\b\u001a\u00020\u0002H\u0002R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/facebook/appevents/AnalyticsUserIDStore;", "", "", "initStore", "", "id", "setUserID", "getUserID", "a", "Ljava/lang/String;", "TAG", "b", "ANALYTICS_USER_ID_KEY", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "c", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", GoogleApiAvailabilityLight.a, SDKConstants.PARAM_USER_ID, "", "e", "Z", "initialized", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class AnalyticsUserIDStore {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final String ANALYTICS_USER_ID_KEY = "com.facebook.appevents.AnalyticsUserIDStore.userID";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static String userID;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static volatile boolean initialized;

    @NotNull
    public static final AnalyticsUserIDStore INSTANCE = new AnalyticsUserIDStore();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = AnalyticsUserIDStore.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a implements Runnable {
        public static final a a = new a();

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AnalyticsUserIDStore.INSTANCE.a();
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b implements Runnable {
        public final /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CrashShieldHandler.isObjectCrashing(this)) {
                return;
            }
            try {
                AnalyticsUserIDStore analyticsUserIDStore = AnalyticsUserIDStore.INSTANCE;
                AnalyticsUserIDStore.access$getLock$p(analyticsUserIDStore).writeLock().lock();
                try {
                    AnalyticsUserIDStore.userID = this.a;
                    SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).edit();
                    editorEdit.putString(AnalyticsUserIDStore.ANALYTICS_USER_ID_KEY, AnalyticsUserIDStore.access$getUserID$p(analyticsUserIDStore));
                    editorEdit.apply();
                } finally {
                    AnalyticsUserIDStore.access$getLock$p(AnalyticsUserIDStore.INSTANCE).writeLock().unlock();
                }
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, this);
            }
        }
    }

    private AnalyticsUserIDStore() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (initialized) {
            return;
        }
        lock.writeLock().lock();
        try {
            if (initialized) {
                return;
            }
            userID = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.getApplicationContext()).getString(ANALYTICS_USER_ID_KEY, null);
            initialized = true;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static final /* synthetic */ ReentrantReadWriteLock access$getLock$p(AnalyticsUserIDStore analyticsUserIDStore) {
        return lock;
    }

    public static final /* synthetic */ String access$getUserID$p(AnalyticsUserIDStore analyticsUserIDStore) {
        return userID;
    }

    @JvmStatic
    @Nullable
    public static final String getUserID() {
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.a();
        }
        lock.readLock().lock();
        try {
            return userID;
        } finally {
            lock.readLock().unlock();
        }
    }

    @JvmStatic
    public static final void initStore() {
        if (initialized) {
            return;
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(a.a);
    }

    @JvmStatic
    public static final void setUserID(@Nullable String id) {
        AppEventUtility.assertIsNotMainThread();
        if (!initialized) {
            Log.w(TAG, "initStore should have been called before calling setUserID");
            INSTANCE.a();
        }
        InternalAppEventsLogger.INSTANCE.getAnalyticsExecutor().execute(new b(id));
    }
}
