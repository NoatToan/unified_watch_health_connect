package cy2;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcy2/b;", "Landroid/os/Parcelable;", "", "title", "message", "cancelButtonText", "exitButtonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f56806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f56807d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(String str, String str2, String str3, String str4) {
        kg.f.p(str, str2, str3, str4);
        this.f56804a = str;
        this.f56805b = str2;
        this.f56806c = str3;
        this.f56807d = str4;
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
        return this.f56804a.equals(bVar.f56804a) && this.f56805b.equals(bVar.f56805b) && this.f56806c.equals(bVar.f56806c) && this.f56807d.equals(bVar.f56807d);
    }

    public final int hashCode() {
        return this.f56807d.hashCode() + wr.g.j(wr.g.j(this.f56804a.hashCode() * 31, 31, this.f56805b), 31, this.f56806c);
    }

    public final String toString() {
        return e5.h(p6.b.i("ExitAlertConfig(title=", this.f56804a, ", message=", this.f56805b, ", cancelButtonText="), this.f56806c, ", exitButtonText=", this.f56807d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f56804a);
        parcel.writeString(this.f56805b);
        parcel.writeString(this.f56806c);
        parcel.writeString(this.f56807d);
    }
}
