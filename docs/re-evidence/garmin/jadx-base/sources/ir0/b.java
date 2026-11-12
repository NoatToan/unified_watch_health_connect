package ir0;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import g22.k;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lir0/b;", "Landroid/os/Parcelable;", "Lgs1/f;", "moveIQEvent", "Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;", "activityItem", "<init>", "(Lgs1/f;Lcom/garmin/android/apps/connectmobile/activities/model/ActivityListItemDTO;)V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs1.f f94782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityListItemDTO f94783b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b((gs1.f) parcel.readParcelable(b.class.getClassLoader()), (ActivityListItemDTO) parcel.readParcelable(b.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public /* synthetic */ b(gs1.f fVar, ActivityListItemDTO activityListItemDTO, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : activityListItemDTO);
    }

    public final DateTime b() {
        String startTimestampGMT = null;
        if (d()) {
            gs1.f fVar = this.f94782a;
            if (fVar != null) {
                startTimestampGMT = fVar.getStartTimestampGMT();
            }
        } else {
            ActivityListItemDTO activityListItemDTO = this.f94783b;
            if (activityListItemDTO != null) {
                startTimestampGMT = activityListItemDTO.f29262f;
            }
        }
        return k.q(startTimestampGMT, "yyyy-MM-dd'T'HH:mm:ss.SSS", DateTimeZone.UTC);
    }

    public final boolean d() {
        return this.f94783b == null && this.f94782a != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f94782a, bVar.f94782a) && s.g(this.f94783b, bVar.f94783b);
    }

    public final int hashCode() {
        gs1.f fVar = this.f94782a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        ActivityListItemDTO activityListItemDTO = this.f94783b;
        return iHashCode + (activityListItemDTO != null ? activityListItemDTO.hashCode() : 0);
    }

    public final String toString() {
        return "IntensityMinutesActivityDTO(moveIQEvent=" + this.f94782a + ", activityItem=" + this.f94783b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeParcelable(this.f94782a, i14);
        parcel.writeParcelable(this.f94783b, i14);
    }

    public b(gs1.f fVar, ActivityListItemDTO activityListItemDTO) {
        this.f94782a = fVar;
        this.f94783b = activityListItemDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
