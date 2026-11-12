package org.koin.androidx.scope;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.LifecycleOwner;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8V@\u0016X\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lorg/koin/androidx/scope/ScopeFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/android/scope/AndroidScopeComponent;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "a", "Z", "initialiseScope", "Lorg/koin/core/scope/Scope;", "b", "Lorg/koin/androidx/scope/LifecycleScopeDelegate;", "getScope", "()Lorg/koin/core/scope/Scope;", "scope", "", "contentLayoutId", "<init>", "(IZ)V", "koin-android_release"}, k = 1, mv = {1, 5, 1})
public abstract class ScopeFragment extends Fragment implements AndroidScopeComponent {
    public static final /* synthetic */ KProperty<Object>[] c = {Reflection.property1(new PropertyReference1Impl(ScopeFragment.class, "scope", "getScope()Lorg/koin/core/scope/Scope;", 0))};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean initialiseScope;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifecycleScopeDelegate scope;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeFragment() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ ScopeFragment(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? true : z);
    }

    @Override // org.koin.android.scope.AndroidScopeComponent
    @NotNull
    public Scope getScope() {
        return this.scope.getValue2((LifecycleOwner) this, c[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (this.initialiseScope) {
            getScope().getLogger().debug(Intrinsics.stringPlus("Open Fragment Scope: ", getScope()));
        }
    }

    public ScopeFragment(@LayoutRes int i, boolean z) {
        super(i);
        this.initialiseScope = z;
        this.scope = FragmentExtKt.fragmentScope(this);
    }
}
