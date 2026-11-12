package te2;

import android.content.Context;
import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import com.garmin.android.library.mobileauth.exception.CredentialExchangesExhaustedException;
import java.net.UnknownHostException;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lsc2/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.AbstractOAuth2DIOperation$refreshDI2$2", f = "AbstractOAuth2DIOperation.kt", l = {420, 426, 428}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sc2.m f164050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f164051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j2 f164052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f164053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j2 f164054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f164055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j f164056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.m f164057h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f164058i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, sc2.m mVar, boolean z14, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f164056g = jVar;
        this.f164057h = mVar;
        this.f164058i = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f164056g, this.f164057h, this.f164058i, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.m> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a6 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:8:0x001e, B:34:0x00bf, B:15:0x0038, B:29:0x00a6, B:16:0x0042, B:22:0x007a, B:24:0x008c, B:19:0x0052), top: B:58:0x0010 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objE0;
        sc2.m mVar;
        j2 j2VarB;
        j jVar;
        ve2.k kVar;
        j2 j2Var;
        Context context;
        sc2.m mVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164055f;
        sc2.m mVar3 = this.f164057h;
        j jVar2 = this.f164056g;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                Logger logger = jVar2.f164316c;
                ve2.l lVar = jVar2.f164103h;
                logger.debug("refreshDI2");
                Context context2 = jVar2.f164101f;
                ve2.e eVar = jVar2.f164104i;
                String str = mVar3.f158529c;
                sc2.l lVarB = lVar.b(eVar);
                lVarB.getClass();
                pc2.f fVar = new pc2.f(context2, eVar, str, lVarB, lVar.f177765f);
                this.f164055f = 1;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.e(fVar, null), this);
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objE0 = obj;
            } else {
                if (i14 == 2) {
                    j2VarB = this.f164054e;
                    jVar = this.f164053d;
                    j2 j2Var2 = this.f164052c;
                    ve2.k kVar2 = (ve2.k) this.f164051b;
                    sc2.m mVar4 = this.f164050a;
                    o13.r.b(obj);
                    j2Var = j2Var2;
                    mVar = mVar4;
                    kVar = kVar2;
                    if (kVar != null) {
                        context = jVar.f164101f;
                        this.f164050a = mVar;
                        this.f164051b = j2Var;
                        this.f164052c = null;
                        this.f164053d = null;
                        this.f164054e = null;
                        this.f164055f = 3;
                        j2 j2Var3 = j2.f164115a;
                        if (j2VarB.z(context, kVar, true, this) != aVar) {
                            mVar2 = mVar;
                        }
                        return aVar;
                    }
                    jVar2.getClass();
                    return mVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar2 = this.f164050a;
                o13.r.b(obj);
            }
            mVar = mVar2;
            jVar2.getClass();
            return mVar;
            sc2.n nVar = (sc2.n) wc2.b.a((wc2.a) objE0);
            mVar = nVar.f158542b;
            ve2.k kVar3 = nVar.f158541a;
            j2VarB = jVar2.b();
            if (j2VarB != null) {
                Context context3 = jVar2.f164101f;
                this.f164050a = mVar;
                this.f164051b = kVar3;
                this.f164052c = j2VarB;
                this.f164053d = jVar2;
                this.f164054e = j2VarB;
                this.f164055f = 2;
                if (j2VarB.w(context3, mVar, this) != aVar) {
                    jVar = jVar2;
                    kVar = kVar3;
                    j2Var = j2VarB;
                    if (kVar != null) {
                        context = jVar.f164101f;
                        this.f164050a = mVar;
                        this.f164051b = j2Var;
                        this.f164052c = null;
                        this.f164053d = null;
                        this.f164054e = null;
                        this.f164055f = 3;
                        j2 j2Var4 = j2.f164115a;
                        if (j2VarB.z(context, kVar, true, this) != aVar) {
                            mVar2 = mVar;
                            mVar = mVar2;
                        }
                    }
                }
                return aVar;
            }
            jVar2.getClass();
            return mVar;
        } catch (Throwable th3) {
            jVar2.getClass();
            Logger logger2 = jVar2.f164316c;
            if (th3 instanceof RateLimitException) {
                if (this.f164058i || nd2.c.e(mVar3.f158530d)) {
                    com.airbnb.lottie.animation.keyframe.a.A("refreshDI2: ", th3.getMessage(), logger2);
                    throw th3;
                }
                ds.e0.u("refreshDI2: ", th3.getMessage(), ", but access token not expired, returning access token", logger2);
                return mVar3;
            }
            if (!(th3 instanceof UnknownHostException) && !(th3 instanceof CredentialExchangesExhaustedException)) {
                logger2.error("refreshDI2", th3);
                return null;
            }
            String message = th3.getMessage();
            if (message == null) {
                message = "";
            }
            logger2.warn("refreshDI2: {}", message);
            throw th3;
        }
    }
}
