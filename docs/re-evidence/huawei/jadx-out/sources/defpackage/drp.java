package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public class drp<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<E> f32263c = new LinkedList<>();
    private volatile int e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f32262b = new Object();

    public void d(E e) {
        synchronized (this.f32262b) {
            this.e++;
            this.f32263c.addLast(e);
        }
    }

    public E c() {
        synchronized (this.f32262b) {
            if (this.e <= 0) {
                this.e = 0;
                return null;
            }
            this.e--;
            return this.f32263c.removeFirst();
        }
    }

    public boolean a() {
        boolean z;
        synchronized (this.f32262b) {
            z = this.e <= 0;
        }
        return z;
    }

    public int d() {
        int i;
        synchronized (this.f32262b) {
            i = this.e;
        }
        return i;
    }

    public void e() {
        synchronized (this.f32262b) {
            this.f32263c.clear();
            this.e = 0;
        }
    }
}
