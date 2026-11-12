package com.xiaomi.hm.health.device.service.residentnoti.notify;

import android.content.Intent;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\u00020\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001d\u0010\u000b\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u001a8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/service/residentnoti/notify/ForegroundNotify;", "Lcom/xiaomi/hm/health/device/service/residentnoti/notify/NotificationMode;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "a", "Lkotlin/Lazy;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "b", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "", "getShow", "()Z", "show", "", "getPriority", "()I", "priority", "", "getTitle", "()Ljava/lang/String;", "title", "getMsg", "msg", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "intent", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class ForegroundNotify extends NotificationMode implements KoinComponent {

    @NotNull
    public static final ForegroundNotify INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceXNavigator;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final ForegroundNotify foregroundNotify = new ForegroundNotify();
        INSTANCE = foregroundNotify;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.service.residentnoti.notify.ForegroundNotify$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceUtilsApi invoke() {
                KoinComponent koinComponent = foregroundNotify;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.service.residentnoti.notify.ForegroundNotify$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = foregroundNotify;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    private ForegroundNotify() {
    }

    private final DeviceUtilsApi a() {
        return (DeviceUtilsApi) deviceUtilsApi.getValue();
    }

    private final DeviceXNavigator b() {
        return (DeviceXNavigator) deviceXNavigator.getValue();
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public Intent getIntent() {
        return DeviceXNavigator.DefaultImpls.createStartUpActivityIntent$default(b(), null, 1, null);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public String getMsg() {
        return DeviceXFunctionsKt.getContext().getString(R.string.desc_running_foreground);
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    public int getPriority() {
        return 0;
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    public boolean getShow() {
        return a().isNotificationOn();
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public String getTitle() {
        return DeviceXFunctionsKt.getContext().getString(R.string.tip_kindly);
    }
}
