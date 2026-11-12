package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.analysis.i;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.gk;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.o;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.AppDownloadButtonStyle;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyle;
import com.huawei.openalliance.ad.views.ExtandAppDownloadButtonStyleHm;
import com.huawei.openalliance.ad.views.interfaces.x;

/* JADX INFO: loaded from: classes12.dex */
public class LinkedAppDetailView extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AppDownloadButton f19452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f19453c;
    private ImageView d;
    private AppInfo e;
    private gk f;
    private ContentRecord g;
    private AdLandingPageData h;
    private View i;
    private i j;
    private int k;
    private boolean l;
    private com.huawei.openalliance.ad.views.interfaces.c m;
    private INonwifiActionListener n;
    private boolean o;
    private View.OnClickListener p;
    private dn q;
    private MaterialClickInfo r;

    /* JADX INFO: Access modifiers changed from: private */
    public void setCancelDownloadButtonVisibility(AppStatus appStatus) {
    }

    public void setVideoCoverClickListener(View.OnClickListener onClickListener) {
        this.p = onClickListener;
    }

    public void setOnNonWifiDownloadListener(INonwifiActionListener iNonwifiActionListener) {
        this.n = iNonwifiActionListener;
    }

    public void setNeedPerBeforDownload(boolean z) {
        this.o = z;
    }

    public void setContentRecord(ContentRecord contentRecord) {
        String str;
        if (contentRecord == null) {
            return;
        }
        try {
            hw.b("LinkedPPSAppDetailView", "set ad landing data");
            this.g = contentRecord;
            AppInfo appInfoAg = contentRecord.ag();
            this.e = appInfoAg;
            if (appInfoAg != null) {
                c();
            } else {
                hw.a("LinkedPPSAppDetailView", "appInfo is null, hide appDetailView");
                this.i.setVisibility(8);
            }
        } catch (RuntimeException unused) {
            str = "setAdLandingPageData RuntimeException";
            hw.c("LinkedPPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "setAdLandingPageData error";
            hw.c("LinkedPPSAppDetailView", str);
        }
    }

    public void setAppRelated(boolean z) {
        this.l = z;
        a();
    }

    public void setAppDetailClickListener(com.huawei.openalliance.ad.views.interfaces.c cVar) {
        this.m = cVar;
    }

    public void setAdLandingPageData(AdLandingPageData adLandingPageData) {
        this.h = adLandingPageData;
    }

    public AppDownloadButton getAppDownloadButton() {
        return this.f19452b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                hw.a("LinkedPPSAppDetailView", "dispatchTouchEvent ACTION_DOWN");
                this.r = tz.a(this, motionEvent);
            }
            if (1 == iA) {
                hw.a("LinkedPPSAppDetailView", "dispatchTouchEvent ACTION_UP");
                tz.a(this, motionEvent, null, this.r);
                this.f19452b.a(this.r);
            }
        } catch (Throwable th) {
            hw.c("LinkedPPSAppDetailView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void a(String str) {
        ContentRecord contentRecord = this.g;
        if (contentRecord != null) {
            contentRecord.c(str);
        }
        AppDownloadButton appDownloadButton = this.f19452b;
        if (appDownloadButton != null) {
            appDownloadButton.updateContent(str);
        }
    }

    public void a() {
        AppDownloadButton appDownloadButton = this.f19452b;
        if (appDownloadButton != null) {
            appDownloadButton.setClickable(false);
        }
    }

    private void c() {
        AppDownloadButton appDownloadButton;
        AppDownloadButtonStyle extandAppDownloadButtonStyle;
        a(this.f19453c, this.e.getAppName());
        a(this.d, this.e.getIconUrl());
        this.f19452b.setAdLandingPageData(this.h);
        b();
        this.f19452b.setNeedShowPermision(this.o);
        if (cc.a(this.f19451a).g()) {
            appDownloadButton = this.f19452b;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyleHm(this.f19451a);
        } else {
            appDownloadButton = this.f19452b;
            extandAppDownloadButtonStyle = new ExtandAppDownloadButtonStyle(this.f19451a);
        }
        appDownloadButton.setAppDownloadButtonStyle(extandAppDownloadButtonStyle);
        this.f19452b.setOnDownloadStatusChangedListener(new AppDownloadButton.OnDownloadStatusChangedListener() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.2
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onUserCancel(AppInfo appInfo) {
            }

            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnDownloadStatusChangedListener
            public void onStatusChanged(AppStatus appStatus) {
                LinkedAppDetailView.this.setCancelDownloadButtonVisibility(appStatus);
            }
        });
        this.f19452b.setButtonTextWatcherInner(new AppDownloadButton.e() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.3
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.e
            public CharSequence a(CharSequence charSequence, AppStatus appStatus) {
                return !LinkedAppDetailView.this.l ? LinkedAppDetailView.this.f19451a.getString(R.string.hiad_download_open) : charSequence;
            }
        });
        this.f19452b.setOnNonWifiDownloadListener(new AppDownloadButton.OnNonWifiDownloadListener() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.4
            @Override // com.huawei.openalliance.ad.views.AppDownloadButton.OnNonWifiDownloadListener
            public boolean onNonWifiDownload(AppInfo appInfo, long j) {
                if (LinkedAppDetailView.this.n == null || !LinkedAppDetailView.this.n.onAppDownload(appInfo, j)) {
                    LinkedAppDetailView.this.f19452b.b();
                    return false;
                }
                LinkedAppDetailView.this.f19452b.setAllowedNonWifiNetwork(true);
                return true;
            }
        });
        this.f19452b.setSource(11);
        setCancelDownloadButtonVisibility(this.f19452b.refreshStatus());
    }

    private void b() {
        this.f19452b.setSource(11);
        this.f19452b.setLinkedCoverClickListener(this.p);
        if (this.l) {
            this.f19452b.setClickActionListener(new x() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.1
                @Override // com.huawei.openalliance.ad.views.interfaces.x
                public void b(AppDownloadButton appDownloadButton) {
                    if (LinkedAppDetailView.this.m != null) {
                        String str = AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : "";
                        LinkedAppDetailView.this.j.a(0, 0, LinkedAppDetailView.this.g);
                        LinkedAppDetailView.this.m.a(new com.huawei.openalliance.ad.views.interfaces.b(LinkedAppDetailView.this.l, true, str));
                    }
                }

                @Override // com.huawei.openalliance.ad.views.interfaces.x
                public void a(AppDownloadButton appDownloadButton) {
                    if (LinkedAppDetailView.this.m != null) {
                        LinkedAppDetailView.this.m.a(new com.huawei.openalliance.ad.views.interfaces.b(LinkedAppDetailView.this.l, false, AppStatus.INSTALLED == appDownloadButton.getStatus() ? "app" : ""));
                    }
                }
            });
        }
    }

    private void a(TextView textView, String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            i = 8;
        } else {
            textView.setText(str);
            i = 0;
        }
        textView.setVisibility(i);
    }

    private void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        hw.b("LinkedPPSAppDetailView", "load app icon:" + dg.h(str));
        o.d(new AnonymousClass5(str, imageView));
    }

    private void a(Context context) {
        String str;
        try {
            this.f19451a = context;
            this.f = fp.b(context);
            this.j = new i(context);
            this.k = ViewConfiguration.get(context).getScaledTouchSlop();
            this.i = inflate(context, R.layout.hiad_linked_app_detail, this);
            this.f19453c = (TextView) findViewById(R.id.linked_app_name);
            this.d = (ImageView) findViewById(R.id.linked_app_icon);
            this.f19452b = (AppDownloadButton) findViewById(R.id.linked_app_download_btn);
            this.q = dk.a(context, "normal");
            if (as.n(context)) {
                this.f19453c.setTextSize(1, 24.0f);
            }
        } catch (RuntimeException unused) {
            str = "init RuntimeException";
            hw.c("LinkedPPSAppDetailView", str);
        } catch (Exception unused2) {
            str = "init error";
            hw.c("LinkedPPSAppDetailView", str);
        }
    }

    /* JADX INFO: renamed from: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f19458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f19459b;

        @Override // java.lang.Runnable
        public void run() {
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f19458a);
            if (!LinkedAppDetailView.this.l) {
                snVar.c(fp.b(LinkedAppDetailView.this.f19451a).e());
            }
            so soVarA = new sl(LinkedAppDetailView.this.f19451a, snVar).a();
            if (soVarA != null) {
                String strA = soVarA.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                String strC = LinkedAppDetailView.this.q.c(strA);
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                bd.a(LinkedAppDetailView.this.f19451a, strC, new bd.a() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.5.1
                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a() {
                    }

                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a(final Drawable drawable) {
                        if (drawable != null) {
                            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.linked.view.LinkedAppDetailView.5.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    AnonymousClass5.this.f19459b.setBackground(null);
                                    AnonymousClass5.this.f19459b.setImageDrawable(drawable);
                                }
                            });
                        }
                    }
                });
            }
        }

        AnonymousClass5(String str, ImageView imageView) {
            this.f19458a = str;
            this.f19459b = imageView;
        }
    }

    public LinkedAppDetailView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = true;
        this.o = false;
        a(context);
    }

    public LinkedAppDetailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = true;
        this.o = false;
        a(context);
    }

    public LinkedAppDetailView(Context context) {
        super(context);
        this.l = true;
        this.o = false;
        a(context);
    }
}
