package com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;
import b63.q;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/LifestyleLoggingOnboardingReset;", "Lcom/garmin/android/apps/connectmobile/settings/developersettings/itemstrategy/IDeveloperItemStrategy;", "<init>", "()V", "Landroid/view/View;", "view", "Lkotlin/Function1;", "", "", "showProgress", "resetOnboarding", "(Landroid/view/View;Le23/l;)V", "reset", "(Lt13/d;)Ljava/lang/Object;", "Lmg1/b;", "getViewType", "()Lmg1/b;", "Lkotlin/Function0;", "Landroid/content/Context;", "getContext", "Lmg1/a;", "getDeveloperItem", "(Le23/a;)Lmg1/a;", "notifyChange", "modelItem", "handleClick", "(Landroid/view/View;Le23/a;Le23/l;Lmg1/a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LifestyleLoggingOnboardingReset implements IDeveloperItemStrategy {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset$reset$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset", f = "LifestyleLoggingOnboardingReset.kt", l = {74, 84, 97, 100, 110, 113}, m = "reset", v = 2)
    public static final class AnonymousClass1 extends v13.c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(t13.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LifestyleLoggingOnboardingReset.this.reset(this);
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset$resetOnboarding$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset$resetOnboarding$1", f = "LifestyleLoggingOnboardingReset.kt", l = {56, 58}, m = "invokeSuspend", v = 2)
    public static final class C38891 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
        final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
        final /* synthetic */ View $view;
        boolean Z$0;
        int label;

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset$resetOnboarding$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset$resetOnboarding$1$1", f = "LifestyleLoggingOnboardingReset.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C07921 extends v13.i implements p<b0, t13.d<? super Unit>, Object> {
            final /* synthetic */ boolean $resetSuccessful;
            final /* synthetic */ e23.l<Boolean, Unit> $showProgress;
            final /* synthetic */ View $view;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C07921(e23.l<? super Boolean, Unit> lVar, View view2, boolean z14, t13.d<? super C07921> dVar) {
                super(2, dVar);
                this.$showProgress = lVar;
                this.$view = view2;
                this.$resetSuccessful = z14;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C07921(this.$showProgress, this.$view, this.$resetSuccessful, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C07921) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
                this.$showProgress.invoke(Boolean.FALSE);
                Toast.makeText(this.$view.getContext(), this.$resetSuccessful ? "Onboarding reset successfully" : "Onboarding reset failed", 1).show();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C38891(e23.l<? super Boolean, Unit> lVar, View view2, t13.d<? super C38891> dVar) {
            super(2, dVar);
            this.$showProgress = lVar;
            this.$view = view2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return LifestyleLoggingOnboardingReset.this.new C38891(this.$showProgress, this.$view, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C38891) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
        
            if (ge1.b.e0(r1, r4, r7) == r0) goto L15;
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
                LifestyleLoggingOnboardingReset lifestyleLoggingOnboardingReset = LifestyleLoggingOnboardingReset.this;
                this.label = 1;
                obj = lifestyleLoggingOnboardingReset.reset(this);
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
            return Unit.INSTANCE;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            x53.c cVar = s0.f129406a;
            t1 t1Var = o.f168762a;
            C07921 c07921 = new C07921(this.$showProgress, this.$view, zBooleanValue, null);
            this.Z$0 = zBooleanValue;
            this.label = 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleClick$lambda$1(DialogInterface dialogInterface, int i14) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0122  */
    /* JADX WARN: Code duplicated, block: B:30:0x0159  */
    /* JADX WARN: Code duplicated, block: B:33:0x0162  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0159 -> B:31:0x015e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x01c5 -> B:47:0x01c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x025f -> B:73:0x0262). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object reset(t13.d<? super java.lang.Boolean> r15) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.LifestyleLoggingOnboardingReset.reset(t13.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b63.o reset$lambda$0(b63.o oVar) {
        oVar.getClass();
        b63.i.INSTANCE.getClass();
        return q.c(oVar, 1, b63.i.f16190d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void resetOnboarding(View view2, e23.l<? super Boolean, Unit> showProgress) {
        showProgress.invoke(Boolean.TRUE);
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new C38891(showProgress, view2, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public mg1.a getDeveloperItem(e23.a<? extends Context> getContext) {
        getContext.getClass();
        lg1.d dVar = lg1.d.LIFESTYLE_LOGGING_ONBOARDING_RESET;
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
        new androidx.appcompat.app.e.a(view2.getContext()).setTitle("Reset Onboarding").setMessage("Are you sure you want to reset Lifestyle Logging onboarding?").setPositiveButton("Yes", new bi2.k(this, 4, view2, showProgress)).setNegativeButton("No", new c(5)).create().show();
    }

    @Override // com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.IDeveloperItemStrategy
    public /* bridge */ void handleToggle(boolean z14, View view2, e23.l<? super Boolean, Unit> lVar, mg1.a aVar) {
        super.handleToggle(z14, view2, lVar, aVar);
    }
}
