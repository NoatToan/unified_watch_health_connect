package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.view.View;
import android.widget.Toast;
import c22.d2;
import c22.u0;
import c22.w;
import java.util.List;
import o13.p;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$actions$2", f = "OnDemandResourcesInstall.kt", l = {82}, m = "invokeSuspend", v = 2)
public final class OnDemandResourcesInstall$handleClick$actions$2 extends v13.i implements e23.l<t13.d<? super Unit>, Object> {
    final /* synthetic */ List<p<u0, String>> $featureTagOptions;
    final /* synthetic */ d2 $installer;
    final /* synthetic */ mg1.a $modelItem;
    final /* synthetic */ e23.a<Unit> $notifyChange;
    final /* synthetic */ p0 $selectedTagOptionPos;
    final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
    final /* synthetic */ View $view;
    Object L$0;
    int label;
    final /* synthetic */ OnDemandResourcesInstall this$0;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$actions$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Z"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$actions$2$1", f = "OnDemandResourcesInstall.kt", l = {82}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends v13.i implements e23.p<b0, t13.d<? super Boolean>, Object> {
        final /* synthetic */ d2 $installer;
        final /* synthetic */ u0 $tag;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(d2 d2Var, u0 u0Var, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$installer = d2Var;
            this.$tag = u0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$installer, this.$tag, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            w wVar = (w) this.$installer;
            u0 u0Var = this.$tag;
            this.label = 1;
            Object objC = wVar.f23304a.c(u0Var, this);
            return objC == aVar ? aVar : objC;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OnDemandResourcesInstall$handleClick$actions$2(List<? extends p<? extends u0, String>> list, p0 p0Var, e23.l<? super Boolean, Unit> lVar, d2 d2Var, View view2, mg1.a aVar, OnDemandResourcesInstall onDemandResourcesInstall, e23.a<Unit> aVar2, t13.d<? super OnDemandResourcesInstall$handleClick$actions$2> dVar) {
        super(1, dVar);
        this.$featureTagOptions = list;
        this.$selectedTagOptionPos = p0Var;
        this.$showProgress = lVar;
        this.$installer = d2Var;
        this.$view = view2;
        this.$modelItem = aVar;
        this.this$0 = onDemandResourcesInstall;
        this.$notifyChange = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new OnDemandResourcesInstall$handleClick$actions$2(this.$featureTagOptions, this.$selectedTagOptionPos, this.$showProgress, this.$installer, this.$view, this.$modelItem, this.this$0, this.$notifyChange, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super Unit> dVar) {
        return ((OnDemandResourcesInstall$handleClick$actions$2) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u0 u0Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.label;
        if (i14 == 0) {
            r.b(obj);
            u0 u0Var2 = this.$featureTagOptions.get(this.$selectedTagOptionPos.f105807a).f128594a;
            this.$showProgress.invoke(Boolean.TRUE);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$installer, u0Var2, null);
            this.L$0 = u0Var2;
            this.label = 1;
            Object objE0 = ge1.b.e0(bVar, anonymousClass1, this);
            if (objE0 == aVar) {
                return aVar;
            }
            u0Var = u0Var2;
            obj = objE0;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u0Var = (u0) this.L$0;
            r.b(obj);
        }
        View view2 = this.$view;
        mg1.a aVar2 = this.$modelItem;
        OnDemandResourcesInstall onDemandResourcesInstall = this.this$0;
        e23.a<Unit> aVar3 = this.$notifyChange;
        if (((Boolean) obj).booleanValue()) {
            Toast.makeText(view2.getContext(), "'" + u0Var + "' Installed Successfully", 1).show();
            aVar2.f118373c = onDemandResourcesInstall.getSummary();
            aVar3.invoke();
        } else {
            Toast.makeText(view2.getContext(), "'" + u0Var + "' Install Failed", 1).show();
        }
        this.$showProgress.invoke(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
