package com.xiaomi.fitness.sensor;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.collection.ArraySet;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.handler.JobHandlerProvider;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 32\u00020\u00012\u00020\u0002:\u000223B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J$\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\n\u0010\u001a\u001a\u00020\u001b\"\u00020\u001cH\u0016J\u0019\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u001f¢\u0006\u0002\u0010 J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0015H\u0002J \u0010'\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u001b\u0010,\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u001fH\u0002¢\u0006\u0002\u0010 J\u0018\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u000e2\u0006\u00100\u001a\u00020#H\u0002J\u001d\u00101\u001a\u00020\u00152\u000e\u0010-\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001fH\u0002¢\u0006\u0002\u0010 R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010)\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionEventEmitter;", "Lcom/xiaomi/fitness/sensor/IDetectorIndicator;", "Landroid/os/Handler$Callback;", "<init>", "()V", "mRegisteredDetectors", "Landroid/util/SparseArray;", "Lcom/xiaomi/fitness/sensor/IEventDetector;", "mEmitterChamber", "Lcom/xiaomi/fitness/sensor/ActionEventEmitterChamber;", "mJobHandler", "Landroid/os/Handler;", "mTimeoutDurations", "", "", "mEmitterCallback", "Lcom/xiaomi/fitness/sensor/ActionEventEmitter$EmitterCallback;", "mLastRefreshTime", "", "Ljava/lang/Long;", "setCallback", "", "callback", "onRefresh", "event", "accuracy", Constants.KEY_RECHARGE_VALUES, "", "", LoginPreferenceConfig.TYPE_REGISTER, "detector", "", "([Lcom/xiaomi/fitness/sensor/IEventDetector;)V", "unregister", "handleMessage", "", "msg", "Landroid/os/Message;", "performOnSamplingTimeout", "performRefresh", "resetSamplingTimeoutListener", "timeoutDuration", "getTimeoutDuration", "()J", "performRegister", "detectors", "updateTimeoutDuration", "samplingPeriodMicros", "isAdd", "performUnregister", "EmitterCallback", "Companion", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ActionEventEmitter implements IDetectorIndicator, Handler.Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MSG_REFRESH = 3;
    private static final int MSG_REGISTER = 1;
    private static final int MSG_SAMPLING_TIMEOUT = 4;
    private static final int MSG_UNREGISTER = 2;

    @Nullable
    private EmitterCallback mEmitterCallback;

    @Nullable
    private Long mLastRefreshTime;

    @NotNull
    private final SparseArray<IEventDetector> mRegisteredDetectors = new SparseArray<>();

    @NotNull
    private final ActionEventEmitterChamber mEmitterChamber = new ActionEventEmitterChamber();

    @NotNull
    private final Handler mJobHandler = JobHandlerProvider.INSTANCE.newJobHandler(this).newJob();

    @NotNull
    private final Set<Integer> mTimeoutDurations = new ArraySet();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionEventEmitter$Companion;", "", "<init>", "()V", "MSG_REGISTER", "", "MSG_UNREGISTER", "MSG_REFRESH", "MSG_SAMPLING_TIMEOUT", "inflateEvent", "", "from", "", "Lcom/xiaomi/fitness/sensor/EventBullet;", "to", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void inflateEvent(Iterator<EventBullet> from, ActionSensorEvent to) {
            while (true) {
                Intrinsics.checkNotNull(from);
                if (!from.hasNext()) {
                    to.setRealTimestampNanos(SystemClock.elapsedRealtimeNanos());
                    return;
                } else {
                    EventBullet next = from.next();
                    Intrinsics.checkNotNull(next);
                    to.addActionEvent(next.getEvent(), next.getAccuracy(), next.getValues());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sensor/ActionEventEmitter$EmitterCallback;", "", "onFire", "", "actionSensorEvent", "Lcom/xiaomi/fitness/sensor/ActionSensorEvent;", "sensor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface EmitterCallback {
        void onFire(@NotNull ActionSensorEvent actionSensorEvent);
    }

    private final long getTimeoutDuration() {
        if (this.mTimeoutDurations.isEmpty()) {
            return 1000L;
        }
        return (long) (((Number) Collections.max(this.mTimeoutDurations)).floatValue() * 1.25f);
    }

    private final void performOnSamplingTimeout() {
        if (this.mRegisteredDetectors.size() == 0) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        Iterator<EventBullet> itDescendingIterator = this.mEmitterChamber.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            EventBullet next = itDescendingIterator.next();
            if (this.mLastRefreshTime != null) {
                Intrinsics.checkNotNull(next);
                long timestamp = next.getTimestamp();
                Long l = this.mLastRefreshTime;
                Intrinsics.checkNotNull(l);
                if (timestamp > l.longValue()) {
                }
            }
            SparseArray<IEventDetector> sparseArray = this.mRegisteredDetectors;
            Intrinsics.checkNotNull(next);
            IEventDetector iEventDetector = sparseArray.get(next.getEvent());
            if (iEventDetector != null) {
                arraySet.add(iEventDetector);
            }
        }
        Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            ((IEventDetector) it.next()).requestRefresh();
        }
    }

    private final void performRefresh(int event, int accuracy, float[] values) {
        this.mEmitterChamber.pushBullet(event, accuracy, Arrays.copyOf(values, values.length));
        int iCount = this.mEmitterChamber.count();
        if (iCount < this.mRegisteredDetectors.size() || this.mRegisteredDetectors.size() == 0) {
            return;
        }
        EventBullet eventBulletPeekLast = this.mEmitterChamber.peekLast();
        if (this.mLastRefreshTime != null) {
            Intrinsics.checkNotNull(eventBulletPeekLast);
            long timestamp = eventBulletPeekLast.getTimestamp();
            Long l = this.mLastRefreshTime;
            Intrinsics.checkNotNull(l);
            if (timestamp <= l.longValue()) {
                return;
            }
        }
        EmitterCallback emitterCallback = this.mEmitterCallback;
        if (emitterCallback != null) {
            if (this.mEmitterChamber.isReady()) {
                ActionSensorEvent actionSensorEvent = new ActionSensorEvent(iCount);
                INSTANCE.inflateEvent(this.mEmitterChamber.iterator(), actionSensorEvent);
                emitterCallback.onFire(actionSensorEvent);
            }
            resetSamplingTimeoutListener();
        }
        EventBullet eventBulletPeekFirst = this.mEmitterChamber.peekFirst();
        Intrinsics.checkNotNull(eventBulletPeekFirst);
        this.mLastRefreshTime = Long.valueOf(eventBulletPeekFirst.getTimestamp());
    }

    private final void performRegister(IEventDetector[] detectors) {
        if (detectors.length == 0) {
            return;
        }
        for (IEventDetector iEventDetector : detectors) {
            int detectEvent = iEventDetector.getDetectEvent();
            this.mRegisteredDetectors.put(detectEvent, iEventDetector);
            this.mEmitterChamber.pushBullet(detectEvent, -1, new float[0]);
            iEventDetector.onAttach(this);
            if (this.mRegisteredDetectors.size() == 1) {
                resetSamplingTimeoutListener();
            }
            updateTimeoutDuration(iEventDetector.getSamplingPeriod(), true);
        }
    }

    private final void performUnregister(IEventDetector[] detectors) {
        if (detectors == null || detectors.length == 0) {
            return;
        }
        Iterator it = ArrayIteratorKt.iterator(detectors);
        while (it.hasNext()) {
            IEventDetector iEventDetector = (IEventDetector) it.next();
            iEventDetector.onDetach();
            int detectEvent = iEventDetector.getDetectEvent();
            this.mRegisteredDetectors.remove(detectEvent);
            this.mEmitterChamber.popBullet(detectEvent);
            if (this.mRegisteredDetectors.size() == 0) {
                this.mJobHandler.removeMessages(4);
            }
            updateTimeoutDuration(iEventDetector.getSamplingPeriod(), false);
        }
    }

    private final void resetSamplingTimeoutListener() {
        this.mJobHandler.removeMessages(4);
        this.mJobHandler.sendEmptyMessageDelayed(4, getTimeoutDuration());
    }

    private final void updateTimeoutDuration(int samplingPeriodMicros, boolean isAdd) {
        if (isAdd) {
            this.mTimeoutDurations.add(Integer.valueOf((int) TimeUnit.MICROSECONDS.toMillis(samplingPeriodMicros)));
        } else {
            this.mTimeoutDurations.remove(Integer.valueOf((int) TimeUnit.MICROSECONDS.toMillis(samplingPeriodMicros)));
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(@NotNull Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        Logger.i("ActionEventEmitter", "handleMessage: " + msg.what);
        int i = msg.what;
        if (i == 1) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<com.xiaomi.fitness.sensor.IEventDetector>");
            performRegister((IEventDetector[]) obj);
            return true;
        }
        if (i == 2) {
            Object obj2 = msg.obj;
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Array<com.xiaomi.fitness.sensor.IEventDetector>");
            performUnregister((IEventDetector[]) obj2);
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            performOnSamplingTimeout();
            return true;
        }
        int i2 = msg.arg1;
        int i3 = msg.arg2;
        Object obj3 = msg.obj;
        Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.FloatArray");
        performRefresh(i2, i3, (float[]) obj3);
        return true;
    }

    @Override // com.xiaomi.fitness.sensor.IDetectorIndicator
    public void onRefresh(int event, int accuracy, @NotNull float... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.mJobHandler.obtainMessage(3, event, accuracy, values).sendToTarget();
    }

    public final void register(@NotNull IEventDetector[] detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.mJobHandler.obtainMessage(1, detector).sendToTarget();
    }

    public final void setCallback(@Nullable EmitterCallback callback) {
        this.mEmitterCallback = callback;
    }

    public final void unregister(@NotNull IEventDetector[] detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        this.mJobHandler.obtainMessage(2, detector).sendToTarget();
    }
}
