package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes4.dex */
public class vn<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkedList<E> f51348b = new LinkedList<>();
    private int e = 0;

    public void b(E e) {
        synchronized (this) {
            this.e++;
            this.f51348b.addLast(e);
        }
    }

    public E d() {
        E eRemoveFirst;
        synchronized (this) {
            this.e--;
            eRemoveFirst = this.f51348b.removeFirst();
        }
        return eRemoveFirst;
    }

    public int e() {
        int i;
        synchronized (this) {
            i = this.e;
        }
        return i;
    }

    public void c() {
        synchronized (this) {
            this.f51348b.clear();
            this.e = 0;
        }
    }
}
