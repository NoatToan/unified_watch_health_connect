package yt2;

import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import ch.qos.logback.core.spi.ComponentTracker;
import j20.x;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import r1.q2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001BO\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lyt2/c;", "", "", "throwsExceptionWhenValidationFails", "uploadWithWifiOnly", "", "uploadFrequencyInMillis", "", "maxNumberOfEventsToCache", "maxCacheSizeInBytes", "maxEventsPerBatch", "uploadCallTimeoutInMillis", "<init>", "(ZZJIJIJ)V", "analytics-omt_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f199657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f199658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f199659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f199660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f199661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f199662f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f199663g;

    public /* synthetic */ c(boolean z14, boolean z15, long j8, int i14, long j14, int i15, long j15, int i16, j jVar) {
        this((i16 & 1) != 0 ? false : z14, (i16 & 2) != 0 ? false : z15, (i16 & 4) != 0 ? ComponentTracker.DEFAULT_TIMEOUT : j8, (i16 & 8) != 0 ? 10000 : i14, (i16 & 16) != 0 ? SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE : j14, (i16 & 32) != 0 ? 200 : i15, (i16 & 64) != 0 ? 60000L : j15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f199657a == cVar.f199657a && this.f199658b == cVar.f199658b && this.f199659c == cVar.f199659c && this.f199660d == cVar.f199660d && this.f199661e == cVar.f199661e && this.f199662f == cVar.f199662f && this.f199663g == cVar.f199663g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    public final int hashCode() {
        boolean z14 = this.f199657a;
        ?? r14 = z14;
        if (z14) {
            r14 = 1;
        }
        int i14 = r14 * 31;
        boolean z15 = this.f199658b;
        return Long.hashCode(this.f199663g) + q2.d(this.f199662f, q6.f.e(q2.d(this.f199660d, q6.f.e((i14 + (z15 ? 1 : z15)) * 31, 31, this.f199659c), 31), 31, this.f199661e), 31);
    }

    public final String toString() {
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("OmtAnalyticConfiguration(throwsExceptionWhenValidationFails=", ", uploadWithWifiOnly=", ", uploadFrequencyInMillis=", this.f199657a, this.f199658b);
        sbM.append(this.f199659c);
        sbM.append(", maxNumberOfEventsToCache=");
        sbM.append(this.f199660d);
        x.j(this.f199661e, ", maxCacheSizeInBytes=", ", maxEventsPerBatch=", sbM);
        sbM.append(this.f199662f);
        sbM.append(", uploadCallTimeoutInMillis=");
        sbM.append(this.f199663g);
        sbM.append(")");
        return sbM.toString();
    }

    public c(boolean z14) {
        this(z14, false, 0L, 0, 0L, 0, 0L, 126, null);
    }

    public c(boolean z14, boolean z15) {
        this(z14, z15, 0L, 0, 0L, 0, 0L, 124, null);
    }

    public c(boolean z14, boolean z15, long j8) {
        this(z14, z15, j8, 0, 0L, 0, 0L, 120, null);
    }

    public c(boolean z14, boolean z15, long j8, int i14) {
        this(z14, z15, j8, i14, 0L, 0, 0L, 112, null);
    }

    public c(boolean z14, boolean z15, long j8, int i14, long j14) {
        this(z14, z15, j8, i14, j14, 0, 0L, 96, null);
    }

    public c(boolean z14, boolean z15, long j8, int i14, long j14, int i15) {
        this(z14, z15, j8, i14, j14, i15, 0L, 64, null);
    }

    public c(boolean z14, boolean z15, long j8, int i14, long j14, int i15, long j15) {
        this.f199657a = z14;
        this.f199658b = z15;
        this.f199659c = j8;
        this.f199660d = i14;
        this.f199661e = j14;
        this.f199662f = i15;
        this.f199663g = j15;
    }

    public c() {
        this(false, false, 0L, 0, 0L, 0, 0L, 127, null);
    }
}
