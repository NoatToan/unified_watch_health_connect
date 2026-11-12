package ez1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lez1/h;", "Lez1/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum h implements c {
    ALL,
    LESS_THAN_24_HOURS,
    TWENTY_FOUR_TO_48_HOURS;

    public static final Parcelable.Creator<h> CREATOR = new Parcelable.Creator<h>() { // from class: ez1.h.a
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return h.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    };

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67533a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.LESS_THAN_24_HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.TWENTY_FOUR_TO_48_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f67533a = iArr;
        }
    }

    @Override // ez1.c
    public final String c(Context context) {
        context.getClass();
        int i14 = b.f67533a[ordinal()];
        if (i14 == 1) {
            String string = context.getString(R.string.lbl_surface_type_all);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = context.getString(R.string.event_duration_24_hours);
            string2.getClass();
            return string2;
        }
        if (i14 != 3) {
            u0.r();
            return null;
        }
        String string3 = context.getString(R.string.event_duration_within_hours, "24", "48");
        string3.getClass();
        return string3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // ez1.c
    public final int w() {
        return ordinal();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
