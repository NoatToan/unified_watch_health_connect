package fe2;

import java.util.List;
import org.joda.time.Period;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lo53/i0;", "Lde2/g0$b;", "<anonymous>", "(Lo53/b0;)Lo53/i0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator$terminateSessions$deviceResult$1", f = "DeviceDrivenTerminator.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e1 extends v13.i implements e23.p<o53.b0, t13.d<? super o53.i0<? extends de2.g0.b>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f70723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f70724b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lde2/g0$b;", "<anonymous>", "(Lo53/b0;)Lde2/g0$b;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.domain.DeviceDrivenTerminator$terminateSessions$deviceResult$1$1", f = "DeviceDrivenTerminator.kt", l = {29, 30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super de2.g0.b>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f70725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z0 f70726b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0 z0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f70726b = z0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f70726b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super de2.g0.b> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f70725a;
            z0 z0Var = this.f70726b;
            if (i14 == 0) {
                o13.r.b(obj);
                xd2.a1 a1Var = z0Var.f71022d;
                long j8 = z0Var.f71019a;
                this.f70725a = 1;
                obj = a1Var.g(j8, this);
                if (obj != aVar) {
                }
            }
            if (i14 != 1) {
                if (i14 == 2) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            Period period = (Period) obj;
            long millis = period != null ? period.getMillis() : 0L;
            de2.g0 g0Var = z0Var.f71023e;
            long j14 = z0Var.f71019a;
            List<String> list = z0Var.f71021c;
            this.f70725a = 2;
            Object objF = g0Var.f(j14, true, list, millis, this);
            return objF == aVar ? aVar : objF;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(z0 z0Var, t13.d<? super e1> dVar) {
        super(2, dVar);
        this.f70724b = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e1 e1Var = new e1(this.f70724b, dVar);
        e1Var.f70723a = obj;
        return e1Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super o53.i0<? extends de2.g0.b>> dVar) {
        return ((e1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        o53.b0 b0Var = (o53.b0) this.f70723a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return ge1.b.j(b0Var, null, null, new a(this.f70724b, null), 3);
    }
}
