package ro0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lro0/x;", "Landroidx/lifecycle/u1;", "Lpc0/j;", "devicesRepo", "<init>", "(Lpc0/j;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pc0.j f153893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f153894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f153895c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.help.ProductSupportViewModel$1", f = "ProductSupportViewModel.kt", l = {20}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f153896a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return x.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f153896a;
            x xVar = x.this;
            if (i14 == 0) {
                o13.r.b(obj);
                pc0.j jVar = xVar.f153893a;
                this.f153896a = 1;
                obj = jVar.f(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                p2 p2Var = xVar.f153894b;
                g3.a aVar2 = g3.f35298f;
                T t7 = ((v2.b) v2Var).f47386a;
                aVar2.getClass();
                p2Var.k(null, g3.a.d(t7));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                xVar.f153894b.k(null, g3.a.a(g3.f35298f, null, ((v2.a) v2Var).f47383a, null, null, 13));
            }
            return Unit.INSTANCE;
        }
    }

    public x(pc0.j jVar) {
        jVar.getClass();
        this.f153893a = jVar;
        p2 p2VarA = q2.a(g3.a.c(g3.f35298f));
        this.f153894b = p2VarA;
        this.f153895c = p2VarA;
        ge1.b.T(v1.a(this), null, null, new a(null), 3);
    }
}
