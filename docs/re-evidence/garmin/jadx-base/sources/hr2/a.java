package hr2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sd2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lhr2/a;", "Landroid/os/Parcelable;", "", "pageTitle", "Lis2/b;", "serviceProviderType", "Lsd2/f;", "deviceRecord", "actionUrlSuffix", "<init>", "(Ljava/lang/String;Lis2/b;Lsd2/f;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1692a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final is2.b f85289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f85290c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f85291d;

    /* JADX INFO: renamed from: hr2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1692a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), is2.b.valueOf(parcel.readString()), (f) parcel.readParcelable(a.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, is2.b bVar, f fVar, String str2) {
        str.getClass();
        bVar.getClass();
        fVar.getClass();
        this.f85288a = str;
        this.f85289b = bVar;
        this.f85290c = fVar;
        this.f85291d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.g(this.f85288a, aVar.f85288a) && this.f85289b == aVar.f85289b && s.g(this.f85290c, aVar.f85290c) && s.g(this.f85291d, aVar.f85291d);
    }

    public final int hashCode() {
        int iHashCode = (this.f85290c.hashCode() + ((this.f85289b.hashCode() + (this.f85288a.hashCode() * 31)) * 31)) * 31;
        String str = this.f85291d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ProviderWebViewDataModel(pageTitle=" + this.f85288a + ", serviceProviderType=" + this.f85289b + ", deviceRecord=" + this.f85290c + ", actionUrlSuffix=" + this.f85291d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f85288a);
        parcel.writeString(this.f85289b.name());
        parcel.writeParcelable(this.f85290c, i14);
        parcel.writeString(this.f85291d);
    }

    public /* synthetic */ a(String str, is2.b bVar, f fVar, String str2, int i14, j jVar) {
        this(str, bVar, fVar, (i14 & 8) != 0 ? null : str2);
    }
}
