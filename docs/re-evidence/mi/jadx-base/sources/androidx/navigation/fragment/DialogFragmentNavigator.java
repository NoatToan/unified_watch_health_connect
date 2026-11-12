package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.d;
import androidx.navigation.h;
import androidx.navigation.i;
import defpackage.o3j;
import defpackage.wy9;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
@i.b("dialog")
public final class DialogFragmentNavigator extends i<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f2685b;
    public int c = 0;
    public final HashSet<String> d = new HashSet<>();
    public LifecycleEventObserver e = new LifecycleEventObserver() { // from class: androidx.navigation.fragment.DialogFragmentNavigator.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                DialogFragment dialogFragment = (DialogFragment) lifecycleOwner;
                if (dialogFragment.requireDialog().isShowing()) {
                    return;
                }
                NavHostFragment.t(dialogFragment).x();
            }
        }
    };

    public static class a extends d implements wy9 {
        public String j;

        public a(i<? extends a> iVar) {
            super(iVar);
        }

        public final String B() {
            String str = this.j;
            if (str != null) {
                return str;
            }
            throw new IllegalStateException("DialogFragment class was not set");
        }

        public final a C(String str) {
            this.j = str;
            return this;
        }

        @Override // androidx.navigation.d
        public void u(Context context, AttributeSet attributeSet) {
            super.u(context, attributeSet);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, o3j.c);
            String string = typedArrayObtainAttributes.getString(o3j.d);
            if (string != null) {
                C(string);
            }
            typedArrayObtainAttributes.recycle();
        }
    }

    public DialogFragmentNavigator(Context context, FragmentManager fragmentManager) {
        this.f2684a = context;
        this.f2685b = fragmentManager;
    }

    @Override // androidx.navigation.i
    public void c(Bundle bundle) {
        if (bundle != null) {
            this.c = bundle.getInt("androidx-nav-dialogfragment:navigator:count", 0);
            for (int i = 0; i < this.c; i++) {
                DialogFragment dialogFragment = (DialogFragment) this.f2685b.l0("androidx-nav-fragment:navigator:dialog:" + i);
                if (dialogFragment != null) {
                    dialogFragment.getLifecycle().addObserver(this.e);
                } else {
                    this.d.add("androidx-nav-fragment:navigator:dialog:" + i);
                }
            }
        }
    }

    @Override // androidx.navigation.i
    public Bundle d() {
        if (this.c == 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("androidx-nav-dialogfragment:navigator:count", this.c);
        return bundle;
    }

    @Override // androidx.navigation.i
    public boolean e() {
        if (this.c == 0 || this.f2685b.T0()) {
            return false;
        }
        FragmentManager fragmentManager = this.f2685b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.c - 1;
        this.c = i;
        sb.append(i);
        Fragment fragmentL0 = fragmentManager.l0(sb.toString());
        if (fragmentL0 != null) {
            fragmentL0.getLifecycle().removeObserver(this.e);
            ((DialogFragment) fragmentL0).dismiss();
        }
        return true;
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this);
    }

    @Override // androidx.navigation.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d b(a aVar, Bundle bundle, h hVar, i.a aVar2) {
        if (this.f2685b.T0()) {
            return null;
        }
        String strB = aVar.B();
        if (strB.charAt(0) == '.') {
            strB = this.f2684a.getPackageName() + strB;
        }
        Fragment fragmentA = this.f2685b.x0().a(this.f2684a.getClassLoader(), strB);
        if (!DialogFragment.class.isAssignableFrom(fragmentA.getClass())) {
            throw new IllegalArgumentException("Dialog destination " + aVar.B() + " is not an instance of DialogFragment");
        }
        DialogFragment dialogFragment = (DialogFragment) fragmentA;
        dialogFragment.setArguments(bundle);
        dialogFragment.getLifecycle().addObserver(this.e);
        FragmentManager fragmentManager = this.f2685b;
        StringBuilder sb = new StringBuilder();
        sb.append("androidx-nav-fragment:navigator:dialog:");
        int i = this.c;
        this.c = i + 1;
        sb.append(i);
        dialogFragment.show(fragmentManager, sb.toString());
        return aVar;
    }

    public void h(Fragment fragment) {
        if (this.d.remove(fragment.getTag())) {
            fragment.getLifecycle().addObserver(this.e);
        }
    }
}
