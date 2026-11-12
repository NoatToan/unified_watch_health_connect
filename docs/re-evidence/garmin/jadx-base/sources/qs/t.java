package qs;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes7.dex */
public enum t {
    /* JADX INFO: Fake field, exist only in values array */
    FREESTYLE("FREESTYLE", R.string.activity_details_swim_stroke_freestyle),
    /* JADX INFO: Fake field, exist only in values array */
    BACKSTROKE("BACKSTROKE", R.string.activity_details_swim_stroke_backstroke),
    /* JADX INFO: Fake field, exist only in values array */
    BREASTSTROKE("BREASTSTROKE", R.string.activity_details_swim_stroke_breaststroke),
    /* JADX INFO: Fake field, exist only in values array */
    BUTTERFLY("BUTTERFLY", R.string.workout_fly_stroke),
    MIXED("MIXED", R.string.activity_details_swim_stroke_mixed),
    DRILL("DRILL", R.string.activity_details_swim_stroke_drill),
    UNKNOWN("UNKNOWN", R.string.no_value),
    REST("REST", R.string.workout_step_type_rest);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f147171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147172b;

    t(String str, int i14) {
        this.f147171a = str;
        this.f147172b = i14;
    }
}
