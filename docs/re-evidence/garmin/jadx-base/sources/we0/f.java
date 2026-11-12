package we0;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwe0/f;", "Landroid/os/Parcelable;", "", "headline", "hint", "", "maxChars", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f184751c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f(parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public f(String str, String str2, int i14) {
        str.getClass();
        str2.getClass();
        this.f184749a = str;
        this.f184750b = str2;
        this.f184751c = i14;
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
        return s.g(this.f184749a, fVar.f184749a) && s.g(this.f184750b, fVar.f184750b) && this.f184751c == fVar.f184751c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f184751c) + wr.g.j(this.f184749a.hashCode() * 31, 31, this.f184750b);
    }

    public final String toString() {
        return j.q(p6.b.i("FeedbackInputConfig(headline=", this.f184749a, ", hint=", this.f184750b, ", maxChars="), this.f184751c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f184749a);
        parcel.writeString(this.f184750b);
        parcel.writeInt(this.f184751c);
    }

    public /* synthetic */ f(String str, String str2, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i15 & 4) != 0 ? 500 : i14);
    }
}
