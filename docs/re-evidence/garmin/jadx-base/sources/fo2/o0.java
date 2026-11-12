package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lfo2/o0;", "Landroid/os/Parcelable;", "", "pendingNotifications", "<init>", "(I)V", "a", "I", "b", "()I", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pendingNotifications")
    private final int pendingNotifications;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o0(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public o0(int i14) {
        this.pendingNotifications = i14;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getPendingNotifications() {
        return this.pendingNotifications;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && this.pendingNotifications == ((o0) obj).pendingNotifications;
    }

    public final int hashCode() {
        return Integer.hashCode(this.pendingNotifications);
    }

    public final String toString() {
        return v.e0.f(this.pendingNotifications, "Wallet(pendingNotifications=", ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.pendingNotifications);
    }
}
