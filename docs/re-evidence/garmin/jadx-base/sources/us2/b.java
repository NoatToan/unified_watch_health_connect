package us2;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c2;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import rs2.p;
import rs2.w;
import rs2.y;
import ss2.o;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0013BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lus2/b;", "Lus2/a;", "", "Lct2/b;", "reader", "Lct2/f;", "writer", "", "connectionId", "Lrs2/e;", "config", "Lrs2/f;", "customLogger", "Lrs2/p;", "gfdiWatchdog", "Lt13/g;", "coroutineContext", "<init>", "(Lct2/b;Lct2/f;Ljava/lang/String;Lrs2/e;Lrs2/f;Lrs2/p;Lt13/g;)V", "a", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements us2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ct2.b f172458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ct2.f f172459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rs2.e f172460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rs2.f f172461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f172462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Logger f172463f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<a> f172464g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f172465h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f172466i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicReference<g> f172467j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f172468k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f172469l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f172470m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public rk0.g f172471n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lus2/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        NOT_STARTED,
        RUNNING,
        ENDED
    }

    /* JADX INFO: renamed from: us2.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C3223b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f172476a;

        static {
            int[] iArr = new int[ct2.a.values().length];
            try {
                iArr[ct2.a.COBS_DECODE_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ct2.a.INVALID_LENGTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ct2.a.CRC_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ct2.a.DECRYPTION_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f172476a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.gfdi.core.Dispatcher$onMessageReadFailed$1", f = "Dispatcher.kt", l = {260}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f172477a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y f172479c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(y yVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f172479c = yVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b.this.new c(this.f172479c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f172477a;
            b bVar = b.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    this.f172477a = 1;
                    if (bVar.f172459b.b(new ct2.h(null), 65535, this.f172479c, new byte[0], this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                bVar.f172463f.debug("Failed to send error response", (Throwable) e4);
            }
            return Unit.INSTANCE;
        }
    }

    public b(ct2.b bVar, ct2.f fVar, String str, rs2.e eVar, rs2.f fVar2, p pVar, t13.g gVar) {
        bVar.getClass();
        fVar.getClass();
        str.getClass();
        eVar.getClass();
        gVar.getClass();
        this.f172458a = bVar;
        this.f172459b = fVar;
        this.f172460c = eVar;
        this.f172461d = fVar2;
        this.f172462e = pVar;
        rs2.d.f154380a.getClass();
        Logger logger = LoggerFactory.getLogger(rs2.d.a("Dispatcher", -1L, this, str));
        this.f172463f = logger;
        this.f172464g = new AtomicReference<>(a.NOT_STARTED);
        this.f172465h = zl.a.e("Dispatcher", gVar);
        this.f172466i = new LinkedHashMap();
        this.f172467j = new AtomicReference<>(new h());
        e(16384);
        int i14 = eVar.f154385a;
        rs2.e.f154382c.getClass();
        if (i14 != rs2.e.f154383d.f154385a) {
            logger.debug("GfdiConfig(retries: " + i14 + ", timeout: " + eVar.f154386b + ")");
        }
    }

    @Override // us2.a
    public final void a() {
        this.f172467j.set(new k());
    }

    @Override // rs2.v
    public final Object b(int i14, byte[] bArr, t13.d<? super byte[]> dVar) throws IOException {
        if (this.f172464g.get() == a.ENDED) {
            vb.h.C("Connection closed");
            return null;
        }
        g gVar = this.f172467j.get();
        if (gVar != null) {
            return gVar.a(new j(this.f172459b, gVar.b(), i14, bArr, this.f172460c, this.f172462e, 0L, 64, null), dVar);
        }
        vb.h.z("Outgoing strategy not set");
        return null;
    }

    @Override // rs2.v
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF172470m() {
        return this.f172470m;
    }

    @Override // rs2.v
    public final void d(int i14, w wVar) {
        wVar.getClass();
        synchronized (this.f172466i) {
            try {
                if (this.f172466i.put(Integer.valueOf(i14), wVar) != null) {
                    Logger logger = this.f172463f;
                    ct2.c.f55534a.getClass();
                    logger.warn("Overwriting request listener for type ".concat(ct2.c.a(i14)));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // us2.a
    public final void e(int i14) {
        int i15;
        int i16 = i14 / 254;
        if (i14 % 254 > 0) {
            i16++;
        }
        int i17 = i14 - i16;
        int i18 = i17 - 8;
        if (this.f172468k && (i15 = (i18 = i17 - 18) % 4) > 0) {
            i18 -= 4 - i15;
        }
        this.f172470m = i18;
        this.f172469l = i14;
    }

    public final c2 f() {
        if (this.f172464g.getAndSet(a.ENDED) != a.RUNNING) {
            return null;
        }
        x53.c cVar = s0.f129406a;
        return ge1.b.T(this.f172465h, x53.b.f189152a, null, new us2.c(this, null), 2);
    }

    public final void g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f172468k = true;
        o oVar = new o(bArr, bArr2);
        ct2.b bVar = this.f172458a;
        bVar.getClass();
        bVar.f55533g.set(oVar);
        ss2.p pVar = new ss2.p(bArr, bArr3);
        ct2.f fVar = this.f172459b;
        fVar.getClass();
        fVar.f55547f.set(pVar);
        e(this.f172469l);
    }

    public final void h(ct2.a aVar) {
        y yVar;
        aVar.getClass();
        int i14 = C3223b.f172476a[aVar.ordinal()];
        if (i14 == 1) {
            yVar = y.COBS_DECODER_ERROR;
        } else if (i14 == 2) {
            yVar = y.LENGTH_ERROR;
        } else if (i14 == 3) {
            yVar = y.CRC_ERROR;
        } else {
            if (i14 != 4) {
                u0.r();
                return;
            }
            yVar = y.LENGTH_ERROR;
        }
        rs2.f fVar = this.f172461d;
        if (fVar != null) {
            fVar.onMessageReadFailed(yVar.name());
        }
        ft2.d.b(this.f172465h, new c(yVar, null));
    }

    public b(ct2.b bVar, ct2.f fVar, String str, rs2.e eVar, rs2.f fVar2, p pVar, t13.g gVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, fVar, str, eVar, (i14 & 16) != 0 ? null : fVar2, (i14 & 32) != 0 ? null : pVar, (i14 & 64) != 0 ? s0.f129406a : gVar);
    }
}
