package bq0;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbq0/k;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "uri", "", "displayName", "extension", "", "sizeMb", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;D)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f19509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f19512d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k((Uri) parcel.readParcelable(k.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(Uri uri, String str, String str2, double d14) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        this.f19509a = uri;
        this.f19510b = str;
        this.f19511c = str2;
        this.f19512d = d14;
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
        return this.f19509a.equals(kVar.f19509a) && this.f19510b.equals(kVar.f19510b) && this.f19511c.equals(kVar.f19511c) && Double.compare(this.f19512d, kVar.f19512d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f19512d) + wr.g.j(wr.g.j(this.f19509a.hashCode() * 31, 31, this.f19510b), 31, this.f19511c);
    }

    public final String toString() {
        return "StorageImage(uri=" + this.f19509a + ", displayName=" + this.f19510b + ", extension=" + this.f19511c + ", sizeMb=" + this.f19512d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f19509a, i14);
        parcel.writeString(this.f19510b);
        parcel.writeString(this.f19511c);
        parcel.writeDouble(this.f19512d);
    }
}
