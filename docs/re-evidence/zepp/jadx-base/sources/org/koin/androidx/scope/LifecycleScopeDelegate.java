package org.koin.androidx.scope;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B-\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002R\u0019\u0010\u000e\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lorg/koin/androidx/scope/LifecycleScopeDelegate;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/lifecycle/LifecycleOwner;", "Lorg/koin/core/scope/Scope;", "", "a", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lorg/koin/core/Koin;", "b", "Lorg/koin/core/Koin;", "koin", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "createScope", GoogleApiAvailabilityLight.a, "Lorg/koin/core/scope/Scope;", "_scope", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/Koin;Lkotlin/jvm/functions/Function1;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class LifecycleScopeDelegate<T> implements ReadOnlyProperty<LifecycleOwner, Scope> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Koin koin;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Function1<Koin, Scope> createScope;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Scope _scope;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lorg/koin/core/Koin;", "koin", "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Koin, Scope> {
        public final /* synthetic */ LifecycleOwner a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LifecycleOwner lifecycleOwner) {
            super(1);
            this.a = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Scope invoke(@NotNull Koin koin) {
            return koin.createScope(KoinScopeComponentKt.getScopeId(this.a), KoinScopeComponentKt.getScopeName(this.a), this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleScopeDelegate(@NotNull LifecycleOwner lifecycleOwner, @NotNull Koin koin, @NotNull Function1<? super Koin, Scope> function1) {
        this.lifecycleOwner = lifecycleOwner;
        this.koin = koin;
        this.createScope = function1;
        final Logger logger = koin.getLogger();
        logger.debug("setup scope: " + this._scope + " for " + lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver(this) { // from class: org.koin.androidx.scope.LifecycleScopeDelegate.2
            public final /* synthetic */ LifecycleScopeDelegate<T> a;

            {
                this.a = this;
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate(@NotNull LifecycleOwner owner) {
                this.a.a();
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy(@NotNull LifecycleOwner owner) {
                Scope scope;
                logger.debug("Closing scope: " + ((LifecycleScopeDelegate) this.a)._scope + " for " + this.a.getLifecycleOwner());
                Scope scope2 = ((LifecycleScopeDelegate) this.a)._scope;
                boolean z = false;
                if (scope2 != null && !scope2.get_closed()) {
                    z = true;
                }
                if (z && (scope = ((LifecycleScopeDelegate) this.a)._scope) != null) {
                    scope.close();
                }
                ((LifecycleScopeDelegate) this.a)._scope = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        if (this._scope == null) {
            this.koin.getLogger().debug("Create scope: " + this._scope + " for " + this.lifecycleOwner);
            Scope scopeOrNull = this.koin.getScopeOrNull(KoinScopeComponentKt.getScopeId(this.lifecycleOwner));
            if (scopeOrNull == null) {
                scopeOrNull = this.createScope.invoke(this.koin);
            }
            this._scope = scopeOrNull;
        }
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // kotlin.properties.ReadOnlyProperty
    public /* bridge */ /* synthetic */ Scope getValue(LifecycleOwner lifecycleOwner, KProperty kProperty) {
        return getValue2(lifecycleOwner, (KProperty<?>) kProperty);
    }

    @NotNull
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public Scope getValue2(@NotNull LifecycleOwner thisRef, @NotNull KProperty<?> property) {
        Scope scope = this._scope;
        if (scope != null) {
            if (scope != null) {
                return scope;
            }
            throw new IllegalStateException(Intrinsics.stringPlus("can't get Scope for ", this.lifecycleOwner).toString());
        }
        a();
        Scope scope2 = this._scope;
        if (scope2 != null) {
            return scope2;
        }
        throw new IllegalStateException(Intrinsics.stringPlus("can't get Scope for ", this.lifecycleOwner).toString());
    }

    public /* synthetic */ LifecycleScopeDelegate(LifecycleOwner lifecycleOwner, Koin koin, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, koin, (i & 4) != 0 ? new a(lifecycleOwner) : function1);
    }
}
