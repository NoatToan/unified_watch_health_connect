package org.koin.androidx.scope;

import android.content.ComponentCallbacks;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import androidx.lifecycle.w1;
import b.e;
import b.g;
import ch.qos.logback.core.joran.action.Action;
import o13.l;
import o13.m;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import org.koin.core.scope.ScopeCallback;
import org.koin.ext.KClassExtKt;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u0002*\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\n\u001a\u0004\u0018\u00010\u0002*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\f\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\f\u0010\u000b\u001a\u001b\u0010\u0010\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001b\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0002*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u000b\u001a\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0002*\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lb/g;", "Lo13/l;", "Lorg/koin/core/scope/Scope;", "activityScope", "(Lb/g;)Lo13/l;", "activityRetainedScope", "", "source", "createScope", "(Lb/g;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "(Lb/g;)Lorg/koin/core/scope/Scope;", "createActivityScope", "Landroid/content/ComponentCallbacks;", "Landroidx/lifecycle/n0;", "owner", "createScopeForCurrentLifecycle", "(Landroid/content/ComponentCallbacks;Landroidx/lifecycle/n0;)Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "", "registerScopeForLifecycle", "(Landroidx/lifecycle/n0;Lorg/koin/core/scope/Scope;)V", "createActivityRetainedScope", "", "retainedScopeId", "(Lb/g;)Ljava/lang/String;", "getRetainedScopeOrNull", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComponentActivityExtKt {
    public static final l<Scope> activityRetainedScope(g gVar) {
        gVar.getClass();
        return m.b(new e(gVar, 6));
    }

    public static final l<Scope> activityScope(g gVar) {
        gVar.getClass();
        return m.b(new e(gVar, 5));
    }

    public static final Scope createActivityRetainedScope(g gVar) {
        gVar.getClass();
        if (!(gVar instanceof AndroidScopeComponent)) {
            h.z("Activity should implement AndroidScopeComponent");
            return null;
        }
        ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new w1(s0.f105811a.b(ScopeHandlerViewModel.class), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$2(gVar), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$1(gVar), new ComponentActivityExtKt$createActivityRetainedScope$$inlined$viewModels$default$3(null, gVar)).getValue();
        if (scopeHandlerViewModel.getScope() == null) {
            scopeHandlerViewModel.setScope(Koin.createScope$default(ComponentCallbackExtKt.getKoin(gVar), retainedScopeId(gVar), KoinScopeComponentKt.getScopeName(gVar), null, 4, null));
        }
        Scope scope = scopeHandlerViewModel.getScope();
        scope.getClass();
        return scope;
    }

    public static final Scope createActivityScope(g gVar) {
        gVar.getClass();
        if (gVar instanceof AndroidScopeComponent) {
            Scope scopeOrNull = ComponentCallbackExtKt.getKoin(gVar).getScopeOrNull(KoinScopeComponentKt.getScopeId(gVar));
            return scopeOrNull == null ? createScopeForCurrentLifecycle(gVar, gVar) : scopeOrNull;
        }
        h.z("Activity should implement AndroidScopeComponent");
        return null;
    }

    @KoinInternalApi
    public static final Scope createScope(g gVar, Object obj) {
        gVar.getClass();
        return ComponentCallbackExtKt.getKoin(gVar).createScope(KoinScopeComponentKt.getScopeId(gVar), KoinScopeComponentKt.getScopeName(gVar), obj);
    }

    public static /* synthetic */ Scope createScope$default(g gVar, Object obj, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        return createScope(gVar, obj);
    }

    public static final Scope createScopeForCurrentLifecycle(ComponentCallbacks componentCallbacks, final n0 n0Var) {
        componentCallbacks.getClass();
        n0Var.getClass();
        Scope scopeCreateScope = ComponentCallbackExtKt.getKoin(componentCallbacks).createScope(KoinScopeComponentKt.getScopeId(componentCallbacks), KoinScopeComponentKt.getScopeName(componentCallbacks), componentCallbacks);
        scopeCreateScope.registerCallback(new ScopeCallback() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.createScopeForCurrentLifecycle.1
            @Override // org.koin.core.scope.ScopeCallback
            public void onScopeClose(Scope scope) {
                scope.getClass();
                n0 n0Var2 = n0Var;
                n0Var2.getClass();
                ((AndroidScopeComponent) n0Var2).onCloseScope();
            }
        });
        registerScopeForLifecycle(n0Var, scopeCreateScope);
        return scopeCreateScope;
    }

    public static final Scope getRetainedScopeOrNull(g gVar) {
        gVar.getClass();
        return ComponentCallbackExtKt.getKoin(gVar).getScopeOrNull(retainedScopeId(gVar));
    }

    public static final Scope getScopeOrNull(g gVar) {
        gVar.getClass();
        return ComponentCallbackExtKt.getKoin(gVar).getScopeOrNull(KoinScopeComponentKt.getScopeId(gVar));
    }

    public static final void registerScopeForLifecycle(n0 n0Var, final Scope scope) {
        n0Var.getClass();
        scope.getClass();
        n0Var.getF158016a().a(new n() { // from class: org.koin.androidx.scope.ComponentActivityExtKt.registerScopeForLifecycle.1
            @Override // androidx.lifecycle.n
            public void onCreate(n0 n0Var2) {
                n0Var2.getClass();
            }

            @Override // androidx.lifecycle.n
            public void onDestroy(n0 owner) {
                owner.getClass();
                scope.close();
            }

            @Override // androidx.lifecycle.n
            public void onPause(n0 n0Var2) {
                n0Var2.getClass();
            }

            @Override // androidx.lifecycle.n
            public void onResume(n0 n0Var2) {
                n0Var2.getClass();
            }

            @Override // androidx.lifecycle.n
            public void onStart(n0 n0Var2) {
                n0Var2.getClass();
            }

            @Override // androidx.lifecycle.n
            public void onStop(n0 n0Var2) {
                n0Var2.getClass();
            }
        });
    }

    public static final String retainedScopeId(g gVar) {
        gVar.getClass();
        return KClassExtKt.getFullName(s0.f105811a.b(gVar.getClass()));
    }
}
