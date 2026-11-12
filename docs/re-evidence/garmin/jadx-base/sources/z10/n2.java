package z10;

import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.consent.PrivacyPolicyConsentViewModel$getPrivacyPolicyConsent$1", f = "PrivacyPolicyConsentViewModel.kt", l = {34, 35, 37}, m = "invokeSuspend", v = 2)
public final class n2 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q92.v f201174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f201175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p2 f201176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl.a f201177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q92.x f201178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(p2 p2Var, hl.a aVar, q92.x xVar, t13.d<? super n2> dVar) {
        super(2, dVar);
        this.f201176c = p2Var;
        this.f201177d = aVar;
        this.f201178e = xVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n2(this.f201176c, this.f201177d, this.f201178e, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00b6  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r15 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        if (r15 == r0) goto L30;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        q92.v vVar;
        q92.v vVar2;
        r53.p2 p2Var;
        Object value2;
        Object value3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f201175b;
        q92.x xVar = this.f201178e;
        p2 p2Var2 = this.f201176c;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.p2 p2Var3 = p2Var2.f201203a;
            do {
                value = p2Var3.getValue();
            } while (!p2Var3.b(value, q2.a((q2) value, true, null, false, null, null, 30)));
            hl.a.c cVar = hl.a.c.f84256b;
            hl.a aVar2 = this.f201177d;
            if (p005kotlin.jvm.internal.s.g(aVar2, cVar)) {
                p92.o oVar = p92.o.f136619a;
                this.f201175b = 1;
                obj = oVar.c(xVar, this);
            } else {
                if (!(aVar2 instanceof hl.a.b)) {
                    lc.u0.r();
                    return null;
                }
                p92.o oVar2 = p92.o.f136619a;
                s92.l lVar = new s92.l(String.valueOf(((hl.a.b) aVar2).f84252b));
                this.f201175b = 2;
                obj = oVar2.k(xVar, lVar, this);
            }
            return aVar;
        }
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
            vVar2 = this.f201174a;
            o13.r.b(obj);
        }
        s92.g gVar = (s92.g) obj;
        if (vVar2 != null || gVar == null) {
            p2Var = p2Var2.f201203a;
            do {
                value2 = p2Var.getValue();
            } while (!p2Var.b(value2, q2.a((q2) value2, false, null, false, null, Boolean.TRUE, 6)));
        } else {
            r53.p2 p2Var4 = p2Var2.f201203a;
            do {
                value3 = p2Var4.getValue();
            } while (!p2Var4.b(value3, q2.a((q2) value3, false, null, vVar2.b(), gVar, Boolean.FALSE, 2)));
        }
        return Unit.INSTANCE;
        p92.o oVar3 = p92.o.f136619a;
        this.f201174a = vVar;
        this.f201175b = 3;
        Object objF = oVar3.f(xVar, Locale.getDefault(), this);
        if (objF != aVar) {
            vVar2 = vVar;
            obj = objF;
            s92.g gVar2 = (s92.g) obj;
            if (vVar2 != null) {
                p2Var = p2Var2.f201203a;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, q2.a((q2) value2, false, null, false, null, Boolean.TRUE, 6)));
            } else {
                p2Var = p2Var2.f201203a;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, q2.a((q2) value2, false, null, false, null, Boolean.TRUE, 6)));
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
