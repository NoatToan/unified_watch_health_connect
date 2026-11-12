package uk2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import ds.e0;
import jc2.h;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\t\u0010\u001d¨\u0006\u001e"}, d2 = {"Luk2/b;", "Landroid/os/Parcelable;", "", "transferType", "syncType", "", "totalFileCount", "failedFileCount", "", "isDeviceConnected", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZ)V", "Lal2/c;", "batchTransferEventDetails", "(Lal2/c;)V", "a", "Ljava/lang/String;", "getTransferType", "()Ljava/lang/String;", "b", "getSyncType", "c", "I", "getTotalFileCount", "()I", "d", "getFailedFileCount", JWKParameterNames.RSA_EXPONENT, "Z", "()Z", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class b implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TransferType")
    private final String transferType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("SyncType")
    private final String syncType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("TotalFileCount")
    private final int totalFileCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @SerializedName("FailedFileCount")
    private final int failedFileCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @SerializedName("IsDeviceConnected")
    private final boolean isDeviceConnected;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f171918f = new a(null);
    public static final Parcelable.Creator<b> CREATOR = new C3198b();

    /* JADX INFO: renamed from: uk2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C3198b implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        public final b createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new b(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final b[] newArray(int i14) {
            return new b[i14];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(al2.c cVar) {
        String syncType;
        cVar.getClass();
        g0 g0Var = cVar.f3776b;
        String strName = g0Var.name();
        f171918f.getClass();
        if (g0Var.a() < 20) {
            syncType = h.SILENT.getSyncType();
            syncType.getClass();
        } else if (!g0Var.f132729a || g0Var.a() < 30) {
            syncType = h.AUTOMATIC.getSyncType();
            syncType.getClass();
        } else {
            syncType = h.USER_VISIBLE.getSyncType();
            syncType.getClass();
        }
        this(strName, syncType, cVar.f3780f, cVar.a(), cVar.f3781g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.transferType, bVar.transferType) && s.g(this.syncType, bVar.syncType) && this.totalFileCount == bVar.totalFileCount && this.failedFileCount == bVar.failedFileCount && this.isDeviceConnected == bVar.isDeviceConnected;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isDeviceConnected) + q2.d(this.failedFileCount, q2.d(this.totalFileCount, g.j(this.transferType.hashCode() * 31, 31, this.syncType), 31), 31);
    }

    public final String toString() {
        String str = this.transferType;
        String str2 = this.syncType;
        int i14 = this.totalFileCount;
        int i15 = this.failedFileCount;
        boolean z14 = this.isDeviceConnected;
        StringBuilder sbI = p6.b.i("BatchTransferInfo(transferType=", str, ", syncType=", str2, ", totalFileCount=");
        e0.m(i14, i15, ", failedFileCount=", ", isDeviceConnected=", sbI);
        return hb.a.k(sbI, z14, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i14) {
        parcel.getClass();
        parcel.writeString(this.transferType);
        parcel.writeString(this.syncType);
        parcel.writeInt(this.totalFileCount);
        parcel.writeInt(this.failedFileCount);
        parcel.writeInt(this.isDeviceConnected ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luk2/b$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(String str, String str2, int i14, int i15, boolean z14) {
        str.getClass();
        str2.getClass();
        this.transferType = str;
        this.syncType = str2;
        this.totalFileCount = i14;
        this.failedFileCount = i15;
        this.isDeviceConnected = z14;
    }
}
