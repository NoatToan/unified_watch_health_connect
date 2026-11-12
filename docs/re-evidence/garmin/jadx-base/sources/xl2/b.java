package xl2;

import am.j;
import com.garmin.device.nfc.g;
import com.garmin.device.nfc.i;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeoutException;
import p005kotlin.Metadata;
import tl2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lxl2/b;", "Ltl2/f;", "Lcom/garmin/device/nfc/i;", "message", "", "timeoutMillis", "", "retries", "Lcom/garmin/device/nfc/g$e;", "directCallback", "<init>", "(Lcom/garmin/device/nfc/i;JILcom/garmin/device/nfc/g$e;)V", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f191311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f191312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f191313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.e f191314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f191315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SettableFuture<i> f191316f;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"xl2/b$a", "Lcom/garmin/device/nfc/g$f;", "nfc_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements g.f {
        public a() {
        }

        @Override // com.garmin.device.nfc.g.e
        public final void a(i iVar) {
            b bVar = b.this;
            g.e eVar = bVar.f191314d;
            if (eVar != null) {
                eVar.a(iVar);
            }
            bVar.f191316f.set(iVar);
        }

        @Override // com.garmin.device.nfc.g.f
        public final void b(int i14) {
            b bVar = b.this;
            g.e eVar = bVar.f191314d;
            g.f fVar = eVar instanceof g.f ? (g.f) eVar : null;
            if (fVar != null) {
                fVar.b(i14);
            }
            bVar.f191316f.setException(new TimeoutException(j.g(i14, bVar.f191311a.c(), "Message ", ", Transaction: ", " timed out")));
        }
    }

    public b(i iVar, long j8, int i14, g.e eVar) {
        iVar.getClass();
        this.f191311a = iVar;
        this.f191312b = j8;
        this.f191313c = i14;
        this.f191314d = eVar;
        SettableFuture<i> settableFutureCreate = SettableFuture.create();
        settableFutureCreate.getClass();
        this.f191316f = settableFutureCreate;
        this.f191315e = new a();
    }

    @Override // tl2.f
    public final <T extends tl2.c> void a(T t7) {
        t7.f165289f.c(this.f191311a, new c(t7, this, this.f191313c), this.f191312b);
    }

    @Override // tl2.f
    public final void b(tl2.c.b bVar) {
        bVar.getClass();
        if (bVar == tl2.c.b.IDLE_TIMEOUT) {
            this.f191315e.b(this.f191311a.b());
        }
    }

    public /* synthetic */ b(i iVar, long j8, int i14, g.e eVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(iVar, j8, i14, (i15 & 8) != 0 ? null : eVar);
    }
}
