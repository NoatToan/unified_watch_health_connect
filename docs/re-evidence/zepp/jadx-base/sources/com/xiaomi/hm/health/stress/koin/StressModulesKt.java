package com.xiaomi.hm.health.stress.koin;

import com.huami.account.HMLoginManager;
import com.huami.stress.domain.data.AllDayStressRepositoryImpl;
import com.huami.stress.domain.data.SingleStressRepositoryImpl;
import com.huami.stress.domain.data.StressServiceImpl;
import com.huami.stress.domain.data.device.StressDeviceApi;
import com.huami.stress.domain.data.local.StressDatabase;
import com.huami.stress.domain.data.remote.StressWebApi;
import com.huami.stress.domain.data.remote.StressWebApiImpl;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.service.StressDeviceService;
import com.huami.stress.domain.usecase.DeleteSingleStressUseCase;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.huami.stress.domain.usecase.GetLatestStressFlowUseCase;
import com.huami.stress.domain.usecase.GetLatestStressUseCase;
import com.huami.stress.domain.usecase.SaveStressFromDeviceUseCase;
import com.huami.stress.domain.usecase.SaveUnSyncSingleStressUseCase;
import com.huami.stress.domain.usecase.SyncStressFromServerUseCase;
import com.huami.stress.domain.usecase.SyncStressToServerUseCase;
import com.huami.stress.domain.usecase.device.GetMeasureFrequencyUseCase;
import com.huami.stress_service.StressConfig;
import com.huami.stress_service.StressService;
import com.xiaomi.hm.health.baseutil.MD5Util;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApi;
import com.xiaomi.hm.health.healthdata.api.HealthDataWebApiImpl;
import com.xiaomi.hm.health.healthdata.repository.ChartRepo;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressDailyDetailViewModel;
import com.xiaomi.hm.health.healthdata.ui.viewmodel.stress.StressStatisticsDetailViewModel;
import com.xiaomi.hm.health.healthdata.utils.stress.StressDeviceServiceImpl;
import com.xiaomi.hm.health.healthtag.core.datasource.HealthTagDataSource;
import com.xiaomi.hm.health.healthtag.core.datasource.IHealthTagDataSource;
import com.xiaomi.hm.health.healthtag.core.repo.HealthTagRepo;
import com.xiaomi.hm.health.stress.StressCoroutineScope;
import com.xiaomi.hm.health.stress.StressScopeNames;
import com.xiaomi.hm.health.stress.StressScopeNamesKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getStressModule", "()Lorg/koin/core/module/Module;", "stressModule", "app_midongPlayRelease"}, k = 2, mv = {1, 5, 1})
public final class StressModulesKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, new Function1<Module, Unit>() { // from class: com.xiaomi.hm.health.stress.koin.StressModulesKt$stressModule$1

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.xiaomi.hm.health.stress.koin.StressModulesKt$stressModule$1$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/data/local/StressDatabase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C1012a extends Lambda implements Function2<Scope, ParametersHolder, StressDatabase> {
                public static final C1012a a = new C1012a();

                public C1012a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final StressDatabase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    String strValueOf = String.valueOf(HMLoginManager.getValidUid());
                    return StressDatabase.Companion.create(ModuleExtKt.androidContext(scope), "stress__" + MD5Util.getMD5String(strValueOf) + ".db");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class b extends Lambda implements Function2<Scope, ParametersHolder, SingleStressRepository> {
                public static final b a = new b();

                public b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final SingleStressRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SingleStressRepositoryImpl(((StressDatabase) scope.get(Reflection.getOrCreateKotlinClass(StressDatabase.class), null, null)).singleStressDao(), (StressDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(StressDeviceApi.class), null, null), (StressWebApi) scope.get(Reflection.getOrCreateKotlinClass(StressWebApi.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, AllDayStressRepository> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AllDayStressRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new AllDayStressRepositoryImpl(((StressDatabase) scope.get(Reflection.getOrCreateKotlinClass(StressDatabase.class), null, null)).allDayStressDao(), (StressDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(StressDeviceApi.class), null, null), (StressWebApi) scope.get(Reflection.getOrCreateKotlinClass(StressWebApi.class), null, null));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/service/StressDeviceService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, StressDeviceService> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final StressDeviceService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new StressDeviceServiceImpl();
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/stress/StressCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, StressCoroutineScope> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final StressCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new StressCoroutineScope();
                }
            }

            public a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
                invoke2(scopeDSL);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ScopeDSL scopeDSL) {
                C1012a c1012a = C1012a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(StressDatabase.class), null, c1012a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                b bVar = b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(StressDeviceService.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                e eVar = e.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(StressCoroutineScope.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/GetCombineStressBetweenStampUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, GetCombineStressBetweenStampUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetCombineStressBetweenStampUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetCombineStressBetweenStampUseCase((AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null), (SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/repository/ChartRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, ChartRepo> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ChartRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ChartRepo();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/SaveUnSyncSingleStressUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, SaveUnSyncSingleStressUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveUnSyncSingleStressUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SaveUnSyncSingleStressUseCase((SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/DeleteSingleStressUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, DeleteSingleStressUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final DeleteSingleStressUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DeleteSingleStressUseCase((SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/GetLatestStressUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, GetLatestStressUseCase> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLatestStressUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLatestStressUseCase((AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null), (SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/GetLatestStressFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, GetLatestStressFlowUseCase> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLatestStressFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLatestStressFlowUseCase((AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null), (SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/api/HealthDataWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, HealthDataWebApi> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthDataWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthDataWebApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthtag/core/repo/HealthTagRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, HealthTagRepo> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HealthTagRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthTagRepo((HealthDataWebApi) scope.get(Reflection.getOrCreateKotlinClass(HealthDataWebApi.class), null, null), (IHealthTagDataSource) scope.get(Reflection.getOrCreateKotlinClass(IHealthTagDataSource.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressDailyDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, StressDailyDetailViewModel> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StressDailyDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StressDailyDetailViewModel((GetCombineStressBetweenStampUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetCombineStressBetweenStampUseCase.class), null, null), (GetMeasureFrequencyUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetMeasureFrequencyUseCase.class), null, null), (HealthTagRepo) scope.get(Reflection.getOrCreateKotlinClass(HealthTagRepo.class), null, null), (ChartRepo) scope.get(Reflection.getOrCreateKotlinClass(ChartRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthdata/ui/viewmodel/stress/StressStatisticsDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, StressStatisticsDetailViewModel> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StressStatisticsDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StressStatisticsDetailViewModel((GetCombineStressBetweenStampUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetCombineStressBetweenStampUseCase.class), null, null), (ChartRepo) scope.get(Reflection.getOrCreateKotlinClass(ChartRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, StressWebApi> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StressWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StressWebApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, StressDeviceApi> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StressDeviceApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StressDeviceApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/healthtag/core/datasource/IHealthTagDataSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, IHealthTagDataSource> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IHealthTagDataSource invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new HealthTagDataSource((HealthDataWebApi) scope.get(Reflection.getOrCreateKotlinClass(HealthDataWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress_service/StressService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, StressService> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StressService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StressServiceImpl((GetLatestStressFlowUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetLatestStressFlowUseCase.class), null, null), (SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null), (AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/SaveStressFromDeviceUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, SaveStressFromDeviceUseCase> {
            public static final p a = new p();

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SaveStressFromDeviceUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SaveStressFromDeviceUseCase((SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null), (AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/SyncStressFromServerUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, SyncStressFromServerUseCase> {
            public static final q a = new q();

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncStressFromServerUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncStressFromServerUseCase((SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null), (AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/SyncStressToServerUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, SyncStressToServerUseCase> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncStressToServerUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncStressToServerUseCase((SingleStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(SingleStressRepository.class), null, null), (AllDayStressRepository) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AllDayStressRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/stress/domain/usecase/device/GetMeasureFrequencyUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class s extends Lambda implements Function2<Scope, ParametersHolder, GetMeasureFrequencyUseCase> {
            public static final s a = new s();

            public s() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetMeasureFrequencyUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetMeasureFrequencyUseCase((StressDeviceService) StressScopeNamesKt.stressScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(StressDeviceService.class), null, null));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            module.scope(QualifierKt.named(StressScopeNames.STRESS), a.a);
            l lVar = l.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StressWebApi.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            m mVar = m.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(StressDeviceApi.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory2 = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory2, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory2);
            }
            new Pair(module, singleInstanceFactory2);
            n nVar = n.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(IHealthTagDataSource.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory3 = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory3, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory3);
            }
            new Pair(module, singleInstanceFactory3);
            o oVar = o.a;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(StressService.class), null, oVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            p pVar = p.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(SaveStressFromDeviceUseCase.class), null, pVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            q qVar = q.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(SyncStressFromServerUseCase.class), null, qVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            r rVar = r.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(SyncStressToServerUseCase.class), null, rVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            s sVar = s.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(GetMeasureFrequencyUseCase.class), null, sVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            b bVar = b.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(GetCombineStressBetweenStampUseCase.class), null, bVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            c cVar = c.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition10 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(ChartRepo.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition10);
            Module.saveMapping$default(module, strIndexKey10, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            d dVar = d.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition11 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(SaveUnSyncSingleStressUseCase.class), null, dVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition11);
            Module.saveMapping$default(module, strIndexKey11, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            e eVar = e.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition12 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(DeleteSingleStressUseCase.class), null, eVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition12);
            Module.saveMapping$default(module, strIndexKey12, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
            f fVar = f.a;
            StringQualifier rootScopeQualifier10 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition13 = new BeanDefinition(rootScopeQualifier10, Reflection.getOrCreateKotlinClass(GetLatestStressUseCase.class), null, fVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, rootScopeQualifier10);
            FactoryInstanceFactory factoryInstanceFactory10 = new FactoryInstanceFactory(beanDefinition13);
            Module.saveMapping$default(module, strIndexKey13, factoryInstanceFactory10, false, 4, null);
            new Pair(module, factoryInstanceFactory10);
            g gVar = g.a;
            StringQualifier rootScopeQualifier11 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition14 = new BeanDefinition(rootScopeQualifier11, Reflection.getOrCreateKotlinClass(GetLatestStressFlowUseCase.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, rootScopeQualifier11);
            FactoryInstanceFactory factoryInstanceFactory11 = new FactoryInstanceFactory(beanDefinition14);
            Module.saveMapping$default(module, strIndexKey14, factoryInstanceFactory11, false, 4, null);
            new Pair(module, factoryInstanceFactory11);
            h hVar = h.a;
            StringQualifier rootScopeQualifier12 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition15 = new BeanDefinition(rootScopeQualifier12, Reflection.getOrCreateKotlinClass(HealthDataWebApi.class), null, hVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, rootScopeQualifier12);
            FactoryInstanceFactory factoryInstanceFactory12 = new FactoryInstanceFactory(beanDefinition15);
            Module.saveMapping$default(module, strIndexKey15, factoryInstanceFactory12, false, 4, null);
            new Pair(module, factoryInstanceFactory12);
            i iVar = i.a;
            StringQualifier rootScopeQualifier13 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition16 = new BeanDefinition(rootScopeQualifier13, Reflection.getOrCreateKotlinClass(HealthTagRepo.class), null, iVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, rootScopeQualifier13);
            FactoryInstanceFactory factoryInstanceFactory13 = new FactoryInstanceFactory(beanDefinition16);
            Module.saveMapping$default(module, strIndexKey16, factoryInstanceFactory13, false, 4, null);
            new Pair(module, factoryInstanceFactory13);
            j jVar = j.a;
            StringQualifier rootScopeQualifier14 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition17 = new BeanDefinition(rootScopeQualifier14, Reflection.getOrCreateKotlinClass(StressDailyDetailViewModel.class), null, jVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, rootScopeQualifier14);
            FactoryInstanceFactory factoryInstanceFactory14 = new FactoryInstanceFactory(beanDefinition17);
            Module.saveMapping$default(module, strIndexKey17, factoryInstanceFactory14, false, 4, null);
            new Pair(module, factoryInstanceFactory14);
            k kVar = k.a;
            StringQualifier rootScopeQualifier15 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition18 = new BeanDefinition(rootScopeQualifier15, Reflection.getOrCreateKotlinClass(StressStatisticsDetailViewModel.class), null, kVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, rootScopeQualifier15);
            FactoryInstanceFactory factoryInstanceFactory15 = new FactoryInstanceFactory(beanDefinition18);
            Module.saveMapping$default(module, strIndexKey18, factoryInstanceFactory15, false, 4, null);
            new Pair(module, factoryInstanceFactory15);
            AnonymousClass20 anonymousClass20 = new Function2<Scope, ParametersHolder, StressConfig>() { // from class: com.xiaomi.hm.health.stress.koin.StressModulesKt$stressModule$1.20
                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final StressConfig invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new StressConfig() { // from class: com.xiaomi.hm.health.stress.koin.StressModulesKt.stressModule.1.20.1
                        @Override // com.huami.stress_service.StressConfig
                        public boolean useL66StressStandard() {
                            return false;
                        }
                    };
                }
            };
            StringQualifier rootScopeQualifier16 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition19 = new BeanDefinition(rootScopeQualifier16, Reflection.getOrCreateKotlinClass(StressConfig.class), null, anonymousClass20, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey19 = BeanDefinitionKt.indexKey(beanDefinition19.getPrimaryType(), null, rootScopeQualifier16);
            FactoryInstanceFactory factoryInstanceFactory16 = new FactoryInstanceFactory(beanDefinition19);
            Module.saveMapping$default(module, strIndexKey19, factoryInstanceFactory16, false, 4, null);
            new Pair(module, factoryInstanceFactory16);
        }
    }, 1, null);

    @NotNull
    public static final Module getStressModule() {
        return a;
    }
}
