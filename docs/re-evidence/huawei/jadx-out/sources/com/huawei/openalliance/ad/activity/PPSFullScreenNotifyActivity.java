package com.huawei.openalliance.ad.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.cv;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.utils.ab;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.views.interfaces.y;
import com.huawei.openalliance.ad.views.o;
import com.huawei.openalliance.ad.views.p;
import com.huawei.openalliance.ad.views.viewpager.WrapContentHeightGalleryView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class PPSFullScreenNotifyActivity extends b implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f18157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18158c;
    private View d;
    private View e;
    private p f;
    private o g;
    private ContentRecord h;
    private String i;
    private WrapContentHeightGalleryView j;
    private cv l;
    private b.a m;
    private Handler n;
    private int q;
    private List<View> k = new ArrayList();
    private boolean o = false;
    private com.huawei.openalliance.ad.views.viewpager.d r = new com.huawei.openalliance.ad.views.viewpager.d() { // from class: com.huawei.openalliance.ad.activity.PPSFullScreenNotifyActivity.2
        @Override // com.huawei.openalliance.ad.views.viewpager.d
        public void a(int i) {
        }

        @Override // com.huawei.openalliance.ad.views.viewpager.d
        public void a(int i, float f, int i2) {
        }

        @Override // com.huawei.openalliance.ad.views.viewpager.d
        public void b(int i) {
            if (i != 0 || PPSFullScreenNotifyActivity.this.j.getCurrentItem() == 1) {
                return;
            }
            hw.b("PPSFullScreenNotifyActivity", "onPageScrollStateChanged, state = " + i);
            com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
            aVar.b(dg.a((Object) 1));
            PPSFullScreenNotifyActivity.this.l.a(PPSFullScreenNotifyActivity.this.h, "3", aVar);
            PPSFullScreenNotifyActivity.this.c();
        }
    };

    private boolean b(int i) {
        return i == 1 || i == 2;
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onNewIntent(Intent intent) {
        hw.b("PPSFullScreenNotifyActivity", "onNewIntent");
        super.onNewIntent(intent);
        this.o = true;
        a(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        if (hw.a()) {
            hw.a("PPSFullScreenNotifyActivity", "onDestroy");
        }
        super.onDestroy();
        b((Context) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.b, com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hw.b("PPSFullScreenNotifyActivity", "onCreate");
        a(getIntent());
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onBackPressed() {
        boolean zV = fp.b(this).V();
        hw.b("PPSFullScreenNotifyActivity", "onBackPressed dialogDismiss: %S", Boolean.valueOf(zV));
        if (zV) {
            super.onBackPressed();
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.y
    public void c() {
        p pVar = this.f;
        if (pVar != null) {
            pVar.setVisibility(8);
        }
        o oVar = this.g;
        if (oVar != null) {
            oVar.setVisibility(8);
        }
        finish();
    }

    @Override // com.huawei.openalliance.ad.activity.b
    protected void b() {
        Handler handler = this.n;
        if (handler != null) {
            handler.postDelayed(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSFullScreenNotifyActivity.3
                @Override // java.lang.Runnable
                public void run() {
                    PPSFullScreenNotifyActivity.this.finish();
                }
            }, 300L);
        }
    }

    public void a(int i) {
        int iE = com.huawei.openalliance.ad.utils.d.e(this);
        int iD = com.huawei.openalliance.ad.utils.d.d(this);
        if (i == 0 || i == 8) {
            this.f18156a = (ab.n(this) || (ab.q(this) && ab.r(this))) ? (iE * 2) / 3 : iE / 2;
            this.f18157b = iE;
            return;
        }
        if (ab.n(this) || (ab.q(this) && ab.r(this))) {
            this.f18156a = (iD * 2) / 3;
        } else {
            this.f18156a = iD;
        }
        this.f18157b = iD;
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        setContentView(R.layout.hiad_activity_full_screen_notify);
        this.p = (ViewGroup) findViewById(R.id.hiad_installed_notify_layout);
        this.p.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSFullScreenNotifyActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (1 == PPSFullScreenNotifyActivity.this.q) {
                    com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
                    aVar.b(dg.a((Object) 1));
                    PPSFullScreenNotifyActivity.this.l.a(PPSFullScreenNotifyActivity.this.h, "2", aVar);
                    PPSFullScreenNotifyActivity.this.c();
                }
            }
        });
    }

    private void f() {
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        WrapContentHeightGalleryView wrapContentHeightGalleryView = this.j;
        if (wrapContentHeightGalleryView != null) {
            wrapContentHeightGalleryView.setAdapter(new com.huawei.openalliance.ad.download.app.o(arrayList));
        }
    }

    private void e() {
        hw.b("PPSFullScreenNotifyActivity", "initOptimizeView");
        f();
        o oVar = new o(this);
        this.g = oVar;
        oVar.setOnCloseListener(this);
        this.g.a(this.h, this.i);
        this.g.setDownloadSource(this.f18158c);
        this.k.add(this.g);
        WrapContentHeightGalleryView wrapContentHeightGalleryView = (WrapContentHeightGalleryView) findViewById(R.id.hiad_view_pager);
        this.j = wrapContentHeightGalleryView;
        wrapContentHeightGalleryView.setAdapter(new com.huawei.openalliance.ad.download.app.o(this.k));
        this.j.setCurrentItem(1);
        this.g.a();
    }

    private void d() {
        hw.b("PPSFullScreenNotifyActivity", "initView");
        f();
        View view = new View(this);
        this.d = view;
        view.setBackgroundColor(0);
        p pVar = new p(this);
        this.f = pVar;
        pVar.setOnCloseListener(this);
        this.f.a(this.h, this.i);
        this.f.a(this.f18156a, this.f18157b);
        this.f.setDownloadSource(this.f18158c);
        View view2 = new View(this);
        this.e = view2;
        view2.setBackgroundColor(0);
        this.k.add(this.d);
        this.k.add(this.f);
        this.k.add(this.e);
        WrapContentHeightGalleryView wrapContentHeightGalleryView = (WrapContentHeightGalleryView) findViewById(R.id.hiad_view_pager);
        this.j = wrapContentHeightGalleryView;
        wrapContentHeightGalleryView.setAdapter(new com.huawei.openalliance.ad.download.app.o(this.k));
        this.j.setCurrentItem(1);
        this.j.a(this.r);
        this.f.a();
    }

    private void b(Context context) {
        b.a aVar = this.m;
        if (aVar != null) {
            context.unregisterReceiver(aVar);
            this.m = null;
        }
    }

    private void a(Intent intent) {
        String str;
        if (intent == null) {
            str = "intent is null";
        } else {
            SafeIntent safeIntent = new SafeIntent(intent);
            String stringExtra = safeIntent.getStringExtra(Constants.CONTENT_KEY);
            this.f18158c = safeIntent.getIntExtra("download_source", 1);
            ContentRecord contentRecord = (ContentRecord) bk.b(stringExtra, ContentRecord.class, new Class[0]);
            this.h = contentRecord;
            if (contentRecord != null && contentRecord.ag() != null) {
                AppInfo appInfoAg = this.h.ag();
                if (safeIntent.hasExtra("unique_id")) {
                    String stringExtra2 = safeIntent.getStringExtra("unique_id");
                    this.i = stringExtra2;
                    this.h.v(stringExtra2);
                }
                int iK = dk.k(this);
                dk.a(this, iK);
                a(iK);
                int appActivateStyle = HiAd.getInstance(this).getAppActivateStyle();
                int iP = appInfoAg.p();
                if (b(appActivateStyle)) {
                    this.q = appActivateStyle;
                } else if (b(iP)) {
                    this.q = iP;
                } else {
                    this.q = 1;
                }
                int i = this.q;
                if (i == 1) {
                    d();
                } else if (i == 2) {
                    e();
                }
                a((Context) this);
                this.l = new com.huawei.openalliance.ad.analysis.c(this);
                com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
                aVar.b(dg.a(Integer.valueOf(this.q)));
                this.l.a(this.h, "5", aVar);
                if (this.o) {
                    this.l.a(this.h, "4", aVar);
                    this.o = false;
                    return;
                }
                return;
            }
            str = "contentRecord or appInfo is null";
        }
        hw.b("PPSFullScreenNotifyActivity", str);
        finish();
    }

    private void a(Context context) {
        b(context);
        this.n = new Handler(Looper.myLooper());
        this.m = new b.a();
        as.a(context, this.m, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"), "android.permission.WRITE_SECURE_SETTINGS", (Handler) null);
    }
}
