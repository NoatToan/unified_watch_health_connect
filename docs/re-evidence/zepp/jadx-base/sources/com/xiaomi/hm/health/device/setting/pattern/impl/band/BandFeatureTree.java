package com.xiaomi.hm.health.device.setting.pattern.impl.band;

import android.os.Bundle;
import androidx.p010navigation.NavController;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.UserInfoPolicyService;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.devicex.R;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.pattern.FeatureTree;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/pattern/impl/band/BandFeatureTree;", "Lcom/xiaomi/hm/health/device/setting/pattern/FeatureTree;", "", "setup", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getIndex$devicex_zeppRelease", "()I", "setIndex$devicex_zeppRelease", "(I)V", "index", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class BandFeatureTree extends FeatureTree {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int index;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/navigation/NavController;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<NavController, Unit> {
        public static final a a = new a();

        public a() {
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
    public static final class b extends Lambda implements Function1<NavController, Unit> {
        public static final b a = new b();

        public b() {
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
    public static final class c extends Lambda implements Function1<NavController, Unit> {
        public static final c a = new c();

        public c() {
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
    public static final class d extends Lambda implements Function1<NavController, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull NavController navController) {
            int i = R.id.action_to_worldClockActivity;
            Bundle bundle = new Bundle();
            HMDeviceSource hMDeviceSourceFindDeviceSource = BandFeatureTree.this.findDeviceSource();
            bundle.putSerializable("device_type", hMDeviceSourceFindDeviceSource.getType());
            bundle.putSerializable("device_source", hMDeviceSourceFindDeviceSource);
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

    /* JADX INFO: renamed from: getIndex$devicex_zeppRelease, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final void setIndex$devicex_zeppRelease(int i) {
        this.index = i;
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
        putFeature(SoftFeature.DEVICE_SETTING);
        putFeature(SoftFeature.BLUE_TOOTH_BROADCAST);
        putFeature(SoftFeature.FIND_PHONE);
        putFeature(SoftFeature.FIND_DEVICE);
        putFeature(SoftFeature.APPLICATION_SETTING);
        putFeature(SoftFeature.HEALTH_DETECT);
        SoftFeature softFeature = SoftFeature.PUSH_REMINDER;
        putFeature(softFeature);
        putFeature(SoftFeature.DIAL_SKIN);
        putFeature(SoftFeature.DEVICE_APPLICATION_MANAGE);
        putFeature(SoftFeature.VIBRATE_MODE);
        putFeature(SoftFeature.RING_TYPE);
        putFeature(SoftFeature.PLAY_HELP);
        if (ConfigHelperKt.hasFeature(findDeviceSource(), Feature.BACK_LIGHT_SOURCE_S)) {
            putFeature(SoftFeature.NIGHT_MODE);
        }
        int i = R.drawable.icon_app_event_remind;
        int i2 = this.index + 1;
        this.index = i2;
        FeatureTree.setAppItem$default(this, softFeature, i, i2, R.string.event_remind_title, false, a.a, 16, null);
        SoftFeature softFeature2 = SoftFeature.ALARM;
        int i3 = R.drawable.app_sort_alarm_new;
        int i4 = this.index + 1;
        this.index = i4;
        FeatureTree.setAppItem$default(this, softFeature2, i3, i4, R.string.mi_band_alarm, false, b.a, 16, null);
        SoftFeature softFeature3 = SoftFeature.PHONE_ALARM;
        int i5 = R.drawable.icon_app_phone_alarm;
        int i6 = this.index + 1;
        this.index = i6;
        FeatureTree.setAppItem$default(this, softFeature3, i5, i6, R.string.device_phone_alarm, false, null, 48, null);
        SoftFeature softFeature4 = SoftFeature.WEATHER;
        int i7 = R.drawable.app_sort_weather_new;
        int i8 = this.index + 1;
        this.index = i8;
        FeatureTree.setAppItem$default(this, softFeature4, i7, i8, R.string.weather, false, c.a, 16, null);
        SoftFeature softFeature5 = SoftFeature.WORLD_CLOCK;
        int i9 = R.drawable.app_sort_world_clock;
        int i10 = this.index + 1;
        this.index = i10;
        FeatureTree.setAppItem$default(this, softFeature5, i9, i10, R.string.world_clock, false, new d(), 16, null);
        SoftFeature softFeature6 = SoftFeature.NFC_CARD;
        int i11 = R.drawable.app_sort_nfc_new;
        int i12 = this.index + 1;
        this.index = i12;
        FeatureTree.setAppItem$default(this, softFeature6, i11, i12, R.string.app_sort_card_bag, false, e.a, 16, null);
    }
}
