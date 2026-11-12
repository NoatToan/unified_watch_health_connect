package jj;

import androidx.lifecycle.a1;
import androidx.lifecycle.b0;
import androidx.lifecycle.m0;
import androidx.lifecycle.n0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class l implements k, m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f98918a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f98919b;

    public l(b0 b0Var) {
        this.f98919b = b0Var;
        b0Var.a(this);
    }

    @Override // jj.k
    public final void a(m mVar) {
        this.f98918a.add(mVar);
        b0 b0Var = this.f98919b;
        if (b0Var.getF7973d() == b0.b.DESTROYED) {
            mVar.onDestroy();
        } else if (b0Var.getF7973d().a(b0.b.STARTED)) {
            mVar.onStart();
        } else {
            mVar.onStop();
        }
    }

    @Override // jj.k
    public final void b(m mVar) {
        this.f98918a.remove(mVar);
    }

    @a1(b0.a.ON_DESTROY)
    public void onDestroy(n0 n0Var) {
        Iterator it = qj.m.e(this.f98918a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onDestroy();
        }
        n0Var.getF158017a().d(this);
    }

    @a1(b0.a.ON_START)
    public void onStart(n0 n0Var) {
        Iterator it = qj.m.e(this.f98918a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStart();
        }
    }

    @a1(b0.a.ON_STOP)
    public void onStop(n0 n0Var) {
        Iterator it = qj.m.e(this.f98918a).iterator();
        while (it.hasNext()) {
            ((m) it.next()).onStop();
        }
    }
}
