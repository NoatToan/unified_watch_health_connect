package tt1;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.garmin.android.apps.connectmobile.training.findplan.presentation.FindTrainingPlanActivity;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$4", f = "ActiveTrainingPlansActivity.kt", l = {163}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166455b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$4$1", f = "ActiveTrainingPlansActivity.kt", l = {164}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActiveTrainingPlansActivity f166457b;

        /* JADX INFO: renamed from: tt1.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3132a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActiveTrainingPlansActivity f166458a;

            public C3132a(ActiveTrainingPlansActivity activeTrainingPlansActivity) {
                this.f166458a = activeTrainingPlansActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                int iOrdinal;
                g3 g3Var = (g3) obj;
                if (g3Var != null) {
                    ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                    ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166458a;
                    activeTrainingPlansActivity.getClass();
                    int i14 = ActiveTrainingPlansActivity.b.f45115a[g3Var.f35300a.ordinal()];
                    if (i14 == 1) {
                        activeTrainingPlansActivity.showProgressOverlay();
                    } else if (i14 == 2) {
                        activeTrainingPlansActivity.hideProgressOverlay();
                        FindTrainingPlanActivity.a aVar2 = FindTrainingPlanActivity.f45585g;
                        ut1.e eVar = activeTrainingPlansActivity.f45108n;
                        if (eVar == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        if (eVar.f172584c > 0) {
                            iOrdinal = jw1.a.COMPLETED_NO_ACTIVE.ordinal();
                        } else {
                            fy1.i.f73924a.getClass();
                            iOrdinal = (fy1.i.a.o() ? jw1.a.FBTA_PLAN_TYPE_SELECTION : jw1.a.NON_DSW_CAPABLE).ordinal();
                        }
                        ut1.e eVar2 = activeTrainingPlansActivity.f45108n;
                        if (eVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        int i15 = eVar2.f172584c;
                        String str = activeTrainingPlansActivity.f45113t;
                        boolean z14 = str != null;
                        aVar2.getClass();
                        FindTrainingPlanActivity.a.a(activeTrainingPlansActivity, str, iOrdinal, i15, z14);
                        ut1.e eVar3 = activeTrainingPlansActivity.f45108n;
                        if (eVar3 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar3.f172583b.f160873e.setValue(null);
                        activeTrainingPlansActivity.finish();
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        activeTrainingPlansActivity.na();
                        activeTrainingPlansActivity.hideProgressOverlay();
                        ut1.e eVar4 = activeTrainingPlansActivity.f45108n;
                        if (eVar4 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar4.f172583b.f160873e.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166457b = activeTrainingPlansActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166457b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to tt1.k$a for r4v1 'this'  t13.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // v13.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                u13.a r0 = u13.a.COROUTINE_SUSPENDED
                int r1 = r4.f166456a
                r2 = 1
                if (r1 == 0) goto L14
                if (r1 == r2) goto L10
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                vb.h.z(r5)
            Le:
                r5 = 0
                return r5
            L10:
                o13.r.b(r5)
                goto L2f
            L14:
                o13.r.b(r5)
                com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity r5 = r4.f166457b
                ut1.e r1 = r5.f45108n
                if (r1 == 0) goto L33
                r53.b2 r1 = r1.f172588g
                tt1.k$a$a r3 = new tt1.k$a$a
                r3.<init>(r5)
                r4.f166456a = r2
                r53.o2<T> r5 = r1.f150540a
                java.lang.Object r5 = r5.collect(r3, r4)
                if (r5 != r0) goto L2f
                return r0
            L2f:
                o2.c.f()
                goto Le
            L33:
                java.lang.String r5 = "viewModel"
                p005kotlin.jvm.internal.s.m(r5)
                r5 = 0
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: tt1.k.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f166455b = activeTrainingPlansActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f166455b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166454a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166455b;
            a aVar2 = new a(activeTrainingPlansActivity, null);
            this.f166454a = 1;
            if (h1.b(activeTrainingPlansActivity, bVar, aVar2, this) == aVar) {
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
