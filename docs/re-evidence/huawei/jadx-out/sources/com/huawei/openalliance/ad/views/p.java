package com.huawei.openalliance.ad.views;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
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
import com.huawei.openalliance.ad.utils.dr;

/* JADX INFO: loaded from: classes12.dex */
public class p extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f21312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppInfo f21313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f21314c;
    private View d;
    private View e;
    private TextView f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private int j;
    private int k;
    private int l;
    private dn m;
    private com.huawei.openalliance.ad.views.interfaces.y n;
    private Handler o;
    private Animator p;
    private ContentRecord q;
    private no r;
    private View.OnTouchListener s;

    public void setOnCloseListener(com.huawei.openalliance.ad.views.interfaces.y yVar) {
        this.n = yVar;
    }

    public void setDownloadSource(int i) {
        this.r.a(i);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.l = this.f21314c.getMeasuredWidth();
        c();
    }

    public void a(ContentRecord contentRecord, String str) {
        this.q = contentRecord;
        this.r = new no(this.f21312a, contentRecord, 1);
        ContentRecord contentRecord2 = this.q;
        if (contentRecord2 == null || contentRecord2.ag() == null) {
            hw.b("PPSFullScreenNotifyView", "contentRecord or appInfo is null");
            return;
        }
        this.f21313b = this.q.ag();
        if (!TextUtils.isEmpty(str)) {
            this.f21313b.v(str);
        }
        MetaData metaDataJ = this.q.j();
        if (metaDataJ != null) {
            this.f21313b.m(metaDataJ.o());
        }
        String appName = this.f21313b.getAppName();
        if (!TextUtils.isEmpty(appName)) {
            this.f.setText(appName);
        }
        String strQ = this.f21313b.q();
        if (!TextUtils.isEmpty(strQ)) {
            this.g.setText(strQ);
        }
        a(this.h, this.f21313b.getIconUrl());
    }

    public void a(int i, int i2) {
        this.j = i;
        this.k = i2;
    }

    public void a() {
        this.o.post(new Runnable() { // from class: com.huawei.openalliance.ad.views.p.5
            @Override // java.lang.Runnable
            public void run() {
                if (p.this.p != null) {
                    p.this.p.start();
                    p.this.setVisibility(0);
                }
            }
        });
    }

    private void c() {
        if (this.j != this.k) {
            View viewFindViewById = findViewById(R.id.app_view);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            layoutParams.width = (int) (this.j - dr.a(this.f21312a, 24));
            viewFindViewById.setLayoutParams(layoutParams);
            int i = (this.l - this.j) / 2;
            View viewFindViewById2 = findViewById(R.id.layout_start);
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            layoutParams2.width = i;
            viewFindViewById2.setLayoutParams(layoutParams2);
            View viewFindViewById3 = findViewById(R.id.layout_end);
            ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
            layoutParams3.width = i;
            viewFindViewById3.setLayoutParams(layoutParams3);
        }
    }

    private void b() {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat("scaleX", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.8f, 1.05f, 1.0f), PropertyValuesHolder.ofFloat("alpha", 0.0f, 1.0f, 1.0f));
        this.p = objectAnimatorOfPropertyValuesHolder;
        objectAnimatorOfPropertyValuesHolder.setDuration(200L);
        this.p.setInterpolator(new LinearInterpolator());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view, MotionEvent motionEvent) {
        String str;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                str = action == 3 ? "ACTION_CANCEL" : "ACTION_DOWN";
            } else {
                hw.b("PPSFullScreenNotifyView", "ACTION_UP");
                this.r.b(-1);
                this.n.c();
            }
            return true;
        }
        hw.b("PPSFullScreenNotifyView", str);
        return true;
    }

    private void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        hw.b("PPSFullScreenNotifyView", "load app icon:" + dg.h(str));
        com.huawei.openalliance.ad.utils.o.d(new AnonymousClass6(str, imageView));
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.views.p$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f21320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f21321b;

        @Override // java.lang.Runnable
        public void run() {
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f21320a);
            so soVarA = new sl(p.this.f21312a, snVar).a();
            if (soVarA != null) {
                String strA = soVarA.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                String strC = p.this.m.c(strA);
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                bd.a(p.this.f21312a, strC, new bd.a() { // from class: com.huawei.openalliance.ad.views.p.6.1
                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a() {
                    }

                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a(final Drawable drawable) {
                        if (drawable != null) {
                            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.p.6.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass6.this.f21321b.setBackground(null);
                                    AnonymousClass6.this.f21321b.setImageDrawable(drawable);
                                }
                            });
                        }
                    }
                });
            }
        }

        AnonymousClass6(String str, ImageView imageView) {
            this.f21320a = str;
            this.f21321b = imageView;
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.hiad_full_screen_notity_layout, this);
        setVisibility(4);
        this.f21312a = context;
        this.m = dk.a(context, "normal");
        this.f21314c = findViewById(R.id.app_layout);
        this.d = findViewById(R.id.layout_start);
        this.e = findViewById(R.id.layout_end);
        this.h = (ImageView) findViewById(R.id.app_icon);
        this.f = (TextView) findViewById(R.id.app_name_tv);
        this.g = (TextView) findViewById(R.id.notify_tv);
        ImageView imageView = (ImageView) findViewById(R.id.app_close);
        this.i = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.p.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                p.this.r.a("0");
                p.this.n.c();
            }
        });
        this.d.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.p.3
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                p.this.r.a("2");
                p.this.n.c();
                return true;
            }
        });
        this.e.setOnTouchListener(new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.p.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 0) {
                    return true;
                }
                p.this.r.a("2");
                p.this.n.c();
                return true;
            }
        });
        setOnTouchListener(this.s);
        b();
        if (as.n(context)) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.h.getLayoutParams();
            layoutParams.removeRule(15);
            this.h.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.i.getLayoutParams();
            layoutParams2.removeRule(15);
            this.i.setLayoutParams(layoutParams2);
        }
    }

    public p(Context context) {
        super(context);
        this.o = new Handler();
        this.s = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.p.1
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return p.this.a(view, motionEvent);
            }
        };
        a(context, (AttributeSet) null);
    }
}
