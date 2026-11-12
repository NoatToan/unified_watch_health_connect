package org.koin.dsl;

import androidx.exifinterface.media.ExifInterface;
import com.huami.watchfacesstore.bean.Topic;
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
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0087\b\u001a7\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/module/Module;", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "", "createOnStart", "Lkotlin/Pair;", "Lorg/koin/core/instance/InstanceFactory;", Topic.TODAY_RECOMMEND, "factory", "koin-core"}, k = 2, mv = {1, 5, 1})
public final class ModuleExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$factory$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "params", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class AnonymousClass1<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public AnonymousClass1() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: org.koin.dsl.ModuleExtKt$single$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "params", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class C16581<T> extends Lambda implements Function2<Scope, ParametersHolder, T> {
        public C16581() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        public final T invoke(@NotNull Scope scope, @NotNull ParametersHolder parametersHolder) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) InstanceBuilderKt.newInstance(scope, Reflection.getOrCreateKotlinClass(Object.class), parametersHolder);
        }
    }

    @KoinReflectAPI
    public static final /* synthetic */ <T> Pair<Module, InstanceFactory<T>> factory(Module module, Qualifier qualifier) {
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, rootScopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair<>(module, factoryInstanceFactory);
    }

    public static /* synthetic */ Pair factory$default(Module module, Qualifier qualifier, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Intrinsics.needClassReification();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, anonymousClass1, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, rootScopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair(module, factoryInstanceFactory);
    }

    @KoinReflectAPI
    public static final /* synthetic */ <T> Pair<Module, InstanceFactory<T>> single(Module module, Qualifier qualifier, boolean z) {
        Intrinsics.needClassReification();
        C16581 c16581 = new C16581();
        Kind kind = Kind.Singleton;
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c16581, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, companion.getRootScopeQualifier());
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
        if (z || module.getCreatedAtStart()) {
            module.getEagerInstances().add(singleInstanceFactory);
        }
        return new Pair<>(module, singleInstanceFactory);
    }

    public static /* synthetic */ Pair single$default(Module module, Qualifier qualifier, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Intrinsics.needClassReification();
        C16581 c16581 = new C16581();
        Kind kind = Kind.Singleton;
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, c16581, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, companion.getRootScopeQualifier());
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        Module.saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
        if (z || module.getCreatedAtStart()) {
            module.getEagerInstances().add(singleInstanceFactory);
        }
        return new Pair(module, singleInstanceFactory);
    }
}
