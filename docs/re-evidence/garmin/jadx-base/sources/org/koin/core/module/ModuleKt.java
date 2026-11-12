package org.koin.core.module;

import e23.p;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.definition.Kind;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.instance.InstanceFactory;
import org.koin.core.instance.ScopedInstanceFactory;
import org.koin.core.instance.SingleInstanceFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.registry.ScopeRegistry;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.j0;
import p13.k;
import p13.w;
import p13.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a]\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0006\b\u0000\u0010\b\u0018\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2$\b\b\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a]\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0006\b\u0000\u0010\b\u0018\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2$\b\b\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a[\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0006\b\u0000\u0010\b\u0018\u00012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2$\b\b\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00028\u00000\u000bj\b\u0012\u0004\u0012\u00028\u0000`\u000e2\u0006\u0010\u0010\u001a\u00020\tH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a*\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0 2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006#"}, d2 = {"Lorg/koin/core/instance/InstanceFactory;", "factory", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "", "overrideError", "(Lorg/koin/core/instance/InstanceFactory;Ljava/lang/String;)V", "T", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "scopeQualifier", "Lorg/koin/core/instance/SingleInstanceFactory;", "_singleInstanceFactory", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/SingleInstanceFactory;", "Lorg/koin/core/instance/FactoryInstanceFactory;", "_factoryInstanceFactory", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/FactoryInstanceFactory;", "Lorg/koin/core/instance/ScopedInstanceFactory;", "_scopedInstanceFactory", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;Lorg/koin/core/qualifier/Qualifier;)Lorg/koin/core/instance/ScopedInstanceFactory;", "", "Lorg/koin/core/module/Module;", "module", "plus", "(Ljava/util/List;Lorg/koin/core/module/Module;)Ljava/util/List;", "modules", "", "flatten", "(Ljava/util/List;)Ljava/util/Set;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ModuleKt {
    @KoinInternalApi
    public static final <T> FactoryInstanceFactory<T> _factoryInstanceFactory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> pVar, Qualifier qualifier2) {
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public static FactoryInstanceFactory _factoryInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier2 = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        }
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    @KoinInternalApi
    public static final <T> ScopedInstanceFactory<T> _scopedInstanceFactory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> pVar, Qualifier qualifier2) {
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public static ScopedInstanceFactory _scopedInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i14, Object obj) {
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    @KoinInternalApi
    public static final <T> SingleInstanceFactory<T> _singleInstanceFactory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> pVar, Qualifier qualifier2) {
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public static SingleInstanceFactory _singleInstanceFactory$default(Qualifier qualifier, p pVar, Qualifier qualifier2, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            qualifier2 = ScopeRegistry.INSTANCE.getRootScopeQualifier();
        }
        pVar.getClass();
        qualifier2.getClass();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public static final Set<Module> flatten(List<Module> list) {
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        k kVar = new k(new y0(list));
        while (!kVar.isEmpty()) {
            Module module = (Module) kVar.removeLast();
            if (linkedHashSet.add(module)) {
                for (Module module2 : module.getIncludedModules()) {
                    if (!linkedHashSet.contains(module2)) {
                        kVar.add(module2);
                    }
                }
            }
        }
        return linkedHashSet;
    }

    public static final void overrideError(InstanceFactory<?> instanceFactory, String str) {
        instanceFactory.getClass();
        str.getClass();
        throw new DefinitionOverrideException("Already existing definition for " + instanceFactory.getBeanDefinition() + " at " + str);
    }

    public static final List<Module> plus(List<Module> list, Module module) {
        list.getClass();
        module.getClass();
        return h0.C0(list, w.c(module));
    }
}
