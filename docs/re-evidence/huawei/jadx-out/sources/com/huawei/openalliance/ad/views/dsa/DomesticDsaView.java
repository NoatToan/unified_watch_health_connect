package com.huawei.openalliance.ad.views.dsa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.SafeIntent;
import com.huawei.openalliance.ad.activity.SplashFeedbackActivity;
import com.huawei.openalliance.ad.constant.MapKeyNames;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.jj;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.d;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.i;

/* JADX INFO: loaded from: classes12.dex */
public class DomesticDsaView extends i {
    protected Boolean k;
    private RelativeLayout l;
    private TextView m;
    private View n;
    private RelativeLayout o;
    private TextView p;
    private ContentRecord q;
    private Integer r;
    private jj s;
    private hp t;

    public void setDsaJumpListener(hp hpVar) {
        this.t = hpVar;
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void setAdContent(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return;
        }
        this.q = contentRecord;
        a(this.t);
        f();
        c();
        g();
    }

    protected int getLayoutId() {
        return ab.t(getContext()) ? R.layout.hiad_domestic_dsa_view_tv : R.layout.hiad_domestic_dsa_view;
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void d(Context context) {
        if (ab.t(getContext())) {
            h();
        } else {
            super.d(context);
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void c(Context context) {
        if (ab.n(context)) {
            this.d = 0.4f;
        } else if (ab.q(context) && ab.r(context)) {
            this.d = 0.4f;
        } else {
            this.d = ab.t(context) ? 0.18f : 0.56f;
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void c() {
        try {
            hw.b("DomesticDsaView", "adapterView mFeedbackViewPaddingLeft = %s, mFeedbackViewPaddingRight= %s", Integer.valueOf(this.g), Integer.valueOf(this.h));
            if (d()) {
                this.f21242b.setPadding(this.g, 0, this.h, 0);
                this.f21242b.requestLayout();
                this.f21242b.getViewTreeObserver().addOnGlobalLayoutListener(this.j);
            }
        } catch (Throwable th) {
            hw.c("DomesticDsaView", "adapterView error, %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void b(Context context) {
        if (dk.c()) {
            Bitmap bitmapB = bd.b(getResources().getDrawable(R.drawable.hiad_feedback_right_arrow));
            ImageView imageView = (ImageView) findViewById(R.id.why_this_ad_right_arrow);
            if (imageView != null) {
                imageView.setImageBitmap(bitmapB);
            }
            ImageView imageView2 = (ImageView) findViewById(R.id.splash_feedback_right_arrow);
            if (imageView2 != null) {
                imageView2.setImageBitmap(bitmapB);
            }
        }
    }

    public void b() {
        RelativeLayout relativeLayout = this.o;
        if (relativeLayout == null || !relativeLayout.getGlobalVisibleRect(new Rect())) {
            return;
        }
        this.o.setPressed(false);
        this.o.performClick();
    }

    public void a(boolean z, Integer num, jj jjVar) {
        this.k = Boolean.valueOf(z);
        this.r = num;
        this.s = jjVar;
    }

    @Override // com.huawei.openalliance.ad.views.i
    public void a(Context context) {
        try {
            View viewInflate = LayoutInflater.from(context).inflate(getLayoutId(), this);
            if (viewInflate == null) {
                return;
            }
            this.f21242b = viewInflate.findViewById(R.id.dom_dsa_view_root);
            this.f21243c = viewInflate.findViewById(R.id.dsa_scrollview);
            this.n = viewInflate.findViewById(R.id.splash_feedback_line);
            this.l = (RelativeLayout) viewInflate.findViewById(R.id.splash_feedback_btn);
            this.m = (TextView) viewInflate.findViewById(R.id.splash_feedback_tv);
            this.o = (RelativeLayout) viewInflate.findViewById(R.id.why_this_ad_btn);
            this.p = (TextView) viewInflate.findViewById(R.id.why_this_ad_tv);
        } catch (Throwable th) {
            hw.c("DomesticDsaView", "initView error, %s", th.getClass().getSimpleName());
        }
    }

    public void a() {
        RelativeLayout relativeLayout = this.o;
        if (relativeLayout == null || !relativeLayout.getGlobalVisibleRect(new Rect())) {
            return;
        }
        this.o.setPressed(true);
    }

    private void h() {
        if (this.f21243c != null) {
            this.f21243c.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            float measuredWidth = this.f21243c.getMeasuredWidth();
            this.d = measuredWidth / d.b(getContext());
            this.f = (int) measuredWidth;
            hw.a("DomesticDsaView", "fitTvViewWidth: viewWidthPercent: %s, mViewWidth: %s", Float.valueOf(this.d), Integer.valueOf(this.f));
        }
    }

    private void g() {
        if (as.n(getContext())) {
            TextView textView = this.m;
            if (textView != null) {
                textView.setTextSize(1, 28.0f);
            }
            TextView textView2 = this.p;
            if (textView2 != null) {
                textView2.setTextSize(1, 28.0f);
            }
        }
    }

    private void f() {
        String str;
        if (this.n == null || this.l == null) {
            str = "partingLine or splashFeedbackClick view not init";
        } else {
            Boolean bool = this.k;
            if (bool != null && bool.booleanValue()) {
                this.n.setVisibility(0);
                this.l.setVisibility(0);
                this.l.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.dsa.DomesticDsaView.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        new com.huawei.openalliance.ad.analysis.i(DomesticDsaView.this.getContext().getApplicationContext()).a("145", "", "", "");
                        SafeIntent safeIntent = new SafeIntent(new Intent(DomesticDsaView.this.getContext(), (Class<?>) SplashFeedbackActivity.class));
                        safeIntent.setPackage(DomesticDsaView.this.getContext().getPackageName());
                        safeIntent.putExtra(MapKeyNames.SPLASH_CLICKABLE_TYPE, DomesticDsaView.this.r);
                        if (!(DomesticDsaView.this.getContext() instanceof Activity)) {
                            safeIntent.addFlags(268435456);
                        }
                        dk.a(DomesticDsaView.this.getContext(), safeIntent);
                        if (DomesticDsaView.this.s != null) {
                            DomesticDsaView.this.s.f();
                        }
                    }
                });
                if (as.a(this.q.bf(), this.q.be())) {
                    return;
                }
                this.o.setVisibility(8);
                this.n.setVisibility(8);
                return;
            }
            str = "not need show splash feedback";
        }
        hw.b("DomesticDsaView", str);
    }

    private void a(final hp hpVar) {
        this.o.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.dsa.DomesticDsaView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                boolean zA = as.a(DomesticDsaView.this.getContext(), DomesticDsaView.this.q);
                hw.a("DomesticDsaView", "jump to dsa page: %s", Boolean.valueOf(zA));
                if (zA) {
                    hp hpVar2 = hpVar;
                    if (hpVar2 != null) {
                        hpVar2.a();
                    }
                    if (DomesticDsaView.this.s != null) {
                        DomesticDsaView.this.s.e();
                    }
                }
            }
        });
    }

    public DomesticDsaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DomesticDsaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DomesticDsaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DomesticDsaView(Context context) {
        super(context);
    }
}
