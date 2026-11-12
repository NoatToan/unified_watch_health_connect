package com.xiaomi.hm.health.device.feature.sync;

import com.huami.bluetooth.profile.channel.module.MenstruationModule;
import com.huami.device.core.sync.api.exception.SyncException;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.helper.FemaleHealthScopeNames;
import com.huami.femalehealth.logiclib.repo.SettingRepo;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationConfigCallback;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationDeviceConfigCallback;
import com.xiaomi.hm.health.device.feature.sync.job.mili.data.MenstruationTotalRecordCallback;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/SyncMenstruation;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "", "start", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SyncMenstruation implements SyncJob, KoinComponent {

    @NotNull
    private final HMMiLiProDevice device;

    public SyncMenstruation(@NotNull HMMiLiProDevice hMMiLiProDevice) {
        this.device = hMMiLiProDevice;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return JobType.INSTANCE.getFEMALE_HEALTH();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return 60000L;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() {
        final Scope scopeOrNull = getKoin().getScopeOrNull(FemaleHealthScopeNames.FEMALE_HEALTH);
        if (scopeOrNull == null) {
            throw new SyncException("初始化女性健康出错", null, 0, 6, null);
        }
        MenstruationDataManager menstruationDataManager = (MenstruationDataManager) scopeOrNull.get(Reflection.getOrCreateKotlinClass(MenstruationDataManager.class), null, null);
        menstruationDataManager.updateFemaleDataSyncTime(Calendar.getInstance());
        MenstruationModule menstruationModule = (MenstruationModule) this.device.getChannelModule(MenstruationModule.class);
        if (menstruationModule == null) {
            throw new SyncException("女性健康通信模块创建失败", null, 0, 6, null);
        }
        MenstruationConfigCallback menstruationConfigCallback = new MenstruationConfigCallback(this.device, menstruationDataManager);
        this.device.getMenstruationConfig(menstruationConfigCallback);
        menstruationConfigCallback.waiteForFinished();
        MenstruationTotalRecordCallback menstruationTotalRecordCallback = new MenstruationTotalRecordCallback();
        menstruationModule.getMenstruationTotalRecord(menstruationTotalRecordCallback);
        menstruationDataManager.addDataFromDevice(menstruationTotalRecordCallback.waiteForResult());
        menstruationModule.setDataChangeListener(new Function0<Unit>() { // from class: com.xiaomi.hm.health.device.feature.sync.SyncMenstruation.start.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.device.getMenstruationConfig(new MenstruationDeviceConfigCallback((SettingRepo) scopeOrNull.get(Reflection.getOrCreateKotlinClass(SettingRepo.class), null, null), this.device));
            }
        });
    }
}
