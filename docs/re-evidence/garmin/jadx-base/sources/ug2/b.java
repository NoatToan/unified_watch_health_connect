package ug2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lug2/b;", "", "<init>", "(Ljava/lang/String;I)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum b {
    TINY,
    XSMALL,
    SMALL,
    MEDIUM,
    LARGE,
    XLARGE;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f170696a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.TINY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.XSMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.MEDIUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.LARGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.XLARGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f170696a = iArr;
        }
    }
}
