package c53;

import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lc53/v;", "", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements Iterable<Object>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f24585a;

    public v(j jVar) {
        this.f24585a = jVar;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return this.f24585a.iterator();
    }
}
