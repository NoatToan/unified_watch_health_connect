package py2;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy2/d;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-uac-css"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    LIGHT,
    DARK;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141888a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f141888a = iArr;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        int i14 = a.f141888a[ordinal()];
        if (i14 == 1) {
            return "light";
        }
        if (i14 == 2) {
            return "dark";
        }
        u0.r();
        return null;
    }
}
