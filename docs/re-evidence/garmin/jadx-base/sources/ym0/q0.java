package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lwm0/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$sendGroupInvitation$2", f = "GroupRepo.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class q0 extends v13.i implements e23.l<t13.d<? super c83.a0<wm0.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f198029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f198030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f198031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wm0.a f198032d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a aVar, String str, wm0.a aVar2, t13.d<? super q0> dVar) {
        super(1, dVar);
        this.f198030b = aVar;
        this.f198031c = str;
        this.f198032d = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new q0(this.f198030b, this.f198031c, this.f198032d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<wm0.a>> dVar) {
        return ((q0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f198029a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<wm0.a>> i0VarC = this.f198030b.f197888b.c(this.f198031c, this.f198032d);
        this.f198029a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
