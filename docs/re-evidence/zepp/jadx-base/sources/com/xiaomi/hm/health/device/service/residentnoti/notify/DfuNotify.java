package com.xiaomi.hm.health.device.service.residentnoti.notify;

import android.content.Intent;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\t\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u00020\u00198V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/device/service/residentnoti/notify/DfuNotify;", "Lcom/xiaomi/hm/health/device/service/residentnoti/notify/NotificationMode;", "Lorg/koin/core/component/KoinComponent;", "", "toString", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "", "b", LogUtil.I, "getPriority", "()I", "priority", "", "getShow", "()Z", "show", "getTitle", "()Ljava/lang/String;", "title", "getMsg", "msg", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "intent", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DfuNotify extends NotificationMode implements KoinComponent {

    @NotNull
    public static final DfuNotify INSTANCE;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final int priority;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        final DfuNotify dfuNotify = new DfuNotify();
        INSTANCE = dfuNotify;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.service.residentnoti.notify.DfuNotify$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceXNavigator invoke() {
                KoinComponent koinComponent = dfuNotify;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
        priority = 2;
    }

    private DfuNotify() {
    }

    private final DeviceXNavigator a() {
        return (DeviceXNavigator) deviceXNavigator.getValue();
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public Intent getIntent() {
        return a().createStartUpActivityIntent(Boolean.TRUE);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public String getMsg() {
        return IntroduceShuffleFactoryKt.getString(R.string.system_upgrading_tips);
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    public int getPriority() {
        return priority;
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    public boolean getShow() {
        return false;
    }

    @Override // com.xiaomi.hm.health.device.service.residentnoti.notify.NotificationMode
    @NotNull
    public String getTitle() {
        return IntroduceShuffleFactoryKt.getString(R.string.system_upgrading);
    }

    @NotNull
    public String toString() {
        return "DfuNotify, show: " + getShow();
    }
}
