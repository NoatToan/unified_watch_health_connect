package gz;

import android.graphics.Paint;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@o13.e
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgz/b;", "Lgz/d;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FSize[] f80359f = new FSize[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean[] f80360g = new Boolean[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FSize[] f80361h = new FSize[0];

    public b() {
        setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
        super.setWordWrapEnabled(true);
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    public final void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        String[] strArr;
        float formSize;
        float f14;
        String[] labels = getLabels();
        int length = labels.length;
        float lineHeight = Utils.getLineHeight(paint);
        float yEntrySpace = getYEntrySpace() + Utils.getLineSpacing(paint);
        float fContentWidth = viewPortHandler != null ? viewPortHandler.contentWidth() : 0.0f;
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        ArrayList arrayList3 = new ArrayList();
        int[] colors = getColors();
        float f15 = 0.0f;
        int i14 = 0;
        float fMax = 0.0f;
        int i15 = -1;
        float f16 = 0.0f;
        while (true) {
            if (i14 >= length) {
                break;
            }
            boolean z14 = colors[i14] != 1122868;
            arrayList2.add(Boolean.FALSE);
            float stackSpace = i15 == -1 ? 0.0f : getStackSpace() + f16;
            String str = labels[i14];
            if (str != null) {
                strArr = labels;
                arrayList.add(Utils.calcTextSize(paint, str));
                formSize = stackSpace + (z14 ? getFormSize() + getFormToTextSpace() : 0.0f) + ((FSize) arrayList.get(i14)).width;
            } else {
                strArr = labels;
                arrayList.add(new FSize(0.0f, 0.0f));
                formSize = stackSpace + (z14 ? getFormSize() : 0.0f);
                if (i15 == -1) {
                    i15 = i14;
                }
            }
            if (strArr[i14] != null || i14 == length - 1) {
                float xEntrySpace = f15 == 0.0f ? 0.0f : getXEntrySpace();
                if (f15 != 0.0f && fContentWidth - f15 < xEntrySpace + formSize) {
                    arrayList3.add(new FSize(f15, lineHeight));
                    f14 = formSize;
                    fMax = (float) Math.max(fMax, f15);
                    arrayList2.set(i15 > -1 ? i15 : i14, Boolean.TRUE);
                    f15 = f14;
                } else {
                    f14 = formSize;
                    f15 = xEntrySpace + formSize + f15;
                }
                if (i14 == length - 1) {
                    arrayList3.add(new FSize(f15, lineHeight));
                    fMax = (float) Math.max(fMax, f15);
                }
            } else {
                length = length;
                f14 = formSize;
                yEntrySpace = yEntrySpace;
            }
            if (strArr[i14] != null) {
                i15 = -1;
            }
            i14++;
            length = length;
            labels = strArr;
            f16 = f14;
            yEntrySpace = yEntrySpace;
        }
        float f17 = yEntrySpace;
        this.f80359f = (FSize[]) arrayList.toArray(new FSize[0]);
        this.f80360g = (Boolean[]) arrayList2.toArray(new Boolean[0]);
        this.f80361h = (FSize[]) arrayList3.toArray(new FSize[0]);
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        this.mNeededWidth = fMax;
        FSize[] fSizeArr = this.f80361h;
        this.mNeededHeight = (f17 * (fSizeArr.length == 0 ? 0 : fSizeArr.length - 1)) + (lineHeight * fSizeArr.length);
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    /* JADX INFO: renamed from: getCalculatedLabelBreakPoints, reason: from getter */
    public final Boolean[] getF80360g() {
        return this.f80360g;
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    /* JADX INFO: renamed from: getCalculatedLabelSizes, reason: from getter */
    public final FSize[] getF80359f() {
        return this.f80359f;
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    /* JADX INFO: renamed from: getCalculatedLineSizes, reason: from getter */
    public final FSize[] getF80361h() {
        return this.f80361h;
    }

    @Override // gz.d, com.github.mikephil.chartingv2.components.Legend
    public final void setPosition(Legend.LegendPosition legendPosition) {
        legendPosition.getClass();
        super.setPosition(Legend.LegendPosition.BELOW_CHART_CENTER);
    }

    @Override // com.github.mikephil.chartingv2.components.Legend
    public final void setWordWrapEnabled(boolean z14) {
        super.setWordWrapEnabled(true);
    }
}
