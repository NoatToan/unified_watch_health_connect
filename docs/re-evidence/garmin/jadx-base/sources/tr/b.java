package tr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltr/b;", "Ltr/g;", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l22.b bVar) {
        super(bVar);
        bVar.getClass();
    }

    @Override // tr.g
    public final Integer f(int i14) {
        if (i14 == 1) {
            return Integer.valueOf(R.string.workout_target_hr_zone_1_text);
        }
        if (i14 == 2) {
            return Integer.valueOf(R.string.workout_target_hr_zone_2_text);
        }
        if (i14 == 3) {
            return Integer.valueOf(R.string.workout_target_hr_zone_3_text);
        }
        if (i14 == 4) {
            return Integer.valueOf(R.string.workout_target_hr_zone_4_text);
        }
        if (i14 != 5) {
            return null;
        }
        return Integer.valueOf(R.string.workout_target_hr_zone_5_text);
    }
}
