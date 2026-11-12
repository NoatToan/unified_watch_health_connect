package com.huawei.ui.main.stories.history.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.main.R;
import defpackage.qrs;

/* JADX INFO: loaded from: classes19.dex */
public class MonthTitleItem extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout.LayoutParams f28354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f28355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout.LayoutParams f28356c;
    private HealthTextView d;
    private int e;
    private HealthTextView f;
    private LinearLayout.LayoutParams h;

    public MonthTitleItem(Context context) {
        super(context);
        this.e = 64;
        this.h = new LinearLayout.LayoutParams(-2, -2);
        this.f28354a = new LinearLayout.LayoutParams(-2, -2);
        this.f28356c = new LinearLayout.LayoutParams(-2, -2);
        this.f28355b = context;
        this.f = new HealthTextView(context);
        this.d = new HealthTextView(context);
        c();
        Resources resources = context.getResources();
        setGravity(1);
        this.f.setTextAppearance(R.style.track_history_unit_style);
        this.f.setAutoTextSize(0, resources.getDimension(R.dimen.textSizeBody3));
        if (qrs.v()) {
            this.f.setAutoTextSize(0, resources.getDimension(R.dimen.emui_text_size_caption1));
        }
        this.f.setAutoTextInfo(9, 1, 1);
        this.f.setEllipsize(TextUtils.TruncateAt.END);
        this.f.setGravity(1);
        this.d.setAutoTextSize(0, resources.getDimension(R.dimen.textSizeHeadline8));
        this.d.setAutoTextInfo(9, 1, 1);
        this.d.setMaxLines(1);
        this.d.setTextSize(0, resources.getDimension(R.dimen.textSizeHeadline8));
        this.d.setTextColor(resources.getColor(R.color.textColorPrimary));
        this.d.setTypeface(Typeface.create(getResources().getString(com.huawei.ui.commonui.R.string.emui_text_font_family_medium), 0));
        this.d.setGravity(1);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        this.f28354a.gravity = 1;
        this.f28354a.setMargins(resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_4dp), 0, resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_4dp), 0);
        this.h.gravity = 1;
        this.h.setMargins(0, resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_2dp), 0, 0);
        linearLayout.addView(this.d, this.f28354a);
        linearLayout.addView(this.f, this.h);
        addView(linearLayout);
        this.f28356c.width = 360;
        setLayoutParams(this.f28356c);
    }

    private void c() {
        if (qrs.y()) {
            qrs.a(this.d);
            qrs.a(this.f);
        }
    }

    public MonthTitleItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = 64;
        this.h = new LinearLayout.LayoutParams(-2, -2);
        this.f28354a = new LinearLayout.LayoutParams(-2, -2);
        this.f28356c = new LinearLayout.LayoutParams(-2, -2);
    }

    public MonthTitleItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = 64;
        this.h = new LinearLayout.LayoutParams(-2, -2);
        this.f28354a = new LinearLayout.LayoutParams(-2, -2);
        this.f28356c = new LinearLayout.LayoutParams(-2, -2);
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
        this.f.setTextColor(i);
    }

    public void setValueAutoTextSize(int i) {
        this.d.setAutoTextSize(0, this.f28355b.getResources().getDimension(i));
    }

    public void setValueUnitMaxLine(int i) {
        if (i <= 1) {
            this.f.setSingleLine();
        } else {
            this.f.setLines(i);
        }
    }

    public void setValueTypeFace(Typeface typeface) {
        this.d.setTypeface(typeface);
    }

    public void setValueAutoTextInfo(int i, int i2) {
        this.d.setAutoTextInfo(i, i2, 1);
    }

    public int b(int i, int i2) {
        this.d.measure(i, i2);
        return this.d.getMeasuredHeight();
    }

    public void setValueHeight(int i) {
        this.d.setHeight(i);
    }

    public void setValueMinHeight(int i) {
        this.d.setMinHeight(i);
    }

    public void setValueGravity(int i) {
        this.d.setGravity(i);
    }

    public void setValueLineSpacing(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.d.setFallbackLineSpacing(z);
        }
    }

    public void setDefaultHeight(int i) {
        this.e = i;
    }

    public void setGroupSize(int i, int i2) {
        this.f28356c.width = i;
        this.f28356c.height = i2;
        setLayoutParams(this.f28356c);
    }

    public void setLinearLayoutParams(LinearLayout.LayoutParams layoutParams) {
        setLayoutParams(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(c(i, true), c(i2, false));
    }

    private int c(int i, boolean z) {
        int iD;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        if (z || this.f28355b == null) {
            iD = 360;
        } else {
            iD = qrs.d(this.f28355b, this.e * Math.max(qrs.i(), 1.0f));
        }
        return mode == Integer.MIN_VALUE ? Math.min(iD, size) : iD;
    }

    public void setItemView(d dVar) {
        if (dVar == null) {
            LogUtil.j("Track_MonthTitleItem", "setItemView data is null");
        } else {
            this.d.setText(dVar.e());
            this.f.setText(dVar.b());
        }
    }

    public float getValueUnitTextWidth() {
        return this.f.getTextWidth();
    }

    public static class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f28357b;
        private String e;

        public d(String str, String str2) {
            this.e = str;
            this.f28357b = str2;
        }

        public String e() {
            return this.e;
        }

        public String b() {
            return this.f28357b;
        }
    }
}
