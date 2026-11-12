package t61;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public enum f {
    SEVEN_DAYS(R.string.lbl_seven_days, 4, 7, R.string.lbl_7_days, null),
    FOUR_WEEKS(R.string.lbl_four_weeks, 5, 28, R.string.lbl_4_weeks, null),
    /* JADX INFO: Fake field, exist only in values array */
    TWELVE_WEEKS(R.string.lbl_number_of_weeks_abbreviation, 10, 84, R.string.lbl_weeks, "12"),
    SIX_MONTHS(R.string.lbl_months_short, 7, 6, R.string.lbl_months, "6"),
    /* JADX INFO: Fake field, exist only in values array */
    SIX_MONTHS_BY_WEEKS(R.string.lbl_months_short, 9, 26, R.string.lbl_weeks, "26"),
    TWELVE_MONTHS(R.string.lbl_one_year_abbr, 6, 12, R.string.lbl_one_year, null);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f162747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f162748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f162749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f162750d;

    f(int i14, int i15, int i16, int i17, String str) {
        this.f162747a = i14;
        this.f162748b = i15;
        this.f162749c = i17;
        this.f162750d = str;
    }
}
