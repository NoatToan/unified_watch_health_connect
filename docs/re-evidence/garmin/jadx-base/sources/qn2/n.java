package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lqn2/n;", "Lpn2/d;", "", "sequenceNumber", "", "sequenceCounter", "Lqn2/r;", "responseApduInfo", "<init>", "(ILjava/lang/String;Lqn2/r;)V", "a", "I", "b", "()I", "setSequenceNumber", "(I)V", "Ljava/lang/String;", "getSequenceCounter", "()Ljava/lang/String;", "setSequenceCounter", "(Ljava/lang/String;)V", "c", "Lqn2/r;", "getResponseApduInfo", "()Lqn2/r;", "setResponseApduInfo", "(Lqn2/r;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n implements pn2.d {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sequenceNumber")
    private int sequenceNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sequenceCounter")
    private String sequenceCounter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("responseApduInfo")
    private r responseApduInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n> {
        @Override // android.os.Parcelable.Creator
        public final n createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n(parcel.readInt(), parcel.readString(), parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final n[] newArray(int i14) {
            return new n[i14];
        }
    }

    public n(int i14, String str, r rVar) {
        this.sequenceNumber = i14;
        this.sequenceCounter = str;
        this.responseApduInfo = rVar;
        if (str == null || str.length() == 6) {
            return;
        }
        vb.h.x(am.j.h(str.length(), "sequenceCounter length(6): "));
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSequenceNumber() {
        return this.sequenceNumber;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.sequenceNumber == nVar.sequenceNumber && p005kotlin.jvm.internal.s.g(this.sequenceCounter, nVar.sequenceCounter) && p005kotlin.jvm.internal.s.g(this.responseApduInfo, nVar.responseApduInfo);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.sequenceNumber) * 31;
        String str = this.sequenceCounter;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        r rVar = this.responseApduInfo;
        return iHashCode2 + (rVar != null ? rVar.hashCode() : 0);
    }

    public final String toString() {
        int i14 = this.sequenceNumber;
        String str = this.sequenceCounter;
        r rVar = this.responseApduInfo;
        StringBuilder sbR = wr.g.r(i14, "FNGetScriptPayloadDto(sequenceNumber=", ", sequenceCounter=", str, ", responseApduInfo=");
        sbR.append(rVar);
        sbR.append(")");
        return sbR.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeInt(this.sequenceNumber);
        parcel.writeString(this.sequenceCounter);
        r rVar = this.responseApduInfo;
        if (rVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            rVar.writeToParcel(parcel, i14);
        }
    }
}
