package po;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Lpo/x;", "Landroid/os/Parcelable;", "Lcom/garmin/android/library/mapsdkadapter/f;", ModelSourceWrapper.POSITION, "Lpo/y;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Lcom/garmin/android/library/mapsdkadapter/f;Lpo/y;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class x implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.library.mapsdkadapter.f f138992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f138993b;

    static {
        com.garmin.android.library.mapsdkadapter.f.a aVar = com.garmin.android.library.mapsdkadapter.f.f50281c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(Parcel parcel) {
        this(new com.garmin.android.library.mapsdkadapter.f(parcel.readDouble(), parcel.readDouble(), com.garmin.android.library.mapsdkadapter.i.b.values()[parcel.readInt()]), y.values()[parcel.readInt()]);
        parcel.getClass();
    }

    public final boolean b() {
        com.garmin.android.library.mapsdkadapter.f fVar = this.f138992a;
        return (Double.isNaN(fVar.f50283a.latitude) || Double.isNaN(fVar.f50283a.longitude)) ? false : true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return p005kotlin.jvm.internal.s.g(this.f138992a, xVar.f138992a) && this.f138993b == xVar.f138993b;
    }

    public final int hashCode() {
        return this.f138993b.hashCode() + (this.f138992a.hashCode() * 31);
    }

    public final String toString() {
        return "Location(position=" + this.f138992a + ", type=" + this.f138993b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        com.garmin.android.library.mapsdkadapter.f fVar = this.f138992a;
        parcel.writeDouble(fVar.f50283a.latitude);
        parcel.writeDouble(fVar.f50283a.longitude);
        parcel.writeInt(fVar.f50284b.ordinal());
        parcel.writeInt(this.f138993b.ordinal());
    }

    /* JADX INFO: renamed from: po.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpo/x$a;", "Landroid/os/Parcelable$Creator;", "Lpo/x;", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<x> {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final x createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new x(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final x[] newArray(int i14) {
            return new x[i14];
        }

        private Companion() {
        }
    }

    public /* synthetic */ x(com.garmin.android.library.mapsdkadapter.f fVar, y yVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(fVar, (i14 & 2) != 0 ? y.START : yVar);
    }

    public x(com.garmin.android.library.mapsdkadapter.f fVar, y yVar) {
        fVar.getClass();
        yVar.getClass();
        this.f138992a = fVar;
        this.f138993b = yVar;
    }
}
