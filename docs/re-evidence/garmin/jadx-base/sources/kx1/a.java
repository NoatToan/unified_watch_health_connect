package kx1;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p6.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkx1/a;", "Landroid/os/Parcelable;", "", "exerciseKey", "category", "translation", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C2065a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f107116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f107117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f107118c;

    /* JADX INFO: renamed from: kx1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C2065a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(String str, String str2, String str3) {
        this.f107116a = str;
        this.f107117b = str2;
        this.f107118c = str3;
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
        return s.g(this.f107116a, aVar.f107116a) && s.g(this.f107117b, aVar.f107117b) && s.g(this.f107118c, aVar.f107118c);
    }

    public final int hashCode() {
        String str = this.f107116a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f107117b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f107118c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return j.o(this.f107118c, ")", b.i("TranslatedExercise(exerciseKey=", this.f107116a, ", category=", this.f107117b, ", translation="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f107116a);
        parcel.writeString(this.f107117b);
        parcel.writeString(this.f107118c);
    }
}
