package w60;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lv60/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.cross_selling.repo.CrossSellingRepo$updateUserPrefsAsync$2", f = "CrossSellingRepo.kt", l = {27}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<v60.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f183127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f183128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t60.a f183129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v60.b f183130d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, t60.a aVar, v60.b bVar, t13.d<? super c> dVar2) {
        super(1, dVar2);
        this.f183128b = dVar;
        this.f183129c = aVar;
        this.f183130d = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f183128b, this.f183129c, this.f183130d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<v60.b>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f183127a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<v60.b>> i0VarB = this.f183128b.f183131a.b(this.f183129c.f162702a, this.f183130d);
        this.f183127a = 1;
        Object objAwait = i0VarB.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
