package fx1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfx1/b;", "Landroid/os/Parcelable;", "", "", "typeKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b implements Parcelable {
    ALL(null),
    FIVE_K("5k"),
    TEN_K("10k"),
    HALF_MARATHON("HalfMarathon"),
    MARATHON("Marathon"),
    SPRINT_TRIATHLON("Sprint"),
    OLYMPIC_TRIATHLON("Olympic"),
    OTHER("RunningOther");

    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: fx1.b.a
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

    /* JADX INFO: renamed from: fx1.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C1497b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73829a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FIVE_K.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.TEN_K.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.HALF_MARATHON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.MARATHON.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.SPRINT_TRIATHLON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.OLYMPIC_TRIATHLON.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.OTHER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f73829a = iArr;
        }
    }

    b(String str) {
    }

    public final String b(m mVar) {
        switch (C1497b.f73829a[ordinal()]) {
            case 1:
                String string = mVar.getString(R.string.common_all);
                string.getClass();
                return string;
            case 2:
                String string2 = mVar.getString(R.string.stp_filter_plan_self_guided_5k);
                string2.getClass();
                return string2;
            case 3:
                String string3 = mVar.getString(R.string.stp_filter_plan_self_guided_10k);
                string3.getClass();
                return string3;
            case 4:
                String string4 = mVar.getString(R.string.stp_filter_plan_self_guided_half_marathon);
                string4.getClass();
                return string4;
            case 5:
                String string5 = mVar.getString(R.string.stp_filter_plan_self_guided_marathon);
                string5.getClass();
                return string5;
            case 6:
                String string6 = mVar.getString(R.string.stp_filter_plan_sprint_triathlon);
                string6.getClass();
                return string6;
            case 7:
                String string7 = mVar.getString(R.string.stp_filter_plan_olympic_triathlon);
                string7.getClass();
                return string7;
            case 8:
                String string8 = mVar.getString(R.string.lbl_other);
                string8.getClass();
                return string8;
            default:
                u0.r();
                return null;
        }
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
