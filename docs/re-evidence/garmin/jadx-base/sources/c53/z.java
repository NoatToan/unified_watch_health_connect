package c53;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc53/z;", "Lc53/j;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class z implements j<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j<Object> f24589a;

    public z(j<Object> jVar) {
        this.f24589a = jVar;
    }

    @Override // c53.j
    public final Iterator<Object> iterator() {
        List listT = c0.t(this.f24589a);
        p13.c0.t(listT);
        return ((ArrayList) listT).iterator();
    }
}
