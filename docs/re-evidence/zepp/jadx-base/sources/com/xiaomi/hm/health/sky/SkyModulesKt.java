package com.xiaomi.hm.health.sky;

import android.app.Activity;
import android.content.Context;
import com.huami.devicestylepower.IPowerAndStyleManager;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.assist.ISkyDeviceStatusAssistant;
import com.huami.sky.service.SkyBetaService;
import com.huami.sky.ui.navigation.HMAdNavigation;
import com.huami.sky.ui.navigation.HMUpdateManager;
import com.huami.sky.ui.setting.DeviceNavigation;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.Util;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.devicex.manage.api.repository.DeviceRepositoryApi;
import com.xiaomi.hm.health.manager.HMAdManager;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\b\"\"\u0010\u0007\u001a\u00020\u00008\u0006@\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getSkyExternalModule", "()Lorg/koin/core/module/Module;", "getSkyExternalModule$annotations", "()V", "skyExternalModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class SkyModulesKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt$skyExternalModule$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/api/DeviceDataApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, DeviceDataApi> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceDataApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyDeviceDataApiImpl(ModuleExtKt.androidContext(scope), (DeviceRepositoryApi) scope.get(Reflection.getOrCreateKotlinClass(DeviceRepositoryApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/ui/setting/DeviceNavigation;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, DeviceNavigation> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeviceNavigation invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyDeviceNavigationImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/sky/lib/assist/ISkyDeviceStatusAssistant;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ISkyDeviceStatusAssistant> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ISkyDeviceStatusAssistant invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SkyDeviceStatusAssistantImpl((IPowerAndStyleManager) scope.get(Reflection.getOrCreateKotlinClass(IPowerAndStyleManager.class), null, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            a aVar = a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(DeviceNavigation.class), null, bVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            c cVar = c.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(ISkyDeviceStatusAssistant.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            AnonymousClass4 anonymousClass4 = new Function2<Scope, ParametersHolder, SkyBetaService>() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt$skyExternalModule$1.4
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SkyBetaService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SkyBetaService() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt.skyExternalModule.1.4.1
                        @Override // com.huami.sky.service.SkyBetaService
                        public boolean isShowMusicList() {
                            return false;
                        }
                    };
                }
            };
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SkyBetaService.class), null, anonymousClass4, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            AnonymousClass5 anonymousClass5 = new Function2<Scope, ParametersHolder, HMAdNavigation>() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt$skyExternalModule$1.5
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HMAdNavigation invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HMAdNavigation() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt.skyExternalModule.1.5.1
                        @Override // com.huami.sky.ui.navigation.HMAdNavigation
                        public void doJumpAction(@NotNull Context context, @Nullable Integer mode, @Nullable String url, @Nullable String event, @Nullable Map<String, String> extras, @Nullable List<Integer> deviceSources) {
                            HMAdManager.doJumpAction(context, mode, url, event, extras, deviceSources);
                        }
                    };
                }
            };
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(HMAdNavigation.class), null, anonymousClass5, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            AnonymousClass6 anonymousClass6 = new Function2<Scope, ParametersHolder, HMUpdateManager>() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt$skyExternalModule$1.6
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HMUpdateManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HMUpdateManager() { // from class: com.xiaomi.hm.health.sky.SkyModulesKt.skyExternalModule.1.6.1
                        @Override // com.huami.sky.ui.navigation.HMUpdateManager
                        public void updateNow(@NotNull Activity activity) {
                            if (Config.isBuildOversea()) {
                                Util.toPlayStore(activity);
                            } else if (UpdateManager.getInstance().isUpdating(activity)) {
                                CustomToast.showShort(activity, activity.getResources().getString(R.string.updating));
                            } else {
                                UpdateManager.getInstance().checkUpdate(true, activity);
                            }
                        }
                    };
                }
            };
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(HMUpdateManager.class), null, anonymousClass6, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
        }
    }, 1, null);

    @NotNull
    public static final Module getSkyExternalModule() {
        return a;
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void getSkyExternalModule$annotations() {
    }
}
