package us2;

import com.garmin.gfdi.ResponseStatusException;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import o53.l1;
import o53.r;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import rs2.p;
import rs2.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lus2/j;", "", "Lct2/f;", "writer", "Lct2/h;", "transactionId", "", "messageType", "", "messagePayload", "Lrs2/e;", "config", "Lrs2/p;", "gfdiWatchdog", "", "protoResponseTimeout", "<init>", "(Lct2/f;Lct2/h;I[BLrs2/e;Lrs2/p;J)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ct2.f f172522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ct2.h f172523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f172524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f172525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final rs2.e f172526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f172527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f172528g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Logger f172529h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f172530i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<l1> f172531j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<r<byte[]>> f172532k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference<Timer> f172533l;

    public j(ct2.f fVar, ct2.h hVar, int i14, byte[] bArr, rs2.e eVar, p pVar, long j8) {
        fVar.getClass();
        hVar.getClass();
        bArr.getClass();
        eVar.getClass();
        this.f172522a = fVar;
        this.f172523b = hVar;
        this.f172524c = i14;
        this.f172525d = bArr;
        this.f172526e = eVar;
        this.f172527f = pVar;
        this.f172528g = j8;
        rs2.d.f154380a.getClass();
        this.f172529h = LoggerFactory.getLogger(rs2.d.a("SendMessageTask", -1L, this, null));
        this.f172530i = new AtomicInteger(eVar.f154385a + 1);
        this.f172531j = new AtomicReference<>();
        this.f172532k = new AtomicReference<>();
        this.f172533l = new AtomicReference<>(null);
    }

    public final void a(y yVar, byte[] bArr) {
        yVar.getClass();
        r<byte[]> andSet = this.f172532k.getAndSet(null);
        if (andSet == null) {
            this.f172529h.error("Received a response while not ready.");
            return;
        }
        if (yVar == y.ACK) {
            andSet.p(bArr);
        } else if (this.f172530i.get() == 0 || yVar == y.NAK || yVar == y.UNKNOWN_OR_NOT_SUPPORTED) {
            andSet.O(new ResponseStatusException(yVar, bArr));
        } else {
            andSet.p(null);
        }
    }

    public /* synthetic */ j(ct2.f fVar, ct2.h hVar, int i14, byte[] bArr, rs2.e eVar, p pVar, long j8, int i15, p005kotlin.jvm.internal.j jVar) {
        this(fVar, hVar, i14, bArr, eVar, (i15 & 32) != 0 ? null : pVar, (i15 & 64) != 0 ? 45000L : j8);
    }
}
