package com.huami.step.koin;

import android.content.Context;
import androidx.exifinterface.media.ExifInterface;
import com.huami.step.model.UiConfig;
import com.huami.step.model.UserOfStep;
import com.huami.step.repo.StepInfoRepository;
import com.huami.step.repo.StepInfoRepositoryImpl;
import com.huami.step.repo.StepServiceImpl;
import com.huami.step.service.StepService;
import com.huami.step.ui.IStepGame;
import com.huami.step.utils.StepGameConstKt;
import com.huami.step.viewmodel.ShareStepViewModel;
import com.huami.step.viewmodel.StepCompareViewModel;
import com.huami.step.viewmodel.StepInfoViewModel;
import com.huami.step.viewmodel.StepStageViewModel;
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
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a&\u0010\u0003\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0006\u0010\u0006\u001a\u00020\u0005\u001a\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u001a\b\u0010\n\u001a\u0004\u0018\u00010\t\u001a\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u001a\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u001a\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u001a\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u001a\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u001a\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017\u001a\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u001a\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u001a\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u001a\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u001a\b\u0010!\u001a\u0004\u0018\u00010 \u001a\b\u0010#\u001a\u0004\u0018\u00010\"\"\u0019\u0010)\u001a\u00020$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "withKoinGet", "(Lorg/koin/core/qualifier/Qualifier;)Ljava/lang/Object;", "Landroid/content/Context;", "getAppContext", "Lcom/huami/step/model/UserOfStep;", "getUserOfStep", "Lcom/huami/step/koin/IUnitManager;", "getUnitManager", "Lcom/huami/step/koin/IRunDataAnalysisJob;", "getRunDataAnalysisJob", "Lcom/huami/step/koin/IStepShare;", "getStepShare", "Lcom/huami/step/koin/RealTimeStepLiveData;", "getRealTimeStep", "Lcom/huami/step/model/UiConfig;", "getUiConfig", "Lcom/huami/step/ui/IStepGame;", "getIStepGame", "", "getStepGameEnable", "()Ljava/lang/Boolean;", "Lcom/huami/step/koin/IStepGameNavigator;", "getStepGameNavigator", "Lcom/huami/step/koin/IStepOriginData;", "getStepOriginData", "Lcom/huami/step/koin/IStepRank;", "getIStepRank", "Lcom/huami/step/koin/StepHollywoodApi;", "getHollywoodApi", "Lcom/huami/step/koin/IStepGoalData;", "getGoalInfo", "Lcom/huami/step/koin/IStepGoalNavigator;", "getShareNavigator", "Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getStepInternalModule", "()Lorg/koin/core/module/Module;", "stepInternalModule", "step_release"}, k = 2, mv = {1, 5, 1})
public final class KoinExtKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, a.a, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.step.koin.KoinExtKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/repo/StepInfoRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0605a extends Lambda implements Function2<Scope, ParametersHolder, StepInfoRepository> {
            public static final C0605a a = new C0605a();

