package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lrn2/l;", "Lpn2/d;", "", "cardStatus", "Lrn2/t;", "subStatus", "spCardStatus", "<init>", "(Ljava/lang/String;Lrn2/t;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lrn2/t;", "f", "()Lrn2/t;", "c", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l implements pn2.d {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardStatus")
    private final String cardStatus;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subStatus")
    private final t subStatus;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spCardStatus")
    private final String spCardStatus;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<l> {
        @Override // android.os.Parcelable.Creator
        public final l createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new l(parcel.readString(), t.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final l[] newArray(int i14) {
            return new l[i14];
        }
    }

    public l(String str, t tVar, String str2) {
        str.getClass();
        tVar.getClass();
        str2.getClass();
        this.cardStatus = str;
        this.subStatus = tVar;
        this.spCardStatus = str2;
        int length = str.length();
        if (1 > length || length >= 33) {
            vb.h.x(am.j.h(str.length(), "cardStatus length(1-32): "));
            throw null;
        }
        int length2 = str2.length();
        if (1 > length2 || length2 >= 33) {
            vb.h.x(am.j.h(str2.length(), "spCardStatus length(1-32): "));
            throw null;
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardStatus() {
        return this.cardStatus;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSpCardStatus() {
        return this.spCardStatus;
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
        return p005kotlin.jvm.internal.s.g(this.cardStatus, lVar.cardStatus) && p005kotlin.jvm.internal.s.g(this.subStatus, lVar.subStatus) && p005kotlin.jvm.internal.s.g(this.spCardStatus, lVar.spCardStatus);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t getSubStatus() {
        return this.subStatus;
    }

    public final int hashCode() {
        return this.spCardStatus.hashCode() + ((this.subStatus.hashCode() + (this.cardStatus.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String str = this.cardStatus;
        t tVar = this.subStatus;
        String str2 = this.spCardStatus;
        StringBuilder sb3 = new StringBuilder("FNCardStatusesDto(cardStatus=");
        sb3.append(str);
        sb3.append(", subStatus=");
        sb3.append(tVar);
        sb3.append(", spCardStatus=");
        return am.j.o(str2, ")", sb3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.cardStatus);
        this.subStatus.writeToParcel(parcel, i14);
        parcel.writeString(this.spCardStatus);
    }
}
