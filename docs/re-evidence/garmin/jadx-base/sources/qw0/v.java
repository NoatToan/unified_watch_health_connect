package qw0;

import android.os.Parcel;
import android.os.Parcelable;
import c22.c3;
import c22.g2;
import c22.x0;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.messaging.Constants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqw0/v;", "Landroid/os/Parcelable;", "", "Lc22/c3;", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILc22/c3;)V", "gcm-map_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum v implements Parcelable {
    LAPS(c22.i.b(R.string.lbl_laps)),
    TIMING_GATES(c22.i.b(R.string.lbl_timing_gates_title)),
    OBSTACLES(c22.i.b(R.string.lbl_track_log_obstacles)),
    HIGH_TRAFFIC_ROADS(g2.b(x0.f23494kc)),
    UNPAVED_ROADS(c22.i.b(R.string.lbl_unpaved_roads)),
    MILE_MARKERS(c22.i.b(R.string.lbl_distance_markers_mi)),
    POPULARITY_HEATMAP(c22.i.b(R.string.lbl_popularity_heatmap)),
    HAZARDS(c22.i.b(R.string.lbl_map_settings_hazards)),
    HAZARDS_ON_COURSE(c22.i.b(R.string.lbl_map_settings_hazards)),
    JUMPS(c22.i.b(R.string.mtb_jump_metrics_title)),
    CLIMBS(c22.i.b(R.string.lbl_climbs_plural)),
    MAP_3D(c22.i.b(R.string.map_3d_label));

    public static final Parcelable.Creator<v> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c3 f148365a;

    static {
        x0.f23314a.getClass();
        CREATOR = new Parcelable.Creator<v>() { // from class: qw0.v.a
            @Override // android.os.Parcelable.Creator
            public final v createFromParcel(Parcel parcel) {
                parcel.getClass();
                return v.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final v[] newArray(int i14) {
                return new v[i14];
            }
        };
    }

    v(c3 c3Var) {
        this.f148365a = c3Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
