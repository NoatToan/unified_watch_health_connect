package wr2;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwr2/r;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f186883a = new r();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186884a;

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
                iArr[is2.b.NXP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[is2.b.FELICA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[is2.b.RABBIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f186884a = iArr;
        }
    }

    private r() {
    }

    public static op2.e a(fs2.a aVar) {
        is2.b bVar = aVar != null ? aVar.f73427b : null;
        switch (bVar == null ? -1 : a.f186884a[bVar.ordinal()]) {
            case -1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return null;
            case 0:
            default:
                u0.r();
                return null;
            case 1:
                if (w3.x.r(aVar)) {
                    return null;
                }
                return new op2.e(aVar);
        }
    }
}
