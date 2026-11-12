package m20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lm20/o0;", "Landroid/os/Parcelable;", "", "phoneNumber", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getPhoneNumber", "()Ljava/lang/String;", "gcm-contacts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class o0 implements Parcelable {
    public static final Parcelable.Creator<o0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneNumber")
    private final String phoneNumber;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<o0> {
        @Override // android.os.Parcelable.Creator
        public final o0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new o0(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final o0[] newArray(int i14) {
            return new o0[i14];
        }
    }

    public /* synthetic */ o0(String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o0) && p005kotlin.jvm.internal.s.g(this.phoneNumber, ((o0) obj).phoneNumber);
    }

    public final int hashCode() {
        String str = this.phoneNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return am.j.m("PhoneNumberRequestDTO(phoneNumber=", this.phoneNumber, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.phoneNumber);
    }

    public o0(String str) {
        this.phoneNumber = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
