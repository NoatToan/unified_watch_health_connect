package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\n\u001a\u00020\tH&J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u000f\u001a\u00020\u0002H&J,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u000f\u001a\u00020\u0002H&J,\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0015\u001a\u00020\u0014H&J4\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H&J,\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u000f\u001a\u00020\u0002H&JT\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\fH&JÏ\u0001\u0010.\u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b.\u0010/¨\u00060"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/IDisplayBrightnessRepo;", "", "", "isChecked", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "getDtoWithAutoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "intData", "getDtoWithBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "getDtoWithScreenOffTime", "enable", "getDtoWithScreenOnByNewNotificationSwitch", "getDtoWithScreenOnDuringSportSwitch", "getDtoWithScreenOnByTurningWristMode", "getDtoWithScreenOnByTurningWristActiveSpeed", "", "style", "getDtoWithScreenOffDialId", "isBegin", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "getDtoWithScreenOnByTurningWristBeginOrEndTime", "getDtoWithScreenOffFollowCurrentDialSwitch", "screenOffDisplayMode", "screenOffDisplayBeginTime", "screenOffDisplayEndTime", "screenOffDialPlateType", "getDtoWithInterestSetting", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", LargeWatchSkinActivity.KEY_BEAN, "autoBrightness", "brightness", "screenOffTime", "screenOnByTurningWristMode", "screenOnByTurningWristBeginTime", "screenOnByTurningWristEndTime", "screenOnByTurningWristActiveSpeed", "screenOnByNewNotificationSwitch", "screenOnDuringSportSwitch", "screenOffFollowCurrentDialSwitch", "screenOffDialId", "updateDto", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IDisplayBrightnessRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ HashMap getDtoWithInterestSetting$default(IDisplayBrightnessRepo iDisplayBrightnessRepo, EnumData enumData, Time time, Time time2, EnumData enumData2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDtoWithInterestSetting");
            }
            if ((i & 1) != 0) {
                enumData = null;
            }
            if ((i & 2) != 0) {
                time = null;
            }
            if ((i & 4) != 0) {
                time2 = null;
            }
            if ((i & 8) != 0) {
                enumData2 = null;
            }
            return iDisplayBrightnessRepo.getDtoWithInterestSetting(enumData, time, time2, enumData2);
        }

        public static /* synthetic */ DisplayAndBrightness updateDto$default(IDisplayBrightnessRepo iDisplayBrightnessRepo, DisplayAndBrightness displayAndBrightness, Boolean bool, IntData intData, EnumData enumData, EnumData enumData2, Time time, Time time2, EnumData enumData3, EnumData enumData4, Time time3, Time time4, EnumData enumData5, Boolean bool2, Boolean bool3, Boolean bool4, String str, int i, Object obj) {
            if (obj == null) {
                return iDisplayBrightnessRepo.updateDto(displayAndBrightness, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : intData, (i & 8) != 0 ? null : enumData, (i & 16) != 0 ? null : enumData2, (i & 32) != 0 ? null : time, (i & 64) != 0 ? null : time2, (i & 128) != 0 ? null : enumData3, (i & 256) != 0 ? null : enumData4, (i & 512) != 0 ? null : time3, (i & 1024) != 0 ? null : time4, (i & 2048) != 0 ? null : enumData5, (i & 4096) != 0 ? null : bool2, (i & 8192) != 0 ? null : bool3, (i & 16384) != 0 ? null : bool4, (i & 32768) == 0 ? str : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDto");
        }
    }

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithAutoBrightness(boolean isChecked);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithBrightness(@NotNull IntData intData);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithInterestSetting(@Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOffDialId */
    HashMap<SettingsGroupType, Settings> mo3440getDtoWithScreenOffDialId(@NotNull String style);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOffFollowCurrentDialSwitch */
    HashMap<SettingsGroupType, Settings> mo3441getDtoWithScreenOffFollowCurrentDialSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithScreenOffTime(@NotNull EnumData enumData);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOnByNewNotificationSwitch */
    HashMap<SettingsGroupType, Settings> mo3442getDtoWithScreenOnByNewNotificationSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristActiveSpeed(@NotNull EnumData enumData);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristBeginOrEndTime(boolean isBegin, @NotNull Time time);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristMode(@NotNull EnumData enumData);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOnDuringSportSwitch */
    HashMap<SettingsGroupType, Settings> mo3443getDtoWithScreenOnDuringSportSwitch(boolean enable);

    @Nullable
    DisplayAndBrightness updateDto(@Nullable DisplayAndBrightness bean, @Nullable Boolean autoBrightness, @Nullable IntData brightness, @Nullable EnumData screenOffTime, @Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType, @Nullable EnumData screenOnByTurningWristMode, @Nullable Time screenOnByTurningWristBeginTime, @Nullable Time screenOnByTurningWristEndTime, @Nullable EnumData screenOnByTurningWristActiveSpeed, @Nullable Boolean screenOnByNewNotificationSwitch, @Nullable Boolean screenOnDuringSportSwitch, @Nullable Boolean screenOffFollowCurrentDialSwitch, @Nullable String screenOffDialId);
}
