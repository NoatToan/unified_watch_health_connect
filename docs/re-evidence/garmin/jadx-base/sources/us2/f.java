package us2;

import java.util.Set;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lus2/f;", "Lrs2/c;", "", "connectionId", "", "unitId", "", "productNumber", "deviceName", "softwareVersion", "", "isDualBluetoothConnection", "bluetoothLimitation", "", "configurationFlags", "bleMacAddress", "btcMacAddress", "originalConfiguration", "usesFitForConfiguration", "", "queuedDownloadPayload", "protocolVersion", "<init>", "(Ljava/lang/String;JILjava/lang/String;IZILjava/util/Set;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Z[BI)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements rs2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f172493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f172494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f172496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f172497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f172498f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f172499g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<Integer> f172500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f172501i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f172502j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set<Integer> f172503k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f172504l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f172505m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f172506n;

    public f(String str, long j8, int i14, String str2, int i15, boolean z14, int i16, Set<Integer> set, String str3, String str4, Set<Integer> set2, boolean z15, byte[] bArr, int i17) {
        str.getClass();
        str2.getClass();
        set.getClass();
        set2.getClass();
        this.f172493a = str;
        this.f172494b = j8;
        this.f172495c = i14;
        this.f172496d = str2;
        this.f172497e = i15;
        this.f172498f = z14;
        this.f172499g = i16;
        this.f172500h = set;
        this.f172501i = str3;
        this.f172502j = str4;
        this.f172503k = set2;
        this.f172504l = z15;
        this.f172505m = bArr;
        this.f172506n = i17;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBleMacAddress, reason: from getter */
    public final String getF172501i() {
        return this.f172501i;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBluetoothLimitation, reason: from getter */
    public final int getF172499g() {
        return this.f172499g;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getBtcMacAddress, reason: from getter */
    public final String getF172502j() {
        return this.f172502j;
    }

    @Override // rs2.c
    public final Set<Integer> getConfigurationFlags() {
        return this.f172500h;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getConnectionId, reason: from getter */
    public final String getF172493a() {
        return this.f172493a;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getDeviceName, reason: from getter */
    public final String getF172496d() {
        return this.f172496d;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getProductNumber, reason: from getter */
    public final int getF172495c() {
        return this.f172495c;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getSoftwareVersion, reason: from getter */
    public final int getF172497e() {
        return this.f172497e;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: getUnitId, reason: from getter */
    public final long getF172494b() {
        return this.f172494b;
    }

    @Override // rs2.c
    /* JADX INFO: renamed from: isDualBluetoothConnection, reason: from getter */
    public final boolean getF172498f() {
        return this.f172498f;
    }
}
