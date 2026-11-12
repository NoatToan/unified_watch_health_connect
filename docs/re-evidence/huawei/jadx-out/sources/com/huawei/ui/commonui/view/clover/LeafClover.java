package com.huawei.ui.commonui.view.clover;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.View;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import defpackage.qnj;
import defpackage.qre;
import defpackage.qtg;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class LeafClover extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Path f24009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Paint f24010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private qtg f24011c;
    private Path d;
    private boolean e;
    private boolean f;
    private Paint g;
    private PointF h;
    private boolean i;
    private PointF j;

    public LeafClover(Context context) {
        this(context, null);
    }

    public LeafClover(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LeafClover(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new PointF(69.476f, 80.993f);
        this.j = new PointF(65.261f, 84.021f);
        this.d = new Path();
        this.f24009a = new Path();
        d(context, attributeSet);
    }

    private void d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.cloverView);
        this.e = typedArrayObtainStyledAttributes.getBoolean(R.styleable.cloverView_isShowLeafAnimator, false);
        this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.cloverView_isShowIcon, false);
        this.i = typedArrayObtainStyledAttributes.getBoolean(R.styleable.cloverView_isShowDefaultFourLeaf, false);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f24010b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.g = new Paint(1);
        this.d.moveTo(46.454f, 68.223f);
        this.d.lineTo(34.381f, 80.296f);
        this.d.cubicTo(33.414f, 81.263f, 31.847f, 81.263f, 30.88f, 80.296f);
        this.d.lineTo(18.616f, 68.032f);
        this.d.cubicTo(12.679f, 62.095f, 7.69f, 55.28f, 3.826f, 47.826f);
        this.d.lineTo(3.702f, 47.587f);
        this.d.cubicTo(1.164f, 42.693f, 0.0f, 37.585f, 0.0f, 32.608f);
        this.d.cubicTo(0.0f, 15.528f, 13.709f, 0.0f, 32.63f, 0.0f);
        this.d.cubicTo(51.552f, 0.0f, 65.261f, 15.528f, 65.261f, 32.608f);
        this.d.cubicTo(65.261f, 37.585f, 64.097f, 42.693f, 61.56f, 47.587f);
        this.d.cubicTo(57.612f, 55.199f, 52.518f, 62.159f, 46.454f, 68.223f);
        this.f24009a.moveTo(10.175f, 10.278f);
        this.f24009a.cubicTo(23.74f, -3.426f, 45.735f, -3.426f, 59.301f, 10.278f);
        this.f24009a.cubicTo(72.867f, 23.981f, 72.867f, 46.199f, 59.301f, 59.902f);
        this.f24009a.cubicTo(45.735f, 73.605f, 37.343f, 77.745f, 36.37f, 78.458f);
        this.f24009a.cubicTo(35.396f, 79.171f, 34.079f, 79.171f, 33.106f, 78.458f);
        this.f24009a.cubicTo(32.133f, 77.745f, 23.74f, 73.605f, 10.175f, 59.902f);
        this.f24009a.cubicTo(-3.391f, 46.199f, -3.391f, 23.981f, 10.175f, 10.278f);
        b();
    }

    private void b() {
        boolean z = this.i;
        if (!z) {
            LogUtil.j("FourLeafClover", "initCloverLeafData mIsShowDefaultLeaf : ", Boolean.valueOf(z));
            return;
        }
        qtg qtgVar = new qtg();
        this.f24011c = qtgVar;
        qtgVar.c(4);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new qtg.c.a().c(qre.c(R.drawable.icon_sleep)).b(0.0f).d(new int[]{R.color.clover_bg_start_sleep, R.color.clover_bg_end_sleep}).b(new int[]{R.color.clover_start_sleep, R.color.clover_end_sleep}).c());
        arrayList.add(new qtg.c.a().c(qre.c(R.drawable.icon_sport_new)).b(0.0f).d(new int[]{R.color.clover_bg_start_sport, R.color.clover_bg_end_sport}).b(new int[]{R.color.clover_start_sport, R.color.clover_end_sport}).c());
        arrayList.add(new qtg.c.a().c(qre.c(R.drawable.icon_emotion)).b(0.0f).d(new int[]{R.color.clover_bg_start_emotion, R.color.clover_bg_end_emotion}).b(new int[]{R.color.clover_start_emotion, R.color.clover_end_emotion}).c());
        arrayList.add(new qtg.c.a().c(qre.c(R.drawable.icon_diet)).b(0.0f).d(new int[]{R.color.clover_bg_start_diet, R.color.clover_bg_end_diet}).b(new int[]{R.color.clover_start_diet, R.color.clover_end_diet}).c());
        this.f24011c.c(arrayList);
    }

    public void setCloverLeafData(qtg qtgVar) {
        if (qtgVar == null || CollectionUtils.a(qtgVar.d())) {
            LogUtil.j("FourLeafClover", "mCloverLeafData is null or LeafList is empty");
        } else {
            this.f24011c = qtgVar;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24011c == null) {
            LogUtil.j("FourLeafClover", "mCloverLeafData is null");
        } else {
            c(canvas);
        }
    }

    private void c(Canvas canvas) {
        float f;
        float f2;
        float fMin = Math.min(getWidth(), getHeight());
        float f3 = fMin / 2.0f;
        float f4 = fMin / 156.0f;
        List<qtg.c> listD = this.f24011c.d();
        int size = listD.size();
        PointF pointF = size > 3 ? this.j : this.h;
        Path path = size > 3 ? this.d : this.f24009a;
        float f5 = size > 3 ? 0.0f : 12.0f;
        canvas.save();
        canvas.scale(f4, f4, f3, f3);
        canvas.translate(f3 - (pointF.x / 2.0f), (f3 - pointF.y) + f5);
        for (int i = 0; i < size; i++) {
            canvas.save();
            float f6 = i;
            if (size > 3) {
                f2 = f6 * 90.0f;
                f = 45.0f;
            } else {
                f = 120.0f;
                f2 = f6 * 120.0f;
            }
            float f7 = f2 - f;
            canvas.rotate(f7, pointF.x / 2.0f, pointF.y);
            this.f24010b.setShader(listD.get(i).d());
            canvas.drawPath(path, this.f24010b);
            if (!qnj.a(listD.get(i).e(), 0.0f)) {
                float fSqrt = (float) Math.sqrt(Math.max(listD.get(i).e(), 10.0f) / 100.0f);
                this.f24010b.setShader(listD.get(i).a());
                canvas.scale(fSqrt, fSqrt, pointF.x / 2.0f, pointF.y);
                canvas.drawPath(path, this.f24010b);
            }
            canvas.restore();
            if (this.f && listD.get(i).c() != null) {
                canvas.save();
                canvas.rotate(f7, pointF.x / 2.0f, pointF.y);
                canvas.rotate(-f7, pointF.x / 2.0f, (pointF.y - 7.0f) - 8.0f);
                int i2 = ((int) (pointF.x - 16.0f)) / 2;
                int i3 = (int) ((pointF.y - 7.0f) - 16.0f);
                listD.get(i).c().setBounds(i2, i3, i2 + 16, i3 + 16);
                listD.get(i).c().draw(canvas);
                canvas.restore();
            }
        }
    }
}
