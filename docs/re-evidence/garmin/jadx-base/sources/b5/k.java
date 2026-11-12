package b5;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lb5/k;", "", "Lp1/z;", "Lb5/a0;", "changes", "Lb5/c0;", "pointerInputEvent", "<init>", "(Lp1/z;Lb5/c0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.z<a0> f15832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f15833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15834c;

    public k(p1.z<a0> zVar, c0 c0Var) {
        this.f15832a = zVar;
        this.f15833b = c0Var;
    }

    public final boolean a(long j8) {
        d0 d0Var;
        List<d0> list = this.f15833b.f15770a;
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                d0Var = null;
                break;
            }
            d0Var = list.get(i14);
            if (z.b(d0Var.f15775a, j8)) {
                break;
            }
            i14++;
        }
        d0 d0Var2 = d0Var;
        if (d0Var2 != null) {
            return d0Var2.f15782h;
        }
        return false;
    }
}
