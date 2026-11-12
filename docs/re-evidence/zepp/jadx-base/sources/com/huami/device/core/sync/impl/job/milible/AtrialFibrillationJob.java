package com.huami.device.core.sync.impl.job.milible;

import com.huami.device.core.sync.api.exception.DeviceConnectException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.impl.job.milible.callback.af.AfCallback;
import com.huami.device.core.sync.impl.job.milible.callback.af.AfRawDataCallback;
import com.huami.device.core.sync.impl.job.milible.type.AtrialFibrillationType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmAfData;
import com.xiaomi.hm.health.bt.profile.gdsp.raw.HmGdspRawData;
import java.util.Calendar;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0016\u0010\u0013\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H&R\u001d\u0010\u0019\u001a\u00020\u00148D@\u0004X\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/huami/device/core/sync/impl/job/milible/AtrialFibrillationJob;", "Lcom/huami/device/core/sync/impl/job/milible/BaseJob;", "", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmAfData;", "syncAf", "Lcom/xiaomi/hm/health/bt/profile/gdsp/raw/HmGdspRawData;", "syncAfAcc", "syncAfPPG", "syncAfPPGRR", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "start", "Ljava/util/Calendar;", "loadStartTime", "outData", "onDataOut", "Lcom/huami/device/core/sync/impl/job/milible/type/AtrialFibrillationType;", "type", "onAfDataOut", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "proDevice$delegate", "Lkotlin/Lazy;", "getProDevice", "()Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "proDevice", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
@ExperimentalCoroutinesApi
public abstract class AtrialFibrillationJob extends BaseJob<List<? extends HmAfData>> {

    /* JADX INFO: renamed from: proDevice$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy proDevice = LazyKt__LazyJVMKt.lazy(new Function0<HMMiLiProDevice>() { // from class: com.huami.device.core.sync.impl.job.milible.AtrialFibrillationJob$proDevice$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final HMMiLiProDevice getA() {
            return this.this$0.loadProDevice();
        }
    });

    private final List<HmAfData> syncAf() {
        AtrialFibrillationType atrialFibrillationType = AtrialFibrillationType.AF;
        AfCallback afCallback = new AfCallback(atrialFibrillationType);
        getProDevice().startSyncRawData(loadStartTime(atrialFibrillationType), afCallback);
        return afCallback.loadOutData(maxTime());
    }

    private final List<HmGdspRawData> syncAfAcc() {
        AtrialFibrillationType atrialFibrillationType = AtrialFibrillationType.AF_ACC;
        AfRawDataCallback afRawDataCallback = new AfRawDataCallback(atrialFibrillationType);
        getProDevice().startSyncRawData(loadStartTime(atrialFibrillationType), 30, afRawDataCallback);
        return afRawDataCallback.loadOutData(maxTime());
    }

    private final List<HmGdspRawData> syncAfPPG() {
        AtrialFibrillationType atrialFibrillationType = AtrialFibrillationType.AF_PPG;
        AfRawDataCallback afRawDataCallback = new AfRawDataCallback(atrialFibrillationType);
        getProDevice().startSyncRawData(loadStartTime(atrialFibrillationType), 11, afRawDataCallback);
        return afRawDataCallback.loadOutData(maxTime());
    }

    private final List<HmGdspRawData> syncAfPPGRR() {
        AtrialFibrillationType atrialFibrillationType = AtrialFibrillationType.PPG_RR;
        AfRawDataCallback afRawDataCallback = new AfRawDataCallback(atrialFibrillationType);
        getProDevice().startSyncRawData(loadStartTime(atrialFibrillationType), 8, afRawDataCallback);
        return afRawDataCallback.loadOutData(maxTime());
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getAF();
    }

    @NotNull
    public final HMMiLiProDevice getProDevice() {
        return (HMMiLiProDevice) this.proDevice.getValue();
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    @NotNull
    public final Calendar loadStartTime() {
        return Calendar.getInstance();
    }

    @NotNull
    public abstract Calendar loadStartTime(@NotNull AtrialFibrillationType type);

    public abstract void onAfDataOut(@NotNull AtrialFibrillationType type, @NotNull List<HmGdspRawData> outData);

    public abstract void onAfDataOut(@NotNull List<? extends HmAfData> outData);

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob
    public void onDataOut(@NotNull List<? extends HmAfData> outData) {
    }

    @Override // com.huami.device.core.sync.impl.job.milible.BaseJob, com.huami.device.core.sync.api.type.SyncJob
    public void start() throws DeviceConnectException {
        super.start();
        sendStatus(createProgress(1));
        try {
            onAfDataOut(syncAf());
            sendStatus(createProgress(20));
            onAfDataOut(AtrialFibrillationType.AF_ACC, syncAfAcc());
            sendStatus(createProgress(40));
            onAfDataOut(AtrialFibrillationType.AF_PPG, syncAfPPG());
            sendStatus(createProgress(60));
            onAfDataOut(AtrialFibrillationType.PPG_RR, syncAfPPGRR());
            sendStatus(createProgress(80));
        } catch (Exception e) {
            onError(e);
            sendStatus(BaseJob.createErrorProgress$default(this, e, 0, 2, null));
        }
        sendStatus(createProgress(100));
    }
}
