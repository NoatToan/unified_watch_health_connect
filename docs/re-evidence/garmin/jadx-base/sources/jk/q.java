package jk;

import com.dsi.ant.channel.AntCommandFailedException;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class q extends p {
    public static final byte[] D = {68, 5, 0, 0, 0, 0, 0, 0};
    public final ByteArrayOutputStream A;
    public j.EnumC1907j B;
    public boolean C;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f99182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f99183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f99184o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f99185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f99186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j.l f99187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j.k f99188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CountDownLatch f99189t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f99190u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f99191v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f99192w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f99193x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f99194y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f99195z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f99197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f99198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f99199d;

        static {
            int[] iArr = new int[f.values().length];
            f99199d = iArr;
            try {
                iArr[f.FILE_DOES_NOT_EXIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f99199d[f.FILE_IS_NOT_WRITEABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f99199d[f.INVALID_REQUEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f99199d[f.NOT_ENOUGH_SPACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f99199d[f.NOT_READY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f99199d[f.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f99199d[f.UPLOAD_OK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[c.values().length];
            f99198c = iArr2;
            try {
                iArr2[c.CHANNEL_IN_WRONG_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f99198c[c.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f99198c[c.COMMAND_TX_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f99198c[c.FAIL_NO_RESPONSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f99198c[c.SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            int[] iArr3 = new int[bk.l.values().length];
            f99197b = iArr3;
            try {
                iArr3[bk.l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f99197b[bk.l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f99197b[bk.l.BURST_TRANSFER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[ak.e.values().length];
            f99196a = iArr4;
            try {
                iArr4[ak.e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f99196a[ak.e.TRANSFER_RX_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f99196a[ak.e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f99196a[ak.e.RX_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
        }
    }

    public enum c {
        CHANNEL_IN_WRONG_STATE,
        COMMAND_TX_FAIL,
        FAIL_NO_RESPONSE,
        TIMEOUT,
        SUCCESS
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f99208a;

        public d(q qVar, byte[] bArr) {
            this.f99208a = bArr[10] == 0;
            int i14 = qk.b.f145071a;
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f99209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f99210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f99211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f99212d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public short f99213e;

        public e(q qVar, byte[] bArr) {
            int i14 = bArr[10] & UnsignedBytes.MAX_VALUE;
            for (f fVar : f.values()) {
                if (fVar.f99222a == i14) {
                    this.f99209a = fVar;
                    this.f99210b = ik.a.f(12, bArr);
                    this.f99211c = ik.a.f(16, bArr);
                    this.f99212d = ik.a.f(20, bArr);
                    this.f99213e = (short) (ik.a.d(30, bArr) & 65535);
                    Objects.toString(fVar);
                    int i15 = qk.b.f145071a;
                }
            }
            fVar = f.OTHER;
            this.f99209a = fVar;
            this.f99210b = ik.a.f(12, bArr);
            this.f99211c = ik.a.f(16, bArr);
            this.f99212d = ik.a.f(20, bArr);
            this.f99213e = (short) (ik.a.d(30, bArr) & 65535);
            Objects.toString(fVar);
            int i16 = qk.b.f145071a;
        }
    }

    public enum f {
        UPLOAD_OK(0),
        FILE_DOES_NOT_EXIST(1),
        FILE_IS_NOT_WRITEABLE(2),
        NOT_ENOUGH_SPACE(3),
        INVALID_REQUEST(4),
        NOT_READY(5),
        OTHER(-1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99222a;

        f(int i14) {
            this.f99222a = i14;
        }
    }

    public q(j.k kVar, j.l lVar, int i14, long j8, byte[] bArr, int i15, boolean z14) {
        super(kVar);
        this.f99189t = new CountDownLatch(0);
        this.f99193x = -1;
        this.f99194y = null;
        this.f99195z = false;
        this.A = new ByteArrayOutputStream();
        this.B = j.EnumC1907j.FAIL_OTHER;
        this.C = false;
        if (i14 < 0 || i14 > 65535) {
            vb.h.s("Provided file index is out of range.");
            throw null;
        }
        this.f99182m = i14;
        if (j8 < 0) {
            vb.h.s("Can not upload to a negative file offset.");
            throw null;
        }
        this.f99183n = j8;
        this.f99184o = bArr;
        if (i15 <= 0) {
            vb.h.s("Max block size must be larger than 0.");
            throw null;
        }
        this.f99185p = ((i15 + 7) / 8) * 8;
        this.f99186q = z14;
        this.f99188s = kVar;
        this.f99187r = lVar;
    }

    @Override // ok.e
    public final void a(bk.l lVar, dk.a aVar) {
        try {
            int i14 = a.f99197b[lVar.ordinal()];
            if (i14 == 1) {
                int i15 = a.f99196a[new bk.g(aVar).f18440c.ordinal()];
                if (i15 == 1) {
                    b bVar = this.f99194y;
                    if (bVar != null) {
                        int i16 = qk.b.f145071a;
                        bVar.f99200a = c.FAIL_NO_RESPONSE;
                        b();
                        this.f99189t.countDown();
                        return;
                    }
                    return;
                }
                if (i15 == 2) {
                    b bVar2 = this.f99194y;
                    if (bVar2 != null) {
                        int i17 = qk.b.f145071a;
                        bVar2.f99200a = c.FAIL_NO_RESPONSE;
                        b();
                        this.f99189t.countDown();
                        return;
                    }
                    return;
                }
                if (i15 == 3) {
                    this.f99190u = 0;
                    if (this.f99194y != null) {
                        int i18 = qk.b.f145071a;
                        this.f99195z = true;
                        return;
                    }
                    return;
                }
                if (i15 != 4) {
                    return;
                }
                int i19 = this.f99192w;
                this.f99192w = i19 + 1;
                if (i19 == 5) {
                    b bVar3 = this.f99194y;
                    if (bVar3 != null) {
                        int i24 = qk.b.f145071a;
                        bVar3.f99200a = c.TIMEOUT;
                    }
                    this.f132442j.release();
                    this.f99192w = 0;
                    return;
                }
                return;
            }
            if (i14 != 2) {
                if (i14 != 3) {
                    return;
                }
                bk.e eVar = new bk.e(aVar);
                int i25 = eVar.f18409c;
                boolean z14 = i25 == 0;
                ByteArrayOutputStream byteArrayOutputStream = this.A;
                if (z14) {
                    byteArrayOutputStream.reset();
                }
                byteArrayOutputStream.write(eVar.j());
                if (this.f99194y != null && ak.k.d(4, i25) && this.f99195z) {
                    int i26 = qk.b.f145071a;
                    b bVar4 = this.f99194y;
                    bVar4.f99200a = c.SUCCESS;
                    bVar4.f99201b = byteArrayOutputStream.toByteArray();
                    b();
                    this.f99189t.countDown();
                    return;
                }
                return;
            }
            bk.d dVar = new bk.d(aVar);
            if (67 != dVar.j()[0]) {
                return;
            }
            int i27 = dVar.j()[2] & Ascii.SI;
            if (3 == i27) {
                this.f99190u++;
            }
            if (this.f99190u > 15) {
                int i28 = qk.b.f145071a;
                this.C = true;
                try {
                    this.f132442j.b(D);
                } catch (AntCommandFailedException unused) {
                }
                this.f99190u = 0;
                b();
                this.f99189t.countDown();
            }
            if (this.f99193x == -1) {
                if (2 == i27) {
                    int i29 = qk.b.f145071a;
                    this.f99193x = 2;
                    byte b14 = dVar.j()[1];
                    b();
                    this.f99189t.countDown();
                    return;
                }
                return;
            }
            b bVar5 = this.f99194y;
            if (bVar5 == null || !this.f99195z || i27 == 3) {
                return;
            }
            int i30 = this.f99191v;
            this.f99191v = i30 + 1;
            if (i30 == 32) {
                int i34 = qk.b.f145071a;
                bVar5.f99200a = c.FAIL_NO_RESPONSE;
                b();
                this.f99189t.countDown();
                this.f99191v = 0;
            }
        } catch (IOException e4) {
            e4.toString();
            int i35 = qk.b.f145071a;
            b();
            this.f99189t.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v25, types: [int] */
    /* JADX WARN: Type inference failed for: r6v6, types: [jk.s] */
    /* JADX WARN: Type inference failed for: r8v0, types: [jk.s] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // ok.e
    public final void c() {
        long j8;
        long j14;
        j.l lVar;
        int length;
        ?? r14;
        long j15 = this.f99183n;
        byte[] bArr = this.f99184o;
        j.k kVar = this.f99188s;
        try {
            int i14 = qk.b.f145071a;
            int i15 = 2;
            this.f99193x = 2;
            long length2 = ((long) bArr.length) + j15;
            ?? sVar = new s();
            kVar.a(j.h.TRANSPORT_UPLOADING, j.g.UPLOAD_START);
            ?? r15 = 0;
            int i16 = 0;
            ?? r16 = 0;
            short s8 = 0;
            boolean z14 = true;
            while (i16 < 3) {
                if (this.C) {
                    r16 = r16;
                    int i17 = qk.b.f145071a;
                    sVar.f99226a = r15;
                    this.C = r15;
                    r16 = r15;
                    z14 = true;
                }
                r16 = r16;
                boolean z15 = this.f99186q;
                ?? r17 = r15;
                j.l lVar2 = this.f99187r;
                if (z15) {
                    int i18 = qk.b.f145071a;
                    int i19 = this.f99182m;
                    long j16 = z14 ? j15 : 4294967295L;
                    byte[] bArr2 = new byte[16];
                    bArr2[r17 == true ? 1 : 0] = 68;
                    bArr2[1] = 10;
                    ik.a.b(i15, i19, bArr2);
                    ik.a.c(bArr2, 4, length2);
                    j14 = length2;
                    ik.a.c(bArr2, 12, j16);
                    b bVarT = t(bArr2);
                    int i24 = a.f99198c[bVarT.f99200a.ordinal()];
                    if (i24 == 1) {
                        this.B = j.EnumC1907j.FAIL_OTHER;
                        kVar.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
                        return;
                    }
                    if (i24 == 2) {
                        this.B = j.EnumC1907j.FAIL_OTHER;
                        kVar.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
                        return;
                    }
                    if (i24 == 3 || i24 == 4) {
                        j8 = j15;
                        this.B = j.EnumC1907j.FAIL_NO_RESPONSE;
                        i16++;
                        j15 = j8;
                        length2 = j14;
                        i15 = 2;
                        r15 = 0;
                    } else {
                        byte[] bArr3 = bVarT.f99201b;
                        if (-118 == bArr3[9] ? true : r17 == true ? 1 : 0) {
                            e eVar = new e(this, bArr3);
                            switch (a.f99199d[eVar.f99209a.ordinal()]) {
                                case 1:
                                    this.B = j.EnumC1907j.FAIL_REJECTED_FILE_DOES_NOT_EXIST;
                                    kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                    break;
                                case 2:
                                    this.B = j.EnumC1907j.FAIL_REJECTED_FILE_NOT_WRITEABLE;
                                    kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                    break;
                                case 3:
                                    j8 = j15;
                                    this.C = true;
                                    this.B = j.EnumC1907j.FAIL_REJECTED_INVALID_REQUEST;
                                    i16++;
                                    j15 = j8;
                                    length2 = j14;
                                    i15 = 2;
                                    r15 = 0;
                                    break;
                                case 4:
                                    this.B = j.EnumC1907j.FAIL_REJECTED_NOT_ENOUGH_SPACE;
                                    kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                    break;
                                case 5:
                                    j8 = j15;
                                    this.B = j.EnumC1907j.FAIL_REJECTED_NOT_READY;
                                    i16++;
                                    j15 = j8;
                                    length2 = j14;
                                    i15 = 2;
                                    r15 = 0;
                                    break;
                                case 6:
                                    this.B = j.EnumC1907j.FAIL_INVALID_RESPONSE;
                                    kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                    break;
                                default:
                                    lVar = lVar2;
                                    if (eVar.f99211c >= j14) {
                                        long j17 = eVar.f99210b;
                                        if (j17 < j15) {
                                            this.B = j.EnumC1907j.FAIL_REJECTED_OFFSET_OUT_OF_RANGE;
                                            kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                        } else if (j17 <= j14) {
                                            if (z14) {
                                                eVar.f99210b = j15;
                                                eVar.f99213e = r17 == true ? (short) 1 : (short) 0;
                                                j8 = j15;
                                                r14 = r16;
                                            } else {
                                                j8 = j15;
                                                long j18 = (long) r16;
                                                long j19 = j17 - (j8 + j18);
                                                sVar.update(bArr, r16, (int) j19);
                                                if (eVar.f99213e != ((short) sVar.getValue())) {
                                                    this.B = j.EnumC1907j.FAIL_REJECTED_BAD_CRC;
                                                    this.C = true;
                                                    i16++;
                                                    j15 = j8;
                                                    length2 = j14;
                                                    i15 = 2;
                                                    r15 = 0;
                                                } else {
                                                    int i25 = (int) (j18 + j19);
                                                    r14 = i25;
                                                    if (lVar != null) {
                                                        Pattern pattern = tk.k.f165241i;
                                                        r14 = i25;
                                                    }
                                                }
                                            }
                                            long jMin = Math.min(2147483647L, eVar.f99212d);
                                            eVar.f99212d = jMin;
                                            length = Math.min(Math.min((int) jMin, (int) (bArr.length - r14)), this.f99185p);
                                            s8 = eVar.f99213e;
                                            r16 = r14;
                                        } else {
                                            this.B = j.EnumC1907j.FAIL_INVALID_RESPONSE;
                                            this.C = true;
                                        }
                                    } else {
                                        this.B = j.EnumC1907j.FAIL_REJECTED_NOT_ENOUGH_SPACE;
                                        kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                                    }
                                    break;
                            }
                        }
                        this.B = j.EnumC1907j.FAIL_INVALID_RESPONSE;
                        i16++;
                        r15 = r17 == true ? 1 : 0;
                        length2 = j14;
                        i15 = 2;
                    }
                } else {
                    j8 = j15;
                    j14 = length2;
                    lVar = lVar2;
                    length = bArr.length;
                    r16 = 0;
                }
                int i26 = qk.b.f145071a;
                int i27 = ((length + 7) / 8) * 8;
                byte[] bArr4 = new byte[i27 + 16];
                bArr4[0] = 68;
                bArr4[1] = Ascii.FF;
                ik.a.b(2, 65535 & s8, bArr4);
                ik.a.c(bArr4, 4, j8 + ((long) r16));
                System.arraycopy(bArr, r16, bArr4, 8, length);
                ?? sVar2 = new s(s8);
                sVar2.update(bArr, r16, length);
                ik.a.b(i27 + 14, (int) sVar2.getValue(), bArr4);
                b bVarT2 = t(bArr4);
                int i28 = a.f99198c[bVarT2.f99200a.ordinal()];
                if (i28 == 1) {
                    this.B = j.EnumC1907j.FAIL_OTHER;
                    kVar.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
                    return;
                }
                if (i28 == 2) {
                    this.B = j.EnumC1907j.FAIL_OTHER;
                    kVar.a(j.h.NOT_CONNECTED, j.g.CONNECTION_LOST);
                    return;
                }
                if (i28 == 3 || i28 == 4) {
                    this.B = j.EnumC1907j.FAIL_NO_RESPONSE;
                    i16++;
                    qk.a.a(Long.valueOf(((j) ((jk.c) this.f132437e).f132437e).f99073u), qk.a.b.UPLOAD_RETRY);
                } else {
                    byte[] bArr5 = bVarT2.f99201b;
                    if (!(-116 == bArr5[9])) {
                        this.B = j.EnumC1907j.FAIL_INVALID_RESPONSE;
                        try {
                            qk.a.a(Long.valueOf(((j) ((jk.c) this.f132437e).f132437e).f99073u), qk.a.b.UPLOAD_RETRY);
                        } catch (ClassCastException unused) {
                        }
                        i16++;
                    } else if (!new d(this, bArr5).f99208a) {
                        this.B = j.EnumC1907j.FAIL_TOO_MANY_RETRIES;
                        i16++;
                        try {
                            qk.a.a(Long.valueOf(((j) ((jk.c) this.f132437e).f132437e).f99073u), qk.a.b.UPLOAD_RETRY);
                        } catch (ClassCastException unused2) {
                        }
                    } else if (length + r16 == bArr.length) {
                        if (lVar != null) {
                            Pattern pattern2 = tk.k.f165241i;
                        }
                        this.B = j.EnumC1907j.SUCCESS;
                        kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
                        return;
                    }
                }
                i15 = 2;
                r15 = 0;
                z14 = false;
                j15 = j8;
                length2 = j14;
            }
            int i29 = qk.b.f145071a;
            kVar.a(j.h.TRANSPORT_IDLE, j.g.UPLOAD_FINISHED);
        } catch (InterruptedException unused3) {
            int i30 = qk.b.f145071a;
            this.f99180k = j.i.FAIL_EXECUTOR_CANCELLED_TASK;
            this.B = j.EnumC1907j.FAIL_OTHER;
        }
    }

    @Override // ok.e
    public final String f() {
        return "ANT-FS Host Upload Task";
    }

    @Override // jk.p
    public final boolean s(j.h hVar) {
        return hVar == j.h.TRANSPORT_IDLE;
    }

    public final b t(byte[] bArr) throws InterruptedException {
        b bVar = new b(this, null);
        int i14 = qk.b.f145071a;
        this.f99193x = 2;
        bVar.f99200a = c.FAIL_NO_RESPONSE;
        this.f99194y = bVar;
        this.f99195z = false;
        this.f99189t = new CountDownLatch(1);
        e();
        try {
            this.f132442j.e(bArr);
            this.f99189t.await();
            this.f99194y = null;
            return bVar;
        } catch (AntCommandFailedException e4) {
            Objects.toString(e4.getFailureReason());
            b();
            bVar.f99200a = c.COMMAND_TX_FAIL;
            return bVar;
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c f99200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f99201b;

        private b(q qVar) {
        }

        public /* synthetic */ b(q qVar, a aVar) {
            this(qVar);
        }
    }
}
