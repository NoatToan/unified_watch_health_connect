package com.mi.fitness.checkupdate.eco.ota;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mi.fitness.checkupdate.ota.OtaExecutor;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceContact;
import com.xiaomi.fitness.eco.device.contact.export.EcoDeviceSyncExtKt;
import com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener;
import com.xiaomi.fitness.eco.device.manager.export.EcoDeviceModel;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.qch;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/mi/fitness/checkupdate/eco/ota/EcoGeneralOtaExecutor;", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "", "getOtaDetailType", "()I", "", "sendOtaFile", "()V", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "reset", "otaType", "I", "mSegmentLength", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "deviceModel", "Lcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;", "Ljava/io/File;", "file", "Lqch;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/io/File;ILcom/xiaomi/fitness/eco/device/manager/export/EcoDeviceModel;Lqch;)V", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class EcoGeneralOtaExecutor extends OtaExecutor {

    @Nullable
    private final EcoDeviceModel deviceModel;
    private final int mSegmentLength;
    private final int otaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcoGeneralOtaExecutor(int i, @NotNull File file, int i2, @Nullable EcoDeviceModel ecoDeviceModel, @NotNull qch listener) {
        super(file, listener);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.otaType = i;
        this.mSegmentLength = i2;
        this.deviceModel = ecoDeviceModel;
    }

    private final int getOtaDetailType() {
        return this.otaType != 1 ? 0 : 15;
    }

    private final void sendOtaFile() {
        String did;
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel == null || (did = ecoDeviceModel.getDid()) == null) {
            return;
        }
        EcoDeviceSyncExtKt.getInstance(EcoDeviceContact.INSTANCE).sendFile(did, 2, getOtaDetailType(), getMFile().getAbsolutePath(), this.mSegmentLength, 0, new EcoSyncStateListener() { // from class: com.mi.fitness.checkupdate.eco.ota.EcoGeneralOtaExecutor.sendOtaFile.1
            @Override // com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener
            public void onFinish(String did2, int code) {
                Intrinsics.checkNotNullParameter(did2, "did");
                if (code != 0) {
                    EcoGeneralOtaExecutor.this.getMOtaListener().onError(-1, "");
                } else {
                    EcoGeneralOtaExecutor.this.getMOtaListener().onComplete();
                    EcoGeneralOtaExecutor.this.reset();
                }
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener
            public void onStart(String did2) {
                Intrinsics.checkNotNullParameter(did2, "did");
            }

            @Override // com.xiaomi.fitness.eco.device.contact.export.EcoSyncStateListener
            public void onSyncing(String did2, int progress) {
                Intrinsics.checkNotNullParameter(did2, "did");
                EcoGeneralOtaExecutor.this.getMOtaListener().onProgress(progress);
            }
        });
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void reset() {
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void start() {
        sendOtaFile();
    }

    @Override // com.mi.fitness.checkupdate.ota.OtaExecutor
    public void stop() {
        EcoDeviceModel ecoDeviceModel = this.deviceModel;
        if (ecoDeviceModel != null) {
            EcoSilentUpgradeExtKt.pauseMass(ecoDeviceModel);
        }
    }
}
