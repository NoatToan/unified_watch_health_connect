package com.xiaomi.hm.health.device.setting.ui.event;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.health.ui.HealthDetectSettingActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.setting.viewmodel.DeviceFeatureViewModel;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\u00020\u000f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u001d\u0010\u0017\u001a\u00020\u00148B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\f\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/event/HealthDetectClickedImpl;", "Lcom/xiaomi/hm/health/device/setting/ui/event/SettingItemClicked;", "Lorg/koin/core/component/KoinComponent;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "onClicked", "Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;", "operationTypeProvider", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "b", "Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;", "viewModel", "Lcom/huami/devicex/manager/DeviceManagerApi;", "c", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "(Lcom/xiaomi/hm/health/device/setting/ui/event/OperationTypeProvider;Lcom/xiaomi/hm/health/device/setting/viewmodel/DeviceFeatureViewModel;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectClickedImpl implements SettingItemClicked, KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final OperationTypeProvider operationTypeProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final DeviceFeatureViewModel viewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDetectClickedImpl(@NotNull OperationTypeProvider operationTypeProvider, @NotNull DeviceFeatureViewModel deviceFeatureViewModel) {
        this.operationTypeProvider = operationTypeProvider;
        this.viewModel = deviceFeatureViewModel;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.event.HealthDetectClickedImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.event.HealthDetectClickedImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    private final DeviceManagerApi a() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceXNavigator b() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.event.SettingItemClicked
    public void onClicked(@NotNull Context context) {
        if (HMDeviceConfig.hasFeatureG3Device()) {
            context.startActivity(new Intent(context, (Class<?>) HealthDetectSettingActivity.class));
        } else {
            this.viewModel.loadHrDetectSetting(true);
        }
        CincoAnalytics.cincoOperateAnalytics("HeartRateDetect");
        Analytics.recordEvent(new CountEventBuilder(this.operationTypeProvider.loadOperatorType()).setValue("HeartRateDetect"));
    }
}
