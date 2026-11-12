package com.mi.fitness.checkupdate.ota;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.contact.export.DeviceContact;
import com.xiaomi.fitness.device.contact.export.DeviceSyncExtKt;
import com.xiaomi.fitness.device.contact.export.SyncStateListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.wearable.hm.BroadcastsKt;
import defpackage.qch;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/mi/fitness/checkupdate/ota/GeneralOtaExecutor;", "Lcom/mi/fitness/checkupdate/ota/OtaExecutor;", "", "getOtaDetailType", "()I", "", "sendOtaFile", "()V", StatConstants.PARAM_START, BroadcastsKt.SILENT_PUSHING_STOP, "reset", "otaType", "I", "mSegmentLength", "massId", "Ljava/io/File;", "file", "Lqch;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(ILjava/io/File;ILqch;)V", "Companion", "checkupdate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class GeneralOtaExecutor extends OtaExecutor {

    @NotNull
    private static final String TAG = "GeneralOtaExecutor";
    private final int mSegmentLength;
    private int massId;
    private final int otaType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralOtaExecutor(int i, @NotNull File file, int i2, @NotNull qch listener) {
        super(file, listener);
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.otaType = i;
        this.mSegmentLength = i2;
    }

    private final int getOtaDetailType() {
        return this.otaType != 1 ? 0 : 15;
    }

    private final void sendOtaFile() {
        String did;
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel == null || (did = wearableDeviceModel.getDid()) == null) {
            return;
        }
        int iSendFile = DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).sendFile(did, 2, getOtaDetailType(), getMFile().getAbsolutePath(), this.mSegmentLength, new SyncStateListener() { // from class: com.mi.fitness.checkupdate.ota.GeneralOtaExecutor$sendOtaFile$id$1
            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onFinish(String did2, int code) {
                Intrinsics.checkNotNullParameter(did2, "did");
                if (code != 0) {
                    this.this$0.getMOtaListener().onError(-1, "");
                } else {
                    this.this$0.getMOtaListener().onComplete();
                    this.this$0.reset();
                }
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onStart(String did2) {
                Intrinsics.checkNotNullParameter(did2, "did");
            }

            @Override // com.xiaomi.fitness.device.contact.export.SyncStateListener
            public void onSyncing(String did2, int progress) {
                Intrinsics.checkNotNullParameter(did2, "did");
                this.this$0.getMOtaListener().onProgress(progress);
            }
        });
        if (iSendFile != -1) {
            this.massId = iSendFile;
        }
        Logger.i(TAG, "sendOtaFile() called " + this.massId);
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
        Logger.i(TAG, "stop() called " + this.massId);
        DeviceSyncExtKt.getInstance(DeviceContact.INSTANCE).cancelTask(this.massId);
        WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
        if (wearableDeviceModel != null) {
            SilentUpgradeExtKt.pauseMass(wearableDeviceModel);
        }
    }
}
