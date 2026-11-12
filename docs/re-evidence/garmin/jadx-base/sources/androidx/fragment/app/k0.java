package androidx.fragment.app;

import android.view.View;
import androidx.core.view.g1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f7290e;

    public k0(l0 l0Var, int i14, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f7286a = i14;
        this.f7287b = arrayList;
        this.f7288c = arrayList2;
        this.f7289d = arrayList3;
        this.f7290e = arrayList4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (int i14 = 0; i14 < this.f7286a; i14++) {
            View view2 = (View) this.f7287b.get(i14);
            String str = (String) this.f7288c.get(i14);
            WeakHashMap<View, g1> weakHashMap = androidx.core.view.s0.f6563a;
            view2.setTransitionName(str);
            ((View) this.f7289d.get(i14)).setTransitionName((String) this.f7290e.get(i14));
        }
    }
}
