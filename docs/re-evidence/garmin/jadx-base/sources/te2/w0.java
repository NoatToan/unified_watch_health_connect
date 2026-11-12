package te2;

import com.garmin.android.lib.networking.authentication.ratelimit.RateLimitException;
import java.net.UnknownHostException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/j;", "<anonymous>", "(Lo53/b0;)Lsc2/j;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.biz.GetOAuth1GCCredentials$attemptOtherAppDI2ForGC1$2", f = "GetOAuth1GCCredentials.kt", l = {366}, m = "invokeSuspend")
public final class w0 extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.j>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f164361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f164362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f164363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f164364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f164365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, String str, String str2, String str3, t13.d<? super w0> dVar) {
        super(2, dVar);
        this.f164362b = u0Var;
        this.f164363c = str;
        this.f164364d = str2;
        this.f164365e = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w0(this.f164362b, this.f164363c, this.f164364d, this.f164365e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.j> dVar) {
        return ((w0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f164361a;
        u0 u0Var = this.f164362b;
        if (i14 == 0) {
            o13.r.b(obj);
            qc2.b bVar = new qc2.b(u0Var.f164319e, u0Var.f164321g, this.f164363c, this.f164364d, u0Var.f164330p);
            this.f164361a = 1;
            x53.c cVar = o53.s0.f129406a;
            obj = ge1.b.e0(x53.b.f189152a, new qc2.a(bVar, null), this);
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
        wc2.a aVar2 = (wc2.a) obj;
        boolean z14 = aVar2 instanceof wc2.a.b;
        String str = this.f164365e;
        if (z14) {
            com.airbnb.lottie.animation.keyframe.a.u("attemptOtherAppDI2ForGC1: success using [", str, "]", u0Var.f164316c);
            return ((wc2.a.b) aVar2).f184316a;
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            lc.u0.r();
            return null;
        }
        Exception exc = ((wc2.a.C3415a) aVar2).f184312a;
        if ((exc instanceof RateLimitException) || (exc instanceof UnknownHostException)) {
            throw exc;
        }
        u0Var.f164316c.warn("attemptOtherAppDI2ForGC1: using [" + str + "]", (Throwable) exc);
        return null;
    }
}
