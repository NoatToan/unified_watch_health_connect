package com.xiaomi.wearable.transport;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.fit.data.common.util.FitnessFilePathUtils;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.client.Logger;
import com.xiaomi.wearable.spp.SppState;
import com.xiaomi.wearable.spp.b;
import com.xiaomi.wearable.transport.TransportV1;
import com.xiaomi.wearable.transport.queue.TaskDataReceiver;
import defpackage.ht3;
import defpackage.k7o;
import defpackage.qfp;
import defpackage.snr;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 P2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PB\u0007¢\u0006\u0004\bO\u0010\u0013J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0003¢\u0006\u0004\b\b\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010$\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u000fH\u0002¢\u0006\u0004\b%\u0010\u0013J\u000f\u0010&\u001a\u00020\u000fH\u0016¢\u0006\u0004\b&\u0010\u0013J!\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000fH\u0016¢\u0006\u0004\b*\u0010\u0013J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00103\u001a\u00020\u000f2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010M\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006Q"}, d2 = {"Lcom/xiaomi/wearable/transport/TransportV1;", "Lcom/xiaomi/wearable/transport/ITransport;", "Lcom/xiaomi/wearable/spp/b;", "Lcom/xiaomi/wearable/transport/ChannelReceiver;", "sppPacket", "Lcom/xiaomi/wearable/transport/Callback;", "callback", "", "sendDataInternal", "(Lcom/xiaomi/wearable/spp/b;Lcom/xiaomi/wearable/transport/Callback;)Z", "", "code", "", "message", "sendCallBack", "", "callBackSendResult", "(ILjava/lang/String;Lcom/xiaomi/wearable/transport/Callback;)V", "resetChannelStatus", "()V", "setPendingSendSppPacket", "(Lcom/xiaomi/wearable/spp/b;)V", "packet", "notifyDataReceived", "stopTimer", "isTimerOn", "()Z", "isSendTimerOn", "startWaitingResponseTimer", "Lcom/xiaomi/wearable/spp/SppState;", "getCurrentState", "()Lcom/xiaomi/wearable/spp/SppState;", "state", "setCurrentState", "(Lcom/xiaomi/wearable/spp/SppState;)V", "onReceivePacket", "sendResponseData", "startSendTimer", "init", FitnessFilePathUtils.TimeZoneConstant.POSITIVE, "sendPacket", "(Lcom/xiaomi/wearable/spp/b;Lcom/xiaomi/wearable/transport/Callback;)V", "reset", "", "data", "onDataReceive", "([B)V", "prepare", "(Lcom/xiaomi/wearable/transport/Callback;)V", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "receiver", "setTaskDataReceiver", "(Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;)V", "Lcom/xiaomi/wearable/transport/Channel;", "channel", "setChannel", "(Lcom/xiaomi/wearable/transport/Channel;)V", "Lcom/xiaomi/wearable/transport/Channel;", "Lk7o;", "mSppPacketProducer", "Lk7o;", "packetReceiver", "Lcom/xiaomi/wearable/transport/queue/TaskDataReceiver;", "mCurrentState", "Lcom/xiaomi/wearable/spp/SppState;", "Lqfp;", "mTimer", "Lqfp;", "mSendCallback", "Lcom/xiaomi/wearable/transport/Callback;", "mPendingSendSppPacket", "Lcom/xiaomi/wearable/spp/b;", "Landroid/os/Handler;", "mMainHandler", "Landroid/os/Handler;", "mWorkerHandler", "Lqfp$a;", "mTimeoutHandler", "Lqfp$a;", "<init>", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
public final class TransportV1 implements ITransport<b>, ChannelReceiver {

    @NotNull
    private static final String TAG = "TaskQueueV1";
    private static final long TIMEOUT_SEND = 10000;
    private static final long TIMEOUT_WAITING_RESPONSE = 10000;

    @NotNull
    private static final String TIMER_SEND = "send";
    private Channel channel;

    @NotNull
    private volatile SppState mCurrentState = SppState.IDLE;

    @NotNull
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    @Nullable
    private volatile b mPendingSendSppPacket;

    @Nullable
    private Callback mSendCallback;

    @NotNull
    private final k7o mSppPacketProducer;

    @NotNull
    private final qfp.a mTimeoutHandler;

    @NotNull
    private final qfp mTimer;

    @NotNull
    private final Handler mWorkerHandler;
    private TaskDataReceiver<b> packetReceiver;

    public TransportV1() {
        Looper looperA = snr.a();
        this.mTimer = new qfp(looperA);
        Handler handler = new Handler(looperA, new Handler.Callback() { // from class: o1q
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return TransportV1._init_$lambda$0(this.f28653a, message);
            }
        });
        this.mWorkerHandler = handler;
        this.mSppPacketProducer = new k7o(handler);
        final String simpleName = TransportV1.class.getSimpleName();
        this.mTimeoutHandler = new qfp.a(simpleName) { // from class: com.xiaomi.wearable.transport.TransportV1$mTimeoutHandler$1
            @Override // qfp.a
            public void onTimerCallback() {
                Callback callback = this.this$0.mSendCallback;
                if (callback != null) {
                    callback.onCallback(0, -4, "waiting response time out");
                }
            }

            @Override // qfp.a
            public void resetCallback() {
                this.this$0.mTimer.c();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _init_$lambda$0(TransportV1 this$0, Message msg) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (msg.what == 1) {
            Object obj = msg.obj;
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.wearable.spp.SppPacket");
            this$0.onReceivePacket((b) obj);
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    private final void callBackSendResult(final int code, final String message, final Callback sendCallBack) {
        if (isSendTimerOn()) {
            stopTimer();
        }
        if (code == 0 && getMCurrentState() == SppState.READY) {
            if (this.mPendingSendSppPacket != null) {
                b bVar = this.mPendingSendSppPacket;
                Intrinsics.checkNotNull(bVar);
                if (bVar.r()) {
                    setCurrentState(SppState.WAITING);
                    startWaitingResponseTimer();
                } else {
                    setCurrentState(SppState.IDLE);
                }
            } else {
                setCurrentState(SppState.IDLE);
            }
        } else if (code != -2) {
            resetChannelStatus();
        }
        if (sendCallBack != null) {
            CoreExtKt.getLogger().d(TAG, "callback code:" + code + " message:" + message);
            this.mMainHandler.post(new Runnable() { // from class: n1q
                @Override // java.lang.Runnable
                public final void run() {
                    TransportV1.callBackSendResult$lambda$4(sendCallBack, code, message);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void callBackSendResult$lambda$4(Callback callback, int i, String message) {
        Intrinsics.checkNotNullParameter(message, "$message");
        callback.onCallback(0, i, message);
    }

    /* JADX INFO: renamed from: getCurrentState, reason: from getter */
    private final SppState getMCurrentState() {
        return this.mCurrentState;
    }

    private final boolean isSendTimerOn() {
        return Intrinsics.areEqual(TIMER_SEND, this.mTimer.a());
    }

    private final boolean isTimerOn() {
        return this.mTimer.b();
    }

    private final void notifyDataReceived(final b packet) {
        this.mMainHandler.post(new Runnable() { // from class: p1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportV1.notifyDataReceived$lambda$5(this.f29919a, packet);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void notifyDataReceived$lambda$5(TransportV1 this$0, b packet) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(packet, "$packet");
        TaskDataReceiver<b> taskDataReceiver = this$0.packetReceiver;
        if (taskDataReceiver == null) {
            Intrinsics.throwUninitializedPropertyAccessException("packetReceiver");
            taskDataReceiver = null;
        }
        taskDataReceiver.onReceiveData(packet);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005a  */
    /* JADX WARN: Instruction removed from duplicated block: B:13:0x005a, please report this as an issue */
    private final void onReceivePacket(b sppPacket) {
        CoreExtKt.getLogger().i(TAG, "onReceivePacket:" + sppPacket + ", currentState = " + this.mCurrentState);
        if (this.mCurrentState == SppState.WAITING) {
            b bVar = this.mPendingSendSppPacket;
            if (bVar != null && bVar.m() == sppPacket.m()) {
                CoreExtKt.getLogger().i(TAG, "notifyDataReceived on waiting status");
                resetChannelStatus();
                notifyDataReceived(sppPacket);
            }
            if (this.mPendingSendSppPacket != null) {
                b bVar2 = this.mPendingSendSppPacket;
                Intrinsics.checkNotNull(bVar2);
                if (bVar2.m() != sppPacket.m()) {
                    CoreExtKt.getLogger().w(TAG, "currentState waiting response,mPendingSendSppPacket " + this.mPendingSendSppPacket + ", opcodesn = " + ((int) sppPacket.m()));
                }
            } else {
                CoreExtKt.getLogger().w(TAG, "currentState waiting response,mPendingSendSppPacket " + this.mPendingSendSppPacket + ", opcodesn = " + ((int) sppPacket.m()));
            }
        } else {
            CoreExtKt.getLogger().i(TAG, "notifyDataReceived on status:" + this.mCurrentState);
            notifyDataReceived(sppPacket);
        }
        if (sppPacket.r()) {
            sendResponseData(sppPacket);
        }
    }

    private final void resetChannelStatus() {
        stopTimer();
        setCurrentState(SppState.IDLE);
        this.mPendingSendSppPacket = null;
    }

    private final boolean sendDataInternal(b sppPacket, final Callback callback) {
        if (this.mCurrentState != SppState.IDLE) {
            CoreExtKt.getLogger().w(TAG, "send failed for current state is not IDLE: " + this.mCurrentState);
            this.mMainHandler.post(new Runnable() { // from class: l1q
                @Override // java.lang.Runnable
                public final void run() {
                    TransportV1.sendDataInternal$lambda$1(callback, this);
                }
            });
            return false;
        }
        CoreExtKt.getLogger().i(TAG, "socket sendData: " + sppPacket);
        if (sppPacket.r()) {
            setPendingSendSppPacket(sppPacket);
        }
        this.mSendCallback = callback;
        setCurrentState(SppState.READY);
        if (!isTimerOn()) {
            startSendTimer();
        }
        Channel channel = this.channel;
        if (channel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channel = null;
        }
        channel.send(sppPacket.x(), new ht3() { // from class: m1q
            @Override // defpackage.ht3
            public final void onCallback(int i) {
                TransportV1.sendDataInternal$lambda$2(this.f25655a, callback, i);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendDataInternal$lambda$1(Callback callback, TransportV1 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (callback != null) {
            callback.onCallback(0, -3, "busy,currentState:" + this$0.mCurrentState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendDataInternal$lambda$2(TransportV1 this$0, Callback callback, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.callBackSendResult(i, "", callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void sendPacket$lambda$3(TransportV1 this$0, b p, Callback callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(p, "$p");
        boolean zSendDataInternal = this$0.sendDataInternal(p, callback);
        CoreExtKt.getLogger().i(TAG, "sendData: result " + zSendDataInternal);
    }

    private final void sendResponseData(b sppPacket) {
        int i;
        if (sppPacket.l() == 4) {
            i = 5;
        } else if (sppPacket.l() == 2) {
            i = 3;
        } else {
            if (sppPacket.l() != 0) {
                throw new IllegalArgumentException("opcode is invalid");
            }
            i = 1;
        }
        b bVarA = new b.a().b(sppPacket.j()).e(false).d(0).g(sppPacket.m()).c((byte) 0).f(i).h(null).a();
        CoreExtKt.getLogger().d(TAG, " sendResponseData thread:" + Thread.currentThread().getName());
        Channel channel = this.channel;
        if (channel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("channel");
            channel = null;
        }
        channel.send(bVarA.x(), null);
    }

    private final void setCurrentState(SppState state) {
        Logger logger = CoreExtKt.getLogger();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("state=%s", Arrays.copyOf(new Object[]{state}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        logger.d(TAG, str);
        this.mCurrentState = state;
    }

    private final void setPendingSendSppPacket(b sppPacket) {
        this.mPendingSendSppPacket = sppPacket;
    }

    private final void startSendTimer() {
        this.mTimer.d(new qfp.a() { // from class: com.xiaomi.wearable.transport.TransportV1.startSendTimer.1
            {
                super(TransportV1.TIMER_SEND);
            }

            @Override // qfp.a
            public void onTimerCallback() throws TimeoutException {
                Callback callback = TransportV1.this.mSendCallback;
                if (callback != null) {
                    callback.onCallback(0, -2, "send time out");
                }
                Channel channel = TransportV1.this.channel;
                if (channel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("channel");
                    channel = null;
                }
                channel.close();
            }

            @Override // qfp.a
            public void resetCallback() {
                TransportV1.this.mTimer.c();
            }
        }, 10000L);
    }

    private final void startWaitingResponseTimer() {
        this.mTimer.d(this.mTimeoutHandler, 10000L);
    }

    private final void stopTimer() {
        this.mTimer.e();
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void init() {
        CoreExtKt.getLogger().i(TAG, "init() called");
    }

    @Override // com.xiaomi.wearable.transport.ChannelReceiver
    public void onDataReceive(@NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.mSppPacketProducer.e(data);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void prepare(@Nullable Callback callback) {
        CoreExtKt.getLogger().i(TAG, "prepare() called with: callback = " + callback);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void reset() {
        if (this.mCurrentState != SppState.IDLE) {
            resetChannelStatus();
        }
        this.mSppPacketProducer.f();
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void setChannel(@NotNull Channel channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.channel = channel;
        channel.setChannelDataReceiver(this);
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void setTaskDataReceiver(@NotNull TaskDataReceiver<b> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        CoreExtKt.getLogger().i(TAG, "setTaskDataReceiver() called with: receiver = " + receiver);
        this.packetReceiver = receiver;
    }

    @Override // com.xiaomi.wearable.transport.ITransport
    public void sendPacket(@NotNull final b p, @Nullable final Callback callback) {
        Intrinsics.checkNotNullParameter(p, "p");
        this.mWorkerHandler.post(new Runnable() { // from class: k1q
            @Override // java.lang.Runnable
            public final void run() {
                TransportV1.sendPacket$lambda$3(this.f23342a, p, callback);
            }
        });
    }
}
