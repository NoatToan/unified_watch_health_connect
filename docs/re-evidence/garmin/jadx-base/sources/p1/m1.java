package p1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp1/m1;", "Lp13/p0;", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class m1 extends p13.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f134770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1<Object> f134771b;

    public m1(l1<Object> l1Var) {
        this.f134771b = l1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f134770a < this.f134771b.f();
    }

    @Override // p13.p0
    public final int nextInt() {
        int i14 = this.f134770a;
        this.f134770a = i14 + 1;
        return this.f134771b.d(i14);
    }
}
