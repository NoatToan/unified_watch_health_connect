package rn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrn2/m;", "Lpn2/d;", "Lpn2/r;", "spAdditionalInfo", "<init>", "(Lpn2/r;)V", "a", "Lpn2/r;", "b", "()Lpn2/r;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m implements pn2.d {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spAdditionalInfo")
    private final pn2.r spAdditionalInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new m(pn2.r.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i14) {
            return new m[i14];
        }
    }

    public m(pn2.r rVar) {
        rVar.getClass();
        this.spAdditionalInfo = rVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final pn2.r getSpAdditionalInfo() {
        return this.spAdditionalInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && p005kotlin.jvm.internal.s.g(this.spAdditionalInfo, ((m) obj).spAdditionalInfo);
    }

    public final int hashCode() {
        return this.spAdditionalInfo.hashCode();
    }

    public final String toString() {
        return "FNCardUsageHistoryPayloadDto(spAdditionalInfo=" + this.spAdditionalInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.spAdditionalInfo.writeToParcel(parcel, i14);
    }
}
