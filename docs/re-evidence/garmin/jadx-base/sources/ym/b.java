package ym;

import android.graphics.Canvas;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.renderer.YAxisRenderer;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lym/b;", "Lcom/github/mikephil/charting/renderer/YAxisRenderer;", "Lcom/github/mikephil/charting/charts/BarLineChartBase;", "chart", "Lcom/github/mikephil/charting/components/YAxis$AxisDependency;", "which", "", "chartType", "<init>", "(Lcom/github/mikephil/charting/charts/BarLineChartBase;Lcom/github/mikephil/charting/components/YAxis$AxisDependency;I)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends YAxisRenderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f197878a;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BarLineChartBase<?> barLineChartBase, YAxis.AxisDependency axisDependency, int i14) {
        super(barLineChartBase.getViewPortHandler(), axisDependency == YAxis.AxisDependency.LEFT ? barLineChartBase.getAxisLeft() : barLineChartBase.getAxisRight(), barLineChartBase.getTransformer(axisDependency));
        barLineChartBase.getClass();
        axisDependency.getClass();
        this.f197878a = i14 != 14 ? i14 != 19 ? (i14 == 24 || i14 == 25) ? new String[]{"90", "45", "TDC 0", "315", "270"} : new String[0] : new String[]{"100% R", "50/50", "100% L"} : new String[]{"60% R", "50/50", "60% L"};
    }

    @Override // com.github.mikephil.charting.renderer.YAxisRenderer
    public final void drawYLabels(Canvas canvas, float f14, float[] fArr, float f15) {
        canvas.getClass();
        fArr.getClass();
        String[] strArr = this.f197878a;
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            String str = strArr[i14];
            if (!this.mYAxis.isDrawTopYLabelEntryEnabled() && i14 >= this.mYAxis.mEntryCount - 1) {
                return;
            }
            canvas.drawText(str, f14, fArr[(i14 * 2) + 1] + f15, this.mAxisLabelPaint);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lym/b$a;", "", "<init>", "()V", "", "RIGHT_CYCLING_BALANCE_LABEL", "Ljava/lang/String;", "LEFT_CYCLING_BALANCE_LABEL", "RIGHT_GROUND_CONTACT_BALANCE_LABEL", "LEFT_GROUND_CONTACT_BALANCE_LABEL", "MIDDLE_BALANCE_LABEL", "POWER_PHASE_START_1", "POWER_PHASE_START_2", "POWER_PHASE_START_3", "POWER_PHASE_START_4", "POWER_PHASE_START_5", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
