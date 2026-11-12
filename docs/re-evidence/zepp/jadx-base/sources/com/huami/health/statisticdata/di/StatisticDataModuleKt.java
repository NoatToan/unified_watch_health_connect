package com.huami.health.statisticdata.di;

import android.content.Context;
import com.huami.health.statisticdata.persistence.StatisticDataDatabase;
import com.huami.health.statisticdata.persistence.StatisticDataDatabaseKt;
import com.huami.health.statisticdata.repository.StatisticDataRepository;
import com.huami.health.statisticdata.repository.StatisticDataRepositoryImpl;
import com.huami.health.statisticdata.viewmodel.StatisticDataViewModel;
import com.huami.health.statisticdata.webapi.StatisticDataWebApi;
import com.huami.health.statisticdata.webapi.StatisticDataWebApiImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.android.viewmodel.dsl.ModuleExtKt;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.DefinitionFactory;
import org.koin.core.definition.Kind;
import org.koin.core.definition.Options;
import org.koin.core.module.Module;
import org.koin.core.parameter.DefinitionParameters;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u0019\u0010\u0005\u001a\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lorg/koin/core/module/Module;", "a", "Lorg/koin/core/module/Module;", "getStatisticDataModule", "()Lorg/koin/core/module/Module;", "statisticDataModule", "statisticdata_release"}, k = 2, mv = {1, 4, 0})
public final class StatisticDataModuleKt {

    @NotNull
    private static final Module a = ModuleKt.module$default(false, false, a.a, 3, null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/koin/core/module/Module;", "", "invoke", "(Lorg/koin/core/module/Module;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function1<Module, Unit> {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.huami.health.statisticdata.di.StatisticDataModuleKt$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/health/statisticdata/persistence/StatisticDataDatabase;"}, k = 3, mv = {1, 4, 0})
        public static final class C0433a extends Lambda implements Function2<Scope, DefinitionParameters, StatisticDataDatabase> {
            public static final C0433a a = new C0433a();

            public C0433a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StatisticDataDatabase invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return StatisticDataDatabaseKt.getStatisticDataDatabase((Context) scope.get(Reflection.getOrCreateKotlinClass(Context.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/health/statisticdata/webapi/StatisticDataWebApi;"}, k = 3, mv = {1, 4, 0})
        public static final class b extends Lambda implements Function2<Scope, DefinitionParameters, StatisticDataWebApi> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StatisticDataWebApi invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return new StatisticDataWebApiImpl();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/health/statisticdata/repository/StatisticDataRepository;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/health/statisticdata/repository/StatisticDataRepository;"}, k = 3, mv = {1, 4, 0})
        public static final class c extends Lambda implements Function2<Scope, DefinitionParameters, StatisticDataRepository> {
            public static final c a = new c();

            public c() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StatisticDataRepository invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return new StatisticDataRepositoryImpl((StatisticDataDatabase) scope.get(Reflection.getOrCreateKotlinClass(StatisticDataDatabase.class), null, null), (StatisticDataWebApi) scope.get(Reflection.getOrCreateKotlinClass(StatisticDataWebApi.class), null, null));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/DefinitionParameters;", "it", "Lcom/huami/health/statisticdata/viewmodel/StatisticDataViewModel;", "a", "(Lorg/koin/core/scope/Scope;Lorg/koin/core/parameter/DefinitionParameters;)Lcom/huami/health/statisticdata/viewmodel/StatisticDataViewModel;"}, k = 3, mv = {1, 4, 0})
        public static final class d extends Lambda implements Function2<Scope, DefinitionParameters, StatisticDataViewModel> {
            public static final d a = new d();

            public d() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final StatisticDataViewModel invoke(@NotNull Scope scope, @NotNull DefinitionParameters definitionParameters) {
                return new StatisticDataViewModel((StatisticDataRepository) scope.get(Reflection.getOrCreateKotlinClass(StatisticDataRepository.class), null, null));
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
            C0433a c0433a = C0433a.a;
            DefinitionFactory definitionFactory = DefinitionFactory.INSTANCE;
            Kind kind = Kind.Single;
            BeanDefinition beanDefinition = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(StatisticDataDatabase.class));
            beanDefinition.setDefinition(c0433a);
            beanDefinition.setKind(kind);
            module.declareDefinition(beanDefinition, new Options(false, false));
            b bVar = b.a;
            DefinitionFactory definitionFactory2 = DefinitionFactory.INSTANCE;
            Kind kind2 = Kind.Single;
            BeanDefinition beanDefinition2 = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(StatisticDataWebApi.class));
            beanDefinition2.setDefinition(bVar);
            beanDefinition2.setKind(kind2);
            module.declareDefinition(beanDefinition2, new Options(false, false));
            c cVar = c.a;
            DefinitionFactory definitionFactory3 = DefinitionFactory.INSTANCE;
            Kind kind3 = Kind.Single;
            BeanDefinition beanDefinition3 = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(StatisticDataRepository.class));
            beanDefinition3.setDefinition(cVar);
            beanDefinition3.setKind(kind3);
            module.declareDefinition(beanDefinition3, new Options(false, false));
            d dVar = d.a;
            DefinitionFactory definitionFactory4 = DefinitionFactory.INSTANCE;
            Kind kind4 = Kind.Factory;
            BeanDefinition beanDefinition4 = new BeanDefinition(null, null, Reflection.getOrCreateKotlinClass(StatisticDataViewModel.class));
            beanDefinition4.setDefinition(dVar);
            beanDefinition4.setKind(kind4);
            module.declareDefinition(beanDefinition4, new Options(false, false, 1, (DefaultConstructorMarker) null));
            ModuleExtKt.setIsViewModel(beanDefinition4);
        }
    }

    @NotNull
    public static final Module getStatisticDataModule() {
        return a;
    }
}
