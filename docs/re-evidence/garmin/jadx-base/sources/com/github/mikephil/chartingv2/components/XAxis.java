package com.github.mikephil.chartingv2.components;

import com.github.mikephil.chartingv2.formatter.DefaultXAxisValueFormatter;
import com.github.mikephil.chartingv2.formatter.XAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class XAxis extends AxisBase {
    protected List<String> mValues = new ArrayList();
    public int mLabelWidth = 1;
    public int mLabelHeight = 1;
    public int mLabelRotatedWidth = 1;
    public int mLabelRotatedHeight = 1;
    protected float mLabelRotationAngle = 0.0f;
    private int mSpaceBetweenLabels = 4;
    public int mAxisLabelModulus = 1;
    private boolean mIsAxisModulusCustom = false;
    private boolean mAvoidFirstLastClipping = false;
    protected XAxisValueFormatter mXAxisValueFormatter = new DefaultXAxisValueFormatter();
    private XAxisPosition mPosition = XAxisPosition.TOP;

    public enum XAxisPosition {
        TOP,
        BOTTOM,
        BOTH_SIDED,
        TOP_INSIDE,
        BOTTOM_INSIDE
    }

    public XAxis() {
        this.mYOffset = Utils.convertDpToPixel(4.0f);
    }

    public float getLabelRotationAngle() {
        return this.mLabelRotationAngle;
    }

    @Override // com.github.mikephil.chartingv2.components.AxisBase
    public String getLongestLabel() {
        String str = "";
        for (int i14 = 0; i14 < this.mValues.size(); i14++) {
            String str2 = this.mValues.get(i14);
            if (str.length() < str2.length()) {
                str = str2;
            }
        }
        return str;
    }

    public XAxisPosition getPosition() {
        return this.mPosition;
    }

    public int getSpaceBetweenLabels() {
        return this.mSpaceBetweenLabels;
    }

    public XAxisValueFormatter getValueFormatter() {
        return this.mXAxisValueFormatter;
    }

    public List<String> getValues() {
        return this.mValues;
    }

    public boolean isAvoidFirstLastClippingEnabled() {
        return this.mAvoidFirstLastClipping;
    }

    public boolean isAxisModulusCustom() {
        return this.mIsAxisModulusCustom;
    }

    public void resetLabelsToSkip() {
        this.mIsAxisModulusCustom = false;
    }

    public void setAvoidFirstLastClipping(boolean z14) {
        this.mAvoidFirstLastClipping = z14;
    }

    public void setLabelRotationAngle(float f14) {
        this.mLabelRotationAngle = f14;
    }

    public void setLabelsToSkip(int i14) {
        if (i14 < 0) {
            i14 = 0;
        }
        this.mIsAxisModulusCustom = true;
        this.mAxisLabelModulus = i14 + 1;
    }

    public void setPosition(XAxisPosition xAxisPosition) {
        this.mPosition = xAxisPosition;
    }

    public void setSpaceBetweenLabels(int i14) {
        this.mSpaceBetweenLabels = i14;
    }

    public void setValueFormatter(XAxisValueFormatter xAxisValueFormatter) {
        if (xAxisValueFormatter == null) {
            this.mXAxisValueFormatter = new DefaultXAxisValueFormatter();
        } else {
            this.mXAxisValueFormatter = xAxisValueFormatter;
        }
    }

    public void setValues(List<String> list) {
        this.mValues = list;
    }
}
