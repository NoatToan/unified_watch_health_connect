package jk;

import com.dsi.ant.channel.AntCommandFailedException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public class e extends p {
    public static final byte[] J = {68, 5, 0, 0, 0, 0, 0, 0};
    public int A;
    public int B;
    public final s C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final int H;
    public j.f I;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f99015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j.h f99016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j.l f99017o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public byte[] f99018p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CountDownLatch f99019q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f99020r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f99021s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ByteArrayOutputStream f99022t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ByteArrayOutputStream f99023u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f99024v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f99025w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f99026x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f99027y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f99028z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99030b;

        static {
            int[] iArr = new int[bk.l.values().length];
            f99030b = iArr;
            try {
                iArr[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99030b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99030b[bk.l.BURST_TRANSFER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ak.e.values().length];
            f99029a = iArr2;
            try {
                iArr2[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99029a[ak.e.CHANNEL_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99029a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99029a[ak.e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f99029a[ak.e.TRANSFER_RX_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public e(j.k kVar, j.l lVar, int i14, int i15) {
        super(kVar);
        this.f99016n = j.h.TRANSPORT_IDLE;
        this.f99020r = -1;
        this.f99022t = new ByteArrayOutputStream();
        this.f99023u = new ByteArrayOutputStream();
        this.f99024v = false;
        this.f99025w = false;
        this.f99026x = false;
        this.f99027y = 0;
        this.f99028z = 0;
        this.A = 0;
        this.B = 0;
        this.C = new s();
        this.I = j.f.FAIL_OTHER;
        this.f99017o = lVar;
        this.f99015m = i14;
        this.H = i15;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
        try {
            int i14 = a.f99030b[lVar.ordinal()];
            if (i14 == 1) {
                int i15 = a.f99029a[new bk.g(aVar).f18440c.ordinal()];
                if (i15 == 1) {
                    int i16 = qk.b.f145071a;
                    return;
                }
                if (i15 == 2) {
                    int i17 = qk.b.f145071a;
                    this.f99024v = true;
                    b();
                    this.f99019q.countDown();
                    return;
                }
                if (i15 == 3) {
                    this.f99027y = 0;
                    this.f99026x = false;
                    if (this.f99025w) {
                        return;
                    }
                    this.f99025w = true;
                    b();
                    this.f99019q.countDown();
                    return;
                }
                if (i15 == 4) {
                    this.f99026x = false;
                    return;
                } else {
                    if (i15 != 5) {
                        return;
                    }
                    int i18 = qk.b.f145071a;
                    this.f99024v = true;
                    b();
                    this.f99019q.countDown();
                    return;
                }
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                bk.e eVar = new bk.e(aVar);
                int i19 = eVar.f18409c;
                boolean z14 = i19 == 0;
                ByteArrayOutputStream byteArrayOutputStream = this.f99023u;
                if (z14) {
                    byteArrayOutputStream.reset();
                }
                byteArrayOutputStream.write(eVar.j());
                if (byteArrayOutputStream.size() == 24) {
                    this.G = (int) ik.a.f(0, eVar.j());
                    int iF = (int) ik.a.f(4, eVar.j());
                    this.D = iF;
                    this.E = Math.min((iF / 100) + 1, 100);
                }
                if ((i19 & 4) > 0) {
                    this.f99024v = false;
                    b();
                    this.f99019q.countDown();
                    return;
                } else {
                    if (byteArrayOutputStream.size() > 24) {
                        byteArrayOutputStream.size();
                        int i24 = this.F + 1;
                        this.F = i24;
                        if (i24 > this.E) {
                            this.F = 0;
                            if (this.f99017o != null) {
                                Pattern pattern = tk.k.f165241i;
                            }
                            int i25 = qk.b.f145071a;
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            byte[] bArr = aVar.f60156b;
            if (67 == bArr[1]) {
                if (3 == bArr[3]) {
                    this.f99028z++;
                }
                if (this.f99028z > 40) {
                    int i26 = qk.b.f145071a;
                    u();
                    this.f132442j.b(J);
                    this.f99028z = 0;
                    b();
                    this.f99019q.countDown();
                }
            }
            if (this.f99020r == -1) {
                byte[] bArr2 = aVar.f60156b;
                if (67 == bArr2[1] && 2 == bArr2[3]) {
                    int i27 = qk.b.f145071a;
                    this.f99020r = 2;
                    b();
                    this.f99019q.countDown();
                    return;
                }
                return;
            }
            if (!this.f99025w) {
                int i28 = this.f99027y + 1;
                this.f99027y = i28;
                if (i28 > 30) {
                    b();
                    this.f99019q.countDown();
                    return;
                }
                byte[] bArr3 = aVar.f60156b;
                if (67 == bArr3[1] && 2 == bArr3[3] && !this.f99026x && i28 % 3 == 0) {
                    this.f99026x = true;
                    this.F = 0;
                    int i29 = qk.b.f145071a;
                    this.f132442j.e(this.f99021s);
                    return;
                }
                return;
            }
            byte[] bArr4 = aVar.f60156b;
            if (67 == bArr4[1]) {
                if (2 == bArr4[3]) {
                    this.A++;
                }
                byte b14 = bArr4[4];
                if (b14 != 4 && b14 != 5) {
                    if (this.A > 40) {
                        int i30 = qk.b.f145071a;
                        b();
                        this.f99019q.countDown();
                        return;
                    }
                    return;
                }
                if (this.A >= 3) {
                    int i34 = qk.b.f145071a;
                    b();
                    this.f99019q.countDown();
                }
            }
        } catch (AntCommandFailedException e4) {
            if (e4.getFailureReason() == wj.c.TRANSFER_IN_PROGRESS) {
                int i35 = qk.b.f145071a;
                return;
            }
            if (e4.getFailureReason() == wj.c.TRANSFER_FAILED) {
                this.f99026x = false;
                int i36 = qk.b.f145071a;
            } else {
                e4.toString();
                int i37 = qk.b.f145071a;
                b();
                this.f99019q.countDown();
            }
        } catch (IOException e14) {
            e14.toString();
            int i38 = qk.b.f145071a;
            b();
            this.f99019q.countDown();
        }
    }

    @Override // ok.e
    public final void c() {
        ByteArrayOutputStream byteArrayOutputStream = this.f99022t;
        this.f99180k = j.i.FAIL_NOT_SUPPORTED;
        j.h hVar = this.f99016n;
        j.g gVar = j.g.DOWNLOAD_START;
        j.k kVar = this.f99181l;
        kVar.a(hVar, gVar);
        int i14 = this.H;
        byte[] bArr = {68, 9, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, (byte) i14, (byte) (i14 >> 8), (byte) (i14 >> 16), (byte) (i14 >> 24)};
        this.f99021s = bArr;
        ik.a.b(2, this.f99015m, bArr);
        while (true) {
            try {
                try {
                    this.f99020r = 2;
                    ik.a.d(2, this.f99021s);
                    ik.a.f(4, this.f99021s);
                    byte b14 = this.f99021s[9];
                    int i15 = qk.b.f145071a;
                    j.h hVar2 = j.h.TRANSPORT_DOWNLOADING;
                    this.f99016n = hVar2;
                    if (1 == b14) {
                        kVar.a(hVar2, j.g.DOWNLOAD_INITIAL);
                    } else {
                        kVar.a(hVar2, j.g.DOWNLOAD_RESUME);
                    }
                    this.f99025w = false;
                    this.f99027y = 0;
                    this.f99026x = true;
                    this.F = 0;
                    this.f99019q = new CountDownLatch(1);
                    e();
                    try {
                        this.f132442j.e(this.f99021s);
                    } catch (AntCommandFailedException e4) {
                        Objects.toString(e4.getFailureReason());
                        int i16 = qk.b.f145071a;
                    }
                    this.f99019q.await();
                    if (this.f99025w) {
                        this.f99028z = 0;
                        this.A = 0;
                        this.f99023u.reset();
                        this.f99019q = new CountDownLatch(1);
                        e();
                        this.f99019q.await();
                        if (t() || this.B > 50) {
                            break;
                            break;
                        }
                    }
                } catch (InterruptedException unused) {
                    int i17 = qk.b.f145071a;
                    this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
                    this.I = j.f.FAIL_OTHER;
                    Thread.currentThread().interrupt();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    this.f99018p = byteArray;
                    int length = byteArray.length;
                    return;
                }
            } catch (Throwable th3) {
                byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                this.f99018p = byteArray2;
                int length2 = byteArray2.length;
                int i18 = qk.b.f145071a;
                throw th3;
            }
        }
        j.h hVar3 = j.h.TRANSPORT_IDLE;
        this.f99016n = hVar3;
        kVar.a(hVar3, j.g.DOWNLOAD_FINISHED);
        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
        this.f99018p = byteArray3;
        int length3 = byteArray3.length;
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host Download Channel Task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return hVar == j.h.TRANSPORT_IDLE;
    }

    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v6 */
    public final boolean t() {
        boolean z14;
        byte b14;
        byte[] byteArray = this.f99023u.toByteArray();
        if (byteArray.length >= 24) {
            if (67 != byteArray[0] || 68 != byteArray[8] || -119 != byteArray[9]) {
                int i14 = qk.b.f145071a;
                return false;
            }
            byte b15 = byteArray[10];
            if (b15 != 0) {
                if (b15 == 1) {
                    int i15 = qk.b.f145071a;
                    this.I = j.f.FAIL_REJECTED_FILE_DOES_NOT_EXIST;
                    return true;
                }
                if (b15 == 2) {
                    int i16 = qk.b.f145071a;
                    this.I = j.f.FAIL_REJECTED_FILE_NOT_READABLE;
                    return true;
                }
                if (b15 == 3) {
                    int i17 = qk.b.f145071a;
                    this.I = j.f.FAIL_REJECTED_NOT_READY;
                    return true;
                }
                if (b15 == 4) {
                    int i18 = qk.b.f145071a;
                    this.I = j.f.FAIL_REJECTED_INVALID_REQUEST;
                    return true;
                }
                if (b15 != 5) {
                    int i19 = qk.b.f145071a;
                    this.I = j.f.FAIL_INVALID_RESPONSE;
                    return true;
                }
                int i24 = qk.b.f145071a;
                this.I = j.f.FAIL_REJECTED_INCORRECT_CRC;
                u();
                return false;
            }
            this.I = j.f.SUCCESS;
            int iF = (int) ik.a.f(12, byteArray);
            this.G = (int) ik.a.f(16, byteArray);
            this.D = (int) ik.a.f(20, byteArray);
            int i25 = qk.b.f145071a;
            ByteArrayOutputStream byteArrayOutputStream = this.f99022t;
            int size = byteArrayOutputStream.size();
            int i26 = this.G;
            if (i26 <= size) {
                int length = byteArray.length - 24;
                int i27 = this.D;
                if (length > i27) {
                    length = i27;
                }
                if (iF <= 0 || iF >= length) {
                    iF = length;
                }
                if (i26 < size) {
                    iF -= size - i26;
                }
                s sVar = this.C;
                int value = (int) (sVar.getValue() & WebSocketProtocol.PAYLOAD_SHORT_MAX);
                try {
                    sVar.update(byteArray, (size - this.G) + 24, iF);
                    if (this.f99024v) {
                        b14 = 0;
                    } else {
                        boolean z15 = false;
                        try {
                            b14 = z15;
                            if (ik.a.d(byteArray.length - 2, byteArray) != sVar.getValue()) {
                                this.I = j.f.FAIL_REJECTED_INCORRECT_CRC;
                                this.B++;
                                sVar.f99226a = value;
                                return false;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            z14 = z15;
                            e.getMessage();
                            int i28 = qk.b.f145071a;
                            this.I = j.f.FAIL_INVALID_RESPONSE;
                            this.B++;
                            sVar.f99226a = value;
                            return z14;
                        }
                    }
                    byteArrayOutputStream.write(byteArray, (size - this.G) + 24, iF);
                    if (byteArrayOutputStream.size() >= this.D && !this.f99024v) {
                        return true;
                    }
                    ik.a.c(this.f99021s, 4, byteArrayOutputStream.size());
                    byte[] bArr = this.f99021s;
                    bArr[9] = b14;
                    ik.a.b(10, (int) (sVar.getValue() & WebSocketProtocol.PAYLOAD_SHORT_MAX), bArr);
                    return b14;
                } catch (Exception e14) {
                    e = e14;
                    z14 = false;
                }
            }
        }
        return false;
    }

    public final void u() {
        this.C.f99226a = 0;
        this.f99022t.reset();
        ik.a.c(this.f99021s, 4, 0L);
        byte[] bArr = this.f99021s;
        bArr[9] = 1;
        ik.a.b(10, 0, bArr);
    }
}
