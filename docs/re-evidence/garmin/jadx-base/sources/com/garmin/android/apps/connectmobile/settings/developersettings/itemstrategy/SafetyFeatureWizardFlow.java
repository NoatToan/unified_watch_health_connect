package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.SafetyFeatureSetupWizardActivity;
import e23.p;
import java.util.Locale;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.o;
import q92.x;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00072\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/SafetyFeatureWizardFlow;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "Landroid/view/View;", "view", "", "notifyChange", "Lkotlin/Function1;", "", "showProgress", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SafetyFeatureWizardFlow implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SafetyFeatureWizardFlow$handleClick$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.SafetyFeatureWizardFlow$handleClick$1", f = "SafetyFeatureWizardFlow.kt", l = {38, 40}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ View $view;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(View view2, t13.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$view = view2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new AnonymousClass1(this.$view, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((AnonymousClass1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        
            if (r1.u(r5, r7, r6) == r0) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.label;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.f136619a;
                x xVar = x.DI_CONNECT_LIVETRACK;
                this.label = 1;
                obj = oVar.f(xVar, Locale.getDefault(), this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            eq0.a.C1382a c1382a = eq0.a.f65038b;
            c1382a.a().getClass();
            SharedPreferences sharedPreferencesP = eq0.a.P();
            sharedPreferencesP.edit().putStringSet(eq0.a.O(R.string.key_incident_detection_config_first_time), null).commit();
            c1382a.a().getClass();
            eq0.a.Q();
            ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().n(false);
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).k(e31.a.HAS_EMERGENCY_CONTACTS);
            new qj1.a(null, 1, null).f145046a.O2("key_emergency_calling_setup_completed", false);
            Context context = this.$view.getContext();
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) SafetyFeatureSetupWizardActivity.class));
            return Unit.INSTANCE;
            s92.g gVar = (s92.g) obj;
            if (gVar != null) {
                o oVar2 = o.f136619a;
                x xVar2 = x.DI_CONNECT_LIVETRACK;
                this.L$0 = null;
                this.label = 2;
            }
            eq0.a.C1382a c1382a2 = eq0.a.f65038b;
            c1382a2.a().getClass();
            SharedPreferences sharedPreferencesP2 = eq0.a.P();
            sharedPreferencesP2.edit().putStringSet(eq0.a.O(R.string.key_incident_detection_config_first_time), null).commit();
            c1382a2.a().getClass();
            eq0.a.Q();
            ((vi1.a) KoinJavaComponent.get$default(vi1.a.class, null, null, 6, null)).a().n(false);
            ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).k(e31.a.HAS_EMERGENCY_CONTACTS);
            new qj1.a(null, 1, null).f145046a.O2("key_emergency_calling_setup_completed", false);
            Context context2 = this.$view.getContext();
            context2.getClass();
            context2.startActivity(new Intent(context2, (Class<?>) SafetyFeatureSetupWizardActivity.class));
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.SAFETY_FEATURE_WIZARD_FLOW;
        return new mg1.a(dVar.f112244a, dVar.f112245b, dVar.f112246c, false, false, 24, null);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.b getViewType() {
        return mg1.b.VIEW_TYPE_BUTTON;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public void handleClick(View view2, e23.a<Unit> notifyChange, e23.l<? super Boolean, Unit> showProgress, mg1.a modelItem) {
        view2.getClass();
        notifyChange.getClass();
        showProgress.getClass();
        modelItem.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new AnonymousClass1(view2, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
