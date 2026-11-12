package com.xiaomi.hm.health.device.setting.ui.event;

import android.content.Context;
import androidx.p010navigation.NavController;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.settings.alert.AlertItemFactory;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\b\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/event/NotificationAndReminderClickedImpl;", "Lcom/xiaomi/hm/health/device/setting/ui/event/SettingItemClicked;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "onClicked", "Landroidx/navigation/NavController;", "a", "Landroidx/navigation/NavController;", "navController", "Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;", "operationTypeProvider", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "alertItemFactory", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "e", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "(Landroidx/navigation/NavController;Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class NotificationAndReminderClickedImpl implements SettingItemClicked, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final NavController navController;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final OperationTypeProvider operationTypeProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter = KoinJavaComponent.inject$default(DeviceCenter.class, null, null, 6, null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy alertItemFactory = KoinJavaComponent.inject$default(AlertItemFactory.class, null, null, 6, null);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX WARN: Multi-variable type inference failed */
    public NotificationAndReminderClickedImpl(@Nullable NavController navController, @NotNull OperationTypeProvider operationTypeProvider) {
        this.navController = navController;
        this.operationTypeProvider = operationTypeProvider;
        final Qualifier qualifier = null;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.event.NotificationAndReminderClickedImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
    }

    private final AlertItemFactory a() {
        return (AlertItemFactory) this.alertItemFactory.getValue();
    }

    private final DeviceCenter b() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    private final DeviceXNavigator c() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.event.SettingItemClicked
    public void onClicked(@NotNull Context context) {
        CincoAnalytics.cincoOperateAnalytics("More");
        Analytics.recordEvent(new CountEventBuilder(this.operationTypeProvider.loadOperatorType()).setValue("More"));
        if (a().create(b().getDeviceSource()).isEmpty()) {
            c().startAlertListActivityNew(context);
            return;
        }
        NavController navController = this.navController;
        if (navController == null) {
            return;
        }
        navController.navigate(R.id.action_to_alertSettings);
    }
}
