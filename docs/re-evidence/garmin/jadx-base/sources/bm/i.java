package bm;

import am.x0;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lbm/i;", "Lfw/e;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", "", "activityId", "Lam/x0;", "activityType", "", "Lqs/x;", "splitTypes", "<init>", "(JLam/x0;Ljava/util/List;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends fw.e<ActivityDetailChartDTO> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<qs.x> f18813n;

    /* JADX WARN: Multi-variable type inference failed */
    public i(long j8, x0 x0Var, List<? extends qs.x> list) {
        this.f18813n = list;
        i(com.garmin.android.library.backgroundtaskmanagement.b.e.SOURCE, new ActivityDetailChartDTO());
        b(new a(this, j8, list, x0Var != null && uw0.a.a(x0Var), new j(this)));
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbm/i$a;", "Lem/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/b;", "operation", "", "activityId", "", "Lqs/x;", "splitTypes", "", "shouldBuildPolylineFromMetrics", "Ljw/e$b;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/ActivityDetailChartDTO;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/garmin/android/library/backgroundtaskmanagement/b;JLjava/util/List;ZLjw/e$b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends em.a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.garmin.android.library.backgroundtaskmanagement.b<?> bVar, long j8, List<? extends qs.x> list, boolean z14, jw.e.b<ActivityDetailChartDTO> bVar2) {
            super(bVar, j8, false, 250, false, list, z14, bVar2);
            bVar.getClass();
            bVar2.getClass();
        }

        public /* synthetic */ a(com.garmin.android.library.backgroundtaskmanagement.b bVar, long j8, List list, boolean z14, jw.e.b bVar2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, j8, list, (i14 & 8) != 0 ? false : z14, bVar2);
        }
    }

    public i(long j8, x0 x0Var) {
        this(j8, x0Var, null, 4, null);
    }

    public /* synthetic */ i(long j8, x0 x0Var, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j8, x0Var, (i14 & 4) != 0 ? null : list);
    }
}
