package m20;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ltj1/r;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.contacts.network.LiveTrackContactsRepository$initializeContact$2", f = "LiveTrackContactsRepository.kt", l = {23}, m = "invokeSuspend", v = 2)
public final class i0 extends v13.i implements e23.l<t13.d<? super c83.a0<tj1.r>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f115973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f115974c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, long j8, t13.d<? super i0> dVar) {
        super(1, dVar);
        this.f115973b = k0Var;
        this.f115974c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new i0(this.f115973b, this.f115974c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<tj1.r>> dVar) {
        return ((i0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115972a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<tj1.r>> i0VarJ = this.f115973b.f115984a.j(this.f115974c);
        this.f115972a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
