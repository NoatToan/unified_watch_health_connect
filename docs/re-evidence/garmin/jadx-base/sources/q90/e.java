package q90;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lq90/e;", "Lbm2/f;", "", "unitId", "", "deviceApplicationKey", "", "bluetoothClassicDevice", "bluetoothLowEnergyDevice", "", "deviceCategories", "deviceName", "productNumber", "deviceProductSku", "devicePartNumber", "imageURL", "deviceSerialNumber", "<init>", "(JLjava/lang/String;ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e implements bm2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f143511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f143513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f143514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<String> f143515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f143516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f143517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f143518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f143519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f143520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f143521k;

    public /* synthetic */ e(long j8, String str, boolean z14, boolean z15, List list, String str2, String str3, String str4, String str5, String str6, String str7, int i14, j jVar) {
        this((i14 & 1) != 0 ? -1L : j8, str, (i14 & 4) != 0 ? false : z14, (i14 & 8) != 0 ? true : z15, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? "" : str2, (i14 & 64) != 0 ? "" : str3, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? "" : str5, (i14 & 512) != 0 ? "" : str6, (i14 & 1024) != 0 ? "" : str7);
    }

    @Override // bm2.f
    public final void b(long j8) {
        this.f143511a = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f143511a == eVar.f143511a && s.g(this.f143512b, eVar.f143512b) && this.f143513c == eVar.f143513c && this.f143514d == eVar.f143514d && s.g(this.f143515e, eVar.f143515e) && s.g(this.f143516f, eVar.f143516f) && s.g(this.f143517g, eVar.f143517g) && s.g(this.f143518h, eVar.f143518h) && s.g(this.f143519i, eVar.f143519i) && s.g(this.f143520j, eVar.f143520j) && s.g(this.f143521k, eVar.f143521k);
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getApplicationKey, reason: from getter */
    public final String getF143512b() {
        return this.f143512b;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getDeviceId, reason: from getter */
    public final long getF143511a() {
        return this.f143511a;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getImageUrl, reason: from getter */
    public final String getF143520j() {
        return this.f143520j;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getPartNumberPartial, reason: from getter */
    public final String getF143517g() {
        return this.f143517g;
    }

    @Override // bm2.f, com.garmin.device.sharing.management.dtos.IRegisteredDeviceDto
    /* JADX INFO: renamed from: getProductDisplayName, reason: from getter */
    public final String getF143516f() {
        return this.f143516f;
    }

    public final int hashCode() {
        int iG = q6.f.g(q6.f.g(wr.g.j(Long.hashCode(this.f143511a) * 31, 31, this.f143512b), 31, this.f143513c), 31, this.f143514d);
        List<String> list = this.f143515e;
        int iJ = wr.g.j(wr.g.j((iG + (list == null ? 0 : list.hashCode())) * 31, 31, this.f143516f), 31, this.f143517g);
        String str = this.f143518h;
        int iJ2 = wr.g.j(wr.g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f143519i), 31, this.f143520j);
        String str2 = this.f143521k;
        return iJ2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f143511a, "PairingDeviceDTO(unitId=", ", deviceApplicationKey=", this.f143512b);
        com.airbnb.lottie.animation.keyframe.a.v(", bluetoothClassicDevice=", ", bluetoothLowEnergyDevice=", sbK, this.f143513c, this.f143514d);
        sbK.append(", deviceCategories=");
        sbK.append(this.f143515e);
        sbK.append(", deviceName=");
        sbK.append(this.f143516f);
        sn.a.t(sbK, ", productNumber=", this.f143517g, ", deviceProductSku=", this.f143518h);
        sn.a.t(sbK, ", devicePartNumber=", this.f143519i, ", imageURL=", this.f143520j);
        return e0.h(sbK, ", deviceSerialNumber=", this.f143521k, ")");
    }

    public e(long j8, String str, boolean z14, boolean z15, List<String> list, String str2, String str3, String str4, String str5, String str6, String str7) {
        hb.a.p(str, str2, str3, str5, str6);
        this.f143511a = j8;
        this.f143512b = str;
        this.f143513c = z14;
        this.f143514d = z15;
        this.f143515e = list;
        this.f143516f = str2;
        this.f143517g = str3;
        this.f143518h = str4;
        this.f143519i = str5;
        this.f143520j = str6;
        this.f143521k = str7;
    }
}
