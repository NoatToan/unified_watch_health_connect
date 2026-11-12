package na0;

import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.cycling.wheel.BikeWheelCircumferenceEstimationScreenKt$BikeWheelCircumferenceEstimationScreenRoute$3$1", f = "BikeWheelCircumferenceEstimationScreen.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f125112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f125113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<m4.b0> f125114c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List<m4.b0> f125115a;

        public a(List<m4.b0> list) {
            this.f125115a = list;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            m4.b0.a(this.f125115a.get(((Number) obj).intValue()));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(j jVar, List<m4.b0> list, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f125113b = jVar;
        this.f125114c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f125113b, this.f125114c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to na0.c for r4v1 'this'  t13.d
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
            int r1 = r4.f125112a
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
            goto L2d
        L14:
            o13.r.b(r5)
            na0.j r5 = r4.f125113b
            r53.a2 r5 = r5.f125134d
            na0.c$a r1 = new na0.c$a
            java.util.List<m4.b0> r3 = r4.f125114c
            r1.<init>(r3)
            r4.f125112a = r2
            r53.d2<T> r5 = r5.f150526a
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            o2.c.f()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: na0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
