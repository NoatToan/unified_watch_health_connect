package q91;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B%\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lq91/b;", "Landroid/os/Parcelable;", "", "", Action.KEY_ATTRIBUTE, "", "shortLabelResId", "longLabelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b implements Parcelable {
    MILE("mile", R.string.lbl_mile, R.string.lbl_miles),
    KILOMETER("kilometer", R.string.lbl_km, R.string.lbl_kilometers),
    METER("meter", R.string.lbl_m, R.string.common_meters_string),
    FOOT("foot", R.string.lbl_foot, R.string.common_feet_string),
    YARD("yard", R.string.lbl_yard, R.string.common_yards_string),
    POUND("pound", R.string.lbl_lbs, R.string.lbl_pounds),
    KILOGRAM("kilogram", R.string.lbl_kg, R.string.lbl_kilograms),
    WATT("watt", R.string.lbl_watts, R.string.common_watts);

    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: q91.b.a
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return b.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f143548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143549b;

    b(String str, int i14, int i15) {
        this.f143548a = i14;
        this.f143549b = i15;
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
