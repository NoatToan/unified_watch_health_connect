package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u001a\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lrn2/d;", "Lpn2/d;", "Lpn2/v;", "", "resultConfirmId", "recoveryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "d", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d implements pn2.d, pn2.v {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("resultConfirmId")
    private final String resultConfirmId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("recoveryType")
    private final String recoveryType;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<d> {
        @Override // android.os.Parcelable.Creator
        public final d createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new d(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final d[] newArray(int i14) {
            return new d[i14];
        }
    }

    public d(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.resultConfirmId = str;
        this.recoveryType = str2;
        if (str.length() != 37) {
            vb.h.x(am.j.h(str.length(), "resultConfirmId length(37): "));
            throw null;
        }
        int length = str2.length();
        if (1 > length || length >= 33) {
            vb.h.x(am.j.h(str2.length(), "recoveryType length(1-32): "));
            throw null;
        }
    }

    @Override // pn2.v
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getResultConfirmId() {
        return this.resultConfirmId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRecoveryType() {
        return this.recoveryType;
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
        return p005kotlin.jvm.internal.s.g(this.resultConfirmId, dVar.resultConfirmId) && p005kotlin.jvm.internal.s.g(this.recoveryType, dVar.recoveryType);
    }

    public final int hashCode() {
        return this.recoveryType.hashCode() + (this.resultConfirmId.hashCode() * 31);
    }

    public final String toString() {
        return e0.g("FNBeginResultConfirmIdDto(resultConfirmId='", this.resultConfirmId, "', recoveryType='", this.recoveryType, "')");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.resultConfirmId);
        parcel.writeString(this.recoveryType);
    }
}
