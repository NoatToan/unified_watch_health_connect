package com.huawei.ui.main.stories.fitness.views.vo2max;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.njy;
import defpackage.ukj;
import defpackage.unc;
import defpackage.und;
import health.compact.a.LanguageUtil;
import health.compact.a.UnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class Vo2maxDetailView extends View {
    private float aa;
    private float ab;
    private float ac;
    private float ad;
    private RectF ae;
    private float af;
    private float ag;
    private ArrayList<und> ah;
    private float ai;
    private float aj;
    private float ak;
    private float al;
    private int am;
    private float an;
    private float f;
    private float g;
    private float i;
    private float k;
    private Paint l;
    private List<String> m;
    private float n;
    private Paint o;
    private float p;
    private und q;
    private ArrayList<unc> r;
    private Context s;
    private float t;
    private int u;
    private float v;
    private int w;
    private boolean x;
    private int y;
    private float z;
    private static final int h = Color.parseColor("#ff3320");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27351c = Color.parseColor("#fb6522");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f27349a = Color.parseColor("#f5a623");
    private static final int d = Color.parseColor("#e6d420");
    private static final int e = Color.parseColor("#75df3e");
    private static final int j = Color.parseColor("#01c1f2");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f27350b = Color.parseColor("#1f8dff");

    public Vo2maxDetailView(Context context) {
        super(context);
        this.ad = 0.0f;
        this.z = 0.0f;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.aa = 0.0f;
        this.r = new ArrayList<>();
        this.m = new ArrayList();
        this.x = false;
        this.w = 50;
        this.u = 42;
        this.y = 2;
        this.am = 1;
        this.o = new Paint();
        this.ah = new ArrayList<>();
        this.l = new Paint();
        this.g = 23.0f;
        this.i = 2.0f;
        this.ae = new RectF();
        this.ai = 0.0f;
        this.ag = 0.0f;
        this.af = 50.0f;
        this.ak = 50.0f;
        this.s = context;
        c();
    }

    public Vo2maxDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ad = 0.0f;
        this.z = 0.0f;
        this.ab = 0.0f;
        this.ac = 0.0f;
        this.aa = 0.0f;
        this.r = new ArrayList<>();
        this.m = new ArrayList();
        this.x = false;
        this.w = 50;
        this.u = 42;
        this.y = 2;
        this.am = 1;
        this.o = new Paint();
        this.ah = new ArrayList<>();
        this.l = new Paint();
        this.g = 23.0f;
        this.i = 2.0f;
        this.ae = new RectF();
        this.ai = 0.0f;
        this.ag = 0.0f;
        this.af = 50.0f;
        this.ak = 50.0f;
        this.s = context;
        c();
    }

    private void c() {
        this.k = ukj.b(1, 2.0f);
        Paint paint = new Paint();
        this.o = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.o.setColor(getResources().getColor(R.color.textColorTertiary));
        this.o.setStrokeWidth(this.k);
    }

    public void setType(int i) {
        this.am = i;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.an = getDefaultSize(getSuggestedMinimumWidth(), i);
        this.aj = getDefaultSize(getSuggestedMinimumHeight(), i2);
        this.ab = ukj.b(1, 6.0f);
        this.z = ukj.b(1, 40.0f);
        this.aa = ukj.b(1, 20.0f);
        Paint paint = new Paint();
        paint.setTextSize(ukj.b(0, this.s.getResources().getDimension(R.dimen.fitness_details_bar_chart_view_text_size)));
        this.ad = paint.measureText("00");
        float fMeasureText = paint.measureText("000000");
        this.ac = fMeasureText;
        this.v = (this.an - this.ad) - fMeasureText;
        this.t = this.aj - this.aa;
        this.n = ukj.b(1, 6.0f);
        this.p = ukj.b(1, 16.0f);
        this.f = ukj.b(1, 3.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        c(canvas);
        b(canvas);
        d(canvas);
        a(canvas);
        a(canvas, this.q);
    }

    private void a(Canvas canvas) {
        boolean z;
        if (njy.e(this.r)) {
            return;
        }
        Path path = new Path();
        boolean z2 = true;
        if (this.r.size() - 1 == 0) {
            LogUtil.j("Track_Vo2maxDetailView", "mDataSet size should be more than one");
            return;
        }
        this.al = this.v / (this.r.size() - 1);
        if (this.q == null) {
            this.ah.clear();
            z = true;
        } else {
            z = false;
        }
        for (int i = 0; i < this.r.size(); i++) {
            if (this.r.get(i).b() != 0) {
                float f = i;
                float f2 = this.ad + (this.al * f);
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    f2 = (this.ac + this.v) - (this.al * f);
                }
                float fE = e(this.r.get(i).b());
                c(f2, fE, z, i);
                if (z2) {
                    path.moveTo(f2, fE);
                    z2 = false;
                } else {
                    path.lineTo(f2, fE);
                }
            }
        }
        canvas.drawPath(path, this.o);
        for (int i2 = 0; i2 < this.r.size(); i2++) {
            if (this.r.get(i2).b() != 0) {
                float f3 = i2;
                float f4 = this.ad + (this.al * f3);
                if (LanguageUtil.ba(BaseApplication.getContext())) {
                    f4 = (this.ac + this.v) - (this.al * f3);
                }
                float fE2 = e(this.r.get(i2).b());
                Bitmap bitmapA = a(this.r.get(i2).a());
                canvas.drawBitmap(bitmapA, f4 - (bitmapA.getHeight() / 2.0f), fE2 - (bitmapA.getHeight() / 2.0f), (Paint) null);
            }
        }
    }

    private void c(float f, float f2, boolean z, int i) {
        if (z) {
            und undVar = new und();
            undVar.b(new PointF(f, ((f2 - (this.n / 2.0f)) - this.i) - this.f));
            if (njy.c(this.r, i) && this.r.get(i) != null) {
                undVar.d(this.r.get(i).a());
                undVar.e(this.r.get(i).b());
                undVar.b(UnitUtil.e(this.r.get(i).b(), 1, 0));
            }
            float f3 = this.p;
            undVar.a(new RectF(f - f3, f2 - f3, f + f3, f2 + f3));
            this.ah.add(undVar);
            und undVar2 = this.q;
            if (undVar2 == null || undVar2.e() <= undVar.e()) {
                this.q = undVar;
            }
        }
    }

    private Bitmap a(int i) {
        int i2;
        switch (i) {
            case 0:
                i2 = R.drawable.health_healthdata_vo2max_spot_low;
                break;
            case 1:
                i2 = R.drawable.health_healthdata_vo2max_spot_amateur;
                break;
            case 2:
                i2 = R.drawable.health_healthdata_vo2max_spot_normal;
                break;
            case 3:
                i2 = R.drawable.health_healthdata_vo2max_spot_higher;
                break;
            case 4:
                i2 = R.drawable.health_healthdata_vo2max_spot_good;
                break;
            case 5:
                i2 = R.drawable.health_healthdata_vo2max_spot_excellent;
                break;
            case 6:
                i2 = R.drawable.health_healthdata_vo2max_spot_major;
                break;
            default:
                i2 = R.drawable.health_healthdata_vo2max_spot_higher;
                break;
        }
        return BitmapFactory.decodeResource(this.s.getResources(), i2);
    }

    private float e(float f) {
        int i = this.w;
        int i2 = this.u;
        int i3 = i - i2;
        if (i3 <= 0) {
            LogUtil.j("Track_Vo2maxDetailView", "mMaxVo2max - mMinVo2max == 0");
            return 0.0f;
        }
        float f2 = this.z;
        return f2 + ((this.t - f2) * (1.0f - ((f - i2) / i3)));
    }

    private void d(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-5394769);
        paint.setStrokeWidth(1.0f);
        paint.setPathEffect(new DashPathEffect(new float[]{4.0f, 2.0f, 4.0f, 2.0f}, 1.0f));
        Paint paint2 = new Paint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(getResources().getColor(R.color.health_chart_default_line_color));
        CornerPathEffect cornerPathEffect = new CornerPathEffect(10.0f);
        paint.setStrokeWidth(1.0f);
        paint2.setPathEffect(cornerPathEffect);
        Paint paint3 = new Paint();
        paint3.setColor(getResources().getColor(R.color.textColorSecondary));
        paint3.setTextSize(ukj.b(0, this.s.getResources().getDimension(R.dimen.fitness_details_bar_chart_view_text_size)));
        paint3.setAntiAlias(true);
        float f = this.ab;
        canvas.drawLine(0.0f, f, this.an, f, paint2);
        c cVar = new c();
        cVar.d(canvas);
        cVar.d(paint);
        cVar.e(new Path());
        cVar.a(paint3);
        cVar.c(ukj.e().c(paint, "0") + 5.0f);
        cVar.e(0.0f);
        e(cVar, this.w);
        e(cVar, this.w - this.y);
        e(cVar, this.w - (this.y * 2));
        e(cVar, this.w - (this.y * 3));
    }

    private void e(c cVar, int i) {
        float fE = e(i);
        Path pathB = cVar.b();
        pathB.moveTo(0.0f, fE);
        pathB.lineTo(this.an, fE);
        Canvas canvasC = cVar.c();
        Paint paintD = cVar.d();
        canvasC.drawPath(pathB, paintD);
        if (this.x) {
            String strE = UnitUtil.e(i, 1, 0);
            float fA = cVar.a();
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                fA = (this.an - paintD.measureText(strE)) - 50.0f;
            }
            if (i >= 0) {
                float f = this.v;
                float f2 = this.ac;
                canvasC.drawText(strE, (((f + f2) - fA) - paintD.measureText(strE)) - 10.0f, fE + cVar.e() + 20.0f, cVar.h());
            }
        }
    }

    private void c(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.health_chart_default_line_color));
        paint.setStrokeWidth(1.0f);
        float f = this.t;
        canvas.drawLine(0.0f, f, this.an, f, paint);
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.textColorSecondary));
        paint.setTextSize(ukj.b(0, this.s.getResources().getDimension(R.dimen.fitness_details_bar_chart_date_text_size)));
        paint.setAntiAlias(true);
        for (int i = 0; i < this.m.size(); i++) {
            String str = this.m.get(i);
            float fMeasureText = (int) paint.measureText(str, 0, str.length());
            float size = (this.ad + ((this.v / (this.m.size() - 1)) * i)) - (fMeasureText / 2.0f);
            if (size < 0.0f) {
                size = 0.0f;
            }
            float f = this.an;
            if (size + fMeasureText > f) {
                size = f - fMeasureText;
            }
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                size = (this.an - size) - fMeasureText;
            }
            canvas.drawText(str, size, this.aj - (this.aa / 3.0f), paint);
        }
    }

    private void a(Canvas canvas, und undVar) {
        if (!this.x || this.q == null) {
            return;
        }
        this.l.setAntiAlias(true);
        this.l.setTextSize(ukj.b(1, 12.0f));
        String strB = undVar.b();
        float fB = ukj.e().b(this.l);
        this.ai = ukj.e().e(this.l, strB) + (this.g * 2.0f);
        this.ag = (this.i * 2.0f) + fB;
        float fB2 = ukj.b(1, 4.0f);
        float f = undVar.c().x;
        float f2 = undVar.c().y;
        float f3 = this.ai / 2.0f;
        this.ae.left = f - f3;
        this.ae.right = f + f3;
        this.ae.top = (f2 - this.ag) - fB2;
        this.ae.bottom = f2;
        float f4 = 1.5f * fB2;
        this.ae.top -= f4;
        this.ae.bottom -= f4;
        float fWidth = this.ae.left + (this.ae.width() * 0.5f);
        float f5 = this.ae.bottom;
        Path path = new Path();
        path.moveTo(fWidth + fB2, f5);
        path.lineTo(fWidth, f4 + f5);
        path.lineTo(fWidth - fB2, f5);
        path.close();
        a aVar = new a();
        aVar.d(canvas);
        aVar.e(undVar);
        aVar.d(fB2);
        aVar.e(fWidth);
        aVar.c(f5);
        aVar.b(path);
        b(aVar);
        d(canvas, strB, fB);
    }

    private void d(Canvas canvas, String str, float f) {
        float f2 = this.ae.left;
        float f3 = this.g;
        float f4 = this.ae.top;
        float f5 = this.i;
        this.l.setColor(-1);
        canvas.drawText(str, f2 + f3, ((f4 + f5) + f) - 2.0f, this.l);
    }

    private void b(a aVar) {
        if (this.ae.right > this.an) {
            this.ae.left -= this.ae.right - this.an;
            this.ae.right = this.an;
        }
        if (this.ae.left < 0.0f) {
            this.ae.right -= this.ae.left;
            this.ae.left = 0.0f;
        }
        this.l.setColor(e(aVar.d().d()));
        Canvas canvasB = aVar.b();
        canvasB.drawRoundRect(this.ae, this.af, this.ak, this.l);
        Path pathF = aVar.f();
        canvasB.drawPath(pathF, this.l);
        pathF.reset();
        this.l.setStrokeWidth(2.0f);
        float fC = aVar.c();
        float fE = aVar.e();
        float fA = aVar.a();
        canvasB.drawLine(fC - fE, fA, fC + fE, fA, this.l);
    }

    private int e(int i) {
        switch (i) {
            case 0:
                return h;
            case 1:
                return f27351c;
            case 2:
                return f27349a;
            case 3:
                return d;
            case 4:
                return e;
            case 5:
                return j;
            case 6:
                return f27350b;
            default:
                return d;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            LogUtil.j("Track_Vo2maxDetailView", "onTouchEvent event == null");
            return false;
        }
        if (motionEvent.getAction() != 0) {
            return true;
        }
        a(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    private void a(float f, float f2) {
        for (int i = 0; i < this.ah.size(); i++) {
            und undVar = this.ah.get(i);
            if (a(f, f2, undVar.a())) {
                LogUtil.a("Track_Vo2maxDetailView", "triggerClick eventX = ", Float.valueOf(f), " eventY = ", Float.valueOf(f2), "  data.mRect = ", undVar.a().toString());
                this.q = undVar;
                break;
            }
        }
        invalidate();
    }

    private boolean a(float f, float f2, RectF rectF) {
        return f >= rectF.left && f <= rectF.right && f2 >= rectF.top && f2 <= rectF.bottom;
    }

    private int getInterval() {
        return this.am != 2 ? 2 : 5;
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Canvas f27355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f27356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27357c;
        private Path d;
        private Paint e;
        private Paint j;

        c() {
        }

        public Canvas c() {
            return this.f27355a;
        }

        public void d(Canvas canvas) {
            this.f27355a = canvas;
        }

        public Paint d() {
            return this.e;
        }

        public void d(Paint paint) {
            this.e = paint;
        }

        public Path b() {
            return this.d;
        }

        public void e(Path path) {
            this.d = path;
        }

        public Paint h() {
            return this.j;
        }

        public void a(Paint paint) {
            this.j = paint;
        }

        public float e() {
            return this.f27357c;
        }

        public void c(float f) {
            this.f27357c = f;
        }

        public float a() {
            return this.f27356b;
        }

        public void e(float f) {
            this.f27356b = f;
        }
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f27352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private und f27353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f27354c;
        private Canvas d;
        private float e;
        private Path h;

        a() {
        }

        public Canvas b() {
            return this.d;
        }

        public void d(Canvas canvas) {
            this.d = canvas;
        }

        public und d() {
            return this.f27353b;
        }

        public void e(und undVar) {
            this.f27353b = undVar;
        }

        public float e() {
            return this.f27352a;
        }

        public void d(float f) {
            this.f27352a = f;
        }

        public float c() {
            return this.e;
        }

        public void e(float f) {
            this.e = f;
        }

        public float a() {
            return this.f27354c;
        }

        public void c(float f) {
            this.f27354c = f;
        }

        public Path f() {
            return this.h;
        }

        public void b(Path path) {
            this.h = path;
        }
    }
}
