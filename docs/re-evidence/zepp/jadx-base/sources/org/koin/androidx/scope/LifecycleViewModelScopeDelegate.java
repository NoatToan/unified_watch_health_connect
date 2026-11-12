package org.koin.androidx.scope;

import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.logger.Logger;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B-\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0096\u0002R\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00030\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00060\u0018j\u0002`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lorg/koin/androidx/scope/LifecycleViewModelScopeDelegate;", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/lifecycle/LifecycleOwner;", "Lorg/koin/core/scope/Scope;", "thisRef", "Lkotlin/reflect/KProperty;", "property", "getValue", "a", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lorg/koin/core/Koin;", "b", "Lorg/koin/core/Koin;", "koin", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "createScope", GoogleApiAvailabilityLight.a, "Lorg/koin/core/scope/Scope;", "_scope", "", "Lorg/koin/core/qualifier/QualifierValue;", "e", "Ljava/lang/String;", "scopeId", "<init>", "(Landroidx/lifecycle/LifecycleOwner;Lorg/koin/core/Koin;Lkotlin/jvm/functions/Function1;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class LifecycleViewModelScopeDelegate implements ReadOnlyProperty<LifecycleOwner, Scope> {

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

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final String scopeId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/Koin;", "koin", "Lorg/koin/core/scope/Scope;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
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
            return Koin.createScope$default(koin, KoinScopeComponentKt.getScopeName(this.a).getValue(), KoinScopeComponentKt.getScopeName(this.a), null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleViewModelScopeDelegate(@NotNull LifecycleOwner lifecycleOwner, @NotNull Koin koin, @NotNull Function1<? super Koin, Scope> function1) {
        this.lifecycleOwner = lifecycleOwner;
        this.koin = koin;
        this.createScope = function1;
        String value = KoinScopeComponentKt.getScopeName(lifecycleOwner).getValue();
        this.scopeId = value;
        boolean z = lifecycleOwner instanceof AppCompatActivity;
        final Logger logger = koin.getLogger();
        logger.debug("setup scope: " + this._scope + " for " + lifecycleOwner);
        Scope scopeOrNull = koin.getScopeOrNull(value);
        this._scope = scopeOrNull == null ? (Scope) function1.invoke(koin) : scopeOrNull;
        logger.debug("got scope: " + this._scope + " for " + lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new LifecycleObserver() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate.3
            /* JADX WARN: Multi-variable type inference failed */
            @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
            public final void onCreate(@NotNull LifecycleOwner owner) {
                logger.debug("Attach ViewModel scope: " + this._scope + " to " + this.getLifecycleOwner());
                final AppCompatActivity appCompatActivity = (AppCompatActivity) this.getLifecycleOwner();
                ScopeHandlerViewModel scopeHandlerViewModel = (ScopeHandlerViewModel) new ViewModelLazy(Reflection.getOrCreateKotlinClass(ScopeHandlerViewModel.class), new Function0<ViewModelStore>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$3$onCreate$$inlined$viewModels$default$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ViewModelStore invoke() {
                        return appCompatActivity.getViewModelStore();
                    }
                }, new Function0<ViewModelProvider.Factory>() { // from class: org.koin.androidx.scope.LifecycleViewModelScopeDelegate$3$onCreate$$inlined$viewModels$default$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final ViewModelProvider.Factory invoke() {
                        return appCompatActivity.getDefaultViewModelProviderFactory();
                    }
                }).getValue();
                if (scopeHandlerViewModel.getScope() == null) {
                    scopeHandlerViewModel.setScope(this._scope);
                }
            }
        });
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
            return scope;
        }
        if (!LifecycleScopeDelegateKt.isActive(thisRef)) {
            throw new IllegalStateException(("can't get Scope for " + this.lifecycleOwner + " - LifecycleOwner is not Active").toString());
        }
        Scope scopeOrNull = this.koin.getScopeOrNull(KoinScopeComponentKt.getScopeName(this.lifecycleOwner).getValue());
        if (scopeOrNull == null) {
            scopeOrNull = this.createScope.invoke(this.koin);
        }
        this._scope = scopeOrNull;
        this.koin.getLogger().debug("got scope: " + this._scope + " for " + this.lifecycleOwner);
        return this._scope;
    }

    public /* synthetic */ LifecycleViewModelScopeDelegate(LifecycleOwner lifecycleOwner, Koin koin, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, koin, (i & 4) != 0 ? new a(lifecycleOwner) : function1);
    }
}
