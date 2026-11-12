package we0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwe0/c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-feedback_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum c {
    REGULAR,
    AT_MOST_ONE;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f184738a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.AT_MOST_ONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f184738a = iArr;
        }
    }
}
