package l72;

import i3.cf;
import i3.df;
import java.util.Iterator;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.ui.ListKt$SwipeableItem$2$1", f = "List.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf f111094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set<c92.b> f111095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f111096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3.p1<Boolean> f111097d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j2(cf cfVar, Set<? extends c92.b> set, e23.a<Unit> aVar, p3.p1<Boolean> p1Var, t13.d<? super j2> dVar) {
        super(2, dVar);
        this.f111094a = cfVar;
        this.f111095b = set;
        this.f111096c = aVar;
        this.f111097d = p1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j2(this.f111094a, this.f111095b, this.f111096c, this.f111097d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        cf cfVar = this.f111094a;
        if (cfVar.b() != df.Settled) {
            Iterator<T> it = this.f111095b.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((c92.b) next).f26054a != cfVar.b());
            c92.b bVar = (c92.b) next;
            if ((bVar != null ? bVar.f26055b : null) == c92.a.DELETE) {
                this.f111097d.setValue(Boolean.TRUE);
            } else {
                this.f111096c.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
