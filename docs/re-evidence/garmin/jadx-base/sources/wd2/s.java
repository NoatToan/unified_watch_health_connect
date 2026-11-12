package wd2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.LivetrackManager$getSettingsIO$1", f = "LivetrackManager.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f184598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f184599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<m1, Unit> f184600c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(q qVar, l lVar, e23.l<? super m1, Unit> lVar2, t13.d<? super s> dVar) {
        super(2, dVar);
        this.f184598a = qVar;
        this.f184599b = lVar;
        this.f184600c = lVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new s(this.f184598a, this.f184599b, this.f184600c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((s) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        q.a aVar2 = q.f184563f;
        q qVar = this.f184598a;
        qVar.d(this.f184599b);
        g1 g1Var = qVar.f184567b;
        if (g1Var != null) {
            this.f184600c.invoke(new d(g1Var));
        }
        return Unit.INSTANCE;
    }
}
