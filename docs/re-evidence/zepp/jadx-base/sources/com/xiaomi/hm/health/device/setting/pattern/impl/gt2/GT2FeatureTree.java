package com.xiaomi.hm.health.device.setting.pattern.impl.gt2;

import android.os.Bundle;
import androidx.p010navigation.NavController;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.pattern.action.ActionFactory;
import com.xiaomi.hm.health.device.setting.pattern.action.AppItemAction;
import com.xiaomi.hm.health.device.setting.pattern.action.DefaultActionFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/gt2/GT2FeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/action/ActionFactory;", "b", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class GT2FeatureTree extends FeatureTree {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<NavController, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_sleepSettingFragment);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<NavController, Unit> {
        public b() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            int i = R.id.action_to_worldClockActivity;
            Bundle bundle = new Bundle();
            bundle.putSerializable("device_source", GT2FeatureTree.this.findDeviceSource());
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
    public static final class c extends Lambda implements Function1<NavController, Unit> {
        public static final c a = new c();

        public c() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
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
            navController.navigate(R.id.action_to_incomingCallAlertActivity);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class e extends FunctionReferenceImpl implements Function1<NavController, Unit> {
        public e(AppItemAction appItemAction) {
            super(1, appItemAction, AppItemAction.class, "action", "action(Landroidx/navigation/NavController;)V", 0);
        }

        public final void a(@NotNull NavController navController) {
            ((AppItemAction) this.receiver).action(navController);
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
            if (((UserInfoPolicyService) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserInfoPolicyService.class), null, null)).interceptWithShowTip()) {
                return;
            }
            navController.navigate(R.id.action_to_weatherSettingActivity);
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
            navController.navigate(R.id.action_to_miBandAlarmActivity);
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
            navController.navigate(R.id.action_to_reminder);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<NavController, Unit> {
        public static final i a = new i();

        public i() {
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
    public static final class j extends Lambda implements Function1<NavController, Unit> {
        public static final j a = new j();

        public j() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function1<NavController, Unit> {
        public static final k a = new k();

        public k() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function1<NavController, Unit> {
        public static final l a = new l();

        public l() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    private final ActionFactory b() {
        return new DefaultActionFactory();
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
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
        putFeature(SoftFeature.DEVICE_APPLICATION_MANAGE);
        putFeature(SoftFeature.OFFLINE_VOICE_CMD);
        putFeature(SoftFeature.VIBRATE_MODE);
        FeatureTree.setAppItem$default(this, SoftFeature.TELEPHONE, R.drawable.app_sort_phone_new, 1, R.string.app_sort_phone, false, d.a, 16, null);
        SoftFeature softFeature = SoftFeature.MUSIC;
        FeatureTree.setAppItem$default(this, softFeature, R.drawable.app_sort_music_new, 2, R.string.app_sort_music, false, new e(b().createAction(softFeature)), 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.WEATHER, R.drawable.app_sort_weather_new, 3, R.string.weather, false, f.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.ALARM, R.drawable.app_sort_alarm_new, 4, R.string.setting_app_alarm, false, g.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.SCHEDULE, R.drawable.app_sort_schedule_new, 5, R.string.schedule, false, h.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.NFC_CARD, R.drawable.app_sort_nfc_new, 6, R.string.app_sort_card_bag, false, i.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.ALBUM, R.drawable.app_sort_gallery_new, 7, R.string.app_sort_gallery, false, j.a, 16, null);
        SoftFeature softFeature2 = SoftFeature.FLIGHT_BUTLER;
        int i2 = R.drawable.app_sort_netease_music_new;
        int i3 = R.string.un_translate;
        FeatureTree.setAppItem$default(this, softFeature2, i2, 8, i3, false, k.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.TIGER_STOCKS, i2, 9, i3, false, l.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.SLEEP, R.drawable.app_sort_sleep2, 10, R.string.status_sleep, false, a.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.WORLD_CLOCK, R.drawable.app_sort_world_clock, 11, R.string.world_clock, false, new b(), 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.CASSETTE_PLAYER, R.drawable.app_sort_voice_recorder_new, 12, i3, false, c.a, 16, null);
    }
}
