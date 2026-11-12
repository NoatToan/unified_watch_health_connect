package ok2;

import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lok2/g0;", "", "", "recommendUserVisibility", "<init>", "(Ljava/lang/String;IZ)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g0 {
    IMMEDIATE_MESSAGE(false, 1, null),
    USER_INITIATED_HIGHEST(false, 1, null),
    USER_INITIATED_PREFERRED(false, 1, null),
    USER_INITIATED_GENERAL(false, 1, null),
    AUTOMATIC_PREFERRED(false, 1, null),
    AUTOMATIC_STANDARD(false, 1, null),
    AUTOMATIC_ALLOWED(false),
    UTILITY_SILENT(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f132729a;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f132730a;

        static {
            int[] iArr = new int[g0.values().length];
            try {
                iArr[g0.IMMEDIATE_MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g0.USER_INITIATED_HIGHEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g0.USER_INITIATED_PREFERRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g0.USER_INITIATED_GENERAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g0.AUTOMATIC_PREFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[g0.AUTOMATIC_STANDARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[g0.AUTOMATIC_ALLOWED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[g0.UTILITY_SILENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f132730a = iArr;
        }
    }

    static {
        new a(null);
    }

    /* synthetic */ g0(boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14);
    }

    public final int a() {
        switch (b.f132730a[ordinal()]) {
            case 1:
                return 44;
            case 2:
            case 3:
                return 37;
            case 4:
                return 34;
            case 5:
            case 6:
                return 24;
            case 7:
                return 21;
            case 8:
                return 14;
            default:
                u0.r();
                return 0;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lok2/g0$a;", "", "<init>", "()V", "", "LOW_OFFSET", "I", "MID_OFFSET", "HIGH_OFFSET", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    g0(boolean z14) {
        this.f132729a = z14;
    }
}
