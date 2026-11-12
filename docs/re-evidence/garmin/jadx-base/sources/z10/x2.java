package z10;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentViewModel$getProductImprovementConsent$1", f = "ProductImprovementConsentViewModel.kt", l = {50, 54, 57}, m = "invokeSuspend", v = 2)
public final class x2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.x f201303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q92.v f201304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f201305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<fw.m<s92.g>> f201306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.f f201307e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(androidx.lifecycle.y0<fw.m<s92.g>> y0Var, com.garmin.android.apps.connectmobile.consent.f fVar, t13.d<? super x2> dVar) {
        super(2, dVar);
        this.f201306d = y0Var;
        this.f201307e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new x2(this.f201306d, this.f201307e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((x2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r11 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r11 == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q92.x xVar;
        q92.v vVar;
        q92.v vVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201305c;
        androidx.lifecycle.y0<fw.m<s92.g>> y0Var = this.f201306d;
        if (i14 != 0) {
            if (i14 == 1) {
                xVar = this.f201303a;
                o13.r.b(obj);
                vVar = (q92.v) obj;
            } else if (i14 == 2) {
                xVar = this.f201303a;
                o13.r.b(obj);
                vVar = (q92.v) obj;
            } else {
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vVar2 = this.f201304b;
                o13.r.b(obj);
            }
            s92.g gVar = (s92.g) obj;
            if (vVar2 != null || gVar == null) {
                y0Var.m(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            } else {
                y0Var.m(fw.m.a.g(fw.m.f73767e, gVar, 1));
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
        xVar = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
        com.garmin.android.apps.connectmobile.consent.f fVar = this.f201307e;
        hl.a aVar2 = fVar.f32284a;
        if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
            p92.o oVar = p92.o.f136619a;
            this.f201303a = xVar;
            this.f201305c = 1;
            obj = oVar.c(xVar, this);
        } else {
            if (!(aVar2 instanceof hl.a.b)) {
                lc.u0.r();
                return null;
            }
            s92.l lVar = new s92.l(String.valueOf(((hl.a.b) fVar.f32284a).f84252b));
            p92.o oVar2 = p92.o.f136619a;
            this.f201303a = xVar;
            this.f201304b = null;
            this.f201305c = 2;
            obj = oVar2.k(xVar, lVar, this);
        }
        return aVar;
        p92.o oVar3 = p92.o.f136619a;
        this.f201303a = null;
        this.f201304b = vVar;
        this.f201305c = 3;
        Object objF = oVar3.f(xVar, Locale.getDefault(), this);
        if (objF != aVar) {
            vVar2 = vVar;
            obj = objF;
            s92.g gVar2 = (s92.g) obj;
            if (vVar2 != null) {
                y0Var.m(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            } else {
                y0Var.m(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
