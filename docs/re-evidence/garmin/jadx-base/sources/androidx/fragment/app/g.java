package androidx.fragment.app;

import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class g extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e.g f7230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7232c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e.g gVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.f7230a = gVar;
        this.f7231b = obj;
        this.f7232c = viewGroup;
    }

    @Override // e23.a
    public final Unit invoke() {
        e.g gVar = this.f7230a;
        List<e.h> list = gVar.f7190c;
        l0 l0Var = gVar.f7193f;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((e.h) it.next()).f7189a.f7339g) {
                    h7.d dVar = new h7.d();
                    l0Var.u(gVar.f7190c.get(0).f7189a.f7335c, this.f7231b, dVar, new a0.c(gVar, 10));
                    dVar.a();
                }
            }
            Object obj = gVar.f7204q;
            obj.getClass();
            l0Var.d(obj, new d(1, gVar, this.f7232c));
        } else {
            Object obj2 = gVar.f7204q;
            obj2.getClass();
            l0Var.d(obj2, new d(1, gVar, this.f7232c));
        }
        return Unit.INSTANCE;
    }
}
