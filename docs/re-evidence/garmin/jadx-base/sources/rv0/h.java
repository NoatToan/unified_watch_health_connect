package rv0;

import c83.a0;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pv0.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lpv0/v;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.logging.data.repository.LifestyleLoggingRepositoryImpl$getDailyLoggingSummary$2", f = "LifestyleLoggingRepositoryImpl.kt", l = {143}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<v>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f154650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f154651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b63.o f154652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b63.o f154653e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(b bVar, String str, b63.o oVar, b63.o oVar2, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f154650b = bVar;
        this.f154651c = str;
        this.f154652d = oVar;
        this.f154653e = oVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f154650b, this.f154651c, this.f154652d, this.f154653e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<v>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f154649a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        i0<a0<v>> i0VarF = this.f154650b.f154625a.f(this.f154651c, fz0.d.a(this.f154652d), fz0.d.a(this.f154653e));
        this.f154649a = 1;
        Object objAwait = i0VarF.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
