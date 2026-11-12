package com.huawei.ui.commonui.muscleview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.muscleview.data.HealthMusclePath;
import defpackage.pao;
import defpackage.qoq;
import defpackage.qot;
import health.compact.a.LanguageUtil;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTrainBodyLineView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<qot> f23776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23777c;
    private Path d;
    private Paint e;
    private Paint f;
    private int h;
    private int i;

    private boolean a(float f) {
        return f < 0.0f;
    }

    public HealthTrainBodyLineView(Context context) {
        super(context);
        this.f23777c = getResources().getColor(R.color.emui_color_muscle_line);
        this.h = getResources().getColor(R.color.emui_color_muscle_ring_backgroud);
        this.i = getResources().getColor(R.color.emui_color_muscle_ring);
        this.f23775a = false;
        b();
    }

    public HealthTrainBodyLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23777c = getResources().getColor(R.color.emui_color_muscle_line);
        this.h = getResources().getColor(R.color.emui_color_muscle_ring_backgroud);
        this.i = getResources().getColor(R.color.emui_color_muscle_ring);
        this.f23775a = false;
        b();
    }

    public HealthTrainBodyLineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23777c = getResources().getColor(R.color.emui_color_muscle_line);
        this.h = getResources().getColor(R.color.emui_color_muscle_ring_backgroud);
        this.i = getResources().getColor(R.color.emui_color_muscle_ring);
        this.f23775a = false;
        b();
    }

    private void b() {
        this.d = new Path();
        Paint paint = new Paint();
        this.e = paint;
        paint.setAntiAlias(true);
        this.e.setColor(this.f23777c);
        this.e.setStyle(Paint.Style.STROKE);
        this.e.setPathEffect(new DashPathEffect(new float[]{4.0f, 4.0f}, 0.0f));
        this.e.setStrokeWidth(pao.e(getContext(), 1.0f));
        Paint paint2 = new Paint();
        this.f = paint2;
        paint2.setAntiAlias(true);
        this.f.setStrokeWidth(pao.e(getContext(), 1.5f));
        this.f23775a = LanguageUtil.ba(getContext());
    }

    public void setLineData(List<qot> list) {
        this.f23776b = list;
        invalidate();
    }

    public void setLineColor(int i) {
        this.f23777c = i;
        invalidate();
    }

    public void setRingColor(int i) {
        this.i = i;
        invalidate();
    }

    public void setRingBgColor(int i) {
        this.h = i;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List<qot> list = this.f23776b;
        if (list == null) {
            return;
        }
        for (qot qotVar : list) {
            if (qotVar == null) {
                LogUtil.j("HealthTrainBodyLineView", "onDraw bean == null");
            } else if (qotVar.d() != null && qotVar.b() != null) {
                HealthTrainBodyView healthTrainBodyViewD = qotVar.d();
                View viewB = qotVar.b();
                HealthMusclePath healthMusclePathA = healthTrainBodyViewD.a(qotVar.a());
                if (healthMusclePathA != null && healthMusclePathA.e() != null && !healthMusclePathA.e().isEmpty()) {
                    if (healthTrainBodyViewD.getType() == 2) {
                        if (healthMusclePathA.e().size() >= 2 && this.f23775a) {
                            c(healthTrainBodyViewD, viewB, healthMusclePathA.e().get(1), canvas);
                        } else {
                            c(healthTrainBodyViewD, viewB, healthMusclePathA.e().get(0), canvas);
                        }
                    }
                    if (healthTrainBodyViewD.getType() == 1) {
                        if (healthMusclePathA.e().size() >= 2 && !this.f23775a) {
                            c(healthTrainBodyViewD, viewB, healthMusclePathA.e().get(1), canvas);
                        } else {
                            c(healthTrainBodyViewD, viewB, healthMusclePathA.e().get(0), canvas);
                        }
                    }
                }
            }
        }
    }

    private void c(Canvas canvas, float f, float f2) {
        this.f.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f.setColor(this.h);
        canvas.drawCircle(f, f2, pao.e(getContext(), 3.0f), this.f);
        this.f.setStyle(Paint.Style.STROKE);
        this.f.setColor(this.i);
        canvas.drawCircle(f, f2, pao.e(getContext(), 3.0f), this.f);
    }

    private float c(int i, float f, float f2, float f3) {
        if (i == 1) {
            if (this.f23775a) {
                return f + f2;
            }
        } else {
            if (i != 2) {
                return -1.0f;
            }
            if (!this.f23775a) {
                return f + f2;
            }
        }
        return f + f2 + f3;
    }

    private float e(int i, float f, float f2) {
        if (i == 1) {
            if (this.f23775a) {
                return f + f2 + pao.e(getContext(), 7.0f);
            }
            return f - pao.e(getContext(), 7.0f);
        }
        if (i != 2) {
            return -1.0f;
        }
        if (this.f23775a) {
            return f - pao.e(getContext(), 7.0f);
        }
        return f + f2 + pao.e(getContext(), 7.0f);
    }

    private void c(HealthTrainBodyView healthTrainBodyView, View view, qoq qoqVar, Canvas canvas) {
        ViewGroup viewGroupD = d(view.getParent());
        if (viewGroupD == null) {
            return;
        }
        float fE = e(healthTrainBodyView.getType(), viewGroupD.getX() + view.getX(), view.getWidth());
        if (a(fE)) {
            return;
        }
        float x = healthTrainBodyView.getX();
        float scaleX = healthTrainBodyView.getScaleX();
        float fD = pao.d(getContext());
        float fB = qoqVar.b();
        ViewGroup viewGroupD2 = d(healthTrainBodyView.getParent());
        if (viewGroupD2 == null) {
            return;
        }
        float x2 = viewGroupD2.getX();
        float y = viewGroupD2.getY();
        float f = x + x2 + (fB * scaleX * fD);
        if (a(f)) {
            return;
        }
        float scaleY = healthTrainBodyView.getScaleY();
        float fD2 = qoqVar.d();
        float y2 = healthTrainBodyView.getY();
        this.d.reset();
        float y3 = viewGroupD.getY() + view.getY() + (view.getHeight() / 2.0f);
        int width = healthTrainBodyView.getWidth();
        this.d.moveTo(fE, y3);
        float fE2 = e(healthTrainBodyView.getType(), x, x2, width, y3);
        if (a(fE2)) {
            return;
        }
        float f2 = ((fD2 * fD) + y2 + y) * scaleY;
        this.d.lineTo(fE2, f2);
        this.d.lineTo(f, f2);
        canvas.drawPath(this.d, this.e);
        c(canvas, fE, y3);
    }

    private ViewGroup d(ViewParent viewParent) {
        if (viewParent instanceof ViewGroup) {
            return (ViewGroup) viewParent;
        }
        return null;
    }

    private float e(int i, float f, float f2, int i2, float f3) {
        float fC = c(i, f, f2, i2);
        if (a(fC)) {
            return -1.0f;
        }
        this.d.lineTo(fC, f3);
        return fC;
    }
}
