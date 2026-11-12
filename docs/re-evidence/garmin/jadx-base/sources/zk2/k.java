package zk2;

import al2.o;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ok2.a0;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;
import pk2.x;
import pk2.y;
import r1.q2;
import wk2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzk2/k;", "Lwk2/i;", "Lwk2/f;", TtmlNode.TAG_METADATA, "Lwk2/e;", "dataSource", "Lwk2/d;", "dataSink", "Lok2/g0;", "transferType", "Lwk2/m;", "source", "", "createdTime", "Lpk2/x;", "result", "Lal2/m;", "progress", "lastFailureTime", "", "failedAttempts", "agentRequestedPriority", "Lxk2/d;", "readDataProcessor", "<init>", "(Lwk2/f;Lwk2/e;Lwk2/d;Lok2/g0;Lwk2/m;JLpk2/x;Lal2/m;Ljava/lang/Long;ILok2/g0;Lxk2/d;)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class k implements wk2.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public wk2.f f205152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk2.e f205153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public wk2.d f205154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0 f205155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f205156f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f205157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f205158h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public al2.m f205159i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Long f205160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f205161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g0 f205162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xk2.d f205163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f205164n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f205165o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f205166p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f205167q;

    public k(wk2.f fVar, wk2.e eVar, wk2.d dVar, g0 g0Var, m mVar, long j8, x xVar, al2.m mVar2, Long l14, int i14, g0 g0Var2, xk2.d dVar2) {
        fVar.getClass();
        g0Var.getClass();
        mVar.getClass();
        g0Var2.getClass();
        this.f205152b = fVar;
        this.f205153c = eVar;
        this.f205154d = dVar;
        this.f205155e = g0Var;
        this.f205156f = mVar;
        this.f205157g = j8;
        this.f205158h = xVar;
        this.f205159i = mVar2;
        this.f205160j = l14;
        this.f205161k = i14;
        this.f205162l = g0Var2;
        this.f205163m = dVar2;
        wk2.h hVar = mVar.f185869a;
        wk2.h hVar2 = fVar.f185844c;
        if (hVar != hVar2) {
            vb.h.s("TransferSource does not match metadata TransferDirection");
            throw null;
        }
        if ((dVar == null && hVar2 == wk2.h.DEVICE_TO_PHONE) || (eVar == null && hVar2 == wk2.h.PHONE_TO_DEVICE)) {
            vb.h.s("TransferItem must have dataSink or dataSource");
            throw null;
        }
        this.f205167q = mVar == m.f185862b;
    }

    @Override // wk2.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getF205164n() {
        return this.f205164n;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public final wk2.e getF205153c() {
        return this.f205153c;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public final wk2.d getF205154d() {
        return this.f205154d;
    }

    @Override // wk2.i
    public final long d() {
        wk2.d dVar = this.f205154d;
        return dVar != null ? dVar.getSize() : this.f205165o;
    }

    @Override // wk2.i
    public final Integer e(zy2.e eVar) {
        long jMillis;
        if (this.f205167q || this.f205158h == null) {
            return null;
        }
        if (eVar == null) {
            try {
                a0.f132585h.a().g().getClass();
                eVar = new zy2.f();
            } catch (Throwable unused) {
                jMillis = 0;
            }
        }
        jMillis = eVar.millis() - this.f205157g;
        if (jMillis <= 0 || jMillis >= 2147483647L) {
            return null;
        }
        return Integer.valueOf((int) jMillis);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return s.g(this.f205152b, kVar.f205152b) && s.g(this.f205153c, kVar.f205153c) && s.g(this.f205154d, kVar.f205154d) && this.f205155e == kVar.f205155e && this.f205156f == kVar.f205156f && this.f205157g == kVar.f205157g && s.g(this.f205158h, kVar.f205158h) && s.g(this.f205159i, kVar.f205159i) && s.g(this.f205160j, kVar.f205160j) && this.f205161k == kVar.f205161k && this.f205162l == kVar.f205162l && s.g(this.f205163m, kVar.f205163m);
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public final xk2.d getF205163m() {
        return this.f205163m;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: g, reason: from getter */
    public final g0 getF205155e() {
        return this.f205155e;
    }

    @Override // wk2.i
    public final String getDataType() {
        return this.f205152b.f185843b;
    }

    @Override // wk2.i
    public final wk2.h getDirection() {
        return this.f205152b.f185844c;
    }

    @Override // wk2.i
    public final UUID getId() {
        return this.f205152b.f185842a;
    }

    @Override // wk2.n
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final wk2.f getF205152b() {
        return this.f205152b;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: getProgress, reason: from getter */
    public final al2.m getF205159i() {
        return this.f205159i;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: getResult, reason: from getter */
    public final x getF205158h() {
        return this.f205158h;
    }

    @Override // wk2.i
    public final long getTotalSize() {
        wk2.e eVar = this.f205153c;
        return eVar != null ? eVar.getF61810d() : this.f205152b.f185845d;
    }

    @Override // wk2.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getF205166p() {
        return this.f205166p;
    }

    public final int hashCode() {
        int iHashCode = this.f205152b.hashCode() * 31;
        wk2.e eVar = this.f205153c;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        wk2.d dVar = this.f205154d;
        int iE = q6.f.e((this.f205156f.hashCode() + ((this.f205155e.hashCode() + ((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31, 31, this.f205157g);
        x xVar = this.f205158h;
        int iHashCode3 = (iE + (xVar == null ? 0 : xVar.hashCode())) * 31;
        al2.m mVar = this.f205159i;
        int iHashCode4 = (iHashCode3 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        Long l14 = this.f205160j;
        int iHashCode5 = (this.f205162l.hashCode() + q2.d(this.f205161k, (iHashCode4 + (l14 == null ? 0 : l14.hashCode())) * 31, 31)) * 31;
        xk2.d dVar2 = this.f205163m;
        return iHashCode5 + (dVar2 != null ? dVar2.hashCode() : 0);
    }

    @Override // wk2.i
    public final void i(int i14) {
        this.f205166p = i14;
    }

    public final void j() {
        this.f205160j = null;
        this.f205158h = null;
    }

    public final void k(x xVar) {
        x xVar2;
        y yVar;
        ok2.e eVar;
        ok2.e eVar2;
        x xVar3;
        ok2.e eVar3;
        ok2.e eVar4 = xVar != null ? xVar.f138498c : null;
        ok2.e eVar5 = ok2.e.E;
        if (eVar4 != eVar5 || (xVar3 = this.f205158h) == null || (eVar3 = xVar3.f138498c) == null || !eVar3.a()) {
            x xVar4 = this.f205158h;
            if ((xVar4 != null ? xVar4.f138498c : null) == eVar5 && xVar != null && (eVar2 = xVar.f138498c) != null && eVar2.a()) {
                this.f205158h = xVar;
                return;
            }
            if ((xVar == null || (eVar = xVar.f138498c) == null || !eVar.a()) && ((xVar == null || (yVar = xVar.f138496a) == null || yVar.f138508a) && (xVar2 = this.f205158h) != null)) {
                xVar = xVar2;
            }
            this.f205158h = xVar;
        }
    }

    public final void l(k kVar) {
        Object obj;
        kVar.getClass();
        if (!s.g(kVar.f205152b.f185842a, this.f205152b.f185842a)) {
            vb.h.s("Attempted to reconcile transfer items for 2 different files");
            return;
        }
        wk2.f fVar = kVar.f205152b;
        wk2.h hVar = fVar.f185844c;
        if (hVar == this.f205156f.f185869a) {
            wk2.f fVar2 = this.f205152b;
            if (hVar == fVar2.f185844c) {
                if (!s.g(fVar.f185843b, fVar2.f185843b)) {
                    vb.h.s("Attempted to reconcile transfer items for 2 different data types");
                    return;
                }
                if (getTotalSize() != kVar.getTotalSize() && getTotalSize() > 0 && kVar.getTotalSize() > 0) {
                    vb.h.s("Attempted to reconcile transfer items with different FileData");
                    return;
                }
                if (!s.g(kVar.f205152b, this.f205152b)) {
                    wk2.f.a aVar = wk2.f.f185841i;
                    wk2.f fVar3 = this.f205152b;
                    wk2.f fVar4 = kVar.f205152b;
                    Set<UUID> set = fVar4.f185846e;
                    Map<String, String> map = fVar4.f185847f;
                    aVar.getClass();
                    this.f205152b = wk2.f.a.b(fVar3, set, map);
                    if (getTotalSize() != kVar.getTotalSize()) {
                        this.f205152b.f185845d = Math.max(getTotalSize(), kVar.getTotalSize());
                    }
                }
                if ((-kVar.f205155e.ordinal()) > (-this.f205155e.ordinal())) {
                    g0 g0Var = kVar.f205155e;
                    g0Var.getClass();
                    this.f205155e = g0Var;
                }
                m mVar = this.f205156f;
                m mVar2 = kVar.f205156f;
                if (mVar != mVar2) {
                    Iterator it = u.m0(new m[]{mVar, mVar2}).iterator();
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iOrdinal = ((m) next).ordinal();
                            do {
                                Object next2 = it.next();
                                int iOrdinal2 = ((m) next2).ordinal();
                                if (iOrdinal < iOrdinal2) {
                                    next = next2;
                                    iOrdinal = iOrdinal2;
                                }
                            } while (it.hasNext());
                        }
                        obj = next;
                    } else {
                        obj = null;
                    }
                    m mVar3 = (m) obj;
                    if (mVar3 == null) {
                        mVar3 = this.f205156f;
                    }
                    mVar3.getClass();
                    this.f205156f = mVar3;
                }
                k(kVar.f205158h);
                al2.m mVar4 = this.f205159i;
                al2.m mVar5 = kVar.f205159i;
                if (mVar4 == null) {
                    this.f205159i = mVar5;
                } else if (mVar5 != null && !mVar4.equals(mVar5)) {
                    al2.m mVar6 = this.f205159i;
                    mVar6.getClass();
                    al2.m mVar7 = kVar.f205159i;
                    mVar7.getClass();
                    this.f205159i = new o(p13.x.k(mVar6, mVar7), null, null, 6, null);
                }
                xk2.d dVar = this.f205163m;
                xk2.d dVar2 = kVar.f205163m;
                if (dVar == null) {
                    this.f205163m = dVar2;
                } else if (dVar2 != null && !dVar.equals(dVar2)) {
                    vb.h.s("Attempted to reconcile direct read transfer items with different DataProcessors");
                    return;
                }
                Long l14 = kVar.f205160j;
                if (l14 == null) {
                    m mVar8 = kVar.f205156f;
                    if (mVar8 == m.f185863c || mVar8 == m.f185866f) {
                        j();
                    }
                } else {
                    Long l15 = this.f205160j;
                    if (l15 != null) {
                        this.f205160j = Long.valueOf(Math.min(l15.longValue(), l14.longValue()));
                    }
                }
                this.f205161k = Math.max(this.f205161k, kVar.f205161k);
                return;
            }
        }
        vb.h.s("Attempted to reconcile transfer items for 2 different directions");
    }

    public final String toString() {
        String string;
        wk2.f fVar = this.f205152b;
        StringBuilder sb3 = new StringBuilder("TransferItem(metadata=" + ("FileMetadata(id=" + fVar.f185842a + ", dataType='" + fVar.f185843b + "', direction=" + fVar.f185844c + ", totalSize=" + fVar.f185845d + ")") + ", type=" + this.f205155e + ", source=" + this.f205156f);
        long jD = d();
        Object obj = this.f205153c;
        if (obj == null) {
            obj = this.f205154d;
        }
        if (obj != null) {
            int iHashCode = obj.hashCode();
            d53.a.a(16);
            string = Integer.toString(iHashCode, 16);
            string.getClass();
        } else {
            string = null;
        }
        sb3.append(v.h.u(jD, ", data=", "@", string));
        x xVar = this.f205158h;
        if (xVar != null) {
            sb3.append(", result=" + xVar);
        }
        sb3.append(", createTime=" + this.f205157g);
        Long l14 = this.f205160j;
        if (l14 != null) {
            sb3.append(", failureTime=" + l14);
        }
        if (this.f205159i != null) {
            sb3.append(", hasProgress=true");
        }
        sb3.append(")");
        return sb3.toString();
    }

    public /* synthetic */ k(wk2.f fVar, wk2.e eVar, wk2.d dVar, g0 g0Var, m mVar, long j8, x xVar, al2.m mVar2, Long l14, int i14, g0 g0Var2, xk2.d dVar2, int i15, p005kotlin.jvm.internal.j jVar) {
        this(fVar, eVar, dVar, g0Var, mVar, j8, (i15 & 64) != 0 ? null : xVar, (i15 & 128) != 0 ? null : mVar2, (i15 & 256) != 0 ? null : l14, (i15 & 512) != 0 ? 0 : i14, (i15 & 1024) != 0 ? g0Var : g0Var2, (i15 & 2048) != 0 ? null : dVar2);
    }
}
