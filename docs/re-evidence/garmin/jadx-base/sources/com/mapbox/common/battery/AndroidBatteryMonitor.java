package com.mapbox.common.battery;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import cd0.f;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.common.BatteryChargingStatusCallback;
import com.mapbox.common.BatteryMonitorInterface;
import com.mapbox.common.BatteryMonitorObserver;
import com.mapbox.common.MapboxSDKCommon;
import java.util.LinkedHashMap;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\nH\u0002J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0010H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/mapbox/common/battery/AndroidBatteryMonitor;", "Lcom/mapbox/common/BatteryMonitorInterface;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "intentBatteryActionName", "", "(Landroid/content/Context;Ljava/lang/String;)V", "broadcastReceiver", "Landroid/content/BroadcastReceiver;", "chargingState", "Lcom/mapbox/bindgen/Expected;", "", "intentFilter", "Landroid/content/IntentFilter;", "observers", "", "Lcom/mapbox/common/BatteryMonitorObserver;", "Landroid/os/Handler;", "getBatteryChargingStatus", "", "callback", "Lcom/mapbox/common/BatteryChargingStatusCallback;", "notifyObservers", RemoteConfigConstants.ResponseFieldKey.STATE, "onNewIntent", "intent", "Landroid/content/Intent;", "registerObserver", "observer", "unregisterObserver", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AndroidBatteryMonitor implements BatteryMonitorInterface {
    private static final int BATTERY_STATUS_UNPLUGGED = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String NO_BATTERY_INFO_ERROR = "Unknown battery status";
    private final BroadcastReceiver broadcastReceiver;
    private Expected<String, Boolean> chargingState;
    private final Context context;
    private final IntentFilter intentFilter;
    private final Map<BatteryMonitorObserver, Handler> observers;

    public AndroidBatteryMonitor(Context context, String str) {
        context.getClass();
        str.getClass();
        this.context = context;
        this.observers = new LinkedHashMap();
        this.intentFilter = new IntentFilter(str);
        this.broadcastReceiver = new BroadcastReceiver() { // from class: com.mapbox.common.battery.AndroidBatteryMonitor$broadcastReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                context2.getClass();
                intent.getClass();
                this.this$0.onNewIntent(intent);
            }
        };
    }

    public static final BatteryMonitorInterface create() {
        return INSTANCE.create();
    }

    private final void notifyObservers(Expected<String, Boolean> state) {
        for (Map.Entry<BatteryMonitorObserver, Handler> entry : this.observers.entrySet()) {
            BatteryMonitorObserver key = entry.getKey();
            Handler value = entry.getValue();
            if (value != null) {
                value.post(new f(24, key, state));
            } else {
                INSTANCE.notify(key, state);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyObservers$lambda$2$lambda$1(BatteryMonitorObserver batteryMonitorObserver, Expected expected) {
        batteryMonitorObserver.getClass();
        expected.getClass();
        INSTANCE.notify(batteryMonitorObserver, expected);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onNewIntent(Intent intent) {
        Companion companion = INSTANCE;
        Expected<String, Boolean> state = companion.getState(intent);
        if (!companion.equals(state, this.chargingState)) {
            this.chargingState = state;
            notifyObservers(state);
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void getBatteryChargingStatus(BatteryChargingStatusCallback callback) {
        callback.getClass();
        callback.run(INSTANCE.getState(this.context.registerReceiver(null, this.intentFilter)));
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void registerObserver(BatteryMonitorObserver observer) {
        try {
            observer.getClass();
            Map<BatteryMonitorObserver, Handler> map = this.observers;
            Looper looperMyLooper = Looper.myLooper();
            map.put(observer, looperMyLooper != null ? new Handler(looperMyLooper) : null);
            if (this.observers.size() == 1) {
                this.context.registerReceiver(this.broadcastReceiver, this.intentFilter);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.mapbox.common.BatteryMonitorInterface
    public synchronized void unregisterObserver(BatteryMonitorObserver observer) {
        observer.getClass();
        this.observers.remove(observer);
        if (this.observers.isEmpty()) {
            this.context.unregisterReceiver(this.broadcastReceiver);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0007J,\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\f2\u0010\u0010\r\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\fH\u0002J\u001e\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/mapbox/common/battery/AndroidBatteryMonitor$Companion;", "", "()V", "BATTERY_STATUS_UNPLUGGED", "", "NO_BATTERY_INFO_ERROR", "", "create", "Lcom/mapbox/common/BatteryMonitorInterface;", "equals", "", "e1", "Lcom/mapbox/bindgen/Expected;", "e2", "getState", "intent", "Landroid/content/Intent;", "notify", "", "Lcom/mapbox/common/BatteryMonitorObserver;", RemoteConfigConstants.ResponseFieldKey.STATE, "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean equals(Expected<?, ?> e4, Expected<?, ?> e14) {
            if (e4 == null || e14 == null) {
                return s.g(e4, e14);
            }
            if (e4.isValue()) {
                if (e14.isValue()) {
                    return s.g(e4.getValue(), e14.getValue());
                }
                return false;
            }
            if (e14.isError()) {
                return s.g(e4.getError(), e14.getError());
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Expected<String, Boolean> getState(Intent intent) {
            if (intent == null || !intent.hasExtra("plugged")) {
                Expected<String, Boolean> expectedCreateError = ExpectedFactory.createError(AndroidBatteryMonitor.NO_BATTERY_INFO_ERROR);
                expectedCreateError.getClass();
                return expectedCreateError;
            }
            Expected<String, Boolean> expectedCreateValue = ExpectedFactory.createValue(Boolean.valueOf(intent.getIntExtra("plugged", -1) != 0));
            expectedCreateValue.getClass();
            return expectedCreateValue;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void notify(final BatteryMonitorObserver batteryMonitorObserver, Expected<String, Boolean> expected) {
            final int i14 = 0;
            Expected<String, Boolean> expectedOnValue = expected.onValue(new Expected.Action() { // from class: com.mapbox.common.battery.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i14) {
                        case 0:
                            AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                            break;
                        default:
                            AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                            break;
                    }
                }
            });
            final int i15 = 1;
            expectedOnValue.onError(new Expected.Action() { // from class: com.mapbox.common.battery.a
                @Override // com.mapbox.bindgen.Expected.Action
                public final void run(Object obj) {
                    switch (i15) {
                        case 0:
                            AndroidBatteryMonitor.Companion.notify$lambda$0(batteryMonitorObserver, ((Boolean) obj).booleanValue());
                            break;
                        default:
                            AndroidBatteryMonitor.Companion.notify$lambda$1(batteryMonitorObserver, (String) obj);
                            break;
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$0(BatteryMonitorObserver batteryMonitorObserver, boolean z14) {
            batteryMonitorObserver.getClass();
            batteryMonitorObserver.onBatteryChargingStatusChanged(z14);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notify$lambda$1(BatteryMonitorObserver batteryMonitorObserver, String str) {
            batteryMonitorObserver.getClass();
            str.getClass();
            batteryMonitorObserver.onBatteryStatusError(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final BatteryMonitorInterface create() {
            return new AndroidBatteryMonitor(MapboxSDKCommon.INSTANCE.getContext(), null, 2, 0 == true ? 1 : 0);
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidBatteryMonitor(Context context, String str, int i14, j jVar) {
        this(context, (i14 & 2) != 0 ? "android.intent.action.BATTERY_CHANGED" : str);
    }
}
