package p20;

import java.util.Arrays;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import r1.q2;
import wr.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lp20/d;", "", "", "unitID", "", "macAddress", "partNumber", "productNumber", "softwareVersion", "imageURL", "displayName", "productDisplayName", "", "capabilities", "", "connectionType", "gbleAuthLongTermKey", "gbleAuthEdiv", "gbleAuthRandom", "applicationKey", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[BI[B[B[BLjava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f134986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f134988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f134989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f134990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f134991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f134992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f134993h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f134994i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f134995j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f134996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final byte[] f134997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f134998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f134999n;

    public d(long j8, String str, String str2, String str3, String str4, String str5, String str6, String str7, byte[] bArr, int i14, byte[] bArr2, byte[] bArr3, byte[] bArr4, String str8) {
        str.getClass();
        str3.getClass();
        str7.getClass();
        bArr.getClass();
        this.f134986a = j8;
        this.f134987b = str;
        this.f134988c = str2;
        this.f134989d = str3;
        this.f134990e = str4;
        this.f134991f = str5;
        this.f134992g = str6;
        this.f134993h = str7;
        this.f134994i = bArr;
        this.f134995j = i14;
        this.f134996k = bArr2;
        this.f134997l = bArr3;
        this.f134998m = bArr4;
        this.f134999n = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f134986a == dVar.f134986a && this.f134987b.equals(dVar.f134987b) && s.g(this.f134988c, dVar.f134988c) && this.f134989d.equals(dVar.f134989d) && s.g(this.f134990e, dVar.f134990e) && s.g(this.f134991f, dVar.f134991f) && s.g(this.f134992g, dVar.f134992g) && this.f134993h.equals(dVar.f134993h) && this.f134994i.equals(dVar.f134994i) && this.f134995j == dVar.f134995j && s.g(this.f134996k, dVar.f134996k) && s.g(this.f134997l, dVar.f134997l) && s.g(this.f134998m, dVar.f134998m) && s.g(this.f134999n, dVar.f134999n);
    }

    public final int hashCode() {
        int iJ = g.j(Long.hashCode(this.f134986a) * 31, 31, this.f134987b);
        String str = this.f134988c;
        int iJ2 = g.j((iJ + (str == null ? 0 : str.hashCode())) * 31, 31, this.f134989d);
        String str2 = this.f134990e;
        int iHashCode = (iJ2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f134991f;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f134992g;
        int iD = q2.d(this.f134995j, (Arrays.hashCode(this.f134994i) + g.j((iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f134993h)) * 31, 31);
        byte[] bArr = this.f134996k;
        int iHashCode3 = (iD + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.f134997l;
        int iHashCode4 = (iHashCode3 + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.f134998m;
        int iHashCode5 = (iHashCode4 + (bArr3 == null ? 0 : Arrays.hashCode(bArr3))) * 31;
        String str5 = this.f134999n;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.f134994i);
        String string2 = Arrays.toString(this.f134996k);
        String string3 = Arrays.toString(this.f134997l);
        String string4 = Arrays.toString(this.f134998m);
        StringBuilder sbK = com.airbnb.lottie.animation.keyframe.a.k(this.f134986a, "PairedDeviceRecord(unitID=", ", macAddress=", this.f134987b);
        sn.a.t(sbK, ", partNumber=", this.f134988c, ", productNumber=", this.f134989d);
        sn.a.t(sbK, ", softwareVersion=", this.f134990e, ", imageURL=", this.f134991f);
        sn.a.t(sbK, ", displayName=", this.f134992g, ", productDisplayName=", this.f134993h);
        sbK.append(", capabilities=");
        sbK.append(string);
        sbK.append(", connectionType=");
        sbK.append(this.f134995j);
        sn.a.t(sbK, ", gbleAuthLongTermKey=", string2, ", gbleAuthEdiv=", string3);
        sn.a.t(sbK, ", gbleAuthRandom=", string4, ", applicationKey=", this.f134999n);
        sbK.append(")");
        return sbK.toString();
    }
}
