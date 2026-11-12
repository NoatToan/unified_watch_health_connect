package dm;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import p005kotlin.Metadata;
import ps.a1;
import ps.y0;
import ps.y1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ldm/o;", "Lfw/e;", "Laq/d;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o extends fw.e<aq.d> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f60398p = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final am.m f60399n = am.m.a.a(am.m.f4066e, 7);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f60400o = new Object();

    static {
        new a(null);
    }

    @Override // fw.e, com.garmin.android.library.backgroundtaskmanagement.b
    public final void g() {
        super.g();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.ACTIVITIES;
        String str = "operationComplete(): " + (this.f50099i == null);
        aVar.getClass();
        i2.a.b(a2Var, "BaseActivitySummaryStatsOperation", str);
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b
    public final void j(com.garmin.android.library.backgroundtaskmanagement.d dVar, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        cVar.getClass();
        super.j(dVar, cVar);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.ACTIVITIES;
        String str = "taskComplete(): " + this.f50094d + ", " + this.f50095e.get() + ", " + (this.f50099i == null);
        aVar.getClass();
        i2.a.b(a2Var, "BaseActivitySummaryStatsOperation", str);
    }

    public final b0 l(long j8, boolean z14) {
        return new b0(j8, y0.class, new iu1.g(), new c0(this, z14, j8));
    }

    public final ArrayList m() {
        List<Long> listM;
        a1 a1Var;
        com.garmin.android.library.backgroundtaskmanagement.b.e eVar = com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE;
        ConcurrentHashMap concurrentHashMap = this.f50097g;
        com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = ((aq.d) concurrentHashMap.get(eVar)).f11879a;
        if (hVar == null || (a1Var = hVar.f29459l) == null || (listM = a1Var.m()) == null) {
            listM = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        ((aq.d) concurrentHashMap.get(eVar)).f11896r = arrayList;
        ArrayList arrayList2 = new ArrayList();
        Iterator<Long> it = listM.iterator();
        while (it.hasNext()) {
            arrayList2.add(new d0(this, arrayList, new String[]{String.valueOf(it.next().longValue())}, lj0.a.f112938k, com.garmin.android.apps.connectmobile.activities.newmodel.h.class, d80.g.JSON_OBJECT));
        }
        return arrayList2;
    }

    public final l0 n(long j8, boolean z14) {
        return new l0(j8, y1.class, new iu1.g(), new m0(z14, this));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Ldm/o$a;", "", "<init>", "()V", "", "POWER_TIME_IN_ZONE_SIZE", "I", "POWER_RUNNING_TIME_IN_ZONE_SIZE", "", "EXERCISE_KEY_NAME_UNKNOWN", "Ljava/lang/String;", "MAX_CHART_SIZE", "TAG", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
