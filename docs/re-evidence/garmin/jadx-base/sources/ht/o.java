package ht;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht/o;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum o {
    PAYWALL_OPEN,
    PAYWALL_CLOSE,
    PAYWALL_ERROR,
    PURCHASE_STARTED,
    PURCHASE_CANCELLED,
    PURCHASE_COMPLETED,
    PURCHASE_FAILED;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85502a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.PAYWALL_OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.PAYWALL_CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.PAYWALL_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.PURCHASE_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.PURCHASE_CANCELLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.PURCHASE_COMPLETED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o.PURCHASE_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f85502a = iArr;
        }
    }
}
