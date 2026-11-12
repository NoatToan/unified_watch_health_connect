package pn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0012\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lpn2/r;", "Lpn2/d;", "Lpn2/b;", "customerInfo", "Lpn2/j;", "paymentInfo", "Lpn2/l;", "refundInfo", "Lpn2/e;", "historyInfo", "Lpn2/g;", "issueInfo", "<init>", "(Lpn2/b;Lpn2/j;Lpn2/l;Lpn2/e;Lpn2/g;)V", "a", "Lpn2/b;", "getCustomerInfo", "()Lpn2/b;", "b", "Lpn2/j;", "getPaymentInfo", "()Lpn2/j;", "c", "Lpn2/l;", "getRefundInfo", "()Lpn2/l;", "d", "Lpn2/e;", "()Lpn2/e;", JWKParameterNames.RSA_EXPONENT, "Lpn2/g;", "getIssueInfo", "()Lpn2/g;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements d {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("customerInfo")
    private final b customerInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("paymentInfo")
    private final j paymentInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("refundInfo")
    private final l refundInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("historyInfo")
    private final e historyInfo;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("issueInfo")
    private final g issueInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? g.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(b bVar, j jVar, l lVar, e eVar, g gVar) {
        this.customerInfo = bVar;
        this.paymentInfo = jVar;
        this.refundInfo = lVar;
        this.historyInfo = eVar;
        this.issueInfo = gVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final e getHistoryInfo() {
        return this.historyInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return p005kotlin.jvm.internal.s.g(this.customerInfo, rVar.customerInfo) && p005kotlin.jvm.internal.s.g(this.paymentInfo, rVar.paymentInfo) && p005kotlin.jvm.internal.s.g(this.refundInfo, rVar.refundInfo) && p005kotlin.jvm.internal.s.g(this.historyInfo, rVar.historyInfo) && p005kotlin.jvm.internal.s.g(this.issueInfo, rVar.issueInfo);
    }

    public final int hashCode() {
        b bVar = this.customerInfo;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        j jVar = this.paymentInfo;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        l lVar = this.refundInfo;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        e eVar = this.historyInfo;
        int iHashCode4 = (iHashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        g gVar = this.issueInfo;
        return iHashCode4 + (gVar != null ? gVar.hashCode() : 0);
    }

    public final String toString() {
        return "FNSpAdditionalInfoDto(customerInfo=" + this.customerInfo + ", paymentInfo=" + this.paymentInfo + ", refundInfo=" + this.refundInfo + ", historyInfo=" + this.historyInfo + ", issueInfo=" + this.issueInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        b bVar = this.customerInfo;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        j jVar = this.paymentInfo;
        if (jVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            jVar.writeToParcel(parcel, i14);
        }
        l lVar = this.refundInfo;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lVar.writeToParcel(parcel, i14);
        }
        e eVar = this.historyInfo;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        if (this.issueInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(1);
        }
    }
}
