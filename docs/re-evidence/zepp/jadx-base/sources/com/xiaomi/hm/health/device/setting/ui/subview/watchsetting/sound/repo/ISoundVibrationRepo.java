package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\n\u001a\u00020\tH&J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u000f\u001a\u00020\tH&J,\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0012\u001a\u00020\u0011H&J,\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&J,\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\r\u001a\u00020\fH&Jc\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/repo/ISoundVibrationRepo;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "scenes", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "getBuzzerScenes", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "strength", "getBuzzerVibrateStrength", "", "enable", "getDtoWithNotificationVibrationSwitch", "enumData", "getDtoWithNotificationVibrationStrength", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "value", "getDtoWithVolume", "getDtoWithRemindSwitch", "getDtoWithSystemVibrationSwitch", "getDtoWithCrownVibrationSwitch", "getDtoWithCoverScreenMutingSwitch", "getDtoWithVibrationFeedbackSwitch", "getDtoWithVoiceBroadcast", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "soundAndVibrate", "muteSwitch", "volume", "notificationVibrationSwitch", "notificationVibrationStrength", "systemVibrationSwitch", "crownVibrationSwitch", "updateSoundVibrationCache", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface ISoundVibrationRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ SoundAndVibrate updateSoundVibrationCache$default(ISoundVibrationRepo iSoundVibrationRepo, SoundAndVibrate soundAndVibrate, Boolean bool, IntData intData, Boolean bool2, EnumData enumData, Boolean bool3, Boolean bool4, int i, Object obj) {
            if (obj == null) {
                return iSoundVibrationRepo.updateSoundVibrationCache(soundAndVibrate, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : intData, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : enumData, (i & 32) != 0 ? null : bool3, (i & 64) == 0 ? bool4 : null);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateSoundVibrationCache");
        }
    }

    @NotNull
    HashMap<SettingsGroupType, Settings> getBuzzerScenes(@NotNull EnumArray scenes);

    @NotNull
    HashMap<SettingsGroupType, Settings> getBuzzerVibrateStrength(@NotNull EnumData strength);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithCoverScreenMutingSwitch */
    HashMap<SettingsGroupType, Settings> mo3444getDtoWithCoverScreenMutingSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithCrownVibrationSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithNotificationVibrationStrength(@NotNull EnumData enumData);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithNotificationVibrationSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithRemindSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithSystemVibrationSwitch(boolean enable);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithVibrationFeedbackSwitch */
    HashMap<SettingsGroupType, Settings> mo3445getDtoWithVibrationFeedbackSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithVoiceBroadcast(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithVolume(@NotNull IntData value);

    @Nullable
    SoundAndVibrate updateSoundVibrationCache(@Nullable SoundAndVibrate soundAndVibrate, @Nullable Boolean muteSwitch, @Nullable IntData volume, @Nullable Boolean notificationVibrationSwitch, @Nullable EnumData notificationVibrationStrength, @Nullable Boolean systemVibrationSwitch, @Nullable Boolean crownVibrationSwitch);
}
