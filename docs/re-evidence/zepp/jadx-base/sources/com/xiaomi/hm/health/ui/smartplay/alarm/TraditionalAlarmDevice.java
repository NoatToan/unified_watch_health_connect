package com.xiaomi.hm.health.ui.smartplay.alarm;

import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016J\u001a\u0010\u0010\u001a\u00020\f2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\rH\u0016J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/TraditionalAlarmDevice;", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarm", "", "a", "addAlarm", "deleteAlarm", "updateAlarm", "", "queryAlarm", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmChangeListener;", "alarmChangeListener", "registerChangeListener", "unRegisterChangeListener", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "<init>", "(Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class TraditionalAlarmDevice implements IAlarmDevice {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HMBaseDevice device;

    public TraditionalAlarmDevice(@NotNull HMBaseDevice hMBaseDevice) {
        this.device = hMBaseDevice;
    }

    private final boolean a(AlarmClockExt alarm) {
        if (this.device.isConnected()) {
            HMBaseDevice hMBaseDevice = this.device;
            if (hMBaseDevice instanceof HMMiLiDevice) {
                return ((HMMiLiDevice) hMBaseDevice).setAlarmSync(e.listOf(alarm));
            }
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean addAlarm(@NotNull AlarmClockExt alarm) {
        return a(alarm);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean deleteAlarm(@NotNull AlarmClockExt alarm) {
        return a(alarm);
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public List<AlarmClockExt> queryAlarm() {
        HMBaseDevice hMBaseDevice = this.device;
        if ((hMBaseDevice instanceof HMMiLiProDevice) && ((HMMiLiProDevice) hMBaseDevice).isConnected()) {
            return ((HMMiLiProDevice) this.device).getAlarmsSync();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    @Nullable
    public Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation) {
        return null;
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void registerChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public void unRegisterChangeListener(@NotNull Function0<Unit> alarmChangeListener) {
    }

    @Override // com.xiaomi.hm.health.ui.smartplay.alarm.IAlarmDevice
    public boolean updateAlarm(@NotNull AlarmClockExt alarm) {
        return a(alarm);
    }
}
