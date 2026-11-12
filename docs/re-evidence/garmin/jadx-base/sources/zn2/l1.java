package zn2;

import ch.qos.logback.classic.Logger;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager$addOrUpdateTransitCardsCache$2", f = "NewUserDataManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f205641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List<fo2.l0> f205642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(long j8, List<fo2.l0> list, g1 g1Var, t13.d<? super l1> dVar) {
        super(2, dVar);
        this.f205641a = j8;
        this.f205642b = list;
        this.f205643c = g1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l1(this.f205641a, this.f205642b, this.f205643c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((l1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Logger logger = g1.f205525n;
        StringBuilder sb3 = new StringBuilder("addOrUpdateTransitCardsCache(");
        long j8 = this.f205641a;
        sb3.append(j8);
        sb3.append(", ");
        List<fo2.l0> list = this.f205642b;
        sb3.append(list);
        sb3.append(")");
        logger.trace(sb3.toString());
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f205643c.f205526a.a(j8, (fo2.l0) it.next());
        }
        return Unit.INSTANCE;
    }
}
