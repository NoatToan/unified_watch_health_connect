package com.xiaomi.hm.health.bodyfat.koin;

import com.huami.health.bodymeasurements.bodyfat_service.BodyfatService;
import com.xiaomi.hm.health.bodyfat.sevice.BodyfatServiceImpl;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepo;
import com.xiaomi.hm.health.bodyfat.slimming.repo.LoseWeightRepoImpl;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightPlanEnterViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightSelectSportViewModel;
import com.xiaomi.hm.health.bodyfat.slimming.viewmodel.LoseWeightViewModel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
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

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getBodyFatModule", "()Lorg/koin/core/module/Module;", "bodyFatModule", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class BodyFatModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.xiaomi.hm.health.bodyfat.koin.BodyFatModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/bodymeasurements/bodyfat_service/BodyfatService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0782a extends Lambda implements Function2<Scope, ParametersHolder, BodyfatService> {
            public static final C0782a a = new C0782a();

            public C0782a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BodyfatService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BodyfatServiceImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/bodyfat/slimming/repo/LoseWeightRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, LoseWeightRepo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoseWeightRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LoseWeightRepoImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightPlanEnterViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, LoseWeightPlanEnterViewModel> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoseWeightPlanEnterViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LoseWeightPlanEnterViewModel((LoseWeightRepo) scope.get(Reflection.getOrCreateKotlinClass(LoseWeightRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightSelectSportViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, LoseWeightSelectSportViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoseWeightSelectSportViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LoseWeightSelectSportViewModel((LoseWeightRepo) scope.get(Reflection.getOrCreateKotlinClass(LoseWeightRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/xiaomi/hm/health/bodyfat/slimming/viewmodel/LoseWeightViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, LoseWeightViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LoseWeightViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new LoseWeightViewModel((LoseWeightRepo) scope.get(Reflection.getOrCreateKotlinClass(LoseWeightRepo.class), null, null));
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
            C0782a c0782a = C0782a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(BodyfatService.class), null, c0782a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition2 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(LoseWeightRepo.class), null, bVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            c cVar = c.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(LoseWeightPlanEnterViewModel.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            d dVar = d.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(LoseWeightSelectSportViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            e eVar = e.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(LoseWeightViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
        }
    }

    @NotNull
    public static final Module getBodyFatModule() {
        return a;
    }
}
