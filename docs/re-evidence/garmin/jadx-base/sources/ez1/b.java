package ez1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lez1/b;", "Lez1/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b implements c {
    TYPE_ALL,
    UNDER_30_MILES,
    THIRTY_TO_60_MILES,
    SIXTY_TO_80_MILES,
    EIGHTY_TO_100_MILES,
    MORE_THAN_110_MILES,
    CUSTOM;

    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: ez1.b.a
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

    /* JADX INFO: renamed from: ez1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1402b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67512a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TYPE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.UNDER_30_MILES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.THIRTY_TO_60_MILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.SIXTY_TO_80_MILES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.EIGHTY_TO_100_MILES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.MORE_THAN_110_MILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.CUSTOM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f67512a = iArr;
        }
    }

    @Override // ez1.c
    public final String c(Context context) {
        context.getClass();
        switch (C1402b.f67512a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.lbl_surface_type_all);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.lbl_distance_under, "30", context.getString(R.string.lbl_mile));
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.lbl_value_range_with_unit, "30", "60", context.getString(R.string.lbl_mile));
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.lbl_value_range_with_unit, "60", "80", context.getString(R.string.lbl_mile));
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.lbl_value_range_with_unit, "80", "110", context.getString(R.string.lbl_mile));
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.lbl_distance_more_than, "110", context.getString(R.string.lbl_mile));
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
