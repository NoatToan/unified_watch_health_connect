package cq2;

import i3.e5;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcq2/b;", "", "", "deviceType", "manufacturerName", "deviceName", "firmwareVersion", "osName", "serialNumber", "modelNumber", "hardwareRevision", "softwareRevision", "systemId", "licenseKey", "bdAddress", "notificationToken", "profileId", "secureElementId", "casd", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f55236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f55238f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f55239g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55240h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f55241i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f55242j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f55243k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f55244l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f55245m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f55246n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f55247o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f55248p;

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : str4, (i14 & 16) != 0 ? null : str5, (i14 & 32) != 0 ? null : str6, (i14 & 64) != 0 ? null : str7, (i14 & 128) != 0 ? null : str8, (i14 & 256) != 0 ? null : str9, (i14 & 512) != 0 ? null : str10, (i14 & 1024) != 0 ? null : str11, (i14 & 2048) != 0 ? null : str12, (i14 & 4096) != 0 ? null : str13, (i14 & 8192) != 0 ? null : str14, (i14 & 16384) != 0 ? null : str15, (i14 & 32768) != 0 ? null : str16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f55233a, bVar.f55233a) && s.g(this.f55234b, bVar.f55234b) && s.g(this.f55235c, bVar.f55235c) && s.g(this.f55236d, bVar.f55236d) && s.g(this.f55237e, bVar.f55237e) && s.g(this.f55238f, bVar.f55238f) && s.g(this.f55239g, bVar.f55239g) && s.g(this.f55240h, bVar.f55240h) && s.g(this.f55241i, bVar.f55241i) && s.g(this.f55242j, bVar.f55242j) && s.g(this.f55243k, bVar.f55243k) && s.g(this.f55244l, bVar.f55244l) && s.g(this.f55245m, bVar.f55245m) && s.g(this.f55246n, bVar.f55246n) && s.g(this.f55247o, bVar.f55247o) && s.g(this.f55248p, bVar.f55248p);
    }

    public final int hashCode() {
        String str = this.f55233a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f55234b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f55235c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f55236d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f55237e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f55238f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f55239g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f55240h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f55241i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f55242j;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f55243k;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f55244l;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f55245m;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f55246n;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f55247o;
        int iHashCode15 = (iHashCode14 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f55248p;
        return iHashCode15 + (str16 != null ? str16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("NewFitPayPaymentDevice(deviceType=", this.f55233a, ", manufacturerName=", this.f55234b, ", deviceName=");
        sn.a.t(sbI, this.f55235c, ", firmwareVersion=", this.f55236d, ", osName=");
        sn.a.t(sbI, this.f55237e, ", serialNumber=", this.f55238f, ", modelNumber=");
        sn.a.t(sbI, this.f55239g, ", hardwareRevision=", this.f55240h, ", softwareRevision=");
        sn.a.t(sbI, this.f55241i, ", systemId=", this.f55242j, ", licenseKey=");
        sn.a.t(sbI, this.f55243k, ", bdAddress=", this.f55244l, ", notificationToken=");
        sn.a.t(sbI, this.f55245m, ", profileId=", this.f55246n, ", secureElementId=");
        return e5.h(sbI, this.f55247o, ", casd=", this.f55248p, ")");
    }

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16) {
        this.f55233a = str;
        this.f55234b = str2;
        this.f55235c = str3;
        this.f55236d = str4;
        this.f55237e = str5;
        this.f55238f = str6;
        this.f55239g = str7;
        this.f55240h = str8;
        this.f55241i = str9;
        this.f55242j = str10;
        this.f55243k = str11;
        this.f55244l = str12;
        this.f55245m = str13;
        this.f55246n = str14;
        this.f55247o = str15;
        this.f55248p = str16;
    }

    public b() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 65535, null);
    }
}
