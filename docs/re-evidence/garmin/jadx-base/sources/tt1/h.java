package tt1;

import androidx.lifecycle.h1;
import com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$1", f = "ActiveTrainingPlansActivity.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f166439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActiveTrainingPlansActivity f166440b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity$initViews$1$1", f = "ActiveTrainingPlansActivity.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f166441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ActiveTrainingPlansActivity f166442b;

        /* JADX INFO: renamed from: tt1.h$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C3129a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ActiveTrainingPlansActivity f166443a;

            public C3129a(ActiveTrainingPlansActivity activeTrainingPlansActivity) {
                this.f166443a = activeTrainingPlansActivity;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f166443a.invalidateOptionsMenu();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f166442b = activeTrainingPlansActivity;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f166442b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to tt1.h$a for r4v1 'this'  t13.d
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
                int r1 = r4.f166441a
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
                com.garmin.android.apps.connectmobile.training.activeplans.presentation.activity.ActiveTrainingPlansActivity r5 = r4.f166442b
                ut1.e r1 = r5.f45108n
                if (r1 == 0) goto L33
                r53.b2 r1 = r1.f172586e
                tt1.h$a$a r3 = new tt1.h$a$a
                r3.<init>(r5)
                r4.f166441a = r2
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
            throw new UnsupportedOperationException("Method not decompiled: tt1.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ActiveTrainingPlansActivity activeTrainingPlansActivity, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f166440b = activeTrainingPlansActivity;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f166440b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f166439a;
        if (i14 == 0) {
            r.b(obj);
            androidx.lifecycle.b0.b bVar = androidx.lifecycle.b0.b.STARTED;
            ActiveTrainingPlansActivity activeTrainingPlansActivity = this.f166440b;
            a aVar2 = new a(activeTrainingPlansActivity, null);
            this.f166439a = 1;
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
