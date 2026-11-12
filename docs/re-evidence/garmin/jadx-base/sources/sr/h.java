package sr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsr/h;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160571a;

    static {
        new a(null);
    }

    public h(l22.b bVar) {
        bVar.getClass();
        this.f160571a = bVar;
    }

    public static Integer a(int i14) {
        if (j23.t.o(0, 34).d(i14)) {
            return Integer.valueOf(R.color.gcm_workout_metrics_low);
        }
        if (j23.t.o(34, 67).d(i14)) {
            return Integer.valueOf(R.color.gcm_workout_metrics_average);
        }
        if (i14 >= 67) {
            return Integer.valueOf(R.color.gcm_workout_metrics_good);
        }
        return null;
    }

    public final String b(int i14) {
        boolean zD = j23.t.o(0, 34).d(i14);
        l22.b bVar = this.f160571a;
        if (zD) {
            return bVar.getString(R.string.workout_execution_score_low);
        }
        if (j23.t.o(34, 67).d(i14)) {
            return bVar.getString(R.string.workout_execution_score_average);
        }
        return i14 >= 67 ? bVar.getString(R.string.workout_execution_score_good) : bVar.getString(R.string.lbl_none);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lsr/h$a;", "", "<init>", "()V", "", "WORKOUT_EXECUTION_SCORE_LOW", "I", "WORKOUT_EXECUTION_SCORE_AVERAGE", "WORKOUT_EXECUTION_SCORE_GOOD", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
