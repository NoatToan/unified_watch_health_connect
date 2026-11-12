package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$acceptGroupMemberRequest$2", f = "GroupRepo.kt", l = {167}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.l<t13.d<? super c83.a0<Boolean>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f197917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm0.c f197918d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, long j8, wm0.c cVar, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f197916b = aVar;
        this.f197917c = j8;
        this.f197918d = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f197916b, this.f197917c, this.f197918d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<Boolean>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197915a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<Boolean>> i0VarJ = this.f197916b.f197888b.j(this.f197917c, this.f197918d);
        this.f197915a = 1;
        Object objAwait = i0VarJ.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
