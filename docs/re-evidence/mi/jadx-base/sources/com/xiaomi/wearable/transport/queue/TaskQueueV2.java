package com.xiaomi.wearable.transport.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.wearable.ChannelInfo;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.WearApiTask;
import com.xiaomi.wearable.hm.BroadcastsKt;
import com.xiaomi.wearable.transport.Callback;
import com.xiaomi.wearable.transport.Channel;
import com.xiaomi.wearable.transport.TransportV2;
import com.xiaomi.wearable.transport.layerl2.L2Packet;
import com.xiaomi.wearable.transport.queue.TaskQueueV2;
import com.xiaomi.wearable.wear.api.CipherApiCall;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000 B2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001BB\u0013\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u001cH\u0002J\u0010\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#H\u0002J\u0012\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u001cH\u0002J\u0010\u0010(\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u001cH\u0002J\u0010\u0010\u000e\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0016H\u0002J\u0018\u0010)\u001a\u00020#2\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020%H&J\u0010\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\b\u0010.\u001a\u00020\u001eH\u0016J\u0010\u0010/\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0018\u00100\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u001eH\u0016J\u0010\u00102\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u00103\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020#H\u0016J\b\u00106\u001a\u00020\u0019H\u0016J\u0010\u00107\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0003H\u0016J\b\u00108\u001a\u00020\u0019H\u0016J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020#H\u0016J \u0010;\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020%H\u0002J\u001a\u0010;\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010<\u001a\u00020\u00192\u0006\u0010=\u001a\u00020 H\u0004J\b\u0010>\u001a\u00020\rH&J\u001a\u0010?\u001a\u00020\u00192\b\u0010@\u001a\u0004\u0018\u00010A2\u0006\u0010+\u001a\u00020%H\u0016R\u0012\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/xiaomi/wearable/transport/queue/TaskQueueV2;", "Lcom/xiaomi/wearable/transport/queue/ITaskQueue;", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "Lcom/xiaomi/wearable/transport/layerl2/L2Packet;", "wearApiCall", "Lcom/xiaomi/wearable/wear/api/CipherApiCall;", "<init>", "(Lcom/xiaomi/wearable/wear/api/CipherApiCall;)V", "mainHandler", "Landroid/os/Handler;", "transport", "Lcom/xiaomi/wearable/transport/TransportV2;", "channel", "Lcom/xiaomi/wearable/transport/Channel;", "getChannel", "()Lcom/xiaomi/wearable/transport/Channel;", "channel$delegate", "Lkotlin/Lazy;", "mApiTasksLock", "", "mWaitingResponseApiTasks", "Ljava/util/ArrayList;", "Lcom/xiaomi/wearable/core/WearApiTask;", "mSendingApiTasks", "enqueue", "", "apiTask", "getOpCode", "", "encrypt", "", "newCallback", "Lcom/xiaomi/wearable/transport/Callback;", "needEncrypt", "type", "", "getData", "", "channelEncryption", "opCode", "getPriority", "channelToType", "handleVersion", "data", "removeTask", "hasTask", "isIdle", "onSendSuccess", "onSendFailed", "timeout", "onResponseTimeout", "onReceiveResponse", BroadcastsKt.SILENT_PUSHING_CANCEL, "callId", "destroy", "onReceiveData", "open", Constants.EXTRA_CLOSE_TAI, "reason", "dispatchMessage", "sendStartRequest", "callback", "initTaskChannel", "writeToChannel", "channelInfo", "Lcom/xiaomi/wearable/ChannelInfo;", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTaskQueueV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueueV2.kt\ncom/xiaomi/wearable/transport/queue/TaskQueueV2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,424:1\n1#2:425\n*E\n"})
public abstract class TaskQueueV2 implements ITaskQueue, TaskDataReceiver<L2Packet> {
    private static final int MSG_TIMEOUT = 0;

    @NotNull
    public static final String TAG = "TaskQueueV2";

