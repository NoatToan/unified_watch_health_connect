package org.koin.android.scope;

import android.app.Service;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000\u001a\u0016\u0010\u0006\u001a\u00020\u0002*\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0002*\u00020\u0000¨\u0006\b"}, d2 = {"Landroid/app/Service;", "Lkotlin/Lazy;", "Lorg/koin/core/scope/Scope;", "serviceScope", "", "source", "createScope", "getScopeOrNull", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ServiceExtKt {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Scope> {
        public final /* synthetic */ Service a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Service service) {
            super(0);
            this.a = service;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Scope invoke() {
            Scope scopeOrNull = ServiceExtKt.getScopeOrNull(this.a);
            return scopeOrNull == null ? ServiceExtKt.createScope$default(this.a, null, 1, null) : scopeOrNull;
        }
    }

    @NotNull
    public static final Scope createScope(@NotNull Service service, @Nullable Object obj) {
        return ComponentCallbackExtKt.getKoin(service).createScope(KoinScopeComponentKt.getScopeId(service), KoinScopeComponentKt.getScopeName(service), obj);
    }

    public static /* synthetic */ Scope createScope$default(Service service, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return createScope(service, obj);
    }

    @Nullable
    public static final Scope getScopeOrNull(@NotNull Service service) {
        return ComponentCallbackExtKt.getKoin(service).getScopeOrNull(KoinScopeComponentKt.getScopeId(service));
    }

    @NotNull
    public static final Lazy<Scope> serviceScope(@NotNull Service service) {
        return LazyKt__LazyJVMKt.lazy(new a(service));
    }
}
