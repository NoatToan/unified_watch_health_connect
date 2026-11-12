package xq;

import c22.c3;
import c22.i;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lxq/b;", "", "Lc22/c3;", "title", "", "supportsOrientationOverride", "<init>", "(Ljava/lang/String;ILc22/c3;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    LAPS(i.b(R.string.lbl_laps), false),
    REST(i.b(R.string.stress_level_rest), false),
    SPLITS(i.b(R.string.pacepro_lbl_plan_splits_type), false),
    WEIGHT_SPLITS(i.b(R.string.lbl_weight_splits), false),
    PACEPRO(i.b(R.string.pacepro_title), true),
    TOP_SPLITS(i.b(R.string.header_splits_top_5), true),
    ALL_RUNS(i.b(R.string.header_windsurfing_all_runs), false),
    ALL_RUNS_ALTERNATE_TITLE(i.b(R.string.header_windsurfing_runs), false),
    ALL_LAPS(i.b(R.string.header_all_laps), false),
    RUNS_ALTERNATE(i.b(R.string.header_windsurfing_runs), false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f191925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f191926b;

    b(c3 c3Var, boolean z14) {
        this.f191925a = c3Var;
        this.f191926b = z14;
    }
}
