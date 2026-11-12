package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.healthcloud.plugintrack.R;
import defpackage.njy;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TrackPaceColorGradientView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f11342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearGradient f11343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11344c;
    private boolean d;
    private Paint e;
    private RectF i;

    public TrackPaceColorGradientView(Context context) {
        this(context, null);
    }

    public TrackPaceColorGradientView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackPaceColorGradientView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = false;
        this.f11344c = context.getResources().getDimension(R.dimen.emui_corner_radius_progressbar);
        this.i = new RectF();
    }

    public void setColors(List<Integer> list) {
        if (njy.e(list)) {
            return;
        }
        this.f11342a = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f11342a[i] = list.get(i).intValue();
        }
    }

    public void setRadius(float f) {
        this.f11344c = f;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
        a(canvas);
    }

    private void a(Canvas canvas) {
        if (this.e == null) {
            return;
        }
        this.i.left = 0.0f;
        this.i.top = 0.0f;
        this.i.right = getWidth();
        this.i.bottom = getHeight();
        RectF rectF = this.i;
        float f = this.f11344c;
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    private void d() {
        int[] iArr = this.f11342a;
        if (iArr == null || iArr.length == 0 || this.d) {
            return;
        }
        this.d = true;
        Paint paint = new Paint();
        this.e = paint;
        paint.setStyle(Paint.Style.FILL);
        this.e.setPathEffect(new CornerPathEffect(this.f11344c));
        this.e.setAntiAlias(true);
        int[] iArr2 = this.f11342a;
        if (iArr2.length > 1) {
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, getWidth(), getHeight(), this.f11342a, (float[]) null, Shader.TileMode.MIRROR);
            this.f11343b = linearGradient;
            this.e.setShader(linearGradient);
            return;
        }
        this.e.setColor(iArr2[0]);
    }
}
