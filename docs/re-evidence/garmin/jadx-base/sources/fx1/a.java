package fx1;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.m;
import com.garmin.android.apps.connectmobile.R;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0013\b\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfx1/a;", "Landroid/os/Parcelable;", "", "", "typeKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a implements Parcelable {
    ALL(null),
    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced");

    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: fx1.a.a
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
        public static final /* synthetic */ int[] f73819a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.BEGINNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.INTERMEDIATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.ADVANCED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f73819a = iArr;
        }
    }

    a(String str) {
    }

    public final String b(m mVar) {
        int i14 = b.f73819a[ordinal()];
        if (i14 == 1) {
            String string = mVar.getString(R.string.common_all);
            string.getClass();
            return string;
        }
        if (i14 == 2) {
            String string2 = mVar.getString(R.string.lbl_beginner);
            string2.getClass();
            return string2;
        }
        if (i14 == 3) {
            String string3 = mVar.getString(R.string.lbl_intermediate);
            string3.getClass();
            return string3;
        }
        if (i14 != 4) {
            u0.r();
            return null;
        }
        String string4 = mVar.getString(R.string.lbl_advanced);
        string4.getClass();
        return string4;
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
