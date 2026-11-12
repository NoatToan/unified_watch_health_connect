package com.xiaomi.fitness.devicesettings.huami.handler;

import com.huami.bluetooth.profile.channel.module.settings.entity.health.Health;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.miui.circulate.device.api.Constant;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.settingitem.DeviceSettingConfigKey;
import com.xiaomi.fitness.settingitem.DeviceSettingManager;
import com.xiaomi.fitness.settingitem.settingitem.SedentaryConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nJ\u001f\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\f*\u0002H\f2\u0006\u0010\r\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/huami/handler/AlertStandHealthSettingChangeHandler;", "", "<init>", "()V", "TAG", "", "handleSettingChanged", "", "did", Constant.DeviceCategory.HEALTH, "Lcom/huami/bluetooth/profile/channel/module/settings/entity/health/Health;", "withLog", "T", "msg", "(Ljava/lang/Object;Ljava/lang/String;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AlertStandHealthSettingChangeHandler {

    @NotNull
    public static final AlertStandHealthSettingChangeHandler INSTANCE = new AlertStandHealthSettingChangeHandler();

    @NotNull
    public static final String TAG = "AlertStandHealthSettingChangeHandler";

    private AlertStandHealthSettingChangeHandler() {
    }

    private final <T> void withLog(T t, String str) {
        Logger.i(TAG, str);
    }

    public final synchronized void handleSettingChanged(@NotNull String did, @NotNull Health health) {
        List<SedentaryConfig.MiddayRest> list;
        List<SedentaryConfig.MiddayRest> list2;
        List<SedentaryConfig.MiddayRest> list3;
        Intrinsics.checkNotNullParameter(did, "did");
        Intrinsics.checkNotNullParameter(health, "health");
        Logger.i(TAG, "AlertStandHealthSettingChangeHandler " + did);
        DeviceSettingManager.Companion companion = DeviceSettingManager.INSTANCE;
        Object objValueToObject = companion.getInstance().readSettingItem(did, DeviceSettingConfigKey.KEY_SEDENTARY_REMIND).valueToObject(SedentaryConfig.class);
        SedentaryConfig sedentaryConfig = objValueToObject instanceof SedentaryConfig ? (SedentaryConfig) objValueToObject : null;
        if (sedentaryConfig == null) {
            return;
        }
        Boolean standUpRemindSwitch = health.getStandUpRemindSwitch();
        if (standUpRemindSwitch != null) {
            sedentaryConfig.enable = standUpRemindSwitch.booleanValue();
        }
        Time standUpRemindStartTime = health.getStandUpRemindStartTime();
        if (standUpRemindStartTime != null) {
            sedentaryConfig.workSt = (standUpRemindStartTime.getHour() * 60) + standUpRemindStartTime.getMinute();
        }
        Time standUpRemindStopTime = health.getStandUpRemindStopTime();
        if (standUpRemindStopTime != null) {
            sedentaryConfig.workEd = (standUpRemindStopTime.getHour() * 60) + standUpRemindStopTime.getMinute();
        }
        Boolean middyRestDndSwitch = health.getMiddyRestDndSwitch();
        if (middyRestDndSwitch != null) {
            boolean zBooleanValue = middyRestDndSwitch.booleanValue();
            List<SedentaryConfig.MiddayRest> list4 = sedentaryConfig.middayRest;
            List<SedentaryConfig.MiddayRest> list5 = list4;
            if (list5 == null || list5.isEmpty()) {
                list3 = list4;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new SedentaryConfig.MiddayRest());
                list3 = arrayList;
            }
            list3 = list4;
            list3.get(0).enable = zBooleanValue;
            sedentaryConfig.middayRest = list3;
        }
        Time middyRestStartTime = health.getMiddyRestStartTime();
        if (middyRestStartTime != null) {
            List<SedentaryConfig.MiddayRest> list6 = sedentaryConfig.middayRest;
            List<SedentaryConfig.MiddayRest> list7 = list6;
            if (list7 == null || list7.isEmpty()) {
                list2 = list6;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new SedentaryConfig.MiddayRest());
                list2 = arrayList2;
            }
            list2 = list6;
            list2.get(0).start = (middyRestStartTime.getHour() * 60) + middyRestStartTime.getMinute();
            sedentaryConfig.middayRest = list2;
        }
        Time middyRestStopTime = health.getMiddyRestStopTime();
        if (middyRestStopTime != null) {
            List<SedentaryConfig.MiddayRest> list8 = sedentaryConfig.middayRest;
            List<SedentaryConfig.MiddayRest> list9 = list8;
            if (list9 == null || list9.isEmpty()) {
                list = list8;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new SedentaryConfig.MiddayRest());
                list = arrayList3;
            }
            list = list8;
            list.get(0).stop = (middyRestStopTime.getHour() * 60) + middyRestStopTime.getMinute();
            sedentaryConfig.middayRest = list;
        }
        companion.getInstance().sendSettingItem(did, DeviceSettingConfigKey.KE_HRDETECT, sedentaryConfig);
    }
}
