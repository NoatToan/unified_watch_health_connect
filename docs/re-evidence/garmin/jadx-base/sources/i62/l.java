package i62;

import androidx.lifecycle.u1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.v2;
import l52.y;
import o13.r;
import o53.b0;
import o53.e2;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Li62/l;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "", "locale", "<init>", "(Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f91865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f91866c;

    public l(String str) {
        str.getClass();
        this.f91864a = str;
        this.f91865b = ge1.b.h();
        this.f91866c = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(l lVar, y0 y0Var, v13.c cVar) {
        k kVar;
        lVar.getClass();
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f91863d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f91863d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(lVar, cVar);
            }
        } else {
            kVar = new k(lVar, cVar);
        }
        Object objB = kVar.f91861b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f91863d;
        try {
            if (i15 == 0) {
                r.b(objB);
                y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                y yVar = lVar.f91866c;
                String str = lVar.f91864a;
                kVar.f91860a = y0Var;
                kVar.f91863d = 1;
                objB = yVar.B(str, kVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = kVar.f91860a;
                r.b(objB);
            }
            v2 v2Var = (v2) objB;
            if (v2Var instanceof v2.b) {
                y0Var.j(fw.m.a.g(fw.m.f73767e, ((v2.b) v2Var).f47386a, 1));
                return Unit.INSTANCE;
            }
            if (v2Var instanceof v2.a) {
                throw ((v2.a) v2Var).f47383a;
            }
            throw new Throwable();
        } catch (Throwable th3) {
            fw.m.f73767e.getClass();
            y0Var.j(fw.m.a.a(null, th3));
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        x53.c cVar = s0.f129406a;
        return x53.b.f189152a.plus(this.f91865b);
    }
}
