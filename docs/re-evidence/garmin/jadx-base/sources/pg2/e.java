package pg2;

import androidx.lifecycle.l0;
import androidx.lifecycle.n0;
import e23.p;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.j;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.livesessionview.ui.dashboard.charts.landscape.LandscapeChartViewKt$LandscapeChartView$2$1", f = "LandscapeChartView.kt", l = {92}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n0 f137639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a<Unit> f137640c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a<Unit> f137641a;

        /* JADX INFO: renamed from: pg2.e$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2610a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f137642a;

            static {
                int[] iArr = new int[androidx.lifecycle.b0.a.values().length];
                try {
                    iArr[androidx.lifecycle.b0.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f137642a = iArr;
            }
        }

        public a(e23.a<Unit> aVar) {
            this.f137641a = aVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            if (C2610a.f137642a[((androidx.lifecycle.b0.a) obj).ordinal()] == 1) {
                this.f137641a.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n0 n0Var, e23.a<Unit> aVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f137639b = n0Var;
        this.f137640c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f137639b, this.f137640c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f137638a;
        if (i14 == 0) {
            r.b(obj);
            r53.i<androidx.lifecycle.b0.a> iVarA = l0.a(this.f137639b.getF158016a());
            a aVar2 = new a(this.f137640c);
            this.f137638a = 1;
            if (iVarA.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
