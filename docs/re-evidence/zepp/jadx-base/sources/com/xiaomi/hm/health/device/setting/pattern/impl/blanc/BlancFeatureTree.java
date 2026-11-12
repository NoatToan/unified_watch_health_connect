package com.xiaomi.hm.health.device.setting.pattern.impl.blanc;

import androidx.p010navigation.NavController;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/blanc/BlancFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BlancFeatureTree extends FeatureTree {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<NavController, Unit> {
        public static final a a = new a();

        public a() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_sport_setting);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<NavController, Unit> {
        public static final b a = new b();

        public b() {
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
    public static final class c extends Lambda implements Function1<NavController, Unit> {
        public static final c a = new c();

        public c() {
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
    public static final class d extends Lambda implements Function1<NavController, Unit> {
        public static final d a = new d();

        public d() {
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
    public static final class e extends Lambda implements Function1<NavController, Unit> {
        public static final e a = new e();

        public e() {
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
        putFeature(SoftFeature.HEALTH_DETECT);
        putFeature(SoftFeature.PUSH_REMINDER);
        putFeature(SoftFeature.DEVICE_APPLICATION_MANAGE);
        FeatureTree.setAppItem$default(this, SoftFeature.SPORT, R.drawable.app_sort_sport_new, 1, R.string.exercise_history_share_title_sport, false, a.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.WEATHER, R.drawable.app_sort_weather_new, 2, R.string.weather, false, b.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.ALARM, R.drawable.app_sort_alarm_new, 3, R.string.setting_app_alarm, false, c.a, 16, null);
        FeatureTree.setAppItem$default(this, SoftFeature.SCHEDULE, R.drawable.app_sort_schedule_new, 4, R.string.schedule, false, d.a, 16, null);
        if (findDeviceSource() != HMDeviceSource.MILI_BLANC_W) {
            FeatureTree.setAppItem$default(this, SoftFeature.NFC_CARD, R.drawable.app_sort_nfc_new, 5, R.string.app_sort_card_bag, false, e.a, 16, null);
        }
    }
}
