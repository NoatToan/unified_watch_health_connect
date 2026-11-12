package com.xiaomi.hm.health.healthdata.koin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.temperature.model.usecase.AddManualTempUseCase;
import com.huami.bodymeasurements.temperature.model.usecase.GetTempHistoryDataUseCase;
import com.huami.health.service.HealthService;
import com.xiaomi.hm.health.device.feature.sync.job.headset.IHearingInfoSyncJobHandler;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApi;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApiImpl;
import com.xiaomi.hm.health.healthdata.api.RemoteHealthData;
import com.xiaomi.hm.health.healthdata.core.HealthDataDb;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo;
import com.xiaomi.hm.health.healthdata.repository.BodyCompositionRepo;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.repository.HealthDataRepo;
import com.xiaomi.hm.health.healthdata.service.HealthServiceImpl;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.AddHealthDataViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.ChartDataViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.DataDetailBaseViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.HealthDataViewModel;
import com.xiaomi.hm.health.healthdata.utils.headset.HearingHealthCoroutineScope;
import com.xiaomi.hm.health.healthdata.utils.headset.HearingInfoSyncJobHandlerImpl;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.Koin;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "getHealthDataModule", "()Lorg/koin/core/module/Module;", "healthDataModule", "b", "getViewModelModule", "viewModelModule", "c", "getRepositoryModule", "repositoryModule", "", GoogleApiAvailabilityLight.a, "[Lorg/koin/core/module/Module;", "getHealthDataModules", "()[Lorg/koin/core/module/Module;", "healthDataModules", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class HealthDataModulesKt {

    @NotNull
    private static final Module a;

    @NotNull
    private static final Module b;

    @NotNull
    private static final Module c;

    @NotNull
    private static final Module[] d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0959a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final C0959a a = new C0959a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/core/HealthDataDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0960a extends Lambda implements Function2<Scope, ParametersHolder, HealthDataDb> {
                public static final C0960a a = new C0960a();

                public C0960a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HealthDataDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return HealthDataDb.INSTANCE.init(ModuleExtKt.androidContext(scope));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, ChartRepo> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ChartRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new ChartRepo();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, HealthDataWebApi> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HealthDataWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HealthDataWebApiImpl();
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a$d */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, UserDataRemoteAPI> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final UserDataRemoteAPI invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new RemoteHealthData((HealthDataWebApi) scope.get(Reflection.getOrCreateKotlinClass(HealthDataWebApi.class), null, null));
                }
            }

            /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$a$a$e */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/utils/headset/HearingHealthCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, HearingHealthCoroutineScope> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final HearingHealthCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new HearingHealthCoroutineScope();
                }
            }

            public C0959a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C0960a c0960a = C0960a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HealthDataDb.class), null, c0960a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                b bVar = b.a;
                Module module = scopeDSL.getModule();
                Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(ChartRepo.class), null, bVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
                Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HealthDataWebApi.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UserDataRemoteAPI.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                e eVar = e.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HearingHealthCoroutineScope.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/service/HealthService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, HealthService> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthServiceImpl((HealthCoreDataRepo) Koin.getOrCreateScope$default(scope.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null).get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/device/feature/sync/job/headset/IHearingInfoSyncJobHandler;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, IHearingInfoSyncJobHandler> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IHearingInfoSyncJobHandler invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HearingInfoSyncJobHandlerImpl();
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named("health_data"), C0959a.a);
            b bVar = b.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(HealthService.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            c cVar = c.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(IHearingInfoSyncJobHandler.class), null, cVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/repository/HealthDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, HealthDataRepo> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDataRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthDataRepo((HealthCoreDataRepo) Koin.getOrCreateScope$default(scope.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null).get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/repository/BodyCompositionRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0961b extends Lambda implements Function2<Scope, ParametersHolder, BodyCompositionRepo> {
            public static final C0961b a = new C0961b();

            public C0961b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BodyCompositionRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BodyCompositionRepo();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, HealthCoreDataRepo> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthCoreDataRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthCoreDataRepo(ScopesKt.healthDataDb(scope.getKoin()).userHealthDataDao(), ScopesKt.healthDataDb(scope.getKoin()).syncLogDao(), ScopesKt.healthWebApi(scope.getKoin()));
            }
        }

        public b() {
            super(1);
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(HealthDataRepo.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            C0961b c0961b = C0961b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(BodyCompositionRepo.class), null, c0961b, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/AddHealthDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, AddHealthDataViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AddHealthDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AddHealthDataViewModel((HealthCoreDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null), (AddManualTempUseCase) com.huami.bodymeasurements.temperature.model.koin.ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AddManualTempUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, HealthDataDetailViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDataDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthDataDetailViewModel((BodyCompositionRepo) scope.get(Reflection.getOrCreateKotlinClass(BodyCompositionRepo.class), null, null), (HealthCoreDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.hm.health.healthdata.koin.HealthDataModulesKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/HealthDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0962c extends Lambda implements Function2<Scope, ParametersHolder, HealthDataViewModel> {
            public static final C0962c a = new C0962c();

            public C0962c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthDataViewModel((HealthCoreDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null), (GetTempHistoryDataUseCase) com.huami.bodymeasurements.temperature.model.koin.ScopesKt.temperatureScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(GetTempHistoryDataUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/ChartDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, ChartDataViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChartDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ChartDataViewModel((HealthCoreDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null), (ChartRepo) Koin.getOrCreateScope$default(scope.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null).get(Reflection.getOrCreateKotlinClass(ChartRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/DataDetailBaseViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, DataDetailBaseViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DataDetailBaseViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DataDetailBaseViewModel((HealthDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthDataRepo.class), null, null), (HealthCoreDataRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthCoreDataRepo.class), null, null));
            }
        }

        public c() {
            super(1);
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(AddHealthDataViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(HealthDataDetailViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            C0962c c0962c = C0962c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(HealthDataViewModel.class), null, c0962c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(ChartDataViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            e eVar = e.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(DataDetailBaseViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, a.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, c.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, b.a, 1, null);
        c = moduleModule$default3;
        d = new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3};
    }

    private static final /* synthetic */ <T> T a(Scope scope, Qualifier qualifier) {
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object b(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope orCreateScope$default = Koin.getOrCreateScope$default(scope.getKoin(), "health_data", QualifierKt.named("health_data"), null, 4, null);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return orCreateScope$default.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Module getHealthDataModule() {
        return a;
    }

    @NotNull
    public static final Module[] getHealthDataModules() {
        return d;
    }

    @NotNull
    public static final Module getRepositoryModule() {
        return c;
    }

    @NotNull
    public static final Module getViewModelModule() {
        return b;
    }
}
