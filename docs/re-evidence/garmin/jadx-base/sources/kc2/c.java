package kc2;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@o13.e
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b3\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b\n\u0010+\"\u0004\b,\u0010-R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010!\u001a\u0004\b;\u0010#\"\u0004\b<\u0010%R$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006C"}, d2 = {"Lkc2/c;", "Landroid/os/Parcelable;", "Lkc2/g;", "unitInfo", "Lkc2/a;", "clientInfo", "", "result", "bondingType", "", "isBackground", "Lkc2/e;", "networkInfo", "Lkc2/b;", "errorInfo", "syncInfo", "", "connectionStart", "<init>", "(Lkc2/g;Lkc2/a;Ljava/lang/String;Ljava/lang/String;ZLkc2/e;Lkc2/b;Ljava/lang/String;Ljava/lang/Long;)V", "a", "Lkc2/g;", "getUnitInfo", "()Lkc2/g;", "setUnitInfo", "(Lkc2/g;)V", "b", "Lkc2/a;", "getClientInfo", "()Lkc2/a;", "setClientInfo", "(Lkc2/a;)V", "c", "Ljava/lang/String;", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "d", "getBondingType", "setBondingType", JWKParameterNames.RSA_EXPONENT, "Z", "()Z", "setBackground", "(Z)V", "f", "Lkc2/e;", "getNetworkInfo", "()Lkc2/e;", "setNetworkInfo", "(Lkc2/e;)V", "g", "Lkc2/b;", "getErrorInfo", "()Lkc2/b;", "setErrorInfo", "(Lkc2/b;)V", "h", "getSyncInfo", "setSyncInfo", IntegerTokenConverter.CONVERTER_KEY, "Ljava/lang/Long;", "getConnectionStart", "()Ljava/lang/Long;", "setConnectionStart", "(Ljava/lang/Long;)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("UnitInfo")
    private g unitInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ClientInfo")
    private kc2.a clientInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("Result")
    private String result;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("BondingType")
    private String bondingType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsBackground")
    private boolean isBackground;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @SerializedName("NetworkInfo")
    private e networkInfo;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ErrorInfo")
    private b errorInfo;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SyncDetail")
    private String syncInfo;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @SerializedName("ConnectionDuration")
    private Long connectionStart;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<c> {
        @Override // android.os.Parcelable.Creator
        public final c createFromParcel(Parcel parcel) {
            parcel.getClass();
            g gVarCreateFromParcel = g.CREATOR.createFromParcel(parcel);
            kc2.a aVarCreateFromParcel = kc2.a.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            boolean z14 = parcel.readInt() != 0;
            e eVarCreateFromParcel = parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel);
            b bVarCreateFromParcel = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            Long lValueOf = null;
            String string3 = parcel.readString();
            if (parcel.readInt() != 0) {
                lValueOf = Long.valueOf(parcel.readLong());
            }
            return new c(gVarCreateFromParcel, aVarCreateFromParcel, string, string2, z14, eVarCreateFromParcel, bVarCreateFromParcel, string3, lValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final c[] newArray(int i14) {
            return new c[i14];
        }
    }

    public /* synthetic */ c(g gVar, kc2.a aVar, String str, String str2, boolean z14, e eVar, b bVar, String str3, Long l14, int i14, j jVar) {
        this(gVar, aVar, str, str2, z14, (i14 & 32) != 0 ? null : eVar, (i14 & 64) != 0 ? null : bVar, (i14 & 128) != 0 ? null : str3, (i14 & 256) != 0 ? null : l14);
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
        return s.g(this.unitInfo, cVar.unitInfo) && s.g(this.clientInfo, cVar.clientInfo) && s.g(this.result, cVar.result) && s.g(this.bondingType, cVar.bondingType) && this.isBackground == cVar.isBackground && s.g(this.networkInfo, cVar.networkInfo) && s.g(this.errorInfo, cVar.errorInfo) && s.g(this.syncInfo, cVar.syncInfo) && s.g(this.connectionStart, cVar.connectionStart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j((this.clientInfo.hashCode() + (this.unitInfo.hashCode() * 31)) * 31, 31, this.result), 31, this.bondingType);
        boolean z14 = this.isBackground;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = (iJ + r14) * 31;
        e eVar = this.networkInfo;
        int iHashCode = (i14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        b bVar = this.errorInfo;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.syncInfo;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l14 = this.connectionStart;
        return iHashCode3 + (l14 != null ? l14.hashCode() : 0);
    }

    public final String toString() {
        g gVar = this.unitInfo;
        kc2.a aVar = this.clientInfo;
        String str = this.result;
        String str2 = this.bondingType;
        boolean z14 = this.isBackground;
        e eVar = this.networkInfo;
        b bVar = this.errorInfo;
        String str3 = this.syncInfo;
        Long l14 = this.connectionStart;
        StringBuilder sb3 = new StringBuilder("Event(unitInfo=");
        sb3.append(gVar);
        sb3.append(", clientInfo=");
        sb3.append(aVar);
        sb3.append(", result=");
        sn.a.t(sb3, str, ", bondingType=", str2, ", isBackground=");
        sb3.append(z14);
        sb3.append(", networkInfo=");
        sb3.append(eVar);
        sb3.append(", errorInfo=");
        sb3.append(bVar);
        sb3.append(", syncInfo=");
        sb3.append(str3);
        sb3.append(", connectionStart=");
        return p6.b.g(sb3, l14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        this.unitInfo.writeToParcel(parcel, i14);
        this.clientInfo.writeToParcel(parcel, i14);
        parcel.writeString(this.result);
        parcel.writeString(this.bondingType);
        parcel.writeInt(this.isBackground ? 1 : 0);
        e eVar = this.networkInfo;
        if (eVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            eVar.writeToParcel(parcel, i14);
        }
        b bVar = this.errorInfo;
        if (bVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bVar.writeToParcel(parcel, i14);
        }
        parcel.writeString(this.syncInfo);
        Long l14 = this.connectionStart;
        if (l14 == null) {
            parcel.writeInt(0);
        } else {
            sn.a.n(parcel, 1, l14);
        }
    }

    public c(g gVar, kc2.a aVar, String str, String str2, boolean z14, e eVar, b bVar, String str3, Long l14) {
        gVar.getClass();
        aVar.getClass();
        str.getClass();
        str2.getClass();
        this.unitInfo = gVar;
        this.clientInfo = aVar;
        this.result = str;
        this.bondingType = str2;
        this.isBackground = z14;
        this.networkInfo = eVar;
        this.errorInfo = bVar;
        this.syncInfo = str3;
        this.connectionStart = l14;
    }
}
