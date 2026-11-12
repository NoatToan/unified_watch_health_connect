package com.xiaomi.hm.health.bt.sdk;

import android.util.SparseBooleanArray;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.profile.amc.HMMusicControl;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public interface ILFEventCallback extends Serializable {
    public static final long serialVersionUID = 1;

    void endCall();

    void ignoreCall();

    void illegalBind();

    void onAlarmCancel();

    void onAlarmChange(ArrayList<AlarmClockExt> arrayList);

    void onAlarmDelay();

    void onAllDayPressureChange(boolean z);

    void onAtrialFibChanged(boolean z);

    void onFindPhone(boolean z);

    void onHrDetectionInterval(int i);

    void onHrOpen();

    void onMusicControl(HMMusicControl.DeviceCommand deviceCommand);

    void onNotificationDelete(int i);

    void onReminderChange(ArrayList<HMReminderInfo> arrayList);

    void onSettingsChange(SparseBooleanArray sparseBooleanArray);

    void onSportStart(boolean z);

    void onSportStop();

    void phoneMuteMode();

    Boolean phoneMuteState();

    void phoneNormalMode();
}
