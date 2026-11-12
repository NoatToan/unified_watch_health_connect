package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.exceptions.AuthHttpException;
import p005kotlin.Metadata;
import p005kotlin.NoWhenBranchMatchedException;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lve2/i;", "<anonymous>", "(Lo53/b0;)Lve2/i;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.MFAManager$getMFALoginInfo$2", f = "MFAManager.kt", l = {343}, m = "invokeSuspend")
public final class v1 extends v13.i implements e23.p<o53.b0, t13.d<? super ve2.i>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ve2.d f164352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f164353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ve2.l f164354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e2 f164355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(ve2.d dVar, Context context, ve2.l lVar, e2 e2Var, t13.d<? super v1> dVar2) {
        super(2, dVar2);
        this.f164352b = dVar;
        this.f164353c = context;
        this.f164354d = lVar;
        this.f164355e = e2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new v1(this.f164352b, this.f164353c, this.f164354d, this.f164355e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super ve2.i> dVar) {
        return ((v1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Integer httpCode;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164351a;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ve2.d dVar = this.f164352b;
                dd2.a aVar2 = dVar.f177695f;
                if (aVar2 == null) {
                    r1.q2.u("'GarminAccount.credentials' is null");
                    return null;
                }
                if (aVar2.f59205b == null) {
                    r1.q2.u("'GarminAccount.credentials.oAuth2ITData' is null");
                    return null;
                }
                Context context = this.f164353c;
                ve2.e eVar = dVar.f177690a;
                String str = dVar.f177691b;
                sc2.o oVar = aVar2.f59205b;
                oVar.getClass();
                rc2.d0 d0Var = new rc2.d0(context, eVar, str, oVar.f158544a, this.f164354d.d());
                this.f164351a = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rc2.e0(d0Var, null), this);
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
            wc2.a aVar3 = (wc2.a) obj;
            if (aVar3 instanceof wc2.a.b) {
                return (ve2.i) ((wc2.a.b) aVar3).f184316a;
            }
            if (!(aVar3 instanceof wc2.a.C3415a)) {
                throw new NoWhenBranchMatchedException();
            }
            wc2.a.C3415a c3415a = (wc2.a.C3415a) aVar3;
            Integer num = c3415a.f184313b;
            if (num == null || num.intValue() != 404) {
                Exception exc = c3415a.f184312a;
                if (!(exc instanceof AuthHttpException) || (httpCode = ((AuthHttpException) exc).getHttpCode()) == null || httpCode.intValue() != 404) {
                    throw ((wc2.a.C3415a) aVar3).f184312a;
                }
            }
            return null;
        } catch (Exception e4) {
            e2.a(this.f164355e).error("getMFALoginInfo", (Throwable) e4);
            throw e4;
        }
    }
}
