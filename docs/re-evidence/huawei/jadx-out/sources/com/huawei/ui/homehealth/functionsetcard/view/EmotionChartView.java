package com.huawei.ui.homehealth.functionsetcard.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.homehealth.R;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class EmotionChartView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f25454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f25455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f25456c;
    private List<Integer> d;
    private final float e;
    private float f;
    private float g;
    private int h;
    private float i;
    private int j;
    private Paint l;
    private int[] n;

    public EmotionChartView(Context context) {
        super(context);
        this.e = BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_2dp);
        this.f25454a = context;
    }

    public EmotionChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_2dp);
        this.f25454a = context;
    }

    public EmotionChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = BaseApplication.getContext().getResources().getDimension(R.dimen.health_common_2dp);
        this.f25454a = context;
    }

    public void a(int[] iArr) {
        this.n = iArr;
        e();
    }

    public void setEmotionChartDataList(List<Integer> list) {
        this.d = list;
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            Collections.reverse(this.d);
        }
        invalidate();
    }

    private void e() {
        this.l = new Paint(1);
        this.f25455b = new Paint(1);
        this.f25456c = new Paint(1);
        int[] iArr = this.n;
        if (iArr == null || iArr.length < 3) {
            LogUtil.a("EmotionChartView", "initPaint mPointColors is empty");
            return;
        }
        this.l.setColor(iArr[0]);
        this.f25455b.setColor(this.n[1]);
        this.f25456c.setColor(this.n[2]);
    }

    private void b() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (this.j != measuredWidth || this.h != measuredHeight) {
            this.j = measuredWidth;
            this.h = measuredHeight;
            LogUtil.a("EmotionChartView", "initDivider mMeasureWidth :", Integer.valueOf(measuredWidth), " mMeasureHeight:", Integer.valueOf(measuredHeight));
            if (njy.e(this.d)) {
                LogUtil.a("EmotionChartView", "initDivider mEmotionChartDataList is empty");
                return;
            }
            float size = measuredWidth / this.d.size();
            this.f = measuredHeight / 5.0f;
            float f = size / 3.0f;
            this.g = f;
            this.i = f * 2.0f;
        }
        LogUtil.a("EmotionChartView", "initDivider mItemWidth :", Float.valueOf(this.i), "  mItemHeight:", Float.valueOf(this.f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (njy.e(this.d)) {
            return;
        }
        b();
        float fMin = Math.min(this.f / 2.0f, Math.min(this.i / 2.0f, this.e));
        int i = 0;
        float f = 0.0f;
        while (i < this.d.size()) {
            int iIntValue = this.d.get(i).intValue();
            if (f != 0.0f) {
                f += this.g;
            }
            float f2 = f;
            float f3 = f2 + this.i;
            c(canvas, f2, f3, iIntValue, fMin);
            i++;
            f = f3;
        }
    }

    private void c(Canvas canvas, float f, float f2, int i, float f3) {
        if (i == 3) {
            canvas.drawRoundRect(new RectF(f, 0.0f, f2, this.f), f3, f3, this.l);
            return;
        }
        if (i == 2) {
            float f4 = this.f;
            canvas.drawRoundRect(new RectF(f, 2.0f * f4, f2, f4 * 3.0f), f3, f3, this.f25455b);
        } else if (i == 1) {
            float f5 = this.f;
            canvas.drawRoundRect(new RectF(f, 4.0f * f5, f2, f5 * 5.0f), f3, f3, this.f25456c);
        }
    }
}
