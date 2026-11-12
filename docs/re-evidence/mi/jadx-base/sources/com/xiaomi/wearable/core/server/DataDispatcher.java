package com.xiaomi.wearable.core.server;

import android.os.Handler;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.ArrayMap;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import com.xiaomi.wearable.ChannelType;
import com.xiaomi.wearable.connection.ConnectStateObserver;
import com.xiaomi.wearable.connection.IDeviceStateListener;
import com.xiaomi.wearable.core.CoreExtKt;
import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.HealthAppKeeperKt;
import com.xiaomi.wearable.core.c;
import com.xiaomi.wearable.core.server.DataDispatcher;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0002-,B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0013J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\bJ\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0013R&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/xiaomi/wearable/core/server/DataDispatcher;", "Lcom/xiaomi/wearable/connection/IDeviceStateListener;", "", "type", "Lcom/xiaomi/wearable/core/c;", "dataHandler", "", LoginPreferenceConfig.TYPE_REGISTER, "(ILcom/xiaomi/wearable/core/c;)V", "subType", "", "data", "dispatchData", "(I[B)V", "dispatchDataInner", "(I[B)I", "Lcom/xiaomi/wearable/core/DeviceInfo;", "deviceInfo", "update", "(Lcom/xiaomi/wearable/core/DeviceInfo;)V", "", "did", "onConnectSuccess", "(Ljava/lang/String;)V", "deviceDataHandler", "unregister", "destroy", "()V", "Lcom/xiaomi/wearable/core/DeviceInfo;", "getDeviceInfo", "()Lcom/xiaomi/wearable/core/DeviceInfo;", "setDeviceInfo", "Landroid/util/ArrayMap;", "Landroid/os/RemoteCallbackList;", "dataHandlers", "Landroid/util/ArrayMap;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lcom/xiaomi/wearable/core/server/DataDispatcher$BufferData;", "messageBuffer", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "<init>", "Companion", "BufferData", "miwear-core_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDataDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataDispatcher.kt\ncom/xiaomi/wearable/core/server/DataDispatcher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CoreExt.kt\ncom/xiaomi/wearable/CoreExtKt\n*L\n1#1,129:1\n1863#2,2:130\n160#3,15:132\n*S KotlinDebug\n*F\n+ 1 DataDispatcher.kt\ncom/xiaomi/wearable/core/server/DataDispatcher\n*L\n101#1:130,2\n83#1:132,15\n*E\n"})
public final class DataDispatcher implements IDeviceStateListener {
    public static final int DISPATCH_CHANNEL_ERROR = 2;
    public static final int DISPATCH_HEALTH_ERROR = 1;
    public static final int DISPATCH_SUCCESS = 0;

    @NotNull
    private static final String TAG = "DataDispatcher";

    @NotNull
    private final ArrayMap<Integer, RemoteCallbackList<c>> dataHandlers;

    @NotNull
    private DeviceInfo deviceInfo;

    @NotNull
    private final Handler mainHandler;

    @NotNull
    private final CopyOnWriteArrayList<BufferData> messageBuffer;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/wearable/core/server/DataDispatcher$BufferData;", "", "type", "", "data", "", "<init>", "(I[B)V", "getType", "()I", "getData", "()[B", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BufferData {

        @NotNull
        private final byte[] data;
        private final int type;

        public BufferData(int i, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.type = i;
            this.data = data;
        }

        public static /* synthetic */ BufferData copy$default(BufferData bufferData, int i, byte[] bArr, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = bufferData.type;
            }
            if ((i2 & 2) != 0) {
                bArr = bufferData.data;
            }
            return bufferData.copy(i, bArr);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getType() {
            return this.type;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final byte[] getData() {
            return this.data;
        }

        @NotNull
        public final BufferData copy(int type, @NotNull byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new BufferData(type, data);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BufferData)) {
                return false;
            }
            BufferData bufferData = (BufferData) other;
            return this.type == bufferData.type && Intrinsics.areEqual(this.data, bufferData.data);
        }

        @NotNull
        public final byte[] getData() {
            return this.data;
        }

        public final int getType() {
            return this.type;
        }

        public int hashCode() {
            return (Integer.hashCode(this.type) * 31) + Arrays.hashCode(this.data);
        }

        @NotNull
        public String toString() {
            return "BufferData(type=" + this.type + ", data=" + Arrays.toString(this.data) + ")";
        }
    }

    public DataDispatcher(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
        this.dataHandlers = new ArrayMap<>();
        this.messageBuffer = new CopyOnWriteArrayList<>();
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainHandler = handler;
        handler.post(new Runnable() { // from class: el5
            @Override // java.lang.Runnable
            public final void run() {
                DataDispatcher._init_$lambda$0(this.f16754a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(DataDispatcher this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ConnectStateObserver.INSTANCE.addConnectResultListener(this$0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchDataInner$lambda$2(RemoteCallbackList remoteCallbackList, DataDispatcher this$0, int i, byte[] data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "$data");
        try {
            try {
                int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i2);
                    Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                    ((c) broadcastItem).handleData(this$0.deviceInfo.getDid(), i, data);
                }
            } catch (Exception e) {
                CoreExtKt.getLogger().e("forEach", "An exception occurred during RemoteCallbackList forEach", e);
            }
        } finally {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception unused) {
                CoreExtKt.getLogger().e("forEach", "An exception occurred when finishBroadcast");
            }
        }
    }

    public final void destroy() {
        CoreExtKt.getLogger().i(TAG, "destroy() called");
        this.messageBuffer.clear();
    }

    public final void dispatchData(int subType, @NotNull byte[] data) throws RemoteException {
        Intrinsics.checkNotNullParameter(data, "data");
        int iDispatchDataInner = dispatchDataInner(subType, data);
        CoreExtKt.getLogger().i(TAG, "dispatchData() called with: " + iDispatchDataInner);
        if (iDispatchDataInner == 1) {
            HealthAppKeeperKt.startHealthApp();
        }
    }

    public final int dispatchDataInner(final int subType, @NotNull final byte[] data) throws RemoteException {
        final RemoteCallbackList<c> remoteCallbackList;
        Intrinsics.checkNotNullParameter(data, "data");
        ChannelType.Companion companion = ChannelType.INSTANCE;
        if (companion.isWearableChannel(subType)) {
            remoteCallbackList = this.dataHandlers.get(199);
        } else {
            remoteCallbackList = companion.isLyraChannel(subType) ? this.dataHandlers.get(112) : null;
        }
        CoreExtKt.getLogger().i(TAG, "dispatchData() called with: subType = " + subType + ", dataHandlers " + this.dataHandlers.size() + ", dataHandler " + remoteCallbackList);
        if (remoteCallbackList != null && remoteCallbackList.getRegisteredCallbackCount() != 0) {
            com.xiaomi.wearable.CoreExtKt.getHandler().post(new Runnable() { // from class: dl5
                @Override // java.lang.Runnable
                public final void run() {
                    DataDispatcher.dispatchDataInner$lambda$2(remoteCallbackList, this, subType, data);
                }
            });
            return 0;
        }
        CoreExtKt.getLogger().i(TAG, "dispatchData() add message " + subType);
        this.messageBuffer.add(new BufferData(subType, data));
        return companion.isWearableChannel(subType) ? 1 : 2;
    }

    @NotNull
    public final DeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.xiaomi.wearable.connection.IDeviceStateListener
    public void onConnectSuccess(@Nullable String did) throws RemoteException {
        if (Intrinsics.areEqual(this.deviceInfo.getDid(), did)) {
            CoreExtKt.getLogger().i(TAG, "onConnectSuccess() dispatch buffer message = " + this.messageBuffer.size());
            for (BufferData bufferData : this.messageBuffer) {
                int iDispatchDataInner = dispatchDataInner(bufferData.getType(), bufferData.getData());
                CoreExtKt.getLogger().i(TAG, "register() messageBuffer " + iDispatchDataInner);
            }
            this.messageBuffer.clear();
        }
    }

    public final void register(int type, @NotNull c dataHandler) {
        Intrinsics.checkNotNullParameter(dataHandler, "dataHandler");
        CoreExtKt.getLogger().i(TAG, "register() called with: type = " + type + ", dataHandler = " + dataHandler);
        RemoteCallbackList<c> remoteCallbackList = this.dataHandlers.get(Integer.valueOf(type));
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
            this.dataHandlers.put(Integer.valueOf(type), remoteCallbackList);
        }
        remoteCallbackList.register(dataHandler, Integer.valueOf(type));
    }

    public final void setDeviceInfo(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "<set-?>");
        this.deviceInfo = deviceInfo;
    }

    public final void unregister(int type, @NotNull c deviceDataHandler) {
        Intrinsics.checkNotNullParameter(deviceDataHandler, "deviceDataHandler");
        CoreExtKt.getLogger().i(TAG, "unregister() called with: type = " + type + ", deviceDataHandler = " + deviceDataHandler);
        RemoteCallbackList<c> remoteCallbackList = this.dataHandlers.get(Integer.valueOf(type));
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(deviceDataHandler);
        }
    }

    public final void update(@NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.deviceInfo = deviceInfo;
    }
}
