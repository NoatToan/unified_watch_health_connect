package vs1;

import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import r53.z1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lvs1/h0;", "", "Lo53/b0;", "viewModelScope", "Lss1/a;", "trailsRepo", "Lss1/a0;", "reviewsRepo", "Lvs1/h;", "snackbarMessageUseCase", "Lr53/z1;", "Lpt1/a0;", "_userReviewsFlow", "<init>", "(Lo53/b0;Lss1/a;Lss1/a0;Lvs1/h;Lr53/z1;)V", "a", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f179811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ss1.a f179812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ss1.a0 f179813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f179814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z1<pt1.a0> f179815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f12.l f179816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z1 f179817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f179818h;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f179819a;

        static {
            int[] iArr = new int[us1.o.values().length];
            try {
                iArr[us1.o.RECENT_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[us1.o.OLDEST_FIRST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[us1.o.MOST_HELPFUL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[us1.o.ALPHABETICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f179819a = iArr;
        }
    }

    static {
        new a(null);
    }

    public h0(o53.b0 b0Var, ss1.a aVar, ss1.a0 a0Var, h hVar, z1<pt1.a0> z1Var) {
        b0Var.getClass();
        aVar.getClass();
        a0Var.getClass();
        hVar.getClass();
        z1Var.getClass();
        this.f179811a = b0Var;
        this.f179812b = aVar;
        this.f179813c = a0Var;
        this.f179814d = hVar;
        this.f179815e = z1Var;
        f12.l.f68084a.getClass();
        this.f179816f = f12.l.a.a();
        this.f179817g = z1Var;
    }

    public static final i53.c a(h0 h0Var, i53.c cVar, us1.o oVar) {
        h0Var.getClass();
        List listN0 = p13.h0.N0(p13.h0.d1(cVar), new k0());
        int i14 = b.f179819a[oVar.ordinal()];
        if (i14 == 1) {
            listN0 = p13.h0.N0(p13.h0.N0(listN0, new n0()), new o0());
        } else if (i14 == 2) {
            listN0 = p13.h0.N0(p13.h0.N0(listN0, new l0()), new m0());
        } else if (i14 == 3) {
            listN0 = p13.h0.N0(listN0, new p0());
        } else if (i14 != 4) {
            u0.r();
            return null;
        }
        return i53.a.e(listN0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lvs1/h0$a;", "", "<init>", "()V", "", "SORT_ORDER_KEY", "Ljava/lang/String;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
