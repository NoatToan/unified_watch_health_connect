package te2;

import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials$attemptOtherAppIT2ForGC1$2", f = "GetOAuth1GCCredentials.kt", l = {416}, m = "invokeSuspend")
public final class x0 extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.j>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f164376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f164378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f164379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.l f164380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f164381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f164382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, String str, String str2, String str3, sc2.l lVar, String str4, String str5, t13.d<? super x0> dVar) {
        super(2, dVar);
        this.f164376b = u0Var;
        this.f164377c = str;
        this.f164378d = str2;
        this.f164379e = str3;
        this.f164380f = lVar;
        this.f164381g = str4;
        this.f164382h = str5;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x0(this.f164376b, this.f164377c, this.f164378d, this.f164379e, this.f164380f, this.f164381g, this.f164382h, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.j> dVar) {
        return ((x0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objE0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164375a;
        String str = this.f164382h;
        u0 u0Var = this.f164376b;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                qc2.r rVar = new qc2.r(u0Var.f164319e, u0Var.f164321g, this.f164377c, this.f164378d, this.f164379e, this.f164380f, this.f164381g, u0Var.f164330p, false);
                this.f164375a = 1;
                x53.c cVar = o53.s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new qc2.q(rVar, null), this);
                if (objE0 == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objE0 = obj;
            }
            u0Var.f164316c.debug("attemptOtherAppIT2ForGC1: success using [" + str + "]");
            return (sc2.j) ((o13.p) objE0).f128594a;
        } catch (Exception e4) {
            if ((e4 instanceof RateLimitException) || (e4 instanceof UnknownHostException)) {
                throw e4;
            }
            u0Var.f164316c.warn("attemptOtherAppIT2ForGC1: using [" + str + "]", (Throwable) e4);
            return null;
        }
    }
}
