package com.xiaomi.hm.health.ui.smartplay.alarm;

import androidx.annotation.WorkerThread;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmVersionInfo;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u0010\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bH'J\u001a\u0010\u000e\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH'J\u001a\u0010\u000f\u001a\u00020\u000b2\u0010\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000b0\nj\u0002`\fH&J\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0010H§@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/alarm/IAlarmDevice;", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "alarm", "", "addAlarm", "deleteAlarm", "updateAlarm", "", "queryAlarm", "Lkotlin/Function0;", "", "Lcom/xiaomi/hm/health/ui/smartplay/alarm/AlarmChangeListener;", "alarmChangeListener", "registerChangeListener", "unRegisterChangeListener", "Lcom/huami/bluetooth/profile/channel/module/alarm/AlarmVersionInfo;", "queryVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IAlarmDevice {
    @WorkerThread
    boolean addAlarm(@NotNull AlarmClockExt alarm);

    @WorkerThread
    boolean deleteAlarm(@NotNull AlarmClockExt alarm);

    @WorkerThread
    @Nullable
    List<AlarmClockExt> queryAlarm();

    @WorkerThread
    @Nullable
    Object queryVersion(@NotNull Continuation<? super AlarmVersionInfo> continuation);

    @WorkerThread
    void registerChangeListener(@NotNull Function0<Unit> alarmChangeListener);

    void unRegisterChangeListener(@NotNull Function0<Unit> alarmChangeListener);

    @WorkerThread
    boolean updateAlarm(@NotNull AlarmClockExt alarm);
}
