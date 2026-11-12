package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.WearingWay;
import com.huami.bluetooth.profile.channel.module.settings.entity.wearingway.v2.WearingWayV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J/\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/repo/WearModeRepoV2;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/wearmode/repo/IWearModeRepo;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "getDtoWithWearLocation", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "wearingWay", "", "directionValue", "updateWearWay", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/WearingWay;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class WearModeRepoV2 implements IWearModeRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002`\u0003H\n"}, d2 = {"Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<HashMap<SettingsGroupType, Settings>, Unit> {
        public final /* synthetic */ Function1<WearingWayV2, Unit> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super WearingWayV2, Unit> function1) {
            super(1);
            this.a = function1;
        }

        public final void a(@NotNull HashMap<SettingsGroupType, Settings> map) {
            SettingsGroupType settingsGroupType = SettingsGroupType.WEARING;
            WearingWayV2 wearingWayV2 = new WearingWayV2();
            this.a.invoke(wearingWayV2);
            map.put(settingsGroupType, wearingWayV2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HashMap<SettingsGroupType, Settings> map) {
            a(map);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/wearingway/v2/WearingWayV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<WearingWayV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull WearingWayV2 wearingWayV2) {
            wearingWayV2.setWearingWay(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WearingWayV2 wearingWayV2) {
            a(wearingWayV2);
            return Unit.INSTANCE;
        }
    }

    private final HashMap<SettingsGroupType, Settings> a(Function1<? super WearingWayV2, Unit> action) {
        return WatchSettingExtsKt.getSettings(new a(action));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo.IWearModeRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithWearLocation(@NotNull EnumData enumData) {
        return a(new b(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.wearmode.repo.IWearModeRepo
    @Nullable
    public WearingWay updateWearWay(@Nullable WearingWay wearingWay, @Nullable EnumData enumData, @Nullable Integer directionValue) {
        if (!(wearingWay instanceof WearingWayV2)) {
            return null;
        }
        if (enumData != null) {
            ((WearingWayV2) wearingWay).setWearingWay(enumData);
        }
        if (directionValue != null) {
            int iIntValue = directionValue.intValue();
            EnumData wearingDirection = ((WearingWayV2) wearingWay).getWearingDirection();
            if (wearingDirection != null) {
                wearingDirection.setValue(iIntValue);
            }
        }
        return wearingWay;
    }
}
