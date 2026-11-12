package z10;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentViewModel$grantConsent$1", f = "PrivacyPolicyConsentViewModel.kt", l = {49, 50, 55, 56}, m = "invokeSuspend", v = 2)
public final class o2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f201189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p2 f201190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hl.a f201191c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q92.x f201192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s92.g f201193e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(p2 p2Var, hl.a aVar, q92.x xVar, s92.g gVar, t13.d<? super o2> dVar) {
        super(2, dVar);
        this.f201190b = p2Var;
        this.f201191c = aVar;
        this.f201192d = xVar;
        this.f201193e = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o2(this.f201190b, this.f201191c, this.f201192d, this.f201193e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
    
        if (r2.h(r17) == r1) goto L38;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objQ;
        Object objP;
        q92.v vVar;
        Object value2;
        r53.p2 p2Var;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201189a;
        hl.a aVar2 = this.f201191c;
        p2 p2Var2 = this.f201190b;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var3 = p2Var2.f201203a;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, q2.a((q2) value, true, null, false, null, null, 30)));
            boolean zG = p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b);
            s92.g gVar = this.f201193e;
            q92.x xVar = this.f201192d;
            if (zG) {
                p92.o oVar = p92.o.f136619a;
                this.f201189a = 1;
                objP = oVar.p(xVar, gVar, this);
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    lc.u0.r();
                    return null;
                }
                p92.o oVar2 = p92.o.f136619a;
                s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar2).f84252b));
                this.f201189a = 2;
                objQ = oVar2.q(xVar, gVar, lVar, this);
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
            objP = obj;
            vVar = (q92.v) objP;
        } else if (i14 == 2) {
            o13.r.b(obj);
            objQ = obj;
            vVar = (q92.v) objQ;
        } else if (i14 == 3) {
            o13.r.b(obj);
            p92.o oVar3 = p92.o.f136619a;
            this.f201189a = 4;
        } else {
            if (i14 != 4) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        p2Var = p2Var2.f201203a;
        do {
            value3 = p2Var.getValue();
        } while (!p2Var.b(value3, q2.a((q2) value3, false, Boolean.TRUE, false, null, Boolean.FALSE, 12)));
        return Unit.INSTANCE;
        if (vVar != null) {
            if (p005kotlin.jvm.internal.s.g(aVar2, hl.a.c.f84256b)) {
                p92.o oVar4 = p92.o.f136619a;
                q92.x xVar2 = q92.x.DI_CONNECT_UPLOAD;
                this.f201189a = 3;
                if (oVar4.c(xVar2, this) != aVar) {
                    p92.o oVar5 = p92.o.f136619a;
                    this.f201189a = 4;
                }
                return aVar;
            }
            p2Var = p2Var2.f201203a;
            do {
                value3 = p2Var.getValue();
            } while (!p2Var.b(value3, q2.a((q2) value3, false, Boolean.TRUE, false, null, Boolean.FALSE, 12)));
        } else {
            r53.p2 p2Var4 = p2Var2.f201203a;
            do {
                value2 = p2Var4.getValue();
            } while (!p2Var4.b(value2, q2.a((q2) value2, false, Boolean.FALSE, false, null, Boolean.TRUE, 12)));
        }
        return Unit.INSTANCE;
    }
}
