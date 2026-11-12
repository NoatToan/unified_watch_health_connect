package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrn2/c;", "Lpn2/d;", "Lpn2/v;", "", "resultConfirmId", "Lrn2/i;", "cardInfo", "<init>", "(Ljava/lang/String;Lrn2/i;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lrn2/i;", "d", "()Lrn2/i;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class c implements pn2.d, pn2.v {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultConfirmId")
    private final String resultConfirmId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cardInfo")
    private final i cardInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new c(parcel.readString(), i.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public c(String str, i iVar) {
        str.getClass();
        iVar.getClass();
        this.resultConfirmId = str;
        this.cardInfo = iVar;
        if (str.length() == 37) {
            return;
        }
        vb.h.x(am.j.h(str.length(), "resultConfirmId length(37): "));
        throw null;
    }

    @Override // pn2.v
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResultConfirmId() {
        return this.resultConfirmId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i getCardInfo() {
        return this.cardInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return p005kotlin.jvm.internal.s.g(this.resultConfirmId, cVar.resultConfirmId) && p005kotlin.jvm.internal.s.g(this.cardInfo, cVar.cardInfo);
    }

    public final int hashCode() {
        return this.cardInfo.hashCode() + (this.resultConfirmId.hashCode() * 31);
    }

    public final String toString() {
        return "FNBeginIssueCardResponsePayloadDto(resultConfirmId='" + this.resultConfirmId + "', cardInfo=" + this.cardInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultConfirmId);
        this.cardInfo.writeToParcel(parcel, i14);
    }
}
