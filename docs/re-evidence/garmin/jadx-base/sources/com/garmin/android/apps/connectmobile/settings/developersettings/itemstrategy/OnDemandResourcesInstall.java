package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import c22.d2;
import c22.h1;
import c22.u0;
import d53.w;
import d53.y;
import e23.p;
import e23.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.p0;
import p13.h0;
import p13.x;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000b2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00130\u00152\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/OnDemandResourcesInstall;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "", "getSummary", "()Ljava/lang/String;", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "Lc22/d2;", "getInstaller", "()Lc22/d2;", "installer", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OnDemandResourcesInstall implements IDeveloperItemStrategy, KoinComponent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1", f = "OnDemandResourcesInstall.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ d2 $installer;
        final /* synthetic */ mg1.a $modelItem;
        final /* synthetic */ e23.a<Unit> $notifyChange;
        final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
        int label;
        final /* synthetic */ OnDemandResourcesInstall this$0;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$1$1", f = "OnDemandResourcesInstall.kt", l = {49}, m = "invokeSuspend", v = 2)
        public static final class C07931 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            final /* synthetic */ d2 $installer;
            final /* synthetic */ mg1.a $modelItem;
            final /* synthetic */ List<u0> $notInstalledYetTags;
            final /* synthetic */ e23.a<Unit> $notifyChange;
            final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
            int label;
            final /* synthetic */ OnDemandResourcesInstall this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07931(e23.l<? super Boolean, Unit> lVar, mg1.a aVar, OnDemandResourcesInstall onDemandResourcesInstall, e23.a<Unit> aVar2, Context context, List<? extends u0> list, d2 d2Var, t13.d<? super C07931> dVar) {
                super(2, dVar);
                this.$showProgress = lVar;
                this.$modelItem = aVar;
                this.this$0 = onDemandResourcesInstall;
                this.$notifyChange = aVar2;
                this.$context = context;
                this.$notInstalledYetTags = list;
                this.$installer = d2Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C07931(this.$showProgress, this.$modelItem, this.this$0, this.$notifyChange, this.$context, this.$notInstalledYetTags, this.$installer, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C07931) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    r.b(obj);
                    this.$showProgress.invoke(Boolean.TRUE);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    OnDemandResourcesInstall$handleClick$1$1$success$1 onDemandResourcesInstall$handleClick$1$1$success$1 = new OnDemandResourcesInstall$handleClick$1$1$success$1(this.$notInstalledYetTags, this.$installer, null);
                    this.label = 1;
                    obj = ge1.b.e0(bVar, onDemandResourcesInstall$handleClick$1$1$success$1, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    this.$modelItem.f118373c = this.this$0.getSummary();
                    this.$notifyChange.invoke();
                    Toast.makeText(this.$context, "On Demand Resources Installed Successfully", 1).show();
                } else {
                    Toast.makeText(this.$context, "On Demand Resources Install Failed", 1).show();
                }
                this.$showProgress.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(d2 d2Var, e23.l<? super Boolean, Unit> lVar, mg1.a aVar, OnDemandResourcesInstall onDemandResourcesInstall, e23.a<Unit> aVar2, Context context, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$installer = d2Var;
            this.$showProgress = lVar;
            this.$modelItem = aVar;
            this.this$0 = onDemandResourcesInstall;
            this.$notifyChange = aVar2;
            this.$context = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$installer, this.$showProgress, this.$modelItem, this.this$0, this.$notifyChange, this.$context, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            w13.c cVar = u0.f23285k;
            d2 d2Var = this.$installer;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (!((h1) d2Var).a((u0) next)) {
                    arrayListK.add(next);
                }
            }
            if (!arrayListK.isEmpty()) {
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(c0.a(o.f168762a), null, null, new C07931(this.$showProgress, this.$modelItem, this.this$0, this.$notifyChange, this.$context, arrayListK, this.$installer, null), 3);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final d2 getInstaller() {
        return (d2) (this instanceof KoinScopeComponent ? ((KoinScopeComponent) this).getScope() : getKoin().getScopeRegistry().getRootScope()).get((k23.d<?>) p005kotlin.jvm.internal.s0.f105811a.b(d2.class), (Qualifier) null, (e23.a<? extends ParametersHolder>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getSummary() {
        return "Installed? ".concat(h0.k0(u0.f23285k, null, null, null, new l(this, 0), 31));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence getSummary$lambda$0(OnDemandResourcesInstall onDemandResourcesInstall, u0 u0Var) {
        u0Var.getClass();
        return y.s0(3, w.g0(u0Var.name(), "_")).concat(onDemandResourcesInstall.getInstaller().a(u0Var) ? ": Y" : ": N");
    }

    private static final androidx.appcompat.app.e.a handleClick$bindAction(androidx.appcompat.app.e.a aVar, q<? super androidx.appcompat.app.e.a, ? super CharSequence, ? super DialogInterface.OnClickListener, ? extends androidx.appcompat.app.e.a> qVar, o13.p<String, ? extends e23.l<? super t13.d<? super Unit>, ? extends Object>> pVar) {
        return qVar.invoke(aVar, pVar.f128594a, new ai1.a(pVar, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$bindAction$lambda$1(o13.p pVar, DialogInterface dialogInterface, int i14) {
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(o.f168762a), null, null, new OnDemandResourcesInstall$handleClick$bindAction$1$1(pVar, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.ON_DEMAND_RESOURCES;
        return new mg1.a(dVar.f112244a, dVar.f112245b, getSummary(), false, false, 24, null);
    }

    @Override // org.koin.core.component.KoinComponent
    public /* bridge */ Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        notifyChange.getClass();
        showProgress.getClass();
        modelItem.getClass();
        Context applicationContext = view2.getContext().getApplicationContext();
        d2 installer = getInstaller();
        if (installer instanceof h1) {
            x53.c cVar = s0.f129406a;
            ge1.b.T(c0.a(o.f168762a), null, null, new AnonymousClass1(installer, showProgress, modelItem, this, notifyChange, applicationContext, null), 3);
            return;
        }
        if (!(installer instanceof c22.w)) {
            Toast.makeText(applicationContext, "Unhandled installer: " + p005kotlin.jvm.internal.s0.f105811a.b(installer.getClass()).D(), 1).show();
            Unit unit = Unit.INSTANCE;
            return;
        }
        w13.c cVar2 = u0.f23285k;
        ArrayList arrayList = new ArrayList(p13.y.r(cVar2, 10));
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            u0 u0Var = (u0) bVar.next();
            arrayList.add(new o13.p(u0Var, u0Var.name()));
        }
        p0 p0Var = new p0();
        List listK = x.k(new o13.p("Check Installation Status", new OnDemandResourcesInstall$handleClick$actions$1(arrayList, p0Var, installer, view2, null)), new o13.p("Install", new OnDemandResourcesInstall$handleClick$actions$2(arrayList, p0Var, showProgress, installer, view2, modelItem, this, notifyChange, null)), new o13.p("Clear All", new OnDemandResourcesInstall$handleClick$actions$3(installer, modelItem, this, notifyChange, null)));
        androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(view2.getContext()).setTitle("OnDemandResources Installation Menu");
        title.getClass();
        androidx.appcompat.app.e.a aVarHandleClick$bindAction = handleClick$bindAction(handleClick$bindAction(handleClick$bindAction(title, AnonymousClass2.INSTANCE, (o13.p) listK.get(0)), AnonymousClass3.INSTANCE, (o13.p) listK.get(1)), AnonymousClass4.INSTANCE, (o13.p) listK.get(2));
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((o13.p) it.next()).f128595b);
        }
        aVarHandleClick$bindAction.setSingleChoiceItems((CharSequence[]) arrayList2.toArray(new String[0]), p0Var.f105807a, new ai1.a(p0Var, 19)).show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass2 extends p005kotlin.jvm.internal.q implements q<androidx.appcompat.app.e.a, CharSequence, DialogInterface.OnClickListener, androidx.appcompat.app.e.a> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(3, androidx.appcompat.app.e.a.class, "setPositiveButton", "setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;", 0);
        }

        @Override // e23.q
        public final androidx.appcompat.app.e.a invoke(androidx.appcompat.app.e.a aVar, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            aVar.getClass();
            return aVar.setPositiveButton(charSequence, onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass3 extends p005kotlin.jvm.internal.q implements q<androidx.appcompat.app.e.a, CharSequence, DialogInterface.OnClickListener, androidx.appcompat.app.e.a> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(3, androidx.appcompat.app.e.a.class, "setNeutralButton", "setNeutralButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;", 0);
        }

        @Override // e23.q
        public final androidx.appcompat.app.e.a invoke(androidx.appcompat.app.e.a aVar, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            aVar.getClass();
            return aVar.setNeutralButton(charSequence, onClickListener);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.OnDemandResourcesInstall$handleClick$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass4 extends p005kotlin.jvm.internal.q implements q<androidx.appcompat.app.e.a, CharSequence, DialogInterface.OnClickListener, androidx.appcompat.app.e.a> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(3, androidx.appcompat.app.e.a.class, "setNegativeButton", "setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/AlertDialog$Builder;", 0);
        }

        @Override // e23.q
        public final androidx.appcompat.app.e.a invoke(androidx.appcompat.app.e.a aVar, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            aVar.getClass();
            return aVar.setNegativeButton(charSequence, onClickListener);
        }
    }
}
