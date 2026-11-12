package org.koin.dsl;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.annotation.KoinReflectAPI;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceBuilderKt;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\b\u001a7\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\b¨\u0006\n"}, d2 = {"", "R", "Lorg/koin/dsl/ScopeDSL;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Pair;", "Lorg/koin/core/module/Module;", "Lorg/koin/core/instance/InstanceFactory;", "scoped", "factory", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class ScopeSetExtKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.dsl.ScopeSetExtKt$factory$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"", "R", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "params", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            Intrinsics.reifiedOperationMarker(4, "R");
            return (R) InstanceBuilderKt.newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: org.koin.dsl.ScopeSetExtKt$scoped$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"", "R", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "params", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C16591<R> extends Lambda implements Function2<Scope, ParametersHolder, R> {
        public C16591() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final R invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            Intrinsics.reifiedOperationMarker(4, "R");
            return (R) InstanceBuilderKt.newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
        }
    }

    @KoinReflectAPI
    public static final /* synthetic */ <R> Pair<Module, InstanceFactory<R>> factory(ScopeDSL scopeDSL, Qualifier qualifier) {
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, scopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair<>(module, factoryInstanceFactory);
    }

    public static /* synthetic */ Pair factory$default(ScopeDSL scopeDSL, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        Module module = scopeDSL.getModule();
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, scopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair(module, factoryInstanceFactory);
    }

    @KoinReflectAPI
    public static final /* synthetic */ <R> Pair<Module, InstanceFactory<R>> scoped(ScopeDSL scopeDSL, Qualifier qualifier) {
        Intrinsics.needClassReification();
        C16591 c16591 = new C16591();
        Kind kind = Kind.Scoped;
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c16591, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, scopeDSL.getScopeQualifier());
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
        Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
        return new Pair<>(scopeDSL.getModule(), scopedInstanceFactory);
    }

    public static /* synthetic */ Pair scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.needClassReification();
        C16591 c16591 = new C16591();
        Kind kind = Kind.Scoped;
        Qualifier scopeQualifier = scopeDSL.getScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, "R");
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c16591, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, scopeDSL.getScopeQualifier());
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
        Module.saveMapping$default(scopeDSL.getModule(), strIndexKey, scopedInstanceFactory, false, 4, null);
        return new Pair(scopeDSL.getModule(), scopedInstanceFactory);
    }
}
