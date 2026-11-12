package v01;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lg21/i;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.DailyListUseCase$invoke$2", f = "DailyListUseCase.kt", l = {53, 63}, m = "invokeSuspend", v = 2)
public final class o extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends g21.i>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.j0 f174481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g21.h f174482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f174483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f174484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f174485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s f174486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b63.o f174487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f174488h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Ls21/o;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.domain.usecase.DailyListUseCase$invoke$2$micronutrientsSettingsTask$1", f = "DailyListUseCase.kt", l = {51}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super v2<? extends s21.o>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f174489a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f174490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b63.o f174491c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, b63.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f174490b = sVar;
            this.f174491c = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f174490b, this.f174491c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends s21.o>> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f174489a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            t0 t0Var = this.f174490b.f174527c;
            this.f174489a = 1;
            Object objA = t0Var.a(this.f174491c, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, b63.o oVar, boolean z14, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f174486f = sVar;
        this.f174487g = oVar;
        this.f174488h = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        o oVar = new o(this.f174486f, this.f174487g, this.f174488h, dVar);
        oVar.f174485e = obj;
        return oVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super v2<? extends g21.i>> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v5 com.garmin.android.apps.connectmobile.v2$b, still in use, count: 2, list:
          (r10v5 com.garmin.android.apps.connectmobile.v2$b) from 0x044d: MOVE (r31v1 com.garmin.android.apps.connectmobile.v2$b) = (r10v5 com.garmin.android.apps.connectmobile.v2$b)
          (r10v5 com.garmin.android.apps.connectmobile.v2$b) from 0x011d: PHI (r10v11 com.garmin.android.apps.connectmobile.v2$b) = (r10v5 com.garmin.android.apps.connectmobile.v2$b), (r10v33 com.garmin.android.apps.connectmobile.v2$b) binds: [B:62:0x010e, B:138:0x0293] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    @Override // v13.a
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instruction units count: 1604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v01.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