            public C0605a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StepInfoRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StepInfoRepositoryImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/service/StepService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, StepService> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StepService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StepServiceImpl((StepInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(StepInfoRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/koin/RealTimeStepLiveData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, RealTimeStepLiveData> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RealTimeStepLiveData invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new RealTimeStepLiveData();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/viewmodel/StepInfoViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, StepInfoViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StepInfoViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StepInfoViewModel((StepInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(StepInfoRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/viewmodel/StepCompareViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, StepCompareViewModel> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StepCompareViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StepCompareViewModel((StepInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(StepInfoRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/viewmodel/ShareStepViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, ShareStepViewModel> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ShareStepViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ShareStepViewModel();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/step/viewmodel/StepStageViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, StepStageViewModel> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StepStageViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new StepStageViewModel((StepInfoRepository) scope.get(Reflection.getOrCreateKotlinClass(StepInfoRepository.class), null, null));
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
            C0605a c0605a = C0605a.a;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
            Kind kind = Kind.Factory;
            BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(StepInfoRepository.class), null, c0605a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(StepService.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
            c cVar = c.a;
            Kind kind2 = Kind.Singleton;
            BeanDefinition beanDefinition3 = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(RealTimeStepLiveData.class), null, cVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition3);
            Module.saveMapping$default(module, strIndexKey3, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            d dVar = d.a;
            StringQualifier rootScopeQualifier3 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition4 = new BeanDefinition(rootScopeQualifier3, Reflection.getOrCreateKotlinClass(StepInfoViewModel.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, rootScopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition4);
            Module.saveMapping$default(module, strIndexKey4, factoryInstanceFactory3, false, 4, null);
            new Pair(module, factoryInstanceFactory3);
            e eVar = e.a;
            StringQualifier rootScopeQualifier4 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition5 = new BeanDefinition(rootScopeQualifier4, Reflection.getOrCreateKotlinClass(StepCompareViewModel.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, rootScopeQualifier4);
            FactoryInstanceFactory factoryInstanceFactory4 = new FactoryInstanceFactory(beanDefinition5);
            Module.saveMapping$default(module, strIndexKey5, factoryInstanceFactory4, false, 4, null);
            new Pair(module, factoryInstanceFactory4);
            f fVar = f.a;
            StringQualifier rootScopeQualifier5 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition6 = new BeanDefinition(rootScopeQualifier5, Reflection.getOrCreateKotlinClass(ShareStepViewModel.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, rootScopeQualifier5);
            FactoryInstanceFactory factoryInstanceFactory5 = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory5, false, 4, null);
            new Pair(module, factoryInstanceFactory5);
            g gVar = g.a;
            StringQualifier rootScopeQualifier6 = companion.getRootScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(rootScopeQualifier6, Reflection.getOrCreateKotlinClass(StepStageViewModel.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, rootScopeQualifier6);
            FactoryInstanceFactory factoryInstanceFactory6 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module, strIndexKey7, factoryInstanceFactory6, false, 4, null);
            new Pair(module, factoryInstanceFactory6);
        }
    }

    @NotNull
    public static final Context getAppContext() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Context.class), null, null);
        } catch (Exception unused) {
        }
        return (Context) obj;
    }

    @Nullable
    public static final IStepGoalData getGoalInfo() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepGoalData.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepGoalData) obj;
    }

    @Nullable
    public static final StepHollywoodApi getHollywoodApi() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(StepHollywoodApi.class), null, null);
        } catch (Exception unused) {
        }
        return (StepHollywoodApi) obj;
    }

    @Nullable
    public static final IStepGame getIStepGame() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepGame.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepGame) obj;
    }

    @Nullable
    public static final IStepRank getIStepRank() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepRank.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepRank) obj;
    }

    @Nullable
    public static final RealTimeStepLiveData getRealTimeStep() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(RealTimeStepLiveData.class), null, null);
        } catch (Exception unused) {
        }
        return (RealTimeStepLiveData) obj;
    }

    @Nullable
    public static final IRunDataAnalysisJob getRunDataAnalysisJob() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IRunDataAnalysisJob.class), null, null);
        } catch (Exception unused) {
        }
        return (IRunDataAnalysisJob) obj;
    }

    @Nullable
    public static final IStepGoalNavigator getShareNavigator() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepGoalNavigator.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepGoalNavigator) obj;
    }

    @Nullable
    public static final Boolean getStepGameEnable() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(Boolean.class), QualifierKt.named(StepGameConstKt.getSTEP_GAME_ENABLE()), null);
        } catch (Exception unused) {
        }
        return (Boolean) obj;
    }

    @Nullable
    public static final IStepGameNavigator getStepGameNavigator() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepGameNavigator.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepGameNavigator) obj;
    }

    @NotNull
    public static final Module getStepInternalModule() {
        return a;
    }

    @Nullable
    public static final IStepOriginData getStepOriginData() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepOriginData.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepOriginData) obj;
    }

    @Nullable
    public static final IStepShare getStepShare() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IStepShare.class), null, null);
        } catch (Exception unused) {
        }
        return (IStepShare) obj;
    }

    @Nullable
    public static final UiConfig getUiConfig() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UiConfig.class), null, null);
        } catch (Exception unused) {
        }
        return (UiConfig) obj;
    }

    @Nullable
    public static final IUnitManager getUnitManager() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(IUnitManager.class), null, null);
        } catch (Exception unused) {
        }
        return (IUnitManager) obj;
    }

    @Nullable
    public static final UserOfStep getUserOfStep() {
        Object obj = null;
        try {
            obj = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserOfStep.class), null, null);
        } catch (Exception unused) {
        }
        return (UserOfStep) obj;
    }

    public static final /* synthetic */ <T> T withKoinGet(Qualifier qualifier) {
        try {
            Scope rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ Object withKoinGet$default(Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        try {
            Scope rootScope = GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope();
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return rootScope.get(Reflection.getOrCreateKotlinClass(Object.class), qualifier, null);
        } catch (Exception unused) {
            return null;
        }
    }
}
