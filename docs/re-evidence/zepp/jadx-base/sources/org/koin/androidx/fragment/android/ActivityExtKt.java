package org.koin.androidx.fragment.android;

import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentFactory;
import androidx.fragment.app.FragmentTransaction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.scope.Scope;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a;\u0010\u000e\u001a\u00020\u0007\"\n\b\u0000\u0010\u0006\u0018\u0001*\u00020\u0005*\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086\b¨\u0006\u000f"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "Lorg/koin/core/scope/Scope;", "scope", "", "setupKoinFragmentFactory", "Landroidx/fragment/app/Fragment;", "F", "Landroidx/fragment/app/FragmentTransaction;", "", "containerViewId", "Landroid/os/Bundle;", "args", "", "tag", "replace", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class ActivityExtKt {
    public static final /* synthetic */ <F extends Fragment> FragmentTransaction replace(FragmentTransaction fragmentTransaction, @IdRes int i, Bundle bundle, String str) {
        Intrinsics.reifiedOperationMarker(4, "F");
        return fragmentTransaction.replace(i, Fragment.class, bundle, str);
    }

    public static /* synthetic */ FragmentTransaction replace$default(FragmentTransaction fragmentTransaction, int i, Bundle bundle, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            str = null;
        }
        Intrinsics.reifiedOperationMarker(4, "F");
        return fragmentTransaction.replace(i, Fragment.class, bundle, str);
    }

    public static final void setupKoinFragmentFactory(@NotNull FragmentActivity fragmentActivity, @Nullable Scope scope) {
        if (scope == null) {
            fragmentActivity.getSupportFragmentManager().setFragmentFactory((FragmentFactory) AndroidKoinScopeExtKt.getKoinScope(fragmentActivity).get(Reflection.getOrCreateKotlinClass(FragmentFactory.class), null, null));
        } else {
            fragmentActivity.getSupportFragmentManager().setFragmentFactory(new KoinFragmentFactory(scope));
        }
    }

    public static /* synthetic */ void setupKoinFragmentFactory$default(FragmentActivity fragmentActivity, Scope scope, int i, Object obj) {
        if ((i & 1) != 0) {
            scope = null;
        }
        setupKoinFragmentFactory(fragmentActivity, scope);
    }
}
