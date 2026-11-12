package s21;

import android.os.Parcel;
import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ls21/b;", "Landroid/os/Parcelable;", "", "avgActiveCalories", "customActiveCalories", "Ls21/a;", "activityLevelOption", "Ll01/a;", "activityMultiplierType", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ls21/a;Ll01/a;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f156062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f156063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s21.a f156064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l01.a f156065d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), s21.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? l01.a.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    public b(Integer num, Integer num2, s21.a aVar, l01.a aVar2) {
        aVar.getClass();
        this.f156062a = num;
        this.f156063b = num2;
        this.f156064c = aVar;
        this.f156065d = aVar2;
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
        return p005kotlin.jvm.internal.s.g(this.f156062a, bVar.f156062a) && p005kotlin.jvm.internal.s.g(this.f156063b, bVar.f156063b) && this.f156064c == bVar.f156064c && this.f156065d == bVar.f156065d;
    }

    public final int hashCode() {
        Integer num = this.f156062a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f156063b;
        int iHashCode2 = (this.f156064c.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        l01.a aVar = this.f156065d;
        return iHashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(this.f156062a, "ActivityLevelResult(avgActiveCalories=", ", customActiveCalories=", ", activityLevelOption=", this.f156063b);
        sbL.append(this.f156064c);
        sbL.append(", activityMultiplierType=");
        sbL.append(this.f156065d);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.f156062a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.f156063b;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        parcel.writeString(this.f156064c.name());
        l01.a aVar = this.f156065d;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
    }
}
