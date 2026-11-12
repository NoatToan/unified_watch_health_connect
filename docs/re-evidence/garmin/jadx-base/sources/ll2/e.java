package ll2;

import b21.l0;
import com.garmin.device.filetransfer.mlr.MLRTransportException;
import com.google.common.primitives.UnsignedBytes;
import com.google.common.util.concurrent.ListenableFuture;
import e23.p;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;
import ml2.r;
import ml2.y;
import o53.b0;
import o53.c0;
import o53.e1;
import o53.j2;
import o53.s;
import o53.v1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.d0;
import p13.h0;
import p13.u;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000eBE\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\n\u001a\u001c\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lll2/e;", "", "Lll2/l;", "transportArgs", "Lorg/slf4j/Logger;", "logger", "Lkotlin/Function2;", "", "", "Lcom/garmin/device/filetransfer/TransferProgress;", "progress", "configTimeout", "<init>", "(Lll2/l;Lorg/slf4j/Logger;Le23/p;J)V", "a", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f113445l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set<Integer> f113446m = u.m0(new Integer[]{8216, 16408, 24600, 32792, 40984, 49176, 57368});

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final LinkedHashMap f113447n = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f113448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f113449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p<Long, Long, Unit> f113450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f113451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f113452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s f113453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f113454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f113455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public cz2.g<Unit> f113456i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public dz2.a f113457j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f113458k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ll2/e$b", "Lml2/y;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements y {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "com.garmin.device.filetransfer.mlr.MLRTransportPipe$serviceCallback$1$onData$1", f = "MLRTransportPipe.kt", l = {}, m = "invokeSuspend")
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e f113460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f113461b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar, long j8, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f113460a = eVar;
                this.f113461b = j8;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f113460a, this.f113461b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                e eVar = this.f113460a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                o13.r.b(obj);
                try {
                    p<Long, Long, Unit> pVar = eVar.f113450c;
                    if (pVar != null) {
                        pVar.invoke(new Long(this.f113461b), new Long(eVar.f113448a.f113490b));
                    }
                } catch (Exception e4) {
                    eVar.f113449b.warn("Exception notifying progress", (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        public b() {
        }

        @Override // ml2.y
        public final void a(int i14, byte[] bArr) {
            bArr.getClass();
            if (e.this.f113454g.compareAndSet(true, false)) {
                byte b14 = bArr[0];
                e eVar = e.this;
                if (b14 == 0) {
                    eVar.f113453f.g0(bArr);
                    return;
                }
                eVar.f113449b.trace("Invalid configure response: " + dz2.c.a(bArr));
                e.this.f113453f.O(new MLRTransportException("Invalid configure response", null, 2, null));
                return;
            }
            cz2.g<Unit> gVar = e.this.f113456i;
            if (gVar == null || gVar.f56901e.isActive()) {
                e eVar2 = e.this;
                synchronized (eVar2.f113455h) {
                    dz2.a aVar = eVar2.f113457j;
                    if (aVar == null) {
                        eVar2.f113449b.warn("Received data on write pipe");
                        return;
                    }
                    try {
                        aVar.write(bArr);
                        cz2.g<Unit> gVar2 = eVar2.f113456i;
                        if (gVar2 != null) {
                            gVar2.f56899c.set(gVar2.f56898b.millis());
                        }
                        ge1.b.T(e1.f129333a, null, null, new a(e.this, aVar.getSize(), null), 3);
                    } catch (Exception e4) {
                        eVar2.f113449b.error("Close pipe after failed dataSink.write", (Throwable) e4);
                        b(e4);
                    }
                }
            }
        }

        public final void b(Exception exc) {
            e.this.f113453f.O(exc == null ? new MLRTransportException("Multi-Link service closed", null, 2, null) : exc);
            e eVar = e.this;
            synchronized (eVar.f113455h) {
                cz2.g<Unit> gVar = eVar.f113456i;
                try {
                    if (exc == null) {
                        if (gVar != null) {
                            gVar.b(Unit.INSTANCE);
                        }
                    } else if (gVar != null) {
                        gVar.f56901e.O(exc);
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // ml2.y
        public final void c(int i14) {
            b(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(l lVar, Logger logger, p<? super Long, ? super Long, Unit> pVar, long j8) {
        lVar.getClass();
        logger.getClass();
        this.f113448a = lVar;
        this.f113449b = logger;
        this.f113450c = pVar;
        this.f113451d = j8;
        this.f113453f = gl.b.b();
        this.f113454g = new AtomicBoolean(true);
        this.f113455h = new byte[0];
        this.f113458k = new b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
    
        if (r11 == r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [ml2.r] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(r rVar, int i14, v13.c cVar) throws MLRTransportException {
        f fVar;
        e eVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i15 = fVar.f113465d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                fVar.f113465d = i15 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objB = fVar.f113463b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = fVar.f113465d;
        try {
            try {
                if (i16 == 0) {
                    o13.r.b(objB);
                    this.f113452e = rVar;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(10);
                    byteArrayOutputStream.write(0);
                    byteArrayOutputStream.write(i14 & 255);
                    lg.d.Q(byteArrayOutputStream, this.f113448a.f113489a);
                    try {
                        long j8 = this.f113451d;
                        g gVar = new g(rVar, byteArrayOutputStream, null);
                        fVar.f113462a = this;
                        fVar.f113465d = 1;
                        if (j2.b(j8, gVar, fVar) != aVar) {
                            eVar = this;
                        }
                        return aVar;
                    } catch (Exception e4) {
                        e = e4;
                        rVar = this;
                        rVar.getClass();
                        if (e instanceof MLRTransportException) {
                            throw ((MLRTransportException) e);
                        }
                        throw new MLRTransportException("Failed to send configure command", e);
                    }
                }
                if (i16 == 1) {
                    e eVar2 = fVar.f113462a;
                    o13.r.b(objB);
                    eVar = eVar2;
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e eVar3 = fVar.f113462a;
                    o13.r.b(objB);
                    rVar = eVar3;
                }
                byte[] bArr = (byte[]) objB;
                if (bArr.length < 2) {
                    throw new MLRTransportException("Configuration failed: missing general status", null, 2, null);
                }
                int i17 = bArr[1] & UnsignedBytes.MAX_VALUE;
                if (i17 != 0) {
                    if (i17 == 1) {
                        throw new MLRTransportException("Configuration failed: unknown command", null, 2, null);
                    }
                    if (i17 != 2) {
                        throw new MLRTransportException(e0.f(i17, "Configuration failed: unknown general status [", "]"), null, 2, null);
                    }
                    throw new MLRTransportException("Configuration failed: invalid command data", null, 2, null);
                }
                if (bArr.length < 3) {
                    throw new MLRTransportException("Configuration failed: missing configure status", null, 2, null);
                }
                int i18 = bArr[2] & UnsignedBytes.MAX_VALUE;
                if (i18 == 0) {
                    return Unit.INSTANCE;
                }
                if (i18 == 1) {
                    throw new MLRTransportException("Configuration failed: unknown transfer handle", null, 2, null);
                }
                if (i18 == 2) {
                    throw new MLRTransportException("Configuration failed: unexpected transfer direction", null, 2, null);
                }
                if (i18 != 3) {
                    throw new MLRTransportException(e0.f(i18, "Configuration failed: unknown configure status [", "]"), null, 2, null);
                }
                throw new MLRTransportException("Configuration failed: unexpected transfer size", null, 2, null);
                long j14 = eVar.f113451d;
                h hVar = new h(eVar, null);
                fVar.f113462a = eVar;
                fVar.f113465d = 2;
                objB = j2.b(j14, hVar, fVar);
                rVar = eVar;
            } catch (TimeoutCancellationException e14) {
                throw new MLRTransportException("Device failed to respond to configure command", e14);
            }
        } catch (Exception e15) {
            e = e15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00ce A[Catch: all -> 0x004e, TryCatch #9 {all -> 0x004e, blocks: (B:20:0x0049, B:56:0x00c5, B:58:0x00ce, B:60:0x00d7, B:59:0x00d1, B:61:0x00d8, B:62:0x00df), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1 A[Catch: all -> 0x004e, TryCatch #9 {all -> 0x004e, blocks: (B:20:0x0049, B:56:0x00c5, B:58:0x00ce, B:60:0x00d7, B:59:0x00d1, B:61:0x00d8, B:62:0x00df), top: B:73:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b3, code lost:
    
        if (r9.a(r0) == r1) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [ll2.e] */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v21, types: [ll2.e] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v3, types: [ll2.e] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ll2.e] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(r rVar, dz2.a aVar, cz2.a aVar2, long j8, v13.c cVar) throws Throwable {
        i iVar;
        r rVar2;
        Throwable th3;
        ?? r14;
        v1 v1Var;
        j jVar;
        ?? r15;
        cz2.g<Unit> gVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f113477g;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f113477g = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f113475e;
        u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f113477g;
        int i16 = 1;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                rVar.d(this.f113458k);
                cz2.g<Unit> gVar2 = new cz2.g<>(j8, aVar2);
                synchronized (this.f113455h) {
                    this.f113457j = aVar;
                    this.f113456i = gVar2;
                    Unit unit = Unit.INSTANCE;
                }
                try {
                    iVar.f113471a = this;
                    iVar.f113472b = rVar;
                    iVar.f113473c = gVar2;
                    iVar.f113474d = 1;
                    iVar.f113477g = 1;
                    if (a(rVar, 0, iVar) != aVar3) {
                        r14 = this;
                        rVar2 = rVar;
                        gVar = gVar2;
                        iVar.f113471a = r14;
                        iVar.f113472b = rVar2;
                        iVar.f113473c = null;
                        iVar.f113474d = i16;
                        iVar.f113477g = 2;
                    }
                } catch (TimeoutException e4) {
                    e = e4;
                    throw new MLRTransportException("Device failed to send data", e);
                } catch (Exception e14) {
                    e = e14;
                    r15 = this;
                    r15.getClass();
                    if (e instanceof MLRTransportException) {
                        throw ((MLRTransportException) e);
                    }
                    throw new MLRTransportException("Read failed", e);
                } catch (Throwable th4) {
                    rVar2 = rVar;
                    th3 = th4;
                    r14 = this;
                    if (i16 != 0) {
                        throw th3;
                    }
                    v1Var = v1.f129418a;
                    jVar = new j(rVar2, r14, null);
                    iVar.f113471a = th3;
                    iVar.f113472b = null;
                    iVar.f113473c = null;
                    iVar.f113477g = 4;
                    if (ge1.b.e0(v1Var, jVar, iVar) == aVar3) {
                        throw th3;
                    }
                }
                return aVar3;
            }
            if (i15 == 1) {
                i16 = iVar.f113474d;
                gVar = iVar.f113473c;
                rVar2 = iVar.f113472b;
                r14 = (e) iVar.f113471a;
                try {
                    o13.r.b(obj);
                    r14 = r14;
                    iVar.f113471a = r14;
                    iVar.f113472b = rVar2;
                    iVar.f113473c = null;
                    iVar.f113474d = i16;
                    iVar.f113477g = 2;
                } catch (TimeoutException e15) {
                    e = e15;
                    throw new MLRTransportException("Device failed to send data", e);
                } catch (Exception e16) {
                    ?? r16 = r14;
                    e = e16;
                    r15 = r16;
                    r15.getClass();
                    if (e instanceof MLRTransportException) {
                        throw ((MLRTransportException) e);
                    }
                    throw new MLRTransportException("Read failed", e);
                } catch (Throwable th5) {
                    th3 = th5;
                    if (i16 != 0) {
                        throw th3;
                    }
                    v1Var = v1.f129418a;
                    jVar = new j(rVar2, r14, null);
                    iVar.f113471a = th3;
                    iVar.f113472b = null;
                    iVar.f113473c = null;
                    iVar.f113477g = 4;
                    if (ge1.b.e0(v1Var, jVar, iVar) == aVar3) {
                        throw th3;
                    }
                }
            } else if (i15 == 2) {
                int i17 = iVar.f113474d;
                r rVar3 = iVar.f113472b;
                r15 = (e) iVar.f113471a;
                try {
                    o13.r.b(obj);
                } catch (TimeoutException e17) {
                    e = e17;
                    throw new MLRTransportException("Device failed to send data", e);
                } catch (Exception e18) {
                    e = e18;
                    r15.getClass();
                    if (e instanceof MLRTransportException) {
                        throw ((MLRTransportException) e);
                    }
                    throw new MLRTransportException("Read failed", e);
                }
            } else {
                if (i15 != 3) {
                    if (i15 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th6 = (Throwable) iVar.f113471a;
                    o13.r.b(obj);
                    throw th6;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        } catch (Throwable th7) {
            rVar2 = rVar;
            th3 = th7;
            r14 = aVar;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0018\u0010\r\u001a\u00060\u0004j\u0002`\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lll2/e$a;", "", "<init>", "()V", "", "DIRECTION_READ", "I", "DIRECTION_WRITE", "", "CONFIGURATION_TIMEOUT", "J", "READ_TIMEOUT", "Lcom/garmin/device/multilink/MultiLinkServiceId;", "ML_SERVICE_BASE", "", "ML_SERVICE_IDS", "Ljava/util/Set;", "", "", "", "serviceIdsInUse", "Ljava/util/Map;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Integer a(String str) {
            Integer num;
            LinkedHashMap linkedHashMap = e.f113447n;
            synchronized (linkedHashMap) {
                List list = (List) linkedHashMap.get(str);
                if (list != null && (num = (Integer) d0.E(list)) != null) {
                    return Integer.valueOf(num.intValue());
                }
                ArrayList arrayListD1 = h0.d1(e.f113446m);
                linkedHashMap.put(str, arrayListD1);
                return (Integer) d0.E(arrayListD1);
            }
        }

        public static void d(int i14, String str) {
            LinkedHashMap linkedHashMap = e.f113447n;
            synchronized (linkedHashMap) {
                List list = (List) linkedHashMap.get(str);
                if (list != null) {
                    list.add(Integer.valueOf(i14));
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object b(ml2.l lVar, int i14, Logger logger, v13.c cVar) throws Throwable {
            ll2.b bVar;
            Logger logger2;
            if (cVar instanceof ll2.b) {
                bVar = (ll2.b) cVar;
                int i15 = bVar.f113428d;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    bVar.f113428d = i15 - Integer.MIN_VALUE;
                } else {
                    bVar = new ll2.b(this, cVar);
                }
            } else {
                bVar = new ll2.b(this, cVar);
            }
            Object objB = bVar.f113426b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = bVar.f113428d;
            try {
                if (i16 == 0) {
                    o13.r.b(objB);
                    ListenableFuture<r> listenableFutureL = lVar.l(i14, true);
                    listenableFutureL.getClass();
                    bVar.f113425a = logger;
                    bVar.f113428d = 1;
                    objB = t53.c.b(listenableFutureL, bVar);
                    if (objB == aVar) {
                    }
                    return aVar;
                }
                if (i16 == 1) {
                    logger = bVar.f113425a;
                    o13.r.b(objB);
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    logger2 = bVar.f113425a;
                    o13.r.b(objB);
                }
                logger2.debug("Device returned an unreliable transport pipe");
                throw new MLRTransportException("MultiLink Transport Pipe is not reliable", null, 2, null);
                r rVar = (r) objB;
                if (rVar.getF119442a().f119489b) {
                    return rVar;
                }
                bVar.f113425a = logger;
                bVar.f113428d = 2;
                if (rVar.b(bVar) != aVar) {
                    logger2 = logger;
                    logger2.debug("Device returned an unreliable transport pipe");
                    throw new MLRTransportException("MultiLink Transport Pipe is not reliable", null, 2, null);
                }
                return aVar;
            } catch (Exception e4) {
                throw new MLRTransportException("Opening MultiLink Transport Pipe service failed", e4);
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00df  */
        /* JADX WARN: Code duplicated, block: B:8:0x001a  */
        public final Object c(ml2.l lVar, l lVar2, dz2.a aVar, p pVar, v13.c cVar) throws Throwable {
            c cVar2;
            int iIntValue;
            a aVar2;
            dz2.a aVar3;
            Object objB;
            int i14;
            e eVar;
            ml2.l lVar3;
            int i15;
            a aVar4;
            ml2.l lVar4 = lVar;
            if (cVar instanceof c) {
                cVar2 = (c) cVar;
                int i16 = cVar2.f113436h;
                if ((i16 & Integer.MIN_VALUE) != 0) {
                    cVar2.f113436h = i16 - Integer.MIN_VALUE;
                } else {
                    cVar2 = new c(this, cVar);
                }
            } else {
                cVar2 = new c(this, cVar);
            }
            c cVar3 = cVar2;
            Object obj = cVar3.f113434f;
            u13.a aVar5 = u13.a.COROUTINE_SUSPENDED;
            int i17 = cVar3.f113436h;
            if (i17 != 0) {
                if (i17 == 1) {
                    int i18 = cVar3.f113433e;
                    eVar = cVar3.f113432d;
                    dz2.a aVar6 = cVar3.f113431c;
                    ml2.l lVar5 = cVar3.f113430b;
                    a aVar7 = cVar3.f113429a;
                    try {
                        o13.r.b(obj);
                        objB = obj;
                        aVar3 = aVar6;
                        i14 = i18;
                        lVar4 = lVar5;
                        aVar2 = aVar7;
                        try {
                            cVar3.f113429a = aVar2;
                            cVar3.f113430b = lVar4;
                            cVar3.f113431c = null;
                            cVar3.f113432d = null;
                            cVar3.f113433e = i14;
                            cVar3.f113436h = 2;
                            a aVar8 = e.f113445l;
                            cz2.a.f56879a.getClass();
                            if (eVar.b((r) objB, aVar3, cz2.a.C1219a.f56881b, 30000L, cVar3) != aVar5) {
                                lVar3 = lVar4;
                                i15 = i14;
                                aVar4 = aVar2;
                                String macAddress = lVar3.f119377d.getMacAddress();
                                macAddress.getClass();
                                aVar4.getClass();
                                d(i15, macAddress);
                                return Unit.INSTANCE;
                            }
                            return aVar5;
                        } catch (Throwable th3) {
                            th = th3;
                            iIntValue = i14;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iIntValue = i18;
                        lVar4 = lVar5;
                        aVar2 = aVar7;
                    }
                } else {
                    if (i17 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i15 = cVar3.f113433e;
                    lVar3 = cVar3.f113430b;
                    aVar4 = cVar3.f113429a;
                    try {
                        o13.r.b(obj);
                        String macAddress2 = lVar3.f119377d.getMacAddress();
                        macAddress2.getClass();
                        aVar4.getClass();
                        d(i15, macAddress2);
                        return Unit.INSTANCE;
                    } catch (Throwable th5) {
                        th = th5;
                        aVar2 = aVar4;
                        iIntValue = i15;
                        lVar4 = lVar3;
                    }
                }
                String macAddress3 = lVar4.f119377d.getMacAddress();
                macAddress3.getClass();
                aVar2.getClass();
                d(iIntValue, macAddress3);
                throw th;
            }
            o13.r.b(obj);
            Logger logger = LoggerFactory.getLogger("FT#MLRTransportPipe[" + lVar4.f119377d.getMacAddress() + "]");
            String macAddress4 = lVar4.f119377d.getMacAddress();
            macAddress4.getClass();
            Integer numA = a(macAddress4);
            if (numA == null) {
                throw new MLRTransportException("All MultiLink service instances in use", null, 2, null);
            }
            iIntValue = numA.intValue();
            try {
                logger.getClass();
                e eVar2 = new e(lVar2, logger, pVar, 0L, 8, null);
                cVar3.f113429a = this;
                cVar3.f113430b = lVar4;
                aVar3 = aVar;
                cVar3.f113431c = aVar3;
                cVar3.f113432d = eVar2;
                cVar3.f113433e = iIntValue;
                cVar3.f113436h = 1;
                objB = b(lVar4, iIntValue, logger, cVar3);
                if (objB != aVar5) {
                    i14 = iIntValue;
                    eVar = eVar2;
                    aVar2 = this;
                    cVar3.f113429a = aVar2;
                    cVar3.f113430b = lVar4;
                    cVar3.f113431c = null;
                    cVar3.f113432d = null;
                    cVar3.f113433e = i14;
                    cVar3.f113436h = 2;
                    a aVar9 = e.f113445l;
                    cz2.a.f56879a.getClass();
                    if (eVar.b((r) objB, aVar3, cz2.a.C1219a.f56881b, 30000L, cVar3) != aVar5) {
                        lVar3 = lVar4;
                        i15 = i14;
                        aVar4 = aVar2;
                        String macAddress5 = lVar3.f119377d.getMacAddress();
                        macAddress5.getClass();
                        aVar4.getClass();
                        d(i15, macAddress5);
                        return Unit.INSTANCE;
                    }
                }
                return aVar5;
            } catch (Throwable th6) {
                th = th6;
                aVar2 = this;
            }
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:35:0x00dd A[Catch: all -> 0x00f7, TRY_LEAVE, TryCatch #0 {all -> 0x00f7, blocks: (B:32:0x00be, B:35:0x00dd), top: B:49:0x00be }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        public final Object e(ml2.l lVar, l lVar2, dz2.b bVar, l0 l0Var, v13.c cVar) throws Throwable {
            d dVar;
            int iIntValue;
            a aVar;
            e eVar;
            dz2.b bVar2;
            Object objB;
            a aVar2;
            Object objE;
            ml2.l lVar3;
            int i14;
            ml2.l lVar4 = lVar;
            if (cVar instanceof d) {
                dVar = (d) cVar;
                int i15 = dVar.f113444h;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    dVar.f113444h = i15 - Integer.MIN_VALUE;
                } else {
                    dVar = new d(this, cVar);
                }
            } else {
                dVar = new d(this, cVar);
            }
            Object obj = dVar.f113442f;
            u13.a aVar3 = u13.a.COROUTINE_SUSPENDED;
            int i16 = dVar.f113444h;
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = dVar.f113441e;
                    e eVar2 = dVar.f113440d;
                    dz2.b bVar3 = dVar.f113439c;
                    ml2.l lVar5 = dVar.f113438b;
                    aVar2 = dVar.f113437a;
                    try {
                        o13.r.b(obj);
                        objB = obj;
                        bVar2 = bVar3;
                        iIntValue = i17;
                        lVar4 = lVar5;
                        eVar = eVar2;
                        try {
                            r rVar = (r) objB;
                            dVar.f113437a = aVar2;
                            dVar.f113438b = lVar4;
                            dVar.f113439c = null;
                            dVar.f113440d = null;
                            dVar.f113441e = iIntValue;
                            dVar.f113444h = 2;
                            rVar.d(eVar.f113458k);
                            objE = c0.e(new k(eVar, rVar, bVar2, null), dVar);
                            if (objE == aVar3) {
                                objE = Unit.INSTANCE;
                            }
                            if (objE != aVar3) {
                                lVar3 = lVar4;
                                i14 = iIntValue;
                                aVar = aVar2;
                            }
                            return aVar3;
                        } catch (Throwable th3) {
                            th = th3;
                            aVar = aVar2;
                            String macAddress = lVar4.f119377d.getMacAddress();
                            macAddress.getClass();
                            aVar.getClass();
                            d(iIntValue, macAddress);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iIntValue = i17;
                        lVar4 = lVar5;
                        aVar = aVar2;
                        String macAddress2 = lVar4.f119377d.getMacAddress();
                        macAddress2.getClass();
                        aVar.getClass();
                        d(iIntValue, macAddress2);
                        throw th;
                    }
                }
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i14 = dVar.f113441e;
                lVar3 = dVar.f113438b;
                aVar = dVar.f113437a;
                try {
                    o13.r.b(obj);
                } catch (Throwable th5) {
                    th = th5;
                    iIntValue = i14;
                    lVar4 = lVar3;
                }
                String macAddress3 = lVar3.f119377d.getMacAddress();
                macAddress3.getClass();
                aVar.getClass();
                d(i14, macAddress3);
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            Logger logger = LoggerFactory.getLogger("FT#MLRTransportPipe[" + lVar4.f119377d.getMacAddress() + "]");
            String macAddress4 = lVar4.f119377d.getMacAddress();
            macAddress4.getClass();
            Integer numA = a(macAddress4);
            if (numA == null) {
                throw new MLRTransportException("All MultiLink service instances in use", null, 2, null);
            }
            iIntValue = numA.intValue();
            try {
                logger.getClass();
                eVar = new e(lVar2, logger, l0Var, 0L, 8, null);
                dVar.f113437a = this;
                dVar.f113438b = lVar4;
                bVar2 = bVar;
                dVar.f113439c = bVar2;
                dVar.f113440d = eVar;
                dVar.f113441e = iIntValue;
                dVar.f113444h = 1;
                objB = b(lVar4, iIntValue, logger, dVar);
                if (objB != aVar3) {
                    aVar2 = this;
                    r rVar2 = (r) objB;
                    dVar.f113437a = aVar2;
                    dVar.f113438b = lVar4;
                    dVar.f113439c = null;
                    dVar.f113440d = null;
                    dVar.f113441e = iIntValue;
                    dVar.f113444h = 2;
                    rVar2.d(eVar.f113458k);
                    objE = c0.e(new k(eVar, rVar2, bVar2, null), dVar);
                    if (objE == aVar3) {
                        objE = Unit.INSTANCE;
                    }
                    if (objE != aVar3) {
                        lVar3 = lVar4;
                        i14 = iIntValue;
                        aVar = aVar2;
                        String macAddress5 = lVar3.f119377d.getMacAddress();
                        macAddress5.getClass();
                        aVar.getClass();
                        d(i14, macAddress5);
                        return Unit.INSTANCE;
                    }
                }
                return aVar3;
            } catch (Throwable th6) {
                th = th6;
                aVar = this;
            }
            String macAddress6 = lVar4.f119377d.getMacAddress();
            macAddress6.getClass();
            aVar.getClass();
            d(iIntValue, macAddress6);
            throw th;
        }

        private a() {
        }
    }

    public /* synthetic */ e(l lVar, Logger logger, p pVar, long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        this(lVar, logger, pVar, (i14 & 8) != 0 ? 30000L : j8);
    }
}
