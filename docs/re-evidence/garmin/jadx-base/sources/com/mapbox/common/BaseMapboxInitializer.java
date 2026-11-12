package com.mapbox.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0012*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\f0\u000b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer;", "", "T", "Lzd/b;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "create", "(Landroid/content/Context;)Ljava/lang/Boolean;", "", "Ljava/lang/Class;", "dependencies", "()Ljava/util/List;", "getInitializerClass", "()Ljava/lang/Class;", "initializerClass", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BaseMapboxInitializer<T> implements zd.b<Boolean> {
    private static final long LOCK_WAIT_TIME_MS = 50;
    private static final String TAG = "MapboxInitializer";
    private static Context appContext;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashMap<Class<? extends zd.b<?>>, InitializerData> initializersMap = new HashMap<>();
    private static final ReentrantLock globalLock = new ReentrantLock();

    public static final HashMap<Class<? extends zd.b<?>>, InitializerData> getInitializersMap() {
        return INSTANCE.getInitializersMap();
    }

    public static final <T> void init(Class<? extends zd.b<T>> cls) {
        INSTANCE.init(cls);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.b
    public final Boolean create(Context context) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Unit unit;
        context.getClass();
        appContext = context.getApplicationContext();
        try {
            INSTANCE.init(getInitializerClass(), true);
        } catch (Throwable th3) {
            getInitializerClass().getSimpleName();
            th3.getMessage();
            InitializerData initializerData = initializersMap.get(getInitializerClass());
            if (initializerData != null) {
                INSTANCE.updateState(getInitializerClass(), initializerData, InitializerState.FAILURE);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw th3;
            }
        }
        return Boolean.TRUE;
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        return new ArrayList();
    }

    public abstract Class<? extends zd.b<T>> getInitializerClass();

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0016\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00052\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u00050\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u001aH\u0082\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\u000b\u001a\u00020\n\"\b\b\u0001\u0010\u0004*\u00020\u00012\u0014\u0010\u0007\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0007¢\u0006\u0004\b\u000b\u0010 RT\u0010#\u001a6\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r0!j\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005\u0012\u0004\u0012\u00020\r`\"8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0003\u001a\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lcom/mapbox/common/BaseMapboxInitializer$Companion;", "", "<init>", "()V", "T", "Ljava/lang/Class;", "Lzd/b;", "initializerClass", "", "calledFromCreate", "", "init", "(Ljava/lang/Class;Z)V", "Lcom/mapbox/common/InitializerData;", "initializerData", "Lcom/mapbox/common/InitializerState;", RemoteConfigConstants.ResponseFieldKey.STATE, "updateState", "(Ljava/lang/Class;Lcom/mapbox/common/InitializerData;Lcom/mapbox/common/InitializerState;)V", "parentInitializerClass", "", "dependencySet", "getAllDependencies", "(Ljava/lang/Class;Ljava/util/Set;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lkotlin/Function0;", "function", "runCatchingEnhanced", "(Landroid/content/Context;Lcom/mapbox/common/InitializerData;Le23/a;)V", "getApplicationContextFromActivityThread", "()Landroid/content/Context;", "(Ljava/lang/Class;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "initializersMap", "Ljava/util/HashMap;", "getInitializersMap", "()Ljava/util/HashMap;", "getInitializersMap$annotations", "", "LOCK_WAIT_TIME_MS", "J", "", "TAG", "Ljava/lang/String;", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final void getAllDependencies(Class<? extends zd.b<?>> parentInitializerClass, Set<Class<? extends zd.b<?>>> dependencySet) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            zd.b<?> bVarNewInstance = parentInitializerClass.getDeclaredConstructor(null).newInstance(null);
            bVarNewInstance.getClass();
            zd.b<?> bVar = bVarNewInstance;
            if (bVar.dependencies().isEmpty()) {
                return;
            }
            List<Class<? extends zd.b<?>>> listDependencies = bVar.dependencies();
            listDependencies.getClass();
            for (Class<? extends zd.b<?>> cls : listDependencies) {
                cls.getClass();
                dependencySet.add(cls);
                BaseMapboxInitializer.INSTANCE.getAllDependencies(cls, dependencySet);
            }
        }

        @SuppressLint({"PrivateApi"})
        private final Context getApplicationContextFromActivityThread() {
            if ("robolectric".equals(Build.FINGERPRINT)) {
                return null;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getMethod("getApplication", null).invoke(cls.getMethod("currentActivityThread", null).invoke(null, null), null);
                objInvoke.getClass();
                return (Context) objInvoke;
            } catch (Throwable unused) {
                return null;
            }
        }

        public static /* synthetic */ void getInitializersMap$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final <T> void init(Class<? extends zd.b<T>> initializerClass, boolean calledFromCreate) {
            T t7;
            InitializerData initializerData;
            if (BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                if (calledFromCreate) {
                    try {
                        initializerClass.getSimpleName();
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
                return;
            }
            Context applicationContextFromActivityThread = BaseMapboxInitializer.appContext;
            if (applicationContextFromActivityThread == null && (applicationContextFromActivityThread = getApplicationContextFromActivityThread()) == null) {
                return;
            }
            while (!BaseMapboxInitializer.globalLock.tryLock(50L, TimeUnit.MILLISECONDS)) {
                if (BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                    return;
                }
            }
            try {
                r0 r0Var = new r0();
                r0Var.f105810a = (T) getInitializersMap().get(initializerClass);
                if (!s.g(Looper.myLooper(), Looper.getMainLooper())) {
                    InitializerData initializerData2 = (InitializerData) r0Var.f105810a;
                    if ((initializerData2 != null ? initializerData2.getState() : null) != InitializerState.IN_PROGRESS) {
                        initializerClass.getSimpleName();
                    }
                }
                try {
                    if (r0Var.f105810a != null) {
                        if (!BaseMapboxInitializerKt.skipFurtherInitialization(initializerClass)) {
                        }
                        BaseMapboxInitializer.globalLock.unlock();
                        return;
                    } else {
                        r0Var.f105810a = (T) new InitializerData(0L, null, 0, 7, null);
                        getInitializersMap().put(initializerClass, r0Var.f105810a);
                    }
                    BaseMapboxInitializer.INSTANCE.updateState(initializerClass, (InitializerData) t7, InitializerState.IN_PROGRESS);
                    zd.a.c(applicationContextFromActivityThread).d(initializerClass);
                    getInitializersMap().put(initializerClass, InitializerData.copy$default((InitializerData) r0Var.f105810a, 0L, InitializerState.SUCCESS, 0, 5, null));
                    BaseMapboxInitializer.globalLock.unlock();
                    return;
                } catch (Throwable th3) {
                    throw new MapboxInitializerException(initializerData, applicationContextFromActivityThread, th3);
                }
                T t14 = r0Var.f105810a;
                r0Var.f105810a = (T) InitializerData.copy$default((InitializerData) t14, 0L, null, ((InitializerData) t14).getCurrentInitAttempt() + 1, 3, null);
                getInitializersMap().put(initializerClass, r0Var.f105810a);
                initializerClass.getSimpleName();
                ((InitializerData) r0Var.f105810a).getCurrentInitAttempt();
                t7 = r0Var.f105810a;
                initializerData = (InitializerData) t7;
            } catch (Throwable th4) {
                BaseMapboxInitializer.globalLock.unlock();
                throw th4;
            }
        }

        private final void runCatchingEnhanced(Context context, InitializerData initializerData, e23.a<Unit> function) throws MapboxInitializerException {
            try {
                function.invoke();
            } catch (Throwable th3) {
                throw new MapboxInitializerException(initializerData, context, th3);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void updateState(Class<? extends zd.b<?>> initializerClass, InitializerData initializerData, InitializerState state) throws IllegalAccessException, InstantiationException, InvocationTargetException {
            InitializerState initializerState;
            Unit unit;
            LinkedHashSet<Class<? extends zd.b<?>>> linkedHashSet = new LinkedHashSet();
            getAllDependencies(initializerClass, linkedHashSet);
            for (Class<? extends zd.b<?>> cls : linkedHashSet) {
                Companion companion = BaseMapboxInitializer.INSTANCE;
                InitializerData initializerData2 = companion.getInitializersMap().get(cls);
                if (initializerData2 != null) {
                    if (initializerData2.getState() != InitializerState.SUCCESS) {
                        initializerState = state;
                        companion.getInitializersMap().put(cls, InitializerData.copy$default(initializerData2, 0L, initializerState, 0, 5, null));
                    } else {
                        initializerState = state;
                    }
                    unit = Unit.INSTANCE;
                } else {
                    initializerState = state;
                    unit = null;
                }
                if (unit == null) {
                    companion.getInitializersMap().put(cls, new InitializerData(initializerData.getFirstInitElapsedTimeMs(), initializerState, initializerData.getCurrentInitAttempt()));
                }
                state = initializerState;
            }
            getInitializersMap().put(initializerClass, InitializerData.copy$default(initializerData, 0L, state, 0, 5, null));
        }

        public final HashMap<Class<? extends zd.b<?>>, InitializerData> getInitializersMap() {
            return BaseMapboxInitializer.initializersMap;
        }

        private Companion() {
        }

        public final <T> void init(Class<? extends zd.b<T>> initializerClass) {
            initializerClass.getClass();
            init(initializerClass, false);
        }
    }
}
