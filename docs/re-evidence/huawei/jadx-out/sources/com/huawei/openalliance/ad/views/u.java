package com.huawei.openalliance.ad.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dk;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AdLandingPageData;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.listeners.AppDownloadListener;
import com.huawei.openalliance.ad.sl;
import com.huawei.openalliance.ad.sn;
import com.huawei.openalliance.ad.so;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bd;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dq;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class u extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f21344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f21345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AdLandingPageData f21346c;
    private AppInfo d;
    private String e;
    private View f;
    private TextView g;
    private ImageView h;
    private SixElementsView i;
    private TextView j;
    private com.huawei.openalliance.ad.views.interfaces.aa k;
    private AlertDialog l;
    private MaterialClickInfo m;
    private a n;

    public interface a {
        void a();
    }

    public void setPopUpClickListener(com.huawei.openalliance.ad.views.interfaces.aa aaVar) {
        this.k = aaVar;
    }

    public void setDismissListener(a aVar) {
        this.n = aVar;
    }

    public void setAdPopupData(AdLandingPageData adLandingPageData) {
        String str;
        if (adLandingPageData == null) {
            return;
        }
        try {
            hw.b("PPSRewardPopUpView", "set popup data");
            this.f21346c = adLandingPageData;
            AppInfo appInfo = adLandingPageData.getAppInfo();
            this.d = appInfo;
            if (appInfo != null && "11".equals(appInfo.getPriorInstallWay()) && this.g != null && this.j != null) {
                this.g.setText(this.d.C() == 1 ? R.string.hiad_preinstall_restore_and_open : R.string.hiad_download_install);
                this.j.setText(R.string.hiad_preinstall_cancel_restore);
            }
            e();
        } catch (RuntimeException unused) {
            str = "setAdPopupData RuntimeException.";
            hw.c("PPSRewardPopUpView", str);
        } catch (Exception unused2) {
            str = "setAdPopupData error.";
            hw.c("PPSRewardPopUpView", str);
        }
    }

    public AlertDialog getDialog() {
        return this.l;
    }

    public MaterialClickInfo getClickInfo() {
        return this.m;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                this.m = tz.a(this, motionEvent);
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, this.m);
                SixElementsView sixElementsView = this.i;
                if (sixElementsView != null) {
                    sixElementsView.setOrgClickInfo(this.m);
                }
            }
        } catch (Throwable th) {
            hw.c("PPSRewardPopUpView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void c() {
        com.huawei.openalliance.ad.download.app.d.a().c(this.f21344a);
    }

    public void b() {
        if (this.f == null || this.l == null) {
            return;
        }
        hw.b("PPSRewardPopUpView", "Dialog has been dismissed");
        if (this.l.isShowing()) {
            this.l.dismiss();
        }
        this.l = null;
    }

    public boolean a() {
        AlertDialog alertDialog;
        if (!d()) {
            return false;
        }
        a(this.h, this.e);
        if (this.f == null || (alertDialog = this.l) == null) {
            hw.c("PPSRewardPopUpView", "rootView or dialog is null");
            return false;
        }
        alertDialog.show();
        SixElementsView sixElementsView = this.i;
        if (sixElementsView == null) {
            return true;
        }
        sixElementsView.a(false);
        return true;
    }

    private void f() {
        AlertDialog alertDialogCreate = com.huawei.openalliance.ad.utils.ac.a(this.f21345b).create();
        this.l = alertDialogCreate;
        alertDialogCreate.setView(this.f);
        this.l.setCanceledOnTouchOutside(false);
        this.l.getWindow().setDimAmount(0.2f);
    }

    private void e() {
        hw.b("PPSRewardPopUpView", "refresh UI");
        this.i.a(this.f21346c);
        this.e = this.d.getIconUrl();
        if (as.n(this.f21345b)) {
            this.g.setTextSize(1, 30.0f);
            this.j.setTextSize(1, 30.0f);
        }
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.u.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                u.this.k.a();
            }
        });
        this.j.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.u.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                u.this.k.b();
            }
        });
    }

    private boolean d() {
        String str;
        Context context = this.f21345b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                return true;
            }
            str = "can't show dialog due to activity status!";
        } else {
            str = "context not activity";
        }
        hw.b("PPSRewardPopUpView", str);
        return false;
    }

    static class c implements AppDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<u> f21356a;

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
            u uVar = this.f21356a.get();
            if (hw.a()) {
                hw.a("PopupStatusListener", "onStatusChange, status: %s", appStatus);
            }
            if (uVar == null || uVar.l == null || appStatus == AppStatus.DOWNLOAD) {
                return;
            }
            hw.b("PopupStatusListener", "download start, dismissView");
            if (uVar.l.isShowing() && uVar.n != null) {
                hw.b("PopupStatusListener", "download trigger dismissView");
                uVar.n.a();
            }
            uVar.b();
        }

        public c(u uVar) {
            this.f21356a = new WeakReference<>(uVar);
        }
    }

    private void a(ImageView imageView, String str) {
        if (TextUtils.isEmpty(str) || imageView == null) {
            return;
        }
        hw.b("PPSRewardPopUpView", "load app icon:" + dg.h(str));
        com.huawei.openalliance.ad.utils.o.d(new b(this.f21345b, imageView, str));
    }

    static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f21350a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Context f21351b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f21352c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21351b == null) {
                hw.c("PPSRewardPopUpView", "para is null");
                return;
            }
            sn snVar = new sn();
            snVar.b(false);
            snVar.c(true);
            snVar.b("icon");
            snVar.d(this.f21350a);
            so soVarA = new sl(this.f21351b, snVar).a();
            if (soVarA != null) {
                String strA = soVarA.a();
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                String strC = dk.a(this.f21351b, "normal").c(strA);
                if (TextUtils.isEmpty(strC)) {
                    return;
                }
                bd.a(this.f21351b, strC, new bd.a() { // from class: com.huawei.openalliance.ad.views.u.b.1
                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a() {
                    }

                    @Override // com.huawei.openalliance.ad.utils.bd.a
                    public void a(final Drawable drawable) {
                        if (drawable != null) {
                            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.u.b.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    b.this.f21352c.setImageDrawable(drawable);
                                }
                            });
                        }
                    }
                });
            }
        }

        public b(Context context, ImageView imageView, String str) {
            this.f21351b = context == null ? null : context.getApplicationContext();
            this.f21352c = imageView;
            this.f21350a = str;
        }
    }

    public static void a(Context context, String str, ContentRecord contentRecord) {
        hw.b("PPSRewardPopUpView", "report Type is " + str);
        new com.huawei.openalliance.ad.analysis.i(context).d(contentRecord, str);
    }

    private void a(Context context, int i) {
        this.f21345b = context;
        View viewInflate = inflate(context, R.layout.hiad_reward_popup, this);
        this.f = viewInflate;
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.u.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (u.this.k != null) {
                    u.this.k.c();
                }
            }
        });
        this.h = (ImageView) this.f.findViewById(R.id.popup_icon);
        this.i = (SixElementsView) this.f.findViewById(R.id.popup_icon_six_elements);
        this.g = (TextView) this.f.findViewById(R.id.popup_download_btn);
        TextView textView = (TextView) this.f.findViewById(R.id.abort_downlaod_btn);
        this.j = textView;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f();
        this.f21344a = new c(this);
        com.huawei.openalliance.ad.download.app.d.a().b(this.f21344a);
    }

    public u(Context context, int i) {
        super(context);
        a(context, i);
    }
}
