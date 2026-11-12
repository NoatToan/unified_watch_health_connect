package nk1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Ld20/d;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.ThirdPartyRepo$getOAuthToken$2", f = "ThirdPartyRepo.kt", l = {36}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.l<t13.d<? super a0<d20.d>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f126436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f126437c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String str, t13.d<? super l> dVar) {
        super(1, dVar);
        this.f126436b = gVar;
        this.f126437c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new l(this.f126436b, this.f126437c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<d20.d>> dVar) {
        return ((l) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126435a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<d20.d>> i0VarE = this.f126436b.f126422a.e(this.f126437c);
        this.f126435a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
