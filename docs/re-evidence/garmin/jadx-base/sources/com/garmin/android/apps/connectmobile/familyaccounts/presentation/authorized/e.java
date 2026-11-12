package com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.familyaccounts.presentation.authorized.AuthorizedViewerDetailViewModel$generateViewOnlyUri$1", f = "AuthorizedViewerDetailViewModel.kt", l = {149}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f35062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f35064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(2, dVar2);
        this.f35064c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f35064c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p2 p2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f35063b;
        if (i14 == 0) {
            r.b(obj);
            d dVar = this.f35064c;
            p2 p2Var2 = dVar.f35040f;
            d.a aVar2 = dVar.f35035a;
            te0.e eVar = dVar.f35037c;
            String strValueOf = String.valueOf(aVar2.f35044b);
            boolean z14 = aVar2.f35049g == AuthorizedViewerDetailActivity.b.ManagedAccount;
            this.f35062a = p2Var2;
            this.f35063b = 1;
            obj = eVar.a(strValueOf, z14, this);
            if (obj == aVar) {
                return aVar;
            }
            p2Var = p2Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p2Var = this.f35062a;
            r.b(obj);
        }
        p2Var.setValue(obj);
        return Unit.INSTANCE;
    }
}
