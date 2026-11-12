package zm1;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.YAxis;
import lc.u0;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lzm1/w;", "Luz/e;", "Lzm1/o;", "Lrl1/i;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "Lorg/joda/time/LocalDate;", "startDate", "endDate", "", "daily", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalDate;Z)V", "gcm-domain-wellness_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w implements uz.e<o, rl1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f205350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f205351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f205352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f205353d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f205354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f205355b;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.SLEEP_SCORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f205354a = iArr;
            int[] iArr2 = new int[rl1.i.values().length];
            try {
                iArr2[rl1.i.SKIN_TEMP.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[rl1.i.PULSE_OX.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[rl1.i.RESTING_HEART_RATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[rl1.i.OVERNIGHT_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[rl1.i.BODY_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[rl1.i.RESPIRATION.ordinal()] = 6;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 7;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[rl1.i.OVERNIGHT_HRV.ordinal()] = 8;
            } catch (NoSuchFieldError unused9) {
            }
            f205355b = iArr2;
        }
    }

    public w(CustomCombinedChart customCombinedChart, LocalDate localDate, LocalDate localDate2, boolean z14) {
        customCombinedChart.getClass();
        localDate.getClass();
        localDate2.getClass();
        this.f205350a = customCombinedChart;
        this.f205351b = localDate;
        this.f205352c = localDate2;
        this.f205353d = z14;
    }

    @Override // uz.e
    public final qz.h a(YAxis yAxis, o oVar, rl1.i iVar) {
        rl1.i iVar2 = iVar;
        int i14 = iVar2 == null ? -1 : a.f205355b[iVar2.ordinal()];
        LocalDate localDate = this.f205352c;
        LocalDate localDate2 = this.f205351b;
        CustomCombinedChart customCombinedChart = this.f205350a;
        switch (i14) {
            case 1:
                return new hm1.b(customCombinedChart, customCombinedChart, yAxis, new yz.i(), localDate2, localDate, this.f205353d);
            case 2:
                return new hm1.b(customCombinedChart, customCombinedChart, yAxis, new yz.h(), localDate2, localDate, this.f205353d);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return new hm1.b(customCombinedChart, customCombinedChart, yAxis, new yz.e(), localDate2, localDate, this.f205353d);
            default:
                return null;
        }
    }

    @Override // uz.e
    public final qz.h b(o oVar, rl1.i iVar) {
        o oVar2 = oVar;
        oVar2.getClass();
        CustomCombinedChart customCombinedChart = this.f205350a;
        YAxis axisLeft = customCombinedChart.getAxisLeft();
        if (a.f205354a[oVar2.ordinal()] != 1) {
            u0.r();
            return null;
        }
        axisLeft.getClass();
        return new hm1.b(customCombinedChart, customCombinedChart, axisLeft, new yz.e(), this.f205351b, this.f205352c, this.f205353d);
    }
}
