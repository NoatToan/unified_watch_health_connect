package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.healthcloud.plugintrack.R;
import defpackage.jst;
import defpackage.njy;
import health.compact.a.LanguageUtil;
import health.compact.a.LogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class TimelineCanvasView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private RectF f11333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Path f11334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Paint f11335c;
    private float d;
    private float e;
    private List<jst> j;

    public TimelineCanvasView(Context context) {
        this(context, null);
    }

    public TimelineCanvasView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimelineCanvasView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = new ArrayList();
        this.d = b(1.0f);
        this.e = b(8.0f);
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        this.f11335c = new Paint(1);
        this.f11333a = new RectF();
        this.f11334b = new Path();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.TimelineCanvasView);
            this.d = typedArrayObtainStyledAttributes.getDimension(R.styleable.TimelineCanvasView_gapWidth, this.d);
            this.e = typedArrayObtainStyledAttributes.getDimension(R.styleable.TimelineCanvasView_cornerRadius, this.e);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.j.isEmpty() || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Iterator<jst> it = this.j.iterator();
        float fA = 0.0f;
        while (it.hasNext()) {
            fA += it.next().a();
        }
        if (fA == 0.0f) {
            return;
        }
        float width = ((getWidth() - getPaddingLeft()) - getPaddingRight()) - (this.d * (this.j.size() - 1));
        if (width < 0.0f) {
            return;
        }
        float paddingTop = getPaddingTop();
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float paddingLeft = getPaddingLeft();
        float fB = b(1.0f);
        Context context = getContext();
        if (context == null) {
            LogUtil.d("TimelineCanvasView", "context is null");
            return;
        }
        ArrayList arrayList = new ArrayList(this.j);
        if (LanguageUtil.ba(context)) {
            Collections.reverse(arrayList);
        }
        float f = paddingLeft;
        int i = 0;
        while (i < arrayList.size()) {
            jst jstVar = (jst) arrayList.get(i);
            float fA2 = (jstVar.a() / fA) * width;
            if (fA2 > 0.0f && height > 0.0f) {
                d(canvas, f, paddingTop, fA2, height, jstVar.d(), i == 0, i == arrayList.size() - 1, this.e, fB);
            }
            f += fA2 + this.d;
            i++;
            arrayList = arrayList;
            paddingTop = paddingTop;
        }
    }

    private void d(Canvas canvas, float f, float f2, float f3, float f4, int i, boolean z, boolean z2, float f5, float f6) {
        this.f11335c.setColor(i);
        this.f11333a.set(f, f2, f3 + f, f4 + f2);
        this.f11334b.reset();
        if (z && z2) {
            this.f11334b.addRoundRect(this.f11333a, f5, f5, Path.Direction.CW);
        } else if (z) {
            this.f11334b.addRoundRect(this.f11333a, new float[]{f5, f5, f6, f6, f6, f6, f5, f5}, Path.Direction.CW);
        } else if (z2) {
            this.f11334b.addRoundRect(this.f11333a, new float[]{f6, f6, f5, f5, f5, f5, f6, f6}, Path.Direction.CW);
        } else {
            this.f11334b.addRoundRect(this.f11333a, f6, f6, Path.Direction.CW);
        }
        canvas.drawPath(this.f11334b, this.f11335c);
    }

    public void setSegments(List<jst> list) {
        this.j.clear();
        if (njy.b(list)) {
            this.j.addAll(list);
        }
        invalidate();
    }

    public void setGapWidth(float f) {
        this.d = f;
        invalidate();
    }

    public void setCornerRadius(float f) {
        this.e = f;
        invalidate();
    }

    public float getGapWidth() {
        return this.d;
    }

    private float b(float f) {
        return f * getResources().getDisplayMetrics().density;
    }
}
