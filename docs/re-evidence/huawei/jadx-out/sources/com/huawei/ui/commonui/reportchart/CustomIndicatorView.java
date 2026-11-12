package com.huawei.ui.commonui.reportchart;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;

/* JADX INFO: loaded from: classes16.dex */
public class CustomIndicatorView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f23821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f23822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f23823c;
    private TextView d;
    private String e;
    private TextView f;
    private int g;
    private int h;
    private int i;
    private String j;
    private TextView k;
    private int l;
    private int m;
    private TextView n;
    private String o;

    public CustomIndicatorView(Context context) {
        super(context);
        b(context);
    }

    public CustomIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.customIndicatorView);
        b(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        b(context);
    }

    private void b(Context context) {
        if (context == null) {
            LogUtil.j("CustomIndicatorView", "initView Context is null");
            return;
        }
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        if (layoutInflater == null) {
            LogUtil.j("CustomIndicatorView", "initView layoutInflater is null");
            return;
        }
        View viewInflate = layoutInflater.inflate(R.layout.custom_indicator_view, this);
        this.f = (TextView) viewInflate.findViewById(R.id.indicator_title_text);
        this.k = (TextView) viewInflate.findViewById(R.id.indicator_value_text);
        this.n = (TextView) viewInflate.findViewById(R.id.indicator_unit_text);
        this.d = (TextView) viewInflate.findViewById(R.id.indicator_desc_text);
        b();
        a();
        c();
        d();
    }

    private void b(TypedArray typedArray) {
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorTitleText)) {
            this.f23823c = typedArray.getString(R.styleable.customIndicatorView_indicatorTitleText);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorTitleColor)) {
            this.h = typedArray.getColor(R.styleable.customIndicatorView_indicatorTitleColor, getResources().getColor(R.color.textColorSecondary));
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorTitleVisibility)) {
            this.g = typedArray.getInteger(R.styleable.customIndicatorView_indicatorTitleVisibility, 8);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorValueText)) {
            this.o = typedArray.getString(R.styleable.customIndicatorView_indicatorValueText);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorValueColor)) {
            this.m = typedArray.getColor(R.styleable.customIndicatorView_indicatorValueColor, getResources().getColor(R.color.textColorPrimary));
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorUnitText)) {
            this.j = typedArray.getString(R.styleable.customIndicatorView_indicatorUnitText);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorUnitColor)) {
            this.i = typedArray.getColor(R.styleable.customIndicatorView_indicatorUnitColor, getResources().getColor(R.color.textColorSecondary));
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorUnitVisibility)) {
            this.l = typedArray.getInteger(R.styleable.customIndicatorView_indicatorUnitVisibility, 8);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorDescText)) {
            this.e = typedArray.getString(R.styleable.customIndicatorView_indicatorDescText);
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorDescColor)) {
            this.f23821a = typedArray.getColor(R.styleable.customIndicatorView_indicatorDescColor, getResources().getColor(R.color.textColorSecondary));
        }
        if (typedArray.hasValue(R.styleable.customIndicatorView_indicatorDescVisibility)) {
            this.f23822b = typedArray.getInteger(R.styleable.customIndicatorView_indicatorUnitVisibility, 8);
        }
    }

    private void d() {
        int i = this.f23822b;
        if (i == 0) {
            this.d.setVisibility(0);
            if (TextUtils.isEmpty(this.e)) {
                this.d.setText(this.e);
                a(this.d, this.f23821a);
                return;
            }
            return;
        }
        if (i == 4) {
            this.d.setVisibility(4);
        } else {
            if (i != 8) {
                return;
            }
            this.d.setVisibility(8);
        }
    }

    private void a(TextView textView, int i) {
        if (i != 0) {
            textView.setTextColor(i);
        }
    }

    public void setIndicatorTitle(String str) {
        TextView textView = this.f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setIndicatorValue(String str) {
        TextView textView = this.k;
        if (textView != null) {
            textView.setText(str);
            this.k.setTypeface(Typeface.createFromAsset(BaseApplication.b().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
        }
    }

    public void setIndicatorUnit(String str) {
        TextView textView = this.n;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setIndicatorDesc(String str) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(str);
        }
    }

    private void c() {
        int i = this.l;
        if (i == 0) {
            this.n.setVisibility(0);
            if (TextUtils.isEmpty(this.j)) {
                return;
            }
            this.n.setText(this.j);
            a(this.n, this.i);
            return;
        }
        if (i == 4) {
            this.n.setVisibility(4);
        } else {
            if (i != 8) {
                return;
            }
            this.n.setVisibility(8);
        }
    }

    private void a() {
        if (TextUtils.isEmpty(this.o)) {
            return;
        }
        this.k.setText(this.o);
        a(this.k, this.m);
        this.k.setTypeface(Typeface.createFromAsset(BaseApplication.b().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf"));
    }

    private void b() {
        int i = this.g;
        if (i == 0) {
            this.f.setVisibility(0);
            if (TextUtils.isEmpty(this.f23823c)) {
                return;
            }
            this.f.setText(this.f23823c);
            a(this.f, this.h);
            return;
        }
        if (i == 4) {
            this.f.setVisibility(4);
        } else {
            if (i != 8) {
                return;
            }
            this.f.setVisibility(8);
        }
    }
}
