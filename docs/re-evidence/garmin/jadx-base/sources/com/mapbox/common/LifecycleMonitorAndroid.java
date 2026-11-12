package com.mapbox.common;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import cd0.f;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.messaging.Constants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import e23.l;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0002\b\u000b\b\u0000\u0018\u0000 *2\u00020\u0001:\u0002*+B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0015H\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001a\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!H\u0002J\u001a\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u001c\u0010\"\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u0019J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0011H\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020!H\u0002J\u001c\u0010)\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0014\u001a\"\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\u0016\u001a\"\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010j\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0012`\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid;", "Lcom/mapbox/common/LifecycleMonitorInterface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "lifecycleService", "Lcom/mapbox/common/LifecycleService;", "lifecycleServiceCallback", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceCallback$1;", "lifecycleServiceConnection", "com/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1", "Lcom/mapbox/common/LifecycleMonitorAndroid$lifecycleServiceConnection$1;", "monitorState", "Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "observers", "Ljava/util/HashMap;", "Lcom/mapbox/common/LifecycleObserver;", "Landroid/os/Handler;", "Lkotlin/collections/HashMap;", "pendingLifecycleStateCallbacks", "Lcom/mapbox/common/GetLifecycleStateCallback;", "pendingMonitoringStateCallbacks", "Lcom/mapbox/common/GetLifecycleMonitoringStateCallback;", "getLifecycleState", "", "callback", "getMonitoringState", "notifyObservers", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleMonitoringState;", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "", "Lcom/mapbox/common/LifecycleState;", "notifyPendingCallbacks", "registerObserver", "observer", TtmlNode.START, "stop", "unregisterObserver", "updateLifecycleState", "updateMonitorState", "Companion", "MonitorState", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class LifecycleMonitorAndroid implements LifecycleMonitorInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "LifecycleMonitor";
    private final Context context;
    private LifecycleService lifecycleService;
    private final LifecycleMonitorAndroid$lifecycleServiceCallback$1 lifecycleServiceCallback;
    private final LifecycleMonitorAndroid$lifecycleServiceConnection$1 lifecycleServiceConnection;
    private MonitorState monitorState;
    private HashMap<LifecycleObserver, Handler> observers;
    private HashMap<GetLifecycleStateCallback, Handler> pendingLifecycleStateCallbacks;
    private HashMap<GetLifecycleMonitoringStateCallback, Handler> pendingMonitoringStateCallbacks;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$MonitorState;", "", "(Ljava/lang/String;I)V", "STARTING", "STARTED", "STOPPING", "STOPPED", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public enum MonitorState {
        STARTING,
        STARTED,
        STOPPING,
        STOPPED
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MonitorState.values().length];
            try {
                iArr[MonitorState.STOPPING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MonitorState.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MonitorState.STARTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MonitorState.STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1] */
    private LifecycleMonitorAndroid(Context context) {
        this.context = context;
        this.monitorState = MonitorState.STOPPED;
        this.observers = new HashMap<>();
        this.pendingLifecycleStateCallbacks = new HashMap<>();
        this.pendingMonitoringStateCallbacks = new HashMap<>();
        this.lifecycleServiceCallback = new LifecycleService.Callback() { // from class: com.mapbox.common.LifecycleMonitorAndroid$lifecycleServiceCallback$1
            @Override // com.mapbox.common.LifecycleService.Callback
            public void onLifecycleStateChanged(LifecycleState state) {
                state.getClass();
                this.this$0.updateLifecycleState(state);
            }
        };
        this.lifecycleServiceConnection = new LifecycleMonitorAndroid$lifecycleServiceConnection$1(this);
    }

    public static final LifecycleMonitorInterface create() {
        return INSTANCE.create();
    }

    private final synchronized void notifyObservers(LifecycleMonitoringState state, String error) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new a8.d(entry, 28, state, error));
                } else {
                    entry.getKey().onMonitoringStateChanged(state, error);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$4$lambda$2$lambda$1(Map.Entry entry, LifecycleMonitoringState lifecycleMonitoringState, String str) {
        entry.getClass();
        lifecycleMonitoringState.getClass();
        ((LifecycleObserver) entry.getKey()).onMonitoringStateChanged(lifecycleMonitoringState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$8$lambda$6$lambda$5(Map.Entry entry, LifecycleState lifecycleState) {
        entry.getClass();
        lifecycleState.getClass();
        ((LifecycleObserver) entry.getKey()).onLifecycleStateChanged(lifecycleState);
    }

    private final synchronized void notifyPendingCallbacks(LifecycleMonitoringState state, String error) {
        Expected<String, LifecycleMonitoringState> expectedCreateError;
        if (error != null) {
            try {
                expectedCreateError = ExpectedFactory.createError(error);
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            expectedCreateError = null;
        }
        if (expectedCreateError == null) {
            expectedCreateError = ExpectedFactory.createValue(state);
            expectedCreateError.getClass();
        }
        for (Map.Entry<GetLifecycleMonitoringStateCallback, Handler> entry : this.pendingMonitoringStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new b(entry, expectedCreateError, 1));
            } else {
                entry.getKey().run(expectedCreateError);
            }
        }
        this.pendingMonitoringStateCallbacks.clear();
    }

    public static /* synthetic */ void notifyPendingCallbacks$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, LifecycleState lifecycleState, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.notifyPendingCallbacks(lifecycleState, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$14$lambda$12$lambda$11(Map.Entry entry, Expected expected) {
        entry.getClass();
        expected.getClass();
        ((GetLifecycleMonitoringStateCallback) entry.getKey()).run(expected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyPendingCallbacks$lambda$20$lambda$18$lambda$17(Map.Entry entry, Expected expected) {
        entry.getClass();
        expected.getClass();
        ((GetLifecycleStateCallback) entry.getKey()).run(expected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void updateLifecycleState(LifecycleState state) {
        notifyPendingCallbacks$default(this, state, null, 2, null);
        notifyObservers(state);
    }

    private final synchronized void updateMonitorState(MonitorState state, String error) {
        try {
            this.monitorState = state;
            if (error != null) {
                notifyPendingCallbacks(LifecycleState.UNKNOWN, error);
            }
            int i14 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i14 == 2) {
                LifecycleMonitoringState lifecycleMonitoringState = LifecycleMonitoringState.STOPPED;
                notifyPendingCallbacks(lifecycleMonitoringState, error);
                notifyObservers(lifecycleMonitoringState, error);
            } else if (i14 == 4) {
                LifecycleMonitoringState lifecycleMonitoringState2 = LifecycleMonitoringState.STARTED;
                notifyPendingCallbacks(lifecycleMonitoringState2, error);
                notifyObservers(lifecycleMonitoringState2, error);
                if (this.observers.isEmpty() && this.pendingLifecycleStateCallbacks.isEmpty()) {
                    stop();
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static /* synthetic */ void updateMonitorState$default(LifecycleMonitorAndroid lifecycleMonitorAndroid, MonitorState monitorState, String str, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        lifecycleMonitorAndroid.updateMonitorState(monitorState, str);
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getLifecycleState(GetLifecycleStateCallback callback) {
        LifecycleService lifecycleService;
        try {
            callback.getClass();
            int i14 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                HashMap<GetLifecycleStateCallback, Handler> map = this.pendingLifecycleStateCallbacks;
                Looper looperMyLooper = Looper.myLooper();
                map.put(callback, looperMyLooper != null ? new Handler(looperMyLooper) : null);
                if (this.monitorState != MonitorState.STARTING) {
                    start();
                }
            } else if (i14 == 4 && (lifecycleService = this.lifecycleService) != null) {
                lifecycleService.getLifecycleState(Looper.myLooper(), new AnonymousClass1(callback));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:12:0x001b, B:15:0x0027, B:16:0x0031, B:18:0x0039, B:20:0x0040), top: B:25:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:18:0x0039 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:3:0x0001, B:12:0x001b, B:15:0x0027, B:16:0x0031, B:18:0x0039, B:20:0x0040), top: B:25:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void getMonitoringState(GetLifecycleMonitoringStateCallback callback) {
        Looper looperMyLooper;
        Handler handler;
        try {
            callback.getClass();
            int i14 = WhenMappings.$EnumSwitchMapping$0[this.monitorState.ordinal()];
            if (i14 == 1) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map.put(callback, handler);
            } else if (i14 == 2) {
                callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STOPPED));
            } else if (i14 == 3) {
                HashMap<GetLifecycleMonitoringStateCallback, Handler> map2 = this.pendingMonitoringStateCallbacks;
                looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    handler = new Handler(looperMyLooper);
                } else {
                    handler = null;
                }
                map2.put(callback, handler);
            } else if (i14 == 4) {
                callback.run(ExpectedFactory.createValue(LifecycleMonitoringState.STARTED));
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void registerObserver(LifecycleObserver observer) {
        try {
            observer.getClass();
            HashMap<LifecycleObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.monitorState != MonitorState.STARTED) {
                start();
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void start() {
        MonitorState monitorState = this.monitorState;
        MonitorState monitorState2 = MonitorState.STARTING;
        if (monitorState != monitorState2 && monitorState != MonitorState.STARTED) {
            updateMonitorState$default(this, monitorState2, null, 2, null);
            if (this.context.bindService(new Intent(this.context, (Class<?>) LifecycleService.class), this.lifecycleServiceConnection, 1)) {
                return;
            }
            Log.error("Failed to bind lifecycle service", TAG);
            updateMonitorState(MonitorState.STOPPED, "Cannot start service");
        }
    }

    public final synchronized void stop() {
        try {
            MonitorState monitorState = this.monitorState;
            MonitorState monitorState2 = MonitorState.STOPPING;
            if (monitorState != monitorState2 && monitorState != MonitorState.STOPPED) {
                updateMonitorState$default(this, monitorState2, null, 2, null);
                LifecycleService lifecycleService = this.lifecycleService;
                if (lifecycleService != null) {
                    this.context.unbindService(this.lifecycleServiceConnection);
                    lifecycleService.stopSelf();
                }
                this.lifecycleServiceConnection.onServiceDisconnected(null);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.LifecycleMonitorInterface
    public synchronized void unregisterObserver(LifecycleObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            stop();
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/mapbox/common/LifecycleMonitorAndroid$Companion;", "", "()V", "TAG", "", "create", "Lcom/mapbox/common/LifecycleMonitorInterface;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final LifecycleMonitorInterface create() {
            return new LifecycleMonitorAndroid(MapboxSDKCommon.INSTANCE.getContext(), null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.mapbox.common.LifecycleMonitorAndroid$getLifecycleState$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", RemoteConfigConstants.ResponseFieldKey.STATE, "Lcom/mapbox/common/LifecycleState;", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 extends w implements l<LifecycleState, Unit> {
        final /* synthetic */ GetLifecycleStateCallback $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(GetLifecycleStateCallback getLifecycleStateCallback) {
            super(1);
            this.$callback = getLifecycleStateCallback;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LifecycleState lifecycleState) {
            lifecycleState.getClass();
            this.$callback.run(ExpectedFactory.createValue(lifecycleState));
        }

        @Override // e23.l
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleState lifecycleState) {
            invoke2(lifecycleState);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LifecycleMonitorAndroid(Context context, j jVar) {
        this(context);
    }

    private final synchronized void notifyObservers(LifecycleState state) {
        try {
            for (Map.Entry<LifecycleObserver, Handler> entry : this.observers.entrySet()) {
                Handler value = entry.getValue();
                if (value != null) {
                    value.post(new f(22, entry, state));
                } else {
                    entry.getKey().onLifecycleStateChanged(state);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private final synchronized void notifyPendingCallbacks(LifecycleState state, String error) {
        Expected<String, LifecycleState> expectedCreateError;
        if (error != null) {
            try {
                expectedCreateError = ExpectedFactory.createError(error);
            } catch (Throwable th3) {
                throw th3;
            }
        } else {
            expectedCreateError = null;
        }
        if (expectedCreateError == null) {
            expectedCreateError = ExpectedFactory.createValue(state);
            expectedCreateError.getClass();
        }
        for (Map.Entry<GetLifecycleStateCallback, Handler> entry : this.pendingLifecycleStateCallbacks.entrySet()) {
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new b(entry, expectedCreateError, 0));
            } else {
                entry.getKey().run(expectedCreateError);
            }
        }
        this.pendingLifecycleStateCallbacks.clear();
    }
}
