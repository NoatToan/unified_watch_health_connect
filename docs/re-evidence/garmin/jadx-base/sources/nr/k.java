package nr;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnr/k;", "", "", "titleResourceId", "", "landscapeEnabled", "supportsOrientationOverride", "<init>", "(Ljava/lang/String;IIZZ)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    CHARTS(R.string.activity_history_chart_label, true, false),
    DIVES(R.string.lbl_multiple_dives, true, false),
    DIVE_INTERVALS(R.string.lbl_intervals, true, false),
    GASES(R.string.lbl_gases, false, false),
    GASES_CCR(R.string.lbl_gases, false, false),
    GEAR(R.string.concept_gear, false, false),
    INTERVALS(R.string.lbl_intervals, true, false),
    LAPS(R.string.lbl_laps, true, false),
    MATCHES(R.string.gaming_matches, true, true),
    OVERVIEW(R.string.lbl_overview, false, false),
    ROUNDS(R.string.lbl_rounds, false, false),
    ROUTES(R.string.lbl_routes, true, false),
    RUNS(R.string.lbl_runs, true, false),
    SONGS(R.string.songs_plural, false, false),
    SPLITS(R.string.pacepro_lbl_plan_splits_type, true, false),
    STATS(R.string.app_tour_stats_title, false, false),
    WAVES(R.string.activities_waves_label, true, false),
    LAPS_COMPARISON(R.string.lbl_laps, true, true),
    LAPS_MULTI_VIEW(R.string.lbl_laps, true, true),
    LAPS_RUNS(R.string.lbl_runs, true, false),
    ROUTES_LAPS_SPLITS_ALTERNATE(R.string.lbl_routes, true, false),
    SKI_RUNS_LAPS(R.string.activities_ski_run, true, false),
    SKI_RUNS_SPLITS(R.string.activities_ski_run, true, false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f127237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127239c;

    k(int i14, boolean z14, boolean z15) {
        this.f127237a = i14;
        this.f127238b = z14;
        this.f127239c = z15;
    }
}
