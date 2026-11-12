package com.huami.bloodoxygen.ui.koin;

import android.content.Context;
import com.huami.bigdata.statistics.core.api.BigDataExportedApi;
import com.huami.bigdata.statistics.core.api.IBigDataExportedApi;
import com.huami.bloodoxygen.core.koin.BloodOxygenConfig;
import com.huami.bloodoxygen.core.local.config.BloodOxygen;
import com.huami.bloodoxygen.core.local.kvkit.KvKey;
import com.huami.bloodoxygen.core.repository.IBloodOxygenRepo;
import com.huami.bloodoxygen.core.usecase.bigdata.GetClickSpo2BigDataUseCase;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetDateClickSpo2ListFlowUseCase;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetLatestClickSpo2FlowUseCase;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetLocalClickSpo2ListFlowUseCase;
import com.huami.bloodoxygen.core.usecase.clickspo2.GetReverseClickSpo2UseCase;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailActivitySharedDataViewModel;
import com.huami.bloodoxygen.ui.business.viewmodel.BloodOxygenDetailViewModel;
import com.huami.bloodoxygen.ui.business.viewmodel.ClickSpo2HistoryViewModel;
import com.huami.bloodoxygen.ui.dto.TimeMode;
import java.lang.ref.WeakReference;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionParameterException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
import org.koin.ext.KClassExtKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\".\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lcom/huami/bloodoxygen/core/koin/ScopeSetDeclaration;", "Lkotlin/ExtensionFunctionType;", "a", "Lkotlin/jvm/functions/Function1;", "getBloodOxygenUiScopeSet", "()Lkotlin/jvm/functions/Function1;", "bloodOxygenUiScopeSet", "ui_release"}, k = 2, mv = {1, 5, 1})
public final class BloodOxygenUiModuleKt {

