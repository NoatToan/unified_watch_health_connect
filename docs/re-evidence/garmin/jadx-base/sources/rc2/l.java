package rc2;

import lc.u0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/d;", "<anonymous>", "(Lo53/b0;)Lsc2/d;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.itapi.ITAuth2UsingITOAuth2$run$2", f = "ITAuth2UsingITOAuth2.kt", l = {79}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<o53.b0, t13.d<? super sc2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Logger f151923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f151924c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Logger logger, m mVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f151923b = logger;
        this.f151924c = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f151923b, this.f151924c, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super sc2.d> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f151922a;
        m mVar = this.f151924c;
        Logger logger = this.f151923b;
        if (i14 == 0) {
            o13.r.b(obj);
            logger.debug("calling 'IT2ForIT2Request'...");
            e eVar = new e(mVar.f151928d, mVar.f151925a, mVar.f151926b, mVar.f151927c, mVar.f151929e);
            this.f151922a = 1;
            obj = eVar.h(this);
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
        if (aVar2 instanceof wc2.a.b) {
            logger.debug("IT2ForIT2Request success");
            sc2.c cVar = (sc2.c) ((wc2.a.b) aVar2).f184316a;
            sc2.o oVar = cVar.f158488a;
            ve2.k kVar = cVar.f158489b;
            mVar.getClass();
            return new sc2.d(200, oVar, kVar != null ? new sc2.i(kVar.f177753a, kVar.f177754b) : null, null, cVar.f158490c);
        }
        if (!(aVar2 instanceof wc2.a.C3415a)) {
            u0.r();
            return null;
        }
        Exception exc = ((wc2.a.C3415a) aVar2).f184312a;
        logger.error("IT2ForIT2Request failure", (Throwable) exc);
        throw exc;
    }
}
