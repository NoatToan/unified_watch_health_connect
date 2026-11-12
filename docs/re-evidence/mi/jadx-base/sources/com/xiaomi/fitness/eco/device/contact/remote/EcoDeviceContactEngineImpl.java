package com.xiaomi.fitness.eco.device.contact.remote;

import android.os.RemoteCallbackList;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.eco.api.EcoApiCallManager;
import com.xiaomi.eco.api.EcoApiResult;
import com.xiaomi.eco.common.connect.IEcoMassDataCallback;
import com.xiaomi.eco.common.connect.b;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncResult;
import com.xiaomi.fitness.eco.device.contact.extensions.EcoDeviceSyncExtKt;
import defpackage.zrc;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\t\b\u0007¢\u0006\u0004\b1\u00102J\u001f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J5\u0010\u0017\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010\u001a\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJK\u0010&\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b,\u0010+R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0.0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineImpl;", "Lcom/xiaomi/fitness/eco/device/contact/remote/EcoDeviceContactEngineInternal;", "", "did", "Lcom/xiaomi/eco/api/a;", "getEcoApiCall", "(Ljava/lang/String;)Lcom/xiaomi/eco/api/a;", "", "type", "Lcom/xiaomi/fitness/eco/device/contact/export/b;", "callback", "Lcom/xiaomi/eco/common/connect/b;", "ecoCallback", "(Ljava/lang/String;ILcom/xiaomi/fitness/eco/device/contact/export/b;)Lcom/xiaomi/eco/common/connect/b;", "Lzrc;", "getDataHandler", "(Ljava/lang/String;)Lzrc;", "", "isIDLE", "()Z", "", "packet", "needResponse", "callEco", "(Ljava/lang/String;[BZLcom/xiaomi/fitness/eco/device/contact/export/b;)I", "timeout", "callEcoTimeout", "(Ljava/lang/String;[BZLcom/xiaomi/fitness/eco/device/contact/export/b;I)I", "taskId", "", "cancelTask", "(Ljava/lang/String;I)V", "detailType", "path", "segmentLength", "priority", "Lcom/xiaomi/eco/common/connect/IEcoMassDataCallback;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "sendFile", "(Ljava/lang/String;IILjava/lang/String;IILcom/xiaomi/eco/common/connect/IEcoMassDataCallback;)I", "Lcom/xiaomi/fitness/eco/device/contact/export/a;", "handler", "addDataHandler", "(ILcom/xiaomi/fitness/eco/device/contact/export/a;)V", "removeDataHandler", "Ljava/util/concurrent/ConcurrentHashMap;", "Landroid/os/RemoteCallbackList;", "mHandlerProviders", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "()V", "Companion", "eco-device-contact_release"}, k = 1, mv = {2, 0, 0})
public final class EcoDeviceContactEngineImpl extends EcoDeviceContactEngineInternal {
    public static final int KEY_DEVICE_SYNC_BINDER = 30;

    @NotNull
    private final ConcurrentHashMap<Integer, RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a>> mHandlerProviders = new ConcurrentHashMap<>();

    private final b ecoCallback(final String did, final int type, final com.xiaomi.fitness.eco.device.contact.export.b callback) {
        EcoDeviceSyncExtKt.logi("eco Device(" + did + ")'s callback, type=" + type);
        return new b.a() { // from class: com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineImpl.ecoCallback.1
            @Override // com.xiaomi.eco.common.connect.b
            public void onCallback(EcoApiResult result) throws RemoteException {
                com.xiaomi.fitness.eco.device.contact.export.b bVar = callback;
                if (bVar == null || !bVar.asBinder().isBinderAlive()) {
                    return;
                }
                EcoDeviceSyncExtKt.logi("eco result code" + (result != null ? Integer.valueOf(result.a()) : null));
                if (result == null || result.a() != 0) {
                    callback.onSyncError(did, type, result != null ? result.a() : -1);
                    return;
                }
                if (result.d() == null) {
                    callback.onSyncSuccess(did, type, new EcoSyncResult("", result.a(), result.e()));
                    return;
                }
                com.xiaomi.fitness.eco.device.contact.export.b bVar2 = callback;
                String str = did;
                int i = type;
                byte[] bArrD = result.d();
                Intrinsics.checkNotNullExpressionValue(bArrD, "getData(...)");
                bVar2.onSyncSuccess(str, i, new EcoSyncResult(new String(bArrD, Charsets.UTF_8), result.a(), result.e()));
            }
        };
    }

