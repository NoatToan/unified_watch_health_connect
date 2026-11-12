package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&J3\u0010\r\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/repo/IWearModeRepo;", "", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "getDtoWithWearLocation", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "wearingWay", "", "directionValue", "updateWearWay", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public interface IWearModeRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ WearingWay updateWearWay$default(IWearModeRepo iWearModeRepo, WearingWay wearingWay, EnumData enumData, Integer num, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateWearWay");
            }
            if ((i & 2) != 0) {
                enumData = null;
            }
            if ((i & 4) != 0) {
                num = null;
            }
            return iWearModeRepo.updateWearWay(wearingWay, enumData, num);
        }
    }

    @NotNull
    HashMap<SettingsGroupType, Settings> getDtoWithWearLocation(@NotNull EnumData enumData);

    @Nullable
    WearingWay updateWearWay(@Nullable WearingWay wearingWay, @Nullable EnumData enumData, @Nullable Integer directionValue);
}
