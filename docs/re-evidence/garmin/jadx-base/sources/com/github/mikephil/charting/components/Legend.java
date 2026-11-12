package com.github.mikephil.charting.components;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.FSize;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.ArrayList;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public class Legend extends ComponentBase {
    private List<Boolean> mCalculatedLabelBreakPoints;
    private List<FSize> mCalculatedLabelSizes;
    private List<FSize> mCalculatedLineSizes;
    private LegendDirection mDirection;
    private boolean mDrawInside;
    private LegendEntry[] mEntries;
    private LegendEntry[] mExtraEntries;
    private DashPathEffect mFormLineDashEffect;
    private float mFormLineWidth;
    private float mFormSize;
    private float mFormToTextSpace;
    private LegendHorizontalAlignment mHorizontalAlignment;
    private boolean mIsLegendCustom;
    private float mMaxSizePercent;
    public float mNeededHeight;
    public float mNeededWidth;
    private LegendOrientation mOrientation;
    private LegendForm mShape;
    private float mStackSpace;
    public float mTextHeightMax;
    public float mTextWidthMax;
    private LegendVerticalAlignment mVerticalAlignment;
    private boolean mWordWrapEnabled;
    private float mXEntrySpace;
    private float mYEntrySpace;

    /* JADX INFO: renamed from: com.github.mikephil.charting.components.Legend$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;

        static {
            int[] iArr = new int[LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum LegendDirection {
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT
    }

    public enum LegendForm {
        NONE,
        EMPTY,
        DEFAULT,
        SQUARE,
        CIRCLE,
        LINE
    }

    public enum LegendHorizontalAlignment {
        LEFT,
        CENTER,
        RIGHT
    }

    public enum LegendOrientation {
        HORIZONTAL,
        VERTICAL
    }

    public enum LegendVerticalAlignment {
        TOP,
        CENTER,
        BOTTOM
    }

    public Legend() {
        this.mEntries = new LegendEntry[0];
        this.mIsLegendCustom = false;
        this.mHorizontalAlignment = LegendHorizontalAlignment.LEFT;
        this.mVerticalAlignment = LegendVerticalAlignment.BOTTOM;
        this.mOrientation = LegendOrientation.HORIZONTAL;
        this.mDrawInside = false;
        this.mDirection = LegendDirection.LEFT_TO_RIGHT;
        this.mShape = LegendForm.SQUARE;
        this.mFormSize = 8.0f;
        this.mFormLineWidth = 3.0f;
        this.mFormLineDashEffect = null;
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
        this.mCalculatedLabelSizes = new ArrayList(16);
        this.mCalculatedLabelBreakPoints = new ArrayList(16);
        this.mCalculatedLineSizes = new ArrayList(16);
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(3.0f);
    }

    public void calculateDimensions(Paint paint, ViewPortHandler viewPortHandler) {
        float f14;
        float f15;
        float fConvertDpToPixel = Utils.convertDpToPixel(this.mFormSize);
        float fConvertDpToPixel2 = Utils.convertDpToPixel(this.mStackSpace);
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mFormToTextSpace);
        float fConvertDpToPixel4 = Utils.convertDpToPixel(this.mXEntrySpace);
        float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mYEntrySpace);
        boolean z14 = this.mWordWrapEnabled;
        LegendEntry[] legendEntryArr = this.mEntries;
        int length = legendEntryArr.length;
        this.mTextWidthMax = getMaximumEntryWidth(paint);
        this.mTextHeightMax = getMaximumEntryHeight(paint);
        int i14 = AnonymousClass1.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mOrientation.ordinal()];
        if (i14 == 1) {
            float lineHeight = Utils.getLineHeight(paint);
            float fMax = 0.0f;
            float f16 = 0.0f;
            float fCalcTextWidth = 0.0f;
            boolean z15 = false;
            for (int i15 = 0; i15 < length; i15++) {
                LegendEntry legendEntry = legendEntryArr[i15];
                boolean z16 = legendEntry.form != LegendForm.NONE;
                float fConvertDpToPixel6 = Float.isNaN(legendEntry.formSize) ? fConvertDpToPixel : Utils.convertDpToPixel(legendEntry.formSize);
                String str = legendEntry.label;
                if (!z15) {
                    fCalcTextWidth = 0.0f;
                }
                if (z16) {
                    if (z15) {
                        fCalcTextWidth += fConvertDpToPixel2;
                    }
                    fCalcTextWidth += fConvertDpToPixel6;
                }
                if (str != null) {
                    if (z16 && !z15) {
                        fCalcTextWidth += fConvertDpToPixel3;
                    } else if (z15) {
                        fMax = Math.max(fMax, fCalcTextWidth);
                        f16 += lineHeight + fConvertDpToPixel5;
                        fCalcTextWidth = 0.0f;
                        z15 = false;
                    }
                    fCalcTextWidth += Utils.calcTextWidth(paint, str);
                    if (i15 < length - 1) {
                        f16 = lineHeight + fConvertDpToPixel5 + f16;
                    }
                } else {
                    fCalcTextWidth += fConvertDpToPixel6;
                    if (i15 < length - 1) {
                        fCalcTextWidth += fConvertDpToPixel2;
                    }
                    z15 = true;
                }
                fMax = Math.max(fMax, fCalcTextWidth);
            }
            this.mNeededWidth = fMax;
            this.mNeededHeight = f16;
        } else if (i14 == 2) {
            float lineHeight2 = Utils.getLineHeight(paint);
            float lineSpacing = Utils.getLineSpacing(paint) + fConvertDpToPixel5;
            float fContentWidth = viewPortHandler.contentWidth() * this.mMaxSizePercent;
            this.mCalculatedLabelBreakPoints.clear();
            this.mCalculatedLabelSizes.clear();
            this.mCalculatedLineSizes.clear();
            int i16 = 0;
            int i17 = -1;
            float fMax2 = 0.0f;
            float f17 = 0.0f;
            float f18 = 0.0f;
            while (i16 < length) {
                LegendEntry legendEntry2 = legendEntryArr[i16];
                float f19 = fConvertDpToPixel;
                float f22 = fConvertDpToPixel2;
                boolean z17 = legendEntry2.form != LegendForm.NONE;
                float fConvertDpToPixel7 = Float.isNaN(legendEntry2.formSize) ? f19 : Utils.convertDpToPixel(legendEntry2.formSize);
                String str2 = legendEntry2.label;
                boolean z18 = z17;
                float f24 = fConvertDpToPixel7;
                this.mCalculatedLabelBreakPoints.add(Boolean.FALSE);
                float f25 = i17 == -1 ? 0.0f : f17 + f22;
                List<FSize> list = this.mCalculatedLabelSizes;
                if (str2 != null) {
                    float f26 = f25;
                    list.add(Utils.calcTextSize(paint, str2));
                    f17 = f26 + (z18 ? fConvertDpToPixel3 + f24 : 0.0f) + this.mCalculatedLabelSizes.get(i16).width;
                    f14 = fConvertDpToPixel3;
                } else {
                    float f27 = f25;
                    f14 = fConvertDpToPixel3;
                    list.add(FSize.getInstance(0.0f, 0.0f));
                    f17 = f27 + (z18 ? f24 : 0.0f);
                    if (i17 == -1) {
                        i17 = i16;
                    }
                }
                if (str2 != null || i16 == length - 1) {
                    float f28 = f18;
                    float f29 = f28 == 0.0f ? 0.0f : fConvertDpToPixel4;
                    if (!z14 || f28 == 0.0f || fContentWidth - f28 >= f29 + f17) {
                        f15 = f29 + f17 + f28;
                    } else {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f28, lineHeight2));
                        fMax2 = Math.max(fMax2, f28);
                        this.mCalculatedLabelBreakPoints.set(i17 > -1 ? i17 : i16, Boolean.TRUE);
                        f15 = f17;
                    }
                    if (i16 == length - 1) {
                        this.mCalculatedLineSizes.add(FSize.getInstance(f15, lineHeight2));
                        fMax2 = Math.max(fMax2, f15);
                    }
                    f18 = f15;
                }
                if (str2 != null) {
                    i17 = -1;
                }
                i16++;
                fConvertDpToPixel = f19;
                fConvertDpToPixel2 = f22;
                fConvertDpToPixel3 = f14;
            }
            this.mNeededWidth = fMax2;
            this.mNeededHeight = (lineSpacing * (this.mCalculatedLineSizes.size() == 0 ? 0 : this.mCalculatedLineSizes.size() - 1)) + (lineHeight2 * this.mCalculatedLineSizes.size());
        }
        this.mNeededHeight += this.mYOffset;
        this.mNeededWidth += this.mXOffset;
    }

    public List<Boolean> getCalculatedLabelBreakPoints() {
        return this.mCalculatedLabelBreakPoints;
    }

    public List<FSize> getCalculatedLabelSizes() {
        return this.mCalculatedLabelSizes;
    }

    public List<FSize> getCalculatedLineSizes() {
        return this.mCalculatedLineSizes;
    }

    public LegendDirection getDirection() {
        return this.mDirection;
    }

    public LegendEntry[] getEntries() {
        return this.mEntries;
    }

    public LegendEntry[] getExtraEntries() {
        return this.mExtraEntries;
    }

    public LegendForm getForm() {
        return this.mShape;
    }

    public DashPathEffect getFormLineDashEffect() {
        return this.mFormLineDashEffect;
    }

    public float getFormLineWidth() {
        return this.mFormLineWidth;
    }

    public float getFormSize() {
        return this.mFormSize;
    }

    public float getFormToTextSpace() {
        return this.mFormToTextSpace;
    }

    public LegendHorizontalAlignment getHorizontalAlignment() {
        return this.mHorizontalAlignment;
    }

    public float getMaxSizePercent() {
        return this.mMaxSizePercent;
    }

    public float getMaximumEntryHeight(Paint paint) {
        float f14 = 0.0f;
        for (LegendEntry legendEntry : this.mEntries) {
            String str = legendEntry.label;
            if (str != null) {
                float fCalcTextHeight = Utils.calcTextHeight(paint, str);
                if (fCalcTextHeight > f14) {
                    f14 = fCalcTextHeight;
                }
            }
        }
        return f14;
    }

    public float getMaximumEntryWidth(Paint paint) {
        float fConvertDpToPixel = Utils.convertDpToPixel(this.mFormToTextSpace);
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (LegendEntry legendEntry : this.mEntries) {
            float fConvertDpToPixel2 = Utils.convertDpToPixel(Float.isNaN(legendEntry.formSize) ? this.mFormSize : legendEntry.formSize);
            if (fConvertDpToPixel2 > f15) {
                f15 = fConvertDpToPixel2;
            }
            String str = legendEntry.label;
            if (str != null) {
                float fCalcTextWidth = Utils.calcTextWidth(paint, str);
                if (fCalcTextWidth > f14) {
                    f14 = fCalcTextWidth;
                }
            }
        }
        return f14 + f15 + fConvertDpToPixel;
    }

    public LegendOrientation getOrientation() {
        return this.mOrientation;
    }

    public float getStackSpace() {
        return this.mStackSpace;
    }

    public LegendVerticalAlignment getVerticalAlignment() {
        return this.mVerticalAlignment;
    }

    public float getXEntrySpace() {
        return this.mXEntrySpace;
    }

    public float getYEntrySpace() {
        return this.mYEntrySpace;
    }

    public boolean isDrawInsideEnabled() {
        return this.mDrawInside;
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

    public void setCustom(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
        this.mIsLegendCustom = true;
    }

    public void setDirection(LegendDirection legendDirection) {
        this.mDirection = legendDirection;
    }

    public void setDrawInside(boolean z14) {
        this.mDrawInside = z14;
    }

    public void setEntries(List<LegendEntry> list) {
        this.mEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public void setExtra(int[] iArr, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < Math.min(iArr.length, strArr.length); i14++) {
            LegendEntry legendEntry = new LegendEntry();
            int i15 = iArr[i14];
            legendEntry.formColor = i15;
            legendEntry.label = strArr[i14];
            if (i15 == 1122868 || i15 == 0) {
                legendEntry.form = LegendForm.NONE;
            } else if (i15 == 1122867) {
                legendEntry.form = LegendForm.EMPTY;
            }
            arrayList.add(legendEntry);
        }
        this.mExtraEntries = (LegendEntry[]) arrayList.toArray(new LegendEntry[arrayList.size()]);
    }

    public void setForm(LegendForm legendForm) {
        this.mShape = legendForm;
    }

    public void setFormLineDashEffect(DashPathEffect dashPathEffect) {
        this.mFormLineDashEffect = dashPathEffect;
    }

    public void setFormLineWidth(float f14) {
        this.mFormLineWidth = f14;
    }

    public void setFormSize(float f14) {
        this.mFormSize = f14;
    }

    public void setFormToTextSpace(float f14) {
        this.mFormToTextSpace = f14;
    }

    public void setHorizontalAlignment(LegendHorizontalAlignment legendHorizontalAlignment) {
        this.mHorizontalAlignment = legendHorizontalAlignment;
    }

    public void setMaxSizePercent(float f14) {
        this.mMaxSizePercent = f14;
    }

    public void setOrientation(LegendOrientation legendOrientation) {
        this.mOrientation = legendOrientation;
    }

    public void setStackSpace(float f14) {
        this.mStackSpace = f14;
    }

    public void setVerticalAlignment(LegendVerticalAlignment legendVerticalAlignment) {
        this.mVerticalAlignment = legendVerticalAlignment;
    }

    public void setWordWrapEnabled(boolean z14) {
        this.mWordWrapEnabled = z14;
    }

    public void setXEntrySpace(float f14) {
        this.mXEntrySpace = f14;
    }

    public void setYEntrySpace(float f14) {
        this.mYEntrySpace = f14;
    }

    public void setCustom(LegendEntry[] legendEntryArr) {
        this.mEntries = legendEntryArr;
        this.mIsLegendCustom = true;
    }

    public void setExtra(LegendEntry[] legendEntryArr) {
        if (legendEntryArr == null) {
            legendEntryArr = new LegendEntry[0];
        }
        this.mExtraEntries = legendEntryArr;
    }

    public void setExtra(List<LegendEntry> list) {
        this.mExtraEntries = (LegendEntry[]) list.toArray(new LegendEntry[list.size()]);
    }

    public Legend(LegendEntry[] legendEntryArr) {
        this();
        if (legendEntryArr != null) {
            this.mEntries = legendEntryArr;
        } else {
            h.s("entries array is NULL");
            throw null;
        }
    }
}
