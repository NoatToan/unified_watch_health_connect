package org.koin.core.module;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.watchfacesstore.bean.Topic;
import com.xiaomi.hm.health.training.api.constant.TrainingWebConst;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b=\u0010>J'\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007J-\u0010\t\u001a\u00020\u0006\"\u0006\b\u0000\u0010\n\u0018\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000Jg\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\"\u0006\b\u0000\u0010\n\u0018\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2)\b\b\u0010\u0011\u001a#\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u0010¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000J*\u0010\u001a\u001a\u00020\u00062\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00132\b\b\u0002\u0010\u0019\u001a\u00020\u000bH\u0001J]\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\"\u0006\b\u0000\u0010\n\u0018\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022)\b\b\u0010\u0011\u001a#\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u0010¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000Je\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0012\"\u0006\b\u0000\u0010\n\u0018\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022)\b\b\u0010\u0011\u001a#\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u0010¢\u0006\u0002\b\u00072\u0006\u0010\u001b\u001a\u00020\u0002H\u0081\bø\u0001\u0000J\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001c\u001a\u00020\u0000H\u0086\u0002J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u001dH\u0086\u0002R\u0019\u0010\f\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#RZ\u0010.\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%`&2\u001e\u0010'\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0$j\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%`&8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-RN\u00107\u001a.\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00130/j\u0016\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0013`08\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b1\u00102\u0012\u0004\b5\u00106\u001a\u0004\b3\u00104R2\u0010;\u001a\u0012\u0012\u0004\u0012\u00020\u00020$j\b\u0012\u0004\u0012\u00020\u0002`&8\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b8\u0010)\u0012\u0004\b:\u00106\u001a\u0004\b9\u0010+R\u0013\u0010<\u001a\u00020\u000b8F@\u0006¢\u0006\u0006\u001a\u0004\b<\u0010#\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006?"}, d2 = {"Lorg/koin/core/module/Module;", "", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "", "Lkotlin/ExtensionFunctionType;", "scopeSet", "scope", ExifInterface.GPS_DIRECTION_TRUE, "", "createdAtStart", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", TrainingWebConst.QueryParam.DEFINITION, "Lkotlin/Pair;", "Lorg/koin/core/instance/InstanceFactory;", Topic.TODAY_RECOMMEND, "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "allowOverride", "saveMapping", "scopeQualifier", "module", "", "plus", "modules", "a", "Z", "getCreatedAtStart", "()Z", "Ljava/util/HashSet;", "Lorg/koin/core/instance/SingleInstanceFactory;", "Lkotlin/collections/HashSet;", "<set-?>", "b", "Ljava/util/HashSet;", "getEagerInstances", "()Ljava/util/HashSet;", "setEagerInstances$koin_core", "(Ljava/util/HashSet;)V", "eagerInstances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "getMappings", "()Ljava/util/HashMap;", "getMappings$annotations", "()V", "mappings", GoogleApiAvailabilityLight.a, "getScopes", "getScopes$annotations", "scopes", "isLoaded", "<init>", "(Z)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class Module {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean createdAtStart;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private HashSet<SingleInstanceFactory<?>> eagerInstances;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<String, InstanceFactory<?>> mappings;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final HashSet<Qualifier> scopes;

    public Module() {
        this(false, 1, null);
    }

    public Module(boolean z) {
        this.createdAtStart = z;
        this.eagerInstances = new HashSet<>();
        this.mappings = new HashMap<>();
        this.scopes = new HashSet<>();
    }

    public static /* synthetic */ Pair factory$default(Module module, Qualifier qualifier, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, rootScopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair(module, factoryInstanceFactory);
    }

    @PublishedApi
    public static /* synthetic */ void getMappings$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getScopes$annotations() {
    }

    public static /* synthetic */ void saveMapping$default(Module module, String str, InstanceFactory instanceFactory, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        module.saveMapping(str, instanceFactory, z);
    }

    public static /* synthetic */ Pair single$default(Module module, Qualifier qualifier, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        Kind kind = Kind.Singleton;
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, companion.getRootScopeQualifier());
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        saveMapping$default(module, strIndexKey, singleInstanceFactory, false, 4, null);
        if (z || module.getCreatedAtStart()) {
            module.getEagerInstances().add(singleInstanceFactory);
        }
        return new Pair(module, singleInstanceFactory);
    }

    public final /* synthetic */ <T> Pair<Module, InstanceFactory<T>> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        StringQualifier rootScopeQualifier = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, rootScopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        saveMapping$default(this, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair<>(this, factoryInstanceFactory);
    }

    public final boolean getCreatedAtStart() {
        return this.createdAtStart;
    }

    @NotNull
    public final HashSet<SingleInstanceFactory<?>> getEagerInstances() {
        return this.eagerInstances;
    }

    @NotNull
    public final HashMap<String, InstanceFactory<?>> getMappings() {
        return this.mappings;
    }

    @NotNull
    public final HashSet<Qualifier> getScopes() {
        return this.scopes;
    }

    public final boolean isLoaded() {
        return this.mappings.size() > 0;
    }

    @NotNull
    public final List<Module> plus(@NotNull Module module) {
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Module[]{this, module});
    }

    @PublishedApi
    public final void saveMapping(@NotNull String mapping, @NotNull InstanceFactory<?> factory, boolean allowOverride) {
        if (!allowOverride && this.mappings.containsKey(mapping)) {
            ModuleKt.overrideError(factory, mapping);
        }
        this.mappings.put(mapping, factory);
    }

    public final void scope(@NotNull Qualifier qualifier, @NotNull Function1<? super ScopeDSL, Unit> scopeSet) {
        scopeSet.invoke(new ScopeDSL(qualifier, this));
        this.scopes.add(qualifier);
    }

    public final void setEagerInstances$koin_core(@NotNull HashSet<SingleInstanceFactory<?>> hashSet) {
        this.eagerInstances = hashSet;
    }

    public final /* synthetic */ <T> Pair<Module, InstanceFactory<T>> single(Qualifier qualifier, boolean createdAtStart, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        Kind kind = Kind.Singleton;
        ScopeRegistry.Companion companion = ScopeRegistry.INSTANCE;
        StringQualifier rootScopeQualifier = companion.getRootScopeQualifier();
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(rootScopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, companion.getRootScopeQualifier());
        SingleInstanceFactory<?> singleInstanceFactory = new SingleInstanceFactory<>(beanDefinition);
        saveMapping$default(this, strIndexKey, singleInstanceFactory, false, 4, null);
        if (createdAtStart || getCreatedAtStart()) {
            getEagerInstances().add(singleInstanceFactory);
        }
        return new Pair<>(this, singleInstanceFactory);
    }

    @NotNull
    public final List<Module> plus(@NotNull List<Module> modules) {
        return CollectionsKt___CollectionsKt.plus((Collection) e.listOf(this), (Iterable) modules);
    }

    public final /* synthetic */ <T> void scope(Function1<? super ScopeDSL, Unit> scopeSet) {
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        TypeQualifier typeQualifier = new TypeQualifier(Reflection.getOrCreateKotlinClass(Object.class));
        scopeSet.invoke(new ScopeDSL(typeQualifier, this));
        getScopes().add(typeQualifier);
    }

    public /* synthetic */ Module(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    public static /* synthetic */ Pair factory$default(Module module, Qualifier qualifier, Function2 function2, Qualifier qualifier2, int i, Object obj) {
        if ((i & 1) != 0) {
            qualifier = null;
        }
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier, function2, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, qualifier2);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        saveMapping$default(module, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair(module, factoryInstanceFactory);
    }

    @PublishedApi
    public final /* synthetic */ <T> Pair<Module, InstanceFactory<T>> factory(Qualifier qualifier, Function2<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        Kind kind = Kind.Factory;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, definition, kind, listEmptyList);
        String strIndexKey = BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), qualifier, scopeQualifier);
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        saveMapping$default(this, strIndexKey, factoryInstanceFactory, false, 4, null);
        return new Pair<>(this, factoryInstanceFactory);
    }
}
