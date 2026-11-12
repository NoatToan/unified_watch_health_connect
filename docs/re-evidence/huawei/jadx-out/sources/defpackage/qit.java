package defpackage;

import java.util.LinkedList;

/* JADX INFO: loaded from: classes43.dex */
public class qit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    LinkedList<Runnable> f46283a = new LinkedList<>();

    public void b() {
        synchronized (this.f46283a) {
            while (!this.f46283a.isEmpty()) {
                try {
                    this.f46283a.removeFirst().run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void c(Runnable runnable) {
        synchronized (this.f46283a) {
            this.f46283a.addLast(runnable);
        }
    }

    public void a() {
        synchronized (this.f46283a) {
            this.f46283a.clear();
        }
    }

    public void c() {
        a();
        this.f46283a = null;
    }
}
