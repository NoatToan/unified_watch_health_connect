package yx2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyx2/a;", "Landroid/os/Parcelable;", "", "customerGUID", "Lve2/e;", "environment", "oAuth2AccessToken", "<init>", "(Ljava/lang/String;Lve2/e;Ljava/lang/String;)V", "subscriptions-purchase_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3744a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f200043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ve2.e f200044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f200045c;

    /* JADX INFO: renamed from: yx2.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3744a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), ve2.e.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, ve2.e eVar, String str2) {
        str.getClass();
        eVar.getClass();
        this.f200043a = str;
        this.f200044b = eVar;
        this.f200045c = str2;
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
        return this.f200043a.equals(aVar.f200043a) && this.f200044b == aVar.f200044b && s.g(this.f200045c, aVar.f200045c);
    }

    public final int hashCode() {
        int iHashCode = (this.f200044b.hashCode() + (this.f200043a.hashCode() * 31)) * 31;
        String str = this.f200045c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CustomerDTO(customerGUID=");
        sb3.append(this.f200043a);
        sb3.append(", environment=");
        sb3.append(this.f200044b);
        sb3.append(", oAuth2AccessToken=");
        return am.j.o(this.f200045c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f200043a);
        parcel.writeString(this.f200044b.name());
        parcel.writeString(this.f200045c);
    }
}
