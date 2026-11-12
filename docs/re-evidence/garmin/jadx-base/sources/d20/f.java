package d20;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import s92.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld20/f;", "Landroid/os/Parcelable;", "Ls92/g;", "consentTextDTO", "Ld20/d;", "consentPartnerConsumerDTO", "<init>", "(Ls92/g;Ld20/d;)V", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f57283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f57284b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<f> {
        @Override // android.os.Parcelable.Creator
        public final f createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new f((g) parcel.readParcelable(f.class.getClassLoader()), (d) parcel.readParcelable(f.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final f[] newArray(int i14) {
            return new f[i14];
        }
    }

    public /* synthetic */ f(g gVar, d dVar, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : gVar, (i14 & 2) != 0 ? null : dVar);
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
        return s.g(this.f57283a, fVar.f57283a) && s.g(this.f57284b, fVar.f57284b);
    }

    public final int hashCode() {
        g gVar = this.f57283a;
        int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
        d dVar = this.f57284b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public final String toString() {
        return "ConsentThirdPartyDTO(consentTextDTO=" + this.f57283a + ", consentPartnerConsumerDTO=" + this.f57284b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f57283a, i14);
        parcel.writeParcelable(this.f57284b, i14);
    }

    public f(g gVar, d dVar) {
        this.f57283a = gVar;
        this.f57284b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
