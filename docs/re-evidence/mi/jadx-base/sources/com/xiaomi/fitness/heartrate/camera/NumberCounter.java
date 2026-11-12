package com.xiaomi.fitness.heartrate.camera;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeSetFragment;
import com.xiaomi.fitness.heartrate.camera.NumberCounter;
import com.xiaomi.fitness.statistics.StatConstants;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0014H\u0002J\u0006\u0010\u001a\u001a\u00020\u0014J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0011R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/NumberCounter;", "", VibrateModeSetFragment.MAX, "", "<init>", "(I)V", "mMaxValue", "mSubHandler", "Landroid/os/Handler;", "mMainHandler", "mHandlerThread", "Landroid/os/HandlerThread;", "mValue", "mIsPause", "", "mChangedListenerRef", "Ljava/lang/ref/WeakReference;", "Lcom/xiaomi/fitness/heartrate/camera/OnCounterChangedListener;", "mStarted", "initThread", "", "setMaxValue", Constants.KEY_RECHARGE_MAXVALUE, "reset", StatConstants.PARAM_START, "doIncrease", "pause", "postValue", "forceStop", "setOnValueChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NumberCounter {
    public static final int INTERVAL = 20;
    private static final boolean IS_DEBUG = false;
    private static final int MSG_INCREASE = 16;

    @NotNull
    private static final String TAG = "NumberCounter";

    @Nullable
    private WeakReference<OnCounterChangedListener> mChangedListenerRef;

    @NotNull
    private final HandlerThread mHandlerThread;
    private volatile boolean mIsPause;

    @NotNull
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private int mMaxValue;
    private boolean mStarted;

    @Nullable
    private Handler mSubHandler;
    private volatile int mValue;

    public NumberCounter(int i) {
        HandlerThread handlerThread = new HandlerThread("number-counter-thread");
        this.mHandlerThread = handlerThread;
        handlerThread.setPriority(10);
        this.mMaxValue = i;
        initThread();
    }

    private final void doIncrease() {
        if (this.mIsPause) {
            Handler handler = this.mSubHandler;
            Intrinsics.checkNotNull(handler);
            handler.removeMessages(16);
            return;
        }
        this.mValue += 20;
        postValue();
        if (IS_DEBUG) {
            Logger.d(TAG, "doIncrease: " + (this.mValue / 1000));
        }
    }

    private final void initThread() {
        this.mHandlerThread.start();
        this.mSubHandler = new Handler(this.mHandlerThread.getLooper(), new Handler.Callback() { // from class: l2h
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return NumberCounter.initThread$lambda$0(this.f24568a, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initThread$lambda$0(NumberCounter this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what != 16) {
            return true;
        }
        this$0.doIncrease();
        return true;
    }

    private final void postValue() {
        if (this.mMaxValue > this.mValue) {
            Handler handler = this.mSubHandler;
            Intrinsics.checkNotNull(handler);
            handler.sendEmptyMessageDelayed(16, 20L);
            this.mMainHandler.post(new Runnable() { // from class: j2h
                @Override // java.lang.Runnable
                public final void run() {
                    NumberCounter.postValue$lambda$1(this.f22355a);
                }
            });
            return;
        }
        Handler handler2 = this.mSubHandler;
        Intrinsics.checkNotNull(handler2);
        handler2.removeCallbacksAndMessages(null);
        this.mMainHandler.post(new Runnable() { // from class: k2h
            @Override // java.lang.Runnable
            public final void run() {
                NumberCounter.postValue$lambda$2(this.f23363a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postValue$lambda$1(NumberCounter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakReference<OnCounterChangedListener> weakReference = this$0.mChangedListenerRef;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            if (weakReference.get() != null) {
                WeakReference<OnCounterChangedListener> weakReference2 = this$0.mChangedListenerRef;
                Intrinsics.checkNotNull(weakReference2);
                OnCounterChangedListener onCounterChangedListener = weakReference2.get();
                Intrinsics.checkNotNull(onCounterChangedListener);
                onCounterChangedListener.onCounterValueChanged(this$0.mMaxValue, this$0.mValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postValue$lambda$2(NumberCounter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        WeakReference<OnCounterChangedListener> weakReference = this$0.mChangedListenerRef;
        if (weakReference != null) {
            Intrinsics.checkNotNull(weakReference);
            if (weakReference.get() != null) {
                WeakReference<OnCounterChangedListener> weakReference2 = this$0.mChangedListenerRef;
                Intrinsics.checkNotNull(weakReference2);
                OnCounterChangedListener onCounterChangedListener = weakReference2.get();
                Intrinsics.checkNotNull(onCounterChangedListener);
                onCounterChangedListener.onCounterFinished();
            }
        }
    }

    public final void forceStop() {
        Handler handler = this.mSubHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(handler);
            handler.removeCallbacksAndMessages(null);
            this.mHandlerThread.quit();
        }
        WeakReference<OnCounterChangedListener> weakReference = this.mChangedListenerRef;
        Intrinsics.checkNotNull(weakReference);
        weakReference.clear();
    }

    public final void pause() {
        this.mIsPause = true;
        this.mStarted = false;
        Handler handler = this.mSubHandler;
        Intrinsics.checkNotNull(handler);
        handler.removeCallbacksAndMessages(null);
    }

    public final void reset() {
        this.mValue = 0;
        pause();
    }

    public final void setMaxValue(int maxValue) {
        this.mMaxValue = maxValue;
    }

    public final void setOnValueChangedListener(@NotNull OnCounterChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mChangedListenerRef = new WeakReference<>(listener);
    }

    public final void start() {
        if (this.mStarted) {
            return;
        }
        this.mStarted = true;
        this.mIsPause = false;
        postValue();
    }
}
