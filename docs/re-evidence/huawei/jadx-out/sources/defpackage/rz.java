package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002BK\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\fJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003JT\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0013\"\u0004\b\u001c\u0010\u0015R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010¨\u0006,"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEventParams;", "", "()V", "payPalContextId", "", "linkType", "isVaultRequest", "", "startTime", "", "endTime", "endpoint", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)V", "getEndTime", "()Ljava/lang/Long;", "setEndTime", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getEndpoint", "()Ljava/lang/String;", "setEndpoint", "(Ljava/lang/String;)V", "()Z", "setVaultRequest", "(Z)V", "getLinkType", "setLinkType", "getPayPalContextId", "setPayPalContextId", "getStartTime", "setStartTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;)Lcom/braintreepayments/api/AnalyticsEventParams;", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class rz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f47874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47875c;
    private boolean d;
    private String e;
    private Long h;

    public rz(String str, String str2, boolean z, Long l, Long l2, String str3) {
        this.f47875c = str;
        this.f47873a = str2;
        this.d = z;
        this.h = l;
        this.f47874b = l2;
        this.e = str3;
    }

    public /* synthetic */ rz(String str, String str2, boolean z, Long l, Long l2, String str3, int i, zcm zcmVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : str3);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF47875c() {
        return this.f47875c;
    }

    public final void d(String str) {
        this.f47875c = str;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF47873a() {
        return this.f47873a;
    }

    public final void c(boolean z) {
        this.d = z;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getH() {
        return this.h;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getF47874b() {
        return this.f47874b;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    public rz() {
        this(null, null, false, null, null, null);
    }

    public String toString() {
        return "AnalyticsEventParams(payPalContextId=" + this.f47875c + ", linkType=" + this.f47873a + ", isVaultRequest=" + this.d + ", startTime=" + this.h + ", endTime=" + this.f47874b + ", endpoint=" + this.e + g4.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public int hashCode() {
        String str = this.f47875c;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f47873a;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        boolean z = this.d;
        ?? r3 = z;
        if (z) {
            r3 = 1;
        }
        Long l = this.h;
        int iHashCode3 = l == null ? 0 : l.hashCode();
        Long l2 = this.f47874b;
        int iHashCode4 = l2 == null ? 0 : l2.hashCode();
        String str3 = this.e;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + r3) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof rz)) {
            return false;
        }
        rz rzVar = (rz) other;
        return zcp.b((Object) this.f47875c, (Object) rzVar.f47875c) && zcp.b((Object) this.f47873a, (Object) rzVar.f47873a) && this.d == rzVar.d && zcp.b(this.h, rzVar.h) && zcp.b(this.f47874b, rzVar.f47874b) && zcp.b((Object) this.e, (Object) rzVar.e);
    }
}
