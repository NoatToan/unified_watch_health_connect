package pc2;

import o13.r;
import o53.b0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lsc2/m;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.diapi.IT2OtherAppForDI2Request$run$2", f = "IT2OtherAppForDI2Request.kt", l = {57, 58}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super sc2.m>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f137343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f137345c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f137345c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f137345c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super sc2.m> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Logger logger;
        Throwable th3;
        Logger logger2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137344b;
        l lVar = this.f137345c;
        if (i14 == 0) {
            r.b(obj);
            Logger logger3 = LoggerFactory.getLogger("NC#".concat("IT2OtherAppForDI2Request"));
            logger3.getClass();
            try {
                this.f137343a = logger3;
                this.f137344b = 1;
                Object objA = l.a(lVar, logger3, this);
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
            logger = this.f137343a;
            try {
                r.b(obj);
                sc2.m mVar = (sc2.m) obj;
                logger.debug("success");
                return mVar;
            } catch (Throwable th5) {
                th3 = th5;
                logger.error("", th3);
                throw th3;
            }
        }
        logger2 = this.f137343a;
        try {
            r.b(obj);
        } catch (Throwable th6) {
            th3 = th6;
            logger = logger2;
            logger.error("", th3);
            throw th3;
        }
        this.f137343a = logger2;
        this.f137344b = 2;
        obj = l.b(lVar, logger2, (sc2.o) obj, this);
        if (obj != aVar) {
            logger = logger2;
            sc2.m mVar2 = (sc2.m) obj;
            logger.debug("success");
            return mVar2;
        }
        return aVar;
    }
}
