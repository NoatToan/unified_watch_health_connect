package ps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lps/n;", "Landroid/os/Parcelable;", "Lps/m;", "activityPolylineDMO", "<init>", "(Lps/m;)V", "a", "Lps/m;", "b", "()Lps/m;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f139941b = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("gPolyline")
    private final m activityPolylineDMO;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(m mVar) {
        this.activityPolylineDMO = mVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getActivityPolylineDMO() {
        return this.activityPolylineDMO;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && p005kotlin.jvm.internal.s.g(this.activityPolylineDMO, ((n) obj).activityPolylineDMO);
    }

    public final int hashCode() {
        m mVar = this.activityPolylineDMO;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    public final String toString() {
        return "ActivityPolylineDTO(activityPolylineDMO=" + this.activityPolylineDMO + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        m mVar = this.activityPolylineDMO;
        if (mVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mVar.writeToParcel(parcel, i14);
        }
    }
}
