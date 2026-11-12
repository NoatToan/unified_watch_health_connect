package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$bindAction$1$1", f = "OnDemandResourcesInstall.kt", l = {107}, m = "invokeSuspend", v = 2)
public final class OnDemandResourcesInstall$handleClick$bindAction$1$1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
    final /* synthetic */ o13.p<String, e23.l<t13.d<? super Unit>, Object>> $action;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandResourcesInstall$handleClick$bindAction$1$1(o13.p<String, ? extends e23.l<? super t13.d<? super Unit>, ? extends Object>> pVar, t13.d<? super OnDemandResourcesInstall$handleClick$bindAction$1$1> dVar) {
        super(2, dVar);
        this.$action = pVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new OnDemandResourcesInstall$handleClick$bindAction$1$1(this.$action, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((OnDemandResourcesInstall$handleClick$bindAction$1$1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            e23.l<t13.d<? super Unit>, Object> lVar = this.$action.f128595b;
            this.label = 1;
            if (lVar.invoke(this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
