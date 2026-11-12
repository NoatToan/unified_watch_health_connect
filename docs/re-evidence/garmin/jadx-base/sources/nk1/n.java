package nk1;

import c83.a0;
import hk1.w;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lhk1/a;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.thirdparty.repo.ThirdPartyRepo$getPartnerOAuth2AuthorizationAsync$2", f = "ThirdPartyRepo.kt", l = {54}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.l<t13.d<? super a0<hk1.a>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f126441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w.b f126442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(g gVar, w.b bVar, t13.d<? super n> dVar) {
        super(1, dVar);
        this.f126441b = gVar;
        this.f126442c = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new n(this.f126441b, this.f126442c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<hk1.a>> dVar) {
        return ((n) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126440a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        bk1.b bVar = this.f126441b.f126422a;
        w.b bVar2 = this.f126442c;
        String str = bVar2.f84214f;
        if (str == null) {
            str = "code";
        }
        String str2 = str;
        String str3 = bVar2.f84209a;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = bVar2.f84213e;
        String str5 = bVar2.f84210b;
        String str6 = bVar2.f84211c;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = bVar2.f84212d;
        i0<a0<hk1.a>> i0VarC = bVar.c(str2, str3, str4, str5, str6, str7 == null ? "" : str7);
        this.f126440a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
