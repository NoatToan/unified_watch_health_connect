package ez1;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lez1/g;", "Lez1/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum g implements c {
    TYPE_ALL,
    ZERO_TO_5K,
    FIVE_K_TO_10K,
    TEN_K_TO_HALF_MARATHON,
    HALF_MARATHON_TO_MARATHON,
    GREATER_THAN_MARATHON;

    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator<g>() { // from class: ez1.g.a
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return g.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    };

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67528a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.TYPE_ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.ZERO_TO_5K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.FIVE_K_TO_10K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.TEN_K_TO_HALF_MARATHON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.HALF_MARATHON_TO_MARATHON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g.GREATER_THAN_MARATHON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f67528a = iArr;
        }
    }

    @Override // ez1.c
    public final String c(Context context) {
        context.getClass();
        switch (b.f67528a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.lbl_surface_type_all);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.event_distance_5k);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.event_distance_within_range, "5", "10");
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.event_distance_half_marathon);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.event_distance_marathon);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.event_distance_greater_marathon);
                string6.getClass();
                return string6;
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
