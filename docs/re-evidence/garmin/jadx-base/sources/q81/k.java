package q81;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB-\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\r²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lq81/k;", "", "Lj23/l;", "scoreRange", "helpScoreRange", "", "qualifierId", "colorResId", "<init>", "(Ljava/lang/String;ILj23/l;Lj23/l;II)V", "a", "Loi0/b;", "contentDescription", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum k {
    ELITE(new j23.l(95, 100), new j23.l(95, 100), R.string.lbl_hill_score_elite, R.color.gds_data_viz_violet_primary),
    EXPERT(new j23.l(85, 94), new j23.l(85, 94), R.string.lbl_hill_score_expert, R.color.gds_data_viz_purple_primary),
    SKILLED(new j23.l(70, 84), new j23.l(70, 84), R.string.lbl_hill_score_skilled, R.color.gds_data_viz_blue_primary),
    TRAINED(new j23.l(50, 69), new j23.l(50, 69), R.string.lbl_hill_score_trained, R.color.gds_data_viz_green_primary),
    CHALLENGER(new j23.l(25, 49), new j23.l(25, 49), R.string.lbl_hill_score_challenger, R.color.gds_data_viz_orange_primary),
    RECREATIONAL(new j23.l(0, 24), new j23.l(1, 24), R.string.lbl_hill_score_recreational, R.color.gds_data_viz_red_primary);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f143328e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j23.l f143336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f143337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f143338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f143339d;

    k(j23.l lVar, j23.l lVar2, int i14, int i15) {
        this.f143336a = lVar;
        this.f143337b = i14;
        this.f143338c = i15;
        this.f143339d = androidx.core.view.j.d(lVar2.f96796a, lVar2.f96797b, "-");
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq81/k$a;", "", "<init>", "()V", "gcm-performance-scores_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: q81.k$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2698a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f143340a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.ELITE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.EXPERT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[k.SKILLED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[k.TRAINED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[k.CHALLENGER.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[k.RECREATIONAL.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f143340a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static long a(k kVar, p3.m mVar) {
            kVar.getClass();
            x1 x1Var = p3.n.f135158a;
            switch (C2698a.f143340a[kVar.ordinal()]) {
                case 1:
                    mVar.C(1466467254);
                    gl.c.f77766a.getClass();
                    long jP = gl.c.a(mVar).p();
                    mVar.f();
                    return jP;
                case 2:
                    mVar.C(1466469110);
                    gl.c.f77766a.getClass();
                    long j8 = gl.c.a(mVar).j();
                    mVar.f();
                    return j8;
                case 3:
                    mVar.C(1466470996);
                    gl.c.f77766a.getClass();
                    long jB = gl.c.a(mVar).b();
                    mVar.f();
                    return jB;
                case 4:
                    mVar.C(1466472821);
                    gl.c.f77766a.getClass();
                    long jD = gl.c.a(mVar).d();
                    mVar.f();
                    return jD;
                case 5:
                    mVar.C(1466474774);
                    gl.c.f77766a.getClass();
                    long jH = gl.c.a(mVar).h();
                    mVar.f();
                    return jH;
                case 6:
                    mVar.C(1466476819);
                    gl.c.f77766a.getClass();
                    long jL = gl.c.a(mVar).l();
                    mVar.f();
                    return jL;
                default:
                    throw n23.j.m(mVar, 1466465797);
            }
        }

        public static k b(Integer num) {
            for (k kVar : k.values()) {
                j23.l lVar = kVar.f143336a;
                if (num != null && lVar.d(num.intValue())) {
                    return kVar;
                }
            }
            return null;
        }

        private a() {
        }
    }
}
