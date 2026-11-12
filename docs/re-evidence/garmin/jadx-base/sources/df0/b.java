package df0;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldf0/b;", "", "<init>", "()V", "gcm-domain-heartrate_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f59440a = new b();

    private b() {
    }

    public static final int a(int i14) {
        if (i14 == 0) {
            return R.color.heart_rate_line_gradient0;
        }
        if (i14 == 1) {
            return R.color.heart_rate_line_gradient1;
        }
        if (i14 == 2) {
            return R.color.heart_rate_line_gradient2;
        }
        if (i14 == 3) {
            return R.color.heart_rate_line_gradient3;
        }
        if (i14 != 4) {
            return i14 != 5 ? R.color.heart_rate_line_gradient0 : R.color.heart_rate_line_gradient5;
        }
        return R.color.heart_rate_line_gradient4;
    }
}
