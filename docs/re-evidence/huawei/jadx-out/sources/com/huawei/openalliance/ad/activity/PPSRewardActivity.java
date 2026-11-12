package com.huawei.openalliance.ad.activity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.RelativeLayout;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.IRewardAd;
import com.huawei.openalliance.ad.inter.data.RewardEvent;
import com.huawei.openalliance.ad.inter.data.i;
import com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener;
import com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener;
import com.huawei.openalliance.ad.utils.az;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.AppDownloadButton;
import com.huawei.openalliance.ad.views.PPSRewardTemplateView;
import com.huawei.openalliance.ad.views.interfaces.ab;
import com.huawei.openalliance.ad.views.interfaces.k;
import com.huawei.ui.commonui.base.BaseDialog;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class PPSRewardActivity extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18170a = new byte[0];
    private static final ConcurrentHashMap<String, IRewardAdStatusListener> h = new ConcurrentHashMap<>();
    private static final ConcurrentHashMap<String, INonwifiActionListener> i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f18171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f18172c;
    private i d;
    private String e;
    private boolean f = false;
    private az g;

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    protected void onStop() {
        super.onStop();
        k kVar = this.f18171b;
        if (kVar != null) {
            kVar.g();
            this.f18171b.b(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onResume() {
        k kVar = this.f18171b;
        if (kVar != null) {
            kVar.b(true);
            this.f18171b.resumeView();
        }
        super.onResume();
        b();
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        hw.a("PPSRewardActivity", "requestPermissions, requestCode=%d, result= %s", Integer.valueOf(i2), Arrays.toString(iArr));
        a(i2, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onPause() {
        hw.a("PPSRewardActivity", BaseDialog.LIFE_CYCLE_ON_PAUSE);
        k kVar = this.f18171b;
        if (kVar != null) {
            kVar.b(false);
            this.f18171b.pauseView();
        }
        super.onPause();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSRewardActivity.1
            @Override // java.lang.Runnable
            public void run() {
                k kVar = PPSRewardActivity.this.f18171b;
                if (kVar != null) {
                    kVar.removeRewardAdStatusListener();
                    kVar.destroyView();
                }
                PPSRewardActivity.this.d = null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.openalliance.ad.activity.e, com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        dk.h(this);
        super.onCreate(bundle);
        try {
            hw.b("PPSRewardActivity", "onCreate");
            i iVarB = df.b();
            this.d = iVarB;
            if (iVarB == null) {
                hw.c("PPSRewardActivity", "reward ad is null, finish, this should not happen");
                finish();
                return;
            }
            this.e = iVarB.getUniqueId();
            int i2 = !"2".equals(this.d.ah()) ? 1 : 0;
            setRequestedOrientation(i2);
            dk.a(this, i2);
            k kVar = (k) a(this.d.aq());
            this.f18171b = kVar;
            kVar.setVisibility(0);
            this.f18171b.setOrientation(i2);
            this.f18171b.addRewardAdStatusListener(new b());
            this.f18171b.addNonwifiActionListener(new a());
            this.f18171b.setTemplateErrorListener(new c());
            this.f18171b.a((IRewardAd) this.d, true);
            this.g = this.f18171b.getAppointJs();
            Resources resources = getResources();
            if (resources != null) {
                if (resources.getConfiguration() != null) {
                    this.f18172c = Integer.valueOf(resources.getConfiguration().screenWidthDp);
                }
                onConfigurationChanged(resources.getConfiguration());
            }
        } catch (Throwable th) {
            hw.c("PPSRewardActivity", "onCreateEx: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        if (configuration == null) {
            return;
        }
        super.onConfigurationChanged(configuration);
        int i2 = configuration.uiMode & 48;
        hw.b("PPSRewardActivity", "currentNightMode=" + i2);
        a(32 == i2 ? 2 : 0);
        a(configuration);
    }

    @Override // com.huawei.openalliance.ad.activity.f, android.app.Activity
    public void onBackPressed() {
        k kVar;
        if (this.f) {
            kVar = this.f18171b;
            if (!(kVar instanceof PPSRewardTemplateView)) {
                IRewardAdStatusListener iRewardAdStatusListener = h.get(this.e);
                if (iRewardAdStatusListener != null) {
                    iRewardAdStatusListener.onAdClosed();
                }
                super.onBackPressed();
                return;
            }
        } else {
            kVar = this.f18171b;
            if (kVar == null) {
                return;
            }
        }
        kVar.onEvent(RewardEvent.BACKPRESSED);
    }

    public void b() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.activity.PPSRewardActivity.4
            @Override // java.lang.Runnable
            public void run() {
                AppDownloadButton appDownloadButton;
                try {
                    if (PPSRewardActivity.this.f18171b == null || !PPSRewardActivity.this.f18171b.h() || (appDownloadButton = PPSRewardActivity.this.f18171b.getAppDownloadButton()) == null) {
                        return;
                    }
                    hw.a("PPSRewardActivity", "reSetButtonWidth");
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) appDownloadButton.getLayoutParams();
                    layoutParams.width = -1;
                    appDownloadButton.setLayoutParamsSkipSizeReset(layoutParams);
                } catch (Throwable th) {
                    hw.d("PPSRewardActivity", "resetButtonWidth exception: %s", th.getClass().getSimpleName());
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.activity.e
    protected void a() {
        setContentView(R.layout.hiad_activity_reward);
        this.p = (ViewGroup) findViewById(R.id.hiad_reward_layout);
    }

    public static void a(String str, IRewardAdStatusListener iRewardAdStatusListener) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "registerIRewardAdStatusListener key is null";
        } else {
            if (iRewardAdStatusListener != null) {
                synchronized (f18170a) {
                    h.put(str, iRewardAdStatusListener);
                }
                return;
            }
            str2 = "registerIRewardAdStatusListener listner is null";
        }
        hw.c("PPSRewardActivity", str2);
    }

    public static void a(String str, INonwifiActionListener iNonwifiActionListener) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "registerNonwifiActionListener key is null";
        } else {
            if (iNonwifiActionListener != null) {
                synchronized (f18170a) {
                    i.put(str, iNonwifiActionListener);
                }
                return;
            }
            str2 = "registerNonwifiActionListener listener is null";
        }
        hw.c("PPSRewardActivity", str2);
    }

    class b implements IRewardAdStatusListener {
        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onRewarded() {
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onRewarded();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdShown() {
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdShown();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdError(int i, int i2) {
            PPSRewardActivity.this.f = true;
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdError(i, i2);
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdCompleted() {
            PPSRewardActivity.this.f = true;
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdCompleted();
            }
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdClosed() {
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdClosed();
            }
            PPSRewardActivity.this.finish();
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.IRewardAdStatusListener
        public void onAdClicked() {
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdClicked();
            }
        }

        private b() {
        }
    }

    private void a(Configuration configuration) {
        hw.a("PPSRewardActivity", "onConfigurationChanged newConfig.screenWidthDp=" + configuration.screenWidthDp + ", this.screenWidthDp=" + this.f18172c);
        if (this.f18172c == null || configuration.screenWidthDp != this.f18172c.intValue()) {
            hw.a("PPSRewardActivity", "onConfigurationChanged resetButtonWidth()");
            this.f18172c = Integer.valueOf(configuration.screenWidthDp);
            b();
        }
    }

    private void a(int i2, int[] iArr) {
        if (i2 == 11 || i2 == 12) {
            if (iArr.length > 0 && iArr[0] == 0) {
                az azVar = this.g;
                if (azVar != null) {
                    if (i2 == 11) {
                        azVar.a(true, true);
                        return;
                    } else {
                        azVar.b(true, true);
                        return;
                    }
                }
                return;
            }
            if (!shouldShowRequestPermissionRationale("android.permission.WRITE_CALENDAR")) {
                a(i2, i2 == 11 ? R.string.hiad_calender_permission_appoint_message : R.string.hiad_calender_permission_cancel_message);
                return;
            }
            az azVar2 = this.g;
            if (azVar2 != null) {
                if (i2 == 11) {
                    azVar2.a(false, true);
                } else {
                    azVar2.b(false, true);
                }
            }
        }
    }

    private void a(final int i2, int i3) {
        new AlertDialog.Builder(this).setTitle(R.string.hiad_calender_permission_dialog).setMessage(i3).setPositiveButton(R.string.hiad_calender_set, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSRewardActivity.3
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", PPSRewardActivity.this.getPackageName(), null));
                PPSRewardActivity.this.startActivity(intent);
                dialogInterface.dismiss();
                if (PPSRewardActivity.this.g != null) {
                    if (i2 == 11) {
                        PPSRewardActivity.this.g.a(false, false);
                    } else {
                        PPSRewardActivity.this.g.b(false, false);
                    }
                }
            }
        }).setNegativeButton(R.string.hiad_dialog_cancel, new DialogInterface.OnClickListener() { // from class: com.huawei.openalliance.ad.activity.PPSRewardActivity.2
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i4) {
                dialogInterface.dismiss();
                if (PPSRewardActivity.this.g != null) {
                    if (i2 == 11) {
                        PPSRewardActivity.this.g.a(false, true);
                    } else {
                        PPSRewardActivity.this.g.b(false, true);
                    }
                }
            }
        }).show();
    }

    private void a(int i2) {
        k kVar;
        WebSettings webViewSettings;
        if (Build.VERSION.SDK_INT < 29 || (kVar = this.f18171b) == null || (webViewSettings = kVar.getWebViewSettings()) == null) {
            return;
        }
        webViewSettings.setForceDark(i2);
    }

    class a implements INonwifiActionListener {
        @Override // com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener
        public boolean onVideoPlay(long j) {
            INonwifiActionListener iNonwifiActionListener = (INonwifiActionListener) PPSRewardActivity.i.get(PPSRewardActivity.this.e);
            if (iNonwifiActionListener != null) {
                return iNonwifiActionListener.onVideoPlay(j);
            }
            return false;
        }

        @Override // com.huawei.openalliance.ad.inter.listeners.INonwifiActionListener
        public boolean onAppDownload(AppInfo appInfo, long j) {
            INonwifiActionListener iNonwifiActionListener = (INonwifiActionListener) PPSRewardActivity.i.get(PPSRewardActivity.this.e);
            if (iNonwifiActionListener != null) {
                return iNonwifiActionListener.onAppDownload(appInfo, j);
            }
            return false;
        }

        private a() {
        }
    }

    class c implements ab {
        @Override // com.huawei.openalliance.ad.views.interfaces.ab
        public void a(int i) {
            hw.c("PPSRewardActivity", "template init error, extra: %s", Integer.valueOf(i));
            IRewardAdStatusListener iRewardAdStatusListener = (IRewardAdStatusListener) PPSRewardActivity.h.get(PPSRewardActivity.this.e);
            if (iRewardAdStatusListener != null) {
                iRewardAdStatusListener.onAdError(-1, i);
            }
            PPSRewardActivity.this.finish();
        }

        private c() {
        }
    }

    private View a(Integer num) {
        hw.b("PPSRewardActivity", "apiVer: %s", num);
        View viewInflate = LayoutInflater.from(this).inflate((num == null || num.intValue() != 3) ? R.layout.hiad_reward_view : R.layout.hiad_reward_template_view, this.p, false);
        this.p.addView(viewInflate, new RelativeLayout.LayoutParams(-1, -1));
        return viewInflate;
    }
}
