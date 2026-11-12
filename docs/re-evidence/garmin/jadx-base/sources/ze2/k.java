package ze2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lze2/k;", "Landroid/os/Parcelable;", "Lze2/l;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "message", "<init>", "(Lze2/l;Ljava/lang/String;)V", "Landroid/os/Parcel;", "source", "(Landroid/os/Parcel;)V", "b", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f204311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f204312b;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ze2/k$a", "Landroid/os/Parcelable$Creator;", "Lze2/k;", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    static {
        new b(null);
        CREATOR = new a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k(Parcel parcel) {
        parcel.getClass();
        String string = parcel.readString();
        string.getClass();
        this(l.valueOf(string), parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f204311a == kVar.f204311a && s.g(this.f204312b, kVar.f204312b);
    }

    public final int hashCode() {
        int iHashCode = this.f204311a.hashCode() * 31;
        String str = this.f204312b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "MFAError(type=" + this.f204311a + ", message=" + this.f204312b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f204311a.name());
        parcel.writeString(this.f204312b);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lze2/k$b;", "", "<init>", "()V", "mobile-auth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ k(l lVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, (i14 & 2) != 0 ? null : str);
    }

    public k(l lVar, String str) {
        lVar.getClass();
        this.f204311a = lVar;
        this.f204312b = str;
    }
}
