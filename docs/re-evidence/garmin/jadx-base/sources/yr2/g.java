package yr2;

import gg1.v0;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199141a;

        static {
            int[] iArr = new int[zi2.a.values().length];
            try {
                iArr[zi2.a.TEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zi2.a.PROD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zi2.a.CHINA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[zi2.a.PINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[zi2.a.AQUA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[zi2.a.JADE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[zi2.a.TEST_SSO_CHINA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f199141a = iArr;
        }
    }

    public static final v0 a(zi2.a aVar) {
        switch (a.f199141a[aVar.ordinal()]) {
            case 1:
                return v0.TestServerEnvironment;
            case 2:
                return v0.ProdServerEnvironment;
            case 3:
                return v0.ChinaServerEnvironment;
            case 4:
                return v0.PinkServerEnvironment;
            case 5:
                return v0.AquaServerEnvironment;
            case 6:
                return v0.JadeServerEnvironment;
            case 7:
                return v0.TestSSOChinaServerEnvironment;
            default:
                o2.c.m("Developers, please add it when needed");
                return null;
        }
    }

    public static final String b(zi2.a aVar) {
        aVar.getClass();
        return a(aVar).h();
    }
}
