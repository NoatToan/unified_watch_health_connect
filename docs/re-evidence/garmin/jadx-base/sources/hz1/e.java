package hz1;

import am.j;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhz1/e;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "uri", "", "displayName", "extension", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-initiative_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f86534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f86535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86536c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e((Uri) parcel.readParcelable(e.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(Uri uri, String str, String str2) {
        uri.getClass();
        str.getClass();
        str2.getClass();
        this.f86534a = uri;
        this.f86535b = str;
        this.f86536c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f86534a.equals(eVar.f86534a) && this.f86535b.equals(eVar.f86535b) && this.f86536c.equals(eVar.f86536c);
    }

    public final int hashCode() {
        return this.f86536c.hashCode() + wr.g.j(this.f86534a.hashCode() * 31, 31, this.f86535b);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("StorageImage(uri=");
        sb3.append(this.f86534a);
        sb3.append(", displayName=");
        sb3.append(this.f86535b);
        sb3.append(", extension=");
        return j.o(this.f86536c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f86534a, i14);
        parcel.writeString(this.f86535b);
        parcel.writeString(this.f86536c);
    }
}
