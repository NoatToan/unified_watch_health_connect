package xd2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lbe2/g;", "<anonymous>", "(Lo53/b0;)Lbe2/g;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLocalPersistedDataSource$getSessionInfo$2", f = "DefaultLocalPersistedDataSource.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class t0 extends v13.i implements e23.p<o53.b0, t13.d<? super be2.g>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f190344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(x0 x0Var, long j8, t13.d<? super t0> dVar) {
        super(2, dVar);
        this.f190344b = x0Var;
        this.f190345c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new t0(this.f190344b, this.f190345c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super be2.g> dVar) {
        return ((t0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190343a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zd2.f fVarH = this.f190344b.f190390a.h();
        this.f190343a = 1;
        Object objC = fVarH.c(this.f190345c, this);
        return objC == aVar ? aVar : objC;
    }
}
