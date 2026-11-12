package kt1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q6.f;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lkt1/b;", "Landroid/os/Parcelable;", "", "imageId", "", "imageUrl", "imagePreviewUrl", "imageTimestamp", "imageFormattedTimestamp", "", "imageHelpfulCount", "displayOrder", "", "hidden", "requesterOwned", "<init>", "(JLjava/lang/String;Ljava/lang/String;JLjava/lang/String;IIZZ)V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f106447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f106448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f106450d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f106451e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f106452f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f106453g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f106454h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f106455i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(long j8, String str, String str2, long j14, String str3, int i14, int i15, boolean z14, boolean z15, int i16, j jVar) {
        this(j8, (i16 & 2) != 0 ? null : str, (i16 & 4) != 0 ? null : str2, j14, str3, i14, i15, (i16 & 128) != 0 ? false : z14, (i16 & 256) != 0 ? false : z15);
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
        return this.f106447a == bVar.f106447a && s.g(this.f106448b, bVar.f106448b) && s.g(this.f106449c, bVar.f106449c) && this.f106450d == bVar.f106450d && s.g(this.f106451e, bVar.f106451e) && this.f106452f == bVar.f106452f && this.f106453g == bVar.f106453g && this.f106454h == bVar.f106454h && this.f106455i == bVar.f106455i;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f106447a) * 31;
        String str = this.f106448b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f106449c;
        return Boolean.hashCode(this.f106455i) + f.g(q2.d(this.f106453g, q2.d(this.f106452f, g.j(f.e((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f106450d), 31, this.f106451e), 31), 31), 31, this.f106454h);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f106447a, "CoverImageData(imageId=", ", imageUrl=", this.f106448b);
        am.j.y(sbK, ", imagePreviewUrl=", this.f106449c, ", imageTimestamp=");
        p6.b.k(this.f106450d, ", imageFormattedTimestamp=", this.f106451e, sbK);
        androidx.core.view.j.m(this.f106452f, this.f106453g, ", imageHelpfulCount=", ", displayOrder=", sbK);
        com.airbnb.lottie.animation.keyframe.a.v(", hidden=", ", requesterOwned=", sbK, this.f106454h, this.f106455i);
        sbK.append(")");
        return sbK.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f106447a);
        parcel.writeString(this.f106448b);
        parcel.writeString(this.f106449c);
        parcel.writeLong(this.f106450d);
        parcel.writeString(this.f106451e);
        parcel.writeInt(this.f106452f);
        parcel.writeInt(this.f106453g);
        parcel.writeInt(this.f106454h ? 1 : 0);
        parcel.writeInt(this.f106455i ? 1 : 0);
    }

    public b(long j8, String str, String str2, long j14, String str3, int i14, int i15, boolean z14, boolean z15) {
        str3.getClass();
        this.f106447a = j8;
        this.f106448b = str;
        this.f106449c = str2;
        this.f106450d = j14;
        this.f106451e = str3;
        this.f106452f = i14;
        this.f106453g = i15;
        this.f106454h = z14;
        this.f106455i = z15;
    }
}
