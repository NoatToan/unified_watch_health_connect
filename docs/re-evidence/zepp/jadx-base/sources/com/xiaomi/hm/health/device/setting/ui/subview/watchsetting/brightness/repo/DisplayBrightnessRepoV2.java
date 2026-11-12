package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo;

import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.DisplayAndBrightness;
import com.huami.bluetooth.profile.channel.module.settings.entity.displayandbrightness.v2.DisplayAndBrightnessV2;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IntData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b6\u00107J=\u0010\u000b\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0002J,\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\r\u001a\u00020\fH\u0016J,\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J,\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0015\u001a\u00020\fH\u0016J,\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0015\u001a\u00020\fH\u0016J,\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J,\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0015\u001a\u00020\fH\u0016J4\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J,\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010 \u001a\u00020\u001fH\u0016JL\u0010&\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\n2\b\u0010\"\u001a\u0004\u0018\u00010\u00122\b\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u0012H\u0016J±\u0001\u00104\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010\f2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\u0010+\u001a\u0004\u0018\u00010\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u00122\b\u0010#\u001a\u0004\u0018\u00010\u001c2\b\u0010$\u001a\u0004\u0018\u00010\u001c2\b\u0010%\u001a\u0004\u0018\u00010\u00122\b\u0010,\u001a\u0004\u0018\u00010\u00122\b\u0010-\u001a\u0004\u0018\u00010\u001c2\b\u0010.\u001a\u0004\u0018\u00010\u001c2\b\u0010/\u001a\u0004\u0018\u00010\u00122\b\u00100\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\f2\b\u00102\u001a\u0004\u0018\u00010\f2\b\u00103\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b4\u00105¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/DisplayBrightnessRepoV2;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/brightness/repo/IDisplayBrightnessRepo;", "Lkotlin/Function1;", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsGroupType;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "Lkotlin/collections/HashMap;", "a", "", "isChecked", "getDtoWithAutoBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;", "intData", "getDtoWithBrightness", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "enumData", "getDtoWithScreenOffTime", "enable", "getDtoWithScreenOnByNewNotificationSwitch", "getDtoWithScreenOnDuringSportSwitch", "getDtoWithScreenOnByTurningWristMode", "getDtoWithScreenOnByTurningWristActiveSpeed", "getDtoWithScreenOffFollowCurrentDialSwitch", "isBegin", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;", "time", "getDtoWithScreenOnByTurningWristBeginOrEndTime", "", "style", "getDtoWithScreenOffDialId", "screenOffDisplayMode", "screenOffDisplayBeginTime", "screenOffDisplayEndTime", "screenOffDialPlateType", "getDtoWithInterestSetting", "Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", LargeWatchSkinActivity.KEY_BEAN, "autoBrightness", "brightness", "screenOffTime", "screenOnByTurningWristMode", "screenOnByTurningWristBeginTime", "screenOnByTurningWristEndTime", "screenOnByTurningWristActiveSpeed", "screenOnByNewNotificationSwitch", "screenOnDuringSportSwitch", "screenOffFollowCurrentDialSwitch", "screenOffDialId", "updateDto", "(Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;Ljava/lang/Boolean;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IntData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Time;Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/DisplayAndBrightness;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DisplayBrightnessRepoV2 implements IDisplayBrightnessRepo {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setAutoBrightness(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ IntData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IntData intData) {
            super(1);
            this.a = intData;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setBrightness(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ EnumData a;
        public final /* synthetic */ Time b;
        public final /* synthetic */ Time c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EnumData enumData, Time time, Time time2) {
            super(1);
            this.a = enumData;
            this.b = time;
            this.c = time2;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOffDisplayMode(this.a);
            displayAndBrightnessV2.setScreenOffDisplayBeginTime(this.b);
            displayAndBrightnessV2.setScreenOffDisplayEndTime(this.c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(1);
            this.a = str;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOffDialId(new StringEnum(this.a, 0, null, false, 14, null));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOffTime(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOnByNewNotificationSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOnByTurningWristActiveSpeed(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Time b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z, Time time) {
            super(1);
            this.a = z;
            this.b = time;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            if (this.a) {
                displayAndBrightnessV2.setScreenOnByTurningWristBeginTime(this.b);
            } else {
                displayAndBrightnessV2.setScreenOnByTurningWristEndTime(this.b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ EnumData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(EnumData enumData) {
            super(1);
            this.a = enumData;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOnByTurningWristMode(this.a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/displayandbrightness/v2/DisplayAndBrightnessV2;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<DisplayAndBrightnessV2, Unit> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z) {
            super(1);
            this.a = z;
        }

        public final void a(@NotNull DisplayAndBrightnessV2 displayAndBrightnessV2) {
            displayAndBrightnessV2.setScreenOnDuringSportSwitch(Boolean.valueOf(this.a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisplayAndBrightnessV2 displayAndBrightnessV2) {
            a(displayAndBrightnessV2);
            return Unit.INSTANCE;
        }
    }

    private final HashMap<SettingsGroupType, Settings> a(Function1<? super DisplayAndBrightnessV2, Unit> action) {
        HashMap<SettingsGroupType, Settings> map = new HashMap<>();
        SettingsGroupType settingsGroupType = SettingsGroupType.DISPLAY;
        DisplayAndBrightnessV2 displayAndBrightnessV2 = new DisplayAndBrightnessV2();
        action.invoke(displayAndBrightnessV2);
        map.put(settingsGroupType, displayAndBrightnessV2);
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
        return a(new c(screenOffDisplayMode, screenOffDisplayBeginTime, screenOffDisplayEndTime));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOffDialId */
    public HashMap<SettingsGroupType, Settings> mo3440getDtoWithScreenOffDialId(@NotNull String style) {
        return a(new d(style));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOffFollowCurrentDialSwitch */
    public HashMap<SettingsGroupType, Settings> mo3441getDtoWithScreenOffFollowCurrentDialSwitch(boolean enable) {
        return a(new e(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOffTime(@NotNull EnumData enumData) {
        return a(new f(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOnByNewNotificationSwitch */
    public HashMap<SettingsGroupType, Settings> mo3442getDtoWithScreenOnByNewNotificationSwitch(boolean enable) {
        return a(new g(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristActiveSpeed(@NotNull EnumData enumData) {
        return a(new h(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristBeginOrEndTime(boolean isBegin, @NotNull Time time) {
        return a(new i(isBegin, time));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    public HashMap<SettingsGroupType, Settings> getDtoWithScreenOnByTurningWristMode(@NotNull EnumData enumData) {
        return a(new j(enumData));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @NotNull
    /* JADX INFO: renamed from: getDtoWithScreenOnDuringSportSwitch */
    public HashMap<SettingsGroupType, Settings> mo3443getDtoWithScreenOnDuringSportSwitch(boolean enable) {
        return a(new k(enable));
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.repo.IDisplayBrightnessRepo
    @Nullable
    public DisplayAndBrightness updateDto(@Nullable DisplayAndBrightness bean, @Nullable Boolean autoBrightness, @Nullable IntData brightness, @Nullable EnumData screenOffTime, @Nullable EnumData screenOffDisplayMode, @Nullable Time screenOffDisplayBeginTime, @Nullable Time screenOffDisplayEndTime, @Nullable EnumData screenOffDialPlateType, @Nullable EnumData screenOnByTurningWristMode, @Nullable Time screenOnByTurningWristBeginTime, @Nullable Time screenOnByTurningWristEndTime, @Nullable EnumData screenOnByTurningWristActiveSpeed, @Nullable Boolean screenOnByNewNotificationSwitch, @Nullable Boolean screenOnDuringSportSwitch, @Nullable Boolean screenOffFollowCurrentDialSwitch, @Nullable String screenOffDialId) {
        StringEnum screenOffDialId2;
        EnumData screenOnByTurningWristActiveSpeed2;
        EnumData screenOnByTurningWristMode2;
        EnumData screenOffDisplayMode2;
        EnumData screenOffTime2;
        if (!(bean instanceof DisplayAndBrightnessV2)) {
            return null;
        }
        if (autoBrightness != null) {
            ((DisplayAndBrightnessV2) bean).setAutoBrightness(Boolean.valueOf(autoBrightness.booleanValue()));
        }
        if (brightness != null) {
            DisplayAndBrightnessV2 displayAndBrightnessV2 = (DisplayAndBrightnessV2) bean;
            IntData brightness2 = displayAndBrightnessV2.getBrightness();
            if (brightness2 != null) {
                brightness2.setValue(brightness.getValue());
            }
            IntData brightness3 = displayAndBrightnessV2.getBrightness();
            if (brightness3 != null) {
                brightness3.setMax(brightness.getMax());
            }
            IntData brightness4 = displayAndBrightnessV2.getBrightness();
            if (brightness4 != null) {
                brightness4.setMin(brightness.getMin());
            }
        }
        if (screenOffTime != null && (screenOffTime2 = ((DisplayAndBrightnessV2) bean).getScreenOffTime()) != null) {
            screenOffTime2.setValue(screenOffTime.getValue());
        }
        if (screenOffDisplayMode != null && (screenOffDisplayMode2 = ((DisplayAndBrightnessV2) bean).getScreenOffDisplayMode()) != null) {
            screenOffDisplayMode2.setValue(screenOffDisplayMode.getValue());
        }
        if (screenOffDisplayBeginTime != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOffDisplayBeginTime(screenOffDisplayBeginTime);
        }
        if (screenOffDisplayEndTime != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOffDisplayEndTime(screenOffDisplayEndTime);
        }
        if (screenOnByTurningWristMode != null && (screenOnByTurningWristMode2 = ((DisplayAndBrightnessV2) bean).getScreenOnByTurningWristMode()) != null) {
            screenOnByTurningWristMode2.setValue(screenOnByTurningWristMode.getValue());
        }
        if (screenOnByTurningWristBeginTime != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOnByTurningWristBeginTime(screenOnByTurningWristBeginTime);
        }
        if (screenOnByTurningWristEndTime != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOnByTurningWristEndTime(screenOnByTurningWristEndTime);
        }
        if (screenOnByTurningWristActiveSpeed != null && (screenOnByTurningWristActiveSpeed2 = ((DisplayAndBrightnessV2) bean).getScreenOnByTurningWristActiveSpeed()) != null) {
            screenOnByTurningWristActiveSpeed2.setValue(screenOnByTurningWristActiveSpeed.getValue());
        }
        if (screenOnByNewNotificationSwitch != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOnByNewNotificationSwitch(Boolean.valueOf(screenOnByNewNotificationSwitch.booleanValue()));
        }
        if (screenOnDuringSportSwitch != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOnDuringSportSwitch(Boolean.valueOf(screenOnDuringSportSwitch.booleanValue()));
        }
        if (screenOffFollowCurrentDialSwitch != null) {
            ((DisplayAndBrightnessV2) bean).setScreenOffFollowCurrentDialSwitch(Boolean.valueOf(screenOffFollowCurrentDialSwitch.booleanValue()));
        }
        if (screenOffDialId != null && (screenOffDialId2 = ((DisplayAndBrightnessV2) bean).getScreenOffDialId()) != null) {
            screenOffDialId2.setValue(screenOffDialId);
        }
        return bean;
    }
}
