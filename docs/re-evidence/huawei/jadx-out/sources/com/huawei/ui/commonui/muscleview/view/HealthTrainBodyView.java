package com.huawei.ui.commonui.muscleview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.core.graphics.PathParser;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.muscleview.data.HealthBodyPath;
import com.huawei.ui.commonui.muscleview.data.HealthMusclePath;
import defpackage.pao;
import defpackage.qoq;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class HealthTrainBodyView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f23779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f23780c;
    private Paint d;
    private volatile List<HealthBodyPath> e;
    private int[] f;
    private float[] g;
    private int[] h;
    private volatile List<HealthBodyPath> i;
    private volatile List<HealthMusclePath> j;
    private SparseArray<Integer> m;
    private int o;

    public HealthTrainBodyView(Context context) {
        super(context);
        this.h = new int[]{getResources().getColor(R.color.emui_color_muscle_total_low), getResources().getColor(R.color.emui_color_muscle_total_top)};
        this.f = new int[]{getResources().getColor(R.color.emui_color_muscle_slight_top), getResources().getColor(R.color.emui_color_muscle_slight_top)};
        this.g = new float[]{0.0f, 1.0f};
        this.f23778a = getResources().getColor(R.color.emui_color_muscle_backgroud);
        this.f23780c = getResources().getColor(R.color.emui_color_muscle_body_backgroud);
        e();
    }

    public HealthTrainBodyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new int[]{getResources().getColor(R.color.emui_color_muscle_total_low), getResources().getColor(R.color.emui_color_muscle_total_top)};
        this.f = new int[]{getResources().getColor(R.color.emui_color_muscle_slight_top), getResources().getColor(R.color.emui_color_muscle_slight_top)};
        this.g = new float[]{0.0f, 1.0f};
        this.f23778a = getResources().getColor(R.color.emui_color_muscle_backgroud);
        this.f23780c = getResources().getColor(R.color.emui_color_muscle_body_backgroud);
        e();
    }

    public HealthTrainBodyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new int[]{getResources().getColor(R.color.emui_color_muscle_total_low), getResources().getColor(R.color.emui_color_muscle_total_top)};
        this.f = new int[]{getResources().getColor(R.color.emui_color_muscle_slight_top), getResources().getColor(R.color.emui_color_muscle_slight_top)};
        this.g = new float[]{0.0f, 1.0f};
        this.f23778a = getResources().getColor(R.color.emui_color_muscle_backgroud);
        this.f23780c = getResources().getColor(R.color.emui_color_muscle_body_backgroud);
        e();
    }

    private void e() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setColor(this.f23778a);
        Paint paint2 = new Paint();
        this.f23779b = paint2;
        paint2.setAntiAlias(true);
        this.f23779b.setStyle(Paint.Style.STROKE);
        this.f23779b.setColor(this.f23780c);
        this.f23779b.setStrokeWidth(1.0f);
        this.o = 1;
        invalidate();
    }

    public void setSecondColors(int... iArr) {
        this.h = iArr;
    }

    public void setFirstColors(int... iArr) {
        this.f = iArr;
    }

    public void setFrontViewData(List<HealthBodyPath> list, List<HealthMusclePath> list2, SparseArray<Integer> sparseArray) {
        this.o = 1;
        this.i = list;
        this.j = list2;
        this.m = sparseArray;
        c();
    }

    public void setBackViewData(List<HealthBodyPath> list, List<HealthMusclePath> list2, SparseArray<Integer> sparseArray) {
        this.o = 2;
        this.e = list;
        this.j = list2;
        this.m = sparseArray;
        c();
    }

    private void c() {
        if (this.j != null) {
            for (HealthMusclePath healthMusclePath : this.j) {
                if (healthMusclePath != null) {
                    if (this.m == null) {
                        break;
                    }
                    for (int i = 0; i < this.m.size(); i++) {
                        int iKeyAt = this.m.keyAt(i);
                        if (iKeyAt == healthMusclePath.c()) {
                            Paint paint = new Paint();
                            paint.setAntiAlias(true);
                            List<qoq> listE = healthMusclePath.e();
                            if (listE != null && !listE.isEmpty()) {
                                int iIntValue = this.m.get(iKeyAt).intValue();
                                for (qoq qoqVar : listE) {
                                    if (qoqVar != null) {
                                        if (iIntValue >= 1) {
                                            LinearGradient linearGradient = new LinearGradient(qoqVar.h(), qoqVar.f(), qoqVar.h(), qoqVar.a(), iIntValue > 1 ? this.h : this.f, this.g, Shader.TileMode.CLAMP);
                                            Paint paint2 = new Paint();
                                            paint2.setAntiAlias(true);
                                            paint2.setShader(linearGradient);
                                            qoqVar.e(paint2);
                                            paint = paint2;
                                        } else {
                                            paint.setColor(this.f23778a);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.o;
        if (i == 1) {
            e(canvas);
        } else if (i != 2) {
            return;
        } else {
            d(canvas);
        }
        c(canvas);
    }

    private void c(Canvas canvas) {
        if (this.j == null || this.j.isEmpty()) {
            return;
        }
        for (HealthMusclePath healthMusclePath : this.j) {
            if (healthMusclePath != null && healthMusclePath.e() != null && !healthMusclePath.e().isEmpty()) {
                for (qoq qoqVar : healthMusclePath.e()) {
                    if (qoqVar != null && qoqVar.e() != null) {
                        int iSave = canvas.save();
                        canvas.scale(pao.d(getContext()), pao.d(getContext()));
                        canvas.drawPath(PathParser.createPathFromPathData(qoqVar.c()), qoqVar.e());
                        canvas.restoreToCount(iSave);
                    }
                }
            }
        }
    }

    private void e(Canvas canvas) {
        if (this.i == null || this.i.isEmpty()) {
            return;
        }
        d(canvas, this.i);
    }

    private void d(Canvas canvas) {
        if (this.e == null || this.e.isEmpty()) {
            return;
        }
        d(canvas, this.e);
    }

    public HealthMusclePath a(int i) {
        for (HealthMusclePath healthMusclePath : this.j) {
            if (healthMusclePath != null && i == healthMusclePath.c()) {
                return healthMusclePath;
            }
        }
        return null;
    }

    public int getType() {
        return this.o;
    }

    public void setBgColor(int i) {
        this.f23778a = i;
        this.d.setColor(i);
        invalidate();
    }

    private void d(Canvas canvas, List<HealthBodyPath> list) {
        boolean z = true;
        for (HealthBodyPath healthBodyPath : list) {
            if (healthBodyPath != null) {
                int iSave = canvas.save();
                canvas.scale(pao.d(getContext()), pao.d(getContext()));
                if (z) {
                    canvas.drawPath(PathParser.createPathFromPathData(healthBodyPath.e()), this.f23779b);
                    canvas.restoreToCount(iSave);
                    z = false;
                } else {
                    canvas.drawPath(PathParser.createPathFromPathData(healthBodyPath.e()), this.d);
                    canvas.restoreToCount(iSave);
                }
            }
        }
    }
}
