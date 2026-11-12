package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lrn2/r;", "Lpn2/d;", "", "resultCode", "resultMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r implements pn2.d {
    public static final Parcelable.Creator<r> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultCode")
    private final String resultCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultMessage")
    private final String resultMessage;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<r> {
        @Override // android.os.Parcelable.Creator
        public final r createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new r(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final r[] newArray(int i14) {
            return new r[i14];
        }
    }

    public r(String str, String str2) {
        str.getClass();
        this.resultCode = str;
        this.resultMessage = str2;
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
    public final String getResultCode() {
        return this.resultCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getResultMessage() {
        return this.resultMessage;
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
        return p005kotlin.jvm.internal.s.g(this.resultCode, rVar.resultCode) && p005kotlin.jvm.internal.s.g(this.resultMessage, rVar.resultMessage);
    }

    public final int hashCode() {
        int iHashCode = this.resultCode.hashCode() * 31;
        String str = this.resultMessage;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return e0.g("FNEndResultDto(resultCode='", this.resultCode, "', resultMessage=", this.resultMessage, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultCode);
        parcel.writeString(this.resultMessage);
    }
}
