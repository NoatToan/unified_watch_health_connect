package h42;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.f3;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lh42/g;", "Landroid/os/Parcelable;", "Lh42/f;", "speed", "", "directionString", "", "direction", "<init>", "(Lh42/f;Ljava/lang/String;Ljava/lang/Integer;)V", "a", "Lh42/f;", "getSpeed", "()Lh42/f;", "b", "Ljava/lang/String;", "getDirectionString", "()Ljava/lang/String;", "c", "Ljava/lang/Integer;", "getDirection", "()Ljava/lang/Integer;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("speed")
    private final f speed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("directionString")
    private final String directionString;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("direction")
    private final Integer direction;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<g> {
        @Override // android.os.Parcelable.Creator
        public final g createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new g(parcel.readInt() == 0 ? null : f.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final g[] newArray(int i14) {
            return new g[i14];
        }
    }

    public /* synthetic */ g(f fVar, String str, Integer num, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.speed, gVar.speed) && s.g(this.directionString, gVar.directionString) && s.g(this.direction, gVar.direction);
    }

    public final int hashCode() {
        f fVar = this.speed;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        String str = this.directionString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.direction;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        f fVar = this.speed;
        String str = this.directionString;
        Integer num = this.direction;
        StringBuilder sb3 = new StringBuilder("RaceDayWindUnitDTO(speed=");
        sb3.append(fVar);
        sb3.append(", directionString=");
        sb3.append(str);
        sb3.append(", direction=");
        return f3.i(sb3, num, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        f fVar = this.speed;
        if (fVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.directionString);
        Integer num = this.direction;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
    }

    public g(f fVar, String str, Integer num) {
        this.speed = fVar;
        this.directionString = str;
        this.direction = num;
    }

    public g() {
        this(null, null, null, 7, null);
    }
}
