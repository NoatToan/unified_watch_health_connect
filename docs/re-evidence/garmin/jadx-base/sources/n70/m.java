package n70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ln70/m;", "", "Lr53/i;", "Lj70/a;", "dashboardData", "Lo70/f;", "sectionType", "<init>", "(Lr53/i;Lo70/f;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r53.i<j70.a> f124400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o70.f f124401b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f124402a;

        static {
            int[] iArr = new int[o70.b.values().length];
            try {
                iArr[o70.b.LIVE_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.b.ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.b.GOLF_SCORE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.b.WORKOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.b.ECG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.b.HEALTH_SNAPSHOT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.b.EVENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.b.PENDING_ACTIVITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f124402a = iArr;
        }
    }

    public m(r53.i<j70.a> iVar, o70.f fVar) {
        iVar.getClass();
        fVar.getClass();
        this.f124400a = iVar;
        this.f124401b = fVar;
    }
}
