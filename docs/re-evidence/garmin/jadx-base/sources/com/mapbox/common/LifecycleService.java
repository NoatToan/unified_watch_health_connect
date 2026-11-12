package com.mapbox.common;

import am.j;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import e23.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import lc.u0;
import o13.q;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.w;
import p13.y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000s\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\t*\u00013\b\u0007\u0018\u0000 72\u00020\u0001:\u000489:7B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u000b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J+\u0010%\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0#¢\u0006\u0004\b%\u0010&R<\u0010*\u001a*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0(\u0012\u0004\u0012\u00020\u00040'j\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0(\u0012\u0004\u0012\u00020\u0004`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u00060,R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00101\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010$\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0011\u00106\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b%\u00105¨\u0006;"}, d2 = {"Lcom/mapbox/common/LifecycleService;", "Landroid/app/Service;", "<init>", "()V", "Lcom/mapbox/common/LifecycleService$ActivityState;", "Lcom/mapbox/common/LifecycleState;", "toLifecycleState", "(Lcom/mapbox/common/LifecycleService$ActivityState;)Lcom/mapbox/common/LifecycleState;", "Landroid/app/Activity;", "activity", RemoteConfigConstants.ResponseFieldKey.STATE, "", "registerActivityWithState", "(Landroid/app/Activity;Lcom/mapbox/common/LifecycleService$ActivityState;)V", "unregisterActivity", "(Landroid/app/Activity;)V", "updateLifecycleState", "(Lcom/mapbox/common/LifecycleState;)V", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "onCreate", "onDestroy", "", "level", "onTrimMemory", "(I)V", "Lcom/mapbox/common/LifecycleService$Callback;", "observer", "setCallback", "(Lcom/mapbox/common/LifecycleService$Callback;)V", "Landroid/os/Looper;", "looper", "Lkotlin/Function1;", "callback", "getLifecycleState", "(Landroid/os/Looper;Le23/l;)V", "Ljava/util/HashMap;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/HashMap;", "registeredActivities", "Ljava/util/HashMap;", "Lcom/mapbox/common/LifecycleService$Binder;", "binder", "Lcom/mapbox/common/LifecycleService$Binder;", "currentLifecycleState", "Lcom/mapbox/common/LifecycleState;", "lifecycleCallback", "Lcom/mapbox/common/LifecycleService$Callback;", "com/mapbox/common/LifecycleService$callback$1", "Lcom/mapbox/common/LifecycleService$callback$1;", "()Lcom/mapbox/common/LifecycleState;", "lifecycleState", "Companion", "ActivityState", "Binder", "Callback", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LifecycleService extends Service {
    public static final String TAG = "LifecycleService";
    private Callback lifecycleCallback;
    private final HashMap<WeakReference<Activity>, ActivityState> registeredActivities = new HashMap<>();
    private final Binder binder = new Binder();
    private LifecycleState currentLifecycleState = LifecycleState.UNKNOWN;
    private final LifecycleService$callback$1 callback = new Application.ActivityLifecycleCallbacks() { // from class: com.mapbox.common.LifecycleService$callback$1
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityCreated(Activity activity, Bundle savedInstanceState) {
            activity.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.Created);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityDestroyed(Activity activity) {
            activity.getClass();
            this.this$0.unregisterActivity(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityPaused(Activity activity) {
            activity.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.Paused);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityResumed(Activity activity) {
            activity.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.Resumed);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            activity.getClass();
            outState.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.SaveInstanceState);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityStarted(Activity activity) {
            activity.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.Started);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public synchronized void onActivityStopped(Activity activity) {
            activity.getClass();
            this.this$0.registerActivityWithState(activity, LifecycleService.ActivityState.Stopped);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/mapbox/common/LifecycleService$ActivityState;", "", "(Ljava/lang/String;I)V", "Unknown", "Created", "Started", "Resumed", "Paused", "Stopped", "SaveInstanceState", "Destroyed", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum ActivityState {
        Unknown,
        Created,
        Started,
        Resumed,
        Paused,
        Stopped,
        SaveInstanceState,
        Destroyed
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/mapbox/common/LifecycleService$Binder;", "Landroid/os/Binder;", "(Lcom/mapbox/common/LifecycleService;)V", "getService", "Lcom/mapbox/common/LifecycleService;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public final class Binder extends android.os.Binder {
        public Binder() {
        }

        /* JADX INFO: renamed from: getService, reason: from getter */
        public final LifecycleService getThis$0() {
            return LifecycleService.this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/mapbox/common/LifecycleService$Callback;", "", "onLifecycleStateChanged", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface Callback {
        void onLifecycleStateChanged(LifecycleState state);
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityState.values().length];
            try {
                iArr[ActivityState.Unknown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityState.Created.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActivityState.Started.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActivityState.Resumed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActivityState.Paused.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActivityState.Stopped.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActivityState.SaveInstanceState.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActivityState.Destroyed.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$10$lambda$9$lambda$8(l lVar) {
        lVar.getClass();
        lVar.invoke(LifecycleState.UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getLifecycleState$lambda$6$lambda$5(l lVar) {
        lVar.getClass();
        lVar.invoke(LifecycleState.FOREGROUND);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void registerActivityWithState(Activity activity, ActivityState state) {
        try {
            HashMap<WeakReference<Activity>, ActivityState> map = this.registeredActivities;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<Activity>, ActivityState> entry : map.entrySet()) {
                if (s.g(entry.getKey().get(), activity)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (linkedHashMap.isEmpty()) {
                this.registeredActivities.put(new WeakReference<>(activity), state);
            } else {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    this.registeredActivities.put((WeakReference<Activity>) ((Map.Entry) it.next()).getKey(), state);
                }
            }
            getLifecycleState(null, new C39482());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LifecycleState toLifecycleState(ActivityState activityState) {
        switch (WhenMappings.$EnumSwitchMapping$0[activityState.ordinal()]) {
            case 1:
                return LifecycleState.UNKNOWN;
            case 2:
                return LifecycleState.MOVING_FOREGROUND;
            case 3:
                return LifecycleState.MOVING_FOREGROUND;
            case 4:
                return LifecycleState.FOREGROUND;
            case 5:
                return LifecycleState.INACTIVE;
            case 6:
                return LifecycleState.MOVING_BACKGROUND;
            case 7:
                return LifecycleState.BACKGROUND;
            case 8:
                return LifecycleState.BACKGROUND;
            default:
                u0.r();
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void unregisterActivity(Activity activity) {
        try {
            HashMap<WeakReference<Activity>, ActivityState> map = this.registeredActivities;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<WeakReference<Activity>, ActivityState> entry : map.entrySet()) {
                WeakReference<Activity> key = entry.getKey();
                if (key.get() == null || s.g(key.get(), activity)) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                this.registeredActivities.remove(((Map.Entry) it.next()).getKey());
            }
            getLifecycleState(null, new AnonymousClass3());
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateLifecycleState(LifecycleState state) {
        if (this.currentLifecycleState == state) {
            return;
        }
        this.currentLifecycleState = state;
        Callback callback = this.lifecycleCallback;
        if (callback != null) {
            callback.onLifecycleStateChanged(state);
        }
    }

    public final void getLifecycleState(Looper looper, l<? super LifecycleState, Unit> callback) {
        Object bVar;
        callback.getClass();
        Collection<ActivityState> collectionValues = this.registeredActivities.values();
        collectionValues.getClass();
        Collection<ActivityState> collection = collectionValues;
        ArrayList arrayList = new ArrayList(y.r(collection, 10));
        for (ActivityState activityState : collection) {
            activityState.getClass();
            arrayList.add(toLifecycleState(activityState));
        }
        LifecycleState lifecycleState = LifecycleState.FOREGROUND;
        if (arrayList.contains(lifecycleState)) {
            updateLifecycleState(lifecycleState);
            if (looper != null) {
                new Handler(looper).post(new c(callback, 0));
                return;
            } else {
                callback.invoke(lifecycleState);
                return;
            }
        }
        Context applicationContext = getApplicationContext();
        if (arrayList.isEmpty()) {
            LifecycleUtils lifecycleUtils = LifecycleUtils.INSTANCE;
            applicationContext.getClass();
            lifecycleUtils.getLifecycleState(applicationContext, looper, new AnonymousClass2(callback));
            return;
        }
        try {
            int i14 = q.f128596b;
            LifecycleUtils lifecycleUtils2 = LifecycleUtils.INSTANCE;
            applicationContext.getClass();
            lifecycleUtils2.hasServiceRunningInForeground(applicationContext, looper, new LifecycleService$getLifecycleState$3$1(this, callback));
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = q.f128596b;
            bVar = new q.b(th3);
        }
        Throwable thB = q.b(bVar);
        if (thB != null) {
            Log.error(j.p("Failed to get application state: ", thB), TAG);
            if (looper != null) {
                new Handler(looper).post(new c(callback, 1));
            } else {
                callback.invoke(LifecycleState.UNKNOWN);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        LifecycleUtils.INSTANCE.getLifecycleState(this, null, new AnonymousClass1());
        Application application = getApplication();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.callback);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.currentLifecycleState = LifecycleState.UNKNOWN;
        this.registeredActivities.clear();
        Application application = getApplication();
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.callback);
        }
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        if (level == 10 || level == 15 || level == 40 || level == 60) {
            Log.debug(j.h(level, "Got onTrimMemory in LifecycleService: "), TAG);
            MemoryMonitorFactory.getOrCreate().notifySystemMemoryWarningReceived();
        }
    }

    public final synchronized void setCallback(Callback observer) {
        this.lifecycleCallback = observer;
        getLifecycleState(null, new C39491(observer));
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleService$onCreate$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<LifecycleState, Unit> {
        public AnonymousClass1() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            LifecycleService.this.currentLifecycleState = lifecycleState;
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleService$registerActivityWithState$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39482 extends w implements l<LifecycleState, Unit> {
        public C39482() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            LifecycleService.this.updateLifecycleState(lifecycleState);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleService$unregisterActivity$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass3 extends w implements l<LifecycleState, Unit> {
        public AnonymousClass3() {
            super(1);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            LifecycleService.this.updateLifecycleState(lifecycleState);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleService$setCallback$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class C39491 extends w implements l<LifecycleState, Unit> {
        final /* synthetic */ Callback $observer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C39491(Callback callback) {
            super(1);
            this.$observer = callback;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            Callback callback = this.$observer;
            if (callback != null) {
                callback.onLifecycleStateChanged(lifecycleState);
            }
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleService$getLifecycleState$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass2 extends w implements l<LifecycleState, Unit> {
        final /* synthetic */ l<LifecycleState, Unit> $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(l<? super LifecycleState, Unit> lVar) {
            super(1);
            this.$callback = lVar;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            LifecycleService.this.updateLifecycleState(lifecycleState);
            this.$callback.invoke(lifecycleState);
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    @o13.e
    public final LifecycleState getLifecycleState() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        getLifecycleState(null, new LifecycleService$lifecycleState$1(countDownLatch));
        countDownLatch.await();
        return this.currentLifecycleState;
    }
}
