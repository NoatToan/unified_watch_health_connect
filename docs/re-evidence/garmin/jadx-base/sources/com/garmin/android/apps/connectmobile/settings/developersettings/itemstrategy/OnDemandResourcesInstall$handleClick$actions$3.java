package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import c22.d2;
import c22.w;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$actions$3", f = "OnDemandResourcesInstall.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class OnDemandResourcesInstall$handleClick$actions$3 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
    final /* synthetic */ d2 $installer;
    final /* synthetic */ mg1.a $modelItem;
    final /* synthetic */ e23.a<Unit> $notifyChange;
    int label;
    final /* synthetic */ OnDemandResourcesInstall this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnDemandResourcesInstall$handleClick$actions$3(d2 d2Var, mg1.a aVar, OnDemandResourcesInstall onDemandResourcesInstall, e23.a<Unit> aVar2, t13.d<? super OnDemandResourcesInstall$handleClick$actions$3> dVar) {
        super(1, dVar);
        this.$installer = d2Var;
        this.$modelItem = aVar;
        this.this$0 = onDemandResourcesInstall;
        this.$notifyChange = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new OnDemandResourcesInstall$handleClick$actions$3(this.$installer, this.$modelItem, this.this$0, this.$notifyChange, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((OnDemandResourcesInstall$handleClick$actions$3) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            w wVar = (w) this.$installer;
            this.label = 1;
            Object objA = wVar.f23304a.a(this);
            if (objA != aVar) {
                objA = Unit.INSTANCE;
            }
            if (objA == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        this.$modelItem.f118373c = this.this$0.getSummary();
        this.$notifyChange.invoke();
        return Unit.INSTANCE;
    }
}
