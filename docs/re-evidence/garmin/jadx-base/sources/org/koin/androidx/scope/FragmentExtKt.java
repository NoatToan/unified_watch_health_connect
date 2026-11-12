package org.koin.androidx.scope;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import b50.o;
import o13.l;
import org.koin.android.ext.android.ComponentCallbackExtKt;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.core.component.KoinScopeComponentKt;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a \u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\f\u0018\u0001*\u00020\u000b*\u00020\u0000H\u0086\b¢\u0006\u0004\b\r\u0010\u000e\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000b*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "useParentActivityScope", "Lorg/koin/core/scope/Scope;", "createFragmentScope", "(Landroidx/fragment/app/Fragment;Z)Lorg/koin/core/scope/Scope;", "Lo13/l;", "fragmentScope", "(Landroidx/fragment/app/Fragment;Z)Lo13/l;", "getScopeOrNull", "(Landroidx/fragment/app/Fragment;)Lorg/koin/core/scope/Scope;", "Lorg/koin/androidx/scope/ScopeActivity;", "T", "requireScopeActivity", "(Landroidx/fragment/app/Fragment;)Lorg/koin/androidx/scope/ScopeActivity;", "getScopeActivity", "scopeActivity", "koin-android_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class FragmentExtKt {
    public static final Scope createFragmentScope(Fragment fragment, boolean z14) {
        fragment.getClass();
        if (!(fragment instanceof AndroidScopeComponent)) {
            h.z("Fragment should implement AndroidScopeComponent");
            return null;
        }
        Scope scopeOrNull = ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
        if (scopeOrNull == null) {
            scopeOrNull = ComponentActivityExtKt.createScopeForCurrentLifecycle(fragment, fragment);
        }
        if (z14) {
            m mVarRequireActivity = fragment.requireActivity();
            mVarRequireActivity.getClass();
            Scope scopeOrNull2 = ComponentActivityExtKt.getScopeOrNull(mVarRequireActivity);
            if (scopeOrNull2 == null) {
                m mVarRequireActivity2 = fragment.requireActivity();
                mVarRequireActivity2.getClass();
                scopeOrNull2 = ComponentActivityExtKt.getRetainedScopeOrNull(mVarRequireActivity2);
            }
            if (scopeOrNull2 != null) {
                scopeOrNull.linkTo(scopeOrNull2);
                return scopeOrNull;
            }
            scopeOrNull.getLogger().debug("Fragment '" + fragment + "' can't be linked to parent activity scope. No Parent Scope found.");
        }
        return scopeOrNull;
    }

    public static /* synthetic */ Scope createFragmentScope$default(Fragment fragment, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        return createFragmentScope(fragment, z14);
    }

    public static final l<Scope> fragmentScope(Fragment fragment, boolean z14) {
        fragment.getClass();
        return o13.m.b(new o(fragment, z14, 8));
    }

    public static /* synthetic */ l fragmentScope$default(Fragment fragment, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            z14 = true;
        }
        return fragmentScope(fragment, z14);
    }

    public static final ScopeActivity getScopeActivity(Fragment fragment) {
        fragment.getClass();
        m activity = fragment.getActivity();
        if (activity instanceof ScopeActivity) {
            return (ScopeActivity) activity;
        }
        return null;
    }

    public static final Scope getScopeOrNull(Fragment fragment) {
        fragment.getClass();
        return ComponentCallbackExtKt.getKoin(fragment).getScopeOrNull(KoinScopeComponentKt.getScopeId(fragment));
    }

    public static final <T extends ScopeActivity> T requireScopeActivity(Fragment fragment) {
        fragment.getClass();
        fragment.getActivity();
        s.l();
        throw null;
    }
}
