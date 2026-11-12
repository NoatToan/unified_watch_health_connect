package q0;

import androidx.camera.core.e;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f141967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<T> f141968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f141969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b<T> f141970d;

    public a(int i14, b<T> bVar) {
        this.f141969c = new Object();
        this.f141967a = i14;
        this.f141968b = new ArrayDeque<>(i14);
        this.f141970d = bVar;
    }

    public final T a() {
        T tRemoveLast;
        synchronized (this.f141969c) {
            tRemoveLast = this.f141968b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t7) throws Exception {
        T tA;
        synchronized (this.f141969c) {
            try {
                tA = this.f141968b.size() >= this.f141967a ? a() : null;
                this.f141968b.addFirst(t7);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (this.f141970d == null || tA == null) {
            return;
        }
        ((e) tA).close();
    }

    public final boolean c() {
        boolean zIsEmpty;
        synchronized (this.f141969c) {
            zIsEmpty = this.f141968b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i14) {
        this(i14, null);
    }
}
