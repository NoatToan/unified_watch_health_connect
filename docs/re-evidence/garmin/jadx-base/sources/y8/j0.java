package y8;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.time.Instant;
import java.time.ZoneOffset;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001<BÁ\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\b\b\u0002\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;¨\u0006="}, d2 = {"Ly8/j0;", "Ly8/d0;", "Ljava/time/Instant;", "startTime", "Ljava/time/ZoneOffset;", "startZoneOffset", "endTime", "endZoneOffset", "Lz8/c;", TtmlNode.TAG_METADATA, "Lc9/d;", "biotin", "caffeine", "calcium", "Lc9/b;", "energy", "energyFromFat", "chloride", "cholesterol", "chromium", "copper", "dietaryFiber", "folate", "folicAcid", "iodine", "iron", "magnesium", "manganese", "molybdenum", "monounsaturatedFat", "niacin", "pantothenicAcid", "phosphorus", "polyunsaturatedFat", "potassium", "protein", "riboflavin", "saturatedFat", "selenium", "sodium", "sugar", "thiamin", "totalCarbohydrate", "totalFat", "transFat", "unsaturatedFat", "vitaminA", "vitaminB12", "vitaminB6", "vitaminC", "vitaminD", "vitaminE", "vitaminK", "zinc", "", "name", "", "mealType", "<init>", "(Ljava/time/Instant;Ljava/time/ZoneOffset;Ljava/time/Instant;Ljava/time/ZoneOffset;Lz8/c;Lc9/d;Lc9/d;Lc9/d;Lc9/b;Lc9/b;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Lc9/d;Ljava/lang/String;I)V", "q0", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j0 implements y8.d0 {
    public static final c9.d X;
    public static final c9.d Y;
    public static final c9.d Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final c9.b f194833a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final c9.b f194834b0;
    public final c9.d A;
    public final c9.d B;
    public final c9.d C;
    public final c9.d D;
    public final c9.d E;
    public final c9.d F;
    public final c9.d G;
    public final c9.d H;
    public final c9.d I;
    public final c9.d J;
    public final c9.d K;
    public final c9.d L;
    public final c9.d M;
    public final c9.d N;
    public final c9.d O;
    public final c9.d P;
    public final c9.d Q;
    public final c9.d R;
    public final c9.d S;
    public final c9.d T;
    public final c9.d U;
    public final String V;
    public final int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f194835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f194836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f194837c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f194838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z8.c f194839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c9.d f194840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c9.d f194841g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c9.d f194842h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c9.b f194843i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c9.b f194844j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c9.d f194845k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c9.d f194846l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c9.d f194847m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c9.d f194848n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c9.d f194849o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c9.d f194850p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c9.d f194851q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c9.d f194852r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c9.d f194853s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c9.d f194854t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c9.d f194855u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c9.d f194856v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c9.d f194857w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c9.d f194858x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c9.d f194859y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c9.d f194860z;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public a(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public a0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public b(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public b0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public c(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public c0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public d(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class d0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public d0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class e extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public e(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class e0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public e0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class f extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public f(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class f0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public f0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class g extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public g(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class g0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public g0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class h extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public h(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class h0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public h0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class i extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.b> {
        public i(Object obj) {
            super(1, obj, c9.b.a.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0);
        }

        @Override // e23.l
        public final c9.b invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.b.a) this.receiver).getClass();
            return c9.b.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class i0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public i0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class j extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.b> {
        public j(Object obj) {
            super(1, obj, c9.b.a.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0);
        }

        @Override // e23.l
        public final c9.b invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.b.a) this.receiver).getClass();
            return c9.b.a.a(dDoubleValue);
        }
    }

    /* JADX INFO: renamed from: y8.j0$j0, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class C3628j0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public C3628j0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class k extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public k(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class k0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public k0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class l extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public l(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class l0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public l0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class m extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public m(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class m0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public m0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class n extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public n(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class n0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public n0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class o extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public o(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class o0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public o0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class p extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public p(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class p0 extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public p0(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class q extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public q(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class r extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public r(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class s extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public s(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class t extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public t(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class u extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public u(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class v extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public v(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class w extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public w(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class x extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public x(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class y extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public y(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class z extends p005kotlin.jvm.internal.q implements e23.l<Double, c9.d> {
        public z(Object obj) {
            super(1, obj, c9.d.a.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0);
        }

        @Override // e23.l
        public final c9.d invoke(Double d14) {
            double dDoubleValue = d14.doubleValue();
            ((c9.d.a) this.receiver).getClass();
            return c9.d.a.a(dDoubleValue);
        }
    }

    static {
        new q0(null);
        double d14 = 0;
        c9.d.a aVar = c9.d.f25972c;
        aVar.getClass();
        X = c9.d.a.a(d14);
        aVar.getClass();
        Y = c9.d.a.a(100);
        aVar.getClass();
        Z = c9.d.a.a(100000);
        c9.b.a aVar2 = c9.b.f25946c;
        aVar2.getClass();
        c9.b.EnumC0384b.a aVar3 = c9.b.EnumC0384b.f25950a;
        f194833a0 = new c9.b(d14, aVar3, null);
        aVar2.getClass();
        f194834b0 = new c9.b(100000000, aVar3, null);
        l8.a.b bVar = l8.a.f111475a;
        l8.a.EnumC2129a enumC2129a = l8.a.EnumC2129a.TOTAL;
        a aVar4 = new a(aVar);
        bVar.getClass();
        l8.a.b.b("Nutrition", enumC2129a, "biotin", aVar4);
        l8.a.b.b("Nutrition", enumC2129a, "caffeine", new b(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "calcium", new c(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "calories", new j(aVar2));
        l8.a.b.b("Nutrition", enumC2129a, "caloriesFromFat", new i(aVar2));
        l8.a.b.b("Nutrition", enumC2129a, "chloride", new d(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "cholesterol", new e(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "chromium", new f(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "copper", new g(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "dietaryFiber", new h(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "folate", new k(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "folicAcid", new l(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "iodine", new m(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "iron", new n(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "magnesium", new o(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "manganese", new p(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "molybdenum", new q(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "monounsaturatedFat", new r(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "niacin", new s(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "pantothenicAcid", new t(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "phosphorus", new u(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "polyunsaturatedFat", new v(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "potassium", new w(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "protein", new x(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "riboflavin", new y(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "saturatedFat", new z(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "selenium", new a0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "sodium", new b0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "sugar", new c0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "thiamin", new d0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "totalCarbohydrate", new e0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "totalFat", new f0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "transFat", new g0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "unsaturatedFat", new h0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminA", new i0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminB12", new C3628j0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminB6", new k0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminC", new l0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminD", new m0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminE", new n0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "vitaminK", new o0(aVar));
        l8.a.b.b("Nutrition", enumC2129a, "zinc", new p0(aVar));
    }

    public j0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, c9.d dVar, c9.d dVar2, c9.d dVar3, c9.b bVar, c9.b bVar2, c9.d dVar4, c9.d dVar5, c9.d dVar6, c9.d dVar7, c9.d dVar8, c9.d dVar9, c9.d dVar10, c9.d dVar11, c9.d dVar12, c9.d dVar13, c9.d dVar14, c9.d dVar15, c9.d dVar16, c9.d dVar17, c9.d dVar18, c9.d dVar19, c9.d dVar20, c9.d dVar21, c9.d dVar22, c9.d dVar23, c9.d dVar24, c9.d dVar25, c9.d dVar26, c9.d dVar27, c9.d dVar28, c9.d dVar29, c9.d dVar30, c9.d dVar31, c9.d dVar32, c9.d dVar33, c9.d dVar34, c9.d dVar35, c9.d dVar36, c9.d dVar37, c9.d dVar38, c9.d dVar39, c9.d dVar40, String str, int i14) {
        instant.getClass();
        instant2.getClass();
        cVar.getClass();
        this.f194835a = instant;
        this.f194836b = zoneOffset;
        this.f194837c = instant2;
        this.f194838d = zoneOffset2;
        this.f194839e = cVar;
        this.f194840f = dVar;
        this.f194841g = dVar2;
        this.f194842h = dVar3;
        this.f194843i = bVar;
        this.f194844j = bVar2;
        this.f194845k = dVar4;
        this.f194846l = dVar5;
        this.f194847m = dVar6;
        this.f194848n = dVar7;
        this.f194849o = dVar8;
        this.f194850p = dVar9;
        this.f194851q = dVar10;
        this.f194852r = dVar11;
        this.f194853s = dVar12;
        this.f194854t = dVar13;
        this.f194855u = dVar14;
        this.f194856v = dVar15;
        this.f194857w = dVar16;
        this.f194858x = dVar17;
        this.f194859y = dVar18;
        this.f194860z = dVar19;
        this.A = dVar20;
        this.B = dVar21;
        this.C = dVar22;
        this.D = dVar23;
        this.E = dVar24;
        this.F = dVar25;
        this.G = dVar26;
        this.H = dVar27;
        this.I = dVar28;
        this.J = dVar29;
        this.K = dVar30;
        this.L = dVar31;
        this.M = dVar32;
        this.N = dVar33;
        this.O = dVar34;
        this.P = dVar35;
        this.Q = dVar36;
        this.R = dVar37;
        this.S = dVar38;
        this.T = dVar39;
        this.U = dVar40;
        this.V = str;
        this.W = i14;
        if (!this.f194835a.isBefore(this.f194837c)) {
            vb.h.s("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            t8.k.b(this);
            return;
        }
        c9.d dVar41 = this.f194840f;
        c9.d dVar42 = Y;
        c9.d dVar43 = X;
        if (dVar41 != null) {
            b1.b(dVar41, dVar43, dVar42, "biotin");
        }
        c9.d dVar44 = this.f194841g;
        if (dVar44 != null) {
            b1.b(dVar44, dVar43, dVar42, "caffeine");
        }
        c9.d dVar45 = this.f194842h;
        if (dVar45 != null) {
            b1.b(dVar45, dVar43, dVar42, "calcium");
        }
        c9.b bVar3 = this.f194843i;
        c9.b bVar4 = f194834b0;
        c9.b bVar5 = f194833a0;
        if (bVar3 != null) {
            b1.b(bVar3, bVar5, bVar4, "energy");
        }
        c9.b bVar6 = this.f194844j;
        if (bVar6 != null) {
            b1.b(bVar6, bVar5, bVar4, "energyFromFat");
        }
        c9.d dVar46 = this.f194845k;
        if (dVar46 != null) {
            b1.b(dVar46, dVar43, dVar42, "chloride");
        }
        c9.d dVar47 = this.f194846l;
        if (dVar47 != null) {
            b1.b(dVar47, dVar43, dVar42, "cholesterol");
        }
        c9.d dVar48 = this.f194847m;
        if (dVar48 != null) {
            b1.b(dVar48, dVar43, dVar42, "chromium");
        }
        c9.d dVar49 = this.f194848n;
        if (dVar49 != null) {
            b1.b(dVar49, dVar43, dVar42, "copper");
        }
        c9.d dVar50 = this.f194849o;
        c9.d dVar51 = Z;
        if (dVar50 != null) {
            b1.b(dVar50, dVar43, dVar51, "dietaryFiber");
        }
        c9.d dVar52 = this.f194850p;
        if (dVar52 != null) {
            b1.b(dVar52, dVar43, dVar42, "chloride");
        }
        c9.d dVar53 = this.f194851q;
        if (dVar53 != null) {
            b1.b(dVar53, dVar43, dVar42, "folicAcid");
        }
        c9.d dVar54 = this.f194852r;
        if (dVar54 != null) {
            b1.b(dVar54, dVar43, dVar42, "iodine");
        }
        c9.d dVar55 = this.f194853s;
        if (dVar55 != null) {
            b1.b(dVar55, dVar43, dVar42, "iron");
        }
        c9.d dVar56 = this.f194854t;
        if (dVar56 != null) {
            b1.b(dVar56, dVar43, dVar42, "magnesium");
        }
        c9.d dVar57 = this.f194855u;
        if (dVar57 != null) {
            b1.b(dVar57, dVar43, dVar42, "manganese");
        }
        c9.d dVar58 = this.f194856v;
        if (dVar58 != null) {
            b1.b(dVar58, dVar43, dVar42, "molybdenum");
        }
        c9.d dVar59 = this.f194857w;
        if (dVar59 != null) {
            b1.b(dVar59, dVar43, dVar51, "monounsaturatedFat");
        }
        if (dVar17 != null) {
            b1.b(dVar17, dVar43, dVar42, "niacin");
        }
        if (dVar18 != null) {
            b1.b(dVar18, dVar43, dVar42, "pantothenicAcid");
        }
        if (dVar19 != null) {
            b1.b(dVar19, dVar43, dVar42, "phosphorus");
        }
        if (dVar20 != null) {
            b1.b(dVar20, dVar43, dVar51, "polyunsaturatedFat");
        }
        if (dVar21 != null) {
            b1.b(dVar21, dVar43, dVar42, "potassium");
        }
        if (dVar22 != null) {
            b1.b(dVar22, dVar43, dVar51, "protein");
        }
        if (dVar23 != null) {
            b1.b(dVar23, dVar43, dVar42, "riboflavin");
        }
        if (dVar24 != null) {
            b1.b(dVar24, dVar43, dVar51, "saturatedFat");
        }
        if (dVar25 != null) {
            b1.b(dVar25, dVar43, dVar42, "selenium");
        }
        if (dVar26 != null) {
            b1.b(dVar26, dVar43, dVar42, "sodium");
        }
        if (dVar27 != null) {
            b1.b(dVar27, dVar43, dVar51, "sugar");
        }
        if (dVar28 != null) {
            b1.b(dVar28, dVar43, dVar42, "thiamin");
        }
        if (dVar29 != null) {
            b1.b(dVar29, dVar43, dVar51, "totalCarbohydrate");
        }
        if (dVar30 != null) {
            b1.b(dVar30, dVar43, dVar51, "totalFat");
        }
        if (dVar31 != null) {
            b1.b(dVar31, dVar43, dVar51, "transFat");
        }
        if (dVar32 != null) {
            b1.b(dVar32, dVar43, dVar51, "unsaturatedFat");
        }
        if (dVar33 != null) {
            b1.b(dVar33, dVar43, dVar42, "vitaminA");
        }
        if (dVar34 != null) {
            b1.b(dVar34, dVar43, dVar42, "vitaminB12");
        }
        if (dVar35 != null) {
            b1.b(dVar35, dVar43, dVar42, "vitaminB6");
        }
        if (dVar36 != null) {
            b1.b(dVar36, dVar43, dVar42, "vitaminC");
        }
        if (dVar37 != null) {
            b1.b(dVar37, dVar43, dVar42, "vitaminD");
        }
        if (dVar38 != null) {
            b1.b(dVar38, dVar43, dVar42, "vitaminE");
        }
        if (dVar39 != null) {
            b1.b(dVar39, dVar43, dVar42, "vitaminK");
        }
        if (dVar40 != null) {
            b1.b(dVar40, dVar43, dVar42, "zinc");
        }
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: a, reason: from getter */
    public final ZoneOffset getF195067d() {
        return this.f194838d;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: c, reason: from getter */
    public final ZoneOffset getF195065b() {
        return this.f194836b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return p005kotlin.jvm.internal.s.g(this.f194840f, j0Var.f194840f) && p005kotlin.jvm.internal.s.g(this.f194841g, j0Var.f194841g) && p005kotlin.jvm.internal.s.g(this.f194842h, j0Var.f194842h) && p005kotlin.jvm.internal.s.g(this.f194843i, j0Var.f194843i) && p005kotlin.jvm.internal.s.g(this.f194844j, j0Var.f194844j) && p005kotlin.jvm.internal.s.g(this.f194845k, j0Var.f194845k) && p005kotlin.jvm.internal.s.g(this.f194846l, j0Var.f194846l) && p005kotlin.jvm.internal.s.g(this.f194847m, j0Var.f194847m) && p005kotlin.jvm.internal.s.g(this.f194848n, j0Var.f194848n) && p005kotlin.jvm.internal.s.g(this.f194849o, j0Var.f194849o) && p005kotlin.jvm.internal.s.g(this.f194850p, j0Var.f194850p) && p005kotlin.jvm.internal.s.g(this.f194851q, j0Var.f194851q) && p005kotlin.jvm.internal.s.g(this.f194852r, j0Var.f194852r) && p005kotlin.jvm.internal.s.g(this.f194853s, j0Var.f194853s) && p005kotlin.jvm.internal.s.g(this.f194854t, j0Var.f194854t) && p005kotlin.jvm.internal.s.g(this.f194855u, j0Var.f194855u) && p005kotlin.jvm.internal.s.g(this.f194856v, j0Var.f194856v) && p005kotlin.jvm.internal.s.g(this.f194857w, j0Var.f194857w) && p005kotlin.jvm.internal.s.g(this.f194858x, j0Var.f194858x) && p005kotlin.jvm.internal.s.g(this.f194859y, j0Var.f194859y) && p005kotlin.jvm.internal.s.g(this.f194860z, j0Var.f194860z) && p005kotlin.jvm.internal.s.g(this.A, j0Var.A) && p005kotlin.jvm.internal.s.g(this.B, j0Var.B) && p005kotlin.jvm.internal.s.g(this.C, j0Var.C) && p005kotlin.jvm.internal.s.g(this.D, j0Var.D) && p005kotlin.jvm.internal.s.g(this.E, j0Var.E) && p005kotlin.jvm.internal.s.g(this.F, j0Var.F) && p005kotlin.jvm.internal.s.g(this.G, j0Var.G) && p005kotlin.jvm.internal.s.g(this.H, j0Var.H) && p005kotlin.jvm.internal.s.g(this.I, j0Var.I) && p005kotlin.jvm.internal.s.g(this.J, j0Var.J) && p005kotlin.jvm.internal.s.g(this.K, j0Var.K) && p005kotlin.jvm.internal.s.g(this.L, j0Var.L) && p005kotlin.jvm.internal.s.g(this.M, j0Var.M) && p005kotlin.jvm.internal.s.g(this.N, j0Var.N) && p005kotlin.jvm.internal.s.g(this.O, j0Var.O) && p005kotlin.jvm.internal.s.g(this.P, j0Var.P) && p005kotlin.jvm.internal.s.g(this.Q, j0Var.Q) && p005kotlin.jvm.internal.s.g(this.R, j0Var.R) && p005kotlin.jvm.internal.s.g(this.S, j0Var.S) && p005kotlin.jvm.internal.s.g(this.T, j0Var.T) && p005kotlin.jvm.internal.s.g(this.U, j0Var.U) && p005kotlin.jvm.internal.s.g(this.V, j0Var.V) && this.W == j0Var.W && p005kotlin.jvm.internal.s.g(this.f194835a, j0Var.f194835a) && p005kotlin.jvm.internal.s.g(this.f194836b, j0Var.f194836b) && p005kotlin.jvm.internal.s.g(this.f194837c, j0Var.f194837c) && p005kotlin.jvm.internal.s.g(this.f194838d, j0Var.f194838d) && p005kotlin.jvm.internal.s.g(this.f194839e, j0Var.f194839e);
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getEndTime, reason: from getter */
    public final Instant getF195066c() {
        return this.f194837c;
    }

    @Override // y8.q0
    /* JADX INFO: renamed from: getMetadata, reason: from getter */
    public final z8.c getF195076d() {
        return this.f194839e;
    }

    @Override // y8.d0
    /* JADX INFO: renamed from: getStartTime, reason: from getter */
    public final Instant getF195064a() {
        return this.f194835a;
    }

    public final int hashCode() {
        c9.d dVar = this.f194840f;
        int iHashCode = (dVar != null ? dVar.hashCode() : 0) * 31;
        c9.d dVar2 = this.f194841g;
        int iHashCode2 = (iHashCode + (dVar2 != null ? dVar2.hashCode() : 0)) * 31;
        c9.d dVar3 = this.f194842h;
        int iHashCode3 = (iHashCode2 + (dVar3 != null ? dVar3.hashCode() : 0)) * 31;
        c9.b bVar = this.f194843i;
        int iHashCode4 = (iHashCode3 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        c9.b bVar2 = this.f194844j;
        int iHashCode5 = (iHashCode4 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31;
        c9.d dVar4 = this.f194845k;
        int iHashCode6 = (iHashCode5 + (dVar4 != null ? dVar4.hashCode() : 0)) * 31;
        c9.d dVar5 = this.f194846l;
        int iHashCode7 = (iHashCode6 + (dVar5 != null ? dVar5.hashCode() : 0)) * 31;
        c9.d dVar6 = this.f194847m;
        int iHashCode8 = (iHashCode7 + (dVar6 != null ? dVar6.hashCode() : 0)) * 31;
        c9.d dVar7 = this.f194848n;
        int iHashCode9 = (iHashCode8 + (dVar7 != null ? dVar7.hashCode() : 0)) * 31;
        c9.d dVar8 = this.f194849o;
        int iHashCode10 = (iHashCode9 + (dVar8 != null ? dVar8.hashCode() : 0)) * 31;
        c9.d dVar9 = this.f194850p;
        int iHashCode11 = (iHashCode10 + (dVar9 != null ? dVar9.hashCode() : 0)) * 31;
        c9.d dVar10 = this.f194851q;
        int iHashCode12 = (iHashCode11 + (dVar10 != null ? dVar10.hashCode() : 0)) * 31;
        c9.d dVar11 = this.f194852r;
        int iHashCode13 = (iHashCode12 + (dVar11 != null ? dVar11.hashCode() : 0)) * 31;
        c9.d dVar12 = this.f194853s;
        int iHashCode14 = (iHashCode13 + (dVar12 != null ? dVar12.hashCode() : 0)) * 31;
        c9.d dVar13 = this.f194854t;
        int iHashCode15 = (iHashCode14 + (dVar13 != null ? dVar13.hashCode() : 0)) * 31;
        c9.d dVar14 = this.f194855u;
        int iHashCode16 = (iHashCode15 + (dVar14 != null ? dVar14.hashCode() : 0)) * 31;
        c9.d dVar15 = this.f194856v;
        int iHashCode17 = (iHashCode16 + (dVar15 != null ? dVar15.hashCode() : 0)) * 31;
        c9.d dVar16 = this.f194857w;
        int iHashCode18 = (iHashCode17 + (dVar16 != null ? dVar16.hashCode() : 0)) * 31;
        c9.d dVar17 = this.f194858x;
        int iHashCode19 = (iHashCode18 + (dVar17 != null ? dVar17.hashCode() : 0)) * 31;
        c9.d dVar18 = this.f194859y;
        int iHashCode20 = (iHashCode19 + (dVar18 != null ? dVar18.hashCode() : 0)) * 31;
        c9.d dVar19 = this.f194860z;
        int iHashCode21 = (iHashCode20 + (dVar19 != null ? dVar19.hashCode() : 0)) * 31;
        c9.d dVar20 = this.A;
        int iHashCode22 = (iHashCode21 + (dVar20 != null ? dVar20.hashCode() : 0)) * 31;
        c9.d dVar21 = this.B;
        int iHashCode23 = (iHashCode22 + (dVar21 != null ? dVar21.hashCode() : 0)) * 31;
        c9.d dVar22 = this.C;
        int iHashCode24 = (iHashCode23 + (dVar22 != null ? dVar22.hashCode() : 0)) * 31;
        c9.d dVar23 = this.D;
        int iHashCode25 = (iHashCode24 + (dVar23 != null ? dVar23.hashCode() : 0)) * 31;
        c9.d dVar24 = this.E;
        int iHashCode26 = (iHashCode25 + (dVar24 != null ? dVar24.hashCode() : 0)) * 31;
        c9.d dVar25 = this.F;
        int iHashCode27 = (iHashCode26 + (dVar25 != null ? dVar25.hashCode() : 0)) * 31;
        c9.d dVar26 = this.G;
        int iHashCode28 = (iHashCode27 + (dVar26 != null ? dVar26.hashCode() : 0)) * 31;
        c9.d dVar27 = this.H;
        int iHashCode29 = (iHashCode28 + (dVar27 != null ? dVar27.hashCode() : 0)) * 31;
        c9.d dVar28 = this.I;
        int iHashCode30 = (iHashCode29 + (dVar28 != null ? dVar28.hashCode() : 0)) * 31;
        c9.d dVar29 = this.J;
        int iHashCode31 = (iHashCode30 + (dVar29 != null ? dVar29.hashCode() : 0)) * 31;
        c9.d dVar30 = this.K;
        int iHashCode32 = (iHashCode31 + (dVar30 != null ? dVar30.hashCode() : 0)) * 31;
        c9.d dVar31 = this.L;
        int iHashCode33 = (iHashCode32 + (dVar31 != null ? dVar31.hashCode() : 0)) * 31;
        c9.d dVar32 = this.M;
        int iHashCode34 = (iHashCode33 + (dVar32 != null ? dVar32.hashCode() : 0)) * 31;
        c9.d dVar33 = this.N;
        int iHashCode35 = (iHashCode34 + (dVar33 != null ? dVar33.hashCode() : 0)) * 31;
        c9.d dVar34 = this.O;
        int iHashCode36 = (iHashCode35 + (dVar34 != null ? dVar34.hashCode() : 0)) * 31;
        c9.d dVar35 = this.P;
        int iHashCode37 = (iHashCode36 + (dVar35 != null ? dVar35.hashCode() : 0)) * 31;
        c9.d dVar36 = this.Q;
        int iHashCode38 = (iHashCode37 + (dVar36 != null ? dVar36.hashCode() : 0)) * 31;
        c9.d dVar37 = this.R;
        int iHashCode39 = (iHashCode38 + (dVar37 != null ? dVar37.hashCode() : 0)) * 31;
        c9.d dVar38 = this.S;
        int iHashCode40 = (iHashCode39 + (dVar38 != null ? dVar38.hashCode() : 0)) * 31;
        c9.d dVar39 = this.T;
        int iHashCode41 = (iHashCode40 + (dVar39 != null ? dVar39.hashCode() : 0)) * 31;
        c9.d dVar40 = this.U;
        int iHashCode42 = (iHashCode41 + (dVar40 != null ? dVar40.hashCode() : 0)) * 31;
        String str = this.V;
        int iK = wr.g.k(this.f194835a, (((iHashCode42 + (str != null ? str.hashCode() : 0)) * 31) + this.W) * 31, 31);
        ZoneOffset zoneOffset = this.f194836b;
        int iK2 = wr.g.k(this.f194837c, (iK + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.f194838d;
        return this.f194839e.hashCode() + ((iK2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("NutritionRecord(startTime=");
        sb3.append(this.f194835a);
        sb3.append(", startZoneOffset=");
        sb3.append(this.f194836b);
        sb3.append(", endTime=");
        sb3.append(this.f194837c);
        sb3.append(", endZoneOffset=");
        sb3.append(this.f194838d);
        sb3.append(", biotin=");
        sb3.append(this.f194840f);
        sb3.append(", caffeine=");
        sb3.append(this.f194841g);
        sb3.append(", calcium=");
        sb3.append(this.f194842h);
        sb3.append(", energy=");
        sb3.append(this.f194843i);
        sb3.append(", energyFromFat=");
        sb3.append(this.f194844j);
        sb3.append(", chloride=");
        sb3.append(this.f194845k);
        sb3.append(", cholesterol=");
        sb3.append(this.f194846l);
        sb3.append(", chromium=");
        sb3.append(this.f194847m);
        sb3.append(", copper=");
        sb3.append(this.f194848n);
        sb3.append(", dietaryFiber=");
        sb3.append(this.f194849o);
        sb3.append(", folate=");
        sb3.append(this.f194850p);
        sb3.append(", folicAcid=");
        sb3.append(this.f194851q);
        sb3.append(", iodine=");
        sb3.append(this.f194852r);
        sb3.append(", iron=");
        sb3.append(this.f194853s);
        sb3.append(", magnesium=");
        sb3.append(this.f194854t);
        sb3.append(", manganese=");
        sb3.append(this.f194855u);
        sb3.append(", molybdenum=");
        sb3.append(this.f194856v);
        sb3.append(", monounsaturatedFat=");
        sb3.append(this.f194857w);
        sb3.append(", niacin=");
        sb3.append(this.f194858x);
        sb3.append(", pantothenicAcid=");
        sb3.append(this.f194859y);
        sb3.append(", phosphorus=");
        sb3.append(this.f194860z);
        sb3.append(", polyunsaturatedFat=");
        sb3.append(this.A);
        sb3.append(", potassium=");
        sb3.append(this.B);
        sb3.append(", protein=");
        sb3.append(this.C);
        sb3.append(", riboflavin=");
        sb3.append(this.D);
        sb3.append(", saturatedFat=");
        sb3.append(this.E);
        sb3.append(", selenium=");
        sb3.append(this.F);
        sb3.append(", sodium=");
        sb3.append(this.G);
        sb3.append(", sugar=");
        sb3.append(this.H);
        sb3.append(", thiamin=");
        sb3.append(this.I);
        sb3.append(", totalCarbohydrate=");
        sb3.append(this.J);
        sb3.append(", totalFat=");
        sb3.append(this.K);
        sb3.append(", transFat=");
        sb3.append(this.L);
        sb3.append(", unsaturatedFat=");
        sb3.append(this.M);
        sb3.append(", vitaminA=");
        sb3.append(this.N);
        sb3.append(", vitaminB12=");
        sb3.append(this.O);
        sb3.append(", vitaminB6=");
        sb3.append(this.P);
        sb3.append(", vitaminC=");
        sb3.append(this.Q);
        sb3.append(", vitaminD=");
        sb3.append(this.R);
        sb3.append(", vitaminE=");
        sb3.append(this.S);
        sb3.append(", vitaminK=");
        sb3.append(this.T);
        sb3.append(", zinc=");
        sb3.append(this.U);
        sb3.append(", name=");
        sb3.append(this.V);
        sb3.append(", mealType=");
        sb3.append(this.W);
        sb3.append(", metadata=");
        return wr.g.q(sb3, this.f194839e, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b,\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0012R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0012R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0012R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0012R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0012R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0012R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0012R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0012R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0012R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0012R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0012R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0012R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0012R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0012R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0012R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0012R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0012R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0012R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0012R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0012R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0012R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0012R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0012R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0012R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0012R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0012R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0012R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00070\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0012¨\u0006<"}, d2 = {"Ly8/j0$q0;", "", "<init>", "()V", "", "TYPE_NAME", "Ljava/lang/String;", "Lc9/d;", "MIN_MASS", "Lc9/d;", "MAX_MASS_100", "MAX_MASS_100K", "Lc9/b;", "MIN_ENERGY", "Lc9/b;", "MAX_ENERGY", "Ll8/a;", "BIOTIN_TOTAL", "Ll8/a;", "CAFFEINE_TOTAL", "CALCIUM_TOTAL", "ENERGY_TOTAL", "ENERGY_FROM_FAT_TOTAL", "CHLORIDE_TOTAL", "CHOLESTEROL_TOTAL", "CHROMIUM_TOTAL", "COPPER_TOTAL", "DIETARY_FIBER_TOTAL", "FOLATE_TOTAL", "FOLIC_ACID_TOTAL", "IODINE_TOTAL", "IRON_TOTAL", "MAGNESIUM_TOTAL", "MANGANESE_TOTAL", "MOLYBDENUM_TOTAL", "MONOUNSATURATED_FAT_TOTAL", "NIACIN_TOTAL", "PANTOTHENIC_ACID_TOTAL", "PHOSPHORUS_TOTAL", "POLYUNSATURATED_FAT_TOTAL", "POTASSIUM_TOTAL", "PROTEIN_TOTAL", "RIBOFLAVIN_TOTAL", "SATURATED_FAT_TOTAL", "SELENIUM_TOTAL", "SODIUM_TOTAL", "SUGAR_TOTAL", "THIAMIN_TOTAL", "TOTAL_CARBOHYDRATE_TOTAL", "TOTAL_FAT_TOTAL", "TRANS_FAT_TOTAL", "UNSATURATED_FAT_TOTAL", "VITAMIN_A_TOTAL", "VITAMIN_B12_TOTAL", "VITAMIN_B6_TOTAL", "VITAMIN_C_TOTAL", "VITAMIN_D_TOTAL", "VITAMIN_E_TOTAL", "VITAMIN_K_TOTAL", "ZINC_TOTAL", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class q0 {
        public /* synthetic */ q0(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private q0() {
        }
    }

    public /* synthetic */ j0(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, z8.c cVar, c9.d dVar, c9.d dVar2, c9.d dVar3, c9.b bVar, c9.b bVar2, c9.d dVar4, c9.d dVar5, c9.d dVar6, c9.d dVar7, c9.d dVar8, c9.d dVar9, c9.d dVar10, c9.d dVar11, c9.d dVar12, c9.d dVar13, c9.d dVar14, c9.d dVar15, c9.d dVar16, c9.d dVar17, c9.d dVar18, c9.d dVar19, c9.d dVar20, c9.d dVar21, c9.d dVar22, c9.d dVar23, c9.d dVar24, c9.d dVar25, c9.d dVar26, c9.d dVar27, c9.d dVar28, c9.d dVar29, c9.d dVar30, c9.d dVar31, c9.d dVar32, c9.d dVar33, c9.d dVar34, c9.d dVar35, c9.d dVar36, c9.d dVar37, c9.d dVar38, c9.d dVar39, c9.d dVar40, String str, int i14, int i15, int i16, p005kotlin.jvm.internal.j jVar) {
        this(instant, zoneOffset, instant2, zoneOffset2, cVar, (i15 & 32) != 0 ? null : dVar, (i15 & 64) != 0 ? null : dVar2, (i15 & 128) != 0 ? null : dVar3, (i15 & 256) != 0 ? null : bVar, (i15 & 512) != 0 ? null : bVar2, (i15 & 1024) != 0 ? null : dVar4, (i15 & 2048) != 0 ? null : dVar5, (i15 & 4096) != 0 ? null : dVar6, (i15 & 8192) != 0 ? null : dVar7, (i15 & 16384) != 0 ? null : dVar8, (i15 & 32768) != 0 ? null : dVar9, (i15 & 65536) != 0 ? null : dVar10, (131072 & i15) != 0 ? null : dVar11, (262144 & i15) != 0 ? null : dVar12, (524288 & i15) != 0 ? null : dVar13, (1048576 & i15) != 0 ? null : dVar14, (2097152 & i15) != 0 ? null : dVar15, (4194304 & i15) != 0 ? null : dVar16, (8388608 & i15) != 0 ? null : dVar17, (16777216 & i15) != 0 ? null : dVar18, (33554432 & i15) != 0 ? null : dVar19, (67108864 & i15) != 0 ? null : dVar20, (134217728 & i15) != 0 ? null : dVar21, (268435456 & i15) != 0 ? null : dVar22, (536870912 & i15) != 0 ? null : dVar23, (1073741824 & i15) != 0 ? null : dVar24, (i15 & Integer.MIN_VALUE) != 0 ? null : dVar25, (i16 & 1) != 0 ? null : dVar26, (i16 & 2) != 0 ? null : dVar27, (i16 & 4) != 0 ? null : dVar28, (i16 & 8) != 0 ? null : dVar29, (i16 & 16) != 0 ? null : dVar30, (i16 & 32) != 0 ? null : dVar31, (i16 & 64) != 0 ? null : dVar32, (i16 & 128) != 0 ? null : dVar33, (i16 & 256) != 0 ? null : dVar34, (i16 & 512) != 0 ? null : dVar35, (i16 & 1024) != 0 ? null : dVar36, (i16 & 2048) != 0 ? null : dVar37, (i16 & 4096) != 0 ? null : dVar38, (i16 & 8192) != 0 ? null : dVar39, (i16 & 16384) != 0 ? null : dVar40, (i16 & 32768) != 0 ? null : str, (i16 & 65536) != 0 ? 0 : i14);
    }
}
