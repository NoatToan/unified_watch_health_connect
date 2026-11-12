package nk1;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhk1/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.ThirdPartyRepo$authorizeOAuth2TokenAsync$2", f = "ThirdPartyRepo.kt", l = {42}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.l<t13.d<? super a0<hk1.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f126424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f126425c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, String str, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f126424b = gVar;
        this.f126425c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f126424b, this.f126425c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<hk1.b>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126423a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<hk1.b>> i0VarH = this.f126424b.f126422a.h(this.f126425c);
        this.f126423a = 1;
        Object objAwait = i0VarH.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
