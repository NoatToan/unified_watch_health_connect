package uk;

import android.content.Context;
import com.dsi.vivoki.antble.gfdi.VivokiException;
import com.google.common.base.Ascii;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import lc.u0;
import o53.s0;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\n\u000bB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Luk/k;", "", "Ltk/k;", "proxy", "Lsk/d;", "antService", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ltk/k;Lsk/d;Lorg/slf4j/Logger;)V", "b", "c", "vivoki_release"}, k = 1, mv = {1, 4, 0})
public final class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f171687m = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u53.d f171688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PipedOutputStream f171689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PipedInputStream f171690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c0 f171691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte f171692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uk.c f171693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f171694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public uk.b f171695h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f171696i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tk.k f171697j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final sk.d f171698k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Logger f171699l;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uk/k$a", "", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: uk.k$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$1$onMessageReadFailed$1", f = "VivokiGfdiEmulator.kt", l = {167}, m = "invokeSuspend")
        public static final class C3194a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public o53.b0 f171701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public o53.b0 f171702b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f171703c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ uk.d f171705e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3194a(uk.d dVar, t13.d dVar2) {
                super(2, dVar2);
                this.f171705e = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                dVar.getClass();
                C3194a c3194a = a.this.new C3194a(this.f171705e, dVar);
                c3194a.f171701a = (o53.b0) obj;
                return c3194a;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C3194a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                h hVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f171703c;
                a aVar2 = a.this;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        o53.b0 b0Var = this.f171701a;
                        int i15 = o.f171723a[this.f171705e.ordinal()];
                        if (i15 == 1) {
                            hVar = h.COBS_DECODER_ERROR;
                        } else if (i15 == 2) {
                            hVar = h.CRC_ERROR;
                        } else {
                            if (i15 != 3 && i15 != 4) {
                                u0.r();
                                return null;
                            }
                            hVar = h.LENGTH_ERROR;
                        }
                        this.f171702b = b0Var;
                        this.f171703c = 1;
                        if (k.this.f171691d.b(65535, hVar, new byte[0], this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (Exception e4) {
                    k.this.f171699l.error("Failed to send error response", (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        public a() {
        }

        public final void a(uk.d dVar) {
            dVar.getClass();
            u53.d dVar2 = k.this.f171688a;
            x53.c cVar = s0.f129406a;
            ge1.b.T(dVar2, x53.b.f189152a, null, new C3194a(dVar, null), 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Luk/k$c;", "", "", "dataType", "subType", "<init>", "(BB)V", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final /* data */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f171706a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte f171707b;

        public c(byte b14, byte b15) {
            this.f171706a = b14;
            this.f171707b = b15;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f171706a == cVar.f171706a && this.f171707b == cVar.f171707b;
        }

        public final int hashCode() {
            return (this.f171706a * Ascii.US) + this.f171707b;
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("FileSender(dataType=");
            sb3.append((int) this.f171706a);
            sb3.append(", subType=");
            return am.j.q(sb3, this.f171707b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"uk/k$d", "Luk/a;", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class d implements uk.a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
        @v13.e(c = "com.dsi.vivoki.antble.gfdi.VivokiGfdiEmulator$handshakeEmulator$1$onRequest$1", f = "VivokiGfdiEmulator.kt", l = {108}, m = "invokeSuspend")
        public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public o53.b0 f171709a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public o53.b0 f171710b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f171711c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f171713e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ byte[] f171714f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i14, byte[] bArr, t13.d dVar) {
                super(2, dVar);
                this.f171713e = i14;
                this.f171714f = bArr;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                dVar.getClass();
                a aVar = d.this.new a(this.f171713e, this.f171714f, dVar);
                aVar.f171709a = (o53.b0) obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f171711c;
                int i15 = this.f171713e;
                d dVar = d.this;
                try {
                    if (i14 == 0) {
                        o13.r.b(obj);
                        o53.b0 b0Var = this.f171709a;
                        c0 c0Var = k.this.f171691d;
                        byte[] bArr = this.f171714f;
                        this.f171710b = b0Var;
                        this.f171711c = 1;
                        if (c0Var.c(i15, bArr, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                } catch (IOException e4) {
                    k.this.f171699l.error("Failed to write message [" + i15 + ']', (Throwable) e4);
                }
                return Unit.INSTANCE;
            }
        }

        public d() {
        }

        @Override // uk.a
        public final void a(int i14, byte[] bArr) {
            u53.d dVar = k.this.f171688a;
            x53.c cVar = s0.f129406a;
            ge1.b.T(dVar, x53.b.f189152a, null, new a(i14, bArr, null), 2);
        }
    }

    private k(tk.k kVar, sk.d dVar, Logger logger) throws IOException {
        this.f171697j = kVar;
        this.f171698k = dVar;
        this.f171699l = logger;
        this.f171688a = o53.c0.a(new o53.a0(androidx.room.a0.m(new StringBuilder("VivokiGfdiEmulator["), kVar.f165236a, ']')));
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.f171689b = pipedOutputStream;
        a0 a0Var = new a0(new PipedInputStream(pipedOutputStream));
        PipedInputStream pipedInputStream = new PipedInputStream();
        this.f171690c = pipedInputStream;
        this.f171691d = new c0(new PipedOutputStream(pipedInputStream));
        uk.c cVar = new uk.c(kVar, 65535, new d());
        this.f171693f = cVar;
        a aVar = new a();
        if (a0Var.f171614c.compareAndSet(false, true)) {
            a0Var.f171616e = aVar;
            Thread thread = new Thread(new b0(a0Var), "Vivoki#MessageReader");
            a0Var.f171615d = thread;
            thread.start();
        } else {
            a0Var.f171612a.error("open() can only be called once.");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o72.t.d0(byteArrayOutputStream, 112);
        o72.t.d0(byteArrayOutputStream, 1885);
        tk.k kVar2 = cVar.f171631a;
        o72.t.e0(byteArrayOutputStream, kVar2.d());
        Matcher matcher = tk.k.f165241i.matcher(kVar2.f165209c.f165218d);
        o72.t.d0(byteArrayOutputStream, matcher.matches() ? Integer.parseInt(matcher.group(1).replace(".", "")) : 0);
        o72.t.d0(byteArrayOutputStream, cVar.f171632b);
        o72.t.f0(byteArrayOutputStream, "");
        o72.t.f0(byteArrayOutputStream, "vívokí");
        o72.t.f0(byteArrayOutputStream, "");
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        cVar.f171633c.a(5024, byteArray);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Luk/k$b;", "", "<init>", "()V", "", "ARCHIVE_FLAG", "B", "DIR_FILTER_NONE", "DIR_FILTER_PENDING_UPLOADS", "", "MAX_PACKET_SIZE", "I", "vivoki_release"}, k = 1, mv = {1, 4, 0})
    public static final class b {
        private b() {
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        public final Object a(Context context, pj2.k kVar, v13.c cVar) throws VivokiException {
            l lVar;
            Logger logger;
            if (cVar instanceof l) {
                lVar = (l) cVar;
                int i14 = lVar.f171716b;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    lVar.f171716b = i14 - Integer.MIN_VALUE;
                } else {
                    lVar = new l(this, cVar);
                }
            } else {
                lVar = new l(this, cVar);
            }
            Object obj = lVar.f171715a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = lVar.f171716b;
            if (i15 == 0) {
                o13.r.b(obj);
                Logger logger2 = LoggerFactory.getLogger("VivokiGfdiEmulator[" + kVar.getMacAddress() + ']');
                List<UUID> listP = kVar.p();
                UUID uuid = sk.b.f159489a;
                if (!listP.contains(uuid)) {
                    logger2.warn("ANT service is not supported");
                    throw new VivokiException("ANT service is not supported");
                }
                logger2.getClass();
                lVar.f171718d = kVar;
                lVar.f171719e = logger2;
                lVar.f171716b = 1;
                logger2.info("All services discovered, setting dest.");
                sk.d dVar = new sk.d(kVar, context);
                logger2.debug("Creating new instance of service impl.");
                n nVar = new n(dVar);
                kVar.a(nVar, uuid, sk.b.f159492d);
                kVar.a(nVar, uuid, sk.b.f159494f);
                kVar.a(nVar, uuid, sk.b.f159496h);
                kVar.a(nVar, uuid, sk.b.f159499k);
                t13.i iVar = new t13.i(u13.f.b(lVar));
                dVar.f159527u.set(new m(iVar, dVar));
                new sk.c(dVar).start();
                Object objA = iVar.a();
                if (objA == aVar) {
                    return aVar;
                }
                obj = objA;
                logger = logger2;
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                logger = lVar.f171719e;
                o13.r.b(obj);
            }
            o13.p pVar = (o13.p) obj;
            tk.k kVar2 = (tk.k) pVar.f128594a;
            sk.d dVar2 = (sk.d) pVar.f128595b;
            logger.getClass();
            return new k(kVar2, dVar2, logger, null);
        }

        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }

    public /* synthetic */ k(tk.k kVar, sk.d dVar, Logger logger, p005kotlin.jvm.internal.j jVar) {
        this(kVar, dVar, logger);
    }
}
