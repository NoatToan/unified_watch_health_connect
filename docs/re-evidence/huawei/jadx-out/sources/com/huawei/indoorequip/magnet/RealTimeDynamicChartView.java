package com.huawei.indoorequip.magnet;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.ui.commonui.dynamicchart.DynamicChart;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqf;
import defpackage.qrs;
import health.compact.a.LogAnonymous;

/* JADX INFO: loaded from: classes12.dex */
public class RealTimeDynamicChartView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f17799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f17800c;
    private DynamicChart d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private Drawable j;
    private int k;
    private float l;
    private ImageView m;
    private Drawable n;
    private int o;
    private HealthTextView p;
    private HealthTextView q;
    private String r;
    private ImageView s;
    private String t;
    private String u;
    private HealthTextView y;

    public RealTimeDynamicChartView(Context context) {
        this(context, null);
        a();
    }

    public RealTimeDynamicChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        a();
    }

    public RealTimeDynamicChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17800c = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RealTimeDataView, i, R.style.Health_Indoor_RealTimeDataView);
        if (typedArrayObtainStyledAttributes != null) {
            try {
                this.e = typedArrayObtainStyledAttributes.getColor(R.styleable.RealTimeDataView_chartLineColor, getContext().getResources().getColor(R.color.realtimedataview_line_color));
                this.g = typedArrayObtainStyledAttributes.getColor(R.styleable.RealTimeDataView_largeRemindColor, getContext().getResources().getColor(R.color.realtimedataview_large_remind_color));
                this.o = typedArrayObtainStyledAttributes.getColor(R.styleable.RealTimeDataView_normalRemindColor, getContext().getResources().getColor(R.color.realtimedataview_normal_remind_color));
                this.k = typedArrayObtainStyledAttributes.getColor(R.styleable.RealTimeDataView_smallRemindColor, getContext().getResources().getColor(R.color.realtimedataview_small_remind_color));
                this.n = typedArrayObtainStyledAttributes.getDrawable(R.styleable.RealTimeDataView_smallIcon);
                this.j = typedArrayObtainStyledAttributes.getDrawable(R.styleable.RealTimeDataView_largeIcon);
                this.i = typedArrayObtainStyledAttributes.getInt(R.styleable.RealTimeDataView_chartMaxY, 100);
                this.h = typedArrayObtainStyledAttributes.getInt(R.styleable.RealTimeDataView_chartMinY, 0);
                this.f17798a = typedArrayObtainStyledAttributes.getInt(R.styleable.RealTimeDataView_chartMaxDataNum, 180);
                this.f17799b = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RealTimeDataView_remindTintEnable, false);
                this.l = typedArrayObtainStyledAttributes.getFloat(R.styleable.RealTimeDataView_scale, 1.0f);
                this.f = typedArrayObtainStyledAttributes.getBoolean(R.styleable.RealTimeDataView_titleIconEnable, false);
                this.t = typedArrayObtainStyledAttributes.getString(R.styleable.RealTimeDataView_titleText);
                this.u = typedArrayObtainStyledAttributes.getString(R.styleable.RealTimeDataView_valueText);
                this.r = typedArrayObtainStyledAttributes.getString(R.styleable.RealTimeDataView_unitText);
            } catch (Resources.NotFoundException e) {
                LogUtil.e("BaseRealTimeDataView", "Resources not found ", LogAnonymous.b(e));
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        a();
    }

    private void a() {
        inflate(getContext(), R.layout.layout_real_time_data_magenet, this);
        this.q = (HealthTextView) findViewById(R.id.title);
        this.y = (HealthTextView) findViewById(R.id.value);
        this.p = (HealthTextView) findViewById(R.id.unit);
        this.m = (ImageView) findViewById(R.id.remind_arrow);
        this.s = (ImageView) findViewById(R.id.title_icon);
        this.d = (DynamicChart) findViewById(R.id.dynamic_chart);
        g();
        h();
        setColor();
        if (this.f) {
            this.s.setVisibility(0);
        }
        this.d.setPointCountOneScreen(this.f17798a);
        c();
        this.f17800c = true;
    }

    private void c() {
        HealthTextView healthTextView = this.y;
        healthTextView.setTextSize(0, this.l * healthTextView.getTextSize());
        HealthTextView healthTextView2 = this.p;
        healthTextView2.setTextSize(0, this.l * healthTextView2.getTextSize());
        HealthTextView healthTextView3 = this.q;
        healthTextView3.setTextSize(0, this.l * healthTextView3.getTextSize());
    }

    public void setTitle(int i) {
        this.t = BaseApplication.getContext().getResources().getString(i);
        g();
    }

    private void g() {
        this.q.setText(this.t);
    }

    public void setTitle(String str) {
        this.t = str;
        g();
    }

    public void setValue(String str) {
        this.u = str;
        h();
    }

    private void h() {
        this.y.setText(this.u);
    }

    public void c(float f) {
        int i = this.i;
        int i2 = this.h;
        float f2 = (i - i2) * 0.005f;
        float f3 = i2 + f2;
        if (f < f3) {
            f = f3;
        }
        float f4 = i - f2;
        if (f > f4) {
            f = f4;
        }
        this.d.e(f);
    }

    public void setScale(float f) {
        if (this.f17800c) {
            this.l = f;
            HealthTextView healthTextView = this.y;
            healthTextView.setTextSize(0, healthTextView.getTextSize() * f);
            HealthTextView healthTextView2 = this.p;
            healthTextView2.setTextSize(0, healthTextView2.getTextSize() * f);
            HealthTextView healthTextView3 = this.q;
            healthTextView3.setTextSize(0, healthTextView3.getTextSize() * f);
            if (this.m.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.m.getLayoutParams();
                layoutParams.width = (int) (qrs.d(getContext(), 5.0f) * f);
                layoutParams.setMarginStart(((int) f) * layoutParams.getMarginStart());
                this.m.setLayoutParams(layoutParams);
            }
            if (this.s.getLayoutParams() instanceof LinearLayout.LayoutParams) {
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.s.getLayoutParams();
                layoutParams2.width = (int) (qrs.d(getContext(), 16.0f) * f);
                layoutParams2.height = (int) (qrs.d(getContext(), 16.0f) * f);
                layoutParams2.setMarginStart(((int) f) * layoutParams2.getMarginStart());
                this.s.setLayoutParams(layoutParams2);
            }
        }
    }

    public void setOrdinateY(int i, int i2) {
        this.h = i;
        this.i = i2;
        this.d.setOrdinateY(i, i2);
    }

    public void setColor() {
        this.d.setColor(this.e);
    }

    public void d() {
        this.m.setVisibility(4);
        this.y.setTextColor(this.o);
        this.p.setTextColor(this.o);
    }

    public void b() {
        this.m.setVisibility(0);
        this.m.setBackground(qqf.c(this.n, this.k));
        this.y.setTextColor(this.k);
        this.p.setTextColor(this.k);
    }

    public void e() {
        this.m.setVisibility(0);
        if (this.f17799b) {
            this.m.setBackground(qqf.c(this.j, this.g));
        } else {
            this.m.setBackground(this.j);
        }
        this.y.setTextColor(this.g);
        this.p.setTextColor(this.g);
    }

    public int getTitleLength() {
        HealthTextView healthTextView = this.q;
        if (healthTextView == null || healthTextView.getText() == null) {
            return 0;
        }
        return this.q.getText().length();
    }

    public void setSmallTextSize() {
        this.q.setTextSize(1, this.l * 12.0f);
        this.p.setTextSize(1, this.l * 9.0f);
        this.y.setTextSize(1, this.l * 20.0f);
        if (this.s.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams.width = (int) (this.l * qrs.d(getContext(), 12.0f));
            layoutParams.height = (int) (this.l * qrs.d(getContext(), 12.0f));
            layoutParams.setMarginStart(((int) this.l) * layoutParams.getMarginStart());
            this.s.setLayoutParams(layoutParams);
        }
    }

    public void setNormalTextSize() {
        this.q.setTextSize(1, this.l * 12.0f);
        this.p.setTextSize(1, this.l * 11.0f);
        this.y.setTextSize(1, this.l * 20.0f);
        if (this.s.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
            layoutParams.width = (int) (this.l * qrs.d(getContext(), 12.0f));
            layoutParams.height = (int) (this.l * qrs.d(getContext(), 12.0f));
            layoutParams.setMarginStart(((int) this.l) * layoutParams.getMarginStart());
            this.s.setLayoutParams(layoutParams);
        }
    }
}
