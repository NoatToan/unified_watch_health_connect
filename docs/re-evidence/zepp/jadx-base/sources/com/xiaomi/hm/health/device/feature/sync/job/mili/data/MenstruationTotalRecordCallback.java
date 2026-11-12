package com.xiaomi.hm.health.device.feature.sync.job.mili.data;

import android.os.ConditionVariable;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.event.EventDevSyncFemaleFinish;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationTotalRecord;
import com.xiaomi.hm.health.di.koin.female.FemaleExternalDeviceDataTransfer;
import de.greenrobot.event.EventBus;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/device/feature/sync/job/mili/data/MenstruationTotalRecordCallback;", "Lcom/xiaomi/hm/health/bt/device/HMCallback;", "Lcom/xiaomi/hm/health/bt/profile/menstruation/MenstruationTotalRecord;", "record", "", "onFinish", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "waiteForResult", "", "blockTimes", "J", "result", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "Landroid/os/ConditionVariable;", "resultCondition", "Landroid/os/ConditionVariable;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MenstruationTotalRecordCallback extends HMCallback<MenstruationTotalRecord> {
    private final long blockTimes = 3000;

    @Nullable
    private MenstruationTotalDto result;

    @NotNull
    private final ConditionVariable resultCondition;

    public MenstruationTotalRecordCallback() {
        ConditionVariable conditionVariable = new ConditionVariable(false);
        this.resultCondition = conditionVariable;
        conditionVariable.close();
    }

    @Nullable
    public final MenstruationTotalDto waiteForResult() {
        this.resultCondition.block(this.blockTimes);
        return this.result;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMCallback
    public void onFinish(@Nullable MenstruationTotalRecord record) {
        this.result = FemaleExternalDeviceDataTransfer.INSTANCE.convertTotalDtoForApp(record);
        this.resultCondition.open();
        EventBus.getDefault().post(new EventDevSyncFemaleFinish());
    }
}
