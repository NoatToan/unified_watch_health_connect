package si1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lsi1/r;", "Landroid/os/Parcelable;", "", "subscriptionTitle", "subscriptionRenewDateText", "Landroid/net/Uri;", "manageSubscriptionUri", "suspendedSosPlanChangeDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f159431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f159432d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(r.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(String str, String str2, Uri uri, String str3) {
        str.getClass();
        str2.getClass();
        this.f159429a = str;
        this.f159430b = str2;
        this.f159431c = uri;
        this.f159432d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.f159429a, rVar.f159429a) && p005kotlin.jvm.internal.s.g(this.f159430b, rVar.f159430b) && p005kotlin.jvm.internal.s.g(this.f159431c, rVar.f159431c) && p005kotlin.jvm.internal.s.g(this.f159432d, rVar.f159432d);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f159429a.hashCode() * 31, 31, this.f159430b);
        Uri uri = this.f159431c;
        int iHashCode = (iJ + (uri == null ? 0 : uri.hashCode())) * 31;
        String str = this.f159432d;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("InReachSubscriptionViewState(subscriptionTitle=", this.f159429a, ", subscriptionRenewDateText=", this.f159430b, ", manageSubscriptionUri=");
        sbI.append(this.f159431c);
        sbI.append(", suspendedSosPlanChangeDescription=");
        sbI.append(this.f159432d);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f159429a);
        parcel.writeString(this.f159430b);
        parcel.writeParcelable(this.f159431c, i14);
        parcel.writeString(this.f159432d);
    }

    public /* synthetic */ r(String str, String str2, Uri uri, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? null : uri, (i14 & 8) != 0 ? null : str3);
    }
}
