package jk;

import android.os.RemoteException;
import com.dsi.ant.channel.AntCommandFailedException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class b extends p {
    public static final byte[] H = {68, 5, 0, 0, 0, 0, 0, 0};
    public final t A;
    public boolean B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f98984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f98985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f98986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f98987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f98988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j.h f98989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CountDownLatch f98990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f98991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f98992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f98993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f98994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte[] f98995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ByteArrayOutputStream f98996y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public byte[] f98997z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f98998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f98999b;

        static {
            int[] iArr = new int[bk.l.values().length];
            f98999b = iArr;
            try {
                iArr[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f98999b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f98999b[bk.l.BURST_TRANSFER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f98998a = iArr2;
            try {
                iArr2[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f98998a[ak.e.CHANNEL_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f98998a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f98998a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f98998a[ak.e.TRANSFER_RX_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public b(j.k kVar, t tVar, int i14, int i15, int i16, long j8, long j14, byte[] bArr) {
        super(kVar);
        this.f98989r = j.h.AUTH_IDLE;
        this.f98991t = -1;
        this.f98992u = -1;
        this.f98993v = -1;
        this.f98994w = false;
        this.f98996y = new ByteArrayOutputStream();
        this.B = false;
        this.C = -1;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = 0;
        this.A = tVar;
        this.f98987p = i14;
        this.f98985n = i15;
        this.f98986o = i16;
        this.f98984m = j8;
        this.f98988q = j14;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
        byte[] bArr;
        byte b14;
        try {
            int i14 = a.f98999b[lVar.ordinal()];
            if (i14 == 1) {
                int i15 = a.f98998a[new bk.g(aVar).f18440c.ordinal()];
                if (i15 == 1) {
                    int i16 = qk.b.f145071a;
                    return;
                }
                if (i15 == 2) {
                    int i17 = qk.b.f145071a;
                    this.F = true;
                    x();
                    return;
                } else {
                    if (i15 != 3) {
                        if (i15 == 4) {
                            this.D = false;
                            return;
                        } else {
                            if (i15 != 5) {
                                return;
                            }
                            this.D = false;
                            return;
                        }
                    }
                    this.D = false;
                    this.C = -1;
                    if (this.f98995x != null && !this.B) {
                        this.B = true;
                        return;
                    }
                    return;
                }
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                bk.e eVar = new bk.e(aVar);
                int i18 = eVar.f18409c;
                boolean z14 = i18 == 0;
                ByteArrayOutputStream byteArrayOutputStream = this.f98996y;
                if (z14) {
                    byteArrayOutputStream.reset();
                    this.f98997z = null;
                }
                byteArrayOutputStream.write(eVar.j());
                if ((i18 & 4) > 0) {
                    if (byteArrayOutputStream.size() > 0) {
                        this.f98997z = byteArrayOutputStream.toByteArray();
                    }
                    this.E = false;
                    this.B = true;
                    x();
                    return;
                }
                return;
            }
            byte[] bArr2 = aVar.f60156b;
            byte b15 = bArr2[1];
            if (67 == b15) {
                this.f98993v = bArr2[3];
            }
            if (this.f98991t == -1) {
                if (67 == b15 && 1 == bArr2[3]) {
                    byte b16 = bArr2[4];
                    this.f98991t = b16;
                    if (this.f98985n == 22 && this.f98986o == 18 && b16 == 2) {
                        this.f98991t = 0;
                    }
                    this.f98994w = (bArr2[2] & 8) > 0;
                    this.f98992u = 1;
                    int i19 = qk.b.f145071a;
                    x();
                    return;
                }
                return;
            }
            if (67 == b15 && !this.E) {
                if (3 == bArr2[3]) {
                    this.G++;
                }
                if (this.G > 40) {
                    int i24 = qk.b.f145071a;
                    this.f132442j.b(H);
                    this.G = 0;
                    return;
                }
            }
            if (!this.B) {
                if (67 == b15 && 3 != bArr2[3] && !this.D) {
                    this.C++;
                }
                if (67 == b15 && 2 == bArr2[3]) {
                    this.f98992u = 2;
                    x();
                } else if (67 == b15 && bArr2[3] == 0) {
                    this.f98992u = 0;
                    x();
                } else {
                    int i25 = this.C;
                    if (i25 > 45) {
                        x();
                    } else if (67 == b15 && 1 == bArr2[3] && !this.D && i25 % 3 == 0) {
                        byte[] bArr3 = this.f98995x;
                        if (bArr3.length == 8) {
                            this.D = true;
                            this.f132442j.b(bArr3);
                        } else if (bArr3.length > 8) {
                            this.D = true;
                            this.f132442j.e(bArr3);
                        }
                    }
                }
            }
            if (this.f98992u == -1 && 67 == (b14 = (bArr = aVar.f60156b)[1])) {
                if (67 == b14 && 2 == bArr[3]) {
                    this.f98992u = 2;
                    x();
                } else if (67 == b14 && bArr[3] == 0) {
                    this.f98992u = 0;
                    x();
                }
            }
        } catch (AntCommandFailedException e4) {
            if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                int i26 = qk.b.f145071a;
            } else {
                if (e4.getFailureReason() == wj.c.TRANSFER_FAILED) {
                    this.D = false;
                    return;
                }
                e4.toString();
                int i27 = qk.b.f145071a;
                x();
            }
        } catch (IOException e14) {
            e14.toString();
            int i28 = qk.b.f145071a;
            x();
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x01aa  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ok.e
    public final void c() throws RemoteException {
        long j8;
        int i14;
        long j14;
        byte[] bArr;
        byte[] bytes;
        j.k kVar = this.f99181l;
        try {
            try {
                try {
                    ak.c cVarD = this.f132442j.d();
                    if (cVarD != ak.c.TRACKING && cVarD != ak.c.SEARCHING) {
                        int i15 = qk.b.f145071a;
                        j.h hVar = j.h.NOT_CONNECTED;
                        this.f98989r = hVar;
                        kVar.a(hVar, j.g.CONNECTION_LOST);
                        this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
                        return;
                    }
                    j.h hVar2 = j.h.AUTH_IDLE;
                    this.f98989r = hVar2;
                    kVar.a(hVar2, j.g.LINK_PASS);
                    int i16 = qk.b.f145071a;
                    this.f98991t = -1;
                    this.f98988q = 0L;
                    z(10);
                    kVar.a(this.f98989r, j.g.AUTHENTICATION_START);
                    if (this.F) {
                        j.h hVar3 = j.h.NOT_CONNECTED;
                        this.f98989r = hVar3;
                        kVar.a(hVar3, j.g.CONNECTION_LOST);
                        this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
                        return;
                    }
                    int i17 = this.f98991t;
                    if (i17 == 0) {
                        j.h hVar4 = j.h.AUTH_REQUESTING_PASSTHROUGH;
                        this.f98989r = hVar4;
                        kVar.a(hVar4, j.g.AUTHENTICATE_BEACON_FOUND);
                        v();
                    } else if (i17 == 2) {
                        if (!this.f98994w) {
                            j.h hVar5 = j.h.NOT_CONNECTED;
                            this.f98989r = hVar5;
                            kVar.a(hVar5, j.g.AUTHENTICATE_REJECT_PAIRING);
                            this.f99180k = j.i.FAIL_AUTHENTICATION_REJECTED;
                            return;
                        }
                        j.h hVar6 = j.h.AUTH_WAITING_FOR_PAIRING;
                        this.f98989r = hVar6;
                        kVar.a(hVar6, j.g.AUTHENTICATE_BEACON_FOUND);
                        t();
                    } else {
                        if (i17 != 3) {
                            j.h hVar7 = j.h.NOT_CONNECTED;
                            this.f98989r = hVar7;
                            kVar.a(hVar7, j.g.AUTHENTICATE_FAIL_BAD_RESPONSE);
                            this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                            return;
                        }
                        j.h hVar8 = j.h.AUTH_REQUESTING_SERIAL;
                        this.f98989r = hVar8;
                        kVar.a(hVar8, j.g.AUTHENTICATE_BEACON_FOUND);
                        w();
                    }
                    byte b14 = this.f98995x[2];
                    byte b15 = (byte) 1;
                    t tVar = this.A;
                    if (b14 == b15 && (bArr = this.f98997z) != null && bArr.length >= 16 && 67 == bArr[0] && 68 == bArr[8] && -124 == bArr[9]) {
                        j8 = 0;
                        this.f98988q = ik.a.f(12, bArr);
                        tVar.getClass();
                        try {
                            bytes = "vivoki".getBytes("UTF-8");
                        } catch (UnsupportedEncodingException unused) {
                            int i18 = qk.b.f145071a;
                            bytes = null;
                        }
                        u(new t.a(bytes, 0, 0, 0, 0L).f99227a);
                        byte[] bArr2 = this.f98997z;
                        if (bArr2 != null && bArr2.length >= 16 && 67 == bArr2[0] && 68 == bArr2[8] && -124 == bArr2[9]) {
                            byte b16 = bArr2[10];
                            if (b16 == 2) {
                                j.h hVar9 = j.h.NOT_CONNECTED;
                                this.f98989r = hVar9;
                                kVar.a(hVar9, j.g.AUTHENTICATE_REJECT_BAD_PASSKEY);
                                this.f99180k = j.i.FAIL_AUTHENTICATION_REJECTED;
                                return;
                            }
                            if (b16 != 1) {
                                j.h hVar10 = j.h.NOT_CONNECTED;
                                this.f98989r = hVar10;
                                kVar.a(hVar10, j.g.AUTHENTICATE_FAIL_BAD_RESPONSE);
                                this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                                return;
                            }
                        }
                    } else {
                        j8 = 0;
                    }
                    byte[] bArr3 = this.f98997z;
                    if (bArr3 != 0 && bArr3.length >= 16 && 'C' == bArr3[0] && 'D' == bArr3[8] && -124 == bArr3[9]) {
                        char c14 = bArr3[10];
                        if (c14 != 1) {
                            if (c14 != 2) {
                                j.h hVar11 = j.h.NOT_CONNECTED;
                                this.f98989r = hVar11;
                                kVar.a(hVar11, j.g.AUTHENTICATE_FAIL_BAD_RESPONSE);
                                this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                                return;
                            }
                            j.h hVar12 = j.h.NOT_CONNECTED;
                            this.f98989r = hVar12;
                            if (this.f98995x[2] == ((byte) 2)) {
                                kVar.a(hVar12, j.g.AUTHENTICATE_REJECT_PAIRING);
                            } else {
                                kVar.a(hVar12, j.g.AUTHENTICATE_REJECT);
                            }
                            this.f99180k = j.i.FAIL_AUTHENTICATION_REJECTED;
                            return;
                        }
                        if (this.f98995x[2] == ((byte) 2) && (i14 = bArr3[11]) > 0) {
                            int i19 = (i14 / 8) * 8;
                            int i24 = i19 + 16;
                            if (i14 % 8 != 0) {
                                i24 = i19 + 24;
                            }
                            if (bArr3.length != i24) {
                                j.h hVar13 = j.h.NOT_CONNECTED;
                                this.f98989r = hVar13;
                                kVar.a(hVar13, j.g.AUTHENTICATE_FAIL_BAD_RESPONSE);
                                this.f99180k = j.i.FAIL_OTHER_DEVICE_COMMUNICATION_ERROR;
                                return;
                            }
                            long jF = ik.a.f(12, bArr3);
                            if (jF == j8) {
                                long j15 = this.f98988q;
                                if (j15 != j8) {
                                    j14 = j15;
                                } else {
                                    j14 = jF;
                                }
                            } else {
                                j14 = jF;
                            }
                            byte[] bArr4 = new byte[i14];
                            for (int i25 = 0; i25 < i14; i25++) {
                                bArr4[i25] = this.f98997z[i25 + 16];
                            }
                            tVar.getClass();
                            new t.a(bArr4, this.f98985n, this.f98986o, this.f98987p, j14);
                            int i26 = qk.b.f145071a;
                        }
                    }
                    int i27 = this.f98992u;
                    if (i27 == 2) {
                        j.h hVar14 = j.h.TRANSPORT_IDLE;
                        this.f98989r = hVar14;
                        kVar.a(hVar14, j.g.AUTHENTICATE_PASS);
                        this.f99180k = j.i.SUCCESS;
                        return;
                    }
                    if (i27 == 0) {
                        j.h hVar15 = j.h.NOT_CONNECTED;
                        this.f98989r = hVar15;
                        kVar.a(hVar15, j.g.AUTHENTICATE_REJECT);
                        this.f99180k = j.i.FAIL_AUTHENTICATION_REJECTED;
                        return;
                    }
                    j.h hVar16 = j.h.NOT_CONNECTED;
                    this.f98989r = hVar16;
                    kVar.a(hVar16, j.g.AUTHENTICATE_REJECT);
                    this.f99180k = j.i.FAIL_DEVICE_TRANSMISSION_LOST;
                } catch (InterruptedException unused2) {
                    int i28 = qk.b.f145071a;
                    j.h hVar17 = j.h.NOT_CONNECTED;
                    this.f98989r = hVar17;
                    kVar.a(hVar17, j.g.AUTHENTICATE_FAIL_NO_RESPONSE);
                    this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
                    Thread.currentThread().interrupt();
                }
            } catch (AntCommandFailedException e4) {
                e4.toString();
                int i29 = qk.b.f145071a;
                this.f98989r = j.h.NOT_CONNECTED;
                this.f132442j.release();
                throw new RemoteException();
            }
        } catch (AntCommandFailedException unused3) {
            int i30 = qk.b.f145071a;
            j.h hVar18 = j.h.NOT_CONNECTED;
            this.f98989r = hVar18;
            kVar.a(hVar18, j.g.AUTHENTICATE_REJECT);
            this.f99180k = j.i.FAIL_AUTHENTICATION_REJECTED;
        }
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host Auth Channel Task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return true;
    }

    public final void t() throws InterruptedException {
        for (int i14 = 0; i14 < 10; i14++) {
            byte[] bArr = {68, 4, (byte) 2, 0, 0, 0, 0, 0};
            this.f98995x = bArr;
            ik.a.c(bArr, 4, this.f98984m);
            this.f98992u = -1;
            if (!y()) {
                int i15 = qk.b.f145071a;
                return;
            }
            int i16 = qk.b.f145071a;
            this.E = true;
            z(5);
            int i17 = 0;
            while (this.f98993v == 3 && this.E && !this.F) {
                z(1);
                i17++;
                if (i17 > 120) {
                    int i18 = qk.b.f145071a;
                    return;
                }
            }
            int i19 = this.f98992u;
            boolean z14 = i19 == 2;
            boolean z15 = i19 == 0;
            byte[] bArr2 = this.f98997z;
            if (bArr2 == null || bArr2.length < 16 || this.E) {
                if (this.F) {
                    int i24 = qk.b.f145071a;
                    return;
                }
                int i25 = qk.b.f145071a;
            } else {
                boolean z16 = 67 == bArr2[0] && 68 == bArr2[8] && -124 == bArr2[9];
                boolean z17 = z16 && bArr2[10] == 0;
                boolean z18 = z16 && bArr2[10] != 0;
                if (z16 && 2 == bArr2[10]) {
                    return;
                }
                if (z18 && !z17) {
                    int i26 = qk.b.f145071a;
                    this.f98992u = -1;
                    z(5);
                    int i27 = this.f98992u;
                    z14 = i27 == 2;
                    z15 = i27 == 0;
                }
            }
            if (z14 || z15) {
                return;
            }
        }
    }

    public final void u(byte[] bArr) throws InterruptedException {
        for (int i14 = 0; i14 < 15; i14++) {
            byte[] bArr2 = {68, 4, (byte) 3, (byte) bArr.length, 0, 0, 0, 0};
            ik.a.c(bArr2, 4, this.f98984m);
            byte[] bArr3 = new byte[bArr.length + 8];
            this.f98995x = bArr3;
            System.arraycopy(bArr2, 0, bArr3, 0, 8);
            System.arraycopy(bArr, 0, this.f98995x, 8, bArr.length);
            this.f98992u = -1;
            if (!y()) {
                int i15 = qk.b.f145071a;
                return;
            }
            int i16 = this.f98992u;
            boolean z14 = i16 == 2;
            boolean z15 = i16 == 0;
            byte[] bArr4 = this.f98997z;
            if (bArr4 != null && bArr4.length >= 16) {
                boolean z16 = 67 == bArr4[0] && 68 == bArr4[8] && -124 == bArr4[9];
                boolean z17 = z16 && bArr4[10] == 0;
                boolean z18 = z16 && bArr4[10] != 0;
                if (z16 && 2 == bArr4[10]) {
                    return;
                }
                if (z18 && !z17) {
                    int i17 = qk.b.f145071a;
                    this.f98992u = -1;
                    z(1);
                    int i18 = this.f98992u;
                    z14 = i18 == 2;
                    z15 = i18 == 0;
                }
            } else {
                if (this.F) {
                    int i19 = qk.b.f145071a;
                    return;
                }
                int i24 = qk.b.f145071a;
            }
            if (z14 || z15) {
                return;
            }
        }
    }

    public final void v() throws InterruptedException {
        for (int i14 = 0; i14 < 15; i14++) {
            byte[] bArr = {68, 4, (byte) 0, 0, 0, 0, 0, 0};
            this.f98995x = bArr;
            ik.a.c(bArr, 4, this.f98984m);
            this.f98992u = -1;
            if (!y()) {
                int i15 = qk.b.f145071a;
                return;
            }
            int i16 = qk.b.f145071a;
            z(1);
            int i17 = this.f98992u;
            boolean z14 = i17 == 2;
            boolean z15 = i17 == 0;
            byte[] bArr2 = this.f98997z;
            if (bArr2 != null && bArr2.length >= 16) {
                boolean z16 = 67 == bArr2[0] && 68 == bArr2[8] && -124 == bArr2[9];
                boolean z17 = z16 && bArr2[10] == 0;
                boolean z18 = z16 && bArr2[10] != 0;
                if (z16 && 2 == bArr2[10]) {
                    return;
                }
                if (z18 && !z17) {
                    this.f98992u = -1;
                    z(1);
                    int i18 = this.f98992u;
                    z14 = i18 == 2;
                    z15 = i18 == 0;
                }
            } else if (this.F) {
                return;
            }
            if (z14 || z15) {
                return;
            }
        }
    }

    public final void w() throws InterruptedException {
        this.f98988q = 0L;
        for (int i14 = 0; i14 < 15; i14++) {
            byte[] bArr = {68, 4, (byte) 1, 0, 0, 0, 0, 0};
            this.f98995x = bArr;
            ik.a.c(bArr, 4, this.f98984m);
            if (!y()) {
                int i15 = qk.b.f145071a;
                return;
            }
            int i16 = qk.b.f145071a;
            z(1);
            if (this.F || this.f98996y.size() >= 16) {
                return;
            }
        }
    }

    public final void x() {
        b();
        CountDownLatch countDownLatch = this.f98990s;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0068 A[RETURN] */
    public final boolean y() throws InterruptedException {
        this.B = false;
        if (this.F) {
            int i14 = qk.b.f145071a;
            return false;
        }
        try {
            e();
            byte[] bArr = this.f98995x;
            if (bArr.length == 8) {
                this.D = true;
                this.f132442j.b(bArr);
            } else if (bArr.length > 8) {
                this.D = true;
                this.f132442j.e(bArr);
            }
            int i15 = qk.b.f145071a;
            z(30);
            int i16 = this.f98992u;
            if (i16 == 2 || i16 == 0) {
                this.B = true;
                return false;
            }
            if (i16 == 1) {
                this.B = false;
                return true;
            }
            if (!this.F && this.B) {
                return true;
            }
            return false;
        } catch (AntCommandFailedException e4) {
            if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                int i17 = qk.b.f145071a;
            } else if (e4.getFailureReason() == wj.c.TRANSFER_FAILED) {
                this.D = false;
            } else if (e4.getFailureReason() == wj.c.CANCELLED) {
                return false;
            }
        }
    }

    public final void z(int i14) throws InterruptedException {
        this.f98990s = new CountDownLatch(1);
        e();
        this.f98990s.await(i14, TimeUnit.SECONDS);
    }
}
