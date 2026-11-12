package xd2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lbe2/g;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLocalPersistedDataSource$getAllSessionInfos$2", f = "DefaultLocalPersistedDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends be2.g>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x0 f190313a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(x0 x0Var, t13.d<? super q0> dVar) {
        super(2, dVar);
        this.f190313a = x0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q0(this.f190313a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends be2.g>> dVar) {
        return ((q0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        List<be2.g> all = this.f190313a.f190390a.h().getAll();
        return all == null ? p13.j0.f134944a : all;
    }
}
