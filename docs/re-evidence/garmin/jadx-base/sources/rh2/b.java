package rh2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nBC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lrh2/b;", "Landroid/os/Parcelable;", "", "watchFace", "watchFaceOverflow", "watchFaceFallback", "watchFaceOverflowFallback", "previewType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f152762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f152763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f152764e;

    /* JADX INFO: renamed from: rh2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C2883b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    static {
        new a(null);
        CREATOR = new C2883b();
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5);
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
        return s.g(this.f152760a, bVar.f152760a) && s.g(this.f152761b, bVar.f152761b) && s.g(this.f152762c, bVar.f152762c) && s.g(this.f152763d, bVar.f152763d) && s.g(this.f152764e, bVar.f152764e);
    }

    public final int hashCode() {
        String str = this.f152760a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f152761b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f152762c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f152763d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f152764e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("ControlsMenuViewAttribute(watchFace=", this.f152760a, ", watchFaceOverflow=", this.f152761b, ", watchFaceFallback=");
        sn.a.t(sbI, this.f152762c, ", watchFaceOverflowFallback=", this.f152763d, ", previewType=");
        return am.j.o(this.f152764e, ")", sbI);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f152760a);
        parcel.writeString(this.f152761b);
        parcel.writeString(this.f152762c);
        parcel.writeString(this.f152763d);
        parcel.writeString(this.f152764e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrh2/b$a;", "", "<init>", "()V", "", "VIEW_ATTR_BUNDLE", "Ljava/lang/String;", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, String str3, String str4, String str5) {
        this.f152760a = str;
        this.f152761b = str2;
        this.f152762c = str3;
        this.f152763d = str4;
        this.f152764e = str5;
    }

    public b() {
        this(null, null, null, null, null, 31, null);
    }
}
