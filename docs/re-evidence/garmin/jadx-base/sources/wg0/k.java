package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwg0/k;", "Lwg0/f;", "Landroid/os/Parcelable;", "", "activityId", "", "videoId", "url", "<init>", "(JLjava/lang/String;Ljava/lang/String;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k extends f implements Parcelable {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f185098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f185099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f185100c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(parcel.readLong(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j8, String str, String str2) {
        super(null);
        str.getClass();
        str2.getClass();
        this.f185098a = j8;
        this.f185099b = str;
        this.f185100c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f185098a == kVar.f185098a && s.g(this.f185099b, kVar.f185099b) && s.g(this.f185100c, kVar.f185100c);
    }

    public final int hashCode() {
        return this.f185100c.hashCode() + wr.g.j(Long.hashCode(this.f185098a) * 31, 31, this.f185099b);
    }

    public final String toString() {
        return e0.h(com.airbnb.lottie.animation.keyframe.a.k(this.f185098a, "ActivityFeedVideo(activityId=", ", videoId=", this.f185099b), ", url=", this.f185100c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeLong(this.f185098a);
        parcel.writeString(this.f185099b);
        parcel.writeString(this.f185100c);
    }
}
