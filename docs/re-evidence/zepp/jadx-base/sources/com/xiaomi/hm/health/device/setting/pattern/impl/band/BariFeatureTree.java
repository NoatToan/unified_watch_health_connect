package com.xiaomi.hm.health.device.setting.pattern.impl.band;

import androidx.p010navigation.NavController;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.bluetooth.profile.channel.module.eventreminder.EventReminderModule;
import com.huami.bluetooth.profile.channel.module.todo.TodoModule;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.NfcDeviceConfigKt;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import com.xiaomi.hm.health.device.setting.vo.WatchAppItemVo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/band/BariFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/impl/band/BandFeatureTree;", "", "setup", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BariFeatureTree extends BandFeatureTree {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<NavController, Unit> {
        public static final a a = new a();

        public a() {
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
    public static final class b extends Lambda implements Function1<NavController, Unit> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            navController.navigate(R.id.action_to_schedule);
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
            navController.navigate(R.id.action_to_todoList);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NavController navController) {
            a(navController);
            return Unit.INSTANCE;
        }
    }

    @Override // com.xiaomi.hm.health.device.setting.pattern.impl.band.BandFeatureTree, com.xiaomi.hm.health.device.setting.pattern.FeatureTree
    public void setup() {
        super.setup();
        SoftFeature softFeature = SoftFeature.VIBRATE_MODE;
        removeAppItem(softFeature);
        removeFeature(softFeature);
        SoftFeature softFeature2 = SoftFeature.PLAY_HELP;
        removeAppItem(softFeature2);
        removeFeature(softFeature2);
        if (!NfcDeviceConfigKt.hasFeatureNfc()) {
            SoftFeature softFeature3 = SoftFeature.NFC_CARD;
            removeAppItem(softFeature3);
            removeFeature(softFeature3);
        }
        WatchAppItemVo watchAppItemVoFindWatchApp = findWatchApp(SoftFeature.WEATHER);
        if (watchAppItemVoFindWatchApp != null) {
            watchAppItemVoFindWatchApp.setAction(a.a);
        }
        if (supportModule(7)) {
            FeatureTree.setAppItem$default(this, SoftFeature.SCHEDULE, R.drawable.app_sort_schedule_new, -1, R.string.app_sort_schedule, false, b.a, 16, null);
        }
        if (!supportModule(8)) {
            removeAppItem(SoftFeature.WORLD_CLOCK);
        }
        if (!supportModule(EventReminderModule.class)) {
            SoftFeature softFeature4 = SoftFeature.PUSH_REMINDER;
            removeAppItem(softFeature4);
            removeFeature(softFeature4);
        }
        if (supportModule(TodoModule.class)) {
            SoftFeature softFeature5 = SoftFeature.TODO;
            int i = R.drawable.icon_app_todo;
            setIndex$devicex_zeppRelease(getIndex() + 1);
            setAppItem(softFeature5, i, getIndex(), R.string.device_todo, isDeviceSupportFeature(30), c.a);
        }
        removeAppItem(SoftFeature.PHONE_ALARM);
    }
}
