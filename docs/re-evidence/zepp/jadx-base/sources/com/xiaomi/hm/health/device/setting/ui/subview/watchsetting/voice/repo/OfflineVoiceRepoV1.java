package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo;

import com.huami.account.UserLegalInfoManager;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.OfflineVoice;
import com.huami.bluetooth.profile.channel.module.settings.entity.offlinevoice.v1.OfflineVoiceV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ=\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016JC\u0010\u001c\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/repo/OfflineVoiceRepoV1;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/repo/IOfflineVoiceRepo;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "a", "", "enable", "getDtoWithActiveDuringScreenOnSwitch", "getDtoWithActiveWithIn5SWhenScreenOnSwitch", "getDtoWithActiveWithIn5SByTurningWristSwitch", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "", "getDtoWithLanguage", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "dto", "activeWithIn5SByTurningWristSwitch", "activeWithIn5SWhenScreenOnSwitch", "activeDuringScreenOnSwitch", "", UserLegalInfoManager.KEY_LANGUAGE, "updateOfflineVoiceWakeUp", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/OfflineVoice;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceRepoV1 implements IOfflineVoiceRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<OfflineVoiceV1, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull OfflineVoiceV1 offlineVoiceV1) {
            offlineVoiceV1.setActiveDuringScreenOnSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OfflineVoiceV1 offlineVoiceV1) {
            a(offlineVoiceV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<OfflineVoiceV1, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull OfflineVoiceV1 offlineVoiceV1) {
            offlineVoiceV1.setActiveWithIn5SByTurningWristSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OfflineVoiceV1 offlineVoiceV1) {
            a(offlineVoiceV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/offlinevoice/v1/OfflineVoiceV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<OfflineVoiceV1, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull OfflineVoiceV1 offlineVoiceV1) {
            offlineVoiceV1.setActiveWithIn5SWhenScreenOnSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OfflineVoiceV1 offlineVoiceV1) {
            a(offlineVoiceV1);
            return Unit.INSTANCE;
        }
    }

    private final HashMap<SettingsGroupType, Settings> a(Function1<? super OfflineVoiceV1, Unit> action) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.OFFLINE_VOICE;
        OfflineVoiceV1 offlineVoiceV1 = new OfflineVoiceV1();
        action.invoke(offlineVoiceV1);
        map.put(settingsGroupType, offlineVoiceV1);
        return map;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithActiveDuringScreenOnSwitch(boolean enable) {
        return a(new a(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithActiveWithIn5SByTurningWristSwitch(boolean enable) {
        return a(new b(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithActiveWithIn5SWhenScreenOnSwitch(boolean enable) {
        return a(new c(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo
    /* JADX INFO: renamed from: getDtoWithLanguage, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ HashMap mo3446getDtoWithLanguage(EnumData enumData) {
        return (HashMap) getDtoWithLanguage(enumData);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice.repo.IOfflineVoiceRepo
    @Nullable
    public OfflineVoice updateOfflineVoiceWakeUp(@Nullable OfflineVoice dto, @Nullable Boolean activeWithIn5SByTurningWristSwitch, @Nullable Boolean activeWithIn5SWhenScreenOnSwitch, @Nullable Boolean activeDuringScreenOnSwitch, @Nullable Integer language) {
        if (!(dto instanceof OfflineVoiceV1)) {
            return null;
        }
        if (activeWithIn5SByTurningWristSwitch != null) {
            ((OfflineVoiceV1) dto).setActiveWithIn5SByTurningWristSwitch(Boolean.valueOf(activeWithIn5SByTurningWristSwitch.booleanValue()));
        }
        if (activeWithIn5SWhenScreenOnSwitch != null) {
            ((OfflineVoiceV1) dto).setActiveWithIn5SWhenScreenOnSwitch(Boolean.valueOf(activeWithIn5SWhenScreenOnSwitch.booleanValue()));
        }
        if (activeDuringScreenOnSwitch != null) {
            ((OfflineVoiceV1) dto).setActiveDuringScreenOnSwitch(Boolean.valueOf(activeDuringScreenOnSwitch.booleanValue()));
        }
        return dto;
    }

    @NotNull
    public Void getDtoWithLanguage(@NotNull EnumData enumData) {
        throw new IllegalStateException("language not support on V1");
    }
}
