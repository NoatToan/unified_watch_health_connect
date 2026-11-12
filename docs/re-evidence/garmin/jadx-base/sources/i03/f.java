package i03;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f86930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f86931b = new ArrayList(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView.BufferType f86932c = TextView.BufferType.SPANNABLE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f86933d = true;

    public f(Context context) {
        this.f86930a = context;
    }

    public final h a() {
        ArrayList arrayList = this.f86931b;
        if (arrayList.isEmpty()) {
            vb.h.z("No plugins were added to this builder. Use #usePlugin method to add them");
            return null;
        }
        p pVar = new p(arrayList);
        Iterator<i> it = pVar.f86963a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList<i> arrayList2 = pVar.f86964b;
            if (!zHasNext) {
                i73.c.b bVar = new i73.c.b();
                p03.b bVar2 = new p03.b(this.f86930a.getResources().getDisplayMetrics().density);
                j03.r.a aVar = new j03.r.a();
                aVar.f96198d = bVar2.a(8);
                aVar.f96195a = bVar2.a(24);
                aVar.f96196b = bVar2.a(4);
                aVar.f96197c = bVar2.a(1);
                aVar.f96199e = bVar2.a(1);
                aVar.f96200f = bVar2.a(4);
                g.b bVar3 = new g.b();
                n.a aVar2 = new n.a();
                j.a aVar3 = new j.a();
                for (i iVar : arrayList2) {
                    iVar.getClass();
                    iVar.f(aVar);
                    iVar.e(aVar2);
                    iVar.b(aVar3);
                }
                j03.r rVar = new j03.r(aVar);
                j jVar = new j(Collections.unmodifiableMap(aVar3.f86952a));
                bVar3.f86939a = rVar;
                bVar3.f86945g = jVar;
                if (bVar3.f86940b == null) {
                    bVar3.f86940b = new m03.b();
                }
                if (bVar3.f86941c == null) {
                    bVar3.f86941c = new o03.a();
                }
                if (bVar3.f86942d == null) {
                    bVar3.f86942d = new d();
                }
                if (bVar3.f86943e == null) {
                    bVar3.f86943e = new n03.a.b();
                }
                if (bVar3.f86944f == null) {
                    bVar3.f86944f = new m03.e();
                }
                g gVar = new g(bVar3);
                l lVar = new l(aVar2, gVar);
                return new h(this.f86932c, null, new i73.c(bVar), lVar, gVar, Collections.unmodifiableList(arrayList2), this.f86933d);
            }
            i next = it.next();
            if (!arrayList2.contains(next)) {
                HashSet hashSet = pVar.f86965c;
                if (hashSet.contains(next)) {
                    com.google.firebase.messaging.l.n(hashSet, "Cyclic dependency chain found: ");
                    return null;
                }
                hashSet.add(next);
                next.getClass();
                hashSet.remove(next);
                if (!arrayList2.contains(next)) {
                    if (j03.p.class.isAssignableFrom(next.getClass())) {
                        arrayList2.add(0, next);
                    } else {
                        arrayList2.add(next);
                    }
                }
            }
        }
    }
}
