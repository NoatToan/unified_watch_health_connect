package com.xiaomi.fitness.feedback.util;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/WeakHandler;", "Landroid/os/Handler;", "callback", "Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;", "<init>", "(Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;)V", "mCallbackRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "HandlerMsgCallback", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WeakHandler extends Handler {

    @Nullable
    private final WeakReference<HandlerMsgCallback> mCallbackRef;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/feedback/util/WeakHandler$HandlerMsgCallback;", "", "handleMessage", "", "msg", "Landroid/os/Message;", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface HandlerMsgCallback {
        void handleMessage(@Nullable Message msg);
    }

    public WeakHandler(@Nullable HandlerMsgCallback handlerMsgCallback) {
        this.mCallbackRef = new WeakReference<>(handlerMsgCallback);
    }

    @Override // android.os.Handler
    public void handleMessage(@NotNull Message msg) {
        HandlerMsgCallback handlerMsgCallback;
        Intrinsics.checkNotNullParameter(msg, "msg");
        WeakReference<HandlerMsgCallback> weakReference = this.mCallbackRef;
        if (weakReference == null || (handlerMsgCallback = weakReference.get()) == null) {
            return;
        }
        handlerMsgCallback.handleMessage(msg);
    }
}
