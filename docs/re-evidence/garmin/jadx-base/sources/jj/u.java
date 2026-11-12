package jj;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class u implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<nj.h<?>> f98946a = Collections.newSetFromMap(new WeakHashMap());

    @Override // jj.m
    public final void onDestroy() {
        Iterator it = qj.m.e(this.f98946a).iterator();
        while (it.hasNext()) {
            ((nj.h) it.next()).onDestroy();
        }
    }

    @Override // jj.m
    public final void onStart() {
        Iterator it = qj.m.e(this.f98946a).iterator();
        while (it.hasNext()) {
            ((nj.h) it.next()).onStart();
        }
    }

    @Override // jj.m
    public final void onStop() {
        Iterator it = qj.m.e(this.f98946a).iterator();
        while (it.hasNext()) {
            ((nj.h) it.next()).onStop();
        }
    }
}
