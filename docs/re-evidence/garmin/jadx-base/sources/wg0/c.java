package wg0;

import android.os.Parcel;
import android.os.Parcelable;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lwg0/c;", "Lwg0/f;", "Landroid/os/Parcelable;", "", ModelSourceWrapper.POSITION, "Lps/j;", "activityImageDto", "<init>", "(ILps/j;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c extends f implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f185076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ps.j f185077b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readInt(), (ps.j) parcel.readParcelable(c.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        Parcelable.Creator<ps.j> creator = ps.j.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i14, ps.j jVar) {
        super(null);
        jVar.getClass();
        this.f185076a = i14;
        this.f185077b = jVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f185076a == cVar.f185076a && s.g(this.f185077b, cVar.f185077b);
    }

    public final int hashCode() {
        return this.f185077b.hashCode() + (Integer.hashCode(this.f185076a) * 31);
    }

    public final String toString() {
        return "ActivityFeedImage(position=" + this.f185076a + ", activityImageDto=" + this.f185077b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.f185076a);
        parcel.writeParcelable(this.f185077b, i14);
    }
}
