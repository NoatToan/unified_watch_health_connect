package com.xiaomi.fitness.device.contact.mass;

import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DataHandlerWrapper;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.mass.dispatcher.MassDataDispatcher;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import defpackage.f6f;
import defpackage.h6f;
import defpackage.s7r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/device/contact/mass/MassDataHandler;", "Lcom/xiaomi/fitness/device/contact/export/DataHandlerWrapper;", "", "did", "", "type", "Ls7r;", "packet", "", "handlePacket", "(Ljava/lang/String;ILs7r;)Z", "TAG", "Ljava/lang/String;", "<init>", "()V", "device-contact_release"}, k = 1, mv = {2, 0, 0})
public final class MassDataHandler extends DataHandlerWrapper {

    @NotNull
    public static final MassDataHandler INSTANCE = new MassDataHandler();

    @NotNull
    private static final String TAG = "MassDataHandler";

    private MassDataHandler() {
    }

    @Override // com.xiaomi.fitness.device.contact.export.DataHandlerWrapper, com.xiaomi.fitness.device.contact.export.DataHandler
    public boolean handlePacket(@NotNull String did, int type, @Nullable s7r packet) {
        h6f h6fVarO;
        Intrinsics.checkNotNullParameter(did, "did");
        if (packet == null) {
            return false;
        }
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (Intrinsics.areEqual(did, wearableDeviceModel != null ? wearableDeviceModel.getDid() : null) && packet.e == 22 && packet.f == 1) {
            f6f f6fVarZ = packet.z();
            boolean z = (f6fVarZ == null || (h6fVarO = f6fVarZ.o()) == null || h6fVarO.c != 3) ? false : true;
            Logger.i(TAG, "handlePacket: " + z);
            if (z) {
                DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).cancelTask(MassDataDispatcher.n());
                return true;
            }
        }
        return false;
    }
}
