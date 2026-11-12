package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo;

import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J,\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\f\u001a\u00020\u000bH&JK\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/repo/IOfflineVoiceRepo;", "", "", "enable", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "getDtoWithActiveDuringScreenOnSwitch", "getDtoWithActiveWithIn5SWhenScreenOnSwitch", "getDtoWithActiveWithIn5SByTurningWristSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "getDtoWithLanguage", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "dto", "activeWithIn5SByTurningWristSwitch", "activeWithIn5SWhenScreenOnSwitch", "activeDuringScreenOnSwitch", "", UserLegalInfoManager.KEY_LANGUAGE, "updateOfflineVoiceWakeUp", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IOfflineVoiceRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ OfflineVoice updateOfflineVoiceWakeUp$default(IOfflineVoiceRepo iOfflineVoiceRepo, OfflineVoice offlineVoice, Boolean bool, Boolean bool2, Boolean bool3, Integer num, int i, Object obj) {
            if (obj == null) {
                return iOfflineVoiceRepo.updateOfflineVoiceWakeUp(offlineVoice, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : num);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateOfflineVoiceWakeUp");
        }
    }

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithActiveDuringScreenOnSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithActiveWithIn5SByTurningWristSwitch(boolean enable);

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithActiveWithIn5SWhenScreenOnSwitch(boolean enable);

    @NotNull
    /* JADX INFO: renamed from: getDtoWithLanguage */
    HashMap<SettingsGroupType, Settings> mo3446getDtoWithLanguage(@NotNull EnumData enumData);

    @Nullable
    OfflineVoice updateOfflineVoiceWakeUp(@Nullable OfflineVoice dto, @Nullable Boolean activeWithIn5SByTurningWristSwitch, @Nullable Boolean activeWithIn5SWhenScreenOnSwitch, @Nullable Boolean activeDuringScreenOnSwitch, @Nullable Integer language);
}
