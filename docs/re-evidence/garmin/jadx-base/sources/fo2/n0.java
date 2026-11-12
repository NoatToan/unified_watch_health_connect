package fo2;

import android.os.Parcel;
import android.os.Parcelable;
import com.garmin.feature.garminpay.providers.gpay.model.Links;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfo2/n0;", "Landroid/os/Parcelable;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "links", "", "userId", "Lfo2/o0;", "wallet", "<init>", "(Lcom/garmin/feature/garminpay/providers/gpay/model/Links;Ljava/lang/String;Lfo2/o0;)V", "a", "Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "getLinks", "()Lcom/garmin/feature/garminpay/providers/gpay/model/Links;", "b", "Ljava/lang/String;", "getUserId", "()Ljava/lang/String;", "c", "Lfo2/o0;", "()Lfo2/o0;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class n0 implements Parcelable {
    public static final Parcelable.Creator<n0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("_links")
    private final Links links;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("userId")
    private final String userId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("wallet")
    private final o0 wallet;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<n0> {
        @Override // android.os.Parcelable.Creator
        public final n0 createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new n0((Links) parcel.readSerializable(), parcel.readString(), o0.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final n0[] newArray(int i14) {
            return new n0[i14];
        }
    }

    public n0(Links links, String str, o0 o0Var) {
        links.getClass();
        str.getClass();
        o0Var.getClass();
        this.links = links;
        this.userId = str;
        this.wallet = o0Var;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final o0 getWallet() {
        return this.wallet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return p005kotlin.jvm.internal.s.g(this.links, n0Var.links) && p005kotlin.jvm.internal.s.g(this.userId, n0Var.userId) && p005kotlin.jvm.internal.s.g(this.wallet, n0Var.wallet);
    }

    public final int hashCode() {
        return this.wallet.hashCode() + wr.g.j(this.links.f51142a.hashCode() * 31, 31, this.userId);
    }

    public final String toString() {
        return "UserStatistics(links=" + this.links + ", userId=" + this.userId + ", wallet=" + this.wallet + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeSerializable(this.links);
        parcel.writeString(this.userId);
        this.wallet.writeToParcel(parcel, i14);
    }
}
