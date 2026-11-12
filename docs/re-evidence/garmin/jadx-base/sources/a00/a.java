package a00;

import android.graphics.Paint;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.LegendEntry;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import lc.u0;
import org.apache.commons.lang3.ArrayUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La00/a;", "Lcom/github/mikephil/charting/components/Legend;", "<init>", "()V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends Legend {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f37a;

    /* JADX INFO: renamed from: a00.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0000a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38a;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f38a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:102:0x0204  */
    @Override // com.github.mikephil.charting.components.Legend
    public final void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        float f14;
        float f15;
        float f16;
        float fCalcTextWidth;
        float f17;
        float f18;
        int i14;
        float fConvertDpToPixel = Utils.convertDpToPixel(getFormSize());
        float fConvertDpToPixel2 = Utils.convertDpToPixel(getStackSpace());
        float fConvertDpToPixel3 = Utils.convertDpToPixel(getFormToTextSpace());
        float fConvertDpToPixel4 = Utils.convertDpToPixel(getXEntrySpace());
        float fConvertDpToPixel5 = Utils.convertDpToPixel(getYEntrySpace());
        LegendEntry[] entries = getEntries();
        int length = entries.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        Legend.LegendOrientation orientation = getOrientation();
        int i15 = orientation == null ? -1 : C0000a.f38a[orientation.ordinal()];
        if (i15 == 1) {
            float lineHeight = Utils.getLineHeight(paint);
            float fMax = 0.0f;
            float f19 = 0.0f;
            float f22 = 0.0f;
            boolean z14 = false;
            for (int i16 = 0; i16 < length; i16++) {
                LegendEntry legendEntry = entries[i16];
                boolean z15 = legendEntry.form != Legend.LegendForm.NONE;
                float fConvertDpToPixel6 = Float.isNaN(legendEntry.formSize) ? fConvertDpToPixel : Utils.convertDpToPixel(legendEntry.formSize);
                String str = legendEntry.label;
                if (!z14) {
                    f22 = 0.0f;
                }
                if (z15) {
                    if (z14) {
                        f22 += fConvertDpToPixel2;
                    }
                    f22 += fConvertDpToPixel6;
                }
                if (str != null) {
                    if (!z15 || z14) {
                        if (z14) {
                            float fMax2 = Math.max(fMax, f22);
                            f14 = f19 + lineHeight + fConvertDpToPixel5;
                            z14 = false;
                            f15 = fMax2;
                            f16 = 0.0f;
                        }
                        fCalcTextWidth = f16 + Utils.calcTextWidth(paint, str);
                        if (i16 < length - 1) {
                            float f24 = lineHeight + fConvertDpToPixel5 + f14;
                            f22 = fCalcTextWidth;
                            fMax = f15;
                            f19 = f24;
                        } else {
                            float f25 = f14;
                            f22 = fCalcTextWidth;
                            fMax = f15;
                            f19 = f25;
                        }
                    } else {
                        f22 += fConvertDpToPixel3;
                    }
                    float f26 = f19;
                    f15 = fMax;
                    f16 = f22;
                    f14 = f26;
                    fCalcTextWidth = f16 + Utils.calcTextWidth(paint, str);
                    if (i16 < length - 1) {
                        float f27 = lineHeight + fConvertDpToPixel5 + f14;
                        f22 = fCalcTextWidth;
                        fMax = f15;
                        f19 = f27;
                    } else {
                        float f28 = f14;
                        f22 = fCalcTextWidth;
                        fMax = f15;
                        f19 = f28;
                    }
                } else {
                    f22 += fConvertDpToPixel6;
                    if (i16 < length - 1) {
                        f22 += fConvertDpToPixel2;
                    }
                    z14 = true;
                }
                fMax = Math.max(fMax, f22);
            }
            this.mNeededWidth = fMax;
            this.mNeededHeight = f19;
        } else {
            if (i15 != 2) {
                u0.r();
                return;
            }
            float lineHeight2 = Utils.getLineHeight(paint);
            float lineSpacing = Utils.getLineSpacing(paint) + fConvertDpToPixel5;
            viewPortHandler.getClass();
            float chartWidth = viewPortHandler.getChartWidth();
            getCalculatedLabelBreakPoints().clear();
            getCalculatedLabelSizes().clear();
            getCalculatedLineSizes().clear();
            float fMax3 = 0.0f;
            int i17 = -1;
            int i18 = 0;
            float f29 = 0.0f;
            float f34 = 0.0f;
            while (i18 < length) {
                LegendEntry legendEntry2 = entries[i18];
                float f35 = fConvertDpToPixel;
                boolean z16 = legendEntry2.form != Legend.LegendForm.NONE;
                float fConvertDpToPixel7 = Float.isNaN(legendEntry2.formSize) ? f35 : Utils.convertDpToPixel(legendEntry2.formSize);
                String str2 = legendEntry2.label;
                boolean z17 = z16;
                float f36 = fConvertDpToPixel2;
                getCalculatedLabelBreakPoints().add(Boolean.FALSE);
                float f37 = i17 == -1 ? 0.0f : f29 + f36;
                if (str2 != null) {
                    float f38 = f37;
                    getCalculatedLabelSizes().add(Utils.calcTextSize(paint, str2));
                    f29 = f38 + (z17 ? fConvertDpToPixel3 + fConvertDpToPixel7 : 0.0f) + getCalculatedLabelSizes().get(i18).width;
                    f17 = fConvertDpToPixel3;
                } else {
                    float f39 = f37;
                    f17 = fConvertDpToPixel3;
                    getCalculatedLabelSizes().add(FSize.getInstance(0.0f, 0.0f));
                    if (!z17) {
                        fConvertDpToPixel7 = 0.0f;
                    }
                    f29 = f39 + fConvertDpToPixel7;
                    if (i17 == -1) {
                        i17 = i18;
                    }
                }
                if (str2 != null || i18 == length - 1) {
                    float f44 = f34;
                    float f45 = f44 == 0.0f ? 0.0f : fConvertDpToPixel4;
                    int[] iArr = this.f37a;
                    if ((iArr == null || !ArrayUtils.contains(iArr, i18)) && (f44 == 0.0f || chartWidth - f44 >= f45 + f29)) {
                        f18 = f45 + f29 + f44;
                        i14 = -1;
                    } else {
                        getCalculatedLineSizes().add(FSize.getInstance(f44, lineHeight2));
                        fMax3 = Math.max(fMax3, f44);
                        i14 = -1;
                        getCalculatedLabelBreakPoints().set(i17 > -1 ? i17 : i18, Boolean.TRUE);
                        f18 = f29;
                    }
                    if (i18 == length - 1) {
                        getCalculatedLineSizes().add(FSize.getInstance(f18, lineHeight2));
                        fMax3 = Math.max(fMax3, f18);
                    }
                    f34 = f18;
                } else {
                    i14 = -1;
                }
                if (str2 != null) {
                    i17 = i14;
                }
                i18++;
                fConvertDpToPixel = f35;
                fConvertDpToPixel2 = f36;
                fConvertDpToPixel3 = f17;
            }
            this.mNeededWidth = fMax3;
            this.mNeededHeight = (lineSpacing * (getCalculatedLineSizes().size() == 0 ? 0 : getCalculatedLineSizes().size())) + (lineHeight2 * getCalculatedLineSizes().size());
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }
}
