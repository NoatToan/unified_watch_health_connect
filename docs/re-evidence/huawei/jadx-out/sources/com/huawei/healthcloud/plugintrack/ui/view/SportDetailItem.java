package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huawei.haf.router.AppRouter;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.bubblelayout.HealthBubbleLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.dem;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.LanguageUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class SportDetailItem extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f11314c = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f11315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthTextView f11316b;
    private LinearLayout.LayoutParams d;
    private ImageView e;
    private LinearLayout f;
    private LinearLayout.LayoutParams g;
    private LinearLayout.LayoutParams h;
    private boolean i;
    private LinearLayout.LayoutParams j;
    private HealthTextView k;
    private HealthTextView l;
    private LinearLayout.LayoutParams m;
    private LinearLayout.LayoutParams n;
    private RelativeLayout o;
    private RelativeLayout.LayoutParams r;

    public SportDetailItem(Context context) {
        super(context);
        this.d = new LinearLayout.LayoutParams(-2, -2);
        this.j = new LinearLayout.LayoutParams(-2, -2);
        this.m = new LinearLayout.LayoutParams(-2, -2);
        this.n = new LinearLayout.LayoutParams(-2, -2);
        this.g = new LinearLayout.LayoutParams(-2, -2);
        this.r = new RelativeLayout.LayoutParams(-2, -2);
        this.h = new LinearLayout.LayoutParams(-2, -2);
        this.f11315a = new ImageView(context);
        this.e = new ImageView(context);
        this.f11316b = new HealthTextView(context);
        this.l = new HealthTextView(context);
        this.k = new HealthTextView(context);
        Resources resources = context.getResources();
        setGravity(16);
        setPadding(0, resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_12dp), 0, resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_12dp));
        b(resources);
        this.f = c(context, resources);
        c(resources);
        settingUnitTextView(resources);
        this.f11315a.setBackground(resources.getDrawable(R.drawable.ic_health_sportdetail_pace));
        this.d.setMarginEnd((int) resources.getDimension(R.dimen.hw_map_hidden_text_seven));
        addView(this.f11315a, this.d);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = 0;
        this.n.bottomMargin = resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_2dp);
        this.n.setMarginStart(resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_2dp));
        linearLayout2.addView(this.l, this.m);
        linearLayout2.addView(this.k, this.n);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.o = relativeLayout;
        relativeLayout.addView(linearLayout2, layoutParams);
        linearLayout.addView(this.f, this.g);
        linearLayout.addView(this.o, this.r);
        addView(linearLayout);
        setLayoutParams(this.h);
    }

    private void c(Resources resources) {
        this.l.setTypeface(Typeface.create(BaseApplication.getContext().getResources().getString(R.string.textFontFamilyMedium), 0));
        this.l.setMaxLines(2);
        this.l.setEllipsize(TextUtils.TruncateAt.END);
        this.l.setTextSize(0, resources.getDimension(R.dimen.health_common_20sp));
        this.l.setTextColor(resources.getColor(R.color.colorPrimary));
    }

    private LinearLayout c(Context context, Resources resources) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.f11316b, this.j);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(resources.getDimensionPixelOffset(R.dimen.hw_show_public_margin_2dp));
        linearLayout.addView(this.e, layoutParams);
        return linearLayout;
    }

    private void b(Resources resources) {
        this.f11316b.setTextSize(0, resources.getDimension(R.dimen.textSizeBody2));
        this.f11316b.setTextColor(resources.getColor(R.color.colorSecondary));
        this.f11316b.setMaxLines(3);
        this.f11316b.setEllipsize(TextUtils.TruncateAt.END);
    }

    public SportDetailItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new LinearLayout.LayoutParams(-2, -2);
        this.j = new LinearLayout.LayoutParams(-2, -2);
        this.m = new LinearLayout.LayoutParams(-2, -2);
        this.n = new LinearLayout.LayoutParams(-2, -2);
        this.g = new LinearLayout.LayoutParams(-2, -2);
        this.r = new RelativeLayout.LayoutParams(-2, -2);
        this.h = new LinearLayout.LayoutParams(-2, -2);
    }

    public SportDetailItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new LinearLayout.LayoutParams(-2, -2);
        this.j = new LinearLayout.LayoutParams(-2, -2);
        this.m = new LinearLayout.LayoutParams(-2, -2);
        this.n = new LinearLayout.LayoutParams(-2, -2);
        this.g = new LinearLayout.LayoutParams(-2, -2);
        this.r = new RelativeLayout.LayoutParams(-2, -2);
        this.h = new LinearLayout.LayoutParams(-2, -2);
    }

    private void settingUnitTextView(Resources resources) {
        if (qrs.i() > 1.0f) {
            this.k.setMaxLines(2);
        } else {
            this.k.setSingleLine(true);
        }
        this.k.setEllipsize(TextUtils.TruncateAt.END);
        this.k.setTextSize(0, resources.getDimension(R.dimen.textSizeBody2));
        this.k.setAutoTextInfo(9, 1, 2);
        this.k.setTextColor(resources.getColor(R.color.colorSecondary));
    }

    public void setTextColor(int i) {
        this.f11316b.setTextColor(i);
        this.l.setTextColor(i);
        this.k.setTextColor(i);
        this.f11316b.setAlpha(0.5f);
        this.k.setAlpha(0.5f);
    }

    public void setUnitTextColor(int i) {
        if (i != Integer.MAX_VALUE) {
            this.k.setTextColor(i);
        }
    }

    public void setUnitTextAlpha(float f) {
        if (Math.abs(1.0f + f) > 1.0E-6f) {
            this.k.setAlpha(f);
        }
    }

    public void setValueTextSize(float f) {
        this.l.setTextSize(0, f);
    }

    public void e() {
        this.l.getPaint().setFakeBoldText(true);
    }

    public void setGroupSize(int i, int i2) {
        this.h.width = i;
        setMinimumHeight(i2);
        setLayoutParams(this.h);
    }

    public void setGroupSize(int i) {
        this.h.width = i;
        setLayoutParams(this.h);
    }

    public void setGroupSizeHeight(int i) {
        this.h.height = i;
        setLayoutParams(this.h);
    }

    public void setItemView(final a aVar) {
        if (aVar == null) {
            LogUtil.j("Track_SportDetailItem", "setItemView data is null");
            return;
        }
        this.f11315a.setBackground(aVar.f11323b);
        this.f11316b.setText(aVar.d);
        this.l.setText(aVar.i);
        this.k.setText(aVar.f);
        if (aVar.e != null) {
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_statistics_explain);
            if (drawable == null) {
                ReleaseLogUtil.a("Track_SportDetailItem", "explainIcon is null");
                return;
            }
            this.e.setBackground(drawable);
            this.e.setVisibility(0);
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qrs.e(1000, SportDetailItem.this.e)) {
                        LogUtil.j("Track_SportDetailItem", "downRemindClick is fast click");
                        return;
                    }
                    int i = aVar.f11322a;
                    if (i == 0) {
                        dem.b().a(aVar.e);
                    } else if (i == 1) {
                        AppRouter.c(aVar.e).e(268435456).b(BaseApplication.getContext());
                    } else {
                        if (i != 2) {
                            return;
                        }
                        SportDetailItem.this.a(aVar.e);
                    }
                }
            });
            c(drawable.getIntrinsicWidth());
            return;
        }
        this.e.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        int iB;
        int i;
        LinearLayout linearLayout = (LinearLayout) inflate(getContext(), R.layout.track_detail_item_bubble, null);
        if (linearLayout == null) {
            LogUtil.e("Track_SportDetailItem", "bubbleLayout is null");
            return;
        }
        HealthBubbleLayout healthBubbleLayout = (HealthBubbleLayout) linearLayout.findViewById(R.id.item_bubble);
        ((TextView) linearLayout.findViewById(R.id.item_bubble_content)).setText(str);
        int[] iArr = new int[2];
        this.e.getLocationInWindow(iArr);
        int iSqrt = (int) ((2.0d - Math.sqrt(2.0d)) * 2.0d * ((double) healthBubbleLayout.getBubbleRadius()));
        if (iArr[0] < qrs.i(getContext()) / 2) {
            if (LanguageUtil.ba(getContext())) {
                i = -(iArr[0] + this.e.getWidth());
                healthBubbleLayout.setArrowStartLocation(2);
            } else {
                i = -iArr[0];
                healthBubbleLayout.setArrowStartLocation(1);
            }
            iB = (((iArr[0] - qre.b(R.dimen.health_common_12dp)) - iSqrt) - (qre.b(R.dimen.health_common_22dp) / 2)) + (this.e.getWidth() / 2);
        } else {
            if (LanguageUtil.ba(getContext())) {
                healthBubbleLayout.setArrowStartLocation(1);
            } else {
                healthBubbleLayout.setArrowStartLocation(2);
            }
            int i2 = qrs.i(getContext());
            int i3 = iArr[0];
            iB = ((((i2 - i3) - qre.b(R.dimen.health_common_12dp)) - iSqrt) - (qre.b(R.dimen.health_common_22dp) / 2)) - (this.e.getWidth() / 2);
            i = 0;
        }
        healthBubbleLayout.setArrowPosition(iB);
        final PopupWindow popupWindow = new PopupWindow(getContext());
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        popupWindow.setContentView(linearLayout);
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchable(true);
        popupWindow.showAsDropDown(this.e, i, 0);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: jsl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                popupWindow.dismiss();
            }
        });
        if (qrs.t()) {
            e(popupWindow);
        }
    }

    private void e(final PopupWindow popupWindow) {
        this.i = qrs.af(getContext());
        final ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                boolean zAf = qrs.af(SportDetailItem.this.getContext());
                if (SportDetailItem.this.i != zAf) {
                    LogUtil.a("Track_SportDetailItem", "popupWindow dismiss");
                    SportDetailItem.this.i = zAf;
                    popupWindow.dismiss();
                }
            }
        };
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener(this) { // from class: com.huawei.healthcloud.plugintrack.ui.view.SportDetailItem.1
            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
                }
            }
        });
        viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    private void c(final int i) {
        this.f11316b.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: jso
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f38978c.e(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i) {
        int i2 = this.h.width;
        int width = this.f11315a.getWidth();
        if (this.f11316b.getWidth() > ((i2 - width) - i) - qrs.d(getContext(), 12.0f)) {
            this.f11316b.setTextSize(0, this.f11316b.getTextSize() - 1.0f);
        }
    }

    public static void d(boolean z) {
        f11314c = z;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        this.g.gravity = 1;
        this.f.setLayoutParams(this.g);
        if (f11314c) {
            this.f11316b.setGravity(17);
            this.f11316b.setAutoTextInfo(9, 1, 1);
            LogUtil.a("Track_SportDetailItem", "mName mUnit setAutoTextInfo 9");
            this.k.setAutoTextInfo(9, 1, 1);
            this.f11316b.setMaxLines(2);
        }
        this.m.gravity = 1;
        this.o.setLayoutParams(this.m);
        this.f11315a.setVisibility(8);
        this.n.setMargins(qrs.d(context, 2.0f), qrs.d(context, 6.0f), 0, 0);
        this.k.setLayoutParams(this.n);
        this.k.setSingleLine(false);
        this.k.setMaxLines(2);
    }

    public void e(Context context) {
        if (context == null) {
            return;
        }
        Resources resources = context.getResources();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(resources.getDimensionPixelSize(R.dimen.emui_card_device_12dp));
        layoutParams.setMarginEnd((int) resources.getDimension(R.dimen.emui_card_device_16dp));
        this.f11315a.setLayoutParams(layoutParams);
    }

    public void b(int i, int i2, int i3) {
        if (i != 0) {
            this.f11316b.setTextSize(0, i);
        }
        if (i2 != 0) {
            this.l.setTextSize(0, i2);
        }
        if (i3 != 0) {
            this.k.setTextSize(0, i3);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11322a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f11323b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f11324c;
        private String d;
        private String e;
        private String f;
        private String h;
        private String i;
        private int g = Integer.MAX_VALUE;
        private float j = -1.0f;

        public a(Drawable drawable, String str, String str2, String str3, String str4, String str5) {
            this.f11323b = drawable;
            this.f11324c = str;
            this.d = str2;
            this.i = str3;
            this.f = str4;
            this.h = str5;
        }

        public void e(String str) {
            this.e = str;
        }

        public String e() {
            return this.f11324c;
        }

        public String c() {
            return this.d;
        }

        public String j() {
            return this.i;
        }

        public void c(String str) {
            this.i = str;
        }

        public String h() {
            return this.f;
        }

        public void a(String str) {
            this.f = str;
        }

        public String b() {
            return this.h;
        }

        public void b(String str) {
            this.h = str;
        }

        public void b(int i) {
            this.g = i;
        }

        public int d() {
            return this.g;
        }

        public float a() {
            return this.j;
        }

        public void d(float f) {
            this.j = f;
        }
    }
}
