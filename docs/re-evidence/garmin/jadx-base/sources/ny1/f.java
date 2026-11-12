package ny1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B#\b\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lny1/f;", "Landroid/os/Parcelable;", "", "", "text", "", "displayValue", "noOfDays", "<init>", "(Ljava/lang/String;IILjava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum f implements Parcelable {
    ALL(R.string.lbl_surface_type_all, "", 365),
    SEVENDAYS(R.string.date_filter_next_number_of_days, "7", 7),
    THREEMONTHS(R.string.date_filter_next_number_of_months, "3", 90),
    SIXMONTHS(R.string.date_filter_next_number_of_months, "6", 180),
    CUSTOM(R.string.hiit_timers_custom_help_label, "", 90);

    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: ny1.f.a
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return f.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f128365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f128366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f128367c;

    f(int i14, String str, int i15) {
        this.f128365a = i14;
        this.f128366b = str;
        this.f128367c = i15;
    }

    public final String c(Context context) {
        context.getClass();
        f fVar = ALL;
        int i14 = this.f128365a;
        if (this == fVar || this == CUSTOM) {
            String string = context.getString(i14);
            string.getClass();
            return string;
        }
        String string2 = context.getString(i14, this.f128366b);
        string2.getClass();
        return string2;
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
