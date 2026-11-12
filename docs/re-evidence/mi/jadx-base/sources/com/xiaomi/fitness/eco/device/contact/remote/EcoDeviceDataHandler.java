package com.xiaomi.fitness.eco.device.contact.remote;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncExtKt;
import defpackage.dsf;
import defpackage.u7r;
import defpackage.zrc;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0018\u001a\u00020\r\u0012\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a¢\u0006\u0004\b\u001f\u0010 J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0011\u001a\u00020\u00102\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceDataHandler;", "Lzrc;", "", "type", "Lu7r;", "packet", "", "handlePacket", "(ILu7r;)Z", "", "data", "handleData", "(I[B)Z", "", "nodeId", "path", "", "handleEcoData", "(Ljava/lang/String;Ljava/lang/String;[B)V", "did", "updateDid", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "mDid", "Ljava/lang/String;", "", "Landroid/os/RemoteCallbackList;", "Lcom/xiaomi/fitness/eco/device/contact/export/a;", "mHandlers", "Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nEcoDeviceDataHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EcoDeviceDataHandler.kt\ncom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceDataHandler\n+ 2 ListExt.kt\ncom/xiaomi/fitness/common/extensions/ListExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n90#2,19:73\n90#2,19:92\n90#2,19:112\n1863#3:111\n1864#3:131\n*S KotlinDebug\n*F\n+ 1 EcoDeviceDataHandler.kt\ncom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceDataHandler\n*L\n26#1:73,19\n40#1:92,19\n63#1:112,19\n62#1:111\n62#1:131\n*E\n"})
public final class EcoDeviceDataHandler implements zrc {

    @NotNull
    private String mDid;

    @NotNull
    private final Map<Integer, RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a>> mHandlers;

    /* JADX WARN: Multi-variable type inference failed */
    public EcoDeviceDataHandler(@NotNull String mDid, @NotNull Map<Integer, ? extends RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a>> mHandlers) {
        Intrinsics.checkNotNullParameter(mDid, "mDid");
        Intrinsics.checkNotNullParameter(mHandlers, "mHandlers");
        this.mDid = mDid;
        this.mHandlers = mHandlers;
    }

    @Override // defpackage.zrc
    public boolean handleData(int type, @Nullable byte[] data) {
        EcoDeviceSyncExtKt.logi("handleData:type=" + type + ", did=" + this.mDid + ", handlers=" + this.mHandlers + " dataSize:" + (data != null ? Integer.valueOf(data.length) : null));
        RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a> remoteCallbackList = this.mHandlers.get(Integer.valueOf(type));
        try {
            try {
                if (remoteCallbackList != null) {
                    try {
                        int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                com.xiaomi.fitness.eco.device.contact.export.a aVar = (com.xiaomi.fitness.eco.device.contact.export.a) broadcastItem;
                                EcoDeviceSyncExtKt.logi("DeviceDataHandler handleData: type=" + type + ", handler=" + aVar);
                                if (aVar.asBinder().isBinderAlive()) {
                                    boolean zHandleDataInternal = aVar.handleDataInternal(this.mDid, type, data);
                                    EcoDeviceSyncExtKt.logi("handleData: type=" + type + ", handler=" + aVar + ", handleData=" + zHandleDataInternal);
                                    if (zHandleDataInternal) {
                                        try {
                                            remoteCallbackList.finishBroadcast();
                                            return true;
                                        } catch (Exception e) {
                                            Logger.e("An exception occurred when finishBroadcast", e);
                                            return true;
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
                }
            } catch (Exception e4) {
                Logger.e("An exception occurred when finishBroadcast", e4);
            }
            return false;
        } catch (Throwable th) {
            try {
                remoteCallbackList.finishBroadcast();
            } catch (Exception e5) {
                Logger.e("An exception occurred when finishBroadcast", e5);
            }
            throw th;
        }
    }

    @Override // defpackage.zrc
    public void handleEcoData(@Nullable String nodeId, @Nullable String path, @Nullable byte[] data) {
        EcoDeviceSyncExtKt.logi("handleWearData:nodeId=" + nodeId + ", path=" + path);
    }

    @Override // defpackage.zrc
    public boolean handlePacket(int type, @Nullable u7r packet) {
        Integer numValueOf = packet != null ? Integer.valueOf(packet.e) : null;
        Integer numValueOf2 = packet != null ? Integer.valueOf(packet.f) : null;
        EcoDeviceSyncExtKt.logi("handleEcoPacket:type=" + type + ",  packet type=" + numValueOf + ",  packet id=" + numValueOf2 + ",  did=" + this.mDid);
        RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a> remoteCallbackList = this.mHandlers.get(Integer.valueOf(type));
        StringBuilder sb = new StringBuilder();
        sb.append("handleEcoPacket:type=");
        sb.append(type);
        sb.append(",  mHandlers[type]?=");
        sb.append(remoteCallbackList);
        EcoDeviceSyncExtKt.logi(sb.toString());
        EcoDeviceSyncExtKt.logi("handleEcoPacket:type=" + type + ",  mHandlers=" + this.mHandlers);
        RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a> remoteCallbackList2 = this.mHandlers.get(Integer.valueOf(type));
        try {
            if (remoteCallbackList2 != null) {
                try {
                    try {
                        int iBeginBroadcast = remoteCallbackList2.beginBroadcast();
                        for (int i = 0; i < iBeginBroadcast; i++) {
                            try {
                                IInterface broadcastItem = remoteCallbackList2.getBroadcastItem(i);
                                Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                                com.xiaomi.fitness.eco.device.contact.export.a aVar = (com.xiaomi.fitness.eco.device.contact.export.a) broadcastItem;
                                if (aVar.asBinder().isBinderAlive()) {
                                    boolean zHandleEcoDataInternal = aVar.handleEcoDataInternal(this.mDid, type, dsf.i(packet));
                                    EcoDeviceSyncExtKt.logi("handleEcoPacket: type=" + type + ", handler=" + aVar + ", handleData=" + zHandleEcoDataInternal);
                                    if (zHandleEcoDataInternal) {
                                        try {
                                            remoteCallbackList2.finishBroadcast();
                                            return true;
                                        } catch (Exception e) {
                                            Logger.e("An exception occurred when finishBroadcast", e);
                                            return true;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            } catch (Exception e2) {
                                Logger.e("action(" + remoteCallbackList2.getBroadcastItem(i) + ") throw exception", e2);
                            }
                        }
                        remoteCallbackList2.finishBroadcast();
                    } catch (Exception e3) {
                        Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                        remoteCallbackList2.finishBroadcast();
                    }
                } catch (Throwable th) {
                    try {
                        remoteCallbackList2.finishBroadcast();
                    } catch (Exception e4) {
                        Logger.e("An exception occurred when finishBroadcast", e4);
                    }
                    throw th;
                }
            }
        } catch (Exception e5) {
            Logger.e("An exception occurred when finishBroadcast", e5);
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "EcoDeviceDataHandler(mDid='" + this.mDid + "', mHandlers=" + this.mHandlers + ")";
    }

    @Override // defpackage.zrc
    public void updateDid(@Nullable String did) {
        EcoDeviceSyncExtKt.logi("updateDid to " + did);
        if (did != null && did.length() != 0) {
            this.mDid = did;
        }
        Iterator<T> it = this.mHandlers.values().iterator();
        while (it.hasNext()) {
            RemoteCallbackList remoteCallbackList = (RemoteCallbackList) it.next();
            try {
                try {
                    int iBeginBroadcast = remoteCallbackList.beginBroadcast();
                    for (int i = 0; i < iBeginBroadcast; i++) {
                        try {
                            IInterface broadcastItem = remoteCallbackList.getBroadcastItem(i);
                            Intrinsics.checkNotNullExpressionValue(broadcastItem, "getBroadcastItem(...)");
                            ((com.xiaomi.fitness.eco.device.contact.export.a) broadcastItem).updateDid(did);
                        } catch (Exception e) {
                            Logger.e("action(" + remoteCallbackList.getBroadcastItem(i) + ") throw exception", e);
                        }
                    }
                    try {
                        remoteCallbackList.finishBroadcast();
                    } catch (Exception e2) {
                        Logger.e("An exception occurred when finishBroadcast", e2);
                    }
                } catch (Exception e3) {
                    Logger.e("An exception occurred during RemoteCallbackList forEach", e3);
                    remoteCallbackList.finishBroadcast();
                }
            } catch (Throwable th) {
                try {
                    remoteCallbackList.finishBroadcast();
                } catch (Exception e4) {
                    Logger.e("An exception occurred when finishBroadcast", e4);
                }
                throw th;
            }
        }
    }
}
