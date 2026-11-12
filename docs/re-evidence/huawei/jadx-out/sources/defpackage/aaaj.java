package defpackage;

import java.net.DatagramPacket;
import java.net.InetSocketAddress;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.eclipse.californium.scandium.dtls.AlertMessage;
import org.eclipse.californium.scandium.dtls.ContentType;
import org.eclipse.californium.scandium.dtls.DTLSMessage;
import org.eclipse.californium.scandium.dtls.HandshakeMessage;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes20.dex */
public class aaaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f32a = aaex.a((Class<?>) aaaj.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f34c;
    private final List<d> d;
    private final aaak e;
    private boolean f;
    private int g;
    private int h;
    private final int i;
    private int j;
    private boolean k;
    private final List<aabr> l;
    private aabj m;
    private final InetSocketAddress n;
    private final Object o;
    private volatile boolean p;
    private int q;
    private boolean r;
    private volatile boolean s;
    private ScheduledFuture<?> t;
    private boolean u;
    private int v;

    public aaaj(aaak aaakVar, int i, InetSocketAddress inetSocketAddress) {
        if (aaakVar == null) {
            throw new NullPointerException("Session must not be null");
        }
        this.e = aaakVar;
        this.n = inetSocketAddress;
        this.o = zzp.e(inetSocketAddress);
        this.l = new ArrayList();
        this.d = new ArrayList();
        this.r = true;
        this.i = i;
    }

    public void b(int i, DTLSMessage dTLSMessage) {
        if (dTLSMessage == null) {
            throw new NullPointerException("message must not be null!");
        }
        if (dTLSMessage instanceof aaaw) {
            this.f = true;
        }
        this.d.add(new d(i, dTLSMessage, null));
    }

    public int d() {
        return this.d.size();
    }

    public boolean c(DTLSMessage dTLSMessage) {
        Iterator<d> it = this.d.iterator();
        while (it.hasNext()) {
            if (Arrays.equals(dTLSMessage.toByteArray(), it.next().f36c.toByteArray())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: aaaj$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f35c;

        static {
            int[] iArr = new int[ContentType.values().length];
            f35c = iArr;
            try {
                iArr[ContentType.HANDSHAKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35c[ContentType.CHANGE_CIPHER_SPEC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected final void b(d dVar) throws aaay {
        try {
            DTLSMessage dTLSMessage = dVar.f36c;
            int i = AnonymousClass4.f35c[dTLSMessage.getContentType().ordinal()];
            if (i == 1) {
                d(dVar);
                return;
            }
            if (i == 2) {
                m();
                this.l.add(new aabr(dTLSMessage.getContentType(), dVar.e, dTLSMessage, this.e, false, 0));
                f32a.debug("Add CCS message of {} bytes for [{}]", Integer.valueOf(dTLSMessage.size()), this.o);
            } else {
                throw new aaay("Cannot create " + dTLSMessage.getContentType() + " record for flight", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR));
            }
        } catch (GeneralSecurityException e) {
            throw new aaay("Cannot create record", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR), e);
        }
    }

    private void d(d dVar) throws GeneralSecurityException {
        boolean z;
        aaae aaaeVarH;
        HandshakeMessage handshakeMessage = (HandshakeMessage) dVar.f36c;
        int iF = this.j - 13;
        if (dVar.e <= 0 || (aaaeVarH = this.e.h()) == null || aaaeVarH.b()) {
            z = false;
        } else {
            iF -= aaaeVarH.c();
            z = true;
        }
        int i = this.h;
        if (i >= iF) {
            this.f33b = this.j;
        } else {
            this.f33b = (this.j - iF) + i;
            iF = i;
        }
        if (dVar.e > 0) {
            iF -= this.e.d().f();
            if (z) {
                iF--;
            }
        }
        this.f34c = iF;
        int size = handshakeMessage.size();
        if (size <= iF) {
            if (this.u) {
                if (this.m != null) {
                    if (this.g == dVar.e && this.k == z && this.m.size() + size < iF) {
                        this.m.a(handshakeMessage);
                        f32a.debug("Add multi-handshake-message {} message of {} bytes, resulting in {} bytes for [{}]", handshakeMessage.getMessageType(), Integer.valueOf(size), Integer.valueOf(this.m.getMessageLength()), this.o);
                        return;
                    }
                    m();
                }
                if (this.m == null && size < iF) {
                    aabj aabjVar = new aabj();
                    this.m = aabjVar;
                    aabjVar.a(handshakeMessage);
                    this.g = dVar.e;
                    this.k = z;
                    f32a.debug("Start multi-handshake-message with {} message of {} bytes for [{}]", handshakeMessage.getMessageType(), Integer.valueOf(size), this.o);
                    return;
                }
            }
            this.l.add(new aabr(ContentType.HANDSHAKE, dVar.e, handshakeMessage, this.e, z, 0));
            f32a.debug("Add {} message of {} bytes for [{}]", handshakeMessage.getMessageType(), Integer.valueOf(size), this.o);
            return;
        }
        m();
        f32a.debug("Splitting up {} message of {} bytes for [{}] into multiple handshake fragments of max. {} bytes", handshakeMessage.getMessageType(), Integer.valueOf(size), this.o, Integer.valueOf(iF));
        byte[] bArrFragmentToByteArray = handshakeMessage.fragmentToByteArray();
        int messageLength = handshakeMessage.getMessageLength();
        int i2 = iF - 12;
        if (bArrFragmentToByteArray.length != messageLength) {
            throw new IllegalStateException("message length " + messageLength + " differs from message " + bArrFragmentToByteArray.length + "!");
        }
        int messageSeq = handshakeMessage.getMessageSeq();
        int i3 = 0;
        while (i3 < messageLength) {
            int i4 = i3 + i2 > messageLength ? messageLength - i3 : i2;
            byte[] bArr = new byte[i4];
            System.arraycopy(bArrFragmentToByteArray, i3, bArr, 0, i4);
            aaav aaavVar = new aaav(handshakeMessage.getMessageType(), messageLength, messageSeq, i3, bArr);
            f32a.debug("fragment for offset {}, {} bytes", Integer.valueOf(i3), Integer.valueOf(aaavVar.size()));
            i3 += i4;
            this.l.add(new aabr(ContentType.HANDSHAKE, dVar.e, aaavVar, this.e, false, 0));
        }
    }

    private void m() throws GeneralSecurityException {
        if (this.m != null) {
            this.l.add(new aabr(ContentType.HANDSHAKE, this.g, this.m, this.e, this.k, 0));
            int iE = this.m.e();
            Logger logger = f32a;
            int i = this.g;
            int messageLength = this.m.getMessageLength();
            int i2 = this.f34c;
            logger.debug("Add {} multi handshake message, epoch {} of {} bytes (max. {}) for [{}]", Integer.valueOf(iE), Integer.valueOf(i), Integer.valueOf(messageLength), Integer.valueOf(i2), this.o);
            this.m = null;
            this.g = 0;
            this.k = false;
        }
    }

    public List<aabr> a(int i, int i2, boolean z) throws aaay {
        try {
            if (this.j == i && this.h == i2 && this.u == z) {
                for (int i3 = 0; i3 < this.l.size(); i3++) {
                    aabr aabrVar = this.l.get(i3);
                    this.l.set(i3, new aabr(aabrVar.g(), aabrVar.c(), aabrVar.b(), this.e, aabrVar.q(), 0));
                }
            } else {
                this.f33b = i;
                this.j = i;
                this.h = i2;
                this.u = z;
                this.l.clear();
                Iterator<d> it = this.d.iterator();
                while (it.hasNext()) {
                    b(it.next());
                }
                m();
            }
            return this.l;
        } catch (GeneralSecurityException e) {
            this.l.clear();
            throw new aaay("Cannot create record", new AlertMessage(AlertMessage.AlertLevel.FATAL, AlertMessage.AlertDescription.INTERNAL_ERROR), e);
        }
    }

    public List<DatagramPacket> e(int i, int i2, Boolean bool, Boolean bool2, boolean z) throws aaay {
        int iMin = i;
        zzl zzlVar = new zzl(iMin);
        ArrayList arrayList = new ArrayList();
        boolean zEquals = Boolean.TRUE.equals(bool);
        boolean zEquals2 = Boolean.FALSE.equals(bool2);
        if (z) {
            iMin = Math.min(512, iMin);
        }
        Logger logger = f32a;
        logger.trace("Prepare flight {}, using max. datagram size {}, max. fragment size {} [mhm={}, mr={}]", Integer.valueOf(this.i), Integer.valueOf(iMin), Integer.valueOf(i2), Boolean.valueOf(zEquals), Boolean.valueOf(!zEquals2));
        List<aabr> listA = a(iMin, i2, zEquals);
        logger.trace("Effective max. datagram size {}, max. message size {}", Integer.valueOf(this.f33b), Integer.valueOf(this.f34c));
        int i3 = 0;
        while (i3 < listA.size()) {
            aabr aabrVar = listA.get(i3);
            byte[] bArrL = aabrVar.l();
            if (bArrL.length > this.f33b) {
                Logger logger2 = f32a;
                logger2.error("{} record of {} bytes for peer [{}] exceeds max. datagram size [{}], discarding...", aabrVar.g(), Integer.valueOf(bArrL.length), this.o, Integer.valueOf(this.f33b));
                logger2.debug("{}", aabrVar);
            } else {
                Logger logger3 = f32a;
                logger3.trace("Sending record of {} bytes to peer [{}]:\n{}", Integer.valueOf(bArrL.length), this.o, aabrVar);
                if (!zEquals2 && aabrVar.g() == ContentType.CHANGE_CIPHER_SPEC && (i3 = i3 + 1) < listA.size()) {
                    bArrL = zzg.c(bArrL, listA.get(i3).l());
                }
                if (zzlVar.e() > ((zEquals2 || (z && bool2 == null)) ? 0 : this.f33b - bArrL.length)) {
                    byte[] bArrD = zzlVar.d();
                    arrayList.add(new DatagramPacket(bArrD, bArrD.length, this.n.getAddress(), this.n.getPort()));
                    logger3.debug("Sending datagram of {} bytes to peer [{}]", Integer.valueOf(bArrD.length), this.o);
                }
                zzlVar.a(bArrL);
            }
            i3++;
        }
        byte[] bArrD2 = zzlVar.d();
        arrayList.add(new DatagramPacket(bArrD2, bArrD2.length, this.n.getAddress(), this.n.getPort()));
        f32a.debug("Sending datagram of {} bytes to peer [{}]", Integer.valueOf(bArrD2.length), this.o);
        return arrayList;
    }

    public int a() {
        return this.f34c;
    }

    public int c() {
        return this.i;
    }

    public int e() {
        return this.v;
    }

    public void h() {
        this.v++;
    }

    public int b() {
        return this.q;
    }

    public void a(int i) {
        this.q = i;
    }

    public void b(float f, int i) {
        this.q = c(this.q, f, i);
    }

    public boolean i() {
        return this.r;
    }

    public void d(boolean z) {
        this.r = z;
    }

    public boolean j() {
        return this.p;
    }

    public void o() {
        this.p = true;
    }

    private final void l() {
        ScheduledFuture<?> scheduledFuture = this.t;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.t.cancel(true);
            }
            this.t = null;
        }
    }

    public void n() {
        this.s = true;
        l();
    }

    public boolean f() {
        return this.s;
    }

    public boolean g() {
        return this.f;
    }

    public void a(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        if (this.s) {
            return;
        }
        if (i()) {
            l();
            try {
                this.t = scheduledExecutorService.schedule(runnable, this.q, TimeUnit.MILLISECONDS);
                f32a.trace("handshake flight to peer {}, retransmission {} ms.", this.o, Integer.valueOf(this.q));
                return;
            } catch (RejectedExecutionException unused) {
                f32a.trace("handshake flight stopped by shutdown.");
                return;
            }
        }
        f32a.trace("handshake flight to peer {}, no retransmission!", this.o);
    }

    public static int c(int i, float f, int i2) {
        return i < i2 ? Math.min(Math.round(i * f), i2) : i;
    }

    static class d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DTLSMessage f36c;
        private final int e;

        /* synthetic */ d(int i, DTLSMessage dTLSMessage, AnonymousClass4 anonymousClass4) {
            this(i, dTLSMessage);
        }

        private d(int i, DTLSMessage dTLSMessage) {
            this.e = i;
            this.f36c = dTLSMessage;
        }
    }
}
