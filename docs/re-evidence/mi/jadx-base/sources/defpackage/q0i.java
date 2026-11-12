package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class q0i implements p0i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q0i f30957b = new q0i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList<p0i> f30958a = new CopyOnWriteArrayList<>();

    public static q0i f() {
        return f30957b;
    }

    @Override // defpackage.p0i
    public void a() {
        Iterator<p0i> it = this.f30958a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // defpackage.p0i
    public void b() {
        Iterator<p0i> it = this.f30958a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // defpackage.p0i
    public void c(int i) {
        Iterator<p0i> it = this.f30958a.iterator();
        while (it.hasNext()) {
            it.next().c(i);
        }
    }

    @Override // defpackage.p0i
    public void d(int i) {
        Iterator<p0i> it = this.f30958a.iterator();
        while (it.hasNext()) {
            it.next().d(i);
        }
    }

    @Override // defpackage.p0i
    public void e(int i) {
        Iterator<p0i> it = this.f30958a.iterator();
        while (it.hasNext()) {
            it.next().e(i);
        }
    }

    public void g(p0i p0iVar) {
        if (p0iVar != null) {
            this.f30958a.add(p0iVar);
        }
    }
}
