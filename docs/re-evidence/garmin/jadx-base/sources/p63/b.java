package p63;

import java.util.ArrayList;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u00012\u00020\u0001B)\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lp63/b;", "", "Base", "Lk23/d;", "baseClass", "Li63/c;", "baseSerializer", "<init>", "(Lk23/d;Li63/c;)V", "kotlinx-serialization-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<Base> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k23.d<Base> f136248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i63.c<Base> f136249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f136250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public se0.a f136251d;

    public b(k23.d<Base> dVar, i63.c<Base> cVar) {
        dVar.getClass();
        this.f136248a = dVar;
        this.f136249b = cVar;
        this.f136250c = new ArrayList();
    }

    public final void a(f fVar) {
        k23.d<Base> dVar = this.f136248a;
        i63.c<Base> cVar = this.f136249b;
        if (cVar != null) {
            f.h(fVar, dVar, dVar, cVar);
        }
        for (p pVar : this.f136250c) {
            k23.d dVar2 = (k23.d) pVar.f128594a;
            i63.c cVar2 = (i63.c) pVar.f128595b;
            dVar2.getClass();
            cVar2.getClass();
            f.h(fVar, dVar, dVar2, cVar2);
        }
        se0.a aVar = this.f136251d;
        if (aVar != null) {
            fVar.g(dVar, aVar);
        }
    }

    public final <T extends Base> void b(k23.d<T> dVar, i63.c<T> cVar) {
        dVar.getClass();
        cVar.getClass();
        this.f136250c.add(new p(dVar, cVar));
    }

    public /* synthetic */ b(k23.d dVar, i63.c cVar, int i14, j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : cVar);
    }
}
