package ch2;

import bs2.q4;
import ch.qos.logback.classic.Logger;
import com.garmin.android.apps.connectmobile.connectiq.z0;
import com.garmin.android.gfdi.framework.PRNGFixes;
import com.garmin.device.datatypes.DeviceProfile;
import dh2.j;
import dh2.k;
import dh2.m;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import ss2.n;

/* JADX INFO: loaded from: classes11.dex */
public class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Logger f27549e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue<b> f27550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f27551b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f27552c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference<h> f27553d;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27555b;

        static {
            int[] iArr = new int[dh2.f.b.values().length];
            f27555b = iArr;
            try {
                iArr[dh2.f.b.CRC_MISMATCH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27555b[dh2.f.b.INVALID_CONNECTION_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27555b[dh2.f.b.OUT_OF_MEMORY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27555b[dh2.f.b.RESEND_FROM_SEQ.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27555b[dh2.f.b.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27555b[dh2.f.b.TRANSFER_NOT_STARTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[dh2.f.a.values().length];
            f27554a = iArr2;
            try {
                iArr2[dh2.f.a.FIRST_PACKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27554a[dh2.f.a.DATA_TRANSMISSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27554a[dh2.f.a.LAST_PACKET.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27554a[dh2.f.a.ACK_REQUEST_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27554a[dh2.f.a.CAPABILITIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27554a[dh2.f.a.ENCRYPTION_KEY.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public enum d {
        PENDING,
        KEY_EXCHANGED,
        INITIATE,
        INITIATED,
        TRANSFERRING,
        TRANSFER_COMPLETE,
        /* JADX INFO: Fake field, exist only in values array */
        COMPLETE
    }

    static {
        int i14 = gt2.c.f79010a;
        f27549e = gt2.b.f79005a.i("CIQ#MonkeybrainsOutboundMessageHandler");
    }

    public f(h hVar) {
        this.f27550a = null;
        ArrayList arrayList = new ArrayList();
        this.f27552c = false;
        this.f27553d = new WeakReference<>(hVar);
        this.f27550a = new ArrayBlockingQueue<>(10);
        arrayList.add(new c(this, null));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).start();
        }
    }

    public final long a() {
        DeviceProfile profile;
        WeakReference<h> weakReference = this.f27553d;
        if (weakReference == null || weakReference.get() == null || (profile = weakReference.get().getRemoteDeviceProxy().getProfile()) == null) {
            return 0L;
        }
        return profile.getF92746j();
    }

    public final void b(int i14, int i15) {
        String str;
        try {
            if (h.f27575i != null) {
                long jA = a();
                z0.b bVar = h.f27575i;
                if (ch2.b.b().d(jA, i14, true)) {
                    ch2.b.C0419b c0419bC = ch2.b.b().c(i14, jA);
                    str = c0419bC == null ? "" : c0419bC.f27520a;
                } else {
                    str = null;
                }
                z0.this.k(i15, str, jA);
            }
        } catch (Exception unused) {
        }
    }

    public final void c(b bVar) {
        try {
            Thread.sleep(100L);
        } catch (InterruptedException unused) {
        }
        synchronized (this.f27551b) {
            try {
                if (this.f27551b.contains(bVar)) {
                    this.f27550a.add(bVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f27566a;

        private c() {
            this.f27566a = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            b bVar;
            b bVar2;
            while (true) {
                f fVar = f.this;
                boolean z14 = fVar.f27552c;
                ArrayBlockingQueue<b> arrayBlockingQueue = fVar.f27550a;
                WeakReference<h> weakReference = fVar.f27553d;
                if (z14) {
                    return;
                }
                try {
                    this.f27566a = arrayBlockingQueue.poll(60000L, TimeUnit.MILLISECONDS);
                } catch (InterruptedException unused) {
                }
                if (fVar.f27552c) {
                    return;
                }
                b bVar3 = this.f27566a;
                if (bVar3 != null && fVar.f27551b.contains(bVar3)) {
                    b bVar4 = this.f27566a;
                    char c14 = 3;
                    if (bVar4.f27560e) {
                        long j8 = bVar4.f27562g + 5000;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        b bVar5 = this.f27566a;
                        if (j8 >= jCurrentTimeMillis) {
                            fVar.c(bVar5);
                            this.f27566a = null;
                            f.f27549e.debug("Waiting for ACK");
                        } else if (bVar5.f27559d == d.INITIATED) {
                            bVar5.f27559d = d.PENDING;
                            fVar.c(bVar5);
                            this.f27566a = null;
                        } else {
                            if (bVar5.f27564i < 3) {
                                dh2.g gVar = new dh2.g();
                                gVar.g(this.f27566a.f27556a);
                                gVar.f59673a[2] = (byte) this.f27566a.f27563h;
                                if (weakReference != null && weakReference.get() != null) {
                                    weakReference.get().g(gVar);
                                }
                                b bVar6 = this.f27566a;
                                bVar6.f27561f = true;
                                bVar6.f27560e = true;
                                bVar6.f27564i++;
                                bVar6.f27562g = System.currentTimeMillis();
                                fVar.c(this.f27566a);
                            }
                            this.f27566a = null;
                        }
                    } else {
                        d dVar = bVar4.f27559d;
                        if (dVar == d.PENDING) {
                            Object[] array = arrayBlockingQueue.toArray();
                            int length = array.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    if (this.f27566a != null) {
                                        PRNGFixes.apply();
                                        byte[] bArrC = new byte[16];
                                        new SecureRandom().nextBytes(bArrC);
                                        ch2.b bVarB = ch2.b.b();
                                        int i15 = this.f27566a.f27556a;
                                        Logger logger = f.f27549e;
                                        ch2.b.C0419b c0419bC = bVarB.c(i15, fVar.a());
                                        if (c0419bC != null) {
                                            c0419bC.f27526g = bArrC;
                                        }
                                        byte[] bArr = this.f27566a.f27557b;
                                        byte[] bArrC2 = n.c(bArr.length, true, bArr, bArrC);
                                        b bVar7 = this.f27566a;
                                        byte[] bArr2 = new byte[bArrC2.length];
                                        bVar7.f27557b = bArr2;
                                        System.arraycopy(bArrC2, 0, bArr2, 0, bArrC2.length);
                                        dh2.h hVar = new dh2.h();
                                        hVar.g(this.f27566a.f27556a);
                                        byte[] bArr3 = hVar.f59673a;
                                        if (weakReference != null && weakReference.get() != null) {
                                            ga2.a aVar = (ga2.a) weakReference.get().getRemoteDeviceProxy().getCapability(ga2.a.class);
                                            byte[] bArr4 = aVar == null ? null : aVar.f76618b;
                                            if (bArr4 != null) {
                                                bArr3[18] = (byte) (bArr3[18] | 1);
                                                bArrC = n.c(16, false, bArrC, bArr4);
                                            }
                                        }
                                        if (bArrC.length == 16) {
                                            System.arraycopy(bArrC, 0, bArr3, 2, 16);
                                        }
                                        if (weakReference != null && weakReference.get() != null) {
                                            weakReference.get().g(hVar);
                                        }
                                        b bVar8 = this.f27566a;
                                        bVar8.f27560e = true;
                                        bVar8.f27562g = System.currentTimeMillis();
                                        b bVar9 = this.f27566a;
                                        bVar9.f27559d = d.KEY_EXCHANGED;
                                        fVar.c(bVar9);
                                        this.f27566a = null;
                                        break;
                                    }
                                    break;
                                }
                                Object obj = array[i14];
                                if ((obj instanceof b) && (bVar = (b) obj) != (bVar2 = this.f27566a) && bVar.f27556a == bVar2.f27556a && bVar.f27559d != d.PENDING) {
                                    fVar.c(bVar2);
                                    this.f27566a = null;
                                    f.f27549e.debug("Waiting for another message to complete transfer.");
                                    break;
                                }
                                i14++;
                            }
                        } else {
                            char c15 = '\b';
                            if (dVar == d.INITIATE) {
                                f.f27549e.debug("Start message");
                                if (this.f27566a != null) {
                                    j jVar = new j();
                                    jVar.g(this.f27566a.f27556a);
                                    long length2 = this.f27566a.f27557b.length;
                                    byte[] bArr5 = jVar.f59673a;
                                    bArr5[3] = (byte) length2;
                                    bArr5[4] = (byte) (length2 >> 8);
                                    bArr5[5] = (byte) (length2 >> 16);
                                    bArr5[6] = (byte) (length2 >> 24);
                                    ch2.b.C0419b c0419bC2 = ch2.b.b().c(this.f27566a.f27556a, fVar.a());
                                    i = (c0419bC2 == null ? null : c0419bC2.f27526g) != null ? 2 : 0;
                                    if (this.f27566a.f27565j) {
                                        i |= 4;
                                    }
                                    bArr5[2] = (byte) i;
                                    if (weakReference != null && weakReference.get() != null) {
                                        weakReference.get().g(jVar);
                                    }
                                    b bVar10 = this.f27566a;
                                    bVar10.f27560e = true;
                                    bVar10.f27562g = System.currentTimeMillis();
                                    b bVar11 = this.f27566a;
                                    bVar11.f27559d = d.INITIATED;
                                    fVar.c(bVar11);
                                    this.f27566a = null;
                                }
                            } else {
                                char c16 = 2;
                                if (dVar == d.INITIATED) {
                                    bVar4.f27560e = true;
                                    fVar.c(bVar4);
                                    this.f27566a = null;
                                } else if (dVar == d.TRANSFERRING) {
                                    f.f27549e.debug("Send chunk");
                                    if (this.f27566a != null) {
                                        ch2.b.C0419b c0419bC3 = ch2.b.b().c(this.f27566a.f27556a, fVar.a());
                                        boolean z15 = c0419bC3 == null ? false : c0419bC3.f27527h;
                                        int i16 = z15 ? 191 : 19;
                                        int i17 = 0;
                                        while (true) {
                                            if (i17 > 14) {
                                                b bVar12 = this.f27566a;
                                                bVar12.f27560e = true;
                                                fVar.c(bVar12);
                                                this.f27566a = null;
                                                break;
                                            }
                                            char c17 = c16;
                                            m mVar = new m(z15);
                                            b bVar13 = this.f27566a;
                                            int i18 = bVar13.f27558c;
                                            char c18 = c14;
                                            int i19 = i18 + i16;
                                            byte[] bArr6 = bVar13.f27557b;
                                            char c19 = c15;
                                            int length3 = i19 > bArr6.length ? bArr6.length - i18 : i16;
                                            if (length3 < 0) {
                                                f.f27549e.error(MessageFormat.format("An unexpected event occurred. Message's currentOffset={0} exceeds its length={1}.", Integer.valueOf(i18), Integer.valueOf(this.f27566a.f27557b.length)));
                                                break;
                                            }
                                            byte[] bArr7 = new byte[length3];
                                            System.arraycopy(bArr6, i18, bArr7, 0, length3);
                                            mVar.i(i17);
                                            mVar.g(this.f27566a.f27556a);
                                            if (length3 > (mVar.f59658b ? 191 : 19)) {
                                                vb.h.s("Payloads size overflow.");
                                                return;
                                            }
                                            System.arraycopy(bArr7, 0, mVar.f59673a, 1, length3);
                                            mVar.f59659c = length3;
                                            if (weakReference != null && weakReference.get() != null) {
                                                weakReference.get().g(mVar);
                                            }
                                            b bVar14 = this.f27566a;
                                            bVar14.f27563h = i17;
                                            bVar14.f27562g = System.currentTimeMillis();
                                            b bVar15 = this.f27566a;
                                            int i24 = bVar15.f27558c + length3;
                                            bVar15.f27558c = i24;
                                            if (i24 >= bVar15.f27557b.length) {
                                                if (i17 != 14) {
                                                    f.f27549e.debug("Sending last packet");
                                                    k kVar = new k();
                                                    kVar.g(this.f27566a.f27556a);
                                                    int i25 = i17 + 1;
                                                    if (i25 > 14) {
                                                        i25 = 0;
                                                    }
                                                    byte[] bArr8 = kVar.f59673a;
                                                    bArr8[c17] = (byte) i25;
                                                    int iA = 0;
                                                    for (byte b14 : this.f27566a.f27557b) {
                                                        iA = q4.a(b14, iA);
                                                    }
                                                    short s8 = (short) iA;
                                                    bArr8[c18] = (byte) s8;
                                                    bArr8[4] = (byte) (s8 >> 8);
                                                    if (weakReference != null && weakReference.get() != null) {
                                                        weakReference.get().g(kVar);
                                                    }
                                                    b bVar16 = this.f27566a;
                                                    bVar16.f27563h = bArr8[c17];
                                                    bVar16.f27560e = true;
                                                    fVar.c(bVar16);
                                                    this.f27566a = null;
                                                    break;
                                                }
                                                bVar15.f27560e = true;
                                                fVar.c(bVar15);
                                                this.f27566a = null;
                                                break;
                                            }
                                            i17++;
                                            c16 = c17;
                                            c14 = c18;
                                            c15 = c19;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }

        public /* synthetic */ c(f fVar, a aVar) {
            this();
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f27556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f27557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f27558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d f27559d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f27560e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f27561f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f27562g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f27563h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f27564i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f27565j;

        private b(f fVar) {
            this.f27557b = null;
            this.f27558c = 0;
            this.f27559d = d.PENDING;
            this.f27560e = false;
            this.f27561f = false;
            this.f27562g = 0L;
            this.f27563h = 0;
            this.f27564i = 0;
            this.f27565j = false;
        }

        public /* synthetic */ b(f fVar, a aVar) {
            this(fVar);
        }
    }
}
