package com.xiaomi.hm.health.homepage.manager.sync;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.module.homepage.sync.manager.IDeviceJumpManager;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import com.xiaomi.hm.health.device.HMWeightSettingActivity;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
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
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001d\u0010\u0014\u001a\u00020\u00108B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001d\u0010\u0018\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/xiaomi/hm/health/homepage/manager/sync/DeviceJumpManagerImpl;", "Lcom/huami/module/homepage/sync/manager/IDeviceJumpManager;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "c", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "f", "i", "g", "h", "e", GoogleApiAvailabilityLight.a, "jumpToDevicePage", "Lcom/huami/devicex/manager/DeviceManagerApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "b", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "navigator", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceJumpManagerImpl implements IDeviceJumpManager, KoinComponentAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigator;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.MILI.ordinal()] = 1;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 2;
            iArr[HMDeviceType.WATCH.ordinal()] = 3;
            iArr[HMDeviceType.TREADMILL.ordinal()] = 4;
            iArr[HMDeviceType.HEADSET.ordinal()] = 5;
            iArr[HMDeviceType.EARBUD.ordinal()] = 6;
            iArr[HMDeviceType.VDevice.ordinal()] = 7;
            iArr[HMDeviceType.SENSORHUB.ordinal()] = 8;
            iArr[HMDeviceType.SHOES.ordinal()] = 9;
            iArr[HMDeviceType.HEARING_AID.ordinal()] = 10;
            iArr[HMDeviceType.BLOOD_PRESSURE.ordinal()] = 11;
            iArr[HMDeviceType.OTHER.ordinal()] = 12;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceJumpManagerImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.homepage.manager.sync.DeviceJumpManagerImpl$special$$inlined$inject$default$1
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
        this.navigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.homepage.manager.sync.DeviceJumpManagerImpl$special$$inlined$inject$default$2
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
        return (DeviceXNavigator) this.navigator.getValue();
    }

    private final void c(Context context) {
        if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        }
        context.startActivity(new Intent(context, (Class<?>) HMUnifySelectDeviceActivity.class));
    }

    private final void d(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HmEarbudMusicActivity.class));
    }

    private final void e(Context context, HMDeviceType deviceType) {
        HMHeadsetSettingActivity.INSTANCE.start(context, a().getDeviceBound(deviceType).getDevice_address());
    }

    private final void f(Context context, HMDeviceType deviceType) {
        b().navigateToDeviceSetting(context, a().getBoundDeviceSource(deviceType));
    }

    private final void g(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMTreadmillSettingActivity.class));
    }

    private final void h(Context context, HMDeviceType deviceType) {
        Bundle bundle = new Bundle();
        bundle.putString(BaseDeviceStatusActivity.KEY_AREA, SelectAreaHelper.getArea().getValue());
        BaseDeviceStatusActivity.invokeDeviceStatusActivity(context, a().getDeviceBound(deviceType).getDevice_address(), bundle);
    }

    private final void i(Context context) {
        context.startActivity(new Intent(context, (Class<?>) HMWeightSettingActivity.class));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.module.homepage.sync.manager.IDeviceJumpManager
    public void jumpToDevicePage(@NotNull Context context, @Nullable HMDeviceType deviceType) {
        switch (deviceType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[deviceType.ordinal()]) {
            case -1:
                c(context);
                break;
            case 1:
                f(context, deviceType);
                break;
            case 2:
                i(context);
                break;
            case 3:
                h(context, deviceType);
                break;
            case 4:
                g(context);
                break;
            case 5:
                e(context, deviceType);
                break;
            case 6:
                d(context);
                break;
        }
    }
}
