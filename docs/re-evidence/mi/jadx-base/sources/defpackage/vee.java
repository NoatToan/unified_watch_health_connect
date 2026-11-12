package defpackage;

import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.b;
import java.util.Comparator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public final class vee implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TreeSet<i93> f36802b = new TreeSet<>(new Comparator() { // from class: uee
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return vee.h((i93) obj, (i93) obj2);
        }
    });
    public long c;

    public vee(long j) {
        this.f36801a = j;
    }

    public static int h(i93 i93Var, i93 i93Var2) {
        long j = i93Var.f;
        long j2 = i93Var2.f;
        if (j - j2 == 0) {
            return i93Var.compareTo(i93Var2);
        }
        return j < j2 ? -1 : 1;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void a(Cache cache, i93 i93Var, i93 i93Var2) {
        f(cache, i93Var);
        e(cache, i93Var2);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public boolean b() {
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void c(Cache cache, String str, long j, long j2) {
        if (j2 != -1) {
            i(cache, j2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.b
    public void d() {
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void e(Cache cache, i93 i93Var) {
        this.f36802b.add(i93Var);
        this.c += i93Var.c;
        i(cache, 0L);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache.a
    public void f(Cache cache, i93 i93Var) {
        this.f36802b.remove(i93Var);
        this.c -= i93Var.c;
    }

    public final void i(Cache cache, long j) {
        while (this.c + j > this.f36801a && !this.f36802b.isEmpty()) {
            cache.b(this.f36802b.first());
        }
    }
}
