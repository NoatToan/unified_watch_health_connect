package com.huawei.ui.commonui.view.threeCircle;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.progressbar.CircleProgressBar;
import defpackage.qth;
import health.compact.a.util.LogUtil;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class ThreeCircleView extends FrameLayout {
    private Map<String, CircleProgressBar> f;
    private CircleProgressBar g;
    private LinkedHashMap<String, qth> h;
    private CircleProgressBar i;
    private Map<String, Object> k;
    private boolean l;
    private Context m;
    private CircleProgressBar n;
    private boolean o;
    private Map<String, Object> p;
    private boolean q;
    private ImageView r;
    private Map<String, Object> s;
    private boolean t;
    private int u;
    private float x;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f24017c = {BaseApplication.b().getColor(R.color.new_cal_circle_bg_start_color), BaseApplication.b().getColor(R.color.new_cal_circle_bg_end_color)};
    private static final int[] d = {BaseApplication.b().getColor(R.color.new_time_circle_bg_start_color), BaseApplication.b().getColor(R.color.new_time_circle_bg_end_color)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f24016b = {BaseApplication.b().getColor(R.color.new_activity_circle_bg_start_color), BaseApplication.b().getColor(R.color.new_activity_circle_bg_end_color)};
    private static final int[] e = {BaseApplication.b().getColor(R.color.new_cal_circle_process_start_color), BaseApplication.b().getColor(R.color.new_cal_circle_process_second_color), BaseApplication.b().getColor(R.color.new_cal_circle_process_third_color), BaseApplication.b().getColor(R.color.new_cal_circle_process_end_color)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f24015a = {BaseApplication.b().getColor(R.color.new_time_circle_process_start_color), BaseApplication.b().getColor(R.color.new_time_circle_process_second_color), BaseApplication.b().getColor(R.color.new_time_circle_process_third_color), BaseApplication.b().getColor(R.color.new_time_circle_process_end_color)};
    private static final int[] j = {BaseApplication.b().getColor(R.color.new_activity_circle_process_start_color), BaseApplication.b().getColor(R.color.new_activity_circle_process_second_color), BaseApplication.b().getColor(R.color.new_activity_circle_process_third_color), BaseApplication.b().getColor(R.color.new_activity_circle_process_end_color)};

    private int a(float f) {
        return (int) (((((f % 200.0f) / 200.0f) * 2.0f) + 1.0f) * 400.0f);
    }

    public ThreeCircleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ThreeCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThreeCircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = new HashMap();
        this.h = new LinkedHashMap<>();
        this.k = new HashMap();
        this.p = new HashMap();
        this.s = new HashMap();
        this.l = true;
        this.m = context.getApplicationContext();
        d(attributeSet, i);
        b();
    }

    public ThreeCircleView(Context context, int i) {
        super(context);
        this.f = new HashMap();
        this.h = new LinkedHashMap<>();
        this.k = new HashMap();
        this.p = new HashMap();
        this.s = new HashMap();
        this.l = true;
        this.m = context.getApplicationContext();
        this.u = i;
        if (i == 1) {
            c();
        } else {
            new ThreeCircleView(context);
        }
    }

    public void setIsAnimator(boolean z) {
        this.o = z;
    }

    public void setIsShowOverlap(boolean z) {
        this.t = z;
    }

    public void setIsIconVisible(boolean z) {
        this.l = z;
    }

    public void setIsShowTriangle(boolean z) {
        this.q = z;
    }

    public void e(LinkedHashMap<String, qth> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.size() == 0) {
            LogUtil.d("ThreeCircleView", "circleInfos is null.");
            return;
        }
        this.h = linkedHashMap;
        d("firstCircle");
        d("secondCircle");
        d("thirdCircle");
    }

    private void e() {
        this.k.put("circleColor", e);
        this.k.put("circleBackgroundColor", f24017c);
        this.k.put("icon", Integer.valueOf(R.drawable.ic_heat_xxxhdpi_df));
        this.k.put("colorDiff", Integer.valueOf((int) TypedValue.applyDimension(1, 3.0f, BaseApplication.b().getResources().getDisplayMetrics())));
        this.k.put("isComplete", false);
        this.p.put("circleColor", f24015a);
        this.p.put("circleBackgroundColor", d);
        this.p.put("icon", Integer.valueOf(R.drawable.ic_time_xxxhdpi));
        this.p.put("colorDiff", Integer.valueOf((int) TypedValue.applyDimension(1, 5.0f, BaseApplication.b().getResources().getDisplayMetrics())));
        this.p.put("isComplete", false);
        this.s.put("circleColor", j);
        this.s.put("circleBackgroundColor", f24016b);
        this.s.put("icon", Integer.valueOf(R.drawable.ic_excise_xxxhdpi));
        this.s.put("colorDiff", Integer.valueOf((int) TypedValue.applyDimension(1, 8.0f, BaseApplication.b().getResources().getDisplayMetrics())));
        this.s.put("isComplete", false);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float size = View.MeasureSpec.getSize(i2) / TypedValue.applyDimension(1, 158.0f, BaseApplication.b().getResources().getDisplayMetrics());
        this.x = size;
        this.g.setCircleScale(size);
        this.i.setCircleScale(this.x);
        this.n.setCircleScale(this.x);
    }

    private void b() {
        LogUtil.a("ThreeCircleView", "initView");
        View viewInflate = LayoutInflater.from(this.m).inflate(R.layout.three_circle_view_layout, this);
        this.g = (CircleProgressBar) viewInflate.findViewById(R.id.circleProgressBar1);
        this.i = (CircleProgressBar) viewInflate.findViewById(R.id.circleProgressBar2);
        this.n = (CircleProgressBar) viewInflate.findViewById(R.id.circleProgressBar3);
        this.r = (ImageView) viewInflate.findViewById(R.id.circle_triangle);
        a();
    }

    private void c() {
        LogUtil.a("ThreeCircleView", "initView");
        View viewInflate = LayoutInflater.from(this.m).inflate(R.layout.three_circle_view_layout_icon, this);
        this.g = (CircleProgressBar) viewInflate.findViewById(R.id.icon_circleProgressBar1);
        this.i = (CircleProgressBar) viewInflate.findViewById(R.id.icon_circleProgressBar2);
        this.n = (CircleProgressBar) viewInflate.findViewById(R.id.icon_circleProgressBar3);
        this.r = (ImageView) viewInflate.findViewById(R.id.icon_circle_triangle);
        a();
    }

    private void a() {
        this.f.put("firstCircle", this.g);
        this.f.put("secondCircle", this.i);
        this.f.put("thirdCircle", this.n);
        e();
        d("firstCircle");
        d("secondCircle");
        d("thirdCircle");
    }

    private void d(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.m.getTheme().obtainStyledAttributes(attributeSet, R.styleable.ThreeCircleView, i, 0);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.ThreeCircleView_isAnimator) {
                this.o = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == R.styleable.ThreeCircleView_isIconVisible) {
                this.l = typedArrayObtainStyledAttributes.getBoolean(index, true);
            } else if (index == R.styleable.ThreeCircleView_isShowOverlap) {
                this.t = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else if (index == R.styleable.ThreeCircleView_isShowTriangle) {
                this.q = typedArrayObtainStyledAttributes.getBoolean(index, false);
            } else {
                LogUtil.d("ThreeCircleView", "wrong attr. attr = ", Integer.valueOf(index));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void d(String str) {
        CircleProgressBar circleProgressBar = this.f.get(str);
        circleProgressBar.setCircleAngle(135.0f, 135.0f, 270.0f);
        circleProgressBar.setCircleWidth(17.0f);
        float fApplyDimension = TypedValue.applyDimension(1, 9.0f, BaseApplication.b().getResources().getDisplayMetrics());
        circleProgressBar.setStartIconRes(a(str), 16.0f, 16.0f, fApplyDimension, fApplyDimension);
        circleProgressBar.setBottomCircleGradientColor(a(str, "circleBackgroundColor"), null, ((Integer) e(str).get("colorDiff")).intValue());
        circleProgressBar.setCircleOverlap(this.t);
        circleProgressBar.setIsIconVisible(this.l);
        circleProgressBar.b();
    }

    public void a(String str, int i, int i2) {
        LogUtil.a("ThreeCircleView", "updateProgress, progress: ", Integer.valueOf(i), ", target: ", Integer.valueOf(i2), ", isAnimation: ", Boolean.valueOf(this.o));
        CircleProgressBar circleProgressBar = this.f.get(str);
        if (i2 == 0) {
            LogUtil.a("ThreeCircleView", "NOT draw progress.");
            circleProgressBar.b();
            return;
        }
        circleProgressBar.setCircleOverlap(this.t);
        circleProgressBar.setProgressGradientColor(a(str, "circleColor"), null, ((Integer) e(str).get("colorDiff")).intValue());
        float fMax = Math.max(((i * 1.0f) / i2) * 100.0f, 0.3f);
        if (this.o) {
            circleProgressBar.d(fMax, new AccelerateDecelerateInterpolator(), a(fMax));
        } else {
            circleProgressBar.c(fMax);
        }
        b(str, i, i2);
    }

    public void a(String str, int i) {
        if (this.f.containsKey(str)) {
            CircleProgressBar circleProgressBar = this.f.get(str);
            if (circleProgressBar == null) {
                LogUtil.a("ThreeCircleView", "updateStartIconRes progressBar == null");
                return;
            }
            e(str).put("icon", Integer.valueOf(i));
            float fApplyDimension = TypedValue.applyDimension(1, 9.0f, BaseApplication.b().getResources().getDisplayMetrics());
            circleProgressBar.setStartIconRes(i, 16.0f, 16.0f, fApplyDimension, fApplyDimension);
            this.f.put(str, circleProgressBar);
            circleProgressBar.invalidate();
        }
    }

    private boolean c(int[] iArr) {
        return iArr == null || iArr.length != 2;
    }

    private int[] a(String str, String str2) {
        qth qthVar = this.h.get(str);
        if (qthVar == null || c(qthVar.d())) {
            return (int[]) e(str).get(str2);
        }
        if (TextUtils.equals(str2, "circleBackgroundColor")) {
            return qthVar.e();
        }
        return qthVar.d();
    }

    private int a(String str) {
        qth qthVar = this.h.get(str);
        if (qthVar == null || qthVar.a() == 0) {
            return ((Integer) e(str).get("icon")).intValue();
        }
        return qthVar.a();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    private Map<String, Object> e(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1501317216) {
            if (iHashCode != -1172519324) {
                if (iHashCode == -368098025 && str.equals("thirdCircle")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("secondCircle")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("firstCircle")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return this.k;
        }
        if (b2 == 1) {
            return this.p;
        }
        if (b2 == 2) {
            return this.s;
        }
        LogUtil.d("ThreeCircleView", "wrong circleIndex.");
        return this.k;
    }

    private void b(String str, int i, int i2) {
        if (this.q) {
            if (i < i2) {
                LogUtil.a("ThreeCircleView", "didn't complete. target = ", Integer.valueOf(i2), "; progress = ", Integer.valueOf(i));
                return;
            }
            e(str).put("isComplete", Boolean.valueOf(i >= i2));
            if (((Boolean) this.k.get("isComplete")).booleanValue() && ((Boolean) this.p.get("isComplete")).booleanValue() && ((Boolean) this.s.get("isComplete")).booleanValue()) {
                this.r.setVisibility(0);
                LogUtil.a("ThreeCircleView", "showTriangle");
            }
        }
    }
}
