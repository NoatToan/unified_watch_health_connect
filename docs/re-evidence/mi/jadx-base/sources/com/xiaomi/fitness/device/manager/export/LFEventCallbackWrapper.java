package com.xiaomi.fitness.device.manager.export;

import android.os.RemoteException;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.wearable.hm.HuamiDataWrapper;
import com.xiaomi.wearable.hm.HuamiDataWrapperKt;
import com.xiaomi.wearable.hm.s;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010\u0011J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0007J\u001f\u0010\u0019\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0007J\u0017\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010\u0011J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0005H\u0016¢\u0006\u0004\b$\u0010\u0011J\u000f\u0010%\u001a\u00020\u0005H\u0016¢\u0006\u0004\b%\u0010\u0011¨\u0006'"}, d2 = {"Lcom/xiaomi/fitness/device/manager/export/LFEventCallbackWrapper;", "Lcom/xiaomi/wearable/hm/s$a;", "", "Lcom/xiaomi/wearable/hm/HuamiDataWrapper;", "var1", "", "onAlarmChangeInternal", "(Ljava/util/List;)V", "", "Lcom/xiaomi/hm/health/bt/profile/milipro/model/AlarmClockExt;", "onAlarmChange", "", "empty", "onSettingsChange", "(Z)V", "onSportStart", "onSportStop", "()V", "endCall", "ignoreCall", "phoneMuteMode", "phoneNormalMode", "illegalBind", "onReminderChangeInternal", "Lcom/xiaomi/hm/health/bt/model/HMReminderInfo;", "onReminderChange", "onFindPhone", "onMusicControlInternal", "(Lcom/xiaomi/wearable/hm/HuamiDataWrapper;)V", "Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;", "onMusicControl", "(Lcom/xiaomi/hm/health/bt/profile/amc/HMMusicControl$DeviceCommand;)V", "onHrOpen", "", "onNotificationDelete", "(I)V", "onAlarmDelay", "onAlarmCancel", "<init>", "device-manager-export_release"}, k = 1, mv = {2, 0, 0})
public abstract class LFEventCallbackWrapper extends s.a {
    @Override // com.xiaomi.wearable.hm.s
    public void endCall() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void ignoreCall() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void illegalBind() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onAlarmCancel() {
    }

    public void onAlarmChange(@Nullable List<? extends AlarmClockExt> var1) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onAlarmChangeInternal(@Nullable List<HuamiDataWrapper> var1) {
        onAlarmChange(HuamiDataWrapperKt.asData(var1));
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onAlarmDelay() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onFindPhone(boolean var1) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onHrOpen() {
    }

    public void onMusicControl(@Nullable HMMusicControl.DeviceCommand var1) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onMusicControlInternal(@Nullable HuamiDataWrapper var1) {
        onMusicControl((HMMusicControl.DeviceCommand) HuamiDataWrapperKt.asData(var1));
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onNotificationDelete(int var1) {
    }

    public void onReminderChange(@Nullable List<? extends HMReminderInfo> var1) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onReminderChangeInternal(@Nullable List<HuamiDataWrapper> var1) {
        onReminderChange(HuamiDataWrapperKt.asData(var1));
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onSettingsChange(boolean empty) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onSportStart(boolean var1) {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void onSportStop() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public void phoneMuteMode() {
    }

    @Override // com.xiaomi.wearable.hm.s
    public abstract /* synthetic */ void phoneMuteState() throws RemoteException;

    @Override // com.xiaomi.wearable.hm.s
    public void phoneNormalMode() {
    }
}
