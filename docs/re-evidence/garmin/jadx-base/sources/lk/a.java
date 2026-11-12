package lk;

import ak.e;
import bk.g;
import bk.l;
import pk.b;

/* JADX INFO: loaded from: classes7.dex */
public class a extends b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f113134v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f113135w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f113136x;

    /* JADX INFO: renamed from: lk.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C2164a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f113137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f113138b;

        static {
            int[] iArr = new int[l.values().length];
            f113138b = iArr;
            try {
                iArr[l.CHANNEL_EVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113138b[l.BROADCAST_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113138b[l.ACKNOWLEDGED_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.values().length];
            f113137a = iArr2;
            try {
                iArr2[e.RX_SEARCH_TIMEOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113137a[e.CHANNEL_CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113137a[e.TRANSFER_TX_COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f113137a[e.TRANSFER_TX_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f113137a[e.CHANNEL_COLLISION.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f113137a[e.RX_FAIL.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f113137a[e.RX_FAIL_GO_TO_SEARCH.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a(int i14, int i15, b.InterfaceC2618b interfaceC2618b, fk.a aVar) {
        super(new byte[]{70, -1, -1, (byte) (i15 & 255), -1, 1, (byte) (i14 & 255), 1}, interfaceC2618b, aVar);
        this.f113134v = 0;
        this.f113135w = 0;
        this.f113136x = false;
    }

    @Override // pk.b, ok.e
    public final void a(l lVar, dk.a aVar) {
        b.InterfaceC2618b interfaceC2618b = this.f138175o;
        if (interfaceC2618b != null) {
            interfaceC2618b.a(lVar, aVar);
        }
        int i14 = C2164a.f113138b[lVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2 || i14 == 3) {
                byte[] bArr = this.f138176p;
                byte b14 = bArr[6];
                byte[] bArr2 = aVar.f60156b;
                if (b14 == bArr2[1]) {
                    byte b15 = bArr[3];
                    if (b15 == -1 || b15 == bArr2[2]) {
                        this.f113136x = true;
                        if (this.f138179s) {
                            b();
                            this.f138178r.countDown();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (this.f138179s) {
                    if (this.f113134v > this.f138181u) {
                        u();
                        return;
                    }
                    int i15 = this.f113135w + 1;
                    this.f113135w = i15;
                    if (i15 > 2) {
                        b();
                        this.f138178r.countDown();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        switch (C2164a.f113137a[new g(aVar).f18440c.ordinal()]) {
            case 1:
                gk.a.a();
                break;
            case 2:
                gk.a.a();
                b();
                this.f138178r.countDown();
                break;
            case 3:
                this.f138180t = false;
                this.f138179s = true;
                if (this.f113136x) {
                    b();
                    this.f138178r.countDown();
                }
                if (this.f113134v > this.f138181u) {
                    u();
                }
                break;
            case 4:
                this.f138180t = false;
                u();
                break;
            case 5:
            case 6:
                if (!this.f138179s) {
                    u();
                } else {
                    int i16 = this.f113134v + 1;
                    this.f113134v = i16;
                    if (i16 > this.f138181u) {
                        u();
                    }
                }
                break;
            case 7:
                if (this.f138179s) {
                    this.f113134v = this.f138181u + 1;
                }
                break;
        }
    }

    @Override // pk.b, ok.e
    public final String f() {
        return "Request Data Page";
    }

    @Override // pk.b
    public final void s() {
        int i14 = this.f138177q;
        byte[] bArr = this.f138176p;
        if (i14 == 4) {
            bArr[5] = 4;
            this.f138181u = 3;
        }
        if (i14 == 10) {
            bArr[5] = 8;
            this.f138181u = 7;
        }
        this.f113134v = 0;
        super.s();
    }

    @Override // pk.b
    public final void t(ek.a aVar) {
        if (aVar == ek.a.SUCCESS && !this.f113136x) {
            aVar = ek.a.FAIL_NOT_SUPPORTED;
        }
        super.t(aVar);
    }

    public a(int i14, b.InterfaceC2618b interfaceC2618b, fk.a aVar) {
        this(i14, 255, interfaceC2618b, aVar);
    }
}
