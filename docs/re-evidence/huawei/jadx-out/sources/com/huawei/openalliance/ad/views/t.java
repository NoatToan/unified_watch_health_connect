package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.beans.metadata.ImageInfo;
import com.huawei.openalliance.ad.beans.metadata.MetaData;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.ClickDestination;
import com.huawei.openalliance.ad.cr;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.vu;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class t extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f21332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private gk f21333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdLandingPageData f21334c;
    private AppInfo d;
    private String e;
    private MetaData f;
    private View g;
    private AppDownloadButton h;
    private INonwifiActionListener i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private boolean m;
    private String n;
    private com.huawei.openalliance.ad.views.interfaces.d o;
    private cr p;
    private int q;
    private boolean r;
    private SixElementsView s;
    private ContentRecord t;
    private boolean u;
    private boolean v;
    private a w;
    private View.OnTouchListener x;

    public void setOnNonWifiDownloadListener(INonwifiActionListener iNonwifiActionListener) {
        this.i = iNonwifiActionListener;
    }

    public void setInterType(int i) {
        this.q = i;
    }

    public void setEndCardClickListener(com.huawei.openalliance.ad.views.interfaces.d dVar) {
        this.o = dVar;
    }

    public void setButtonAndSixElementsClickInfo(MaterialClickInfo materialClickInfo) {
        AppDownloadButton appDownloadButton = this.h;
        if (appDownloadButton != null) {
            appDownloadButton.a(materialClickInfo);
        }
        SixElementsView sixElementsView = this.s;
        if (sixElementsView != null) {
            sixElementsView.setOrgClickInfo(materialClickInfo);
        }
    }

    public void setAppRelated(boolean z) {
        this.m = z;
        d();
    }

    public void setAdLandingPageData(AdLandingPageData adLandingPageData) {
        String str;
        if (adLandingPageData == null) {
            return;
        }
        try {
            hw.b("PPSRewardEndCardView", "set ad landing data.");
            this.f21334c = adLandingPageData;
            this.d = adLandingPageData.getAppInfo();
            MetaData metaData = (MetaData) bk.b(this.f21334c.u(), MetaData.class, new Class[0]);
            this.f = metaData;
            if (metaData != null) {
                this.n = dg.e(metaData.a());
            }
            this.r = adLandingPageData.B();
            f();
        } catch (RuntimeException unused) {
            str = "setAdLandingPageData RuntimeException.";
            hw.c("PPSRewardEndCardView", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageDate error.";
            hw.c("PPSRewardEndCardView", str);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        SixElementsView sixElementsView;
        View view2;
        int i2;
        super.onVisibilityChanged(view, i);
        if (this.g == null || (sixElementsView = this.s) == null) {
            return;
        }
        sixElementsView.setVisibility(8);
        if (this.u && g()) {
            view2 = this.g;
            i2 = R.id.reward_end_card_six_elements_with_jump;
        } else {
            view2 = this.g;
            i2 = R.id.reward_end_card_six_elements;
        }
        SixElementsView sixElementsView2 = (SixElementsView) view2.findViewById(i2);
        this.s = sixElementsView2;
        sixElementsView2.setVisibility(0);
        f();
    }

    public void e() {
        AppDownloadButton appDownloadButton = this.h;
        if (appDownloadButton != null) {
            appDownloadButton.performClick();
        }
    }

    public void d() {
        AppDownloadButton appDownloadButton = this.h;
        if (appDownloadButton != null) {
            appDownloadButton.setClickable(false);
        }
    }

    public void c() {
        View view = this.g;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void b() {
        a(this.j, this.e);
        View view = this.g;
        if (view != null) {
            view.setVisibility(0);
        }
        SixElementsView sixElementsView = this.s;
        if (sixElementsView != null) {
            sixElementsView.a(this.v);
        }
    }

    public void a(String str) {
        AppDownloadButton appDownloadButton = this.h;
        if (appDownloadButton != null) {
            appDownloadButton.updateContent(str);
        }
    }

    public void a(long j) {
        AppDownloadButton appDownloadButton = this.h;
        if (appDownloadButton != null) {
            appDownloadButton.updateStartShowTime(j);
        }
    }

    public void a() {
        com.huawei.openalliance.ad.download.app.d.a().c(this.w);
    }

    private void h() {
        if (this.m) {
            this.h.setClickActionListener(new com.huawei.openalliance.ad.views.interfaces.x() { // from class: com.huawei.openalliance.ad.views.t.4
                @Override // com.huawei.openalliance.ad.views.interfaces.x
                public void b(AppDownloadButton appDownloadButton) {
                    if (t.this.o != null) {
                        t.this.o.a(t.this.m, true, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : "", true);
                    }
                }

                @Override // com.huawei.openalliance.ad.views.interfaces.x
                public void a(AppDownloadButton appDownloadButton) {
                    if (t.this.o != null) {
                        String str = t.this.q == 9 ? ClickDestination.HARMONY_SERVICE : ClickDestination.WEB;
                        if (AppStatus.INSTALLED == appDownloadButton.getStatus()) {
                            str = "app";
                        }
                        t.this.o.a(t.this.m, false, str, true);
                    }
                }
            });
        } else {
            this.h.a(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.t.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (t.this.o != null) {
                        t.this.o.a(false, false, t.this.q == 9 ? ClickDestination.HARMONY_SERVICE : ClickDestination.WEB, false);
                    }
                }
            });
        }
    }

    private String getImageUrl() {
        MetaData metaData = this.f;
        if (metaData == null) {
            return null;
        }
        List<ImageInfo> listG = metaData.g();
        if (bm.a(listG) || TextUtils.isEmpty(listG.get(0).c())) {
            listG = this.f.p();
            if (bm.a(listG)) {
                return null;
            }
        }
        return listG.get(0).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getChinaRomFlag() {
        return this.u;
    }

    private boolean g() {
        int iD = this.t.D();
        AppInfo appInfoAg = this.t.ag();
        if (iD == 0 || iD == 1) {
            return false;
        }
        if ((iD == 3 || iD == 5 || iD == 2) && appInfoAg != null && !com.huawei.openalliance.ad.utils.k.a(getContext(), appInfoAg.getPackageName())) {
            return false;
        }
        this.v = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x0078  */
    /* JADX WARN: Code duplicated, block: B:16:0x0094  */
    /* JADX WARN: Code duplicated, block: B:17:0x009e  */
    public void f() {
        AppDownloadButton appDownloadButton;
        AppDownloadButtonStyle extandAppDownloadButtonStyle;
        hw.b("PPSRewardEndCardView", "refresh UI, isAppRelated: %s", Boolean.valueOf(this.m));
        if (this.m) {
            a(this.k, this.d.getAppName());
            a(this.l, this.d.getAppDesc());
            String iconUrl = this.d.getIconUrl();
            this.e = iconUrl;
            if (TextUtils.isEmpty(iconUrl)) {
            }
            this.s.setTitleTextVisibility(8);
            this.s.a(this.f21334c);
            if (com.huawei.openalliance.ad.utils.c.b(this.f21332a, this.t)) {
                this.s.setVisibility(4);
            }
            this.g.setOnTouchListener(this.x);
            this.h.setAdLandingPageData(this.f21334c);
            if (this.p.g()) {
                appDownloadButton = this.h;
                extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyleHm(this.f21332a);
            } else {
                appDownloadButton = this.h;
                extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyle(this.f21332a);
            }
            appDownloadButton.setAppDownloadButtonStyle(extandAppDownloadButtonStyle);
            this.h.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.views.t.1
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
                public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                    return !t.this.m ? com.huawei.openalliance.ad.utils.l.a(t.this.n, t.this.f21332a.getString(R.string.hiad_download_open)) : charSequence;
                }
            });
            this.h.setOnNonWifiDownloadListener(new AppDownloadButton.OnNonWifiDownloadListener() { // from class: com.huawei.openalliance.ad.views.t.2
                @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnNonWifiDownloadListener
                public boolean onNonWifiDownload(AppInfo appInfo, long j) {
                    if ((t.this.i == null || !t.this.i.onAppDownload(appInfo, j)) && t.this.f21333b.bH() && t.this.r) {
                        t.this.h.b();
                        return false;
                    }
                    t.this.h.setAllowedNonWifiNetwork(true);
                    return true;
                }
            });
            this.h.setSource(5);
            h();
        }
        MetaData metaData = this.f;
        if (metaData != null) {
            a(this.k, dg.e(metaData.e()));
            a(this.l, dg.e(this.f.f()));
        }
        this.e = getImageUrl();
        this.s.setTitleTextVisibility(8);
        this.s.a(this.f21334c);
        if (com.huawei.openalliance.ad.utils.c.b(this.f21332a, this.t)) {
            this.s.setVisibility(4);
        }
        this.g.setOnTouchListener(this.x);
        this.h.setAdLandingPageData(this.f21334c);
        if (this.p.g()) {
            appDownloadButton = this.h;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyleHm(this.f21332a);
        } else {
            appDownloadButton = this.h;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyle(this.f21332a);
        }
        appDownloadButton.setAppDownloadButtonStyle(extandAppDownloadButtonStyle);
        this.h.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.views.t.1
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
            public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                return !t.this.m ? com.huawei.openalliance.ad.utils.l.a(t.this.n, t.this.f21332a.getString(R.string.hiad_download_open)) : charSequence;
            }
        });
        this.h.setOnNonWifiDownloadListener(new AppDownloadButton.OnNonWifiDownloadListener() { // from class: com.huawei.openalliance.ad.views.t.2
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnNonWifiDownloadListener
            public boolean onNonWifiDownload(AppInfo appInfo, long j) {
                if ((t.this.i == null || !t.this.i.onAppDownload(appInfo, j)) && t.this.f21333b.bH() && t.this.r) {
                    t.this.h.b();
                    return false;
                }
                t.this.h.setAllowedNonWifiNetwork(true);
                return true;
            }
        });
        this.h.setSource(5);
        h();
    }

    static class a implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f21340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<t> f21341b;

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(AppInfo appInfo) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onAppOpen(String str) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onDownloadProgress(AppInfo appInfo, int i) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onUserCancel(AppInfo appInfo) {
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.AppDownloadListener
        public void onStatusChanged(AppStatus appStatus, AppInfo appInfo) {
            final t tVar = this.f21341b.get();
            if (appInfo == null || TextUtils.isEmpty(appInfo.getPackageName()) || !appInfo.getPackageName().equals(this.f21340a) || tVar == null || !tVar.getChinaRomFlag() || appStatus != AppStatus.INSTALLED || tVar.s == null || tVar.g == null) {
                return;
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.t.a.1
                @Override // java.lang.Runnable
                public void run() {
                    tVar.s.setVisibility(8);
                    t tVar2 = tVar;
                    tVar2.s = (SixElementsView) tVar2.g.findViewById(R.id.reward_end_card_six_elements_with_jump);
                    tVar.s.setVisibility(0);
                    tVar.f();
                }
            });
        }

        public a(t tVar, ContentRecord contentRecord) {
            this.f21341b = new WeakReference<>(tVar);
            if (contentRecord.ag() != null) {
                this.f21340a = contentRecord.ag().getPackageName();
            }
        }
    }

    private void a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
    }

    private void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        hw.b("PPSRewardEndCardView", "load app icon: %s", dg.h(str));
        com.huawei.openalliance.ad.utils.o.d(new vu(this.f21332a, str, imageView, Boolean.valueOf(this.m)));
    }

    private void a(Context context, int i, ContentRecord contentRecord) {
        View view;
        int i2;
        this.f21332a = context;
        this.t = contentRecord;
        this.f21333b = fp.b(context);
        this.u = cc.a(context).d();
        this.g = inflate(context, R.layout.hiad_reward_six_elements_endcard, this);
        if (this.u && g()) {
            view = this.g;
            i2 = R.id.reward_end_card_six_elements_with_jump;
        } else {
            view = this.g;
            i2 = R.id.reward_end_card_six_elements;
        }
        this.s = (SixElementsView) view.findViewById(i2);
        this.j = (ImageView) this.g.findViewById(R.id.endcard_icon);
        this.k = (TextView) this.g.findViewById(R.id.endcard_title);
        this.l = (TextView) this.g.findViewById(R.id.endcard_desc);
        this.h = (AppDownloadButton) this.g.findViewById(R.id.endcard_download_btn);
        if (as.n(context)) {
            this.k.setTextSize(1, 36.0f);
            this.l.setTextSize(1, 28.0f);
        }
        this.p = cc.a(this.f21332a.getApplicationContext());
        this.w = new a(this, this.t);
        com.huawei.openalliance.ad.download.app.d.a().b(this.w);
    }

    public t(Context context, int i, ContentRecord contentRecord) {
        super(context);
        this.m = true;
        this.r = true;
        this.u = true;
        this.v = false;
        this.x = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.t.5
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.a("PPSRewardEndCardView", "action:%s", Integer.valueOf(motionEvent.getAction()));
                if (t.this.h != null && motionEvent.getAction() == 1) {
                    if (!t.this.m) {
                        if (t.this.o != null) {
                            t.this.o.a(false, false, ClickDestination.WEB, false);
                        }
                    } else {
                        t.this.o.a(t.this.m, true, AppStatus.INSTALLED == t.this.h.getStatus() ? "app" : "", false);
                    }
                }
                return true;
            }
        };
        a(context, i, contentRecord);
    }
}
