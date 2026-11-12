package gj1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgj1/e;", "Landroid/os/Parcelable;", "", "Lgj1/b;", "deviceWeights", "", "primaryTrainingDeviceCount", "<init>", "(Ljava/util/List;Ljava/lang/Integer;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "setDeviceWeights", "(Ljava/util/List;)V", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "setPrimaryTrainingDeviceCount", "(Ljava/lang/Integer;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceWeights")
    private List<b> deviceWeights;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("primaryTrainingDeviceCount")
    private Integer primaryTrainingDeviceCount;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                arrayList = new ArrayList(i14);
                int iA = 0;
                while (iA != i14) {
                    iA = kg.f.a(b.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new e(arrayList, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public /* synthetic */ e(List list, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : list, (i14 & 2) != 0 ? null : num);
    }

    public final List<b> b() {
        return this.deviceWeights;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getPrimaryTrainingDeviceCount() {
        return this.primaryTrainingDeviceCount;
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
        return s.g(this.deviceWeights, eVar.deviceWeights) && s.g(this.primaryTrainingDeviceCount, eVar.primaryTrainingDeviceCount);
    }

    public final int hashCode() {
        List<b> list = this.deviceWeights;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.primaryTrainingDeviceCount;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "PrimaryTrainingDevices(deviceWeights=" + this.deviceWeights + ", primaryTrainingDeviceCount=" + this.primaryTrainingDeviceCount + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        List<b> list = this.deviceWeights;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itO = u0.o(parcel, list, 1);
            while (itO.hasNext()) {
                ((b) itO.next()).writeToParcel(parcel, i14);
            }
        }
        Integer num = this.primaryTrainingDeviceCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public e(List<b> list, Integer num) {
        this.deviceWeights = list;
        this.primaryTrainingDeviceCount = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
