package qp2;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import e23.p;
import fo2.h0;
import fo2.u;
import ms2.g;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;
import v13.i;
import vb.h;
import zn2.g1;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.FitPayTermsAndConditionsViewModel$createFitpayUserOrAcceptTermsAndConditions$2", f = "FitPayTermsAndConditionsViewModel.kt", l = {102, 106, 107}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f146032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f146033b;

    public c(t13.d<? super c> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return new c(dVar).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r9 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009b, code lost:
    
        if (r9 == r0) goto L38;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws NewFitPayException {
        z0 z0Var;
        fo2.p consent;
        String link;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f146033b;
        if (i14 == 0) {
            r.b(obj);
            g gVarA = w.f140538a.a(is2.b.FITPAY);
            z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
            if (z0Var == null) {
                throw new NewFitPayException("fitPay service provider not found, can not create the user", null, null, 6, null);
            }
            g1 g1Var = z0Var.f205979a;
            if (!(g1Var.s() instanceof sn2.a.C3030a)) {
                this.f146032a = null;
                this.f146033b = 1;
                obj = g1Var.m(false, this);
            } else if (!g1Var.W()) {
                this.f146032a = z0Var;
                this.f146033b = 2;
                obj = g1Var.Q(false, this);
                if (obj != aVar) {
                    consent = ((u) obj).getLinks().getConsent();
                    if (consent != null) {
                    }
                    throw new NewFitPayException("No consent link in user data", null, null, 6, null);
                }
            }
            return aVar;
        }
        if (i14 != 1) {
            if (i14 == 2) {
                z0Var = this.f146032a;
                r.b(obj);
                consent = ((u) obj).getLinks().getConsent();
                if (consent != null || (link = consent.getLink()) == null) {
                    throw new NewFitPayException("No consent link in user data", null, null, 6, null);
                }
                g1 g1Var2 = z0Var.f205979a;
                h0 h0Var = new h0("0.0.1");
                this.f146032a = null;
                this.f146033b = 3;
                obj = g1Var2.b(link, h0Var, this);
            } else {
                if (i14 != 3) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            ((Boolean) obj).getClass();
        } else {
            r.b(obj);
            if (!((Boolean) obj).booleanValue()) {
                throw new NewFitPayException("Create Fitpay user failed", null, null, 6, null);
            }
        }
        return Unit.INSTANCE;
    }
}
