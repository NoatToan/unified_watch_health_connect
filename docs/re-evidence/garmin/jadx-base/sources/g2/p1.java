package g2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lg2/p1;", "T", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.c<j<T>> f75197a = new q3.c<>(new j[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f75198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j<? extends T> f75199c;

    public final void a(int i14, u.a aVar) {
        if (i14 < 0) {
            b2.e.a("size should be >=0");
        }
        if (i14 == 0) {
            return;
        }
        j jVar = new j(this.f75198b, i14, aVar);
        this.f75198b += i14;
        this.f75197a.b(jVar);
    }

    public final j<T> b(int i14) {
        if (i14 < 0 || i14 >= this.f75198b) {
            StringBuilder sbI = b71.i.i(i14, "Index ", ", size ");
            sbI.append(this.f75198b);
            b2.e.e(sbI.toString());
        }
        j<? extends T> jVar = this.f75199c;
        if (jVar != null) {
            int i15 = jVar.f75138a;
            if (i14 < jVar.f75139b + i15 && i15 <= i14) {
                return jVar;
            }
        }
        q3.c<j<T>> cVar = this.f75197a;
        j jVar2 = (j<? extends T>) cVar.f142356a[p.c(i14, cVar)];
        this.f75199c = jVar2;
        return jVar2;
    }
}
