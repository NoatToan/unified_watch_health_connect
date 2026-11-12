package c2;

import android.view.View;
import java.util.WeakHashMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc2/l3;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l3 implements p3.h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3 f22740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f22741b;

    public l3(m3 m3Var, View view2) {
        this.f22740a = m3Var;
        this.f22741b = view2;
    }

    @Override // p3.h0
    public final void dispose() {
        m3 m3Var = this.f22740a;
        int i14 = m3Var.f22775u - 1;
        m3Var.f22775u = i14;
        if (i14 == 0) {
            WeakHashMap<View, androidx.core.view.g1> weakHashMap = androidx.core.view.s0.f6563a;
            View view2 = this.f22741b;
            androidx.core.view.s0.d.c(view2, null);
            androidx.core.view.s0.t(view2, null);
            view2.removeOnAttachStateChangeListener(m3Var.f22776v);
        }
    }
}
