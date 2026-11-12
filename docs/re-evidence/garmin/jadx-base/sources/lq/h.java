package lq;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Llq/h;", "", "", Action.KEY_ATTRIBUTE, "", "labelResId", "sortOrder", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h {
    ALL(Rule.ALL, R.string.common_all, 0),
    /* JADX INFO: Fake field, exist only in values array */
    WARMUP("INTERVAL_WARMUP", R.string.workout_step_type_warmup, 1),
    /* JADX INFO: Fake field, exist only in values array */
    WALK("INTERVAL_WALK", R.string.activity_options_walk_title, 1),
    ACTIVE("INTERVAL_ACTIVE", R.string.allday_stress_active, 2),
    RUN("RUN", R.string.lbl_run, 2),
    BIKE("BIKE", R.string.lbl_bike, 2),
    /* JADX INFO: Fake field, exist only in values array */
    RECOVERY("INTERVAL_RECOVERY", R.string.workout_step_type_recovery, 3),
    /* JADX INFO: Fake field, exist only in values array */
    REST("INTERVAL_REST", R.string.workout_step_type_rest, 4),
    /* JADX INFO: Fake field, exist only in values array */
    COOLDOWN("INTERVAL_COOLDOWN", R.string.workout_step_type_cooldown, 5),
    /* JADX INFO: Fake field, exist only in values array */
    OTHER("INTERVAL_OTHER", R.string.workout_step_type_other, 6);


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f114305d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f114311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f114312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f114313c;

    h(String str, int i14, int i15) {
        this.f114311a = str;
        this.f114312b = i14;
        this.f114313c = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llq/h$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0019  */
        /* JADX WARN: Code duplicated, block: B:12:0x001c A[RETURN] */
        public static h a(String str) {
            for (h hVar : h.values()) {
                if (s.g(hVar.f114311a, str)) {
                    if (hVar == null) {
                        return h.ALL;
                    }
                    return hVar;
                }
            }
            hVar = null;
            if (hVar == null) {
                return h.ALL;
            }
            return hVar;
        }

        private a() {
        }
    }
}
