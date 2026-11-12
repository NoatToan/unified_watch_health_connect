package te2;

import android.content.Context;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$isPermanentMFAEnabled$2", f = "MFAManager.kt", l = {385}, m = "invokeSuspend")
public final class d2 extends v13.i implements e23.p<o53.b0, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f164006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f164007c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve2.l f164008d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f164009e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(ve2.d dVar, Context context, ve2.l lVar, e2 e2Var, t13.d<? super d2> dVar2) {
        super(2, dVar2);
        this.f164006b = dVar;
        this.f164007c = context;
        this.f164008d = lVar;
        this.f164009e = e2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d2(this.f164006b, this.f164007c, this.f164008d, this.f164009e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Boolean> dVar) {
        return ((d2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164005a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ve2.d dVar = this.f164006b;
                dd2.a aVar2 = dVar.f177695f;
                if (aVar2 == null) {
                    r1.q2.u("'GarminAccount.credentials' is null");
                    return null;
                }
                if (aVar2.f59205b == null) {
                    r1.q2.u("'GarminAccount.credentials.oAuth2ITData' is null");
                    return null;
                }
                Context context = this.f164007c;
                ve2.e eVar = dVar.f177690a;
                String str = dVar.f177691b;
                dd2.a aVar3 = dVar.f177695f;
                aVar3.getClass();
                sc2.o oVar = aVar3.f59205b;
                oVar.getClass();
                rc2.z zVar = new rc2.z(context, eVar, str, oVar.f158544a, this.f164008d.d());
                this.f164005a = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rc2.a0(zVar, null), this);
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
            Boolean bool = (Boolean) wc2.b.a((wc2.a) obj);
            bool.booleanValue();
            return bool;
        } catch (Exception e4) {
            e2.a(this.f164009e).error("isPermanentMFAEnabled", (Throwable) e4);
            throw e4;
        }
    }
}
