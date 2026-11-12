package vs;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvs/c;", "Landroid/os/Parcelable;", "Lvs/b;", NotificationConstants.KEY_DATA_MIME_TYPE, "", "rawValue", "", "timestamp", "<init>", "(Lvs/b;Ljava/lang/Object;Ljava/lang/Integer;)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f179700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f179701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f179702c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(b.CREATOR.createFromParcel(parcel), parcel.readValue(c.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(b bVar, Object obj, Integer num, int i14, j jVar) {
        this(bVar, (i14 & 2) != 0 ? null : obj, (i14 & 4) != 0 ? null : num);
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
        return this.f179700a == cVar.f179700a && s.g(this.f179701b, cVar.f179701b) && s.g(this.f179702c, cVar.f179702c);
    }

    public final int hashCode() {
        int iHashCode = this.f179700a.hashCode() * 31;
        Object obj = this.f179701b;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        Integer num = this.f179702c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivityRecordingMetricData(type=");
        sb3.append(this.f179700a);
        sb3.append(", rawValue=");
        sb3.append(this.f179701b);
        sb3.append(", timestamp=");
        return f3.i(sb3, this.f179702c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.f179700a.writeToParcel(parcel, i14);
        parcel.writeValue(this.f179701b);
        Integer num = this.f179702c;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public c(b bVar, Object obj, Integer num) {
        bVar.getClass();
        this.f179700a = bVar;
        this.f179701b = obj;
        this.f179702c = num;
    }
}
