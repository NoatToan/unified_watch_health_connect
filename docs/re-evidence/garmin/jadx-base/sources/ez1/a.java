package ez1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lez1/a;", "Lez1/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a implements c {
    TYPE_ALL,
    UNDER_50_KILOMETERS,
    FIFTY_TO_100_KILOMETERS,
    HUNDRED_TO_130_KILOMETERS,
    ONE_THIRTY_TO_180_KILOMETERS,
    MORE_THAN_180_KILOMETERS,
    CUSTOM;

    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: ez1.a.a
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return a.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    };

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67503a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.TYPE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.UNDER_50_KILOMETERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.FIFTY_TO_100_KILOMETERS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.HUNDRED_TO_130_KILOMETERS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.ONE_THIRTY_TO_180_KILOMETERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.MORE_THAN_180_KILOMETERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f67503a = iArr;
        }
    }

    @Override // ez1.c
    public final String c(Context context) {
        context.getClass();
        switch (b.f67503a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.lbl_surface_type_all);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.lbl_distance_under, "50", context.getString(R.string.lbl_km));
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.lbl_value_range_with_unit, "50", "100", context.getString(R.string.lbl_km));
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.lbl_value_range_with_unit, "100", "130", context.getString(R.string.lbl_km));
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.lbl_value_range_with_unit, "130", "180", context.getString(R.string.lbl_km));
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.lbl_distance_more_than, "180", context.getString(R.string.lbl_km));
                string6.getClass();
                return string6;
            case 7:
                String string7 = context.getString(R.string.lbl_custom);
                string7.getClass();
                return string7;
            default:
                u0.r();
                return null;
        }
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
