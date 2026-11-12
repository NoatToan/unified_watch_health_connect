package com.garmin.android.library.mobileauth.ui.mfa;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;
import ze2.l;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.android.library.mobileauth.ui.mfa.AbstractMFAFlowActivity$useITLoginToken$2", f = "AbstractMFAFlowActivity.kt", l = {363}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f50533b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f50533b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f50533b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        a aVar = this.f50533b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f50532a;
        if (i14 == 0) {
            r.b(obj);
            try {
                a.C1007a.EnumC1008a enumC1008a = a.C1007a.EnumC1008a.f50506c;
                int i15 = a.A;
                aVar.da(enumC1008a);
            } catch (Exception e4) {
                l lVar = l.EXCEPTION;
                String message = e4.getMessage();
                this.f50532a = 1;
                if (aVar.ga("useITLoginToken", lVar, message, this) == aVar2) {
                    return aVar2;
                }
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
