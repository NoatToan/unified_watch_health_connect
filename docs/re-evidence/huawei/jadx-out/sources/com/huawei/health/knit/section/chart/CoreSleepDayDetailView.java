package com.huawei.health.knit.section.chart;

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
import com.huawei.health.servicesui.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.fqg;
import defpackage.fra;
import defpackage.ftj;
import health.compact.a.LanguageUtil;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class CoreSleepDayDetailView extends BaseSleepDayDetailView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f7467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnClickViewDefaultListener f7469c;
    private boolean d;
    private boolean e;
    private String f;
    private float g;
    private boolean h;
    private float i;
    private PointF j;
    private int k;
    private float l;
    private float m;
    private float n;
    private float o;

    public interface OnClickViewDefaultListener {
        void onClickViewDefaultListener(String str, String str2, int i, boolean z, int i2, ArrayList<fra> arrayList, int i3);
    }

    public CoreSleepDayDetailView(Context context) {
        this(context, null);
        setBaseContext(context);
    }

    public CoreSleepDayDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = false;
        this.j = new PointF(-1.0f, -1.0f);
        this.f7467a = 0L;
        setBaseContext(context);
        setOnLongClickListener(new View.OnLongClickListener() { // from class: com.huawei.health.knit.section.chart.CoreSleepDayDetailView.1
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                CoreSleepDayDetailView.this.e = true;
                return false;
            }
        });
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setViewWidth(getDefaultSize(getSuggestedMinimumWidth(), i));
        setViewHeight(getDefaultSize(getSuggestedMinimumHeight(), i2));
        setDiagramWidth(getViewWidth() - ftj.d(48.0f));
        setDiagramHeight(ftj.d(158.0f));
        setTransparentHeight(getViewHeight() - ftj.d(24.0f));
        setCursorHeight(getTransparentHeight());
        setCursorCenter(getViewWidth() / 2.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.mCanvas = canvas;
        getTimeLabel();
        b(canvas);
        drawSleepRect(canvas);
        c();
        if (getIsDefault()) {
            d();
        }
        d(canvas);
        drawMaxSleepVerticalLine(canvas);
        a(canvas);
        drawCursorText(canvas);
        e(canvas);
    }

    private void b(Canvas canvas) {
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_extend_background_color));
        canvas.drawRect(0.0f, getTransparentHeight(), getViewWidth(), getViewHeight(), paint);
    }

    private void c() {
        ArrayList<fqg> cursorList = getCursorList();
        int size = cursorList != null ? cursorList.size() : 0;
        if (this.f7469c == null) {
            return;
        }
        if (cursorList == null || size == 0) {
            if (getIsMove()) {
                return;
            }
            LogUtil.e("CoreSleepDayDetailView", "setTimeSegmentListener !getIsMove()");
            this.f7469c.onClickViewDefaultListener("", "", 0, getIsOnlyNoonSleepType(), this.mCursorInBedState, getManualCursorList(), 0);
            return;
        }
        fqg fqgVar = cursorList.get(size - 1);
        this.f = fqgVar.h;
        LogUtil.e("CoreSleepDayDetailView", "setTimeSegmentListener mTimePeriod is " + this.f);
        this.f7469c.onClickViewDefaultListener(this.f, getSleepTypeString(fqgVar.d), (int) fqgVar.f34405a, getIsOnlyNoonSleepType(), this.mCursorInBedState, getManualCursorList(), fqgVar.d);
    }

    private void d() {
        float fD;
        float chartBorderWidth;
        if (getLastData() != null) {
            if (getIsOnlyNoonSleepType()) {
                fD = (getLastData().d() / 1440.0f) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            } else {
                fD = ((getLastData().d() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            }
            float viewWidth = fD + chartBorderWidth;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                viewWidth = getViewWidth() - viewWidth;
            }
            if (!getIsMove()) {
                setCursorCenter(viewWidth + 1.0f);
            }
            LogUtil.e("debug2", "setDefaultCursorPoint");
            OnClickViewDefaultListener onClickViewDefaultListener = this.f7469c;
            if (onClickViewDefaultListener == null) {
                return;
            }
            onClickViewDefaultListener.onClickViewDefaultListener("", "", -1, getIsOnlyNoonSleepType(), this.mCursorInBedState, getManualCursorList(), 0);
            return;
        }
        setCursorCenter(getViewWidth() / 2.0f);
    }

    private void d(Canvas canvas) {
        float fD;
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            return;
        }
        this.j.set(getCursorCenter(), getCursorHeight());
        d(this.j.x);
        if (this.f7468b && !this.d) {
            Paint paint = new Paint();
            paint.setStrokeWidth(1.0f);
            if (this.mIsManual) {
                paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, getTransparentHeight(), this.k, getBaseContext().getResources().getColor(R.color.manual_sleep_time_chart_color_0), Shader.TileMode.CLAMP));
            } else {
                paint.setColor(this.k);
            }
            RectF rectF = new RectF(this.l, this.m, this.o, getTransparentHeight());
            if (Math.abs(this.o - this.l) < ftj.d(6.0f)) {
                fD = Math.abs(this.o - this.l) / 2.0f;
            } else {
                fD = ftj.d(6.0f);
            }
            float[] fArr = {fD, fD, fD, fD, 0.0f, 0.0f, 0.0f, 0.0f};
            Path path = new Path();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    private void a(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_extend_background_color));
        paint.setStyle(Paint.Style.FILL);
        Path path = new Path();
        float fD = ftj.d(36.0f);
        float fD2 = ftj.d(13.5f);
        path.moveTo(getCursorCenter() - fD, getCursorHeight());
        float cursorCenter = getCursorCenter();
        float f = (2.0f * fD) / 6.0f;
        float cursorHeight = getCursorHeight();
        float cursorCenter2 = getCursorCenter();
        path.cubicTo(cursorCenter - f, cursorHeight, cursorCenter2 - f, getCursorHeight() - fD2, getCursorCenter(), getCursorHeight() - fD2);
        float cursorCenter3 = getCursorCenter();
        float cursorHeight2 = getCursorHeight();
        float cursorCenter4 = getCursorCenter();
        float f2 = cursorCenter3 + f;
        float f3 = cursorHeight2 - fD2;
        float f4 = ((fD * 3.0f) / 6.0f) + cursorCenter4;
        path.cubicTo(f2, f3, f4, getCursorHeight(), getCursorCenter() + fD, getCursorHeight());
        canvas.drawPath(path, paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.FILL);
        paint.setShadowLayer(ftj.d(7.0f), 0.0f, ftj.d(3.0f), getBaseContext().getResources().getColor(R.color.health_chart_eye_shadow_color));
        paint.setColor(getBaseContext().getResources().getColor(R.color.colorBackground));
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + ftj.d(1.0f), ftj.d(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setAlpha(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(1.0f);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + ftj.d(1.0f), ftj.d(11.0f), paint);
        paint.setXfermode(null);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_eye_color));
        paint.setAntiAlias(true);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + ftj.d(1.0f), ftj.d(11.0f), paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(ftj.d(0.5f));
        paint.setColor(getBaseContext().getResources().getColor(R.color.health_chart_eye_shadow_color));
        paint.setAntiAlias(true);
        canvas.drawCircle(getCursorCenter(), getCursorHeight() + ftj.d(1.0f), ftj.d(11.25f), paint);
    }

    private void e(Canvas canvas) {
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            return;
        }
        try {
            Paint paint = new Paint();
            int[] iArr = {getBaseContext().getResources().getColor(R.color.color_deep_sleep_transparent), getBaseContext().getResources().getColor(R.color.color_deep_sleep), getBaseContext().getResources().getColor(R.color.color_deep_sleep_transparent)};
            if (getColorType() == 1) {
                paint.setAlpha(10);
            }
            paint.setShader(new LinearGradient(getCursorCenter(), 0.0f, getCursorCenter(), getCursorHeight() - 60.0f, iArr, (float[]) null, Shader.TileMode.MIRROR));
            paint.setStrokeWidth(1.0f);
            paint.setAntiAlias(true);
            canvas.drawLine(getCursorCenter(), ftj.d(16.0f), getCursorCenter(), getCursorHeight() - ftj.d(16.0f), paint);
        } catch (IllegalArgumentException unused) {
            LogUtil.a("CoreSleepDayDetailView", "API version too high do not use linearGradient!");
            c(canvas);
        }
    }

    private void c(Canvas canvas) {
        Paint paint = new Paint();
        if (getColorType() == 1) {
            paint.setAlpha(10);
        }
        paint.setColor(getBaseContext().getResources().getColor(R.color.color_deep_sleep));
        paint.setStrokeWidth(1.0f);
        paint.setAntiAlias(true);
        canvas.drawLine(getCursorCenter(), ftj.d(16.0f), getCursorCenter(), getCursorHeight() - ftj.d(16.0f), paint);
    }

    private void d(float f) {
        if (getFitnessDataList() == null || getFitnessDataList().size() == 0) {
            getCursorList().clear();
            LogUtil.e("R_Sleep_CoreSleepDayDetailView", "addAnchor getFitnessDataList() == null or getFitnessDataList().size() == 0");
            return;
        }
        for (fra fraVar : getFitnessDataList()) {
            int iB = fraVar.b();
            int iD = fraVar.d();
            if (getIsOnlyNoonSleepType()) {
                b(fraVar, iB, iD);
            } else if (getIsScienceSleep()) {
                if (fraVar.a() == 69) {
                    this.d = true;
                } else {
                    c(fraVar);
                }
            } else if (fraVar.a() == 69) {
                this.d = true;
            } else {
                a(fraVar);
            }
            this.n = getOnlyNoonRectSetting(fraVar.a(), getDiagramHeight()).a();
            if (f >= this.g && f <= this.i) {
                d(fraVar, iB, iD);
                return;
            } else {
                this.f7468b = false;
                getCursorList().clear();
            }
        }
    }

    private void d(fra fraVar, float f, float f2) {
        this.f7468b = true;
        fqg fqgVar = new fqg();
        fqgVar.f34407c = 1;
        fqgVar.e = new PointF(f, this.n);
        int iD = fraVar.d();
        int iB = fraVar.b();
        fqgVar.h = getDigitTimeStr(fraVar.b()) + " - " + getDigitTimeStr(fraVar.d());
        this.f = getDigitTimeStr(fraVar.b()) + " - " + getDigitTimeStr(fraVar.d());
        fqgVar.f34405a = (double) (iD - iB);
        fqgVar.f34406b = new RectF(f, f2, 100.0f + f, getViewHeight());
        fqgVar.d = fraVar.a();
        getCursorList().clear();
        getCursorList().add(fqgVar);
    }

    private void b(fra fraVar, int i, int i2) {
        e(i, i2);
        c(fraVar.a());
    }

    private void c(fra fraVar) {
        b(fraVar);
        b(fraVar.a(), false);
    }

    private void b(fra fraVar) {
        this.d = false;
        int iB = fraVar.b();
        int iD = fraVar.d();
        float nightStartPoint = (((iB - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        float nightStartPoint2 = (((iD - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        this.g = (((fraVar.b() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        this.i = (((fraVar.d() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth()) + getChartBorderWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float viewWidth = getViewWidth();
            float viewWidth2 = getViewWidth() - nightStartPoint;
            float f = this.g;
            this.g = getViewWidth() - this.i;
            this.i = getViewWidth() - f;
            nightStartPoint = viewWidth - nightStartPoint2;
            nightStartPoint2 = viewWidth2;
        }
        this.l = nightStartPoint;
        this.o = nightStartPoint2;
    }

    private void a(fra fraVar) {
        b(fraVar);
        a(fraVar.a());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        setIsDefault(false);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7467a = System.currentTimeMillis();
        } else if (action == 1) {
            e(motionEvent);
        } else if (action == 2) {
            b(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    private void b(MotionEvent motionEvent) {
        if (getCursorHeight() - ftj.d(18.0f) < motionEvent.getY() && motionEvent.getY() < getViewHeight()) {
            d(motionEvent);
        } else if (this.e) {
            d(motionEvent);
        } else {
            this.h = true;
            getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    private void d(MotionEvent motionEvent) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            if (motionEvent.getX() < ftj.d(22.0f) || motionEvent.getX() > getViewWidth() - getChartBorderWidth()) {
                return;
            }
            a(motionEvent);
            return;
        }
        if (getChartBorderWidth() > motionEvent.getX() || motionEvent.getX() > getViewWidth() - ftj.d(22.0f)) {
            return;
        }
        a(motionEvent);
    }

    private void e(MotionEvent motionEvent) {
        this.e = false;
        if (System.currentTimeMillis() - this.f7467a < 850) {
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (ftj.d(22.0f) <= motionEvent.getX() && motionEvent.getX() <= getViewWidth() - getChartBorderWidth()) {
                    d(motionEvent.getX());
                    a(motionEvent);
                }
            } else if (getChartBorderWidth() <= motionEvent.getX() && motionEvent.getX() <= getViewWidth() - ftj.d(22.0f)) {
                d(motionEvent.getX());
                a(motionEvent);
            }
        }
        getParent().requestDisallowInterceptTouchEvent(false);
    }

    private void a(MotionEvent motionEvent) {
        float fD;
        float chartBorderWidth;
        this.h = false;
        this.j.set(motionEvent.getX(), motionEvent.getY());
        d(this.j.x);
        if (getLastData() != null) {
            if (getIsOnlyNoonSleepType()) {
                fD = (getLastData().d() / 1440.0f) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            } else {
                fD = ((getLastData().d() - getNightStartPoint()) / (getNightEndPoint() - getNightStartPoint())) * getDiagramWidth();
                chartBorderWidth = getChartBorderWidth();
            }
            float f = fD + chartBorderWidth;
            if (LanguageUtil.ba(BaseApplication.getContext())) {
                if (motionEvent.getX() >= getViewWidth() - f && motionEvent.getX() <= getViewWidth() - getChartBorderWidth()) {
                    setIsDefault(false);
                    setIsMove(false);
                } else {
                    setIsDefault(true);
                    setIsMove(true);
                }
            } else if (motionEvent.getX() >= f && motionEvent.getX() <= getViewWidth() - ftj.d(22.0f)) {
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

    public void setonClickViewDefaultListener(OnClickViewDefaultListener onClickViewDefaultListener) {
        this.f7469c = onClickViewDefaultListener;
    }

    private void b(int i, boolean z) {
        setIsOtherType(false);
        if (this.mIsPhone) {
            d(i);
        } else if (this.mIsManual) {
            a(i, z);
        } else {
            b(i);
        }
    }

    private void a(int i, boolean z) {
        int color;
        if (i == 66) {
            this.m = ftj.d(24.0f) + ((getDiagramHeight() - ftj.d(24.0f)) * 0.33f);
            if (getColorType() == 1) {
                this.k = getBaseContext().getResources().getColor(R.color.manual_sleep_time_chart_color_0);
                return;
            } else {
                this.k = getBaseContext().getResources().getColor(R.color.manual_sleep_time_chart_color_25);
                return;
            }
        }
        if (i == 67) {
            if (this.mIsManualAndOnlyBed) {
                this.m = ftj.d(24.0f) + ((getDiagramHeight() - ftj.d(24.0f)) * 0.33f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_0);
                    return;
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_35);
                    return;
                }
            }
            this.m = ftj.d(24.0f);
            if (getColorType() == 1) {
                this.k = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_0);
                return;
            }
            if (z) {
                color = getBaseContext().getResources().getColor(R.color.manual_sleep_time_chart_color_32);
            } else {
                color = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_22);
            }
            this.k = color;
            return;
        }
        setIsOtherType(true);
    }

    private void a(int i) {
        setIsOtherType(false);
        switch (i) {
            case 65:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.66f);
                e();
                break;
            case 66:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.33f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.color_05c64be4);
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.color_33c64be4);
                }
                break;
            case 67:
                a();
                break;
            default:
                setIsOtherType(true);
                break;
        }
    }

    private void a() {
        this.m = ftj.d(24.0f);
        if (getColorType() == 1) {
            this.k = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_0);
        } else {
            this.k = getBaseContext().getResources().getColor(R.color.manual_bed_time_chart_color_22);
        }
    }

    private void c(int i) {
        setIsOtherType(false);
        if (i == 67) {
            a();
            return;
        }
        if (i == 69) {
            this.m = ftj.d(24.0f) + ((getDiagramHeight() - ftj.d(24.0f)) * 0.38f);
            if (getColorType() == 1) {
                this.k = getBaseContext().getResources().getColor(R.color.color_05008fff);
                return;
            } else {
                this.k = getBaseContext().getResources().getColor(R.color.color_33008fff);
                return;
            }
        }
        setIsOtherType(true);
    }

    public boolean b() {
        return this.h;
    }

    private void e(int i, int i2) {
        this.d = false;
        this.g = ((i / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        this.i = ((i2 / 1440.0f) * getDiagramWidth()) + getChartBorderWidth();
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            float f = this.g;
            this.g = getViewWidth() - this.i;
            this.i = getViewWidth() - f;
        }
        this.l = this.g;
        this.o = this.i;
    }

    private void e() {
        if (getColorType() == 1) {
            this.k = getBaseContext().getResources().getColor(R.color.color_058a2be2);
        } else {
            this.k = getBaseContext().getResources().getColor(R.color.color_338a2be2);
        }
    }

    private void d(int i) {
        switch (i) {
            case 65:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.66f);
                e();
                break;
            case 66:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.33f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.color_05c64be4);
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.color_33c64be4);
                }
                break;
            case 67:
                a();
                break;
            default:
                setIsOtherType(true);
                break;
        }
    }

    private void b(int i) {
        switch (i) {
            case 65:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.75f);
                e();
                break;
            case 66:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.5f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.color_05c64be4);
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.color_33c64be4);
                }
                break;
            case 67:
                this.m = ftj.d(24.0f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.color_05fdc221);
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.color_33fdc221);
                }
                break;
            case 68:
                this.m = ftj.d(24.0f) + (getDiagramHeight() * 0.25f);
                if (getColorType() == 1) {
                    this.k = getBaseContext().getResources().getColor(R.color.color_05fc8282);
                } else {
                    this.k = getBaseContext().getResources().getColor(R.color.color_33fc8282);
                }
                break;
            default:
                setIsOtherType(true);
                break;
        }
    }
}
