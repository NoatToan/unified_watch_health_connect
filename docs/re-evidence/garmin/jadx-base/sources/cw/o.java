package cw;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.biz.MoveIQRepo$deleteMoveIQ$2", f = "MoveIQRepo.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f55940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gs1.f f55941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, gs1.f fVar, t13.d<? super o> dVar) {
        super(1, dVar);
        this.f55940b = nVar;
        this.f55941c = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f55940b, this.f55941c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55939a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<Unit>> i0VarA = this.f55940b.f55938a.a(this.f55941c);
        this.f55939a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
