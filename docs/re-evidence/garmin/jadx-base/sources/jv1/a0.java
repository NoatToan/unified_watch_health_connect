package jv1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ljv1/a0;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum a0 implements Parcelable {
    RUNNING,
    CYCLING;

    public static final Parcelable.Creator<a0> CREATOR = new Parcelable.Creator<a0>() { // from class: jv1.a0.a
        @Override // android.os.Parcelable.Creator
        public final a0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return a0.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a0[] newArray(int i14) {
            return new a0[i14];
        }
    };

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
