package f20;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf20/p;", "Landroid/os/Parcelable;", "", "displayName", "name", "profileImageUrlMedium", FirebaseAnalytics.Param.LOCATION, "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f68420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f68422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f68423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f68424e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public /* synthetic */ p(String str, String str2, String str3, String str4, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? "" : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? "" : str4, (i14 & 16) != 0 ? false : z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.f68420a, pVar.f68420a) && p005kotlin.jvm.internal.s.g(this.f68421b, pVar.f68421b) && p005kotlin.jvm.internal.s.g(this.f68422c, pVar.f68422c) && p005kotlin.jvm.internal.s.g(this.f68423d, pVar.f68423d) && this.f68424e == pVar.f68424e;
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f68420a.hashCode() * 31, 31, this.f68421b);
        String str = this.f68422c;
        return Boolean.hashCode(this.f68424e) + wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f68423d);
    }

    public final String toString() {
        boolean z14 = this.f68424e;
        StringBuilder sbI = p6.b.i("ContactProfileListItem(displayName=", this.f68420a, ", name=", this.f68421b, ", profileImageUrlMedium=");
        sn.a.t(sbI, this.f68422c, ", location=", this.f68423d, ", isSelected=");
        return hb.a.k(sbI, z14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f68420a);
        parcel.writeString(this.f68421b);
        parcel.writeString(this.f68422c);
        parcel.writeString(this.f68423d);
        parcel.writeInt(this.f68424e ? 1 : 0);
    }

    public p(String str, String str2, String str3, String str4, boolean z14) {
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str4);
        this.f68420a = str;
        this.f68421b = str2;
        this.f68422c = str3;
        this.f68423d = str4;
        this.f68424e = z14;
    }

    public p() {
        this(null, null, null, null, false, 31, null);
    }
}
