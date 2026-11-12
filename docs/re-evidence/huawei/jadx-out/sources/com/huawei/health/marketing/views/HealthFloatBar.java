package com.huawei.health.marketing.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bumptech.glide.request.RequestOptions;
import com.google.gson.Gson;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.health.marketing.datatype.ResourceBriefInfo;
import com.huawei.health.marketing.datatype.TriggerEventBase;
import com.huawei.health.marketing.datatype.templates.MemberPromotionTemplate;
import com.huawei.health.marketing.utils.MarketingBiUtils;
import com.huawei.health.servicesui.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import defpackage.fxl;
import defpackage.njy;
import defpackage.qqf;
import defpackage.qqp;
import defpackage.qrs;
import defpackage.qso;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class HealthFloatBar extends FrameLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected MemberPromotionTemplate f8339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected HealthButton f8340c;
    protected ImageView d;
    protected boolean e;
    protected int f;
    protected ImageView g;
    protected ImageView h;
    protected int i;
    protected HealthTextView j;
    private TriggerEventBase k;
    private int l;
    private ResourceBriefInfo m;
    private long n;
    private boolean o;
    private int q;

    public HealthFloatBar(Context context) {
        this(context, R.layout.bottom_floating_bar);
    }

    public HealthFloatBar(Context context, int i) {
        super(context, null);
        this.e = true;
        this.o = false;
        inflate(context, i, this);
        this.f8338a = context;
    }

    public void d(ResourceBriefInfo resourceBriefInfo, int i) {
        LogUtil.a("HealthFloatBar", "initData resourceBriefInfo is", resourceBriefInfo.toString());
        setId(i);
        this.m = resourceBriefInfo;
        this.l = i;
        getTriggerPage();
        this.f8339b = (MemberPromotionTemplate) new Gson().fromJson(resourceBriefInfo.getContent().getContent(), MemberPromotionTemplate.class);
        a();
    }

    private void getTriggerPage() {
        ResourceBriefInfo resourceBriefInfo = this.m;
        if (resourceBriefInfo == null || resourceBriefInfo.getMarketingRule() == null) {
            return;
        }
        List<TriggerEventBase> triggerEvents = this.m.getMarketingRule().getTriggerEvents();
        if (njy.e(triggerEvents)) {
            ReleaseLogUtil.e("R_HealthFloatBar", "getTriggerPage eventBaseList is empty");
            return;
        }
        for (TriggerEventBase triggerEventBase : triggerEvents) {
            if (triggerEventBase != null && triggerEventBase.getEventType() == 49) {
                this.k = triggerEventBase;
                return;
            }
        }
    }

    protected void a() {
        ImageView imageView = (ImageView) findViewById(R.id.marketing_bar_image);
        this.g = imageView;
        imageView.setOnClickListener(this);
        this.d = (ImageView) findViewById(R.id.marketing_close_icon);
        HealthButton healthButton = (HealthButton) findViewById(R.id.marketing_float_bar_button);
        this.f8340c = healthButton;
        healthButton.setOnClickListener(this);
        this.j = (HealthTextView) findViewById(R.id.marketing_float_bar_text);
        b();
        this.i = qqp.a(this.f8338a, 366.0f);
        this.f = qqp.a(this.f8338a, 35.0f);
        boolean zAf = qrs.af(this.f8338a);
        if (zAf) {
            this.i = qqp.a(this.f8338a, 485.0f);
            this.f = qqp.a(this.f8338a, 36.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.g.getLayoutParams();
        layoutParams.width = this.i;
        layoutParams.height = this.f;
        this.g.setLayoutParams(layoutParams);
        setTextParams(zAf);
        setIconParams(zAf);
        setLayoutParams(getParams());
        if (this.f8339b == null) {
            return;
        }
        if (qrs.af(this.f8338a)) {
            setIconImage(this.g, this.f8339b.getTahitiPicture());
        } else {
            setIconImage(this.g, this.f8339b.getPicture());
        }
    }

    private void setTextParams(boolean z) {
        if (this.j.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
            if (z) {
                marginLayoutParams.setMarginStart(qqp.a(this.f8338a, 36.0f));
            } else {
                marginLayoutParams.setMarginStart(qqp.a(this.f8338a, 48.0f));
            }
            this.j.setLayoutParams(marginLayoutParams);
        }
    }

    private void setIconParams(boolean z) {
        if (this.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
            if (z) {
                marginLayoutParams.setMarginEnd(qqp.a(this.f8338a, 0.0f));
            } else {
                marginLayoutParams.setMarginEnd(qqp.a(this.f8338a, 10.0f));
            }
            this.d.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (qrs.e(view)) {
            LogUtil.a("HealthFloatBar", "click too fast");
        } else if (view == this.g || view == this.h || view == this.f8340c) {
            fxl.d(this.f8339b.getLinkValue(), this.l, this.m);
            MarketingBiUtils.c(this.l, this.m, this.n);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.d.setVisibility(8);
        this.f8340c.setVisibility(8);
        this.j.setVisibility(8);
        a();
    }

    public void setIconImage(ImageView imageView, String str) {
        if (!e() && !TextUtils.isEmpty(str)) {
            qqf.e(str, new RequestOptions(), imageView);
            LogUtil.a("HealthFloatBar", "setIconImage after load");
            e(true);
            this.n = System.currentTimeMillis();
            MarketingBiUtils.e(this.l, this.m);
            return;
        }
        e(false);
    }

    protected void e(boolean z) {
        if (!z) {
            LogUtil.j("HealthFloatBar", "float image not loaded");
            return;
        }
        this.d.setVisibility(0);
        if (this.f8339b.isButtonVisibility()) {
            this.f8340c.setVisibility(0);
            this.f8340c.setText(this.f8339b.getButtonName());
        } else {
            this.f8340c.setVisibility(8);
        }
        this.j.setVisibility(0);
        this.j.setText(this.f8339b.getTheme());
    }

    private boolean e() {
        Context context = this.f8338a;
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing();
        }
        LogUtil.j("HealthFloatBar", "mContext is not activity.");
        return false;
    }

    protected void b() {
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.health.marketing.views.HealthFloatBar.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                HealthFloatBar.this.g();
                MarketingBiUtils.b(HealthFloatBar.this.l, HealthFloatBar.this.m, HealthFloatBar.this.n);
                HealthFloatBar.this.d();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ReleaseLogUtil.d("R_HealthFloatBar", "setResourceCloseRecord. closeTime = ", Long.valueOf(jCurrentTimeMillis), "; resourceName = ", this.m.getResourceName(), "; contentType = ", Integer.valueOf(this.m.getContentType()));
        fxl.b(this.l, this.q, this.m);
        SharedPreferenceManager.c(Integer.toString(10000), "marketing_float_bar_close_time", System.currentTimeMillis());
    }

    private void e(Activity activity) {
        e(a(activity));
    }

    private void e(FrameLayout frameLayout) {
        if (frameLayout == null || !d(frameLayout)) {
            return;
        }
        setTag(Integer.valueOf(this.m.getContentType()));
        frameLayout.addView(this);
        this.o = true;
    }

    private FrameLayout a(Activity activity) {
        return (FrameLayout) activity.getWindow().getDecorView().findViewById(android.R.id.content);
    }

    protected FrameLayout.LayoutParams getParams() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.i, -2);
        layoutParams.gravity = 81;
        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, 0, 200);
        return layoutParams;
    }

    public void setTypeId(int i) {
        this.q = i;
    }

    public void setPageVisibility(String str) {
        TriggerEventBase triggerEventBase = this.k;
        if (triggerEventBase == null) {
            a(0);
            this.e = true;
        } else if (triggerEventBase.getEventValue() != null && this.k.getEventValue().contains(str)) {
            LogUtil.a("HealthFloatBar", "setvisible visible");
            a(0);
            this.e = true;
        } else {
            LogUtil.a("HealthFloatBar", "setvisible Gone");
            a(8);
            this.e = false;
        }
    }

    protected void a(int i) {
        setVisibility(i);
        ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", Integer.valueOf(i));
        qso.d().a((View) this, true);
    }

    public void c() {
        if (this.o || e()) {
            return;
        }
        Context context = this.f8338a;
        if (context instanceof Activity) {
            e((Activity) context);
        }
    }

    public void d() {
        if (e() || !this.o) {
            return;
        }
        Context context = this.f8338a;
        if (context instanceof Activity) {
            d((Activity) context);
        }
        ObserverManagerUtil.e("HEALTH_FLOAT_BAR_STATE_CHANGE", 8);
    }

    private void d(Activity activity) {
        FrameLayout frameLayoutA = a(activity);
        if (frameLayoutA != null) {
            frameLayoutA.removeView(this);
        }
    }

    private boolean d(FrameLayout frameLayout) {
        int i = this.l;
        if (i == 0) {
            LogUtil.a("HealthFloatBar", "mPositionId = 0.");
            return true;
        }
        LogUtil.a("HealthFloatBar", "mPositionId = ", Integer.valueOf(i));
        HealthFloatBar healthFloatBar = (HealthFloatBar) frameLayout.findViewById(this.l);
        if (healthFloatBar == null) {
            LogUtil.a("HealthFloatBar", "floatBar == null");
        } else {
            LogUtil.a("HealthFloatBar", "floatBar exsit. positionId: ", Integer.valueOf(this.l));
        }
        return healthFloatBar == null;
    }
}
