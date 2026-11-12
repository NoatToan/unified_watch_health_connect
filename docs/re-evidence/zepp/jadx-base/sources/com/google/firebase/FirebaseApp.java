package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public class FirebaseApp {

    @NonNull
    public static final String DEFAULT_APP_NAME = "[DEFAULT]";
    private static final String j = "FirebaseApp";
    private static final Object k = new Object();
    private static final Executor l = new c();

    @GuardedBy("LOCK")
    public static final Map<String, FirebaseApp> m = new ArrayMap();
    private static final String n = "fire-android";
    private static final String o = "fire-core";
    private static final String p = "kotlin";
    private final Context a;
    private final String b;
    private final FirebaseOptions c;
    private final ComponentRuntime d;
    private final Lazy<DataCollectionConfigStorage> g;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicBoolean f = new AtomicBoolean();
    private final List<BackgroundStateChangeListener> h = new CopyOnWriteArrayList();
    private final List<FirebaseAppLifecycleListener> i = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {
        private static AtomicReference<b> a = new AtomicReference<>();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (a.get() == null) {
                    b bVar = new b();
                    if (a.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            synchronized (FirebaseApp.k) {
                for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.m.values())) {
                    if (firebaseApp.e.get()) {
                        firebaseApp.l(z);
                    }
                }
            }
        }
    }

    public static class c implements Executor {
        private static final Handler a = new Handler(Looper.getMainLooper());

        private c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@NonNull Runnable runnable) {
            a.post(runnable);
        }
    }

    @TargetApi(24)
    public static class d extends BroadcastReceiver {
        private static AtomicReference<d> b = new AtomicReference<>();
        private final Context a;

        public d(Context context) {
            this.a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (b.get() == null) {
                d dVar = new d(context);
                if (b.compareAndSet(null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.k) {
                Iterator<FirebaseApp> it2 = FirebaseApp.m.values().iterator();
                while (it2.hasNext()) {
                    it2.next().h();
                }
            }
            c();
        }
    }

    public FirebaseApp(final Context context, String str, FirebaseOptions firebaseOptions) {
        this.a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        this.d = ComponentRuntime.builder(l).addLazyComponentRegistrars(ComponentDiscovery.forContext(context, ComponentDiscoveryService.class).discoverLazy()).addComponentRegistrar(new FirebaseCommonRegistrar()).addComponent(Component.of(context, Context.class, new Class[0])).addComponent(Component.of(this, FirebaseApp.class, new Class[0])).addComponent(Component.of(firebaseOptions, FirebaseOptions.class, new Class[0])).build();
        this.g = new Lazy<>(new Provider() { // from class: j72
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                return this.a.j(context);
            }
        });
    }

    @VisibleForTesting
    public static void clearInstancesForTest() {
        synchronized (k) {
            m.clear();
        }
    }

    private void f() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    private static List<String> g() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            Iterator<FirebaseApp> it2 = m.values().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getName());
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    @NonNull
    public static List<FirebaseApp> getApps(@NonNull Context context) {
        ArrayList arrayList;
        synchronized (k) {
            arrayList = new ArrayList(m.values());
        }
        return arrayList;
    }

    @NonNull
    public static FirebaseApp getInstance() {
        FirebaseApp firebaseApp;
        synchronized (k) {
            firebaseApp = m.get(DEFAULT_APP_NAME);
            if (firebaseApp == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return firebaseApp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        if (!UserManagerCompat.isUserUnlocked(this.a)) {
            Log.i(j, "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + getName());
            d.b(this.a);
            return;
        }
        Log.i(j, "Device unlocked: initializing all Firebase APIs for app " + getName());
        this.d.initializeEagerComponents(isDefaultApp());
    }

    @Nullable
    public static FirebaseApp initializeApp(@NonNull Context context) {
        synchronized (k) {
            if (m.containsKey(DEFAULT_APP_NAME)) {
                return getInstance();
            }
            FirebaseOptions firebaseOptionsFromResource = FirebaseOptions.fromResource(context);
            if (firebaseOptionsFromResource == null) {
                Log.w(j, "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return initializeApp(context, firebaseOptionsFromResource);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ DataCollectionConfigStorage j(Context context) {
        return new DataCollectionConfigStorage(context, getPersistenceKey(), (Publisher) this.d.get(Publisher.class));
    }

    private static String k(@NonNull String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(boolean z) {
        Log.d(j, "Notifying background state change listeners.");
        Iterator<BackgroundStateChangeListener> it2 = this.h.iterator();
        while (it2.hasNext()) {
            it2.next().onBackgroundStateChanged(z);
        }
    }

    private void m() {
        Iterator<FirebaseAppLifecycleListener> it2 = this.i.iterator();
        while (it2.hasNext()) {
            it2.next().onDeleted(this.b, this.c);
        }
    }

    @KeepForSdk
    public void addBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        f();
        if (this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        this.h.add(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void addLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        f();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.i.add(firebaseAppLifecycleListener);
    }

    public void delete() {
        if (this.f.compareAndSet(false, true)) {
            synchronized (k) {
                m.remove(this.b);
            }
            m();
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            return this.b.equals(((FirebaseApp) obj).getName());
        }
        return false;
    }

    @KeepForSdk
    public <T> T get(Class<T> cls) {
        f();
        return (T) this.d.get(cls);
    }

    @NonNull
    public Context getApplicationContext() {
        f();
        return this.a;
    }

    @NonNull
    public String getName() {
        f();
        return this.b;
    }

    @NonNull
    public FirebaseOptions getOptions() {
        f();
        return this.c;
    }

    @KeepForSdk
    public String getPersistenceKey() {
        return Base64Utils.encodeUrlSafeNoPadding(getName().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(getOptions().getApplicationId().getBytes(Charset.defaultCharset()));
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    @VisibleForTesting
    public void i() {
        this.d.initializeAllComponentsForTests();
    }

    @KeepForSdk
    public boolean isDataCollectionDefaultEnabled() {
        f();
        return this.g.get().isEnabled();
    }

    @KeepForSdk
    @VisibleForTesting
    public boolean isDefaultApp() {
        return DEFAULT_APP_NAME.equals(getName());
    }

    @KeepForSdk
    public void removeBackgroundStateChangeListener(BackgroundStateChangeListener backgroundStateChangeListener) {
        f();
        this.h.remove(backgroundStateChangeListener);
    }

    @KeepForSdk
    public void removeLifecycleEventListener(@NonNull FirebaseAppLifecycleListener firebaseAppLifecycleListener) {
        f();
        Preconditions.checkNotNull(firebaseAppLifecycleListener);
        this.i.remove(firebaseAppLifecycleListener);
    }

    public void setAutomaticResourceManagementEnabled(boolean z) {
        f();
        if (this.e.compareAndSet(!z, z)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z && zIsInBackground) {
                l(true);
            } else {
                if (z || !zIsInBackground) {
                    return;
                }
                l(false);
            }
        }
    }

    @KeepForSdk
    public void setDataCollectionDefaultEnabled(Boolean bool) {
        f();
        this.g.get().setEnabled(bool);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }

    @KeepForSdk
    @Deprecated
    public void setDataCollectionDefaultEnabled(boolean z) {
        setDataCollectionDefaultEnabled(Boolean.valueOf(z));
    }

    @KeepForSdk
    public static String getPersistenceKey(String str, FirebaseOptions firebaseOptions) {
        return Base64Utils.encodeUrlSafeNoPadding(str.getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(firebaseOptions.getApplicationId().getBytes(Charset.defaultCharset()));
    }

    @NonNull
    public static FirebaseApp getInstance(@NonNull String str) {
        FirebaseApp firebaseApp;
        String str2;
        synchronized (k) {
            firebaseApp = m.get(k(str));
            if (firebaseApp == null) {
                List<String> listG = g();
                if (listG.isEmpty()) {
                    str2 = "";
                } else {
                    str2 = "Available app names: " + TextUtils.join(", ", listG);
                }
                throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
            }
        }
        return firebaseApp;
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions) {
        return initializeApp(context, firebaseOptions, DEFAULT_APP_NAME);
    }

    @NonNull
    public static FirebaseApp initializeApp(@NonNull Context context, @NonNull FirebaseOptions firebaseOptions, @NonNull String str) {
        FirebaseApp firebaseApp;
        b.b(context);
        String strK = k(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            Map<String, FirebaseApp> map = m;
            Preconditions.checkState(!map.containsKey(strK), "FirebaseApp name " + strK + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, strK, firebaseOptions);
            map.put(strK, firebaseApp);
        }
        firebaseApp.h();
        return firebaseApp;
    }
}
