package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.exceptions.AuthHttpException;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/o;", "<anonymous>", "(Lo53/b0;)Lsc2/o;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2ITOperation$refreshIT2$2", f = "AbstractOAuth2ITOperation.kt", l = {336, 337, 347}, m = "invokeSuspend")
public final class r extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.o>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f164264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f164265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f164266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f164267d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f164268e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.o f164269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, sc2.o oVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f164268e = sVar;
        this.f164269f = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f164268e, this.f164269f, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.o> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th3;
        Integer httpCode;
        int iIntValue;
        j2 j2VarB;
        Throwable th4;
        s sVar;
        sc2.o oVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164267d;
        s sVar2 = this.f164268e;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = sVar2.f164316c;
                ve2.l lVar = sVar2.f164287h;
                logger.debug("refreshIT2");
                Context context = sVar2.f164285f;
                ve2.e eVar = sVar2.f164286g.f177690a;
                String str = this.f164269f.f158546c;
                sc2.l lVarC = lVar.c(eVar);
                lVarC.getClass();
                rc2.f fVar = new rc2.f(context, eVar, str, lVarC.f158524a, lVar.d());
                this.f164267d = 1;
                x53.c cVar = o53.s0.f129406a;
                obj = ge1.b.e0(x53.b.f189152a, new rc2.g(fVar, null), this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iIntValue = this.f164266c;
                    sVar = this.f164265b;
                    th4 = (Throwable) this.f164264a;
                    o13.r.b(obj);
                    sVar.f164316c.warn("refreshIT2: server " + iIntValue + ", credential deleted from system account");
                    th3 = th4;
                    if (!(th3 instanceof RateLimitException) && !(th3 instanceof UnknownHostException)) {
                        return null;
                    }
                    com.airbnb.lottie.animation.keyframe.a.A("refreshIT2: ", th3.getMessage(), sVar2.f164316c);
                    throw th3;
                }
                oVar = (sc2.o) this.f164264a;
                o13.r.b(obj);
            }
            sVar2.getClass();
            return oVar;
            oVar = ((sc2.c) wc2.b.a((wc2.a) obj)).f158488a;
            j2 j2VarB2 = sVar2.b();
            if (j2VarB2 != null) {
                Context context2 = sVar2.f164285f;
                this.f164264a = oVar;
                this.f164267d = 2;
                if (j2VarB2.y(context2, oVar, this) == aVar) {
                    return aVar;
                }
            }
            sVar2.getClass();
            return oVar;
        } catch (Throwable th5) {
            th3 = th5;
            sVar2.getClass();
            AuthHttpException authHttpException = th3 instanceof AuthHttpException ? (AuthHttpException) th3 : null;
            if (authHttpException != null && (httpCode = authHttpException.getHttpCode()) != null && 400 <= (iIntValue = httpCode.intValue()) && iIntValue < 500 && (j2VarB = sVar2.b()) != null) {
                Context context3 = sVar2.f164285f;
                this.f164264a = th3;
                this.f164265b = sVar2;
                this.f164266c = iIntValue;
                this.f164267d = 3;
                if (j2VarB.g(context3, true, this) != aVar) {
                    th4 = th3;
                    sVar = sVar2;
                }
                return aVar;
            }
        }
    }
}
