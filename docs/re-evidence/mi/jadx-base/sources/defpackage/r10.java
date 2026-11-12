package defpackage;

import java.util.List;
import java.util.Map;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: loaded from: classes6.dex */
@ThreadSafe
public abstract class r10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f32065b;
    public int c;
    public Map<String, List<String>> d;

    public r10(int i, int i2, int i3) {
        e(i);
        f(i2);
        g(i3);
    }

    public int a() {
        return this.f32064a;
    }

    public Map<String, List<String>> b() {
        return this.d;
    }

    public int c() {
        return this.f32065b;
    }

    public int d() {
        return this.c;
    }

    public void e(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The connect timeout must not be negative");
        }
        this.f32064a = i;
    }

    public void f(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The read timeout must not be negative");
        }
        this.f32065b = i;
    }

    public void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("The size limit must not be negative");
        }
        this.c = i;
    }
}
