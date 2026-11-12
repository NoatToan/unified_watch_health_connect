package c83;

import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class t extends v<Iterable<Object>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f25834a;

    public t(v vVar) {
        this.f25834a = vVar;
    }

    @Override // c83.v
    public final void a(y yVar, Iterable<Object> iterable) {
        Iterable<Object> iterable2 = iterable;
        if (iterable2 == null) {
            return;
        }
        Iterator<Object> it = iterable2.iterator();
        while (it.hasNext()) {
            this.f25834a.a(yVar, it.next());
        }
    }
}