    @NotNull
    private static final Function1<ScopeDSL, Unit> a = a.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ScopeDSL, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.bloodoxygen.ui.koin.BloodOxygenUiModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bigdata/statistics/core/api/IBigDataExportedApi;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0299a extends Lambda implements Function2<Scope, ParametersHolder, IBigDataExportedApi> {
            public static final C0299a a = new C0299a();

            public C0299a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IBigDataExportedApi invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BigDataExportedApi(((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getUserId(), null, false, 6, null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/bigdata/GetClickSpo2BigDataUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, GetClickSpo2BigDataUseCase> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetClickSpo2BigDataUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetClickSpo2BigDataUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (IBigDataExportedApi) scope.get(Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, null), (KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetDateClickSpo2ListFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function2<Scope, ParametersHolder, GetDateClickSpo2ListFlowUseCase> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetDateClickSpo2ListFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetDateClickSpo2ListFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLatestClickSpo2FlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function2<Scope, ParametersHolder, GetLatestClickSpo2FlowUseCase> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLatestClickSpo2FlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLatestClickSpo2FlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/core/usecase/clickspo2/GetLocalClickSpo2ListFlowUseCase;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function2<Scope, ParametersHolder, GetLocalClickSpo2ListFlowUseCase> {
            public static final e a = new e();

            public e() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final GetLocalClickSpo2ListFlowUseCase invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new GetLocalClickSpo2ListFlowUseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "params", "Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class f extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenDetailViewModel> {
            public static final f a = new f();

            public f() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenDetailViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) throws DefinitionParameterException {
                GetLocalClickSpo2ListFlowUseCase getLocalClickSpo2ListFlowUseCase = (GetLocalClickSpo2ListFlowUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetLocalClickSpo2ListFlowUseCase.class), null, null);
                GetClickSpo2BigDataUseCase getClickSpo2BigDataUseCase = (GetClickSpo2BigDataUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetClickSpo2BigDataUseCase.class), null, null);
                Object orNull = parametersHolder.getOrNull(Reflection.getOrCreateKotlinClass(TimeMode.class));
                if (orNull != null) {
                    return new BloodOxygenDetailViewModel(getLocalClickSpo2ListFlowUseCase, getClickSpo2BigDataUseCase, (TimeMode) orNull);
                }
                throw new DefinitionParameterException("No value found for type '" + KClassExtKt.getFullName(Reflection.getOrCreateKotlinClass(TimeMode.class)) + '\'');
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/ui/business/viewmodel/BloodOxygenDetailActivitySharedDataViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class g extends Lambda implements Function2<Scope, ParametersHolder, BloodOxygenDetailActivitySharedDataViewModel> {
            public static final g a = new g();

            public g() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final BloodOxygenDetailActivitySharedDataViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BloodOxygenDetailActivitySharedDataViewModel((GetLatestClickSpo2FlowUseCase) scope.get(Reflection.getOrCreateKotlinClass(GetLatestClickSpo2FlowUseCase.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/bloodoxygen/ui/business/viewmodel/ClickSpo2HistoryViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class h extends Lambda implements Function2<Scope, ParametersHolder, ClickSpo2HistoryViewModel> {
            public static final h a = new h();

            public h() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ClickSpo2HistoryViewModel invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                Date registerDate = ((BloodOxygenConfig) scope.get(Reflection.getOrCreateKotlinClass(BloodOxygenConfig.class), null, null)).getRegisterDate();
                Long lValueOf = registerDate == null ? null : Long.valueOf(registerDate.getTime());
                return new ClickSpo2HistoryViewModel(new WeakReference(scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null)), lValueOf == null ? BloodOxygen.INSTANCE.getDEFAULT_FROM() : lValueOf.longValue(), new GetReverseClickSpo2UseCase((IBloodOxygenRepo) scope.get(Reflection.getOrCreateKotlinClass(IBloodOxygenRepo.class), null, null), (KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null)), (KvKey) scope.get(Reflection.getOrCreateKotlinClass(KvKey.class), null, null));
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
            Koin orNull = GlobalContext.INSTANCE.getOrNull();
            if ((orNull == null ? null : (IBigDataExportedApi) orNull.getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, null)) == null) {
                BeanDefinition beanDefinition = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(IBigDataExportedApi.class), null, C0299a.a, Kind.Scoped, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, scopeDSL.getScopeQualifier());
                ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
                Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
                new Pair(scopeDSL.getModule(), scopedInstanceFactory);
            }
            b bVar = b.a;
            Kind kind = Kind.Scoped;
            BeanDefinition beanDefinition2 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetClickSpo2BigDataUseCase.class), null, bVar, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory2 = new ScopedInstanceFactory(beanDefinition2);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey2, scopedInstanceFactory2, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory2);
            BeanDefinition beanDefinition3 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetDateClickSpo2ListFlowUseCase.class), null, c.a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey3 = BeanDefinitionKt.indexKey(beanDefinition3.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory3 = new ScopedInstanceFactory(beanDefinition3);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey3, scopedInstanceFactory3, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory3);
            BeanDefinition beanDefinition4 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLatestClickSpo2FlowUseCase.class), null, d.a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey4 = BeanDefinitionKt.indexKey(beanDefinition4.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory4 = new ScopedInstanceFactory(beanDefinition4);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey4, scopedInstanceFactory4, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory4);
            BeanDefinition beanDefinition5 = new BeanDefinition(scopeDSL.getScopeQualifier(), Reflection.getOrCreateKotlinClass(GetLocalClickSpo2ListFlowUseCase.class), null, e.a, kind, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey5 = BeanDefinitionKt.indexKey(beanDefinition5.getPrimaryType(), null, scopeDSL.getScopeQualifier());
            ScopedInstanceFactory scopedInstanceFactory5 = new ScopedInstanceFactory(beanDefinition5);
            Module.saveMapping$default(scopeDSL.getModule(), strIndexKey5, scopedInstanceFactory5, false, 4, null);
            new Pair(scopeDSL.getModule(), scopedInstanceFactory5);
            f fVar = f.a;
            Module module = scopeDSL.getModule();
            Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
            Kind kind2 = Kind.Factory;
            BeanDefinition beanDefinition6 = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(BloodOxygenDetailViewModel.class), null, fVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey6 = BeanDefinitionKt.indexKey(beanDefinition6.getPrimaryType(), null, scopeQualifier);
            FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition6);
            Module.saveMapping$default(module, strIndexKey6, factoryInstanceFactory, false, 4, null);
            new Pair(module, factoryInstanceFactory);
            g gVar = g.a;
            Module module2 = scopeDSL.getModule();
            Qualifier scopeQualifier2 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition7 = new BeanDefinition(scopeQualifier2, Reflection.getOrCreateKotlinClass(BloodOxygenDetailActivitySharedDataViewModel.class), null, gVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey7 = BeanDefinitionKt.indexKey(beanDefinition7.getPrimaryType(), null, scopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition7);
            Module.saveMapping$default(module2, strIndexKey7, factoryInstanceFactory2, false, 4, null);
            new Pair(module2, factoryInstanceFactory2);
            h hVar = h.a;
            Module module3 = scopeDSL.getModule();
            Qualifier scopeQualifier3 = scopeDSL.getScopeQualifier();
            BeanDefinition beanDefinition8 = new BeanDefinition(scopeQualifier3, Reflection.getOrCreateKotlinClass(ClickSpo2HistoryViewModel.class), null, hVar, kind2, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey8 = BeanDefinitionKt.indexKey(beanDefinition8.getPrimaryType(), null, scopeQualifier3);
            FactoryInstanceFactory factoryInstanceFactory3 = new FactoryInstanceFactory(beanDefinition8);
            Module.saveMapping$default(module3, strIndexKey8, factoryInstanceFactory3, false, 4, null);
            new Pair(module3, factoryInstanceFactory3);
        }
    }

    @NotNull
    public static final Function1<ScopeDSL, Unit> getBloodOxygenUiScopeSet() {
        return a;
    }
}
