package bk;

/* JADX INFO: loaded from: classes7.dex */
public enum l {
    BROADCAST_DATA,
    ACKNOWLEDGED_DATA,
    BURST_TRANSFER_DATA,
    CHANNEL_EVENT,
    CHANNEL_RESPONSE,
    CHANNEL_STATUS,
    CHANNEL_ID,
    ANT_VERSION,
    CAPABILITIES,
    SERIAL_NUMBER,
    OTHER;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18463a;

        static {
            int[] iArr = new int[l.values().length];
            f18463a = iArr;
            try {
                iArr[l.ACKNOWLEDGED_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18463a[l.ANT_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f18463a[l.BROADCAST_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18463a[l.BURST_TRANSFER_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18463a[l.CAPABILITIES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18463a[l.CHANNEL_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18463a[l.CHANNEL_ID.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f18463a[l.CHANNEL_RESPONSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18463a[l.CHANNEL_STATUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18463a[l.SERIAL_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f18463a[l.OTHER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static l a(int i14, byte[] bArr) {
        if (i14 == 62) {
            return ANT_VERSION;
        }
        if (i14 == 64) {
            return 1 == ((int) ak.k.e(1, 1, bArr)) ? CHANNEL_EVENT : CHANNEL_RESPONSE;
        }
        if (i14 == 84) {
            return CAPABILITIES;
        }
        if (i14 == 97) {
            return SERIAL_NUMBER;
        }
        switch (i14) {
            case 78:
                return BROADCAST_DATA;
            case 79:
                return ACKNOWLEDGED_DATA;
            case 80:
                return BURST_TRANSFER_DATA;
            case 81:
                return CHANNEL_ID;
            case 82:
                return CHANNEL_STATUS;
            default:
                return OTHER;
        }
    }

    public final int b() {
        switch (a.f18463a[ordinal()]) {
            case 1:
                return 79;
            case 2:
                return 62;
            case 3:
                return 78;
            case 4:
                return 80;
            case 5:
                return 84;
            case 6:
                return 64;
            case 7:
                return 81;
            case 8:
                return 64;
            case 9:
                return 82;
            case 10:
                return 97;
            case 11:
                vb.h.s("Other message type");
                return 0;
            default:
                return 0;
        }
    }
}
