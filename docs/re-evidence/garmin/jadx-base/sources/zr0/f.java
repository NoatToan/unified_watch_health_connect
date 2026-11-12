package zr0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import yr0.o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lyr0/o;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.jet_lag.data.repository.JetLagRepositoryImpl$updateTrip$2", f = "JetLagRepositoryImpl.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class f extends i implements l<t13.d<? super a0<o>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f206762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f206763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f206764c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, o oVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f206763b = gVar;
        this.f206764c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f206763b, this.f206764c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<o>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206762a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<o>> i0VarD = this.f206763b.f206765a.d(this.f206764c);
        this.f206762a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
