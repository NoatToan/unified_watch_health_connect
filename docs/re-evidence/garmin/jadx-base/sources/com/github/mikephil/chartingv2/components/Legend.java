package com.github.mikephil.chartingv2.components;

import android.graphics.Paint;
import com.github.mikephil.chartingv2.utils.FSize;
import com.github.mikephil.chartingv2.utils.Utils;
import com.github.mikephil.chartingv2.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class Legend extends ComponentBase {
    private Boolean[] mCalculatedLabelBreakPoints;
    private FSize[] mCalculatedLabelSizes;
    private FSize[] mCalculatedLineSizes;
    private int[] mColors;
    private LegendDirection mDirection;
    private int[] mExtraColors;
    private String[] mExtraLabels;
    private float mFormSize;
    private float mFormToTextSpace;
    private boolean mIsLegendCustom;
    private String[] mLabels;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendPosition mPosition;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendPosition {
        RIGHT_OF_CHART,
        RIGHT_OF_CHART_CENTER,
        RIGHT_OF_CHART_INSIDE,
        LEFT_OF_CHART,
        LEFT_OF_CHART_CENTER,
        LEFT_OF_CHART_INSIDE,
        BELOW_CHART_LEFT,
        BELOW_CHART_RIGHT,
        BELOW_CHART_CENTER,
        ABOVE_CHART_LEFT,
        ABOVE_CHART_RIGHT,
        ABOVE_CHART_CENTER,
        PIECHART_CENTER
    }

    public Legend() {
        this.mIsLegendCustom = false;
        this.mPosition = LegendPosition.BELOW_CHART_LEFT;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mXEntrySpace = 6.0f;
        this.mYEntrySpace = 0.0f;
        this.mFormToTextSpace = 5.0f;
        this.mStackSpace = 3.0f;
        this.mMaxSizePercent = 0.95f;
        this.mNeededWidth = 0.0f;
        this.mNeededHeight = 0.0f;
        this.mTextHeightMax = 0.0f;
        this.mTextWidthMax = 0.0f;
        this.mWordWrapEnabled = false;
        this.mCalculatedLabelSizes = new FSize[0];
        this.mCalculatedLabelBreakPoints = new Boolean[0];
        this.mCalculatedLineSizes = new FSize[0];
        this.mFormSize = Utils.convertDpToPixel(8.0f);
        this.mXEntrySpace = Utils.convertDpToPixel(6.0f);
        this.mYEntrySpace = Utils.convertDpToPixel(0.0f);
        this.mFormToTextSpace = Utils.convertDpToPixel(5.0f);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mStackSpace = Utils.convertDpToPixel(3.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(4.0f);
    }

    public void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        float f14;
        int i14;
        LegendPosition legendPosition = this.mPosition;
        if (legendPosition == LegendPosition.RIGHT_OF_CHART || legendPosition == LegendPosition.RIGHT_OF_CHART_CENTER || legendPosition == LegendPosition.LEFT_OF_CHART || legendPosition == LegendPosition.LEFT_OF_CHART_CENTER || legendPosition == LegendPosition.PIECHART_CENTER) {
            this.mNeededWidth = getMaximumEntryWidth(paint);
            this.mNeededHeight = getFullHeight(paint);
            this.mTextWidthMax = this.mNeededWidth;
            this.mTextHeightMax = getMaximumEntryHeight(paint);
            return;
        }
        if (legendPosition != LegendPosition.BELOW_CHART_LEFT && legendPosition != LegendPosition.BELOW_CHART_RIGHT && legendPosition != LegendPosition.BELOW_CHART_CENTER && legendPosition != LegendPosition.ABOVE_CHART_LEFT && legendPosition != LegendPosition.ABOVE_CHART_RIGHT && legendPosition != LegendPosition.ABOVE_CHART_CENTER) {
            this.mNeededWidth = getFullWidth(paint);
            this.mNeededHeight = getMaximumEntryHeight(paint);
            this.mTextWidthMax = getMaximumEntryWidth(paint);
            this.mTextHeightMax = this.mNeededHeight;
            return;
        }
        int length = this.mLabels.length;
        float lineHeight = Utils.getLineHeight(paint);
        float lineSpacing = Utils.getLineSpacing(paint) + this.mYEntrySpace;
        float fContentWidth = viewPortHandler.contentWidth();
        ArrayList arrayList = new ArrayList(length);
        ArrayList arrayList2 = new ArrayList(length);
        ArrayList arrayList3 = new ArrayList();
        int i15 = -1;
        int i16 = -1;
        int i17 = 0;
        float fMax = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (true) {
            if (i17 >= length) {
                break;
            }
            boolean z14 = this.mColors[i17] != 1122868;
            arrayList2.add(Boolean.FALSE);
            float f17 = i16 == i15 ? 0.0f : this.mStackSpace + f15;
            String str = this.mLabels[i17];
            if (str != null) {
                arrayList.add(Utils.calcTextSize(paint, str));
                f14 = f17 + (z14 ? this.mFormSize + this.mFormToTextSpace : 0.0f) + ((FSize) arrayList.get(i17)).width;
            } else {
                arrayList.add(new FSize(0.0f, 0.0f));
                f14 = f17 + (z14 ? this.mFormSize : 0.0f);
                if (i16 == -1) {
                    i16 = i17;
                }
            }
            if (this.mLabels[i17] != null || i17 == length - 1) {
                float f18 = f16 == 0.0f ? 0.0f : this.mXEntrySpace;
                i14 = length;
                if (!this.mWordWrapEnabled || f16 == 0.0f || fContentWidth - f16 >= f18 + f14) {
                    i15 = -1;
                    f16 = f18 + f14 + f16;
                } else {
                    arrayList3.add(new FSize(f16, lineHeight));
                    fMax = Math.max(fMax, f16);
                    i15 = -1;
                    arrayList2.set(i16 > -1 ? i16 : i17, Boolean.TRUE);
                    f16 = f14;
                }
                if (i17 == i14 - 1) {
                    arrayList3.add(new FSize(f16, lineHeight));
                    fMax = Math.max(fMax, f16);
                }
            } else {
                i14 = length;
                i15 = -1;
            }
            if (this.mLabels[i17] != null) {
                i16 = i15;
            }
            i17++;
            f15 = f14;
            length = i14;
        }
        this.mCalculatedLabelSizes = (FSize[]) arrayList.toArray(new FSize[arrayList.size()]);
        this.mCalculatedLabelBreakPoints = (Boolean[]) arrayList2.toArray(new Boolean[arrayList2.size()]);
        this.mCalculatedLineSizes = (FSize[]) arrayList3.toArray(new FSize[arrayList3.size()]);
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        this.mNeededWidth = fMax;
        FSize[] fSizeArr = this.mCalculatedLineSizes;
        this.mNeededHeight = (lineSpacing * (fSizeArr.length == 0 ? 0 : fSizeArr.length - 1)) + (lineHeight * fSizeArr.length);
    }

    public Boolean[] getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public FSize[] getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public FSize[] getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    public int[] getColors() {
        return this.mColors;
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public int[] getExtraColors() {
        return this.mExtraColors;
    }

    public String[] getExtraLabels() {
        return this.mExtraLabels;
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public float getFullHeight(Paint paint) {
        float fCalcTextHeight = 0.0f;
        int i14 = 0;
        while (true) {
            String[] strArr = this.mLabels;
            if (i14 >= strArr.length) {
                return fCalcTextHeight;
            }
            String str = strArr[i14];
            if (str != null) {
                fCalcTextHeight += Utils.calcTextHeight(paint, str);
                if (i14 < this.mLabels.length - 1) {
                    fCalcTextHeight += this.mYEntrySpace;
                }
            }
            i14++;
        }
    }

    public float getFullWidth(Paint paint) {
        float f14;
        float fCalcTextWidth = 0.0f;
        int i14 = 0;
        while (true) {
            String[] strArr = this.mLabels;
            if (i14 >= strArr.length) {
                return fCalcTextWidth;
            }
            String str = strArr[i14];
            if (str != null) {
                if (this.mColors[i14] != 1122868) {
                    fCalcTextWidth += this.mFormSize + this.mFormToTextSpace;
                }
                fCalcTextWidth += Utils.calcTextWidth(paint, str);
                if (i14 < this.mLabels.length - 1) {
                    f14 = this.mXEntrySpace;
                    fCalcTextWidth += f14;
                }
            } else {
                fCalcTextWidth += this.mFormSize;
                if (i14 < strArr.length - 1) {
                    f14 = this.mStackSpace;
                    fCalcTextWidth += f14;
                }
            }
            i14++;
        }
    }

    public String getLabel(int i14) {
        return this.mLabels[i14];
    }

    public String[] getLabels() {
        return this.mLabels;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f14 = 0.0f;
        int i14 = 0;
        while (true) {
            String[] strArr = this.mLabels;
            if (i14 >= strArr.length) {
                return f14;
            }
            String str = strArr[i14];
            if (str != null) {
                float fCalcTextHeight = Utils.calcTextHeight(paint, str);
                if (fCalcTextHeight > f14) {
                    f14 = fCalcTextHeight;
                }
            }
            i14++;
        }
    }

    public float getMaximumEntryWidth(Paint paint) {
        float f14 = 0.0f;
        int i14 = 0;
        while (true) {
            String[] strArr = this.mLabels;
            if (i14 >= strArr.length) {
                return f14 + this.mFormSize + this.mFormToTextSpace;
            }
            String str = strArr[i14];
            if (str != null) {
                float fCalcTextWidth = Utils.calcTextWidth(paint, str);
                if (fCalcTextWidth > f14) {
                    f14 = fCalcTextWidth;
                }
            }
            i14++;
        }
    }

    public LegendPosition getPosition() {
        return this.mPosition;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isLegendCustom() {
        return this.mIsLegendCustom;
    }

    public boolean isWordWrapEnabled() {
        return this.mWordWrapEnabled;
    }

    public void resetCustom() {
        this.mIsLegendCustom = false;
    }

    public void setComputedColors(List<Integer> list) {
        this.mColors = Utils.convertIntegers(list);
    }

    public void setComputedLabels(List<String> list) {
        this.mLabels = Utils.convertStrings(list);
    }

    public void setCustom(List<Integer> list, List<String> list2) {
        if (list.size() != list2.size()) {
            h.s("colors array and labels array need to be of same size");
            return;
        }
        this.mColors = Utils.convertIntegers(list);
        this.mLabels = Utils.convertStrings(list2);
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setExtra(List<Integer> list, List<String> list2) {
        this.mExtraColors = Utils.convertIntegers(list);
        this.mExtraLabels = Utils.convertStrings(list2);
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormSize(float f14) {
        this.mFormSize = Utils.convertDpToPixel(f14);
    }

    public void setFormToTextSpace(float f14) {
        this.mFormToTextSpace = Utils.convertDpToPixel(f14);
    }

    public void setMaxSizePercent(float f14) {
        this.mMaxSizePercent = f14;
    }

    public void setPosition(LegendPosition legendPosition) {
        this.mPosition = legendPosition;
    }

    public void setStackSpace(float f14) {
        this.mStackSpace = f14;
    }

    public void setWordWrapEnabled(boolean z14) {
        this.mWordWrapEnabled = z14;
    }

    public void setXEntrySpace(float f14) {
        this.mXEntrySpace = Utils.convertDpToPixel(f14);
    }

    public void setYEntrySpace(float f14) {
        this.mYEntrySpace = Utils.convertDpToPixel(f14);
    }

    public void setExtra(int[] iArr, String[] strArr) {
        this.mExtraColors = iArr;
        this.mExtraLabels = strArr;
    }

    public void setCustom(int[] iArr, String[] strArr) {
        if (iArr.length == strArr.length) {
            this.mLabels = strArr;
            this.mColors = iArr;
            this.mIsLegendCustom = true;
            return;
        }
        h.s("colors array and labels array need to be of same size");
    }

    public Legend(int[] iArr, String[] strArr) {
        this();
        if (iArr != null && strArr != null) {
            if (iArr.length == strArr.length) {
                this.mColors = iArr;
                this.mLabels = strArr;
                return;
            } else {
                h.s("colors array and labels array need to be of same size");
                throw null;
            }
        }
        h.s("colors array or labels array is NULL");
        throw null;
    }

    public Legend(List<Integer> list, List<String> list2) {
        this();
        if (list != null && list2 != null) {
            if (list.size() == list2.size()) {
                this.mColors = Utils.convertIntegers(list);
                this.mLabels = Utils.convertStrings(list2);
                return;
            } else {
                h.s("colors array and labels array need to be of same size");
                throw null;
            }
        }
        h.s("colors array or labels array is NULL");
        throw null;
    }
}
