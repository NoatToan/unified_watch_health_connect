package sc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p005kotlin.Metadata;
import p13.y;
import p3.h0;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsc/a;", "Lp3/h0;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f158428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f158429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f158430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x3 f158431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x3 f158432e;

    public a(Object obj, Set set, Set set2, x3 x3Var, x3 x3Var2) {
        this.f158428a = obj;
        this.f158429b = set;
        this.f158430c = set2;
        this.f158431d = x3Var;
        this.f158432e = x3Var2;
    }

    @Override // p3.h0
    public final void dispose() {
        ArrayList arrayList;
        List list = (List) this.f158431d.getF182175a();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i14 = 0; i14 < size; i14++) {
                arrayList.add(((h) list.get(i14)).f158452b);
            }
        } else {
            arrayList = new ArrayList(y.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((h) it.next()).f158452b);
            }
        }
        Object obj = this.f158428a;
        if (!(arrayList.contains(obj) ? false : this.f158429b.remove(obj)) || this.f158430c.contains(obj)) {
            return;
        }
        List list2 = (List) this.f158432e.getF182175a();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it3 = p13.h0.G0(list2).iterator();
            while (it3.hasNext()) {
                ((i) it3.next()).f158455a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i15 = size2 - 1;
            ((i) list2.get(size2)).f158455a.invoke(obj);
            if (i15 < 0) {
                return;
            } else {
                size2 = i15;
            }
        }
    }
}
