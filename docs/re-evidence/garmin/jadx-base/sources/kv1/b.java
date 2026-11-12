package kv1;

import am.b2;
import com.garmin.android.apps.connectmobile.e3;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import java.util.Objects;
import lc.u0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkv1/b;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lkv1/a;", "api", "Lam/b2;", "gcActivityApi", "Lcom/garmin/android/apps/connectmobile/e3;", "trainingPlanDelegate", "Lkv1/c0;", "userSummaryApi", "<init>", "(Lkv1/a;Lam/b2;Lcom/garmin/android/apps/connectmobile/e3;Lkv1/c0;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f106719e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv1.a f106720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b2 f106721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3 f106722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f106723d;

    public b(kv1.a aVar, b2 b2Var, e3 e3Var, c0 c0Var) {
        aVar.getClass();
        b2Var.getClass();
        e3Var.getClass();
        c0Var.getClass();
        this.f106720a = aVar;
        this.f106721b = b2Var;
        this.f106722c = e3Var;
        this.f106723d = c0Var;
    }

    public static Object b(b bVar, String str, String str2, v13.c cVar) {
        fy1.i.f73924a.getClass();
        List list = (List) fy1.i.f73927d.getValue();
        bVar.getClass();
        return f0.J(bVar, new h(bVar, str, str2, null, list, true, false, null), cVar);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(long j8, v13.c cVar) throws Exception {
        f fVar;
        v2 v2Var;
        ps.m activityPolylineDMO;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f106740e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f106740e = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objO = fVar.f106738c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f106740e;
        e3 e3Var = this.f106722c;
        if (i15 == 0) {
            o13.r.b(objO);
            fVar.f106736a = j8;
            fVar.f106740e = 1;
            objO = e3Var.O(j8, fVar);
            if (objO != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            j8 = fVar.f106736a;
            o13.r.b(objO);
        } else {
            if (i15 != 2) {
                if (i15 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ps.m mVar = fVar.f106737b;
                o13.r.b(objO);
                return mVar;
            }
            j8 = fVar.f106736a;
            o13.r.b(objO);
        }
        v2Var = (v2) objO;
        if (v2Var instanceof v2.b) {
            if (!(v2Var instanceof v2.a)) {
                u0.r();
                return null;
            }
            Exception exc = ((v2.a) v2Var).f47383a;
            Objects.toString(exc);
            throw exc;
        }
        activityPolylineDMO = ((ps.n) ((v2.b) v2Var).f47386a).getActivityPolylineDMO();
        if (activityPolylineDMO != null) {
            fVar.f106737b = activityPolylineDMO;
            fVar.f106736a = j8;
            fVar.f106740e = 3;
            if (e3Var.T(activityPolylineDMO, fVar) == aVar) {
                return aVar;
            }
        }
        return activityPolylineDMO;
        ps.m mVar2 = (ps.m) objO;
        if (mVar2 != null) {
            return mVar2;
        }
        g gVar = new g(this, j8, null);
        fVar.f106736a = j8;
        fVar.f106740e = 2;
        objO = f0.J(this, gVar, fVar);
        if (objO != aVar) {
            v2Var = (v2) objO;
            if (v2Var instanceof v2.b) {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                Exception exc2 = ((v2.a) v2Var).f47383a;
                Objects.toString(exc2);
                throw exc2;
            }
            activityPolylineDMO = ((ps.n) ((v2.b) v2Var).f47386a).getActivityPolylineDMO();
            if (activityPolylineDMO != null) {
                fVar.f106737b = activityPolylineDMO;
                fVar.f106736a = j8;
                fVar.f106740e = 3;
                if (e3Var.T(activityPolylineDMO, fVar) == aVar) {
                }
            }
            return activityPolylineDMO;
        }
        return aVar;
    }

    public final Object c(long j8, v13.i iVar) {
        return f0.J(this, new j(this, j8, null), iVar);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lkv1/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "DEFAULT_PLAN_START", "I", "DEFAULT_PLAN_LIMIT", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static b a(a aVar) {
            ez0.b bVar = ez0.b.f67468a;
            ez0.c cVar = ez0.c.GC;
            kv1.a aVar2 = (kv1.a) ez0.b.a(bVar, cVar, kv1.a.class, new c83.h.a[0], null, null, null, 120);
            b2 b2Var = (b2) ez0.b.a(bVar, cVar, b2.class, new c83.h.a[0], null, null, null, 120);
            e3 e3Var = (e3) KoinJavaComponent.get$default(e3.class, null, null, 6, null);
            c0 c0Var = (c0) ez0.b.a(bVar, cVar, c0.class, new c83.h.a[0], null, null, null, 88);
            aVar.getClass();
            aVar2.getClass();
            b2Var.getClass();
            e3Var.getClass();
            c0Var.getClass();
            return new b(aVar2, b2Var, e3Var, c0Var);
        }

        private a() {
        }
    }
}
