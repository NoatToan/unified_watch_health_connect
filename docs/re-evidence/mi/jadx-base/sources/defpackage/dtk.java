package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dtk implements tn0, gvq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<ctk.a> f15921a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15922b = false;

    public void a() {
        ycp.a();
        this.f15922b = true;
        Iterator<ctk.a> it = this.f15921a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.tn0, defpackage.ctk, defpackage.gvq
    public void addOnClearedListener(ctk.a aVar) {
        ycp.a();
        b();
        this.f15921a.add(aVar);
    }

    public final void b() {
        if (this.f15922b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }

    @Override // defpackage.tn0, defpackage.ctk, defpackage.gvq
    public void removeOnClearedListener(ctk.a aVar) {
        ycp.a();
        b();
        this.f15921a.remove(aVar);
    }
}
