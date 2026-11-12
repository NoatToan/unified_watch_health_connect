package com.xiaomi.fitness.devicesettings.bigdata;

import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.RomUtils;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import defpackage.f6f;
import defpackage.h6f;
import defpackage.s7r;
import defpackage.xc6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0012\u0010\u0011J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bigdata/BigDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "", "data", "handleData", "(Ljava/lang/String;I[B)Z", "", "reset", "()V", "<init>", "Companion", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class BigDataHandler extends DataHandlerWrapper {
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
        if (RomUtils.INSTANCE.isAtLeastHyperOS2(ApplicationExtKt.getApplication()) && z) {
            return false;
        }
        if (type == 104) {
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(data).order(ByteOrder.LITTLE_ENDIAN);
            Intrinsics.checkNotNullExpressionValue(byteBufferOrder, "order(...)");
            if (byteBufferOrder.get() == 0 && (byteBufferOrder.get() & 255) == 132) {
                NormalFileSave.INSTANCE.receiverData(data, byteBufferOrder, RecordConstant.RECORD_SAVE_DIR + did);
                return true;
            }
        }
        return super.handleData(did, type, data);
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        h6f h6fVarO;
        Intrinsics.checkNotNullParameter(did, "did");
        xc6.d("BigDataHandler handlePacket type:" + type + " did:" + did);
        Integer numValueOf = packet != null ? Integer.valueOf(packet.f) : null;
        if (numValueOf != null) {
            boolean z = true;
            if (numValueOf.intValue() == 1) {
                f6f f6fVarZ = packet.z();
                if (f6fVarZ == null || (h6fVarO = f6fVarZ.o()) == null) {
                    return false;
                }
                if (h6fVarO.d == 132) {
                    NormalFileSaveKt.sendCancelReceiver();
                } else {
                    z = false;
                }
                return z;
            }
        }
        return super.handlePacket(did, type, packet);
    }

    public final void reset() {
        NormalFileSave.INSTANCE.reset();
    }
}
