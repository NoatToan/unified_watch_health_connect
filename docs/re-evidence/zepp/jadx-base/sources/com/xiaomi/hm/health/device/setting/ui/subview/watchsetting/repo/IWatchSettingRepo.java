package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.screenlock.ScreenLockAndPassword;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v1.SoundAndVibrateV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JK\u0010\n\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0018\u0001`\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/repo/IWatchSettingRepo;", "", "", "needDesc", "", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "groupType", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "querySettings", "(Z[Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "queryOfflineVoiceV1", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "queryDisplayBrightnessV1", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/screenlock/ScreenLockAndPassword;", "queryScreenUnlockAndPassword", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v1/SoundAndVibrateV1;", "querySoundVibrateV1", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IWatchSettingRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object querySettings$default(IWatchSettingRepo iWatchSettingRepo, boolean z, SettingsGroupType[] settingsGroupTypeArr, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: querySettings");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return iWatchSettingRepo.querySettings(z, settingsGroupTypeArr, continuation);
        }
    }

    @Nullable
    Object queryDisplayBrightnessV1(boolean z, @NotNull Continuation<? super DisplayAndBrightness> continuation);

    @Nullable
    Object queryOfflineVoiceV1(boolean z, @NotNull Continuation<? super OfflineVoice> continuation);

    @Nullable
    Object queryScreenUnlockAndPassword(boolean z, @NotNull Continuation<? super ScreenLockAndPassword> continuation);

    @Nullable
    Object querySettings(boolean z, @NotNull SettingsGroupType[] settingsGroupTypeArr, @NotNull Continuation<? super HashMap<SettingsGroupType, Settings>> continuation);

    @Nullable
    Object querySoundVibrateV1(boolean z, @NotNull Continuation<? super SoundAndVibrateV1> continuation);
}
