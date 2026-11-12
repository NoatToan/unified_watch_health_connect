package org.koin.core.component;

import o13.l;
import o13.m;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u00002\n\u0010\n\u001a\u00060\u0002j\u0002`\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\r\u001a\u00020\f\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000f\u001a\u001d\u0010\u0010\u001a\u0004\u0018\u00010\f\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u0012\"\b\b\u0000\u0010\u0001*\u00020\b*\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"", "T", "", "getScopeId", "(Ljava/lang/Object;)Ljava/lang/String;", "Lorg/koin/core/qualifier/TypeQualifier;", "getScopeName", "(Ljava/lang/Object;)Lorg/koin/core/qualifier/TypeQualifier;", "Lorg/koin/core/component/KoinScopeComponent;", "Lorg/koin/core/scope/ScopeID;", "scopeId", "source", "Lorg/koin/core/scope/Scope;", "createScope", "(Lorg/koin/core/component/KoinScopeComponent;Ljava/lang/String;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "(Lorg/koin/core/component/KoinScopeComponent;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "(Lorg/koin/core/component/KoinScopeComponent;)Lorg/koin/core/scope/Scope;", "Lo13/l;", "newScope", "(Lorg/koin/core/component/KoinScopeComponent;)Lo13/l;", "getOrCreateScope", "koin-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class KoinScopeComponentKt {
    public static final <T extends KoinScopeComponent> Scope createScope(T t7, Object obj) {
        t7.getClass();
        return t7.getKoin().createScope(getScopeId(t7), getScopeName(t7), obj);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, String str, Object obj, int i14, Object obj2) {
        if ((i14 & 2) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, str, obj);
    }

    public static final <T extends KoinScopeComponent> l<Scope> getOrCreateScope(T t7) {
        t7.getClass();
        return m.b(new a(t7, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope getOrCreateScope$lambda$1(KoinScopeComponent koinScopeComponent) {
        Scope scopeOrNull = getScopeOrNull(koinScopeComponent);
        return scopeOrNull == null ? createScope$default(koinScopeComponent, null, 1, null) : scopeOrNull;
    }

    public static final <T> String getScopeId(T t7) {
        t7.getClass();
        return KClassExtKt.getFullName(s0.f105811a.b(t7.getClass())) + '@' + t7.hashCode();
    }

    public static final <T> TypeQualifier getScopeName(T t7) {
        t7.getClass();
        return new TypeQualifier(s0.f105811a.b(t7.getClass()));
    }

    public static final <T extends KoinScopeComponent> Scope getScopeOrNull(T t7) {
        t7.getClass();
        return t7.getKoin().getScopeOrNull(getScopeId(t7));
    }

    public static final <T extends KoinScopeComponent> l<Scope> newScope(T t7) {
        t7.getClass();
        return m.b(new a(t7, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope newScope$lambda$0(KoinScopeComponent koinScopeComponent) {
        return createScope$default(koinScopeComponent, null, 1, null);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, obj);
    }

    public static final <T extends KoinScopeComponent> Scope createScope(T t7, String str, Object obj) {
        t7.getClass();
        str.getClass();
        return t7.getKoin().createScope(str, getScopeName(t7), obj);
    }
}
