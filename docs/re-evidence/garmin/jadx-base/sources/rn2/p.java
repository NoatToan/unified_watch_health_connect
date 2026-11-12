package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrn2/p;", "Lpn2/d;", "", "resultCode", "resultMessage", "Lrn2/i;", "cardInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lrn2/i;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "f", "c", "Lrn2/i;", "()Lrn2/i;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p implements pn2.d {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultCode")
    private final String resultCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultMessage")
    private final String resultMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardInfo")
    private final i cardInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new p(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i14) {
            return new p[i14];
        }
    }

    public p(String str, String str2, i iVar) {
        str.getClass();
        this.resultCode = str;
        this.resultMessage = str2;
        this.cardInfo = iVar;
        if (str.length() != 4) {
            vb.h.x(am.j.h(str.length(), "resultCode length(4): "));
            throw null;
        }
        if (str2 != null) {
            int length = str2.length();
            if (1 > length || length >= 1025) {
                vb.h.x(am.j.h(str2.length(), "resultMessage length(1-1024): "));
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final i getCardInfo() {
        return this.cardInfo;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return p005kotlin.jvm.internal.s.g(this.resultCode, pVar.resultCode) && p005kotlin.jvm.internal.s.g(this.resultMessage, pVar.resultMessage) && p005kotlin.jvm.internal.s.g(this.cardInfo, pVar.cardInfo);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getResultMessage() {
        return this.resultMessage;
    }

    public final int hashCode() {
        int iHashCode = this.resultCode.hashCode() * 31;
        String str = this.resultMessage;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        i iVar = this.cardInfo;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        String str = this.resultCode;
        String str2 = this.resultMessage;
        i iVar = this.cardInfo;
        StringBuilder sbI = p6.b.i("FNEndIssueCardPayloadDto(resultCode='", str, "', resultMessage=", str2, ", cardInfo=");
        sbI.append(iVar);
        sbI.append(")");
        return sbI.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultCode);
        parcel.writeString(this.resultMessage);
        i iVar = this.cardInfo;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i14);
        }
    }
}
