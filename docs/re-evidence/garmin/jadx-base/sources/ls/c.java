package ls;

import am.j;
import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lls/c;", "Landroid/os/Parcelable;", "Lls/d;", NotificationConstants.KEY_DATA_MIME_TYPE, "Lcom/garmin/android/library/mapsdkadapter/f;", "point", "", "title", "<init>", "(Lls/d;Lcom/garmin/android/library/mapsdkadapter/f;Ljava/lang/String;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f114477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f114478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f114479c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(d.valueOf(parcel.readString()), (com.garmin.android.library.mapsdkadapter.f) parcel.readParcelable(c.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    static {
        com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
    }

    public c(d dVar, com.garmin.android.library.mapsdkadapter.f fVar, String str) {
        dVar.getClass();
        fVar.getClass();
        str.getClass();
        this.f114477a = dVar;
        this.f114478b = fVar;
        this.f114479c = str;
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
        return this.f114477a == cVar.f114477a && s.g(this.f114478b, cVar.f114478b) && s.g(this.f114479c, cVar.f114479c);
    }

    public final int hashCode() {
        return this.f114479c.hashCode() + ((this.f114478b.hashCode() + (this.f114477a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("MapMarkerData(type=");
        sb3.append(this.f114477a);
        sb3.append(", point=");
        sb3.append(this.f114478b);
        sb3.append(", title=");
        return j.o(this.f114479c, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f114477a.name());
        parcel.writeParcelable(this.f114478b, i14);
        parcel.writeString(this.f114479c);
    }

    public /* synthetic */ c(d dVar, com.garmin.android.library.mapsdkadapter.f fVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? d.START : dVar, fVar, str);
    }
}
