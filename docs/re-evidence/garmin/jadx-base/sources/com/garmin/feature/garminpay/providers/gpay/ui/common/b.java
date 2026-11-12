package com.garmin.feature.garminpay.providers.gpay.ui.common;

import e23.p;
import ms2.g;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps2.w;
import t13.d;
import v13.e;
import v13.i;
import vb.h;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPaySetupRecoveryViewModel$retrySetup$1", f = "NewFitPaySetupRecoveryViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f51581b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f51581b = aVar;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new b(this.f51581b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f51580a;
        a aVar2 = this.f51581b;
        if (i14 == 0) {
            r.b(obj);
            g gVarA = w.f140538a.a(is2.b.FITPAY);
            z0 z0Var = gVarA instanceof z0 ? (z0) gVarA : null;
            if (z0Var == null) {
                aVar2.f51574a.error("retrySetup: NewFitPayServiceProvider not found.");
                aVar2.f51575b.j(a.EnumC1069a.SETUP_FAILED);
                return Unit.INSTANCE;
            }
            this.f51580a = 1;
            obj = z0Var.r(false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            aVar2.f51574a.debug("retrySetup: setup complete");
            aVar2.f51575b.j(a.EnumC1069a.SETUP_COMPLETE);
        } else {
            aq2.b.f12463a.getClass();
            if (aq2.b.f12464b) {
                aVar2.f51574a.debug("retrySetup: fitPay API is under maintenance");
                aVar2.f51575b.j(a.EnumC1069a.UNDER_MAINTENANCE);
            } else {
                aVar2.f51574a.debug("retrySetup: setup failed");
                aVar2.f51575b.j(a.EnumC1069a.SETUP_FAILED);
            }
        }
        return Unit.INSTANCE;
    }
}
