package qm1;

import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import yc.l2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001a\b\u0002\u0010\f\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqm1/k;", "", "Lyz1/d;", "status", "", "sleepScore", "sleepTimeSeconds", "Li53/c;", "Lqm1/n;", "sleepLevels", "Lo13/p;", "", "sleepInterval", "", "sleepIntervalTimeZone", "", "isRemCapable", "isSleepScoreAvailable", "last4WeeksSleepDataAvailable", "<init>", "(Lyz1/d;Ljava/lang/Integer;Ljava/lang/Integer;Li53/c;Lo13/p;Ljava/lang/String;ZZZ)V", "gcm-sleep_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f145620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f145621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f145622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<n> f145623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p<Long, Long> f145624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f145625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f145626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f145627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f145628i;

    public k(yz1.d dVar, Integer num, Integer num2, i53.c cVar, p pVar, String str, boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : num2, (i14 & 8) != 0 ? j53.l.b() : cVar, (i14 & 16) != 0 ? null : pVar, (i14 & 32) != 0 ? null : str, (i14 & 64) != 0 ? false : z14, (i14 & 128) != 0 ? false : z15, (i14 & 256) != 0 ? false : z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f145620a, kVar.f145620a) && s.g(this.f145621b, kVar.f145621b) && s.g(this.f145622c, kVar.f145622c) && s.g(this.f145623d, kVar.f145623d) && s.g(this.f145624e, kVar.f145624e) && s.g(this.f145625f, kVar.f145625f) && this.f145626g == kVar.f145626g && this.f145627h == kVar.f145627h && this.f145628i == kVar.f145628i;
    }

    public final int hashCode() {
        int iHashCode = this.f145620a.hashCode() * 31;
        Integer num = this.f145621b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f145622c;
        int iA = l2.a(this.f145623d, (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31, 31);
        p<Long, Long> pVar = this.f145624e;
        int iHashCode3 = (iA + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str = this.f145625f;
        return Boolean.hashCode(this.f145628i) + q6.f.g(q6.f.g((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f145626g), 31, this.f145627h);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SleepCardData(status=");
        sb3.append(this.f145620a);
        sb3.append(", sleepScore=");
        sb3.append(this.f145621b);
        sb3.append(", sleepTimeSeconds=");
        sb3.append(this.f145622c);
        sb3.append(", sleepLevels=");
        sb3.append(this.f145623d);
        sb3.append(", sleepInterval=");
        sb3.append(this.f145624e);
        sb3.append(", sleepIntervalTimeZone=");
        sb3.append(this.f145625f);
        sb3.append(", isRemCapable=");
        kg.f.q(", isSleepScoreAvailable=", ", last4WeeksSleepDataAvailable=", sb3, this.f145626g, this.f145627h);
        return hb.a.k(sb3, this.f145628i, ")");
    }

    public k(yz1.d dVar, Integer num, Integer num2, i53.c<n> cVar, p<Long, Long> pVar, String str, boolean z14, boolean z15, boolean z16) {
        dVar.getClass();
        cVar.getClass();
        this.f145620a = dVar;
        this.f145621b = num;
        this.f145622c = num2;
        this.f145623d = cVar;
        this.f145624e = pVar;
        this.f145625f = str;
        this.f145626g = z14;
        this.f145627h = z15;
        this.f145628i = z16;
    }
}
