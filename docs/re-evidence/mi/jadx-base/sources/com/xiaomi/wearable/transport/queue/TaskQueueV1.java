package com.xiaomi.wearable.transport.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.wear.api.WearApiCall;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0013*\u0001\u0016\b&\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0016J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010#\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0017J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0017J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0014H\u0017J\u0010\u0010'\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010(\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\b\u0010*\u001a\u00020\u0019H\u0016J\n\u0010+\u001a\u0004\u0018\u00010\fH\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\fH\u0016J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010-\u001a\u00020 H\u0016J\u0010\u0010.\u001a\u00020\u00192\u0006\u0010/\u001a\u00020 H\u0016J\b\u00100\u001a\u00020\u0019H\u0016J\b\u00101\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u00020\u0019H\u0004J\b\u00103\u001a\u00020\u0014H\u0002R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0017¨\u00065"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/TaskQueueV1;", "Lcom/xiaomi/wearable/transport/queue/ITaskQueue;", "Lcom/xiaomi/wearable/transport/queue/TaskRunnable;", "wearApiCall", "Lcom/xiaomi/wearable/wear/api/WearApiCall;", "<init>", "(Lcom/xiaomi/wearable/wear/api/WearApiCall;)V", "mApiTasksLock", "", "mRunningLock", "mPendingApiTasks", "Ljava/util/ArrayList;", "Lcom/xiaomi/wearable/core/WearApiTask;", "mWaitingResponseApiTasks", "mRunningApiTask", "getMRunningApiTask", "()Lcom/xiaomi/wearable/core/WearApiTask;", "setMRunningApiTask", "(Lcom/xiaomi/wearable/core/WearApiTask;)V", "mIsParallel", "", "mMainHandler", "com/xiaomi/wearable/transport/queue/TaskQueueV1$mMainHandler$1", "Lcom/xiaomi/wearable/transport/queue/TaskQueueV1$mMainHandler$1;", "enqueue", "", "apiTask", "removeTask", "hasTask", "isIdle", "dispatchMessage", "type", "", "data", "", "run", "onSendSuccess", "onSendFailed", "timeout", "onResponseTimeout", "onReceiveResponse", "checkRunNext", "runNext", "nextApiTask", BroadcastsKt.SILENT_PUSHING_CANCEL, "callId", Constants.EXTRA_CLOSE_TAI, "reason", "destroy", "open", "enableParallel", "isParallel", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaskQueueV1.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueueV1.kt\ncom/xiaomi/wearable/transport/queue/TaskQueueV1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n1#2:243\n*E\n"})
public abstract class TaskQueueV1 implements ITaskQueue, TaskRunnable {
    private static final int MSG_TIMEOUT = 0;

    @NotNull
    private static final String TAG = "TaskQueueV1";

    @NotNull
    private final Object mApiTasksLock;
    private volatile boolean mIsParallel;

    @NotNull
    private TaskQueueV1$mMainHandler$1 mMainHandler;

    @GuardedBy("mApiTasksLock")
    @NotNull
    private final ArrayList<WearApiTask> mPendingApiTasks;

    @GuardedBy("mRunningLock")
    @Nullable
    private volatile WearApiTask mRunningApiTask;

    @NotNull
    private final Object mRunningLock;

    @NotNull
    private final ArrayList<WearApiTask> mWaitingResponseApiTasks;

