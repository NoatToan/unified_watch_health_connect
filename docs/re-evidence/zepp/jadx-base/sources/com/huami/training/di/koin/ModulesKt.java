package com.huami.training.di.koin;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.training.api.TrainingWebApi;
import com.huami.training.api.TrainingWebApiImpl;
import com.huami.training.db.TrainingDb;
import com.huami.training.dto.App;
import com.huami.training.dto.Trainer;
import com.huami.training.ext.StringExKt;
import com.huami.training.helper.AppExecutors;
import com.huami.training.paging.PagingKeyCache;
import com.huami.training.paging.PagingKeyHelper;
import com.huami.training.paging.PagingKeyHelperImpl;
import com.huami.training.repo.ConfigRepo;
import com.huami.training.repo.EntranceRepo;
import com.huami.training.repo.FitRepo;
import com.huami.training.repo.JoinedCourseRepo;
import com.huami.training.repo.PlanRepo;
import com.huami.training.repo.PromotionalCourseRepo;
import com.huami.training.repo.SearchRepo;
import com.huami.training.repo.TrainingFilterListRepo;
import com.huami.training.repo.UserCourseRepo;
import com.huami.training.ui.course.TrainingFilterViewModel;
import com.huami.training.ui.entrance.EntranceViewModel;
import com.huami.training.ui.fit.FitViewModel;
import com.huami.training.ui.joined.JoinedCourseViewModel;
import com.huami.training.ui.promotion.PromotionalCourseViewModel;
import com.huami.training.ui.search.SearchViewModel;
import com.huami.training.ui.usercourse.UserCourseViewModel;
import com.huami.training.util.ConfigManager;
import com.huami.training.util.SharedPreferenceConfigManager;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0006\u001a(\u0010\u0004\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005\"\u0019\u0010\n\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0019\u0010\r\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t\"\u0019\u0010\u0010\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u001f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "Lorg/koin/core/module/Module;", "Lorg/koin/core/module/Module;", "getTrainingModule", "()Lorg/koin/core/module/Module;", "trainingModule", "b", "getViewModelModule", "viewModelModule", "c", "getRepositoryModule", "repositoryModule", "", GoogleApiAvailabilityLight.a, "[Lorg/koin/core/module/Module;", "getTrainingInternalModules", "()[Lorg/koin/core/module/Module;", "trainingInternalModules", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class ModulesKt {

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

        /* JADX INFO: renamed from: com.huami.training.di.koin.ModulesKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/EntranceRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0622a extends Lambda implements Function2<Scope, ParametersHolder, EntranceRepo> {
            public static final C0622a a = new C0622a();

            public C0622a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EntranceRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EntranceRepo((App) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(App.class), null, null), (AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null), (PagingKeyHelper) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PagingKeyHelper.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/ConfigRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, ConfigRepo> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ConfigRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ConfigRepo((App) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(App.class), null, null), (AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (ConfigManager) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ConfigManager.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/PlanRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, PlanRepo> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlanRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PlanRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/FitRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, FitRepo> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FitRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FitRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/JoinedCourseRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, JoinedCourseRepo> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JoinedCourseRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JoinedCourseRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null), (PagingKeyHelper) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PagingKeyHelper.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/TrainingFilterListRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, TrainingFilterListRepo> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TrainingFilterListRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TrainingFilterListRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null), (PagingKeyHelper) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PagingKeyHelper.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/SearchRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, SearchRepo> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SearchRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SearchRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/PromotionalCourseRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, PromotionalCourseRepo> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PromotionalCourseRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PromotionalCourseRepo((TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/repo/UserCourseRepo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, UserCourseRepo> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserCourseRepo invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserCourseRepo((AppExecutors) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(AppExecutors.class), null, null), (TrainingDb) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingDb.class), null, null), (TrainingWebApi) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, null), (PagingKeyCache) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(PagingKeyCache.class), null, null), (Trainer) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(Trainer.class), null, null));
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
            C0622a c0622a = C0622a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(EntranceRepo.class), null, c0622a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(ConfigRepo.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(PlanRepo.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(FitRepo.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            e eVar = e.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(JoinedCourseRepo.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            f fVar = f.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(TrainingFilterListRepo.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            g gVar = g.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(SearchRepo.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
            h hVar = h.a;
            StringQualifier rootScopeQualifier8 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(rootScopeQualifier8, Reflection.getOrCreateKotlinClass(PromotionalCourseRepo.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, rootScopeQualifier8);
            FactoryInstanceFactory factoryInstanceFactory8 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module, strIndexKey8, factoryInstanceFactory8, false, 4, null);
            new Pair(module, factoryInstanceFactory8);
            i iVar = i.a;
            StringQualifier rootScopeQualifier9 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition9 = new BeanDefinition(rootScopeQualifier9, Reflection.getOrCreateKotlinClass(UserCourseRepo.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, rootScopeQualifier9);
            FactoryInstanceFactory factoryInstanceFactory9 = new FactoryInstanceFactory(beanDefinition9);
            Module.saveMapping$default(module, strIndexKey9, factoryInstanceFactory9, false, 4, null);
            new Pair(module, factoryInstanceFactory9);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Module, Unit> {
        public static final b a = new b();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
            public static final a a = new a();

            /* JADX INFO: renamed from: com.huami.training.di.koin.ModulesKt$b$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/helper/AppExecutors;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0623a extends Lambda implements Function2<Scope, ParametersHolder, AppExecutors> {
                public static final C0623a a = new C0623a();

                public C0623a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final AppExecutors invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new AppExecutors();
                }
            }

            /* JADX INFO: renamed from: com.huami.training.di.koin.ModulesKt$b$a$b, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/api/TrainingWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0624b extends Lambda implements Function2<Scope, ParametersHolder, TrainingWebApi> {
                public static final C0624b a = new C0624b();

                public C0624b() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TrainingWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new TrainingWebApiImpl(ScopesAndQualifersKt.webHost(scope), ScopesAndQualifersKt.trainer(scope));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/db/TrainingDb;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class c extends Lambda implements Function2<Scope, ParametersHolder, TrainingDb> {
                public static final c a = new c();

                public c() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final TrainingDb invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return TrainingDb.INSTANCE.create(ModuleExtKt.androidContext(scope), "training_" + StringExKt.md5(ScopesAndQualifersKt.trainer(scope).getUserId()) + ".db");
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/paging/PagingKeyHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PagingKeyHelper> {
                public static final d a = new d();

                public d() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PagingKeyHelper invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PagingKeyHelperImpl(ModuleExtKt.androidContext(scope));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/paging/PagingKeyCache;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class e extends Lambda implements Function2<Scope, ParametersHolder, PagingKeyCache> {
                public static final e a = new e();

                public e() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final PagingKeyCache invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new PagingKeyCache(ModuleExtKt.androidContext(scope));
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/util/ConfigManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ConfigManager> {
                public static final f a = new f();

                public f() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                @NotNull
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ConfigManager invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                    return new SharedPreferenceConfigManager(ModuleExtKt.androidContext(scope), ScopesAndQualifersKt.appExecutors(scope).getDiskIO(), ScopesAndQualifersKt.trainer(scope).isMale());
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
                C0623a c0623a = C0623a.a;
                Kind kind = Kind.Scoped;
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AppExecutors.class), null, c0623a, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
                C0624b c0624b = C0624b.a;
                BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(TrainingWebApi.class), null, c0624b, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
                c cVar = c.a;
                BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(TrainingDb.class), null, cVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
                d dVar = d.a;
                BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PagingKeyHelper.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
                e eVar = e.a;
                BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PagingKeyCache.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
                f fVar = f.a;
                BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ConfigManager.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
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
            module.scope(QualifierKt.named("Training"), a.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<Module, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/entrance/EntranceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, EntranceViewModel> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final EntranceViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new EntranceViewModel((EntranceRepo) scope.get(Reflection.getOrCreateKotlinClass(EntranceRepo.class), null, null), (ConfigRepo) scope.get(Reflection.getOrCreateKotlinClass(ConfigRepo.class), null, null), (PlanRepo) scope.get(Reflection.getOrCreateKotlinClass(PlanRepo.class), null, null), (ConfigManager) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ConfigManager.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/fit/FitViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, FitViewModel> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FitViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new FitViewModel((FitRepo) scope.get(Reflection.getOrCreateKotlinClass(FitRepo.class), null, null), (PlanRepo) scope.get(Reflection.getOrCreateKotlinClass(PlanRepo.class), null, null), (ConfigRepo) scope.get(Reflection.getOrCreateKotlinClass(ConfigRepo.class), null, null), (ConfigManager) ScopesAndQualifersKt.trainingScope(scope.getKoin()).get(Reflection.getOrCreateKotlinClass(ConfigManager.class), null, null));
            }
        }

        /* JADX INFO: renamed from: com.huami.training.di.koin.ModulesKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/joined/JoinedCourseViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0625c extends Lambda implements Function2<Scope, ParametersHolder, JoinedCourseViewModel> {
            public static final C0625c a = new C0625c();

            public C0625c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final JoinedCourseViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new JoinedCourseViewModel((JoinedCourseRepo) scope.get(Reflection.getOrCreateKotlinClass(JoinedCourseRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/promotion/PromotionalCourseViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, PromotionalCourseViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PromotionalCourseViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PromotionalCourseViewModel((PromotionalCourseRepo) scope.get(Reflection.getOrCreateKotlinClass(PromotionalCourseRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/search/SearchViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, SearchViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SearchViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SearchViewModel((SearchRepo) scope.get(Reflection.getOrCreateKotlinClass(SearchRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/course/TrainingFilterViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, TrainingFilterViewModel> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TrainingFilterViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new TrainingFilterViewModel((TrainingFilterListRepo) scope.get(Reflection.getOrCreateKotlinClass(TrainingFilterListRepo.class), null, null), (ConfigRepo) scope.get(Reflection.getOrCreateKotlinClass(ConfigRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/training/ui/usercourse/UserCourseViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, UserCourseViewModel> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UserCourseViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UserCourseViewModel((UserCourseRepo) scope.get(Reflection.getOrCreateKotlinClass(UserCourseRepo.class), null, null));
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
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(EntranceViewModel.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(FitViewModel.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            C0625c c0625c = C0625c.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition3 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(JoinedCourseViewModel.class), null, c0625c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            d dVar = d.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(PromotionalCourseViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            e eVar = e.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(SearchViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            f fVar = f.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(TrainingFilterViewModel.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
            g gVar = g.a;
            StringQualifier rootScopeQualifier7 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier7, Reflection.getOrCreateKotlinClass(UserCourseViewModel.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier7);
            FactoryInstanceFactory factoryInstanceFactory7 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory7, false, 4, null);
            new Pair(module, factoryInstanceFactory7);
        }
    }

    static {
        Module moduleModule$default = ModuleKt.module$default(false, b.a, 1, null);
        a = moduleModule$default;
        Module moduleModule$default2 = ModuleKt.module$default(false, c.a, 1, null);
        b = moduleModule$default2;
        Module moduleModule$default3 = ModuleKt.module$default(false, a.a, 1, null);
        c = moduleModule$default3;
        d = new Module[]{moduleModule$default, moduleModule$default2, moduleModule$default3};
    }

    private static final /* synthetic */ <T> T a(Scope scope, Qualifier qualifier) {
        Scope scopeTrainingScope = ScopesAndQualifersKt.trainingScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) scopeTrainingScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    public static /* synthetic */ Object b(Scope scope, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Scope scopeTrainingScope = ScopesAndQualifersKt.trainingScope(scope.getKoin());
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return scopeTrainingScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
    }

    @NotNull
    public static final Module getRepositoryModule() {
        return c;
    }

    @NotNull
    public static final Module[] getTrainingInternalModules() {
        return d;
    }

    @NotNull
    public static final Module getTrainingModule() {
        return a;
    }

    @NotNull
    public static final Module getViewModelModule() {
        return b;
    }
}
