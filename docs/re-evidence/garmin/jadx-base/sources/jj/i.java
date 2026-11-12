package jj;

import android.app.Activity;
import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Activity> f98916a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f98917b;

    @Override // jj.j
    public final void a(androidx.fragment.app.m mVar) {
        if (!this.f98917b && this.f98916a.add(mVar)) {
            View decorView = mVar.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new h(this, decorView));
        }
    }
}
