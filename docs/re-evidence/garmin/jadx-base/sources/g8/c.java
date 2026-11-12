package g8;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p3.h0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg8/c;", "Lp3/h0;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f76233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f76234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f76235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m0 f76236d;

    public c(v vVar, Fragment fragment, e eVar, m0 m0Var) {
        this.f76233a = vVar;
        this.f76234b = fragment;
        this.f76235c = eVar;
        this.f76236d = m0Var;
    }

    @Override // p3.h0
    public final void dispose() {
        v vVar = this.f76233a;
        Fragment fragment = this.f76234b;
        this.f76235c.f76239a.setValue(vVar.j0(fragment));
        if (this.f76236d.f105804a) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(vVar);
            aVar.k(fragment);
            aVar.f();
        } else {
            if (vVar.V()) {
                return;
            }
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(vVar);
            aVar2.k(fragment);
            aVar2.t();
        }
    }
}
