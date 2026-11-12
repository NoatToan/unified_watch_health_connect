package zq2;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzq2/f;", "Landroid/os/Parcelable;", "Lms2/a;", "cardIcon", "", "text", "subtext", "<init>", "(Lms2/a;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ms2.a f206676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f206677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f206678c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f((ms2.a) parcel.readParcelable(f.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(ms2.a aVar, String str, String str2) {
        aVar.getClass();
        str.getClass();
        this.f206676a = aVar;
        this.f206677b = str;
        this.f206678c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return s.g(this.f206676a, fVar.f206676a) && s.g(this.f206677b, fVar.f206677b) && s.g(this.f206678c, fVar.f206678c);
    }

    public final int hashCode() {
        int iJ = wr.g.j(this.f206676a.hashCode() * 31, 31, this.f206677b);
        String str = this.f206678c;
        return iJ + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("CardItemUIModel(cardIcon=");
        sb3.append(this.f206676a);
        sb3.append(", text=");
        sb3.append(this.f206677b);
        sb3.append(", subtext=");
        return am.j.o(this.f206678c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f206676a, i14);
        parcel.writeString(this.f206677b);
        parcel.writeString(this.f206678c);
    }

    public /* synthetic */ f(ms2.a aVar, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(aVar, str, (i14 & 4) != 0 ? null : str2);
    }
}
