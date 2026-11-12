package com.huami.device.feature.health;

import android.content.Context;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.device.feature.health.device.DeviceLfEventCase;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.init.HealthInitConfig;
import com.huami.device.feature.health.res.IAppRes;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.profile.slre.HMLFEvent;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/huami/device/feature/health/HealthUi;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/device/feature/health/init/HealthInitConfig;", "config", "", "initConfig", "", "isEnable", "updateDeviceEnable", "Lcom/xiaomi/hm/health/bt/profile/slre/HMLFEvent;", "event", "onLfEvent", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "healthUiModule", "Lcom/huami/device/feature/health/res/IAppRes;", "sAppRes", "Lcom/huami/device/feature/health/res/IAppRes;", "getSAppRes", "()Lcom/huami/device/feature/health/res/IAppRes;", "setSAppRes", "(Lcom/huami/device/feature/health/res/IAppRes;)V", "Landroidx/lifecycle/MutableLiveData;", "b", "Landroidx/lifecycle/MutableLiveData;", "getDeviceEnableLiveData", "()Landroidx/lifecycle/MutableLiveData;", "deviceEnableLiveData", "<init>", "()V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HealthUi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private static Module healthUiModule;
    public static IAppRes sAppRes;

    @NotNull
    public static final HealthUi INSTANCE = new HealthUi();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final MutableLiveData<Boolean> deviceEnableLiveData = new MutableLiveData<>(Boolean.TRUE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ HealthInitConfig a;

        /* JADX INFO: renamed from: com.huami.device.feature.health.HealthUi$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/init/HealthInitConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0343a extends Lambda implements Function2<Scope, ParametersHolder, HealthInitConfig> {
            public final /* synthetic */ HealthInitConfig a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0343a(HealthInitConfig healthInitConfig) {
                super(2);
                this.a = healthInitConfig;
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthInitConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/device/DeviceLfEventCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DeviceLfEventCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceLfEventCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeviceLfEventCase((HealthDevice) scope.get(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HealthInitConfig healthInitConfig) {
            super(1);
            this.a = healthInitConfig;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0343a c0343a = new C0343a(this.a);
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HealthInitConfig.class), null, c0343a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            b bVar = b.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceLfEventCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
        }
    }

    private HealthUi() {
    }

    @NotNull
    public final MutableLiveData<Boolean> getDeviceEnableLiveData() {
        return deviceEnableLiveData;
    }

    @NotNull
    public final IAppRes getSAppRes() {
        IAppRes iAppRes = sAppRes;
        if (iAppRes != null) {
            return iAppRes;
        }
        return null;
    }

    public final void initConfig(@NotNull Context context, @NotNull HealthInitConfig config) {
        setSAppRes(config.getAppRes());
        HealthDetect.INSTANCE.initHealth(context, config.getDevice(), config.getAppApi());
        Module module = healthUiModule;
        if (module != null) {
            DefaultContextExtKt.unloadKoinModules(module);
        }
        Module moduleModule$default = ModuleKt.module$default(false, new a(config), 1, null);
        healthUiModule = moduleModule$default;
        DefaultContextExtKt.loadKoinModules(moduleModule$default);
    }

    public final void onLfEvent(@NotNull HMLFEvent event) {
        DeviceLfEventCase deviceLfEventCase = (DeviceLfEventCase) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(DeviceLfEventCase.class), null, null);
        if (deviceLfEventCase == null) {
            return;
        }
        deviceLfEventCase.onEvent(event);
    }

    public final void setSAppRes(@NotNull IAppRes iAppRes) {
        sAppRes = iAppRes;
    }

    public final void updateDeviceEnable(boolean isEnable) {
        deviceEnableLiveData.postValue(Boolean.valueOf(isEnable));
    }
}
