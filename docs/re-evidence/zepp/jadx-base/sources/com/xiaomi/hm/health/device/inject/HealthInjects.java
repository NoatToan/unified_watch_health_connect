package com.xiaomi.hm.health.device.inject;

import com.huami.device.feature.health.ui.bloodpressure.viewmodel.IBPFlagUpdater;
import com.xmlywind.sdk.common.mta.PointCategory;
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
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ModuleKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/xiaomi/hm/health/device/inject/HealthInjects;", "", "", PointCategory.LOAD, "unload", "", "a", "Z", "forMifit", "Lorg/koin/core/module/Module;", "b", "Lorg/koin/core/module/Module;", "module", "<init>", "(Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthInjects {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean forMifit;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Module module;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/module/Module;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Module, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.inject.HealthInjects$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/IBPFlagUpdater;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0830a extends Lambda implements Function2<Scope, ParametersHolder, IBPFlagUpdater> {
            public static final C0830a a = new C0830a();

            public C0830a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IBPFlagUpdater invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new DefaultUpdater();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "it", "Lcom/huami/device/feature/health/ui/bloodpressure/viewmodel/IBPFlagUpdater;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function2<Scope, ParametersHolder, IBPFlagUpdater> {
            public static final b a = new b();

            public b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final IBPFlagUpdater invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
                return new BPFlagUpdater();
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
            if (HealthInjects.this.forMifit) {
                C0830a c0830a = C0830a.a;
                StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
                BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(IBPFlagUpdater.class), null, c0830a, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
                String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), null, rootScopeQualifier);
                FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
                Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
                new Pair(module, factoryInstanceFactory);
                return;
            }
            b bVar = b.a;
            StringQualifier rootScopeQualifier2 = ScopeRegistry.INSTANCE.getRootScopeQualifier();
            BeanDefinition beanDefinition2 = new BeanDefinition(rootScopeQualifier2, Reflection.getOrCreateKotlinClass(IBPFlagUpdater.class), null, bVar, Kind.Factory, CollectionsKt__CollectionsKt.emptyList());
            String strIndexKey2 = BeanDefinitionKt.indexKey(beanDefinition2.getPrimaryType(), null, rootScopeQualifier2);
            FactoryInstanceFactory factoryInstanceFactory2 = new FactoryInstanceFactory(beanDefinition2);
            Module.saveMapping$default(module, strIndexKey2, factoryInstanceFactory2, false, 4, null);
            new Pair(module, factoryInstanceFactory2);
        }
    }

    public HealthInjects(boolean z) {
        this.forMifit = z;
    }

    public final void load() {
        unload();
        Module moduleModule$default = ModuleKt.module$default(false, new a(), 1, null);
        DefaultContextExtKt.loadKoinModules(moduleModule$default);
        this.module = moduleModule$default;
    }

    public final void unload() {
        Module module = this.module;
        if (module == null) {
            return;
        }
        DefaultContextExtKt.unloadKoinModules(module);
    }
}
