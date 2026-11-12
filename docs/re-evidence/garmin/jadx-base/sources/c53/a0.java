package c53;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc53/a0;", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<Object> f24505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator<Object> f24506b;

    public a0(j<Object> jVar, Comparator<Object> comparator) {
        this.f24505a = jVar;
        this.f24506b = comparator;
    }

    @Override // c53.j
    public final Iterator<Object> iterator() {
        List listT = c0.t(this.f24505a);
        p13.c0.u(listT, this.f24506b);
        return listT.iterator();
    }
}
