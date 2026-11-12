package py2;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpy2/b;", "", "<init>", "(Ljava/lang/String;I)V", "mobile-uac-css"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum b {
    IMPORTANT;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141883a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.IMPORTANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f141883a = iArr;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        if (a.f141883a[ordinal()] == 1) {
            return "important";
        }
        u0.r();
        return null;
    }
}
