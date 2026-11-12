package com.xiaomi.hm.health.bt.profile.mili.model;

import com.huami.bluetooth.profile.channel.module.syncable.DeviceDataRecover;
import com.huami.bluetooth.profile.ecf.data.ActivityGoal;
import com.huami.bluetooth.profile.ecf.data.HRZone;
import com.huami.bluetooth.profile.ecf.data.LiftWristTouch;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.bluetooth.profile.ecf.data.Touchscreen;
import com.xiaomi.hm.health.bt.model.CincoEntrance;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMColorTheme;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.model.HMDisplayType;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMNegativeScreen;
import com.xiaomi.hm.health.bt.model.HMOffWistLockConfig;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import com.xiaomi.hm.health.bt.model.UserInfoExt;
import com.xiaomi.hm.health.bt.profile.beep.BeepItem;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.bt.profile.user.LocationExt;
import com.xiaomi.hm.health.bt.profile.usernew.WeightUnit;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class MiLiHwConfig {
    public List<ActivityGoal> activityGoals;
    public HMAutoBacklightInfo backNightInfo;
    public DisplaySetting displaySetting;
    public HRZone hrZone;
    public LiftWristTouch liftWristTouch;
    public Boolean messagePreview;
    public NowTimeConfig nowTimeConfig;
    public Boolean sportHRCheckEnable;
    public Touchscreen touchscreen;
    public boolean enable = false;
    public WeightUnit weightUnit = null;
    public int goals = 8000;
    public Integer calorieGoal = null;
    public Integer weightGoal = null;
    public Integer sleepGoal = null;
    public List<AlarmClockExt> alarms = new ArrayList();
    public int color = HMColorTheme.Color.BLUE.getValue();
    public LocationExt location = new LocationExt(LocationExt.Wear.WRIST, LocationExt.Way.LEFT);
    public boolean enableConnectedBtAdv = false;
    public boolean assistSleep = false;
    public int baseStep = 0;
    public UserInfoExt userInfoExt = null;
    public boolean isMetric = true;
    public boolean is12Hour = false;
    public HMDisplayType displayType = HMDisplayType.ONLY_TIME;
    public boolean showSms = true;
    public boolean showIncall = true;
    public HMProDisplayItem displayItem = new HMProDisplayItem((byte) 9);
    public HMSedentaryConfig sedentaryConfig = null;
    public StandAlertConfig standAlertConfig = null;
    public HMSilentConfig silentConfig = null;
    public HMLiftWristConfig liftWristConfig = null;
    public Integer liftWristSensitivity = null;
    public boolean goalRemind = true;
    public int recordStep = 0;
    public boolean filpWrist = false;
    public Boolean sportHrBroadcast = null;
    public Boolean avoidSpiteBinding = null;
    public List<PageItem> appSortInfo = null;
    public HMDisconnectRemindConfig disconnectRemindConfig = null;
    public int hrType = 1;
    public boolean hrEnable = false;
    public boolean hrSleepEnable = false;
    public boolean atrialFibEnable = false;
    public int hrInterval = -1;
    public HMNegativeScreen negativeScreen = null;
    public List<HMReminderInfo> reminderInfos = null;
    public Boolean enableLockScreen = null;
    public List<HMDisplayData> displayDataList = null;
    public List<PageItem> displayPageDataList = null;
    private HMHrReminder a = null;
    public String dateFormat = null;
    public HMOffWistLockConfig offWistLockConfig = null;
    public List<HMVibrateInfo> vibrateInfos = null;
    public Boolean enableMultiLink = null;
    public Byte calendar = null;
    public Byte startDayOfWeek = null;
    public CincoEntrance cincoEntrance = null;
    public List<WorldTime> worldTimes = null;
    public List<BeepItem> beepItems = null;
    public long nbIotEndTime = -1;
    private Set<DeviceDataRecover> b = new HashSet();
    public int standTarget = 12;
    public int activityTarget = 30;
    public int activityMode = -1;

    @NotNull
    private String a() {
        StringBuilder sb = new StringBuilder("");
        Iterator<DeviceDataRecover> it2 = this.b.iterator();
        while (it2.hasNext()) {
            sb.append("\n<%>".replace("%", it2.next().getClass().getSimpleName()));
        }
        sb.append("\n");
        return sb.toString();
    }

    public void addRecoverItem(DeviceDataRecover item) {
        this.b.add(item);
    }

    public HMHrReminder getHrReminder() {
        return this.a;
    }

    public Set<DeviceDataRecover> getSyncMapFactory() {
        return this.b;
    }

    public void setHrReminder(HMHrReminder reminder) {
        this.a = reminder;
    }

    public String toString() {
        return "MiLiHwConfig{enable=" + this.enable + ", goals=" + this.goals + ", goals=" + Arrays.toString(this.activityGoals.toArray()) + ", alarms=" + this.alarms + ", color=" + this.color + ", location=" + this.location + ", enableConnectedBtAdv=" + this.enableConnectedBtAdv + ", assistSleep=" + this.assistSleep + ", baseStep=" + this.baseStep + ", userInfoExt=" + this.userInfoExt + ", isMetric=" + this.isMetric + ", is12Hour=" + this.is12Hour + ", displayType=" + this.displayType + ", showSms=" + this.showSms + ", showIncall=" + this.showIncall + ", displayItem=" + this.displayItem + ", sedentaryConfig=" + this.sedentaryConfig + ", standAlertConfig=" + this.standAlertConfig + ", silentConfig=" + this.silentConfig + ", liftWristConfig=" + this.liftWristConfig + ", goalRemind=" + this.goalRemind + ", recordStep=" + this.recordStep + ", filpWrist=" + this.filpWrist + ", displaySetting=" + this.displaySetting + ", appSortInfo=" + this.appSortInfo + ", disconnectRemindConfig=" + this.disconnectRemindConfig + ", negativeScreen=" + this.negativeScreen + ", dateFormat=" + this.dateFormat + ", sportHRCheckEnable=" + this.sportHRCheckEnable + ", offWistLockEnable=" + this.offWistLockConfig + ", cincoEntrance=" + this.cincoEntrance + ", hrZone=" + this.hrZone + ", touchscreen=" + this.touchscreen + ", liftWristTouch=" + this.liftWristTouch + ", syncMap=" + a() + '}';
    }
}
