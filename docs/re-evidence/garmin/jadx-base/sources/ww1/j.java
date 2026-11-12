package ww1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lww1/j;", "Landroid/os/Parcelable;", "", "typeId", "", "typeKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getTypeId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeId")
    private final Integer typeId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("typeKey")
    private final String typeKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(Integer num, String str) {
        this.typeId = num;
        this.typeKey = str;
    }

    public final vt1.o b() {
        String str = this.typeKey;
        if (str == null) {
            return null;
        }
        vt1.o.f180174e.getClass();
        return vt1.o.a.a(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return p005kotlin.jvm.internal.s.g(this.typeId, jVar.typeId) && p005kotlin.jvm.internal.s.g(this.typeKey, jVar.typeKey);
    }

    public final int hashCode() {
        Integer num = this.typeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.typeKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("BasicTrainingPlanTypeDTO(typeId=", this.typeId, ", typeKey=", this.typeKey, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.typeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.typeKey);
    }
}
