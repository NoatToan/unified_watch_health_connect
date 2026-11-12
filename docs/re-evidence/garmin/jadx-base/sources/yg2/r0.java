package yg2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewKt$WorkoutView$1", f = "WorkoutView.kt", l = {102}, m = "invokeSuspend", v = 2)
public final class r0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f197168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.n0 f197169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f197170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.m0 f197171d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f197172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p005kotlin.jvm.internal.m0 f197173b;

        /* JADX INFO: renamed from: yg2.r0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C3689a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f197174a;

            static {
                int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
                try {
                    iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f197174a = iArr;
            }
        }

        public a(e23.a<Unit> aVar, p005kotlin.jvm.internal.m0 m0Var) {
            this.f197172a = aVar;
            this.f197173b = m0Var;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            if (C3689a.f197174a[((androidx.lifecycle.b0.a) obj).ordinal()] == 1) {
                this.f197172a.invoke();
                this.f197173b.f105804a = true;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(androidx.lifecycle.n0 n0Var, e23.a<Unit> aVar, p005kotlin.jvm.internal.m0 m0Var, t13.d<? super r0> dVar) {
        super(2, dVar);
        this.f197169b = n0Var;
        this.f197170c = aVar;
        this.f197171d = m0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new r0(this.f197169b, this.f197170c, this.f197171d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((r0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f197168a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.i<androidx.lifecycle.b0.a> iVarA = androidx.lifecycle.l0.a(this.f197169b.getF158016a());
            a aVar2 = new a(this.f197170c, this.f197171d);
            this.f197168a = 1;
            if (iVarA.collect(aVar2, this) == aVar) {
                return aVar;
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