    @NotNull
    private final WearApiCall<?> wearApiCall;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.xiaomi.wearable.transport.queue.TaskQueueV1$mMainHandler$1] */
    public TaskQueueV1(@NotNull WearApiCall<?> wearApiCall) {
        Intrinsics.checkNotNullParameter(wearApiCall, "wearApiCall");
        this.wearApiCall = wearApiCall;
        this.mApiTasksLock = new Object();
        this.mRunningLock = new Object();
        this.mPendingApiTasks = new ArrayList<>();
        this.mWaitingResponseApiTasks = new ArrayList<>();
        final Looper mainLooper = Looper.getMainLooper();
        this.mMainHandler = new Handler(mainLooper) { // from class: com.xiaomi.wearable.transport.queue.TaskQueueV1$mMainHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 0) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wearable.core.WearApiTask");
                    WearApiTask wearApiTask = (WearApiTask) obj;
                    Object obj2 = this.this$0.mApiTasksLock;
                    TaskQueueV1 taskQueueV1 = this.this$0;
                    synchronized (obj2) {
                        try {
                            if (taskQueueV1.mPendingApiTasks.contains(wearApiTask)) {
                                wearApiTask.onSendResult(-1);
                            } else if (taskQueueV1.mWaitingResponseApiTasks.contains(wearApiTask)) {
                                wearApiTask.onResponseTimeout();
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: renamed from: isParallel, reason: from getter */
    private final boolean getMIsParallel() {
        return this.mIsParallel;
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void cancel(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            try {
                if (!this.mPendingApiTasks.remove(apiTask)) {
                    this.mWaitingResponseApiTasks.remove(apiTask);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        removeMessages(0, apiTask);
        checkRunNext(apiTask);
    }

    public void checkRunNext(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mRunningLock) {
            try {
                if (this.mRunningApiTask == apiTask) {
                    runNext();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void close(int reason) {
        ArrayList arrayList;
        ArrayList arrayList2;
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mPendingApiTasks);
            this.mPendingApiTasks.clear();
            arrayList2 = new ArrayList(this.mWaitingResponseApiTasks);
            this.mWaitingResponseApiTasks.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WearApiTask) it.next()).onDisconnect();
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((WearApiTask) it2.next()).onDisconnect();
        }
        synchronized (this.mRunningLock) {
            this.mRunningApiTask = null;
            Unit unit2 = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void destroy() {
        removeMessages(0);
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.clear();
            this.mWaitingResponseApiTasks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void dispatchMessage(int type, @Nullable byte[] data) {
        ArrayList arrayList;
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mWaitingResponseApiTasks);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            WearApiTask wearApiTask = (WearApiTask) it.next();
            if (type == wearApiTask.getType()) {
                wearApiTask.onReceiveResponse(data);
            } else {
                it.remove();
            }
        }
    }

    public final void enableParallel() {
        this.mIsParallel = true;
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void enqueue(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.add(apiTask);
        }
        synchronized (this.mRunningLock) {
            try {
                if (this.mRunningApiTask == null) {
                    CoreExtKt.getLogger().i(TAG, "enqueue run  " + apiTask);
                    run(apiTask);
                } else {
                    CoreExtKt.getLogger().i(TAG, "enqueue " + apiTask);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final WearApiTask getMRunningApiTask() {
        return this.mRunningApiTask;
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void hasTask(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public boolean isIdle() {
        boolean z;
        synchronized (this.mApiTasksLock) {
            z = this.mPendingApiTasks.isEmpty() && this.mRunningApiTask == null;
        }
        return z;
    }

    @Nullable
    public WearApiTask nextApiTask() {
        synchronized (this.mApiTasksLock) {
            if (!this.mPendingApiTasks.isEmpty()) {
                return this.mPendingApiTasks.get(0);
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onReceiveResponse(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(apiTask);
        }
        removeMessages(0, apiTask);
        if (getMIsParallel()) {
            return;
        }
        checkRunNext(apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onResponseTimeout(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        CoreExtKt.getLogger().d(TAG, "onResponseTimeout() called with: apiTask = " + apiTask);
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(apiTask);
        }
        if (getMIsParallel()) {
            return;
        }
        checkRunNext(apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onSendFailed(@NotNull WearApiTask apiTask, boolean timeout) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            this.mPendingApiTasks.remove(apiTask);
        }
        if (!timeout) {
            removeMessages(0, apiTask);
        }
        checkRunNext(apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onSendSuccess(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            try {
                this.mPendingApiTasks.remove(apiTask);
                if (apiTask.needResponse()) {
                    this.mWaitingResponseApiTasks.add(apiTask);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!apiTask.needResponse()) {
            removeMessages(0, apiTask);
        }
        if (getMIsParallel() || !apiTask.needResponse()) {
            checkRunNext(apiTask);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void open() {
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void removeTask(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
    }

    public void run(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        int timeout = apiTask.getTimeout();
        if (timeout > 0) {
            Message messageObtainMessage = obtainMessage(0, apiTask);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
            sendMessageDelayed(messageObtainMessage, timeout);
        }
        this.mRunningApiTask = apiTask;
    }

    public void runNext() {
        WearApiTask wearApiTaskNextApiTask = nextApiTask();
        if (wearApiTaskNextApiTask != null) {
            run(wearApiTaskNextApiTask);
        } else {
            this.mRunningApiTask = null;
        }
    }

    public final void setMRunningApiTask(@Nullable WearApiTask wearApiTask) {
        this.mRunningApiTask = wearApiTask;
    }

    @Override // com.xiaomi.wearable.ChannelWriter
    public void writeToChannel(@Nullable ChannelInfo channelInfo, @NotNull byte[] bArr) {
        ITaskQueue.DefaultImpls.writeToChannel(this, channelInfo, bArr);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void cancel(int callId) {
        WearApiTask wearApiTask;
        synchronized (this.mApiTasksLock) {
            try {
                Iterator<WearApiTask> it = this.mPendingApiTasks.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        wearApiTask = null;
                        break;
                    }
                    WearApiTask next = it.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                    wearApiTask = next;
                    if (wearApiTask.getId() == callId) {
                        break;
                    }
                } while (wearApiTask.getMassDataId() != callId);
                if (wearApiTask == null) {
                    Iterator<WearApiTask> it2 = this.mWaitingResponseApiTasks.iterator();
                    Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
                    while (it2.hasNext()) {
                        WearApiTask next2 = it2.next();
                        Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
                        WearApiTask wearApiTask2 = next2;
                        if (wearApiTask2.getId() == callId || wearApiTask2.getMassDataId() == callId) {
                            wearApiTask = wearApiTask2;
                            break;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (wearApiTask != null) {
            wearApiTask.cancel();
        }
    }
}
