package org.koin.core;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.a;
import e53.o;
import e53.p;
import java.util.List;
import java.util.Set;
import k23.d;
import o13.l;
import o13.n;
import o2.c;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.definition.Kind;
import org.koin.core.error.ScopeNotCreatedException;
import org.koin.core.extension.ExtensionManager;
import org.koin.core.logger.EmptyLogger;
import org.koin.core.logger.Logger;
import org.koin.core.module.Module;
import org.koin.core.module.ModuleKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.InstanceRegistry;
import org.koin.core.registry.PropertyRegistry;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.core.time.DurationExtKt;
import org.koin.mp.KoinPlatformTools;
import org.koin.mp.KoinPlatformToolsKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJS\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014JU\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014JC\u0010\u0016\u001a\u00028\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\n\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0017JC\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0016\u0010\u001bJE\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\t2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00192\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u0010¢\u0006\u0004\b\u0018\u0010\u001bJJ\u0010!\u001a\u00020\u0006\"\u0006\b\u0000\u0010\t\u0018\u00012\u0006\u0010\u001c\u001a\u00028\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\b\u0002\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fH\u0086\b¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d\"\u0006\b\u0000\u0010\t\u0018\u0001H\u0086\b¢\u0006\u0004\b#\u0010$J-\u0010*\u001a\u00020)2\n\u0010'\u001a\u00060%j\u0002`&2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b*\u0010+J4\u0010*\u001a\u00020)\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\u0010'\u001a\u00060%j\u0002`&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0004\b*\u0010,J*\u0010*\u001a\u00020)\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\f\b\u0002\u0010'\u001a\u00060%j\u0002`&H\u0086\b¢\u0006\u0004\b*\u0010-J\u001f\u0010*\u001a\u00020)\"\b\b\u0000\u0010\t*\u00020.2\u0006\u0010/\u001a\u00028\u0000¢\u0006\u0004\b*\u00100J-\u00101\u001a\u00020)2\n\u0010'\u001a\u00060%j\u0002`&2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u0010+J(\u00101\u001a\u00020)\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\u00012\n\u0010'\u001a\u00060%j\u0002`&H\u0086\b¢\u0006\u0004\b1\u0010-J\u0019\u00102\u001a\u00020)2\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b2\u0010-J\u001b\u00103\u001a\u0004\u0018\u00010)2\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b3\u0010-J\u0019\u00104\u001a\u00020\u00062\n\u0010'\u001a\u00060%j\u0002`&¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u00106\u001a\u00020%2\u0006\u00107\u001a\u00028\u0000¢\u0006\u0004\b8\u00109J!\u00108\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\u00012\u0006\u00106\u001a\u00020%¢\u0006\u0004\b8\u0010:J\u001d\u0010<\u001a\u00020\u00062\u0006\u00106\u001a\u00020%2\u0006\u0010;\u001a\u00020\u0001¢\u0006\u0004\b<\u0010=J\u0015\u0010>\u001a\u00020\u00062\u0006\u00106\u001a\u00020%¢\u0006\u0004\b>\u00105J\r\u0010?\u001a\u00020\u0006¢\u0006\u0004\b?\u0010\u0003J/\u0010C\u001a\u00020\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010B\u001a\u00020\u001f¢\u0006\u0004\bC\u0010DJ\u001b\u0010E\u001a\u00020\u00062\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u001d¢\u0006\u0004\bE\u0010FJ\r\u0010B\u001a\u00020\u0006¢\u0006\u0004\bB\u0010\u0003R \u0010H\u001a\u00020G8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010\u0003\u001a\u0004\bJ\u0010KR \u0010N\u001a\u00020M8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u0010\u0003\u001a\u0004\bP\u0010QR \u0010T\u001a\u00020S8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u0010\u0003\u001a\u0004\bV\u0010WR \u0010Z\u001a\u00020Y8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bZ\u0010[\u0012\u0004\b^\u0010\u0003\u001a\u0004\b\\\u0010]R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00048\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010_\u0012\u0004\bb\u0010\u0003\u001a\u0004\b`\u0010a\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006c"}, d2 = {"Lorg/koin/core/Koin;", "", "<init>", "()V", "Lorg/koin/core/logger/Logger;", "logger", "", "setupLogger", "(Lorg/koin/core/logger/Logger;)V", "T", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lo13/n;", "mode", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lo13/l;", "inject", "(Lorg/koin/core/qualifier/Qualifier;Lo13/n;Le23/a;)Lo13/l;", "injectOrNull", "get", "(Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "getOrNull", "Lk23/d;", "clazz", "(Lk23/d;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "instance", "", "secondaryTypes", "", "allowOverride", "declare", "(Ljava/lang/Object;Lorg/koin/core/qualifier/Qualifier;Ljava/util/List;Z)V", "getAll", "()Ljava/util/List;", "", "Lorg/koin/core/scope/ScopeID;", "scopeId", "source", "Lorg/koin/core/scope/Scope;", "createScope", "(Ljava/lang/String;Lorg/koin/core/qualifier/Qualifier;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "(Ljava/lang/String;)Lorg/koin/core/scope/Scope;", "Lorg/koin/core/component/KoinScopeComponent;", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "getOrCreateScope", "getScope", "getScopeOrNull", "deleteScope", "(Ljava/lang/String;)V", Action.KEY_ATTRIBUTE, "defaultValue", "getProperty", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", "deleteProperty", "close", "Lorg/koin/core/module/Module;", "modules", "createEagerInstances", "loadModules", "(Ljava/util/List;ZZ)V", "unloadModules", "(Ljava/util/List;)V", "Lorg/koin/core/registry/ScopeRegistry;", "scopeRegistry", "Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry", "()Lorg/koin/core/registry/ScopeRegistry;", "getScopeRegistry$annotations", "Lorg/koin/core/registry/InstanceRegistry;", "instanceRegistry", "Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry", "()Lorg/koin/core/registry/InstanceRegistry;", "getInstanceRegistry$annotations", "Lorg/koin/core/registry/PropertyRegistry;", "propertyRegistry", "Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry", "()Lorg/koin/core/registry/PropertyRegistry;", "getPropertyRegistry$annotations", "Lorg/koin/core/extension/ExtensionManager;", "extensionManager", "Lorg/koin/core/extension/ExtensionManager;", "getExtensionManager", "()Lorg/koin/core/extension/ExtensionManager;", "getExtensionManager$annotations", "Lorg/koin/core/logger/Logger;", "getLogger", "()Lorg/koin/core/logger/Logger;", "getLogger$annotations", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Koin {
    private final ScopeRegistry scopeRegistry = new ScopeRegistry(this);
    private final InstanceRegistry instanceRegistry = new InstanceRegistry(this);
    private final PropertyRegistry propertyRegistry = new PropertyRegistry(this);
    private final ExtensionManager extensionManager = new ExtensionManager(this);
    private Logger logger = new EmptyLogger();

    public static Scope createScope$default(Koin koin, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = KoinPlatformToolsKt.generateId(KoinPlatformTools.INSTANCE);
        }
        str.getClass();
        s.l();
        throw null;
    }

    public static void declare$default(Koin koin, Object obj, Qualifier qualifier, List list, boolean z14, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            list = j0.f134944a;
        }
        list.getClass();
        koin.getInstanceRegistry().get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object get$default(Koin koin, d dVar, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return koin.get(dVar, qualifier, aVar);
    }

    @KoinInternalApi
    public static /* synthetic */ void getExtensionManager$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getInstanceRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getLogger$annotations() {
    }

    public static /* synthetic */ Scope getOrCreateScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            obj = null;
        }
        return koin.getOrCreateScope(str, qualifier, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object getOrNull$default(Koin koin, d dVar, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return koin.getOrNull(dVar, qualifier, aVar);
    }

    @KoinInternalApi
    public static /* synthetic */ void getPropertyRegistry$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getScopeRegistry$annotations() {
    }

    public static l inject$default(Koin koin, Qualifier qualifier, n nVar, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        nVar.getClass();
        koin.getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static l injectOrNull$default(Koin koin, Qualifier qualifier, n nVar, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            nVar = KoinPlatformTools.INSTANCE.defaultLazyMode();
        }
        nVar.getClass();
        koin.getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static /* synthetic */ void loadModules$default(Koin koin, List list, boolean z14, boolean z15, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            z14 = true;
        }
        if ((i14 & 4) != 0) {
            z15 = false;
        }
        koin.loadModules(list, z14, z15);
    }

    public final void close() {
        this.scopeRegistry.close$koin_core();
        this.instanceRegistry.close$koin_core();
        this.propertyRegistry.close();
        this.extensionManager.close();
    }

    public final void createEagerInstances() {
        this.logger.debug("Create eager instances ...");
        p.a.f63127a.getClass();
        o.f63125a.getClass();
        long jB = o.b();
        this.instanceRegistry.createAllEagerInstances$koin_core();
        long jB2 = p.a.C1330a.b(jB);
        this.logger.debug("Created eager instances in " + DurationExtKt.m498getInMsLRDsOJo(jB2) + " ms");
    }

    public final <T extends KoinScopeComponent> Scope createScope(T t7) {
        t7.getClass();
        return this.scopeRegistry.createScope(KoinScopeComponentKt.getScopeId(t7), KoinScopeComponentKt.getScopeName(t7), null);
    }

    public final <T> void declare(T instance, Qualifier qualifier, List<? extends d<?>> secondaryTypes, boolean allowOverride) {
        secondaryTypes.getClass();
        getInstanceRegistry().get_koin().getScopeRegistry().getRootScope().getScopeQualifier();
        Kind kind = Kind.Singleton;
        s.l();
        throw null;
    }

    public final void deleteProperty(String key) {
        key.getClass();
        this.propertyRegistry.deleteProperty(key);
    }

    public final void deleteScope(String scopeId) {
        scopeId.getClass();
        this.scopeRegistry.deleteScope$koin_core(scopeId);
    }

    public final <T> T get(d<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return (T) this.scopeRegistry.getRootScope().get(clazz, qualifier, parameters);
    }

    public final <T> List<T> getAll() {
        getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public final ExtensionManager getExtensionManager() {
        return this.extensionManager;
    }

    public final InstanceRegistry getInstanceRegistry() {
        return this.instanceRegistry;
    }

    public final Logger getLogger() {
        return this.logger;
    }

    public final Scope getOrCreateScope(String scopeId, Qualifier qualifier, Object source) {
        scopeId.getClass();
        qualifier.getClass();
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        return scopeOrNull == null ? createScope(scopeId, qualifier, source) : scopeOrNull;
    }

    public final <T> T getOrNull(d<?> clazz, Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        clazz.getClass();
        return (T) this.scopeRegistry.getRootScope().getOrNull(clazz, qualifier, parameters);
    }

    public final <T> T getProperty(String key, T defaultValue) {
        key.getClass();
        defaultValue.getClass();
        T t7 = (T) this.propertyRegistry.getProperty(key);
        return t7 == null ? defaultValue : t7;
    }

    public final PropertyRegistry getPropertyRegistry() {
        return this.propertyRegistry;
    }

    public final Scope getScope(String scopeId) throws ScopeNotCreatedException {
        scopeId.getClass();
        Scope scopeOrNull = this.scopeRegistry.getScopeOrNull(scopeId);
        if (scopeOrNull != null) {
            return scopeOrNull;
        }
        throw new ScopeNotCreatedException(c.c(CoreConstants.SINGLE_QUOTE_CHAR, "No scope found for id '", scopeId));
    }

    public final Scope getScopeOrNull(String scopeId) {
        scopeId.getClass();
        return this.scopeRegistry.getScopeOrNull(scopeId);
    }

    public final ScopeRegistry getScopeRegistry() {
        return this.scopeRegistry;
    }

    public final <T> l<T> inject(Qualifier qualifier, n mode, a<? extends ParametersHolder> parameters) {
        mode.getClass();
        getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public final <T> l<T> injectOrNull(Qualifier qualifier, n mode, a<? extends ParametersHolder> parameters) {
        mode.getClass();
        getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public final void loadModules(List<Module> modules, boolean allowOverride, boolean createEagerInstances) {
        modules.getClass();
        Set<Module> setFlatten = ModuleKt.flatten(modules);
        this.instanceRegistry.loadModules$koin_core(setFlatten, allowOverride);
        this.scopeRegistry.loadScopes(setFlatten);
        if (createEagerInstances) {
            createEagerInstances();
        }
    }

    public final void setProperty(String key, Object value) {
        key.getClass();
        value.getClass();
        this.propertyRegistry.saveProperty$koin_core(key, value);
    }

    @KoinInternalApi
    public final void setupLogger(Logger logger) {
        logger.getClass();
        this.logger = logger;
    }

    public final void unloadModules(List<Module> modules) {
        modules.getClass();
        this.instanceRegistry.unloadModules$koin_core(ModuleKt.flatten(modules));
    }

    public final <T> T get(Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public final <T> T getOrNull(Qualifier qualifier, a<? extends ParametersHolder> parameters) {
        getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static Object get$default(Koin koin, Qualifier qualifier, a aVar, int i14, Object obj) {
        koin.getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public static Object getOrNull$default(Koin koin, Qualifier qualifier, a aVar, int i14, Object obj) {
        koin.getScopeRegistry().getRootScope();
        s.l();
        throw null;
    }

    public final <T> T getProperty(String key) {
        key.getClass();
        return (T) this.propertyRegistry.getProperty(key);
    }

    public static Scope createScope$default(Koin koin, String str, Object obj, int i14, Object obj2) {
        str.getClass();
        s.l();
        throw null;
    }

    public final Scope createScope(String scopeId, Qualifier qualifier, Object source) {
        scopeId.getClass();
        qualifier.getClass();
        return this.scopeRegistry.createScope(scopeId, qualifier, source);
    }

    public static /* synthetic */ Scope createScope$default(Koin koin, String str, Qualifier qualifier, Object obj, int i14, Object obj2) {
        if ((i14 & 4) != 0) {
            obj = null;
        }
        return koin.createScope(str, qualifier, obj);
    }

    public final <T> Scope createScope(String scopeId) {
        scopeId.getClass();
        s.l();
        throw null;
    }

    public final <T> Scope getOrCreateScope(String scopeId) {
        scopeId.getClass();
        s.l();
        throw null;
    }

    public final <T> Scope createScope(String scopeId, Object source) {
        scopeId.getClass();
        s.l();
        throw null;
    }
}
