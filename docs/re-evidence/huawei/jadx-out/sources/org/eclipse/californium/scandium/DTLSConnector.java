package org.eclipse.californium.scandium;

import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.watchface.videoedit.param.CanvasConfig;
import defpackage.aaae;
import defpackage.aaaf;
import defpackage.aaag;
import defpackage.aaah;
import defpackage.aaai;
import defpackage.aaak;
import defpackage.aaam;
import defpackage.aaap;
import defpackage.aaav;
import defpackage.aaay;
import defpackage.aaba;
import defpackage.aabd;
import defpackage.aabe;
import defpackage.aabh;
import defpackage.aabl;
import defpackage.aabr;
import defpackage.aabv;
import defpackage.aabw;
import defpackage.aaca;
import defpackage.aacc;
import defpackage.aaci;
import defpackage.aacu;
import defpackage.aade;
import defpackage.aaex;
import defpackage.aaey;
import defpackage.zxu;
import defpackage.zxx;
import defpackage.zya;
import defpackage.zyj;
import defpackage.zyq;
import defpackage.zyx;
import defpackage.zzc;
import defpackage.zzd;
import defpackage.zzf;
import defpackage.zzg;
import defpackage.zzj;
import defpackage.zzk;
import defpackage.zzn;
import defpackage.zzo;
import defpackage.zzp;
import defpackage.zzt;
import defpackage.zzv;
import defpackage.zzw;
import defpackage.zzy;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.PortUnreachableException;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.californium.elements.Connector;
import org.eclipse.californium.elements.EndpointContext;
import org.eclipse.californium.elements.EndpointContextMatcher;
import org.eclipse.californium.elements.PersistentComponent;
import org.eclipse.californium.elements.PersistentConnector;
import org.eclipse.californium.elements.RawDataChannel;
import org.eclipse.californium.elements.auth.ExtensiblePrincipal;
import org.eclipse.californium.elements.util.ClockUtil;
import org.eclipse.californium.elements.util.LimitedRunnable;
import org.eclipse.californium.elements.util.NetworkInterfacesUtil;
import org.eclipse.californium.elements.util.SerialExecutor;
import org.eclipse.californium.scandium.auth.ApplicationLevelInfoSupplier;
import org.eclipse.californium.scandium.config.DtlsConfig;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ConnectionIdGenerator;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.DTLSConnectionState;
import org.eclipse.californium.scandium.dtls.DTLSMessage;
import org.eclipse.californium.scandium.dtls.ExtendedMasterSecretMode;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.eclipse.californium.scandium.dtls.HandshakeResultHandler;
import org.eclipse.californium.scandium.dtls.HandshakeType;
import org.eclipse.californium.scandium.dtls.Handshaker;
import org.eclipse.californium.scandium.dtls.MaxFragmentLengthExtension;
import org.eclipse.californium.scandium.dtls.ReadWriteLockConnectionStore;
import org.eclipse.californium.scandium.dtls.RecordLayer;
import org.eclipse.californium.scandium.dtls.ResumptionSupportingConnectionStore;
import org.eclipse.californium.scandium.dtls.SessionListener;
import org.eclipse.californium.scandium.dtls.cipher.CipherSuite;
import org.eclipse.californium.scandium.dtls.pskstore.AdvancedPskStore;
import org.eclipse.californium.scandium.dtls.resumption.ExtendedResumptionVerifier;
import org.eclipse.californium.scandium.dtls.resumption.ResumptionVerifier;
import org.eclipse.californium.scandium.dtls.x509.CertificateProvider;
import org.eclipse.californium.scandium.dtls.x509.NewAdvancedCertificateVerifier;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class DTLSConnector implements Connector, PersistentConnector, PersistentComponent, RecordLayer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f44513c;
    private static final Logger f;
    private static final long j;
    private static final zzk k;
    private static final int l;
    private static final Logger m;
    private static final zzk n;
    private static final zzk o;
    private static final int s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final zzy f44514a;
    private int aa;
    private volatile EndpointContextMatcher ab;
    private int ac;
    private volatile ExecutorService ad;
    private final int ae;
    private InetSocketAddress af;
    private final int ag;
    private final int ah;
    private final int ai;
    private final AtomicInteger aj;
    private volatile RawDataChannel ak;
    private Integer al;
    private final SessionListener am;
    private final AtomicInteger an;
    private ScheduledFuture<?> ao;
    private final List<Thread> ap;
    private final aabl aq;
    private final AtomicInteger ar;
    private final AtomicInteger as;
    private final AtomicInteger at;
    private final String au;
    private AtomicBoolean av;
    private final Queue<aaag> aw;
    private final ResumptionVerifier ax;
    private final SessionListener ay;
    private final boolean az;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final DtlsHealth f44515b;
    private ScheduledFuture<?> ba;
    private final int bb;
    private volatile DatagramSocket bc;
    private final boolean bd;
    private final boolean be;
    private final boolean bf;
    private final int bg;
    private final boolean bh;
    protected final ConnectionIdGenerator d;
    protected final ExtendedMasterSecretMode e;
    protected int g;
    protected final boolean h;
    protected ScheduledExecutorService i;
    private final Long p;
    private final ConnectionListener q;
    private volatile AlertHandler r;
    private final ResumptionSupportingConnectionStore t;
    private final DatagramFilter u;
    private final SessionListener v;
    private final zzt w;
    private final String x;
    private final DtlsConfig.DtlsRole y;
    private boolean z;

    @Deprecated
    protected void a(Handshaker handshaker) {
    }

    static {
        boolean z;
        Logger loggerA = aaex.a((Class<?>) DTLSConnector.class);
        m = loggerA;
        Logger loggerA2 = aaex.a(loggerA.getName() + ".drops");
        f = loggerA2;
        k = new zzk(loggerA2.getName(), 3L, 30L, TimeUnit.SECONDS);
        n = new zzk(loggerA2.getName(), 3L, 30L, TimeUnit.SECONDS);
        o = new zzk(loggerA2.getName(), 3L, 30L, TimeUnit.SECONDS);
        int overallMaxCiphertextExpansion = CipherSuite.getOverallMaxCiphertextExpansion();
        l = overallMaxCiphertextExpansion;
        s = overallMaxCiphertextExpansion + 16409;
        j = (zzt.f54841c * 2) + TimeUnit.SECONDS.toNanos(15L);
        try {
            aaey.b();
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        f44513c = z;
    }

    public DTLSConnector(zzy zzyVar) {
        this(zzyVar, e(zzyVar));
    }

    protected static ResumptionSupportingConnectionStore e(zzy zzyVar) {
        if (((Boolean) zzyVar.c(DtlsConfig.ae)).booleanValue()) {
            return new aabd(((Integer) zzyVar.c(DtlsConfig.s)).intValue(), zzyVar.c(DtlsConfig.at, TimeUnit.SECONDS).longValue(), zzyVar.u(), ((Boolean) zzyVar.c(DtlsConfig.al)).booleanValue()).d(zzyVar.r());
        }
        return new aabh(((Integer) zzyVar.c(DtlsConfig.s)).intValue(), zzyVar.c(DtlsConfig.at, TimeUnit.SECONDS).longValue(), zzyVar.u()).e(zzyVar.r());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01c9 A[PHI: r14
      0x01c9: PHI (r14v6 org.eclipse.californium.scandium.DtlsHealth) = 
      (r14v5 org.eclipse.californium.scandium.DtlsHealth)
      (r14v5 org.eclipse.californium.scandium.DtlsHealth)
      (r14v24 org.eclipse.californium.scandium.DtlsHealth)
     binds: [B:34:0x01ae, B:36:0x01ba, B:38:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    protected DTLSConnector(zzy zzyVar, final ResumptionSupportingConnectionStore resumptionSupportingConnectionStore) {
        DtlsHealth dtlsHealth;
        this.aw = new ConcurrentLinkedQueue();
        this.at = new AtomicInteger();
        this.aj = new AtomicInteger();
        this.am = new aacc() { // from class: org.eclipse.californium.scandium.DTLSConnector.2
            @Override // defpackage.aacc, org.eclipse.californium.scandium.dtls.SessionListener
            public void contextEstablished(Handshaker handshaker, aaak aaakVar) throws aaay {
                DTLSConnector.this.aj.decrementAndGet();
            }

            @Override // defpackage.aacc, org.eclipse.californium.scandium.dtls.SessionListener
            public void handshakeFailed(Handshaker handshaker, Throwable th) {
                DTLSConnector.this.aj.decrementAndGet();
            }
        };
        AtomicInteger atomicInteger = new AtomicInteger();
        this.as = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        this.ar = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        this.an = atomicInteger3;
        this.ap = new LinkedList();
        this.ac = RecordLayer.DEFAULT_IPV4_MTU;
        this.aa = 1280;
        this.g = s;
        this.w = new zzt();
        boolean z = false;
        this.av = new AtomicBoolean(false);
        if (zzyVar == null) {
            throw new NullPointerException("Configuration must not be null");
        }
        if (resumptionSupportingConnectionStore == null) {
            throw new NullPointerException("Connection store must not be null");
        }
        this.f44514a = zzyVar;
        ConnectionIdGenerator connectionIdGeneratorH = zzyVar.h();
        this.d = connectionIdGeneratorH;
        this.aq = zzyVar.q();
        Integer num = (Integer) zzyVar.c(DtlsConfig.z);
        int iIntValue = (num == null ? (Integer) zzyVar.c(DtlsConfig.y) : num).intValue();
        this.ag = iIntValue;
        int iIntValue2 = ((Integer) zzyVar.c(DtlsConfig.v)).intValue();
        this.ah = iIntValue2;
        int iIntValue3 = ((Integer) zzyVar.c(DtlsConfig.x)).intValue();
        this.ae = iIntValue3;
        atomicInteger.set(iIntValue);
        atomicInteger2.set(iIntValue2);
        atomicInteger3.set(iIntValue3);
        this.p = zzyVar.d();
        this.y = (DtlsConfig.DtlsRole) zzyVar.c(DtlsConfig.ap);
        this.x = zzyVar.k();
        this.bg = ((Integer) zzyVar.c(DtlsConfig.bg)).intValue();
        this.az = ((Boolean) zzyVar.c(DtlsConfig.bb)).booleanValue();
        this.be = ((Boolean) zzyVar.c(DtlsConfig.bc)).booleanValue();
        this.bd = ((Boolean) zzyVar.c(DtlsConfig.bk)).booleanValue();
        this.ai = ((Integer) zzyVar.c(DtlsConfig.s)).intValue();
        this.h = ((Boolean) zzyVar.c(DtlsConfig.bi)).booleanValue();
        this.e = (ExtendedMasterSecretMode) zzyVar.c(DtlsConfig.l);
        this.u = zzyVar.n();
        ConnectionListener connectionListenerO = zzyVar.o();
        this.q = connectionListenerO;
        this.v = zzyVar.s();
        this.t = resumptionSupportingConnectionStore;
        resumptionSupportingConnectionStore.attach(connectionIdGeneratorH);
        resumptionSupportingConnectionStore.setConnectionListener(connectionListenerO);
        HandshakeResultHandler handshakeResultHandler = new HandshakeResultHandler() { // from class: org.eclipse.californium.scandium.DTLSConnector.9
            @Override // org.eclipse.californium.scandium.dtls.HandshakeResultHandler
            public void apply(aaba aabaVar) {
                DTLSConnector.this.a(aabaVar);
            }
        };
        AdvancedPskStore advancedPskStoreC = zzyVar.c();
        if (advancedPskStoreC != null) {
            advancedPskStoreC.setResultHandler(handshakeResultHandler);
        }
        CertificateProvider certificateProviderI = zzyVar.i();
        if (certificateProviderI != null) {
            certificateProviderI.setResultHandler(handshakeResultHandler);
        }
        NewAdvancedCertificateVerifier newAdvancedCertificateVerifierB = zzyVar.b();
        if (newAdvancedCertificateVerifierB != null) {
            newAdvancedCertificateVerifierB.setResultHandler(handshakeResultHandler);
        }
        ResumptionVerifier resumptionVerifierT = ((Boolean) zzyVar.c(DtlsConfig.av)).booleanValue() ? zzyVar.t() : null;
        this.ax = resumptionVerifierT;
        if (resumptionVerifierT != null) {
            resumptionVerifierT.setResultHandler(handshakeResultHandler);
            if (resumptionVerifierT instanceof aacu) {
                aacu aacuVar = (aacu) resumptionVerifierT;
                if (!aacuVar.d()) {
                    aacuVar.e(resumptionSupportingConnectionStore);
                }
            }
        }
        String strP = zzyVar.p();
        if (strP == null) {
            try {
                InetSocketAddress inetSocketAddressA = zzyVar.a();
                strP = new URI("dtls", null, zzp.e(inetSocketAddressA.getAddress()), inetSocketAddressA.getPort(), null, null, null).toASCIIString();
            } catch (URISyntaxException unused) {
                strP = null;
            }
        }
        this.au = strP;
        DtlsHealth dtlsHealthM = this.f44514a.m();
        if (dtlsHealthM == null && this.f44514a.b(zyq.f54785b, TimeUnit.MILLISECONDS) > 0) {
            dtlsHealthM = d(this.f44514a);
            dtlsHealth = dtlsHealthM.isEnabled() ? dtlsHealthM : null;
        }
        this.f44515b = dtlsHealth;
        this.ay = new aacc() { // from class: org.eclipse.californium.scandium.DTLSConnector.13
            @Override // defpackage.aacc, org.eclipse.californium.scandium.dtls.SessionListener
            public void contextEstablished(Handshaker handshaker, aaak aaakVar) {
                DTLSConnector.this.b(handshaker);
            }

            @Override // defpackage.aacc, org.eclipse.californium.scandium.dtls.SessionListener
            public void handshakeCompleted(Handshaker handshaker) {
                if (DTLSConnector.this.f44515b != null) {
                    DTLSConnector.this.f44515b.endHandshake(true);
                }
                aaag connection = handshaker.getConnection();
                if (connection.t() != null) {
                    DTLSConnector.this.aw.add(connection);
                    DTLSConnector.this.at.incrementAndGet();
                }
            }

            @Override // defpackage.aacc, org.eclipse.californium.scandium.dtls.SessionListener
            public void handshakeFailed(Handshaker handshaker, Throwable th) {
                if (DTLSConnector.this.f44515b != null) {
                    DTLSConnector.this.f44515b.endHandshake(false);
                }
                List<zxx> listTakeDeferredApplicationData = handshaker.takeDeferredApplicationData();
                if (!listTakeDeferredApplicationData.isEmpty()) {
                    DTLSConnector.m.debug("Handshake with [{}] failed, report error to deferred {} messages", handshaker.getPeerAddress(), Integer.valueOf(listTakeDeferredApplicationData.size()));
                    Iterator<zxx> it = listTakeDeferredApplicationData.iterator();
                    while (it.hasNext()) {
                        it.next().c(th);
                    }
                }
                Object objE = zzp.e(handshaker.getPeerAddress());
                aaak dtlsContext = handshaker.getDtlsContext();
                aaag connection = handshaker.getConnection();
                if (handshaker.isRemovingConnection()) {
                    resumptionSupportingConnectionStore.remove(connection, false);
                    return;
                }
                if (handshaker.isProbing()) {
                    DTLSConnector.m.debug("Handshake with [{}] failed within probe!", objE);
                    return;
                }
                if (connection.f() == dtlsContext) {
                    if (th instanceof aaay) {
                        AlertMessage alertMessageC = ((aaay) th).c();
                        if (alertMessageC == null || alertMessageC.e() != AlertMessage.AlertDescription.CLOSE_NOTIFY) {
                            DTLSConnector.m.warn("Handshake with [{}] failed after session was established! {}", objE, alertMessageC, th);
                            return;
                        } else {
                            DTLSConnector.m.debug("Handshake with [{}] closed after session was established!", objE);
                            return;
                        }
                    }
                    if (th instanceof aaah) {
                        DTLSConnector.m.debug("Handshake with [{}] never get APPLICATION_DATA", objE, th);
                        return;
                    } else {
                        DTLSConnector.m.warn("Handshake with [{}] failed after session was established!", objE, th);
                        return;
                    }
                }
                if (connection.p()) {
                    DTLSConnector.m.warn("Handshake with [{}] failed, but has an established session!", objE);
                } else {
                    DTLSConnector.m.debug("Handshake with [{}] aborted, connection preserved!", objE);
                }
            }
        };
        long jIntValue = ((Integer) this.f44514a.c(DtlsConfig.bn)).intValue();
        long j2 = ((((long) this.ai) * jIntValue) + 50) / 100;
        if (j2 == 0 && jIntValue > 0) {
            j2 = 1;
        }
        this.bb = (int) j2;
        boolean zBooleanValue = ((Boolean) this.f44514a.c(DtlsConfig.be)).booleanValue();
        this.bh = zBooleanValue;
        if (zBooleanValue && ((Boolean) this.f44514a.c(DtlsConfig.bl)).booleanValue()) {
            z = true;
        }
        this.bf = z;
    }

    public boolean a() {
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth instanceof DtlsHealthExtended) {
            ((DtlsHealthExtended) dtlsHealth).setConnections(this.ai - this.t.remainingCapacity());
        }
        DtlsHealth dtlsHealth2 = this.f44515b;
        if (!(dtlsHealth2 instanceof DtlsHealthExtended2)) {
            return false;
        }
        DtlsHealthExtended2 dtlsHealthExtended2 = (DtlsHealthExtended2) dtlsHealth2;
        int i = this.ag - this.as.get();
        dtlsHealthExtended2.setPendingOutgoingJobs(i);
        if (i > 0) {
            m.debug("Pending out jobs {}", Integer.valueOf(i));
        }
        boolean z = i > 0;
        int i2 = this.ah - this.ar.get();
        dtlsHealthExtended2.setPendingIncomingJobs(i2);
        if (i2 > 0) {
            m.debug("Pending in jobs {}", Integer.valueOf(i2));
        }
        boolean z2 = i2 > 0;
        int i3 = this.ae - this.an.get();
        dtlsHealthExtended2.setPendingHandshakeJobs(i3);
        if (i3 > 0) {
            m.debug("Pending handshake jobs {}", Integer.valueOf(i3));
        }
        return z | z2 | (i3 > 0);
    }

    protected DtlsHealth d(zzy zzyVar) {
        return new zzv(zzyVar.r());
    }

    private final void e(Handshaker handshaker) {
        handshaker.addSessionListener(this.ay);
        handshaker.addSessionListener(this.v);
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth != null) {
            dtlsHealth.startHandshake();
        }
        a(handshaker);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Handshaker handshaker) {
        try {
            final aaag connection = handshaker.getConnection();
            this.t.putEstablishedSession(connection);
            SerialExecutor serialExecutorH = connection.h();
            List<zxx> listTakeDeferredApplicationData = handshaker.takeDeferredApplicationData();
            if (!listTakeDeferredApplicationData.isEmpty()) {
                m.trace("DTLS context with [{}] established, now process deferred {} outgoing messages", handshaker.getPeerAddress(), Integer.valueOf(listTakeDeferredApplicationData.size()));
                for (final zxx zxxVar : listTakeDeferredApplicationData) {
                    serialExecutorH.execute(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.14
                        @Override // java.lang.Runnable
                        public void run() {
                            DTLSConnector.this.c(zxxVar, connection);
                        }
                    });
                }
            }
            List<aabr> listTakeDeferredRecordsOfNextEpoch = handshaker.takeDeferredRecordsOfNextEpoch();
            if (listTakeDeferredRecordsOfNextEpoch.isEmpty()) {
                return;
            }
            m.trace("DTLS context with [{}] established, now process deferred {} incoming messages", handshaker.getPeerAddress(), Integer.valueOf(listTakeDeferredRecordsOfNextEpoch.size()));
            for (final aabr aabrVar : listTakeDeferredRecordsOfNextEpoch) {
                serialExecutorH.execute(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.11
                    @Override // java.lang.Runnable
                    public void run() {
                        DTLSConnector.this.processRecord(aabrVar, connection);
                    }
                });
            }
        } catch (RejectedExecutionException unused) {
            m.debug("stopping.");
        }
    }

    private long b() {
        return ClockUtil.c() - j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        int i2;
        long jC = ClockUtil.c();
        int iDecrementAndGet = this.at.get();
        int iMax = Math.max(10000, iDecrementAndGet / 5);
        boolean z = i % 6 == 0;
        String str = z ? " (full)" : "";
        try {
            long jB = b();
            Iterator<aaag> it = this.aw.iterator();
            int i3 = 0;
            int i4 = 0;
            boolean z2 = false;
            while (this.av.get() && it.hasNext()) {
                try {
                    aaag next = it.next();
                    if (i3 % iMax == 0) {
                        m.trace("{} recent handshakes, cleaning up {} - {}", Integer.valueOf(iDecrementAndGet), Integer.valueOf(i4), next.c());
                        z2 = true;
                    }
                    Long lT = next.t();
                    if (lT == null || jB - lT.longValue() >= 0) {
                        next.a((aaai) null);
                        iDecrementAndGet = this.at.decrementAndGet();
                        it.remove();
                        i4++;
                    } else if (!z) {
                        break;
                    }
                    i3++;
                    iMax = iMax;
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (z2) {
                long jC2 = ClockUtil.c() - jC;
                try {
                    m.debug("{} left recent handshakes, {} removed in {}ms{}!", Integer.valueOf(iDecrementAndGet), Integer.valueOf(i4), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(jC2)), str);
                } catch (Throwable th2) {
                    th = th2;
                    jC = jC2;
                    i2 = i4;
                    m.error("{} recent handshakes, cleanup failed after {} in {}ms{}!", Integer.valueOf(iDecrementAndGet), Integer.valueOf(i2), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - jC)), str, th);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i2 = 0;
        }
        if (this.av.get()) {
            ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.t;
            if (resumptionSupportingConnectionStore instanceof ReadWriteLockConnectionStore) {
                ((ReadWriteLockConnectionStore) resumptionSupportingConnectionStore).shrink(i, this.av);
            }
        }
    }

    protected void c() {
        this.aw.clear();
        this.at.set(0);
    }

    @Override // org.eclipse.californium.elements.Connector
    public final void start() throws IOException {
        synchronized (this) {
            b(this.f44514a.a());
        }
    }

    private ExecutorService h() {
        return this.ad;
    }

    protected void b(InetSocketAddress inetSocketAddress) throws IOException {
        if (this.av.get()) {
            return;
        }
        d(inetSocketAddress, new DatagramSocket((SocketAddress) null), (Integer) null);
    }

    protected void d(InetSocketAddress inetSocketAddress, DatagramSocket datagramSocket, Integer num) throws IOException {
        Long lT;
        this.bc = datagramSocket;
        this.as.set(this.ag);
        this.ar.set(this.ah);
        this.an.set(this.ae);
        if (inetSocketAddress.getPort() != 0 && this.f44514a.z().booleanValue()) {
            Logger logger = m;
            logger.info("Enable address reuse for socket!");
            datagramSocket.setReuseAddress(true);
            if (!datagramSocket.getReuseAddress()) {
                logger.warn("Enable address reuse for socket failed!");
            }
        }
        Integer num2 = (Integer) this.f44514a.c(DtlsConfig.ah);
        if (num2 != null && num2.intValue() > 0) {
            try {
                datagramSocket.setReceiveBufferSize(num2.intValue());
            } catch (IllegalArgumentException e) {
                m.error("failed to apply receive buffer size {}", num2, e);
            }
        }
        Integer num3 = (Integer) this.f44514a.c(DtlsConfig.ar);
        if (num3 != null && num3.intValue() > 0) {
            try {
                datagramSocket.setSendBufferSize(num3.intValue());
            } catch (IllegalArgumentException e2) {
                m.error("failed to apply send buffer size {}", num3, e2);
            }
        }
        int receiveBufferSize = datagramSocket.getReceiveBufferSize();
        int sendBufferSize = datagramSocket.getSendBufferSize();
        if (!datagramSocket.isBound()) {
            datagramSocket.bind(inetSocketAddress);
        }
        InetSocketAddress inetSocketAddress2 = new InetSocketAddress(datagramSocket.getLocalAddress(), datagramSocket.getLocalPort());
        InetSocketAddress inetSocketAddress3 = this.af;
        if (inetSocketAddress3 != null && !inetSocketAddress2.equals(inetSocketAddress3)) {
            this.t.markAllAsResumptionRequired();
        }
        MaxFragmentLengthExtension.Length length = (MaxFragmentLengthExtension.Length) this.f44514a.c(DtlsConfig.w);
        if (length != null) {
            this.g = length.length() + l + 25;
        }
        Integer num4 = (Integer) this.f44514a.c(DtlsConfig.aa);
        this.al = num4;
        if (num4 != null) {
            m.info("Configured MTU [{}]", num4);
        } else if (num != null) {
            this.al = num;
            m.info("Forced MTU [{}]", num);
        } else {
            InetAddress address = inetSocketAddress.getAddress();
            if (address.isAnyLocalAddress()) {
                this.ac = NetworkInterfacesUtil.c();
                this.aa = NetworkInterfacesUtil.b();
                m.info("multiple network interfaces, using smallest MTU [IPv4 {}, IPv6 {}]", Integer.valueOf(this.ac), Integer.valueOf(this.aa));
            } else {
                NetworkInterface byInetAddress = NetworkInterface.getByInetAddress(address);
                boolean z = address instanceof Inet6Address;
                if (byInetAddress == null || byInetAddress.getMTU() <= 0) {
                    if (z) {
                        int iB = NetworkInterfacesUtil.b();
                        this.aa = iB;
                        m.info("Cannot determine MTU of network interface, using minimum MTU [{}] of IPv6 instead", Integer.valueOf(iB));
                    } else {
                        int iC = NetworkInterfacesUtil.c();
                        this.ac = iC;
                        m.info("Cannot determine MTU of network interface, using minimum MTU [{}] of IPv4 instead", Integer.valueOf(iC));
                    }
                } else if (z) {
                    this.aa = byInetAddress.getMTU();
                } else {
                    this.ac = byInetAddress.getMTU();
                }
            }
            Integer num5 = (Integer) this.f44514a.c(DtlsConfig.ac);
            if (num5 != null && num5.intValue() < this.g) {
                if (this.ac > num5.intValue()) {
                    int iIntValue = num5.intValue();
                    this.ac = iIntValue;
                    m.info("Limit MTU IPv4[{}]", Integer.valueOf(iIntValue));
                }
                if (this.aa > num5.intValue()) {
                    int iIntValue2 = num5.intValue();
                    this.aa = iIntValue2;
                    m.info("Limit MTU IPv6[{}]", Integer.valueOf(iIntValue2));
                }
            } else {
                int i = this.ac;
                int i2 = this.g;
                if (i > i2) {
                    this.ac = i2;
                    m.info("Buffersize MTU IPv4[{}]", Integer.valueOf(i2));
                }
                int i3 = this.aa;
                int i4 = this.g;
                if (i3 > i4) {
                    this.aa = i4;
                    m.info("Buffersize MTU IPv6[{}]", Integer.valueOf(i4));
                }
            }
        }
        this.af = inetSocketAddress2;
        if (this.ad instanceof ScheduledExecutorService) {
            this.i = (ScheduledExecutorService) this.ad;
        } else {
            this.i = zzo.c(new zzj("DTLS-Timer-" + this.af + "#", zzn.f54823a));
        }
        if (this.ad == null) {
            int iIntValue3 = ((Integer) this.f44514a.c(DtlsConfig.k)).intValue();
            if (iIntValue3 > 1) {
                this.ad = zzo.b(iIntValue3 - 1, new zzj("DTLS-Worker-" + this.af + "#", zzn.f54823a));
            } else {
                this.ad = this.i;
            }
            ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.t;
            if (resumptionSupportingConnectionStore instanceof ReadWriteLockConnectionStore) {
                ((ReadWriteLockConnectionStore) resumptionSupportingConnectionStore).setExecutor(this.ad);
            }
            this.z = true;
        }
        long jB = b();
        ArrayList arrayList = new ArrayList();
        for (aaag aaagVar : this.t) {
            if (!aaagVar.x()) {
                aaagVar.a(this.ad, this.q);
            }
            if (aaagVar.p() && (lT = aaagVar.t()) != null) {
                if (jB - lT.longValue() < 0) {
                    arrayList.add(aaagVar);
                } else {
                    aaagVar.a((aaai) null);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            m.info("Restore {} recent handshakes!", Integer.valueOf(arrayList.size()));
            Collections.sort(arrayList, new Comparator<aaag>() { // from class: org.eclipse.californium.scandium.DTLSConnector.12
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public int compare(aaag aaagVar2, aaag aaagVar3) {
                    Long lT2 = aaagVar2.t();
                    Long lT3 = aaagVar3.t();
                    if (lT2 == null || lT3 == null) {
                        if (lT2 == null) {
                            return -1;
                        }
                        return lT3 == null ? 1 : 0;
                    }
                    long jLongValue = lT2.longValue() - lT3.longValue();
                    if (jLongValue > 0) {
                        return 1;
                    }
                    return jLongValue < 0 ? -1 : 0;
                }
            });
            this.aw.addAll(arrayList);
            this.at.set(arrayList.size());
        }
        this.av.set(true);
        int iIntValue4 = ((Integer) this.f44514a.c(DtlsConfig.af)).intValue();
        for (int i5 = 0; i5 < iIntValue4; i5++) {
            Worker worker = new Worker("DTLS-Receiver-" + i5 + Constants.LINK + this.af) { // from class: org.eclipse.californium.scandium.DTLSConnector.15

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final byte[] f44524b;
                private final DatagramPacket e;

                {
                    byte[] bArr = new byte[DTLSConnector.this.g];
                    this.f44524b = bArr;
                    this.e = new DatagramPacket(bArr, DTLSConnector.this.g);
                }

                @Override // org.eclipse.californium.scandium.DTLSConnector.Worker
                public void doWork() throws Exception {
                    if (DTLSConnector.f44513c) {
                        aaey.b();
                    }
                    this.e.setData(this.f44524b);
                    DTLSConnector.this.b(this.e);
                }
            };
            worker.setDaemon(true);
            worker.start();
            this.ap.add(worker);
        }
        Integer num6 = this.al;
        m.info("DTLSConnector listening on {}, recv buf = {}, send buf = {}, recv packet size = {}, MTU = {}", this.af, Integer.valueOf(receiveBufferSize), Integer.valueOf(sendBufferSize), Integer.valueOf(this.g), num6 != null ? num6.toString() : "IPv4 " + this.ac + " / IPv6 " + this.aa);
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth != null && dtlsHealth.isEnabled()) {
            final int iB2 = this.f44514a.b(zyq.f54785b, TimeUnit.MILLISECONDS);
            long j2 = iB2;
            if ((this.f44515b instanceof DtlsHealthExtended) && (iB2 == 0 || iB2 > 2000)) {
                j2 = 2000;
            }
            long j3 = j2;
            if (j3 > 0) {
                this.ba = this.i.scheduleAtFixedRate(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.16
                    private volatile long d = ClockUtil.c();

                    @Override // java.lang.Runnable
                    public void run() {
                        long jC = ClockUtil.c();
                        if (iB2 > 0 && TimeUnit.NANOSECONDS.toMillis(jC - this.d) > iB2) {
                            DTLSConnector.this.f44515b.dump(DTLSConnector.this.f44514a.r(), DTLSConnector.this.ai, DTLSConnector.this.t.remainingCapacity(), DTLSConnector.this.aj.get());
                            this.d = jC;
                        } else {
                            DTLSConnector.this.a();
                        }
                    }
                }, j3, j3, TimeUnit.MILLISECONDS);
            }
            a();
        }
        this.ao = this.i.scheduleWithFixedDelay(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.5

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f44530a = 0;

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DTLSConnector.this.d(this.f44530a);
                } catch (Throwable th) {
                    DTLSConnector.m.warn("Cleanup recent handshakes failed (loop {})!", Integer.valueOf(this.f44530a), th);
                }
                this.f44530a++;
            }
        }, 5000L, 5000L, TimeUnit.MILLISECONDS);
    }

    private final DatagramSocket j() {
        return this.bc;
    }

    @Override // org.eclipse.californium.elements.Connector
    public void stop() {
        boolean zCompareAndSet;
        ExecutorService executorService;
        ExecutorService executorService2;
        ScheduledExecutorService scheduledExecutorService;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            zCompareAndSet = this.av.compareAndSet(true, false);
            executorService = null;
            if (zCompareAndSet) {
                m.debug("DTLS connector on [{}] stopping ...", this.af);
                ScheduledFuture<?> scheduledFuture = this.ba;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    this.ba = null;
                }
                ScheduledFuture<?> scheduledFuture2 = this.ao;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                    this.ao = null;
                }
                c();
                Iterator<Thread> it = this.ap.iterator();
                while (it.hasNext()) {
                    it.next().interrupt();
                }
                if (this.bc != null) {
                    this.bc.close();
                    this.bc = null;
                }
                this.al = null;
                this.ac = RecordLayer.DEFAULT_IPV4_MTU;
                this.aa = 1280;
                this.t.stop(arrayList);
                ExecutorService executorService3 = this.ad;
                ScheduledExecutorService scheduledExecutorService2 = this.i;
                if (executorService3 != scheduledExecutorService2) {
                    arrayList.addAll(scheduledExecutorService2.shutdownNow());
                    scheduledExecutorService = this.i;
                    this.i = null;
                } else {
                    scheduledExecutorService = null;
                }
                if (this.z) {
                    arrayList.addAll(this.ad.shutdownNow());
                    ExecutorService executorService4 = this.ad;
                    this.ad = null;
                    this.z = false;
                    ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.t;
                    if (resumptionSupportingConnectionStore instanceof ReadWriteLockConnectionStore) {
                        ((ReadWriteLockConnectionStore) resumptionSupportingConnectionStore).setExecutor(null);
                    }
                    executorService = executorService4;
                }
                for (Thread thread : this.ap) {
                    thread.interrupt();
                    try {
                        thread.join(500L);
                    } catch (InterruptedException unused) {
                    }
                }
                this.ap.clear();
                executorService2 = executorService;
                executorService = scheduledExecutorService;
            } else {
                executorService2 = null;
            }
        }
        if (executorService != null) {
            try {
                if (!executorService.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                    m.warn("Shutdown DTLS connector on [{}] timer not terminated in time!", this.af);
                }
            } catch (InterruptedException unused2) {
            }
        }
        if (executorService2 != null) {
            try {
                if (!executorService2.awaitTermination(500L, TimeUnit.MILLISECONDS)) {
                    m.warn("Shutdown DTLS connector on [{}] executor not terminated in time!", this.af);
                }
            } catch (InterruptedException unused3) {
            }
        }
        zzo.d(arrayList);
        if (zCompareAndSet) {
            m.debug("DTLS connector on [{}] stopped.", this.af);
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void destroy() {
        stop();
        this.t.clear();
        this.ak = null;
    }

    @Override // org.eclipse.californium.elements.PersistentComponent
    public String getLabel() {
        return this.au;
    }

    @Override // org.eclipse.californium.elements.PersistentComponent
    public int save(OutputStream outputStream, long j2) throws IOException {
        if (isRunning()) {
            throw new IllegalStateException("Connector is running, save not possible!");
        }
        return this.t.saveConnections(outputStream, j2);
    }

    @Override // org.eclipse.californium.elements.PersistentComponent
    public int load(InputStream inputStream, long j2) throws IOException {
        int iLoadConnections = this.t.loadConnections(inputStream, j2);
        ApplicationLevelInfoSupplier applicationLevelInfoSupplierE = this.f44514a.e();
        if (applicationLevelInfoSupplierE != null) {
            for (aaag aaagVar : this.t) {
                Principal principalG = aaagVar.g();
                if (principalG instanceof ExtensiblePrincipal) {
                    ExtensiblePrincipal extensiblePrincipal = (ExtensiblePrincipal) principalG;
                    zyj info = applicationLevelInfoSupplierE.getInfo(principalG, null);
                    if (info != null) {
                        aaagVar.e(extensiblePrincipal.amend(info));
                    }
                }
            }
        }
        return iLoadConnections;
    }

    @Override // org.eclipse.californium.elements.PersistentConnector
    public int saveConnections(OutputStream outputStream, long j2) throws IOException {
        return save(outputStream, j2);
    }

    @Override // org.eclipse.californium.elements.PersistentConnector
    public int loadConnections(InputStream inputStream, long j2) throws IOException {
        return load(inputStream, j2);
    }

    private final aaag b(InetSocketAddress inetSocketAddress, aaae aaaeVar, boolean z) {
        aaag aaagVar;
        aaag aaagVar2;
        ExecutorService executorServiceH = h();
        ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.t;
        if (resumptionSupportingConnectionStore instanceof ReadWriteLockConnectionStore) {
            ReadWriteLockConnectionStore readWriteLockConnectionStore = (ReadWriteLockConnectionStore) resumptionSupportingConnectionStore;
            if (aaaeVar != null) {
                aaagVar2 = resumptionSupportingConnectionStore.get(aaaeVar);
            } else {
                aaagVar2 = resumptionSupportingConnectionStore.get(inetSocketAddress);
            }
            if (z && aaagVar2 == null && aaaeVar == null) {
                readWriteLockConnectionStore.writeLock().lock();
                try {
                    aaagVar2 = this.t.get(inetSocketAddress);
                    if (aaagVar2 == null) {
                        m.trace("create new connection for {}", inetSocketAddress);
                        aaag aaagVar3 = new aaag(inetSocketAddress);
                        aaagVar3.a(executorServiceH, this.q);
                        if (!this.av.get() || this.t.put(aaagVar3)) {
                            readWriteLockConnectionStore.writeLock().unlock();
                            return aaagVar3;
                        }
                        readWriteLockConnectionStore.writeLock().unlock();
                        return null;
                    }
                    readWriteLockConnectionStore.writeLock().unlock();
                } catch (Throwable th) {
                    readWriteLockConnectionStore.writeLock().unlock();
                    throw th;
                }
            }
        } else {
            synchronized (resumptionSupportingConnectionStore) {
                try {
                    if (aaaeVar != null) {
                        aaagVar = this.t.get(aaaeVar);
                    } else {
                        aaag aaagVar4 = this.t.get(inetSocketAddress);
                        if (aaagVar4 == null && z) {
                            m.trace("create new connection for {}", inetSocketAddress);
                            aaag aaagVar5 = new aaag(inetSocketAddress);
                            aaagVar5.a(executorServiceH, this.q);
                            if (!this.av.get() || this.t.put(aaagVar5)) {
                                return aaagVar5;
                            }
                            return null;
                        }
                        aaagVar = aaagVar4;
                    }
                    if (this.av.get() && aaagVar != null && !aaagVar.x()) {
                        aaagVar.a(executorServiceH, this.q);
                        m.trace("revive connection for {},{}", inetSocketAddress, aaaeVar);
                        return aaagVar;
                    }
                    aaagVar2 = aaagVar;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (aaagVar2 == null) {
            m.trace("no connection available for {},{}", inetSocketAddress, aaaeVar);
            return aaagVar2;
        }
        m.trace("connection available for {},{}", inetSocketAddress, aaaeVar);
        return aaagVar2;
    }

    protected void b(DatagramPacket datagramPacket) throws IOException {
        DatagramSocket datagramSocketJ = j();
        if (datagramSocketJ == null) {
            return;
        }
        datagramSocketJ.receive(datagramPacket);
        if (datagramPacket.getLength() == 0) {
            return;
        }
        d(datagramPacket, (InetSocketAddress) null);
    }

    @Override // org.eclipse.californium.elements.Connector
    public void processDatagram(DatagramPacket datagramPacket) {
        d(datagramPacket, (InetSocketAddress) null);
    }

    protected void d(DatagramPacket datagramPacket, InetSocketAddress inetSocketAddress) {
        InetSocketAddress inetSocketAddress2 = (InetSocketAddress) datagramPacket.getSocketAddress();
        if (f44513c) {
            aaey.a("PEER", zzp.c(inetSocketAddress2));
        }
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth != null) {
            dtlsHealth.receivingRecord(false);
        }
        long jC = ClockUtil.c();
        if (inetSocketAddress2.getPort() == 0) {
            Logger logger = f;
            int length = datagramPacket.getLength();
            logger.trace("Discarding record with {} bytes from [{}] without source-port", Integer.valueOf(length), zzp.e(inetSocketAddress2));
            DatagramFilter datagramFilter = this.u;
            if (datagramFilter instanceof DatagramFilterExtended) {
                ((DatagramFilterExtended) datagramFilter).onDrop(datagramPacket);
            }
            DtlsHealth dtlsHealth2 = this.f44515b;
            if (dtlsHealth2 != null) {
                dtlsHealth2.receivingRecord(true);
                return;
            }
            return;
        }
        DatagramFilter datagramFilter2 = this.u;
        if (datagramFilter2 != null && !datagramFilter2.onReceiving(datagramPacket)) {
            Logger logger2 = f;
            int length2 = datagramPacket.getLength();
            logger2.trace("Filter out packet with {} bytes from [{}]", Integer.valueOf(length2), zzp.e(inetSocketAddress2));
            DatagramFilter datagramFilter3 = this.u;
            if (datagramFilter3 instanceof DatagramFilterExtended) {
                ((DatagramFilterExtended) datagramFilter3).onDrop(datagramPacket);
            }
            DtlsHealth dtlsHealth3 = this.f44515b;
            if (dtlsHealth3 != null) {
                dtlsHealth3.receivingRecord(true);
                return;
            }
            return;
        }
        List<aabr> listB = aabr.b(new zzf(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength()), this.d, jC);
        Logger logger3 = m;
        int size = listB.size();
        logger3.trace("Received {} DTLS records from {} using a {} byte datagram buffer", Integer.valueOf(size), zzp.e(inetSocketAddress2), Integer.valueOf(this.g));
        if (listB.isEmpty()) {
            Logger logger4 = f;
            int length3 = datagramPacket.getLength();
            logger4.trace("Discarding malicious record with {} bytes from [{}]", Integer.valueOf(length3), zzp.e(inetSocketAddress2));
            DatagramFilter datagramFilter4 = this.u;
            if (datagramFilter4 instanceof DatagramFilterExtended) {
                ((DatagramFilterExtended) datagramFilter4).onDrop(datagramPacket);
            }
            DtlsHealth dtlsHealth4 = this.f44515b;
            if (dtlsHealth4 != null) {
                dtlsHealth4.receivingRecord(true);
                return;
            }
            return;
        }
        if (!this.av.get()) {
            Logger logger5 = f;
            int size2 = listB.size();
            logger5.trace("Discarding {} records, startting with {} from [{}] on shutdown", Integer.valueOf(size2), listB.get(0).g(), zzp.e(inetSocketAddress2));
            logger3.debug("Execution shutdown while processing incoming records from peer: {}", zzp.e(inetSocketAddress2));
            DatagramFilter datagramFilter5 = this.u;
            if (datagramFilter5 instanceof DatagramFilterExtended) {
                ((DatagramFilterExtended) datagramFilter5).onDrop(datagramPacket);
            }
            DtlsHealth dtlsHealth5 = this.f44515b;
            if (dtlsHealth5 != null) {
                dtlsHealth5.receivingRecord(true);
                return;
            }
            return;
        }
        e(listB, inetSocketAddress2, inetSocketAddress);
    }

    protected void e(List<aabr> list, InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2) {
        final aabr aabrVar = list.get(0);
        if (list.size() == 1 && aabrVar.n()) {
            aabrVar.e(inetSocketAddress, inetSocketAddress2);
            if (this.y == DtlsConfig.DtlsRole.CLIENT_ONLY) {
                Logger logger = f;
                int size = list.size();
                logger.trace("client-only, discarding {} CLIENT_HELLO from [{}]!", Integer.valueOf(size), zzp.e(inetSocketAddress));
                b(aabrVar);
                DtlsHealth dtlsHealth = this.f44515b;
                if (dtlsHealth != null) {
                    dtlsHealth.receivingRecord(true);
                    return;
                }
                return;
            }
            b(h(), inetSocketAddress, new LimitedRunnable(this.ar) { // from class: org.eclipse.californium.scandium.DTLSConnector.4
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (DTLSConnector.this.av.get()) {
                            if (DTLSConnector.f44513c) {
                                aaey.a("PEER", zzp.c(aabrVar.j()));
                            }
                            DTLSConnector.this.a(aabrVar);
                            if (DTLSConnector.f44513c) {
                                aaey.b();
                            }
                        }
                    } finally {
                        onDequeueing();
                    }
                }

                @Override // org.eclipse.californium.elements.util.LimitedRunnable
                public void onError(RejectedExecutionException rejectedExecutionException) {
                    DTLSConnector.this.b(aabrVar);
                }
            });
            return;
        }
        aaae aaaeVarA = aabrVar.a();
        final aaag aaagVarB = b(inetSocketAddress, aaaeVarA, false);
        if (aaagVarB == null) {
            aabrVar.e(inetSocketAddress, inetSocketAddress2);
            b(aabrVar);
            DtlsHealth dtlsHealth2 = this.f44515b;
            if (dtlsHealth2 != null) {
                dtlsHealth2.receivingRecord(true);
            }
            if (aaaeVarA == null) {
                Logger logger2 = f;
                int size2 = list.size();
                logger2.trace("Discarding {} records from [{}] received without existing connection", Integer.valueOf(size2), zzp.e(inetSocketAddress));
                return;
            }
            Logger logger3 = f;
            int size3 = list.size();
            logger3.trace("Discarding {} records from [{},{}] received without existing connection", Integer.valueOf(size3), zzp.e(inetSocketAddress), aaaeVarA);
            return;
        }
        SerialExecutor serialExecutorH = aaagVarB.h();
        for (final aabr aabrVar2 : list) {
            aabrVar2.e(inetSocketAddress, inetSocketAddress2);
            try {
                if (!b(serialExecutorH, inetSocketAddress, new LimitedRunnable(this.ar) { // from class: org.eclipse.californium.scandium.DTLSConnector.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (DTLSConnector.this.av.get() && aaagVarB.x()) {
                                DTLSConnector.this.processRecord(aabrVar2, aaagVarB);
                            }
                        } finally {
                            onDequeueing();
                        }
                    }

                    @Override // org.eclipse.californium.elements.util.LimitedRunnable
                    public void onError(RejectedExecutionException rejectedExecutionException) {
                        DTLSConnector.this.b(aabrVar2);
                    }
                })) {
                    return;
                }
            } catch (RuntimeException e) {
                m.warn("Unexpected error occurred while processing record [type: {}, peer: {}]", aabrVar2.g(), zzp.e(inetSocketAddress), e);
                b(aaagVarB);
                return;
            }
        }
    }

    protected boolean b(Executor executor, InetSocketAddress inetSocketAddress, LimitedRunnable limitedRunnable) {
        try {
            limitedRunnable.execute(executor);
            return true;
        } catch (RejectedExecutionException e) {
            if (limitedRunnable.isOverflown()) {
                k.d("Inbound jobs overflow! Dropping inbound message from peer [{}]", zzp.e(inetSocketAddress));
            } else {
                m.debug("Execution rejected while processing record from peer [{}]", zzp.e(inetSocketAddress), e);
            }
            DtlsHealth dtlsHealth = this.f44515b;
            if (dtlsHealth == null) {
                return false;
            }
            dtlsHealth.receivingRecord(true);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x0362  */
    @Override // org.eclipse.californium.scandium.dtls.RecordLayer
    public void processRecord(aabr aabrVar, aaag aaagVar) {
        boolean z;
        RuntimeException runtimeException;
        DtlsHealth dtlsHealth;
        int iC = aabrVar.c();
        aaak aaakVarC = aaagVar.c(iC);
        try {
            try {
                if (aabrVar.a() == null) {
                    try {
                        if (!aaagVar.d(aabrVar.j())) {
                            f.debug("Drop received record {}, connection changed address {} => {}! (shift {}ms)", aabrVar.g(), zzp.e(aabrVar.j()), zzp.e(aaagVar.m()), Long.valueOf(TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - aabrVar.i())));
                            b(aabrVar);
                            DtlsHealth dtlsHealth2 = this.f44515b;
                            if (dtlsHealth2 != null) {
                                dtlsHealth2.receivingRecord(true);
                                return;
                            }
                            return;
                        }
                    } catch (RuntimeException e) {
                        runtimeException = e;
                        z = true;
                        b(aabrVar);
                        dtlsHealth = this.f44515b;
                        if (dtlsHealth != null) {
                            dtlsHealth.receivingRecord(z);
                        }
                        m.warn("Unexpected error occurred while processing record from peer [{}]", zzp.e(aabrVar.j()), runtimeException);
                        b(aaagVar);
                    }
                }
                try {
                    Logger logger = m;
                    logger.trace("Received DTLS record of type [{}], length: {}, [epoche:{},rseqn:{}]", aabrVar.g(), Integer.valueOf(aabrVar.e()), Integer.valueOf(iC), Long.valueOf(aabrVar.f()));
                    Handshaker handshakerO = aaagVar.o();
                    if (handshakerO != null && handshakerO.isExpired()) {
                        handshakerO.handshakeFailed(new Exception("handshake already expired!"));
                        if (this.t.get(aaagVar.c()) != aaagVar) {
                            f.debug("Discarding {} record [epoch {}, rseqn {}] received from peer [{}], handshake expired!", aabrVar.g(), Integer.valueOf(iC), Long.valueOf(aabrVar.f()), zzp.e(aabrVar.j()));
                            b(aabrVar);
                            DtlsHealth dtlsHealth3 = this.f44515b;
                            if (dtlsHealth3 != null) {
                                dtlsHealth3.receivingRecord(true);
                                return;
                            }
                            return;
                        }
                        handshakerO = null;
                    }
                    if (aaakVarC == null) {
                        if (handshakerO != null && handshakerO.getDtlsContext().b() == 0 && iC == 1) {
                            handshakerO.addRecordsOfNextEpochForDeferredProcessing(aabrVar);
                            return;
                        }
                        f.debug("Discarding {} record [epoch {}, rseqn {}] received from peer [{}] without an active dtls context", aabrVar.g(), Integer.valueOf(iC), Long.valueOf(aabrVar.f()), zzp.e(aabrVar.j()));
                        b(aabrVar);
                        DtlsHealth dtlsHealth4 = this.f44515b;
                        if (dtlsHealth4 != null) {
                            dtlsHealth4.receivingRecord(true);
                            return;
                        }
                        return;
                    }
                    boolean zV = aaagVar.v();
                    if (this.az || zV) {
                        if (!aaakVarC.e(iC, aabrVar.f(), this.bg)) {
                            if (zV) {
                                f.debug("Discarding {} record [epoch {}, rseqn {}] received from closed peer [{}]", aabrVar.g(), Integer.valueOf(iC), Long.valueOf(aabrVar.f()), zzp.e(aabrVar.j()));
                            } else {
                                f.debug("Discarding duplicate {} record [epoch {}, rseqn {}] received from peer [{}]", aabrVar.g(), Integer.valueOf(iC), Long.valueOf(aabrVar.f()), zzp.e(aabrVar.j()));
                            }
                            b(aabrVar);
                            DtlsHealth dtlsHealth5 = this.f44515b;
                            if (dtlsHealth5 != null) {
                                dtlsHealth5.receivingRecord(true);
                                return;
                            }
                            return;
                        }
                    }
                    if (aabrVar.g() == ContentType.TLS12_CID) {
                        if (iC == 0) {
                            f.debug("Discarding TLS_CID record received from peer [{}] during handshake", zzp.e(aabrVar.j()));
                            b(aabrVar);
                            DtlsHealth dtlsHealth6 = this.f44515b;
                            if (dtlsHealth6 != null) {
                                dtlsHealth6.receivingRecord(true);
                                return;
                            }
                            return;
                        }
                    } else if (iC > 0 && aaagVar.e()) {
                        f.debug("Discarding record received from peer [{}], CID required!", zzp.e(aabrVar.j()));
                        b(aabrVar);
                        DtlsHealth dtlsHealth7 = this.f44515b;
                        if (dtlsHealth7 != null) {
                            dtlsHealth7.receivingRecord(true);
                            return;
                        }
                        return;
                    }
                    if (!aabrVar.o()) {
                        DatagramFilter datagramFilter = this.u;
                        if (datagramFilter != null && !datagramFilter.onReceiving(aabrVar, aaagVar)) {
                            f.trace("Filter out record with {} bytes from [{}]", Integer.valueOf(aabrVar.k()), zzp.e(aabrVar.j()));
                            b(aabrVar);
                            DtlsHealth dtlsHealth8 = this.f44515b;
                            if (dtlsHealth8 != null) {
                                dtlsHealth8.receivingRecord(true);
                                return;
                            }
                            return;
                        }
                        aabrVar.d(aaakVarC.m());
                        aabrVar.c(aaakVarC.c());
                    }
                    if (handshakerO != null && handshakerO.isProbing()) {
                        this.t.removeFromEstablishedSessions(aaagVar);
                        aaagVar.aa();
                        handshakerO.resetProbing();
                        logger.trace("handshake probe successful {}", zzp.e(aaagVar.m()));
                    }
                    int i = AnonymousClass8.f44536b[aabrVar.g().ordinal()];
                    if (i == 1) {
                        c(aabrVar, aaagVar);
                        return;
                    }
                    if (i == 2) {
                        c(aabrVar, aaagVar, aaakVarC);
                        return;
                    }
                    if (i == 3) {
                        b(aabrVar, aaagVar);
                    } else if (i == 4) {
                        d(aabrVar, aaagVar, aaakVarC);
                    } else {
                        f.debug("Discarding record of unsupported type [{}] from peer [{}]", aabrVar.g(), zzp.e(aabrVar.j()));
                    }
                } catch (RuntimeException e2) {
                    runtimeException = e2;
                    z = true;
                    b(aabrVar);
                    dtlsHealth = this.f44515b;
                    if (dtlsHealth != null) {
                        dtlsHealth.receivingRecord(z);
                    }
                    m.warn("Unexpected error occurred while processing record from peer [{}]", zzp.e(aabrVar.j()), runtimeException);
                    b(aaagVar);
                }
            } catch (RuntimeException e3) {
                z = true;
                runtimeException = e3;
            }
        } catch (aaay e4) {
            m.debug("error occurred while processing record from peer [{}]", zzp.e(aabrVar.j()), e4);
        } catch (aaci e5) {
            String message = e5.getMessage();
            if (aaakVarC != null) {
                aaakVarC.j();
                DatagramFilter datagramFilter2 = this.u;
                boolean zOnMacError = datagramFilter2 != null ? datagramFilter2.onMacError(aabrVar, aaagVar) : false;
                ConnectionListener connectionListener = this.q;
                if (connectionListener == null ? zOnMacError : !(!connectionListener.onConnectionMacError(aaagVar) && !zOnMacError)) {
                    c(aaagVar);
                } else if (iC > 0 && aaagVar.r()) {
                    message = message + d(aabrVar, aaakVarC);
                }
            }
            f.debug("Discarding {} received from peer [{}] caused by {}", aabrVar.g(), zzp.e(aabrVar.j()), message);
            b(aabrVar);
            DtlsHealth dtlsHealth9 = this.f44515b;
            if (dtlsHealth9 != null) {
                if (dtlsHealth9 instanceof DtlsHealthExtended2) {
                    ((DtlsHealthExtended2) dtlsHealth9).receivingMacError();
                } else {
                    dtlsHealth9.receivingRecord(true);
                }
            }
        } catch (GeneralSecurityException e6) {
            f.debug("Discarding {} received from peer [{}] caused by {}", aabrVar.g(), zzp.e(aabrVar.j()), e6.getMessage());
            b(aabrVar);
            DtlsHealth dtlsHealth10 = this.f44515b;
            if (dtlsHealth10 != null) {
                dtlsHealth10.receivingRecord(true);
            }
            m.debug("error occurred while processing record from peer [{}]", zzp.e(aabrVar.j()), e6);
        }
    }

    private void c(aaag aaagVar) {
        aaak aaakVarF = aaagVar.f();
        if (aaakVarF != null) {
            m.trace("Closing connection with peer [{}]", aaagVar.m());
            c(aaagVar, aaakVarF, new AlertMessage(AlertMessage.AlertLevel.WARNING, AlertMessage.AlertDescription.CLOSE_NOTIFY));
            aaagVar.a(true);
        }
    }

    private void b(aaag aaagVar) {
        aaak aaakVarB = aaagVar.b();
        if (aaakVarB != null) {
            m.trace("Terminating connection with peer [{}], Internal Error", zzp.e(aaagVar.m()));
            c(aaagVar, aaakVarB, new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
        }
        this.t.remove(aaagVar, true);
    }

    private void c(aabr aabrVar, aaag aaagVar) {
        Handshaker handshakerO = aaagVar.o();
        if (aaagVar.f() == null || aaagVar.y()) {
            if (handshakerO != null) {
                handshakerO.addRecordsOfNextEpochForDeferredProcessing(aabrVar);
                return;
            } else {
                f.debug("Discarding APPLICATION_DATA record received from peer [{}]", zzp.e(aabrVar.j()));
                b(aabrVar);
                return;
            }
        }
        zzw zzwVar = (zzw) aabrVar.b();
        InetSocketAddress inetSocketAddressM = aaagVar.m();
        boolean zE = e(aabrVar, aaagVar);
        if (this.bd && !zE) {
            Logger logger = f;
            ContentType contentTypeG = aabrVar.g();
            int iC = aabrVar.c();
            long jF = aabrVar.f();
            logger.debug("Discarding reorderd {} record [epoch {}, rseqn {}] received from peer [{}]", contentTypeG, Integer.valueOf(iC), Long.valueOf(jF), zzp.e(aabrVar.j()));
            b(aabrVar);
            DtlsHealth dtlsHealth = this.f44515b;
            if (dtlsHealth != null) {
                dtlsHealth.receivingRecord(true);
                return;
            }
            return;
        }
        RawDataChannel rawDataChannel = this.ak;
        if (rawDataChannel != null) {
            zya.e eVar = new zya.e();
            eVar.d(zxu.h, Long.valueOf(aabrVar.f()));
            if (zE) {
                eVar.d(zxu.k, Boolean.TRUE);
            }
            if (inetSocketAddressM != null && !aaagVar.d(inetSocketAddressM)) {
                eVar.d(zxu.l, inetSocketAddressM);
            }
            zxu zxuVarB = aaagVar.b(eVar, aabrVar.j());
            m.trace("Received APPLICATION_DATA for {}", zxuVarB);
            rawDataChannel.receiveData(zxx.c(zzwVar.c(), zxuVarB, false, aabrVar.i(), this.af));
        }
    }

    private void c(aabr aabrVar, aaag aaagVar, aaak aaakVar) {
        AlertMessage alertMessage = (AlertMessage) aabrVar.b();
        Handshaker handshakerO = aaagVar.o();
        m.trace("Processing {} ALERT from [{}]: {}", alertMessage.c(), zzp.e(aaagVar.m()), alertMessage.e());
        aaay aaayVar = null;
        if (AlertMessage.AlertDescription.CLOSE_NOTIFY.equals(alertMessage.e())) {
            if (aaagVar.p()) {
                e(aabrVar, aaagVar);
            } else {
                aaay aaayVar2 = new aaay("Received 'close notify'", alertMessage);
                if (handshakerO != null) {
                    handshakerO.setFailureCause(aaayVar2);
                }
                aaayVar = aaayVar2;
            }
            if (!aaagVar.y()) {
                if (aaagVar.m() != null) {
                    c(aaagVar, aaakVar, new AlertMessage(AlertMessage.AlertLevel.WARNING, AlertMessage.AlertDescription.CLOSE_NOTIFY));
                }
                if (aaagVar.p()) {
                    aaagVar.b(aabrVar);
                } else {
                    this.t.remove(aaagVar, false);
                }
            }
        } else if (AlertMessage.AlertLevel.FATAL.equals(alertMessage.c())) {
            aaayVar = new aaay("Received 'fatal alert/" + alertMessage.e() + "'", alertMessage);
            if (handshakerO != null) {
                handshakerO.setFailureCause(aaayVar);
            }
            this.t.remove(aaagVar, true);
        }
        d(aaagVar, alertMessage);
        if (aaayVar == null || handshakerO == null) {
            return;
        }
        handshakerO.handshakeFailed(aaayVar);
    }

    private boolean e(aabr aabrVar, aaag aaagVar) {
        InetSocketAddress inetSocketAddressJ;
        boolean zE = aaagVar.e(aabrVar);
        if (zE || !this.be) {
            aaagVar.b(aabrVar.h());
            inetSocketAddressJ = aabrVar.j();
        } else {
            inetSocketAddressJ = null;
        }
        this.t.update(aaagVar, inetSocketAddressJ);
        Handshaker handshakerO = aaagVar.o();
        if (handshakerO != null) {
            handshakerO.handshakeCompleted();
        }
        ConnectionListener connectionListener = this.q;
        if (connectionListener != null && connectionListener.onConnectionUpdatesSequenceNumbers(aaagVar, false)) {
            c(aaagVar);
        }
        return zE;
    }

    private void b(aabr aabrVar, aaag aaagVar) {
        Handshaker handshakerO = aaagVar.o();
        if (handshakerO != null) {
            try {
                handshakerO.processMessage(aabrVar);
                return;
            } catch (aaay e) {
                d(aabrVar, aaagVar, e);
                return;
            }
        }
        f.debug("Received CHANGE_CIPHER_SPEC record from peer [{}] with no handshake going on", zzp.e(aabrVar.j()));
    }

    private void d(aabr aabrVar, aaag aaagVar, aaak aaakVar) {
        m.trace("Received {} record from peer [{}]", aabrVar.g(), zzp.e(aabrVar.j()));
        if (aabrVar.n()) {
            throw new IllegalArgumentException("new CLIENT_HELLO must be processed by processClientHello!");
        }
        try {
            Handshaker handshakerO = aaagVar.o();
            int i = AnonymousClass8.f44537c[((HandshakeMessage) aabrVar.b()).getMessageType().ordinal()];
            if (i == 1) {
                f.debug("Reject re-negotiation from peer [{}]", zzp.e(aabrVar.j()));
                c(aaagVar, aaakVar, new AlertMessage(AlertMessage.AlertLevel.WARNING, AlertMessage.AlertDescription.NO_RENEGOTIATION));
                return;
            }
            if (i == 2) {
                if (handshakerO != null) {
                    f.debug("Ignore HELLO_REQUEST received from peer [{}] during ongoing handshake", zzp.e(aaagVar.m()));
                    return;
                } else {
                    f.debug("Reject HELLO_REQUEST received from peer [{}]", zzp.e(aaagVar.m()));
                    c(aaagVar, aaakVar, new AlertMessage(AlertMessage.AlertLevel.WARNING, AlertMessage.AlertDescription.NO_RENEGOTIATION));
                    return;
                }
            }
            if (handshakerO != null) {
                handshakerO.processMessage(aabrVar);
                return;
            }
            Logger logger = f;
            int iC = aabrVar.c();
            logger.debug("Discarding HANDSHAKE message [epoch={}] from peer [{}], no ongoing handshake!", Integer.valueOf(iC), zzp.e(aabrVar.j()));
        } catch (aaay e) {
            d(aabrVar, aaagVar, e);
        }
    }

    /* JADX INFO: renamed from: org.eclipse.californium.scandium.DTLSConnector$8, reason: invalid class name */
    static /* synthetic */ class AnonymousClass8 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44536b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f44537c;

        static {
            int[] iArr = new int[HandshakeType.values().length];
            f44537c = iArr;
            try {
                iArr[HandshakeType.CLIENT_HELLO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44537c[HandshakeType.HELLO_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[ContentType.values().length];
            f44536b = iArr2;
            try {
                iArr2[ContentType.APPLICATION_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44536b[ContentType.ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f44536b[ContentType.CHANGE_CIPHER_SPEC.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44536b[ContentType.HANDSHAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final aabr aabrVar) {
        final aaag aaagVarD;
        InetSocketAddress inetSocketAddressJ = aabrVar.j();
        Logger logger = m;
        if (logger.isTraceEnabled()) {
            logger.trace("Processing new CLIENT_HELLO from peer [{}]:{}{}", zzp.e(inetSocketAddressJ), zzp.c(), aabrVar);
        }
        try {
            try {
                aabrVar.c(DTLSConnectionState.NULL);
                DTLSMessage dTLSMessageB = aabrVar.b();
                if (dTLSMessageB instanceof aaav) {
                    logger.debug("Received unsupported fragmented CLIENT_HELLO from peer {}.", zzp.e(inetSocketAddressJ));
                    b(aabrVar, new aaap("Fragmented CLIENT_HELLO is not supported!"));
                    return;
                }
                aaai aaaiVar = (aaai) dTLSMessageB;
                byte[] bArrA = this.w.a(inetSocketAddressJ, aaaiVar);
                if (c(inetSocketAddressJ, aaaiVar, bArrA)) {
                    ExecutorService executorServiceH = h();
                    ResumptionSupportingConnectionStore resumptionSupportingConnectionStore = this.t;
                    if (resumptionSupportingConnectionStore instanceof ReadWriteLockConnectionStore) {
                        ReadWriteLockConnectionStore readWriteLockConnectionStore = (ReadWriteLockConnectionStore) resumptionSupportingConnectionStore;
                        readWriteLockConnectionStore.writeLock().lock();
                        try {
                            aaagVarD = d(inetSocketAddressJ, aaaiVar, executorServiceH);
                            readWriteLockConnectionStore.writeLock().unlock();
                        } catch (Throwable th) {
                            readWriteLockConnectionStore.writeLock().unlock();
                            throw th;
                        }
                    } else {
                        synchronized (resumptionSupportingConnectionStore) {
                            aaagVarD = d(inetSocketAddressJ, aaaiVar, executorServiceH);
                        }
                    }
                    if (aaagVarD != null) {
                        try {
                            aaagVarD.h().execute(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.3
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (DTLSConnector.this.av.get()) {
                                        DTLSConnector.this.a(aabrVar, aaagVarD);
                                    }
                                }
                            });
                            return;
                        } catch (RejectedExecutionException e) {
                            m.debug("Execution rejected while processing record [type: {}, peer: {}]", aabrVar.g(), zzp.e(inetSocketAddressJ), e);
                            return;
                        } catch (RuntimeException e2) {
                            m.warn("Unexpected error occurred while processing record [type: {}, peer: {}]", aabrVar.g(), zzp.e(inetSocketAddressJ), e2);
                            b(aaagVarD);
                            return;
                        }
                    }
                }
                c(aaaiVar, aabrVar, bArrA);
            } catch (RuntimeException e3) {
                m.warn("Processing new CLIENT_HELLO from peer [{}] failed!", zzp.e(aabrVar.j()), e3);
            }
        } catch (aaay e4) {
            m.debug("Processing new CLIENT_HELLO from peer [{}] failed!", zzp.e(aabrVar.j()), e4);
        } catch (GeneralSecurityException e5) {
            f.debug("Processing new CLIENT_HELLO from peer [{}] failed!", zzp.e(aabrVar.j()), e5);
        }
    }

    private aaag d(InetSocketAddress inetSocketAddress, aaai aaaiVar, ExecutorService executorService) {
        aaak aaakVarF;
        aaag aaagVar = this.t.get(inetSocketAddress);
        if (aaagVar != null && !aaagVar.c(aaaiVar)) {
            if (this.bh && !aaaiVar.g() && aaaiVar.hasSessionId() && !zzg.c(aaagVar.i(), aaaiVar.getSessionId())) {
                return null;
            }
            final Handshaker handshakerO = aaagVar.o();
            if (handshakerO != null && ((aaakVarF = aaagVar.f()) == null || aaakVarF != handshakerO.getDtlsContext())) {
                final aaap aaapVar = new aaap("Received new CLIENT_HELLO from " + zzp.b(inetSocketAddress));
                try {
                    aaagVar.h().execute(new Runnable() { // from class: org.eclipse.californium.scandium.DTLSConnector.7
                        @Override // java.lang.Runnable
                        public void run() {
                            if (DTLSConnector.this.av.get()) {
                                handshakerO.handshakeFailed(aaapVar);
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                    m.trace("Execution rejected, connection already shutdown [peer: {}]", zzp.e(inetSocketAddress));
                }
            }
            aaagVar = null;
        }
        if (aaagVar == null) {
            int iMax = Math.max(this.ai, 50);
            if (this.at.get() > iMax) {
                m.error("Too many recent handshakes! {} max. allowed.", Integer.valueOf(iMax));
                return null;
            }
            aaagVar = new aaag(inetSocketAddress);
            aaagVar.a(executorService, this.q);
            aaagVar.a(aaaiVar);
            if (!this.t.put(aaagVar)) {
                return null;
            }
        }
        return aaagVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(aabr aabrVar, aaag aaagVar) {
        aaca aacaVar;
        if (aaagVar == null) {
            throw new NullPointerException("connection must not be null!");
        }
        if (!aaagVar.d(aabrVar.j())) {
            f.debug("Drop received CLIENT_HELLO, changed address {} => {}!", zzp.e(aabrVar.j()), zzp.e(aaagVar.m()));
            return;
        }
        if (aaagVar.p() || aaagVar.r()) {
            Logger logger = f;
            int iC = aabrVar.c();
            logger.debug("Discarding received duplicate CLIENT_HELLO message [epoch={}] from peer [{}]!", Integer.valueOf(iC), zzp.e(aabrVar.j()));
            return;
        }
        Logger logger2 = m;
        if (logger2.isTraceEnabled()) {
            logger2.trace("Processing CLIENT_HELLO from peer [{}]:{}{}", zzp.e(aabrVar.j()), zzp.c(), aabrVar);
        }
        try {
            aaai aaaiVar = (aaai) aabrVar.b();
            if (this.ax != null && aaaiVar.hasSessionId()) {
                aacaVar = new aabw(aabrVar.f(), aaaiVar.getMessageSeq(), this, this.i, aaagVar, this.f44514a);
                if (!aaaiVar.g()) {
                    this.aj.incrementAndGet();
                    aacaVar.addSessionListener(this.am);
                }
            } else {
                aacaVar = new aaca(aabrVar.f(), aaaiVar.getMessageSeq(), this, this.i, aaagVar, this.f44514a);
            }
            e(aacaVar);
            aacaVar.processMessage(aabrVar);
        } catch (aaay e) {
            d(aabrVar, aaagVar, e);
        }
    }

    private boolean c(InetSocketAddress inetSocketAddress, aaai aaaiVar, byte[] bArr) {
        byte[] bArrE = aaaiVar.e();
        if (bArrE.length > 0) {
            boolean zIsEqual = MessageDigest.isEqual(bArr, bArrE);
            if (!zIsEqual) {
                try {
                    byte[] bArrB = this.w.b(inetSocketAddress, aaaiVar);
                    zIsEqual = (bArrB == null || !MessageDigest.isEqual(bArrB, bArrE)) ? zIsEqual : true;
                } catch (GeneralSecurityException e) {
                    m.debug("failed to generate past cookie.", (Throwable) e);
                }
            }
            if (!zIsEqual) {
                Logger logger = m;
                if (logger.isDebugEnabled()) {
                    logger.debug("provided cookie must {} match {}. Send verify request to {}", zzp.a(bArrE, (char) 0, 6), zzp.a(bArr, (char) 0, 6), zzp.e(inetSocketAddress));
                }
            }
            return zIsEqual;
        }
        if (!this.bh) {
            return true;
        }
        if (!this.bf && CipherSuite.containsPskBasedCipherSuite(aaaiVar.e(this.f44514a.x()))) {
            return true;
        }
        if (this.ax != null && aaaiVar.hasSessionId() && this.bb > 0) {
            int i = this.aj.get();
            m.trace("pending fast resumptions [{}], threshold [{}]", Integer.valueOf(i), Integer.valueOf(this.bb));
            if (i < this.bb) {
                ResumptionVerifier resumptionVerifier = this.ax;
                if (resumptionVerifier instanceof ExtendedResumptionVerifier) {
                    return ((ExtendedResumptionVerifier) resumptionVerifier).skipRequestHelloVerify(aaaiVar, this.h, this.e);
                }
                return resumptionVerifier.skipRequestHelloVerify(aaaiVar.getSessionId());
            }
        }
        return false;
    }

    private void c(aaai aaaiVar, aabr aabrVar, byte[] bArr) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("Cookie must not be null!");
        }
        m.trace("Verifying client IP address [{}] using HELLO_VERIFY_REQUEST", zzp.e(aabrVar.j()));
        aabl protocolVersion = this.aq;
        if (protocolVersion == null) {
            protocolVersion = aaaiVar.getProtocolVersion();
            if (protocolVersion.compareTo(aabl.f91b) < 0) {
                protocolVersion = aabl.f91b;
            } else if (protocolVersion.compareTo(aabl.f90a) > 0) {
                protocolVersion = aabl.f90a;
            }
        }
        aabl aablVar = protocolVersion;
        aabe aabeVar = new aabe(aablVar, bArr);
        aabeVar.setMessageSeq(aaaiVar.getMessageSeq());
        aabr aabrVar2 = new aabr(ContentType.HANDSHAKE, aablVar, aabrVar.f(), aabeVar);
        aabrVar2.e(aabrVar.j(), (InetSocketAddress) null);
        try {
            e(aabrVar2);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(aabr aabrVar, aaag aaagVar, aaay aaayVar) {
        AlertMessage alertMessageC = aaayVar.c();
        if (!AlertMessage.AlertLevel.FATAL.equals(alertMessageC.c())) {
            if (aabrVar != null) {
                b(aabrVar, aaayVar);
            }
            d(aaagVar, alertMessageC);
            return;
        }
        if (AlertMessage.AlertDescription.UNKNOWN_PSK_IDENTITY.equals(alertMessageC.e())) {
            if (aabrVar != null) {
                b(aabrVar, aaayVar);
            }
            d(aaagVar, alertMessageC);
            return;
        }
        Handshaker handshakerO = aaagVar.o();
        if (handshakerO != null) {
            Logger logger = m;
            if (logger.isTraceEnabled()) {
                logger.trace("Aborting handshake with peer [{}]:", zzp.e(aaagVar.m()), aaayVar);
            } else if (logger.isDebugEnabled()) {
                logger.debug("Aborting handshake with peer [{}]: {}", zzp.e(aaagVar.m()), aaayVar.getMessage());
            }
            handshakerO.setFailureCause(aaayVar);
            aaak dtlsContext = handshakerO.getDtlsContext();
            aaak aaakVarF = aaagVar.f();
            if (aaakVarF == dtlsContext) {
                if (alertMessageC.e() == AlertMessage.AlertDescription.CLOSE_NOTIFY) {
                    logger.debug("Handshake with [{}] closed after session was established!", zzp.e(handshakerO.getPeerAddress()));
                } else {
                    logger.warn("Handshake with [{}] failed after session was established! {}", zzp.e(handshakerO.getPeerAddress()), alertMessageC, aaayVar);
                }
            } else if (aaakVarF != null) {
                logger.warn("Handshake with [{}] failed, but has an established session!", zzp.e(handshakerO.getPeerAddress()), aaayVar);
            }
            c(aaagVar, dtlsContext, alertMessageC);
            handshakerO.handshakeFailed(aaayVar);
            d(aaagVar, alertMessageC);
        }
    }

    private String d(aabr aabrVar, aaak aaakVar) {
        if (!aaakVar.d().a().isPskBased()) {
            return "";
        }
        if (aabrVar != null) {
            return aabrVar.g() != (aaakVar.a() == null ? ContentType.HANDSHAKE : ContentType.TLS12_CID) ? "" : " Wrong PSK secret?";
        }
        return " Wrong PSK secret?";
    }

    private void d(aaag aaagVar, AlertMessage alertMessage) {
        AlertHandler alertHandler;
        if (!aaagVar.b(alertMessage) || (alertHandler = this.r) == null) {
            return;
        }
        alertHandler.onAlert(aaagVar.m(), alertMessage);
    }

    void c(aaag aaagVar, aaak aaakVar, AlertMessage alertMessage) {
        aabr aabrVar;
        if (aaagVar == null) {
            throw new NullPointerException("Connection must not be null");
        }
        if (aaakVar == null) {
            throw new NullPointerException("DTLS Context must not be null");
        }
        if (alertMessage == null) {
            throw new NullPointerException("Alert must not be null");
        }
        if (aaagVar.y()) {
            return;
        }
        try {
            m.trace("send ALERT {} for peer {}.", alertMessage, zzp.e(aaagVar.m()));
            boolean z = aaakVar.i() > 0;
            if (z || alertMessage.a() == null) {
                aabrVar = new aabr(ContentType.ALERT, aaakVar.i(), alertMessage, aaakVar, z, 0);
            } else {
                aabrVar = new aabr(ContentType.ALERT, alertMessage.a(), aaakVar.e(), alertMessage);
            }
            aabrVar.e(aaagVar.m(), aaagVar.n());
            e(aabrVar);
            ConnectionListener connectionListener = this.q;
            if (connectionListener != null) {
                connectionListener.onConnectionUpdatesSequenceNumbers(aaagVar, true);
            }
        } catch (IOException unused) {
        } catch (GeneralSecurityException e) {
            f.warn("Cannot create ALERT message for peer [{}]", zzp.e(aaagVar.m()), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0102  */
    /* JADX WARN: Code duplicated, block: B:44:0x0128  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // org.eclipse.californium.elements.Connector
    public void send(final zxx zxxVar) {
        final aaag aaagVar;
        RuntimeException illegalArgumentException;
        final long jC;
        DtlsHealth dtlsHealth;
        if (zxxVar == null) {
            throw new NullPointerException("Message must not be null");
        }
        DtlsHealth dtlsHealth2 = this.f44515b;
        if (dtlsHealth2 != null) {
            dtlsHealth2.sendingRecord(false);
        }
        if (zxxVar.f()) {
            f.warn("DTLSConnector drops {} outgoing bytes to multicast {}", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
            zxxVar.c(new zzd("DTLS doesn't support multicast!"));
            DtlsHealth dtlsHealth3 = this.f44515b;
            if (dtlsHealth3 != null) {
                dtlsHealth3.sendingRecord(true);
                return;
            }
            return;
        }
        if (zxxVar.d().getPort() == 0) {
            String strC = zzp.c(zxxVar.d());
            f.warn("DTLSConnector drops {} outgoing bytes to [{}] without destination-port", Integer.valueOf(zxxVar.g()), strC);
            zxxVar.c(new IOException("CoAPs message to " + strC + " dropped, destination port 0!"));
            return;
        }
        RuntimeException illegalStateException = null;
        if (!this.av.get()) {
            illegalArgumentException = new IllegalStateException("connector must be started before sending messages is possible");
        } else {
            if (zxxVar.g() > 16384) {
                illegalArgumentException = new IllegalArgumentException("Message data must not exceed 16384 bytes");
            } else {
                boolean z = this.y != DtlsConfig.DtlsRole.SERVER_ONLY;
                if (z) {
                    z = !c(zxxVar).equals("none");
                }
                aaag aaagVarB = b(zxxVar.d(), (aaae) null, z);
                if (aaagVarB == null) {
                    if (z) {
                        illegalStateException = new IllegalStateException("connection store is exhausted!");
                    } else {
                        if (this.y == DtlsConfig.DtlsRole.SERVER_ONLY) {
                            zxxVar.c(new zzc("server only, connection missing!"));
                        } else {
                            zxxVar.c(new zzc("connection missing!"));
                        }
                        f.debug("DTLSConnector drops {} outgoing bytes to {}, connection missing!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
                        DtlsHealth dtlsHealth4 = this.f44515b;
                        if (dtlsHealth4 != null) {
                            dtlsHealth4.sendingRecord(true);
                            return;
                        }
                        return;
                    }
                }
                aaagVar = aaagVarB;
            }
            if (illegalStateException != null) {
                f.debug("DTLSConnector drops {} outgoing bytes to {}, {}!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()), illegalStateException.getMessage());
                zxxVar.c(illegalStateException);
                dtlsHealth = this.f44515b;
                if (dtlsHealth != null) {
                    dtlsHealth.sendingRecord(true);
                    throw illegalStateException;
                }
                throw illegalStateException;
            }
            jC = ClockUtil.c();
            if (a(aaagVar.h(), zxxVar.d(), new LimitedRunnable(this.as) { // from class: org.eclipse.californium.scandium.DTLSConnector.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (!DTLSConnector.this.av.get() || !aaagVar.x()) {
                            DTLSConnector.f.trace("DTLSConnector drops {} outgoing bytes to {}, connector not running!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
                            zxxVar.c(new InterruptedIOException("Connector is not running."));
                            if (DTLSConnector.this.f44515b != null) {
                                DTLSConnector.this.f44515b.sendingRecord(true);
                            }
                        } else {
                            DTLSConnector.this.e(jC, zxxVar, aaagVar);
                        }
                    } catch (Exception e) {
                        if (DTLSConnector.this.av.get()) {
                            DTLSConnector.m.warn("Exception thrown by executor thread [{}]", Thread.currentThread().getName(), e);
                        }
                        DTLSConnector.f.trace("DTLSConnector drops {} outgoing bytes to {} {}", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()), e.getMessage());
                        if (DTLSConnector.this.f44515b != null) {
                            DTLSConnector.this.f44515b.sendingRecord(true);
                        }
                        zxxVar.c(e);
                    } finally {
                        onDequeueing();
                    }
                }
            })) {
            }
            zxxVar.c(new IllegalStateException("Outbound message overflow!"));
        }
        aaagVar = null;
        illegalStateException = illegalArgumentException;
        if (illegalStateException != null) {
            f.debug("DTLSConnector drops {} outgoing bytes to {}, {}!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()), illegalStateException.getMessage());
            zxxVar.c(illegalStateException);
            dtlsHealth = this.f44515b;
            if (dtlsHealth != null) {
                dtlsHealth.sendingRecord(true);
                throw illegalStateException;
            }
            throw illegalStateException;
        }
        jC = ClockUtil.c();
        if (a(aaagVar.h(), zxxVar.d(), new LimitedRunnable(this.as) { // from class: org.eclipse.californium.scandium.DTLSConnector.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (!DTLSConnector.this.av.get() || !aaagVar.x()) {
                        DTLSConnector.f.trace("DTLSConnector drops {} outgoing bytes to {}, connector not running!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
                        zxxVar.c(new InterruptedIOException("Connector is not running."));
                        if (DTLSConnector.this.f44515b != null) {
                            DTLSConnector.this.f44515b.sendingRecord(true);
                        }
                    } else {
                        DTLSConnector.this.e(jC, zxxVar, aaagVar);
                    }
                } catch (Exception e) {
                    if (DTLSConnector.this.av.get()) {
                        DTLSConnector.m.warn("Exception thrown by executor thread [{}]", Thread.currentThread().getName(), e);
                    }
                    DTLSConnector.f.trace("DTLSConnector drops {} outgoing bytes to {} {}", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()), e.getMessage());
                    if (DTLSConnector.this.f44515b != null) {
                        DTLSConnector.this.f44515b.sendingRecord(true);
                    }
                    zxxVar.c(e);
                } finally {
                    onDequeueing();
                }
            }
        })) {
            zxxVar.c(new IllegalStateException("Outbound message overflow!"));
        }
    }

    protected boolean a(Executor executor, InetSocketAddress inetSocketAddress, LimitedRunnable limitedRunnable) {
        try {
            limitedRunnable.execute(executor);
            return true;
        } catch (RejectedExecutionException e) {
            if (limitedRunnable.isOverflown()) {
                n.d("Outbound jobs overflow! Dropping outbound message to peer [{}]", zzp.e(inetSocketAddress));
            } else {
                m.debug("Execution rejected while processing record to peer [{}]", zzp.e(inetSocketAddress), e);
            }
            DtlsHealth dtlsHealth = this.f44515b;
            if (dtlsHealth == null) {
                return false;
            }
            dtlsHealth.sendingRecord(true);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(long j2, zxx zxxVar, aaag aaagVar) throws aaay {
        if (aaagVar.m() == null) {
            long millis = TimeUnit.NANOSECONDS.toMillis(ClockUtil.c() - j2);
            Logger logger = f;
            int iG = zxxVar.g();
            logger.info("Drop outgoing record with {} bytes, connection lost address {}! (shift {}ms)", Integer.valueOf(iG), zzp.e(zxxVar.d()), Long.valueOf(millis));
            zxxVar.c(new zzc("connection not longer assigned to address!"));
            DtlsHealth dtlsHealth = this.f44515b;
            if (dtlsHealth != null) {
                dtlsHealth.sendingRecord(true);
                return;
            }
            return;
        }
        m.trace("Sending application layer message to [{}]", zxxVar.c());
        Handshaker handshakerO = aaagVar.o();
        if (handshakerO != null && !handshakerO.hasContextEstablished()) {
            if (handshakerO.isExpired()) {
                handshakerO.handshakeAborted(new Exception("handshake already expired!"));
            } else if (handshakerO.isProbing()) {
                if (a(zxxVar, (EndpointContext) null)) {
                    zxxVar.j();
                    handshakerO.addApplicationDataForDeferredProcessing(zxxVar);
                    return;
                }
                return;
            }
        }
        if (aaagVar.s()) {
            d(zxxVar, aaagVar);
        } else {
            a(zxxVar, aaagVar);
        }
    }

    private void a(zxx zxxVar, aaag aaagVar) throws aaay {
        if (a(zxxVar, (EndpointContext) null)) {
            Handshaker handshakerO = aaagVar.o();
            if (handshakerO == null) {
                if (this.y == DtlsConfig.DtlsRole.SERVER_ONLY) {
                    Logger logger = f;
                    int iG = zxxVar.g();
                    logger.trace("DTLSConnector drops {} outgoing bytes to {}, server only, connection missing!", Integer.valueOf(iG), zzp.e(zxxVar.d()));
                    zxxVar.c(new zzc("server only, connection missing!"));
                    DtlsHealth dtlsHealth = this.f44515b;
                    if (dtlsHealth != null) {
                        dtlsHealth.sendingRecord(true);
                        return;
                    }
                    return;
                }
                if (c(zxxVar).contentEquals("none")) {
                    Logger logger2 = f;
                    int iG2 = zxxVar.g();
                    logger2.trace("DTLSConnector drops {} outgoing bytes to {}, connection missing!", Integer.valueOf(iG2), zzp.e(zxxVar.d()));
                    zxxVar.c(new zzc("connection missing!"));
                    DtlsHealth dtlsHealth2 = this.f44515b;
                    if (dtlsHealth2 != null) {
                        dtlsHealth2.sendingRecord(true);
                        return;
                    }
                    return;
                }
                aaaf aaafVar = new aaaf(zxxVar.c().getVirtualHost(), this, this.i, aaagVar, this.f44514a, false);
                e(aaafVar);
                zxxVar.j();
                aaafVar.addApplicationDataForDeferredProcessing(zxxVar);
                aaafVar.c();
                return;
            }
            zxxVar.j();
            handshakerO.addApplicationDataForDeferredProcessing(zxxVar);
        }
    }

    private void d(zxx zxxVar, aaag aaagVar) throws aaay {
        aaam aaamVarD;
        aaaf aabvVar;
        aaak aaakVarF = aaagVar.f();
        String strC = c(zxxVar);
        boolean zN = aaakVarF.n();
        if ("none".equals(strC)) {
            if (zN || aaagVar.y()) {
                f.trace("DTLSConnector drops {} outgoing bytes to {}, resumption required!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
                zxxVar.c(new zzc("resumption required!"));
                DtlsHealth dtlsHealth = this.f44515b;
                if (dtlsHealth != null) {
                    dtlsHealth.sendingRecord(true);
                    return;
                }
                return;
            }
        } else {
            boolean zEquals = CanvasConfig.FULL_CONFIG.equals(strC);
            boolean zEquals2 = "probe".equals(strC);
            if (zEquals2 || zEquals || "force".equals(strC) || zN || aaagVar.a(e(zxxVar))) {
                if (this.y == DtlsConfig.DtlsRole.SERVER_ONLY) {
                    f.trace("DTLSConnector drops {} outgoing bytes to {}, server only, resumption requested failed!", Integer.valueOf(zxxVar.g()), zzp.e(zxxVar.d()));
                    zxxVar.c(new zzc("server only, resumption requested failed!"));
                    DtlsHealth dtlsHealth2 = this.f44515b;
                    if (dtlsHealth2 != null) {
                        dtlsHealth2.sendingRecord(true);
                        return;
                    }
                    return;
                }
                zxxVar.j();
                String virtualHost = zxxVar.c().getVirtualHost();
                Handshaker handshakerO = aaagVar.o();
                if (zEquals) {
                    aaamVarD = null;
                } else {
                    aaamVarD = aaakVarF.d();
                    boolean zB = aaamVarD.l().b();
                    if (zB || !((ExtendedMasterSecretMode) this.f44514a.c(DtlsConfig.l)).is(ExtendedMasterSecretMode.ENABLED)) {
                        zEquals = zB;
                    } else {
                        boolean zQ = aaamVarD.q();
                        zEquals = !zQ;
                        if (!zQ) {
                            m.debug("Extended Master Secrets not supported by server {}, fallback to full handshake!", zzp.e(zxxVar.d()));
                        }
                    }
                    if (!zEquals) {
                        boolean zA = aade.a(virtualHost, aaamVarD.j());
                        zEquals = !zA;
                        if (!zA) {
                            m.debug("Server Name Indication changed for server {}, fallback to full handshake!", zzp.e(zxxVar.d()));
                        }
                    }
                }
                if (zEquals) {
                    aabvVar = new aaaf(virtualHost, this, this.i, aaagVar, this.f44514a, zEquals2);
                } else {
                    aabvVar = new aabv(aaamVarD, this, this.i, aaagVar, this.f44514a, zEquals2);
                }
                if (zEquals2) {
                    aaagVar.a(false);
                } else {
                    this.t.removeFromEstablishedSessions(aaagVar);
                    aaagVar.aa();
                }
                e(aabvVar);
                if (handshakerO != null) {
                    aabvVar.takeDeferredApplicationData(handshakerO);
                    handshakerO.handshakeAborted(new Exception("handshake replaced!"));
                }
                aabvVar.addApplicationDataForDeferredProcessing(zxxVar);
                aabvVar.c();
                return;
            }
        }
        c(zxxVar, aaagVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(zxx zxxVar, aaag aaagVar) {
        try {
            aaak aaakVarF = aaagVar.f();
            m.trace("send {}-{} using {}", aaagVar.c(), zzp.e(aaagVar.m()), aaakVarF.d().l());
            zxu zxuVarB = aaagVar.b(new zya.e());
            if (a(zxxVar, zxuVarB)) {
                zxxVar.d(zxuVarB);
                aabr aabrVar = new aabr(ContentType.APPLICATION_DATA, aaakVarF.i(), new zzw(zxxVar.b()), aaakVarF, true, 0);
                aabrVar.e(aaagVar.m(), aaagVar.n());
                e(aabrVar);
                zxxVar.h();
                this.t.update(aaagVar, null);
                ConnectionListener connectionListener = this.q;
                if (connectionListener == null || !connectionListener.onConnectionUpdatesSequenceNumbers(aaagVar, true)) {
                    return;
                }
                c(aaagVar);
            }
        } catch (IOException e) {
            zxxVar.c(e);
        } catch (GeneralSecurityException e2) {
            f.warn("Cannot send APPLICATION record to peer [{}]", zzp.e(zxxVar.d()), e2);
            zxxVar.c(e2);
        }
    }

    private boolean a(zxx zxxVar, EndpointContext endpointContext) {
        EndpointContextMatcher endpointContextMatcherG = g();
        if (endpointContextMatcherG == null || endpointContextMatcherG.isToBeSent(zxxVar.c(), endpointContext)) {
            return true;
        }
        Logger logger = f;
        if (logger.isInfoEnabled()) {
            int iG = zxxVar.g();
            logger.info("DTLSConnector ({}) drops {} bytes outgoing, {} != {}", this, Integer.valueOf(iG), endpointContextMatcherG.toRelevantState(zxxVar.c()), endpointContextMatcherG.toRelevantState(endpointContext));
        }
        zxxVar.c(new zyx("DTLS sending"));
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth == null) {
            return false;
        }
        dtlsHealth.sendingRecord(true);
        return false;
    }

    @Override // org.eclipse.californium.scandium.dtls.RecordLayer
    public void dropReceivedRecord(aabr aabrVar) {
        Logger logger = f;
        ContentType contentTypeG = aabrVar.g();
        int iC = aabrVar.c();
        long jF = aabrVar.f();
        logger.debug("Discarding {} record [epoch {}, rseqn {}] dropped by handshaker for peer [{}]", contentTypeG, Integer.valueOf(iC), Long.valueOf(jF), zzp.e(aabrVar.j()));
        b(aabrVar);
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth != null) {
            dtlsHealth.receivingRecord(true);
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.RecordLayer
    public int getMaxDatagramSize(boolean z) {
        int iIntValue;
        int i = z ? 128 : 64;
        Integer num = this.al;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = z ? this.aa : this.ac;
        }
        int i2 = iIntValue - i;
        if (i2 < 64) {
            throw new IllegalStateException(String.format("%s, datagram size %d, mtu %d", z ? "IPV6" : "IPv4", Integer.valueOf(i2), Integer.valueOf(iIntValue)));
        }
        return i2;
    }

    @Override // org.eclipse.californium.scandium.dtls.RecordLayer
    public void sendFlight(List<DatagramPacket> list) throws IOException {
        for (DatagramPacket datagramPacket : list) {
            DtlsHealth dtlsHealth = this.f44515b;
            if (dtlsHealth != null) {
                dtlsHealth.sendingRecord(false);
            }
            c(datagramPacket);
        }
    }

    @Override // org.eclipse.californium.scandium.dtls.RecordLayer
    public void processHandshakeException(aaag aaagVar, aaay aaayVar) {
        d((aabr) null, aaagVar, aaayVar);
    }

    protected void e(aabr aabrVar) throws IOException {
        if (this.f44515b != null && aabrVar.g() != ContentType.APPLICATION_DATA) {
            this.f44515b.sendingRecord(false);
        }
        byte[] bArrL = aabrVar.l();
        c(new DatagramPacket(bArrL, bArrL.length, aabrVar.j()));
    }

    protected void c(DatagramPacket datagramPacket) throws IOException {
        DatagramSocket datagramSocketJ = j();
        if (datagramSocketJ != null && !datagramSocketJ.isClosed()) {
            if (datagramPacket.getPort() == 0) {
                String strB = zzp.b(datagramPacket.getSocketAddress());
                f.trace("Discarding record with {} bytes to [{}] without destination-port", Integer.valueOf(datagramPacket.getLength()), strB);
                DtlsHealth dtlsHealth = this.f44515b;
                if (dtlsHealth != null) {
                    dtlsHealth.sendingRecord(true);
                }
                throw new IOException("DTLS Record to " + strB + " dropped, destination port 0!");
            }
            try {
                datagramSocketJ.send(datagramPacket);
                return;
            } catch (PortUnreachableException unused) {
                if (!datagramSocketJ.isClosed()) {
                    m.warn("Could not send record, destination {} unreachable!", zzp.e(datagramPacket.getSocketAddress()));
                }
            } catch (IOException e) {
                if (!datagramSocketJ.isClosed()) {
                    m.warn("Could not send record", (Throwable) e);
                    throw e;
                }
            }
        }
        InetSocketAddress inetSocketAddressA = this.af;
        if (inetSocketAddressA == null) {
            inetSocketAddressA = this.f44514a.a();
        }
        f.debug("Socket [{}] is closed, discarding packet ...", inetSocketAddressA);
        throw new IOException("Socket closed.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final aaba aabaVar) {
        final aaag aaagVar = this.t.get(aabaVar.a());
        if (aaagVar != null) {
            if (aaagVar.r()) {
                try {
                    c(aaagVar.h(), aaagVar, new LimitedRunnable(this.an) { // from class: org.eclipse.californium.scandium.DTLSConnector.10
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                if (!DTLSConnector.this.av.get() || !aaagVar.x()) {
                                    DTLSConnector.m.debug("Execution stopped while processing handshake result [{}]", aaagVar);
                                } else {
                                    Handshaker handshakerO = aaagVar.o();
                                    if (handshakerO == null) {
                                        DTLSConnector.m.debug("No ongoing handshake for result [{}]", aaagVar);
                                    } else {
                                        handshakerO.processAsyncHandshakeResult(aabaVar);
                                    }
                                }
                            } catch (aaay e) {
                                DTLSConnector.this.d((aabr) null, aaagVar, e);
                            } catch (IllegalStateException e2) {
                                DTLSConnector.m.warn("Exception while processing handshake result [{}]", aaagVar, e2);
                            } finally {
                                onDequeueing();
                            }
                        }
                    });
                    return;
                } catch (RuntimeException e) {
                    m.warn("Unexpected error occurred while processing handshake result [{}]", aaagVar, e);
                    return;
                }
            }
            m.debug("No ongoing handshake for handshake result [{}]", aaagVar);
            return;
        }
        m.debug("No connection  for handshake result [{}]", aaagVar);
    }

    protected boolean c(Executor executor, aaag aaagVar, LimitedRunnable limitedRunnable) {
        try {
            limitedRunnable.execute(executor);
            return true;
        } catch (RejectedExecutionException e) {
            if (limitedRunnable.isOverflown()) {
                o.d("Handshake result jobs overflow! Dropping handshake result [{}]", aaagVar);
                return false;
            }
            m.debug("Execution rejected while processing handshake result [{}]", aaagVar, e);
            return false;
        }
    }

    private Long e(zxx zxxVar) {
        Long l2 = this.p;
        Number number = (Number) zxxVar.c().get(zxu.f);
        if (number == null) {
            return l2;
        }
        if (number.longValue() >= 0) {
            return Long.valueOf(number.longValue());
        }
        return null;
    }

    @Override // org.eclipse.californium.elements.Connector
    public final InetSocketAddress getAddress() {
        int localPort;
        DatagramSocket datagramSocketJ = j();
        if (datagramSocketJ != null && datagramSocketJ.isBound() && (localPort = datagramSocketJ.getLocalPort()) > 0) {
            return new InetSocketAddress(datagramSocketJ.getLocalAddress(), localPort);
        }
        return this.f44514a.a();
    }

    @Override // org.eclipse.californium.elements.Connector
    public final boolean isRunning() {
        return this.av.get();
    }

    protected abstract class Worker extends Thread {
        protected abstract void doWork() throws Exception;

        protected Worker(String str) {
            super(zzn.f54823a, str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                DTLSConnector.m.info("Starting worker thread [{}]", getName());
                while (DTLSConnector.this.av.get()) {
                    try {
                        try {
                            doWork();
                        } catch (InterruptedIOException unused) {
                            if (DTLSConnector.this.av.get()) {
                                DTLSConnector.m.info("Worker thread [{}] IO has been interrupted", getName());
                            } else {
                                DTLSConnector.m.debug("Worker thread [{}] IO has been interrupted", getName());
                            }
                        }
                    } catch (InterruptedException unused2) {
                        if (DTLSConnector.this.av.get()) {
                            DTLSConnector.m.info("Worker thread [{}] has been interrupted", getName());
                        } else {
                            DTLSConnector.m.debug("Worker thread [{}] has been interrupted", getName());
                        }
                    } catch (Exception e) {
                        if (DTLSConnector.this.av.get()) {
                            DTLSConnector.m.debug("Exception thrown by worker thread [{}]", getName(), e);
                        } else {
                            DTLSConnector.m.trace("Exception thrown by worker thread [{}]", getName(), e);
                        }
                    }
                }
                if (DTLSConnector.this.av.get()) {
                    DTLSConnector.m.info("Worker thread [{}] has terminated", getName());
                } else {
                    DTLSConnector.m.debug("Worker thread [{}] has terminated", getName());
                }
            } catch (Throwable th) {
                if (DTLSConnector.this.av.get()) {
                    DTLSConnector.m.info("Worker thread [{}] has terminated", getName());
                } else {
                    DTLSConnector.m.debug("Worker thread [{}] has terminated", getName());
                }
                throw th;
            }
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public void setRawDataReceiver(RawDataChannel rawDataChannel) {
        if (isRunning()) {
            throw new IllegalStateException("message handler cannot be set on running connector");
        }
        this.ak = rawDataChannel;
    }

    @Override // org.eclipse.californium.elements.Connector
    public void setEndpointContextMatcher(EndpointContextMatcher endpointContextMatcher) {
        this.ab = endpointContextMatcher;
    }

    private EndpointContextMatcher g() {
        return this.ab;
    }

    private String c(zxx zxxVar) {
        String string = zxxVar.c().getString(zxu.n);
        return string == null ? this.x : string;
    }

    private void b(aabr aabrVar, Throwable th) {
        b(aabrVar);
        DtlsHealth dtlsHealth = this.f44515b;
        if (dtlsHealth != null) {
            dtlsHealth.receivingRecord(true);
        }
        byte[] bArrD = aabrVar.d();
        Logger logger = f;
        if (logger.isTraceEnabled()) {
            String strA = zzp.a(bArrD, (char) 0, 64);
            ContentType contentTypeG = aabrVar.g();
            int iC = aabrVar.c();
            logger.trace("Discarding received {} record (epoch {}, payload: {}) from peer [{}]: ", contentTypeG, Integer.valueOf(iC), strA, zzp.e(aabrVar.j()), th);
            return;
        }
        if (logger.isDebugEnabled()) {
            String strA2 = zzp.a(bArrD, (char) 0, 16);
            ContentType contentTypeG2 = aabrVar.g();
            int iC2 = aabrVar.c();
            logger.debug("Discarding received {} record (epoch {}, payload: {}) from peer [{}]: {}", contentTypeG2, Integer.valueOf(iC2), strA2, zzp.e(aabrVar.j()), th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(aabr aabrVar) {
        DatagramFilter datagramFilter = this.u;
        if (datagramFilter instanceof DatagramFilterExtended) {
            ((DatagramFilterExtended) datagramFilter).onDrop(aabrVar);
        }
    }

    @Override // org.eclipse.californium.elements.Connector
    public String getProtocol() {
        return "DTLS";
    }

    public String toString() {
        return getProtocol() + Constants.LINK + zzp.c(getAddress());
    }
}
