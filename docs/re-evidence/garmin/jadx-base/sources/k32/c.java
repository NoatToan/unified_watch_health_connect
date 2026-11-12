package k32;

import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B9\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk32/c;", "", "T", "", "Lk32/e;", "allChips", "Lk32/d;", "optionListener", "Ll32/c;", "chipSelectionStrategy", "<init>", "(Ljava/util/List;Lk32/d;Ll32/c;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e<T>> f102673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d<T> f102674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l32.c<T> f102675c;

    public c(List<e<T>> list, d<T> dVar, l32.c<T> cVar) {
        list.getClass();
        dVar.getClass();
        cVar.getClass();
        this.f102673a = list;
        this.f102674b = dVar;
        this.f102675c = cVar;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f102675c.a(this.f102673a, this.f102674b, (e) it.next());
        }
    }

    public /* synthetic */ c(List list, d dVar, l32.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(list, dVar, (i14 & 4) != 0 ? new l32.b() : cVar);
    }
}
