package org.koin.dsl;

import e23.p;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.KoinDslMarker;
import org.koin.core.module.Module;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes3.dex */
@KoinDslMarker
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JS\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0006\b\u0000\u0010\b\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022$\b\b\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JS\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0006\b\u0000\u0010\b\u0018\u00012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022$\b\b\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\rH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0019"}, d2 = {"Lorg/koin/dsl/ScopeDSL;", "", "Lorg/koin/core/qualifier/Qualifier;", "scopeQualifier", "Lorg/koin/core/module/Module;", "module", "<init>", "(Lorg/koin/core/qualifier/Qualifier;Lorg/koin/core/module/Module;)V", "T", "qualifier", "Lkotlin/Function2;", "Lorg/koin/core/scope/Scope;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/definition/Definition;", "definition", "Lorg/koin/core/definition/KoinDefinition;", "scoped", "(Lorg/koin/core/qualifier/Qualifier;Le23/p;)Lorg/koin/core/definition/KoinDefinition;", "factory", "Lorg/koin/core/qualifier/Qualifier;", "getScopeQualifier", "()Lorg/koin/core/qualifier/Qualifier;", "Lorg/koin/core/module/Module;", "getModule", "()Lorg/koin/core/module/Module;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ScopeDSL {
    private final Module module;
    private final Qualifier scopeQualifier;

    public ScopeDSL(Qualifier qualifier, Module module) {
        qualifier.getClass();
        module.getClass();
        this.scopeQualifier = qualifier;
        this.module = module;
    }

    public static KoinDefinition factory$default(ScopeDSL scopeDSL, Qualifier qualifier, p pVar, int i14, Object obj) {
        pVar.getClass();
        scopeDSL.getModule();
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public static KoinDefinition scoped$default(ScopeDSL scopeDSL, Qualifier qualifier, p pVar, int i14, Object obj) {
        pVar.getClass();
        scopeDSL.getScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public final <T> KoinDefinition<T> factory(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        definition.getClass();
        getModule();
        getScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }

    public final Module getModule() {
        return this.module;
    }

    public final Qualifier getScopeQualifier() {
        return this.scopeQualifier;
    }

    public final <T> KoinDefinition<T> scoped(Qualifier qualifier, p<? super Scope, ? super ParametersHolder, ? extends T> definition) {
        definition.getClass();
        getScopeQualifier();
        Kind kind = Kind.Singleton;
        j0 j0Var = j0.f134944a;
        s.l();
        throw null;
    }
}
