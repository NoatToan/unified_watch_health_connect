package com.huami.health.afppg.koin;

import android.content.Context;
import com.huami.feature.config.FeatureSwitch;
import com.huami.health.afppg.PpgCoroutineScope;
import com.huami.health.afppg.app.IAfPpgAppService;
import com.huami.health.afppg.data.PPGRepositoryImpl;
import com.huami.health.afppg.data.local.PPGDataBase;
import com.huami.health.afppg.data.local.dao.AFibDao;
import com.huami.health.afppg.data.local.dao.HREventDao;
import com.huami.health.afppg.data.local.dao.RRPeakDao;
import com.huami.health.afppg.data.remote.AfPpgWebApi;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.AfPpgService;
import com.huami.health.afppg.service.GetTodayAFibServiceImpl;
import com.huami.health.afppg.service.ISyncAfPPGDeviceApi;
import com.huami.health.afppg.usecase.ClearAllUserDataUseCase;
import com.huami.health.afppg.usecase.GetAFibByDayFlowUseCase;
import com.huami.health.afppg.usecase.GetAFibEventsUseCase;
import com.huami.health.afppg.usecase.GetAfibByDayUseCase;
import com.huami.health.afppg.usecase.GetAfibListUseCase;
import com.huami.health.afppg.usecase.GetAllEventsUseCase;
import com.huami.health.afppg.usecase.PostAFibUseCase;
import com.huami.health.afppg.usecase.PostHRUseCase;
import com.huami.health.afppg.usecase.PostRRPeakUseCase;
import com.huami.health.afppg.usecase.SyncAfPpgDeviceDataUseCase;
import com.huami.health.afppg.usecase.UploadAllUseCase;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.QualifierKt;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003\u001aK\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0002\u001a!\u0010\n\u001a\u00020\u00052\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0002\"\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lkotlin/ExtensionFunctionType;", "userConfig", "Lorg/koin/core/module/Module;", "getAfPpgModule", "moduleConfig", "b", "scopeSet", "a", "", "AF_PPG", "Ljava/lang/String;", "afppg-core_release"}, k = 2, mv = {1, 5, 1})
public final class PpgModuleKt {

    @NotNull
    public static final String AF_PPG = "af_ppg";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public final /* synthetic */ Function1<ScopeDSL, Unit> a;

