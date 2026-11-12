package pk2;

import lc.u0;
import ok2.g0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpk2/e0;", "", "<init>", "(Ljava/lang/String;I)V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum e0 {
    PREFERRED,
    STANDARD,
    ALLOWED,
    SILENT;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f138391a;

        static {
            int[] iArr = new int[e0.values().length];
            try {
                iArr[e0.PREFERRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.STANDARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.ALLOWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.SILENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f138391a = iArr;
        }
    }

    public final g0 a() {
        int i14 = a.f138391a[ordinal()];
        if (i14 == 1) {
            return g0.AUTOMATIC_PREFERRED;
        }
        if (i14 == 2) {
            return g0.AUTOMATIC_STANDARD;
        }
        if (i14 == 3) {
            return g0.AUTOMATIC_ALLOWED;
        }
        if (i14 == 4) {
            return g0.UTILITY_SILENT;
        }
        u0.r();
        return null;
    }
}
