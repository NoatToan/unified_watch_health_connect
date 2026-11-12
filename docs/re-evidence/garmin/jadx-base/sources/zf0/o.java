package zf0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfg0/k;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.events.EventRepo$getGroupEvent$2", f = "EventRepo.kt", l = {47}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.l<t13.d<? super c83.a0<fg0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f204461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f204462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f204463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f204464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(d dVar, long j8, long j14, t13.d<? super o> dVar2) {
        super(1, dVar2);
        this.f204462b = dVar;
        this.f204463c = j8;
        this.f204464d = j14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new o(this.f204462b, this.f204463c, this.f204464d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fg0.k>> dVar) {
        return ((o) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f204461a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<fg0.k>> i0VarC = this.f204462b.f204344a.c(this.f204463c, this.f204464d);
        this.f204461a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
