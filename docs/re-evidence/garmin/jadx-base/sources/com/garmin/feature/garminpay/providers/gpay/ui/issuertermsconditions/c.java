package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import ds.e0;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import zn2.g1;
import zn2.z;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.FitPayIssuerTermsConditionViewModel$acceptTermsAndConditions$1", f = "FitPayIssuerTermsConditionViewModel.kt", l = {194, 197, 216, 222}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f51640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f51641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp2.a f51642d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51643a;

        static {
            int[] iArr = new int[z.values().length];
            try {
                iArr[z.CREDIT_CARD_NOT_ELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[z.CREDIT_CARD_PROVISION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[z.CREDIT_CARD_ISSUER_PROVISIONING_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f51643a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, dp2.a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f51640b = bVar;
        this.f51641c = str;
        this.f51642d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f51640b, this.f51641c, this.f51642d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005d, code lost:
    
        if (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.y4(r6) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.z4(r6, r8) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00de, code lost:
    
        if (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.z4(r6, r8) == r0) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51639a;
        b bVar = this.f51640b;
        try {
            if (i14 == 0) {
                r.b(obj);
                b.f51610n.debug("acceptTermsAndConditions");
                bVar.getClass();
                g1 g1Var = bVar.A4().f205979a;
                String str = this.f51641c;
                dp2.a aVar2 = this.f51642d;
                this.f51639a = 1;
                if (g1Var.a(str, aVar2, this) == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else if (i14 == 2) {
                r.b(obj);
            } else if (i14 == 3) {
                r.b(obj);
                bVar.f51613c.j(b.EnumC1070b.FAILED_TO_ACCEPT_TERMS_NO_FURTHER_ACTION);
            } else {
                if (i14 != 4) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                bVar.f51613c.j(b.EnumC1070b.FAILED_TO_ACCEPT_TERMS_NO_FURTHER_ACTION);
            }
            return Unit.INSTANCE;
            b.f51610n.debug("acceptTermsAndConditions: terms and condition accepted successfully");
            this.f51639a = 2;
        } catch (Exception e4) {
            if (e4 instanceof NewFitPayException) {
                NewFitPayException newFitPayException = (NewFitPayException) e4;
                int i15 = a.f51643a[newFitPayException.getErrorFlag().ordinal()];
                if (i15 == 1) {
                    e0.v("acceptTermsAndConditions: failed to accept terms & condition, error flag: ", newFitPayException.getErrorFlag().name(), b.f51610n);
                    bVar.f51613c.j(b.EnumC1070b.CARD_NOT_ELIGIBLE);
                } else if (i15 == 2) {
                    e0.v("acceptTermsAndConditions: failed to accept terms & condition, error flag: ", newFitPayException.getErrorFlag().name(), b.f51610n);
                    bVar.f51613c.j(b.EnumC1070b.CARD_PROVISION_FAILED);
                } else if (i15 != 3) {
                    b.f51610n.error("acceptTermsAndConditions: failed to accept issuer terms", (Throwable) e4);
                    this.f51639a = 3;
                } else {
                    b.f51610n.warn("acceptTermsAndConditions: card issuer is slow, try again later");
                    bVar.f51613c.j(b.EnumC1070b.FAILED_TO_ACCEPT_TERMS_NO_FURTHER_ACTION);
                }
            } else {
                e0.v("acceptTermsAndConditions: Exception: ", e4.getMessage(), b.f51610n);
                this.f51639a = 4;
            }
            return aVar;
        }
    }
}
