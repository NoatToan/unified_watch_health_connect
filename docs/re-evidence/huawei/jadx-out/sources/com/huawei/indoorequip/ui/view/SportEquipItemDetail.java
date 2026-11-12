package com.huawei.indoorequip.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.indoorequip.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.nyn;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes12.dex */
public class SportEquipItemDetail extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout.LayoutParams f17821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f17822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout.LayoutParams f17823c;
    private ImageView d;
    private HealthTextView e;
    private LinearLayout.LayoutParams f;
    private int g;
    private int h;
    private LinearLayout i;
    private LinearLayout.LayoutParams j;
    private LinearLayout.LayoutParams k;
    private HealthTextView l;
    private int m;
    private Typeface n;
    private LinearLayout o;

    private boolean d(int i) {
        return i == 283;
    }

    public SportEquipItemDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = 0;
        this.f17823c = new LinearLayout.LayoutParams(-2, -2);
        this.f = new LinearLayout.LayoutParams(-2, -2);
        this.k = new LinearLayout.LayoutParams(-2, -2);
        this.f17821a = new LinearLayout.LayoutParams(-2, -1);
        this.j = new LinearLayout.LayoutParams(-2, -2);
    }

    public SportEquipItemDetail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.m = 0;
        this.f17823c = new LinearLayout.LayoutParams(-2, -2);
        this.f = new LinearLayout.LayoutParams(-2, -2);
        this.k = new LinearLayout.LayoutParams(-2, -2);
        this.f17821a = new LinearLayout.LayoutParams(-2, -1);
        this.j = new LinearLayout.LayoutParams(-2, -2);
    }

    public SportEquipItemDetail(Context context, int i, int i2, String str) {
        super(context);
        this.m = 0;
        this.f17823c = new LinearLayout.LayoutParams(-2, -2);
        this.f = new LinearLayout.LayoutParams(-2, -2);
        this.k = new LinearLayout.LayoutParams(-2, -2);
        this.f17821a = new LinearLayout.LayoutParams(-2, -1);
        this.j = new LinearLayout.LayoutParams(-2, -2);
        this.d = new ImageView(context);
        this.e = new HealthTextView(context);
        this.l = new HealthTextView(context);
        this.f17822b = new ImageView(context);
        this.o = new LinearLayout(context);
        this.i = new LinearLayout(context);
        this.m = i;
        Resources resources = context.getResources();
        this.e.setTextSize(0, qrs.d(context, 16.0f));
        this.e.setTextColor(resources.getColor(R.color.ie_text_view_title_color));
        this.h = qrs.d(context, 16.0f);
        this.e.setMaxLines(LanguageUtil.f(context) || LanguageUtil.q(context) ? 2 : 1);
        this.e.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setWeightSum(5.0f);
        Object systemService = getContext().getSystemService(Constants.NATIVE_WINDOW_SUB_DIR);
        if (!(systemService instanceof WindowManager)) {
            LogUtil.c("Track_IDEQ_SportEquipItemDetail", "object is invalid type");
            return;
        }
        WindowManager windowManager = (WindowManager) systemService;
        int iB = b(windowManager);
        a(context, resources, linearLayout, iB, i2);
        b(context, resources, linearLayout, iB, i2);
        addView(linearLayout);
        if (d(this.m)) {
            this.j.height = 500;
        } else {
            this.j.height = 400;
        }
        a(context, str, resources, iB);
        this.j.width = b(windowManager);
        setLayoutParams(this.j);
    }

    private void a(Context context, String str, Resources resources, int i) {
        this.l.setMaxLines(2);
        this.l.setEllipsize(TextUtils.TruncateAt.END);
        Typeface typefaceCreateFromAsset = Typeface.createFromAsset(BaseApplication.getContext().getAssets(), "font/HarmonyOSCondensedClockProportional-Medium.ttf");
        this.n = typefaceCreateFromAsset;
        this.l.setTypeface(typefaceCreateFromAsset);
        b(context, str, i);
        this.l.setTextColor(resources.getColor(R.color.textColorPrimaryInverse));
    }

    private void b(Context context, String str, int i) {
        if (!TextUtils.isEmpty(str) && str.length() > 5) {
            Paint paint = new Paint();
            paint.setTypeface(this.n);
            for (int i2 = 48; i2 >= 0; i2--) {
                float f = i2;
                paint.setTextSize(qrs.d(context, f));
                if (paint.measureText(str) < i - qrs.d(context, 24.0f)) {
                    this.l.setTextSize(0, qrs.d(context, f));
                    return;
                }
            }
            return;
        }
        this.l.setTextSize(0, qrs.d(context, 48.0f));
    }

    private int b(WindowManager windowManager) {
        return windowManager.getDefaultDisplay().getWidth() / 2;
    }

    private void a(Context context, Resources resources, LinearLayout linearLayout, int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        this.o.setOrientation(0);
        this.o.setGravity(81);
        if (d(this.m)) {
            layoutParams = new LinearLayout.LayoutParams(i, 0, 3.0f);
            layoutParams.bottomMargin = resources.getDimensionPixelOffset(R.dimen.health_common_8dp);
        } else {
            layoutParams = new LinearLayout.LayoutParams(i2, 0, 3.0f);
            this.f17821a.gravity = 80;
            layoutParams.topMargin = 0;
        }
        this.o.addView(this.l, this.k);
        this.o.addView(this.f17822b, this.f17821a);
        linearLayout.addView(this.o, layoutParams);
    }

    private void b(Context context, Resources resources, LinearLayout linearLayout, int i, int i2) {
        LinearLayout.LayoutParams layoutParams;
        this.i.setOrientation(0);
        this.i.setGravity(49);
        if (d(this.m)) {
            this.g = i;
            layoutParams = new LinearLayout.LayoutParams(this.g, 0, 2.0f);
        } else {
            this.g = i2;
            layoutParams = new LinearLayout.LayoutParams(this.g, 0, 2.0f);
        }
        this.i.addView(this.e, this.f);
        this.i.addView(this.d, this.f17823c);
        linearLayout.addView(this.i, layoutParams);
    }

    public void setTextColor(int i) {
        this.e.setTextColor(i);
        this.l.setTextColor(i);
        this.e.setAlpha(0.5f);
    }

    public void setValueTextSize(float f) {
        this.l.setTextSize(0, f);
    }

    public void setNameTextSize(float f) {
        this.e.setTextSize(0, f);
        b((int) f);
    }

    public HealthTextView getName() {
        return this.e;
    }

    public ImageView getNameImage() {
        return this.d;
    }

    public HealthTextView getValue() {
        return this.l;
    }

    public void a(int i) {
        this.e.setAutoTextSize(0, i);
        this.e.setAutoTextInfo(10, 1, 1);
        b(i);
    }

    public void e(int i) {
        this.l.setTextSize(0, i);
    }

    public void setGroupSize(int i, int i2) {
        this.j.width = i;
        this.j.height = i2;
        setLayoutParams(this.j);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(c(i, true), c(i2, false));
    }

    private int c(int i, boolean z) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int i2 = z ? 500 : 400;
        return mode == Integer.MIN_VALUE ? Math.min(i2, size) : i2;
    }

    public void setItemView(e eVar) {
        if (eVar == null) {
            LogUtil.d("Track_IDEQ_SportEquipItemDetail", "setItemView data is null");
            return;
        }
        if (eVar.e != null) {
            int i = this.h;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.setMargins(0, (int) (this.h * 0.2f), 0, 0);
            this.e.setMaxWidth(this.g - this.h);
            this.d.setLayoutParams(layoutParams);
            this.d.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.d.setImageDrawable(eVar.e);
        }
        this.e.setText(eVar.f17825c);
        if (eVar.f17824b != null) {
            this.l.setText(eVar.f17824b);
        }
        if (eVar.d != null) {
            c(eVar.d);
        }
    }

    public void b(int i) {
        this.h = i;
    }

    private void c(nyn nynVar) {
        if (nynVar.e() != null) {
            this.f17822b.setImageDrawable(nynVar.e());
        }
        if (nynVar.d() != 0) {
            this.e.setTextColor(nynVar.d());
        }
        if (nynVar.a() != 0) {
            this.e.setTextSize(nynVar.a());
        }
        if (nynVar.b() != 0) {
            this.l.setTextColor(nynVar.b());
        }
        if (nynVar.c() != 0) {
            this.l.setTextSize(nynVar.c());
        }
    }

    public void c(Context context, float f) {
        if (context == null) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart((int) f);
        this.e.setLayoutParams(layoutParams);
        this.l.setLayoutParams(layoutParams);
    }

    public void e(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.g, 0, 0.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(this.g, 0, 5.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
        this.o.setLayoutParams(layoutParams);
        this.i.setGravity(17);
        this.i.setLayoutParams(layoutParams2);
        layoutParams3.setMarginStart(i);
        this.e.setVisibility(8);
        this.l.setVisibility(8);
        this.d.setLayoutParams(layoutParams3);
    }

    public static class e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f17824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f17825c;
        private nyn d;
        private Drawable e;

        public e(Drawable drawable, String str, String str2) {
            if (drawable != null) {
                this.e = drawable;
            }
            if (str != null) {
                this.f17825c = str;
            }
            if (str2 != null) {
                this.f17824b = str2;
            }
        }

        public e(Drawable drawable, String str, String str2, nyn nynVar) {
            if (drawable != null) {
                this.e = drawable;
            }
            if (str != null) {
                this.f17825c = str;
            }
            if (str2 != null) {
                this.f17824b = str2;
            }
            if (nynVar != null) {
                this.d = nynVar;
            }
        }

        public String c() {
            return this.f17825c;
        }

        public Drawable d() {
            return this.e;
        }

        public String a() {
            return this.f17824b;
        }
    }
}
