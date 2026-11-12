package fu1;

import android.os.Parcel;
import android.os.Parcelable;
import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\rBg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lfu1/h;", "Landroid/os/Parcelable;", "", "articleId", "title", "date", "deck", "durationLabel", "screenTitle", "imageUrl", "paragraph", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f73517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f73518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f73520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f73521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f73522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f73523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f73524h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return p005kotlin.jvm.internal.s.g(this.f73517a, hVar.f73517a) && p005kotlin.jvm.internal.s.g(this.f73518b, hVar.f73518b) && p005kotlin.jvm.internal.s.g(this.f73519c, hVar.f73519c) && p005kotlin.jvm.internal.s.g(this.f73520d, hVar.f73520d) && p005kotlin.jvm.internal.s.g(this.f73521e, hVar.f73521e) && p005kotlin.jvm.internal.s.g(this.f73522f, hVar.f73522f) && p005kotlin.jvm.internal.s.g(this.f73523g, hVar.f73523g) && p005kotlin.jvm.internal.s.g(this.f73524h, hVar.f73524h);
    }

    public final int hashCode() {
        String str = this.f73517a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f73518b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73519c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73520d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f73521e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f73522f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f73523g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f73524h;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f73517a;
        String str2 = this.f73518b;
        String str3 = this.f73520d;
        String str4 = this.f73521e;
        String str5 = this.f73522f;
        String str6 = this.f73523g;
        String str7 = this.f73524h;
        StringBuilder sbI = p6.b.i("ArticleDTO(articleId=", str, ", title=", str2, ", date=");
        sn.a.t(sbI, this.f73519c, ", deck=", str3, ", durationLabel=");
        sn.a.t(sbI, str4, ", screenTitle=", str5, ", imageUrl=");
        return e5.h(sbI, str6, ", paragraph=", str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f73517a);
        parcel.writeString(this.f73518b);
        parcel.writeString(this.f73519c);
        parcel.writeString(this.f73520d);
        parcel.writeString(this.f73521e);
        parcel.writeString(this.f73522f);
        parcel.writeString(this.f73523g);
        parcel.writeString(this.f73524h);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfu1/h$a;", "", "<init>", "()V", "", "DATE_FORMAT", "Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public h(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.f73517a = str;
        this.f73518b = str2;
        this.f73519c = str3;
        this.f73520d = str4;
        this.f73521e = str5;
        this.f73522f = str6;
        this.f73523g = str7;
        this.f73524h = str8;
    }

    public h() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
