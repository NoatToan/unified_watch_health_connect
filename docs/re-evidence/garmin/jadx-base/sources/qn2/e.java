package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lqn2/e;", "Lpn2/d;", "", "cid", "Lpn2/r;", "spAdditionalInfo", "<init>", "(Ljava/lang/String;Lpn2/r;)V", "a", "Ljava/lang/String;", "getCid", "()Ljava/lang/String;", "setCid", "(Ljava/lang/String;)V", "b", "Lpn2/r;", "getSpAdditionalInfo", "()Lpn2/r;", "setSpAdditionalInfo", "(Lpn2/r;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements pn2.d {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("cid")
    private String cid;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("spAdditionalInfo")
    private pn2.r spAdditionalInfo;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<e> {
        @Override // android.os.Parcelable.Creator
        public final e createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new e(parcel.readString(), pn2.r.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final e[] newArray(int i14) {
            return new e[i14];
        }
    }

    public e(String str, pn2.r rVar) {
        str.getClass();
        rVar.getClass();
        this.cid = str;
        this.spAdditionalInfo = rVar;
        if (str.length() == 63) {
            return;
        }
        vb.h.x(am.j.h(this.cid.length(), "cid length(63): "));
        throw null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.cid, eVar.cid) && p005kotlin.jvm.internal.s.g(this.spAdditionalInfo, eVar.spAdditionalInfo);
    }

    public final int hashCode() {
        return this.spAdditionalInfo.hashCode() + (this.cid.hashCode() * 31);
    }

    public final String toString() {
        return "FNCardIdPayloadDto(cid='" + this.cid + "', spAdditionalInfo=" + this.spAdditionalInfo + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.cid);
        this.spAdditionalInfo.writeToParcel(parcel, i14);
    }
}
