package hq2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhq2/s;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f85278a = new s();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85279a;

        static {
            int[] iArr = new int[is2.b.values().length];
            try {
                iArr[is2.b.PRELOAD_EASYCARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[is2.b.PRELOAD_IPASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f85279a = iArr;
        }
    }

    private s() {
    }

    public static String a(is2.b bVar) {
        bVar.getClass();
        kj0.b.f104940a.getClass();
        String strB = yr2.g.b(kj0.b.a());
        int i14 = a.f85279a[bVar.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? "" : strB.concat("/com.garmin.connect.mobile/garmin-pay/image/image_ipass.png");
        }
        return strB.concat("/com.garmin.connect.mobile/garmin-pay/image/image_easycard.png");
    }
}
