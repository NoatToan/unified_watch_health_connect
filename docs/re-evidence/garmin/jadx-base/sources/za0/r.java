package za0;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.permissions.NotificationsPermissionScreenRouteKt$NotificationsPermissionScreenRoute$1$1", f = "NotificationsPermissionScreenRoute.kt", l = {26}, m = "invokeSuspend", v = 2)
public final class r extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f203273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f203274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f203275c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f203276a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(e23.l<? super Boolean, Unit> lVar) {
            this.f203276a = lVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            if (((Boolean) obj).booleanValue()) {
                this.f203276a.invoke(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(i iVar, e23.l<? super Boolean, Unit> lVar, t13.d<? super r> dVar) {
        super(2, dVar);
        this.f203274b = iVar;
        this.f203275c = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r(this.f203274b, this.f203275c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type t13.d to za0.r for r4v1 'this'  t13.d
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
            int r1 = r4.f203273a
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
            za0.i r5 = r4.f203274b
            r53.b2 r5 = r5.f203253h
            za0.r$a r1 = new za0.r$a
            e23.l<java.lang.Boolean, kotlin.Unit> r3 = r4.f203275c
            r1.<init>(r3)
            r4.f203273a = r2
            r53.o2<T> r5 = r5.f150540a
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            o2.c.f()
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: za0.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
