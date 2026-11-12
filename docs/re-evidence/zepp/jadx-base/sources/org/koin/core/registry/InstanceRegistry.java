package org.koin.core.registry;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.BeanDefinitionKt;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceContext;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Level;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010B\u001a\u00020>¢\u0006\u0004\bK\u0010LJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\f\u001a\u00020\u00062\u001e\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`\nH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J%\u0010\u0012\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0007J3\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00192\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#J=\u0010*\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010%2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)JR\u0010-\u001a\u00020\u0006\"\u0006\b\u0000\u0010%\u0018\u00012\u0006\u0010+\u001a\u00028\u00002\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\b\u0002\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u001fH\u0081\b¢\u0006\u0004\b-\u0010.J\u0017\u00103\u001a\u00020\u00062\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00105\u001a\u00020\u0006H\u0000¢\u0006\u0004\b4\u0010\u0014J/\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010%2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b6\u00107J\u001d\u0010;\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010:J\u0006\u0010=\u001a\u00020<R\u0019\u0010B\u001a\u00020>8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010AR*\u0010E\u001a\u0016\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190C8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR.\u0010\u000b\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\bj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t`\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010FR'\u0010J\u001a\u0016\u0012\b\u0012\u00060\u0016j\u0002`\u0017\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190G8F@\u0006¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006M"}, d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "Lorg/koin/core/module/Module;", "module", "", "allowOverride", "", "b", "Ljava/util/HashSet;", "Lorg/koin/core/instance/SingleInstanceFactory;", "Lkotlin/collections/HashSet;", "eagerInstances", "a", "c", "", "modules", "loadModules$koin_core", "(Ljava/util/List;Z)V", "loadModules", "createAllEagerInstances$koin_core", "()V", "createAllEagerInstances", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Lorg/koin/core/instance/InstanceFactory;", "factory", "logWarning", "saveMapping", "Lkotlin/reflect/KClass;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "scopeQualifier", "resolveDefinition$koin_core", "(Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/InstanceFactory;", "resolveDefinition", ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/instance/InstanceContext;", "instanceContext", "resolveInstance$koin_core", "(Lorg/koin/core/qualifier/Qualifier;Lkotlin/reflect/KClass;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/instance/InstanceContext;)Ljava/lang/Object;", "resolveInstance", DefaultSettingsSpiCall.n, "secondaryTypes", "declareInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZLorg/koin/core/qualifier/Qualifier;)V", "Lorg/koin/core/scope/Scope;", "scope", "dropScopeInstances$koin_core", "(Lorg/koin/core/scope/Scope;)V", "dropScopeInstances", "close$koin_core", "close", "getAll$koin_core", "(Lkotlin/reflect/KClass;Lorg/koin/core/instance/InstanceContext;)Ljava/util/List;", "getAll", "unloadModules$koin_core", "(Ljava/util/List;)V", "unloadModules", "", "size", "Lorg/koin/core/Koin;", "Lorg/koin/core/Koin;", "get_koin", "()Lorg/koin/core/Koin;", "_koin", "", "Ljava/util/Map;", "_instances", "Ljava/util/HashSet;", "", "getInstances", "()Ljava/util/Map;", "instances", "<init>", "(Lorg/koin/core/Koin;)V", "koin-core"}, k = 1, mv = {1, 5, 1})
public final class InstanceRegistry {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Koin _koin;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<String, InstanceFactory<?>> _instances = KoinPlatformTools.INSTANCE.safeHashMap();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashSet<SingleInstanceFactory<?>> eagerInstances = new HashSet<>();

    public InstanceRegistry(@NotNull Koin koin) {
        this._koin = koin;
    }

    private final void a(HashSet<SingleInstanceFactory<?>> eagerInstances) {
        if (!eagerInstances.isEmpty()) {
            if (this._koin.getLogger().isAt(Level.DEBUG)) {
                this._koin.getLogger().debug("Creating eager instances ...");
            }
            Koin koin = this._koin;
            InstanceContext instanceContext = new InstanceContext(koin, koin.getScopeRegistry().getRootScope(), null, 4, null);
            Iterator<T> it2 = eagerInstances.iterator();
            while (it2.hasNext()) {
                ((SingleInstanceFactory) it2.next()).get(instanceContext);
            }
        }
    }

