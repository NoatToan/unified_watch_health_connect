package com.xiaomi.fitness.sensor;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.UIUtils;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J\u001c\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000bH\u0007J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\nJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0016H\u0002J\b\u0010 \u001a\u00020\u0016H\u0002R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionSensor;", "", "context", "Landroid/content/Context;", "flag", "", "<init>", "(Landroid/content/Context;I)V", "mEventListenerMap", "", "Lcom/xiaomi/fitness/sensor/ActionEventListener;", "Landroid/os/Handler;", "mActionDetectors", "", "Lcom/xiaomi/fitness/sensor/IEventDetector;", "mHandler", "mEventEmitter", "Lcom/xiaomi/fitness/sensor/ActionEventEmitter;", "isStart", "", "mFlag", "initDetector", "", "ctx", "registerListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "handler", "unregisterListener", "deliverEvent", "event", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "onStartSensor", "onStopSensor", "InnerEmitterCallback", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nActionSensor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionSensor.kt\ncom/xiaomi/fitness/sensor/ActionSensor\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,124:1\n37#2:125\n36#2,3:126\n37#2:129\n36#2,3:130\n*S KotlinDebug\n*F\n+ 1 ActionSensor.kt\ncom/xiaomi/fitness/sensor/ActionSensor\n*L\n83#1:125\n83#1:126,3\n98#1:129\n98#1:130,3\n*E\n"})
public final class ActionSensor {
    public static final int FLAG_DISABLE_DETECTOR_INTERACTIVE = 2;
    public static final int FLAG_DISABLE_DETECTOR_LIGHT = 4;
    public static final int FLAG_DISABLE_DETECTOR_MOTION = 1;
    private boolean isStart;

    @NotNull
    private final List<IEventDetector> mActionDetectors;

    @NotNull
    private final ActionEventEmitter mEventEmitter;

    @NotNull
    private final Map<ActionEventListener, Handler> mEventListenerMap;
    private final int mFlag;

    @NotNull
    private final Handler mHandler;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionSensor$InnerEmitterCallback;", "Lcom/xiaomi/fitness/sensor/ActionEventEmitter$EmitterCallback;", "<init>", "(Lcom/xiaomi/fitness/sensor/ActionSensor;)V", "onFire", "", "actionSensorEvent", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class InnerEmitterCallback implements ActionEventEmitter.EmitterCallback {
        public InnerEmitterCallback() {
        }

        @Override // com.xiaomi.fitness.sensor.ActionEventEmitter.EmitterCallback
        public void onFire(@NotNull ActionSensorEvent actionSensorEvent) {
            Intrinsics.checkNotNullParameter(actionSensorEvent, "actionSensorEvent");
            ActionSensor.this.deliverEvent(actionSensorEvent);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ActionSensor(@NotNull Context context) {
        this(context, 0, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deliverEvent(ActionSensorEvent event) {
        synchronized (this.mEventListenerMap) {
            for (Map.Entry<ActionEventListener, Handler> entry : this.mEventListenerMap.entrySet()) {
                try {
                    entry.getValue().post(new OnEventTask(entry.getKey(), event));
                } catch (IllegalStateException e) {
                    Logger.e("deliver event exception: " + e, new Object[0]);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void initDetector(Context ctx) {
        synchronized (this) {
            try {
                if ((this.mFlag & 2) == 0) {
                    this.mActionDetectors.add(InteractiveDetector.INSTANCE);
                }
                if ((this.mFlag & 1) == 0) {
                    this.mActionDetectors.add(new MotionDetector(ctx));
                }
                if ((this.mFlag & 4) == 0) {
                    this.mActionDetectors.add(new LightDetector(ctx));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void onStartSensor() {
        synchronized (this) {
            if (this.isStart) {
                return;
            }
            this.isStart = true;
            Logger.i("start " + this, new Object[0]);
            this.mEventEmitter.register((IEventDetector[]) this.mActionDetectors.toArray(new IEventDetector[0]));
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void onStopSensor() {
        synchronized (this.mEventListenerMap) {
            if (!this.mEventListenerMap.isEmpty()) {
                return;
            }
            Unit unit = Unit.INSTANCE;
            synchronized (this) {
                if (this.isStart) {
                    Logger.i("stop " + this, new Object[0]);
                    this.mEventEmitter.unregister((IEventDetector[]) this.mActionDetectors.toArray(new IEventDetector[0]));
                    this.isStart = false;
                    this.mHandler.removeCallbacksAndMessages(null);
                }
            }
        }
    }

    public static /* synthetic */ void registerListener$default(ActionSensor actionSensor, ActionEventListener actionEventListener, Handler handler, int i, Object obj) {
        if ((i & 2) != 0) {
            handler = null;
        }
        actionSensor.registerListener(actionEventListener, handler);
    }

    @JvmOverloads
    public final void registerListener(@NotNull ActionEventListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        registerListener$default(this, listener, null, 2, null);
    }

    public final void unregisterListener(@NotNull ActionEventListener listener) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.mEventListenerMap) {
            try {
                zContainsKey = this.mEventListenerMap.containsKey(listener);
                if (zContainsKey) {
                    this.mEventListenerMap.remove(listener);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zContainsKey) {
            onStopSensor();
        }
    }

    @JvmOverloads
    public ActionSensor(@NotNull Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.mEventListenerMap = new ArrayMap();
        this.mActionDetectors = new LinkedList();
        Context safeContext = UIUtils.getSafeContext(context);
        this.mHandler = new Handler(Looper.getMainLooper());
        ActionEventEmitter actionEventEmitter = new ActionEventEmitter();
        this.mEventEmitter = actionEventEmitter;
        actionEventEmitter.setCallback(new InnerEmitterCallback());
        this.mFlag = i;
        initDetector(safeContext);
    }

    @JvmOverloads
    public final void registerListener(@NotNull ActionEventListener listener, @Nullable Handler handler) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.mEventListenerMap) {
            if (handler == null) {
                try {
                    handler = this.mHandler;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.mEventListenerMap.put(listener, handler);
        }
        onStartSensor();
    }

    public /* synthetic */ ActionSensor(Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? 0 : i);
    }
}
