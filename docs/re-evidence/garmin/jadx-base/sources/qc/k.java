package qc;

import c22.t;
import java.util.Iterator;
import lc.h0;
import p005kotlin.Metadata;
import p1.b0;
import p1.l1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lqc/k;", "", "Llc/h0;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k implements Iterator<h0>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f144349a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f144350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f144351c;

    public k(l lVar) {
        this.f144351c = lVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f144349a + 1 < this.f144351c.f144353b.f();
    }

    @Override // java.util.Iterator
    public final h0 next() {
        if (!hasNext()) {
            t.g();
            return null;
        }
        this.f144350b = true;
        l1<h0> l1Var = this.f144351c.f144353b;
        int i14 = this.f144349a + 1;
        this.f144349a = i14;
        return l1Var.g(i14);
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f144350b) {
            vb.h.z("You must call next() before you can remove an element");
            return;
        }
        l1<h0> l1Var = this.f144351c.f144353b;
        l1Var.g(this.f144349a).f111774c = null;
        int i14 = this.f144349a;
        Object[] objArr = l1Var.f134766c;
        Object obj = objArr[i14];
        Object obj2 = b0.f134676c;
        if (obj != obj2) {
            objArr[i14] = obj2;
            l1Var.f134764a = true;
        }
        this.f144349a = i14 - 1;
        this.f144350b = false;
    }
}
