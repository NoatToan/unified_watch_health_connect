package com.xiaomi.fitness.device.contact.remote;

import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteCallbackList;
import com.mi.fitness.checkupdate.annotation.BreakSilentUpgradeAspect;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ByteUtil;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.mass.dispatcher.MassDataDispatcher;
import com.xiaomi.wearable.core.ICallback;
import com.xiaomi.wearable.core.WearApiResult;
import com.xiaomi.wearable.core.client.IDataHandler;
import com.xiaomi.wearable.core.client.IMiWearCoreClient;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.b4s;
import defpackage.dsf;
import defpackage.fai;
import defpackage.k53;
import defpackage.kg4;
import defpackage.nl5;
import defpackage.nrd;
import defpackage.om5;
import defpackage.s69;
import defpackage.s7r;
import defpackage.xj4;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u0001/\u0018\u0000 42\u00020\u0001:\u00014B\u001d\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b2\u00103J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u001b\u0010\u0019J\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010\u0019J\u0015\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0004¢\u0006\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue;", "Lcom/xiaomi/wearable/core/client/IDataHandler;", "", "did", "", "type", "", "data", "", "dispatchMessage", "(Ljava/lang/String;I[B)V", "subType", "Ls7r;", "packet", "handlePacketInternal", "(Ljava/lang/String;IILs7r;)V", "handleDataInternal", "Lcom/xiaomi/fitness/device/contact/remote/ContactCallTask;", "callTask", "enqueue", "(Lcom/xiaomi/fitness/device/contact/remote/ContactCallTask;)I", "", "handleData", "(Ljava/lang/String;I[B)Z", "onReceiveResponse$device_contact_release", "(Lcom/xiaomi/fitness/device/contact/remote/ContactCallTask;)V", "onReceiveResponse", "onResponseTimeout$device_contact_release", "onResponseTimeout", "Lcom/xiaomi/wearable/core/ICallback;", "callback", "(Lcom/xiaomi/fitness/device/contact/remote/ContactCallTask;)Lcom/xiaomi/wearable/core/ICallback;", BroadcastsKt.SILENT_PUSHING_CANCEL, "callId", "(I)V", "mDid", "Ljava/lang/String;", "Landroid/os/RemoteCallbackList;", "Lnl5;", "mDataHandlerRemotes", "Landroid/os/RemoteCallbackList;", "", "mApiTasksLock", "Ljava/lang/Object;", "Ljava/util/ArrayList;", "mWaitingResponseCallTasks", "Ljava/util/ArrayList;", "com/xiaomi/fitness/device/contact/remote/ContactTaskQueue$mMainHandler$1", "mMainHandler", "Lcom/xiaomi/fitness/device/contact/remote/ContactTaskQueue$mMainHandler$1;", "<init>", "(Ljava/lang/String;Landroid/os/RemoteCallbackList;)V", "Companion", "device-contact_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nContactTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactTaskQueue.kt\ncom/xiaomi/fitness/device/contact/remote/ContactTaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n*L\n1#1,238:1\n1#2:239\n90#3,19:240\n90#3,19:259\n*S KotlinDebug\n*F\n+ 1 ContactTaskQueue.kt\ncom/xiaomi/fitness/device/contact/remote/ContactTaskQueue\n*L\n152#1:240,19\n166#1:259,19\n*E\n"})
public final class ContactTaskQueue implements IDataHandler {
    private static final int MSG_TIMEOUT = 0;

    @NotNull
    private static final String TAG = "CallTaskDispatcher";
    private static /* synthetic */ Annotation ajc$anno$0;
    private static /* synthetic */ nrd.a ajc$tjp_0;

    @NotNull
    private final Object mApiTasksLock;

    @NotNull
    private final RemoteCallbackList<nl5> mDataHandlerRemotes;

    @NotNull
    private final String mDid;

    @NotNull
    private ContactTaskQueue$mMainHandler$1 mMainHandler;

    @NotNull
    private final ArrayList<ContactCallTask> mWaitingResponseCallTasks;

    static {
        ajc$preClinit();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [com.xiaomi.fitness.device.contact.remote.ContactTaskQueue$mMainHandler$1] */
    public ContactTaskQueue(@NotNull String mDid, @NotNull RemoteCallbackList<nl5> mDataHandlerRemotes) {
        Intrinsics.checkNotNullParameter(mDid, "mDid");
        Intrinsics.checkNotNullParameter(mDataHandlerRemotes, "mDataHandlerRemotes");
        this.mDid = mDid;
        this.mDataHandlerRemotes = mDataHandlerRemotes;
        this.mApiTasksLock = new Object();
        this.mWaitingResponseCallTasks = new ArrayList<>();
        final Looper mainLooper = Looper.getMainLooper();
        this.mMainHandler = new Handler(mainLooper) { // from class: com.xiaomi.fitness.device.contact.remote.ContactTaskQueue$mMainHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                if (msg.what == 0) {
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fitness.device.contact.remote.ContactCallTask");
                    ContactCallTask contactCallTask = (ContactCallTask) obj;
                    Object obj2 = this.this$0.mApiTasksLock;
                    ContactTaskQueue contactTaskQueue = this.this$0;
                    synchronized (obj2) {
                        try {
                            if (contactTaskQueue.mWaitingResponseCallTasks.contains(contactCallTask)) {
                                contactCallTask.onResponseTimeout();
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

    private static /* synthetic */ void ajc$preClinit() {
        s69 s69Var = new s69("ContactTaskQueue.kt", ContactTaskQueue.class);
        ajc$tjp_0 = s69Var.h("method-execution", s69Var.g(b4s.APPLY_CHANNEL_TOKEN2_QUICK_BIND_CARD, "enqueue", "com.xiaomi.fitness.device.contact.remote.ContactTaskQueue", "com.xiaomi.fitness.device.contact.remote.ContactCallTask", "callTask", "", "int"), 0);
    }

    private final void dispatchMessage(String did, int type, byte[] data) {
        ArrayList arrayList;
        DeviceSyncExtKt.logi("dispatchMessage() called with: did = " + did + ", type = " + type + ", data = " + (data != null ? Integer.valueOf(data.length) : null));
        if (data == null) {
            return;
        }
        if (type == 102) {
            handleDataInternal(did, 102, data);
            return;
        }
        synchronized (this.mApiTasksLock) {
            arrayList = new ArrayList(this.mWaitingResponseCallTasks);
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = arrayList.iterator();
        if (type != 101) {
            while (it.hasNext()) {
                ContactCallTask contactCallTask = (ContactCallTask) it.next();
                if (type == contactCallTask.getType()) {
                    contactCallTask.onReceiveResponse(data);
                } else {
                    it.remove();
                }
            }
            handleDataInternal(did, type, data);
            return;
        }
        s7r s7rVarB = om5.b(data);
        if (s7rVarB == null) {
            DeviceSyncExtKt.logi("dispatchMessage: parse packet null data = " + ByteUtil.byteToString(data));
            return;
        }
        while (it.hasNext()) {
            ContactCallTask contactCallTask2 = (ContactCallTask) it.next();
            if (contactCallTask2.getType() != type) {
                it.remove();
            } else {
                s7r s7rVarB2 = om5.b(contactCallTask2.getData());
                if (s7rVarB2.e == s7rVarB.e && s7rVarB2.f == s7rVarB.f) {
                    contactCallTask2.onReceiveResponse((!s7rVarB.J() || s7rVarB.s() == 0) ? 0 : s7rVarB.s(), s7rVarB);
                } else {
                    it.remove();
                }
            }
        }
        handlePacketInternal(did, type, s7rVarB.e, s7rVarB);
    }

    public static final /* synthetic */ int enqueue_aroundBody0(ContactTaskQueue contactTaskQueue, ContactCallTask callTask, nrd nrdVar) {
        Intrinsics.checkNotNullParameter(callTask, "callTask");
        if (callTask.getNeedResponse()) {
            contactTaskQueue.mWaitingResponseCallTasks.add(callTask);
        }
        int timeout = callTask.getTimeout();
        if (timeout > 0) {
            Message messageObtainMessage = contactTaskQueue.mMainHandler.obtainMessage(0, callTask);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "obtainMessage(...)");
            contactTaskQueue.mMainHandler.sendMessageDelayed(messageObtainMessage, timeout);
        }
        if (callTask.getType() == 101) {
            s7r s7rVarB = om5.b(callTask.getData());
            DeviceSyncExtKt.logi("enqueue: call type = " + s7rVarB.e + ", id = " + s7rVarB.f);
        }
        int iCall = IMiWearCoreClient.INSTANCE.getInstance().call(callTask.getType(), callTask.getDid(), callTask.getData(), callTask.getNeedResponse(), contactTaskQueue.callback(callTask), callTask.getTimeout());
        callTask.setId(iCall);
        return iCall;
    }

    private final void handleDataInternal(String did, int type, byte[] data) {
        DeviceSyncExtKt.logi("DeviceDataHandler-handleData:type=" + type + ", did=" + did + ", handlers=" + this.mDataHandlerRemotes + " dataSize:" + (data != null ? Integer.valueOf(data.length) : null));
        RemoteCallbackList<nl5> remoteCallbackList = this.mDataHandlerRemotes;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            nl5 nl5Var = (nl5) broadcastItem;
                            DeviceSyncExtKt.logi("DeviceDataHandler handleData: type=" + type + ", handler=" + nl5Var);
                            if (nl5Var.asBinder().isBinderAlive()) {
                                boolean zHandleDataInternal = nl5Var.handleDataInternal(did, type, data);
                                DeviceSyncExtKt.logi("DeviceDataHandler-handleData: type=" + type + ", handler=" + nl5Var + ", handleData=" + zHandleDataInternal);
                                if (zHandleDataInternal) {
                                    try {
                                        remoteCallbackList.finishBroadcast();
                                        return;
                                    } catch (Exception e) {
                                        Logger.e("An exception occurred when finishBroadcast", e);
                                        return;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception e2) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e2);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred when finishBroadcast", e3);
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred during RemoteCallbackList forEach", e4);
                remoteCallbackList.finishBroadcast();
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e5) {
                Logger.e("An exception occurred when finishBroadcast", e5);
            }
            throw th;
        }
    }

    private final void handlePacketInternal(String did, int type, int subType, s7r packet) {
        DeviceSyncExtKt.logi("DeviceDataHandler-handlePacket:type=" + type + ",  packet type=" + packet.e + ",  packet id=" + packet.f + ",  did=" + did);
        RemoteCallbackList<nl5> remoteCallbackList = this.mDataHandlerRemotes;
        try {
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            nl5 nl5Var = (nl5) broadcastItem;
                            if (nl5Var.asBinder().isBinderAlive()) {
                                boolean zHandlePacketInternal = nl5Var.handlePacketInternal(did, subType, dsf.i(packet));
                                DeviceSyncExtKt.logi("DeviceDataHandler-handlePacket: type=" + type + ", handler=" + nl5Var + ", handleData=" + zHandlePacketInternal);
                                if (zHandlePacketInternal) {
                                    try {
                                        remoteCallbackList.finishBroadcast();
                                        return;
                                    } catch (Exception e) {
                                        Logger.e("An exception occurred when finishBroadcast", e);
                                        return;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } catch (Exception e2) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e2);
                        }
                    }
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e3) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e5) {
                Logger.e("An exception occurred when finishBroadcast", e5);
            }
            throw th;
        }
    }

    @NotNull
    public final ICallback callback(@NotNull final ContactCallTask callTask) {
        Intrinsics.checkNotNullParameter(callTask, "callTask");
        DeviceSyncExtKt.logi("Device(" + callTask.getDid() + ")'s callback, type=" + callTask.getType());
        return new ICallback.Stub() { // from class: com.xiaomi.fitness.device.contact.remote.ContactTaskQueue.callback.1
            @Override // com.xiaomi.wearable.core.ICallback.Stub, com.xiaomi.wearable.core.ICallback
            public void onCallback(WearApiResult result) {
                AnyExtKt.main$default(null, new ContactTaskQueue$callback$1$onCallback$1(result, callTask, null), 1, null);
            }
        };
    }

    public final void cancel(@NotNull ContactCallTask callTask) {
        Intrinsics.checkNotNullParameter(callTask, "callTask");
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseCallTasks.remove(callTask);
        }
        removeMessages(0, callTask);
    }

    @k53
    public final int enqueue(@NotNull ContactCallTask callTask) {
        nrd nrdVarC = s69.c(ajc$tjp_0, this, this, callTask);
        BreakSilentUpgradeAspect breakSilentUpgradeAspectAspectOf = BreakSilentUpgradeAspect.aspectOf();
        fai faiVarC = new kg4(new Object[]{this, callTask, nrdVarC}).c(69648);
        Annotation annotation = ajc$anno$0;
        if (annotation == null) {
            annotation = ContactTaskQueue.class.getDeclaredMethod("enqueue", ContactCallTask.class).getAnnotation(k53.class);
            ajc$anno$0 = annotation;
        }
        return xj4.d(breakSilentUpgradeAspectAspectOf.aroundBreakSilentUpgrade(faiVarC, (k53) annotation));
    }

    @Override // com.xiaomi.wearable.core.client.IDataHandler
    public boolean handleData(@NotNull String did, int type, @NotNull byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(data, "data");
        dispatchMessage(did, type, data);
        return false;
    }

    public final void onReceiveResponse$device_contact_release(@NotNull ContactCallTask callTask) {
        Intrinsics.checkNotNullParameter(callTask, "callTask");
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseCallTasks.remove(callTask);
        }
        removeMessages(0, callTask);
    }

    public final void onResponseTimeout$device_contact_release(@NotNull ContactCallTask callTask) {
        Intrinsics.checkNotNullParameter(callTask, "callTask");
        synchronized (this.mApiTasksLock) {
            this.mWaitingResponseCallTasks.remove(callTask);
        }
    }

    public final void cancel(int callId) {
        ContactCallTask contactCallTask;
        synchronized (this.mApiTasksLock) {
            try {
                Iterator<ContactCallTask> it = this.mWaitingResponseCallTasks.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
                do {
                    if (!it.hasNext()) {
                        contactCallTask = null;
                        break;
                    } else {
                        ContactCallTask next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                        contactCallTask = next;
                    }
                } while (contactCallTask.getId() != callId);
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Logger.i(TAG, "cancel() called with: callId = " + callId + ", " + contactCallTask);
        if (contactCallTask != null) {
            contactCallTask.cancel();
        }
        MassDataDispatcher.s().l(callId);
        IMiWearCoreClient.INSTANCE.getInstance().closeMassChannel(callId);
    }
}
