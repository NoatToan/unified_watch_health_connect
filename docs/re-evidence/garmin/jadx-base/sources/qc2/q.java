package qc2;

import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lsc2/j;", "Lsc2/m;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.lib.networking.authentication.gcapi.IT2OtherAppForGC1Request$run$2", f = "IT2OtherAppForGC1Request.kt", l = {67, 69}, m = "invokeSuspend")
public final class q extends v13.i implements e23.p<b0, t13.d<? super o13.p<? extends sc2.j, ? extends sc2.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Logger f144435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sc2.m f144436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f144437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r f144438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f144438d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f144438d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super o13.p<? extends sc2.j, ? extends sc2.m>> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [org.slf4j.Logger] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v6, types: [org.slf4j.Logger] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object objE0;
        Logger logger;
        Object objA;
        sc2.m mVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        ?? r14 = this.f144437c;
        r rVar = this.f144438d;
        try {
            if (r14 == 0) {
                o13.r.b(obj);
                Logger logger2 = LoggerFactory.getLogger("NC#".concat("IT2OtherAppForGC1Request"));
                logger2.getClass();
                logger2.debug("calling 'IT2OtherAppForDI2Request'...");
                pc2.l lVar = new pc2.l(rVar.f144439a, rVar.f144440b, rVar.f144441c, rVar.f144442d, rVar.f144443e, rVar.f144444f, rVar.f144446h, rVar.f144447i);
                this.f144435a = logger2;
                this.f144437c = 1;
                x53.c cVar = s0.f129406a;
                objE0 = ge1.b.e0(x53.b.f189152a, new pc2.k(lVar, null), this);
                logger = logger2;
                if (objE0 == aVar) {
                }
                return aVar;
            }
            if (r14 == 1) {
                Logger logger3 = this.f144435a;
                o13.r.b(obj);
                objE0 = obj;
                logger = logger3;
            } else {
                if (r14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mVar = this.f144436b;
                Logger logger4 = this.f144435a;
                o13.r.b(obj);
                objA = obj;
                r14 = logger4;
            }
            r14.debug("success");
            return new o13.p((sc2.j) objA, mVar);
            sc2.m mVar2 = (sc2.m) objE0;
            this.f144435a = logger;
            this.f144436b = mVar2;
            this.f144437c = 2;
            objA = r.a(rVar, logger, mVar2, this);
            if (objA != aVar) {
                mVar = mVar2;
                r14 = logger;
                r14.debug("success");
                return new o13.p((sc2.j) objA, mVar);
            }
            return aVar;
        } catch (Throwable th3) {
            r14.error("", th3);
            throw th3;
        }
    }
}
