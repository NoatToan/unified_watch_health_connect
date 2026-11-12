package i3;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class m7<T> implements r53.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List<a2.b> f88954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l7 f88955b;

    public m7(List<a2.b> list, l7 l7Var) {
        this.f88954a = list;
        this.f88955b = l7Var;
    }

    @Override // r53.j
    public final Object emit(Object obj, t13.d dVar) {
        a2.h hVar = (a2.h) obj;
        boolean z14 = hVar instanceof a2.b;
        List<a2.b> list = this.f88954a;
        if (z14) {
            list.add((a2.b) hVar);
        } else if (hVar instanceof a2.c) {
            list.remove(((a2.c) hVar).f483a);
        }
        boolean z15 = !list.isEmpty();
        l7 l7Var = this.f88955b;
        if (z15 != l7Var.f88840h) {
            l7Var.f88840h = z15;
            l7Var.Y1();
        }
        return Unit.INSTANCE;
    }
}
