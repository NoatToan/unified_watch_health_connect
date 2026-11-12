package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lwm0/c;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$getGroupMemberRequestForGroupByUserId$2", f = "GroupRepo.kt", l = {149}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.l<t13.d<? super c83.a0<wm0.c>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f197933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a aVar, long j8, String str, t13.d<? super d0> dVar) {
        super(1, dVar);
        this.f197932b = aVar;
        this.f197933c = j8;
        this.f197934d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d0(this.f197932b, this.f197933c, this.f197934d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<wm0.c>> dVar) {
        return ((d0) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197931a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<wm0.c>> i0VarH = this.f197932b.f197888b.h(this.f197933c, this.f197934d);
        this.f197931a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