    private final com.xiaomi.eco.api.a<?> getEcoApiCall(String did) {
        if (did == null || did.length() == 0) {
            return null;
        }
        return EcoApiCallManager.INSTANCE.get().getEcoApiCall(did);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public void addDataHandler(int type, @NotNull com.xiaomi.fitness.eco.device.contact.export.a handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a> remoteCallbackList = this.mHandlerProviders.get(Integer.valueOf(type));
        if (remoteCallbackList == null) {
            remoteCallbackList = new RemoteCallbackList<>();
            this.mHandlerProviders.put(Integer.valueOf(type), remoteCallbackList);
        }
        remoteCallbackList.register(handler);
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public int callEco(@Nullable String did, @Nullable byte[] packet, boolean needResponse, @Nullable com.xiaomi.fitness.eco.device.contact.export.b callback) {
        com.xiaomi.eco.api.a<?> ecoApiCall = getEcoApiCall(did);
        if (ecoApiCall != null) {
            return ecoApiCall.call(packet, needResponse, ecoCallback(ecoApiCall.getDid(), 0, callback));
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public int callEcoTimeout(@Nullable String did, @Nullable byte[] packet, boolean needResponse, @Nullable com.xiaomi.fitness.eco.device.contact.export.b callback, int timeout) {
        Intrinsics.checkNotNull(did);
        com.xiaomi.eco.api.a<?> ecoApiCall = getEcoApiCall(did);
        Logger.i("ecoCall " + ecoApiCall, new Object[0]);
        if (ecoApiCall != null) {
            return ecoApiCall.callTimeout(packet, needResponse, ecoCallback(ecoApiCall.getDid(), 0, callback), timeout);
        }
        return 0;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public void cancelTask(@NotNull String did, int taskId) {
        Intrinsics.checkNotNullParameter(did, "did");
        com.xiaomi.eco.api.a<?> ecoApiCall = getEcoApiCall(did);
        if (ecoApiCall != null) {
            ecoApiCall.cancel(taskId);
        }
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal
    @NotNull
    public zrc getDataHandler(@NotNull String did) {
        Intrinsics.checkNotNullParameter(did, "did");
        EcoDeviceSyncExtKt.logi("create data handler by " + did + " with " + this.mHandlerProviders);
        EcoDeviceDataHandler ecoDeviceDataHandler = new EcoDeviceDataHandler(did, this.mHandlerProviders);
        ecoDeviceDataHandler.updateDid(did);
        return ecoDeviceDataHandler;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public boolean isIDLE() {
        com.xiaomi.eco.api.a<?> ecoApiCall = getEcoApiCall(null);
        if (ecoApiCall != null) {
            return ecoApiCall.isIDLE();
        }
        return false;
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public void removeDataHandler(int type, @Nullable com.xiaomi.fitness.eco.device.contact.export.a handler) {
        RemoteCallbackList<com.xiaomi.fitness.eco.device.contact.export.a> remoteCallbackList = this.mHandlerProviders.get(Integer.valueOf(type));
        if (remoteCallbackList != null) {
            remoteCallbackList.unregister(handler);
            return;
        }
        EcoDeviceSyncExtKt.logi("don't find DataHandler with type(" + type + ")");
    }

    @Override // com.xiaomi.fitness.eco.device.contact.remote.EcoDeviceContactEngineInternal, com.xiaomi.fitness.eco.device.contact.remote.a
    public int sendFile(@NotNull String did, int type, int detailType, @Nullable String path, int segmentLength, int priority, @Nullable IEcoMassDataCallback listener) {
        Intrinsics.checkNotNullParameter(did, "did");
        com.xiaomi.eco.api.a<?> ecoApiCall = getEcoApiCall(did);
        if (ecoApiCall != null) {
            return ecoApiCall.sendFile(type, detailType, path, segmentLength, priority, listener);
        }
        return 0;
    }
}
