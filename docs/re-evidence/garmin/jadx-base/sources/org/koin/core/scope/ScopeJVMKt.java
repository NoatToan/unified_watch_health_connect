package org.koin.core.scope;

import e23.a;
import k23.d;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aM\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "T", "Lorg/koin/core/scope/Scope;", "Ljava/lang/Class;", "clazz", "Lorg/koin/core/qualifier/Qualifier;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/ParametersHolder;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "get", "(Lorg/koin/core/scope/Scope;Ljava/lang/Class;Lorg/koin/core/qualifier/Qualifier;Le23/a;)Ljava/lang/Object;", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ScopeJVMKt {
    public static final <T> T get(Scope scope, Class<?> cls) {
        scope.getClass();
        cls.getClass();
        return (T) get$default(scope, cls, null, null, 6, null);
    }

    public static /* synthetic */ Object get$default(Scope scope, Class cls, Qualifier qualifier, a aVar, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            qualifier = null;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        return get(scope, cls, qualifier, aVar);
    }

    public static final <T> T get(Scope scope, Class<?> cls, Qualifier qualifier) {
        scope.getClass();
        cls.getClass();
        return (T) get$default(scope, cls, qualifier, null, 4, null);
    }

    public static final <T> T get(Scope scope, Class<?> cls, Qualifier qualifier, a<? extends ParametersHolder> aVar) {
        scope.getClass();
        cls.getClass();
        return (T) scope.get((d<?>) s0.f105811a.b(cls), qualifier, aVar);
    }
}
