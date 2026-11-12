package tt1;

import androidx.fragment.app.v;
import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import rt1.n;
import t21.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$3", f = "ActiveTrainingPlansActivity.kt", l = {154}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166450b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$3$1", f = "ActiveTrainingPlansActivity.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActiveTrainingPlansActivity f166452b;

        /* JADX INFO: renamed from: tt1.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3131a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActiveTrainingPlansActivity f166453a;

            public C3131a(ActiveTrainingPlansActivity activeTrainingPlansActivity) {
                this.f166453a = activeTrainingPlansActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                g3 g3Var = (g3) obj;
                if (g3Var != null) {
                    ActiveTrainingPlansActivity.a aVar = ActiveTrainingPlansActivity.f45098w;
                    ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166453a;
                    activeTrainingPlansActivity.getClass();
                    int i14 = ActiveTrainingPlansActivity.b.f45115a[g3Var.f35300a.ordinal()];
                    int i15 = 1;
                    if (i14 == 1) {
                        activeTrainingPlansActivity.showProgressOverlay();
                    } else if (i14 == 2) {
                        activeTrainingPlansActivity.hideProgressOverlay();
                        v supportFragmentManager = activeTrainingPlansActivity.getSupportFragmentManager();
                        supportFragmentManager.getClass();
                        n.b(activeTrainingPlansActivity, supportFragmentManager, (rt1.j) g3Var.f35301b, new v0(activeTrainingPlansActivity, 5), new tt1.a(activeTrainingPlansActivity, i15));
                        ut1.e eVar = activeTrainingPlansActivity.f45108n;
                        if (eVar == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar.f172583b.f160872d.setValue(null);
                    } else {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        activeTrainingPlansActivity.hideProgressOverlay();
                        activeTrainingPlansActivity.na();
                        ut1.e eVar2 = activeTrainingPlansActivity.f45108n;
                        if (eVar2 == null) {
                            s.m("viewModel");
                            throw null;
                        }
                        eVar2.f172583b.f160872d.setValue(null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166452b = activeTrainingPlansActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166452b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to tt1.j$a for r4v1 'this'  t13.d
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
                int r1 = r4.f166451a
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
                com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity r5 = r4.f166452b
                ut1.e r1 = r5.f45108n
                if (r1 == 0) goto L33
                r53.b2 r1 = r1.f172587f
                tt1.j$a$a r3 = new tt1.j$a$a
                r3.<init>(r5)
                r4.f166451a = r2
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
            throw new UnsupportedOperationException("Method not decompiled: tt1.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f166450b = activeTrainingPlansActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f166450b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166449a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166450b;
            a aVar2 = new a(activeTrainingPlansActivity, null);
            this.f166449a = 1;
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
