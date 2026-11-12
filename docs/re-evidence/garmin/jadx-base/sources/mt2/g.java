package mt2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmt2/g;", "", "<init>", "(Ljava/lang/String;I)V", "workoutcommon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    FINS,
    KICKBOARD,
    PADDLES,
    PULL_BUOY,
    SNORKEL;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f121033a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.FINS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.KICKBOARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.PADDLES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.PULL_BUOY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.SNORKEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f121033a = iArr;
        }
    }
}
