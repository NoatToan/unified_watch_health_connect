package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$deleteAnnouncement$2", f = "GroupRepo.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super c83.a0<String>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f197963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197964d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(a aVar, String str, String str2, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f197962b = aVar;
        this.f197963c = str;
        this.f197964d = str2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f197962b, this.f197963c, this.f197964d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<String>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197961a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<String>> i0VarC = this.f197962b.f197888b.C(this.f197963c, this.f197964d);
        this.f197961a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
