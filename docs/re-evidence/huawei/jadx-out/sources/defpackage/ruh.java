package defpackage;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressbar.HealthProgressBar;
import com.huawei.ui.homewear21.R;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes43.dex */
public class ruh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static View f47678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f47679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SimpleChain.Emitter f47680c;
    public static DeviceInfo d;
    public static edj e;
    private static HealthButton f;
    private static HealthButton g;
    private static HealthProgressBar h;
    private static ImageView i;
    private static LinearLayout j;
    private static HealthTextView k;
    private static CustomAlertDialog l;
    private static CustomAlertDialog m;
    private static CustomAlertDialog n;
    private static HealthTextView o;
    private static CustomAlertDialog p;

    public static void d(final Activity activity, final DeviceInfo deviceInfo, final SimpleChain.Emitter emitter) {
        d = deviceInfo;
        f47680c = emitter;
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: rug
                @Override // java.lang.Runnable
                public final void run() {
                    Activity activity2 = activity;
                    DeviceInfo deviceInfo2 = deviceInfo;
                    SimpleChain.b("earPhonePair").e(new SimpleChain.INext() { // from class: ruf
                        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                        public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                            ruh.b(emitter2, activity2, deviceInfo2);
                        }
                    }).e(new SimpleChain.INext() { // from class: rud
                        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                        public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                            ruh.c(emitter2, activity2, deviceInfo2);
                        }
                    }).d(emitter, new Object[0]);
                }
            });
        } else {
            ReleaseLogUtil.d("R_EearPhonePairUtils", "earPhonePair activity is null");
        }
    }

    public static void b(SimpleChain.Emitter emitter, Activity activity, DeviceInfo deviceInfo) {
        LogUtil.a("EearPhonePairUtils", "enter initEarphoneDialog ");
        if (activity == null) {
            emitter.onError("activity is null");
            return;
        }
        View viewInflate = View.inflate(activity, R.layout.wear_home_earphone_dialog_layout, null);
        f47678a = viewInflate;
        HealthProgressBar healthProgressBar = (HealthProgressBar) viewInflate.findViewById(R.id.earphone_pair_dialog_loading_image);
        h = healthProgressBar;
        healthProgressBar.setLayerType(1, null);
        ImageView imageView = (ImageView) f47678a.findViewById(R.id.earphone_pair_dialog_image);
        i = imageView;
        imageView.setBackgroundResource(R.drawable.icon_pair_watch_earphone);
        o = (HealthTextView) f47678a.findViewById(R.id.earphone_pair_dialog_title);
        k = (HealthTextView) f47678a.findViewById(R.id.earphone_pair_dialog_tip);
        j = (LinearLayout) f47678a.findViewById(R.id.earphone_dialog_btn_layout);
        f = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_positive);
        g = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_negative);
        emitter.onSuccess(new Object[0]);
    }

    public static void c(final SimpleChain.Emitter emitter, final Activity activity, final DeviceInfo deviceInfo) {
        LogUtil.a("EearPhonePairUtils", "enter getEarPhoneInfoFromCached ");
        final int i2 = 104;
        lxb.c().e(deviceInfo, new EarPhoneResponseCallback() { // from class: ruh.5
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
            public void onResponse(int i3, edj edjVar) {
                if (edjVar == null || TextUtils.isEmpty(edjVar.d())) {
                    LogUtil.a("EearPhonePairUtils", "getEarPhoneInfoFromCached mEarPhoneInfo is null or DeviceIdentify is empty");
                    ruh.c(activity, emitter);
                    return;
                }
                ruh.e = edjVar;
                boolean zB = lxb.c().b(edjVar.d());
                LogUtil.a("EearPhonePairUtils", "getEarPhoneInfoFromCached pairState:", Boolean.valueOf(zB));
                if (!zB) {
                    ruh.b(activity, edjVar, true, deviceInfo, i2, emitter);
                    return;
                }
                LogUtil.a("EearPhonePairUtils", "checkEarphoneState in. type: ", Integer.valueOf(i2));
                int i4 = i2;
                if (i4 == 104) {
                    ruh.d(activity, deviceInfo, edjVar, emitter);
                } else {
                    if (i4 != 115) {
                        return;
                    }
                    ruh.b(activity, deviceInfo, edjVar, emitter);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ruh$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ Activity d;
        final /* synthetic */ SimpleChain.Emitter e;

        AnonymousClass1(Activity activity, SimpleChain.Emitter emitter) {
            this.d = activity;
            this.e = emitter;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ruh.h.setVisibility(8);
                ruh.o.setVisibility(0);
                ruh.k.setVisibility(0);
                ruh.f.setVisibility(8);
                ruh.g.setVisibility(8);
                ruh.j.setVisibility(8);
                ruh.o.setText(R.string.IDS_ear_phone_pair_failed_not_found_tip);
                ruh.k.setText(R.string.IDS_ear_phone_pair_failed_tip);
                CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.d);
                if (ruh.f47678a.getParent() != null) {
                    ViewParent parent = ruh.f47678a.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(ruh.f47678a);
                    }
                }
                builder.a(ruh.f47678a);
                int i = R.string.IDS_common_notification_know_tips;
                final SimpleChain.Emitter emitter = this.e;
                builder.a(i, new DialogInterface.OnClickListener() { // from class: rue
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ruh.AnonymousClass1.c(emitter, dialogInterface, i2);
                    }
                });
                CustomAlertDialog unused = ruh.n = builder.b();
                ruh.n.setCancelable(false);
                ruh.n.show();
            } catch (Exception e) {
                LogUtil.e("EearPhonePairUtils", "showEarphoneNotFoundDialog:", ExceptionUtils.c(e));
            }
        }

        static /* synthetic */ void c(SimpleChain.Emitter emitter, DialogInterface dialogInterface, int i) {
            LogUtil.j("EearPhonePairUtils", "onClick NegativeButton");
            emitter.onError("Earphone NotFound");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Activity activity, SimpleChain.Emitter emitter) {
        if (activity == null) {
            return;
        }
        HandlerExecutor.a().post(new AnonymousClass1(activity, emitter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(final Activity activity, DeviceInfo deviceInfo, final edj edjVar, final SimpleChain.Emitter emitter) {
        if (activity == null) {
            emitter.onError("startFindEarphonePage activity is null ");
            return;
        }
        LogUtil.a("EearPhonePairUtils", "startFindEarphonePage enter");
        String strJ = lvi.j(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            emitter.onError("startFindEarphonePage uuid is empty ");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            emitter.onError("startFindEarphonePage descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAj = pluginInfoByUuid.i().aj();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("EearPhonePairUtils", "startFindEarphonePage getEarPhoneFindrUri :", strAj, ", earphoneProductId: ", strC);
        if (TextUtils.isEmpty(strAj)) {
            emitter.onError("startFindEarphonePage earPhoneFindUri or getWearDeviceInfo is null!");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ruh.2
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
                    LogUtil.a("EearPhonePairUtils", "startFindEarphonePage");
                    ddp.a().launchActivity(activity, intent);
                    emitter.onSuccess(new Object[0]);
                }
            });
        }
    }

    public static void d(final Activity activity, DeviceInfo deviceInfo, final edj edjVar, final SimpleChain.Emitter emitter) {
        LogUtil.a("EearPhonePairUtils", "startHeadsetHealth enter");
        if (activity == null) {
            emitter.onError("startEarphoneHealth activity is null");
            return;
        }
        String strJ = lvi.j(deviceInfo.getProductType());
        if (TextUtils.isEmpty(strJ)) {
            emitter.onError("startEarphoneHealth uuid is null");
            return;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            emitter.onError("startEarphoneHealth descriptionInfo or getWearDeviceInfo is null!");
            return;
        }
        final String strAk = pluginInfoByUuid.i().ak();
        final String strC = tqp.c(pluginInfoByUuid);
        LogUtil.a("EearPhonePairUtils", "startHeadsetHealth getEarPhoneManagerUri :", strAk, ", earphoneProductId: ", strC);
        if (TextUtils.isEmpty(strAk)) {
            emitter.onError("startEarphoneHealth earPhoneManagerUri is empty!");
        } else {
            activity.runOnUiThread(new Runnable() { // from class: ruh.3
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
                    LogUtil.a("EearPhonePairUtils", "startEarphoneHealth detail page. ");
                    ddp.a().launchActivity(activity, intent);
                    emitter.onSuccess(new Object[0]);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, edj edjVar, boolean z, DeviceInfo deviceInfo, int i2, SimpleChain.Emitter emitter) {
        LogUtil.a("EearPhonePairUtils", "enter preShowEarphonePairDialog ");
        if (!c(edjVar)) {
            c(activity, emitter);
            return;
        }
        if (!b(edjVar)) {
            e(deviceInfo, i2, emitter);
        } else if (z) {
            e(activity, deviceInfo, i2, emitter);
        } else {
            a(activity, deviceInfo, edjVar, i2, emitter);
        }
    }

    private static void a(Activity activity, DeviceInfo deviceInfo, edj edjVar, int i2, SimpleChain.Emitter emitter) {
        LogUtil.a("EearPhonePairUtils", "enter showEarphonePairDialog ");
        if (activity == null) {
            LogUtil.a("EearPhonePairUtils", "activity is null. ");
        } else {
            LogUtil.a("EearPhonePairUtils", "showEarphonePairDialog. ");
            activity.runOnUiThread(new AnonymousClass4(edjVar, activity, deviceInfo, i2, emitter));
        }
    }

    /* JADX INFO: renamed from: ruh$4, reason: invalid class name */
    class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ SimpleChain.Emitter f47691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f47693c;
        final /* synthetic */ Activity d;
        final /* synthetic */ edj e;

        AnonymousClass4(edj edjVar, Activity activity, DeviceInfo deviceInfo, int i, SimpleChain.Emitter emitter) {
            this.e = edjVar;
            this.d = activity;
            this.f47693c = deviceInfo;
            this.f47692b = i;
            this.f47691a = emitter;
        }

        @Override // java.lang.Runnable
        public void run() {
            ruh.h.setVisibility(8);
            ruh.o.setVisibility(0);
            ruh.o.setText(this.e.c());
            ruh.k.setVisibility(8);
            ruh.f.setVisibility(8);
            ruh.g.setVisibility(8);
            ruh.j.setVisibility(8);
            CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.d);
            if (ruh.l != null) {
                ruh.l.dismiss();
            }
            CustomAlertDialog unused = ruh.l = builder.b();
            if (ruh.f47678a.getParent() != null) {
                ViewParent parent = ruh.f47678a.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(ruh.f47678a);
                }
            }
            builder.a(ruh.f47678a);
            int i = R.string.IDS_blite_guide_title;
            final Activity activity = this.d;
            final DeviceInfo deviceInfo = this.f47693c;
            final int i2 = this.f47692b;
            final SimpleChain.Emitter emitter = this.f47691a;
            builder.d(i, new DialogInterface.OnClickListener() { // from class: rul
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    ruh.AnonymousClass4.a(activity, deviceInfo, i2, emitter, dialogInterface, i3);
                }
            });
            int i3 = R.string.IDS_settings_button_cancal_ios_btn;
            final SimpleChain.Emitter emitter2 = this.f47691a;
            builder.a(i3, new DialogInterface.OnClickListener() { // from class: ruj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    ruh.AnonymousClass4.d(emitter2, dialogInterface, i4);
                }
            });
            ruh.l.setCancelable(false);
            ruh.l.show();
        }

        static /* synthetic */ void a(Activity activity, DeviceInfo deviceInfo, int i, SimpleChain.Emitter emitter, DialogInterface dialogInterface, int i2) {
            ruh.l.dismiss();
            ruh.e(activity, deviceInfo, i, emitter);
        }

        static /* synthetic */ void d(SimpleChain.Emitter emitter, DialogInterface dialogInterface, int i) {
            LogUtil.j("EearPhonePairUtils", "onClick showEarphonePairDialog NegativeButton");
            emitter.onError("stop earphone pair");
        }
    }

    private static boolean c(edj edjVar) {
        return (edjVar.b() & 1) > 0;
    }

    private static boolean b(edj edjVar) {
        return (edjVar.a() == 1) && (edjVar.e() != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Activity activity, DeviceInfo deviceInfo, int i2, SimpleChain.Emitter emitter) {
        LogUtil.a("EearPhonePairUtils", "showEarphonePairingDialog. ");
        if (activity == null) {
            emitter.onError("showEarphonePairingDialog activity is null");
        } else {
            activity.runOnUiThread(new AnonymousClass10(activity, emitter, i2, deviceInfo));
        }
    }

    /* JADX INFO: renamed from: ruh$10, reason: invalid class name */
    class AnonymousClass10 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f47681a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f47682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ SimpleChain.Emitter f47683c;
        final /* synthetic */ DeviceInfo e;

        AnonymousClass10(Activity activity, SimpleChain.Emitter emitter, int i, DeviceInfo deviceInfo) {
            this.f47681a = activity;
            this.f47683c = emitter;
            this.f47682b = i;
            this.e = deviceInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ruh.h.setVisibility(0);
                ruh.o.setVisibility(0);
                ruh.k.setVisibility(8);
                ruh.f.setVisibility(8);
                ruh.g.setVisibility(8);
                ruh.j.setVisibility(8);
                ruh.o.setText(R.string.IDS_blite_guide_paire_opt_title);
                CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.f47681a);
                if (ruh.p != null) {
                    ruh.p.dismiss();
                }
                CustomAlertDialog unused = ruh.p = builder.b();
                if (ruh.f47678a.getParent() != null) {
                    ViewParent parent = ruh.f47678a.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(ruh.f47678a);
                    }
                }
                builder.a(ruh.f47678a);
                int i = R.string.IDS_ear_phone_pair_close;
                final SimpleChain.Emitter emitter = this.f47683c;
                builder.a(i, new DialogInterface.OnClickListener() { // from class: rui
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        ruh.AnonymousClass10.d(emitter, dialogInterface, i2);
                    }
                });
                ruh.p.setCancelable(false);
                ruh.p.show();
                ruh.f47679b = new c(this.f47682b);
                HandlerExecutor.a().postDelayed(ruh.f47679b, 60000L);
                lxb.c().c(this.e, new EarPhoneResponseCallback() { // from class: ruh.10.2
                    @Override // com.huawei.hwdevice.mainprocess.mgr.hwearphonemgr.EarPhoneResponseCallback
                    public void onResponse(int i2, edj edjVar) {
                        ruh.b(AnonymousClass10.this.f47681a, i2, edjVar, AnonymousClass10.this.f47682b, AnonymousClass10.this.e, AnonymousClass10.this.f47683c);
                    }
                });
            } catch (Exception e) {
                LogUtil.e("EearPhonePairUtils", "showEarphoneNotFoundDialog:", ExceptionUtils.c(e));
            }
        }

        static /* synthetic */ void d(SimpleChain.Emitter emitter, DialogInterface dialogInterface, int i) {
            LogUtil.j("EearPhonePairUtils", "onClick showEarphonePairingDialog NegativeButton");
            if (ruh.p != null) {
                ruh.p.dismiss();
                CustomAlertDialog unused = ruh.p = null;
            }
            emitter.onError("headset pair close");
        }
    }

    public static class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f47700b;

        public c(int i) {
            this.f47700b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            ruh.d(this.f47700b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Activity activity, int i2, edj edjVar, int i3, DeviceInfo deviceInfo, SimpleChain.Emitter emitter) {
        if (f47679b != null) {
            HandlerExecutor.a().removeCallbacks(f47679b);
        }
        CustomAlertDialog customAlertDialog = p;
        if (customAlertDialog == null || !customAlertDialog.isShowing()) {
            LogUtil.j("EearPhonePairUtils", "EarphonePairingDialog is not showing. ");
            return;
        }
        p.dismiss();
        p = null;
        if (i2 == 1) {
            LogUtil.a("EearPhonePairUtils", "earphonePairCallBack in. type: ", Integer.valueOf(i3));
            if (i3 == 104) {
                d(activity, deviceInfo, edjVar, emitter);
                return;
            } else {
                if (i3 != 115) {
                    return;
                }
                b(activity, deviceInfo, edjVar, emitter);
                return;
            }
        }
        e(deviceInfo, i3, emitter);
    }

    public static void d(int i2) {
        CustomAlertDialog customAlertDialog = p;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
            e(d, i2, f47680c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Activity activity) {
        f = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_positive);
        g = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_negative);
        j.setVisibility(0);
        j.setOrientation(0);
        if (LanguageUtil.bc(activity)) {
            LogUtil.a("EearPhonePairUtils", "language444 in:");
            f = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_negative);
            g = (HealthButton) f47678a.findViewById(R.id.earphone_dialog_btn_positive);
            j.setOrientation(1);
            j.setShowDividers(0);
        }
        h.setVisibility(8);
        o.setVisibility(0);
        k.setVisibility(0);
        o.setText(R.string.IDS_ear_phone_pair_guide_error);
        k.setText(R.string.IDS_ear_phone_pair_failed_reconnect_tip);
        f.setText(R.string.IDS_btsdk_confirm_repair);
        g.setText(R.string.IDS_settings_button_cancal_ios_btn);
        f.setVisibility(0);
        g.setVisibility(0);
    }

    private static void e(final DeviceInfo deviceInfo, final int i2, final SimpleChain.Emitter emitter) {
        LogUtil.a("EearPhonePairUtils", "showEarphonePairFailedDialog. ");
        final Activity activityJ = com.huawei.haf.application.BaseApplication.j();
        if (activityJ == null) {
            emitter.onError("showEarphonePairFailedDialog acitivty is null");
        } else {
            activityJ.runOnUiThread(new Runnable() { // from class: ruh.8
                @Override // java.lang.Runnable
                public void run() {
                    ruh.c(activityJ);
                    CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(activityJ);
                    CustomAlertDialog unused = ruh.m = builder.b();
                    if (ruh.f47678a.getParent() != null) {
                        ViewParent parent = ruh.f47678a.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).removeView(ruh.f47678a);
                        }
                    }
                    builder.a(ruh.f47678a);
                    ruh.f.setOnClickListener(new View.OnClickListener() { // from class: ruh.8.1
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.j("EearPhonePairUtils", "onClick showEarphonePairFailedDialog PositiveButton");
                            ruh.m.dismiss();
                            ruh.b(activityJ, ruh.e, true, deviceInfo, i2, emitter);
                        }
                    });
                    ruh.g.setOnClickListener(new View.OnClickListener() { // from class: ruh.8.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            LogUtil.j("EearPhonePairUtils", "onClick showEarphonePairFailedDialog NegativeButton");
                            ruh.m.dismiss();
                            emitter.onError("Earphone Pair Failed");
                        }
                    });
                    ruh.m.setCancelable(false);
                    ruh.m.show();
                }
            });
        }
    }

    public static void l() {
        LogUtil.a("EearPhonePairUtils", "clearAll. ");
        f47680c = null;
        d = null;
        e = null;
        n();
    }

    public static void n() {
        f47678a = null;
        i = null;
        h = null;
        o = null;
        k = null;
        f = null;
        j = null;
        g = null;
        l = null;
        p = null;
        m = null;
        n = null;
    }
}
