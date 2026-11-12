package em;

import am.m;
import am.p;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.f0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qs.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B_\b\u0000\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lem/a;", "Ljw/e;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "activityId", "", "isActivityTypeLapSwimming", "", "maxChartSize", "cacheFetchEnabled", "", "Lqs/x;", "splitTypes", "shouldBuildPolylineFromMetrics", "Ljw/e$b;", "connectOperationListener", "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;JZIZLjava/util/List;ZLjw/e$b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class a extends jw.e<ActivityDetailChartDTO> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f64568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f64569o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f64570p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List<x> f64571q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f64572r;

    static {
        new C1370a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, boolean z14, int i14, boolean z15, List<? extends x> list, boolean z16, jw.e.b<ActivityDetailChartDTO> bVar2) {
        super(bVar, ActivityDetailChartDTO.class, bVar2, null, z15 ? new dm.a(j8, qd2.a.EnumC2721a.ACTIVITY_CHARTS, 7200) : null, 8, null);
        bVar.getClass();
        bVar2.getClass();
        this.f64568n = j8;
        this.f64569o = z14;
        this.f64570p = i14;
        this.f64571q = list;
        this.f64572r = z16;
    }

    @Override // jw.e
    public final Object f(jw.f fVar) {
        m mVarA = m.a.a(m.f4066e, 7);
        return f0.J(mVarA, new p(this.f64569o, mVarA, this.f64568n, this.f64571q, this.f64572r, this.f64570p, null), fVar);
    }

    /* JADX INFO: renamed from: em.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lem/a$a;", "", "<init>", "()V", "", "FIVE_DAYS_CACHE_STALE_TIME", "I", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1370a {
        public /* synthetic */ C1370a(j jVar) {
            this();
        }

        private C1370a() {
        }
    }

    public /* synthetic */ a(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8, boolean z14, int i14, boolean z15, List list, boolean z16, jw.e.b bVar2, int i15, j jVar) {
        this(bVar, j8, z14, i14, z15, (i15 & 32) != 0 ? null : list, (i15 & 64) != 0 ? false : z16, bVar2);
    }
}
