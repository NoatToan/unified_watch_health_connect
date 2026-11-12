package org.koin.core.registry;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import hb.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k23.d;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.Kind;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.NoClass;
import org.koin.core.instance.ResolutionContext;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import p13.j0;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\b2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nJ%\u0010\u0019\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001c\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ9\u0010#\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u001f\u001a\u00060\u001dj\u0002`\u001e2\n\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007¢\u0006\u0004\b#\u0010$J3\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010 2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010)\u001a\u00020'H\u0000¢\u0006\u0004\b*\u0010+J=\u00102\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010-2\b\u0010(\u001a\u0004\u0018\u00010'2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010)\u001a\u00020'2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b0\u00101J^\u00108\u001a\u00020\b\"\u0006\b\u0000\u0010-\u0018\u00012\u0006\u00103\u001a\u00028\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0012\b\u0002\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%042\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010)\u001a\u00020'2\n\u00107\u001a\u00060\u001dj\u0002`6H\u0081\b¢\u0006\u0004\b8\u00109JJ\u0010:\u001a\u00020\b\"\u0006\b\u0000\u0010-\u0018\u00012\u0006\u00103\u001a\u00028\u00002\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\u0012\b\u0002\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0081\b¢\u0006\u0004\b:\u0010;J\u0017\u0010@\u001a\u00020\b2\u0006\u0010=\u001a\u00020<H\u0000¢\u0006\u0004\b>\u0010?J\u000f\u0010B\u001a\u00020\bH\u0000¢\u0006\u0004\bA\u0010\u001bJ/\u0010E\u001a\b\u0012\u0004\u0012\u00028\u000004\"\u0004\b\u0000\u0010-2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\bC\u0010DJ\u001d\u0010H\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0015H\u0000¢\u0006\u0004\bF\u0010GJ\r\u0010J\u001a\u00020I¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010NR(\u0010P\u001a\u0016\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR$\u0010R\u001a\u0012\u0012\u0004\u0012\u00020I\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010QR%\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\u001dj\u0002`\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030 0S8F¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006V"}, d2 = {"Lorg/koin/core/registry/InstanceRegistry;", "", "Lorg/koin/core/Koin;", "_koin", "<init>", "(Lorg/koin/core/Koin;)V", "Lorg/koin/core/module/Module;", "module", "", "addAllEagerInstances", "(Lorg/koin/core/module/Module;)V", "", "allowOverride", "loadModule", "(Lorg/koin/core/module/Module;Z)V", "", "Lorg/koin/core/instance/SingleInstanceFactory;", "instances", "createEagerInstances", "(Ljava/util/Collection;)V", "unloadModule", "", "modules", "loadModules$koin_core", "(Ljava/util/Set;Z)V", "loadModules", "createAllEagerInstances$koin_core", "()V", "createAllEagerInstances", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "Lorg/koin/core/instance/InstanceFactory;", "factory", "logWarning", "saveMapping", "(ZLjava/lang/String;Lorg/koin/core/instance/InstanceFactory;Z)V", "Lk23/d;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "scopeQualifier", "resolveDefinition$koin_core", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/InstanceFactory;", "resolveDefinition", "T", "Lorg/koin/core/instance/ResolutionContext;", "instanceContext", "resolveInstance$koin_core", "(Lorg/koin/core/qualifier/Qualifier;Lk23/d;Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/instance/ResolutionContext;)Ljava/lang/Object;", "resolveInstance", "instance", "", "secondaryTypes", "Lorg/koin/core/scope/ScopeID;", "scopeID", "declareScopedInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;ZLorg/koin/core/qualifier/Qualifier;Ljava/lang/String;)V", "declareRootInstance", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "dropScopeInstances$koin_core", "(Lorg/koin/core/scope/Scope;)V", "dropScopeInstances", "close$koin_core", "close", "getAll$koin_core", "(Lk23/d;Lorg/koin/core/instance/ResolutionContext;)Ljava/util/List;", "getAll", "unloadModules$koin_core", "(Ljava/util/Set;)V", "unloadModules", "", "size", "()I", "Lorg/koin/core/Koin;", "get_koin", "()Lorg/koin/core/Koin;", "", "_instances", "Ljava/util/Map;", "eagerInstances", "", "getInstances", "()Ljava/util/Map;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstanceRegistry {
    private final Map<String, InstanceFactory<?>> _instances;
    private final Koin _koin;
    private final Map<Integer, SingleInstanceFactory<?>> eagerInstances;

    public InstanceRegistry(Koin koin) {
        koin.getClass();
        this._koin = koin;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        this._instances = koinPlatformTools.safeHashMap();
        this.eagerInstances = koinPlatformTools.safeHashMap();
    }

    private final void addAllEagerInstances(Module module) {
        for (SingleInstanceFactory<?> singleInstanceFactory : module.getEagerInstances()) {
            this.eagerInstances.put(Integer.valueOf(singleInstanceFactory.getBeanDefinition().hashCode()), singleInstanceFactory);
        }
    }

    private final void createEagerInstances(Collection<? extends SingleInstanceFactory<?>> instances) {
        ResolutionContext resolutionContext = new ResolutionContext(this._koin.getLogger(), this._koin.getScopeRegistry().getRootScope(), s0.f105811a.b(NoClass.class), null, null, 24, null);
        Iterator<T> it = instances.iterator();
        while (it.hasNext()) {
            ((SingleInstanceFactory) it.next()).get(resolutionContext);
        }
    }

    public static void declareRootInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z14, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            list = j0.f134944a;
        }
        list.getClass();
        instanceRegistry.get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    public static void declareScopedInstance$default(InstanceRegistry instanceRegistry, Object obj, Qualifier qualifier, List list, boolean z14, Qualifier qualifier2, String str, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            list = j0.f134944a;
        }
        list.getClass();
        qualifier2.getClass();
        str.getClass();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    private final void loadModule(Module module, boolean allowOverride) {
        for (Map.Entry<String, InstanceFactory<?>> entry : module.getMappings().entrySet()) {
            saveMapping$default(this, allowOverride, entry.getKey(), entry.getValue(), false, 8, null);
        }
    }

    public static /* synthetic */ void saveMapping$default(InstanceRegistry instanceRegistry, boolean z14, String str, InstanceFactory instanceFactory, boolean z15, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            z15 = true;
        }
        instanceRegistry.saveMapping(z14, str, instanceFactory, z15);
    }

    private final void unloadModule(Module module) {
        Set<String> setKeySet = module.getMappings().keySet();
        setKeySet.getClass();
        for (String str : setKeySet) {
            InstanceFactory<?> instanceFactory = this._instances.get(str);
            if (instanceFactory != null) {
                instanceFactory.dropAll();
            }
            this._instances.remove(str);
        }
    }

    public final void close$koin_core() {
        Iterator<Map.Entry<String, InstanceFactory<?>>> it = this._instances.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dropAll();
        }
        this._instances.clear();
    }

    public final void createAllEagerInstances$koin_core() {
        SingleInstanceFactory[] singleInstanceFactoryArr = (SingleInstanceFactory[]) this.eagerInstances.values().toArray(new SingleInstanceFactory[0]);
        ArrayList arrayListD = x.d(Arrays.copyOf(singleInstanceFactoryArr, singleInstanceFactoryArr.length));
        this.eagerInstances.clear();
        createEagerInstances(arrayListD);
    }

    public final <T> void declareRootInstance(T instance, Qualifier qualifier, List<? extends d<?>> secondaryTypes, boolean allowOverride) {
        secondaryTypes.getClass();
        get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    public final <T> void declareScopedInstance(T instance, Qualifier qualifier, List<? extends d<?>> secondaryTypes, boolean allowOverride, Qualifier scopeQualifier, String scopeID) {
        secondaryTypes.getClass();
        scopeQualifier.getClass();
        scopeID.getClass();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    public final void dropScopeInstances$koin_core(Scope scope) {
        scope.getClass();
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (obj instanceof ScopedInstanceFactory) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ScopedInstanceFactory) it.next()).drop(scope);
        }
    }

    public final <T> List<T> getAll$koin_core(d<?> clazz, ResolutionContext instanceContext) {
        clazz.getClass();
        instanceContext.getClass();
        Collection<InstanceFactory<?>> collectionValues = this._instances.values();
        ArrayList arrayList = new ArrayList();
        for (T t7 : collectionValues) {
            InstanceFactory instanceFactory = (InstanceFactory) t7;
            if (s.g(instanceFactory.getBeanDefinition().getScopeQualifier(), instanceContext.getScope().getScopeQualifier()) && (s.g(instanceFactory.getBeanDefinition().getPrimaryType(), clazz) || instanceFactory.getBeanDefinition().getSecondaryTypes().contains(clazz))) {
                arrayList.add(t7);
            }
        }
        List listT = h0.T(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = listT.iterator();
        while (it.hasNext()) {
            Object obj = ((InstanceFactory) it.next()).get(instanceContext);
            if (obj == null) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final Map<String, InstanceFactory<?>> getInstances() {
        return this._instances;
    }

    public final Koin get_koin() {
        return this._koin;
    }

    public final void loadModules$koin_core(Set<Module> modules, boolean allowOverride) {
        modules.getClass();
        for (Module module : modules) {
            loadModule(module, allowOverride);
            addAllEagerInstances(module);
        }
    }

    public final InstanceFactory<?> resolveDefinition$koin_core(d<?> clazz, Qualifier qualifier, Qualifier scopeQualifier) {
        String value;
        clazz.getClass();
        scopeQualifier.getClass();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(KClassExtKt.getFullName(clazz));
        sb3.append(CoreConstants.COLON_CHAR);
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        sb3.append(value);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(scopeQualifier);
        return this._instances.get(sb3.toString());
    }

    public final <T> T resolveInstance$koin_core(Qualifier qualifier, d<?> clazz, Qualifier scopeQualifier, ResolutionContext instanceContext) {
        clazz.getClass();
        scopeQualifier.getClass();
        instanceContext.getClass();
        InstanceFactory<?> instanceFactoryResolveDefinition$koin_core = resolveDefinition$koin_core(clazz, qualifier, scopeQualifier);
        T t7 = instanceFactoryResolveDefinition$koin_core != null ? (T) instanceFactoryResolveDefinition$koin_core.get(instanceContext) : null;
        if (t7 == null) {
            return null;
        }
        return t7;
    }

    @KoinInternalApi
    public final void saveMapping(boolean allowOverride, String mapping, InstanceFactory<?> factory, boolean logWarning) {
        mapping.getClass();
        factory.getClass();
        if (this._instances.get(mapping) != null) {
            if (!allowOverride) {
                ModuleKt.overrideError(factory, mapping);
            } else if (logWarning) {
                Logger logger = this._koin.getLogger();
                StringBuilder sbL = a.l("(+) override index '", mapping, "' -> '");
                sbL.append(factory.getBeanDefinition());
                sbL.append(CoreConstants.SINGLE_QUOTE_CHAR);
                logger.warn(sbL.toString());
            }
        }
        Logger logger2 = this._koin.getLogger();
        StringBuilder sbL2 = a.l("(+) index '", mapping, "' -> '");
        sbL2.append(factory.getBeanDefinition());
        sbL2.append(CoreConstants.SINGLE_QUOTE_CHAR);
        logger2.debug(sbL2.toString());
        this._instances.put(mapping, factory);
    }

    public final int size() {
        return this._instances.size();
    }

    public final void unloadModules$koin_core(Set<Module> modules) {
        modules.getClass();
        Iterator<T> it = modules.iterator();
        while (it.hasNext()) {
            unloadModule((Module) it.next());
        }
    }
}
