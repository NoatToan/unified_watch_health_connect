package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.ProductImprovementConsentViewModel$grantRevokeFeature$1", f = "ProductImprovementConsentViewModel.kt", l = {75, 76}, m = "invokeSuspend", v = 2)
public final class y2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y0<fw.m<Boolean>> f201324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q92.y f201325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.consent.f f201326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f201327e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f201328a;

        static {
            int[] iArr = new int[q92.y.values().length];
            try {
                iArr[q92.y.OPT_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q92.y.OPT_OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f201328a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(androidx.lifecycle.y0<fw.m<Boolean>> y0Var, q92.y yVar, com.garmin.android.apps.connectmobile.consent.f fVar, s92.g gVar, t13.d<? super y2> dVar) {
        super(2, dVar);
        this.f201324b = y0Var;
        this.f201325c = yVar;
        this.f201326d = fVar;
        this.f201327e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y2(this.f201324b, this.f201325c, this.f201326d, this.f201327e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r10 == r0) goto L32;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        q92.v vVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201323a;
        androidx.lifecycle.y0<fw.m<Boolean>> y0Var = this.f201324b;
        if (i14 == 0) {
            o13.r.b(obj);
            y0Var.m(fw.m.a.f(fw.m.f73767e, null, null, 3));
            int i15 = a.f201328a[this.f201325c.ordinal()];
            s92.g gVar = this.f201327e;
            com.garmin.android.apps.connectmobile.consent.f fVar = this.f201326d;
            if (i15 == 1) {
                this.f201323a = 1;
                fVar.getClass();
                q92.x xVar = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
                hl.a aVar2 = fVar.f32284a;
                if (aVar2 instanceof hl.a.b) {
                    obj = p92.o.f136619a.q(xVar, gVar, new s92.l(String.valueOf(((hl.a.b) aVar2).f84252b)), this);
                } else {
                    if (!p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
                        lc.u0.r();
                        return null;
                    }
                    obj = p92.o.f136619a.p(xVar, gVar, this);
                }
            } else {
                if (i15 != 2) {
                    lc.u0.r();
                    return null;
                }
                this.f201323a = 2;
                fVar.getClass();
                q92.x xVar2 = q92.x.DI_CONNECT_PRODUCT_IMPROVEMENT_DATA_USAGE;
                hl.a aVar3 = fVar.f32284a;
                if (aVar3 instanceof hl.a.b) {
                    obj = p92.o.f136619a.v(xVar2, gVar, new s92.l(String.valueOf(((hl.a.b) aVar3).f84252b)), this);
                } else {
                    if (!p005kotlin.jvm.internal.s.g(aVar3, hl.a.c.f84256b)) {
                        lc.u0.r();
                        return null;
                    }
                    obj = p92.o.f136619a.u(xVar2, gVar, this);
                }
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            vVar = (q92.v) obj;
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            vVar = (q92.v) obj;
        }
        if (vVar != null) {
            y0Var.m(fw.m.a.g(fw.m.f73767e, Boolean.TRUE, 1));
        } else {
            y0Var.m(fw.m.a.b(fw.m.f73767e, new fw.r(), null, 5));
        }
        return Unit.INSTANCE;
    }
}
