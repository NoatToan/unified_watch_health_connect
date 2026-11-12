package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lpn2/j;", "Lpn2/d;", "", "sfAmount", "Lpn2/q;", "settlementInfo", "<init>", "(Ljava/lang/String;Lpn2/q;)V", "a", "Ljava/lang/String;", "getSfAmount", "()Ljava/lang/String;", "b", "Lpn2/q;", "getSettlementInfo", "()Lpn2/q;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j implements d {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sfAmount")
    private final String sfAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("settlementInfo")
    private final q settlementInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new j(parcel.readString(), q.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i14) {
            return new j[i14];
        }
    }

    public j(String str, q qVar) {
        str.getClass();
        qVar.getClass();
        this.sfAmount = str;
        this.settlementInfo = qVar;
        int length = str.length();
        if (1 > length || length >= 6) {
            vb.h.x(am.j.h(str.length(), "sfAmount length(1-5): "));
            throw null;
        }
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
        return p005kotlin.jvm.internal.s.g(this.sfAmount, jVar.sfAmount) && p005kotlin.jvm.internal.s.g(this.settlementInfo, jVar.settlementInfo);
    }

    public final int hashCode() {
        return this.settlementInfo.hashCode() + (this.sfAmount.hashCode() * 31);
    }

    public final String toString() {
        return "FNPaymentInfoDto(sfAmount='" + this.sfAmount + "', settlementInfo=" + this.settlementInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.sfAmount);
        this.settlementInfo.writeToParcel(parcel, i14);
    }
}
