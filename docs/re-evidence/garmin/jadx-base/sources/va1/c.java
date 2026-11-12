package va1;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\nB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lva1/c;", "", "", Action.KEY_ATTRIBUTE, "", "weight", "<init>", "(Ljava/lang/String;D)V", "c", "b", "a", "Lva1/c$b;", "Lva1/c$c;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f176585c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f176586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f176587b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva1/c$b;", "Lva1/c;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b extends c {
        public b() {
            super("CUSTOM", 0.0d, null);
        }
    }

    private c(String str, double d14) {
        this.f176586a = str;
        this.f176587b = d14;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lva1/c$a;", "", "<init>", "()V", "", "ROAD_BIKE_WEIGHT", "Ljava/lang/String;", "GRAVEL_BIKE_WEIGHT", "MOUNTAIN_BIKE_WEIGHT", "LOADED_TOURING_BIKE_WEIGHT", "CUSTOM", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(String str, double d14, p005kotlin.jvm.internal.j jVar) {
        this(str, d14);
    }

    /* JADX INFO: renamed from: va1.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\r\u000e\u000f\u0010B;\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u0082\u0001\u0004\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lva1/c$c;", "Lva1/c;", "", Action.KEY_ATTRIBUTE, "", "minWeight", "maxWeight", "minWeightStatute", "maxWeightStatute", "", "descriptionResId", "<init>", "(Ljava/lang/String;DDDDI)V", "d", "a", "c", "b", "Lva1/c$c$a;", "Lva1/c$c$b;", "Lva1/c$c$c;", "Lva1/c$c$d;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class AbstractC3296c extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final double f176588d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final double f176589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final double f176590f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final double f176591g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f176592h;

        /* JADX INFO: renamed from: va1.c$c$a */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva1/c$c$a;", "Lva1/c$c;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends AbstractC3296c {
            public a() {
                super("GRAVEL_BIKE_WEIGHT", 13.0d, 15.0d, 30.0d, 33.0d, R.string.power_guide_gravel_bike_weight_desc, null);
            }
        }

        /* JADX INFO: renamed from: va1.c$c$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva1/c$c$b;", "Lva1/c$c;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b extends AbstractC3296c {
            public b() {
                super("LOADED_TOURING_BIKE_WEIGHT", 20.0d, 22.0d, 45.0d, 50.0d, R.string.power_guide_loaded_touring_bike_weight_desc, null);
            }
        }

        /* JADX INFO: renamed from: va1.c$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva1/c$c$c;", "Lva1/c$c;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3297c extends AbstractC3296c {
            public C3297c() {
                super("MOUNTAIN_BIKE_WEIGHT", 16.0d, 17.0d, 35.0d, 38.0d, R.string.power_guide_mountain_bike_weight_desc, null);
            }
        }

        /* JADX INFO: renamed from: va1.c$c$d */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lva1/c$c$d;", "Lva1/c$c;", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends AbstractC3296c {
            public d() {
                super("ROAD_BIKE_WEIGHT", 10.0d, 12.0d, 23.0d, 26.0d, R.string.power_guide_road_bike_weight_desc, null);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private AbstractC3296c(String str, double d14, double d15, double d16, double d17, int i14) {
            Double[] dArr = {Double.valueOf(d14), Double.valueOf(d15)};
            double dDoubleValue = 0.0d;
            int i15 = 0;
            for (int i16 = 0; i16 < 2; i16++) {
                dDoubleValue += dArr[i16].doubleValue();
                i15++;
            }
            super(str, i15 == 0 ? Double.NaN : dDoubleValue / ((double) i15), null);
            this.f176588d = d14;
            this.f176589e = d15;
            this.f176590f = d16;
            this.f176591g = d17;
            this.f176592h = i14;
        }

        public /* synthetic */ AbstractC3296c(String str, double d14, double d15, double d16, double d17, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, d14, d15, d16, d17, i14);
        }
    }
}
