package ym0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ljo1/e;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.group.network.GroupRepo$createGroupPostFeed$2", f = "GroupRepo.kt", l = {352}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.l<t13.d<? super c83.a0<jo1.e>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f197945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f197946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f197947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jo1.b f197948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, long j8, String str, jo1.b bVar, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f197945b = aVar;
        this.f197946c = j8;
        this.f197947d = str;
        this.f197948e = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f197945b, this.f197946c, this.f197947d, this.f197948e, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<jo1.e>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197944a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<jo1.e>> i0VarS = this.f197945b.f197887a.s(this.f197946c, this.f197947d, this.f197948e);
        this.f197944a = 1;
        Object objAwait = i0VarS.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
