package we0;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lwe0/a;", "Landroid/os/Parcelable;", "", Action.KEY_ATTRIBUTE, "text", "contentDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3420a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f184729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f184730c;

    /* JADX INFO: renamed from: we0.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3420a implements Parcelable.Creator<a> {
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
        com.airbnb.lottie.animation.keyframe.a.y(str, str2, str3);
        this.f184728a = str;
        this.f184729b = str2;
        this.f184730c = str3;
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
        return s.g(this.f184728a, aVar.f184728a) && s.g(this.f184729b, aVar.f184729b) && s.g(this.f184730c, aVar.f184730c);
    }

    public final int hashCode() {
        return this.f184730c.hashCode() + wr.g.j(this.f184728a.hashCode() * 31, 31, this.f184729b);
    }

    public final String toString() {
        return j.o(this.f184730c, ")", p6.b.i("FeedbackChip(key=", this.f184728a, ", text=", this.f184729b, ", contentDescription="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f184728a);
        parcel.writeString(this.f184729b);
        parcel.writeString(this.f184730c);
    }

    public /* synthetic */ a(String str, String str2, String str3, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, str2, (i14 & 4) != 0 ? str2 : str3);
    }
}
