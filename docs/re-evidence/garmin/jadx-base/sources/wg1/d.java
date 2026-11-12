package wg1;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwg1/d;", "Landroid/os/Parcelable;", "Lwg1/j;", "generalUseConfiguration", "duringActivityConfiguration", "", "timeoutEnabled", "genericPrivacyEnabled", "<init>", "(Lwg1/j;Lwg1/j;ZZ)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f185125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f185126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f185127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f185128d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            Parcelable.Creator<j> creator = j.CREATOR;
            return new d(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(j jVar, j jVar2, boolean z14, boolean z15, int i14, p005kotlin.jvm.internal.j jVar3) {
        this((i14 & 1) != 0 ? new j(false, false, 3, null) : jVar, (i14 & 2) != 0 ? new j(false, false, 3, null) : jVar2, (i14 & 4) != 0 ? true : z14, (i14 & 8) != 0 ? true : z15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f185125a, dVar.f185125a) && s.g(this.f185126b, dVar.f185126b) && this.f185127c == dVar.f185127c && this.f185128d == dVar.f185128d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f185128d) + q6.f.g((this.f185126b.hashCode() + (this.f185125a.hashCode() * 31)) * 31, 31, this.f185127c);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SmartNotificationsConfiguration(generalUseConfiguration=");
        sb3.append(this.f185125a);
        sb3.append(", duringActivityConfiguration=");
        sb3.append(this.f185126b);
        sb3.append(", timeoutEnabled=");
        return com.airbnb.lottie.animation.keyframe.a.f(", genericPrivacyEnabled=", ")", sb3, this.f185127c, this.f185128d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f185125a.writeToParcel(parcel, i14);
        this.f185126b.writeToParcel(parcel, i14);
        parcel.writeInt(this.f185127c ? 1 : 0);
        parcel.writeInt(this.f185128d ? 1 : 0);
    }

    public d(j jVar, j jVar2, boolean z14, boolean z15) {
        jVar.getClass();
        jVar2.getClass();
        this.f185125a = jVar;
        this.f185126b = jVar2;
        this.f185127c = z14;
        this.f185128d = z15;
    }

    public d() {
        this(null, null, false, false, 15, null);
    }
}
