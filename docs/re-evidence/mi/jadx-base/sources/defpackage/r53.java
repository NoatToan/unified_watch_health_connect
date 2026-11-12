package defpackage;

import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class r53<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32196b;
    public final Queue c;
    public final boolean d;
    public int e;

    public r53(int i, int i2, int i3, boolean z) {
        b6i.i(i > 0);
        b6i.i(i2 >= 0);
        b6i.i(i3 >= 0);
        this.f32195a = i;
        this.f32196b = i2;
        this.c = new LinkedList();
        this.e = i3;
        this.d = z;
    }

    public void a(V v) {
        this.c.add(v);
    }

    public void b() {
        b6i.i(this.e > 0);
        this.e--;
    }

    @Deprecated
    public V c() {
        V vH = h();
        if (vH != null) {
            this.e++;
        }
        return vH;
    }

    public int d() {
        return this.c.size();
    }

    public int e() {
        return this.e;
    }

    public void f() {
        this.e++;
    }

    public boolean g() {
        return this.e + d() > this.f32196b;
    }

    public V h() {
        return (V) this.c.poll();
    }

    public void i(V v) {
        b6i.g(v);
        if (this.d) {
            b6i.i(this.e > 0);
            this.e--;
            a(v);
        } else {
            int i = this.e;
            if (i <= 0) {
                cm8.k("BUCKET", "Tried to release value %s from an empty bucket!", v);
            } else {
                this.e = i - 1;
                a(v);
            }
        }
    }
}
