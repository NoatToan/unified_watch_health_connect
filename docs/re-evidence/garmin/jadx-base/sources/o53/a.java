package o53;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.DispatchException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lo53/a;", "T", "Lo53/p1;", "Lo53/l1;", "Lt13/d;", "Lo53/b0;", "Lt13/g;", "parentContext", "", "initParentJob", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "<init>", "(Lt13/g;ZZ)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a<T> extends p1 implements t13.d<T>, b0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t13.g f129302c;

    public a(t13.g gVar, boolean z14, boolean z15) {
        super(z15);
        if (z14) {
            d0((l1) gVar.get(l1.f129368i0));
        }
        this.f129302c = gVar.plus(this);
    }

    @Override // o53.p1
    public final String M() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // o53.p1
    public final void c0(CompletionHandlerException completionHandlerException) {
        kotlinx.coroutines.a.a(completionHandlerException, this.f129302c);
    }

    @Override // t13.d
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final t13.g getF129302c() {
        return this.f129302c;
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        return this.f129302c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o53.p1
    public final void l0(Object obj) {
        if (!(obj instanceof v)) {
            u0(obj);
        } else {
            v vVar = (v) obj;
            t0(vVar.f129416a, v.f129415b.get(vVar) == 1);
        }
    }

    @Override // t13.d
    public final void resumeWith(Object obj) {
        Throwable thB = o13.q.b(obj);
        if (thB != null) {
            obj = new v(thB, false, 2, null);
        }
        Object objH0 = h0(obj);
        if (objH0 == q1.f129398b) {
            return;
        }
        A(objH0);
    }

    public void t0(Throwable th3, boolean z14) {
    }

    public void u0(T t7) {
    }

    public final void v0(d0 d0Var, a aVar, e23.p pVar) {
        Object objInvoke;
        d0Var.getClass();
        int i14 = d0.a.f129328a[d0Var.ordinal()];
        if (i14 == 1) {
            v53.a.a(pVar, aVar, this);
            return;
        }
        if (i14 == 2) {
            pVar.getClass();
            t13.d dVarB = u13.f.b(u13.f.a(pVar, aVar, this));
            Unit unit = Unit.INSTANCE;
            int i15 = o13.q.f128596b;
            dVarB.resumeWith(unit);
            return;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return;
            }
            lc.u0.r();
            return;
        }
        try {
            t13.g gVar = this.f129302c;
            Object objC = u53.z.c(gVar, null);
            try {
                if (pVar instanceof v13.a) {
                    p005kotlin.jvm.internal.y0.e(2, pVar);
                    objInvoke = pVar.invoke(aVar, this);
                } else {
                    objInvoke = u13.f.c(pVar, aVar, this);
                }
                u53.z.a(gVar, objC);
                if (objInvoke != u13.a.COROUTINE_SUSPENDED) {
                    int i16 = o13.q.f128596b;
                    resumeWith(objInvoke);
                }
            } catch (Throwable th3) {
                u53.z.a(gVar, objC);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            int i17 = o13.q.f128596b;
            resumeWith(o13.r.a(th));
        }
    }
}
