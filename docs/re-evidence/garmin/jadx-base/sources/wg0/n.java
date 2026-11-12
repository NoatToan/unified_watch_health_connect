package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwg0/n;", "Landroid/os/Parcelable;", "", "displayName", "fullName", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185118c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public n(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.f185116a = str;
        this.f185117b = str2;
        this.f185118c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f185116a.equals(nVar.f185116a) && this.f185117b.equals(nVar.f185117b) && s.g(this.f185118c, nVar.f185118c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f185116a.hashCode() * 31, 31, this.f185117b);
        String str = this.f185118c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return am.j.o(this.f185118c, ")", p6.b.i("LikeProfileInfo(displayName=", this.f185116a, ", fullName=", this.f185117b, ", imageUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f185116a);
        parcel.writeString(this.f185117b);
        parcel.writeString(this.f185118c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwg0/n$a;", "", "<init>", "()V", "", "PROFILE_IMAGE_COUNT", "I", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
