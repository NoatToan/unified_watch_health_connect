package org.koin.core.module;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import e23.l;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import k23.d;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import org.koin.dsl.ScopeDSL;
import org.koin.ext.KClassExtKt;
import org.koin.mp.KoinPlatformTools;
import org.koin.mp.KoinPlatformToolsKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.w;
import p13.x;

/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006\"\u00020\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b¢\u0006\u0004\b\t\u0010\fJ+\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0012\u001a\u00020\b\"\u0006\b\u0000\u0010\u0014\u0018\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000fH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0015J]\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0006\b\u0000\u0010\u0014\u0018\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0016\u001a\u00020\u00022$\b\b\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001fH\u0007¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001fH\u0007¢\u0006\u0004\b#\u0010\"J\u001b\u0010%\u001a\u00020\b2\n\u0010 \u001a\u0006\u0012\u0002\b\u00030$H\u0007¢\u0006\u0004\b%\u0010&J'\u0010+\u001a\u00020\b2\n\u0010)\u001a\u00060'j\u0002`(2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0001¢\u0006\u0004\b+\u0010,JS\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0006\b\u0000\u0010\u0014\u0018\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2$\b\b\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u001aH\u0086\bø\u0001\u0000¢\u0006\u0004\b*\u0010-J[\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\u0006\b\u0000\u0010\u0014\u0018\u00012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2$\b\b\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00028\u00000\u0017j\b\u0012\u0004\u0012\u00028\u0000`\u001a2\u0006\u0010.\u001a\u00020\rH\u0081\bø\u0001\u0000¢\u0006\u0004\b*\u0010/J\u001e\u00101\u001a\b\u0012\u0004\u0012\u00020\u0000002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b1\u00102J$\u00101\u001a\b\u0012\u0004\u0012\u00020\u0000002\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000000H\u0086\u0002¢\u0006\u0004\b1\u00104J\u001a\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010;\u0012\u0004\b>\u0010?\u001a\u0004\b<\u0010=R\u0017\u0010@\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CRZ\u0010G\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0Dj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$`E2\u001e\u0010F\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030$0Dj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030$`E8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LRL\u0010O\u001a.\u0012\b\u0012\u00060'j\u0002`(\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f0Mj\u0016\u0012\b\u0012\u00060'j\u0002`(\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001f`N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bO\u0010P\u0012\u0004\bS\u0010?\u001a\u0004\bQ\u0010RR0\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\r0Dj\b\u0012\u0004\u0012\u00020\r`E8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bT\u0010H\u0012\u0004\bV\u0010?\u001a\u0004\bU\u0010JR&\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00000W8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010Y\u0012\u0004\b\\\u0010?\u001a\u0004\bZ\u0010[R\u0011\u0010]\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b]\u0010=\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006^"}, d2 = {"Lorg/koin/core/module/Module;", "", "", "_createdAtStart", "<init>", "(Z)V", "", "module", "", "includes", "([Lorg/koin/core/module/Module;)V", "", "(Ljava/util/Collection;)V", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function1;", "Lorg/koin/dsl/ScopeDSL;", "scopeSet", Action.SCOPE_ATTRIBUTE, "(Lorg/koin/core/qualifier/Qualifier;Le23/l;)V", "T", "(Le23/l;)V", "createdAtStart", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "Lorg/koin/core/definition/KoinDefinition;", "single", "(Lorg/koin/core/qualifier/Qualifier;ZLe23/p;)Lorg/koin/core/definition/KoinDefinition;", "Lorg/koin/core/instance/InstanceFactory;", "instanceFactory", "indexPrimaryType", "(Lorg/koin/core/instance/InstanceFactory;)V", "indexSecondaryTypes", "Lorg/koin/core/instance/SingleInstanceFactory;", "prepareForCreationAtStart", "(Lorg/koin/core/instance/SingleInstanceFactory;)V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "factory", "saveMapping", "(Ljava/lang/String;Lorg/koin/core/instance/InstanceFactory;)V", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;)Lorg/koin/core/definition/KoinDefinition;", "scopeQualifier", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/definition/KoinDefinition;", "", "plus", "(Lorg/koin/core/module/Module;)Ljava/util/List;", "modules", "(Ljava/util/List;)Ljava/util/List;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "get_createdAtStart", "()Z", "get_createdAtStart$annotations", "()V", TtmlNode.ATTR_ID, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "value", "eagerInstances", "Ljava/util/LinkedHashSet;", "getEagerInstances", "()Ljava/util/LinkedHashSet;", "setEagerInstances$koin_core", "(Ljava/util/LinkedHashSet;)V", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "mappings", "Ljava/util/LinkedHashMap;", "getMappings", "()Ljava/util/LinkedHashMap;", "getMappings$annotations", "scopes", "getScopes", "getScopes$annotations", "", "includedModules", "Ljava/util/List;", "getIncludedModules", "()Ljava/util/List;", "getIncludedModules$annotations", "isLoaded", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Module {
    private final boolean _createdAtStart;
    private LinkedHashSet<SingleInstanceFactory<?>> eagerInstances;
    private final String id;
    private final List<Module> includedModules;
    private final LinkedHashMap<String, InstanceFactory<?>> mappings;
    private final LinkedHashSet<Qualifier> scopes;

    public Module(boolean z14) {
        this._createdAtStart = z14;
        this.id = KoinPlatformToolsKt.generateId(KoinPlatformTools.INSTANCE);
        this.eagerInstances = new LinkedHashSet<>();
        this.mappings = new LinkedHashMap<>();
        this.scopes = new LinkedHashSet<>();
        this.includedModules = new ArrayList();
    }

    public static KoinDefinition factory$default(Module module, Qualifier qualifier, p pVar, int i14, Object obj) {
        pVar.getClass();
        ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    @KoinInternalApi
    public static /* synthetic */ void getIncludedModules$annotations() {
    }

    @KoinInternalApi
    public static /* synthetic */ void getMappings$annotations() {
    }

    public static /* synthetic */ void getScopes$annotations() {
    }

    public static /* synthetic */ void get_createdAtStart$annotations() {
    }

    public static KoinDefinition single$default(Module module, Qualifier qualifier, boolean z14, p pVar, int i14, Object obj) {
        pVar.getClass();
        ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof Module) {
            return s.g(this.id, ((Module) other).id);
        }
        return false;
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        definition.getClass();
        ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public final LinkedHashSet<SingleInstanceFactory<?>> getEagerInstances() {
        return this.eagerInstances;
    }

    public final String getId() {
        return this.id;
    }

    public final List<Module> getIncludedModules() {
        return this.includedModules;
    }

    public final LinkedHashMap<String, InstanceFactory<?>> getMappings() {
        return this.mappings;
    }

    public final LinkedHashSet<Qualifier> getScopes() {
        return this.scopes;
    }

    public final boolean get_createdAtStart() {
        return this._createdAtStart;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public final void includes(Module... module) {
        module.getClass();
        d0.w(this.includedModules, module);
    }

    @KoinInternalApi
    public final void indexPrimaryType(InstanceFactory<?> instanceFactory) {
        String value;
        instanceFactory.getClass();
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        d<?> primaryType = beanDefinition.getPrimaryType();
        Qualifier qualifier = beanDefinition.getQualifier();
        Qualifier scopeQualifier = beanDefinition.getScopeQualifier();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(KClassExtKt.getFullName(primaryType));
        sb3.append(CoreConstants.COLON_CHAR);
        if (qualifier == null || (value = qualifier.getValue()) == null) {
            value = "";
        }
        sb3.append(value);
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(scopeQualifier);
        saveMapping(sb3.toString(), instanceFactory);
    }

    @KoinInternalApi
    public final void indexSecondaryTypes(InstanceFactory<?> instanceFactory) {
        String value;
        instanceFactory.getClass();
        BeanDefinition<?> beanDefinition = instanceFactory.getBeanDefinition();
        Iterator<T> it = beanDefinition.getSecondaryTypes().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            Qualifier qualifier = beanDefinition.getQualifier();
            Qualifier scopeQualifier = beanDefinition.getScopeQualifier();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(KClassExtKt.getFullName(dVar));
            sb3.append(CoreConstants.COLON_CHAR);
            if (qualifier == null || (value = qualifier.getValue()) == null) {
                value = "";
            }
            sb3.append(value);
            sb3.append(CoreConstants.COLON_CHAR);
            sb3.append(scopeQualifier);
            saveMapping(sb3.toString(), instanceFactory);
        }
    }

    public final boolean isLoaded() {
        return !this.mappings.isEmpty();
    }

    public final List<Module> plus(Module module) {
        module.getClass();
        return x.k(this, module);
    }

    @KoinInternalApi
    public final void prepareForCreationAtStart(SingleInstanceFactory<?> instanceFactory) {
        instanceFactory.getClass();
        this.eagerInstances.add(instanceFactory);
    }

    public final void saveMapping(String mapping, InstanceFactory<?> factory) {
        mapping.getClass();
        factory.getClass();
        this.mappings.put(mapping, factory);
    }

    @KoinDslMarker
    public final void scope(Qualifier qualifier, l<? super ScopeDSL, Unit> scopeSet) {
        qualifier.getClass();
        scopeSet.getClass();
        scopeSet.invoke(new ScopeDSL(qualifier, this));
        this.scopes.add(qualifier);
    }

    public final void setEagerInstances$koin_core(LinkedHashSet<SingleInstanceFactory<?>> linkedHashSet) {
        linkedHashSet.getClass();
        this.eagerInstances = linkedHashSet;
    }

    public final <T> KoinDefinition<T> single(Qualifier qualifier, boolean createdAtStart, p<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        definition.getClass();
        ScopeRegistry.INSTANCE.getRootScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public final void includes(Collection<Module> module) {
        module.getClass();
        this.includedModules.addAll(module);
    }

    public final List<Module> plus(List<Module> modules) {
        modules.getClass();
        return h0.C0(w.c(this), modules);
    }

    public static KoinDefinition factory$default(Module module, Qualifier qualifier, p pVar, Qualifier qualifier2, int i14, Object obj) {
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> definition, Qualifier scopeQualifier) {
        definition.getClass();
        scopeQualifier.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    @KoinDslMarker
    public final <T> void scope(l<? super ScopeDSL, Unit> scopeSet) {
        scopeSet.getClass();
        s.l();
        throw null;
    }

    public Module() {
        this(false, 1, null);
    }

    public /* synthetic */ Module(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }
}
