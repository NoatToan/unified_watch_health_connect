package bx;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lbx/h;", "Landroid/os/Parcelable;", "", "bodyBatteryValueDescriptorIndex", "", "bodyBatteryValueDescriptorKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getBodyBatteryValueDescriptorIndex", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getBodyBatteryValueDescriptorKey", "()Ljava/lang/String;", "gcm-body-battery_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryValueDescriptorIndex")
    private final Integer bodyBatteryValueDescriptorIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("bodyBatteryValueDescriptorKey")
    private final String bodyBatteryValueDescriptorKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new h(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i14) {
            return new h[i14];
        }
    }

    public /* synthetic */ h(Integer num, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.bodyBatteryValueDescriptorIndex, hVar.bodyBatteryValueDescriptorIndex) && s.g(this.bodyBatteryValueDescriptorKey, hVar.bodyBatteryValueDescriptorKey);
    }

    public final int hashCode() {
        Integer num = this.bodyBatteryValueDescriptorIndex;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.bodyBatteryValueDescriptorKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("BodyBatteryValueDescriptorDTO(bodyBatteryValueDescriptorIndex=", this.bodyBatteryValueDescriptorIndex, ", bodyBatteryValueDescriptorKey=", this.bodyBatteryValueDescriptorKey, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.bodyBatteryValueDescriptorIndex;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.bodyBatteryValueDescriptorKey);
    }

    public h(Integer num, String str) {
        this.bodyBatteryValueDescriptorIndex = num;
        this.bodyBatteryValueDescriptorKey = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
