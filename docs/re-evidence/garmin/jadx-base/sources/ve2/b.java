package ve2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lve2/b;", "Landroid/os/Parcelable;", "", "userName", "userEmailAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f177689b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2) {
        this.f177688a = str;
        this.f177689b = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f177688a, bVar.f177688a) && p005kotlin.jvm.internal.s.g(this.f177689b, bVar.f177689b);
    }

    public final int hashCode() {
        String str = this.f177688a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f177689b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return e0.g("CreateAccountPrefillData(userName=", this.f177688a, ", userEmailAddress=", this.f177689b, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f177688a);
        parcel.writeString(this.f177689b);
    }
}
