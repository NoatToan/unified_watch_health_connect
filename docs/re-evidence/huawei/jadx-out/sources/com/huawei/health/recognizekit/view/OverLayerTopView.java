package com.huawei.health.recognizekit.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.health.recognizekit.R;
import defpackage.guo;
import defpackage.gup;
import health.compact.a.LogUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public class OverLayerTopView extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f8685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f8686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f8687c;
    private boolean d;
    private boolean e;
    private Bitmap f;
    private RectF g;
    private int h;
    private Context i;
    private int j;
    private int k;
    private float l;
    private float m;
    private Paint n;
    private Paint o;
    private int p;
    private Paint q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private Bitmap w;
    private Bitmap x;
    private boolean y;

    public OverLayerTopView(Context context) {
        this(context, null, 0);
    }

    public OverLayerTopView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverLayerTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = null;
        this.f8685a = false;
        this.d = false;
        this.e = true;
        this.f8687c = true;
        this.y = true;
        e(context);
    }

    private void e(Context context) {
        c();
        this.i = context;
        b(context);
    }

    private void b(Context context) {
        Point pointE = gup.e(context);
        this.g = gup.d(this.i);
        this.v = pointE.x;
        int i = pointE.y;
        this.u = i;
        this.k = this.v;
        this.p = 0;
        this.h = i;
    }

    private void c() {
        Paint paint = new Paint(1);
        this.n = paint;
        paint.setColor(Color.parseColor("#66FFFFFF"));
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(5.0f);
        this.o = new Paint(1);
        Paint paint2 = new Paint(1);
        this.q = paint2;
        paint2.setColor(Color.parseColor("#FF0D9FFB"));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.s = motionEvent.getX();
            this.t = motionEvent.getY();
            this.f8685a = e();
            LogUtil.b("OverLayerTopView", "onTouchEvent action_down mTouchX: " + this.s + " mTouchY:" + this.t + " isValidTouch:" + this.f8685a);
        } else if (action == 1) {
            this.f8685a = false;
        } else if (action == 2) {
            this.m = motionEvent.getX();
            this.l = motionEvent.getY();
            h();
        }
        return true;
    }

    private void h() {
        if (this.f8685a && this.e) {
            float f = this.m;
            boolean z = f > 0.0f && f < ((float) this.k);
            float f2 = this.l;
            if (f2 <= this.p || f2 >= this.h || !z) {
                return;
            }
            this.g = gup.d(f, f2, this.r, this.g);
            postInvalidate();
        }
    }

    public void b(boolean z) {
        this.y = z;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        RectF rectF = this.g;
        if (rectF == null) {
            return;
        }
        if (this.y) {
            canvas.drawRoundRect(rectF, 8.0f, 8.0f, this.n);
            a(canvas);
        }
        if (this.d) {
            if (this.j < this.g.top) {
                this.j = (int) this.g.top;
                this.f8687c = true;
            }
            if (this.j < this.g.bottom && this.f8687c) {
                this.j += 10;
            } else {
                this.j -= 10;
                this.f8687c = false;
            }
            canvas.drawRect(this.g.left + 5.0f, this.j - 3, this.g.right - 5.0f, this.j + 3, this.q);
            postInvalidateDelayed(10L, (int) this.g.left, (int) this.g.top, (int) this.g.right, (int) this.g.bottom);
        }
        super.onDraw(canvas);
    }

    private void a(Canvas canvas) {
        Bitmap bitmap = this.f;
        if (bitmap == null || bitmap.isRecycled()) {
            this.f = BitmapFactory.decodeResource(getResources(), R.drawable.rect_round_corner);
        }
        Bitmap bitmap2 = this.w;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            this.w = guo.a(this.f, 90.0f);
        }
        Bitmap bitmap3 = this.x;
        if (bitmap3 == null || bitmap3.isRecycled()) {
            this.x = guo.a(this.f, 180.0f);
        }
        Bitmap bitmap4 = this.f8686b;
        if (bitmap4 == null || bitmap4.isRecycled()) {
            this.f8686b = guo.a(this.f, -90.0f);
        }
        canvas.drawBitmap(this.f, this.g.left - 20.0f, this.g.top - 20.0f, this.o);
        canvas.drawBitmap(this.w, this.g.right - 50.0f, this.g.top - 20.0f, this.o);
        canvas.drawBitmap(this.x, this.g.right - 50.0f, this.g.bottom - 50.0f, this.o);
        canvas.drawBitmap(this.f8686b, this.g.left - 20.0f, this.g.bottom - 50.0f, this.o);
    }

    private boolean e() {
        ArrayList<RectF> arrayListE = gup.e(this.g);
        if (arrayListE == null) {
            return false;
        }
        for (int i = 0; i < arrayListE.size(); i++) {
            if (arrayListE.get(i).contains(this.s, this.t)) {
                this.r = i;
                return true;
            }
        }
        return false;
    }

    public void b() {
        LogUtil.b("OverLayerTopView", "startScanAnimation");
        this.d = true;
        this.e = false;
        this.j = (int) this.g.top;
        postInvalidate();
    }

    public void a() {
        LogUtil.b("OverLayerTopView", "endScanAnimation");
        this.d = false;
        this.e = true;
        postInvalidate();
    }

    public RectF getCenterRect() {
        return this.g;
    }

    public void d() {
        if (this.i == null) {
            LogUtil.d("OverLayerTopView", "refreshRect mContext is null");
            return;
        }
        LogUtil.b("OverLayerTopView", "refresh on TahitiModel");
        b(this.i);
        postInvalidate();
    }

    public void setMaxDragRange(Bitmap bitmap) {
        LogUtil.b("OverLayerTopView", "setMaxDragRange");
        RectF rectFA = gup.a(bitmap, gup.e(this.i));
        this.p = (int) rectFA.top;
        this.h = (int) rectFA.bottom;
        this.g = gup.e(bitmap.getWidth(), bitmap.getHeight(), this.i);
        postInvalidate();
    }

    public void setMaxRectHeight(int i) {
        this.h = i;
    }
}
