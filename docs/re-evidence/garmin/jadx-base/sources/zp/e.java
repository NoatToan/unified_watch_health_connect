package zp;

import c83.a0;
import c83.h;
import com.garmin.android.apps.connectmobile.activities.newmodel.k;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import f12.l;
import lc.u0;
import o13.r;
import o53.i0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzp/e;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lzp/e$a;", "availableMetricsApiService", "Lf12/l;", "userSettings", "<init>", "(Lzp/e$a;Lf12/l;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e implements f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f206552c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f206553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f206554b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lzp/e$a;", "", "Lo53/i0;", "Lc83/a0;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/k;", "a", "()Lo53/i0;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface a {
        @i83.f("/fitnessstats-service/activity/availableMetrics")
        i0<a0<k>> a();
    }

    public /* synthetic */ e(a aVar, l lVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? (a) ez0.b.a(ez0.b.f67468a, ez0.c.GC, a.class, new h.a[0], null, null, null, 120) : aVar, (i14 & 2) != 0 ? (l) KoinJavaComponent.get$default(l.class, null, null, 6, null) : lVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(v13.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i14 = fVar.f206557c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f206557c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objJ = fVar.f206555a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f206557c;
        if (i15 == 0) {
            r.b(objJ);
            g gVar = new g(this, null);
            fVar.f206557c = 1;
            objJ = f0.J(this, gVar, fVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (!(v2Var instanceof v2.b)) {
            if (v2Var instanceof v2.a) {
                return v2Var;
            }
            u0.r();
            return null;
        }
        boolean zC = ((k) ((v2.b) v2Var).f47386a).C();
        l lVar = this.f206554b;
        lVar.e3(zC);
        lVar.N3();
        oi2.a.C2513a c2513a = oi2.a.f132270a;
        bz.a aVar2 = new bz.a();
        c2513a.getClass();
        l73.c.b().e(aVar2);
        return v2Var;
    }

    public e(a aVar, l lVar) {
        aVar.getClass();
        lVar.getClass();
        this.f206553a = aVar;
        this.f206554b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
