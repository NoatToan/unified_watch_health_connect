package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.no;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class o extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f21301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f21302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AppInfo f21303c;
    private TextView d;
    private TextView e;
    private ImageView f;
    private ImageView g;
    private Button h;
    private RelativeLayout i;
    private RelativeLayout j;
    private com.huawei.openalliance.ad.views.interfaces.y k;
    private Handler l;
    private Animator m;
    private ContentRecord n;
    private no o;
    private View.OnClickListener p;

    public void setOnCloseListener(com.huawei.openalliance.ad.views.interfaces.y yVar) {
        this.k = yVar;
    }

    public void setDownloadSource(int i) {
        this.o.a(i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void a(ContentRecord contentRecord, String str) {
        this.n = contentRecord;
        this.o = new no(this.f21301a, contentRecord, 2);
        ContentRecord contentRecord2 = this.n;
        if (contentRecord2 == null || contentRecord2.ag() == null) {
            hw.b("PPSFullScreenNotifyOptimizeView", "contentRecord or appInfo is null");
            return;
        }
        this.f21303c = this.n.ag();
        if (!TextUtils.isEmpty(str)) {
            this.f21303c.v(str);
        }
        MetaData metaDataJ = this.n.j();
        if (metaDataJ != null) {
            this.f21303c.m(metaDataJ.o());
        }
        String appName = this.f21303c.getAppName();
        if (TextUtils.isEmpty(appName)) {
            this.d.setVisibility(8);
        } else {
            this.d.setText(appName);
        }
        String strQ = this.f21303c.q();
        if (!TextUtils.isEmpty(strQ)) {
            this.e.setText(strQ);
        }
        String strR = this.f21303c.r();
        if (!TextUtils.isEmpty(strR)) {
            this.h.setText(strR);
        }
        this.f21302b = this.f21303c.s();
        a(this.f, this.f21303c.getIconUrl());
    }

    public void a() {
        this.l.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.o.2
            @Override // java.lang.Runnable
            public void run() {
                if (o.this.m != null) {
                    o.this.m.start();
                    o.this.setVisibility(0);
                }
            }
        });
    }

    private void b() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f, 1.0f));
        this.m = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        this.m.setInterpolator(new LinearInterpolator());
    }

    static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private WeakReference<ImageView> f21307b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private dn f21308c;
        private Context d;

        @Override // java.lang.Runnable
        public void run() {
            if (this.d == null) {
                return;
            }
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f21306a);
            so soVarA = new sl(this.d, snVar).a();
            if (soVarA == null) {
                return;
            }
            String strA = soVarA.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            String strC = this.f21308c.c(strA);
            if (TextUtils.isEmpty(strC)) {
                return;
            }
            bd.a(this.d, strC, new bd.a() { // from class: com.huawei.openalliance.ad.views.o.a.1
                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a() {
                }

                @Override // com.huawei.openalliance.ad.utils.bd.a
                public void a(final Drawable drawable) {
                    if (drawable == null) {
                        return;
                    }
                    dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.o.a.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ImageView imageView = (ImageView) a.this.f21307b.get();
                            if (imageView == null) {
                                return;
                            }
                            imageView.setBackground(null);
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
            });
        }

        public a(String str, ImageView imageView, Context context) {
            this.f21306a = str;
            this.f21307b = new WeakReference<>(imageView);
            context = context != null ? context.getApplicationContext() : context;
            this.d = context;
            this.f21308c = dk.a(context, "normal");
        }
    }

    private void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str) || imageView == null || this.f21301a == null) {
            return;
        }
        hw.b("PPSFullScreenNotifyOptimizeView", "load app icon:" + dg.h(str));
        com.huawei.openalliance.ad.utils.o.d(new a(str, imageView, this.f21301a));
    }

    private void a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.hiad_full_screen_notity_optimize_layout, this);
        setVisibility(4);
        this.f21301a = context;
        this.f = (ImageView) findViewById(R.id.app_icon_optimize);
        this.d = (TextView) findViewById(R.id.app_name_tv_optimize);
        this.e = (TextView) findViewById(R.id.notify_tv_optimize);
        this.g = (ImageView) findViewById(R.id.app_close_optimize);
        this.i = (RelativeLayout) findViewById(R.id.app_view_optimize);
        this.j = (RelativeLayout) findViewById(R.id.app_valid_click_optimize);
        this.h = (Button) findViewById(R.id.app_open_btn_optimize);
        this.i.setOnClickListener(this.p);
        this.j.setOnClickListener(this.p);
        this.h.setOnClickListener(this.p);
        this.g.setOnClickListener(this.p);
        b();
        if (as.n(context)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f.getLayoutParams();
            layoutParams.removeRule(15);
            this.f.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams2.removeRule(15);
            this.g.setLayoutParams(layoutParams2);
        }
    }

    public o(Context context) {
        super(context);
        this.l = new Handler();
        this.p = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.o.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hw.b("PPSFullScreenNotifyOptimizeView", "onClick, insActvNotifyCfg: %s", Integer.valueOf(o.this.f21302b));
                if (view.getId() == R.id.app_close_optimize) {
                    o.this.o.a("0");
                } else if (view.getId() != R.id.app_valid_click_optimize && view.getId() != R.id.app_open_btn_optimize && (view.getId() != R.id.app_view_optimize || o.this.f21302b != 2)) {
                    return;
                } else {
                    o.this.o.b(o.this.f21302b);
                }
                o.this.k.c();
            }
        };
        a(context, (AttributeSet) null);
    }
}
