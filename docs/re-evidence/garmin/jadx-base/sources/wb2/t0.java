package wb2;

import android.text.TextUtils;
import bs2.ad;
import ch.qos.logback.classic.Logger;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes11.dex */
public class t0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte f184140q = (byte) ad.INVALID.f19675a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f184141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f184142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f184143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f184144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f184145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f184146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f184147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f184148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gy2.g f184149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f184150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f184151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f184152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f184153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f184154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f184155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f184156p;

    public t0(long j8, gy2.g gVar, boolean z14, String str, String str2) {
        this.f184143c = null;
        this.f184144d = null;
        this.f184145e = -1L;
        byte b14 = f184140q;
        this.f184147g = b14;
        this.f184148h = null;
        this.f184150j = false;
        this.f184151k = null;
        this.f184153m = false;
        this.f184142b = true;
        this.f184152l = j8;
        this.f184149i = gVar;
        this.f184146f = (byte) -1;
        this.f184147g = gVar != null ? (byte) gVar.f80324a : b14;
        if (gy2.g.GOLF_CLUB == gVar) {
            this.f184146f = UnsignedBytes.MAX_POWER_OF_TWO;
            this.f184147g = (byte) ad.GOLF_CLUB.f19675a;
        }
        this.f184150j = z14;
        this.f184156p = false;
        this.f184154n = str;
        this.f184155o = str2;
        int i14 = gt2.c.f79010a;
        this.f184141a = gt2.b.f79005a.i("TransferableItem");
    }

    public final boolean a() {
        return this.f184147g == gy2.g.SOFTWARE_UPDATE.f80324a;
    }

    public final String toString() {
        String strValueOf;
        ad adVar;
        String str = this.f184154n;
        String str2 = this.f184151k;
        byte b14 = this.f184147g;
        try {
            StringBuilder sb3 = new StringBuilder("TransferableItem");
            boolean z14 = this.f184142b;
            sb3.append(z14 ? " [DOWNLOAD] " : " [UPLOAD] ");
            if (!z14) {
                sb3.append("fileDataType=");
                byte b15 = this.f184146f;
                if (b15 == -128) {
                    strValueOf = "FIT";
                } else if (b15 == -1) {
                    strValueOf = "NON_FIT";
                } else if (b15 == 2) {
                    strValueOf = "GRAPHIC";
                } else {
                    strValueOf = b15 == -1 ? "INVALID" : String.valueOf((int) b15);
                }
                sb3.append(strValueOf);
                sb3.append("(");
                sb3.append((int) b15);
                sb3.append("); fileDataSubType=");
                int i14 = b0.F;
                short s8 = b14;
                ad[] adVarArrValues = ad.values();
                int length = adVarArrValues.length;
                int i15 = 0;
                while (true) {
                    if (i15 >= length) {
                        adVar = ad.INVALID;
                        break;
                    }
                    adVar = adVarArrValues[i15];
                    if (s8 == adVar.f19675a) {
                        break;
                    }
                    i15++;
                }
                sb3.append(adVar.name());
                sb3.append("(");
                sb3.append((int) b14);
                sb3.append("); ");
            }
            gy2.g gVar = this.f184149i;
            if (gVar != null) {
                sb3.append("messageType=");
                sb3.append(gVar);
                sb3.append("(");
                sb3.append(gVar.f80324a);
                sb3.append("); ");
            }
            if (!TextUtils.isEmpty(str2)) {
                sb3.append("fileIndex=");
                sb3.append(str2);
                sb3.append("; ");
            }
            sb3.append("fileSize=");
            sb3.append(this.f184145e);
            sb3.append("; ");
            long j8 = this.f184152l;
            if (j8 != -1) {
                sb3.append("deviceMessageId=");
                sb3.append(j8);
                sb3.append("; ");
            }
            if (z14) {
                sb3.append("messageName=");
                sb3.append(this.f184155o);
                sb3.append("; ");
                if (!TextUtils.isEmpty(str)) {
                    sb3.append("messageUrl=");
                    id2.f.f93041c.getClass();
                    sb3.append(id2.f.a.a(str));
                    sb3.append("; ");
                }
                if (!TextUtils.isEmpty(this.f184148h)) {
                    sb3.append("absoluteFilePathInDevice=");
                    sb3.append(this.f184148h);
                    sb3.append("; ");
                }
            } else {
                sb3.append("userInitiated=");
                sb3.append(this.f184150j);
                sb3.append("; ");
            }
            if (!TextUtils.isEmpty(this.f184144d)) {
                sb3.append("fileName=");
                sb3.append(this.f184144d);
                sb3.append("; ");
            }
            if (!TextUtils.isEmpty(this.f184143c)) {
                sb3.append("fileDir=");
                sb3.append(this.f184143c);
                sb3.append("; ");
            }
            return sb3.toString();
        } catch (NullPointerException e4) {
            this.f184141a.error("Fix me developer! Caught NPE in toString()...", (Throwable) e4);
            return "";
        }
    }

    public t0(String str, long j8, byte b14, byte b15, boolean z14, boolean z15) {
        this.f184143c = null;
        this.f184144d = null;
        this.f184148h = null;
        this.f184149i = null;
        this.f184152l = -1L;
        this.f184153m = false;
        this.f184142b = false;
        this.f184151k = str;
        this.f184145e = j8;
        this.f184146f = b14;
        this.f184147g = b15;
        this.f184150j = z14;
        this.f184154n = null;
        this.f184155o = null;
        this.f184156p = z15;
        int i14 = gt2.c.f79010a;
        this.f184141a = gt2.b.f79005a.i("TransferableItem");
    }
}
