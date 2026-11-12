package x52;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lx52/d;", "", "", "prefixNameResourceID", "valueStringResourceID", "<init>", "(Ljava/lang/String;III)V", "a", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum d {
    ABOVE(R.string.workout_duration_value_above, R.string.workout_duration_above_value),
    BELOW(R.string.workout_duration_value_below, R.string.workout_duration_below_value);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f189064c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f189068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f189069b;

    d(int i14, int i15) {
        this.f189068a = i14;
        this.f189069b = i15;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx52/d$a;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static d a(Context context, String str) {
            context.getClass();
            if (str == null || str.length() == 0) {
                return null;
            }
            for (d dVar : d.values()) {
                if (u.q(context.getString(dVar.f189069b), str, true)) {
                    return dVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
