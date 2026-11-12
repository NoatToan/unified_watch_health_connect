package org.koin.android.scope;

import android.app.Service;
import o13.l;
import o13.m;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import ro0.g;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007*\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\f\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"Landroid/app/Service;", "Lorg/koin/core/scope/Scope;", "createServiceScope", "(Landroid/app/Service;)Lorg/koin/core/scope/Scope;", "", "destroyServiceScope", "(Landroid/app/Service;)V", "Lo13/l;", "serviceScope", "(Landroid/app/Service;)Lo13/l;", "", "source", "createScope", "(Landroid/app/Service;Ljava/lang/Object;)Lorg/koin/core/scope/Scope;", "getScopeOrNull", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ServiceExtKt {
    @KoinInternalApi
    public static final Scope createScope(Service service, Object obj) {
        service.getClass();
        return ComponentCallbackExtKt.getKoin(service).createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), obj);
    }

    public static /* synthetic */ Scope createScope$default(Service service, Object obj, int i14, Object obj2) {
        if ((i14 & 1) != 0) {
            obj = null;
        }
        return createScope(service, obj);
    }

    public static final Scope createServiceScope(Service service) {
        service.getClass();
        if (!(service instanceof AndroidScopeComponent)) {
            h.z("Service should implement AndroidScopeComponent");
            return null;
        }
        Koin koin = ComponentCallbackExtKt.getKoin(service);
        Scope scopeOrNull = koin.getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
        return scopeOrNull == null ? koin.createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), service) : scopeOrNull;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void destroyServiceScope(Service service) {
        service.getClass();
        if (service instanceof AndroidScopeComponent) {
            ((AndroidScopeComponent) service).getScope().close();
        } else {
            h.z("Service should implement AndroidScopeComponent");
        }
    }

    @KoinInternalApi
    public static final Scope getScopeOrNull(Service service) {
        service.getClass();
        return ComponentCallbackExtKt.getKoin(service).getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
    }

    public static final l<Scope> serviceScope(Service service) {
        service.getClass();
        return m.b(new g(service, 17));
    }
}
