package aa1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Laa1/b;", "Landroid/os/Parcelable;", "", "title", "message", "Lq91/d;", "personalRecordType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lq91/d;)V", "gcm-personal-records_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q91.d f2232c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), (q91.d) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(String str, String str2, q91.d dVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? null : dVar);
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
        return s.g(this.f2230a, bVar.f2230a) && s.g(this.f2231b, bVar.f2231b) && this.f2232c == bVar.f2232c;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f2230a.hashCode() * 31, 31, this.f2231b);
        q91.d dVar = this.f2232c;
        return iJ + (dVar == null ? 0 : dVar.hashCode());
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("EmptyPersonalRecordScreenState(title=", this.f2230a, ", message=", this.f2231b, ", personalRecordType=");
        sbI.append(this.f2232c);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f2230a);
        parcel.writeString(this.f2231b);
        parcel.writeParcelable(this.f2232c, i14);
    }

    public b(String str, String str2, q91.d dVar) {
        str.getClass();
        str2.getClass();
        this.f2230a = str;
        this.f2231b = str2;
        this.f2232c = dVar;
    }

    public b() {
        this(null, null, null, 7, null);
    }
}
