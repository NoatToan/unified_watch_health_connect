package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class b1p implements mfe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<e0p<?>> f3695a = Collections.newSetFromMap(new WeakHashMap());

    public void h() {
        this.f3695a.clear();
    }

    public List<e0p<?>> i() {
        return ulq.k(this.f3695a);
    }

    public void j(e0p<?> e0pVar) {
        this.f3695a.add(e0pVar);
    }

    public void k(e0p<?> e0pVar) {
        this.f3695a.remove(e0pVar);
    }

    @Override // defpackage.mfe
    public void onDestroy() {
        Iterator it = ulq.k(this.f3695a).iterator();
        while (it.hasNext()) {
            ((e0p) it.next()).onDestroy();
        }
    }

    @Override // defpackage.mfe
    public void onStart() {
        Iterator it = ulq.k(this.f3695a).iterator();
        while (it.hasNext()) {
            ((e0p) it.next()).onStart();
        }
    }

    @Override // defpackage.mfe
    public void onStop() {
        Iterator it = ulq.k(this.f3695a).iterator();
        while (it.hasNext()) {
            ((e0p) it.next()).onStop();
        }
    }
}
