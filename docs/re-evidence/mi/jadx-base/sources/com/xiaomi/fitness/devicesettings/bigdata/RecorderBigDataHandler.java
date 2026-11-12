package com.xiaomi.fitness.devicesettings.bigdata;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import defpackage.blf;
import defpackage.s7r;
import defpackage.vkf;
import defpackage.wkf;
import defpackage.xc6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/RecorderBigDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "<init>", "()V", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecorderBigDataHandler extends DataHandlerWrapper {

    @NotNull
    private static final String TAG = "RecorderBigDataHandler";
    public static final int sCmdAudioRecord = 132;
    private static final byte sVersion0 = 0;

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handleData(@NotNull String did, int type, @Nullable byte[] data) {
        Intrinsics.checkNotNullParameter(did, "did");
        xc6.d("BigDataHandler handleData type:" + type + " did:" + did);
        if (data == null) {
            return false;
        }
        boolean z = (DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getDeviceCapabilityV2(did) & 524288) != 0;
        Logger.i(TAG, "isSupportSyncRecord " + z);
        if (!RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication()) || !z) {
            return false;
        }
        Logger.i(TAG, "receive data " + data.length);
        if (type == 104) {
            xc6.d("BigDataHandler handleData type:" + type + " did:" + did);
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
            if (byteBufferOrder.get() == 0 && (byteBufferOrder.get() & 255) == 132) {
                SyncFileSave.INSTANCE.receiverData(data, byteBufferOrder, RecordConstant.RECORD_SYNC_DIR + did);
                return true;
            }
        }
        return super.handleData(did, type, data);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        blf blfVarQ;
        blf.a aVar;
        wkf.b bVarO;
        Intrinsics.checkNotNullParameter(did, "did");
        Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
        if (numValueOf != null && numValueOf.intValue() == 16) {
            vkf vkfVarA = packet.A();
            wkf[] wkfVarArr = (vkfVarA == null || (bVarO = vkfVarA.o()) == null) ? null : bVarO.c;
            Logger.i(SyncFileSave.sTag, "loadDeviceRecordList onSuccess list:" + (wkfVarArr != null ? Integer.valueOf(wkfVarArr.length) : null));
            SyncFileSave.INSTANCE.setMediaFiles(wkfVarArr != null ? ArraysKt___ArraysKt.toMutableList(wkfVarArr) : null);
            return false;
        }
        if (numValueOf == null || numValueOf.intValue() != 22) {
            return super.handlePacket(did, type, packet);
        }
        vkf vkfVarA2 = packet.A();
        if (vkfVarA2 != null && (blfVarQ = vkfVarA2.q()) != null && (aVar = blfVarQ.e) != null && aVar.d == 1) {
            SyncFileSave.INSTANCE.getMediaFiles();
        }
        return false;
    }
}
