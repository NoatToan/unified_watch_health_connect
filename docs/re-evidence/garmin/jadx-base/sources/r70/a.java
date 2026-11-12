package r70;

import android.text.format.DateUtils;
import lc.u0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
public interface a extends s {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final C2840a f151035s0 = C2840a.f151036a;

    /* JADX INFO: renamed from: r70.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr70/a$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2840a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ C2840a f151036a = new C2840a();

        private C2840a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f151037a;

        static {
            int[] iArr = new int[o70.b.values().length];
            try {
                iArr[o70.b.LIVE_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.b.WORKOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.b.EVENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.b.ECG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.b.HEALTH_SNAPSHOT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.b.GOLF_SCORE_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.b.ACTIVITY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.b.PENDING_ACTIVITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f151037a = iArr;
        }
    }

    DateTime b();

    String c();

    default int d() {
        switch (b.f151037a[e().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return g22.k.l(b()) ? 1 : 3;
            case 3:
                return g22.k.l(b()) ? 2 : 4;
            case 4:
            case 5:
            case 6:
            case 7:
                return 5;
            case 8:
                DateTime dateTimeB = b();
                dateTimeB.getClass();
                return DateUtils.isToday(dateTimeB.getMillis() + 86400000) ? 4 : 6;
            default:
                u0.r();
                return 0;
        }
    }

    o70.b e();
}
