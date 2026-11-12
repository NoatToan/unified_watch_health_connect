package com.xiaomi.hm.health.bt.proxy;

import com.xiaomi.hm.health.bt.device.IDeviceFeature;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u000bR1\u0010\f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR1\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u000e\u0010\u0005\u0012\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/proxy/ProxyContainer;", "", "Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;", "<set-?>", "b", "Lkotlin/properties/ReadWriteProperty;", "getProxy", "()Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;", "setProxy", "(Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;)V", "getProxy$annotations", "()V", "proxy", "Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;", "c", "getDeviceFeature", "()Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;", "setDeviceFeature", "(Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;)V", "getDeviceFeature$annotations", "deviceFeature", "<init>", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ProxyContainer {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty proxy;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty deviceFeature;
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(ProxyContainer.class), "proxy", "getProxy()Lcom/xiaomi/hm/health/bt/proxy/BTNameCallback;")), Reflection.mutableProperty0(new MutablePropertyReference0Impl(Reflection.getOrCreateKotlinClass(ProxyContainer.class), "deviceFeature", "getDeviceFeature()Lcom/xiaomi/hm/health/bt/device/IDeviceFeature;"))};

    @NotNull
    public static final ProxyContainer INSTANCE = new ProxyContainer();

    static {
        Delegates delegates = Delegates.INSTANCE;
        proxy = delegates.notNull();
        deviceFeature = delegates.notNull();
    }

    private ProxyContainer() {
    }

    @NotNull
    public static final IDeviceFeature getDeviceFeature() {
        return (IDeviceFeature) deviceFeature.getValue(INSTANCE, a[1]);
    }

    @JvmStatic
    public static /* synthetic */ void getDeviceFeature$annotations() {
    }

    @NotNull
    public static final BTNameCallback getProxy() {
        return (BTNameCallback) proxy.getValue(INSTANCE, a[0]);
    }

    @JvmStatic
    public static /* synthetic */ void getProxy$annotations() {
    }

    public static final void setDeviceFeature(@NotNull IDeviceFeature iDeviceFeature) {
        deviceFeature.setValue(INSTANCE, a[1], iDeviceFeature);
    }

    public static final void setProxy(@NotNull BTNameCallback bTNameCallback) {
        proxy.setValue(INSTANCE, a[0], bTNameCallback);
    }
}
