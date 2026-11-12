package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lrn2/q;", "Lpn2/d;", "", "resultCode", "resultMessage", "resultConfirmId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "f", "c", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class q implements pn2.d {
    public static final Parcelable.Creator<q> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultCode")
    private final String resultCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultMessage")
    private final String resultMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultConfirmId")
    private final String resultConfirmId;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<q> {
        @Override // android.os.Parcelable.Creator
        public final q createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new q(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final q[] newArray(int i14) {
            return new q[i14];
        }
    }

    public q(String str, String str2, String str3) {
        int length;
        this.resultCode = str;
        this.resultMessage = str2;
        this.resultConfirmId = str3;
        if (str != null && str.length() != 4) {
            vb.h.x(am.j.h(str.length(), "resultCode length(4): "));
            throw null;
        }
        if (str2 != null && (1 > (length = str2.length()) || length >= 1025)) {
            vb.h.x(am.j.h(str2.length(), "resultMessage length(1-1024): "));
            throw null;
        }
        if (str3 == null || str3.length() == 37) {
            return;
        }
        vb.h.x(am.j.h(str3.length(), "resultConfirmId length(37): "));
        throw null;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResultConfirmId() {
        return this.resultConfirmId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p005kotlin.jvm.internal.s.g(this.resultCode, qVar.resultCode) && p005kotlin.jvm.internal.s.g(this.resultMessage, qVar.resultMessage) && p005kotlin.jvm.internal.s.g(this.resultConfirmId, qVar.resultConfirmId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getResultMessage() {
        return this.resultMessage;
    }

    public final int hashCode() {
        String str = this.resultCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.resultMessage;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.resultConfirmId;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return am.j.o(this.resultConfirmId, ")", p6.b.i("FNEndResultConfirmIdDto(resultCode=", this.resultCode, ", resultMessage=", this.resultMessage, ", resultConfirmId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultCode);
        parcel.writeString(this.resultMessage);
        parcel.writeString(this.resultConfirmId);
    }
}
