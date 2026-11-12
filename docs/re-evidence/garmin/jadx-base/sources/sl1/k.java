package sl1;

import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.github.mikephil.charting.components.YAxis;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsl1/k;", "Luz/e;", "Lrl1/j;", "Lrl1/i;", "Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;", "chart", "<init>", "(Lcom/garmin/android/apps/connectmobile/charts/mpchart3/wrapper/CustomCombinedChart;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k implements uz.e<rl1.j, rl1.i> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomCombinedChart f160002a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160003a;

        static {
            int[] iArr = new int[rl1.i.values().length];
            try {
                iArr[rl1.i.MOVEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[rl1.i.BREATHING_VARIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[rl1.i.AWAKE_RESTLESSNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[rl1.i.RESTING_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[rl1.i.BODY_BATTERY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[rl1.i.PULSE_OX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[rl1.i.RESPIRATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[rl1.i.RESPIRATION_AVERAGES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[rl1.i.OVERNIGHT_HRV.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f160003a = iArr;
        }
    }

    public k(CustomCombinedChart customCombinedChart) {
        customCombinedChart.getClass();
        this.f160002a = customCombinedChart;
    }

    @Override // uz.e
    public final qz.h a(YAxis yAxis, rl1.j jVar, rl1.i iVar) {
        rl1.i iVar2 = iVar;
        int i14 = iVar2 == null ? -1 : a.f160003a[iVar2.ordinal()];
        CustomCombinedChart customCombinedChart = this.f160002a;
        switch (i14) {
            case 1:
                return new xl1.c(customCombinedChart, customCombinedChart, yAxis);
            case 2:
                return new vl1.e(customCombinedChart, customCombinedChart, yAxis);
            case 3:
                return new tl1.d(customCombinedChart, yAxis);
            case 4:
                return new wl1.a(customCombinedChart, customCombinedChart, yAxis);
            case 5:
                return new ul1.b(customCombinedChart, customCombinedChart, yAxis);
            case 6:
                return new zl1.b(customCombinedChart, customCombinedChart, yAxis);
            case 7:
            case 8:
                return new am1.b(customCombinedChart, customCombinedChart, yAxis);
            case 9:
                return new yl1.b(customCombinedChart, customCombinedChart, yAxis);
            default:
                return null;
        }
    }

    @Override // uz.e
    public final qz.h b(rl1.j jVar, rl1.i iVar) {
        jVar.getClass();
        CustomCombinedChart customCombinedChart = this.f160002a;
        YAxis axisLeft = customCombinedChart.getAxisLeft();
        axisLeft.getClass();
        return new cm1.d(customCombinedChart, customCombinedChart, axisLeft);
    }
}
