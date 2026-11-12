package com.xiaomi.hm.health.device.setting.pattern.impl.gt3;

import android.os.Bundle;
import androidx.p010navigation.NavController;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.assistant.ui.v2.ScheduleActivity;
import com.huami.bluetooth.profile.channel.module.member_card.MemberCardModule;
import com.huami.bluetooth.profile.channel.module.nfc.NFCModule;
import com.huami.bluetooth.profile.channel.module.record.RecordModule;
import com.huami.devicex.DeviceXBuilder;
import com.huami.devicex.R;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.ui.TelephoneNavAction;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\n\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt3/GT3FeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "Lorg/koin/core/component/KoinComponent;", "", "setup", "Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/device/setting/inject/IDeviceFeatureDepends;", "deviceFeatureDepends", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class GT3FeatureTree extends FeatureTree implements KoinComponent {

    @NotNull
    private static final String e = "GT3FeatureTree";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceFeatureDepends;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "device not support record module!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<NavController, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_memberCard);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<NavController, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_musicTransferActivity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<NavController, Unit> {
        public static final d a = new d();

        public d() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            if (((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip()) {
                return;
            }
            navController.navigate(R.id.action_to_huamiOSWeatherSettingActivity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<NavController, Unit> {
        public static final e a = new e();

        public e() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_huamiOSAlarmActivity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<NavController, Unit> {
        public static final f a = new f();

        public f() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            int i = R.id.action_to_schedule;
            Bundle bundle = new Bundle();
            bundle.putInt(ScheduleActivity.KEY_SCHEDULE_TITLE, R.string.app_sort_calendar);
            Unit unit = Unit.INSTANCE;
            navController.navigate(i, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<NavController, Unit> {
        public static final g a = new g();

        public g() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_todoList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<NavController, Unit> {
        public static final h a = new h();

        public h() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_walletActivity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<NavController, Unit> {
        public i() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            int i = R.id.action_to_worldClockActivity;
            Bundle bundle = new Bundle();
            bundle.putSerializable("device_source", GT3FeatureTree.this.findDeviceSource());
            bundle.putSerializable("device_type", HMDeviceType.MILI);
            Unit unit = Unit.INSTANCE;
            navController.navigate(i, bundle);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<NavController, Unit> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_recorder);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GT3FeatureTree() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceFeatureDepends = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IDeviceFeatureDepends>() { // from class: com.xiaomi.hm.health.device.setting.pattern.impl.gt3.GT3FeatureTree$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.inject.IDeviceFeatureDepends, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDeviceFeatureDepends invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDeviceFeatureDepends.class), qualifier, objArr);
            }
        });
    }

    private final IDeviceFeatureDepends b() {
        return (IDeviceFeatureDepends) this.deviceFeatureDepends.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        int i2;
        int i3 = 0;
        putFeature(SoftFeature.NPS);
        putFeature(SoftFeature.FW_UPGRADE);
        putFeature(SoftFeature.FEEDBACK);
        putFeature(SoftFeature.ABOUT);
        putFeature(SoftFeature.SCREEN_UNLOCK);
        putFeature(SoftFeature.BACKGROUND_RUNNING);
        if (HMDeviceConfig.hasFeatureAvoidSpiteBind()) {
            putFeature(SoftFeature.BIND_LIMIT);
        }
        putFeature(SoftFeature.BLUE_TOOTH_BROADCAST);
        putFeature(SoftFeature.FIND_PHONE);
        putFeature(SoftFeature.FIND_DEVICE);
        putFeature(SoftFeature.APPLICATION_SETTING);
        putFeature(SoftFeature.SMART_ASSISTANT);
        putFeature(SoftFeature.HEALTH_DETECT);
        putFeature(SoftFeature.PUSH_REMINDER);
        putFeature(SoftFeature.DIAL_SKIN);
        putFeature(SoftFeature.JS_APP_STORE);
        putFeature(SoftFeature.DEVICE_APPLICATION_MANAGE);
        putFeature(SoftFeature.OFFLINE_VOICE_CMD);
        putFeature(SoftFeature.DISABLE_AGPS_OR_GDSP_STATUS);
        if (supportModule(MemberCardModule.class)) {
            FeatureTree.setAppItem$default(this, SoftFeature.MEMBER_CARD, R.drawable.layer_member_card, 1, R.string.membership_title, false, b.a, 16, null);
            i3 = 1;
        }
        int i4 = i3 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.TELEPHONE, R.drawable.app_sort_phone_new, i4, R.string.app_sort_phone, false, new TelephoneNavAction(), 16, null);
        int i5 = i4 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.MUSIC, R.drawable.app_sort_music_new, i5, R.string.app_sort_music, false, c.a, 16, null);
        int i6 = i5 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.WEATHER, R.drawable.app_sort_weather_new, i6, R.string.weather, false, d.a, 16, null);
        int i7 = i6 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.ALARM, R.drawable.app_sort_alarm_new, i7, R.string.setting_app_alarm, false, e.a, 16, null);
        int i8 = i7 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.SCHEDULE, R.drawable.app_sort_schedule_new, i8, R.string.app_sort_calendar, false, f.a, 16, null);
        int i9 = i8 + 1;
        setAppItem(SoftFeature.TODO, R.drawable.icon_app_todo, i9, R.string.device_todo, isDeviceSupportFeature(30), g.a);
        if (supportModule(NFCModule.class)) {
            i9++;
            FeatureTree.setAppItem$default(this, SoftFeature.NFC_CARD, R.drawable.app_sort_nfc_new, i9, R.string.app_sort_card_bag, false, h.a, 16, null);
        }
        int i10 = i9 + 1;
        FeatureTree.setAppItem$default(this, SoftFeature.WORLD_CLOCK, R.drawable.app_sort_world_clock, i10, R.string.world_clock, false, new i(), 16, null);
        if (supportModule(RecordModule.class)) {
            i2 = i10 + 1;
            FeatureTree.setAppItem$default(this, SoftFeature.CASSETTE_PLAYER, R.drawable.app_voice_recorder, i2, R.string.device_recorder, false, j.a, 16, null);
        } else {
            HMLog.info(e, a.a);
            i2 = i10;
        }
        if (b().supportAlexa(DeviceXBuilder.INSTANCE.getContext())) {
            FeatureTree.setAppItem$default(this, SoftFeature.ALEXA, R.drawable.layer_icon_alexa, i2, R.string.third_part_amazon_name, false, null, 48, null);
        }
    }
}
