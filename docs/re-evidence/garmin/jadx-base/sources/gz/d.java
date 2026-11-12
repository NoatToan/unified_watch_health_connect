package gz;

import com.github.mikephil.chartingv2.components.Legend;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lgz/d;", "Lcom/github/mikephil/chartingv2/components/Legend;", "<init>", "()V", "b", "d", "c", "a", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class d extends Legend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f80378a = b.LEFT;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumC1607d f80379b = EnumC1607d.BOTTOM;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f80380c = c.HORIZONTAL;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f80381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean[] f80382e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgz/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        LEFT,
        CENTER,
        RIGHT
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgz/d$c;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum c {
        HORIZONTAL,
        VERTICAL
    }

    /* JADX INFO: renamed from: gz.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgz/d$d;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1607d {
        TOP,
        CENTER,
        BOTTOM
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f80394a;

        static {
            int[] iArr = new int[Legend.LegendPosition.values().length];
            try {
                iArr[Legend.LegendPosition.LEFT_OF_CHART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Legend.LegendPosition.LEFT_OF_CHART_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Legend.LegendPosition.LEFT_OF_CHART_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Legend.LegendPosition.RIGHT_OF_CHART.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Legend.LegendPosition.RIGHT_OF_CHART_INSIDE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Legend.LegendPosition.RIGHT_OF_CHART_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Legend.LegendPosition.ABOVE_CHART_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Legend.LegendPosition.ABOVE_CHART_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Legend.LegendPosition.ABOVE_CHART_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Legend.LegendPosition.BELOW_CHART_LEFT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Legend.LegendPosition.BELOW_CHART_CENTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Legend.LegendPosition.BELOW_CHART_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Legend.LegendPosition.PIECHART_CENTER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f80394a = iArr;
        }
    }

    static {
        new a(null);
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    public final Legend.LegendPosition getPosition() {
        c cVar = this.f80380c;
        if (cVar == c.VERTICAL && this.f80378a == b.CENTER && this.f80379b == EnumC1607d.CENTER) {
            return Legend.LegendPosition.PIECHART_CENTER;
        }
        if (cVar == c.HORIZONTAL) {
            EnumC1607d enumC1607d = this.f80379b;
            EnumC1607d enumC1607d2 = EnumC1607d.TOP;
            b bVar = this.f80378a;
            if (enumC1607d == enumC1607d2) {
                if (bVar == b.LEFT) {
                    return Legend.LegendPosition.ABOVE_CHART_LEFT;
                }
                return bVar == b.RIGHT ? Legend.LegendPosition.ABOVE_CHART_RIGHT : Legend.LegendPosition.ABOVE_CHART_CENTER;
            }
            if (bVar == b.LEFT) {
                return Legend.LegendPosition.BELOW_CHART_LEFT;
            }
            return bVar == b.RIGHT ? Legend.LegendPosition.BELOW_CHART_RIGHT : Legend.LegendPosition.BELOW_CHART_CENTER;
        }
        b bVar2 = this.f80378a;
        b bVar3 = b.LEFT;
        EnumC1607d enumC1607d3 = this.f80379b;
        if (bVar2 == bVar3) {
            if (enumC1607d3 == EnumC1607d.TOP && this.f80381d) {
                return Legend.LegendPosition.LEFT_OF_CHART_INSIDE;
            }
            return enumC1607d3 == EnumC1607d.CENTER ? Legend.LegendPosition.LEFT_OF_CHART_CENTER : Legend.LegendPosition.LEFT_OF_CHART;
        }
        if (enumC1607d3 == EnumC1607d.TOP && this.f80381d) {
            return Legend.LegendPosition.RIGHT_OF_CHART_INSIDE;
        }
        return enumC1607d3 == EnumC1607d.CENTER ? Legend.LegendPosition.RIGHT_OF_CHART_CENTER : Legend.LegendPosition.RIGHT_OF_CHART;
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    public void setPosition(Legend.LegendPosition legendPosition) {
        b bVar;
        b bVar2;
        legendPosition.getClass();
        switch (e.f80394a[legendPosition.ordinal()]) {
            case 1:
            case 2:
            case 3:
                this.f80378a = b.LEFT;
                this.f80379b = legendPosition == Legend.LegendPosition.LEFT_OF_CHART_CENTER ? EnumC1607d.CENTER : EnumC1607d.TOP;
                this.f80380c = c.VERTICAL;
                break;
            case 4:
            case 5:
            case 6:
                this.f80378a = b.RIGHT;
                this.f80379b = legendPosition == Legend.LegendPosition.RIGHT_OF_CHART_CENTER ? EnumC1607d.CENTER : EnumC1607d.TOP;
                this.f80380c = c.VERTICAL;
                break;
            case 7:
            case 8:
            case 9:
                if (legendPosition == Legend.LegendPosition.ABOVE_CHART_LEFT) {
                    bVar = b.LEFT;
                } else {
                    bVar = legendPosition == Legend.LegendPosition.ABOVE_CHART_RIGHT ? b.RIGHT : b.CENTER;
                }
                this.f80378a = bVar;
                this.f80379b = EnumC1607d.TOP;
                this.f80380c = c.HORIZONTAL;
                break;
            case 10:
            case 11:
            case 12:
                if (legendPosition == Legend.LegendPosition.BELOW_CHART_LEFT) {
                    bVar2 = b.LEFT;
                } else {
                    bVar2 = legendPosition == Legend.LegendPosition.BELOW_CHART_RIGHT ? b.RIGHT : b.CENTER;
                }
                this.f80378a = bVar2;
                this.f80379b = EnumC1607d.BOTTOM;
                this.f80380c = c.HORIZONTAL;
                break;
            case 13:
                this.f80378a = b.CENTER;
                this.f80379b = EnumC1607d.CENTER;
                this.f80380c = c.VERTICAL;
                break;
            default:
                u0.r();
                return;
        }
        this.f80381d = legendPosition == Legend.LegendPosition.LEFT_OF_CHART_INSIDE || legendPosition == Legend.LegendPosition.RIGHT_OF_CHART_INSIDE;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgz/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
