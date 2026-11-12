package k30;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk30/a;", "Landroid/os/Parcelable;", "", "gmapClimbId", "", "gmapClimbFileId", "Lcom/garmin/android/apps/connectmobile/courses/model/b;", "category", "Lcom/garmin/android/library/mapsdkadapter/f;", "startGeoPoint", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/courses/model/b;Lcom/garmin/android/library/mapsdkadapter/f;)V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1968a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f102522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f102523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.courses.model.b f102524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f102525d;

    /* JADX INFO: renamed from: k30.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C1968a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new a(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), com.garmin.android.apps.connectmobile.courses.model.b.valueOf(parcel.readString()), (com.garmin.android.library.mapsdkadapter.f) parcel.readParcelable(a.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    static {
        com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
    }

    public a(Long l14, String str, com.garmin.android.apps.connectmobile.courses.model.b bVar, com.garmin.android.library.mapsdkadapter.f fVar) {
        bVar.getClass();
        fVar.getClass();
        this.f102522a = l14;
        this.f102523b = str;
        this.f102524c = bVar;
        this.f102525d = fVar;
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
        return p005kotlin.jvm.internal.s.g(this.f102522a, aVar.f102522a) && p005kotlin.jvm.internal.s.g(this.f102523b, aVar.f102523b) && this.f102524c == aVar.f102524c && this.f102525d.equals(aVar.f102525d);
    }

    public final int hashCode() {
        Long l14 = this.f102522a;
        int iHashCode = (l14 == null ? 0 : l14.hashCode()) * 31;
        String str = this.f102523b;
        return this.f102525d.hashCode() + ((this.f102524c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbJ = b71.i.j("BriefClimbDTO(gmapClimbId=", ", gmapClimbFileId=", this.f102523b, this.f102522a, ", category=");
        sbJ.append(this.f102524c);
        sbJ.append(", startGeoPoint=");
        sbJ.append(this.f102525d);
        sbJ.append(")");
        return sbJ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Long l14 = this.f102522a;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
        parcel.writeString(this.f102523b);
        parcel.writeString(this.f102524c.name());
        parcel.writeParcelable(this.f102525d, i14);
    }
}
