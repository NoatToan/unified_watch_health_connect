package ve2;

import lc.u0;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f177723b;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.f177704d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.f177705e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.f177706f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.f177709i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e.f177708h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[e.f177711k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[e.f177707g.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[e.f177710j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[e.f177712l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[e.f177713m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[e.f177714n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[e.f177715o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[e.f177716p.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f177722a = iArr;
            int[] iArr2 = new int[zi2.a.values().length];
            try {
                iArr2[zi2.a.PROD.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[zi2.a.CHINA.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[zi2.a.CHINA_TEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[zi2.a.TEST.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[zi2.a.TEST_SSO_CHINA.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[zi2.a.STAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            f177723b = iArr2;
        }
    }

    public static final String a(e eVar) {
        eVar.getClass();
        switch (a.f177722a[eVar.ordinal()]) {
            case 1:
                return "https://account.customer.services.garmin.com/accountProcessServices";
            case 2:
            case 3:
                return "https://account.customer.services.garmin.cn/accountProcessServices";
            case 4:
                return "https://account-stage.customer.services.garmin.com/accountProcessServices";
            case 5:
            case 6:
                return "https://account-test-china.customer.services.garmin.com/accountProcessServices";
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return "https://account-test.customer.services.garmin.com/accountProcessServices";
            default:
                u0.r();
                return null;
        }
    }

    public static final boolean b(e eVar) {
        eVar.getClass();
        return eVar == e.f177705e || eVar == e.f177706f;
    }

    public static final zi2.a c(e eVar) {
        eVar.getClass();
        switch (a.f177722a[eVar.ordinal()]) {
            case 1:
                return zi2.a.PROD;
            case 2:
                return zi2.a.CHINA;
            case 3:
                return zi2.a.CHINA_TEST;
            case 4:
                return zi2.a.STAGE;
            case 5:
                return zi2.a.TEST_SSO_CHINA;
            case 6:
                return zi2.a.PINK;
            case 7:
                return zi2.a.TEST;
            case 8:
                return zi2.a.DEMO;
            case 9:
                return zi2.a.BLUE;
            case 10:
                return zi2.a.RED;
            case 11:
                return zi2.a.AQUA;
            case 12:
                return zi2.a.MANGO;
            case 13:
                return zi2.a.JADE;
            default:
                u0.r();
                return null;
        }
    }

    public static final String d(e eVar) {
        eVar.getClass();
        int i14 = a.f177722a[eVar.ordinal()];
        if (i14 == 1) {
            return "https://diauth.garmin.com";
        }
        if (i14 == 2 || i14 == 3) {
            return "https://diauth.garmin.cn";
        }
        return i14 != 4 ? "https://diauthtest.garmin.com" : c(eVar).f204881b;
    }

    public static final e e(zi2.a aVar) {
        aVar.getClass();
        switch (a.f177723b[aVar.ordinal()]) {
            case 1:
                return e.f177704d;
            case 2:
                return e.f177705e;
            case 3:
                return e.f177706f;
            case 4:
                return e.f177707g;
            case 5:
                return e.f177708h;
            case 6:
                return e.f177709i;
            default:
                return e.f177707g;
        }
    }
}
