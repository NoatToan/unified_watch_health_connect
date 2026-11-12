package al2;

import com.garmin.device.filetransfer.core.util.CoreTransferException;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import ok2.g0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import pk2.x;
import pk2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015B!\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0018¨\u0006\u001a"}, d2 = {"Lal2/l;", "", "Lrs2/c;", "device", "Lok2/g0;", "transferType", "Lwk2/f;", TtmlNode.TAG_METADATA, "Lal2/k;", "event", "Lpk2/x;", "result", "", "transferSize", "", "transferDuration", "Lcom/garmin/device/filetransfer/core/util/CoreTransferException;", "details", "compressedTransferSize", "queuedDuration", "<init>", "(Lrs2/c;Lok2/g0;Lwk2/f;Lal2/k;Lpk2/x;Ljava/lang/Long;Ljava/lang/Integer;Lcom/garmin/device/filetransfer/core/util/CoreTransferException;Ljava/lang/Long;Ljava/lang/Integer;)V", "Lwk2/i;", "item", "(Lrs2/c;Lwk2/i;Lal2/k;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f3818k = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rs2.c f3819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f3820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wk2.f f3821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f3822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f3823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f3824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f3825g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoreTransferException f3826h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f3827i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f3828j;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(rs2.c cVar, g0 g0Var, wk2.f fVar, k kVar, x xVar, Long l14, Integer num, CoreTransferException coreTransferException, Long l15, Integer num2, int i14, p005kotlin.jvm.internal.j jVar) {
        xVar = (i14 & 16) != 0 ? null : xVar;
        this(cVar, g0Var, fVar, kVar, xVar, (i14 & 32) != 0 ? null : l14, (i14 & 64) != 0 ? null : num, (i14 & 128) != 0 ? xVar != null ? xVar.f138497b : null : coreTransferException, (i14 & 256) != 0 ? null : l15, (i14 & 512) != 0 ? null : num2);
    }

    public final Boolean a() {
        y yVar;
        if (!this.f3822d.f3817a) {
            return null;
        }
        boolean z14 = false;
        x xVar = this.f3823e;
        if (xVar != null && (yVar = xVar.f138496a) != null && !yVar.f138508a) {
            z14 = true;
        }
        return Boolean.valueOf(z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s.g(this.f3819a, lVar.f3819a) && this.f3820b == lVar.f3820b && s.g(this.f3821c, lVar.f3821c) && this.f3822d == lVar.f3822d && s.g(this.f3823e, lVar.f3823e) && s.g(this.f3824f, lVar.f3824f) && s.g(this.f3825g, lVar.f3825g) && s.g(this.f3826h, lVar.f3826h) && s.g(this.f3827i, lVar.f3827i) && s.g(this.f3828j, lVar.f3828j);
    }

    public final int hashCode() {
        int iHashCode = (this.f3822d.hashCode() + ((this.f3821c.hashCode() + ((this.f3820b.hashCode() + (this.f3819a.hashCode() * 31)) * 31)) * 31)) * 31;
        x xVar = this.f3823e;
        int iHashCode2 = (iHashCode + (xVar == null ? 0 : xVar.hashCode())) * 31;
        Long l14 = this.f3824f;
        int iHashCode3 = (iHashCode2 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Integer num = this.f3825g;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        CoreTransferException coreTransferException = this.f3826h;
        int iHashCode5 = (iHashCode4 + (coreTransferException == null ? 0 : coreTransferException.hashCode())) * 31;
        Long l15 = this.f3827i;
        int iHashCode6 = (iHashCode5 + (l15 == null ? 0 : l15.hashCode())) * 31;
        Integer num2 = this.f3828j;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("FileTransfer(");
        sb3.append(cl2.c.p(this.f3819a));
        sb3.append(", " + this.f3822d);
        sb3.append(", " + this.f3820b);
        wk2.f fVar = this.f3821c;
        sb3.append(", " + fVar.f185843b);
        sb3.append(", " + fVar.f185842a);
        x xVar = this.f3823e;
        if ((xVar != null ? xVar.f138496a : null) != null) {
            sb3.append(", status=" + xVar.f138496a);
        }
        CoreTransferException coreTransferException = this.f3826h;
        if (coreTransferException != null) {
            sb3.append(", " + coreTransferException);
        }
        sb3.append(")");
        return sb3.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/l$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public l(rs2.c cVar, g0 g0Var, wk2.f fVar, k kVar, x xVar, Long l14, Integer num, CoreTransferException coreTransferException, Long l15, Integer num2) {
        cVar.getClass();
        g0Var.getClass();
        fVar.getClass();
        kVar.getClass();
        this.f3819a = cVar;
        this.f3820b = g0Var;
        this.f3821c = fVar;
        this.f3822d = kVar;
        this.f3823e = xVar;
        this.f3824f = l14;
        this.f3825g = num;
        this.f3826h = coreTransferException;
        this.f3827i = l15;
        this.f3828j = num2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(rs2.c cVar, wk2.i iVar, k kVar) {
        this(cVar, iVar.g(), iVar.getMetadata(), kVar, kVar != k.STARTED ? iVar.getResult() : null, null, null, null, null, kVar.f3817a ? iVar.e(null) : null, 480, null);
        cVar.getClass();
        iVar.getClass();
        kVar.getClass();
    }
}
