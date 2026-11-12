package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.device.setting.life.feature.inject.AlarmApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00070\u0004H\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmApiImpl;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/AlarmApi;", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "bleDevice", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "", "callback", "queryAlarmAsync", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmApiImpl implements AlarmApi {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.AlarmApi
    public void queryAlarmAsync(@NotNull HMMiLiDevice bleDevice, @NotNull final Function1<? super List<? extends AlarmClockExt>, Unit> callback) {
        new AlarmCompactDevice(bleDevice).queryAlarmAsync(new IAlarmCallback<List<? extends AlarmClockExt>>() { // from class: com.xiaomi.hm.health.ui.smartplay.alarm.AlarmApiImpl.queryAlarmAsync.1
            @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmCallback
            public void onResult(@Nullable List<? extends AlarmClockExt> result) {
                callback.invoke(result);
            }
        });
    }
}
