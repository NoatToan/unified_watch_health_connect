package vh;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvh/j0;", "T", "Lvh/a;", "", "wrappedAdapter", "<init>", "(Lvh/a;)V", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j0<T> implements a<List<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<T> f178335a;

    public j0(a<T> aVar) {
        aVar.getClass();
        this.f178335a = aVar;
    }

    @Override // vh.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ArrayList b(zh.f fVar, z zVar) {
        fVar.getClass();
        zVar.getClass();
        fVar.q();
        ArrayList arrayList = new ArrayList();
        while (fVar.hasNext()) {
            arrayList.add(this.f178335a.b(fVar, zVar));
        }
        fVar.g();
        return arrayList;
    }

    @Override // vh.a
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void a(zh.g gVar, z zVar, List<? extends T> list) {
        gVar.getClass();
        zVar.getClass();
        list.getClass();
        gVar.q();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f178335a.a(gVar, zVar, it.next());
        }
        gVar.g();
    }
}