    /* JADX INFO: renamed from: channel$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy channel;

    @NotNull
    private final Object mApiTasksLock;

    @NotNull
    private final ArrayList<WearApiTask> mSendingApiTasks;

    @NotNull
    private final ArrayList<WearApiTask> mWaitingResponseApiTasks;

    @NotNull
    private Handler mainHandler;

    @NotNull
    private final TransportV2 transport;

    @NotNull
    private final CipherApiCall<?> wearApiCall;

    public TaskQueueV2(@NotNull CipherApiCall<?> wearApiCall) {
        Intrinsics.checkNotNullParameter(wearApiCall, "wearApiCall");
        this.wearApiCall = wearApiCall;
        TransportV2 transportV2 = new TransportV2();
        this.transport = transportV2;
        this.channel = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: q1p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaskQueueV2.channel_delegate$lambda$0(this.f30998a);
            }
        });
        this.mApiTasksLock = new Object();
        this.mWaitingResponseApiTasks = new ArrayList<>();
        this.mSendingApiTasks = new ArrayList<>();
        transportV2.init();
        transportV2.setTaskDataReceiver(this);
        this.mainHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.wearable.transport.queue.TaskQueueV2.1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 0) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wearable.core.WearApiTask");
                    WearApiTask wearApiTask = (WearApiTask) obj;
                    Object obj2 = TaskQueueV2.this.mApiTasksLock;
                    TaskQueueV2 taskQueueV2 = TaskQueueV2.this;
                    synchronized (obj2) {
                        try {
                            if (taskQueueV2.mWaitingResponseApiTasks.contains(wearApiTask)) {
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

    private final boolean channelEncryption(byte opCode) {
        return opCode == 2;
    }

    private final int channelToType(byte channel, boolean encrypt) {
        if (channel == 1) {
            return encrypt ? 101 : 100;
        }
        if (channel == 2) {
            return 104;
        }
        if (channel == 4) {
            return 107;
        }
        if (channel == 5) {
            return 102;
        }
        if (channel == 6) {
            return 105;
        }
        if (channel == 3) {
            return 103;
        }
        if (channel == 7) {
            return 108;
        }
        if (channel == 8) {
            return 112;
        }
        return channel == 9 ? 113 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Channel channel_delegate$lambda$0(TaskQueueV2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return this$0.initTaskChannel();
    }

    private final void dispatchMessage(byte channel, byte opCode, byte[] data) {
        boolean zChannelEncryption = channelEncryption(opCode);
        int iChannelToType = channelToType(channel, zChannelEncryption);
        if (zChannelEncryption) {
            byte[] bArrDecryptDataV2 = this.wearApiCall.decryptDataV2(data);
            if (bArrDecryptDataV2 != null) {
                this.wearApiCall.handleData(iChannelToType, bArrDecryptDataV2);
                return;
            }
            return;
        }
        if (iChannelToType == 100) {
            dispatchMessage(iChannelToType, data);
        } else {
            this.wearApiCall.handleData(iChannelToType, data);
        }
    }

    private final byte[] getData(WearApiTask apiTask) {
        return apiTask.getData();
    }

    private final byte getOpCode(boolean encrypt) {
        return encrypt ? (byte) 2 : (byte) 1;
    }

    private final int getPriority(byte channel) {
        if (channel == 1) {
            return 2;
        }
        if (channel == 3) {
            return 3;
        }
        return channel == 7 ? 1 : 0;
    }

    private final boolean needEncrypt(int type) {
        return type == 101 || type == 112;
    }

    private final Callback newCallback(final WearApiTask apiTask, final byte channel) {
        return new Callback() { // from class: com.xiaomi.wearable.transport.queue.TaskQueueV2.newCallback.1
            @Override // com.xiaomi.wearable.transport.Callback
            public void onCallback(int packetId, int code, String message) {
                CoreExtKt.getLogger().i("TaskQueueV2", "onCallback() called with: packetId = " + packetId + ", code = " + Callback.INSTANCE.toReadableString(code) + ", channel = " + L2Packet.Channel.INSTANCE.getReadableChannel(channel));
                if (code == -4) {
                    apiTask.onSendResult(-13);
                    return;
                }
                if (code == -3) {
                    apiTask.onSendResult(-12);
                    return;
                }
                if (code == -2) {
                    int timeout = apiTask.getTimeout();
                    if (timeout > 0) {
                        Message messageObtainMessage = this.mainHandler.obtainMessage(0, apiTask);
                        Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
                        this.mainHandler.sendMessageDelayed(messageObtainMessage, timeout);
                        return;
                    }
                    return;
                }
                if (code == -1) {
                    apiTask.onSendResult(-2);
                    return;
                }
                if (code == 0) {
                    if (channel != 1) {
                        apiTask.onSendResult(0);
                    }
                } else if (code == 1 && channel == 1) {
                    apiTask.onSendResult(0);
                }
            }
        };
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void cancel(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            this.mSendingApiTasks.remove(apiTask);
            this.mWaitingResponseApiTasks.remove(apiTask);
        }
        this.mainHandler.removeMessages(0, apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void close(int reason) {
        ArrayList arrayList;
        ArrayList arrayList2;
        CoreExtKt.getLogger().i("TaskQueueV2", "close() called");
        this.transport.reset();
        getChannel().close();
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mWaitingResponseApiTasks);
            this.mWaitingResponseApiTasks.clear();
            arrayList2 = new ArrayList(this.mSendingApiTasks);
            this.mSendingApiTasks.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((WearApiTask) it.next()).onResult(reason);
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((WearApiTask) it2.next()).onResult(reason);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void destroy() {
        synchronized (this.mApiTasksLock) {
            this.mSendingApiTasks.clear();
            this.mWaitingResponseApiTasks.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public synchronized void enqueue(@NotNull WearApiTask apiTask) {
        try {
            Intrinsics.checkNotNullParameter(apiTask, "apiTask");
            byte channel = getChannel(apiTask);
            int priority = getPriority(channel);
            boolean zNeedEncrypt = needEncrypt(apiTask.getType());
            byte opCode = getOpCode(zNeedEncrypt);
            byte[] data = getData(apiTask);
            if (zNeedEncrypt) {
                data = this.wearApiCall.encryptDataV2(data);
            }
            if (data == null) {
                CoreExtKt.getLogger().i("TaskQueueV2", "enqueue: data is null return ");
                return;
            }
            L2Packet l2Packet = new L2Packet(channel, opCode, priority, data);
            synchronized (this.mApiTasksLock) {
                this.mSendingApiTasks.add(apiTask);
            }
            this.transport.sendPacket(l2Packet, newCallback(apiTask, channel));
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final Channel getChannel() {
        return (Channel) this.channel.getValue();
    }

    public abstract void handleVersion(@NotNull byte[] data);

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void hasTask(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
    }

    @NotNull
    public abstract Channel initTaskChannel();

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public boolean isIdle() {
        boolean zIsEmpty;
        synchronized (this.mApiTasksLock) {
            CoreExtKt.getLogger().i("TaskQueueV2", "isIdle() called " + this.mSendingApiTasks.size());
            zIsEmpty = this.mSendingApiTasks.isEmpty();
        }
        return zIsEmpty;
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onReceiveResponse(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        CoreExtKt.getLogger().d("TaskQueueV2", "onReceiveResponse() called with: apiTask = " + apiTask);
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(apiTask);
        }
        this.mainHandler.removeMessages(0, apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onResponseTimeout(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        CoreExtKt.getLogger().d("TaskQueueV2", "onResponseTimeout() called with: apiTask = " + apiTask);
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseApiTasks.remove(apiTask);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onSendFailed(@NotNull WearApiTask apiTask, boolean timeout) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        if (timeout) {
            this.mainHandler.removeMessages(0, apiTask);
        }
        synchronized (this.mApiTasksLock) {
            this.mSendingApiTasks.remove(apiTask);
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void onSendSuccess(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
        synchronized (this.mApiTasksLock) {
            try {
                this.mSendingApiTasks.remove(apiTask);
                if (apiTask.needResponse()) {
                    this.mWaitingResponseApiTasks.add(apiTask);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (apiTask.needResponse()) {
            return;
        }
        this.mainHandler.removeMessages(0, apiTask);
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void open() {
        this.transport.setChannel(getChannel());
        getChannel().open();
    }

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void removeTask(@NotNull WearApiTask apiTask) {
        Intrinsics.checkNotNullParameter(apiTask, "apiTask");
    }

    public final void sendStartRequest(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CoreExtKt.getLogger().i("TaskQueueV2", "sendStartRequest() called with: callback = " + callback);
        this.transport.prepare(callback);
    }

    @Override // com.xiaomi.wearable.ChannelWriter
    public void writeToChannel(@Nullable ChannelInfo channelInfo, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getChannel().onDataReceived(data);
    }

    private final byte getChannel(WearApiTask apiTask) {
        switch (apiTask.getType()) {
            case 100:
            case 101:
                return (byte) 1;
            case 102:
                return (byte) 5;
            case 103:
                return (byte) 3;
            case 104:
                return (byte) 2;
            case 105:
                return (byte) 6;
            case 106:
            case 109:
            case 110:
            case 111:
            default:
                return (byte) 0;
            case 107:
                return (byte) 4;
            case 108:
                return (byte) 7;
            case 112:
                return (byte) 8;
            case 113:
                return (byte) 9;
        }
    }

    @Override // com.xiaomi.wearable.transport.queue.TaskDataReceiver
    public void onReceiveData(@NotNull L2Packet data) {
        Intrinsics.checkNotNullParameter(data, "data");
        dispatchMessage(data.getChannel(), data.getOpCode(), data.getPayload());
    }

    private final void dispatchMessage(int type, byte[] data) {
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

    @Override // com.xiaomi.wearable.transport.queue.ITaskQueue
    public void cancel(int callId) {
        WearApiTask wearApiTask;
        synchronized (this.mApiTasksLock) {
            try {
                Iterator<WearApiTask> it = this.mSendingApiTasks.iterator();
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
        CoreExtKt.getLogger().i("TaskQueueV2", "cancel() called with: callId = " + callId + ", task = " + wearApiTask);
        if (wearApiTask != null) {
            wearApiTask.cancel();
        }
    }
}
