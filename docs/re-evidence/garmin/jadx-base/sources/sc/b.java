package sc;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p005kotlin.Metadata;
import p3.h0;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"sc/b", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f158433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f158434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f158435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f158436d;

    public b(Set set, Object obj, Set set2, x3 x3Var) {
        this.f158433a = set;
        this.f158434b = obj;
        this.f158435c = set2;
        this.f158436d = x3Var;
    }

    @Override // p3.h0
    public final void dispose() {
        Set set = this.f158433a;
        Object obj = this.f158434b;
        boolean zRemove = set.remove(obj);
        if (this.f158435c.contains(obj) || !zRemove) {
            return;
        }
        List list = (List) this.f158436d.getF182175a();
        if (!(list instanceof RandomAccess)) {
            Iterator it = p13.h0.G0(list).iterator();
            while (it.hasNext()) {
                ((i) it.next()).f158455a.invoke(obj);
            }
            return;
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i14 = size - 1;
            ((i) list.get(size)).f158455a.invoke(obj);
            if (i14 < 0) {
                return;
            } else {
                size = i14;
            }
        }
    }
}
