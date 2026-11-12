package pt1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import r1.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpt1/u;", "Landroid/os/Parcelable;", "", "uri", "", "photoId", "extension", "displayName", "", "sizeMb", "", "displayOrder", "", "failedToUpload", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;DIZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f140987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f140988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f140989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f140990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f140991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f140992g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<u> {
        @Override // android.os.Parcelable.Creator
        public final u createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new u(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final u[] newArray(int i14) {
            return new u[i14];
        }
    }

    public /* synthetic */ u(String str, Long l14, String str2, String str3, double d14, int i14, boolean z14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, (i15 & 2) != 0 ? null : l14, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? 0.0d : d14, (i15 & 32) != 0 ? 0 : i14, (i15 & 64) != 0 ? false : z14);
    }

    public static u b(u uVar, String str, Long l14, int i14, boolean z14, int i15) {
        if ((i15 & 1) != 0) {
            str = uVar.f140986a;
        }
        String str2 = str;
        if ((i15 & 2) != 0) {
            l14 = uVar.f140987b;
        }
        Long l15 = l14;
        String str3 = uVar.f140988c;
        String str4 = uVar.f140989d;
        double d14 = uVar.f140990e;
        if ((i15 & 32) != 0) {
            i14 = uVar.f140991f;
        }
        int i16 = i14;
        if ((i15 & 64) != 0) {
            z14 = uVar.f140992g;
        }
        uVar.getClass();
        str2.getClass();
        return new u(str2, l15, str3, str4, d14, i16, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return p005kotlin.jvm.internal.s.g(this.f140986a, uVar.f140986a) && p005kotlin.jvm.internal.s.g(this.f140987b, uVar.f140987b) && p005kotlin.jvm.internal.s.g(this.f140988c, uVar.f140988c) && p005kotlin.jvm.internal.s.g(this.f140989d, uVar.f140989d) && Double.compare(this.f140990e, uVar.f140990e) == 0 && this.f140991f == uVar.f140991f && this.f140992g == uVar.f140992g;
    }

    public final int hashCode() {
        int iHashCode = this.f140986a.hashCode() * 31;
        Long l14 = this.f140987b;
        int iHashCode2 = (iHashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        String str = this.f140988c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f140989d;
        return Boolean.hashCode(this.f140992g) + q2.d(this.f140991f, org.apache.commons.lang3.e.b((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f140990e), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("TrailReviewPhotoState(uri=");
        sb3.append(this.f140986a);
        sb3.append(", photoId=");
        sb3.append(this.f140987b);
        sb3.append(", extension=");
        sn.a.t(sb3, this.f140988c, ", displayName=", this.f140989d, ", sizeMb=");
        sb3.append(this.f140990e);
        sb3.append(", displayOrder=");
        sb3.append(this.f140991f);
        return com.airbnb.lottie.animation.keyframe.a.i(sb3, ", failedToUpload=", this.f140992g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f140986a);
        Long l14 = this.f140987b;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f140988c);
        parcel.writeString(this.f140989d);
        parcel.writeDouble(this.f140990e);
        parcel.writeInt(this.f140991f);
        parcel.writeInt(this.f140992g ? 1 : 0);
    }

    public u(String str, Long l14, String str2, String str3, double d14, int i14, boolean z14) {
        str.getClass();
        this.f140986a = str;
        this.f140987b = l14;
        this.f140988c = str2;
        this.f140989d = str3;
        this.f140990e = d14;
        this.f140991f = i14;
        this.f140992g = z14;
    }
}
