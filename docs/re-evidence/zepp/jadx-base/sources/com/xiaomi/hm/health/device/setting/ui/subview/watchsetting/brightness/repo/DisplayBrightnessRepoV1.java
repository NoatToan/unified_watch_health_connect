package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v1.DisplayAndBrightnessV1;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J=\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J,\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0016J,\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J4\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\fH\u0016JL\u0010'\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\b\u0010#\u001a\u0004\u0018\u00010\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u0012H\u0016J±\u0001\u00105\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\f2\b\u0010+\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010#\u001a\u0004\u0018\u00010\u00122\b\u0010$\u001a\u0004\u0018\u00010\u001f2\b\u0010%\u001a\u0004\u0018\u00010\u001f2\b\u0010&\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u00122\b\u0010.\u001a\u0004\u0018\u00010\u001f2\b\u0010/\u001a\u0004\u0018\u00010\u001f2\b\u00100\u001a\u0004\u0018\u00010\u00122\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\b\u00103\u001a\u0004\u0018\u00010\f2\b\u00104\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/DisplayBrightnessRepoV1;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/IDisplayBrightnessRepo;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "a", "", "isChecked", "getDtoWithAutoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "intData", "getDtoWithBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "getDtoWithScreenOffTime", "enable", "", "getDtoWithScreenOnByNewNotificationSwitch", "getDtoWithScreenOnDuringSportSwitch", "getDtoWithScreenOnByTurningWristMode", "getDtoWithScreenOnByTurningWristActiveSpeed", "", "style", "getDtoWithScreenOffDialId", "isBegin", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "getDtoWithScreenOnByTurningWristBeginOrEndTime", "getDtoWithScreenOffFollowCurrentDialSwitch", "screenOffDisplayMode", "screenOffDisplayBeginTime", "screenOffDisplayEndTime", "screenOffDialPlateType", "getDtoWithInterestSetting", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", LargeWatchSkinActivity.KEY_BEAN, "autoBrightness", "brightness", "screenOffTime", "screenOnByTurningWristMode", "screenOnByTurningWristBeginTime", "screenOnByTurningWristEndTime", "screenOnByTurningWristActiveSpeed", "screenOnByNewNotificationSwitch", "screenOnDuringSportSwitch", "screenOffFollowCurrentDialSwitch", "screenOffDialId", "updateDto", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayBrightnessRepoV1 implements IDisplayBrightnessRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setAutoBrightness(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ IntData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IntData intData) {
            super(1);
            this.a = intData;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setBrightness(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ EnumData a;
        public final /* synthetic */ Time b;
        public final /* synthetic */ Time c;
        public final /* synthetic */ EnumData d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumData enumData, Time time, Time time2, EnumData enumData2) {
            super(1);
            this.a = enumData;
            this.b = time;
            this.c = time2;
            this.d = enumData2;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setScreenOffDisplayMode(this.a);
            displayAndBrightnessV1.setScreenOffDisplayBeginTime(this.b);
            displayAndBrightnessV1.setScreenOffDisplayEndTime(this.c);
            displayAndBrightnessV1.setScreenOffDialPlateType(this.d);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setScreenOffTime(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setScreenOnByTurningWristActiveSpeed(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Time b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, Time time) {
            super(1);
            this.a = z;
            this.b = time;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            if (this.a) {
                displayAndBrightnessV1.setScreenOnByTurningWristBeginTime(this.b);
            } else {
                displayAndBrightnessV1.setScreenOnByTurningWristEndTime(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v1/DisplayAndBrightnessV1;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<DisplayAndBrightnessV1, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV1 displayAndBrightnessV1) {
            displayAndBrightnessV1.setScreenOnByTurningWristMode(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV1 displayAndBrightnessV1) {
            a(displayAndBrightnessV1);
            return Unit.INSTANCE;
        }
    }

    private final HashMap<SettingsGroupType, Settings> a(Function1<? super DisplayAndBrightnessV1, Unit> action) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.DISPLAY;
        DisplayAndBrightnessV1 displayAndBrightnessV1 = new DisplayAndBrightnessV1();
        action.invoke(displayAndBrightnessV1);
        map.put(settingsGroupType, displayAndBrightnessV1);
        return map;
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithAutoBrightness(boolean isChecked) {
        return a(new a(isChecked));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithBrightness(@NotNull IntData intData) {
        return a(new b(intData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithInterestSetting(@Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType) {
        return a(new c(screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime, screenOffDialPlateType));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    /* JADX INFO: renamed from: getDtoWithScreenOffDialId, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ HashMap mo3440getDtoWithScreenOffDialId(String str) {
        return (HashMap) getDtoWithScreenOffDialId(str);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    /* JADX INFO: renamed from: getDtoWithScreenOffFollowCurrentDialSwitch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ HashMap mo3441getDtoWithScreenOffFollowCurrentDialSwitch(boolean z) {
        return (HashMap) getDtoWithScreenOffFollowCurrentDialSwitch(z);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOffTime(@NotNull EnumData enumData) {
        return a(new d(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    /* JADX INFO: renamed from: getDtoWithScreenOnByNewNotificationSwitch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ HashMap mo3442getDtoWithScreenOnByNewNotificationSwitch(boolean z) {
        return (HashMap) getDtoWithScreenOnByNewNotificationSwitch(z);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristActiveSpeed(@NotNull EnumData enumData) {
        return a(new e(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristBeginOrEndTime(boolean isBegin, @NotNull Time time) {
        return a(new f(isBegin, time));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristMode(@NotNull EnumData enumData) {
        return a(new g(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    /* JADX INFO: renamed from: getDtoWithScreenOnDuringSportSwitch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ HashMap mo3443getDtoWithScreenOnDuringSportSwitch(boolean z) {
        return (HashMap) getDtoWithScreenOnDuringSportSwitch(z);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @Nullable
    public DisplayAndBrightness updateDto(@Nullable DisplayAndBrightness bean, @Nullable Boolean autoBrightness, @Nullable IntData brightness, @Nullable EnumData screenOffTime, @Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType, @Nullable EnumData screenOnByTurningWristMode, @Nullable Time screenOnByTurningWristBeginTime, @Nullable Time screenOnByTurningWristEndTime, @Nullable EnumData screenOnByTurningWristActiveSpeed, @Nullable Boolean screenOnByNewNotificationSwitch, @Nullable Boolean screenOnDuringSportSwitch, @Nullable Boolean screenOffFollowCurrentDialSwitch, @Nullable String screenOffDialId) {
        EnumData screenOnByTurningWristActiveSpeed2;
        EnumData screenOnByTurningWristMode2;
        EnumData screenOffDialPlateType2;
        EnumData screenOffDisplayMode2;
        EnumData screenOffTime2;
        if (!(bean instanceof DisplayAndBrightnessV1)) {
            return null;
        }
        if (autoBrightness != null) {
            ((DisplayAndBrightnessV1) bean).setAutoBrightness(Boolean.valueOf(autoBrightness.booleanValue()));
        }
        if (brightness != null) {
            DisplayAndBrightnessV1 displayAndBrightnessV1 = (DisplayAndBrightnessV1) bean;
            IntData brightness2 = displayAndBrightnessV1.getBrightness();
            if (brightness2 != null) {
                brightness2.setValue(brightness.getValue());
            }
            IntData brightness3 = displayAndBrightnessV1.getBrightness();
            if (brightness3 != null) {
                brightness3.setMax(brightness.getMax());
            }
            IntData brightness4 = displayAndBrightnessV1.getBrightness();
            if (brightness4 != null) {
                brightness4.setMin(brightness.getMin());
            }
        }
        if (screenOffTime != null && (screenOffTime2 = ((DisplayAndBrightnessV1) bean).getScreenOffTime()) != null) {
            screenOffTime2.setValue(screenOffTime.getValue());
        }
        if (screenOffDisplayMode != null && (screenOffDisplayMode2 = ((DisplayAndBrightnessV1) bean).getScreenOffDisplayMode()) != null) {
            screenOffDisplayMode2.setValue(screenOffDisplayMode.getValue());
        }
        if (screenOffDisplayBeginTime != null) {
            ((DisplayAndBrightnessV1) bean).setScreenOffDisplayBeginTime(screenOffDisplayBeginTime);
        }
        if (screenOffDisplayEndTime != null) {
            ((DisplayAndBrightnessV1) bean).setScreenOffDisplayEndTime(screenOffDisplayEndTime);
        }
        if (screenOffDialPlateType != null && (screenOffDialPlateType2 = ((DisplayAndBrightnessV1) bean).getScreenOffDialPlateType()) != null) {
            screenOffDialPlateType2.setValue(screenOffDialPlateType.getValue());
        }
        if (screenOnByTurningWristMode != null && (screenOnByTurningWristMode2 = ((DisplayAndBrightnessV1) bean).getScreenOnByTurningWristMode()) != null) {
            screenOnByTurningWristMode2.setValue(screenOnByTurningWristMode.getValue());
        }
        if (screenOnByTurningWristBeginTime != null) {
            ((DisplayAndBrightnessV1) bean).setScreenOnByTurningWristBeginTime(screenOnByTurningWristBeginTime);
        }
        if (screenOnByTurningWristEndTime != null) {
            ((DisplayAndBrightnessV1) bean).setScreenOnByTurningWristEndTime(screenOnByTurningWristEndTime);
        }
        if (screenOnByTurningWristActiveSpeed != null && (screenOnByTurningWristActiveSpeed2 = ((DisplayAndBrightnessV1) bean).getScreenOnByTurningWristActiveSpeed()) != null) {
            screenOnByTurningWristActiveSpeed2.setValue(screenOnByTurningWristActiveSpeed.getValue());
        }
        return bean;
    }

    @NotNull
    public Void getDtoWithScreenOffDialId(@NotNull String style) {
        throw new IllegalStateException("getDtoWithScreenOffDialId not support on V1");
    }

    @NotNull
    public Void getDtoWithScreenOffFollowCurrentDialSwitch(boolean enable) {
        throw new IllegalStateException("getDtoWithScreenOnByNewNotificationSwitch not support on V1");
    }

    @NotNull
    public Void getDtoWithScreenOnByNewNotificationSwitch(boolean enable) {
        throw new IllegalStateException("getDtoWithScreenOnByNewNotificationSwitch not support on V1");
    }

    @NotNull
    public Void getDtoWithScreenOnDuringSportSwitch(boolean enable) {
        throw new IllegalStateException("getDtoWithScreenOnDuringSportSwitch not support on V1");
    }
}
