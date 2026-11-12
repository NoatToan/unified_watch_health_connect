package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ltw1/l;", "Landroid/os/Parcelable;", "", "levelId", "", "levelKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "Ljava/lang/Integer;", "getLevelId", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "getLevelKey", "()Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelId")
    private final Integer levelId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("levelKey")
    private final String levelKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(Integer num, String str) {
        this.levelId = num;
        this.levelKey = str;
    }

    public final k b() {
        Integer num = this.levelId;
        if (num != null) {
            int iIntValue = num.intValue();
            k.f166742d.getClass();
            k kVarA = k.a.a(iIntValue);
            if (kVarA != null) {
                return kVarA;
            }
        }
        return k.INTERMEDIATE;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return p005kotlin.jvm.internal.s.g(this.levelId, lVar.levelId) && p005kotlin.jvm.internal.s.g(this.levelKey, lVar.levelKey);
    }

    public final int hashCode() {
        Integer num = this.levelId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.levelKey;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return n23.j.f("TrainingLevelDTO(levelId=", this.levelId, ", levelKey=", this.levelKey, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.levelId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        parcel.writeString(this.levelKey);
    }
}
