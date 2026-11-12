package org.koin.android.scope;

import android.content.ComponentCallbacks;
import o13.l;
import o13.m;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import s73.a;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Landroid/content/ComponentCallbacks;", "T", "", "source", "Lorg/koin/core/scope/Scope;", "createScope", "(Landroid/content/ComponentCallbacks;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "(Landroid/content/ComponentCallbacks;)Lorg/koin/core/scope/Scope;", "Lo13/l;", "newScope", "(Landroid/content/ComponentCallbacks;)Lo13/l;", "getOrCreateScope", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComponentCallbacksExtKt {
    public static final <T extends ComponentCallbacks> Scope createScope(T t7, Object obj) {
        t7.getClass();
        return ComponentCallbackExtKt.getKoin(t7).createScope(KoinScopeComponentKt.getScopeId(t7), KoinScopeComponentKt.getScopeName(t7), obj);
    }

    public static /* synthetic */ Scope createScope$default(ComponentCallbacks componentCallbacks, Object obj, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        return createScope(componentCallbacks, obj);
    }

    public static final <T extends ComponentCallbacks> l<Scope> getOrCreateScope(T t7) {
        t7.getClass();
        return m.b(new a(t7, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope getOrCreateScope$lambda$1(ComponentCallbacks componentCallbacks) {
        Scope scopeOrNull = getScopeOrNull(componentCallbacks);
        return scopeOrNull == null ? createScope$default(componentCallbacks, null, 1, null) : scopeOrNull;
    }

    public static final <T extends ComponentCallbacks> Scope getScopeOrNull(T t7) {
        t7.getClass();
        return ComponentCallbackExtKt.getKoin(t7).getScopeOrNull(KoinScopeComponentKt.getScopeId(t7));
    }

    public static final <T extends ComponentCallbacks> l<Scope> newScope(T t7) {
        t7.getClass();
        return m.b(new a(t7, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Scope newScope$lambda$0(ComponentCallbacks componentCallbacks) {
        return createScope$default(componentCallbacks, null, 1, null);
    }
}
