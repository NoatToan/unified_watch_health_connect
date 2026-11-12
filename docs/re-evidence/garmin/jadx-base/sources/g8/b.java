package g8;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.n;
import androidx.lifecycle.n0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg8/b;", "Landroidx/lifecycle/n;", "fragment-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m0 f76231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f76232b;

    public b(m0 m0Var, Fragment fragment) {
        this.f76231a = m0Var;
        this.f76232b = fragment;
    }

    @Override // androidx.lifecycle.n
    public final void onStart(n0 n0Var) {
        this.f76231a.f105804a = false;
        this.f76232b.getF158016a().d(this);
    }
}
