package c2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lc2/e0;", "", "Lf5/y0;", "", "itemCount", "Lkotlin/Function2;", "Lc2/x0;", "", "getMeasurables", "<init>", "(ILe23/p;)V", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 implements Iterator<f5.y0>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<Integer, x0, List<f5.y0>> f22629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f22630c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22632e;

    /* JADX WARN: Multi-variable type inference failed */
    public e0(int i14, e23.p<? super Integer, ? super x0, ? extends List<? extends f5.y0>> pVar) {
        this.f22628a = i14;
        this.f22629b = pVar;
    }

    public final f5.y0 a(x0 x0Var) {
        int i14 = this.f22632e;
        ArrayList arrayList = this.f22630c;
        if (i14 < arrayList.size()) {
            f5.y0 y0Var = (f5.y0) arrayList.get(this.f22632e);
            this.f22632e++;
            return y0Var;
        }
        int i15 = this.f22631d;
        if (i15 >= this.f22628a) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.f22631d);
        }
        List<f5.y0> listInvoke = this.f22629b.invoke(Integer.valueOf(i15), x0Var);
        this.f22631d++;
        if (listInvoke.isEmpty()) {
            return a(new x0(0, 0, 0.0f, 0.0f, 15, null));
        }
        f5.y0 y0Var2 = (f5.y0) p13.h0.b0(listInvoke);
        arrayList.addAll(listInvoke);
        this.f22632e++;
        return y0Var2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22632e < this.f22630c.size() || this.f22631d < this.f22628a;
    }

    @Override // java.util.Iterator
    public final f5.y0 next() {
        return a(new x0(0, 0, 0.0f, 0.0f, 15, null));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
