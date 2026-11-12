package yr2;

import lc.u0;
import vn2.n0;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f199150a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.FITPAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[is2.b.UNION_PAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[is2.b.FELICA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[is2.b.NXP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[is2.b.RABBIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f199150a = iArr;
        }
    }

    public static final yq2.b a(is2.b bVar) {
        bVar.getClass();
        switch (a.f199150a[bVar.ordinal()]) {
            case 1:
                return new op2.h();
            case 2:
                return new tq2.a();
            case 3:
            case 4:
                return new lq2.g();
            case 5:
                return new n0();
            case 6:
                o2.c.m("Not yet implemented");
                return null;
            case 7:
                return new oq2.g();
            default:
                u0.r();
                return null;
        }
    }
}
