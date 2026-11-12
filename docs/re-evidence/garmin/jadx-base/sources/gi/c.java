package gi;

import ci.n;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lgi/c;", "Lgi/d;", "Lhi/b;", "jsonQueries", "<init>", "(Lhi/b;)V", "apollo-normalized-cache-sqlite_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hi.b f77481a;

    public c(hi.b bVar) {
        bVar.getClass();
        this.f77481a = bVar;
    }

    @Override // gi.d
    public final void a(String str) {
        str.getClass();
        this.f77481a.a(str);
    }

    @Override // gi.d
    public final n b(String str) throws IOException {
        str.getClass();
        ArrayList<hi.c> arrayListB = this.f77481a.e(str).b();
        ArrayList arrayList = new ArrayList(y.r(arrayListB, 10));
        for (hi.c cVar : arrayListB) {
            di.c cVar2 = di.c.f59688a;
            String str2 = cVar.f83777a;
            String str3 = cVar.f83778b;
            cVar2.getClass();
            arrayList.add(di.c.a(str2, str3));
        }
        return (n) h0.K0(arrayList);
    }

    @Override // gi.d
    public final void c(n nVar) throws Throwable {
        nVar.getClass();
        di.c.f59688a.getClass();
        this.f77481a.c(di.c.c(nVar), nVar.f27616a);
    }

    @Override // gi.d
    public final void d(n nVar) throws Throwable {
        nVar.getClass();
        String str = nVar.f27616a;
        di.c.f59688a.getClass();
        this.f77481a.d(str, di.c.c(nVar));
    }

    @Override // gi.d
    public final void deleteAll() {
        this.f77481a.deleteAll();
    }

    @Override // gi.d
    public final ArrayList e(List list) throws IOException {
        list.getClass();
        ArrayList<hi.d> arrayListB = this.f77481a.b(list).b();
        ArrayList arrayList = new ArrayList(y.r(arrayListB, 10));
        for (hi.d dVar : arrayListB) {
            di.c cVar = di.c.f59688a;
            String str = dVar.f83779a;
            String str2 = dVar.f83780b;
            cVar.getClass();
            arrayList.add(di.c.a(str, str2));
        }
        return arrayList;
    }

    @Override // gi.d
    public final Object f(e23.a aVar) {
        return this.f77481a.f(new b(aVar));
    }
}
