package ey1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import o53.b0;
import o53.s0;
import o53.t1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$pushBenchmarksToApi$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {630, 632, 636, 637}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f67317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f67318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ey1.a f67319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f67320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f67321e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.presentation.viewmodel.SetupStrengthTrainingPlanViewModel$pushBenchmarksToApi$1$1", f = "SetupStrengthTrainingPlanViewModel.kt", l = {639}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f67322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f67323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ey1.a f67324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f67325d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f67326e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z14, ey1.a aVar, Context context, e23.a<Unit> aVar2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f67323b = z14;
            this.f67324c = aVar;
            this.f67325d = context;
            this.f67326e = aVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f67323b, this.f67324c, this.f67325d, this.f67326e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f67322a;
            if (i14 == 0) {
                o13.r.b(obj);
                if (this.f67323b) {
                    this.f67326e.invoke();
                } else {
                    nx1.p pVar = this.f67324c.f67284p;
                    dy1.o oVar = new dy1.o(this.f67325d.getString(R.string.txt_error_occurred), null, null, 6, null);
                    this.f67322a = 1;
                    Object objEmit = pVar.f128251a.emit(oVar, this);
                    if (objEmit != aVar) {
                        objEmit = Unit.INSTANCE;
                    }
                    if (objEmit == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ey1.a aVar, Context context, e23.a<Unit> aVar2, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f67319c = aVar;
        this.f67320d = context;
        this.f67321e = aVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f67319c, this.f67320d, this.f67321e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[PHI: r1
      0x0025: PHI (r1v4 boolean) = (r1v3 boolean), (r1v5 boolean) binds: [B:22:0x006b, B:11:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0086, code lost:
    
        if (ge1.b.e0(r11, r4, r10) == r0) goto L26;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f67318b;
        ey1.a aVar2 = this.f67319c;
        if (i14 == 0) {
            o13.r.b(obj);
            p2 p2Var = aVar2.f67273e;
            Boolean bool = Boolean.TRUE;
            this.f67318b = 1;
            p2Var.k(null, bool);
            if (Unit.INSTANCE != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            o13.r.b(obj);
        } else {
            if (i14 == 2) {
                o13.r.b(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                p2 p2Var2 = aVar2.f67273e;
                Boolean bool2 = Boolean.FALSE;
                this.f67317a = zBooleanValue;
                this.f67318b = 3;
                p2Var2.k(null, bool2);
                if (Unit.INSTANCE != aVar) {
                    boolean z14 = zBooleanValue;
                    x53.c cVar = s0.f129406a;
                    t1 t1Var = u53.o.f168762a;
                    a aVar3 = new a(z14, this.f67319c, this.f67320d, this.f67321e, null);
                    this.f67317a = z14;
                    this.f67318b = 4;
                }
                return aVar;
            }
            if (i14 == 3) {
                zBooleanValue = this.f67317a;
                o13.r.b(obj);
                boolean z15 = zBooleanValue;
                x53.c cVar2 = s0.f129406a;
                t1 t1Var2 = u53.o.f168762a;
                a aVar4 = new a(z15, this.f67319c, this.f67320d, this.f67321e, null);
                this.f67317a = z15;
                this.f67318b = 4;
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        }
        return Unit.INSTANCE;
        nx1.b bVar = aVar2.f67280l;
        l22.a aVar5 = new l22.a(this.f67320d);
        boolean z16 = am.j.z(f12.l.f68084a);
        this.f67318b = 2;
        obj = bVar.c(aVar5, z16, this);
        if (obj != aVar) {
            zBooleanValue = ((Boolean) obj).booleanValue();
            p2 p2Var3 = aVar2.f67273e;
            Boolean bool3 = Boolean.FALSE;
            this.f67317a = zBooleanValue;
            this.f67318b = 3;
            p2Var3.k(null, bool3);
            if (Unit.INSTANCE != aVar) {
                boolean z17 = zBooleanValue;
                x53.c cVar3 = s0.f129406a;
                t1 t1Var3 = u53.o.f168762a;
                a aVar6 = new a(z17, this.f67319c, this.f67320d, this.f67321e, null);
                this.f67317a = z17;
                this.f67318b = 4;
            }
        }
        return aVar;
    }
}
