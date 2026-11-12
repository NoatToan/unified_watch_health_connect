package tr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ltr/d;", "Ltr/g;", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l22.b bVar) {
        super(bVar);
        bVar.getClass();
    }

    @Override // tr.g
    public final Integer f(int i14) {
        switch (i14) {
            case 1:
                return Integer.valueOf(R.string.power_zone_active_recovery);
            case 2:
                return Integer.valueOf(R.string.activities_training_effect_endurance);
            case 3:
                return Integer.valueOf(R.string.activities_training_effect_tempo);
            case 4:
                return Integer.valueOf(R.string.activities_training_effect_threshold);
            case 5:
                return Integer.valueOf(R.string.activities_training_effect_vo2_max);
            case 6:
                return Integer.valueOf(R.string.activity_anaerobic_label);
            case 7:
                return Integer.valueOf(R.string.power_zone_neuromuscular);
            default:
                return null;
        }
    }
}
