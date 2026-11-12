package com.huami.devicex;

import android.app.Application;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.core.agps.impl.store.AgpsTimeStore;
import com.huami.devicex.injection.AppStateApi;
import com.huami.devicex.injection.ContextProvider;
import com.huami.devicex.injection.action.SportInfoActionFactory;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.injection.data.WeatherApi;
import com.huami.devicex.manager.DeviceXFlavorService;
import com.huami.devicex.manager.FlavorService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.life.LifeCycleFilter;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bQ\u0010RJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u0000J\u001c\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0#J\b\u0010&\u001a\u00020\u0018H\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R+\u00106\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00068@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010\n\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b7\u00101\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R+\u0010\r\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b<\u00101\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bA\u00101\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER+\u0010\u0013\u001a\u00020\u00122\u0006\u0010/\u001a\u00020\u00128@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bF\u00101\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lcom/huami/devicex/DeviceXBuilder;", "Lcom/huami/devicex/injection/ContextProvider;", "Landroid/app/Application;", "getContext", DbUtils.Const.Table.CONTEXT, "setContext", "Lcom/huami/devicex/injection/AppStateApi;", "stateApi", "setAppStateApi", "Lcom/huami/devicex/injection/action/SportInfoActionFactory;", "sportInfoActionFactory", "setSportInfoActionFactory", "Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "agpsTimeStoreApi", "setAgpsTimeStoreApi", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "setPropertyStoreApi", "Lcom/huami/devicex/injection/data/WeatherApi;", "weatherApi", "setWeatherApi", "Lcom/xiaomi/hm/health/device/setting/life/LifeCycleFilter;", "lifeCycleFilter", "setLifeCycleFilter", "", "isDebug", "", "setDebug", "Lcom/huami/devicex/manager/FlavorService;", "service", "setFlavor", "getFlavor", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "", "flavorId", "Lkotlin/Function0;", "action", "whenFlavorMatch", "isFlavorZepp", "b", "Landroid/app/Application;", "c", "Z", "debug", GoogleApiAvailabilityLight.a, "Lcom/huami/devicex/manager/FlavorService;", "flavorService", "<set-?>", "e", "Lkotlin/properties/ReadWriteProperty;", "getAppStateApi$devicex_zeppRelease", "()Lcom/huami/devicex/injection/AppStateApi;", "setAppStateApi$devicex_zeppRelease", "(Lcom/huami/devicex/injection/AppStateApi;)V", "appStateApi", "f", "getSportInfoActionFactory$devicex_zeppRelease", "()Lcom/huami/devicex/injection/action/SportInfoActionFactory;", "setSportInfoActionFactory$devicex_zeppRelease", "(Lcom/huami/devicex/injection/action/SportInfoActionFactory;)V", "g", "getAgpsTimeStoreApi$devicex_zeppRelease", "()Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;", "setAgpsTimeStoreApi$devicex_zeppRelease", "(Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;)V", "h", "getPropertyStoreApi$devicex_zeppRelease", "()Lcom/huami/devicex/injection/data/PropertyStoreApi;", "setPropertyStoreApi$devicex_zeppRelease", "(Lcom/huami/devicex/injection/data/PropertyStoreApi;)V", "i", "getWeatherApi$devicex_zeppRelease", "()Lcom/huami/devicex/injection/data/WeatherApi;", "setWeatherApi$devicex_zeppRelease", "(Lcom/huami/devicex/injection/data/WeatherApi;)V", z.j, "Lcom/xiaomi/hm/health/device/setting/life/LifeCycleFilter;", "getLifeCycleFilter$devicex_zeppRelease", "()Lcom/xiaomi/hm/health/device/setting/life/LifeCycleFilter;", "setLifeCycleFilter$devicex_zeppRelease", "(Lcom/xiaomi/hm/health/device/setting/life/LifeCycleFilter;)V", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DeviceXBuilder implements ContextProvider {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static Application context;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static boolean debug;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private static FlavorService flavorService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty appStateApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty sportInfoActionFactory;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty agpsTimeStoreApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty propertyStoreApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private static final ReadWriteProperty weatherApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private static LifeCycleFilter lifeCycleFilter;
    public static final /* synthetic */ KProperty<Object>[] a = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeviceXBuilder.class), "appStateApi", "getAppStateApi$devicex_zeppRelease()Lcom/huami/devicex/injection/AppStateApi;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeviceXBuilder.class), "sportInfoActionFactory", "getSportInfoActionFactory$devicex_zeppRelease()Lcom/huami/devicex/injection/action/SportInfoActionFactory;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeviceXBuilder.class), "agpsTimeStoreApi", "getAgpsTimeStoreApi$devicex_zeppRelease()Lcom/huami/device/core/agps/impl/store/AgpsTimeStore;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeviceXBuilder.class), "propertyStoreApi", "getPropertyStoreApi$devicex_zeppRelease()Lcom/huami/devicex/injection/data/PropertyStoreApi;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DeviceXBuilder.class), "weatherApi", "getWeatherApi$devicex_zeppRelease()Lcom/huami/devicex/injection/data/WeatherApi;"))};

    @NotNull
    public static final DeviceXBuilder INSTANCE = new DeviceXBuilder();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "请注意，不要主动使用此方法。非迫不得已，不要使用此方法。";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    static {
        Delegates delegates = Delegates.INSTANCE;
        appStateApi = delegates.notNull();
        sportInfoActionFactory = delegates.notNull();
        agpsTimeStoreApi = delegates.notNull();
        propertyStoreApi = delegates.notNull();
        weatherApi = delegates.notNull();
    }

    private DeviceXBuilder() {
    }

    @NotNull
    public final DeviceXBuilder build() {
        return this;
    }

    @NotNull
    public final AgpsTimeStore getAgpsTimeStoreApi$devicex_zeppRelease() {
        return (AgpsTimeStore) agpsTimeStoreApi.getValue(this, a[2]);
    }

    @NotNull
    public final AppStateApi getAppStateApi$devicex_zeppRelease() {
        return (AppStateApi) appStateApi.getValue(this, a[0]);
    }

    @Override // com.huami.devicex.injection.ContextProvider
    @NotNull
    public Application getContext() {
        Application application = context;
        Objects.requireNonNull(application, "请先配置Context");
        return application;
    }

    @NotNull
    public final FlavorService getFlavor() throws Exception {
        if (flavorService == null) {
            flavorService = new DeviceXFlavorService();
        }
        FlavorService flavorService2 = flavorService;
        if (flavorService2 != null) {
            return flavorService2;
        }
        throw new Exception("无法处理当前APP接入的创建区分,请及时处理");
    }

    @Nullable
    public final LifeCycleFilter getLifeCycleFilter$devicex_zeppRelease() {
        return lifeCycleFilter;
    }

    @NotNull
    public final PropertyStoreApi getPropertyStoreApi$devicex_zeppRelease() {
        return (PropertyStoreApi) propertyStoreApi.getValue(this, a[3]);
    }

    @NotNull
    public final SportInfoActionFactory getSportInfoActionFactory$devicex_zeppRelease() {
        return (SportInfoActionFactory) sportInfoActionFactory.getValue(this, a[1]);
    }

    @NotNull
    public final WeatherApi getWeatherApi$devicex_zeppRelease() {
        return (WeatherApi) weatherApi.getValue(this, a[4]);
    }

    public final boolean isDebug() {
        return debug;
    }

    @Deprecated(message = "will delete in feature", replaceWith = @ReplaceWith(expression = "whenFlavorMatch", imports = {}))
    public final boolean isFlavorZepp() {
        return getFlavor().findFlavor().getId() == 1;
    }

    @NotNull
    public final DeviceXBuilder setAgpsTimeStoreApi(@NotNull AgpsTimeStore agpsTimeStoreApi2) {
        setAgpsTimeStoreApi$devicex_zeppRelease(agpsTimeStoreApi2);
        return this;
    }

    public final void setAgpsTimeStoreApi$devicex_zeppRelease(@NotNull AgpsTimeStore agpsTimeStore) {
        agpsTimeStoreApi.setValue(this, a[2], agpsTimeStore);
    }

    @NotNull
    public final DeviceXBuilder setAppStateApi(@NotNull AppStateApi stateApi) {
        setAppStateApi$devicex_zeppRelease(stateApi);
        return this;
    }

    public final void setAppStateApi$devicex_zeppRelease(@NotNull AppStateApi appStateApi2) {
        appStateApi.setValue(this, a[0], appStateApi2);
    }

    @NotNull
    public final DeviceXBuilder setContext(@NotNull Application context2) {
        context = context2;
        return this;
    }

    public final void setDebug(boolean isDebug) {
        debug = isDebug;
    }

    @NotNull
    public final DeviceXBuilder setFlavor(@NotNull FlavorService service) {
        HMLog.warn$default(null, null, a.a, 3, null);
        flavorService = service;
        return this;
    }

    @NotNull
    public final DeviceXBuilder setLifeCycleFilter(@NotNull LifeCycleFilter lifeCycleFilter2) {
        lifeCycleFilter = lifeCycleFilter2;
        return this;
    }

    public final void setLifeCycleFilter$devicex_zeppRelease(@Nullable LifeCycleFilter lifeCycleFilter2) {
        lifeCycleFilter = lifeCycleFilter2;
    }

    @NotNull
    public final DeviceXBuilder setPropertyStoreApi(@NotNull PropertyStoreApi propertyStoreApi2) {
        setPropertyStoreApi$devicex_zeppRelease(propertyStoreApi2);
        return this;
    }

    public final void setPropertyStoreApi$devicex_zeppRelease(@NotNull PropertyStoreApi propertyStoreApi2) {
        propertyStoreApi.setValue(this, a[3], propertyStoreApi2);
    }

    @NotNull
    public final DeviceXBuilder setSportInfoActionFactory(@NotNull SportInfoActionFactory sportInfoActionFactory2) {
        setSportInfoActionFactory$devicex_zeppRelease(sportInfoActionFactory2);
        return this;
    }

    public final void setSportInfoActionFactory$devicex_zeppRelease(@NotNull SportInfoActionFactory sportInfoActionFactory2) {
        sportInfoActionFactory.setValue(this, a[1], sportInfoActionFactory2);
    }

    @NotNull
    public final DeviceXBuilder setWeatherApi(@NotNull WeatherApi weatherApi2) {
        setWeatherApi$devicex_zeppRelease(weatherApi2);
        return this;
    }

    public final void setWeatherApi$devicex_zeppRelease(@NotNull WeatherApi weatherApi2) {
        weatherApi.setValue(this, a[4], weatherApi2);
    }

    public final void whenFlavorMatch(int flavorId, @NotNull Function0<Unit> action) {
        if (getFlavor().findFlavor().getId() == flavorId) {
            try {
                action.invoke();
            } catch (Throwable th) {
                HMLog.error$default(null, null, null, new b(th), 7, null);
            }
        }
    }
}
