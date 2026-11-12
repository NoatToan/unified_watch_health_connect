package androidx.lifecycle.viewmodel;

import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0000\u0012\u0018\u0010\u0005\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/viewmodel/a;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "", "Landroidx/lifecycle/viewmodel/CreationExtras$c;", "", "initialExtras", "<init>", "(Ljava/util/Map;)V", "(Landroidx/lifecycle/viewmodel/CreationExtras;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends CreationExtras {
    public a(Map<CreationExtras.c<?>, ? extends Object> map) {
        map.getClass();
        this.f8055a.putAll(map);
    }

    @Override // androidx.lifecycle.viewmodel.CreationExtras
    public final <T> T a(CreationExtras.c<T> cVar) {
        cVar.getClass();
        return (T) this.f8055a.get(cVar);
    }

    public final <T> void b(CreationExtras.c<T> cVar, T t7) {
        cVar.getClass();
        this.f8055a.put(cVar, t7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(CreationExtras creationExtras) {
        this(creationExtras.f8055a);
        creationExtras.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ a(CreationExtras creationExtras, int i14, j jVar) {
        this((i14 & 1) != 0 ? CreationExtras.b.f8056c : creationExtras);
    }
}
