package qc2;

import o53.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/n;", "<anonymous>", "(Lo53/b0;)Lsc2/n;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.GC1OtherAppForDI2Request$run$2", f = "GC1OtherAppForDI2Request.kt", l = {53, 54}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super sc2.n>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f144397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f144398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f144399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f144399c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f144399c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super sc2.n> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Logger logger;
        Throwable th3;
        Logger logger2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f144398b;
        h hVar = this.f144399c;
        if (i14 == 0) {
            o13.r.b(obj);
            Logger logger3 = LoggerFactory.getLogger("NC#".concat("GC1OtherAppForDI2Request"));
            logger3.getClass();
            try {
                this.f144397a = logger3;
                this.f144398b = 1;
                Object objA = h.a(hVar, logger3, this);
                if (objA != aVar) {
                    logger2 = logger3;
                    obj = objA;
                }
                return aVar;
            } catch (Throwable th4) {
                logger = logger3;
                th3 = th4;
                logger.error("", th3);
                throw th3;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            logger = this.f144397a;
            try {
                o13.r.b(obj);
                sc2.n nVar = (sc2.n) obj;
                logger.debug("success");
                return nVar;
            } catch (Throwable th5) {
                th3 = th5;
                logger.error("", th3);
                throw th3;
            }
        }
        logger2 = this.f144397a;
        try {
            o13.r.b(obj);
        } catch (Throwable th6) {
            th3 = th6;
            logger = logger2;
            logger.error("", th3);
            throw th3;
        }
        this.f144397a = logger2;
        this.f144398b = 2;
        obj = h.b(hVar, logger2, (sc2.j) obj, this);
        if (obj != aVar) {
            logger = logger2;
            sc2.n nVar2 = (sc2.n) obj;
            logger.debug("success");
            return nVar2;
        }
        return aVar;
    }
}
