package z10;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.BaseConsentViewModel$getConsentStatus$1", f = "BaseConsentViewModel.kt", l = {151, SyslogConstants.LOG_LOCAL3, 154}, m = "invokeSuspend", v = 2)
public final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f201197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hl.a f201198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f201199d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(j jVar, hl.a aVar, q92.x xVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f201197b = jVar;
        this.f201198c = aVar;
        this.f201199d = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f201197b, this.f201198c, this.f201199d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (r12 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r1.emit(r12, r11) == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        q92.v vVar;
        Object value2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201196a;
        j jVar = this.f201197b;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                vVar = (q92.v) obj;
            } else if (i14 == 2) {
                o13.r.b(obj);
                vVar = (q92.v) obj;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            r53.p2 p2Var = jVar.f201060c;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, c1.a((c1) value2, false, null, null, 6)));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        r53.p2 p2Var2 = jVar.f201060c;
        do {
            value = p2Var2.getValue();
        } while (!p2Var2.b(value, c1.a((c1) value, true, null, null, 6)));
        hl.a.c cVar = hl.a.c.f84256b;
        hl.a aVar2 = this.f201198c;
        boolean zG = p005kotlin.jvm.internal.s.g(aVar2, cVar);
        q92.x xVar = this.f201199d;
        if (zG) {
            p92.o oVar = p92.o.f136619a;
            this.f201196a = 1;
            obj = oVar.c(xVar, this);
        } else {
            if (!(aVar2 instanceof hl.a.b)) {
                lc.u0.r();
                return null;
            }
            p92.o oVar2 = p92.o.f136619a;
            s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar2).f84252b));
            this.f201196a = 2;
            obj = oVar2.k(xVar, lVar, this);
        }
        return aVar;
        r53.e2 e2Var = jVar.f201059b;
        this.f201196a = 3;
    }
}
