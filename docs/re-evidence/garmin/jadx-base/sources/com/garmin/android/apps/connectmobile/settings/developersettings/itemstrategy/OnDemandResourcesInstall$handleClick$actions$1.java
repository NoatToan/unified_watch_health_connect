package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.view.View;
import android.widget.Toast;
import c22.d2;
import c22.u0;
import c22.w;
import java.util.List;
import o13.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$actions$1", f = "OnDemandResourcesInstall.kt", l = {}, m = "invokeSuspend", v = 2)
public final class OnDemandResourcesInstall$handleClick$actions$1 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
    final /* synthetic */ List<p<u0, String>> $featureTagOptions;
    final /* synthetic */ d2 $installer;
    final /* synthetic */ p0 $selectedTagOptionPos;
    final /* synthetic */ View $view;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandResourcesInstall$handleClick$actions$1(List<? extends p<? extends u0, String>> list, p0 p0Var, d2 d2Var, View view2, t13.d<? super OnDemandResourcesInstall$handleClick$actions$1> dVar) {
        super(1, dVar);
        this.$featureTagOptions = list;
        this.$selectedTagOptionPos = p0Var;
        this.$installer = d2Var;
        this.$view = view2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new OnDemandResourcesInstall$handleClick$actions$1(this.$featureTagOptions, this.$selectedTagOptionPos, this.$installer, this.$view, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((OnDemandResourcesInstall$handleClick$actions$1) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        u0 u0Var = this.$featureTagOptions.get(this.$selectedTagOptionPos.f105807a).f128594a;
        boolean zA = ((w) this.$installer).a(u0Var);
        View view2 = this.$view;
        if (zA) {
            Toast.makeText(view2.getContext(), "'" + u0Var + "' Is Installed", 1).show();
        } else {
            Toast.makeText(view2.getContext(), "'" + u0Var + "' Is Not Installed", 1).show();
        }
        return Unit.INSTANCE;
    }
}
