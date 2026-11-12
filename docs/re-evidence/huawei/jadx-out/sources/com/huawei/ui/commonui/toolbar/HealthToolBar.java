package com.huawei.ui.commonui.toolbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.columnsystem.HealthColumnSystem;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.qqv;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.ReleaseLogUtil;

/* JADX INFO: loaded from: classes16.dex */
public class HealthToolBar extends LinearLayout implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f23930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f23931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f23932c;
    private HealthColumnSystem d;
    private LinearLayout e;
    private int f;
    private boolean g;
    private int h;
    private OnSingleTapListener i;
    private int j;
    private LinearLayout l;
    private int m;
    private HealthTextView n;
    private LinearLayout o;

    /* JADX INFO: loaded from: classes3.dex */
    public interface OnSingleTapListener {
        void onSingleTap(int i);
    }

    public HealthToolBar(Context context) {
        super(context);
        this.f23930a = true;
        this.f = 10;
        this.h = 0;
        this.j = 0;
        this.f23932c = true;
        this.g = true;
        this.f23931b = context;
        c();
    }

    public HealthToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23930a = true;
        this.f = 10;
        this.h = 0;
        this.j = 0;
        this.f23932c = true;
        this.g = true;
        if (attributeSet == null) {
            return;
        }
        this.f23931b = context;
        c();
    }

    private void c() {
        ((LayoutInflater) this.f23931b.getSystemService("layout_inflater")).inflate(R.layout.toobarlayout, this);
        this.o = (LinearLayout) findViewById(R.id.toolbar_layout);
        if (qrs.ag(this.f23931b)) {
            LogUtil.a("CommonUI_HealthToolBar", "old samsung night mode");
            this.o.setBackgroundColor(Color.parseColor("#FAFAFA"));
        }
        e();
    }

    private void e() {
        HealthColumnSystem healthColumnSystem = new HealthColumnSystem(this.f23931b);
        this.d = healthColumnSystem;
        healthColumnSystem.b(this.f23931b);
        j(0);
    }

    private int e(HealthColumnSystem healthColumnSystem, int i) {
        healthColumnSystem.d(6);
        int iG = healthColumnSystem.g();
        healthColumnSystem.d(7);
        int iG2 = healthColumnSystem.g();
        if (i != 1) {
            return i > 3 ? iG2 : iG;
        }
        healthColumnSystem.d(1);
        return healthColumnSystem.g();
    }

    private LinearLayout b(int i) {
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            LogUtil.j("CommonUI_HealthToolBar", "mDefaultView is null");
            return null;
        }
        if (i == 0) {
            return (LinearLayout) linearLayout.findViewById(R.id.toolbar_item_left_border);
        }
        if (i == 1) {
            return (LinearLayout) linearLayout.findViewById(R.id.toolbar_item_left);
        }
        if (i == 2) {
            return (LinearLayout) linearLayout.findViewById(R.id.toolbar_item_mid);
        }
        if (i == 3) {
            return (LinearLayout) linearLayout.findViewById(R.id.toolbar_item_right);
        }
        if (i != 4) {
            return null;
        }
        return (LinearLayout) linearLayout.findViewById(R.id.toolbar_item_right_border);
    }

    private ImageView c(int i) {
        ImageView imageView;
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB == null) {
            LogUtil.j("CommonUI_HealthToolBar", "initImageView() item is null");
        } else {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                imageView = (ImageView) linearLayoutB.findViewById(R.id.toolbar_imageView);
            }
            if (imageView != null && this.g) {
                imageView.setImageTintList(ColorStateList.valueOf(this.f23931b.getResources().getColor(R.color.colorPrimary)));
            }
            return imageView;
        }
        imageView = null;
        if (imageView != null) {
            imageView.setImageTintList(ColorStateList.valueOf(this.f23931b.getResources().getColor(R.color.colorPrimary)));
        }
        return imageView;
    }

    private HealthTextView f(int i) {
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB == null) {
            LogUtil.j("CommonUI_HealthToolBar", "initTextView() item is null");
            return null;
        }
        if (i == 0) {
            return (HealthTextView) linearLayoutB.findViewById(R.id.toolbar_textView);
        }
        if (i == 1) {
            return (HealthTextView) linearLayoutB.findViewById(R.id.toolbar_textView);
        }
        if (i == 2) {
            return (HealthTextView) linearLayoutB.findViewById(R.id.toolbar_textView);
        }
        if (i == 3) {
            return (HealthTextView) linearLayoutB.findViewById(R.id.toolbar_textView);
        }
        if (i != 4) {
            return null;
        }
        return (HealthTextView) linearLayoutB.findViewById(R.id.toolbar_textView);
    }

    private void b(int i, int i2, float f) {
        setIconVisible(i, 0);
        ImageView imageViewC = c(i);
        if (imageViewC == null) {
            LogUtil.j("CommonUI_HealthToolBar", "imageView is null");
        } else {
            imageViewC.setImageDrawable(this.f23931b.getResources().getDrawable(i2));
            imageViewC.setAlpha(f);
        }
    }

    private void b(int i, Drawable drawable, float f) {
        setIconVisible(i, 0);
        ImageView imageViewC = c(i);
        if (imageViewC == null) {
            LogUtil.j("CommonUI_HealthToolBar", "imageView is null");
        } else {
            imageViewC.setImageDrawable(drawable);
            imageViewC.setAlpha(f);
        }
    }

    private void b(int i, CharSequence charSequence, boolean z, boolean z2) {
        HealthTextView healthTextViewF = f(i);
        if (healthTextViewF == null) {
            LogUtil.j("CommonUI_HealthToolBar", "textView is null");
            return;
        }
        healthTextViewF.setText(charSequence);
        if (z) {
            if (z2) {
                healthTextViewF.setTextColor(this.f23931b.getResources().getColor(R.color.common_colorAccent));
            } else {
                healthTextViewF.setTextColor(this.f23931b.getResources().getColor(R.color.textColorSecondary));
            }
        }
    }

    private void b(View view, int i, int i2) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i2);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    private void a() {
        if (this.n.getLineCount() > 1) {
            int i = this.f;
            if (i > 9) {
                int i2 = i - 1;
                this.f = i2;
                this.n.setTextSize(2, i2);
                return;
            } else {
                if (this.n.getLineCount() > 1 && this.n.getMaxLines() < 2) {
                    this.n.setMaxLines(2);
                }
                this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                return;
            }
        }
        this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        LinearLayout linearLayout = this.e;
        if (linearLayout == null) {
            return;
        }
        this.m = 0;
        LinearLayout linearLayout2 = (LinearLayout) linearLayout.findViewById(R.id.toolbar_linear_layout);
        this.l = linearLayout2;
        int childCount = linearLayout2.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (this.l.getChildAt(i5).getVisibility() != 8) {
                this.m++;
            }
        }
        int i6 = this.m;
        if (i6 <= 0) {
            return;
        }
        if (i6 < 4) {
            if (this.l.getWeightSum() != 3.0f) {
                b(this.l, qrs.d(this.f23931b, 24.0f), qrs.d(this.f23931b, 24.0f));
                this.l.setWeightSum(3.0f);
            }
        } else if (i6 == 4) {
            if (this.l.getWeightSum() != 4.0f) {
                b(this.l, qrs.d(this.f23931b, 24.0f), qrs.d(this.f23931b, 24.0f));
                this.l.setWeightSum(4.0f);
            }
        } else if (this.l.getWeightSum() != this.m) {
            b(this.l, 0, 0);
            this.l.setWeightSum(this.m);
        }
        if (this.f23932c) {
            int i7 = this.j;
            int i8 = this.m;
            if (i7 != i8) {
                j(i8);
            }
            LinearLayout linearLayout3 = this.l;
            int i9 = this.h;
            b(linearLayout3, i9, i9);
            this.l.setWeightSum(this.m);
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.l.getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                HealthTextView healthTextView = (HealthTextView) childAt.findViewById(R.id.toolbar_textView);
                this.n = healthTextView;
                healthTextView.getViewTreeObserver().addOnGlobalLayoutListener(this);
            }
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.b(this.f23931b);
        j(this.m);
    }

    private void j(int i) {
        if (this.f23932c) {
            this.j = i;
            this.h = (qqv.d(getContext()) - e(this.d, i)) / 2;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (this.n.getLineCount() > 1) {
            if (this.f23930a) {
                b(this.l, 0, 0);
                this.l.setWeightSum(this.m);
                this.f23930a = false;
            }
            a();
            return;
        }
        this.n.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.e.findViewById(R.id.toolbar_item_left_border)) {
            this.i.onSingleTap(0);
            return;
        }
        if (view == this.e.findViewById(R.id.toolbar_item_left)) {
            this.i.onSingleTap(1);
            return;
        }
        if (view == this.e.findViewById(R.id.toolbar_item_mid)) {
            this.i.onSingleTap(2);
            return;
        }
        if (view == this.e.findViewById(R.id.toolbar_item_right)) {
            this.i.onSingleTap(3);
        } else if (view == this.e.findViewById(R.id.toolbar_item_right_border)) {
            this.i.onSingleTap(4);
        } else {
            LogUtil.j("Invalid click", new Object[0]);
        }
    }

    public void b(View view) {
        LinearLayout linearLayout = this.o;
        if (linearLayout == null || view == null) {
            LogUtil.j("CommonUI_HealthToolBar", "addItemView() mToolbarLayout is null or view is null");
            return;
        }
        linearLayout.addView(view);
        view.invalidate();
        view.requestLayout();
    }

    public void d(View view) {
        LinearLayout linearLayout;
        if (view instanceof LinearLayout) {
            this.e = (LinearLayout) view;
        } else {
            ReleaseLogUtil.d("CommonUI_HealthToolBar", "addDefaultView view is not LinearLayout view ", view);
        }
        LinearLayout linearLayout2 = this.o;
        if (linearLayout2 == null || (linearLayout = this.e) == null) {
            ReleaseLogUtil.d("CommonUI_HealthToolBar", "addDefaultView mToolbarLayout ", linearLayout2, " mDefaultView ", this.e);
            return;
        }
        linearLayout2.addView(linearLayout);
        this.e.invalidate();
        this.e.requestLayout();
    }

    public void a(Activity activity) {
        if (activity == null || this.o == null) {
            LogUtil.j("CommonUI_HealthToolBar", "activity is null");
        } else if (CommonUtil.bg()) {
            activity.getWindow().setNavigationBarColor(((ColorDrawable) this.o.getBackground().mutate()).getColor());
        }
    }

    public LinearLayout e(int i) {
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB != null) {
            return linearLayoutB;
        }
        LogUtil.j("CommonUI_HealthToolBar", "getItem() item is null");
        return null;
    }

    public boolean a(int i) {
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB != null) {
            return linearLayoutB.getVisibility() == 0;
        }
        LogUtil.j("CommonUI_HealthToolBar", "getIconVisible() item is null");
        return false;
    }

    public void setIconVisible(int i, int i2) {
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB == null) {
            LogUtil.j("CommonUI_HealthToolBar", "setIconVisible() item is null");
            return;
        }
        linearLayoutB.setVisibility(i2);
        if (i2 == 0) {
            linearLayoutB.setOnClickListener(this);
        }
        this.e.invalidate();
        this.e.requestLayout();
    }

    public boolean d(int i) {
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB == null) {
            LogUtil.j("CommonUI_HealthToolBar", "getIconEnabled() item is null");
            return false;
        }
        return linearLayoutB.isEnabled();
    }

    public void setIconEnabled(int i, boolean z) {
        setIconVisible(i, 0);
        LinearLayout linearLayoutB = b(i);
        if (linearLayoutB == null) {
            LogUtil.j("CommonUI_HealthToolBar", "setIconEnabled() item is null");
            return;
        }
        linearLayoutB.setEnabled(z);
        if (z) {
            linearLayoutB.setOnClickListener(this);
        }
    }

    public void setIcon(int i, int i2) {
        b(i, i2, 1.0f);
    }

    public void setIcon(int i, Drawable drawable) {
        b(i, drawable, 1.0f);
    }

    public void setIconTitle(int i, CharSequence charSequence) {
        b(i, charSequence, false, false);
    }

    public void setIconTitleColor(int i, CharSequence charSequence, int i2) {
        HealthTextView healthTextViewF = f(i);
        if (healthTextViewF == null) {
            LogUtil.j("CommonUI_HealthToolBar", "textView is null");
        } else {
            healthTextViewF.setText(charSequence);
            healthTextViewF.setTextColor(this.f23931b.getResources().getColor(i2));
        }
    }

    public void setOnSingleTapListener(OnSingleTapListener onSingleTapListener) {
        this.i = onSingleTapListener;
    }

    public void setIsColumnEnabled(boolean z) {
        this.f23932c = z;
        this.e.invalidate();
        this.e.requestLayout();
    }
}
