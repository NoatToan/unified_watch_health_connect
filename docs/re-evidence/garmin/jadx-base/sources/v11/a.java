package v11;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lv11/a;", "Landroid/os/Parcelable;", "", "mealId", "Lb11/b;", "consumableType", "<init>", "(Ljava/lang/Long;Lb11/b;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3247a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f174666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b11.b f174667b;

    /* JADX INFO: renamed from: v11.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3247a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), b11.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Long l14, b11.b bVar) {
        bVar.getClass();
        this.f174666a = l14;
        this.f174667b = bVar;
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
        return s.g(this.f174666a, aVar.f174666a) && this.f174667b == aVar.f174667b;
    }

    public final int hashCode() {
        Long l14 = this.f174666a;
        return this.f174667b.hashCode() + ((l14 == null ? 0 : l14.hashCode()) * 31);
    }

    public final String toString() {
        return "ImageRecognitionLogResult(mealId=" + this.f174666a + ", consumableType=" + this.f174667b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f174666a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f174667b.name());
    }
}
