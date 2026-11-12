package qn2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \"\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lqn2/k;", "Lpn2/d;", "Lqn2/y;", "serverInfo", "Lqn2/o;", "phoneInfo", "Lqn2/z;", "walletAppInfoDto", "Lqn2/m;", "deviceInfoDto", "<init>", "(Lqn2/y;Lqn2/o;Lqn2/z;Lqn2/m;)V", "a", "Lqn2/y;", "getServerInfo", "()Lqn2/y;", "setServerInfo", "(Lqn2/y;)V", "b", "Lqn2/o;", "getPhoneInfo", "()Lqn2/o;", "setPhoneInfo", "(Lqn2/o;)V", "c", "Lqn2/z;", "getWalletAppInfoDto", "()Lqn2/z;", "setWalletAppInfoDto", "(Lqn2/z;)V", "d", "Lqn2/m;", "()Lqn2/m;", "setDeviceInfoDto", "(Lqn2/m;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k implements pn2.d {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("serverInfo")
    private y serverInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("phoneInfo")
    private o phoneInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("walletAppInfo")
    private z walletAppInfoDto;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("deviceInfo")
    private m deviceInfoDto;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<k> {
        @Override // android.os.Parcelable.Creator
        public final k createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new k(y.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? z.CREATOR.createFromParcel(parcel) : null, m.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final k[] newArray(int i14) {
            return new k[i14];
        }
    }

    public k(y yVar, o oVar, z zVar, m mVar) {
        yVar.getClass();
        mVar.getClass();
        this.serverInfo = yVar;
        this.phoneInfo = oVar;
        this.walletAppInfoDto = zVar;
        this.deviceInfoDto = mVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m getDeviceInfoDto() {
        return this.deviceInfoDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return p005kotlin.jvm.internal.s.g(this.serverInfo, kVar.serverInfo) && p005kotlin.jvm.internal.s.g(this.phoneInfo, kVar.phoneInfo) && p005kotlin.jvm.internal.s.g(this.walletAppInfoDto, kVar.walletAppInfoDto) && p005kotlin.jvm.internal.s.g(this.deviceInfoDto, kVar.deviceInfoDto);
    }

    public final int hashCode() {
        int iHashCode = this.serverInfo.hashCode() * 31;
        o oVar = this.phoneInfo;
        int iHashCode2 = (iHashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        z zVar = this.walletAppInfoDto;
        return this.deviceInfoDto.hashCode() + ((iHashCode2 + (zVar != null ? zVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "FNClientInfoDto(serverInfo=" + this.serverInfo + ", phoneInfo=" + this.phoneInfo + ", walletAppInfoDto=" + this.walletAppInfoDto + ", deviceInfoDto=" + this.deviceInfoDto + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.serverInfo.writeToParcel(parcel, i14);
        o oVar = this.phoneInfo;
        if (oVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            oVar.writeToParcel(parcel, i14);
        }
        z zVar = this.walletAppInfoDto;
        if (zVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            zVar.writeToParcel(parcel, i14);
        }
        this.deviceInfoDto.writeToParcel(parcel, i14);
    }
}
