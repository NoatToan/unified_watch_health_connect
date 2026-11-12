package com.garmin.android.apps.connectmobile.userprofile.presentation.privacy;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.userprofile.presentation.privacy.ActivitiesPrivacyViewModel$dismissPendingRequestMessage$1", f = "ActivitiesPrivacyViewModel.kt", l = {169}, m = "invokeSuspend", v = 2)
public final class d extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f47178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f47178b = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f47178b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f47177a;
        if (i14 == 0) {
            r.b(obj);
            p2 p2Var = this.f47178b.f47151e;
            b.a aVarA = b.a.a((b.a) p2Var.getValue(), false, false, 13);
            this.f47177a = 1;
            p2Var.k(null, aVarA);
            if (Unit.INSTANCE == aVar) {
                return aVar;
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
