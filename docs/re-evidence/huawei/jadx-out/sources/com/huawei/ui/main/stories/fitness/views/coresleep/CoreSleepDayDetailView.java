package com.huawei.ui.main.stories.fitness.views.coresleep;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.main.R;
import defpackage.uig;
import defpackage.ukg;
import defpackage.wud;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes43.dex */
public class CoreSleepDayDetailView extends BaseSleepDayDetailView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OnClickViewDefaultListener f27238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f27239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f27240c;
    private boolean d;
    private long e;
    private float f;
    private String g;
    private PointF h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private int m;
    private float n;
    private float o;

    public interface OnClickViewDefaultListener {
        void onClickViewDefaultListener(String str, String str2, int i, boolean z);
    }

    public CoreSleepDayDetailView(Context context) {
        this(context, null);
        setBaseContext(context);
    }

    public CoreSleepDayDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27239b = false;
        this.h = new PointF(-1.0f, -1.0f);
        this.e = 0L;
        setBaseContext(context);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.ui.main.stories.fitness.views.coresleep.CoreSleepDayDetailView.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                CoreSleepDayDetailView.this.f27239b = true;
                return false;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setViewWidth(getDefaultSize(getSuggestedMinimumWidth(), i));
        setViewHeight(getDefaultSize(getSuggestedMinimumHeight(), i2));
        setDiagramWidth(getViewWidth() - wud.b(80.0f));
        setDiagramHeight(wud.b(158.0f));
        setTransparentHeight(getViewHeight() - wud.b(24.0f));
        setCursorHeight(getTransparentHeight());
        setCursorCenter(getViewWidth() / 2.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mCanvas = canvas;
        getTimeLabel();
        a(canvas);
        drawSleepRect(canvas);
        c();
        if (getIsDefault()) {
            d();
        }
        c(canvas);
        drawMaxSleepVerticalLine(canvas);
        b(canvas);
        drawCursorText(canvas);
        d(canvas);
    }

    private void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_extend_background_color));
        canvas.drawRect(0.0f, getTransparentHeight(), getViewWidth(), getViewHeight(), paint);
    }

    private void c() {
        OnClickViewDefaultListener onClickViewDefaultListener;
        ArrayList<ukg> cursorList = getCursorList();
        int size = cursorList != null ? cursorList.size() : 0;
        if (cursorList == null || size == 0) {
            if (getIsMove() || (onClickViewDefaultListener = this.f27238a) == null) {
                return;
            }
            onClickViewDefaultListener.onClickViewDefaultListener("", "", 0, getIsOnlyNoonSleepType());
            return;
        }
        ukg ukgVar = cursorList.get(size - 1);
        String str = ukgVar.j;
        this.g = str;
        OnClickViewDefaultListener onClickViewDefaultListener2 = this.f27238a;
        if (onClickViewDefaultListener2 != null) {
            onClickViewDefaultListener2.onClickViewDefaultListener(str, d(ukgVar.d), (int) ukgVar.f50289a, getIsOnlyNoonSleepType());
        }
    }

    private void d() {
        float fC;
        float chartBorderWidth;
        if (getLastData() != null) {
            if (!getIsOnlyNoonSleepType() && getIsScienceSleep()) {
                fC = ((getLastData().c() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            } else {
                fC = (getLastData().c() / 1440.0f) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            }
            float viewWidth = fC + chartBorderWidth;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                viewWidth = getViewWidth() - viewWidth;
            }
            if (!getIsMove()) {
                setCursorCenter(viewWidth + 1.0f);
            }
            OnClickViewDefaultListener onClickViewDefaultListener = this.f27238a;
            if (onClickViewDefaultListener != null) {
                onClickViewDefaultListener.onClickViewDefaultListener("", "", -1, getIsOnlyNoonSleepType());
                return;
            }
            return;
        }
        setCursorCenter(getViewWidth() / 2.0f);
    }

    private void c(Canvas canvas) {
        float fB;
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            return;
        }
        this.h.set(getCursorCenter(), getCursorHeight());
        c(this.h.x);
        if (this.f27240c && !this.d) {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            paint.setColor(this.m);
            RectF rectF = new RectF(this.l, this.k, this.o, getTransparentHeight());
            if (Math.abs(this.o - this.l) < wud.b(6.0f)) {
                fB = Math.abs(this.o - this.l) / 2.0f;
            } else {
                fB = wud.b(6.0f);
            }
            float[] fArr = {fB, fB, fB, fB, 0.0f, 0.0f, 0.0f, 0.0f};
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_extend_background_color));
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        float fB = wud.b(36.0f);
        float fB2 = wud.b(13.5f);
        path.moveTo(getCursorCenter() - fB, getCursorHeight());
        float cursorCenter = getCursorCenter();
        float f = (2.0f * fB) / 6.0f;
        float cursorHeight = getCursorHeight();
        float cursorCenter2 = getCursorCenter();
        path.cubicTo(cursorCenter - f, cursorHeight, cursorCenter2 - f, getCursorHeight() - fB2, getCursorCenter(), getCursorHeight() - fB2);
        float cursorCenter3 = getCursorCenter();
        float cursorHeight2 = getCursorHeight();
        float cursorCenter4 = getCursorCenter();
        float f2 = cursorCenter3 + f;
        float f3 = cursorHeight2 - fB2;
        float f4 = ((fB * 3.0f) / 6.0f) + cursorCenter4;
        path.cubicTo(f2, f3, f4, getCursorHeight(), getCursorCenter() + fB, getCursorHeight());
        canvas.drawPath(path, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(wud.b(7.0f), 0.0f, wud.b(3.0f), getBaseContext().getResources().getColor(R.color.health_chart_eye_shadow_color));
        paint.setColor(getBaseContext().getResources().getColor(R.color.colorBackground));
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + wud.b(1.0f), wud.b(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + wud.b(1.0f), wud.b(11.0f), paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_eye_color));
        paint.setAntiAlias(true);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + wud.b(1.0f), wud.b(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(wud.b(0.5f));
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_eye_shadow_color));
        paint.setAntiAlias(true);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + wud.b(1.0f), wud.b(11.25f), paint);
    }

    private void d(Canvas canvas) {
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            return;
        }
        Paint paint = new Paint();
        int[] iArr = {getBaseContext().getResources().getColor(R.color.color_deep_sleep_transparent), getBaseContext().getResources().getColor(R.color.color_deep_sleep), getBaseContext().getResources().getColor(R.color.color_deep_sleep_transparent)};
        if (getColorType() == 1) {
            paint.setAlpha(10);
        }
        paint.setShader(new LinearGradient(getCursorCenter(), 0.0f, getCursorCenter(), getCursorHeight() - 60.0f, iArr, (float[]) null, Shader.TileMode.MIRROR));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        canvas.drawLine(getCursorCenter(), wud.b(16.0f), getCursorCenter(), getCursorHeight() - wud.b(16.0f), paint);
    }

    private void c(float f) {
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            getCursorList().clear();
            LogUtil.e("R_Sleep_CoreSleepDayDetailView", "addAnchor getFitnessDataList() == null or getFitnessDataList().size() == 0");
            return;
        }
        for (uig uigVar : getFitnessDataList()) {
            int iB = uigVar.b();
            int iC = uigVar.c();
            if (getIsOnlyNoonSleepType()) {
                a(uigVar, iB, iC);
            } else if (getIsScienceSleep()) {
                if (uigVar.e() == 69) {
                    this.d = true;
                } else {
                    b(uigVar);
                }
            } else if (uigVar.e() == 69) {
                this.d = true;
            } else {
                d(uigVar, iB, iC);
            }
            this.n = getOnlyNoonRectSetting(uigVar.e(), getDiagramHeight()).b();
            if (f >= this.f && f <= this.j) {
                e(uigVar, iB, iC);
                return;
            } else {
                this.f27240c = false;
                getCursorList().clear();
            }
        }
    }

    private void e(uig uigVar, float f, float f2) {
        this.f27240c = true;
        ukg ukgVar = new ukg();
        ukgVar.f50291c = 1;
        ukgVar.f50290b = new PointF(f, this.n);
        int iC = uigVar.c();
        int iB = uigVar.b();
        ukgVar.j = c(uigVar.b()) + " - " + c(uigVar.c());
        this.g = c(uigVar.b()) + " - " + c(uigVar.c());
        ukgVar.f50289a = (double) (iC - iB);
        ukgVar.e = new RectF(f, f2, 100.0f + f, getViewHeight());
        ukgVar.d = uigVar.e();
        getCursorList().clear();
        getCursorList().add(ukgVar);
    }

    private void a(uig uigVar, int i, int i2) {
        this.d = false;
        this.f = ((i / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        this.j = ((i2 / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = this.f;
            this.f = getViewWidth() - this.j;
            this.j = getViewWidth() - f;
        }
        this.l = this.f;
        this.o = this.j;
        a(uigVar.e());
    }

    private void b(uig uigVar) {
        this.d = false;
        this.f = (((uigVar.b() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        this.j = (((uigVar.c() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = this.f;
            this.f = getViewWidth() - this.j;
            this.j = getViewWidth() - f;
        }
        this.l = this.f;
        this.o = this.j;
        e(uigVar.e());
    }

    private void d(uig uigVar, int i, int i2) {
        this.d = false;
        this.f = ((i / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        this.j = ((i2 / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = this.f;
            this.f = getViewWidth() - this.j;
            this.j = getViewWidth() - f;
        }
        this.l = this.f;
        this.o = this.j;
        b(uigVar.e());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        setIsDefault(false);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = System.currentTimeMillis();
        } else if (action == 1) {
            c(motionEvent);
        } else if (action == 2) {
            d(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    private void d(MotionEvent motionEvent) {
        if (getCursorHeight() - wud.b(18.0f) < motionEvent.getY() && motionEvent.getY() < getViewHeight()) {
            e(motionEvent);
        } else if (this.f27239b) {
            e(motionEvent);
        } else {
            this.i = true;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private void e(MotionEvent motionEvent) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            if (motionEvent.getX() < wud.b(22.0f) || motionEvent.getX() > getViewWidth() - getChartBorderWidth()) {
                return;
            }
            a(motionEvent);
            return;
        }
        if (getChartBorderWidth() > motionEvent.getX() || motionEvent.getX() > getViewWidth() - wud.b(22.0f)) {
            return;
        }
        a(motionEvent);
    }

    private void c(MotionEvent motionEvent) {
        this.f27239b = false;
        if (System.currentTimeMillis() - this.e < 850) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (wud.b(22.0f) <= motionEvent.getX() && motionEvent.getX() <= getViewWidth() - getChartBorderWidth()) {
                    c(motionEvent.getX());
                    a(motionEvent);
                }
            } else if (getChartBorderWidth() <= motionEvent.getX() && motionEvent.getX() <= getViewWidth() - wud.b(22.0f)) {
                c(motionEvent.getX());
                a(motionEvent);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    private void a(MotionEvent motionEvent) {
        float fC;
        float chartBorderWidth;
        this.i = false;
        this.h.set(motionEvent.getX(), motionEvent.getY());
        c(this.h.x);
        if (getLastData() != null) {
            if (!getIsOnlyNoonSleepType() && getIsScienceSleep()) {
                fC = ((getLastData().c() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            } else {
                fC = (getLastData().c() / 1440.0f) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            }
            float f = fC + chartBorderWidth;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (motionEvent.getX() >= getViewWidth() - f && motionEvent.getX() <= getViewWidth() - getChartBorderWidth()) {
                    setIsDefault(false);
                    setIsMove(false);
                } else {
                    setIsDefault(true);
                    setIsMove(true);
                }
            } else if (motionEvent.getX() >= f && motionEvent.getX() <= getViewWidth() - wud.b(22.0f)) {
                setIsDefault(true);
                setIsMove(true);
            } else {
                setIsDefault(false);
                setIsMove(false);
            }
        }
        setCursorCenter(motionEvent.getX());
        invalidate();
    }

    private String d(int i) {
        switch (i) {
            case 65:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_deepsleep);
            case 66:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
            case 67:
                return getBaseContext().getString(R.string.IDS_details_sleep_sleep_latency);
            case 68:
                return getBaseContext().getString(R.string.IDS_fitness_core_sleep_rem_sleep);
            case 69:
                return getBaseContext().getString(R.string.IDS_fitness_core_sleep_noontime_sleep);
            default:
                return getBaseContext().getString(R.string.IDS_hw_show_main_health_page_healthdata_sleep_shallowsleep);
        }
    }

    private String c(int i) {
        int i2 = i / 60;
        int i3 = i2 + 20;
        if (i3 >= 24) {
            i3 = i2 - 4;
        }
        return formatTime(getTimeStr(i3) + ":" + getTimeStr(i % 60));
    }

    public void setonClickViewDefaultListener(OnClickViewDefaultListener onClickViewDefaultListener) {
        this.f27238a = onClickViewDefaultListener;
    }

    private void e(int i) {
        setIsOtherType(false);
        switch (i) {
            case 65:
                this.k = wud.b(6.8f) + (getDiagramHeight() * 0.75f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_058a2be2);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_338a2be2);
                }
                break;
            case 66:
                this.k = wud.b(6.8f) + (getDiagramHeight() * 0.5f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_05c64be4);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_33c64be4);
                }
                break;
            case 67:
                this.k = wud.b(6.8f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_05fdc221);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_33fdc221);
                }
                break;
            case 68:
                this.k = wud.b(6.8f) + (getDiagramHeight() * 0.25f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_05fc8282);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_33fc8282);
                }
                break;
            default:
                setIsOtherType(true);
                break;
        }
    }

    private void b(int i) {
        setIsOtherType(false);
        switch (i) {
            case 65:
                this.k = wud.b(20.0f) + (getDiagramHeight() * 0.66f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_058a2be2);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_338a2be2);
                }
                break;
            case 66:
                this.k = wud.b(20.0f) + (getDiagramHeight() * 0.33f);
                if (getColorType() == 1) {
                    this.m = getBaseContext().getResources().getColor(R.color.color_05c64be4);
                } else {
                    this.m = getBaseContext().getResources().getColor(R.color.color_33c64be4);
                }
                break;
            case 67:
                e();
                break;
            default:
                setIsOtherType(true);
                break;
        }
    }

    private void e() {
        this.k = wud.b(20.0f);
        if (getColorType() == 1) {
            this.m = getBaseContext().getResources().getColor(R.color.color_05fdc221);
        } else {
            this.m = getBaseContext().getResources().getColor(R.color.color_33fdc221);
        }
    }

    private void a(int i) {
        setIsOtherType(false);
        if (i == 67) {
            e();
            return;
        }
        if (i == 69) {
            this.k = wud.b(20.0f) + ((getDiagramHeight() - wud.b(20.0f)) * 0.38f);
            if (getColorType() == 1) {
                this.m = getBaseContext().getResources().getColor(R.color.color_05008fff);
                return;
            } else {
                this.m = getBaseContext().getResources().getColor(R.color.color_33008fff);
                return;
            }
        }
        setIsOtherType(true);
    }
}
