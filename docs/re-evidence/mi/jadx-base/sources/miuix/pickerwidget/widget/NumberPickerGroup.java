package miuix.pickerwidget.widget;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import defpackage.ati;

/* JADX INFO: loaded from: classes3.dex */
public class NumberPickerGroup extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f26737a;

    public NumberPickerGroup(Context context) {
        super(context);
        this.f26737a = new Paint();
    }

    public final boolean a(NumberPicker numberPicker) {
        return numberPicker.getId() == ati.f3437b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float displayedMaxTextWidth;
        float originalLabelWidth;
        super.onMeasure(i, i2);
        if (getOrientation() == 0) {
            int childCount = getChildCount();
            int measuredWidth = 0;
            float fMax = 0.0f;
            float f = 0.0f;
            float marginLabelLeft = 0.0f;
            float displayedMaxTextWidth2 = 0.0f;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt instanceof NumberPicker) {
                    NumberPicker numberPicker = (NumberPicker) childAt;
                    displayedMaxTextWidth2 += numberPicker.getDisplayedMaxTextWidth();
                    float originalLabelWidth2 = numberPicker.getOriginalLabelWidth();
                    if (originalLabelWidth2 > 0.0f) {
                        f += originalLabelWidth2;
                        marginLabelLeft += numberPicker.getMarginLabelLeft();
                    }
                    fMax = Math.max(fMax, numberPicker.getOriginTextSizeHighlight());
                } else {
                    measuredWidth += childAt.getMeasuredWidth();
                }
            }
            this.f26737a.setTextSize(fMax);
            float fMeasureText = this.f26737a.measureText("    ");
            float f2 = displayedMaxTextWidth2 + (f * 2.0f) + fMeasureText;
            float measuredWidth2 = (getMeasuredWidth() - measuredWidth) - (marginLabelLeft * 2.0f);
            float f3 = measuredWidth2 / f2;
            float f4 = f3 < 1.0f ? f3 * fMax : fMax;
            if (f4 <= fMax) {
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt2 = getChildAt(i4);
                    if (childAt2 instanceof NumberPicker) {
                        NumberPicker numberPicker2 = (NumberPicker) childAt2;
                        numberPicker2.setTextSizeHighlight((int) f4);
                        numberPicker2.setTextSizeHint((int) ((numberPicker2.getOriginTextSizeHint() * f4) / fMax));
                        float marginLabelLeft2 = numberPicker2.getOriginalLabelWidth() > 0.0f ? numberPicker2.getMarginLabelLeft() * 2 : 0.0f;
                        if (a(numberPicker2)) {
                            displayedMaxTextWidth = numberPicker2.getDisplayedMaxTextWidth() + fMeasureText;
                            originalLabelWidth = numberPicker2.getOriginalLabelWidth();
                        } else {
                            displayedMaxTextWidth = numberPicker2.getDisplayedMaxTextWidth();
                            originalLabelWidth = numberPicker2.getOriginalLabelWidth();
                        }
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (marginLabelLeft2 + (((displayedMaxTextWidth + (originalLabelWidth * 2.0f)) * measuredWidth2) / f2)), 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                    }
                }
            }
        }
    }

    public NumberPickerGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26737a = new Paint();
    }

    public NumberPickerGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26737a = new Paint();
    }
}
