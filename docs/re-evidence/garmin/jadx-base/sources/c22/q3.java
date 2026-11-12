package c22;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB1\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lc22/q3;", "Landroid/os/Parcelable;", "", "", "isMetric", "", "downMultiplier", "upMultiplier", "otherMeasuringSystemConversionMultiplier", "", "unitResId", "<init>", "(Ljava/lang/String;IZDDDI)V", "a", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum q3 implements Parcelable {
    METERS_PER_SECOND(true, 2.77777778E-4d, 3600.0d, 3.280839895013d, R.string.lbl_m_per_second),
    METERS_PER_HOUR(true, 1000.0d, 0.001d, 9.11344415E-4d, R.string.common_abbrev_meters_per_hour_string),
    KILOMETER_PER_HOUR(true, 1.0d, 1.0d, 0.911344415d, R.string.lbl_kmh),
    FEET_PER_SECOND(false, 2.77777778E-4d, 3600.0d, 0.3048d, R.string.lbl_ft_per_second),
    FEET_PER_HOUR(false, 3.0d, 0.333333333333d, 8.46666667E-5d, R.string.lbl_ft_per_hour),
    YARDS_PER_HOUR(false, 1760.0d, 5.68181818E-4d, 2.54E-4d, R.string.common_abbrev_yards_per_hour_string),
    MILE_PER_HOUR(false, 1.0d, 1.0d, 0.44704d, R.string.lbl_mph),
    NAUTICAL_MILES_PER_HOUR(false, 0.514444444d, 1.94384449d, 1.0d, R.string.lbl_nautical_speed_abr),
    AVIATION_KNOTS(false, 0.514444444d, 1.94384449d, 1.0d, R.string.lbl_aviation_speed_abr);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f23220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f23221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f23222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f23208f = new a(null);
    public static final Parcelable.Creator<q3> CREATOR = new Parcelable.Creator<q3>() { // from class: c22.q3.b
        @Override // android.os.Parcelable.Creator
        public final q3 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return q3.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final q3[] newArray(int i14) {
            return new q3[i14];
        }
    };

    q3(boolean z14, double d14, double d15, double d16, int i14) {
        this.f23219a = z14;
        this.f23220b = d14;
        this.f23221c = d15;
        this.f23222d = d16;
        this.f23223e = i14;
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc22/q3$a;", "", "<init>", "()V", "gcm-common-util_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: c22.q3$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0346a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f23224a;

            static {
                int[] iArr = new int[q3.values().length];
                try {
                    iArr[q3.METERS_PER_SECOND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[q3.METERS_PER_HOUR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[q3.KILOMETER_PER_HOUR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[q3.FEET_PER_SECOND.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[q3.FEET_PER_HOUR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[q3.YARDS_PER_HOUR.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[q3.MILE_PER_HOUR.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f23224a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
