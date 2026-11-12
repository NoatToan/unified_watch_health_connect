package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.SoundAndVibrate;
import com.huami.bluetooth.profile.channel.module.settings.entity.soundandvibrate.v2.SoundAndVibrateV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumArray;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b*\u0010+J=\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J,\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J,\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J,\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016JW\u0010(\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\b\u0010#\u001a\u0004\u0018\u00010\u00172\b\u0010$\u001a\u0004\u0018\u00010\u00122\b\u0010%\u001a\u0004\u0018\u00010\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010'\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/repo/SoundVibrationRepoV2;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/sound/repo/ISoundVibrationRepo;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumArray;", "scenes", "getBuzzerScenes", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "strength", "getBuzzerVibrateStrength", "", "enable", "getDtoWithNotificationVibrationSwitch", "enumData", "getDtoWithNotificationVibrationStrength", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "value", "getDtoWithVolume", "getDtoWithRemindSwitch", "getDtoWithSystemVibrationSwitch", "getDtoWithCrownVibrationSwitch", "getDtoWithCoverScreenMutingSwitch", "getDtoWithVibrationFeedbackSwitch", "getDtoWithVoiceBroadcast", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "soundAndVibrate", "muteSwitch", "volume", "notificationVibrationSwitch", "notificationVibrationStrength", "systemVibrationSwitch", "crownVibrationSwitch", "updateSoundVibrationCache", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/SoundAndVibrate;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SoundVibrationRepoV2 implements ISoundVibrationRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ EnumArray a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumArray enumArray) {
            super(1);
            this.a = enumArray;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setBuzzerScenes(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setBuzzerVibrateStrength(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setCoverScreenMutingSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setCrownVibrationSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setNotificationVibrationStrength(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setNotificationVibrationSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setRemindSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setSystemVibrationSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setVibrationFeedbackSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setSportVoiceReportSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/soundandvibrate/v2/SoundAndVibrateV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<SoundAndVibrateV2, Unit> {
        public final /* synthetic */ IntData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(IntData intData) {
            super(1);
            this.a = intData;
        }

        public final void a(@NotNull SoundAndVibrateV2 soundAndVibrateV2) {
            soundAndVibrateV2.setVolume(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SoundAndVibrateV2 soundAndVibrateV2) {
            a(soundAndVibrateV2);
            return Unit.INSTANCE;
        }
    }

    private final HashMap<SettingsGroupType, Settings> a(Function1<? super SoundAndVibrateV2, Unit> action) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.SOUND_AND_VIBRATION;
        SoundAndVibrateV2 soundAndVibrateV2 = new SoundAndVibrateV2();
        action.invoke(soundAndVibrateV2);
        map.put(settingsGroupType, soundAndVibrateV2);
        return map;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getBuzzerScenes(@NotNull EnumArray scenes) {
        return a(new a(scenes));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getBuzzerVibrateStrength(@NotNull EnumData strength) {
        return a(new b(strength));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithCoverScreenMutingSwitch */
    public HashMap<SettingsGroupType, Settings> mo3444getDtoWithCoverScreenMutingSwitch(boolean enable) {
        return a(new c(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithCrownVibrationSwitch(boolean enable) {
        return a(new d(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithNotificationVibrationStrength(@NotNull EnumData enumData) {
        return a(new e(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithNotificationVibrationSwitch(boolean enable) {
        return a(new f(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithRemindSwitch(boolean enable) {
        return a(new g(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithSystemVibrationSwitch(boolean enable) {
        return a(new h(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithVibrationFeedbackSwitch */
    public HashMap<SettingsGroupType, Settings> mo3445getDtoWithVibrationFeedbackSwitch(boolean enable) {
        return a(new i(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithVoiceBroadcast(boolean enable) {
        return a(new j(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithVolume(@NotNull IntData value) {
        return a(new k(value));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.sound.repo.ISoundVibrationRepo
    @Nullable
    public SoundAndVibrate updateSoundVibrationCache(@Nullable SoundAndVibrate soundAndVibrate, @Nullable Boolean muteSwitch, @Nullable IntData volume, @Nullable Boolean notificationVibrationSwitch, @Nullable EnumData notificationVibrationStrength, @Nullable Boolean systemVibrationSwitch, @Nullable Boolean crownVibrationSwitch) {
        EnumData notificationVibrationStrength2;
        if (!(soundAndVibrate instanceof SoundAndVibrateV2)) {
            return null;
        }
        if (muteSwitch != null) {
            ((SoundAndVibrateV2) soundAndVibrate).setMuteSwitch(Boolean.valueOf(muteSwitch.booleanValue()));
        }
        if (volume != null) {
            ((SoundAndVibrateV2) soundAndVibrate).setVolume(volume);
        }
        if (notificationVibrationSwitch != null) {
            ((SoundAndVibrateV2) soundAndVibrate).setNotificationVibrationSwitch(Boolean.valueOf(notificationVibrationSwitch.booleanValue()));
        }
        if (notificationVibrationStrength != null && (notificationVibrationStrength2 = ((SoundAndVibrateV2) soundAndVibrate).getNotificationVibrationStrength()) != null) {
            notificationVibrationStrength2.setValue(notificationVibrationStrength.getValue());
        }
        if (systemVibrationSwitch != null) {
            ((SoundAndVibrateV2) soundAndVibrate).setSystemVibrationSwitch(Boolean.valueOf(systemVibrationSwitch.booleanValue()));
        }
        if (crownVibrationSwitch != null) {
            ((SoundAndVibrateV2) soundAndVibrate).setCrownVibrationSwitch(Boolean.valueOf(crownVibrationSwitch.booleanValue()));
        }
        return soundAndVibrate;
    }
}
