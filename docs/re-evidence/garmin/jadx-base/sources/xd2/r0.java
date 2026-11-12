package xd2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lbe2/e;", "<anonymous>", "(Lo53/b0;)Lbe2/e;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.data.DefaultLocalPersistedDataSource$getLivetrackPublisher$2", f = "DefaultLocalPersistedDataSource.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super be2.e>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f190325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0 f190326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f190327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(x0 x0Var, long j8, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f190326b = x0Var;
        this.f190327c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f190326b, this.f190327c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super be2.e> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f190325a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        zd2.a aVarF = this.f190326b.f190390a.f();
        this.f190325a = 1;
        Object objD = aVarF.d(this.f190327c, this);
        return objD == aVar ? aVar : objD;
    }
}
