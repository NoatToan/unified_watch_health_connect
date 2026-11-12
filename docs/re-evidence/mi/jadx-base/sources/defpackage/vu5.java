package defpackage;

import androidx.annotation.RestrictTo;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class vu5 implements uf8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<l0m<?>> f37230a = new HashSet();

    @Override // defpackage.uf8
    public void a(final l0m<?> l0mVar) {
        synchronized (this.f37230a) {
            this.f37230a.add(l0mVar);
            l0mVar.addListener(new Runnable() { // from class: uu5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f36144a.d(l0mVar);
                }
            }, c8g.a());
        }
    }

    @Override // defpackage.uf8
    public void b(Throwable th) {
        HashSet hashSet;
        synchronized (this.f37230a) {
            hashSet = new HashSet(this.f37230a);
            this.f37230a.clear();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((l0m) it.next()).C(th);
        }
    }

    public final /* synthetic */ void d(l0m l0mVar) {
        synchronized (this.f37230a) {
            this.f37230a.remove(l0mVar);
        }
    }
}