        /* JADX INFO: renamed from: com.huami.health.afppg.koin.PpgModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/service/AfPpgService;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0429a extends Lambda implements Function2<Scope, ParametersHolder, AfPpgService> {
            public static final C0429a a = new C0429a();

            public C0429a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AfPpgService invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetTodayAFibServiceImpl();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super ScopeDSL, Unit> function1) {
            super(1);
            this.a = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Module module) {
            invoke2(module);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Module module) {
            C0429a c0429a = C0429a.a;
            Kind kind = Kind.Singleton;
            ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
            BeanDefinition beanDefinition = new BeanDefinition(companion.getRootScopeQualifier(), Reflection.getOrCreateKotlinClass(AfPpgService.class), null, c0429a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, companion.getRootScopeQualifier());
            SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
            Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
            if (module.getCreatedAtStart()) {
                module.getEagerInstances().add(singleInstanceFactory);
            }
            new Pair(module, singleInstanceFactory);
            module.scope(QualifierKt.named(PpgModuleKt.AF_PPG), this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<ScopeDSL, Unit> {
        public final /* synthetic */ Function1<ScopeDSL, Unit> a;
        public final /* synthetic */ Function1<ScopeDSL, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super ScopeDSL, Unit> function1, Function1<? super ScopeDSL, Unit> function2) {
            super(1);
            this.a = function1;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            this.a.invoke(scopeDSL);
            this.b.invoke(scopeDSL);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final c a = new c();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/GetAfibByDayUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function2<Scope, ParametersHolder, GetAfibByDayUseCase> {
            public static final a a = new a();

            public a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAfibByDayUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAfibByDayUseCase((GetAFibEventsUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetAFibEventsUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/UploadAllUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, UploadAllUseCase> {
            public static final b a = new b();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ Scope a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Scope scope) {
                    super(0);
                    this.a = scope;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return Boolean.valueOf(((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable());
                }
            }

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final UploadAllUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new UploadAllUseCase(((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId(), (PostAFibUseCase) scope.get(Reflection.getOrCreateKotlinClass(PostAFibUseCase.class), null, null), (PostRRPeakUseCase) scope.get(Reflection.getOrCreateKotlinClass(PostRRPeakUseCase.class), null, null), (PostHRUseCase) scope.get(Reflection.getOrCreateKotlinClass(PostHRUseCase.class), null, null), new a(scope));
            }
        }

        /* JADX INFO: renamed from: com.huami.health.afppg.koin.PpgModuleKt$c$c, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/SyncAfPpgDeviceDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0430c extends Lambda implements Function2<Scope, ParametersHolder, SyncAfPpgDeviceDataUseCase> {
            public static final C0430c a = new C0430c();

            public C0430c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final SyncAfPpgDeviceDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new SyncAfPpgDeviceDataUseCase((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId(), ((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getAppName(), (ISyncAfPPGDeviceApi) scope.get(Reflection.getOrCreateKotlinClass(ISyncAfPPGDeviceApi.class), null, null), (PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/ClearAllUserDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, ClearAllUserDataUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClearAllUserDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new ClearAllUserDataUseCase((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null), (PpgCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null), (Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/GetAFibEventsUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, GetAFibEventsUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAFibEventsUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAFibEventsUseCase((PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/GetAllEventsUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, GetAllEventsUseCase> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAllEventsUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAllEventsUseCase((PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), (PpgCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/PpgCoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, PpgCoroutineScope> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PpgCoroutineScope invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PpgCoroutineScope();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/PostHRUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, PostHRUseCase> {
            public static final h a = new h();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ Scope a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Scope scope) {
                    super(0);
                    this.a = scope;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return Boolean.valueOf(((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable());
                }
            }

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PostHRUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PostHRUseCase(((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getAppName(), (PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), new a(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/GetAFibByDayFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class i extends Lambda implements Function2<Scope, ParametersHolder, GetAFibByDayFlowUseCase> {
            public static final i a = new i();

            public i() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAFibByDayFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAFibByDayFlowUseCase((PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), (PpgCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/data/local/PPGDataBase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class j extends Lambda implements Function2<Scope, ParametersHolder, PPGDataBase> {
            public static final j a = new j();

            public j() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PPGDataBase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return PPGDataBase.INSTANCE.getInstance((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/data/local/dao/AFibDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class k extends Lambda implements Function2<Scope, ParametersHolder, AFibDao> {
            public static final k a = new k();

            public k() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AFibDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).afibDAO();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/data/local/dao/RRPeakDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class l extends Lambda implements Function2<Scope, ParametersHolder, RRPeakDao> {
            public static final l a = new l();

            public l() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final RRPeakDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).rrPeakDAO();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/data/local/dao/HREventDao;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class m extends Lambda implements Function2<Scope, ParametersHolder, HREventDao> {
            public static final m a = new m();

            public m() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final HREventDao invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).hrEventDAO();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/data/remote/AfPpgWebApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class n extends Lambda implements Function2<Scope, ParametersHolder, AfPpgWebApi> {
            public static final n a = new n();

            public n() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AfPpgWebApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new AfPpgWebApi(((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId(), ((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getAppName());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/repository/PPGRepository;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class o extends Lambda implements Function2<Scope, ParametersHolder, PPGRepository> {
            public static final o a = new o();

            public o() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PPGRepository invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PPGRepositoryImpl(((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId(), (AfPpgWebApi) scope.get(Reflection.getOrCreateKotlinClass(AfPpgWebApi.class), null, null), ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).rrPeakDAO(), ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).afibDAO(), ((PPGDataBase) scope.get(Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, null)).hrEventDAO());
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/PostRRPeakUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class p extends Lambda implements Function2<Scope, ParametersHolder, PostRRPeakUseCase> {
            public static final p a = new p();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ Scope a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Scope scope) {
                    super(0);
                    this.a = scope;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return Boolean.valueOf(((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable());
                }
            }

            public p() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PostRRPeakUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PostRRPeakUseCase((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null), ((IAfPpgAppService) scope.get(Reflection.getOrCreateKotlinClass(IAfPpgAppService.class), null, null)).getUserId(), (PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), new a(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/PostAFibUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class q extends Lambda implements Function2<Scope, ParametersHolder, PostAFibUseCase> {
            public static final q a = new q();

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<Boolean> {
                public final /* synthetic */ Scope a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Scope scope) {
                    super(0);
                    this.a = scope;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke */
                public final Boolean getA() {
                    return Boolean.valueOf(((FeatureSwitch) this.a.get(Reflection.getOrCreateKotlinClass(FeatureSwitch.class), null, null)).isSyncDataEnable());
                }
            }

            public q() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PostAFibUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new PostAFibUseCase((PPGRepository) scope.get(Reflection.getOrCreateKotlinClass(PPGRepository.class), null, null), new a(scope));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/health/afppg/usecase/GetAfibListUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class r extends Lambda implements Function2<Scope, ParametersHolder, GetAfibListUseCase> {
            public static final r a = new r();

            public r() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetAfibListUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetAfibListUseCase((GetAFibEventsUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetAFibEventsUseCase.class), null, null), (PpgCoroutineScope) scope.get(Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, null));
            }
        }

        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ScopeDSL scopeDSL) {
            invoke2(scopeDSL);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull ScopeDSL scopeDSL) {
            j jVar = j.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PPGDataBase.class), null, jVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            k kVar = k.a;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AFibDao.class), null, kVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            l lVar = l.a;
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(RRPeakDao.class), null, lVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            m mVar = m.a;
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(HREventDao.class), null, mVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            n nVar = n.a;
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(AfPpgWebApi.class), null, nVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            o oVar = o.a;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PPGRepository.class), null, oVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory6 = new ScopedInstanceFactory(beanDefinition6);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey6, scopedInstanceFactory6, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory6);
            p pVar = p.a;
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostRRPeakUseCase.class), null, pVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory7 = new ScopedInstanceFactory(beanDefinition7);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey7, scopedInstanceFactory7, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory7);
            q qVar = q.a;
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostAFibUseCase.class), null, qVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory8 = new ScopedInstanceFactory(beanDefinition8);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey8, scopedInstanceFactory8, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory8);
            r rVar = r.a;
            BeanDefinition beanDefinition9 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAfibListUseCase.class), null, rVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey9 = BeanDefinitionKt.indexKey(beanDefinition9.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory9 = new ScopedInstanceFactory(beanDefinition9);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey9, scopedInstanceFactory9, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory9);
            a aVar = a.a;
            BeanDefinition beanDefinition10 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAfibByDayUseCase.class), null, aVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey10 = BeanDefinitionKt.indexKey(beanDefinition10.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory10 = new ScopedInstanceFactory(beanDefinition10);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey10, scopedInstanceFactory10, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory10);
            b bVar = b.a;
            BeanDefinition beanDefinition11 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(UploadAllUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey11 = BeanDefinitionKt.indexKey(beanDefinition11.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory11 = new ScopedInstanceFactory(beanDefinition11);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey11, scopedInstanceFactory11, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory11);
            C0430c c0430c = C0430c.a;
            BeanDefinition beanDefinition12 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(SyncAfPpgDeviceDataUseCase.class), null, c0430c, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey12 = BeanDefinitionKt.indexKey(beanDefinition12.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory12 = new ScopedInstanceFactory(beanDefinition12);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey12, scopedInstanceFactory12, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory12);
            d dVar = d.a;
            BeanDefinition beanDefinition13 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(ClearAllUserDataUseCase.class), null, dVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey13 = BeanDefinitionKt.indexKey(beanDefinition13.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory13 = new ScopedInstanceFactory(beanDefinition13);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey13, scopedInstanceFactory13, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory13);
            e eVar = e.a;
            BeanDefinition beanDefinition14 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAFibEventsUseCase.class), null, eVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey14 = BeanDefinitionKt.indexKey(beanDefinition14.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory14 = new ScopedInstanceFactory(beanDefinition14);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey14, scopedInstanceFactory14, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory14);
            f fVar = f.a;
            BeanDefinition beanDefinition15 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAllEventsUseCase.class), null, fVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey15 = BeanDefinitionKt.indexKey(beanDefinition15.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory15 = new ScopedInstanceFactory(beanDefinition15);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey15, scopedInstanceFactory15, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory15);
            g gVar = g.a;
            BeanDefinition beanDefinition16 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PpgCoroutineScope.class), null, gVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey16 = BeanDefinitionKt.indexKey(beanDefinition16.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory16 = new ScopedInstanceFactory(beanDefinition16);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey16, scopedInstanceFactory16, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory16);
            h hVar = h.a;
            BeanDefinition beanDefinition17 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(PostHRUseCase.class), null, hVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey17 = BeanDefinitionKt.indexKey(beanDefinition17.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory17 = new ScopedInstanceFactory(beanDefinition17);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey17, scopedInstanceFactory17, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory17);
            i iVar = i.a;
            BeanDefinition beanDefinition18 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetAFibByDayFlowUseCase.class), null, iVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey18 = BeanDefinitionKt.indexKey(beanDefinition18.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory18 = new ScopedInstanceFactory(beanDefinition18);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey18, scopedInstanceFactory18, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory18);
        }
    }

    private static final Module a(Function1<? super ScopeDSL, Unit> function1) {
        return ModuleKt.module$default(false, new a(function1), 1, null);
    }

    private static final Function1<ScopeDSL, Unit> b(Function1<? super ScopeDSL, Unit> function1, Function1<? super ScopeDSL, Unit> function2) {
        return new b(function1, function2);
    }

    @NotNull
    public static final Module getAfPpgModule(@NotNull Function1<? super ScopeDSL, Unit> function1) {
        return a(b(function1, c.a));
    }
}
