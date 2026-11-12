package xm0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lxm0/d;", "", "", "labelResId", "Lj10/d;", "leaderboardType", "<init>", "(Ljava/lang/String;IILj10/d;)V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    /* JADX INFO: Fake field, exist only in values array */
    STEPS(R.string.lbl_steps, j10.d.TOTAL_STEPS),
    /* JADX INFO: Fake field, exist only in values array */
    WALKING(R.string.lbl_walking, j10.d.WALKING_DISTANCE),
    /* JADX INFO: Fake field, exist only in values array */
    RUNNING(R.string.lbl_running, j10.d.RUNNING_DISTANCE),
    /* JADX INFO: Fake field, exist only in values array */
    CYCLING(R.string.lbl_cycling, j10.d.CYCLING_DISTANCE),
    /* JADX INFO: Fake field, exist only in values array */
    SWIMMING(R.string.lbl_swimming, j10.d.SWIMMING_DISTANCE),
    /* JADX INFO: Fake field, exist only in values array */
    TOTAL_DISTANCE(R.string.lbl_total_distance, j10.d.TOTAL_DISTANCE),
    /* JADX INFO: Fake field, exist only in values array */
    CALORIES_ACTIVE(R.string.lbl_calories_active, j10.d.ACTIVE_CALORIES_BURNED),
    /* JADX INFO: Fake field, exist only in values array */
    TOTAL_PUSHES(R.string.lbl_pushes, j10.d.TOTAL_PUSHES),
    /* JADX INFO: Fake field, exist only in values array */
    PUSHING_DISTANCE(R.string.activity_type_parasports, j10.d.PUSHING_DISTANCE);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f191349c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f191351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j10.d f191352b;

    d(int i14, j10.d dVar) {
        this.f191351a = i14;
        this.f191352b = dVar;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxm0/d$a;", "", "<init>", "()V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
