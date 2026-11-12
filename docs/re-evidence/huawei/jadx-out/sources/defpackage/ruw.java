package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.homewear21.R;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes17.dex */
public class ruw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HealthButton f47723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinearLayout f47724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f47725c;
    private ImageView d;
    private HealthProgressBar e;
    private CustomAlertDialog f;
    private HealthTextView g;
    private CustomAlertDialog h;
    private HealthTextView i;
    private HealthButton j;
    private DeviceInfo k;
    private Context l;
    private CustomAlertDialog m;
    private Activity n;
    private CustomAlertDialog o;
    private Handler p = new Handler(Looper.getMainLooper()) { // from class: ruw.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            LogUtil.a("SageEarPhoneAction", "handleAnotherHandlerTwo what:", Integer.valueOf(i));
            if (i == 1040) {
                if (ruw.this.n != null) {
                    ruw.this.e(((Integer) message.obj).intValue());
                }
            } else {
                LogUtil.j("SageEarPhoneAction", "handleAnotherHandlerTwo default what:", Integer.valueOf(i));
            }
            super.handleMessage(message);
        }
    };

    public ruw(Context context, Activity activity) {
        this.n = activity;
        this.l = context;
    }

    public void a(final DeviceInfo deviceInfo, final int i, final boolean z) {
        LogUtil.a("SageEarPhoneAction", "checkEarphoneState in. ");
        this.k = deviceInfo;
        b();
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: ruw.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i2, edj edjVar) {
                if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
                    ruw.this.d();
                    return;
                }
                if (!lxb.c().b(edjVar.d())) {
                    ruw.this.a(edjVar, z, deviceInfo, i);
                    return;
                }
                LogUtil.a("SageEarPhoneAction", "checkEarphoneState in. type: ", Integer.valueOf(i));
                int i3 = i;
                if (i3 == 104) {
                    ruw.this.c(edjVar);
                } else {
                    if (i3 != 115) {
                        return;
                    }
                    ruw.this.b(edjVar);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(edj edjVar, boolean z, DeviceInfo deviceInfo, int i) {
        if (!e(edjVar)) {
            d();
            return;
        }
        if (!a(edjVar)) {
            b(deviceInfo, i);
        } else if (z) {
            e(deviceInfo, i);
        } else {
            d(deviceInfo, edjVar, i);
        }
    }

    /* JADX INFO: renamed from: ruw$5, reason: invalid class name */
    class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47735b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ edj f47736c;
        final /* synthetic */ int d;

        AnonymousClass5(edj edjVar, DeviceInfo deviceInfo, int i) {
            this.f47736c = edjVar;
            this.f47735b = deviceInfo;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ruw.this.e.setVisibility(8);
            ruw.this.i.setVisibility(0);
            ruw.this.i.setText(this.f47736c.c());
            ruw.this.g.setVisibility(8);
            ruw.this.j.setVisibility(8);
            ruw.this.f47723a.setVisibility(8);
            ruw.this.f47724b.setVisibility(8);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(ruw.this.n);
            if (ruw.this.h != null) {
                ruw.this.h.dismiss();
            }
            ruw.this.h = builder.b();
            if (ruw.this.f47725c.getParent() != null) {
                ViewParent parent = ruw.this.f47725c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ruw.this.f47725c);
                }
            }
            builder.a(ruw.this.f47725c);
            int i = R.string.IDS_blite_guide_title;
            final DeviceInfo deviceInfo = this.f47735b;
            final int i2 = this.d;
            builder.d(i, new DialogInterface.OnClickListener() { // from class: ruv
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    this.f47721a.c(deviceInfo, i2, dialogInterface, i3);
                }
            });
            builder.a(R.string.IDS_settings_button_cancal_ios_btn, new DialogInterface.OnClickListener() { // from class: rut
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    LogUtil.j("SageEarPhoneAction", "onClick showEarphonePairDialog NegativeButton");
                }
            });
            ruw.this.h.setCancelable(false);
            ruw.this.h.show();
        }

        /* synthetic */ void c(DeviceInfo deviceInfo, int i, DialogInterface dialogInterface, int i2) {
            ruw.this.h.dismiss();
            ruw.this.e(deviceInfo, i);
        }
    }

    private void d(DeviceInfo deviceInfo, edj edjVar, int i) {
        LogUtil.a("SageEarPhoneAction", "showEarphonePairDialog. ");
        this.n.runOnUiThread(new AnonymousClass5(edjVar, deviceInfo, i));
    }

    /* JADX INFO: renamed from: ruw$6, reason: invalid class name */
    class AnonymousClass6 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47738b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f47739c;

        AnonymousClass6(int i, DeviceInfo deviceInfo) {
            this.f47739c = i;
            this.f47738b = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            ruw.this.e.setVisibility(0);
            ruw.this.i.setVisibility(0);
            ruw.this.g.setVisibility(8);
            ruw.this.j.setVisibility(8);
            ruw.this.f47723a.setVisibility(8);
            ruw.this.f47724b.setVisibility(8);
            ruw.this.i.setText(R.string.IDS_blite_guide_paire_opt_title);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(ruw.this.n);
            if (ruw.this.m != null) {
                ruw.this.m.dismiss();
            }
            ruw.this.m = builder.b();
            if (ruw.this.f47725c.getParent() != null) {
                ViewParent parent = ruw.this.f47725c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ruw.this.f47725c);
                }
            }
            builder.a(ruw.this.f47725c);
            builder.a(R.string.IDS_ear_phone_pair_close, new DialogInterface.OnClickListener() { // from class: rus
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    this.f47720c.d(dialogInterface, i);
                }
            });
            ruw.this.m.setCancelable(false);
            ruw.this.m.show();
            if (ruw.this.n != null && ruw.this.p != null) {
                Message messageObtainMessage = ruw.this.p.obtainMessage();
                messageObtainMessage.what = 1040;
                messageObtainMessage.obj = Integer.valueOf(this.f47739c);
                ruw.this.p.sendMessageDelayed(messageObtainMessage, 60000L);
            }
            lxb.c().c(this.f47738b, new EarPhoneResponseCallback() { // from class: ruw.6.5
                @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                public void onResponse(int i, edj edjVar) {
                    ruw.this.d(i, edjVar, AnonymousClass6.this.f47739c, AnonymousClass6.this.f47738b);
                }
            });
        }

        /* synthetic */ void d(DialogInterface dialogInterface, int i) {
            LogUtil.j("SageEarPhoneAction", "onClick showEarphonePairingDialog NegativeButton");
            ruw.this.m.dismiss();
            ruw.this.m = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(DeviceInfo deviceInfo, int i) {
        LogUtil.a("SageEarPhoneAction", "showEarphonePairingDialog. ");
        this.n.runOnUiThread(new AnonymousClass6(i, deviceInfo));
    }

    public void e(int i) {
        CustomAlertDialog customAlertDialog = this.m;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
            b(this.k, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, edj edjVar, int i2, DeviceInfo deviceInfo) {
        Handler handler;
        if (this.n != null && (handler = this.p) != null) {
            handler.removeMessages(1040);
        }
        CustomAlertDialog customAlertDialog = this.m;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            LogUtil.j("SageEarPhoneAction", "EarphonePairingDialog is not showing. ");
            return;
        }
        this.m.dismiss();
        this.m = null;
        if (i == 1) {
            LogUtil.a("SageEarPhoneAction", "earphonePairCallBack in. type: ", Integer.valueOf(i2));
            if (i2 == 104) {
                c(edjVar);
                return;
            } else {
                if (i2 != 115) {
                    return;
                }
                b(edjVar);
                return;
            }
        }
        b(deviceInfo, i2);
    }

    /* JADX INFO: renamed from: ruw$8, reason: invalid class name */
    class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47742b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47743c;

        AnonymousClass8(DeviceInfo deviceInfo, int i) {
            this.f47743c = deviceInfo;
            this.f47742b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ruw.this.a();
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(ruw.this.n);
            ruw.this.o = builder.b();
            if (ruw.this.f47725c.getParent() != null) {
                ViewParent parent = ruw.this.f47725c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ruw.this.f47725c);
                }
            }
            builder.a(ruw.this.f47725c);
            ruw.this.j.setOnClickListener(new View.OnClickListener() { // from class: ruw.8.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("SageEarPhoneAction", "onClick showEarphonePairFailedDialog PositiveButton");
                    ruw.this.o.dismiss();
                    lxb.c().e(AnonymousClass8.this.f47743c, new EarPhoneResponseCallback() { // from class: ruw.8.1.3
                        @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                        public void onResponse(int i, edj edjVar) {
                            ruw.this.a(edjVar, true, AnonymousClass8.this.f47743c, AnonymousClass8.this.f47742b);
                        }
                    });
                }
            });
            ruw.this.f47723a.setOnClickListener(new View.OnClickListener() { // from class: ruw.8.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("SageEarPhoneAction", "onClick showEarphonePairFailedDialog NegativeButton");
                    ruw.this.o.dismiss();
                }
            });
            ruw.this.o.setCancelable(false);
            ruw.this.o.show();
        }
    }

    private void b(DeviceInfo deviceInfo, int i) {
        LogUtil.a("SageEarPhoneAction", "showEarphonePairFailedDialog. ");
        this.n.runOnUiThread(new AnonymousClass8(deviceInfo, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.j = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_positive);
        this.f47723a = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_negative);
        this.f47724b.setVisibility(0);
        this.f47724b.setOrientation(0);
        if (LanguageUtil.bc(this.l)) {
            LogUtil.a("SageEarPhoneAction", "language444 in:");
            this.j = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_negative);
            this.f47723a = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_positive);
            this.f47724b.setOrientation(1);
            this.f47724b.setShowDividers(0);
        }
        this.e.setVisibility(8);
        this.i.setVisibility(0);
        this.g.setVisibility(0);
        this.i.setText(R.string.IDS_ear_phone_pair_guide_error);
        this.g.setText(R.string.IDS_ear_phone_pair_failed_reconnect_tip);
        this.j.setText(R.string.IDS_btsdk_confirm_repair);
        this.f47723a.setText(R.string.IDS_settings_button_cancal_ios_btn);
        this.j.setVisibility(0);
        this.f47723a.setVisibility(0);
    }

    private boolean e(edj edjVar) {
        return (edjVar.b() & 1) > 0;
    }

    private boolean a(edj edjVar) {
        return (edjVar.a() == 1) && (edjVar.e() != 0);
    }

    private void b() {
        View viewInflate = View.inflate(this.l, R.layout.wear_home_earphone_dialog_layout, null);
        this.f47725c = viewInflate;
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.earphone_pair_dialog_loading_image);
        this.e = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        ImageView imageView = (ImageView) this.f47725c.findViewById(R.id.earphone_pair_dialog_image);
        this.d = imageView;
        imageView.setBackgroundResource(R.drawable.icon_pair_watch_earphone);
        this.i = (HealthTextView) this.f47725c.findViewById(R.id.earphone_pair_dialog_title);
        this.g = (HealthTextView) this.f47725c.findViewById(R.id.earphone_pair_dialog_tip);
        this.f47724b = (LinearLayout) this.f47725c.findViewById(R.id.earphone_dialog_btn_layout);
        this.j = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_positive);
        this.f47723a = (HealthButton) this.f47725c.findViewById(R.id.earphone_dialog_btn_negative);
    }

    /* JADX INFO: renamed from: ruw$7, reason: invalid class name */
    class AnonymousClass7 implements Runnable {
        AnonymousClass7() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ruw.this.e.setVisibility(8);
            ruw.this.i.setVisibility(0);
            ruw.this.g.setVisibility(0);
            ruw.this.j.setVisibility(8);
            ruw.this.f47723a.setVisibility(8);
            ruw.this.f47724b.setVisibility(8);
            ruw.this.i.setText(R.string.IDS_ear_phone_pair_failed_not_found_tip);
            ruw.this.g.setText(R.string.IDS_ear_phone_pair_failed_tip);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(ruw.this.n);
            if (ruw.this.f47725c.getParent() != null) {
                ViewParent parent = ruw.this.f47725c.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ruw.this.f47725c);
                }
            }
            builder.a(ruw.this.f47725c);
            builder.a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: ruu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.j("SageEarPhoneAction", "onClick NegativeButton");
                }
            });
            ruw.this.f = builder.b();
            ruw.this.f.setCancelable(false);
            ruw.this.f.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("SageEarPhoneAction", "showEarphoneNotFoundDialog. ");
        this.n.runOnUiThread(new AnonymousClass7());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final edj edjVar) {
        LogUtil.a("SageEarPhoneAction", "startFindEarphonePage enter");
        String strJ = lvi.j(this.k.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("SageEarPhoneAction", "startFindEarphonePage uuid is null!");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.e("SageEarPhoneAction", "startFindEarphonePage descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAj = pluginInfoByUuid.i().aj();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("SageEarPhoneAction", "startFindEarphonePage getEarPhoneFindrUri :", strAj, ", earphoneProductId: ", strC);
        if (TextUtils.isEmpty(strAj)) {
            return;
        }
        this.n.runOnUiThread(new Runnable() { // from class: ruw.1
            @Override // java.lang.Runnable
            public void run() {
                ddp.a().initAudioDeviceKitAdapter(BaseApplication.getContext());
                Intent intent = new Intent();
                intent.setData(Uri.parse(strAj));
                Bundle bundle = new Bundle();
                bundle.putString("mac", edjVar.d());
                bundle.putString("deviceName", edjVar.c());
                bundle.putString("productId", strC);
                intent.putExtras(bundle);
                LogUtil.a("SageEarPhoneAction", "startFindEarphonePage");
                ddp.a().launchActivity(ruw.this.n, intent);
            }
        });
    }

    public void c(final edj edjVar) {
        LogUtil.a("SageEarPhoneAction", "startHeadsetHealth enter");
        String strJ = lvi.j(this.k.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            LogUtil.e("SageEarPhoneAction", "startHeadsetHealth uuid is null!");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.e("SageEarPhoneAction", "startHeadsetHealth descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAk = pluginInfoByUuid.i().ak();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("SageEarPhoneAction", "startHeadsetHealth getEarPhoneManagerUri :", strAk, ", earphoneProductId: ", strC);
        if (TextUtils.isEmpty(strAk)) {
            return;
        }
        this.n.runOnUiThread(new Runnable() { // from class: ruw.3
            @Override // java.lang.Runnable
            public void run() {
                ddp.a().initAudioDeviceKitAdapter(BaseApplication.getContext());
                Intent intent = new Intent();
                intent.setData(Uri.parse(strAk));
                Bundle bundle = new Bundle();
                bundle.putString("mac", edjVar.d());
                bundle.putString("deviceName", edjVar.c());
                bundle.putString("productId", strC);
                intent.putExtras(bundle);
                LogUtil.a("SageEarPhoneAction", "startEarphoneHealth detail page. ");
                ddp.a().launchActivity(ruw.this.n, intent);
            }
        });
    }
}
