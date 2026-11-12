package com.xiaomi.fitness.device.contact;

import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.extensions.DeviceSyncExtKt;
import defpackage.nl5;
import defpackage.s7r;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\u0012\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u000f\u001a\u00020\u000e2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/device/contact/DeviceDataHandlerAdapter;", "Lnl5$a;", "", "did", "", "type", "", "data", "", "handlePacketInternal", "(Ljava/lang/String;I[B)Z", "handleDataInternal", "nodeId", "path", "", "handleWearData", "(Ljava/lang/String;Ljava/lang/String;[B)V", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "mDataHandlers", "Ljava/util/concurrent/ConcurrentHashMap;", "<init>", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "device-contact_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nDeviceDataHandlerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataHandlerAdapter.kt\ncom/xiaomi/fitness/device/contact/DeviceDataHandlerAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1863#2,2:64\n1863#2,2:66\n*S KotlinDebug\n*F\n+ 1 DeviceDataHandlerAdapter.kt\ncom/xiaomi/fitness/device/contact/DeviceDataHandlerAdapter\n*L\n20#1:64,2\n37#1:66,2\n*E\n"})
public final class DeviceDataHandlerAdapter extends nl5.a {

    @NotNull
    private final ConcurrentHashMap<Integer, List<DataHandlerWrapper>> mDataHandlers;

    public DeviceDataHandlerAdapter(@NotNull ConcurrentHashMap<Integer, List<DataHandlerWrapper>> mDataHandlers) {
        Intrinsics.checkNotNullParameter(mDataHandlers, "mDataHandlers");
        this.mDataHandlers = mDataHandlers;
    }

    @Override // defpackage.nl5
    public boolean handleDataInternal(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSyncExtKt.logi("handle data, did=" + did + ", type=" + type);
        List<DataHandlerWrapper> list = this.mDataHandlers.get(Integer.valueOf(type));
        if (list != null) {
            for (DataHandlerWrapper dataHandlerWrapper : list) {
                try {
                    boolean zHandleData = dataHandlerWrapper.handleData(did, type, data);
                    DeviceSyncExtKt.logi(dataHandlerWrapper + ">>>handleData: " + zHandleData);
                    if (zHandleData) {
                        return true;
                    }
                } catch (Exception e) {
                    DeviceSyncExtKt.loge("handle data, exception:", e);
                }
            }
        }
        DeviceSyncExtKt.logi("data has not been handle, did=" + did + ", type=" + type);
        return false;
    }

    @Override // defpackage.nl5
    public boolean handlePacketInternal(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        DeviceSyncExtKt.logi("handle packet, did=" + did + ", type=" + type);
        List<DataHandlerWrapper> list = this.mDataHandlers.get(Integer.valueOf(type));
        if (list != null) {
            for (DataHandlerWrapper dataHandlerWrapper : list) {
                try {
                    boolean zHandlePacket = dataHandlerWrapper.handlePacket(did, type, s7r.L(data));
                    DeviceSyncExtKt.logi(dataHandlerWrapper + ">>>handlePacket: " + zHandlePacket);
                    if (zHandlePacket) {
                        return true;
                    }
                } catch (Exception e) {
                    DeviceSyncExtKt.loge("handle packet, exception:" + e, e);
                }
            }
        }
        DeviceSyncExtKt.logi("Packet has not been handle, did=" + did + ", type=" + type);
        return false;
    }

    @Override // defpackage.nl5
    public void handleWearData(@Nullable String nodeId, @Nullable String path, @Nullable byte[] data) {
        DeviceSyncExtKt.logi("handle wear data");
    }
}
