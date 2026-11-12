package p008y1;

import a5.j;
import androidx.compose.foundation.gestures.FlingCancellationException;
import e23.p;
import g6.s;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q0;
import t13.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly1/y1;", "", "<anonymous>", "(Ly1/y1;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {890}, m = "invokeSuspend", v = 1)
public final class g3 extends i implements p<y1, d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h3 f193218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q0 f193219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f193220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f193221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f193222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h3 f193223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q0 f193224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f193225h;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/g3$a", "Ly1/o2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements o2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h3 f193226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y1 f193227b;

        public a(h3 h3Var, y1 y1Var) {
            this.f193226a = h3Var;
            this.f193227b = y1Var;
        }

        @Override // p008y1.o2
        public final float f(float f14) {
            float fAbs = Math.abs(f14);
            h3 h3Var = this.f193226a;
            if (fAbs != 0.0f && !h3Var.f193261h.invoke().booleanValue()) {
                throw new FlingCancellationException();
            }
            long jG = h3Var.g(h3Var.j(f14));
            j.f1233b.getClass();
            return h3Var.f(h3Var.i(this.f193227b.a(j.f1235d, jG)));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(h3 h3Var, q0 q0Var, long j8, d<? super g3> dVar) {
        super(2, dVar);
        this.f193223f = h3Var;
        this.f193224g = q0Var;
        this.f193225h = j8;
    }

    @Override // v13.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        g3 g3Var = new g3(this.f193223f, this.f193224g, this.f193225h, dVar);
        g3Var.f193222e = obj;
        return g3Var;
    }

    @Override // e23.p
    public final Object invoke(y1 y1Var, d<? super Unit> dVar) {
        return ((g3) create(y1Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        h3 h3Var;
        q0 q0Var;
        long j8;
        h3 h3Var2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193221d;
        if (i14 == 0) {
            r.b(obj);
            y1 y1Var = (y1) this.f193222e;
            h3Var = this.f193223f;
            a aVar2 = new a(h3Var, y1Var);
            e1 e1Var = h3Var.f193256c;
            q0Var = this.f193224g;
            long j14 = q0Var.f105808a;
            b2 b2Var = h3Var.f193257d;
            b2 b2Var2 = b2.Horizontal;
            long j15 = this.f193225h;
            float f14 = h3Var.f(b2Var == b2Var2 ? s.c(j15) : s.d(j15));
            this.f193222e = h3Var;
            this.f193218a = h3Var;
            this.f193219b = q0Var;
            this.f193220c = j14;
            this.f193221d = 1;
            obj = e1Var.a(aVar2, f14, this);
            if (obj == aVar) {
                return aVar;
            }
            j8 = j14;
            h3Var2 = h3Var;
        } else {
            if (i14 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j8 = this.f193220c;
            q0Var = this.f193219b;
            h3Var = this.f193218a;
            h3Var2 = (h3) this.f193222e;
            r.b(obj);
        }
        float f15 = h3Var2.f(((Number) obj).floatValue());
        q0Var.f105808a = h3Var.f193257d == b2.Horizontal ? s.b(f15, 0.0f, j8, 2) : s.b(0.0f, f15, j8, 1);
        return Unit.INSTANCE;
    }
}
