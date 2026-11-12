package bk;

import c22.t;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b extends ak.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f18402a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18403a;

        static {
            int[] iArr = new int[l.values().length];
            f18403a = iArr;
            try {
                iArr[l.BROADCAST_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18403a[l.ACKNOWLEDGED_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18403a[l.BURST_TRANSFER_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18403a[l.ANT_VERSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18403a[l.CAPABILITIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18403a[l.CHANNEL_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18403a[l.CHANNEL_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18403a[l.CHANNEL_RESPONSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18403a[l.CHANNEL_STATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18403a[l.SERIAL_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18403a[l.OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public b(byte[] bArr) {
        this.f18402a = bArr;
    }

    public static b f(dk.a aVar) {
        if (aVar == null) {
            return null;
        }
        l lVar = l.BROADCAST_DATA;
        l lVarA = l.a(aVar.f60155a, aVar.f60156b);
        byte[] bArr = aVar.f60156b;
        switch (a.f18403a[lVarA.ordinal()]) {
            case 1:
                return new d(bArr);
            case 2:
                return new bk.a(bArr);
            case 3:
                return new e(bArr);
            case 4:
                return new c(bArr);
            case 5:
                return new f(bArr);
            case 6:
                return new g(bArr);
            case 7:
                return new h(bArr);
            case 8:
                return new i(bArr);
            case 9:
                return new j(bArr);
            case 10:
                return new m(bArr);
            default:
                return null;
        }
    }

    public static byte[] g(l lVar, dk.a aVar) {
        l lVar2 = l.BROADCAST_DATA;
        l lVarA = l.a(aVar.f60155a, aVar.f60156b);
        if (lVar == lVarA) {
            return aVar.f60156b;
        }
        t.i("Message data is for incorrect type. Desired=", lVar, ". Actual=", lVarA);
        return null;
    }

    @Override // ak.a
    public final byte[] b() {
        return this.f18402a;
    }

    @Override // ak.a
    public final int d() {
        return h().b();
    }

    public abstract l h();

    public final String i() {
        return h() + "(" + ak.k.a(d()) + ")";
    }

    @Override // ak.a
    public String toString() {
        return i().concat(ak.k.b(b()));
    }
}
