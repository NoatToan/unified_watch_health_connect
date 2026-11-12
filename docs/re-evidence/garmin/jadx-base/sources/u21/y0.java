package u21;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.p2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.setup.viewmodel.NutritionSetupViewModel$onRevokeMFPConsent$1", f = "NutritionSetupViewModel.kt", l = {111, 118}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f168189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f168190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f168191c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(u0 u0Var, t13.d<? super y0> dVar) {
        super(2, dVar);
        this.f168191c = u0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        y0 y0Var = new y0(this.f168191c, dVar);
        y0Var.f168190b = obj;
        return y0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00da, code lost:
    
        if (r1 == r2) goto L21;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object objU;
        Object value3;
        Object objA;
        Object value4;
        o53.b0 b0Var = (o53.b0) this.f168190b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f168189a;
        u0 u0Var = this.f168191c;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                objU = obj;
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
                objA = obj;
            }
            f12.l.f68084a.getClass();
            f12.l.a.a().p4(((x01.e) objA).f188254c == x01.f.ACTIVE);
            a2 a2Var = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "NutritionSetupViewModel", "onRevokeMFPConsent: successfully revoked consent and unlinked MFP");
            p2 p2Var = u0Var.f168164o;
            do {
                value4 = p2Var.getValue();
            } while (!p2Var.b(value4, s21.a0.a((s21.a0) value4, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, true, false, null, null, null, null, 0, -150994945, 3)));
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        b2 b2Var = u0Var.f168165p;
        p2 p2Var2 = u0Var.f168164o;
        s21.c0 c0Var = ((s21.a0) b2Var.f150540a.getValue()).f156038c;
        do {
            value = p2Var2.getValue();
        } while (!p2Var2.b(value, s21.a0.a((s21.a0) value, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, null, false, false, null, null, null, null, 0, -16777217, 3)));
        if (c0Var != null) {
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_MYFITNESSPAL;
            s92.g gVar = new s92.g(c0Var.f156084a, c0Var.f156086c, c0Var.f156085b, null, null, null, null, null, null, null, null, null, p13.h0.b1(c0Var.f156087d), null, null, null, null);
            this.f168190b = b0Var;
            this.f168189a = 1;
            objU = oVar.u(xVar, gVar, this);
            if (objU != aVar) {
            }
            return aVar;
        }
        a2 a2Var2 = a2.NUTRITION;
        i2.f36769a.getClass();
        i2.a.b(a2Var2, "NutritionSetupViewModel", "onRevokeMFPConsent: consent text is null, cannot revoke consent");
        do {
            value2 = p2Var2.getValue();
        } while (!p2Var2.b(value2, s21.a0.a((s21.a0) value2, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, 0, -50331649, 3)));
        return Unit.INSTANCE;
        if (((q92.v) objU) != null) {
            x01.i iVar = u0Var.f168152c;
            this.f168190b = b0Var;
            this.f168189a = 2;
            objA = iVar.a(false, this);
        } else {
            a2 a2Var3 = a2.NUTRITION;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "NutritionSetupViewModel", "onRevokeMFPConsent: failed to revoke consent");
            p2 p2Var3 = u0Var.f168164o;
            do {
                value3 = p2Var3.getValue();
            } while (!p2Var3.b(value3, s21.a0.a((s21.a0) value3, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, null, false, false, null, null, null, null, 0, -50331649, 3)));
        }
        return Unit.INSTANCE;
    }
}
