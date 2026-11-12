package k52;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import fw.m;
import o13.r;
import o53.b0;
import o53.e2;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lk52/d;", "T", "Landroidx/lifecycle/u1;", "Lo53/b0;", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d<T> extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0<m<T>> f102945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f102946b = ge1.b.h();

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(d dVar, v13.c cVar) {
        c cVar2;
        dVar.getClass();
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f102944c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f102944c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(dVar, cVar);
            }
        } else {
            cVar2 = new c(dVar, cVar);
        }
        Object objY4 = cVar2.f102942a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f102944c;
        try {
            if (i15 == 0) {
                r.b(objY4);
                y0<m<T>> y0Var = dVar.f102945a;
                if (y0Var == null) {
                    s.m("liveData");
                    throw null;
                }
                y0Var.j(m.a.f(m.f73767e, null, null, 3));
                cVar2.f102944c = 1;
                objY4 = dVar.y4(cVar2);
                if (objY4 == obj) {
                    return obj;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objY4);
            }
            y0<m<T>> y0Var2 = dVar.f102945a;
            if (y0Var2 != null) {
                y0Var2.j(m.a.g(m.f73767e, objY4, 1));
                return Unit.INSTANCE;
            }
            s.m("liveData");
            throw null;
        } catch (Throwable th3) {
            String strZ4 = dVar.z4();
            String strN = fb1.c.n("Error fetching data: ", th3.getMessage());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, strZ4, strN);
            y0<m<T>> y0Var3 = dVar.f102945a;
            if (y0Var3 == null) {
                s.m("liveData");
                throw null;
            }
            m.f73767e.getClass();
            y0Var3.j(m.a.a(null, th3));
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f102946b);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f102946b.c(null);
        super.onCleared();
    }

    public abstract Object y4(v13.c cVar);

    public abstract String z4();
}
