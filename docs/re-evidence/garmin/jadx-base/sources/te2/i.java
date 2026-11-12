package te2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lsc2/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation$validateDI2AccessToken$2", f = "AbstractOAuth2DIOperation.kt", l = {478}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f164079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sc2.m f164080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.l f164081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, sc2.m mVar, sc2.l lVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f164079b = jVar;
        this.f164080c = mVar;
        this.f164081d = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f164079b, this.f164080c, this.f164081d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.m> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164078a;
        sc2.m mVar = this.f164080c;
        j jVar = this.f164079b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                jVar.f164316c.debug("validateOAuth2DIAccessToken");
                pc2.h hVar = new pc2.h(jVar.f164101f, jVar.f164104i, mVar.f158528b, this.f164081d, jVar.f164103h.f177765f);
                this.f164078a = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new pc2.g(hVar, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            if (((Boolean) wc2.b.a((wc2.a) obj)).booleanValue()) {
                return mVar;
            }
            return null;
        } catch (Throwable th3) {
            jVar.c("validateDI2AccessToken", th3);
            return null;
        }
    }
}
