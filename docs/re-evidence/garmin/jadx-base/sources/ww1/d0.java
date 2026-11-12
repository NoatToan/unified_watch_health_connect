package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lww1/d0;", "Landroid/os/Parcelable;", "", "subTypeId", "", "subTypeKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getSubTypeId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subTypeId")
    private final Integer subTypeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subTypeKey")
    private final String subTypeKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d0> {
        @Override // android.os.Parcelable.Creator
        public final d0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d0(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d0[] newArray(int i14) {
            return new d0[i14];
        }
    }

    public d0(Integer num, String str) {
        this.subTypeId = num;
        this.subTypeKey = str;
    }

    public final boolean b(l lVar) {
        String str = this.subTypeKey;
        if (str != null) {
            if (str.equalsIgnoreCase(lVar != null ? lVar.f187825a : null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        String str;
        String str2 = this.subTypeKey;
        return (str2 != null && str2.equalsIgnoreCase(z.STAY_FIT.f187895a)) || ((str = this.subTypeKey) != null && str.equalsIgnoreCase(z.GET_STRONGER.f187895a));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return p005kotlin.jvm.internal.s.g(this.subTypeId, d0Var.subTypeId) && p005kotlin.jvm.internal.s.g(this.subTypeKey, d0Var.subTypeKey);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getSubTypeKey() {
        return this.subTypeKey;
    }

    public final int hashCode() {
        Integer num = this.subTypeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.subTypeKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("TrainingPlanSubTypeDTO(subTypeId=", this.subTypeId, ", subTypeKey=", this.subTypeKey, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.subTypeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.subTypeKey);
    }
}
