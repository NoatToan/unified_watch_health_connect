package com.huawei.ui.commonui.undertextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import health.compact.a.LanguageUtil;

/* JADX INFO: loaded from: classes16.dex */
public class ReportUnderlineTextView extends HealthTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23945a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f23946c;
    private int e;

    public ReportUnderlineTextView(Context context) {
        this(context, null);
    }

    public ReportUnderlineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ReportUnderlineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23946c = new Paint();
        this.e = 0;
        b(context, attributeSet, i);
    }

    private void b(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ReportUnderlineTextView);
        this.f23945a = typedArrayObtainStyledAttributes.getColor(R.styleable.ReportUnderlineTextView_underline_color, 0);
        this.e = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ReportUnderlineTextView_underline_height, 5);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4 + this.e);
    }

    @Override // com.huawei.ui.commonui.healthtextview.HealthTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        super.onDraw(canvas);
        this.f23946c.setColor(this.f23945a);
        this.f23946c.setStrokeWidth(this.e);
        int lineCount = getLineCount();
        if (lineCount <= 0) {
            LogUtil.j("ReportUnderlineTextView", "onDraw lineCount = ", Integer.valueOf(lineCount));
            return;
        }
        int height = getHeight() / lineCount;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (this.e > height) {
            this.e = height;
        }
        int gravity = getGravity();
        int i3 = 0;
        while (i3 < lineCount) {
            float lineWidth = getLayout().getLineWidth(i3);
            i3++;
            int i4 = this.e;
            int[] iArrE = e(gravity, lineWidth);
            if (iArrE.length == 2) {
                i2 = iArrE[0];
                i = iArrE[1];
            } else {
                i = 0;
                i2 = 0;
            }
            float f = ((paddingTop + paddingBottom) + (height * i3)) - i4;
            canvas.drawLine(i2, f, i, f, this.f23946c);
        }
    }

    private int[] e(int i, float f) {
        int[] iArr = new int[2];
        switch (i) {
            case 17:
            case 49:
            case ExerciseSessionRecord.EXERCISE_TYPE_WEIGHTLIFTING /* 81 */:
                iArr[0] = (int) (((getWidth() - f) - getPaddingStart()) / 2.0f);
                iArr[1] = (int) ((((getWidth() - f) - getPaddingStart()) / 2.0f) + f);
                break;
            case 8388627:
            case 8388659:
            case 8388691:
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    iArr[0] = (int) ((getWidth() - f) - getPaddingStart());
                    iArr[1] = getWidth() - getPaddingEnd();
                } else {
                    iArr[0] = getPaddingStart();
                    iArr[1] = (int) (f + getPaddingEnd());
                }
                break;
            case 8388629:
            case 8388661:
            case 8388693:
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    iArr[0] = getPaddingStart();
                    iArr[1] = (int) (f + getPaddingEnd());
                } else {
                    iArr[0] = (int) ((getWidth() - f) - getPaddingStart());
                    iArr[1] = getWidth() - getPaddingEnd();
                }
                break;
        }
        return iArr;
    }
}
