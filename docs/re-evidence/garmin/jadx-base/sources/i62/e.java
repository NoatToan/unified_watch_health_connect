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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Li62/e;", "Landroidx/lifecycle/u1;", "Lo53/b0;", "", "locale", "category", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f91841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f91842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f91843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e2 f91844e;

    public e(String str, String str2, String str3) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f91840a = str;
        this.f91841b = str2;
        this.f91842c = str3;
        this.f91843d = (y) KoinJavaComponent.get$default(y.class, null, null, 6, null);
        this.f91844e = ge1.b.h();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(e eVar, y0 y0Var, v13.c cVar) {
        d dVar;
        eVar.getClass();
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f91839d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f91839d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(eVar, cVar);
            }
        } else {
            dVar = new d(eVar, cVar);
        }
        Object objA0 = dVar.f91837b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f91839d;
        try {
            if (i15 == 0) {
                r.b(objA0);
                y0Var.j(fw.m.a.f(fw.m.f73767e, null, null, 3));
                y yVar = eVar.f91843d;
                String str = eVar.f91840a;
                String str2 = eVar.f91841b;
                String str3 = eVar.f91842c;
                dVar.f91836a = y0Var;
                dVar.f91839d = 1;
                objA0 = yVar.a0(str, str2, str3, dVar);
                if (objA0 == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = dVar.f91836a;
                r.b(objA0);
            }
            v2 v2Var = (v2) objA0;
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
        return x53.b.f189152a.plus(this.f91844e);
    }
}
