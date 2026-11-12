package org.koin.androidx.fragment.android;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lorg/koin/androidx/fragment/android/KoinFragmentFactory;", "Landroidx/fragment/app/FragmentFactory;", "Lorg/koin/core/component/KoinComponent;", "Ljava/lang/ClassLoader;", "classLoader", "", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "Lorg/koin/core/scope/Scope;", "a", "Lorg/koin/core/scope/Scope;", "scope", "<init>", "(Lorg/koin/core/scope/Scope;)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public final class KoinFragmentFactory extends FragmentFactory implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final Scope scope;

    /* JADX WARN: Multi-variable type inference failed */
    public KoinFragmentFactory() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public KoinFragmentFactory(@Nullable Scope scope) {
        this.scope = scope;
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentFactory
    @NotNull
    public Fragment instantiate(@NotNull ClassLoader classLoader, @NotNull String className) {
        KClass kotlinClass = JvmClassMappingKt.getKotlinClass(Class.forName(className));
        Scope scope = this.scope;
        Fragment fragment = scope != null ? (Fragment) Scope.getOrNull$default(scope, kotlinClass, null, null, 6, null) : (Fragment) Koin.getOrNull$default(getKoin(), kotlinClass, null, null, 6, null);
        return fragment == null ? super.instantiate(classLoader, className) : fragment;
    }

    public /* synthetic */ KoinFragmentFactory(Scope scope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : scope);
    }
}
