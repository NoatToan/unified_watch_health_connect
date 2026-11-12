package j61;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lj61/d;", "Landroid/os/Parcelable;", "", "anaerobicCapacity", "aerobicCapacity", "aerobicEndurance", "Lj61/g;", "feedbackPhraseKey", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lj61/g;)V", "a", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "b", "c", "d", "Lj61/g;", "g", "()Lj61/g;", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f97317e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("anaerobicCapacity")
    private final Integer anaerobicCapacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aerobicCapacity")
    private final Integer aerobicCapacity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("aerobicEndurance")
    private final Integer aerobicEndurance;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("feedbackPhraseKey")
    private final g feedbackPhraseKey;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? g.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public /* synthetic */ d(Integer num, Integer num2, Integer num3, g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : num, (i14 & 2) != 0 ? null : num2, (i14 & 4) != 0 ? null : num3, (i14 & 8) != 0 ? null : gVar);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getAerobicCapacity() {
        return this.aerobicCapacity;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getAerobicEndurance() {
        return this.aerobicEndurance;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.anaerobicCapacity, dVar.anaerobicCapacity) && s.g(this.aerobicCapacity, dVar.aerobicCapacity) && s.g(this.aerobicEndurance, dVar.aerobicEndurance) && this.feedbackPhraseKey == dVar.feedbackPhraseKey;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getAnaerobicCapacity() {
        return this.anaerobicCapacity;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final g getFeedbackPhraseKey() {
        return this.feedbackPhraseKey;
    }

    public final int hashCode() {
        Integer num = this.anaerobicCapacity;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.aerobicCapacity;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.aerobicEndurance;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        g gVar = this.feedbackPhraseKey;
        return iHashCode3 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.anaerobicCapacity;
        Integer num2 = this.aerobicCapacity;
        Integer num3 = this.aerobicEndurance;
        g gVar = this.feedbackPhraseKey;
        StringBuilder sbL = com.airbnb.lottie.animation.keyframe.a.l(num, "CourseDemandsDTO(anaerobicCapacity=", ", aerobicCapacity=", ", aerobicEndurance=", num2);
        sbL.append(num3);
        sbL.append(", feedbackPhraseKey=");
        sbL.append(gVar);
        sbL.append(")");
        return sbL.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Integer num = this.anaerobicCapacity;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num);
        }
        Integer num2 = this.aerobicCapacity;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num2);
        }
        Integer num3 = this.aerobicEndurance;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            kg.f.k(parcel, 1, num3);
        }
        g gVar = this.feedbackPhraseKey;
        if (gVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(gVar.name());
        }
    }

    public d(Integer num, Integer num2, Integer num3, g gVar) {
        this.anaerobicCapacity = num;
        this.aerobicCapacity = num2;
        this.aerobicEndurance = num3;
        this.feedbackPhraseKey = gVar;
    }

    public d() {
        this(null, null, null, null, 15, null);
    }
}
