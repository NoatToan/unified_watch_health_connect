package defpackage;

import com.huawei.hms.network.embedded.g4;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n¢\u0006\u0002\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003Jr\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020\u00072\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0014R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014¨\u0006,"}, d2 = {"Lcom/braintreepayments/api/AnalyticsEvent;", "", "name", "", "payPalContextId", "linkType", "venmoInstalled", "", "isVaultRequest", "startTime", "", "endTime", "endpoint", "timestamp", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;J)V", "getEndTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEndpoint", "()Ljava/lang/String;", "()Z", "getLinkType", "getName", "getPayPalContextId", "getStartTime", "getTimestamp", "()J", "getVenmoInstalled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;J)Lcom/braintreepayments/api/AnalyticsEvent;", "equals", "other", WatchFaceConstant.HASHCODE, "", "toString", "BraintreeCore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class rr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f47584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f47585c;
    private final String d;
    private final Long e;
    private final boolean f;
    private final long h;
    private final Long i;
    private final String j;

    public rr(String str, String str2, String str3, boolean z, boolean z2, Long l, Long l2, String str4, long j) {
        zcp.c(str, "");
        this.f47583a = str;
        this.j = str2;
        this.d = str3;
        this.f = z;
        this.f47584b = z2;
        this.i = l;
        this.e = l2;
        this.f47585c = str4;
        this.h = j;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF47583a() {
        return this.f47583a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getJ() {
        return this.j;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getF47584b() {
        return this.f47584b;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Long getI() {
        return this.i;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getE() {
        return this.e;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF47585c() {
        return this.f47585c;
    }

    public /* synthetic */ rr(String str, String str2, String str3, boolean z, boolean z2, Long l, Long l2, String str4, long j, int i, zcm zcmVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : l2, (i & 128) == 0 ? str4 : null, (i & 256) != 0 ? System.currentTimeMillis() : j);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getH() {
        return this.h;
    }

    public String toString() {
        return "AnalyticsEvent(name=" + this.f47583a + ", payPalContextId=" + this.j + ", linkType=" + this.d + ", venmoInstalled=" + this.f + ", isVaultRequest=" + this.f47584b + ", startTime=" + this.i + ", endTime=" + this.e + ", endpoint=" + this.f47585c + ", timestamp=" + this.h + g4.l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    public int hashCode() {
        int iHashCode = this.f47583a.hashCode();
        String str = this.j;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.d;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        boolean z = this.f;
        ?? r4 = z;
        if (z) {
            r4 = 1;
        }
        boolean z2 = this.f47584b;
        ?? r5 = z2 ? 1 : z2;
        Long l = this.i;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Long l2 = this.e;
        int iHashCode5 = l2 == null ? 0 : l2.hashCode();
        String str3 = this.f47585c;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r4) * 31) + r5) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.h);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof rr)) {
            return false;
        }
        rr rrVar = (rr) other;
        return zcp.b((Object) this.f47583a, (Object) rrVar.f47583a) && zcp.b((Object) this.j, (Object) rrVar.j) && zcp.b((Object) this.d, (Object) rrVar.d) && this.f == rrVar.f && this.f47584b == rrVar.f47584b && zcp.b(this.i, rrVar.i) && zcp.b(this.e, rrVar.e) && zcp.b((Object) this.f47585c, (Object) rrVar.f47585c) && this.h == rrVar.h;
    }
}
