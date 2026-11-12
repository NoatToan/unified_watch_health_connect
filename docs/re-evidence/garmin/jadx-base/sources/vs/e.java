package vs;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvs/e;", "Landroid/os/Parcelable;", "Lvs/f;", "activityType", "", "selected", "<init>", "(Lvs/f;Z)V", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f179706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f179707b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(f.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(f fVar, boolean z14) {
        fVar.getClass();
        this.f179706a = fVar;
        this.f179707b = z14;
    }

    public static e b(e eVar, boolean z14) {
        f fVar = eVar.f179706a;
        eVar.getClass();
        fVar.getClass();
        return new e(fVar, z14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f179706a == eVar.f179706a && this.f179707b == eVar.f179707b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f179707b) + (this.f179706a.hashCode() * 31);
    }

    public final String toString() {
        return "RecordableActivity(activityType=" + this.f179706a + ", selected=" + this.f179707b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.f179706a.name());
        parcel.writeInt(this.f179707b ? 1 : 0);
    }

    public /* synthetic */ e(f fVar, boolean z14, int i14, j jVar) {
        this(fVar, (i14 & 2) != 0 ? false : z14);
    }
}
