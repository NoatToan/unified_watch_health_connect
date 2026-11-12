package tw1;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import i3.e5;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltw1/a;", "Landroid/os/Parcelable;", "", "currentPhase", "", "_startDate", "_endDate", "trainingPhase", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "d", IntegerTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C3136a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("currentPhase")
    private final Boolean currentPhase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("startDate")
    private final String _startDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("endDate")
    private final String _endDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("trainingPhase")
    private final String trainingPhase;

    /* JADX INFO: renamed from: tw1.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C3136a implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        public final a createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new a(boolValueOf, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final a[] newArray(int i14) {
            return new a[i14];
        }
    }

    public a(Boolean bool, String str, String str2, String str3) {
        this.currentPhase = bool;
        this._startDate = str;
        this._endDate = str2;
        this.trainingPhase = str3;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getCurrentPhase() {
        return this.currentPhase;
    }

    public final LocalDate d() {
        return new LocalDate(this._endDate);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p005kotlin.jvm.internal.s.g(this.currentPhase, aVar.currentPhase) && p005kotlin.jvm.internal.s.g(this._startDate, aVar._startDate) && p005kotlin.jvm.internal.s.g(this._endDate, aVar._endDate) && p005kotlin.jvm.internal.s.g(this.trainingPhase, aVar.trainingPhase);
    }

    public final DateTime f() {
        String str = this._endDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    public final LocalDate g() {
        return new LocalDate(this._startDate);
    }

    public final DateTime h() {
        String str = this._startDate;
        if (str != null) {
            return g22.k.q(str, "yyyy-MM-dd'T'HH:mm:ss.SSS", null);
        }
        return null;
    }

    public final int hashCode() {
        Boolean bool = this.currentPhase;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this._startDate;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this._endDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.trainingPhase;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTrainingPhase() {
        return this.trainingPhase;
    }

    public final String toString() {
        Boolean bool = this.currentPhase;
        String str = this._startDate;
        String str2 = this._endDate;
        String str3 = this.trainingPhase;
        StringBuilder sb3 = new StringBuilder("AdaptivePlanPhase(currentPhase=");
        sb3.append(bool);
        sb3.append(", _startDate=");
        sb3.append(str);
        sb3.append(", _endDate=");
        return e5.h(sb3, str2, ", trainingPhase=", str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        Boolean bool = this.currentPhase;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            tn.k.m(parcel, 1, bool);
        }
        parcel.writeString(this._startDate);
        parcel.writeString(this._endDate);
        parcel.writeString(this.trainingPhase);
    }
}
