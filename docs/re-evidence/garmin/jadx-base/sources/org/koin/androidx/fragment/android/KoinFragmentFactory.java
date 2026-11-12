package org.koin.androidx.fragment.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.q;
import ch.qos.logback.core.joran.action.Action;
import k23.d;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u000f"}, d2 = {"Lorg/koin/androidx/fragment/android/KoinFragmentFactory;", "Landroidx/fragment/app/q;", "Lorg/koin/core/component/KoinComponent;", "Lorg/koin/core/scope/Scope;", Action.SCOPE_ATTRIBUTE, "<init>", "(Lorg/koin/core/scope/Scope;)V", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "Lorg/koin/core/scope/Scope;", "koin-android_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class KoinFragmentFactory extends q implements KoinComponent {
    private final Scope scope;

    public /* synthetic */ KoinFragmentFactory(Scope scope, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : scope);
    }

    @Override // org.koin.core.component.KoinComponent
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.q
    public Fragment instantiate(ClassLoader classLoader, String className) {
        classLoader.getClass();
        className.getClass();
        d dVarB = s0.f105811a.b(Class.forName(className));
        Scope scope = this.scope;
        Fragment fragment = scope != null ? (Fragment) Scope.getOrNull$default(scope, dVarB, null, null, 6, null) : (Fragment) Koin.getOrNull$default(getKoin(), dVarB, null, null, 6, null);
        if (fragment != null) {
            return fragment;
        }
        Fragment fragmentInstantiate = super.instantiate(classLoader, className);
        fragmentInstantiate.getClass();
        return fragmentInstantiate;
    }

    public KoinFragmentFactory(Scope scope) {
        this.scope = scope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public KoinFragmentFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