    private final void b(Module module, boolean allowOverride) {
        for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
            saveMapping$default(this, allowOverride, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    private final void c(Module module) {
        for (String str : module.getMappings().keySet()) {
            if (this._instances.containsKey(str)) {
                InstanceFactory<?> instanceFactory = this._instances.get(str);
                if (instanceFactory != null) {
                    instanceFactory.dropAll();
                }
                this._instances.remove(str);
            }
        }
    }

    public static /* synthetic */ void declareInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z, Qualifier qualifier2, int i, Object obj2) {
        Qualifier qualifier3 = (i & 2) != 0 ? null : qualifier;
        List listEmptyList = (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list;
        boolean z2 = (i & 8) != 0 ? true : z;
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareInstance$def$1 instanceRegistry$declareInstance$def$1 = new InstanceRegistry$declareInstance$def$1(obj);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(qualifier2, Reflection.getOrCreateKotlinClass(Object.class), qualifier3, instanceRegistry$declareInstance$def$1, kind, listEmptyList);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        Iterator<T> it2 = beanDefinition.getSecondaryTypes().iterator();
        while (it2.hasNext()) {
            saveMapping$default(instanceRegistry, z2, BeanDefinitionKt.indexKey((KClass) it2.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z, String str, InstanceFactory instanceFactory, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        instanceRegistry.saveMapping(z, str, instanceFactory, z2);
    }

    public final void close$koin_core() {
        for (Map.Entry<String, InstanceFactory<?>> entry : this._instances.entrySet()) {
            entry.getKey();
            entry.getValue().dropAll();
        }
        this._instances.clear();
    }

    public final void createAllEagerInstances$koin_core() {
        a(this.eagerInstances);
        this.eagerInstances.clear();
    }

    @PublishedApi
    public final /* synthetic */ <T> void declareInstance(T instance, Qualifier qualifier, List<? extends KClass<?>> secondaryTypes, boolean allowOverride, Qualifier scopeQualifier) {
        Kind kind = Kind.Scoped;
        Intrinsics.needClassReification();
        InstanceRegistry$declareInstance$def$1 instanceRegistry$declareInstance$def$1 = new InstanceRegistry$declareInstance$def$1(instance);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        BeanDefinition beanDefinition = new BeanDefinition(scopeQualifier, Reflection.getOrCreateKotlinClass(Object.class), qualifier, instanceRegistry$declareInstance$def$1, kind, secondaryTypes);
        ScopedInstanceFactory scopedInstanceFactory = new ScopedInstanceFactory(beanDefinition);
        saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey(beanDefinition.getPrimaryType(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        Iterator<T> it2 = beanDefinition.getSecondaryTypes().iterator();
        while (it2.hasNext()) {
            saveMapping$default(this, allowOverride, BeanDefinitionKt.indexKey((KClass) it2.next(), beanDefinition.getQualifier(), beanDefinition.getScopeQualifier()), scopedInstanceFactory, false, 8, null);
        }
    }

    public final void dropScopeInstances$koin_core(@NotNull Scope scope) {
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ScopedInstanceFactory) it2.next()).drop(scope);
        }
    }

    @NotNull
    public final <T> List<T> getAll$koin_core(@NotNull KClass<?> clazz, @NotNull InstanceContext instanceContext) {
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (T t : collectionValues) {
            if (Intrinsics.areEqual(((InstanceFactory) t).getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier())) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (T t2 : arrayList) {
            InstanceFactory instanceFactory = (InstanceFactory) t2;
            if (Intrinsics.areEqual(instanceFactory.getBeanDefinition().getPrimaryType(), clazz) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(clazz)) {
                arrayList2.add(t2);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator<T> it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((InstanceFactory) it2.next()).get(instanceContext));
        }
        return arrayList3;
    }

    @NotNull
    public final Map<String, InstanceFactory<?>> getInstances() {
        return this._instances;
    }

    @NotNull
    public final Koin get_koin() {
        return this._koin;
    }

    public final void loadModules$koin_core(@NotNull List<Module> modules, boolean allowOverride) {
        for (Module module : modules) {
            b(module, allowOverride);
            this.eagerInstances.addAll(module.getEagerInstances());
        }
    }

    @Nullable
    public final InstanceFactory<?> resolveDefinition$koin_core(@NotNull KClass<?> clazz, @Nullable Qualifier qualifier, @NotNull Qualifier scopeQualifier) {
        return this._instances.get(BeanDefinitionKt.indexKey(clazz, qualifier, scopeQualifier));
    }

    @Nullable
    public final <T> T resolveInstance$koin_core(@Nullable Qualifier qualifier, @NotNull KClass<?> clazz, @NotNull Qualifier scopeQualifier, @NotNull InstanceContext instanceContext) {
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = resolveDefinition$koin_core(clazz, qualifier, scopeQualifier);
        if (instanceFactoryResolveDefinition$koin_core == null) {
            return null;
        }
        return (T) instanceFactoryResolveDefinition$koin_core.get(instanceContext);
    }

    @KoinInternalApi
    public final void saveMapping(boolean allowOverride, @NotNull String mapping, @NotNull InstanceFactory<?> factory, boolean logWarning) {
        if (this._instances.containsKey(mapping)) {
            if (!allowOverride) {
                ModuleKt.overrideError(factory, mapping);
            } else if (logWarning) {
                this._koin.getLogger().info("Override Mapping '" + mapping + "' with " + factory.getBeanDefinition());
            }
        }
        if (this._koin.getLogger().isAt(Level.DEBUG) && logWarning) {
            this._koin.getLogger().debug("add mapping '" + mapping + "' for " + factory.getBeanDefinition());
        }
        this._instances.put(mapping, factory);
    }

    public final int size() {
        return this._instances.size();
    }

    public final void unloadModules$koin_core(@NotNull List<Module> modules) {
        Iterator<T> it2 = modules.iterator();
        while (it2.hasNext()) {
            c((Module) it2.next());
        }
    }
}
