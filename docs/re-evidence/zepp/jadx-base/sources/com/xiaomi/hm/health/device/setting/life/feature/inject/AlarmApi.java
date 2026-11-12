package com.xiaomi.hm.health.device.setting.life.feature.inject;

import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\b\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00070\u0004H&¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/life/feature/inject/AlarmApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMMiLiDevice;", "bleDevice", "Lkotlin/Function1;", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "", "callback", "queryAlarmAsync", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface AlarmApi {
    void queryAlarmAsync(@NotNull HMMiLiDevice bleDevice, @NotNull Function1<? super List<? extends AlarmClockExt>, Unit> callback);
}
