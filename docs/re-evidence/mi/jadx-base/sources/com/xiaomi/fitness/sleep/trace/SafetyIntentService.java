package com.xiaomi.fitness.sleep.trace;

import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import android.os.SystemClock;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.sleep.trace.SafetyIntentService;
import com.xiaomi.fitness.sleep.trace.extensions.LogExtKt;
import com.xiaomi.fitness.sleep.trace.model.SleepPeriodInfo;
import com.xiaomi.fitness.sleep.trace.model.UserSleepModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000bJ\b\u0010\u0014\u001a\u00020\u0011H\u0016J\u001a\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\"\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u001f\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0018\u00010\tR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SafetyIntentService;", "Landroid/app/Service;", "mName", "", "<init>", "(Ljava/lang/String;)V", "mServiceLooper", "Landroid/os/Looper;", "mServiceHandler", "Lcom/xiaomi/fitness/sleep/trace/SafetyIntentService$ServiceHandler;", "mRedelivery", "", "mStartTime", "", "mHandler", "Landroid/os/Handler;", "delayStopSelf", "", "setIntentRedelivery", "enabled", "onCreate", LifecycleConstantKt.ON_START, "intent", "Landroid/content/Intent;", "startId", "", "onStartCommand", "flags", LifecycleConstantKt.ON_DESTROY, "onBind", "Landroid/os/IBinder;", "onHandleIntent", "ServiceHandler", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SafetyIntentService extends Service {
    private Handler mHandler;

    @NotNull
    private final String mName;
    private boolean mRedelivery;

    @Nullable
    private volatile ServiceHandler mServiceHandler;

    @Nullable
    private volatile Looper mServiceLooper;
    private long mStartTime;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sleep/trace/SafetyIntentService$ServiceHandler;", "Landroid/os/Handler;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/fitness/sleep/trace/SafetyIntentService;Landroid/os/Looper;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ServiceHandler extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ServiceHandler(Looper looper) {
            super(looper);
            Intrinsics.checkNotNull(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type android.content.Intent");
            Intent intent = (Intent) obj;
            SafetyIntentService.this.onHandleIntent(intent);
            LogExtKt.logi("service has been started " + (System.currentTimeMillis() - intent.getLongExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, 0L)) + " milliseconds");
            SafetyIntentService.this.delayStopSelf();
        }
    }

    public SafetyIntentService(@NotNull String mName) {
        Intrinsics.checkNotNullParameter(mName, "mName");
        this.mName = mName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void delayStopSelf() {
        if (Build.VERSION.SDK_INT >= 30) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SleepPeriodInfo sleepPeriodInfoRequireRecentSleepPeriod = UserSleepModel.INSTANCE.getInstance().requireRecentSleepPeriod(ApplicationExtKt.getSafeContext(this), jCurrentTimeMillis);
        long jMin = 10000;
        if (jCurrentTimeMillis >= sleepPeriodInfoRequireRecentSleepPeriod.getEarliestSleepTime() && jCurrentTimeMillis < sleepPeriodInfoRequireRecentSleepPeriod.getEarliestWakeupTime()) {
            long earliestWakeupTime = sleepPeriodInfoRequireRecentSleepPeriod.getEarliestWakeupTime() - jCurrentTimeMillis;
            jMin = Math.min(earliestWakeupTime >= 10000 ? earliestWakeupTime : 10000L, 7200000L);
        }
        LogExtKt.logi("delay " + jMin + " s stop service");
        Handler handler = this.mHandler;
        Handler handler2 = null;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        Handler handler3 = this.mHandler;
        if (handler3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
        } else {
            handler2 = handler3;
        }
        handler2.postDelayed(new Runnable() { // from class: i9l
            @Override // java.lang.Runnable
            public final void run() {
                SafetyIntentService.delayStopSelf$lambda$0(this.f20910a);
            }
        }, jMin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void delayStopSelf$lambda$0(SafetyIntentService this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        LogExtKt.logi("stopSelf");
        this$0.stopSelf();
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mStartTime = SystemClock.elapsedRealtime();
        LogExtKt.logi("SleepTraceService is create at " + System.currentTimeMillis());
        Object systemService = AppUtil.getApp().getSystemService("power");
        if (systemService instanceof PowerManager) {
            LogExtKt.logi("SleepTraceService is create at power " + ((PowerManager) systemService).isPowerSaveMode());
        }
        HandlerThread handlerThread = new HandlerThread("IntentService[" + this.mName + "]");
        handlerThread.start();
        this.mServiceLooper = handlerThread.getLooper();
        this.mServiceHandler = new ServiceHandler(this.mServiceLooper);
        this.mHandler = new Handler();
    }

    @Override // android.app.Service
    public void onDestroy() {
        Looper looper = this.mServiceLooper;
        Intrinsics.checkNotNull(looper);
        looper.quit();
        Handler handler = this.mHandler;
        if (handler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mHandler");
            handler = null;
        }
        handler.removeCallbacksAndMessages(null);
        LogExtKt.logi("SleepTraceService is destroy at " + System.currentTimeMillis());
    }

    public abstract void onHandleIntent(@Nullable Intent intent);

    @Override // android.app.Service
    public void onStart(@Nullable Intent intent, int startId) {
        ServiceHandler serviceHandler = this.mServiceHandler;
        Intrinsics.checkNotNull(serviceHandler);
        Message messageObtainMessage = serviceHandler.obtainMessage();
        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
        messageObtainMessage.arg1 = startId;
        messageObtainMessage.obj = intent;
        ServiceHandler serviceHandler2 = this.mServiceHandler;
        Intrinsics.checkNotNull(serviceHandler2);
        serviceHandler2.sendMessage(messageObtainMessage);
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        if (intent != null) {
            Handler handler = this.mHandler;
            if (handler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mHandler");
                handler = null;
            }
            handler.removeCallbacksAndMessages(null);
            onStart(intent, startId);
        } else {
            LogExtKt.logi("service restart");
            delayStopSelf();
        }
        LogExtKt.logi("SleepTraceService(" + (intent != null ? intent.getAction() : null) + ") is start at " + System.currentTimeMillis() + ", intent timestamp is " + (intent != null ? Long.valueOf(intent.getLongExtra(ActionManager.EXTRA_INTENT_TIMESTAMP, 0L)) : null));
        return 1;
    }

    public final void setIntentRedelivery(boolean enabled) {
        this.mRedelivery = enabled;
    }
}
